/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuilderRole;

import Business.Builder.Builder;
import Business.Builder.BuilderDirectory;
import Business.BuilderRequest.BuilderRequest;
import Business.BuilderRequest.BuilderRequestDirectory;
import Business.Buyer.BuyerDirectory;
import Business.EcoSystem;
import Business.Property.PropertyDirectory;
import Business.Seller.SellerDirectory;
import Business.UserAccount.UserAccount;
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
     */
  private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private BuilderDirectory builderDirectory;
    private BuilderRequestDirectory builderRequestDirectory;
    private SellerDirectory sellerDirectory;
    private PropertyDirectory propertyDirectory;
    private BuyerDirectory buyerDirectory;

   
     public ViewJobsJPanel(JPanel userProcess, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.userAccount = userAccount;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        this.buyerDirectory = (system.getBuyerDirectory() == null) ? new BuyerDirectory() : system.getBuyerDirectory();
        this.builderRequestDirectory = (system.getBuilderRequestDirectory()== null) ? new BuilderRequestDirectory(): system.getBuilderRequestDirectory();
        this.builderDirectory = (system.getBuilderDirectory()== null) ? new BuilderDirectory(): system.getBuilderDirectory();
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);
        Builder builder = builderDirectory.fetchBuilder(userAccount.getEmployee().getName());
        for (BuilderRequest builderReuqest : builderRequestDirectory.getBuilderRequestList()) {
            if (builderReuqest.getBuilder().getBuilderNo().equals(builder.getBuilderNo())) {
                Object[] row = new Object[10];
                row[0] = builderReuqest.getRequestID();
                row[1] = builderReuqest.getBuyer().getBuyerName();
                row[2] = builderReuqest.getSeller().getName();
                row[3] = builderReuqest.getProperty().getStreet();
                row[4] = builderReuqest.getProperty().getCity();
                row[5] = builderReuqest.getProperty().getState();
                row[6] = builderReuqest.getProperty().getPincode();
                row[7] = builderReuqest.getStatus();
                row[8] = builderReuqest.getBuyerNote();
                row[9] = builderReuqest.getInspectorNote();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        brnTakeJob = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtFeedback = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCompleteJob = new javax.swing.JButton();

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Buyer", "Seller", "Street", "City", "State", "Zipcode", "Status", "Buyer Message", "Electrician Message"
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

        brnTakeJob.setText("Take Job");
        brnTakeJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnTakeJobActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Feedback:");

        btnCompleteJob.setText("Mark Complete");
        btnCompleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteJobActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCompleteJob)
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(brnTakeJob)
                        .addGap(219, 219, 219)
                        .addComponent(btnBack)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(txtFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnTakeJob)
                    .addComponent(txtFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(btnCompleteJob)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void brnTakeJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnTakeJobActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {

            String jobID = (String) houseTable.getValueAt(selectedRow, 0);
            BuilderRequest builderRequest = builderRequestDirectory.fetchBuilderRequest(jobID);
            if (!"Job Taken".equals(builderRequest.getStatus())) {
                builderRequest.setStatus("Job Taken");
                Builder builder = builderDirectory.fetchBuilder(userAccount.getEmployee().getName());
                builder.setStatus("Occupied");
                populateRequestTable();
                JOptionPane.showMessageDialog(null, "Job Taken Successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Job is already taken!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_brnTakeJobActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCompleteJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteJobActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            String feedback = txtFeedback.getText();
            String jobID = (String) houseTable.getValueAt(selectedRow, 0);

            if (!"".equals(feedback)) {
                BuilderRequest builderRequest = builderRequestDirectory.fetchBuilderRequest(jobID);
                builderRequest.setStatus("Completed");
                builderRequest.setInspectorNote(feedback);
                populateRequestTable();
                JOptionPane.showMessageDialog(null, "Job Completed Successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Please enter feedback!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnCompleteJobActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnTakeJob;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompleteJob;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFeedback;
    // End of variables declaration//GEN-END:variables
}
