#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <string.h>
#include "data_average_accumulate.c"
#include "data_average_division.c"

void data_average(int verify, double tempreal, int timepre, int timesec, double *sum, double *countnum, double *outputdata)
{
  double tempsum, avg = -1000.0; // tempsum: Tempdata of sum; avg: Data of Average
  int interval = 10; // <<<<<CUSTOMIZE>>>>>

  tempsum = *sum;

  if((timesec-timepre)%interval == 0)
  {
    if(*countnum > 0.0)
    {
      data_average_division_step(verify,*countnum,tempsum,&avg);
      *outputdata = avg;
      printf("Average Temperature of %d seconds is: %.1f \n", interval, avg);
    }
    else
    {
      if ((timesec-timepre) == 0)
      {
        data_average_accumulate_step(verify,tempreal,tempsum,&tempsum);
        *sum = tempsum;
        *countnum = *countnum + 1;
      }
      else
      {
        printf("error! \n");
        avg = -1000.0;
        *outputdata = avg;
      }
    }
    *countnum = 0.0;
    *sum = 0.0;
  }
  else
  {
    if(tempreal>-300)
    {
      data_average_accumulate_step(verify,tempreal,tempsum,&tempsum);
      *sum = tempsum;
      *countnum = *countnum + 1;
    }
  }
}
