package College;
import java.util.*;


public class StringPalindrome {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String newString=new String();
    System.out.println("Enter a String");
    newString=s.nextLine();
    String rev=new String();
    for(int i=newString.length()-1;i>=0;i--)
    {
      rev+=newString.charAt(i);
    }
    if(newString.equalsIgnoreCase(rev))
    {
      System.out.println("Palindrome");
    }
    else
    {
      System.out.println("Not Palindrome");
    }

    s.close();
  }
}
