/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AgentRole;

import Business.Agent.Agent;
import Business.Agent.AgentDirectory;
import Business.AgentRequest.AgentRequest;
import Business.AgentRequest.AgentRequestDirectory;
import Business.Buyer.BuyerDirectory;
import Business.EcoSystem;
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dinesh
 */
public class ViewAgentJobJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private PropertyDirectory propertyDirectory;
    private BuyerDirectory buyerDirectory;
    private AgentRequestDirectory agentRequestDirectory;
    private AgentDirectory agentDirectory;

    /**
     * Creates new form ViewJobJPanel
     */
    public ViewAgentJobJPanel(JPanel userProcess, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.userAccount = userAccount;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        this.buyerDirectory = (system.getBuyerDirectory() == null) ? new BuyerDirectory() : system.getBuyerDirectory();
        this.agentRequestDirectory = (system.getAgentRequestDirectory() == null) ? new AgentRequestDirectory() : system.getAgentRequestDirectory();
        this.agentDirectory = (system.getAgentDirectory() == null) ? new AgentDirectory() : system.getAgentDirectory();
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);
        Agent agent = agentDirectory.fetchAgent(userAccount.getEmployee().getName());
        for (AgentRequest agentRequest : agentRequestDirectory.getAgentRequestList()) {
            if (agentRequest.getAgent().getAgentNo().equals(agent.getAgentNo())) {
                Object[] row = new Object[9];
                row[0] = agentRequest.getRequestID();
                row[1] = agentRequest.getBuyer().getBuyerName();
                row[2] = agentRequest.getCity();
                row[3] = agentRequest.getZipcode();
                row[4] = agentRequest.getBhk();
                row[5] = agentRequest.getBathroom();
                row[6] = agentRequest.getStatus();
                row[7] = agentRequest.getBuyerNote();
                row[8] = agentRequest.getAgentNote();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        brnTakeJob = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtFeedback = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCompleteJob = new javax.swing.JButton();
        btnSuggestProperty = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/AGENTO.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 660, 440));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JobID", "Buyer", "City", "Zipcode", "BHK", "Bathroom", "Status", "Buyer Message", "Inspector Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 824, 300));

        brnTakeJob.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        brnTakeJob.setText("Take Job");
        brnTakeJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brnTakeJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnTakeJobActionPerformed(evt);
            }
        });
        add(brnTakeJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        btnBack.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        txtFeedback.setBackground(new java.awt.Color(153, 204, 255));
        add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 138, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel1.setText("Feedback:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, -1, -1));

        btnCompleteJob.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnCompleteJob.setText("Mark Complete");
        btnCompleteJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompleteJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteJobActionPerformed(evt);
            }
        });
        add(btnCompleteJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, -1, -1));

        btnSuggestProperty.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnSuggestProperty.setText("Suggest Property");
        btnSuggestProperty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuggestProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuggestPropertyActionPerformed(evt);
            }
        });
        add(btnSuggestProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("AGENT WORK REQUEST");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/AGENT.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 145, 164));
    }// </editor-fold>//GEN-END:initComponents

    private void brnTakeJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnTakeJobActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {

            String jobID = (String) houseTable.getValueAt(selectedRow, 0);
            AgentRequest agentRequest = agentRequestDirectory.fetchAgentRequest(jobID);
            if (!"Job Taken".equals(agentRequest.getStatus())) {
                agentRequest.setStatus("Job Taken");
                Agent agent = agentDirectory.fetchAgent(userAccount.getEmployee().getName());
                agent.setStatus("Occupied");
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
                AgentRequest agentRequest = agentRequestDirectory.fetchAgentRequest(jobID);
                agentRequest.setStatus("Completed");
                agentRequest.setAgentNote(feedback);
                populateRequestTable();
                JOptionPane.showMessageDialog(null, "Job Completed Successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Please enter feedback!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnCompleteJobActionPerformed

    private void btnSuggestPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuggestPropertyActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            String jobID = (String) houseTable.getValueAt(selectedRow, 0);
            AgentRequest agentRequest = agentRequestDirectory.fetchAgentRequest(jobID);
            AssignPropetyJPanel assignPropetyJPanel = new AssignPropetyJPanel(userProcessContainer, userAccount, system, agentRequest);
            userProcessContainer.add("assignPropetyJPanel", assignPropetyJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnSuggestPropertyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnTakeJob;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompleteJob;
    private javax.swing.JButton btnSuggestProperty;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFeedback;
    // End of variables declaration//GEN-END:variables
}
