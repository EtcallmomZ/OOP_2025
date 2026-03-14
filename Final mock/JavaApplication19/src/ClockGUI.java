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
import java.awt.event.*;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class ClockGUI implements Runnable,ActionListener{
    private JFrame fr;
    private JLabel Ldate,Ltime;
    private JTextField textfield;
    private JButton btn;
    private JPanel input,dt;
    private LogGUI log;
    
    public ClockGUI(LogGUI log) {
       this.log = log;
       fr = new JFrame("Clock");
       textfield =  new JTextField();
       btn = new JButton("Save");
       input = new JPanel();
       dt = new JPanel();
       
       //Label
       Ldate = new JLabel();
       Ltime = new JLabel();
       Font font1 = new Font("Monospaced",Font.BOLD,80);
       Font font2 = new Font("Monospaced",Font.PLAIN,50);
       Ltime.setFont(font1);
       Ldate.setFont(font2);
      
       
       // input area
       input.setLayout(new BorderLayout());
       input.add(textfield,BorderLayout.CENTER);
       input.add(btn,BorderLayout.EAST);
       input.setBackground(Color.WHITE);
       
       //date and time
       dt.setLayout(new GridLayout(2,1,0,10));
       dt.add(Ldate);
       dt.add(Ltime);
       dt.setBackground(Color.WHITE);
       
       // set background layout
       fr.add(dt,BorderLayout.CENTER);
       fr.add(input,BorderLayout.SOUTH);
       
       
       btn.addActionListener(this);
       fr.setBackground(Color.WHITE);
       fr.setSize(800,500);
       fr.setResizable(false);
       fr.setVisible(true);
       

               
    }
    
    public void run(){
       DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
       DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
       
       while (true){
        LocalDateTime now = LocalDateTime.now();
        String date = now.format(dateFormatter);
        String time = now.format(timeFormatter);
        
        Ldate.setText(date);
        Ltime.setText(time);
        Ltime.setHorizontalAlignment(SwingConstants.CENTER);
        Ldate.setHorizontalAlignment(SwingConstants.CENTER);
        
        try{
            Thread.sleep(1000);
           
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
        }
    }
    
    public void actionPerformed(ActionEvent ev){
        if (ev.getSource() == btn) {
            String text = textfield.getText();
            if (!text.isEmpty()) {
                String dt = Ldate.getText() + " " + Ltime.getText();
                String message = dt + ": " + text;
                log.addText(message);
                textfield.setText("");
            }
            
        }
    }
}
