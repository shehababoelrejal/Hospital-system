
package hospitalsystem;

import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFrame;


public class HospitalSystem 
{
       
    public static void main (String[] args) throws FileNotFoundException, IOException, HeadlessException, ClassNotFoundException 
    {
//          ReservationsGui r = new ReservationsGui();
//          r.setVisible(true);
//          r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Menu m = new Menu();
//        m.setVisible(true);
//        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Login L = new Login();
        L.setVisible(true);
        L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
