/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9_1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;

/**
 *
 * @author eiwei
 */

public class CalculatorSample implements ActionListener {
    
    private JFrame fr;
    private JTextField ans;
    private JPanel bt;
    private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JButton op1,op2,op3,op4,c,eq;
    private String command,operator;
    private int num1,num2;
    
    public CalculatorSample(){
        fr = new JFrame("My Calculator");
        ans = new JTextField();
        bt = new JPanel();
        fr.setLayout(new BorderLayout());
        fr.add(ans,BorderLayout.NORTH);
        fr.add(bt,BorderLayout.CENTER);
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        
        op1 = new JButton("+");
        op2 = new JButton("-");
        op3 = new JButton("x");
        op4 = new JButton("/");
        c = new JButton("c");
        eq = new JButton("=");
        
        bt.setLayout(new GridLayout(4,4));
        
        bt.add(b7);
        bt.add(b8);
        bt.add(b9);
        bt.add(op1);
        
        bt.add(b4);
        bt.add(b5);
        bt.add(b6);
        bt.add(op2);
        
        bt.add(b1);
        bt.add(b2);
        bt.add(b3);
        bt.add(op3);
        
        bt.add(b0);
        bt.add(c);
        bt.add(eq);
        bt.add(op4);
        
        //add button Listener
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        //add operator Listener
        op1.addActionListener(this);
        op2.addActionListener(this);
        op3.addActionListener(this);
        op4.addActionListener(this);
        c.addActionListener(this);
        eq.addActionListener(this);


        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(255,255);
        fr.setVisible(true);
        
  
    }
    // ActionEvent when Listener
    @Override
    public void actionPerformed(ActionEvent ae) {
        command = ae.getActionCommand(); //get which button which user press
        if ("0123456789".contains(command)) {
            ans.setText(ans.getText()+command);
        }
        else if ("+-/x".contains(command)) {
            num1 = Integer.parseInt(ans.getText());
            operator = command;
            ans.setText("");
        }
        else if (command.equals("c")){
            ans.setText("");
            num1 =0;
            num2 =0;
            operator = "";
        }
        else if (command.equals("=")) {
            if (operator.equals("")){
                return;
            }
            
            if (ans.getText().equals("")) {
                num2 = num1;
            }
            else{
               num2 = Integer.parseInt(ans.getText());
            }
            
            int result = 0;
            
            switch(operator) {
                case "+":
                   result = num1+num2;
                   break;
                case "-":
                   result = num1-num2;
                   break;
                case "x":
                   result = num1*num2;
                   break;
                case "/":
                   result = num1/num2; 
                   break;
            }
            ans.setText(String.valueOf(result));
        }
    }

}
    
    

