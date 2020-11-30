/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Agent;

import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class Agent {

    private String name ;
    private String userName;
    private String password;
    private String phone;

    public Agent(String name, String userName, String password, String phone) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
   

}
