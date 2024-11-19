import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc  {
  public static void main(String[] args) {
    CalcImplementer ob =new CalcImplementer();
  }
}
class CalcImplementer extends JFrame implements ActionListener
{
  JTextField t1,t2;
  JButton b1,b2;
  JLabel l;
  public CalcImplementer()
  {
    t1=new JTextField();
    t2=new JTextField();
    b1=new JButton("Add");
    b2=new JButton("Sub");
    l=new JLabel("Result");

    add(t1);
    add(t2);
    add(b1);
    add(b2);
    add(l);

    b1.addActionListener(this);
    b2.addActionListener(this);

    setLayout(new GridLayout(5, 1, 5, 5));
    setVisible(true);
    setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e)
  {
    try{
    String a=t1.getText();
    String b=t2.getText();
    int num1=Integer.parseInt(a);
    int num2=Integer.parseInt(b);
    if(e.getSource() == b1)
    {
      int sum=num1+num2;
      l.setText(Integer.toString(sum));
    }
    else if(e.getSource()==b2)
    {
      int diff=num1-num2;
      l.setText(Integer.toString(diff));
    }
  }
  catch(NumberFormatException ne)
  {
    System.out.println("Scam Akkathadey");
    l.setText("Fun Kudunnund");
  }
  
  }
}
