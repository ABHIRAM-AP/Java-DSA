package BroCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheckboxEx {
  public static void main(String[] args) {
    new Sample();
  }
}

class Sample extends JFrame implements ActionListener{
  JCheckBox checkbox;
  JButton button;
  Sample()
  {
    checkbox = new JCheckBox();
    button = new JButton();
    button.setText("Submit");
    button.addActionListener(this);
    button.setFocusable(false);

    checkbox.setText("I am not a Robot!!");
    checkbox.setFocusable(false);
    checkbox.setFont(new Font("Arial",Font.BOLD,30));
   


    setSize(500,500);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    add(checkbox);
    add(button);
   
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource() == button)
    {
      System.out.println(checkbox.isSelected());

    }
  }

}