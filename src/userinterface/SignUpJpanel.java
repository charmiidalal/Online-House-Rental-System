/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Buyer.Buyer;
import Business.Buyer.BuyerDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.BuyerRole;
import Business.Role.SellerRole;
import Business.Seller.Seller;
import Business.Seller.SellerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author anush
 */
public class SignUpJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewManagerJPanel
     */
    JPanel cardSequenceJPanel;
    EcoSystem system;
    private final DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    BuyerDirectory buyerDirectory;
    SellerDirectory sellerDirectory;
    public static final int FIELD_LIST_COUNT = 6;

    private List<JTextField> fieldList = new ArrayList<JTextField>();

    public SignUpJpanel(JPanel cardSequenceJPanel, EcoSystem system, BuyerDirectory buyerDirectory, SellerDirectory sellerDirectory) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.system = system;
        this.buyerDirectory = buyerDirectory;
        this.sellerDirectory = sellerDirectory;
        populateComboBox();
        for (int i = 0; i < FIELD_LIST_COUNT; i++) {
            JTextField field = new JTextField();
            fieldList.add(field);
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

        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtFullName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UsrNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblCnfrmPass = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JTextField();
        signupJComboBox = new javax.swing.JComboBox();
        UsrNameLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");

        btnCreate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnCreate.setText("Sign Up");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username");

        UsrNameLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        UsrNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsrNameLabel.setText("Full Name");

        passwordLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sign Up As:");

        lblCnfrmPass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCnfrmPass.setText("Confirm Password");

        signupJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        signupJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupJComboBoxActionPerformed(evt);
            }
        });

        UsrNameLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        UsrNameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsrNameLabel1.setText("Email ID:");

        lblPhone.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhone.setText("Phone:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsrNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(176, 176, 176)
                                    .addComponent(lblCnfrmPass))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UsrNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)))
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(txtPhone)
                            .addComponent(txtEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(signupJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsrNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsrNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCnfrmPass)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        try {
            String emailAddress = txtEmail.getText();
            String username = txtUsername.getText();
            String name = txtFullName.getText();
            String password = txtPassword.getText();
            String userType = signupJComboBox.getSelectedItem().toString();
            String confirmpassword = txtConfirmPassword.getText();
            String phone = txtPhone.getText();
            for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(username)) {
                    JOptionPane.showMessageDialog(null, "Username should be unique. UserName is already in use.");
                    return;
                }
            }
            if (system.checkValidEmailFormat(emailAddress)) {
                system.setValidationAlert(UsrNameLabel, txtEmail, "Username should be in the format of xx_xx@xx.xx", true);
            } else {
                system.setValidationAlert(UsrNameLabel, txtEmail, "", false);
            }
            if (!system.checkValidPhoneFormat(phone)) {
                system.setValidationAlert(lblPhone, txtPhone, "Please enter correct form for phone number!", true);
            } else {
                system.setValidationAlert(lblPhone, txtPhone, "", false);
            }
            if (system.checkValidPasswordFormat(password)) {
                system.setValidationAlert(passwordLabel, txtPassword, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.", true);
            } else {
                system.setValidationAlert(passwordLabel, txtPassword, "", false);
            }
            if (password == null ? confirmpassword == null : password.equals(confirmpassword)) {
                system.setValidationAlert(lblCnfrmPass, txtConfirmPassword, "", false);
                if ("Buyer".equals(userType)) {
                    Buyer buyer = new Buyer();
                    buyer.setBuyerNo(buyerDirectory.generateBuyerID());
                    buyer.setBuyerName(name);
                    buyer.setBuyerEmail(emailAddress);
                    
                    this.buyerDirectory.addBuyer(buyer);
                    Employee employee = system.getEmployeeDirectory().createEmployee(buyer.getBuyerNo());
                    system.setBuyerDirectory(buyerDirectory);
                    UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, employee, new BuyerRole(), true, name, emailAddress, "Buyer");
                } else {
                    Seller seller = new Seller();
                    seller.setSellerNo(sellerDirectory.generateSellerID());
                    seller.setName(name);
                    seller.setUsername(username);
                    seller.setEmail(emailAddress);
                    seller.setIsApproved(false);
                    this.sellerDirectory.addSeller(seller);
                    Employee employee = system.getEmployeeDirectory().createEmployee(seller.getSellerNo());
                    system.setSellerDirectory(sellerDirectory);
                    UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, employee, new SellerRole(), false, name, emailAddress, "Seller");
                }
                dB4OUtil.storeSystem(system);
                emptyAllFields();
                JOptionPane.showMessageDialog(null, userType + " added successfully");
            } else {
                system.setValidationAlert(lblCnfrmPass, txtConfirmPassword, "Password does not match!", true);
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        cardSequenceJPanel.remove(this);
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void signupJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupJComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_signupJComboBoxActionPerformed
    public final void populateComboBox() {
        signupJComboBox.removeAllItems();
        signupJComboBox.addItem("Buyer");
        signupJComboBox.addItem("Seller");
    }

    public void emptyAllFields() {
        for (JTextField field : fieldList) {
            field.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UsrNameLabel;
    private javax.swing.JLabel UsrNameLabel1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCnfrmPass;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox signupJComboBox;
    private javax.swing.JTextField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
