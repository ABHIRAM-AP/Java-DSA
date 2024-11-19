#include<stdio.h>

void readArray(int a[][10],int r,int c)
{
      printf("Enter the elements:");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
}
void printSparse(int sp[][10],int k)
{
     for(int i=0;i<k;i++)
    {
        printf("%d\t%d\t%d\n",sp[i][0],sp[i][1],sp[i][2]);
    }
}


void transpose(int sp[][10])
{
    int t[10][10];
    int k=1;
    t[0][0]=sp[0][1];
    t[0][1]=sp[0][0];
    t[0][2]=sp[0][2];
    
    for(int i=0;i<sp[0][1];i++)
    {
        for(int j=0;j<=sp[0][2];j++)
        {
            if(sp[j][i]==i)
            {
                t[k][0]=sp[j][1];
                t[k][1]=sp[j][0];
                t[k][2]=sp[j][2];
                k++;
            }
        }
    }
    
    printf("\nTranspose Matrix is\n");
    printSparse(t,k-1);
}

void changeSparse(int a[][10],int sp[][10],int r,int c)
{
    int k=1;
    sp[0][0]=r;
    sp[0][1]=c;
    sp[0][2]=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(a[i][j]!=0)
            {
                sp[k][0]=i;
                sp[k][1]=j;
                sp[k][2]=a[i][j];
                k++;
            }
        }
    }
    sp[0][2]=k-1;
    printf("\nSparse Matrix is\n");
      printSparse(sp,k);
      transpose(sp);
}
void printArray(int a[][10],int r,int c)
{
       for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            printf("%d\t",a[i][j]);
        }
        printf("\n");
    }
}



int main()
{
    int a[10][10],sp[10][10],k=1;
    printf("Enter the row and column: ");
    int r=0,c=0;
    scanf("%d%d",&r,&c);
  
    readArray(a,r,c);
    
    changeSparse(a,sp,r,c);
    
     //printSparse(sp,k);
    
    return 0;
}