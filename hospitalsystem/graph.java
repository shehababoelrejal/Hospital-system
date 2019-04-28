/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;






import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class graph extends JFrame{
         ArrayList <Doctors> listpat;

         
         public graph(){

             setTitle("Graphs");
             
             setLayout(null);
             
             listpat=new  ArrayList <Doctors>();
         }
          public void paint(Graphics g){
        super.paint(g);
             try {
                 g.drawRect(50,50,numOfdoc()*10,20);
             } catch (IOException ex) {
                 Logger.getLogger(graph.class.getName()).log(Level.SEVERE, null, ex);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(graph.class.getName()).log(Level.SEVERE, null, ex);
             }
    }
         
     public int numOfdoc() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream in = null;
        in = new ObjectInputStream(new FileInputStream("E:\\doctors.bin"));

        listpat = null; 
        listpat = (ArrayList<Doctors>)in.readObject();
        in.close();
        return listpat.size();
    }
}


