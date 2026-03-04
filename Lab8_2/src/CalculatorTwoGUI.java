/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eiwei
 */
import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {
    
    private JFrame fr;
    private JTextField ans;
    private JPanel bt;
    private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JButton op1,op2,op3,op4,c,eq;
    
    public CalculatorTwoGUI(){
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
        
        
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(255,255);
        fr.setVisible(true);
}
}
