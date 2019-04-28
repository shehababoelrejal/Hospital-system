/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.KeyCode;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

/**
 *
 * @author Shehab
 */
public class ShowPatient extends JFrame{
    Patient x;
    JPanel panel1;
    JPanel panel2;
    JLabel welcome;
    JLabel searchpatient;
    JLabel background;
    JButton search;
    JButton back;
    JTextField searcharea;
    Image img ;
    Image img2;
    Image img3;
    Graphics g;
    @Override
    public void paint (Graphics g)
    {
        g.drawImage(img, 0, 0, null);
        g.drawImage(img2, 260, 80, null);
        g.drawImage(img3, 400, 150, null);
    }
    public ShowPatient() throws HeadlessException, IOException {
        x = new Patient();
        back = new JButton();
        welcome = new JLabel();
        background = new JLabel();
        background.setIcon(new ImageIcon(new ImageIcon("E:\\simple_blue_background-wallpaper-2560x1600.png").getImage().getScaledInstance(1000,600, Image.SCALE_DEFAULT)));    
        searchpatient = new JLabel("Enter patient's HID: ");
        search = new JButton();
        back = new JButton();
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\back.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        search.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\search.png").getImage().getScaledInstance(90,50, Image.SCALE_DEFAULT)));
        img = ImageIO.read(new File("E:\\simple_blue_background-wallpaper-2560x1600.png"));
        img2 = ImageIO.read(new File("E:\\Untitled-3.png"));
        img3 = ImageIO.read(new File("E:\\Buttons and labels\\hid.png"));
        searcharea = new JTextField();
        panel1 = new JPanel();
        panel2 = new JPanel();
        setSize(1000,600);
        setTitle("Hospital System");
        setLayout(null);
        panel1.setSize(1000,600);
        panel1.setLayout(null);
        panel1.setVisible(true);
        panel2.setSize(1000,600);
        panel2.setLayout(null);
        panel2.setVisible(true);
        background.setBounds(0,0,1000,600);
        searchpatient.setBounds(440,125,200,100);
        searcharea.setBounds(420,200,150,20);
        search.setBounds(454,230,85,25);
        back.setBounds(0,0,50,50);
        add(back);
        panel2.add(background);
        panel1.add(searchpatient);
        panel1.add(searcharea);
        panel1.add(search);
        //add(panel2);
        add(panel1);
        
//        add(searchpatient);
//        add(searcharea);
//        add(search);
        search.addActionListener(new searchPatient());
        back.addActionListener(new back());
    }
    private class back implements ActionListener
    {
            @Override
            public void actionPerformed(ActionEvent ae) {
               Menu m2 = null;
                try {
                    m2 = new Menu();
                } catch (HeadlessException | IOException ex) {
                    Logger.getLogger(ShowDoctorGui.class.getName()).log(Level.SEVERE, null, ex);
                }
               dispose();
               m2.setVisible(true);
               m2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        
    }
    
 private class searchPatient implements ActionListener,Serializable
{   
     
     Patient pat;
     ArrayList <Patient> listpat;

    public searchPatient() {
        pat = new Patient();
        listpat = new ArrayList<>();
    }
        
