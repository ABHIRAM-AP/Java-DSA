package BroCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFirstButton {
  public static void main(String[]args)
  {
    new Button();
  }
}

class Button extends JFrame implements ActionListener
{
  JButton button ;
    Button()
    {
       button =new JButton();
      button.setBounds(100,100,250,100);
      button.setText("Click Me!");
      button.setFocusable(false);  //removes box around text
      button.setFont(new Font("poppins",Font.BOLD,25));
      button.setForeground(Color.orange);
      button.setBackground(Color.gray);
      button.setBorder(BorderFactory.createEtchedBorder());
      


     button.addActionListener(this);         //button.addActionListener(e ->    System.out.println("All is Wellll"));

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        add(button);
    }
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==button)
      {
        System.out.println("All is Wellll");
        button.setEnabled(false);  
      }
    }
}