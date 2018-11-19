/********************************************************************************************
*Filename      : dht11.c
*Description   : make a thermometer
*Author        : Alan
*Website       : www.osoyoo.com
*Update        : 2017/07/06
********************************************************************************************/

#include <wiringPi.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <string.h>
#include <errno.h>
#include <time.h>
#include "average.c"


#define MAXTIMINGS  85
#define DHTPIN      15  //DHT connect to TxD
int dht11_dat[5] ={0,0,0,0,0};//store DHT11 data

void read_dht11_dat(double *tempreal)
{
    uint8_t laststate = HIGH;
    uint8_t counter = 0;
    uint8_t j = 0,i;
    *tempreal = 0.0;

    dht11_dat[0] = dht11_dat[1] = dht11_dat[2] = dht11_dat[3] = dht11_dat[4] = 0;

    //pull pin down to send start signal
    pinMode( DHTPIN, OUTPUT );
    digitalWrite( DHTPIN, LOW );
    delay( 18 );
    //pull pin up and wait for sensor response
    digitalWrite( DHTPIN, HIGH );
    delayMicroseconds( 40 );
    //prepare to read the pin
    pinMode( DHTPIN, INPUT );

    //detect change and read data
    for ( i = 0; i < MAXTIMINGS; i++ )
    {
        counter = 0;
        while ( digitalRead( DHTPIN ) == laststate )
        {
            counter++;
            delayMicroseconds( 1 );
            if ( counter == 255 )
            {
                break;
            }
        }
        laststate = digitalRead( DHTPIN );

        if ( counter == 255 )
            break;
        //ignore first 3 transitions
        if ( (i >= 4) && (i % 2 == 0) )
        {
            //shove each bit into the storage bytes
            dht11_dat[j / 8] <<= 1;
            if ( counter > 16 )
                dht11_dat[j / 8] |= 1;
            j++;
        }
    }
    //check we read 40 bits(8bit x 5) +verify checksum in the last byte
    //print it out if data is good

    if ( (j >= 40) &&
         (dht11_dat[4] == ( (dht11_dat[0] + dht11_dat[1] + dht11_dat[2] + dht11_dat[3]) & 0xFF) ) )
    {
        *tempreal = (float)dht11_dat[2]+(float)(dht11_dat[3])/10;
    }
    else
    {
        *tempreal = -1000.0; // Signal of bad data
    }
}


void print_info()
{
    printf("\n");
    printf("|***************************|\n");
    printf("|           DHT11 test      |\n");
    printf("| --------------------------|\n");
    printf("| DHT11 connect to GPIO14   |\n");
    printf("| --------------------------|\n");
    printf("|                     OSOYOO|\n");
    printf("|***************************|\n");
    printf("Program is running...\n");
    printf("Press Ctrl+C to end the program\n");
}


int main( void )
{
    int verify = 1; // Veryfication by other reference functions

    int timepre, timesec;
    int period = 20; // Data collection period <<<<<CUSTOMIZE>>>>>

    double outputdata; // Data for output
    double tempreal = 0.0; // Data of Realtime
    time_t tmpcal_ptr;
    struct tm *tmp_ptr = NULL;

    // average ----------BLOCK 1---------- BEGIN
    double sum = 0.0, countnum = 0.0;
    // average ----------BLOCK 1---------- END

    if ( wiringPiSetup() == -1 )
    {
        fprintf(stderr,"Can't init wiringPi: %s\n",strerror(errno));
        exit(EXIT_FAILURE);
    }
    print_info();
    while ( 1 )
    {
        time(&tmpcal_ptr);
        timepre = tmpcal_ptr; // Begin timestamp
        timesec = tmpcal_ptr; // real-time timestamp

        while ((timesec-timepre)<=period)
        {
          read_dht11_dat(&tempreal);

          outputdata = tempreal;

          time(&tmpcal_ptr);
          tmp_ptr = localtime(&tmpcal_ptr);
          printf("%d.%d.%d ", (1900+tmp_ptr->tm_year), (1+tmp_ptr->tm_mon), tmp_ptr->tm_mday);            printf("%d:%d:%d ", tmp_ptr->tm_hour, tmp_ptr->tm_min, tmp_ptr->tm_sec);
          if (tempreal > -300)
          {
            printf("Temperature: %.1f \n", outputdata);
          }
          else
          {
            printf("Data not good, skip \n");
          }

          // average ----------BLOCK 2---------- BEGIN
          data_average(verify, tempreal, timepre, timesec, &sum, &countnum, &outputdata);
          // average ----------BLOCK 1---------- END

          delay(1000);//wait ls to refresh

          time(&tmpcal_ptr);
          timesec = tmpcal_ptr; // Record timestamp
        }
        printf("Turn End \n"); // Print the end of turn (FOR TEST)
    }
    return(0);
}
