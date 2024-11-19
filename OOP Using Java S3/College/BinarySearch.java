package College;

import java.util.*;

public class BinarySearch {
      static int binarySearch(int []a,int size,int key)
      {
        int low=0,high=size-1;
        while(low<=high)
        {
          int mid=low+(high-low)/2;
          if(a[mid]== key)
          {
            return mid;
          }
          else if(a[mid]<key)
          {
            low=mid+1;
          }
          else
          high=mid-1;
        }
        return -1;
      }

  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter elements:");
    int []a=new int[10];
    for(int i=0;i<a.length;i++)
    {
      a[i]=s.nextInt();
    }
    System.out.println("Enter key:");
    int key=s.nextInt();
    int result=binarySearch(a,a.length,key);
    if(result!=-1)
    {
    System.out.println("Item found at index: "+result);
  }
  else{
    System.out.println("Not found");
  }
  s.close();
}
}
