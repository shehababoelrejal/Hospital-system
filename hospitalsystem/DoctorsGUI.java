
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

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
public class DoctorsGUI extends JFrame{
     ArrayList <Doctors> listDoctors = new ArrayList<Doctors>();
        int cnt = 252000;
        Doctors p =new Doctors();
        JLabel name;
        JLabel ID;
        JLabel dob;
        JLabel gender;
        JLabel address;
        JLabel phone;
        JLabel mobileno;
        JLabel welcome;
        JLabel hid;
        JLabel field;
        JLabel Rank;
        JLabel socialcondition;
        JLabel workinghrf;
        JLabel workinghrt;
        JLabel salary2;
        JLabel shofts;
       
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
        JComboBox socialcondition1;
        JComboBox workinghrf1;
        JComboBox workinghrt1;
        JComboBox shifts;
        JComboBox fields;
        JComboBox ranks;
        JComboBox salary;
        JButton save;
        JButton show;
        JButton back;
        ObjectOutputStream doctors;
        ObjectOutputStream count;
        String sal[]=new String[8];
        String genderbox[] = {"Choose gender","Male","Female"};
        String social[] = {"Choose Condition","Married","Single","Divorced"};
        String workingf[] = {"1:00 AM","1:30 AM","2:00 AM","2:30 AM","3:00 AM","3:30 AM",
                            "4:00 AM","4:30 AM","5:00 AM","5:30 AM","6:00 AM","6:30 AM",
                            "7:00 AM","7:30 AM","8:00 AM","8:30 AM","9:00 AM","9:30 AM",
                            "10:00 AM","10:30 AM","11:00 AM","11:30 AM","12:00 PM","1:00 PM",
                            "1:30 PM","2:00 PM","2:30 PM","3:00 PM","3:30 PM",
                            "4:00 PM","4:30 PM","5:00 PM","5:30 PM","6:00 PM","6:30 PM",
                            "7:00 PM","7:30 PM","8:00 PM","8:30 PM","9:00 PM","9:30 PM",
                            "10:00 PM","10:30 PM","11:00 PM","11:30 PM","12:00 PM"};
    public DoctorsGUI() throws HeadlessException, FileNotFoundException, IOException {
      this.doctors = new ObjectOutputStream(new FileOutputStream("E:\\doctors.bin"));
      this.count = new ObjectOutputStream(new FileOutputStream("E:\\DHID.bin"));
        name = new JLabel("Full Name: ");
        ID = new JLabel("National ID: ");
        dob = new JLabel("Date of Birth: ");
        gender = new JLabel("Gender: ");
        address = new JLabel("Address: ");
        phone = new JLabel("Phone Number: ");
        mobileno = new JLabel("Mobile Number: ");
        welcome = new JLabel("Pleae fill the following fields");
        hid = new JLabel("Hospital ID: ");
        field = new JLabel("Field ");
        Rank = new JLabel("Rank: ");
        socialcondition = new JLabel("Social Condition: ");
        workinghrf = new JLabel("Working hours From: ");
        workinghrt = new JLabel("Working hours to: ");
        salary2 = new JLabel("Salary: ");
        shofts = new JLabel("Shift: ");
        
    
        name1 = new JTextField("First name - Last name");
        name1.addFocusListener(new DoctorsGUI.componentfocus());
        ID1 = new JTextField("Enter the ID of your national card.");
        ID1.addFocusListener(new DoctorsGUI.componentfocus());
        dob1 = new JTextField("DD");
        dob1.addFocusListener(new DoctorsGUI.componentfocus());
        dob2 = new JTextField("MM");
        dob2.addFocusListener(new DoctorsGUI.componentfocus());
        dob3 = new JTextField("YY");
        dob3.addFocusListener(new DoctorsGUI.componentfocus());
        gender1 = new JComboBox(genderbox);
        gender1.addFocusListener(new DoctorsGUI.componentfocus());
        address1 = new JTextField("Street number - Street name - Apartment number. ");
        address1.addFocusListener(new DoctorsGUI.componentfocus());
        phone1 = new JTextField("Doctor's Home number. (8 charcaters).");
        phone1.addFocusListener(new DoctorsGUI.componentfocus());
        mobileno1 = new JTextField("Doctor's Mobile number. (11 characters). ");
        mobileno1.addFocusListener(new DoctorsGUI.componentfocus());
        hid1 = new JLabel("Auto-generated");
        hid1.addFocusListener(new DoctorsGUI.componentfocus());
        fields=new JComboBox (p.field);
        ranks =new JComboBox(p.Rank);
        shifts = new JComboBox(p.shifts);
          for(int i=0;i<8;i++){
        
            sal[i] =Integer.toString(p.getsalary(i));
        }
        salary = new JComboBox(sal);
        socialcondition1 = new JComboBox(social);
        socialcondition1.addFocusListener(new DoctorsGUI.componentfocus());
        workinghrf1 = new JComboBox(workingf);
        workinghrt1 = new JComboBox(workingf);
        save  = new JButton("Save");
        show  = new JButton("Show");
        back = new JButton();
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\back.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        setSize(1000,700);
        setTitle("Hospital System");
        setLayout(null);
        welcome.setBounds(420,60,200,100);
        add(welcome);
        add(back);
        add(name);
        add(salary2);
        add(shofts);
        add(ID);
        add(dob);
        add(gender);
        add(address);
        add(phone);
        add(mobileno);
        add(workinghrf);
        add(workinghrt);
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
        add(field);
        add(Rank);
        add(shifts);
        add(socialcondition);
        add(socialcondition1);
        add(workinghrf1);
        add(workinghrt1);
      
        add(hid1);
        add(fields);
        add(ranks);
        add(salary);
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
        field.setBounds(380,340,200,100);
        Rank.setBounds(380,370,200,100);
        socialcondition.setBounds(380,400,200,100);
        salary2.setBounds(380,430,200,100);
        shofts.setBounds(380,460,200,100);
        workinghrf.setBounds(380,490,200,100);
        workinghrt.setBounds(380,520,200,100);
       
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
        fields.setBounds(450,380,100,20);
        ranks.setBounds(450,410,100,20);
        socialcondition1.setBounds(480,440,150,20);
        salary.setBounds(480,470,100,20);
        shifts.setBounds(480,500,100,20); 
        workinghrf1.setBounds(510,530,100,20);
        workinghrt1.setBounds(490,560,100,20);
        save.setBounds(430,590,70,25);
        show.setBounds(530,590,70,25);
        back.setBounds(0,0,50,50);
        save.addActionListener(new doctorsGUIClick());
        show.addActionListener(new doctorsGUIClick());
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
    
    private class doctorsGUIClick implements ActionListener,Serializable
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
         p.dob.setDay(Integer.parseInt(dob1.getText()));
         p.dob.setMonth(Integer.parseInt(dob2.getText()));
         p.dob.setYear(dob3.getText());
         p.setGender(String.valueOf(gender1.getSelectedItem()));
         p.setPhone(phone1.getText());
         p.setMobileNo(mobileno1.getText());
         p.setHid(Integer.toString(cnt));
         p.setSocialCondition(String.valueOf(socialcondition1.getSelectedItem()));
         p.setChoosenField(String.valueOf(fields.getSelectedItem()));
         p.setChoosenRank(String.valueOf(ranks.getSelectedItem()));
         p.setChoosenShift(String.valueOf(shifts.getSelectedItem()));
         p.setChoosensalary(String.valueOf(salary.getSelectedItem()));
         p.setWorkinghoursfrom(Short.parseShort(String.valueOf(workinghrf1.getSelectedItem())));
         p.setWorkinghoursto(Short.parseShort(String.valueOf(workinghrt1.getSelectedItem())));
         listDoctors.add(p);
            System.out.println(listDoctors.get(0));
            try {
                doctors.writeObject(listDoctors);
            } catch (IOException ex) {
                Logger.getLogger(PatientGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                doctors.close();
            } catch (IOException ex) {
                Logger.getLogger(PatientGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Doctor "+ p.getName() +" added!");
             }
                catch(Exception e){
                JOptionPane.showMessageDialog(null, "Invalid data");}
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
        if(buttonPressed.equals(show))
        {
            try {
                ShowDoctorGui sh = new ShowDoctorGui();
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
    

