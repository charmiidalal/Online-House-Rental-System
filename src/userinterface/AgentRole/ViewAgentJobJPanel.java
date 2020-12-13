/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AgentRole;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.AgentRequest;
import Business.WorkQueue.WorkRequest;
import userinterface.BuyerRole.ViewBuyerDetailsJPanel;
import userinterface.BuyerRole.ViewSellerDetailsJPanel;

/**
 *
 * @author Dinesh
 */
public class ViewAgentJobJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private PropertyDirectory propertyDirectory;
    private Enterprise enterprise;

    /**
     * Creates new form ViewJobJPanel
     */
    public ViewAgentJobJPanel(JPanel userProcess, EcoSystem system,Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.enterprise=enterprise;
        this.userAccount = userAccount;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();

        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);

        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {

            if (workRequest instanceof AgentRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = ((AgentRequest) workRequest).getBuyer();
                row[2] = ((AgentRequest) workRequest).getSeller();
                row[3] = ((AgentRequest) workRequest).getProperty().getStreet();
                row[4] = ((AgentRequest) workRequest).getProperty().getCity();
                row[5] = ((AgentRequest) workRequest).getProperty().getState();
                row[6] = ((AgentRequest) workRequest).getProperty().getPincode();
                row[7] = ((AgentRequest) workRequest).getStatus();
                row[8] = ((AgentRequest) workRequest).getBuyerNote();
                row[9] = ((AgentRequest) workRequest).getInspectorNote();
                row[10] = ((AgentRequest) workRequest).getQuote();
                row[11] = ((AgentRequest) workRequest).getBuyer().getRole().toString();
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

        jLabel5 = new javax.swing.JLabel();
        txtFeedback = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSuggestProperty = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        btnViewBuyerDetails = new javax.swing.JButton();
        btnViewSellerDetails = new javax.swing.JButton();
        brnTakeJob = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        quoteTxt = new javax.swing.JTextField();
        btnCompleteJob = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/AGENTO.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 660, 440));

        txtFeedback.setBackground(new java.awt.Color(153, 204, 255));
        add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, 138, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel1.setText("Feedback:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, -1, -1));

        btnSuggestProperty.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnSuggestProperty.setText("Suggest Property");
        btnSuggestProperty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuggestProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuggestPropertyActionPerformed(evt);
            }
        });
        add(btnSuggestProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("AGENT WORK REQUEST");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/AGENT.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 145, 164));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Assignee", "Seller", "Street", "City", "State", "Zipcode", "Status", "Buyer Message", "Agent Message", "Quotation", "Assignee Role"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 910, 300));

        btnViewBuyerDetails.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnViewBuyerDetails.setText("View Assignee Details");
        btnViewBuyerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBuyerDetailsActionPerformed(evt);
            }
        });
        add(btnViewBuyerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));

        btnViewSellerDetails.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnViewSellerDetails.setText("View Seller Details");
        btnViewSellerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSellerDetailsActionPerformed(evt);
            }
        });
        add(btnViewSellerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        brnTakeJob.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        brnTakeJob.setText("Take Job");
        brnTakeJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnTakeJobActionPerformed(evt);
            }
        });
        add(brnTakeJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Quotation Amount: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 160, 20));

        quoteTxt.setBackground(new java.awt.Color(153, 204, 255));
        quoteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quoteTxtActionPerformed(evt);
            }
        });
        add(quoteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 120, -1));

        btnCompleteJob.setText("Mark Complete");
        btnCompleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteJobActionPerformed(evt);
            }
        });
        add(btnCompleteJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 150, -1));

        btnReject.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnReject.setText("Reject");
        btnReject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 430, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuggestPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuggestPropertyActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            AgentRequest agentRequest = (AgentRequest) houseTable.getValueAt(selectedRow, 0);
            AssignPropetyJPanel assignPropetyJPanel = new AssignPropetyJPanel(userProcessContainer, userAccount, system, agentRequest);
            userProcessContainer.add("assignPropetyJPanel", assignPropetyJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnSuggestPropertyActionPerformed

    private void btnViewBuyerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBuyerDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();

        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount buyerAcc = (UserAccount) houseTable.getValueAt(selectedRow, 1);
                ViewBuyerDetailsJPanel viewBuyerDetailsJPanel = new ViewBuyerDetailsJPanel(userProcessContainer, buyerAcc, userAccount, system);
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
                ViewSellerDetailsJPanel viewSellerDetailsJPanel = new ViewSellerDetailsJPanel(userProcessContainer, sellerAcc, userAccount, system);
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

    private void brnTakeJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnTakeJobActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        if (selectedRow >= 0) {
            AgentRequest inspectRequest = (AgentRequest) houseTable.getValueAt(selectedRow, 0);
            try {
                Double quote = Double.parseDouble(quoteTxt.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for Quote");
                return;
            }
            if (!"In Progress".equals(inspectRequest.getStatus())) {
                inspectRequest.setStatus("In Progress");
                inspectRequest.setQuote(quoteTxt.getText());
                userAccount.setStatus("Occupied");
                JOptionPane.showMessageDialog(null, "Job Taken Successfully!");
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(null, "Job is already taken!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_brnTakeJobActionPerformed

    private void quoteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quoteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quoteTxtActionPerformed

    private void btnCompleteJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteJobActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        if (selectedRow >= 0) {
            AgentRequest inspectRequest = (AgentRequest) houseTable.getValueAt(selectedRow, 0);
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
                    userAccount.setStatus("Available");
                }
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(null, "Job is already completed!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnCompleteJobActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        if (selectedRow >= 0) {
            AgentRequest inspectRequest = (AgentRequest) houseTable.getValueAt(selectedRow, 0);
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
                    userAccount.setStatus("Available");
                }
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(null, "Job is already "+inspectRequest.getStatus() );
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnTakeJob;
    private javax.swing.JButton btnCompleteJob;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnSuggestProperty;
    private javax.swing.JButton btnViewBuyerDetails;
    private javax.swing.JButton btnViewSellerDetails;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quoteTxt;
    private javax.swing.JTextField txtFeedback;
    // End of variables declaration//GEN-END:variables
}
