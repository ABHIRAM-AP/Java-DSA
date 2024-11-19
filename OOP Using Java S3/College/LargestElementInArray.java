package College;
import java.util.*;


public class LargestElementInArray {
  public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter size of array:");
    int size=s.nextInt();
    s.nextLine();
    System.out.println("Enter elements:");
    int []a=new int[size];
    for(int i=0;i<a.length;i++)
    {
      a[i]=s.nextInt();
    }
    Arrays.sort(a);
    int largest=a[a.length-1];
    System.out.println("Largest element is "+largest);
    s.close();
  }
}


/*import java.util.Scanner;

public class LargestElementInArray {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int size = s.nextInt();
    System.out.println("Enter elements:");
    int[] a = new int[size];
    
    // Reading elements into the array
    for (int i = 0; i < size; i++) {
      a[i] = s.nextInt();
    }
    
    // Finding the largest element
    int largest = a[0]; // Start by assuming the first element is the largest
    for (int i = 1; i < size; i++) {
      if (a[i] > largest) {
        largest = a[i]; // Update largest if a bigger element is found
      }
    }

    System.out.println("Largest element is " + largest);
    s.close();
  }
}*/
