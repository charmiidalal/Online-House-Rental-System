/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuilderRole;

import Business.WorkQueue.BuilderRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.BuyerRole.ViewBuyerDetailsJPanel;
import userinterface.BuyerRole.ViewSellerDetailsJPanel;

/**
 *
 * @author Dinesh
 */
public class ViewJobsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJobsJPanel private JPanel userProcessContainer;
     * private EcoSystem system; private UserAccount userAccount; private
     * Enterprise enterprise;
     *
     *
     * /**
     * Creates new form BuyerWorkAreaJpanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount useraccount;
    private Enterprise enterprise;

    public ViewJobsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.useraccount = useraccount;
        this.enterprise = enterprise;
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (WorkRequest workRequest : e.getWorkQueue().getWorkRequestList()) {

                    if (workRequest instanceof BuilderRequest) {
                        if (((BuilderRequest) workRequest).getBuilder().getUsername().equals(useraccount.getUsername())) {
                            Object[] row = new Object[model.getColumnCount()];
                            row[0] = workRequest;
                            row[1] = ((BuilderRequest) workRequest).getBuyer();
                            row[2] = ((BuilderRequest) workRequest).getSeller();
                            row[3] = ((BuilderRequest) workRequest).getProperty().getStreet();
                            row[4] = ((BuilderRequest) workRequest).getProperty().getCity();
                            row[5] = ((BuilderRequest) workRequest).getProperty().getState();
                            row[6] = ((BuilderRequest) workRequest).getProperty().getPincode();
                            row[7] = ((BuilderRequest) workRequest).getStatus();
                            row[8] = ((BuilderRequest) workRequest).getBuyerNote();
                            row[9] = ((BuilderRequest) workRequest).getInspectorNote();
                            row[10] = ((BuilderRequest) workRequest).getQuote();
                            row[11] = ((BuilderRequest) workRequest).getBuyer().getRole().toString();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        brnTakeJob = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCompleteJob = new javax.swing.JButton();
        txtFeedback = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnViewBuyerDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        quoteTxt = new javax.swing.JTextField();
        btnViewSellerDetails = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 287, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("BUILDER WORK REQUEST");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/BUILDING.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 660, 440));

        brnTakeJob.setBackground(new java.awt.Color(241, 241, 242));
        brnTakeJob.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        brnTakeJob.setForeground(new java.awt.Color(41, 50, 80));
        brnTakeJob.setText("Take Job");
        brnTakeJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brnTakeJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnTakeJobActionPerformed(evt);
            }
        });
        add(brnTakeJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/builder.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 145, 164));

        btnCompleteJob.setBackground(new java.awt.Color(241, 241, 242));
        btnCompleteJob.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnCompleteJob.setForeground(new java.awt.Color(41, 50, 80));
        btnCompleteJob.setText("Mark Complete");
        btnCompleteJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteJobActionPerformed(evt);
            }
        });
        add(btnCompleteJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 150, -1));

        txtFeedback.setBackground(new java.awt.Color(153, 204, 255));
        add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 120, -1));

        jLabel1.setBackground(new java.awt.Color(241, 241, 242));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 50, 80));
        jLabel1.setText("Feedback:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, -1, -1));

        btnViewBuyerDetails.setBackground(new java.awt.Color(241, 241, 242));
        btnViewBuyerDetails.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnViewBuyerDetails.setForeground(new java.awt.Color(41, 50, 80));
        btnViewBuyerDetails.setText("View Assignee Details");
        btnViewBuyerDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewBuyerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBuyerDetailsActionPerformed(evt);
            }
        });
        add(btnViewBuyerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 50, 80));
        jLabel2.setText("Quotation Amount: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 160, 20));

        quoteTxt.setBackground(new java.awt.Color(153, 204, 255));
        quoteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quoteTxtActionPerformed(evt);
            }
        });
        add(quoteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 120, -1));

        btnViewSellerDetails.setBackground(new java.awt.Color(241, 241, 242));
        btnViewSellerDetails.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnViewSellerDetails.setForeground(new java.awt.Color(41, 50, 80));
        btnViewSellerDetails.setText("View Seller Details");
        btnViewSellerDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewSellerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSellerDetailsActionPerformed(evt);
            }
        });
        add(btnViewSellerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Assignee", "Seller", "Street", "City", "State", "Zipcode", "Status", "Buyer Message", "Builder Message", "Quotation", "Assignee Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 920, 260));

        btnReject.setBackground(new java.awt.Color(241, 241, 242));
        btnReject.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnReject.setForeground(new java.awt.Color(41, 50, 80));
        btnReject.setText("Reject");
        btnReject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 430, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void brnTakeJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnTakeJobActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        if (selectedRow >= 0) {
            BuilderRequest inspectRequest = (BuilderRequest) houseTable.getValueAt(selectedRow, 0);
            try {
                Double quote = Double.parseDouble(quoteTxt.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for Quote");
                return;
            }
            if (!"In Progress".equals(inspectRequest.getStatus())) {
                inspectRequest.setStatus("In Progress");
                inspectRequest.setQuote(quoteTxt.getText());
                useraccount.setStatus("Occupied");
                JOptionPane.showMessageDialog(null, "Job Taken Successfully!");
                populateRequestTable();
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
            BuilderRequest inspectRequest = (BuilderRequest) houseTable.getValueAt(selectedRow, 0);
            String feedback = txtFeedback.getText();
            if (feedback.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for feedback");
                return;
            }
            if (!"Completed".equals(inspectRequest.getStatus())) {
                inspectRequest.setStatus("Completed");
                inspectRequest.setInspectorNote(feedback);
                JOptionPane.showMessageDialog(null, "Job is set to completed!");
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to set your status to Available?", "Warning", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    useraccount.setStatus("Available");
                }
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(null, "Job is already completed!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnCompleteJobActionPerformed

    private void quoteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quoteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quoteTxtActionPerformed

    private void btnViewBuyerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBuyerDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();

        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount buyerAcc = (UserAccount) houseTable.getValueAt(selectedRow, 1);
                ViewBuyerDetailsJPanel viewBuyerDetailsJPanel = new ViewBuyerDetailsJPanel(userProcessContainer, buyerAcc, useraccount, system);
                userProcessContainer.add("ViewBuyerDetailsJPanel", viewBuyerDetailsJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnViewBuyerDetailsActionPerformed

    private void btnViewSellerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSellerDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();

        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount sellerAcc = (UserAccount) houseTable.getValueAt(selectedRow, 2);
                ViewSellerDetailsJPanel viewSellerDetailsJPanel = new ViewSellerDetailsJPanel(userProcessContainer, sellerAcc, useraccount, system);
                userProcessContainer.add("viewSellerDetailsJPanel", viewSellerDetailsJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnViewSellerDetailsActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        if (selectedRow >= 0) {
            BuilderRequest inspectRequest = (BuilderRequest) houseTable.getValueAt(selectedRow, 0);
            String feedback = txtFeedback.getText();
            if (feedback.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for feedback");
                return;
            }
            if (!"Completed".equals(inspectRequest.getStatus()) && !"In Progress".equals(inspectRequest.getStatus())) {
                inspectRequest.setStatus("Rejected");
                inspectRequest.setInspectorNote(feedback);
                JOptionPane.showMessageDialog(null, "Job is set to rejected!");
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to set your status to Available?", "Warning", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    useraccount.setStatus("Available");
                }
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(null, "Job is already " + inspectRequest.getStatus());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnTakeJob;
    private javax.swing.JButton btnCompleteJob;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnViewBuyerDetails;
    private javax.swing.JButton btnViewSellerDetails;
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
