/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.AgentRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.UserRegistrationRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author charmi
 */
public class BrokerEntWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BrokerEntWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Network network;
    private OrganizationDirectory organizationDirectory;

    public BrokerEntWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        this.organizationDirectory = enterprise.getOrganizationDirectory();
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {

            if (workRequest instanceof UserRegistrationRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = ((UserRegistrationRequest) workRequest).getStatus();
                row[2] = ((UserRegistrationRequest) workRequest).getUserName();
                row[3] = ((UserRegistrationRequest) workRequest).getName();
                row[4] = ((UserRegistrationRequest) workRequest).getUserEmailId();
                row[5] = ((UserRegistrationRequest) workRequest).getUserCity();
                row[6] = ((UserRegistrationRequest) workRequest).getOrgType();
                row[7] = ((UserRegistrationRequest) workRequest).getNetwork();

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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1058, 840));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(25, 56, 82));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Status", "UserName", "Name", "Email ID", "City", "Organization Type", "Network"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 854, 170));

        btnAccept.setBackground(new java.awt.Color(255, 255, 255));
        btnAccept.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(25, 56, 82));
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 387, -1, -1));

        btnReject.setBackground(new java.awt.Color(255, 255, 255));
        btnReject.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(25, 56, 82));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 387, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE BROKER ENTERPRISE SIGNUP REQUESTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 460, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/VolunteerOPaque512x.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 520, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/collaboration.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0) {
            UserRegistrationRequest request = (UserRegistrationRequest) workRequestJTable.getValueAt(selectedRow, 0);
           
            if (request.getOrgType() == Organization.Type.Agent) {
                Organization org = organizationDirectory.createOrganization(request.getOrgType(), request.getName());
                Employee emp = org.getEmployeeDirectory().createEmployee(request.getName());
                UserAccount ua1 = org.getUserAccountDirectory().createUserAccount(request.getUserName(), request.getUserPassword(), emp, new AgentRole());
            } 

            request.setStatus("Completed");
            JOptionPane.showMessageDialog(null, "User account has been activated successfully");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to process.");
            return;
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0) {
            UserRegistrationRequest request = (UserRegistrationRequest) workRequestJTable.getValueAt(selectedRow, 0);
            request.setStatus("Rejected");
            JOptionPane.showMessageDialog(null, "User request has been removed successfully");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to process.");
            return;
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
