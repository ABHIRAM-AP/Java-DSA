import java.util.Scanner;
class whileLoop{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    String name = "";
  /*   while(name.isBlank()){
      System.out.print("Enter your name:");
      name = scanner.nextLine();
    }
      */
   
   /*    do{
      System.out.print("Enter your name:");
      name = scanner.nextLine();
    }
    while(name.isBlank());

    System.out.println("Hello "+name);
    */
    for(int i=1;i<=10;i++){
      System.out.println(i);
    }
    scanner.close();
  }
  
}