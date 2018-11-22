# Code-generator
## 2 kinds of files in this program:
・ Main Program of Code Generator. <br />
・ File folder and Templates in it. <br />

## 3 kinds of Template:
・ Device and Function driver template. <br />
・ Function block template. <br />
・ Lustre Template.

## Configuration
・ Eclipse Sirius (PC): <br/>
&emsp; http://www.eclipse.org/sirius/getstarted.html <br />
・ Docker (PC): <br />
&emsp; https://www.docker.com/ <br />
・ Lustre v6 (Docker): <br />
&emsp; http://www-verimag.imag.fr/DIST-TOOLS/SYNCHRONE/lustre-v6/#outline-container-sec-2 <br />
・ pip & Jinja2 (Docker): <br />
&emsp; https://qiita.com/RyosukeKamei/items/eca9687162b7fe122094 <br />
&emsp; http://www.python.ambitious-engineer.com/archives/760 <br />
・ Wiringpi library (Raspbeery Pi): <br />
&emsp; http://osoyoo.com/2017/06/22/intall-wiringpi/ <br />

## Changes from #3:
・ Added variable "interval" in dth11_temperature.tpl: <br />
&emsp; Added line 105; Modified line 158 <br />
・ Added one new function in xmltocode.py for create new folders to save useful files in ./Execute/: <br />
&emsp; Added line 245 - 254, line 293 - 294; Modified line 264 - 266; Moved code in line 271 - 283 <br />
・ Create Sirius Folder to save design and metamodel in Eclipse Sirius: <br />
&emsp; Added files in Sirius Folder <br />
・ Added Living_Room_1 Folder in Execute Folder to save generated files via main program: <br />
&emsp; Added files in Living_Room_1 Folder <br />
