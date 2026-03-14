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
import java.util.*;

public class LogGUI implements ActionListener {
    private JFrame fr;
    private JTextArea textarea;
    private JLabel Llog;
    private JButton logbtn;
    private JPanel inputPanel;
    private ArrayList<String> logslist;
    
   public LogGUI(){
       fr = new JFrame("Logs Window");
       textarea = new JTextArea();
       textarea.setEditable(false);
       JScrollPane textscroll =  new JScrollPane(textarea);
       textscroll.setBackground(Color.WHITE);
       
       //create ArrayList
       logslist = new ArrayList<>();
       
       Llog = new JLabel("Total Logs: " + logslist.size());
       Llog.setHorizontalAlignment(SwingConstants.LEFT);
       logbtn = new JButton("Clear Logs");
       
       Font font1 = new Font("Monospaced",Font.BOLD,14);
       Font font2 = new Font("Monospaced",Font.BOLD,16);
       logbtn.setFont(font1);
       Llog.setFont(font2);
       
       logbtn.addActionListener(this);

       inputPanel = new JPanel(new BorderLayout());
       inputPanel.add(Llog,BorderLayout.WEST);
       inputPanel.add(logbtn,BorderLayout.EAST);
       
       fr.add(textscroll,BorderLayout.CENTER);
       fr.add(inputPanel,BorderLayout.SOUTH);
       
       fr.setVisible(true);
       fr.setSize(800,500);
       fr.setResizable(false);
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       fr.addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent ev){
               try(FileWriter fw = new FileWriter("logs.txt")){
                   fw.write(textarea.getText());
               }
               catch(IOException ex){
                   System.out.println(ex);
               }
           }
       });
       
       try{
           File file = new File("logs.txt");
           if (file.exists()){
               try(BufferedReader br = new BufferedReader(new FileReader(file))){
                   String line;
                   while((line = br.readLine()) != null){
                       textarea.append(line+"\n");
                       logslist.add(line);
                   }
               }
           }
           Llog.setText("Total Logs: " + logslist.size());
       }
       catch(IOException ex){
           System.out.println(ex);
       }
   }
   
   public void addText(String text){
       logslist.add(text);
       textarea.append(text + "\n");
       Llog.setText("Total Logs: " + logslist.size());
   }
   
   public void actionPerformed(ActionEvent ev){
       if (ev.getSource() == logbtn) {
           logslist.clear();
           textarea.setText("");
           Llog.setText("Total Logs: " + logslist.size());
       }
   }
}

