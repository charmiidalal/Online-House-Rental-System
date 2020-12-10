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
import Business.Role.ElectricianRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.ElectricianRequest;

/**
 *
 * @author Dinesh
 */
public class HireElectricianJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Property property;
    private Enterprise enterprise;
    private Network network;
    private Organization organization;

    /**
     * Creates new form BuyerWorkAreaJpanel
     */
    public HireElectricianJPanel(JPanel userProcess, Organization organization, Network network, Enterprise enterprise, Property property, UserAccount userAccount, EcoSystem system) {
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
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    String role = ua.getRole().toString();
                    if (ua.getRole() instanceof ElectricianRole) {
                        Object[] row = new Object[9];
                        row[0] = ua.getEmployee().getId();
                        row[1] = ua;
                        row[2] = ua.getCity();
                        row[3] = ua.getState();
                        row[4] = ua.getStatus();
                        row[5] = ua.getCharge();
                        row[6] = org.getName();
                        row[7] = network.getName();
                        row[8] = ua.getPhone();
                        model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        brnHireInspector = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        commentTxxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ElectricianID", "Name", "Address", "City", "State", "Zipcode", "Status", "Charge", "Organisation Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 781, 300));

        brnHireInspector.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        brnHireInspector.setText("Hire Electrician");
        brnHireInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnHireInspectorActionPerformed(evt);
            }
        });
        add(brnHireInspector, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Comment:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));
        add(commentTxxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 250, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/electricianop.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 386, -1));

        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 30, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("ELECTRICIAN LIST");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void brnHireInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnHireInspectorActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        UserAccount serviceAcc = (UserAccount) houseTable.getValueAt(selectedRow, 1);
        String comment = commentTxxt.getText();
        if (count == 1) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (serviceAcc.getUsername().equals(ua.getUsername())) {
                            if ("Available".equals(ua.getStatus())) {
                                ElectricianRequest cr = new ElectricianRequest();
                                cr.setRequestID();
                                cr.setBuyer(userAccount);
                                cr.setElectrician(serviceAcc);
                                cr.setSeller(property.getSeller());
                                cr.setStatus("Pending");
                                cr.setBuyerNote(comment);
                                cr.setProperty(property);
                                 e.getWorkQueue().getWorkRequestList().add(cr);
                                JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Sorry! This Electrician is already Occupied");

                            }
                        }
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
