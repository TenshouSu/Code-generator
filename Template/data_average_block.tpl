{% raw -%}
{% block data_average_1 -%} {# ------content of block data_average_1------ #}
{% endraw %}
#include "data_average.c"
{% raw -%}
{% endblock %}
{% endraw %}

{% raw -%}
{% block data_average_2 -%} {# ------content of block data_average_2------ #}
{% endraw %}
double sum = 0.0, countnum = 0.0;
{% raw -%}
{% endblock %}
{% endraw %}

{% raw -%}
{% block data_average_3 -%} {# ------content of block data_average_3------ #}
{% endraw %}
data_average(verify, tempreal, timepre, timesec, &sum, &countnum, &outputdata, &flag);
{% raw -%}
{% endblock %}
{% endraw %}
