package College;

import java.util.*;

public class QuickSort {
  static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
  public static int partition(int a[],int low,int high)
  {
    int i=low,j=high,pivot=a[low];
    while(i<j)
    {
      while(a[i]<=pivot && i<=high-1)
      {
        i++;
      }
      while(a[j]>pivot && j>=low+1)
      {
        j--;
      }
      if(i<j)
      {
        swap(a,i,j);
      }
    }
    swap(a, low, j);
    return j;
  }
  public static void quickSort(int a[],int low,int high)
  {
    if(low<high)
    {
      int pIndex=partition(a,low,high);
      quickSort(a,low,pIndex-1);
      quickSort(a,pIndex+1,high);
    }
  }
  public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Elements of array:");
    int []a=new int[5];
    for(int i=0;i<a.length;i++)
    {
      a[i]=s.nextInt();
    }

    quickSort(a, 0, a.length-1);
    for(int i=0;i<a.length;i++)
    {
     System.out.println(a[i]+"\t");
    }
    s.close(); }
}
