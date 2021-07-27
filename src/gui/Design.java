package gui;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author VIPIN KUMAR
 */
public class Design
{
     JFrame frame=new JFrame();
     
     JPanel panel1=new JPanel();
     JPanel panel2=new JPanel();
     JPanel panel3=new JPanel();
     JPanel panel4=new JPanel();
     JPanel panel5=new JPanel();
     
     JLabel label=new JLabel();
     
     ImageIcon image;
     
  public Design()
  {
     
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame .setSize(270,380);
        frame.setLayout(new BorderLayout());
        frame.setTitle("Calculator");
        frame.setLocation(600,220);
        frame.setResizable(false);
        
        image=new ImageIcon("Logo.png");
        frame.setIconImage(image.getImage());
        
        label.setText("@Vipin Kumar");
        label.setForeground(Color.BLACK);
        label.setVerticalAlignment(JLabel.EAST);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.BLUE);
        
        panel1.setPreferredSize(new Dimension(17,17));
        panel2.setPreferredSize(new Dimension(10,10));
        panel3.setPreferredSize(new Dimension(10,10));
        panel4.setPreferredSize(new Dimension(20,25));
        panel5.setPreferredSize(new Dimension(100,100));
        
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);
       
        
        
        
  }
  
}
