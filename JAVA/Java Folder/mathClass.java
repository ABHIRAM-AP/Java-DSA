import java.util.Scanner;
import javax.swing.JOptionPane;
class MathClass{
  public static void main(String args[]){
    /*double x=3.14;
    double y =400;
   double z=Math.floor(x);
   System.out.println(z);*/

   //Pythagoras theorem
   double base,altitude,hypotenuse;
  /*
  
   Scanner scanner= new Scanner(System.in);
   System.out.println("Enter base:");
   base= scanner.nextDouble();
   System.out.println("Enter altitude");
   altitude = scanner.nextDouble();
    hypotenuse = Math.sqrt( 
      (base*base) + (altitude*altitude) ) ;
    System.out.println("Hypotenuse = "+hypotenuse);
    scanner.close();
     */ 

    //Using GUI

    base = Double.parseDouble(JOptionPane.showInputDialog("Enter the Base:"));
    altitude = Double.parseDouble(JOptionPane.showInputDialog("Enter the Altitude:"));
    hypotenuse = Math.sqrt( 
      (base*base) + (altitude*altitude) );
      JOptionPane.showMessageDialog(null,"Hypotenuse= "+hypotenuse);
  }
}