    @Override
    public void actionPerformed(ActionEvent ae)
    {
         try {
             readpat();
         } catch (IOException | ClassNotFoundException ex) {
             Logger.getLogger(searchPatient.class.getName()).log(Level.SEVERE, null, ex);
         }
         for(Patient z : listpat)
         {
            if((z.getHid() == null ? searcharea.getText() == null : z.getHid().equals(searcharea.getText())) || (z.getName() == null ? searcharea.getText() == null : z.getName().equals(searcharea.getText())))
            {
                JOptionPane.showMessageDialog(null,"Patient "+ z.getHid() +" found!");
                x.setName(z.getName());
                x.setGender(z.getGender());
                x.setId(z.getId());
                x.setMobileNo(z.getMobileNo());
                x.setPhone(z.getPhone());
                x.setHid(z.getHid());
                x.dob.setDay(z.dob.getDay());
                x.dob.setMonth(z.dob.getMonth());
                x.dob.setYear(z.dob.getYear());
                x.setSocialCondition(z.getSocialCondition());
                x.setMedicalCondition(z.getMedicalCondition());
                x.setNeededMeds(z.getNeededMeds());
                x.setHeight(z.getHeight());
                x.setWeight(z.getWeight());
                x.setOperationCode(z.getOperationCode());
                //x.address.street = z.address.street;
                showpat y = new showpat();
                y.setVisible(true);
                dispose();
                y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Patient not found ", "Error",JOptionPane.ERROR_MESSAGE);
            }
                
         } 

    }
    public void readpat() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInput in = null;
        in = new ObjectInputStream(new FileInputStream("E:\\Patient.bin"));
        listpat = null; 
        listpat = (ArrayList<Patient>)in.readObject();
        in.close();
    }
    class showpat extends JFrame
 {
        
        JButton back;
        JLabel name;
        JLabel ID;
        JLabel dob;
        JLabel gender;
        JLabel address;
        JLabel phone;
        JLabel mobileno;
        JLabel welcome;
        JLabel hid;
        JLabel hieght;
        JLabel wieght;
        JLabel medicalcodition;
        JLabel neededmeds;
        JLabel operationcode;
        JLabel name1;
        JLabel ID1;
        JLabel dob1;
        JLabel gender1;
        JLabel address1;
        JLabel phone1;
        JLabel mobileno1;
        JLabel dob2;
        JLabel dob3;
        JLabel hid1;
        JLabel hieght1;
        JLabel wieght1;
        JLabel medicalcodition1;
        JLabel neededmeds1;
        JLabel operationcode1;
        JButton delete;

