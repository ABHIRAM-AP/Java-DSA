import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scanner.nextLine();

    System.out.println("How old are you?");
    int age = scanner.nextInt();
    scanner.nextLine();
    
    System.out.println("What is your favourite food?");
    String favFood=scanner.nextLine();

    System.out.println("Good Evening " +name);
    System.out.println("You are "+age+" years old");
    System.out.println("Your favourite food is " +favFood);
    scanner.close();
  }
}