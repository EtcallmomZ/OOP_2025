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
import java.util.ArrayList;

public class PoringConstructure implements ActionListener {
    private JFrame fr;
    private JButton btn;
    private int num = 0;
    private ArrayList<Poring> porings = new ArrayList<>();
    private Poring p;
    
    public PoringConstructure(){
        fr = new JFrame();
        btn = new JButton("Add");
        
        fr.setLayout(new FlowLayout());
        fr.add(btn);
        
        btn.addActionListener(this);
        
        fr.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                for (Poring p : porings) {
                    p.dispose();
                }
            }
        }
        );
        
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        num ++;
        p = new Poring(num);
        porings.add(p);
    }
}
