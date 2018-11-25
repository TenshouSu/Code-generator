#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <string.h>
#include <time.h>

void local(int flag, int timepre, double outputdata)
{
  if (flag == 1)
  {
    int i=0;
    time_t tmpcal_ptr;
    struct tm *tmp_ptr = NULL;

    time(&tmpcal_ptr);
    tmp_ptr = localtime(&tmpcal_ptr);
    int date[6] = {(1900+tmp_ptr->tm_year),(1+tmp_ptr->tm_mon),tmp_ptr->tm_mday,tmp_ptr->tm_hour,tmp_ptr->tm_min,tmp_ptr->tm_sec};

    const char *filename = "{{path}}"; // Output path <<<<<CUSTOMIZE>>>>>
    char savename[30];
    strcpy(savename,filename);
    char timesp[15];
    sprintf(timesp,"_%d",timepre);
    strcat(savename,timesp);
    strcat(savename,".txt");
    FILE *p = fopen(savename,"ab");

    char ch[4];
    for(i=0;i<6;++i)
    {
      if(i == 0)
      {
        sprintf(ch, "%d", date[i]);
        fwrite(ch, 1, sizeof(ch), p);
        char s[] = ".";
        fwrite(s, 1, sizeof(s), p);
      }
      if(i<2&&i>0)
      {
        sprintf(ch, "%02d.", date[i]);
        fwrite(ch, 1, sizeof(ch), p);
      }
      if(i == 2 || i == 5)
      {
        sprintf(ch, "%02d ", date[i]);
        fwrite(ch, 1, sizeof(ch), p);
      }
      if(i<5 && i>2)
      {
        sprintf(ch, "%02d:", date[i]);
        fwrite(ch, 1, sizeof(ch), p);
      }
    }

    char str[10];
    sprintf(str, "%.1f \n", outputdata);
    fwrite(str, 1, sizeof(str), p);

    fclose(p);
  }
}
