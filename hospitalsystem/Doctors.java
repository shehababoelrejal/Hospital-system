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
public class Doctors extends Staff {
    private int priceperreserve;
    private int remainingrservations = 5;
    private String hid;
    private String socialCondition;
    String[] field={"brain-nerve surgery","general surgery","dentistry","tumors","obstetrics","children","radiation"};
    private int [] salary={4000,4500,5000,5500,6000,6500,7000,7500,8000};
    private String choosenField;

    public int getPriceperreserve() {
        return priceperreserve;
    }

    public void setPriceperreserve(int priceperreserve) {
        this.priceperreserve = priceperreserve;
    }
    
    public int getRemainingrservations() {
        return remainingrservations;
    }

    public void setRemainingrservations(int remainingrservations) {
        this.remainingrservations = remainingrservations;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String[] getField() {
        return field;
    }

    public void setField(String[] field) {
        this.field = field;
    }

    public String getChoosenField() {
        return choosenField;
    }

    public void setChoosenField(String choosenField) {
        this.choosenField = choosenField;
    }

    public String getSocialCondition() {
        return socialCondition;
    }

    public void setSocialCondition(String socialCondition) {
        this.socialCondition = socialCondition;
    }

    @Override
    public int getsalary(int index) {
        return salary[index];
    }

    


}
