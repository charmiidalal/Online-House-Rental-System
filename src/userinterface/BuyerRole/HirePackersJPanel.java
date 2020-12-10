/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuyerRole;

import Business.Buyer.Buyer;
import Business.Buyer.BuyerDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.PackersMovers.PackersMovers;
import Business.PackersMovers.PackersMoversDirectory;
import Business.Property.Property;
import Business.Role.PackersMoversRole;
import Business.Seller.Seller;
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
    private BuyerDirectory buyerDirectory;
    private Buyer buyer;
    private Property property;
   
    private Enterprise enterprise;
    private Network network;
    private Organization organization;

    public HirePackersJPanel(JPanel userProcess, Organization organization, Network network, Enterprise enterprise, Property property, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.buyer = buyer;
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
                            Object[] row = new Object[9];
                            row[0] = ua.getEmployee().getName();
                            row[1] = ua.getUsername();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        brnHireInspector = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        commentTxxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PackerID", "Name", "Address", "City", "State", "Zipcode", "Status", "Charge", "Organisation Name"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 760, 210));

        brnHireInspector.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        brnHireInspector.setForeground(new java.awt.Color(0, 0, 51));
        brnHireInspector.setText("Hire Packer");
        brnHireInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnHireInspectorActionPerformed(evt);
            }
        });
        jPanel1.add(brnHireInspector, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 120, 20));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 30, 30, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Comment:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, -1, -1));
        jPanel1.add(commentTxxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 470, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/mover.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 700, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        String cleanerID = (String) houseTable.getValueAt(selectedRow, 0);
        String comment = commentTxxt.getText();
        if (count == 1) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {

                    //UserAccount ua = org.getUserAccountDirectory().searchUser(cleanerID);
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equalsIgnoreCase(cleanerID)) //UserAccount uaFound=org.getUserAccountDirectory().searchUser(cleanerID);
                        // UserAccount ua=org.getUserAccountDirectory().searchUser(cleanerID);
                        {
                            if ("Available".equals(ua.getStatus())) {
                                PackerRequest cr = new PackerRequest();
                                cr.setRequestID();
                                cr.setBuyer(buyer);
                                cr.setPacker((PackersMovers) userAccount);
                                cr.setSeller((Seller) property.getSeller());
                                cr.setStatus("Requested");
                                cr.setBuyerNote(comment);
                                cr.setProperty(property);
                               
                                JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Sorry! This Packer is already Occupied");

                            }
                        }
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_brnHireInspectorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnHireInspector;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField commentTxxt;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
