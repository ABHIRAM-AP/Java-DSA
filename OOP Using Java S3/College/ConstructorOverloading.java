package College;



class Employee{
  String name="";
    int age=0;
    double salary=0;
    Employee()
    {
      this.name="unknown";
      this.age=0;
      this.salary=0;
    }
    Employee(String name,int age)
    {
      this.name=name;
      this.age=age;
      this.salary=0;
    }
    Employee(String name,int age,double salary)
    {
      this.name=name;
      this.age=age;
      this.salary=salary;
    }
    public void display()
    {
      System.out.println("Name: "+name+"\tAge: "+age+"\tSalary: "+salary);
    }
}
public class ConstructorOverloading {
  public static void main(String[]args)
  {
    


    Employee ob1=new Employee();
    ob1.display();

    Employee ob2=new Employee("Abhiram",19);
    ob2.display();

    Employee ob3=new Employee("Aarav",25,3000);
    ob3.display();
    
  }
}
