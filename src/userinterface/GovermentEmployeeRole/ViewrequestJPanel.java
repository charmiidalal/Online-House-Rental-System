/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovermentEmployeeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovtEmpRequest;
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
public class ViewrequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetailsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount useraccount;
    private Enterprise enterprise;

    public ViewrequestJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
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

        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {

            if (workRequest instanceof GovtEmpRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = ((GovtEmpRequest) workRequest).getBuyer();
                row[2] = ((GovtEmpRequest) workRequest).getSeller();
                row[3] = ((GovtEmpRequest) workRequest).getProperty().getStreet();
                row[4] = ((GovtEmpRequest) workRequest).getProperty().getCity();
                row[5] = ((GovtEmpRequest) workRequest).getProperty().getState();
                row[6] = ((GovtEmpRequest) workRequest).getProperty().getPincode();
                row[7] = ((GovtEmpRequest) workRequest).getStatus();
                row[8] = ((GovtEmpRequest) workRequest).getBuyerNote();
                row[9] = ((GovtEmpRequest) workRequest).getInspectorNote();
                row[10] = ((GovtEmpRequest) workRequest).getQuote();
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

        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnViewBuyerDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        discountTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        btnViewSellerDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(25, 56, 82));
        jLabel11.setText("LOAN REQUESTS");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/cleaning-staff.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 145, 164));

        btnApprove.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        btnViewBuyerDetails.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnViewBuyerDetails.setText("View Assignee Details");
        btnViewBuyerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBuyerDetailsActionPerformed(evt);
            }
        });
        add(btnViewBuyerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Discount Amount: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 160, 20));

        discountTxt.setBackground(new java.awt.Color(153, 204, 255));
        discountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountTxtActionPerformed(evt);
            }
        });
        add(discountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 120, -1));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Buyer", "Seller", "Street", "City", "State", "Zipcode", "Status", "Buyer Message", "Employee Message", "Discount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 910, 300));

        btnViewSellerDetails.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnViewSellerDetails.setText("View Seller Details");
        btnViewSellerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSellerDetailsActionPerformed(evt);
            }
        });
        add(btnViewSellerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        double discount;
        if (selectedRow >= 0) {
            GovtEmpRequest inspectRequest = (GovtEmpRequest) houseTable.getValueAt(selectedRow, 0);
            try {
                discount = Double.parseDouble(discountTxt.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for Discount");
                return;
            }
            if (!"In Progress".equals(inspectRequest.getStatus())) {
                inspectRequest.setStatus("In Progress");
                
                inspectRequest.setDiscount(discount);
                useraccount.setStatus("Occupied");
                JOptionPane.showMessageDialog(null, "Job Taken Successfully!");
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(null, "Job is already taken!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void discountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountTxtActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnViewBuyerDetails;
    private javax.swing.JButton btnViewSellerDetails;
    private javax.swing.JTextField discountTxt;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
