{% raw -%}
{% block mail_notification_1 -%} {# ------content of block mail_notification_1------ #}
{% endraw %}
import mail_notification
{% raw -%}
{% endblock %}
{% endraw %}

{% raw -%}
{% block mail_notification_2 -%} {# ------content of block mail_notification_2------ #}
{% endraw %}
alertcounter = 600
    Mintemp = 20
{% raw -%}
{% endblock %}
{% endraw %}

{% raw -%}
{% block mail_notification_3 -%} {# ------content of block mail_notification_3------ #}
{% endraw %}
if temperature < Mintemp and alertcounter >= 600:
                    mail_notification.sendmail(Mintemp)
                    alertcounter = 0
{% raw -%}
{% endblock %}
{% endraw %}

{% raw -%}
{% block mail_notification_4 -%} {# ------content of block mail_notification_4------ #}
{% endraw %}
alertcounter += timecounter
{% raw -%}
{% endblock %}
{% endraw %}
