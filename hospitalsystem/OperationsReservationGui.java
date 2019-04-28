//
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class OperationsReservationGui extends JFrame implements Serializable{
    public Reservation reserve;
    private JTextField id;
    private JLabel ID;  
    JComboBox conditions;
    private JLabel conditions1;
     ArrayList<Doctors> docs = new ArrayList<>();
     ArrayList<Reservation> res = new ArrayList<>();
     Reservation res1 = new Reservation();
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
    JTextField price1;
    JTextField timefrom1;
    JLabel timeto;
    JTextField timeto1;
    JTextField name1;
    JTextField phonenumber1;
    JTextField mobilenumber1;
    JComboBox  doctor1;
    JComboBox  doctor2;
    JButton save;
    JButton back;
    ObjectOutputStream in;
    Doctors p = new Doctors();
    String [] names=new String[100];
    public OperationsReservationGui () throws FileNotFoundException, IOException {
//        this.reserve = new Reservation();
//        this.id = new JTextField();
//        this.ID = new JLabel("id:");
//        this.conditions = new JComboBox(reserve.condition);
//        this.conditions1 = new JLabel("condition:");
        setSize(1000,600);
        setTitle("Hospital System");
        setLayout(null);
//        id.setBounds(410, 150, 100, 20);
//        ID.setBounds(380, 150, 50, 20);
//        conditions1.setBounds(380, 180, 100, 20);
//        conditions.setBounds(450, 180, 100, 20);
//        add(id);
//        add(ID);
//        add(conditions);
//        add(conditions1);
       this.in = new ObjectOutputStream(new FileOutputStream("E:\\reservationso.bin"));
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
       timefrom1 = new JTextField();
       timeto1 = new JTextField();
       name1= new JTextField();
       phonenumber1 = new JTextField();
       mobilenumber1 = new JTextField();
       price1 = new JTextField();
       choosenField = new JLabel("Conditions: ");
       doctor1 = new JComboBox (p.field);
       doctor2 = new JComboBox ();
       save = new JButton("Save");
      // doctor2.addActionListener(new chosencombo());
       setSize(1000,600);
       setTitle("Hospital System");
       setLayout(null);
       name.setBounds(380,100,200,100);
       phonenumber.setBounds(380,130,200,100);
       mobilenumber.setBounds(380,160,200,100);
       doctor1.setBounds(450,230,100,20);
       doctor2.setBounds(450,260,200,20);
       name1.setBounds(445,140,150,20);
       phonenumber1.setBounds(475,170,250,20);
       mobilenumber1.setBounds(480,200,250,20);
       choosenField.setBounds(380,230,100,20);
       doctor.setBounds(380,260,100,20);
       workinghoursfrom.setBounds(380,290,200,20);
       workinghoursfrom1.setBounds(530,290,100,20);
       workinghoursto.setBounds(380,320,200,20);
       workinghoursto1.setBounds(500,320,100,20);
       chosenshift.setBounds(380,350,100,20);
       chosenshift1.setBounds(450,350,100,20);
       remrserve.setBounds(380,380,200,20);
       timefrom.setBounds(380,410,100,20);
       timeto.setBounds(380,440,100,20);
       timefrom1.setBounds(450,410,100,20);
       timeto1.setBounds(450,440,100,20);
       remrserve1.setBounds(530,500,200,20);
       price.setBounds(380,470,100,20);
       price1.setBounds(450,470,100,20);
       save.setBounds(480,500,100,20);
       welcome.setBounds(420,60,200,100);
       back.setBounds(0,0,50,50);
       add(back);
       add(welcome);
       add(save);
       add(remrserve);
       add(remrserve1);
       add(timefrom);
       add(timeto);
       add(timefrom1);
       add(timeto1);
       add(name);
       add(doctor);
       add(workinghoursfrom);
       add(workinghoursto);
       add(workinghoursfrom1);
       add(workinghoursto1);
       add(chosenshift);
       add(chosenshift1);
       add(price);
       add(price1);
       add(name1);
       add(mobilenumber1);
       add(phonenumber1);
       add(choosenField);
       add(doctor);
       add(phonenumber);
       add(mobilenumber);
       add(doctor1);
       add(doctor2);
       //doctor1.addActionListener(new chosencombo());
         ActionListener cbActionListener = new ActionListener() {//add actionlistner to listen for change
             
            @Override
            public void actionPerformed(ActionEvent e) {
            Object buttonPressed=e.getSource();   
            if(buttonPressed.equals(conditions)){
            recommendDr();}
            if(buttonPressed.equals(save))
            {
                try{
                res1.setPatname(name1.getText());
                res1.setMobileno(mobilenumber1.getText());
                res1.setPhoneno(phonenumber1.getText());
                res1.setFrom(Integer.parseInt(timefrom1.getText()));
                res1.setTo(Integer.parseInt(timeto1.getText()));
                res1.setDoctorname(String.valueOf(doctor2.getSelectedItem()));
                res1.setChosenprice(Integer.parseInt(price1.getText()));
                res.add(res1);
                try {
                    in.writeObject(res);
                } catch (IOException ex) {
                    Logger.getLogger(ReservationsGui.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(ReservationsGui.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null,"Reservation of patient "+ res1.getPatname() +" added!");
                }
                catch(Exception e1){
                JOptionPane.showMessageDialog(null, "Invalid data");}
            }
            if(buttonPressed.equals(doctor2))
            {
                for(int i = 0; i<docs.size();i++)
                {
                    if(docs.get(i).getName().equals(doctor2.getSelectedItem()) )
                    {
                        workinghoursfrom1.setText(Integer.toString(docs.get(i).getWorkinghoursfrom()));
                        workinghoursto1.setText(Integer.toString(docs.get(i).getWorkinghoursto()));
                        chosenshift1.setText(docs.get(i).getChoosenShift());
                        remrserve1.setText(Integer.toString(docs.get(i).getRemainingrservations()));
                        docs.get(i).setRemainingrservations(docs.get(i).getRemainingrservations()-1);
                    }
                }
            }
            if(buttonPressed.equals(doctor1)){
                  try {
                readpat();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(ReservationGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i = 0; i<docs.size();i++)
            {
                if(docs.get(i).getChoosenField().equals(doctor1.getSelectedItem()) )
                {
                    names[i]=docs.get(i).getName();
                //doctor2.setModel(new DefaultComboBoxModel<>(names.toArray(new Doctors[i])));
                    doctor2.addItem(names[i]);
                    System.out.println("Shehab");
                 
                }
                
               
            }
             //System.out.println("Shehab");
             }
                 
         }
         
         };
////          conditions.addActionListener(cbActionListener);
           doctor2.addActionListener(cbActionListener);
            doctor1.addActionListener(cbActionListener);
            save.addActionListener(cbActionListener);
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
//   
     public void recommendDr(){

        String selection= (String) conditions.getSelectedItem();
        switch(selection){
            case "nerves":
                 System.out.println("dor");
                 break;
            case "vision":
                System.out.println("dor1");
                break;
            case "child":
                System.out.println("dor2");
                break;
            case "birth":
                System.out.println("dor3");
                break;
            case "bones pain":
                System.out.println("dor4");
                break;
            case "tumor":
                System.out.println("dor5"); 
                break;
            case"emergency":
                System.out.println("dor6");
                break;
            default:
                break;
                 
        }
        
      }
//      private class chosencombo implements ActionListener
//    {
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            try {
//                readpat();
//            } catch (IOException | ClassNotFoundException ex) {
//                Logger.getLogger(ReservationGUI.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            for(int i = 0; i<docs.size();i++)
//            {
//                if(docs.get(i).getChoosenField() == doctor1.getSelectedItem())
//                {
//                // doctor2.setModel(new DefaultComboBoxModel<>(docs.toArray(new Doctors[i])));
//                    doctor2.setModel(new DefaultComboBoxModel<>(docs.getName().toArray(new Doctors[i])));
//                 System.out.println("Shehab");
//                }
//                
//            }
//        }
//        
//    }
    public void readpat() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream in = null;
        in = new ObjectInputStream(new FileInputStream("E:\\doctors.bin"));
       
        docs = (ArrayList<Doctors>)in.readObject();
        in.close();
    }
}