        public showpat()
        {
        back = new JButton();
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\back.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        delete = new JButton("DELETE");
        name = new JLabel("Full Name: ");
        ID = new JLabel("National ID: ");
        dob = new JLabel("Date of Birth: ");
        gender = new JLabel("Gender: ");
        address = new JLabel("Address: ");
        phone = new JLabel("Phone Number: ");
        mobileno = new JLabel("Mobile Number: ");
        welcome = new JLabel("Patient Information");
        hid = new JLabel("Hospital ID: ");
        hieght = new JLabel("Height: ");
        wieght = new JLabel("Wieght: ");
        medicalcodition = new JLabel("Medical Condition: ");
        neededmeds = new JLabel("Needed Medications: ");
        operationcode = new JLabel("Operation Code: ");
        name1 = new JLabel(x.getName());
        ID1 = new JLabel(String.valueOf(x.getId()));
        dob1 = new JLabel(String.valueOf(x.dob.getDay()));
        dob2 = new JLabel(String.valueOf(x.dob.getMonth()));
        dob3 = new JLabel(x.dob.getYear());
        gender1 = new JLabel(x.getGender());
        //address1 = new JLabel(x.address.street);
        phone1 = new JLabel(x.getPhone());
        mobileno1 = new JLabel(x.getPhone());
        hid1 = new JLabel(x.getHid());
        hieght1 = new JLabel(String.valueOf(x.getHeight()));
        wieght1 = new JLabel(String.valueOf(x.getWeight()));
        medicalcodition1 = new JLabel(x.getMedicalCondition());
        neededmeds1 = new JLabel(x.getNeededMeds());
        operationcode1 = new JLabel(String.valueOf(x.getOperationCode()));
        setSize(1000,600);
        setTitle("Hospital System");
        setLayout(null);
        welcome.setBounds(420,60,200,100);
        add(welcome);
        add(name);
        add(ID);
        add(dob);
        add(gender);
        add(address);
        add(phone);
        add(mobileno);
        add(name1);
        add(ID1);
        add(dob1);
        add(dob2);
        add(dob3);
        add(gender1);
        //add(address1);
        add(phone1);
        add(mobileno1);
        add(hid);
        add(hieght);
        add(wieght);
        add(medicalcodition);
        add(neededmeds);
        add(operationcode);
        add(hid1);
        add(hieght1);
        add(wieght1);
        add(medicalcodition1);
        add(neededmeds1);
        add(operationcode1);
        name.setBounds(380,100,200,100);
        ID.setBounds(380,130,200,100);
        dob.setBounds(380,160,200,100);
        gender.setBounds(380,190,200,100);
        address.setBounds(380,220,200,100);
        phone.setBounds(380,250,200,100);
        mobileno.setBounds(380,280,200,100);
        hid.setBounds(380,310,200,100);
        hieght.setBounds(380,340,200,100);
        wieght.setBounds(380,370,200,100);
        medicalcodition.setBounds(380,400,200,100);
        neededmeds.setBounds(380,430,200,100);
        operationcode.setBounds(380,460,200,100);
        name1.setBounds(445,140,150,20);
        ID1.setBounds(450,170,150,20);
        dob1.setBounds(470,200,50,20);
        dob2.setBounds(540,200,50,20);
        dob3.setBounds(610,200,50,20);
        gender1.setBounds(440,230,150,20);
//        address1.setBounds(445,260,150,20);
        phone1.setBounds(480,290,150,20);
        mobileno1.setBounds(480,320,150,20);
        hid1.setBounds(460,350,150,20);
        hieght1.setBounds(440,380,150,20);
        wieght1.setBounds(440,410,150,20);
        medicalcodition1.setBounds(500,440,150,20);
        neededmeds1.setBounds(510,470,150,20);
        operationcode1.setBounds(490,500,150,20);
        back.setBounds(0,0,50,50);
        delete.setBounds(480,530,70,25);
        add(back);
        add(delete);
        back.addActionListener(new back());
        delete.addActionListener(new deletePatient());
        }
         private class back implements ActionListener
    {
            @Override
            public void actionPerformed(ActionEvent ae) {
               ShowPatient m2 = null;
                try {
                    m2 = new ShowPatient();
                } catch (HeadlessException | IOException ex) {
                    Logger.getLogger(ShowDoctorGui.class.getName()).log(Level.SEVERE, null, ex);
                }
               dispose();
               m2.setVisible(true);
               m2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        
    }
         private class deletePatient implements ActionListener
    {
        ArrayList <Patient> listpat1 = null;
        public deletePatient()
        {
            listpat1 = new ArrayList<>();
        }
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            listpat1 = null;
            try {
                readpat();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(ShowPatient.class.getName()).log(Level.SEVERE, null, ex);
            }
         for(int i = 0;i<listpat1.size();i++)
         {
            if((listpat1.get(i).getHid() == null ? searcharea.getText() == null : listpat1.get(i).getHid().equals(searcharea.getText())) || (listpat1.get(i).getName()== null ? searcharea.getText() == null : listpat1.get(i).getName().equals(searcharea.getText())))
            {
                listpat1.remove(listpat1.get(i));
                JOptionPane.showMessageDialog(null,"Patient " +" deleted!");
                dispose();
                try {
                    Menu m = new Menu();
                    m.setVisible(true);
                    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } catch (HeadlessException | IOException ex) {
                    Logger.getLogger(ShowPatient.class.getName()).log(Level.SEVERE, null, ex);
                }
                ObjectOutputStream patients;
                
                try {
                    patients = new ObjectOutputStream(new FileOutputStream("E:\\Patient.bin"));
                    patients.writeObject(listpat1);
                    patients.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ShowPatient.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ShowPatient.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Patient not found ", "Error",JOptionPane.ERROR_MESSAGE);
            }
                
         } 

    }
    public void readpat() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream in = null;
        in = new ObjectInputStream(new FileInputStream("E:\\Patient.bin"));
        listpat1 = null; 
        listpat1 = (ArrayList<Patient>)in.readObject();
        in.close();
    }
    
    
        }
}
 
     
 }
}