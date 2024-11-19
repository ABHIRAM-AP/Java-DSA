package BroCode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JOptionEx {
  public static void main(String[]args)
  {
    // JOptionPane.showMessageDialog(null,"This is normal msg","title",JOptionPane.PLAIN_MESSAGE);
    // JOptionPane.showMessageDialog(null,"This is Info message","title",JOptionPane.INFORMATION_MESSAGE);
    // JOptionPane.showMessageDialog(null,"This is question msg","title",JOptionPane.QUESTION_MESSAGE);
    // JOptionPane.showMessageDialog(null,"This is warning msg","title",JOptionPane.WARNING_MESSAGE);
    // JOptionPane.showMessageDialog(null,"This is error msg","title",JOptionPane.ERROR_MESSAGE);

   
    int answer = JOptionPane.showConfirmDialog(null,"Do yo love?","title",JOptionPane.YES_NO_CANCEL_OPTION);
    // if(answer ==1 )
    // {
    //   System.out.println("No");
    // }
    // else if(answer ==0)
    // {
    //   System.out.println("Yes");
    // }
    // else if(answer ==2)
    // {
    // System.out.println("Scam ahne!!!");
    // }
    // else
    // {
    //   System.out.println("Nee irangi");
    // }


    JOptionPane.showOptionDialog(null,"You are so nice!!","Secret Msg",JOptionPane.YES_OPTION,JOptionPane.PLAIN_MESSAGE,null,null,0);
    
  }
}
