# Dictionary for search level verification
def valuedict(function):
    # Sensor Section
    dht11 = {'ModeName':'Sensor', 'IDNumber':102}
    # Anonymization Section
    discomfort_index = {'ModeName':'Anony', 'IDNumber':307}
    data_average = {'ModeName':'Anony', 'IDNumber':101}
    # Encryption Section
    zip_encryption = {'ModeName':'Encry', 'IDNumber':201}
    # Data_deletion Section
    data_delete = {'ModeName':'Delet', 'IDNumber':301}
    # Verification Section
    data_readonly = {'ModeName':'Verify', 'IDNumber':802}
    # Domain Section
    local = {'ModeName':'Domain','IDNumber':101}
    google_driver = {'ModeName':'Domain','IDNumber':205}
    # Other Section
    mail_notification = {'ModeName':'Other','IDNumber':202}

    # Return
    exec 'c = ' + function
    try:
        return  c
    except:
        pass
