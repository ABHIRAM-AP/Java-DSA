import java.util.*;
class Palindrome
{
    public static void main(String[]args)
    {
        int num=0,rem,result=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=s.nextInt();
        
        int originalnum=num;
        while(num!=0)
        {
         rem = num%10;   
         result=result*10+rem;
         num/=10;
        }
        if(originalnum==result)
        {
            System.out.println("Palindrome");
        }
        else
        {
             System.out.println("Not");
        }
    }
}