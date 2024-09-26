import java.util.*;

public class Inheritance {
  Scanner s=new Scanner(System.in);
  String name;
  int age=0;
  int []phoneNum=new int[10];
  String address;
  float salary=0.0f;

  public void ReadDetails()
  {
    System.out.println("Enter the name:");
    name=s.nextLine();
    System.out.println("Enter the age:");
    age=s.nextInt();
    s.nextLine();
    System.out.println("Enter phone number:");
    for(int i=0;i<10;i++)
    {
      phoneNum[i]=s.nextInt();
    }
    s.nextLine();
    System.out.println("Enter address:");
    address=s.nextLine();
    System.out.println("Enter salary:");
    salary=s.nextFloat();
    s.nextLine();
  }
  public void printSalary()
  {
    System.out.println("Salary is "+ salary);
  }
}
  class Officer extends Inheritance{
   Scanner s=new Scanner(System.in);
    String special,depart;
    public void OfficerDetails()
    {
      System.out.println("Enter your specialization:");
    special=s.nextLine();
    System.out.println("Enter your department:");
    depart=s.nextLine();
    ReadDetails();
    }
  
  }
  class Manager extends Inheritance{
    
    String special,depart;
    public void ManagerDetails()
    {
    System.out.println("Enter your specialization:");
    special=s.nextLine();
    System.out.println("Enter your department:");
    depart=s.nextLine();
    ReadDetails();
    }
  }

   class Main
  {
    public static void main(String[] args) {
      Officer ob=new Officer();
      ob.OfficerDetails();
      Manager m=new Manager();
      m.ManagerDetails();

      ob.printSalary();
      m.printSalary();
    }
  }

