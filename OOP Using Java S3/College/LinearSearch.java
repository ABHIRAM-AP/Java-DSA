package College;
import java.util.Scanner;

public class LinearSearch
{


  public static void linearSearch(int []a,int size,int key)
  {
    boolean flag=false;
    int j=0;
    for( j=0;j<a.length;j++)
    {
      
      if(a[j]==key)
      {
        flag=true;
        break;
      }
    }
    if(flag==true)
    {
      System.out.println("Element found at index: "+j);
    }
    else
    {
      System.out.println("Element not found");
    }
   
    }
  
  public static void main(String[]args)
  {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter elements:");
  
  int []a=new int[10];
  for(int i=0;i<a.length;i++)
  {
    a[i]=s.nextInt();
  }
  System.out.println("Enter element searched");
  int key=s.nextInt();
  s.nextLine();
  s.close();

  linearSearch(a, a.length-1, key);


}
}