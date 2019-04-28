/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Shehab
 */
public class Menu extends JFrame
{
    JLabel welcome;
    JButton pateint;
    JButton doctor;
    JButton nurse;
    JLabel adduser;
    JLabel showuser;
    JLabel reserveuser;
    JLabel showres;
    JLabel deletepat1;
    JButton delpateint;
    JButton deldoctor;
    JButton delnurse;
    JButton showpatient;
    JButton showdoctor;
    JButton shownurse;
    JButton Operarions;
    JButton reservations;
    JButton amedical;
    JButton signout;
    JButton back; 
    JButton graphbt;

    JButton deletepat;
    JButton showreservations;
    JButton showoperations;
    JButton otherschat;
    JButton othersgraph;
    Image img ;
    Image img2;
    Image img3;
    Image img4;
    Image img5;
    Image img6;
    Image img7;
    Image img8;
    Graphics g; 
    @Override
    public void paint (Graphics g)
    {
        g.drawImage(img, 0, 0, null);
        g.drawImage(img2, 260, 110, null);
        //g.drawImage(img3, 300, 165, null);
        //g.drawImage(img4, 300, 208, null);
        g.drawImage(img3, 439, 153, null);
        g.drawImage(img5, 100, 153, null);
        g.drawImage(img4, 790, 153, null);
        g.drawImage(img6, 100, 300, null);
        g.drawImage(img7, 740, 260, null);
        g.drawImage(img8, 370, 275, null);
    }

