#!/usr/bin/python
# -*- coding: UTF-8 -*-

import os
import time
import shutil
import xlrd

# Dictionary
Sensor = {'Temperature':101, 'Humidity':201, 'DHT11':102, 'Lighting':301}
# Anonymization
Anony = {'Anony: Never Mind':100, 'Anony: 1 Hour Average':101, 'Anony: 12 Hour Average':102, 'Anony: 24 Hour Average':103, 'Anony: Calculate':307}
# Encryption
Encry = {'Encry: Never Mind':100, 'Encry: ZIP':201}
# Data Deletion
Delet = {'Delet: Never Mind':100, 'Delet: Delete Raw Data':301}
# Verfication
Verify = {'Verify: Never Mind':100, 'Verify: Password':101, 'Verify: Readonly':802}
# Domain
Domain = {'Domain: Never Mind':100, 'Domain: Local':101, 'Domain: Google Driver (Trust)':205}
# others
Other = {'Other: Never Mind':100, 'Other: Mail Notification':202}


# Open user checklist xlsx
def open_excel(file= 'User_Checklist.xlsx'):
    try:
        data = xlrd.open_workbook(file)
        return data
    except:
        pass

# Read data in checklist
def excel_table_byname(file= 'User_Checklist.xlsx', colnameindex=0, by_name=u'Sheet1'):
    data = open_excel(file) # Open checklist
    table = data.sheet_by_name(by_name) # Get data by sheet name
    nrows = table.nrows # Number of rows
    colnames = table.row_values(colnameindex) # Data in one row
    list =[] # Save data in this sequence
    for rownum in range(0, nrows): # Read every row
         row = table.row_values(rownum)
         if row:
             app = []
             for i in range(len(colnames)):
                app.append(row[i])
             list.append(app)
    return list

# Find template and assemble them
def useTemplate(data1, data2):
    writedata = 'node ' + data1 + '(execute:bool) returns(idnumber: int);\n'
    writedata += 'let\n'
    writedata += '  idnumber = if execute then ' + data2 + ' else 0;\n'
    writedata += 'tel\n\n'
    return writedata

# Classify the data
def classCheck(data):
    allclass = ['Anony','Encry','Delet','Verify','Domain','Other']
    for ele in allclass:
        if ele in data:
            return ele

def main():
    tables = excel_table_byname()
    num = 0
    buff = ''
    for row in tables:
        writedata = ''
        if num > 0:
            filename = 'Requirement_List' + '.txt'
            newfilename = 'Requirement_List' + '.lus'
            if row[0]:
                buff = Sensor[row[0]]
                data1 = 'Sensor'
                data2 = str(buff)
                data = useTemplate(data1, data2)
                writedata += data
                if row[1]:
                    classdata = classCheck(row[1])
                    exeword = 'buff = ' + classdata + '[\'' + row[1] + '\']'
                    exec(exeword)
                    data1 = classdata
                    data2 = str(buff)
                    data = useTemplate(data1, data2)
                    writedata += data
                    if row[2]:
                        classdata = classCheck(row[2])
                        exeword = 'buff = ' + classdata + '[\'' + row[2] + '\']'
                        exec(exeword)
                        data1 = classdata
                        data2 = str(buff)
                        data = useTemplate(data1, data2)
                        writedata += data
                        if row[3]:
                            classdata = classCheck(row[3])
                            exeword = 'buff = ' + classdata + '[\'' + row[3] + '\']'
                            exec(exeword)
                            data1 = classdata
                            data2 = str(buff)
                            data = useTemplate(data1, data2)
                            writedata += data
                            if row[4]:
                                classdata = classCheck(row[4])
                                exeword = 'buff = ' + classdata + '[\'' + row[4] + '\']'
                                exec(exeword)
                                data1 = classdata
                                data2 = str(buff)
                                data = useTemplate(data1, data2)
                                writedata += data
                                if row[5]:
                                    classdata = classCheck(row[5])
                                    exeword = 'buff = ' + classdata + '[\'' + row[4] + '\']'
                                    exec(exeword)
                                    data1 = classdata
                                    data2 = str(buff)
                                    data = useTemplate(data1, data2)
                                    writedata += data
            # Create lustre file
            if filename:
                f = open(filename,'w')
                f.write(writedata)
                f.close()
                os.rename(filename,newfilename)
        num += 1

if __name__ == '__main__':
    main()
