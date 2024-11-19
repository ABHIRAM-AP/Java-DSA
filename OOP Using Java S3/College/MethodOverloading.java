package College;
import java.util.*;

class Overloading
{
  public  void Area(float b,float h)
  {
    System.out.println("Area of Triangle: "+(b*h*0.5));
  }
  public  void Area(int l,int b)
  {
    System.out.println("Area of Rectangle: "+(l*b));
  }
  public  void Area(float radius)
  {
    final double PI=3.14;
    System.out.println("Area of Circle: "+(PI * radius*radius));
  }
  public  void Area(int side)
  {
    System.out.println("Area of Square:"+(side *side));
  }
}

public class MethodOverloading {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Overloading ob=new Overloading();
    int option=0;
    while(option!=5)
    {
    System.out.println("1-Triangle\t2-Rectangle\t3-Circle\t4-Square\t5-Exit:");
     option=s.nextInt();

     switch(option)
     {
        case 1:
        System.out.println("Enter base and height:");
        float base=s.nextFloat();
        float height=s.nextFloat();
        ob.Area(base,height);
        break;

        case 2:
        System.out.println("Enter length & width");
        int l=s.nextInt();
        int w=s.nextInt();
        ob.Area(l,w);
        break;

        case 3:
        System.out.println("Enter radius:");
     float radius=s.nextFloat();
        ob.Area(radius);
        break;

        case 4:
        System.out.println("Enter side of square");
       int side=s.nextInt();
       ob.Area(side);
        break;

        case 5:
        System.exit(0);
        break;
     }
    }
  }
}
