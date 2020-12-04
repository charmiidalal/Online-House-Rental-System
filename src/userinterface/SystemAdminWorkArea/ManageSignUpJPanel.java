/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageSignUpJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageSignUpJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequestAccess.getModel();

        model.setRowCount(0);
        if (system.getSellerDirectory() != null) {
            for (Seller sd : system.getSellerDirectory().getSellerList()) {
                if (!sd.getIsApproved()) {
                    Object[] row = new Object[5];
                    row[0] = sd.getSellerNo();
                    row[1] = sd.getName();
                    row[2] = sd.getUsername();
                    row[3] = sd.getEmail();
                    row[4] = "Seller";
                    model.addRow(row);
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

        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestAccess = new javax.swing.JTable();
        btnReject = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        tblRequestAccess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Seller No", "Name", "Username", "Email", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequestAccess);

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnApprove)
                        .addGap(27, 27, 27)
                        .addComponent(btnReject))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(btnReject)
                    .addComponent(btnApprove))
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int row = tblRequestAccess.getSelectedRow();
        int orderCount = tblRequestAccess.getSelectedRowCount();
        if (orderCount == 1) {
            if (row >= 0) {
                String sellerID = (String) tblRequestAccess.getValueAt(row, 0);
                Seller seller = system.getSellerDirectory().fetchSeller(sellerID);
                system.getSellerDirectory().removeSeller(seller);
                JOptionPane.showMessageDialog(null, "Seller deleted successfully!");
                populateTable();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Select one seller first!");
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int row = tblRequestAccess.getSelectedRow();
        int orderCount = tblRequestAccess.getSelectedRowCount();
        if (orderCount == 1) {
            if (row >= 0) {
                String sellerID = (String) tblRequestAccess.getValueAt(row, 0);
                String username = (String) tblRequestAccess.getValueAt(row, 2);
                Seller seller = system.getSellerDirectory().fetchSeller(sellerID);
                seller.setIsApproved(true);
                UserAccount ua = system.getUserAccountDirectory().searchUser(username);
                ua.setIsApproved(true);
                JOptionPane.showMessageDialog(null, "Seller approved successfully!");
                populateTable();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Select one seller first!");
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequestAccess;
    // End of variables declaration//GEN-END:variables
}
