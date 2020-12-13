/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PropertyManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.ManagerRequest;
import userinterface.BuyerRole.HireServiceJPanel;
import userinterface.BuyerRole.ViewBuyerDetailsJPanel;
import userinterface.BuyerRole.ViewSellerDetailsJPanel;

/**
 *
 * @author Dinesh
 */
public class ViewJobsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount useraccount;
    private PropertyDirectory propertyDirectory;
    private Enterprise enterprise;
    private Network network;
    private Organization organization;

    /**
     * Creates new form ViewJobsJPanel
     */

    public ViewJobsJPanel(JPanel userProcessContainer, Organization organization, Network network, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.useraccount = useraccount;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        this.enterprise = enterprise;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        popuatePropertyTable();
        populateRequestTable();
    }
    public void popuatePropertyTable() {
        DefaultTableModel model = (DefaultTableModel) propertyTable.getModel();
        model.setRowCount(0);
        for (Property property : propertyDirectory.getPropertyList()) {
            Object[] row = new Object[12];
            row[0] = property.getPropertyID();
            row[1] = property.getPropertyName();
            row[2] = property.getStreet();
            row[3] = property.getCity();
            row[4] = property.getState();
            row[5] = property.getPincode();
            row[6] = property.getBhk();
            row[7] = property.getBathroom();
            row[8] = property.getPrice();
            row[9] = property.getStatus();
            row[10] = property.getSeller();
            row[11] = property.getSeller().getName();
            model.addRow(row);
        }
    }
    
    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);

        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof ManagerRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = ((ManagerRequest) workRequest).getBuyer().getName();
                row[2] = ((ManagerRequest) workRequest).getSeller().getName();
                row[3] = ((ManagerRequest) workRequest).getProperty().getStreet();
                row[4] = ((ManagerRequest) workRequest).getProperty().getCity();
                row[5] = ((ManagerRequest) workRequest).getProperty().getState();
                row[6] = ((ManagerRequest) workRequest).getProperty().getPincode();
                row[7] = ((ManagerRequest) workRequest).getStatus();
                row[8] = ((ManagerRequest) workRequest).getBuyerNote();
                row[9] = ((ManagerRequest) workRequest).getInspectorNote();
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
        hireElecBtn = new javax.swing.JButton();
        hirePlumBtn = new javax.swing.JButton();
        hirePackBtn = new javax.swing.JButton();
        hirePhotoBtn = new javax.swing.JButton();
        hireCleanBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        propertyTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        brnTakeJob = new javax.swing.JButton();
        btnCompleteJob = new javax.swing.JButton();
        txtFeedback = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quoteTxt = new javax.swing.JTextField();
        btnViewBuyerDetails = new javax.swing.JButton();
        btnViewSellerDetails = new javax.swing.JButton();
        hireSPBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        btnReject = new javax.swing.JButton();

        hireElecBtn.setText("Hire Electrician");
        hireElecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireElecBtnActionPerformed(evt);
            }
        });

        hirePlumBtn.setText("Hire Plumber");
        hirePlumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hirePlumBtnActionPerformed(evt);
            }
        });

        hirePackBtn.setText("Hire Packers/Movers");

        hirePhotoBtn.setText("Hire Photographer");
        hirePhotoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hirePhotoBtnActionPerformed(evt);
            }
        });

        hireCleanBtn.setText("Hire Cleaner");
        hireCleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireCleanBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hirePhotoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hirePackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hireElecBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hirePlumBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hireCleanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hireElecBtn)
                    .addComponent(hirePlumBtn))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hirePackBtn)
                    .addComponent(hireCleanBtn))
                .addGap(52, 52, 52)
                .addComponent(hirePhotoBtn)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(241, 241, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        propertyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PropertyID", " Name", " Address", "City", "State", "Zipcode", "BHK", "Bathroom", "Rate", "Status", "SoldByID", "SoldBy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(propertyTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 920, 300));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("PROPERTY MANAGER WORK REQUEST");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/property.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -50, 690, 550));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/real-estate-agent.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 140, 164));

        brnTakeJob.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        brnTakeJob.setText("Take Job");
        brnTakeJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brnTakeJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnTakeJobActionPerformed(evt);
            }
        });
        add(brnTakeJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        btnCompleteJob.setText("Mark Complete");
        btnCompleteJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteJobActionPerformed(evt);
            }
        });
        add(btnCompleteJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 150, -1));

        txtFeedback.setBackground(new java.awt.Color(153, 204, 255));
        add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 120, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel1.setText("Feedback:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Quotation Amount: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 160, 20));

        quoteTxt.setBackground(new java.awt.Color(153, 204, 255));
        quoteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quoteTxtActionPerformed(evt);
            }
        });
        add(quoteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 120, -1));

        btnViewBuyerDetails.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnViewBuyerDetails.setText("View Buyer Details");
        btnViewBuyerDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewBuyerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBuyerDetailsActionPerformed(evt);
            }
        });
        add(btnViewBuyerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        btnViewSellerDetails.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnViewSellerDetails.setText("View Seller Details");
        btnViewSellerDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewSellerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSellerDetailsActionPerformed(evt);
            }
        });
        add(btnViewSellerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        hireSPBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        hireSPBtn.setForeground(new java.awt.Color(41, 50, 80));
        hireSPBtn.setText("Hire Services");
        hireSPBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hireSPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireSPBtnActionPerformed(evt);
            }
        });
        add(hireSPBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 540, 120, -1));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Assignee", "Seller", "Street", "City", "State", "Zipcode", "Status", "Buyer Message", "Manager Message", "Quotation", "Role"
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

        btnReject.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnReject.setText("Reject");
        btnReject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void hireElecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireElecBtnActionPerformed

    }//GEN-LAST:event_hireElecBtnActionPerformed

    private void hirePlumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirePlumBtnActionPerformed
       
    }//GEN-LAST:event_hirePlumBtnActionPerformed

    private void hirePhotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirePhotoBtnActionPerformed
       
    }//GEN-LAST:event_hirePhotoBtnActionPerformed

    private void hireCleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireCleanBtnActionPerformed
       
    }//GEN-LAST:event_hireCleanBtnActionPerformed

    private void brnTakeJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnTakeJobActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        if (selectedRow >= 0) {
            ManagerRequest inspectRequest = (ManagerRequest) houseTable.getValueAt(selectedRow, 0);
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
            ManagerRequest inspectRequest = (ManagerRequest) houseTable.getValueAt(selectedRow, 0);
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

    private void hireSPBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireSPBtnActionPerformed
        int selectedRow = propertyTable.getSelectedRow();
        int count = propertyTable.getSelectedRowCount();
        if (count == 1) {
            String propertyID = (String) propertyTable.getValueAt(selectedRow, 0);
            Property property = propertyDirectory.fetchProperty(propertyID);

            HireServiceJPanel hireServiceJPanel = new HireServiceJPanel(userProcessContainer,organization,network,enterprise, property,system, useraccount);
            userProcessContainer.add("hireServiceJPanel", hireServiceJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_hireSPBtnActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        if (selectedRow >= 0) {
            ManagerRequest inspectRequest = (ManagerRequest) houseTable.getValueAt(selectedRow, 0);
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
    private javax.swing.JButton btnViewBuyerDetails;
    private javax.swing.JButton btnViewSellerDetails;
    private javax.swing.JButton hireCleanBtn;
    private javax.swing.JButton hireElecBtn;
    private javax.swing.JButton hirePackBtn;
    private javax.swing.JButton hirePhotoBtn;
    private javax.swing.JButton hirePlumBtn;
    private javax.swing.JButton hireSPBtn;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable propertyTable;
    private javax.swing.JTextField quoteTxt;
    private javax.swing.JTextField txtFeedback;
    // End of variables declaration//GEN-END:variables
}
