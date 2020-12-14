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
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.BuilderRequest;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author Dinesh
 */
public class ManageBuilderActivity extends javax.swing.JPanel {

    /**
     * Creates new form ManageBuilderActivity
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
    public ManageBuilderActivity(JPanel userProcess, UserAccount userAccount, EcoSystem system, Enterprise enterprise, Network network, Organization organization) {
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
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.Property) {
                for (WorkRequest workRequest : e.getWorkQueue().getWorkRequestList()) {
                    if (workRequest instanceof BuilderRequest) {
                        if (userAccount.getUsername().equals(((BuilderRequest) workRequest).getBuyer().getUsername())) {
                            Object[] row = new Object[model.getColumnCount()];
                            row[0] = ((BuilderRequest) workRequest);
                            row[1] = ((BuilderRequest) workRequest).getBuilder().getName();
                            row[2] = ((BuilderRequest) workRequest).getSeller().getName();
                            row[3] = ((BuilderRequest) workRequest).getProperty().getStreet();
                            row[4] = ((BuilderRequest) workRequest).getProperty().getCity();
                            row[5] = ((BuilderRequest) workRequest).getProperty().getState();
                            row[6] = ((BuilderRequest) workRequest).getProperty().getPincode();
                            row[7] = ((BuilderRequest) workRequest).getStatus();
                            row[8] = ((BuilderRequest) workRequest).getBuyerNote();
                            row[9] = ((BuilderRequest) workRequest).getInspectorNote();
                            row[10] = ((BuilderRequest) workRequest).getBuilder().getCharge();
                            row[11] = ((BuilderRequest) workRequest).getQuote();
                            row[12] = ((BuilderRequest) workRequest).getOrgType();
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCompleteJob = new javax.swing.JButton();
        txtFeedback = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("VIEW BUILDER JOB LIST");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Feedback:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        btnCompleteJob.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCompleteJob.setForeground(new java.awt.Color(0, 0, 51));
        btnCompleteJob.setText("Send Message");
        btnCompleteJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteJobActionPerformed(evt);
            }
        });
        add(btnCompleteJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));
        add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 270, -1));

        jLabel4.setBackground(new java.awt.Color(241, 241, 242));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/builder.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 145, 320));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Builder", "Seller", "Street", "City", "State", "Zipcode", "Status", "Buyer Message", "Builder Message", "Charge", "Quote", "OrgType"
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 960, 270));

        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/back.png"))); // NOI18N
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 40, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteJobActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        if (selectedRow >= 0) {
            BuilderRequest br = (BuilderRequest) houseTable.getValueAt(selectedRow, 0);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtFeedback;
    // End of variables declaration//GEN-END:variables
}
