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
public class ShowDoctorGui extends JFrame{
    Doctors x;
    JPanel panel1;
    JPanel panel2;
    JLabel welcome;
    JLabel searchpatient;
    JLabel background;
    JButton back;
    JButton search;
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
    public ShowDoctorGui() throws HeadlessException, IOException {
        x = new Doctors();
        welcome = new JLabel();
        background = new JLabel();
        background.setIcon(new ImageIcon(new ImageIcon("E:\\simple_blue_background-wallpaper-2560x1600.png").getImage().getScaledInstance(1000,600, Image.SCALE_DEFAULT)));    
        searchpatient = new JLabel("Enter Doctor's HID: ");
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
        search.addActionListener(new searchDoctor());
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
 private class searchDoctor implements ActionListener,Serializable
{   
     
     Doctors pat;
     ArrayList <Doctors> listpat;

    public searchDoctor() {
        pat = new Doctors();
        listpat = new ArrayList<>();
    }
        
    @Override
    public void actionPerformed(ActionEvent ae)
    {
         try {
             readdoc();
         } catch (IOException | ClassNotFoundException ex) {
             Logger.getLogger(searchDoctor.class.getName()).log(Level.SEVERE, null, ex);
         }
         for(Doctors z : listpat)
         {
            if((z.getHid() == null ? searcharea.getText() == null : z.getHid().equals(searcharea.getText())) || (z.getName() == null ? searcharea.getText() == null : z.getName().equals(searcharea.getText())))
            {
                JOptionPane.showMessageDialog(null,"Doctor "+ z.getHid() +", found!");
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
                x.setChoosenField(z.getChoosenField());
                x.setChoosenRank(z.getChoosenRank());
                x.setChoosenShift(z.getChoosenShift());
                x.setChoosensalary(z.getChoosensalary());
                x.setWorkinghoursfrom(z.getWorkinghoursfrom());
                x.setWorkinghoursto(z.getWorkinghoursto());
                //x.address.street = z.address.street;
                showdoc y = new showdoc();
                y.setVisible(true);
                dispose();
                y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Doctor not found ", "Error",JOptionPane.ERROR_MESSAGE);
            }
                
         } 

    }
    
    public void readdoc() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInput in = null;
        in = new ObjectInputStream(new FileInputStream("E:\\doctors.bin"));
        listpat = null; 
        listpat = (ArrayList<Doctors>)in.readObject();
        in.close();
    }
    class showdoc extends JFrame
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
//        JLabel hieght;
//        JLabel wieght;
        JLabel socialcondition;
        JLabel fields;
        JLabel ranks;
//        JLabel neededmeds;
//        JLabel operationcode;
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
//        JLabel hieght1;
//        JLabel wieght1;
        JLabel socialcondition1;
        JLabel fields1;
        JLabel ranks1;
        JLabel workinghrf12;
        JLabel workinghrt1;
        JLabel shifts;
        JLabel salary;
        JLabel workinghrf;
        JLabel workinghrt;
        JLabel salary2;
        JLabel shofts;
        JButton delete;
//        JLabel neededmeds1;
//        JLabel operationcode1;

        public showdoc()
        {
             back = new JButton();
            back.setBorderPainted(false);
            back.setContentAreaFilled(false);
            back.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\back.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        name = new JLabel("Full Name: ");
        delete = new JButton("DELETE");
        ID = new JLabel("National ID: ");
        dob = new JLabel("Date of Birth: ");
        gender = new JLabel("Gender: ");
        address = new JLabel("Address: ");
        phone = new JLabel("Phone Number: ");
        mobileno = new JLabel("Mobile Number: ");
        welcome = new JLabel("Doctor Information");
        hid = new JLabel("Hospital ID: ");
        fields = new JLabel("Field: ");
        ranks = new JLabel("Rank: ");
//        hieght = new JLabel("Height: ");
//        wieght = new JLabel("Wieght: ");
        socialcondition = new JLabel("Social Condition: ");
        workinghrf = new JLabel("Working hours From: ");
        workinghrt = new JLabel("Working hours to: ");
        salary2 = new JLabel("Salary: ");
        shofts = new JLabel("Shift: ");
//        neededmeds = new JLabel("Needed Medications: ");
//        operationcode = new JLabel("Operation Code: ");
        name1 = new JLabel(x.getName());
        ID1 = new JLabel(String.valueOf(x.getId()));
        dob1 = new JLabel(String.valueOf(x.dob.getDay()));
        dob2 = new JLabel(String.valueOf(x.dob.getMonth()));
        dob3 = new JLabel(x.dob.getYear());
        gender1 = new JLabel(x.getGender());
        //address1 = new JLabel(x.address.street);
        phone1 = new JLabel(x.getPhone());
        mobileno1 = new JLabel(x.getMobileNo());
        hid1 = new JLabel(x.getHid());
//        hieght1 = new JLabel(String.valueOf(x.height));
//        wieght1 = new JLabel(String.valueOf(x.weight));
        socialcondition1 = new JLabel(x.getSocialCondition());
        fields1 = new JLabel(x.getChoosenField());
        ranks1 = new JLabel(x.getChoosenRank());
        shifts = new JLabel(x.getChoosenShift());
        salary = new JLabel(String.valueOf(x.getChoosensalary()));
        workinghrf12 = new JLabel(String.valueOf(x.getWorkinghoursfrom()));
        workinghrt1 = new JLabel(String.valueOf(x.getWorkinghoursto()));
//        neededmeds1 = new JLabel(x.neededMeds);
//        operationcode1 = new JLabel(String.valueOf(x.operationCode));
        setSize(1000,700);
        setTitle("Hospital System");
        setLayout(null);
        welcome.setBounds(420,60,200,100);
        add(welcome);
        add(salary2);
        add(shofts);
        add(workinghrf);
        add(workinghrt);
        add(shifts);
        add(name);
        add(ID);
        add(dob);
        add(gender);
        add(address);
        add(phone);
        add(mobileno);
        add(fields);
        add(ranks);
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
//        add(hieght);
//        add(wieght);
        add(socialcondition);
        add(fields1);
        add(ranks1);
//        add(neededmeds);
//        add(operationcode);
        add(hid1);
//        add(hieght1);
//        add(wieght1);
        add(socialcondition1);
        add(workinghrf12);
        add(workinghrt1);
        add(salary);
//        add(neededmeds1);
//        add(operationcode1);
        name.setBounds(380,100,200,100);
        ID.setBounds(380,130,200,100);
        dob.setBounds(380,160,200,100);
        gender.setBounds(380,190,200,100);
        address.setBounds(380,220,200,100);
        phone.setBounds(380,250,200,100);
        mobileno.setBounds(380,280,200,100);
        hid.setBounds(380,310,200,100);
        fields.setBounds(380,340,200,100);
        ranks.setBounds(380,370,200,100);
//        hieght.setBounds(380,340,200,100);
//        wieght.setBounds(380,370,200,100);
        socialcondition.setBounds(380,400,200,100);
//        neededmeds.setBounds(380,430,200,100);
//        operationcode.setBounds(380,460,200,100);
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
//        hieght1.setBounds(440,380,150,20);
//        wieght1.setBounds(440,410,150,20);
        socialcondition1.setBounds(500,440,150,20);
        fields1.setBounds(450,380,100,20);
        ranks1.setBounds(450,410,100,20);
        salary2.setBounds(380,430,200,100);
        shofts.setBounds(380,460,200,100);
        workinghrf.setBounds(380,490,200,100);
        workinghrt.setBounds(380,520,200,100);
        salary.setBounds(480,470,100,20);
        shifts.setBounds(480,500,100,20);
        workinghrf12.setBounds(510,530,100,20);
        workinghrt1.setBounds(490,560,100,20);
        back.setBounds(0,0,50,50);
        delete.setBounds(480,590,70,25);
        add(back);
        add(delete);
//        neededmeds1.setBounds(510,470,150,20);
//        operationcode1.setBounds(490,500,150,20);
        back.addActionListener(new back());
        delete.addActionListener(new deleteDoctor());
        }
        private class back implements ActionListener
    {
            @Override
            public void actionPerformed(ActionEvent ae) {
               ShowDoctorGui m2 = null;
                try {
                    m2 = new ShowDoctorGui();
                } catch (HeadlessException | IOException ex) {
                    Logger.getLogger(ShowDoctorGui.class.getName()).log(Level.SEVERE, null, ex);
                }
               dispose();
               m2.setVisible(true);
               m2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        
    }
        private class deleteDoctor implements ActionListener
    {
        ArrayList <Doctors> listpat1 = null;
        public deleteDoctor()
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
                Logger.getLogger(ShowDoctorGui.class.getName()).log(Level.SEVERE, null, ex);
            }
         for(int i = 0;i<listpat1.size();i++)
         {
            if((listpat1.get(i).getHid() == null ? searcharea.getText() == null : listpat1.get(i).getHid().equals(searcharea.getText())) || (listpat1.get(i).getName()== null ? searcharea.getText() == null : listpat1.get(i).getName().equals(searcharea.getText())))
            {
                listpat1.remove(listpat1.get(i));
                JOptionPane.showMessageDialog(null,"Doctor " +" deleted!");
                dispose();
                try {
                    Menu m = new Menu();
                    m.setVisible(true);
                    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } catch (HeadlessException | IOException ex) {
                    Logger.getLogger(ShowPatient.class.getName()).log(Level.SEVERE, null, ex);
                }
                ObjectOutputStream doctors;
                
                try {
                    doctors = new ObjectOutputStream(new FileOutputStream("E:\\doctors.bin"));
                    doctors.writeObject(listpat1);
                    doctors.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ShowPatient.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ShowPatient.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Doctor not found ", "Error",JOptionPane.ERROR_MESSAGE);
            }
                
         } 

    }
    public void readpat() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream in = null;
        in = new ObjectInputStream(new FileInputStream("E:\\doctors.bin"));
        listpat1 = null; 
        listpat1 = (ArrayList<Doctors>)in.readObject();
        in.close();
    }
    
    
        }
        }
}
 
     
 }

