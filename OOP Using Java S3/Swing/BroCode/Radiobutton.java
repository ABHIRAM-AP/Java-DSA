package BroCode;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Radiobutton {
    public static void main(String[] args) throws ClassNotFoundException {
      new Sampleradio();
   
    }
  }
  
  
  class Sampleradio extends JFrame implements ActionListener{
    JRadioButton dosa,idli,rice;
    ButtonGroup group;
    Sampleradio()
    {
      
      setSize(500,500);
      setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


      
      dosa=new JRadioButton();
      idli=new JRadioButton();
      rice=new JRadioButton();

      dosa.setText("Dosa");
      idli.setText("Idli");
      rice.setText("Rice");

      group=new ButtonGroup();
      group.add(dosa);
      group.add(idli);
      group.add(rice);
     
      dosa.addActionListener(this);
    idli.addActionListener(this);
      rice.addActionListener(this);
      
      add(dosa);
      add(idli);
      add(rice);
      
    
      setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource() ==dosa)
      {
        System.out.println("Dosa needed");
      }
      else if(e.getSource ()== idli)
      {
        System.out.println("Idli needed");
      }
      else if(e.getSource ()== rice) System.out.println("Rice Needed");

      else System.out.println("Thanks");
    }
  }
