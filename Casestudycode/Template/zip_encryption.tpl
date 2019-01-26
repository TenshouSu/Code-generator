# -*- coding: UTF-8 -*-

import os

def zipencry(nontxt,path):
    zipmsg = 'sudo zip -P ' + '123 ' + nontxt + '.zip ' + path
    os.system(zipmsg)
    deletemsg = 'sudo rm ' + path
    os.system(deletemsg)
