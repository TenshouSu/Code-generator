{% raw -%}
{% block data_average_1 -%} {# ------content of block data_average_1------ #}
{% endraw %}
def accsum(input,sum):
    sum += input
    return sum

def average(sum,avgcounter):
    output = sum / avgcounter
    return output
{% raw -%}
{% endblock %}
{% endraw %}

{% raw -%}
{% block data_average_2 -%} {# ------content of block data_average_2------ #}
{% endraw %}
avgcounter = 0
    sum = 0
    averagetime = -1
    averagemax = 3600
{% raw -%}
{% endblock %}
{% endraw %}

{% raw -%}
{% block data_average_3 -%} {# ------content of block data_average_3------ #}
{% endraw %}
sum = accsum(uncon,sum)
                avgcounter += 1
            if averagetime >= (averagemax - 1) and avgcounter != 0:
                avgnum = average(sum,avgcounter)
                avgmsg = time.strftime("%Y-%m-%d %H:%M:%S:", time.localtime()) + ' Average of ' + 'Discomfort Index' + ' in ' + str(averagemax) + 's: ' + str(int(avgnum)) + '\n'
                print time.strftime("%Y-%m-%d %H:%M:%S:", time.localtime()) + ' Average of ' + 'Discomfort Index' + ' in ' + str(averagemax) + 's: ' + str(int(avgnum))
                try:
                    file.write(avgmsg)
                except:
                    pass
                averagetime = 0
                sum = 0
                avgcounter = 0
{% raw -%}
{% endblock %}
{% endraw %}

{% raw -%}
{% block data_average_4 -%} {# ------content of block data_average_4------ #}
{% endraw %}
averagetime += timeend - timebegin
{% raw -%}
{% endblock %}
{% endraw %}
