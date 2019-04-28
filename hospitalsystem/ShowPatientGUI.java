/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import java.awt.HeadlessException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Shehab
 */
public class ShowPatientGUI extends JFrame {
     ArrayList  listpatients = new ArrayList();
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
        JButton save;
        ObjectOutputStream patients;

    public ShowPatientGUI() throws HeadlessException {
        
        name = new JLabel("Full Name: ");
        ID = new JLabel("National ID: ");
        dob = new JLabel("Date of Birth: ");
        gender = new JLabel("Gender: ");
        address = new JLabel("Address: ");
        phone = new JLabel("Phone Number: ");
        mobileno = new JLabel("Mobile Number: ");
        welcome = new JLabel("Welcome to hospital system");
        hid = new JLabel("Hospital ID: ");
        hieght = new JLabel("Height: ");
        wieght = new JLabel("Wieght: ");
        medicalcodition = new JLabel("Medical Condition: ");
        neededmeds = new JLabel("Needed Medications: ");
        operationcode = new JLabel("Operation Code: ");
//        name1 = new JTextField();
//        ID1 = new JTextField();
//        dob1 = new JTextField();
//        dob2 = new JTextField();
//        dob3 = new JTextField();
//        gender1 = new JTextField();
//        address1 = new JTextField();
//        phone1 = new JTextField();
//        mobileno1 = new JTextField();
//        hid1 = new JTextField();
//        hieght1 = new JTextField();
//        wieght1 = new JTextField();
//        medicalcodition1 = new JTextField();
//        neededmeds1 = new JTextField();
//        operationcode1 = new JTextField();
        save  = new JButton("Save");
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
        address1.setBounds(445,260,150,20);
        phone1.setBounds(480,290,150,20);
        mobileno1.setBounds(480,320,150,20);
        hid1.setBounds(460,350,150,20);
        hieght1.setBounds(440,380,150,20);
        wieght1.setBounds(440,410,150,20);
        medicalcodition1.setBounds(500,440,150,20);
        neededmeds1.setBounds(510,470,150,20);
        operationcode1.setBounds(490,500,150,20);
        save.setBounds(470,530,70,25);
    }
        
    
}
