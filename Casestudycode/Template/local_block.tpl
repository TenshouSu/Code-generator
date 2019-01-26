{% raw -%}
{% block local_1 -%} {# ------content of block local_1------ #}
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
{% block local_2 -%} {# ------content of block local_2------ #}
{% endraw %}
rasmsg = time.strftime("%Y-%m-%d %H:%M:%S:", time.localtime()) + '  humidity: ' + str(humidity) + ' %,  ' + 'Temperature: ' + str(temperature) + ' C  ' + '\n'
                file.write(rasmsg)
{% raw -%}
{% endblock %}
{% endraw %}

{% raw -%}
{% block local_3 -%} {# ------content of block local_3------ #}
{% endraw %}
file.close()
{% raw -%}
{% endblock %}
{% endraw %}
