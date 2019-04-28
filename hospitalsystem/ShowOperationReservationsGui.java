///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hospitalsystem;
//
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.HeadlessException;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInput;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javafx.scene.input.KeyCode;
//import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JLayeredPane;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//import javax.swing.JPanel;
//
///**
// *
// * @author Shehab
// */
//public class ShowReservations extends JFrame{
//    Reservation x;
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
//    public ShowReservations() throws HeadlessException, IOException {
//        x = new Reservation();
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
//        img3 = ImageIO.read(new File("E:\\Buttons and labels\\res.png"));
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
//        search.addActionListener(new searchRes());
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
// private class searchRes implements ActionListener,Serializable
//{   
//     
//     Reservation pat;
//     ArrayList <Reservation> listpat;
//
//    public searchRes() {
//        pat = new Reservation();
//        listpat = new ArrayList<>();
//    }
//        
//    @Override
//    public void actionPerformed(ActionEvent ae)
//    {
//         try {
//             readpat();
//         } catch (IOException | ClassNotFoundException ex) {
//             Logger.getLogger(searchRes.class.getName()).log(Level.SEVERE, null, ex);
//         }
//         for(Reservation z : listpat)
//         {
//            if(z.getPatname() == null ? searcharea.getText() == null : z.getPatname().equals(searcharea.getText()))
//            {
//                JOptionPane.showMessageDialog(null,"Patient "+ z.getPatname()+" found!");
//                x.setPatname(z.getPatname());
//                x.setChosenprice(z.getChosenprice());
//                x.setMobileno(z.getMobileno());
//                x.setFrom(x.getFrom());
//                x.setTo(z.getTo());
//                x.setDoctorname(z.getDoctorname());
//                x.setPhoneno(z.getPatname());
//                //x.address.street = z.address.street;
//                showres  y = null;
//                try {
//                    y = new showres();
//                } catch (IOException ex) {
//                    Logger.getLogger(ShowReservations.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                y.setVisible(true);
//                dispose();
//                y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(null,"Patient not found ", "Error",JOptionPane.ERROR_MESSAGE);
//            }
//                
//         } 
//
//    }
//    public void readpat() throws FileNotFoundException, IOException, ClassNotFoundException
//    {
//        ObjectInput in = null;
//        in = new ObjectInputStream(new FileInputStream("E:\\Patient.bin"));
//        listpat = null; 
//        listpat = (ArrayList<Reservation>)in.readObject();
//        in.close();
//    }
// }
// 
//public class showres extends JFrame{
//    JLabel welcome;
//    JLabel name;
//    JLabel phonenumber;
//    JLabel mobilenumber;
//    JLabel doctor;
//    JLabel chosenshift;
//    JLabel workinghoursfrom;
//    JLabel workinghoursto;
//    JLabel choosenField;
//    JLabel chosenshift1;
//    JLabel workinghoursfrom1;
//    JLabel workinghoursto1;
//    JLabel choosenField1;
//    JLabel remrserve;
//    JLabel remrserve1;
//    JLabel timefrom;
//    JLabel price;
//    JLabel price1;
//    JLabel timefrom1;
//    JLabel timeto;
//    JLabel timeto1;
//    JLabel name1;
//    JLabel phonenumber1;
//    JLabel mobilenumber1;
//    JLabel  doctor1;
//    JLabel  doctor2;
//    JButton delete;
//    JButton back;
//    public showres () throws FileNotFoundException, IOException {
////        this.reserve = new Reservation();
////        this.id = new JTextField();
////        this.ID = new JLabel("id:");
////        this.conditions = new JComboBox(reserve.condition);
////        this.conditions1 = new JLabel("condition:");
//        back = new JButton();
//        back.setBorderPainted(false);
//        back.setContentAreaFilled(false);
//        back.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\back.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
//        setSize(1000,600);
//        setTitle("Hospital System");
//        setLayout(null);
////        id.setBounds(410, 150, 100, 20);
////        ID.setBounds(380, 150, 50, 20);
////        conditions1.setBounds(380, 180, 100, 20);
////        conditions.setBounds(450, 180, 100, 20);
////        add(id);
////        add(ID);
////        add(conditions);
////        add(conditions1);
//       delete = new JButton("DELETE");
//       welcome = new JLabel("Pleae fill the following fields");
//       remrserve = new JLabel("Remaining Reservations: ");
//       remrserve1 = new JLabel();
//       workinghoursfrom = new JLabel("Wroking Hours From: ");
//       workinghoursto = new JLabel("Wroking Hours to: ");
//       chosenshift = new JLabel("Shift: ");
//       chosenshift1 = new JLabel();
//       workinghoursfrom1  = new JLabel();
//       workinghoursto1  = new JLabel();
//       name = new JLabel("Full Name: ");
//       phonenumber = new JLabel("Phone number: ");
//       mobilenumber = new JLabel("Mobile number: ");
//       doctor = new JLabel("Doctor: ");
//       timefrom = new JLabel("From: ");
//       timeto = new JLabel("To: ");
//       price = new JLabel("Price: ");
//        back = new JButton();
//        back.setBorderPainted(false);
//        back.setContentAreaFilled(false);
//        back.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\back.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
//       timefrom1 = new JLabel();
//       timeto1 = new JLabel();
//       name1= new JLabel(x.getPatname());
//       phonenumber1 = new JLabel(x.getPhoneno());
//       mobilenumber1 = new JLabel(x.getMobileno());
//       price1 = new JLabel(String.valueOf(x.getChosenprice()));
//       choosenField = new JLabel("Conditions: ");
//       doctor2 = new JLabel(x.getDoctorname());
//      // doctor2.addActionListener(new chosencombo());
//       setSize(1000,600);
//       setTitle("Hospital System");
//       setLayout(null);
//       name.setBounds(380,100,200,100);
//       phonenumber.setBounds(380,130,200,100);
//       mobilenumber.setBounds(380,160,200,100);
//       doctor1.setBounds(450,230,100,20);
//       doctor2.setBounds(450,260,200,20);
//       name1.setBounds(445,140,150,20);
//       phonenumber1.setBounds(475,170,250,20);
//       mobilenumber1.setBounds(480,200,250,20);
//       choosenField.setBounds(380,230,100,20);
//       doctor.setBounds(380,260,100,20);
//       workinghoursfrom.setBounds(380,290,200,20);
//       workinghoursfrom1.setBounds(530,290,100,20);
//       workinghoursto.setBounds(380,320,200,20);
//       workinghoursto1.setBounds(500,320,100,20);
//       chosenshift.setBounds(380,350,100,20);
//       chosenshift1.setBounds(450,350,100,20);
//       remrserve.setBounds(380,380,200,20);
//       timefrom.setBounds(380,410,100,20);
//       timeto.setBounds(380,440,100,20);
//       timefrom1.setBounds(450,410,100,20);
//       timeto1.setBounds(450,440,100,20);
//       remrserve1.setBounds(490,440,200,20);
//       price.setBounds(380,470,100,20);
//       price1.setBounds(450,470,100,20);
//       welcome.setBounds(420,60,200,100);
//       back.setBounds(0,0,50,50);
//       delete.setBounds(480,530,70,25);
//       add(back);
//       add(welcome);
////       add(remrserve);
////       add(remrserve1);
//       add(timefrom);
//       add(timeto);
//       add(timefrom1);
//       add(timeto1);
//       add(name);
//       add(doctor);
////       add(workinghoursfrom);
////       add(workinghoursto);
////       add(workinghoursfrom1);
////       add(workinghoursto1);
////       add(chosenshift);
////       add(chosenshift1);
//       add(price);
//       add(price1);
//       add(name1);
//       add(mobilenumber1);
//       add(phonenumber1);
//       add(choosenField);
//       add(doctor);
//       add(phonenumber);
//       add(mobilenumber);
////       add(doctor1);
//       add(doctor2);
//       add(delete);
//       delete.addActionListener(new deletePatient());
//       back.addActionListener(new back());
//    }
//}
//         private class deletePatient implements ActionListener
//    {
//        ArrayList <Reservation> listpat1 = null;
//        public deletePatient()
//        {
//            listpat1 = new ArrayList<>();
//        }
//        @Override
//        public void actionPerformed(ActionEvent ae)
//        {
//            listpat1 = null;
//            try {
//                readpat();
//            } catch (IOException | ClassNotFoundException ex) {
//                Logger.getLogger(DeletePatientGui.class.getName()).log(Level.SEVERE, null, ex);
//            }
//         for(int i = 0;i<listpat1.size();i++)
//         {
//            if(listpat1.get(i).getPatname() == null ? searcharea.getText() == null : listpat1.get(i).getPatname().equals(searcharea.getText()))
//            {
//                listpat1.remove(listpat1.get(i));
//                JOptionPane.showMessageDialog(null,"Reservation " +" deleted!");
//                dispose();
//                try {
//                    Menu m = new Menu();
//                    m.setVisible(true);
//                    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                } catch (HeadlessException | IOException ex) {
//                    Logger.getLogger(ShowPatient.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                ObjectOutputStream reses;
//                
//                try {
//                    reses = new ObjectOutputStream(new FileOutputStream("E:\\Patient.bin"));
//                    reses.writeObject(listpat1);
//                    reses.close();
//                } catch (FileNotFoundException ex) {
//                    Logger.getLogger(ShowPatient.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(ShowPatient.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                    
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(null,"Reservation not found ", "Error",JOptionPane.ERROR_MESSAGE);
//            }
//                
//         } 
//
//    }
//    public void readpat() throws FileNotFoundException, IOException, ClassNotFoundException
//    {
//        ObjectInputStream in = null;
//        in = new ObjectInputStream(new FileInputStream("E:\\Patient.bin"));
//        listpat1 = null; 
//        listpat1 = (ArrayList<Reservation>)in.readObject();
//        in.close();
//    }
//    
//    
//        }
//}
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
public class ShowOperationReservationsGui extends JFrame{
    Reservation x;
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
    public ShowOperationReservationsGui() throws HeadlessException, IOException {
        x = new Reservation();
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
        img3 = ImageIO.read(new File("E:\\Buttons and labels\\res.png"));
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
        searcharea.setBounds(420,220,150,20);
        search.setBounds(454,250,85,25);
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
     ArrayList <Reservation> listpat;

    public searchPatient() {
        pat = new Patient();
        listpat = new ArrayList<>();
    }
        
    @Override
    public void actionPerformed(ActionEvent ae)
    {
         try {
             readres();
         } catch (IOException | ClassNotFoundException ex) {
             Logger.getLogger(searchPatient.class.getName()).log(Level.SEVERE, null, ex);
         }
         for(Reservation z : listpat)
         {
             if(z.getPatname() == null ? searcharea.getText() == null : z.getPatname().equals(searcharea.getText()))
             {
            {
                JOptionPane.showMessageDialog(null,"Reservation "+ z.getPatname() +" found!");
                x.setPatname(z.getPatname());
                x.setChosenprice(z.getChosenprice());
                x.setMobileno(z.getMobileno());
                x.setFrom(z.getFrom());
                x.setTo(z.getTo());
                x.setDoctorname(z.getDoctorname());
                x.setPhoneno(z.getPatname());
                showres y = new showres();
                y.setVisible(true);
                dispose();
                y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Reservation not found ", "Error",JOptionPane.ERROR_MESSAGE);
            }
                
         } 

    }
    public void readres() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInput in = null;
        in = new ObjectInputStream(new FileInputStream("E:\\reservationso.bin"));
        listpat = null; 
        listpat = (ArrayList<Reservation>)in.readObject();
        in.close();
    }
    class showres extends JFrame
 {
        
        JButton back;
        JLabel welcome;
        JLabel name;
        JLabel phonenumber;
        JLabel mobilenumber;
        JLabel doctor;
        JLabel chosenshift;
        JLabel workinghoursfrom;
        JLabel workinghoursto;
        JLabel choosenField;
        JLabel chosenshift1;
        JLabel workinghoursfrom1;
        JLabel workinghoursto1;
    JLabel choosenField1;
    JLabel remrserve;
    JLabel remrserve1;
    JLabel timefrom;
    JLabel price;
    JLabel price1;
    JLabel timefrom1;
    JLabel timeto;
    JLabel timeto1;
    JLabel name1;
    JLabel phonenumber1;
    JLabel mobilenumber1;
    //JLabel  doctor1;
    JLabel  doctor2;
        JButton delete;

        public showres()
        {
        back = new JButton();
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\back.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        delete = new JButton("DELETE");
               welcome = new JLabel("Pleae fill the following fields");
       remrserve = new JLabel("Remaining Reservations: ");
       remrserve1 = new JLabel();
       workinghoursfrom = new JLabel("Wroking Hours From: ");
       workinghoursto = new JLabel("Wroking Hours to: ");
       chosenshift = new JLabel("Shift: ");
       chosenshift1 = new JLabel();
       workinghoursfrom1  = new JLabel();
       workinghoursto1  = new JLabel();
       name = new JLabel("Full Name: ");
       phonenumber = new JLabel("Phone number: ");
       mobilenumber = new JLabel("Mobile number: ");
       doctor = new JLabel("Doctor: ");
       timefrom = new JLabel("From: ");
       timeto = new JLabel("To: ");
       price = new JLabel("Price: ");
        back = new JButton();
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setIcon(new ImageIcon(new ImageIcon("E:\\Buttons and labels\\back.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
       timefrom1 = new JLabel(String.valueOf(x.getFrom()));
       timeto1 = new JLabel(String.valueOf(x.getTo()));
       name1= new JLabel(x.getPatname());
       phonenumber1 = new JLabel(x.getPhoneno());
       mobilenumber1 = new JLabel(x.getMobileno());
       price1 = new JLabel(String.valueOf(x.getChosenprice()));
       choosenField = new JLabel("Conditions: ");
       doctor2 = new JLabel(x.getDoctorname());
      // doctor2.addActionListener(new chosencombo());
       setSize(1000,600);
       setTitle("Hospital System");
       setLayout(null);
       name.setBounds(380,100,200,100);
       phonenumber.setBounds(380,130,200,100);
       mobilenumber.setBounds(380,160,200,100);
       //doctor1.setBounds(450,230,100,20);
       doctor2.setBounds(450,190,200,20);
       name1.setBounds(445,140,150,20);
       phonenumber1.setBounds(475,170,250,20);
       mobilenumber1.setBounds(480,200,250,20);
       choosenField.setBounds(380,230,100,20);
       doctor.setBounds(380,190,100,20);
       workinghoursfrom.setBounds(380,290,200,20);
       workinghoursfrom1.setBounds(530,290,100,20);
       workinghoursto.setBounds(380,320,200,20);
       workinghoursto1.setBounds(500,320,100,20);
       chosenshift.setBounds(380,350,100,20);
       chosenshift1.setBounds(450,350,100,20);
       remrserve.setBounds(380,380,200,20);
       timefrom.setBounds(380,230,100,20);
       timeto.setBounds(380,260,100,20);
       timefrom1.setBounds(450,230,100,20);
       timeto1.setBounds(450,260,100,20);
       remrserve1.setBounds(490,440,200,20);
       price.setBounds(380,470,100,20);
       price1.setBounds(450,290,100,20);
       welcome.setBounds(420,60,200,100);
       back.setBounds(0,0,50,50);
       delete.setBounds(480,530,70,25);
       add(back);
       add(welcome);
//       add(remrserve);
//       add(remrserve1);
       add(timefrom);
       add(timeto);
       add(timefrom1);
       add(timeto1);
       add(name);
      // add(doctor);
//       add(workinghoursfrom);
//       add(workinghoursto);
//       add(workinghoursfrom1);
//       add(workinghoursto1);
//       add(chosenshift);
//       add(chosenshift1);
       add(price);
       add(price1);
       add(name1);
       add(mobilenumber1);
       add(phonenumber1);
       //add(choosenField);
       add(doctor);
       add(phonenumber);
       add(mobilenumber);
//       add(doctor1);
       add(doctor2);
       add(delete);
       delete.addActionListener(new deletePatient());
       back.addActionListener(new back());
        }
         private class back implements ActionListener
    {
            @Override
            public void actionPerformed(ActionEvent ae) {
               ShowReservations m2 = null;
                try {
                    m2 = new ShowReservations();
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
        ArrayList <Reservation> listpat1 = null;
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
                Logger.getLogger(ShowOperationReservationsGui.class.getName()).log(Level.SEVERE, null, ex);
            }
         for(int i = 0;i<listpat1.size();i++)
         {
            if(listpat1.get(i).getPatname() == null ? searcharea.getText() == null : listpat1.get(i).getPatname().equals(searcharea.getText()))
            {
                listpat1.remove(listpat1.get(i));
                JOptionPane.showMessageDialog(null,"Reservation " +" deleted!");
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
                    patients = new ObjectOutputStream(new FileOutputStream("E:\\reservationso.bin"));
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
                JOptionPane.showMessageDialog(null,"Reservation not found ", "Error",JOptionPane.ERROR_MESSAGE);
            }
                
         } 

    }
    public void readpat() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream in = null;
        in = new ObjectInputStream(new FileInputStream("E:\\reservationso.bin"));
        listpat1 = null; 
        listpat1 = (ArrayList<Reservation>)in.readObject();
        in.close();
    }
    
    
        }
}
 
     
 }
}