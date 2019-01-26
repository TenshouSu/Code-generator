{% raw -%}
{% block google_driver_1 -%} {# ------content of block google_driver_1------ #}
{% endraw %}
import google_driver
{% raw -%}
{% endblock %}
{% endraw %}

{% raw -%}
{% block google_driver_2 -%} {# ------content of block google_driver_2------ #}
{% endraw %}
nontxt = './log/log_' + str(int(timebegin))
            referpath = '/log_' + str(int(timebegin)) + '.txt'
            path = './log/log_' + str(int(timebegin)) + '.txt'
            fpath = "./log"
            folder = os.path.exists(fpath)
            if not folder:
                os.makedirs(fpath)
            file = open(path, 'w')
{% raw -%}
{% endblock %}
{% endraw %}

{% raw -%}
{% block google_driver_3 -%} {# ------content of block google_driver_3------ #}
{% endraw %}
file.close()
            google_driver.upload(referpath)
            deletemsg = 'sudo rm ' + path
            os.system(deletemsg)
{% raw -%}
{% endblock %}
{% endraw %}
