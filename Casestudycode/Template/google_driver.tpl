# -*- coding: UTF-8 -*-

import os

# Upload to Google Drive
def upload(path):
    raspimsg = '/home/pi/bin/gdrive upload /home/pi/Desktop/casestudy/log' + path
    os.system(raspimsg)
