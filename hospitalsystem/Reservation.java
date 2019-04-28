/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Reservation implements Serializable{
    private int chosenprice;
    private String patname;
    private String mobileno;
    private String phoneno;
    private String doctorname;
    private int from;
    private int to;
   private Examinations exam;
   private Operations operation;
   private int accessionNo;
   private int reservationNo;
   protected String condition[]={"Choose a Condition","nerves","vision","child","birth","bones pain","tumor","emergency"};
   private Payment pay;
   private Doctors dr =new Doctors() ;
   private Patient pat =new Patient();

    public int getChosenprice() {
        return chosenprice;
    }

    public void setChosenprice(int chosenprice) {
        this.chosenprice = chosenprice;
    }
   
    public String getDoctorname() {
        return doctorname;
    }

//   public void recommendDr(ReservationGUI res){
//      if (String.valueOf(res.conditions.getSelectedItem()).equals("nerves")){
//          System.out.println("dor");
//      }
//      else if (String.valueOf(res.conditions.getSelectedItem()).equals("vision")){
//          System.out.println("dor1");
//      }
//      else if (String.valueOf(res.conditions.getSelectedItem()).equals("child")){
//          System.out.println("dor2");
//      }
//      else if (String.valueOf(res.conditions.getSelectedItem()).equals("birth")){
//          System.out.println("dor3");
//      }
//      else if (String.valueOf(res.conditions.getSelectedItem()).equals("bones pain")){
//          System.out.println("dor4");
//      }
//      else if (String.valueOf(res.conditions.getSelectedItem()).equals("tumor")){
//          System.out.println("do5");
//      }
//      else if (String.valueOf(res.conditions.getSelectedItem()).equals("emergency")){
//          System.out.println("dor6");
//      }
//      }
    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getPatname() {
        return patname;
    }

    public void setPatname(String patname) {
        this.patname = patname;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public Examinations getExam() {
        return exam;
    }

    public void setExam(Examinations exam) {
        this.exam = exam;
    }

    public Operations getOperation() {
        return operation;
    }

    public void setOperation(Operations operation) {
        this.operation = operation;
    }

    public Payment getPay() {
        return pay;
    }

    public void setPay(Payment pay) {
        this.pay = pay;
    }

    public int getAccessionNo() {
        return accessionNo;
    }

    public void setAccessionNo(int accessionNo) {
        this.accessionNo = accessionNo;
    }

    public int getReservationNo() {
        return reservationNo;
    }

    public void setReservationNo(int reservationNo) {
        this.reservationNo = reservationNo;
    }
   
    
}
