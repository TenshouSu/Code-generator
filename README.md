# Code-generator
## 2 kinds of files in this program:
・ Main Program of Code Generator. <br />
・ File folder and Templates in it. <br />

## Also 3 kinds of Template:
・ Device and Function driver template. <br />
・ Function block template. <br />
・ Lustre Template.

## Configuration
・ Docker (PC): <br />
&emsp; https://www.docker.com/ <br />
・ Lustre v6 (Docker): <br />
&emsp; http://www-verimag.imag.fr/DIST-TOOLS/SYNCHRONE/lustre-v6/#outline-container-sec-2 <br />
・ pip & Jinja2 (Docker): <br />
&emsp; https://qiita.com/RyosukeKamei/items/eca9687162b7fe122094 <br />
&emsp; http://www.python.ambitious-engineer.com/archives/760 <br />
・ Wiringpi library (Raspbeery Pi): <br />
&emsp; http://osoyoo.com/2017/06/22/intall-wiringpi/ <br />

## Changes from #2:
・ Added 4 functions to find out lustre templates and translate them to C code and save the C files in Execute folder <br />
&emsp; From line 222 to 298 <br />
・ Modified some comment to make all functions be easy to see. <br />
&emsp; just line 222 to 224 <br />
