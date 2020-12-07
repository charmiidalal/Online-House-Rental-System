/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PhotographerRole;

import userinterface.PlumberRole.*;
import Business.Buyer.BuyerDirectory;
import Business.EcoSystem;
import Business.InspectRequest.InspectRequest;
import Business.InspectRequest.InspectRequestDirectory;
import Business.Inspector.Inspector;
import Business.Inspector.InspectorDirectory;
import Business.Plumber.Plumber;
import Business.Plumber.PlumberDirectory;
import Business.PlumbingRequest.PlumbingRequest;
import Business.PlumbingRequest.PlumbingRequestDirectory;
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
public class ViewJobJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private SellerDirectory sellerDirectory;
    private PropertyDirectory propertyDirectory;
    private BuyerDirectory buyerDirectory;
    private PlumbingRequestDirectory plumbingRequestDirectory;
    private PlumberDirectory plumberDirectory;

    /**
     * Creates new form ViewJobJPanel
     */
     public ViewJobJPanel(JPanel userProcess, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.userAccount = userAccount;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        this.buyerDirectory = (system.getBuyerDirectory() == null) ? new BuyerDirectory() : system.getBuyerDirectory();
        this.plumbingRequestDirectory = (system.getPlumbingRequestDirectory()== null) ? new PlumbingRequestDirectory(): system.getPlumbingRequestDirectory();
        this.plumberDirectory = (system.getPlumberDirectory()== null) ? new PlumberDirectory(): system.getPlumberDirectory();
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);
        Plumber plumber = plumberDirectory.fetchPlumber(userAccount.getEmployee().getName());
        for (PlumbingRequest plumberRequest : plumbingRequestDirectory.getPlumbingRequestList()) {
            if (plumberRequest.getPlumber().getPlumberNo().equals(plumber.getPlumberNo())) {
                Object[] row = new Object[10];
                row[0] = plumberRequest.getRequestID();
                row[1] = plumberRequest.getBuyer().getBuyerName();
                row[2] = plumberRequest.getSeller().getName();
                row[3] = plumberRequest.getProperty().getStreet();
                row[4] = plumberRequest.getProperty().getCity();
                row[5] = plumberRequest.getProperty().getState();
                row[6] = plumberRequest.getProperty().getPincode();
                row[7] = plumberRequest.getStatus();
                row[8] = plumberRequest.getBuyerNote();
                row[9] = plumberRequest.getInspectorNote();

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
        brnTakeJob = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtFeedback = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCompleteJob = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        quoteTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/photograph.png"))); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brnTakeJob.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        brnTakeJob.setText("Take Job");
        brnTakeJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnTakeJobActionPerformed(evt);
            }
        });
        add(brnTakeJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        btnBack.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        txtFeedback.setBackground(new java.awt.Color(153, 204, 255));
        add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 138, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel1.setText("Feedback:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        btnCompleteJob.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnCompleteJob.setText("Mark Complete");
        btnCompleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteJobActionPerformed(evt);
            }
        });
        add(btnCompleteJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Update Quote: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, 20));

        quoteTxt.setBackground(new java.awt.Color(153, 204, 255));
        quoteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quoteTxtActionPerformed(evt);
            }
        });
        add(quoteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 140, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("PHOTOGRAPHER WORK REQUEST");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/photographer.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 140, 164));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/photograph.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 690, 550));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Buyer", "Seller", "Street", "City", "State", "Zipcode", "Status", "Buyer Message", "Inspector Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(houseTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 781, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void brnTakeJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnTakeJobActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            String feedback = txtFeedback.getText();
            String jobID = (String) houseTable.getValueAt(selectedRow, 0);
            PlumbingRequest plumbingRequest = plumbingRequestDirectory.fetchPlumbingRequest(jobID);
            if (!"Job Taken".equals(plumbingRequest.getStatus())) {
                 if (!"".equals(feedback)) {
                plumbingRequest.setStatus("Job Taken");
                plumbingRequest.setQuote(quoteTxt.getText());
                Plumber plumber = plumberDirectory.fetchPlumber(userAccount.getEmployee().getName());
                plumber.setStatus("Occupied");
                
                populateRequestTable();
                JOptionPane.showMessageDialog(null, "Job Taken Successfully!");
             } else {
                JOptionPane.showMessageDialog(null, "Please enter feedback!");
            }}
                 else {
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
                PlumbingRequest plumberRequest = plumbingRequestDirectory.fetchPlumbingRequest(jobID);
                plumberRequest.setStatus("Completed");
                plumberRequest.setInspectorNote(feedback);
                populateRequestTable();
                JOptionPane.showMessageDialog(null, "Job Completed Successfully!");
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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompleteJob;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField quoteTxt;
    private javax.swing.JTextField txtFeedback;
    // End of variables declaration//GEN-END:variables
}
