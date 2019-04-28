/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class ReservationGUI extends JFrame {
    public Reservation reserve;
    private JTextField id;
    private JLabel ID;  
    JComboBox conditions;
    private JLabel conditions1;

    public ReservationGUI (){
        this.reserve = new Reservation();
        this.id = new JTextField();
        this.ID = new JLabel("id:");
        this.conditions = new JComboBox(reserve.condition);
        this.conditions1 = new JLabel("condition:");
        setSize(1000,600);
        setTitle("Hospital System");
        setLayout(null);
        id.setBounds(410, 150, 100, 20);
        ID.setBounds(380, 150, 50, 20);
        conditions1.setBounds(380, 180, 100, 20);
        conditions.setBounds(450, 180, 100, 20);
        add(id);
        add(ID);
        add(conditions);
        add(conditions1);
         ActionListener cbActionListener = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {
                recommendDr();
                 
         }
         
         };
          conditions.addActionListener(cbActionListener);
        
    }
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
}
