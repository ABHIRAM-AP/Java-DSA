package College;
import java.util.*;

class Calculator{
  int m,n;
  Calculator(int a,int b)
  {
    m=a;
    n=b;
  }
  public void Add()
  {
    int sum=0;
    try{
      if(m<0 || n<0)
      throw new ArithmeticException();
      sum=m+n;
      System.out.println("Sum= "+sum);
    }
    catch(ArithmeticException e)
    {
      System.out.println("Negative Numbers Cannot be added");
    }
  }

  public void Subtract()
  {
    int diff=0;
    try{
      if(m<0 || n<0)
      throw new ArithmeticException();
      diff=m-n;
      System.out.println("Difference= "+diff);
    }
    catch(ArithmeticException e)
    {
      System.out.println("Negative Numbers Cannot be subtracted");
    }
  }
  public void Mul()throws ArithmeticException
  {
    if(m==0 || n==0)
    {
      throw new ArithmeticException("Number is 0");
    }
    System.out.println("Product= "+(m*n));
  }

  public void Div()throws ArithmeticException
  {
    if(m==0 || n==0)
    {
      throw new ArithmeticException("Number is 0");
    }
    System.out.println("Quotient= "+(m/n));
  }
}

public class CalculatorExcep {
  public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
    int a=0,b=0,option=0;
    while(option!=5)
    {
      System.out.println("1-Add\t2-Sub\t3-Product\t4-Div\t5-Exit:");
      option=s.nextInt();
      s.nextLine();

      try{
        System.out.println("Enter first number:");
        String a1=s.nextLine();
        System.out.println("Enter second number:");
        String b1=s.nextLine();
        if(a1.contains(".") ||b1.contains("."))
        {
          throw new InputMismatchException("Input isn't an Integer");
        }
        a=Integer.parseInt(a1);
        b=Integer.parseInt(b1);

        switch(option)
        {
          case 1:
          Calculator ob1=new Calculator(a,b);
          ob1.Add();
          break;

          case 2:
          Calculator ob2=new Calculator(a,b);
          ob2.Subtract();
          break;

          case 3:
          Calculator ob3=new Calculator(a,b);
          ob3.Mul();
          break;

          case 4:
          Calculator ob4=new Calculator(a,b);
          ob4.Div();
          break;

          case 5:
          System.exit(0);
          break;

          default:
          System.out.println("Invalid option");
          break;
        }
      }
  catch(ArithmeticException e)
  {
    System.out.println("Number is Zero");
  }
      catch(InputMismatchException e)
      {
        System.out.println(e);
      }
      catch(NumberFormatException e)
      {
        System.out.println(e);
      }
      catch(Exception e)
      {
        System.out.println("Handled");
      }
      finally{
        System.out.println("Inside Finally");
        s.close();
      }
    }
    
  }
}
