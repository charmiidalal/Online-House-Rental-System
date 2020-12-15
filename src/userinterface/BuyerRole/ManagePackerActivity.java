/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuyerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Organization.Organization;
import Business.WorkQueue.PackerRequest;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author Dinesh
 */
public class ManagePackerActivity extends javax.swing.JPanel {

    /**
     * Creates new form ViewPackerJobs
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private PropertyDirectory propertyDirectory;
    private Enterprise enterprise;
    private Network network;
    private Organization organization;

    /**
     * Creates new form ViewCleanerJobs
     */
    public ManagePackerActivity(JPanel userProcess, UserAccount userAccount, EcoSystem system, Enterprise enterprise, Network network, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.network = network;
        this.organization = organization;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType() == Enterprise.EnterpriseType.ServiceProvider) {
                    for (WorkRequest workRequest : e.getWorkQueue().getWorkRequestList()) {
                        if (workRequest instanceof PackerRequest) {
                            if (userAccount.getUsername().equals(((PackerRequest) workRequest).getBuyer().getUsername())) {
                                Object[] row = new Object[model.getColumnCount()];
                                row[0] = ((PackerRequest) workRequest);
                                row[1] = ((PackerRequest) workRequest).getPacker().getName();
                                row[2] = ((PackerRequest) workRequest).getSeller().getName();
                                row[3] = ((PackerRequest) workRequest).getProperty().getStreet();
                                row[4] = ((PackerRequest) workRequest).getProperty().getCity();
                                row[5] = ((PackerRequest) workRequest).getProperty().getState();
                                row[6] = ((PackerRequest) workRequest).getProperty().getPincode();
                                row[7] = ((PackerRequest) workRequest).getStatus();
                                row[8] = ((PackerRequest) workRequest).getBuyerNote();
                                row[9] = ((PackerRequest) workRequest).getInspectorNote();
                                row[10] = ((PackerRequest) workRequest).getPacker().getCharge();
                                row[11] = ((PackerRequest) workRequest).getQuote();
                                row[12] = ((PackerRequest) workRequest).getOrgType();
                                model.addRow(row);
                            }
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
        jLabel1 = new javax.swing.JLabel();
        txtFeedback = new javax.swing.JTextField();
        btnCompleteJob = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 241, 242));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Feedback:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));
        jPanel1.add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 250, -1));

        btnCompleteJob.setBackground(new java.awt.Color(204, 204, 204));
        btnCompleteJob.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCompleteJob.setForeground(new java.awt.Color(0, 0, 51));
        btnCompleteJob.setText("Send Message");
        btnCompleteJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteJobActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompleteJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/delivery-truck.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 150, 230));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Packer", "Seller", "Street", "City", "State", "Zipcode", "Status", "Buyer Message", "Packer Message", "Charge", "Quote", "OrgType"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(houseTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 960, 260));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("VIEW MOVERS & PACKERS JOB LIST");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, 30));

        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/back.png"))); // NOI18N
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 40, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteJobActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();

        if (selectedRow >= 0) {
            PackerRequest br = (PackerRequest) houseTable.getValueAt(selectedRow, 0);
            String feedback = txtFeedback.getText();
            if (feedback.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for feedback");
                return;
            }
            br.setBuyerNote(feedback);
            populateRequestTable();
            JOptionPane.showMessageDialog(null, "Message Sent Successfully!");

        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnCompleteJobActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCompleteJob;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtFeedback;
    // End of variables declaration//GEN-END:variables
}
