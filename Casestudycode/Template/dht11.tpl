# -*- coding: UTF-8 -*-

import RPi.GPIO as GPIO
import time
import os
#import ctypes
{% raw -%}
{% block google_driver_1 -%} {# ------content of block google_driver_1------ #}
{% endblock %}
{% endraw %}
{% raw -%}
{% block discomfort_index_1 -%} {# ------content of block discomfort_index_1------ #}
{% endblock %}
{% endraw %}
{% raw -%}
{% block data_readonly_1 -%} {# ------content of block data_readonly_1------ #}
{% endblock %}
{% endraw %}
{% raw -%}
{% block zip_encryption_1 -%} {# ------content of block zip_encryption_1------ #}
{% endblock %}
{% endraw %}
{% raw -%}
{% block mail_notification_1 -%} {# ------content of block mail_notification_1------ #}
{% endblock %}
{% endraw %}

#DHT11 connect to BCM_GPIO14
DHTPIN = 14

GPIO.setmode(GPIO.BCM)

MAX_UNCHANGE_COUNT = 100

STATE_INIT_PULL_DOWN = 1
STATE_INIT_PULL_UP = 2
STATE_DATA_FIRST_PULL_DOWN = 3
STATE_DATA_PULL_UP = 4
STATE_DATA_PULL_DOWN = 5

def read_dht11_dat():
    GPIO.setup(DHTPIN, GPIO.OUT)
    GPIO.output(DHTPIN, GPIO.HIGH)
    time.sleep(0.05)
    GPIO.output(DHTPIN, GPIO.LOW)
    time.sleep(0.02)
    GPIO.setup(DHTPIN, GPIO.IN, GPIO.PUD_UP)

    unchanged_count = 0
    last = -1
    data = []
    while True:
        current = GPIO.input(DHTPIN)
        data.append(current)
        if last != current:
            unchanged_count = 0
            last = current
        else:
            unchanged_count += 1
            if unchanged_count > MAX_UNCHANGE_COUNT:
                break

    state = STATE_INIT_PULL_DOWN

    lengths = []
    current_length = 0

    for current in data:
        current_length += 1

        if state == STATE_INIT_PULL_DOWN:
            if current == GPIO.LOW:
                state = STATE_INIT_PULL_UP
            else:
                continue
        if state == STATE_INIT_PULL_UP:
            if current == GPIO.HIGH:
                state = STATE_DATA_FIRST_PULL_DOWN
            else:
                continue
        if state == STATE_DATA_FIRST_PULL_DOWN:
            if current == GPIO.LOW:
                state = STATE_DATA_PULL_UP
            else:
                continue
        if state == STATE_DATA_PULL_UP:
            if current == GPIO.HIGH:
                current_length = 0
                state = STATE_DATA_PULL_DOWN
            else:
                continue
        if state == STATE_DATA_PULL_DOWN:
            if current == GPIO.LOW:
                lengths.append(current_length)
                state = STATE_DATA_PULL_UP
            else:
                continue
    if len(lengths) != 40:
        print "Data not good, skip"
        return False

    shortest_pull_up = min(lengths)
    longest_pull_up = max(lengths)
    halfway = (longest_pull_up + shortest_pull_up) / 2
    bits = []
    the_bytes = []
    byte = 0

    for length in lengths:
        bit = 0
        if length > halfway:
            bit = 1
        bits.append(bit)
    # print "bits: %s, length: %d" % (bits, len(bits))
    for i in range(0, len(bits)):
        byte = byte << 1
        if (bits[i]):
            byte = byte | 1
        else:
            byte = byte | 0
        if ((i + 1) % 8 == 0):
            the_bytes.append(byte)
            byte = 0
    # print the_bytes
    checksum = (the_bytes[0] + the_bytes[1] + the_bytes[2] + the_bytes[3]) & 0xFF
    if the_bytes[4] != checksum:
        print "Data not good, skip"
        return False

    return the_bytes[0], the_bytes[2]

{% raw -%}
{% block data_average_1 -%} {# ------content of block data_average_1------ #}
{% endblock %}
{% endraw %}


def main():
    print "Raspberry Pi wiringPi DHT11 Start Running! \n"
    verify = 1
    timecounter = 0.00

    {% raw -%}
    {% block mail_notification_2 -%} {# ------content of block mail_notification_2------ #}
    {% endblock %}
    {% endraw %}

    interval = {{interval}}
    period = {{period}}
    {% raw -%}
    {% block data_average_2 -%} {# ------content of block data_average_2------ #}
    {% endblock %}
    {% endraw %}

    while verify:
        if timecounter == 0.00:
            timebegin = time.time()
            {% raw -%}
            {% block local_1 -%} {# ------content of block local_1------ #}
            {% endblock %}
            {% endraw %}

            {% raw -%}
            {% block google_driver_2 -%} {# ------content of block google_driver_2------ #}
            {% endblock %}
            {% endraw %}

            timeend = time.time()
            timecounter += timeend - timebegin
        elif timecounter < period:
            timebegin = time.time()
            result = read_dht11_dat()
            if result:
                humidity, temperature = result
                {% raw -%}
                {% block local_2 -%} {# ------content of block local_2------ #}
                {% endblock %}
                {% endraw %}

                print time.strftime("%Y-%m-%d %H:%M:%S:", time.localtime()), " humidity: %s %%,  Temperature: %s C" % (humidity, temperature)
                {% raw -%}
                {% block discomfort_index_2 -%} {# ------content of block discomfort_index_2------ #}
                {% endblock %}
                {% endraw %}

                {% raw -%}
                {% block data_average_3 -%} {# ------content of block data_average_3------ #}
                {% endblock %}
                {% endraw %}

                {% raw -%}
                {% block mail_notification_3 -%} {# ------content of block mail_notification_3------ #}
                {% endblock %}
                {% endraw %}

            time.sleep(interval)
            timeend = time.time()
            timecounter += timeend - timebegin
            {% raw -%}
            {% block mail_notification_4 -%} {# ------content of block mail_notification_4------ #}
            {% endblock %}
            {% endraw %}

            {% raw -%}
            {% block data_average_4 -%} {# ------content of block data_average_4------ #}
            {% endblock %}
            {% endraw %}

        else:
            timecounter = 0.00
            {% raw -%}
            {% block local_3 -%} {# ------content of block local_3------ #}
            {% endblock %}
            {% endraw %}

            {% raw -%}
            {% block data_readonly_2 -%} {# ------content of block data_readonly_2------ #}
            {% endblock %}
            {% endraw %}

            {% raw -%}
            {% block google_driver_3 -%} {# ------content of block google_driver_3------ #}
            {% endblock %}
            {% endraw %}

            {% raw -%}
            {% block zip_encryption_2 -%} {# ------content of block zip_encryption_2------ #}
            {% endblock %}
            {% endraw %}

def destroy():
    GPIO.cleanup()

if __name__ == '__main__':
    try:
        main()
    except KeyboardInterrupt:
        destroy()
