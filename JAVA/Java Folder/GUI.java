
import javax.swing.JOptionPane;

class GUI{
  public static void main(String args[]){
    String name = JOptionPane.showInputDialog("Enter your name:");
    //JOptionPane.showMessageDialog(null,"Hello "+name);
    int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age:")) ;
JOptionPane.showMessageDialog(null,"Hello "+name+ "\nYou are "+age+ " years old");
double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
JOptionPane.showMessageDialog(null,"Your height is "+height+ " ft");
  }
}