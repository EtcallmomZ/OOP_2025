/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author eiwei
 */
import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    
    private JFrame fr;
    private JPanel blPanel , amtPanel,btPanel ;
    private JLabel blLabel,amtLabel;
    private JTextField blVaule,amt;
    private JButton deposit,withdraw,exit;
    
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(4,1));
        
        blPanel = new JPanel();
        blPanel.setLayout(new GridLayout(1,2));
        blLabel = new JLabel(" Balance");
        blVaule = new JTextField("6000");
        blVaule.setEditable(false);
        blPanel.add(blLabel);
        blPanel.add(blVaule);
        
        amtPanel = new JPanel();
        amtLabel = new JLabel(" Amount");
        amtPanel.setLayout(new GridLayout(1,2));
        amt = new JTextField();
        amtPanel.add(amtLabel);
        amtPanel.add(amt);
        
        btPanel = new JPanel();
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        exit = new JButton("Exit");
        btPanel.add(deposit);
        btPanel.add(withdraw);
        btPanel.add(exit);
        
        fr.add(blPanel);
        fr.add(amtPanel);
        fr.add(btPanel);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    
}
