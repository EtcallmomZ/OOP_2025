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
import java.awt.event.*;

public class TellerGUI implements ActionListener {
    
    private JFrame fr;
    private JPanel blPanel , amtPanel, btPanel;
    private JLabel blLabel, amtLabel;
    private JTextField blVaule, amt;
    private JButton deposit, withdraw, exit;
    private Account acc;
    
    public TellerGUI(){
        
        acc = new Account(6000, "User");
        
        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(4,1));
        
        blPanel = new JPanel();
        blPanel.setLayout(new GridLayout(1,2));
        blLabel = new JLabel(" Balance");
        blVaule = new JTextField(String.valueOf(acc.getBalance()));
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
        
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        exit.addActionListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String command = ae.getActionCommand();

        if (command.equals("Deposit")) {

            double money = Integer.parseInt(amt.getText());
            acc.deposit(money);
            blVaule.setText(String.valueOf(acc.getBalance()));
            amt.setText("");
        }

        else if (command.equals("Withdraw")) {

            double money = Integer.parseInt(amt.getText());
            acc.withdraw(money);
            blVaule.setText(String.valueOf(acc.getBalance()));
            amt.setText("");
        }

        else if (command.equals("Exit")) {
            System.exit(0);
        }
    }
}
