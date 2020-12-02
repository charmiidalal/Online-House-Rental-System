/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Photographer;

/**
 *
 * @author Charmi Dalal
 */
public class Photographer {

    private String photographerNo;
    private String photographerName;
    private String photographerPhone;
    private String photographerEmail;

    public String getRole() {
        return "Photographer";
    }

    public String getPhotographerNo() {
        return photographerNo;
    }

    public void setPhotographerNo(String photographerNo) {
        this.photographerNo = photographerNo;
    }

    public String getPhotographerName() {
        return photographerName;
    }

    public void setPhotographerName(String photographerName) {
        this.photographerName = photographerName;
    }

    public String getPhotographerPhone() {
        return photographerPhone;
    }

    public void setPhotographerPhone(String photographerPhone) {
        this.photographerPhone = photographerPhone;
    }

    public String getPhotographerEmail() {
        return photographerEmail;
    }

    public void setPhotographerEmail(String photographerEmail) {
        this.photographerEmail = photographerEmail;
    }
    
}
