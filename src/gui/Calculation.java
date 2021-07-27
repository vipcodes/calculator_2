 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author VIPIN KUMAR
 */
public class Calculation extends AddButtons implements ActionListener
{
    double val1,val2,result;
    String operation;
    
    public void calculation()
    {
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnZero.addActionListener(this);
        btnDot.addActionListener(this);
        
        btnPlus.addActionListener(this);
        btnMin.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);
        
        btnPer.addActionListener(this);
        btnSqr.addActionListener(this);
        btnRoot.addActionListener(this);
        btnPow.addActionListener(this);

       
        btnBck.addActionListener(this);
        btnEq.addActionListener(this);
        btnClr.addActionListener(this);
        
        
        
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
     
    //--------------------------------------------------------------------------
        if(e.getSource()==btnClr)
        {
          textField.setText(null);
        }
        
        else if(e.getSource()==btnBck)
        {
            String s=textField.getText();
            s=s.substring(0,s.length()-1);
            textField.setText(s);
        }
    //--------------------------------------------------------------------------
        
        else if(e.getSource()==btn1)
        {
          String num=textField.getText()+btn1.getText();
          textField.setText(num);
        }
        else if(e.getSource()==btn2)
        {
          String num=textField.getText()+btn2.getText();
          textField.setText(num);
        }
        else if(e.getSource()==btn3)
        {
          String num=textField.getText()+btn3.getText();
          textField.setText(num);
        }
        else if(e.getSource()==btn4)
        {
          String num=textField.getText()+btn4.getText();
          textField.setText(num);
        }
        else if(e.getSource()==btn5)
        {
          String num=textField.getText()+btn5.getText();
          textField.setText(num);
        }
        else if(e.getSource()==btn6)
        {
          String num=textField.getText()+btn6.getText();
          textField.setText(num);
        }
        else if(e.getSource()==btn7)
        {
          String num=textField.getText()+btn7.getText();
          textField.setText(num);
        }
        else if(e.getSource()==btn8)
        {
          String num=textField.getText()+btn8.getText();
          textField.setText(num);
        }
        else if(e.getSource()==btn9)
        {
          String num=textField.getText()+btn9.getText();
          textField.setText(num);
        }
        else if(e.getSource()==btnZero)
        {
          String num=textField.getText()+btnZero.getText();
          textField.setText(num);
        }
        else if(e.getSource()==btnDot)
        {
          String num=textField.getText()+btnDot.getText();
          textField.setText(num);
        }
          
    //--------------------------------------------------------------------------  
    
        else if(e.getSource()==btnPlus)
        {
          val1=Double.valueOf(textField.getText());
          textField.setText("");
          operation="+";
        }
        else if(e.getSource()==btnMin)
        {
          val1=Double.valueOf(textField.getText());
          textField.setText("");
          operation="-";
        }
        else if(e.getSource()==btnMul)
        {
          val1=Double.valueOf(textField.getText());
          textField.setText("");
          operation="*";
        }
        else if(e.getSource()==btnDiv)
        {
          val1=Double.valueOf(textField.getText());
          textField.setText("");
          operation="/";
        }
        
               
        
        else if(e.getSource()==btnSqr)
        {
          val1=Double.valueOf(textField.getText());
          result=Math.pow(val1, 2);
          textField.setText(String.valueOf(result));
        }
        else if(e.getSource()==btnPow)
        {
          val1=Double.valueOf(textField.getText());
          textField.setText("");
          operation="X^n"; 
        }
        else if(e.getSource()==btnRoot)
        {
          val1=Double.valueOf(textField.getText());
          result=Math.sqrt(val1);
          textField.setText(String.valueOf(result));
        }
       
    //--------------------------------------------------------------------------
        else if(e.getSource()==btnEq)
        {
            val2=Double.valueOf(textField.getText());
            if(operation=="+")
            {
                result=val1+val2;
                textField.setText(String.valueOf(result));
            }
            if(operation=="-")
            {
                result=val1-val2;
                textField.setText(String.valueOf(result));
            }
            if(operation=="*")
            {
                result=val1*val2;
                textField.setText(String.valueOf(result));
            }
            if(operation=="/")
            {
                result=val1/val2;
                textField.setText(String.valueOf(result));
            }
             
            
            
            if(operation=="X^n")
            {
                result=Math.pow(val1, val2);
                textField.setText(String.valueOf(result));
            }
        }
    
    //--------------------------------------------------------------------------
        else if(e.getSource()==btnPer)
        {
            val2=Double.valueOf(textField.getText());
            if(operation=="+")
            {
                result=val1+(val1*val2/100);
            }
            
            if(operation=="-")
            {
                result=val1-(val1*val2/100);
            }
            
            if(operation=="*")
            {
                result=val1*val2/100;
            }
            
            textField.setText(String.valueOf(result));
        }
    
    
    
    }
        
}
