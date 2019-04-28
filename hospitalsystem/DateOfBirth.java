/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import java.io.Serializable;


public class DateOfBirth implements Serializable{
    private String year ;
    private int month;
    private int day;
public DateOfBirth()
    {
        year = "0";
        month = 0;
        day = 0;
    }
   public void setMonth(int month)
   {
      do 
      {
          this.month=month;
      }
       while (month <1||month >12);
   }
   public void setYear (String year)
   {
       this.year=year;
       
               
   }
   public void setDay (int day)
   {
       if (this.month==1||this.month==3||this.month==5||this.month==7||this.month==8||this.month==10||this.month==12)
       {
           do 
           {
               this.day=day;
           }
           while(day<1&&day>31);
       }
       else if (this.month==4||this.month==6||this.month==9||this.month==11)
       {
           do 
           {
               this.day=day;
           }
           while(day<1&&day>30);
       }
       else if (this.month==2)
       {
           do 
           {
               this.day=day;
           }
           while(day<1&&day>28);
       }
   }
   public int getDay()
   {
       return this.day;
   }
   public int getMonth()
   {
       return this.month;
   }
   public String getYear()
   {
       return this.year;
   }
}
