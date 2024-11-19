import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login {
  public static void main(String[]args)
  {
    new LoginSample();

  }
}

class LoginSample extends JFrame implements ActionListener
{
  JPanel panel;
  JLabel username,password;
  JTextField user_field,pass_field;
  JButton submit;
  
  LoginSample()
  {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,500);
    setLayout(new FlowLayout());

    panel=new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    username=new JLabel("Enter Username");
    user_field = new JTextField();
    user_field.setPreferredSize(new Dimension(100,20));

    password=new JLabel("\nEnter Password");
    pass_field=new JTextField();
    pass_field.setPreferredSize(new Dimension(100,20));

    submit=new JButton("Submit");
    submit.addActionListener(this);

    panel.add(username);
    panel.add(user_field);
    panel.add(password);
    
    panel.add(pass_field);
    panel.add(submit);


    add(panel);
    setVisible(true);
    

  }


  public void actionPerformed(ActionEvent e)
  {
    String name;
  name= user_field.getText();
    if(e.getSource() == submit)
    {
      JOptionPane.showMessageDialog(null,"Access Granted");
      JOptionPane.showMessageDialog(null,"Welcome "+name);
    }
  }
}
