package MEC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Radio {
  public static void main(String[]args)
  {
    new Main();
  }
}

class Main extends JFrame implements ActionListener
{
  JRadioButton r1,r2;
  JButton button;
  JTextField t1;
  //ButtonGroup group;
  Main()
  {
    setLayout(new FlowLayout());
    setSize(500,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      r1=new JRadioButton();
      r2=new JRadioButton();
      r1.setText("Bit 1");
      r1.addActionListener(this);

      r2.setText("Bit 0");
  r2.addActionListener(this);

        // group=new ButtonGroup();
        // group.add(r1);
        // group.add(r2);

      button=new JButton();
      button.setPreferredSize(new Dimension(80,20));
      button.setText("Click");
      button.addActionListener(this);

      t1=new JTextField();
      t1.setPreferredSize(new Dimension(300,20));
      
    
      add(r1);
      add(r2);
    add(button);
    add(t1);


    setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      if (r1.isSelected() && r2.isSelected()) {
        t1.setText("3");
      } else if (r1.isSelected()) {
        t1.setText("2");
      } else if (r2.isSelected()) {
        t1.setText("1");
      } else {
        t1.setText("0");
      }
    }
  }
}
