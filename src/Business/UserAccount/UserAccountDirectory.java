/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;
import Business.UserAccount.UserAccount;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class UserAccountDirectory {
    
    private  ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password) && ua.getIsApproved()) {
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role, Boolean isApproved, String name, String email, String roleName){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setIsApproved(isApproved);
        userAccount.setEmail(email);
        userAccount.setName(name);
        userAccount.setRoleName(roleName);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public UserAccount searchUser(String userName){
        for (UserAccount ua: userAccountList) {
            if (ua.getUsername().equals(userName)) {
                return ua;
            }
        }
        return null;
    }
    
     public void updateItem(String userName, String fullName, String userEmail) {
        for(UserAccount ua: userAccountList){
            if(ua.getUsername().equalsIgnoreCase(userName)){
                ua.setName(fullName);
                ua.setEmail(userEmail);
            }
        }
    }
}
