import java.util.*;

class Calculator
{
    int m,n;
    Calculator(int a,int b)
    {
        m=a;
        n=b;
    }
    public void Add()
    {
        int add=0;
        try
        {
            if(m<0 || n<0) throw new ArithmeticException();
            add=m+n;
            System.out.println("Addition: "+add);
        }
        catch(ArithmeticException e)
        {
          System.out.println("Can't added\n");
        }
    }
    void Subtract()
    {
  int sub=0;
  try{
    if(m<0 || n<0) throw new ArithmeticException();
    {
      sub=m-n;
      System.out.println("Subtraction :"+sub);
    }

  }
  catch(ArithmeticException e)
  {
    System.out.println("Can't Subtracted");
  }
    }
    void Multiply() throws ArithmeticException {
      if (m == 0 || n == 0) {
          throw new ArithmeticException("Number is 0");
      }
      System.out.println("Product: " + (m * n));
  }
  void Divide() throws ArithmeticException {
    if (m == 0 || n == 0) {
        throw new ArithmeticException("Number is 0");
    }
    System.out.println("Quotient: " + (m / n));
}
}

  public class Main
  {

    public static void main(String[] args) {
      int a=0,b=0;
      Scanner s=new Scanner(System.in);
      int option=0;
      while(option!=5)
      {
        System.out.println("1-Add\n2-Sub\n3-Pro\n4-Division\n5-Exit:");
        option=s.nextInt();
        s.nextLine();

        try{
          System.out.println("enter two numbers:");
          String a1=s.next();
          String b1=s.next();
          if(a1.equals("null") || b1.equals("null"))
          {
            throw new NullPointerException("Value is not initialised");
          }
          else if(a1.contains(".") || b1.contains("."))
          {
            throw new InputMismatchException("Input is not integer");
          }
          a=Integer.parseInt(a1);
           b=Integer.parseInt(b1);
           switch (option) {
            case 1:
            Calculator o1=new Calculator(a, b);
            o1.Add();
              break;
          
              case 2:
              Calculator o2=new Calculator(a, b);
              o2.Subtract();
                break;
  
                case 3:
                Calculator o3=new Calculator(a, b);
                o3.Multiply();
                  break;
  
                  case 4:
                  Calculator o4=new Calculator(a, b);
                  o4.Divide();
                    break;
                    default:
                    System.out.println("Wrong Option");
  
          }
        }
        catch(InputMismatchException e)
        {
          System.out.println("\n"+e);
          continue;
        }
        catch(NullPointerException e)
        {
          System.out.println("\n"+e);
          continue;
        }
        catch(NumberFormatException e)
        {
          System.out.println("Number cannot be converted to string"+e);
          continue;
        }
        catch(Exception e)
        {
          System.out.println("Error Occured");
        }
        finally
        {
          System.out.println("Inside finally");
        }


      }
    }
  }