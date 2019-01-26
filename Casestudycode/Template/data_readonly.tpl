# -*- coding: UTF-8 -*-

import os

def readonly(path):
    readmsg = 'sudo chmod a=r-- ' + path
    print readmsg
    os.system(readmsg)
