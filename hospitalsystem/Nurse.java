///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hospitalsystem;
//
///**
// *
// * @author lenovo
// */
//public class Nurse extends Staff {
//   protected String []expertises ={"Intensive care","operations","patient care"};
//   private String choosenExpertise;
//   private String hid;
//   private String socialCondition;
//
//    public String[] getExpertises() {
//        return expertises;
//    }
//
//    public void setExpertises(String[] expertises) {
//        this.expertises = expertises;
//    }
//
//    public String getChoosenExpertise() {
//        return choosenExpertise;
//    }
//
//    public void setChoosenExpertise(String choosenExpertise) {
//        this.choosenExpertise = choosenExpertise;
//    }
//
//    public String getHid() {
//        return hid;
//    }
//
//    public void setHid(String hid) {
//        this.hid = hid;
//    }
//
//    public String getSocialCondition() {
//        return socialCondition;
//    }
//
//    public void setSocialCondition(String socialCondition) {
//        this.socialCondition = socialCondition;
//    }
//   
//}
//
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
public class Nurse extends Staff {
   protected String []expertises ={"Intensive care","operations","patient care"};
   private String choosenExpertise;
   private String hid;
   private String socialCondition;
   private int [] salary={1500,2000,2500,3000,3500,4000,4500,5000,5500};

   
   public Nurse (){
    
//       setsalary(1500,0);
//       setsalary(2000,1);
//       setsalary(2500,2);
//       setsalary(3000,3);
//       setsalary(3500,4);
   }
   
   
    public String[] getExpertises() {
        return expertises;
    }

    public void setExpertises(String[] expertises) {
        this.expertises = expertises;
    }

    public String getChoosenExpertise() {
        return choosenExpertise;
    }

    public void setChoosenExpertise(String choosenExpertise) {
        this.choosenExpertise = choosenExpertise;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getSocialCondition() {
        return socialCondition;
    }

    public void setSocialCondition(String socialCondition) {
        this.socialCondition = socialCondition;
    }

    @Override
//    public void setsalary(int salary,int index) {
//       this.salary[index]=salary;
//    }
    public int getsalary(int index) {
        return salary[index];
    }
}

