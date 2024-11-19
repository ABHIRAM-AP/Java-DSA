package College;

import java.util.Random;

class IntThread extends Thread{
  public void run()
  {     Random random=new Random();
    for(int i=1;i<=5;i++)
    {

     int num=random.nextInt(100);
      System.out.println("Random Number: "+num);

      SquareThread s=new SquareThread(num);
      s.start();

      CubeThread c=new CubeThread(num);
      c.start();

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


class SquareThread extends Thread
{
  int num=0;
  SquareThread(int num)
  {
    this.num=num;
  }
  public void run()
  {
    System.out.println("Square: "+(num*num));
  }
}

class CubeThread extends Thread
{
  int num=0;
  CubeThread(int num)
  {
    this.num=num;
  }
  public void run()
  {
    System.out.println("Cube: "+(num*num*num));

  }
}

public class Thread1 {
  public static void main(String[] args) {
    IntThread thread=new IntThread();
    thread.start();
  }
}
