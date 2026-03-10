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
public class Poring  implements Runnable {
    private JFrame fr;
    private JLabel picture;
    private JLabel count;
    private Thread t; //this is thread
    private boolean running = true;

    
    
    public Poring(int num){
        fr = new JFrame();
        picture = new JLabel(new ImageIcon("src/piano1.png"));
        count = new JLabel(String.valueOf(num));
        t = new Thread(this);
        fr.setLayout(new FlowLayout());
        fr.add(picture);
        fr.add(count);
        t.start();
        
        //picture click to close not implements Everything
        picture.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                fr.dispose();
            }  
    });
        
        fr.pack();
        fr.setVisible(true);
        fr.setResizable(false); // set Jframe cannot resize
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
    }
    
    public void run(){
        while(running){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
       
        fr.dispose();
    }
    
    public void stopPoring(){
        running = false;
    }
}
