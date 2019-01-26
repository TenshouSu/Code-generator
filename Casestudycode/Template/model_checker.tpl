#!/usr/bin/python
# -*- coding: UTF-8 -*-

import os

message = os.popen('lv6 Requirement_List.lus').readlines()
message2 =os.popen('lv6 Program_Identify.lus').readlines()
if message2 == message :
    print ("pass")
    f = open ("verify.txt",'w+')
    msg = 'def verify():\n    return 1'
    f.write(msg)
    f.close()
else:
    print ("false")
    f = open ("verify.txt",'w+')
    msg = 'def verify():\n    return 0'
    f.write(msg)
    f.close()

os.rename('verify.txt','verify.py')
