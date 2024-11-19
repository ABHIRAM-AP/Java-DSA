package BroCode;

import javax.swing.*;
import java.awt.*;

public class MyFirstPanel {
  public static void main(String[] args) {
      JFrame frame = new JFrame();
      JLabel label=new JLabel();

      label.setText("Red");
      label.setBounds(0,0,75,75);

      JPanel blue_panel = new JPanel();
      blue_panel.setBackground(Color.blue);
      blue_panel.setBounds(0,0,100,100);
      blue_panel.setLayout(null);
      

      JPanel red_panel = new JPanel();
      red_panel.setBackground(Color.red);
      red_panel.setBounds(100,0,100,100);
   red_panel.setLayout(null);

      JPanel green_panel = new JPanel();
    green_panel.setBackground(Color.green);
      green_panel.setBounds(0,100,200,200);
      green_panel.setLayout(null);
    


    frame.setVisible(true);
    frame.setSize(750,750);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(blue_panel);
    frame.add(red_panel);
    frame.add(green_panel);
    blue_panel.add(label);
  }
}
/*The error occurs because each JPanel defaults to using FlowLayout, which doesn’t honor the bounds set by setBounds(). When you add components to a JPanel without setting its layout to null, FlowLayout automatically places and sizes components according to its own rules, ignoring any explicit positions set with setBounds().*/ 