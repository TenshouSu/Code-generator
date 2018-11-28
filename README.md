# Code-generator
## 4 kinds of files in this program:
* Main Program of Code Generator in Root Directory. <br />
* Template in "Template" Folder. <br />
* Design files of Eclipse Sirius in "Sirius" Folder and Sample XML file in "XML" Folder. <br />
* Generated files in "Execute" Folder <br />

## 3 kinds of Template:
* Device and Function driver template. <br />
* Function block template. <br />
* Lustre Template.

## Configuration
* Eclipse Sirius (PC): <br/>
&emsp; http://www.eclipse.org/sirius/download.html <br />
* Docker (PC): <br />
&emsp; https://www.docker.com/ <br />
* Lustre v6 (Docker): <br />
&emsp; http://www-verimag.imag.fr/DIST-TOOLS/SYNCHRONE/lustre-v6/#outline-container-sec-2 <br />
* pip & Jinja2 (Docker): <br />
&emsp; https://qiita.com/RyosukeKamei/items/eca9687162b7fe122094 <br />
&emsp; http://www.python.ambitious-engineer.com/archives/760 <br />
* Wiringpi library (Raspbeery Pi): <br />
&emsp; http://osoyoo.com/2017/06/22/intall-wiringpi/ <br />
* Please use Docker to execute main progam. 

## Changes from Code_Generator-#6:
* Modified main program 'xmltocode.py' for changing templateAssemble function to generate different kinds of code. <br />
&emsp; Modified line 324, 355, 357, 410; Added line 325 <br />
<br />
