#!/usr/bin/python
# -*- coding: UTF-8 -*-

import os

message = os.popen('lv6 Requirement_List.lus').readlines()
message2 =os.popen('lv6 Program_Identify.lus').readlines()
if message2 == message :
    print ("pass")
    f = open ("verify.txt",'w+')
    f.write("1")
    f.close()
else:
    print ("false")
    f = open ("verify.txt",'w+')
    f.write("0")
    f.close()

os.rename('verify.txt','verify')
