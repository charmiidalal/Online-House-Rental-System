/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuyerRole;

import Business.Buyer.Buyer;
import Business.Buyer.BuyerDirectory;
import Business.EcoSystem;
import Business.Electrician.ElectricianDirectory;
import Business.ElectricianRequest.ElectricianRequestDirectory;
import Business.Plumber.Plumber;
import Business.Plumber.PlumberDirectory;
import Business.PlumbingRequest.PlumbingRequest;
import Business.PlumbingRequest.PlumbingRequestDirectory;
import Business.Property.Property;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dinesh
 */
public class HirePlumberJPanel extends javax.swing.JPanel {

     private  JPanel userProcessContainer;
    private  EcoSystem system;
    private UserAccount userAccount;
    private  PlumberDirectory plumberDirectory;
    private  PlumbingRequestDirectory plumbingRequestDirectory;
    private BuyerDirectory buyerDirectory;
    private Buyer buyer;
    private Property property;
    /**
     * Creates new form HirePlumberJPanel
     */
    public HirePlumberJPanel(JPanel userProcess, Property property, Buyer buyer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.buyer = buyer;
        this.property = property;
        this.userAccount = userAccount;
        this.plumberDirectory = (system.getPlumberDirectory()== null) ? new PlumberDirectory(): system.getPlumberDirectory();
        this.buyerDirectory = (system.getBuyerDirectory() == null) ? new BuyerDirectory() : system.getBuyerDirectory();
        this.plumbingRequestDirectory = (system.getPlumbingRequestDirectory()== null) ? new PlumbingRequestDirectory(): system.getPlumbingRequestDirectory();
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);
        for (Plumber plumber : plumberDirectory.getPlumberist()) {
//            if ("Available".equals(inspector.getStatus())) {
            Object[] row = new Object[12];
            row[0] = plumber.getPlumberNo();
            row[1] = plumber.getPlumberName();
            row[2] = plumber.getStreet();
            row[3] = plumber.getCity();
            row[4] = plumber.getState();
            row[5] = plumber.getZipcode();
            row[6] = plumber.getStatus();
            row[7] = plumber.getCharge();
            model.addRow(row);
//            }
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
        houseTable = new javax.swing.JTable();
        brnHireInspector = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PlumberID", "Name", "Address", "City", "State", "Zipcode", "Status", "Charge"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houseTable);

        brnHireInspector.setText("Hire Plumber");
        brnHireInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnHireInspectorActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(brnHireInspector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnHireInspector)
                    .addComponent(btnBack))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void brnHireInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnHireInspectorActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        String plumberID = (String) houseTable.getValueAt(selectedRow, 0);
        if (count == 1) {
            Plumber plumber = plumberDirectory.fetchPlumber(plumberID);
            if ("Available".equals(plumber.getStatus())) {
                PlumbingRequest er = new PlumbingRequest();
                er.setRequestID(plumbingRequestDirectory.generatePlumbingRequestID());
                er.setBuyer(buyer);
                er.setPlumber(plumber);
                er.setSeller(property.getSeller());
                er.setStatus("Requested");
                er.setMessage("Inspect House");
                er.setProperty(property);
                plumbingRequestDirectory.addPlumbingRequest(er);
                system.setPlumbingRequestDirectory(plumbingRequestDirectory);
                JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Sorry! This inspector is already Occupied");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_brnHireInspectorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnHireInspector;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable houseTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
