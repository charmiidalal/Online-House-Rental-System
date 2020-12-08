/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuyerRole;

import Business.Buyer.Buyer;
import Business.Buyer.BuyerDirectory;
import Business.EcoSystem;
import Business.InspectRequest.InspectRequest;
import Business.InspectRequest.InspectRequestDirectory;
import Business.Inspector.Inspector;
import Business.Inspector.InspectorDirectory;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.Seller.Seller;
import Business.Seller.SellerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dinesh
 */
public class HireInspectorJPanel extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final EcoSystem system;
    private UserAccount userAccount;
    private final InspectorDirectory inspectorDirectory;
    private final InspectRequestDirectory inspectRequestDirectory;
    private BuyerDirectory buyerDirectory;
    private Buyer buyer;
    private Property property;

    /**
     * Creates new form BuyerWorkAreaJpanel
     */
    public HireInspectorJPanel(JPanel userProcess, Property property, Buyer buyer, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.buyer = buyer;
        this.property = property;
        this.userAccount = userAccount;
        this.inspectorDirectory = (system.getInspectorDirectory() == null) ? new InspectorDirectory() : system.getInspectorDirectory();
        this.buyerDirectory = (system.getBuyerDirectory() == null) ? new BuyerDirectory() : system.getBuyerDirectory();
        this.inspectRequestDirectory = (system.getInspectRequestDirectory() == null) ? new InspectRequestDirectory() : system.getInspectRequestDirectory();
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);
        for (Inspector inspector : inspectorDirectory.getInsepectorList()) {
//            if ("Available".equals(inspector.getStatus())) {
            Object[] row = new Object[12];
            row[0] = inspector.getInspectorNo();
            row[1] = inspector.getInspectorName();
            row[2] = inspector.getStreet();
            row[3] = inspector.getCity();
            row[4] = inspector.getState();
            row[5] = inspector.getZipcode();
            row[6] = inspector.getStatus();
            row[7] = inspector.getCharge();
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

        brnHireInspector = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        btnBuyHouse1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        commentTxxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brnHireInspector.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        brnHireInspector.setText("Hire Inspector");
        brnHireInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnHireInspectorActionPerformed(evt);
            }
        });
        add(brnHireInspector, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, 20));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "InspectorID", "Name", "Address", "City", "State", "Zipcode", "Status", "Charge"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 900, 310));

        btnBuyHouse1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        btnBuyHouse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyHouse1ActionPerformed(evt);
            }
        });
        add(btnBuyHouse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 30, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Comment:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, -1, -1));
        add(commentTxxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 220, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MedicalWorkAreaOpaque.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void brnHireInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnHireInspectorActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        String inspectorID = (String) houseTable.getValueAt(selectedRow, 0);
         String comment = commentTxxt.getText();
        if (count == 1) {
            Inspector inspector = inspectorDirectory.fetchInspector(inspectorID);
            if ("Available".equals(inspector.getStatus())) {
                InspectRequest ir = new InspectRequest();
                ir.setRequestID(inspectRequestDirectory.generateInspectorRequestID());
                ir.setBuyer(buyer);
                ir.setInspector(inspector);
                ir.setSeller((Seller) property.getSeller());
                ir.setStatus("Requested");
                ir.setBuyerNote(comment);
                ir.setProperty(property);
                inspectRequestDirectory.addInspectRequest(ir);
                system.setInspectRequestDirectory(inspectRequestDirectory);
                JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Sorry! This inspector is already Occupied");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_brnHireInspectorActionPerformed

    private void btnBuyHouse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyHouse1ActionPerformed
        // TODO add your handling code here:
        BuyerWorkAreaJPanel buyerWorkAreaJPanel = new BuyerWorkAreaJPanel(userProcessContainer, system, userAccount);
        userProcessContainer.add("BuyerWorkAreaJPanel", buyerWorkAreaJPanel);
        buyerWorkAreaJPanel.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBuyHouse1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnHireInspector;
    private javax.swing.JButton btnBuyHouse1;
    private javax.swing.JTextField commentTxxt;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
