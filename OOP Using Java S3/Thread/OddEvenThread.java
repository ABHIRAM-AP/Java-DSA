import java.util.*;

class IntegerThread extends Thread
{
  public void run()
    {
      Random random = new Random();

      for(int i=0;i<10;i++)
      {
      
        int num = random.nextInt(100);
        if(num%2==0)
        {
          EvenThread even= new EvenThread(num);
          even.start();
         
        }
        else{
          OddThread odd=new OddThread(num);
          odd.start();
        }
        try{
          Thread.sleep(1000);
          
        }
        catch(InterruptedException e)
        {
          System.out.println(e.getMessage());
        }
  }
}
}

class EvenThread extends Thread
{
  int num=0;
  EvenThread(int num)
  {
    this.num=num;
  }
  public  void run()
  {
    System.out.println("Even Integer: "+num);
  
  try{
    Thread.sleep(1000);
  }
  catch(InterruptedException e)
  {
    System.out.println(e.getMessage());
  }
}
}


class OddThread extends Thread
{
  int num=0;
  OddThread(int num)
  {
    this.num=num;
  }
  public void run()
  {
    System.out.println("Odd Integer: "+num);
  
  try{
    Thread.sleep(1000);
  }
  catch(InterruptedException e)
  {
    System.out.println(e.getMessage());
  }
}
}




public class OddEvenThread
{
   public static void main(String[] args) 
    {
        IntegerThread ob=new IntegerThread();
        ob.start();
    }
  
}