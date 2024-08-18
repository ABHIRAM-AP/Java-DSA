#include<stdio.h>
#define SIZE 10
int main()
{
    int a[SIZE][SIZE], b[SIZE][3], i=0,j=0,k=1,r,c;
    int t[SIZE][3];
    printf("Enter the row and column size");
    scanf("%d%d",&r,&c);
    
    printf("Enter the elements:");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    
    b[0][0] = r;
    b[0][1] = c;
    b[0][2] = 0;
    
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            if(a[i][j]!=0)
            {
                b[k][0] = i;
                b[k][1] = j;
                b[k][2] = a[i][j];
                k++;
            }
        }
    }
    b[0][2] = k - 1;
   
   t[0][0]=b[0][1];
   t[0][1]=b[0][0];
   t[0][2]=b[0][2];
   k=1;
   
   for(i=0;i<b[0][1];i++)
   {
       for(j=1;j<=b[0][2];j++)
       {
           if(b[j][1] == i)
           {
                t[k][0]=b[j][1];
                t[k][1]=b[j][0];
                t[k][2]=b[j][2];
                k++;
            }
           }
       }
  
   printf("Transpose Sparse Matrix is:\n");
    for(i=0;i<k;i++)
    {
        printf("%d \t %d \t %d\n",t[i][0],t[i][1],t[i][2]);
    }  
    return 0;
}
