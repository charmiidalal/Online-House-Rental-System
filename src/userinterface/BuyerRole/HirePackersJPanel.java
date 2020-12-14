/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuyerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Property.Property;
import Business.Role.PackersMoversRole;
import Business.SendSMS.SendSMS;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.PackerRequest;

/**
 *
 * @author Dinesh
 */
public class HirePackersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HirePackersJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Property property;

    private Enterprise enterprise;
    private Network network;
    private Organization organization;

    public HirePackersJPanel(JPanel userProcess, Organization organization, Network network, Enterprise enterprise, Property property, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.property = property;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.network = network;
        this.organization = organization;

        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getRole() instanceof PackersMoversRole) {
                            Object[] row = new Object[8];
                            row[0] = ua.getEmployee().getId();
                            row[1] = ua;
                            row[2] = ua.getCity();
                            row[3] = ua.getState();
                            row[4] = ua.getStatus();
                            row[5] = ua.getPhone();
                            row[6] = ua.getCharge();
                            row[7] = org.getName();
                            model.addRow(row);
                        }
                    }
                }
            }
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

        jPanel1 = new javax.swing.JPanel();
        brnHireInspector = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        commentTxxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        btnBack3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(241, 241, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brnHireInspector.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        brnHireInspector.setForeground(new java.awt.Color(0, 0, 51));
        brnHireInspector.setText("Hire Packer");
        brnHireInspector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brnHireInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnHireInspectorActionPerformed(evt);
            }
        });
        jPanel1.add(brnHireInspector, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 120, 20));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Comment:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));
        jPanel1.add(commentTxxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 470, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/mover.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 700, 360));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("MOVERS & PACKERS LIST");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 30));

        jScrollPane1.setForeground(new java.awt.Color(41, 50, 80));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "City", "State", "Status", "Phone", "Charge", "OrganizationName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houseTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 790, 300));

        btnBack3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/back.png"))); // NOI18N
        btnBack3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1029, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void brnHireInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnHireInspectorActionPerformed
       int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
       
        
        if(count==1){
            if(selectedRow >=0){
                UserAccount serviceAcc = (UserAccount) houseTable.getValueAt(selectedRow, 1);
                String comment = commentTxxt.getText();
            if (comment.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for Comment note!");
            return;
        } else if (!serviceAcc.getStatus().equals("Available")) {
            JOptionPane.showMessageDialog(null, "Sorry! This Plumber is already Occupied");
            return;
        }
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    if (serviceAcc.getUsername().equals(ua.getUsername())) {
                        PackerRequest cr = new PackerRequest();
                        cr.setRequestID();
                        cr.setBuyer(userAccount);
                        cr.setPacker(serviceAcc);
                        cr.setSeller(property.getSeller());
                        cr.setStatus("Pending");
                        cr.setBuyerNote(comment);
                        cr.setProperty(property);
                        cr.setOrgType(org.getType());
                        e.getWorkQueue().getWorkRequestList().add(cr);
                        JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
                        SendSMS sms = new SendSMS(serviceAcc.getPhone(), "Hello! You have one new work request! Please login to know more!");
                        EcoSystem.sendEmailMessage(serviceAcc.getEmail(), "Hello! You have one new work request! Please login to know more!");
                    }
                }
            }
        }
        }
            }else{
                JOptionPane.showMessageDialog(null,"Please select one row!");
            }
    }//GEN-LAST:event_brnHireInspectorActionPerformed

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnHireInspector;
    private javax.swing.JButton btnBack3;
    private javax.swing.JTextField commentTxxt;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
