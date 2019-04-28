///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hospitalsystem;
//
//import java.awt.Graphics;
//import java.awt.HeadlessException;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInput;
//import java.io.ObjectInputStream;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
///**
// *
// * @author Shehab
// */
//public class DeletePatientGui extends JFrame{
//    Patient x;
//    JPanel panel1;
//    JPanel panel2;
//    JLabel welcome;
//    JLabel searchpatient;
//    JLabel background;
//    JButton search;
//    JButton back;
//    JTextField searcharea;
//    Image img ;
//    Image img2;
//    Image img3;
//    Graphics g;
//    @Override
//    public void paint (Graphics g)
//    {
//        g.drawImage(img, 0, 0, null);
//        g.drawImage(img2, 260, 80, null);
//        g.drawImage(img3, 400, 150, null);
//    }
//    public DeletePatientGui() throws HeadlessException, IOException {
//        x = new Patient();
//        back = new JButton();
//        welcome = new JLabel();
//        background = new JLabel();
//        background.setIcon(new ImageIcon(new ImageIcon("E:\\simple_blue_background-wallpaper-2560x1600.png").getImage().getScaledInstance(1000,600, Image.SCALE_DEFAULT)));    
//        searchpatient = new JLabel("Enter patient's HID: ");
//        search = new JButton();
//        back = new JButton();
//        back.setBorderPainted(false);
//        back.setContentAreaFilled(false);
//        back.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\back.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
//        search.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\search.png").getImage().getScaledInstance(90,50, Image.SCALE_DEFAULT)));
//        img = ImageIO.read(new File("E:\\simple_blue_background-wallpaper-2560x1600.png"));
//        img2 = ImageIO.read(new File("E:\\Untitled-3.png"));
//        img3 = ImageIO.read(new File("E:\\Buttons and labels\\hid.png"));
//        searcharea = new JTextField();
//        panel1 = new JPanel();
//        panel2 = new JPanel();
//        setSize(1000,600);
//        setTitle("Hospital System");
//        setLayout(null);
//        panel1.setSize(1000,600);
//        panel1.setLayout(null);
//        panel1.setVisible(true);
//        panel2.setSize(1000,600);
//        panel2.setLayout(null);
//        panel2.setVisible(true);
//        background.setBounds(0,0,1000,600);
//        searchpatient.setBounds(440,125,200,100);
//        searcharea.setBounds(420,200,150,20);
//        search.setBounds(454,230,85,25);
//        back.setBounds(0,0,50,50);
//        add(back);
//        panel2.add(background);
//        panel1.add(searchpatient);
//        panel1.add(searcharea);
//        panel1.add(search);
//        //add(panel2);
//        add(panel1);
//        
////        add(searchpatient);
////        add(searcharea);
////        add(search);
//        search.addActionListener(new deletePatient());
//        back.addActionListener(new back());
//    }
//    private class back implements ActionListener
//    {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//               Menu m2 = null;
//                try {
//                    m2 = new Menu();
//                } catch (HeadlessException | IOException ex) {
//                    Logger.getLogger(ShowDoctorGui.class.getName()).log(Level.SEVERE, null, ex);
//                }
//               dispose();
//               m2.setVisible(true);
//               m2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            }
//        
//    }
//    
//        
//    }
//
//
//        
//   