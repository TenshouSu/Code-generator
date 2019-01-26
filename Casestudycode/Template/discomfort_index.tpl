# -*- coding: UTF-8 -*-

import os

def discom(temperature,humidity):
    output = 0.81 * temperature + 0.01 * humidity * (0.99 * temperature - 14.3) + 46.3
    return output
