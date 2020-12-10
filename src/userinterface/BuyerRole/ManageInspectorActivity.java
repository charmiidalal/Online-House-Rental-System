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
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.InspectRequest;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author dinesh
 */
public class ManageInspectorActivity extends javax.swing.JPanel {

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
    public ManageInspectorActivity(JPanel userProcess, UserAccount userAccount, EcoSystem system,Enterprise enterprise, Network network, Organization organization) {
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

        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {

            if (workRequest instanceof InspectRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = ((InspectRequest) workRequest).getRequestID();
                row[2] = ((InspectRequest) workRequest).getInspector().getName();
                row[3] = ((InspectRequest) workRequest).getSeller().getName();
                row[4] = ((InspectRequest) workRequest).getProperty().getStreet();
                row[5] = ((InspectRequest) workRequest).getProperty().getCity();
                row[6] = ((InspectRequest) workRequest).getProperty().getState();
                row[7] = ((InspectRequest) workRequest).getProperty().getPincode();
                row[8] = ((InspectRequest) workRequest).getStatus();
                row[9] = ((InspectRequest) workRequest).getBuyerNote();
                row[10] = ((InspectRequest) workRequest).getInspectorNote();
                row[11] = ((InspectRequest) workRequest).getInspector().getCharge();
                row[12] = ((InspectRequest) workRequest).getQuote();
                row[13] = ((InspectRequest) workRequest).getOrgType();
                

                model.addRow(row);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtFeedback = new javax.swing.JTextField();
        btnCompleteJob = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Inspector", "Seller", "Street", "City", "State", "Zipcode", "Status", "Buyer Message", "Inspector Message", "Charge", "Quote", "OrgType"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(houseTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 740, 270));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Feedback:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));
        add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 282, -1));

        btnCompleteJob.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCompleteJob.setForeground(new java.awt.Color(0, 0, 51));
        btnCompleteJob.setText("Send Message");
        btnCompleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteJobActionPerformed(evt);
            }
        });
        add(btnCompleteJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/detective (1).png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 170, 250));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 30, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("VIEW JOB LIST");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteJobActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
       
        if (selectedRow >= 0) {
            InspectRequest br = (InspectRequest)houseTable.getValueAt(selectedRow, 0);
            String feedback = txtFeedback.getText();
            

            if (!"".equals(feedback)) {
              
                br.setBuyerNote(feedback);
                populateRequestTable();
                JOptionPane.showMessageDialog(null, "Message Sent Successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Please enter feedback!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnCompleteJobActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompleteJob;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtFeedback;
    // End of variables declaration//GEN-END:variables
}
