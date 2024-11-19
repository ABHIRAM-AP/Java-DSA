import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLight extends JPanel implements ActionListener {
  private JRadioButton r1, r2, r3;
  private Color red_c, yellow_c, green_c;

  public TrafficLight() {
    setLayout(null);
    setBounds(0, 0, 640, 480);

    // Initialize radio buttons
    r1 = new JRadioButton("Red");
    r2 = new JRadioButton("Yellow");
    r3 = new JRadioButton("Green");

    // Set default light color
    r1.setSelected(true);
    red_c = Color.red;
    yellow_c = getBackground();
    green_c = getBackground();

    // Group radio buttons
    ButtonGroup group = new ButtonGroup();
    group.add(r1);
    group.add(r2);
    group.add(r3);

    // Set button positions
    r1.setBounds(100, 50, 80, 30);
    r2.setBounds(100, 130, 80, 30);
    r3.setBounds(100, 210, 80, 30);

    // Add buttons to panel
    add(r1);
    add(r2);
    add(r3);

    // Add action listeners
    r1.addActionListener(this);
    r2.addActionListener(this);
    r3.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    // Change light colors based on selection
    if (r1.isSelected()) {
      red_c = Color.red;
      yellow_c = getBackground();
      green_c = getBackground();
    } else if (r2.isSelected()) {
      red_c = getBackground();
      yellow_c = Color.yellow;
      green_c = getBackground();
    } else if (r3.isSelected()) {
      red_c = getBackground();
      yellow_c = getBackground();
      green_c = Color.green;
    }
    repaint();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Draw circles for the lights
    g.drawOval(30, 50, 60, 60);
    g.drawOval(30, 130, 60, 60);
    g.drawOval(30, 210, 60, 60);

    // Fill circles with respective colors
    g.setColor(red_c);
    g.fillOval(30, 50, 60, 60);
    g.setColor(yellow_c);
    g.fillOval(30, 130, 60, 60);
    g.setColor(green_c);
    g.fillOval(30, 210, 60, 60);
  }
}

public class Traffic {
  public static void main(String[] args) {
    JFrame f = new JFrame("Traffic Light Simulation");
    f.setSize(300, 400);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocationRelativeTo(null);

    TrafficLight t = new TrafficLight();
    f.add(t);

    f.setVisible(true);
  }
}
