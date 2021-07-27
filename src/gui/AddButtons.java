package gui;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author VIPIN KUMAR
 */
public class AddButtons extends Design
{
    JButton btn1=new JButton("1");
    JButton btn2=new JButton("2");
    JButton btn3=new JButton("3");
    JButton btn4=new JButton("4");
    JButton btn5=new JButton("5");
    JButton btn6=new JButton("6");
    JButton btn7=new JButton("7");
    JButton btn8=new JButton("8");
    JButton btn9=new JButton("9");
    JButton btnZero=new JButton("0");
    JButton btnDot=new JButton(".");
    
    JButton btnPlus=new JButton("+");
    JButton btnMin=new JButton("-");
    JButton btnMul=new JButton("*");
    JButton btnDiv=new JButton("/");
    
    JButton btnClr=new JButton("Clr");
    JButton btnBck=new JButton("Back");
    JButton btnEq=new JButton("=");
    
    JButton btnPer=new JButton("%");
    JButton btnSqr=new JButton("X²");//Alt+0178
    JButton btnRoot=new JButton("√");//Alt+251
    JButton btnPow=new JButton("X^n");
    
    JTextField textField=new JTextField(15);
    
    
   AddButtons()
   {
       btn1.setFocusable(false);btn1.setBackground(Color.lightGray);
       btn2.setFocusable(false);btn2.setBackground(Color.lightGray);
       btn3.setFocusable(false);btn3.setBackground(Color.lightGray);
       btn4.setFocusable(false);btn4.setBackground(Color.lightGray);
       btn5.setFocusable(false);btn5.setBackground(Color.lightGray);
       btn6.setFocusable(false);btn6.setBackground(Color.lightGray);
       btn7.setFocusable(false);btn7.setBackground(Color.lightGray);
       btn8.setFocusable(false);btn8.setBackground(Color.lightGray);
       btn9.setFocusable(false);btn9.setBackground(Color.lightGray);
       btnDot.setFocusable(false);btnDot.setFont(new Font("Badoni MT",Font.BOLD,25));btnDot.setBackground(Color.lightGray);
       btnZero.setFocusable(false);btnZero.setBackground(Color.lightGray);
       btnPlus.setFocusable(false);btnPlus.setBackground(Color.lightGray);
       btnMin.setFocusable(false);btnMin.setFont(new Font("Badoni MT",Font.BOLD,22));btnMin.setBackground(Color.lightGray);
       btnMul.setFocusable(false);btnMul.setFont(new Font("Badoni MT",Font.BOLD,25));btnMul.setBackground(Color.lightGray);
       btnDiv.setFocusable(false);btnDiv.setFont(new Font("Badoni MT",Font.BOLD,16));btnDiv.setBackground(Color.lightGray);
       btnClr.setFocusable(false);btnClr.setBackground(Color.lightGray);
       btnBck.setFocusable(false);btnBck.setBackground(Color.lightGray);
       btnEq.setFocusable(false);btnEq.setBackground(Color.lightGray);
       
       btnPer.setFocusable(false);btnPer.setBackground(Color.lightGray);
       btnSqr.setFocusable(false);btnSqr.setBackground(Color.lightGray);
       btnRoot.setFocusable(false);btnRoot.setBackground(Color.lightGray);
       btnPow.setFocusable(false);btnPow.setBackground(Color.lightGray);
       
       textField.setHorizontalAlignment(JTextField.RIGHT);
       textField.setFont(new Font("Badoni MT",Font.BOLD,20));
       textField.setForeground(Color.black);
//................................................................................................

       textField.setBounds(10,5,215,35);

       btnClr.setBounds(10,60,50,35);
       btnBck.setBounds(175,60,50,35);
       
       btnPer.setBounds(10,100,50,35);
       btnSqr.setBounds(65,100,50,35);
       btnRoot.setBounds(120,100,50,35);
       btnPow.setBounds(175,100,50,35);
       
       
       btn7.setBounds(10,140,50,35);
       btn8.setBounds(65,140,50,35);
       btn9.setBounds(120,140,50,35);
       btnDiv.setBounds(175,140,50,35);
       
       btn4.setBounds(10,180,50,35);
       btn5.setBounds(65,180,50,35);
       btn6.setBounds(120,180,50,35);
       btnMul.setBounds(175,180,50,35);
       
       btn1.setBounds(10,220,50,35);
       btn2.setBounds(65,220,50,35);
       btn3.setBounds(120,220,50,35);
       btnMin.setBounds(175,220,50,35);
       
       btnZero.setBounds(10,260,50,35);
       btnDot.setBounds(65,260,50,35);
       btnEq.setBounds(120,260,50,35);
       btnPlus.setBounds(175,260,50,35);
       
 //--------------------------------------------------------------------------------------
 
       textField.setBorder(BorderFactory.createRaisedSoftBevelBorder());
 
       btnClr.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btnBck.setBorder(BorderFactory.createRaisedSoftBevelBorder());
 
       btnPer.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btnSqr.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btnRoot.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btnPow.setBorder(BorderFactory.createRaisedSoftBevelBorder());
 
       btn7.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btn8.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btn9.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btnDiv.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       
       btn4.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btn5.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btn6.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btnMul.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       
       btn1.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btn2.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btn3.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btnMin.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       
       btnZero.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btnDot.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btnEq.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       btnPlus.setBorder(BorderFactory.createRaisedSoftBevelBorder());
       
//........................................................................................
       
        panel4.add(label);

       panel5.add(textField);
       panel5.setLayout(null);
       panel5.add(btnClr);
       panel5.add(btnBck);
       
       panel5.add(btnPer);
       panel5.add(btnSqr);
       panel5.add(btnRoot);
       panel5.add(btnPow);
       
       panel5.add(btn7);
       panel5.add(btn8);
       panel5.add(btn9);
       panel5.add(btnDiv);
       
       panel5.add(btn4);
       panel5.add(btn5);
       panel5.add(btn6);
       panel5.add(btnMul);
       
       panel5.add(btn1);
       panel5.add(btn2);
       panel5.add(btn3);
       panel5.add(btnMin);
       
       panel5.add(btnZero);
       panel5.add(btnDot);
       panel5.add(btnEq);
       panel5.add(btnPlus);
       
       
       
//------------------------------------------------------------------------------
       
   }
    
}
