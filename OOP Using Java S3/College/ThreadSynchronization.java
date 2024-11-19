import java.util.Scanner;

class My extends Thread
{
     public  static int balance=5000;
    private int amount=0;
    My(int amount)
    {
        this.amount =amount;
    }
    public synchronized void run()
    {
        if(balance>=amount){
        balance=balance-amount;
         System.out.println("Transaction successful! Withdrawn: " + amount + ". Remaining balance: " + balance);
    }
    else{System.out.println("Insufficient balance!");
    }
}
public static int getbalance()
{
    return balance;
}
}

public class ThreadSynchronization
{
    public static void main(String[]args)throws InterruptedException
    {
        Scanner s=new Scanner(System.in);
      System.out.println("Enter the amount:");
      int amount1=s.nextInt();
      s.nextLine();
      My a=new My(amount1);
      a.start();
          a.sleep(1000);

      System.out.println("Enter the amount:");
       int amount2=s.nextInt();
      s.nextLine();
      My b=new My(amount2);
      b.start();
    b.sleep(1000);

      
      System.out.println("Enter the amount:");
       int amount3=s.nextInt();
      s.nextLine();
      My c=new My(amount3);
      c.start();
    c.sleep(1000);
         

        System.out.println("Final balance: " + My.getbalance());
    }
}