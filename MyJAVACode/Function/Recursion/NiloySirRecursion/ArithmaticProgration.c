#include<stdio.h>

void display(int a, int d, int n)
{
    if (n==0)
    {
        //printf("%d\n",n);
        return;
    }
    printf("%d ", a);
    display(a+d,d,n-1);

    // printf("%d\n",a);
}
int main()
{
    display(1,2,6);
}
