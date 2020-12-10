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
import Business.Role.PlumbingRole;
import Business.SendSMS.SendSMS;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.PlumberRequest;

/**
 *
 * @author Dinesh
 */
public class HirePlumberJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Property property;

    private Enterprise enterprise;
    private Network network;
    private Organization organization;

    public HirePlumberJPanel(JPanel userProcess, Organization organization, Network network, Enterprise enterprise, Property property, UserAccount userAccount, EcoSystem system) {
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
                        if (ua.getRole() instanceof PlumbingRole) {
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

        brnHireInspector = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        commentTxxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 241, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brnHireInspector.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        brnHireInspector.setText("Hire Plumber");
        brnHireInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnHireInspectorActionPerformed(evt);
            }
        });
        add(brnHireInspector, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Comment:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));
        add(commentTxxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 300, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/plumberop.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 0, 470, 550));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("PLUMBER LIST");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, 30));

        jScrollPane1.setForeground(new java.awt.Color(41, 50, 80));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "City", "State", "Status", "Phone", "Charge", "OrganizationName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 790, 280));

        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/back.png"))); // NOI18N
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void brnHireInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnHireInspectorActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        String comment = commentTxxt.getText();
        UserAccount serviceAcc = (UserAccount) houseTable.getValueAt(selectedRow, 1);
        if (count > 1) {
            JOptionPane.showMessageDialog(null, "Please select one row!");
            return;
        } else if (comment.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for Comment note!");
            return;
        } else if (!serviceAcc.getStatus().equals("Available")) {
            JOptionPane.showMessageDialog(null, "Sorry! This Inspector is already Occupied");
            return;
        }
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    if (serviceAcc.getUsername().equals(ua.getUsername())) {
                        PlumberRequest cr = new PlumberRequest();
                        cr.setRequestID();
                        cr.setBuyer(userAccount);
                        cr.setPlumber(serviceAcc);
                        cr.setSeller(property.getSeller());
                        cr.setStatus("Pending");
                        cr.setBuyerNote(comment);
                        cr.setProperty(property);
                        e.getWorkQueue().getWorkRequestList().add(cr);
                        JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
                        SendSMS sms = new SendSMS(serviceAcc.getPhone(), "Hello! You have one new work request! Please login to know more!");
                        EcoSystem.sendEmailMessage(serviceAcc.getEmail(), "Hello! You have one new work request! Please login to know more!");
                    }
                }
            }
        }
    }//GEN-LAST:event_brnHireInspectorActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnHireInspector;
    private javax.swing.JButton btnBack1;
    private javax.swing.JTextField commentTxxt;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
