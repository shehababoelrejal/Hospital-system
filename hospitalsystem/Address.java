/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import java.io.Serializable;

/**
 *
 * @author lenovo
 */
public class Address implements Serializable
{
    private int blockNo ;
    private String street = new String();
    private String city = new String();
    private String goverment = new String();
    public Address(int blockNo, String street, String city, String goverment) {
        this.blockNo = blockNo;
        this.street = street;
        this.city = city;
        this.goverment = goverment;
    }
    
    public int getBlockNo() {
        return blockNo;
    }

    public void setBlockNo(int blockNo) {
        this.blockNo = blockNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGoverment() {
        return goverment;
    }

    public void setGoverment(String goverment) {
        this.goverment = goverment;
    }
}
