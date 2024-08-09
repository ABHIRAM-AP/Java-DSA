#include<stdio.h>
void main()
{
    int a[10][10],r,c,i=0,j=0;
    int flag=0;
    printf("Entert row and column size:");
    scanf("%d%d",&r,&c);
    
    printf("Enter elements:");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            if(a[j][i]!=0 && a[i][j]!=1 )
            {
                    flag=1;
                    break;
            }
        
        }
        }
        
    
    if(flag==1)
    {
        printf("Not");
    }
    else
    {
        printf("Identity");
    }
}