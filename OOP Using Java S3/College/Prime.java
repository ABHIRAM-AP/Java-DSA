package College;
import java.util.*;

 class Prime
{       

    @SuppressWarnings("resource")
        public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();
        s.nextLine();
        int flag=0;
         for(int i=2;i<=Math.sqrt(num);i++)
         {
             if(num % i==0)
             {
                 flag=1;
                 break;
             }
         }
         if(flag==0)
         {
             System.out.println("Prime");
         }
         else
         {
             System.out.println("Not Prime");
         }
    }
}