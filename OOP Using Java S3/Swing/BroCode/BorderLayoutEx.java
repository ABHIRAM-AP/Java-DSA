package BroCode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BorderLayoutEx {
  public static void main(String[] args) {
    JFrame frame = new JFrame();


    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    frame.setSize(500,500);
    frame.setLayout(new BorderLayout(10,10));
    

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();

    panel1.setBackground(Color.red);
    panel2.setBackground(Color.green);
    panel3.setBackground(Color.yellow);
    panel4.setBackground(Color.magenta);
    panel5.setBackground(Color.blue);

    panel6.setBackground(Color.PINK);
    panel7.setBackground(Color.ORANGE);

    panel5.setLayout(new BorderLayout());
    panel5.add(panel6,BorderLayout.SOUTH);
    panel5.add(panel7,BorderLayout.NORTH);

    frame.add(panel1,BorderLayout.NORTH);
    frame.add(panel2,BorderLayout.EAST);
    frame.add(panel3,BorderLayout.WEST);
    frame.add(panel4,BorderLayout.SOUTH);
    frame.add(panel5,BorderLayout.CENTER);


  }
}
