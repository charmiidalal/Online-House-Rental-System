/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PropertyManagerRole;

import Business.Buyer.Buyer;
import Business.Buyer.BuyerDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.ManagerRequest.ManagerRequest;
import Business.ManagerRequest.ManagerRequestDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.PropertyManager.PropertyManagerDirectory;
import Business.Seller.SellerDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.BuyerRole.HireCleanerJPanel;
import userinterface.BuyerRole.HireElectricianJPanel;
import userinterface.BuyerRole.HirePhotoJPanel;
import userinterface.BuyerRole.HirePlumberJPanel;

/**
 *
 * @author Dinesh
 */
public class ViewJobsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;

    private SellerDirectory sellerDirectory;
    private PropertyDirectory propertyDirectory;
    private BuyerDirectory buyerDirectory;
    private ManagerRequestDirectory managerRequestDirectory;
    private PropertyManagerDirectory propertyManagerDirectory;
    private Property property;
    private Buyer buyer;
    private Enterprise enterprise;
    private Network network;
    private Organization organization;

    /**
     * Creates new form ViewJobsJPanel
     */

    public ViewJobsJPanel(JPanel userProcessContainer, Organization organization, Network network, Enterprise enterprise, Property property, UserAccount useraccount, EcoSystem system) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;

        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        this.buyerDirectory = (system.getBuyerDirectory() == null) ? new BuyerDirectory() : system.getBuyerDirectory();
        this.managerRequestDirectory = (system.getManagerRequestDirectory() == null) ? new ManagerRequestDirectory() : system.getManagerRequestDirectory();
        this.propertyManagerDirectory = (system.getPropertyManagerDirectory() == null) ? new PropertyManagerDirectory() : system.getPropertyManagerDirectory();
        this.property = property;
        this.buyer = buyer;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        this.enterprise = enterprise;
        populateStatusComboBox();
    }

    public void populateRequestTableFilter(String status) {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);

        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {

            if (workRequest instanceof ManagerRequest) {
                if (((ManagerRequest) workRequest).getStatus().equals(status)) {
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
    }

    public void populateStatusComboBox() {
        populateStatus.removeAllItems();
        populateStatus.addItem("Pending");
        populateStatus.addItem("Completed");
        populateStatus.addItem("In Progress");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        brnTakeJob = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFeedback = new javax.swing.JTextField();
        btnCompleteJob = new javax.swing.JButton();
        hirePlumBtn1 = new javax.swing.JButton();
        hireCleanBtn1 = new javax.swing.JButton();
        hirePackBtn1 = new javax.swing.JButton();
        hireElecBtn1 = new javax.swing.JButton();
        hirePhotoBtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        quoteTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        houseTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        populateStatus = new javax.swing.JComboBox();

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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Buyer", "Seller", "Street", "City", "State", "Zipcode", "Status", "Buyer Message", "Manager Message"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 900, 300));

        brnTakeJob.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        brnTakeJob.setText("Take Job");
        brnTakeJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brnTakeJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnTakeJobActionPerformed(evt);
            }
        });
        add(brnTakeJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel1.setText("Feedback:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 710, -1, -1));

        txtFeedback.setBackground(new java.awt.Color(153, 204, 255));
        add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 710, 138, -1));

        btnCompleteJob.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnCompleteJob.setText("Mark Complete");
        btnCompleteJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteJobActionPerformed(evt);
            }
        });
        add(btnCompleteJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 750, -1, -1));

        hirePlumBtn1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        hirePlumBtn1.setText("Hire Plumber");
        hirePlumBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hirePlumBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hirePlumBtn1ActionPerformed(evt);
            }
        });
        add(hirePlumBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 140, -1));

        hireCleanBtn1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        hireCleanBtn1.setText("Hire Cleaner");
        hireCleanBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hireCleanBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireCleanBtn1ActionPerformed(evt);
            }
        });
        add(hireCleanBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 140, -1));

        hirePackBtn1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        hirePackBtn1.setText("Hire Packers/Movers");
        hirePackBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(hirePackBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 140, -1));

        hireElecBtn1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        hireElecBtn1.setText("Hire Electrician");
        hireElecBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hireElecBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireElecBtn1ActionPerformed(evt);
            }
        });
        add(hireElecBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 140, -1));

        hirePhotoBtn1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        hirePhotoBtn1.setText("Hire Photographer");
        hirePhotoBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hirePhotoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hirePhotoBtn1ActionPerformed(evt);
            }
        });
        add(hirePhotoBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 140, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Update Quote: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 680, -1, -1));

        quoteTxt.setBackground(new java.awt.Color(153, 204, 255));
        quoteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quoteTxtActionPerformed(evt);
            }
        });
        add(quoteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 680, 140, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/property.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 690, 550));

        houseTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(houseTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 900, 300));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("PROPERTY MANAGER WORK REQUEST");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/real-estate-agent.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 164));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel6.setText("Serach By Status");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        clearBtn.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, -1));

        populateStatus.setBackground(new java.awt.Color(255, 255, 255));
        populateStatus.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        populateStatus.setForeground(new java.awt.Color(25, 56, 82));
        populateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                populateStatusActionPerformed(evt);
            }
        });
        populateStatus.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                populateStatusPropertyChange(evt);
            }
        });
        add(populateStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void brnTakeJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnTakeJobActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        if (selectedRow >= 0) {
            ManagerRequest managerRequest = (ManagerRequest) houseTable.getValueAt(selectedRow, 0);
            String feedback = txtFeedback.getText();
            if (!"Job Taken".equals(managerRequest.getStatus())) {
                if (!"".equals(feedback)) {
                    managerRequest.setStatus("Job Taken");
                    managerRequest.setQuote(quoteTxt.getText());

                    userAccount.setStatus("Occupied");
                    populateRequestTable();
                    JOptionPane.showMessageDialog(null, "Job Taken Successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter feedback!");
                }
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
            ManagerRequest managerRequest = (ManagerRequest) houseTable.getValueAt(selectedRow, 0);
            String feedback = txtFeedback.getText();

            if (!"".equals(feedback)) {
                managerRequest.setStatus("Completed");
                managerRequest.setInspectorNote(feedback);
                populateRequestTable();
                userAccount.setStatus("Available");
            } else {
                JOptionPane.showMessageDialog(null, "Please enter feedback!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnCompleteJobActionPerformed

    private void hireElecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireElecBtnActionPerformed

        HireElectricianJPanel hireService = new HireElectricianJPanel(userProcessContainer, organization, network, enterprise, property, userAccount, system);

        userProcessContainer.add("ElectricianWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hireElecBtnActionPerformed

    private void hirePlumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirePlumBtnActionPerformed
        HirePlumberJPanel hireService = new HirePlumberJPanel(userProcessContainer, organization, network, enterprise, property, buyer, system);
        userProcessContainer.add("plumberWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hirePlumBtnActionPerformed

    private void hirePhotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirePhotoBtnActionPerformed
        HirePhotoJPanel hireService = new HirePhotoJPanel(userProcessContainer, organization, network, enterprise, property, buyer, system);
        userProcessContainer.add("PhotoWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hirePhotoBtnActionPerformed

    private void hireCleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireCleanBtnActionPerformed
        HireCleanerJPanel hireService = new HireCleanerJPanel(userProcessContainer, organization, network, enterprise, property, buyer, system);
        userProcessContainer.add("CleaningWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hireCleanBtnActionPerformed

    private void hireElecBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireElecBtn1ActionPerformed
        HireElectricianJPanel hireService = new HireElectricianJPanel(userProcessContainer, organization, network, enterprise, property, buyer, system);
        userProcessContainer.add("ElectricianWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hireElecBtn1ActionPerformed

    private void hirePlumBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirePlumBtn1ActionPerformed
        HirePlumberJPanel hireService = new HirePlumberJPanel(userProcessContainer, organization, network, enterprise, property, buyer, system);
        userProcessContainer.add("plumberWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hirePlumBtn1ActionPerformed

    private void hirePhotoBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirePhotoBtn1ActionPerformed
        HirePhotoJPanel hireService = new HirePhotoJPanel(userProcessContainer, organization, network, enterprise, property, buyer, system);
        userProcessContainer.add("PhotoWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hirePhotoBtn1ActionPerformed

    private void hireCleanBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireCleanBtn1ActionPerformed
        HireCleanerJPanel hireService = new HireCleanerJPanel(userProcessContainer, organization, network, enterprise, property, buyer, system);
        userProcessContainer.add("CleaningWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hireCleanBtn1ActionPerformed

    private void quoteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quoteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quoteTxtActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void populateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_populateStatusActionPerformed
        // TODO add your handling code here:
        String status = (String) populateStatus.getSelectedItem();
        if (status != null) {
            populateRequestTableFilter(status);
        }
    }//GEN-LAST:event_populateStatusActionPerformed

    private void populateStatusPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_populateStatusPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_populateStatusPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnTakeJob;
    private javax.swing.JButton btnCompleteJob;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton hireCleanBtn;
    private javax.swing.JButton hireCleanBtn1;
    private javax.swing.JButton hireElecBtn;
    private javax.swing.JButton hireElecBtn1;
    private javax.swing.JButton hirePackBtn;
    private javax.swing.JButton hirePackBtn1;
    private javax.swing.JButton hirePhotoBtn;
    private javax.swing.JButton hirePhotoBtn1;
    private javax.swing.JButton hirePlumBtn;
    private javax.swing.JButton hirePlumBtn1;
    private javax.swing.JTable houseTable;
    private javax.swing.JTable houseTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox populateStatus;
    private javax.swing.JTextField quoteTxt;
    private javax.swing.JTextField txtFeedback;
    // End of variables declaration//GEN-END:variables
}
