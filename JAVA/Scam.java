
class AgeRestrictionException extends Exception {
  public AgeRestrictionException(String message) {
      super(message);
  }
}


class Person {
  private int age;

  // Constructor
  public Person(int age) throws AgeRestrictionException {
      if (age < 18) {
          throw new AgeRestrictionException("Age must be 18 or older. Provided age: " + age);
      }
      this.age = age;
  }

  // Getter for age
  public int getAge() {
      return age;
  }
}






public class Scam {
  public static void main(String[] args) {
      try {
          Person person1 = new Person(20); // Valid age
          System.out.println("Person 1 age: " + person1.getAge());

          Person person2 = new Person(16); // Invalid age, should throw exception
          System.out.println("Person 2 age: " + person2.getAge());
      } catch (AgeRestrictionException e) {
          System.out.println("Exception: " + e.getMessage());
      }
  }
}
