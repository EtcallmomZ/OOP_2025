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
import java.util.*;

public class Poring {
    private JFrame fr;
    private JLabel picture;
    private JLabel count;

    
    
    public Poring(int num){
        fr = new JFrame();
        picture = new JLabel(new ImageIcon("src/piano1.png"));
        count = new JLabel(String.valueOf(num));
        Random r = new Random();
        fr.setLayout(new FlowLayout());
        fr.add(picture);
        fr.add(count);
        
        int x = r.nextInt(1500);
        int y = r.nextInt(1500);
        
        
        
        
        
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
        fr.setLocation(x,y);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
    }
    
    
    public void stopPoring(){
        fr.dispose();
    }
}
