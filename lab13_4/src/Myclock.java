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

public class Myclock extends JLabel implements Runnable{
    private boolean pause = false;
    public void run(){
        int sec = 0;
        int min = 0;
        int hour = 0;
        
        Font font = new Font("Monospaced",Font.BOLD,50);
        this.setFont(font);
        this.setHorizontalAlignment(CENTER);
        
        
        this.addMouseListener(new MouseAdapter({
            public void mouseClicked(MouseEvent e){
                pause = !pause;
            }
        });
        
        while (true){
            try{
                Thread.sleep(1000);
                
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
            
            if (pause == false) {
                sec++;
                if (sec == 60) {
                    sec = 0;
                    min ++;    
                }
            
                if (min == 60) {
                    min = 0;
                    hour++;
        
                }
                this.setText(String.format("%02d:%02d:%02d",hour,min,sec));
                }
            
        }
       
        
    }
}

