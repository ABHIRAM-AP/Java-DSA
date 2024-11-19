package College;



class AgeRestric extends Exception{
  AgeRestric(String message)
  {
    super(message);
  }
}

class Person
{
  int age;
  Person(int age)throws AgeRestric
  {
    this.age=age;
  
   if(age<18)
    {
      throw new AgeRestric("Age must be older than 18");
    }
    else
    {
      System.out.println("You are eligible");
    }
  }

  public int returnAge()
  {
    return age;
  }
}



public class UserExcep {
  public static void main(String[]args)
  {
      try{
        Person p1=new Person(18);
        System.out.println(p1.returnAge());

        Person p2=new Person(19);
        System.out.println(p2.returnAge());
      }
      catch(AgeRestric e)
      {
        System.out.println(e.getMessage());
      }
  }
}
