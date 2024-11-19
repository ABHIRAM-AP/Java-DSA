package College;

import java.util.*;


class EmployeeDetails
{
  String name,phoneNum,address;
  int age,salary;

  EmployeeDetails(String name,int age,int salary,String phoneNum,String address)
  {
    this.name=name;
    this.age=age;
    this.salary=salary;
    this.phoneNum=phoneNum;
    this.address=address;
  }
  public void printSalary()
  {
    System.out.println("Salary is "+salary);
  }
  public void display()
  {
    System.out.println("Details are:\n");
    System.out.println("Name: "+name+" Age: "+age+" Salary: "+salary+" PhoneNumber: "+phoneNum+" Address: "+address);
    
  }
}

class Officer extends EmployeeDetails{
  String specialisation;
  Officer(String name,int age,int salary,String phoneNum,String address,String s)
  {
    super(name,age,salary,phoneNum,address);
    this.specialisation=s;
  }
  public void display()
  {
    super.display();
    System.out.print("Specialisation: "+specialisation);
  }
} 


class Manager extends EmployeeDetails
{
  String department;
  
  Manager(String name,int age,int salary,String phoneNum,String address,String d)
  {
    super(name,age,salary,phoneNum,address);
    this.department=d;
  }
  public void display()
  {
    super.display();
    System.out.print("Department: "+department);
  }
}



public class Inheritance {
    public static void main(String[] args) {
      String name,phoneNum,address;
      int age,salary;
      Scanner s=new Scanner(System.in);

      System.out.println("Enter name of Officer:");
      name=s.nextLine();
      System.out.println("Enter age of officer:");
      age=s.nextInt();
      s.nextLine();
      System.out.println("Enter salary of officer:");
      salary=s.nextInt();
      s.nextLine();
      System.out.println("Enter phone number of officer:");
      phoneNum=s.nextLine();
      System.out.println("Enter address of offcier:");
      address=s.nextLine();

      System.out.println("Enter specialisation of officer:");
      String specialisation=s.nextLine();

      Officer ob=new Officer(name,age,salary,phoneNum,address,specialisation);
      ob.display();


      //////////////////////////////
      
      System.out.println("Enter name of Manager:");
      name=s.nextLine();
      System.out.println("Enter age of Manager:");
      age=s.nextInt();
      s.nextLine();
      System.out.println("Enter salary of Manager:");
      salary=s.nextInt();
      s.nextLine();
      System.out.println("Enter phone number of Manager:");
      phoneNum=s.nextLine();
      System.out.println("Enter address of Manager:");
      address=s.nextLine();

      System.out.println("Enter department of Manager:");
      String department=s.nextLine();

      Manager ob1=new Manager(name,age,salary,phoneNum,address,department);
      ob1.display();
      s.close();


    }  
}
