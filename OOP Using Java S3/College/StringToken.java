package College;

import java.util.*;

public class StringToken {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a line of integers seperated by commas:");
      String line=s.nextLine();

      StringTokenizer tokenizer=new StringTokenizer(line,",");
      int sum=0;

      System.out.println("Integers in the line:");
      while(tokenizer.hasMoreTokens())
      {
        String tokens=tokenizer.nextToken();
        int num=Integer.parseInt(tokens);
        System.out.println(num);
        sum+=num;
      }

      System.out.println("Sum= "+sum);
      s.close();
    }
}
