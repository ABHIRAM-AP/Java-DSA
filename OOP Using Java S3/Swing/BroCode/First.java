package BroCode;

import javax.swing.*;
import java.awt.*;
public class First
{
  public static void main(String[] args) {
    JFrame frame=new JFrame();

    frame.setTitle("Sample"); //sets the title of frame
    frame.setResizable(false); //prevents resizing of frame
    frame.setSize(420,420); //sets x and y dimensions of frame
    frame.setVisible(true);  //sets the visibility of frame
    frame.getContentPane().setBackground(Color.red); //to set the bg color of frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}