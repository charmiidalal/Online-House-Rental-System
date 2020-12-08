/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuyerRole;

import Business.Buyer.Buyer;
import Business.Buyer.BuyerDirectory;
import Business.Cleaner.CleanerDirectory;
import Business.CleaningRequest.CleaningRequest;
import Business.CleaningRequest.CleaningRequestDirectory;
import Business.EcoSystem;
import Business.ElectricianRequest.ElectricianRequest;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
<<<<<<< HEAD
=======
import Business.Property.Property;
>>>>>>> bd24255e7fdd7c6026d568171835043a89f55245
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
public class ManageCleanerActivity extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private SellerDirectory sellerDirectory;
    private PropertyDirectory propertyDirectory;
    private BuyerDirectory buyerDirectory;
    private CleaningRequestDirectory cleaningRequestDirectory;
    private CleanerDirectory cleanerDirectory;
<<<<<<< HEAD
     private Enterprise enterprise;
    private Network network;
    private Organization organization;
=======
    private Enterprise enterprise;
    private Network network;
    private Organization organization;

>>>>>>> bd24255e7fdd7c6026d568171835043a89f55245
    /**
     * Creates new form ViewCleanerJobs
     */
    public ManageCleanerActivity(JPanel userProcess, Organization organization, Network network, Enterprise enterprise, Property property, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.userAccount = userAccount;
<<<<<<< HEAD
         this.enterprise=enterprise;
        this.network=network;
        this.organization=organization;
=======
        this.enterprise = enterprise;
        this.network = network;
        this.organization = organization;
>>>>>>> bd24255e7fdd7c6026d568171835043a89f55245
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        this.cleaningRequestDirectory = (system.getCleaningRequestDirectory() == null) ? new CleaningRequestDirectory() : system.getCleaningRequestDirectory();
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);
<<<<<<< HEAD
        //Buyer buyer = buyerDirectory.fetchBuyer(userAccount.getEmployee().getName());
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList())
        {
        for(Organization org:e.getOrganizationDirectory().getOrganizationList())
        {
            //UserAccount ua = org.getUserAccountDirectory().searchUser(cleanerID);
        for(UserAccount ua:org.getUserAccountDirectory().getUserAccountList())
        {
       
        for (CleaningRequest cleaningRequest : cleaningRequestDirectory.getCleaningRequestList()) {
            if (cleaningRequest.getBuyer().getUsername().equals(ua.getUsername())) {
                Object[] row = new Object[11];
                row[0] = cleaningRequest.getRequestID();
                row[1] = cleaningRequest.getCleaner().getName();
                row[2] = cleaningRequest.getSeller().getName();
                row[3] = cleaningRequest.getProperty().getStreet();
                row[4] = cleaningRequest.getProperty().getCity();
                row[5] = cleaningRequest.getProperty().getState();
                row[6] = cleaningRequest.getProperty().getPincode();
                row[7] = cleaningRequest.getStatus();
                row[8] = cleaningRequest.getBuyerNote();
                row[9] = cleaningRequest.getInspectorNote();
                row[10] =cleaningRequest.getQuote();
                model.addRow(row);
            }}
=======
        for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
            for (CleaningRequest cleaningRequest : cleaningRequestDirectory.getCleaningRequestList()) {
                if (cleaningRequest.getBuyer().getBuyerNo().equals(ua.getUsername())) {
                    Object[] row = new Object[11];
                    row[0] = cleaningRequest.getRequestID();
                    row[1] = cleaningRequest.getCleaner().getCleanerName();
                    row[2] = cleaningRequest.getSeller().getName();
                    row[3] = cleaningRequest.getProperty().getStreet();
                    row[4] = cleaningRequest.getProperty().getCity();
                    row[5] = cleaningRequest.getProperty().getState();
                    row[6] = cleaningRequest.getProperty().getPincode();
                    row[7] = cleaningRequest.getStatus();
                    row[8] = cleaningRequest.getBuyerNote();
                    row[9] = cleaningRequest.getInspectorNote();
                    row[10] = cleaningRequest.getQuote();
                    model.addRow(row);
                }
            }
>>>>>>> bd24255e7fdd7c6026d568171835043a89f55245
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFeedback = new javax.swing.JTextField();
        btnCompleteJob = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Feedback:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));
        jPanel1.add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 245, -1));

        btnCompleteJob.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCompleteJob.setForeground(new java.awt.Color(0, 0, 51));
        btnCompleteJob.setText("Send Message");
        btnCompleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteJobActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompleteJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 140, 30));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Cleaner", "Seller", "Street", "City", "State", "Zipcode", "Status", "Buyer Message", "Cleaner Message", "Charge"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(houseTable);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/cleaning-staff.png"))); // NOI18N

        btnBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteJobActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            String feedback = txtFeedback.getText();
            String jobID = (String) houseTable.getValueAt(selectedRow, 0);

            if (!"".equals(feedback)) {
                CleaningRequest cleanerRequest = cleaningRequestDirectory.fetchCleaningRequest(jobID);
                cleanerRequest.setBuyerNote(feedback);
                populateRequestTable();
                JOptionPane.showMessageDialog(null, "Message Sent Successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Please enter feedback!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnCompleteJobActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnCompleteJob;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtFeedback;
    // End of variables declaration//GEN-END:variables
}
