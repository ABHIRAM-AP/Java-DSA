#include<stdio.h>

int main()
{
    int a[10][10],b[10][10],i=0,j=0,k=1,r,c;
    printf("Enter row & column size:");
    scanf("%d%d",&r,&c);
    
    printf("Enter elements:");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    
    b[0][0]=r;
    b[0][1]=c;
    b[0][2]=0;
    
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            if(a[i][j]!=0)
            {
                b[k][0]=i;
                b[k][1]=j;
                b[k][2]=a[i][j];
                k++;
            }
        }
    }
     b[0][2] = k - 1;
    printf("Sparse Matrix is:\n");
    for(i=0;i<k;i++)
    {
        printf("%d \t %d \t %d\n",b[i][0],b[i][1],b[i][2]);
    }
return 0;
}