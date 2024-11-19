import javax.swing.*;
import java.awt.GridLayout;

public class First {
  public static void main(String[] args) {
    A ob = new A();
  }
}

class A extends JFrame {
  public A() {
    // Set GridLayout with 2 rows and 1 column
    setLayout(new GridLayout(2, 1));

    JLabel l = new JLabel("Hello World");
    JLabel l1 = new JLabel("My name is Abhiram");

    add(l);
    add(l1);
    setLayout(new GridLayout(1, 1));
    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
