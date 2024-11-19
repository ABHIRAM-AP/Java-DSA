package College;
import java.util.*;

public class MatrixMul
{
  public static void main(String[]args)
  {
Scanner s=new Scanner(System.in);
System.out.println("Enter row and column of 1st");
int r1=s.nextInt();
int c1=s.nextInt();
  s.nextLine();

  System.out.println("Enter row and column of 2nd");
  int r2=s.nextInt();
  int c2=s.nextInt();
    s.nextLine();
    int [][]a=new int[r1][c1];
    int [][]b=new int[r2][c2];
    readElements(a,r1,c1);
    readElements(b,r2,c2);
    matrixMul(a,b,r1,c1,r2,c2);
   // printMatrix(a,r1,c1);
    //printMatrix(b,r2,c2);
    s.close();
  }

  static void readElements(int [][]a,int r,int c)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter elements:");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        a[i][j]=s.nextInt();
      }
    }
    s.close();
  }

  static void printMatrix(int [][]a,int r,int c)
  
  {
    System.out.println("Matix is:");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(a[i][j]+"\t");
      }
      System.out.println();
    }
  }

  static void matrixMul(int [][]a,int [][]b,int r1,int c1,int r2,int c2)
  {
    int [][]p=new int[r1][c2];
    if(c1 == r2)
    {
      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c2;j++)
        {
          p[i][j]=0;
          for(int k=0;k<c1;k++)
          {
            p[i][j]+=a[i][k]*b[k][j];
          }
        }
      }
    }
    else{
      System.out.println("Multiplication not possible!!");
    }
    System.out.println("Multiplied Matrix is:");
    printMatrix(p, r1, c2);
  }

}