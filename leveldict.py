# Dictionary for search level verification
def valuedict(function):
    # Sensor Section
    dht11_temperature = {'sensor':1001}
    # Anonymization Section
    data_average = {'anonymization':1}
    # Encryption Section
    # Data_deletion Section
    # Verification Section
    # Domain Section
    local = {'domain':1}

    # Return
    exec 'c = ' + function
    try:
        return  c
    except:
        pass
