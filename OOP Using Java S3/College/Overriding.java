package College;



class Employee
{
  void display()
  {
    System.out.println("Employee");
  }
  void disSalary(int salary)
  {
    System.out.println("Salary = "+salary);
  }
}

class Engineer extends Employee{
  
  void display()
  {
   // super.display();
    System.out.println("Engineer");
  }
  void disSalary(int salary)
  {
   // super.disSalary(20000);
    System.out.println("Salary = "+salary);
  }
}

public class Overriding
{
  public static void main(String[]args)
  { 
  
      Employee e =new Engineer();
      e.display();
      e.disSalary(2000);

  }
}