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
import java.awt.event.*; // import when you want to use event ex. ActionListener
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*; // import when you want to write and read a file


public class ChatDemo implements ActionListener ,WindowListener{
    private JFrame fr;
    private JTextArea textarea;
    private JTextField textfield;
    private JButton submit,reset;
    private JPanel textPanel , btnPanel;
    
    
    public ChatDemo(){
        // create
        fr = new JFrame();
        textarea = new JTextArea(20,45);
        textfield = new JTextField();
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        textPanel = new JPanel();
        btnPanel =  new JPanel();
        
        textarea.setEditable(false); // set false to textarea cannot edit
        fr.setLayout(new BorderLayout());
        fr.add(textarea,BorderLayout.CENTER);
        
        // checking that have file name "ChatDemo.dat" or not
        try{
            File file = new File("ChatDemo.dat");
            
            if (file.exists()){
                
                BufferedReader br = new BufferedReader(new FileReader(file));
                
                String line;
                while((line =  br.readLine()) != null){
                    textarea.append(line + "\n");
                }
                br.close();
            }
        }
        catch(IOException ex){
            System.out.println(ex);
        }
        
        textPanel.setLayout(new GridLayout(2,1));
        textPanel.add(textfield);
        textPanel.add(btnPanel);
        
        btnPanel.add(submit);
        btnPanel.add(reset);
        
        fr.add(textPanel,BorderLayout.SOUTH);
        
        
        // add ActionListener for buttuon
        submit.addActionListener(this);
        reset.addActionListener(this);
        
        // add WindowListener for JFrame
        fr.addWindowListener(this);
        
        
        // Jframe settings
        fr.pack(); // set frame to fit component
        fr.setVisible(true); // set frame can see
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    //logic for ActionListener
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == submit) {
            DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String time = datetime.format(java.time.LocalDateTime.now());
            String text = textfield.getText();
            textarea.append(time + " : " + text + "\n");
            textfield.setText("");
            }
        else{
            textarea.setText("");
        }
        }
    
    //logic for WindowListener so every method must write to make it can work
    @Override
    public void windowOpened(WindowEvent e) {
    }

    // when closing program will creat ChatDemo.dat to record a chat from JTextArea
    @Override
    public void windowClosing(WindowEvent e) {
        try(FileWriter fw = new FileWriter("ChatDemo.dat")){
            fw.write(textarea.getText());
        }
        catch(IOException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
                            