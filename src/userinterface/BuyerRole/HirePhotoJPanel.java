/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuyerRole;

import Business.Buyer.Buyer;
import Business.Buyer.BuyerDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Photographer.Photographer;
import Business.Photographer.PhotographerDirectory;
import Business.PhotographerRequest.PhotographerRequest;
import Business.PhotographerRequest.PhotographerRequestDirectory;
import Business.Property.Property;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dinesh
 */
public class HirePhotoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HirePhotoJPanel
     */
    private  JPanel userProcessContainer;
    private  EcoSystem system;
    private UserAccount userAccount;
    private BuyerDirectory buyerDirectory;
    private Buyer buyer;
    private Property property;
    private PhotographerDirectory photographerDirectory;
    private PhotographerRequestDirectory photographerRequestDirectory;
      private Enterprise enterprise;
    private Network network;
    private Organization organization;

    
    
  
    public HirePhotoJPanel(JPanel userProcess,Organization organization,Network network,Enterprise enterprise, Property property,UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.buyer = buyer;
        this.property = property;
        this.userAccount = userAccount;
          this.enterprise=enterprise;
        this.network=network;
        this.organization=organization;
        this.photographerDirectory = (system.getPhotographerDirectory()== null) ? new PhotographerDirectory(): system.getPhotographerDirectory();
        this.buyerDirectory = (system.getBuyerDirectory() == null) ? new BuyerDirectory() : system.getBuyerDirectory();
        this.photographerRequestDirectory = (system.getPhotographerRequestDirectory()== null) ? new PhotographerRequestDirectory(): system.getPhotographerRequestDirectory();
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);
        //for (Photographer photo : photographerDirectory.getPhotographerList()) {
//            if ("Available".equals(inspector.getStatus())) {
for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
        for(Organization org:e.getOrganizationDirectory().getOrganizationList())
        {
        for(UserAccount ua: org.getUserAccountDirectory().getUserAccountList())
        {
            String role=ua.getRole().toString();
           if("Photographer".equals(role)){
            Object[] row = new Object[13];
            row[0] = ua.getUsername();
            row[1] = ua.getName();
            row[2] = ua.getStreet();
            row[3] = ua.getCity();
            row[4] = ua.getState();
            row[5] = ua.getZipcode();
            row[6] = ua.getStatus();
            row[7] = ua.getCharge();
             row[8]=ua.getUserOrganizationList().getName();
            model.addRow(row);
//            }
        }}}}
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
        brnHireInspector = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        commentTxxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        brnHireInspector.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        brnHireInspector.setForeground(new java.awt.Color(0, 0, 51));
        brnHireInspector.setText("Hire Photographer");
        brnHireInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnHireInspectorActionPerformed(evt);
            }
        });

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PhotographerID", "Name", "Address", "City", "State", "Zipcode", "Status", "Charge", "OrganisationName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houseTable);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Comment:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/photograph.png"))); // NOI18N

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(brnHireInspector)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(commentTxxt, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnHireInspector)
                    .addComponent(jLabel1)
                    .addComponent(commentTxxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 101, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void brnHireInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnHireInspectorActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        String PhotoID = (String) houseTable.getValueAt(selectedRow, 0);
         String comment = commentTxxt.getText();
        if (count == 1) {
            Photographer photo = photographerDirectory.fetchPhotographer(PhotoID);
            if ("Available".equals(photo.getStatus())) {
                PhotographerRequest pr = new PhotographerRequest();
                pr.setRequestID(photographerRequestDirectory.generatePhotoRequestID());
                pr.setBuyer(buyer);
                pr.setPhotographer(photo);
                pr.setSeller((Seller) property.getSeller());
                pr.setStatus("Requested");
                pr.setBuyerNote(comment);
                pr.setProperty(property);
                photographerRequestDirectory.addPhotoRequest(pr);
                system.setPhotographerRequestDirectory(photographerRequestDirectory);
                JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Sorry! This Photographer is already Occupied");
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
    private javax.swing.JTextField commentTxxt;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
