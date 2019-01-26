#!/usr/bin/python
# -*- coding: UTF-8 -*-

# This is a Program to change the My.system to any kinds of code by using library jinja2
__metaclass__ = type

import os
import time
import shutil
from jinja2 import Template, Environment, FileSystemLoader
import leveldict


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

###------------------------------------------------------------------------------###
### ----- Read XML File (.system) in Sirius and find out data information. ----- ###
###------------------------------------------------------------------------------###

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
    def __getTemplateData(self):
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

###--------------------------------------------------------------###
### ----- Find out Lustre Template and Tranlate them to C. ----- ###
###--------------------------------------------------------------###

#--- (Private Attribute)(Function) Find out node name.
    def __findNodeName(self, disp_text, nodename):
        start = 0
        for num in range(disp_text.count('node ')):
            sindex = disp_text[start:].find('node ')
            eindex = disp_text[start:].find('(verify')
            keyword = str(disp_text[start+sindex+5:start+eindex])
            nodename.append(keyword)
            start = eindex+7


#--- (Private Attribute)(Function) Translate lustre code to C.
    def __lusToCode(self, lusname, nodename):
        for node in nodename:
            status = 'lv6 ' + lusname + ' -n ' + node + ' -2c'
            print status
            print os.system(status)


#--- (Private Attribute)(Function) Create folders for saving files.
    def __createFolder(self, num):
        fpath = "./Execute"
        folder = os.path.exists(fpath)
        if not folder:
            os.makedirs(fpath)
        fpath = "./Execute/" + self.nameseq[num]
        folder = os.path.exists(fpath)
        if not folder:
            os.makedirs(fpath)


#--- (Private Attribute)(Function) Find out useful lustre code and save them in Execute folder, finally delete useless files.
    def __findUseful(self, tempname, nodename, num):

        for node in nodename:
            cname = tempname + '_' + node + '.c'
            hname = tempname + '_' + node + '.h'
            lname = tempname + '.lus'
            newcname = './Execute/' + self.nameseq[num] + "/" + tempname + '_' + node + '.c'
            newhname = './Execute/' + self.nameseq[num] + "/" + tempname + '_' + node + '.h'
            newlname = './Execute/' + self.nameseq[num] + "/" + tempname + '.lus'
            shutil.copy(cname,newcname)
            shutil.copy(hname,newhname)
            shutil.copy(lname,newlname)

        # Copy lustre_types.h and lustre_consts.h
        others = ['lustre_types.h','lustre_consts.h']
        for name in others:
            shutil.copy(name,'./Execute/'+self.nameseq[num]+'/'+name)

        # Remove needless files
        f_list = os.listdir('.')
        for i in f_list:
            if i != 'xmltocode.py' and i != 'leveldict.py' and os.path.splitext(i)[1] == '.c' or os.path.splitext(i)[1] == '.h' or os.path.splitext(i)[1] == '.sh' or os.path.splitext(i)[1] == '.lus':
                try:
                    os.remove(i)
                except OSError:
                    pass


#--- Find out Lustre template and translate them to C and delete useless files.
    def lusTemptoC(self):
        self.__getTemplateData()
        secnum = 0
        for sec in self.dataseq:
            tempnum = 0
            for temp in sec:
                # Create floders in ./Execute/ to save generated files
                self.__createFolder(secnum)
                # Find name of lustre template.
                tempname = self.tplseq[secnum][tempnum]
                tplname = tempname + '_lus.tpl'
                txtname = tempname + '.txt'
                lusname = tempname + '.lus'
                # Use template to create lustre file.
                try:
                    nodename = []
                    env = Environment(loader=FileSystemLoader('./Template'))
                    template = env.get_template(tplname)
                    disp_text = template.render(temp)
                    self.__findNodeName(disp_text, nodename)
                    f = open(txtname,'w')
                    f.write(disp_text)
                    f.close()
                    os.rename(txtname,lusname)
                    self.__lusToCode(lusname, nodename)
                    self.__findUseful(tempname, nodename, secnum)
                except:
                    pass
                tempnum += 1
            secnum += 1


###---------------------------------------------------------###
### ----- Find out Driver Template and Assemble them. ----- ###
###---------------------------------------------------------###

