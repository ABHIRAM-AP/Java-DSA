import java.util.Scanner;

class IF{
  public static void main(String args[]){
    int age;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age:");
    age = scanner.nextInt();
    
    if(age<18){
      System.out.println("You are not elgibile for vote");
    }
    else if(age == 17){
      System.out.println("You are close!");
    }
    else{
      System.out.println("You are eligible");
    }
    scanner.close();
  }
}