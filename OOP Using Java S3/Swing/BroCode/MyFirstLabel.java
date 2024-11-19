package BroCode;

import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class MyFirstLabel
{
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    Border border = BorderFactory.createLineBorder(Color.yellow,7); // creates Border


    label.setText("Hello World!"); //set text of label
    label.setHorizontalTextPosition(SwingConstants.CENTER);  // aligns wrt to icon
    label.setVerticalTextPosition(SwingConstants.TOP);    // aligns wrt to icon

    label.setForeground(Color.blue);
    label.setBackground(Color.green);
    label.setOpaque(true);
    label.setFont(new Font("Arial",Font.BOLD,20));  //sets font styling
    label.setBorder(border);

    label.setHorizontalAlignment(JLabel.CENTER);
    label.setVerticalAlignment(JLabel.TOP);
    label.setBounds(10,30,250,250);




    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setLayout(null);
    frame.setSize(500,500);
    frame.add(label);
    //frame.pack();  // adjusts or fits all the components. have to hide setLayout,setSize,setBounds
  }
}