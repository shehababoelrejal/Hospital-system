/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 *
 * @author lenovo
 */
public class Patient extends Profile implements IfileManger,Serializable{
   private Siblings Sibling; 

    public Siblings getSibling() {
        return Sibling;
    }

    public void setSibling(Siblings Sibling) {
        this.Sibling = Sibling;
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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getNeededMeds() {
        return neededMeds;
    }

    public void setNeededMeds(String neededMeds) {
        this.neededMeds = neededMeds;
    }

    public int getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(int operationCode) {
        this.operationCode = operationCode;
    }

    public Reservation getReserve() {
        return reserve;
    }

    public void setReserve(Reservation reserve) {
        this.reserve = reserve;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Profile[] getPerson() {
        return person;
    }

    public void setPerson(Profile[] person) {
        this.person = person;
    }
   private String hid;
   private String socialCondition;
   private float height;
   private float weight;
   private String medicalCondition;
   private String neededMeds;
   private int operationCode;
   private Reservation reserve = null;
   private int size=0;
   private Profile [] person =new Profile [size];
   
    @Override
    public void add(File myFile) 
    {
        
   
    }

    @Override
    public void edit() 
    {
        
    }

    @Override
    public void delete() 
    {
        
    }

    @Override
    public void display() 
    {
        
    }

    @Override
    public void search() 
    {
        
    }
}
