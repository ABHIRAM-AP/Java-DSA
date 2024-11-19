package BroCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutEx {
  public static void main(String[] args) {
    JFrame frame = new JFrame();


    frame.setLayout(new GridLayout(3,3,20,20)); 
    frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    frame.add(new JButton("1"));
    frame.add(new JButton("2"));
    frame.add(new JButton("3"));
    frame.add(new JButton("4"));
    frame.add(new JButton("5"));
    frame.add(new JButton("6"));
    frame.add(new JButton("7"));
    frame.add(new JButton("8"));
    frame.add(new JButton("9"));


    frame.setVisible(true);
  }
}
