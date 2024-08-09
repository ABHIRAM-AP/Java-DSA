import java.util.*;

class Largest
{
    public static void largest(int []a , int size)
    {
     int temp=0,j=0,i=0;
    for(i=0;i<size;i++)
    {
        for(j=i+1;j<size;j++)
        {
       temp=(a[i]>=a[j]) ? a[i] : a[j];
        }
    }  
     System.out.println("Largest element is "+temp);
}
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int size=0,i=0;
        
        System.out.println("Enter Size:");
        size=s.nextInt();
        int []a = new int[size];
        
        System.out.println("Enter elements:");
        for(i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        largest(a,size);
    } 
    }
