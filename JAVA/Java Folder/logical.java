import java.util.Scanner;
class Logical{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
   /*  double temperature;
    
    System.out.println("Enter the temperature:");
    temperature = scanner.nextDouble();
    if(temperature>=30){
      System.out.println("It is hot outside!!!!");
    }
    else if(temperature>=20 && temperature<30){
      System.out.println("It is warm outside!");
    }
    else{
      System.out.println("It is cold outside");
    }
    */

    System.out.println("You are playing a game => Press Q or q to quit");
    String quitOption = scanner.nextLine();
    if(quitOption.equals("q") || quitOption.equals("Q")){ 
       
      System.out.println("You quit the game");
    }
    else{
      System.out.println("You are still playing the game");
    }
    scanner.close();
  }
}
/*  if(!quitOption.equals("q") && !quitOption.equals("Q")) => for LOGICAL NOT OPERATOR
{
 System.out.println("You are still playing the game");
}
 else{
 System.out.println("You quit the game");
 }
*/