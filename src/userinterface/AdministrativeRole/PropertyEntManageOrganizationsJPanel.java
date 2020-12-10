/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author charmi
 */
public class PropertyEntManageOrganizationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VoluntaryOperatingUnitOrganizationJPanel
     */
    private final OrganizationDirectory directory;

    public PropertyEntManageOrganizationsJPanel(OrganizationDirectory directory) {
        initComponents();
        this.directory = directory;
        volPopulate();
        populateOrganizationTypeComboBox();

    }

    private void populateOrganizationTypeComboBox() {
        OrganizationTypeComboBox.removeAllItems();
        OrganizationTypeComboBox.addItem(Organization.Type.PropertyManager);
        OrganizationTypeComboBox.addItem(Organization.Type.Builder);
        OrganizationTypeComboBox.addItem(Organization.Type.Seller);
    }

    public void volPopulate() {
        DefaultTableModel model = (DefaultTableModel) tblVoluntaryOrg.getModel();

        model.setRowCount(0);

        for (Organization organization : directory.getOrganizationList()) {
            {
                Object[] row = new Object[2];
                row[0] = organization.getType().getValue();
                row[1] = organization.getName();
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
        tblVoluntaryOrg = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        OrganizationTypeComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        organizationName = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 242));
        setMinimumSize(new java.awt.Dimension(1058, 840));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVoluntaryOrg.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tblVoluntaryOrg.setForeground(new java.awt.Color(25, 56, 82));
        tblVoluntaryOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Type", "Organization Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVoluntaryOrg.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(tblVoluntaryOrg);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 595, 203));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 56, 82));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGE PROPERTY ORGANIZATIONS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 595, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setText("Organization Type ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        OrganizationTypeComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        OrganizationTypeComboBox.setForeground(new java.awt.Color(25, 56, 82));
        add(OrganizationTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 171, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("Organization Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        organizationName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        organizationName.setForeground(new java.awt.Color(25, 56, 82));
        add(organizationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 171, -1));

        addJButton.setBackground(new java.awt.Color(255, 255, 255));
        addJButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        addJButton.setForeground(new java.awt.Color(25, 56, 82));
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/organization.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/Organization_back.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 660, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Type type = (Type) OrganizationTypeComboBox.getSelectedItem();

        if ("".equals(organizationName.getText())) {
            JOptionPane.showMessageDialog(null, "Enter organization name!");
        } else {
            Organization organization = directory.createOrganization(type, organizationName.getText());
            JOptionPane.showMessageDialog(null, "Organization Successfully Created");
            organizationName.setText("");
            volPopulate();
        }

    }//GEN-LAST:event_addJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox OrganizationTypeComboBox;
    private javax.swing.JButton addJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField organizationName;
    private javax.swing.JTable tblVoluntaryOrg;
    // End of variables declaration//GEN-END:variables
}
