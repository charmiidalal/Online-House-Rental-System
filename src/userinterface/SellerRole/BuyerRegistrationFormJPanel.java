/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SellerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anush
 */
public class BuyerRegistrationFormJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount useraccount;
    private Property property;
    private PropertyDirectory propertyDirectory;

    public BuyerRegistrationFormJPanel(JPanel userProcessContainer, Property property, EcoSystem system, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.system = system;
        this.property = property;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();

        txtHouse.setText(property.getPropertyName());
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uploadlbl = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnUpload = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 158, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Phone:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 208, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Address");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 255, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Email:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 355, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("NationalID");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 402, -1, -1));
        add(uploadlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 828, 288, -1));
        add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 159, 140, -1));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 209, 140, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 256, 140, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 356, 140, -1));
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 403, 140, -1));

        btnUpload.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnUpload.setText("Upload ID document");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 458, -1, 25));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 779, -1, -1));

        btnsubmit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 595, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("REGISTRATION FORM");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 37));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Zipcode");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 306, -1, -1));
        add(txtZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 307, 140, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Selected House");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 532, -1, 27));

        txtHouse.setEnabled(false);
        add(txtHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 534, 127, 27));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/70-512.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 410, 530));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 514, 269, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:

        String name = txtname.getText();
        String phone = txtPhone.getText();
        String address = txtAddress.getText();
        String zipcode = txtZipcode.getText();
        String email = txtEmail.getText();
        String nationalId = txtId.getText();
        String idDoc = uploadlbl.getText();

        // Buyer buyer = (this.buyerDirectory.getBuyer(name)) == null ? new Buyer() : this.buyerDirectory.getBuyer(name);
        if (name.isEmpty() || address.isEmpty() || phone.isEmpty() || zipcode.isEmpty() || nationalId.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the missing field to continue!");
        } else {
            useraccount.setName(name);
            useraccount.setPhone(phone);
            useraccount.setEmail(email);
            useraccount.setStreet(address);
            useraccount.setZipcode(zipcode);
            useraccount.setNationId(nationalId);
            useraccount.setIdDoc(idDoc);
            ArrayList<UserAccount> registeredBuyer = property.getRegisteredBuyer();
            registeredBuyer.add(useraccount);
            property.setRegisteredBuyer(registeredBuyer);
            JOptionPane.showMessageDialog(this, "Thank you for submitting the form!");
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        uploadlbl.setText(filename);
    }//GEN-LAST:event_btnUploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtZipcode;
    private javax.swing.JTextField txtname;
    private javax.swing.JLabel uploadlbl;
    // End of variables declaration//GEN-END:variables
}