    public Menu() throws HeadlessException, IOException {
        welcome = new JLabel("Welcome to the hospital system");
        pateint = new JButton("PATIENT");
        graphbt = new JButton("graph");
        doctor = new JButton("DOCTOR");
        nurse = new JButton("NURSE");
        adduser = new JLabel("Add user");
        showuser = new JLabel("Show user");
        showpatient = new JButton("PATIENT");
        showdoctor = new JButton("DOCTOR");
        delpateint = new JButton("PATIENT");
        deldoctor = new JButton("DOCTOR");
        delnurse = new JButton("NURSE");
        shownurse = new JButton("NURSE");
        otherschat = new JButton("CHAT");
        othersgraph = new JButton("GRAPH");
        showreservations = new JButton("PATIENT");
        showoperations = new JButton("OPERATIONS");
        reserveuser = new JLabel("Reserve user");
        Operarions = new JButton("OPERATIONS");
        reservations = new JButton("RESERVATIONS");
        amedical = new JButton("A MEDICAL");
        signout = new JButton("LOGOUT");
        back = new JButton();
        back.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\back.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        img = ImageIO.read(new File("E:\\simple_blue_background-wallpaper-2560x1600.png"));
        img2 = ImageIO.read(new File("E:\\Untitled-3.png"));
        img3 = ImageIO.read(new File("E:\\Buttons and labels\\adduser.png"));
        img5 = ImageIO.read(new File("E:\\Buttons and labels\\showuser.png"));
        img4 = ImageIO.read(new File("E:\\Buttons and labels\\reserveuser.png"));
        img6 = ImageIO.read(new File("E:\\Buttons and labels\\deleteuser.png"));
        img7 = ImageIO.read(new File("E:\\Buttons and labels\\showres.png"));
        img8 = ImageIO.read(new File("E:\\Buttons and labels\\others.png"));
        setSize(1000,600);
        setTitle("Hospital System");
        setLayout(null);
        welcome.setBounds(420,60,200,100);
        adduser.setBounds(480,110,200,100);
        pateint.setBounds(460,190,90,20);
        doctor.setBounds(460,220,90,20);
        nurse.setBounds(460,250,90,20);
        delpateint.setBounds(100,340,90,20);
        deldoctor.setBounds(100,340,90,20);
        delnurse.setBounds(100,370,90,20);
        showuser.setBounds(110,110,200,100);
        showpatient.setBounds(100,190,90,20);
        showdoctor.setBounds(100,220,90,20);
        shownurse.setBounds(100,250,90,20);
        reserveuser.setBounds(810,110,200,100);
        showpatient.setBounds(100,190,90,20);
        showdoctor.setBounds(100,220,90,20);
        shownurse.setBounds(100,250,90,20);
        Operarions.setBounds(800,190,110,20);
        //graphbt.setBounds(800,250,110,20);
        showreservations.setBounds(800,340,110,20);
        showoperations.setBounds(800,370,110,20);
        otherschat.setBounds(460,350,90,20);
        reservations.setBounds(800,220,110,20);
        signout.setBounds(1000,0,110,20);
        back.setBounds(0,0,50,50);
        add(back);
        add(signout);
        add(welcome);
        add(adduser);
        add(pateint);
        add(doctor);
        add(nurse);
        add(graphbt);
        add(delpateint);
        add(deldoctor);
        add(delnurse);
        add(showuser);
        add(showpatient);
        add(showdoctor);
        add(shownurse);
        add(reserveuser);
        add(Operarions);
        add(reservations);
        add(showreservations);
        add(showoperations);
        add(otherschat);
        add(othersgraph);
        pateint.addActionListener(new menuselect());
        doctor.addActionListener(new menuselect());
        showpatient.addActionListener(new menuselect());
        nurse.addActionListener(new menuselect());
        shownurse.addActionListener(new menuselect());
        showdoctor.addActionListener(new menuselect());
        signout.addActionListener(new menuselect());
        back.addActionListener(new menuselect());
        reservations.addActionListener(new menuselect());
        delpateint.addActionListener(new menuselect());
        deldoctor.addActionListener(new menuselect());
        delnurse.addActionListener(new menuselect());
        Operarions.addActionListener(new menuselect());
        showreservations.addActionListener(new menuselect());
        showoperations.addActionListener(new menuselect());
        graphbt.addActionListener(new menuselect());
        otherschat.addActionListener(new menuselect());
        othersgraph.addActionListener(new menuselect());

    }
    private class menuselect implements ActionListener
    {
        private menuselect() throws HeadlessException, IOException {
//            this.l = new Login();
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
           Object buttonPressed=ae.getSource();
           if(buttonPressed.equals(pateint))
           {
                PatientGUI pat = null;
               try {
                   pat = new PatientGUI();
               } catch (HeadlessException | IOException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
                pat.setVisible(true);
                dispose();
                pat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
           if(buttonPressed.equals(doctor))
           { 
                DoctorsGUI doc = null;
               try {
                   doc=new DoctorsGUI();
               } catch (HeadlessException | IOException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
                doc.setVisible(true);
                dispose();
                doc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
           if(buttonPressed.equals(showpatient))
           {
               ShowPatient showpat = null;
               try {
                   showpat = new ShowPatient();
               } catch (HeadlessException | IOException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
               dispose();
               showpat.setVisible(true);
               showpat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
           if(buttonPressed.equals(nurse))
           {
               NursesGUI nrse = null;
               try {
                   nrse = new NursesGUI();
               } catch (HeadlessException | IOException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
               dispose();
               nrse.setVisible(true);
               nrse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
           if(buttonPressed.equals(shownurse))
           {
                ShowNurseGui nrse1 = null;
               try {
                   nrse1 = new ShowNurseGui();
               } catch (HeadlessException | IOException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
                nrse1.setVisible(true);
                dispose();
                nrse1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
           if(buttonPressed.equals(showdoctor))
           {
                ShowDoctorGui doc1 = null;
               try {
                   doc1 = new ShowDoctorGui();
               } catch (HeadlessException | IOException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
                doc1.setVisible(true);
                dispose();
                doc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
           if(buttonPressed.equals(signout))
           {
            Login l = null;
               try {
                   l = new Login();
               } catch (HeadlessException | IOException | ClassNotFoundException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
            l.setVisible(true);
            dispose();
            l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
           if(buttonPressed.equals(back))
           {
                Login l = null;
               try {
                   l = new Login();
               } catch (HeadlessException | IOException | ClassNotFoundException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
                l.setVisible(true);
                dispose();
                l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
            if(buttonPressed.equals(reservations))
           {
                ReservationsGui res = null;
               try {
                   res=new ReservationsGui();
               } catch (IOException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
                res.setVisible(true);
                dispose();
                res.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
            if(buttonPressed.equals(deldoctor))
           {
               GetSalariesDoctorsGui getdoc = null;
               try {
                   getdoc = new GetSalariesDoctorsGui();
               } catch (HeadlessException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
                getdoc.setVisible(true);
                dispose();
                getdoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
            if(buttonPressed.equals(Operarions))
            {
                OperationsReservationGui res2 = null;
               try {
                   res2 = new OperationsReservationGui();
               } catch (IOException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                   res2.setVisible(true);
                   dispose();
                   res2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               }
            }
            if(buttonPressed.equals(showreservations))
           { 
                ShowReservations res = null;
               try {
                   res=new ShowReservations();
               } catch (HeadlessException | IOException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
                res.setVisible(true);
                dispose();
                res.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
            if(buttonPressed.equals(graphbt))
           {
                graph gr = null;
               try {
                   gr = new graph();
               } catch (HeadlessException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
                gr.setVisible(true);
                dispose();
                gr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
            if(buttonPressed.equals(showoperations))
           {
                ShowOperationReservationsGui res = null;
               try {
                   res = new ShowOperationReservationsGui();
               } catch (HeadlessException | IOException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
                res.setVisible(true);
                dispose();
                res.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
             if(buttonPressed.equals(otherschat))
             {
                ChatCl cl = null;
               try {
                   cl  = new ChatCl("Receptionist");
               } catch (IOException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
                cl.setVisible(true);
                cl.setDefaultCloseOperation(ChatCl.EXIT_ON_CLOSE);
                
             }
        }
        
    }
            
}
