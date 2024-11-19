package College;

abstract class Shapes
{
  abstract void numberOfSides();
}

class Rectangle extends Shapes
{
  void numberOfSides()
  {
    System.out.println("Sides=4");
  }
}
class Triangle extends Shapes{
  void numberOfSides()
  {
    System.out.println("Sides = 3");
  }
}
class Hexagon extends Shapes{
  void numberOfSides()
  {
    System.out.println("Sides =6");
  }
}


public class Abstact{
  public static void main(String[]args)
  {
    Rectangle r=new Rectangle();
    r.numberOfSides();
    Triangle t=new Triangle();
    t.numberOfSides();
    Hexagon h=new Hexagon();
    h.numberOfSides();
  }
}