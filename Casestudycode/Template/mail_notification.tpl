# -*- coding: UTF-8 -*-

import time
import os
import smtplib
from email.mime.text import MIMEText
from email.utils import formataddr

def sendmail(number):
    my_sender='1035756463@qq.com'
    my_pass = 'xsniumzqllwtbdhd'
    my_user='tenshou.su@gmail.com'
    strings = 'Dear Master \n\n Temperature has dropped below '+ str(number) +'C!!! \n Switch on your Air Conditioner!!! \n\n Regards, \n Your Raspberry Pi'
    msg=MIMEText(strings,'plain','utf-8')
    msg['From']=formataddr(["FromRaspberry",my_sender])
    msg['To']=formataddr(["Master",my_user])
    msg['Subject']="Warning From Your Raspberry Pi For Smart House"

    server=smtplib.SMTP("smtp.qq.com", 25)
    server.login(my_sender, my_pass)
    server.sendmail(my_sender,[my_user,],msg.as_string())
    # server.quit()
    print 'Mail Has Been Sent at', time.strftime("%Y-%m-%d %H:%M:%S", time.localtime())
