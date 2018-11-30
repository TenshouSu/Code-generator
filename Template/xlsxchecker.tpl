#!/usr/bin/python
# -*- coding: UTF-8 -*-

import os
import time
import shutil
import xlrd

# Dictionary
# Anonymization
Anony = {'1 Hour Average':1, '12 Hour Average':2, '24 Hour Average':3}
# Encryption
Encry = {}
# Data Deletion
DD = {}
# Verfication
Verify = {}
# Domain
Domain = {'Local Only':1, 'Cloud with Public Key':2}


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
    writedata = 'node ' + data1 + '(verify:bool) returns(idnumber: int);\n'
    writedata += 'let\n'
    writedata += '  idnumber = if verify then ' + data2 + ' else 0;\n'
    writedata += 'tel\n\n'
    return writedata

def main():
    tables = excel_table_byname()
    num = 0
    for row in tables:
        writedata = ''
        if num > 0:
            filename = row[0] + '.txt'
            newfilename = row[0] + '_Check.lus'
            if row[1] != 'Never Mind':
                buff = Anony[row[1]]
                data1 = 'Anonymization'
                data2 = str(buff)
                data = useTemplate(data1, data2)
                writedata += data
            if row[2] != 'Never Mind':
                buff = Encry[row[2]]
                data1 = 'Encryption'
                data2 = str(buff)
                data = useTemplate(data1, data2)
                writedata += data
            if row[3] != 'Never Mind':
                buff = DD[row[3]]
                data1 = 'Data_Deletion'
                data2 = str(buff)
                data = useTemplate(data1, data2)
                writedata += data
            if row[4] != 'Never Mind':
                buff = Verify[row[4]]
                data1 = 'Verification'
                data2 = str(buff)
                data = useTemplate(data1, data2)
                writedata += data
            if row[5] != 'Never Mind':
                buff = Domain[row[5]]
                data1 = 'Domain'
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
