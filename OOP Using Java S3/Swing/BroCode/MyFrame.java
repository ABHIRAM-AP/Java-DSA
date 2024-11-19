package BroCode;

import javax.swing.*;
import java.awt.*;

class A extends JFrame{
  A()
  {
    setTitle("Sample"); //sets the title of frame
    setResizable(false); //prevents resizing of frame
    setSize(420,420); //sets x and y dimensions of frame
    setVisible(true);  //sets the visibility of frame
    getContentPane().setBackground(Color.red); //to set the bg color of frame
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}


public class MyFrame {
  public static void main(String[] args) {
    A ob1=new A();
  }
}
