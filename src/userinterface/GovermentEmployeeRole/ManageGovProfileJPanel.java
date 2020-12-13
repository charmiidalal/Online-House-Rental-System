/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovermentEmployeeRole;

import userinterface.SellerRole.*;
import Business.EcoSystem;
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dinesh
 */
public class ManageGovProfileJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private PropertyDirectory propertyDirectory;

    /**
     * Creates new form BuyerWorkAreaJpanel
     */
    public ManageGovProfileJPanel(JPanel userProcess, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.userAccount = userAccount;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        populateRequestTable();
    }

    public void populateRequestTable() {
        txtName.setText(userAccount.getName());
        txtCity.setText(userAccount.getCity());
        txtZipcode.setText(userAccount.getZipcode());
        txtStreet.setText(userAccount.getStreet());
        txtEmail.setText(userAccount.getEmail());
        txtPhone.setText(userAccount.getPhone());
        txtState.setText(userAccount.getState());
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
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtState = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 242));
        setForeground(new java.awt.Color(0, 0, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("MANAGE PROFILE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 43));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 200, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Street");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));
        add(txtStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 200, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("City:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 200, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("State");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Phone:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 200, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Email:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 200, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Zipcode:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));
        add(txtZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 200, -1));

        btnSave.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 140, 50));
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 200, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/house5.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 1020, 640));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/best-seller.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(system.isNull(txtName.getText()) || system.isNull(txtCity.getText())
           || system.isNull(txtZipcode.getText()) || system.isNull(txtStreet.getText())
           || system.isNull(txtEmail.getText()) || system.isNull(txtPhone.getText()) || system.isNull(txtState.getText())){
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
            return;
        }else if(!system.isInt(txtZipcode.getText()) || txtZipcode.getText().length() != 5){
            JOptionPane.showMessageDialog(null, "Please enter valid 5 digit zipcode!");
            return;
        }else if(!system.checkValidPhoneFormat(txtPhone.getText())){
            return;
        }else if(!system.checkValidEmailFormat(txtEmail.getText())){
            return;
        }else if(!system.checkIfEmailIsUnique(txtEmail.getText(), userAccount.getUsername())){
            return;
        }else if(!system.checkIfPhoneIsUnique(txtPhone.getText(), userAccount.getUsername())){
            return;
        }
        userAccount.setName(txtName.getText());
        userAccount.setCity(txtCity.getText());
        userAccount.setZipcode(txtZipcode.getText());
        userAccount.setStreet(txtStreet.getText());
        userAccount.setEmail(txtEmail.getText());
        userAccount.setPhone(txtPhone.getText());
        userAccount.setState(txtState.getText());
        JOptionPane.showMessageDialog(null, "Profile Updated Successfully!");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
