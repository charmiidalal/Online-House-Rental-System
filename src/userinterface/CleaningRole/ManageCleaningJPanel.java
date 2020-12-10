/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CleaningRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dinesh
 */
public class ManageCleaningJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCleaningJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Enterprise enterprise;

    /**
     * Creates new form BuyerWorkAreaJpanel
     */
    public ManageCleaningJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = useraccount;
        this.enterprise = enterprise;
        populateRequestTable();
    }

    public void populateRequestTable() {
        txtName.setText(userAccount.getName());
        txtCharge.setText(userAccount.getCharge());
        txtCity.setText(userAccount.getCity());
        txtStatus.setText(userAccount.getState());
        txtZipcode.setText(userAccount.getZipcode());
        txtStreet.setText(userAccount.getStreet());
        txtEmail.setText(userAccount.getEmail());
        txtPhone.setText(userAccount.getPhone());
        txtStatus.setText(userAccount.getStatus());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        txtCharge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtCity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 87, 180, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 50, 80));
        jLabel2.setText("Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 89, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 50, 80));
        jLabel3.setText("Street");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 158, -1, -1));

        txtStreet.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.add(txtStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 156, 180, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 50, 80));
        jLabel6.setText("Phone:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 89, -1, -1));

        txtPhone.setBackground(new java.awt.Color(153, 204, 255));
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 87, 180, -1));

        txtEmail.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 156, 180, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(41, 50, 80));
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 158, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(41, 50, 80));
        jLabel8.setText("Zipcode:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 226, -1, -1));

        txtZipcode.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.add(txtZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 224, 180, -1));

        txtCharge.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.add(txtCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 297, 180, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(41, 50, 80));
        jLabel9.setText("Charge:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 299, -1, -1));

        txtState.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 297, 180, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 50, 80));
        jLabel5.setText("State");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 299, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(41, 50, 80));
        jLabel10.setText("Status");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 371, -1, -1));

        txtStatus.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 369, 180, -1));

        btnSave.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnSave.setForeground(new java.awt.Color(41, 50, 80));
        btnSave.setText("Save");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 398, -1, -1));

        txtCity.setBackground(new java.awt.Color(153, 204, 255));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        jPanel1.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 224, 180, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 50, 80));
        jLabel4.setText("City");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 226, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/cleaner.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 870, 450));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(25, 56, 82));
        jLabel11.setText("CLEANER PROFILE");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                String role = ua.getRole().toString();
                if ("Cleaning".equals(role)) {
                    try {
                        if (ua.getPhone().equalsIgnoreCase(txtPhone.getText())) {
                             JOptionPane.showMessageDialog(null, "Phone number already exists!Please enter another Phone number");
                            break;
                        }
                        else
                        {
                            userAccount.setName(txtName.getText());
                            userAccount.setCharge(txtCharge.getText());
                            userAccount.setCity(txtCity.getText());
                            userAccount.setStatus(txtStatus.getText());
                            userAccount.setZipcode(txtZipcode.getText());
                            userAccount.setStreet(txtStreet.getText());
                            userAccount.setEmail(txtEmail.getText());
                            userAccount.setPhone(txtPhone.getText());
                            userAccount.setState(txtState.getText());
                            JOptionPane.showMessageDialog(null, "Profile Updated Successfully!");
                        } 

                    } catch (NullPointerException ex) {
                        System.out.println("phone number exists");
                    }

                }
            }
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCharge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
