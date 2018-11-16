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
// Average -------BLOCK1------- BEGIN
#include "data_average_accumulate.c"
#include "data_average_division.c"
// Average -------BLOCK1------- END


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

    // Average -------BLOCK2------- BEGIN
    double sum = 0.0, avg = 0.0; // avg: Data of Average
    double countnum = 0.0;
    int timepre = 0, timesec;
    int interval = 10; // Can be ustomized
    // Average -------BLOCK2------- END

    double Outputdata; // Data for output
    double tempreal = 0.0; // Data of Realtime
    time_t tmpcal_ptr;
    struct tm *tmp_ptr = NULL;

    if ( wiringPiSetup() == -1 )
    {
        fprintf(stderr,"Can't init wiringPi: %s\n",strerror(errno));
        exit(EXIT_FAILURE);
    }
    print_info();
    while ( 1 )
    {
        // Average -------BLOCK3------- BEGIN
        if(timepre == 0)
        {
          time(&tmpcal_ptr);
          timepre = tmpcal_ptr;
        }
        time(&tmpcal_ptr);
        timesec = tmpcal_ptr;
        // Average -------BLOCK3------- END

        read_dht11_dat(&tempreal);
        Outputdata = tempreal;

        // Average -------BLOCK4------- BEGIN
        if(tempreal > 0.0)
        {
          data_average_accumulate_step(verify,tempreal,sum,&sum);
          countnum = countnum + 1;
        }
        // Average -------BLOCK4------- END

        time(&tmpcal_ptr);
        tmp_ptr = localtime(&tmpcal_ptr);
        printf("%d.%d.%d ", (1900+tmp_ptr->tm_year), (1+tmp_ptr->tm_mon), tmp_ptr->tm_mday);
        printf("%d:%d:%d ", tmp_ptr->tm_hour, tmp_ptr->tm_min, tmp_ptr->tm_sec);
        printf("Temperature: %.1f \n", Outputdata);

        // Average -------BLOCK5------- BEGIN
        if(timesec-timepre >= interval-1)
        {
          if(countnum > 0)
          {
            data_average_division_step(verify,countnum,sum,&avg);
            Outputdata = avg;
            printf("Average Temperature of %d seconds is: %.1f \n", interval, Outputdata);
          }
          else
          {
            printf("error!! \n");
            Outputdata = 0.0;
          }
          countnum = 0.0;
          sum = 0.0;
          timepre = 0;
        }
        // Average -------BLOCK5------- END

        delay(1000);//wait ls to refresh
    }

    return(0);
}
