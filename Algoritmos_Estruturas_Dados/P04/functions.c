//
// Tomás Oliveira e Silva, AED, October 2021
//
// the functions for the first exercise of class P.04
// (for a given positive value of n, find a formula for the return value of each function)
//

#include<stdio.h>

#include "elapsed_time.h"



int f1(int n)
{
  int i,r=0;

  for(i = 1;i <= n;i++)
    r += 1;
  return r;
}

int f2(int n)
{
  int i,j,r=0;

  for(i = 1;i <= n;i++)
    for(j = 1;j <= i;j++)
      r += 1;
  return r;
}

int f3(int n)
{
  int i,j,r=0;

  for(i = 1;i <= n;i++)
    for(j = 1;j <= n;j++)
      r += 1;
  return r;
}

int f4(int n)
{
  int i,r=0;

  for(i = 1;i <= n;i++)
    r += i;
  return r;
}

int f5(int n)
{
  int i,j,r=0;

  for(i = 1;i <= n;i++)
    for(j = i;j <= n;j++)
      r += 1;
  return r;
}

int f6(int n)
{
  int i,j,r=0;

  for(i = 1;i <= n;i++)
    for(j = 1;j <= i;j++)
      r += j;
  return r;
}

int main(void)
{
  // place your code here
  double dt1,dt2,dt3,dt4,dt5,dt6;
  int r1,r2,r3,r4,r5,r6;
  int n;

  for(int p= 1; p<=15;p++){
    n = 1<<p;

    dt1 = cpu_time();r1= f1(n);dt1= cpu_time() - dt1; printf("%4d 1 %20d %17.15f\n", (int)n,r1,dt1);
    dt2 = cpu_time();r1= f1(n);dt2= cpu_time() - dt2; printf("%4d 1 %20d %17.15f\n", (int)n,r2,dt2);
    dt3 = cpu_time();r1= f1(n);dt3= cpu_time() - dt3; printf("%4d 1 %20d %17.15f\n", (int)n,r3,dt3);
    dt4 = cpu_time();r1= f1(n);dt4= cpu_time() - dt4; printf("%4d 1 %20d %17.15f\n", (int)n,r4,dt4);
    dt5 = cpu_time();r1= f1(n);dt5= cpu_time() - dt5; printf("%4d 1 %20d %17.15f\n", (int)n,r5,dt5);
    dt6 = cpu_time();r1= f1(n);dt6= cpu_time() - dt6; printf("%4d 1 %20d %17.15f\n", (int)n,r6,dt6);

  }
}
