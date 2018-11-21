#!/usr/bin/python
# -*- coding: UTF-8 -*-

# This is a Program to change the My.system to any kinds of code by using library jinja2
__metaclass__ = type

import os
from jinja2 import Template, Environment, FileSystemLoader


class xmltocode:
#--- Initialize all of the sequence and dictionary
    def __init__(self):
        self.words = []      # Store all string in xmlfile
        self.functions = []  # Store all functions' data
        self.sensors = []    # Store all sensors' data
        self.dict = {}       # Store main dictionary which are modified from string
        self.subdict = {}    # Store sub dictionary which are modified from string
        self.translate = []  # Store the result of DepthFirstSearch
        self.nameseq = []    # File name that will be created
        self.tplseq = []     # Template name for program to find template file
        self.dataseq = []    # Template data for template file to match data


#--- Input the path of xml (ex. */My.system) and read the data and put the data into sequence 'words'.
    def readxml(self, path):
        self.filedata = open(path,'r')
        for lines in self.filedata:
            self.words.append(lines)
        self.filedata.close()


#--- (Private Attribute) Separate the data in sequence self.words and put the data into different sequences
    def __getData(self):
        # Get the function data and store them into self.funcitons sequence
        for words in self.words:
            if '<function' in words:
                self.__getMainData(words)
            elif '/>' in words:
                self.__getSubData(words)
            # Store the main dictionary into self.funcitons sequence when a function description is end
            elif '</function>' in words:
                self.functions.append(self.dict)
            # When <sensor > appears ,remove the function portion in self.words sequence and let the loop break
            elif '<sensor' in words:
                removenum = self.words.index(words)
                self.words = self.words[removenum:]
                break

        # Get the sensor data and store them into self.sensors sequence
        for words in self.words:
            if '<sensor' in words:
                self.__getMainData(words)
            elif '/>' in words:
                self.__getSubData(words)
            # Store the main dictionary into self.sensors sequence when a sensor description is end
            elif '</sensor>' in words:
                self.sensors.append(self.dict)
            # Break the loop when </system> appears
            elif '</system' in words:
                break


#--- (Private Attribute) Let the attribute in <function > or in <sensor > to be stored in a main dictionary
    def __getMainData(self, words):
        # Initialize self.dict
        self.dict = {}
        mainindex = words.index('xsi:type')
        # Modify the format of data to be a dictionary
        maindata = '\"' + words[mainindex:-2].replace('\" ','\", \"').replace('=','\":')
        maindata = '{' + maindata + '}'
        # Modify the data from string to dictionary and store it in self.dict
        self.dict = eval(maindata)


#--- (Private Attribute) Let the attribute in <subtilte > to be stored in a sub dictionary
    def __getSubData(self, words):
        self.subdict = {}
        # Find the sub title in data
        titleindex = words.index('<') + 1
        subindex = words.index('xsi:type')
        subtitle = 'sub:' + words[titleindex:subindex-1]
        # Modify the format of data to be a dictionary
        subdata = '\"' + words[subindex:-3].replace('=','\":').replace('\" ','\", \"')
        subdata = '{' + subdata + '}'
        # Modify the data from string to dictionary and store it in self.subdict
        self.subdict = eval(subdata)
        # Store the sub title and sub dictionary as a key-value pair in main dictionary
        self.dict[subtitle] = self.subdict


#--- (Private Attribute)To decide the sequence of tranlation from xml to code
    def __execSequence(self):
        self.__getData()
        # To find out the process number in self.sensors
        senseq = []
        self.__getSequence(self.sensors, senseq, 'process')

        # Use DeepFirstSearch to find out the order of execution sequence
        for seq in senseq:
            # To find out the reprocess number in self.functions
            funseq = []
            self.__getSequence(self.functions, funseq, 'reprocess')
            if seq:
                addseq = self.__depthFirstSearch(funseq,seq)
            else:
                addseq = []
            self.translate.append(addseq)


#--- (Private Attribute) Get process or reprocess sequence from the data of self.sensors or self.functions
    def __getSequence(self, inputdata, outputdata, processname):
        # ex. sensor_0: process="//@function.0 //@function.3"; sensor_1: process="//@function.5"; sensor2_2: No process
        #     Output is [[0,3],[5],[]]
        for words in inputdata:
            # Find out the key-value pair like 'process':'//@function' or 'reprocess':'//@function'
            processdata =  words.get(processname)
            # From the data '//@function.0 //@function.3' to abstract number only. Our Goal is let the data to be [0,3]
            if processdata:
                procount = processdata.count('@function')
                # More than one process or reprocess
                if procount > 1:
                    probuff = []
                    N = procount
                    while N > 0:
                        if N > 1:
                            proindex = processdata.index('@function') + 10
                            endindex = processdata.index(' ')
                            pronum = int(processdata[proindex:endindex])
                            probuff.append(pronum)
                            processdata = processdata[endindex+1:]
                            N -= 1
                        else:
                            proindex = processdata.index('@function') + 10
                            pronum = int(processdata[proindex:])
                            N -= 1
                            probuff.append(pronum)
                    outputdata.append(probuff)
                # Only one process or reprocess
                else:
                    probuff = []
                    proindex = processdata.index('@function') + 10
                    pronum = int(processdata[proindex:])
                    probuff.append(pronum)
                    outputdata.append(probuff)
            # No process or reprocess and output is []
            else:
                probuff = []
                outputdata.append(probuff)


