#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <string.h>
#include <time.h>

void local(int flag, double outputdata)
{
  if (flag == 1)
  {
    time_t tmpcal_ptr;
    struct tm *tmp_ptr = NULL;

    time(&tmpcal_ptr);
    tmp_ptr = localtime(&tmpcal_ptr);

    const char *filename = "./aout.txt"; // Output path <<<<<CUSTOMIZE>>>>>

    FILE *p = fopen(filename,"ab");
    int date[6] = {(1900+tmp_ptr->tm_year),(1+tmp_ptr->tm_mon),tmp_ptr->tm_mday,tmp_ptr->tm_hour,tmp_ptr->tm_min,tmp_ptr->tm_sec};
    char ch[4];
    for(int i=0; i<6; ++i)
    {
      if(i<2)
      {
        sprintf(ch, "%d.", date[i]);
        fwrite(ch, 1, sizeof(ch), p);
      }
      if(i == 2 || i == 5)
      {
        sprintf(ch, "%d ", date[i]);
        fwrite(ch, 1, sizeof(ch), p);
      }
      if(i<5 && i>2)
      {
        sprintf(ch, "%d:", date[i]);
        fwrite(ch, 1, sizeof(ch), p);
      }
      if(i == 0)
      {
        char s[] = ".";
        fwrite(s, 1, sizeof(s), p);
      }
    }

    char str[10];
    sprintf(str, "%.1f C \n", outputdata);
    fwrite(str, 1, sizeof(str), p);

    fclose(p);
  }
  return 0;
}
