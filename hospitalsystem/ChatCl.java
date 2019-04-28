    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class ChatCl extends JFrame {
      private JLabel recivedMsg;
    private JTextField tx_Msg=new JTextField();
    InputStream is;
    OutputStream os;
    Socket toFromserver = null;
    String clientName;
    JButton btnReciveMsg;
    public ChatCl (String Name) throws IOException
    {
        this.clientName=Name;
        setSize(1000,700);
        setTitle("Client V 1.0" + Name);
        recivedMsg=new JLabel("<html>Recived Message<br>");
        setLayout(null);
        recivedMsg.setBounds(450,20, 300,250);
        add(recivedMsg);
         btnReciveMsg=new JButton("Send");
        btnReciveMsg.setBounds(600,350,100,30);
        tx_Msg.setBounds(300,350,300,30);
        add(tx_Msg);
        btnReciveMsg.addActionListener(new act());
        add(btnReciveMsg);
        
                try {
                    toFromserver = new Socket("127.0.0.1", 6000);
                    is=toFromserver.getInputStream();
                    os=toFromserver.getOutputStream();
                    updategui t=new updategui();
                    t.start();

                } catch (IOException ex) {
                    
                }
                
    }
     private class act implements  ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            PrintWriter pw=new PrintWriter(os,true);
            pw.println(clientName+": "+tx_Msg.getText());
        }
        
    }
    private class updategui extends Thread
    {
        
        public void run()
        {
            while (true)
            {
                
                BufferedReader bf=new BufferedReader(new InputStreamReader(is));
                String Message = null;
                try {
                    Message = bf.readLine();
                    if (Message!=null)
                    {
                    recivedMsg.setText(recivedMsg.getText()+"<br>"+Message);
                    System.out.println("Server says " +Message);
                    
                    }
                } catch (IOException ex) {
                    System.out.println(ex);
                }
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    
                }
    
         
            }
        }
        }
    }
    