#--- (Private Attribute) Function of DepthFirstSearch
#--- Sequence parameter means reference of function's reprocess, First parameter means the first reference of sensor's process
    def __depthFirstSearch(self, Sequence, First):
        # ex. Search Sequence is [[1,2],[],[7],[4],[],[6],[],[]]
        #     First Path is [0,3]
        # Output will be [[0,1],[0,2,7],[3,4]]
        N = 0   # Number of floor
        F = [None]*100
        O = {}
        F[0] = First
        buff = []
        order = []
        # Start Searching
        while True:
            if N < 0:
                break
            elif not F[N]:
                N -= 1
            else:
                v = int(F[N].pop(0))
                buff.append(v)
                if N == 0:
                    O[N] = buff
                else:
                    O[N] = O[N-1] + buff
                F[N+1] = Sequence[v]
                if not F[N+1]:
                    order.append(O[N])
                else:
                    N += 1
                buff = []

        return order


#--- (Private Attribute) Get the file name, template name and template data from numbers in self.translate
    def getTemplateData(self):
        namenum = 0
        self.__execSequence()
        # Read self.translate and get the sensor name
        for sennum in range(len(self.translate)):
            namezone = self.sensors[sennum].get('name')
            namezone = namezone.replace(' ', '_')
            for key, value in self.sensors[sennum].items():
                if 'sub:' in key:
                    senname = value.get('xsi:type')[7:]
                    sendata = value
                    break
            # Read self.translate and get the template name and template data
            for functions in self.translate[sennum]:
                namenum += 1
                self.nameseq.append(namezone + '_' + str(namenum))
                buffseq = []
                databuffseq = []
                buffseq.append(senname)
                databuffseq.append(sendata)
                for num in functions:
                    for key, value in self.functions[num].items():
                        if 'sub:' in key:
                            buffseq.append(value.get('xsi:type')[7:])
                            databuffseq.append(value)
                            break
                self.tplseq.append(buffseq)
                self.dataseq.append(databuffseq)


# #--- Read the template and generate files
#     def generateFile(self, format):
#         self.__getTemplateData()
#         # print self.nameseq
#         # print self.tplseq
#         # print self.dataseq
#         # Read Template and Generate Code
#         for mainnum in range(len(self.tplseq)):
#             for subnum in range(len(self.tplseq[mainnum])):
#                 # Create Sensor Template
#                 if subnum == 0:
#                     fileName = 'sensor.txt'
#                     confName = 'sensor.tpl'
#                 # Create Function Template
#                 else:
#                     fileName = 'function.txt'
#                     confName = 'function.tpl'
#                     extends = r'{% extends "sensor.tpl" %}'
#                 # Find template and use these template to generate code
#                 env = Environment(loader=FileSystemLoader('./Template/'), trim_blocks=True)
#                 tplname = self.tplseq[mainnum][subnum] + '.tpl'
#                 template = env.get_template(tplname)
#                 data = self.dataseq[mainnum][subnum]
#                 disp_text = template.render(data)
#                 if subnum <= 1:
#                     file = open(fileName, 'w')
#                 if subnum == 1:
#                     file.write(extends)
#                     file.write('\n')
#                 file.write(disp_text)
#                 if subnum == 0 or subnum == len(self.tplseq[mainnum]) - 1:
#                     os.rename(fileName,confName)
#                     file.close()
#             # Combine sensor and function template to generate executive file
#             env = Environment(loader=FileSystemLoader('.'), trim_blocks=True)
#             template = env.get_template('function.tpl')
#             disp_text = template.render()
#             fileName = self.nameseq[mainnum] + '.txt'
#             confName = self.nameseq[mainnum] + '.' + str(format)  #option
#             file = open(fileName, 'w')
#             file.write(disp_text)
#             os.rename(fileName,confName)
#             file.close()
#             # Remove sensor and function template
#             os.remove('./function.tpl')
#             os.remove('./sensor.tpl')
#             print ' Code Generating Success! \n'


## Execute
if __name__ == '__main__':
    f = xmltocode()
    # Read xml file in Eclipse Sirius.
    f.readxml('/workdir/runtime-New_configuration/com.fukuda.kyudai.system.sample/My.system')
    f.getTemplateData()
    print f.nameseq
    print f.tplseq
    print f.dataseq
