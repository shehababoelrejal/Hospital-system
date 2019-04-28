
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Shehab
 */
public class PatientGUI extends JFrame implements Serializable{
        int cnt = 151000;
        ArrayList <Patient>  listpatients = new ArrayList<>();
        Patient p =new Patient();
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
        JTextField name1;
        JTextField ID1;
        JTextField dob1;
        JComboBox gender1;
        JTextField address1;
        JTextField phone1;
        JTextField mobileno1;
        JTextField dob2;
        JTextField dob3;
        JLabel hid1;
        JTextField hieght1;
        JTextField wieght1;
        JTextField medicalcodition1;
        JTextField neededmeds1;
        JTextField operationcode1;
        JButton save;
        JButton show;
        JButton back;
        ObjectOutputStream patients;
        ObjectOutputStream count;
        String genderbox[] = {"Choose gender","Male","Female"};
       
    public PatientGUI() throws HeadlessException, FileNotFoundException, IOException {
      this.patients = new ObjectOutputStream(new FileOutputStream("E:\\Patient.bin"));
      this.count = new ObjectOutputStream(new FileOutputStream("E:\\PHID.bin"));
        name = new JLabel("Full Name: ");
        ID = new JLabel("National ID: ");
        dob = new JLabel("Date of Birth: ");
        gender = new JLabel("Gender: ");
        address = new JLabel("Address: ");
        phone = new JLabel("Phone Number: ");
        mobileno = new JLabel("Mobile Number: ");
        welcome = new JLabel("Please fill the following fields");
        hid = new JLabel("Hospital ID: ");
        hieght = new JLabel("Height: ");
        wieght = new JLabel("Wieght: ");
        medicalcodition = new JLabel("Medical Condition: ");
        neededmeds = new JLabel("Needed Medications: ");
        operationcode = new JLabel("Operation Code: ");
        name1 = new JTextField("First name - Last name");
        name1.addFocusListener(new componentfocus());
        ID1 = new JTextField("Enter the ID of your national card.");
        ID1.addFocusListener(new componentfocus());
        dob1 = new JTextField("DD");
        dob1.addFocusListener(new componentfocus());
        dob2 = new JTextField("MM");
        dob2.addFocusListener(new componentfocus());
        dob3 = new JTextField("YY");
        dob3.addFocusListener(new componentfocus());
        gender1 = new JComboBox(genderbox);
        gender1.addFocusListener(new componentfocus());
        address1 = new JTextField("Street number - Street name - Apartment number. ");
        address1.addFocusListener(new componentfocus());
        phone1 = new JTextField("Patient's Home number. (8 charcaters).");
        phone1.addFocusListener(new componentfocus());
        mobileno1 = new JTextField("Patient's Mobile number. (11 characters). ");
        mobileno1.addFocusListener(new componentfocus());
        hid1 = new JLabel("Auto-generated");
        hid1.addFocusListener(new componentfocus());
        hieght1 = new JTextField();
        wieght1 = new JTextField();
        medicalcodition1 = new JTextField("State patient's medical condition.");
        medicalcodition1.addFocusListener(new componentfocus());
        neededmeds1 = new JTextField("Needed medications before or after the operation (if needed).");
        neededmeds1.addFocusListener(new componentfocus());
        operationcode1 = new JTextField("Code for the operation type.");
        operationcode1.addFocusListener(new componentfocus());
        save  = new JButton("Save");
        show = new JButton("SHOW PATIENT");
        back = new JButton();
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\back.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        setSize(1000,600);
        setTitle("Hospital System");
        setLayout(null);
        setBackground(Color.BLUE);
        welcome.setBounds(420,60,200,100);
        add(back);
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
        add(address1);
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
        add(save);
        add(show);
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
        ID1.setBounds(450,170,200,20);
        dob1.setBounds(470,200,50,20);
        dob2.setBounds(540,200,50,20);
        dob3.setBounds(610,200,50,20);
        gender1.setBounds(440,230,150,20);
        address1.setBounds(445,260,280,20);
        phone1.setBounds(480,290,250,20);
        mobileno1.setBounds(480,320,250,20);
        hid1.setBounds(460,350,170,20);
        hieght1.setBounds(440,380,150,20);
        wieght1.setBounds(440,410,150,20);
        medicalcodition1.setBounds(500,440,250,20);
        neededmeds1.setBounds(510,470,350,20);
        operationcode1.setBounds(490,500,170,20);
        save.setBounds(430,530,70,25);
        show.setBounds(530,530,70,25);
        back.setBounds(0,0,50,50);
        save.addActionListener(new PatientGUIClick());
        show.addActionListener(new PatientGUIClick());
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
    private class componentfocus implements  FocusListener
    {

        @Override
        public void focusGained(FocusEvent e) {
            Component component = e.getComponent();
            if (component instanceof JTextField) {
            ((JTextField)component).setText(null);
            }
            
        }

        @Override
        public void focusLost(FocusEvent e) {
            
        }
    
    }
    private class PatientGUIClick implements ActionListener,Serializable
    {
        
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            cnt++;
        Object buttonPressed=ae.getSource();
        if(buttonPressed.equals(save))
        {
            try{
         p.setName(name1.getText());
         p.setId(Integer.parseInt(ID1.getText()));
         p.dob.setDay(Integer.parseInt(dob1.getText())); ;
         p.dob.setMonth(Integer.parseInt(dob2.getText()));
         p.dob.setYear(dob3.getText());
         p.setGender(String.valueOf(gender1.getSelectedItem()));
         p.setPhone(phone1.getText());
         p.setMobileNo(mobileno1.getText());
         p.setHid(Integer.toString(cnt));
         p.setHeight(Integer.parseInt(hieght1.getText()));
         p.setWeight(Integer.parseInt(hieght1.getText()));
         p.setMedicalCondition(medicalcodition1.getText());
         p.setNeededMeds(neededmeds1.getText());
         p.setOperationCode(Integer.parseInt(operationcode1.getText()));
        // p.address.street = address1.getText();
         listpatients.add(p);
            System.out.println(listpatients.get(0));
            try {
                patients.writeObject(listpatients);
            } catch (IOException ex) {
                Logger.getLogger(PatientGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                patients.close();
            } catch (IOException ex) {
                Logger.getLogger(PatientGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Patient "+ p.getName() +" added!");
                try {
                    count.writeInt(cnt);
                } catch (IOException ex) {
                    Logger.getLogger(PatientGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    count.close();
                } catch (IOException ex) {
                    Logger.getLogger(PatientGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                catch(Exception e){
                JOptionPane.showMessageDialog(null, "Invalid data");}
        }
        if(buttonPressed.equals(show))
        {
            try {
                ShowPatient sh = new ShowPatient();
                sh.setVisible(true);
                dispose();
                sh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            } catch (HeadlessException | IOException ex) {
                Logger.getLogger(PatientGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        }
    }
    }
   
//     public  void write() throws IOException ,FileNotFoundException {
//               ObjectOutputStream patients = new ObjectOutputStream(new FileOutputStream("E:\\Patient.bin"));
//               patients.writeObject(p);
//               patients.close();
//               System.out.println("saved");
//    }
//}
