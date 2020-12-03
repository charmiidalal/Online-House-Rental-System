/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Agent.Agent;
import Business.Agent.AgentDirectory;
import Business.Builder.Builder;
import Business.Builder.BuilderDirectory;
import Business.Cleaner.Cleaner;
import Business.Cleaner.CleanerDirectory;
import Business.EcoSystem;
import Business.Electrician.Electrician;
import Business.Electrician.ElectricianDirectory;
import Business.Employee.Employee;
import Business.GovermentEmployee.GovermentEmployee;
import Business.GovermentEmployee.GovermentEmployeeDirectory;
import Business.Inspector.Inspector;
import Business.Inspector.InspectorDirectory;
import Business.PackersMovers.PackersMovers;
import Business.PackersMovers.PackersMoversDirectory;
import Business.Photographer.Photographer;
import Business.Photographer.PhotographerDirectory;
import Business.Plumber.Plumber;
import Business.Plumber.PlumberDirectory;
import Business.PropertyManager.PropertyManager;
import Business.PropertyManager.PropertyManagerDirectory;
import Business.Role.AgentRole;
import Business.Role.BuilderRole;
import Business.Role.CleaningRole;
import Business.Role.ElectricianRole;
import Business.Role.GovermentEmployeeRole;
import Business.Role.InspectorRole;
import Business.Role.PackersMoversRole;
import Business.Role.PhotographerRole;
import Business.Role.PlumbingRole;
import Business.Role.PropertyManagerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CreateSystemUsersJPanel extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final EcoSystem system;
    private final PhotographerDirectory photographerDirectory;
    private final InspectorDirectory inspectorDirectory;
    private final AgentDirectory agentDirectory;
    private final BuilderDirectory builderDirectory;
    private final PropertyManagerDirectory propertyManagerDirectory;
    private final ElectricianDirectory electricianDirectory;
    private final PlumberDirectory plumberDirectory;
    private final CleanerDirectory cleanerDirectory;
    private final PackersMoversDirectory packersMoversDirectory;
    private final GovermentEmployeeDirectory govermentEmployeeDirectory;

    public enum RoleType {
        Buyer("Buyer"),
        Seller("Seller"),
        Inspector("Inspector"),
        Agent("Agent"),
        Builder("Builder"),
        PropertyManager("Property Manager"),
        Electrician("Electrician"),
        Cleaning("Cleaner"),
        PackersMovers("Movers & Packers"),
        Photographer("Photographer"),
        Plumbing("Plumber"),
        GovermentEmployee("Goverment Employee");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public CreateSystemUsersJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.photographerDirectory = (system.getPhotographerDirectory() == null) ? new PhotographerDirectory() : system.getPhotographerDirectory();
        this.inspectorDirectory = (system.getInspectorDirectory() == null) ? new InspectorDirectory() : system.getInspectorDirectory();
        this.agentDirectory = (system.getAgentDirectory() == null) ? new AgentDirectory() : system.getAgentDirectory();
        this.builderDirectory = (system.getBuilderDirectory() == null) ? new BuilderDirectory() : system.getBuilderDirectory();
        this.propertyManagerDirectory = (system.getPropertyManagerDirectory() == null) ? new PropertyManagerDirectory() : system.getPropertyManagerDirectory();
        this.electricianDirectory = (system.getElectricianDirectory() == null) ? new ElectricianDirectory() : system.getElectricianDirectory();
        this.plumberDirectory = (system.getPlumberDirectory() == null) ? new PlumberDirectory() : system.getPlumberDirectory();
        this.cleanerDirectory = (system.getCleanerDirectory() == null) ? new CleanerDirectory() : system.getCleanerDirectory();
        this.packersMoversDirectory = (system.getPackersMoversDirectory() == null) ? new PackersMoversDirectory() : system.getPackersMoversDirectory();
        this.govermentEmployeeDirectory = (system.getGovermentEmployeeDirectory() == null) ? new GovermentEmployeeDirectory() : system.getGovermentEmployeeDirectory();
        populateComboBox();
    }

    public void populateComboBox() {
        comboboxRole.removeAllItems();
        for (RoleType role : RoleType.values()) {
            comboboxRole.addItem(role.getValue());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        comboboxRole = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Create User");

        jLabel2.setText("Name:");

        lblPassword.setText("Password:");

        jLabel4.setText("Username:");

        lblEmail.setText("Email:");

        jLabel6.setText("Role:");

        comboboxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addGap(24, 24, 24)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(193, 193, 193)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(98, 98, 98)
                        .addComponent(comboboxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addGap(47, 47, 47)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(btnSave)
                        .addGap(107, 107, 107)
                        .addComponent(backJButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(jLabel2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(comboboxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(backJButton))
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageSystemUsersJPanel manageSystemUsersJPanel = (ManageSystemUsersJPanel) component;
        manageSystemUsersJPanel.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            String emailAddress = txtEmail.getText();
            String username = lblUsername.getText();
            String name = txtFullName.getText();
            String password = txtPassword.getText();
            String userType = comboboxRole.getSelectedItem().toString();
            for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(username)) {
                    JOptionPane.showMessageDialog(null, "Username should be unique. UserName is already in use.");
                    return;
                }
            }
            if (usernamePatternCorrect() == false) {
                lblUsername.setForeground(Color.red);
                txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
                JOptionPane.showMessageDialog(null, "Username should be in the format of xx_xx@xx.xx");
                return;
            } else {
                lblUsername.setForeground(Color.BLACK);
                txtEmail.setBorder(BorderFactory.createLineBorder(Color.black));
            }
            if (passwordPatternCorrect() == false) {
                lblPassword.setForeground(Color.red);
                txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
                JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else {
                lblPassword.setForeground(Color.BLACK);
                txtPassword.setBorder(BorderFactory.createLineBorder(Color.black));
            }
            if (userType == "Photographer") {
                Photographer photographer = new Photographer();
                photographer.setPhotographerName(name);
                photographer.setPhotographerEmail(emailAddress);
                photographer.setPhotographerNo(photographerDirectory.generatePhotographerID());
                photographerDirectory.addPhotographer(photographer);
                Employee employee = system.getEmployeeDirectory().createEmployee(photographer.getPhotographerNo());
                PhotographerRole role = new PhotographerRole();
                system.setPhotographerDirectory(photographerDirectory);
                UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, employee, role, true, name, emailAddress, "Photographer");
            } else if (userType == "Inspector") {
                Inspector inspector = new Inspector();
                inspector.setInspectorName(name);
                inspector.setEmail(emailAddress);
                inspector.setStatus("Available");
                inspector.setInspectorNo(inspectorDirectory.generateInspectorID());
                inspectorDirectory.addInspector(inspector);
                Employee employee = system.getEmployeeDirectory().createEmployee(inspector.getInspectorNo());
                InspectorRole role = new InspectorRole();
                system.setInspectorDirectory(inspectorDirectory);
                UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, employee, role, true, name, emailAddress, "Inspector");
            } else if (userType == "Agent") {
                Agent agent = new Agent();
                agent.setAgentName(name);
                agent.setAgentEmail(emailAddress);
                agent.setAgentNo(agentDirectory.generateAgentID());
                agentDirectory.addAgent(agent);
                Employee employee = system.getEmployeeDirectory().createEmployee(agent.getAgentNo());
                AgentRole role = new AgentRole();
                system.setAgentDirectory(agentDirectory);
                UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, employee, role, true, name, emailAddress, "Agent");
            } else if (userType == "Builder") {
                Builder builder = new Builder();
                builder.setBuilderName(name);
                builder.setBuilderEmail(emailAddress);
                builder.setBuilderNo(builderDirectory.generateBuilderID());
                builderDirectory.addBuilder(builder);
                Employee employee = system.getEmployeeDirectory().createEmployee(builder.getBuilderNo());
                BuilderRole role = new BuilderRole();
                system.setBuilderDirectory(builderDirectory);
                UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, employee, role, true, name, emailAddress, "Builder");
            } else if (userType == "Property Manager") {
                PropertyManager propertyManager = new PropertyManager();
                propertyManager.setPropertyName(name);
                propertyManager.setPropertyEmail(emailAddress);
                propertyManager.setPropertyNo(propertyManagerDirectory.generatePropertyManagerID());
                propertyManagerDirectory.addPropertyManager(propertyManager);
                Employee employee = system.getEmployeeDirectory().createEmployee(propertyManager.getPropertyNo());
                PropertyManagerRole role = new PropertyManagerRole();
                system.setPropertyManagerDirectory(propertyManagerDirectory);
                UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, employee, role, true, name, emailAddress, "Property Manager");
            }  else if (userType == "Electrician") {
                Electrician electrician = new Electrician();
                electrician.setElectricianName(name);
                electrician.setElectricianEmail(emailAddress);
                electrician.setElectricianNo(electricianDirectory.generateElectricianID());
                electricianDirectory.addElectrician(electrician);
                Employee employee = system.getEmployeeDirectory().createEmployee(electrician.getElectricianNo());
                ElectricianRole role = new ElectricianRole();
                system.setElectricianDirectory(electricianDirectory);
                UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, employee, role, true, name, emailAddress, "Electrician");
            } else if (userType == "Plumber") {
                Plumber plumber = new Plumber();
                plumber.setPlumberName(name);
                plumber.setPlumberEmail(emailAddress);
                plumber.setPlumberNo(plumberDirectory.generatePlumberID());
                plumberDirectory.addPlumber(plumber);
                Employee employee = system.getEmployeeDirectory().createEmployee(plumber.getPlumberNo());
                PlumbingRole role = new PlumbingRole();
                system.setPlumberDirectory(plumberDirectory);
                UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, employee, role, true, name, emailAddress, "Plumber");
            } else if (userType == "Cleaner") {
                Cleaner cleaner = new Cleaner();
                cleaner.setCleanerName(name);
                cleaner.setCleanerEmail(emailAddress);
                cleaner.setCleanerNo(cleanerDirectory.generateCleanerID());
                cleanerDirectory.addCleaner(cleaner);
                Employee employee = system.getEmployeeDirectory().createEmployee(cleaner.getCleanerNo());
                CleaningRole role = new CleaningRole();
                system.setCleanerDirectory(cleanerDirectory);
                UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, employee, role, true, name, emailAddress, "Cleaner");
            } else if (userType == "Movers & Packers") {
                PackersMovers packersMovers = new PackersMovers();
                packersMovers.setPackersMoversName(name);
                packersMovers.setPackersMoversEmail(emailAddress);
                packersMovers.setPackersMoversNo(packersMoversDirectory.generatePackersMoversID());
                packersMoversDirectory.addPackersMovers(packersMovers);
                Employee employee = system.getEmployeeDirectory().createEmployee(packersMovers.getPackersMoversNo());
                PackersMoversRole role = new PackersMoversRole();
                system.setPackersMoversDirectory(packersMoversDirectory);
                UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, employee, role, true, name, emailAddress, "Movers & Packers");
            } else if (userType == "Goverment Employee") {
                GovermentEmployee govermentEmployee = new GovermentEmployee();
                govermentEmployee.setGovermentEmployeeName(name);
                govermentEmployee.setGovermentEmployeeEmail(emailAddress);
                govermentEmployee.setGovermentEmployeeNo(govermentEmployeeDirectory.generateGovermentEmployeeID());
                govermentEmployeeDirectory.addGovermentEmployee(govermentEmployee);
                Employee employee = system.getEmployeeDirectory().createEmployee(govermentEmployee.getGovermentEmployeeNo());
                GovermentEmployeeRole role = new GovermentEmployeeRole();
                system.setGovermentEmployeeDirectory(govermentEmployeeDirectory);
                UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, employee, role, true, name, emailAddress, "Goverment Employee");
            }
            JOptionPane.showMessageDialog(null, userType + " added successfully");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    private boolean usernamePatternCorrect() {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(txtEmail.getText());
        boolean b = m.matches();
        return b;
    }

    private boolean passwordPatternCorrect() {
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = p1.matcher(txtPassword.getText());
        boolean b1 = m1.matches();
        return b1;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboboxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
