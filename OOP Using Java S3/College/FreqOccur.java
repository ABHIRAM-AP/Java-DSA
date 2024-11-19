package College;
import java.util.*;

public class FreqOccur {
  public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=s.nextLine();
    System.out.println("Enter a character:");
    char c = s.next().charAt(0);
    int count=0;
    for(int i=0;i<str.length()-1;i++)
    {
      if(str.charAt(i)==c)
      {
        count++;
      }
    }
    System.out.println("Count of "+c+" is "+count);
    s.close();
  }
}
