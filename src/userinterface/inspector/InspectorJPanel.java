/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Inspector;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Seller.SellerDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dinesh
 */
public class InspectorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem business;
    private SellerDirectory sellerDirectory;
    private OrderDirectory orderDirectory;
    /**
     * Creates new form InspectorJPanel
     */
    public InspectorJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem business ) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.account = account;
        this.business=business;
        this.sellerDirectory=sellerDirectory;
        this.orderDirectory=orderDirectory;
    }
    
     public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) requestTbl.getModel();
        model.setRowCount(0);
        for(Order order: business.getOrderDirectory().getOrderDirectory()){
            if(order.getInspector()!= null){
                if(order.getInspector().getInspectorID().equalsIgnoreCase(account.getEmployee().getName())){
                Object[] row = new Object[7];
                    row[0] = order.getMessage();
                    row[1] = order.getSender();
                    row[2] = order.getReceiver();
                    row[3] = order.getStatus();
                    row[4] = order.getOrderId();
                    row[5] = order.getBuyer().getBuyerStreet();
                    row[6] = order.getSeller().getSellerStreet();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        requestTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        completeTxt = new javax.swing.JTextField();

        requestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BuyerID", "SellerID", "Street ", "Comment", "OrderID", "Status", "Comment", "Title 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestTbl);
        if (requestTbl.getColumnModel().getColumnCount() > 0) {
            requestTbl.getColumnModel().getColumn(0).setResizable(false);
            requestTbl.getColumnModel().getColumn(1).setResizable(false);
            requestTbl.getColumnModel().getColumn(2).setResizable(false);
            requestTbl.getColumnModel().getColumn(3).setResizable(false);
            requestTbl.getColumnModel().getColumn(4).setResizable(false);
            requestTbl.getColumnModel().getColumn(5).setResizable(false);
            requestTbl.getColumnModel().getColumn(6).setResizable(false);
            requestTbl.getColumnModel().getColumn(7).setResizable(false);
        }

        jButton1.setText("Take Job ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        submitBtn.setText("Mark complete:");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        completeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(completeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(completeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void completeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeTxtActionPerformed
        
    }//GEN-LAST:event_completeTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = requestTbl.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a row!");
            return;
        }
        
        String selectedOrderId = (String) requestTbl.getValueAt(selectedRow, 4);
        Order order = business.getOrderDirectory().getOrderByOrderId(selectedOrderId);
     
        order.setStatus("Inspection Underway");
        JOptionPane.showMessageDialog(null, "Request Updated");
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
           int selectedRow = requestTbl.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a row!");
            return;
        }
        
        String selectedOrderId = (String) requestTbl.getValueAt(selectedRow, 4);
        Order order = business.getOrderDirectory().getOrderByOrderId(selectedOrderId);
     
        if(order.getStatus().trim().equalsIgnoreCase("Inspection underway")){
            order.setResult(completeTxt.getText());
            order.setStatus("Completed");
            completeTxt.setText("");
            JOptionPane.showMessageDialog(null, "Request Uodated");
            populateTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Accept inspection before confirming");
        }
    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField completeTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestTbl;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
