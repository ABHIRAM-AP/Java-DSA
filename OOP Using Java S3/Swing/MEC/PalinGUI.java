package MEC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalinGUI {
  public static void main(String[]args)
  {
      new Palin();
  }
}

class Palin extends JFrame implements ActionListener{
    JTextField t1;
    JButton submit;
  Palin()
  {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,200);
      setLayout(new FlowLayout());

    t1=new JTextField("Enter a String");
    t1.setPreferredSize(new Dimension(250,40));
     submit=new JButton("Submit");
     submit.setPreferredSize(new Dimension(100,30));
     submit.addActionListener(this);
    
    add(t1);
     add(submit);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    String text="",rev="";
    if(e.getSource() == submit )
    {
      text=t1.getText();
      for(int i=text.length()-1;i>=0;i--)
      {
        rev=rev+text.charAt(i);
      }
      if(text.equalsIgnoreCase(rev))
      {
        JOptionPane.showMessageDialog(null, "Palindrome");
      }
      else{
        JOptionPane.showMessageDialog(null, "Not Palindrome");
      }
    }
  }
}
