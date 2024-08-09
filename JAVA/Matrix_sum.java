import java.util.*;
class Add
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        
        int [][]a=new int[10][10];
        int [][]b=new int[10][10];
        int [][]sum=new int[10][10];
        int r,c,i=0,j=0;
        
        System.out.println("Enter row & column size:");
        r=s.nextInt();
        c=s.nextInt();
        
        System.out.println("Enter elements 1st:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter elements 2nd:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            sum[i][j]=(a[i][j]+b[i][j]);
        }
    }
        System.out.println("Added Matrix is:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(sum[i][j]+ "\t");
            }
            System.out.print("\n");
        }
    }
}