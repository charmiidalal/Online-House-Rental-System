/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

/**
 *
 * @author anush
 */
public class House {
    private String name;
    private String number;
    private int bhk;
    private double rent;
    private double bathroom;
    private String type;
    private String status;   
   
    public House(String name,String number, int bhk,double bathroom,double rent,String type,String status) {
       this.name = name;
       this.number=number;
       this.bhk=bhk;
       this.bathroom=bathroom;
       this.rent=rent;
       this.type=type;
       this.status=status;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBhk() {
        return bhk;
    }

    public void setBhk(int bhk) {
        this.bhk = bhk;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getBathroom() {
        return bathroom;
    }

    public void setBathroom(double bathroom) {
        this.bathroom = bathroom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
  
   
    @Override
    public String toString() {
        return this.name;
    }
}
