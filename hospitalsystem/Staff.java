/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

/**
 *
 * @author lenovo
 */
public abstract class Staff extends Profile {
   private String choosensalary;
  // private String salary[]={"1,500 L.E","1,000 L.E","2,000 L.E","3,000 L.E","3,500 L.E","4,500 L.E","5,000","7,000 L.E","10,000 L.E","15,000 L.E","20,000 L.E"};
   private  int  salary[]=new int[8 ];
   protected String Rank[]={"Senior","Junior","Head"};
   protected String shifts[]={"Night Shift","Day Shift","Early Morning Shift"};
   private String choosenRank;
   private String choosenShift;
   private short workinghoursfrom;
   private short workinghoursto;
   private String choosenshift;
   private String Choosensalary;
    public String getChoosensalary() {
        return choosensalary;
    }

    public void setChoosensalary(String choosensalary) {
        this.choosensalary = choosensalary;
    }

     public abstract int getsalary(int index) ;
   
    // public abstract void setsalary(int salary,int index ) ;
       public void setsalary(int salary,int index) {
       this.salary[index]=salary;
    }

    public String getChoosenShift() {
        return choosenShift;
    }

    public void setChoosenShift(String choosenShift) {
        this.choosenShift = choosenShift;
    }

    public String getChoosenshift() {
        return choosenshift;
    }

    public void setChoosenshift(String choosenshift) {
        this.choosenshift = choosenshift;
    }

    public short getWorkinghoursfrom() {
        return workinghoursfrom;
    }

    public void setWorkinghoursfrom(short workinghoursfrom) {
        this.workinghoursfrom = workinghoursfrom;
    }

    public short getWorkinghoursto() {
        return workinghoursto;
    }

    public void setWorkinghoursto(short workinghoursto) {
        this.workinghoursto = workinghoursto;
    }
   
    

    public String getChoosenRank() {
        return choosenRank;
    }

    public void setChoosenRank(String choosenRank) {
        this.choosenRank = choosenRank;
    }
   
}
