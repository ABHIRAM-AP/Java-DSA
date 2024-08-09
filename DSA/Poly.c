#include<stdio.h>
#define S 10
typedef struct
{
    int coeff[S];
    int power[S];
}POLY;

int main()
{
    int n,i=0;
    printf("Enter the highest order of the polynomial:");
    scanf("%d",&n);
    POLY p;
    printf("Enter the coefficents from constant ot highest power:\n");
    for(i=0;i<=n;i++)
    {
        scanf("%d",&p.coeff[i]);
        p.power[i]=i;
    }
    
    
       printf("Expression is: ");
    for(i = n; i >= 0; i--)
    {
        if (p.power[i] > 0)
            printf("%dx^%d + ", p.coeff[i],p.power[i]);
        
    else if(p.coeff[i]<0)
    {
        printf(" - ");
    }
        else
            printf("%d", p.coeff[i]);
    }
    return 0;
}
