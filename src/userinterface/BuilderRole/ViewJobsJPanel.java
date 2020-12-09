/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuilderRole;

import Business.WorkQueue.BuilderRequest;
import Business.Buyer.BuyerDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Property.PropertyDirectory;
import Business.Seller.SellerDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dinesh
 */
public class ViewJobsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJobsJPanel
  private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Enterprise enterprise;

* 
    /**
     * Creates new form BuyerWorkAreaJpanel
     */
      private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Enterprise enterprise;

    public ViewJobsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);

        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {

            if (workRequest instanceof BuilderRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = ((BuilderRequest) workRequest).getBuyer().getName();
                row[2] = ((BuilderRequest) workRequest).getSeller().getName();
                row[3] = ((BuilderRequest) workRequest).getProperty().getStreet();
                row[4] = ((BuilderRequest) workRequest).getProperty().getCity();
                row[5] = ((BuilderRequest) workRequest).getProperty().getState();
                row[6] = ((BuilderRequest) workRequest).getProperty().getPincode();
                row[7] = ((BuilderRequest) workRequest).getStatus();
                row[8] = ((BuilderRequest) workRequest).getBuyerNote();
                row[9] = ((BuilderRequest) workRequest).getInspectorNote();

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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        quoteTxt = new javax.swing.JTextField();
        txtFeedback = new javax.swing.JTextField();
        brnTakeJob = new javax.swing.JButton();
        btnCompleteJob = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 287, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/BUILDING.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 660, 440));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Buyer", "Seller", "Street", "City", "State", "Zipcode", "Status", "Buyer Message", "Builder Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 781, 300));

        quoteTxt.setBackground(new java.awt.Color(153, 204, 255));
        quoteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quoteTxtActionPerformed(evt);
            }
        });
        add(quoteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 430, 140, -1));

        txtFeedback.setBackground(new java.awt.Color(153, 204, 255));
        add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 138, -1));

        brnTakeJob.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        brnTakeJob.setText("Take Job");
        brnTakeJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brnTakeJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnTakeJobActionPerformed(evt);
            }
        });
        add(brnTakeJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        btnCompleteJob.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnCompleteJob.setText("Mark Complete");
        btnCompleteJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteJobActionPerformed(evt);
            }
        });
        add(btnCompleteJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Update Quote: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel1.setText("Feedback:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("BUILDER WORK REQUEST");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/builder.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 145, 164));
    }// </editor-fold>//GEN-END:initComponents

    private void brnTakeJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnTakeJobActionPerformed
     int selectedRow = houseTable.getSelectedRow();
        if (selectedRow >= 0) {
            BuilderRequest builderRequest = (BuilderRequest) houseTable.getValueAt(selectedRow, 0);
            String feedback = txtFeedback.getText();
            if (!"Job Taken".equals(builderRequest.getStatus())) {
                if (!"".equals(feedback)) {
                    builderRequest.setStatus("Job Taken");
                    builderRequest.setQuote(quoteTxt.getText());
                    //inspector.getCharge();
                    // inspector.setCharge(quoteTxt.getText());
                    userAccount.setStatus("Occupied");
                    populateRequestTable();
                    JOptionPane.showMessageDialog(null, "Job Taken Successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter feedback!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Job is already taken!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_brnTakeJobActionPerformed

    private void btnCompleteJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteJobActionPerformed
        // TODO add your handling code here:
       int selectedRow = houseTable.getSelectedRow();
        if (selectedRow >= 0) {
            BuilderRequest builderRequest = (BuilderRequest) houseTable.getValueAt(selectedRow, 0);
            String feedback = txtFeedback.getText();

            if (!"".equals(feedback)) {
                builderRequest.setStatus("Completed");
                builderRequest.setInspectorNote(feedback);
                populateRequestTable();
                userAccount.setStatus("Available");
            } else {
                JOptionPane.showMessageDialog(null, "Please enter feedback!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnCompleteJobActionPerformed

    private void quoteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quoteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quoteTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnTakeJob;
    private javax.swing.JButton btnCompleteJob;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quoteTxt;
    private javax.swing.JTextField txtFeedback;
    // End of variables declaration//GEN-END:variables
}
