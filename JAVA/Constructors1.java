import java.util.*;

class Employee
{
    String name;
    int age=0;
    double salary=0.0;
    
    public Employee() {
        name = "unknown";
        age = 0;
        salary = 0.0;
        }
     public Employee(String name,int age)
    {
        this.name =name;
        this.age=age;
        this.salary=0.0;
    }
  public Employee(String name,int age,double salary)
    {
        this.name =name;
        this.age=age;
        this.salary=salary;
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
    
    public static void main(String[]args)
    {
        String name;
        int age=0;
        double salary=0;
        Scanner s=new Scanner(System.in);
            Employee e1=new Employee();
            e1.display();
            
        System.out.println("Enter the name:");
        name=s.nextLine();
        System.out.println("Enter the age");
        age=s.nextInt();
        s.nextLine();
     Employee e2=new Employee(name,age);
        e2.display();
        
        System.out.println("Enter the name:");
        name=s.nextLine();
        System.out.println("Enter the age");
        age=s.nextInt();
        s.nextLine();
        System.out.println("Enter the salary:");
        salary=s.nextDouble();
        s.nextLine();
         Employee e3=new Employee(name,age,salary);
        e3.display();
    }
}
