/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import sun.security.util.Password;

/**
 *
 * @author lenovo
 */

public class Login extends JFrame implements Ilogin
{
    HashMap<String,String> table2 ;
    ObjectOutputStream op ;
    ObjectInputStream ip ;
    HashMap <String, String> table1 ;
    JLabel welcome;
    JLabel user;
    JLabel pass;
    JTextField username;
    JPasswordField passowrd;
    JButton login;
    JButton signup;
    BufferedImage img ;
    Image img2;
    Image img3;
    Image img4;
    Image img5;
    Graphics g; 
    @Override
    public void paint (Graphics g)
    {
        g.drawImage(img, 0, 0, null);
        g.drawImage(img2, 260, 110, null);
        g.drawImage(img3, 300, 165, null);
        g.drawImage(img4, 300, 208, null);
        //g.drawImage(img5, 260, 80, null);
    }
    public Login() throws HeadlessException, IOException, ClassNotFoundException {
       // op = new ObjectOutputStream(new FileOutputStream("E:\\users.bin"));
        ip = new ObjectInputStream(new FileInputStream("E:\\users.bin"));
        img = ImageIO.read(new File("E:\\simple_blue_background-wallpaper-2560x1600.png"));
        img2 = ImageIO.read(new File("E:\\Untitled-3.png"));
        img3 = ImageIO.read(new File("E:\\Buttons and labels\\username.png"));
        img4 = ImageIO.read(new File("E:\\Buttons and labels\\password.png"));
        img5 = ImageIO.read(new File("E:\\Buttons and labels\\LOGIN.png"));
        setContentPane (new JLabel(new ImageIcon(ImageIO.read(new File("E:\\simple_blue_background-wallpaper-2560x1600.png")))));
        table1 = new HashMap<>();
        table2 =new HashMap<>();
        welcome = new JLabel("Welcome to the hospital system");
        user = new JLabel("Username: ");
        pass = new JLabel("Password: ");
        username = new JTextField();
        passowrd = new JPasswordField();
        login = new JButton();
        login.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\LOGIN.png").getImage().getScaledInstance(90,40, Image.SCALE_DEFAULT)));
        signup = new JButton("SIGN UP");
        setSize(1000,600);
        setTitle("Hospital System");
        setLayout(null);
        welcome.setBounds(420,60,200,100);
        username.setBounds(490 , 180, 120, 20);
        passowrd.setBounds(490,220,120,20);
        user.setBounds(400,163,70,50);
        pass.setBounds(400,203,70,50);
        login.setBounds(450,270,90,40);
        signup.setBounds(530,270,80,20);
        add(welcome);
        add(username);
        add(passowrd);
        add(user);
        add(pass);
        add(login);
        //add(signup);
        login.addActionListener(new login());
        signup.addActionListener(new signup());
    }
    protected class login  implements ActionListener,Serializable 
    {
        Menu m;
        private login() throws HeadlessException, IOException, ClassNotFoundException 
        {
            this.m = new Menu();
        }
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            checkUser();
                if(table1.get(username.getText())!=null)
                {
                if(table1.get(username.getText()).equals(passowrd.getText()))
                    {
                        JOptionPane.showMessageDialog(null,"Welcome, "+ username.getText());
                        dispose();
                        m.setVisible(true);
                        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    }
                 else
                    {
                        JOptionPane.showMessageDialog(null,"Username or passowrd is incorrect. ", "Invalid login",JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please enter in the required text fields ", "Invalid login",JOptionPane.ERROR_MESSAGE);
                }
            
        }
        
    }
    private class signup implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            table2.put(username.getText(), passowrd.getText());
           
            try {
                op.writeObject(table2);
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                op.close();
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
                JOptionPane.showMessageDialog(null,"User registered!");
        }
        
    }
    
    
    @Override
  public  boolean checkUser(){
      login1 log = new login1();
        try {
            table1 = (HashMap < String, String >)ip.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ip.close();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
      return false;
      
  }
  public boolean checkPass(){
      return false;
  }
}
