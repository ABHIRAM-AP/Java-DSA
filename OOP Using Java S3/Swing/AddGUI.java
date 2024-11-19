import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddGUI {
      public static void main(String[] args) {
        Add ob=new Add();
      }
}

class Add extends JFrame  
{
  JTextField t1,t2;
  JLabel l;
  JButton b;
  public Add()
  {

     t1=new JTextField(20);
     t2=new JTextField(20);
     l= new JLabel("Result");
     b=new JButton("OK");

    add(t1);
    add(t2);
    add(b);
    add(l);

    b.addActionListener(ae ->{
      String a=t1.getText();
      String b=t2.getText();
      int num1=Integer.parseInt(a);
      int num2=Integer.parseInt(b);
    
      int sum=num1+num2;
    
      l.setText(Integer.toString(sum));
    });
    setLayout(new GridLayout(4, 1, 5, 5));
  setVisible(true);
  setSize(400,400);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  /*public void actionPerformed(ActionEvent e)
  {
    String a=t1.getText();
    String b=t2.getText();
    int num1=Integer.parseInt(a);
    int num2=Integer.parseInt(b);

    int sum=num1+num2;

    l.setText(Integer.toString(sum));
  }*/
}

// if we are using lambda then no need to implement ActionListener or related things