#--- Find out template and assemble them to executable code.
    def templateAssemble(self, modename):
        modesuffix = '.' + str(modename)
        secnum = 0 # Initialize section counter
        for sec in self.tplseq:
            # Try to find out block template and assemble them to be child template
            secname = self.nameseq[secnum] + '.txt'
            newsecname = self.nameseq[secnum] + '.tpl' # Name of child Template
            f = open(secname,'w') # Create file to save translated code
            namenum = 0 # Initialize name counter
            titlename = r'{% extends "sensor.tpl" %} \n\n'
            f.write(titlename)
            for name in sec:
                blockname = name + '_block.tpl'
                env = Environment(loader=FileSystemLoader('./Template/'), trim_blocks=True)
                try:
                    template = env.get_template(blockname)
                    data = self.dataseq[secnum][namenum]
                    disp_text = template.render(data)
                    f.write(disp_text)
                except:
                    pass
                namenum += 1
            f.close()
            os.rename(secname, newsecname)
            # Try to find out driver template and assemble them
            tplnum = 0 # Initialize tpl counter
            for name in sec:
                firstname = 'sensor.txt'
                firsttpl = 'sensor.tpl' # One time translated main execute template
                txtname = name + '.txt'
                tplname = name + '.tpl'
                exename = name + modesuffix
                newexename = './Execute/' + self.nameseq[secnum] + '/' + exename
                mainname = './Execute/' + self.nameseq[secnum] + '/' + 'main' + modesuffix
                # Main execute file is special to handle and firstly we save data in sensor.txt
                try:
                    if tplnum == 0:
                        p = open(firstname, 'w')
                    else:
                        p = open(txtname, 'w')
                    env = Environment(loader=FileSystemLoader('./Template/'), trim_blocks=True)
                    template = env.get_template(tplname)
                    data = self.dataseq[secnum][tplnum]
                    disp_text = template.render(data)
                    p.write(disp_text)
                    p.close()
                except:
                    pass
                # if main execute file, we have to combine child block
                if tplnum == 0:
                    try:
                        g = open(txtname, 'w')
                        # Change name "sensor.txt" to "sensor.tpl"
                        os.rename(firstname,firsttpl)
                        env = Environment(loader=FileSystemLoader('.'), trim_blocks=True)
                        # Inherit child template
                        template = env.get_template(newsecname)
                        disp_text = template.render()
                        g.write(disp_text)
                        g.close()
                    except:
                        pass
                os.rename(txtname, exename)
                # Copy executable files to './Execute/'
                shutil.copy(exename, newexename)
                # If main execute file, change name to 'main'
                if tplnum == 0:
                    try:
                        os.rename(newexename, mainname)
                    except:
                        pass
                tplnum += 1
            # Remove remaining files
            f_list = os.listdir('.')
            for i in f_list:
                if i != 'xmltocode.py' and i != 'leveldict.py' and os.path.splitext(i)[1] == modesuffix or os.path.splitext(i)[1] == '.tpl':
                    try:
                        os.remove(i)
                    except OSError:
                        pass
            secnum += 1


###--------------------------------------------------------###
### ----- Output a file of Function Level Dictionary ----- ###
###--------------------------------------------------------###

#--- Find the function level dictionary and output the level verification file.
    def levelVerify(self):
        num = 0
        text_data = '' #Initialize data
        for sec in self.tplseq:
            # Find function modename and idnmuber
            subnum = 0
            for function in sec:
                leveldata = leveldict.valuedict(function)
                if subnum ==0 :
                    titlename = leveldata['ModeName']
                # Use jinja2 to assemble template
                env = Environment(loader=FileSystemLoader('./Template/'), trim_blocks=True)
                template = env.get_template('leveldict_lus.tpl')
                disp_text = template.render(leveldata)
                disp_text += '\n\n'
                text_data += disp_text
                subnum += 1
            # Save the generated code as level verification lustre file
            filepath = './Execute/' + self.nameseq[num] + '/verify.txt'
            newpath = './Execute/' + self.nameseq[num] + '/Program' + '_Identify.lus'
            f = open(filepath, 'w')
            f.write(text_data)
            f.close()
            os.rename(filepath, newpath)
            text_data = ''
            num += 1

        # Copy user checklist to execute folder
        oldpath = './leveldict.xlsx'
        newpath = './Execute/User_Checklist.xlsx'
        shutil.copy(oldpath, newpath)

###------------------------------------------------------###
### ----- Generator of Checklist Reader and Others ----- ###
###------------------------------------------------------###

#--- Generate an excel file cheker
    def checklistReader(self):
        env = Environment(loader=FileSystemLoader('./Template/'), trim_blocks=True)
        template = env.get_template('xlsxchecker.tpl')
        disp_text = template.render()
        filepath = './Execute/Read_Checklist.txt'
        newfilepath = filepath = './Execute/Read_Checklist.py'
        f = open(filepath, 'w')
        f.write(disp_text)
        f.close()
        os.rename(filepath, newfilepath)

#--- Generate a user manual
    def userManual(self):
        env = Environment(loader=FileSystemLoader('./Template/'), trim_blocks=True)
        template = env.get_template('user_manual.tpl')
        disp_text = template.render()
        filepath = './Execute/User_Manual.txt'
        f = open(filepath, 'w')
        f.write(disp_text)
        f.close()

#--- Generate a model checker
    def modelChecker(self):
        env = Environment(loader=FileSystemLoader('./Template/'), trim_blocks=True)
        template = env.get_template('model_checker.tpl')
        disp_text = template.render()
        filepath = './Execute/Model_Checker.txt'
        newfilepath = filepath = './Execute/Model_Checker.py'
        f = open(filepath, 'w')
        f.write(disp_text)
        f.close()
        os.rename(filepath, newfilepath)


## Execute
if __name__ == '__main__':
    starttime = time.time()
    f = xmltocode()
    # Read xml file in Eclipse Sirius
    f.readxml('/workdir/runtime-New_configuration/com.fukuda.kyudai.system.sample/My.system')
    secondtime = time.time()
    f.lusTemptoC() # Translate Lustre file to C Code
    thirdtime = time.time()
    lustime = thirdtime - secondtime
    print '\nLustre File Generating Time:  ' + str(lustime) + ' s\n'
    f.templateAssemble('py') # Assemble Template to Executable Code
    f.levelVerify() # Generate level verification file
    f.checklistReader() # Generate an excel file checker for user to generate lustre file
    f.userManual() # Generate a user maunal for user to understand the meaning of each functions
    f.modelChecker() # Generate a model checker for user to check model
    endtime = time.time()
    print '--- Code Generating Complete! --- \n'
    alltime = endtime - starttime
    print 'All Code Generating Time:  ' + str(alltime) + ' s\n'
