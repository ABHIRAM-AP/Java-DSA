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
        System.out.println("Enter the number of employees:\n");
        int count=s.nextInt();
        s.nextLine();
        Employee e[]=new Employee[count];
        
        for(int i=0;i<count;i++)
        {
        System.out.println("Enter the name:");
        name=s.nextLine();
        System.out.println("Enter the age");
        age=s.nextInt();
        s.nextLine();
        System.out.println("Enter the salary:");
        salary=s.nextDouble();
        s.nextLine();
        e[i]=new Employee(name,age,salary);
        }
        System.out.println("\nEmployee details:");
        for (int i = 0; i < count; i++) {
         System.out.println("Details of Employee "+(i+1));
            e[i].display();
        }
    }
}
