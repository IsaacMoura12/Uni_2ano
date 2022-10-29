//
// Tomás Oliveira e Silva, AED, October 2021
//
// list all command line arguments
//

#include <stdio.h>
#include <stdlib.h>


int main(int argc,char *argv[argc])
{
  int val;
  for(int i = 0;i < argc;i++){
  val = atoi(argv[i]); // int de cada argumento
                      // se for string int = 0

    //printf("argv[%2d] = \"%s\"\n",i,argv[i]);}
    printf("argv[%2d] = \"%d\"\n",i,val);}
  return 0;
}
