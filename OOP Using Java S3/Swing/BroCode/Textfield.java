package BroCode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Textfield {
  public static void main(String[] args) {
    new Sample2();
  }
}

class Sample2 extends JFrame implements ActionListener{
  JTextField textfield;
  JButton button;
  Sample2()
  {
    textfield =new JTextField();
    textfield.setPreferredSize(new Dimension(250,40));
    textfield.setFont(new Font("sans-serif",Font.PLAIN,20));
    textfield.setForeground(Color.white);
    textfield.setBackground(Color.black);
    textfield.setText("Vallom type cheyy!!");

    button =new JButton("Submit");
    button.addActionListener(this);
    
   setSize(500,500);
    setLayout(new FlowLayout());
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(textfield);
    add(button);
   

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource ()== button)
    {
 String text=textfield.getText();
 if(text.equalsIgnoreCase("Vallom type cheyy!!"))
 {
  JOptionPane.showMessageDialog(null,"Ondakkalle!!!");
 }
 else
 JOptionPane.showMessageDialog(null,text);
    }
  }
}
