/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccount {

    private String username;
    private String password;
    private String email;
    private String name;
    private String roleName;
    private Boolean isApproved = true;
    public Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private Enterprise userEnterpriseList;
    private Organization userOrganizationList;

    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public Enterprise getUserEnterpriseList() {
        return userEnterpriseList;
    }

    public void setUserEnterpriseList(Enterprise userEnterpriseList) {
        this.userEnterpriseList = userEnterpriseList;
    }

    public Organization getUserOrganizationList() {
        return userOrganizationList;
    }

    public void setUserOrganizationList(Organization userOrganizationList) {
        this.userOrganizationList = userOrganizationList;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    @Override
    public String toString() {
        return username;
    }

    public Object getUserAccountDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    
}
