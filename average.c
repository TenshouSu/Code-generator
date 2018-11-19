#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <string.h>
#include "data_average_accumulate.c"
#include "data_average_division.c"

void data_average(verify, inputdata, timepre, timesec, *outputdata)
{
  double sum = 0.0, avg = 0.0; // avg: Data of Average
  double countnum = 0.0;
  int interval = 60;

  if((timesec-timepre)%interval == 0)
  {
    if(countnum > 0.0)
    {
      data_average_division_step(verify,countnum,sum,&avg);
      *outputdata = avg;
      printf("Average Temperature of %d seconds is: %.1f \n", interval, avg);
    }
    else
    {
      printf("error! \n");
      avg = 0.0;
      *outputdata = avg;
    }
    countnum = 0.0;
    sum = 0.0;
  }
  else
  {
    if(inputdata>0.0)
    {
      data_average_accumulate_step(verify,tempreal,sum,&sum);
      countnum = countnum + 1;
    }
  }
}
