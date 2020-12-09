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
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import userinterface.ElectricianRole.ElectricianWorkAreaJPanel;

/**
 *
 * @author Dinesh
 */
public class HireServiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HireServiceJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Property property;
    private Buyer buyer;
       private Enterprise enterprise;
    private Network network;
    private Organization organization;
    
   

    HireServiceJPanel(JPanel userProcessContainer,Organization organization,Network network,Enterprise enterprise, Property property, EcoSystem system, UserAccount userAccount) {
       initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.system=system;
 this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        this.property = property;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        rightSystemAdminPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        manageRequestPanel = new javax.swing.JPanel();
        plumberPanel = new javax.swing.JPanel();
        managePlumber = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        manageScenePanel1 = new javax.swing.JPanel();
        manageElect = new javax.swing.JLabel();
        manageScenePanel2 = new javax.swing.JPanel();
        managePacker = new javax.swing.JLabel();
        manageScenePanel3 = new javax.swing.JPanel();
        managePhoto = new javax.swing.JLabel();
        cleanerPanel = new javax.swing.JPanel();
        manageCleaner = new javax.swing.JLabel();

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 448, -1, -1));

        jPanel3.setBackground(new java.awt.Color(215, 81, 81));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 148));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageRequestPanel.setBackground(new java.awt.Color(215, 81, 81));
        manageRequestPanel.setToolTipText("");
        manageRequestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageRequestPanelMousePressed(evt);
            }
        });

        plumberPanel.setBackground(new java.awt.Color(215, 81, 81));
        plumberPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plumberPanelMousePressed(evt);
            }
        });

        managePlumber.setBackground(new java.awt.Color(215, 81, 81));
        managePlumber.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        managePlumber.setText("Hire Plumber");
        managePlumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                managePlumberMousePressed(evt);
            }
        });

        javax.swing.GroupLayout plumberPanelLayout = new javax.swing.GroupLayout(plumberPanel);
        plumberPanel.setLayout(plumberPanelLayout);
        plumberPanelLayout.setHorizontalGroup(
            plumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plumberPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(managePlumber, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        plumberPanelLayout.setVerticalGroup(
            plumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plumberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managePlumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout manageRequestPanelLayout = new javax.swing.GroupLayout(manageRequestPanel);
        manageRequestPanel.setLayout(manageRequestPanelLayout);
        manageRequestPanelLayout.setHorizontalGroup(
            manageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plumberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        manageRequestPanelLayout.setVerticalGroup(
            manageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageRequestPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(plumberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(manageRequestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 280, 40));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("SERVICE MANAGEMENT");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, 20));

        manageScenePanel1.setBackground(new java.awt.Color(215, 81, 81));
        manageScenePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageScenePanel1MousePressed(evt);
            }
        });

        manageElect.setBackground(new java.awt.Color(215, 81, 81));
        manageElect.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageElect.setText("Hire Electrician");
        manageElect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageElectMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageScenePanel1Layout = new javax.swing.GroupLayout(manageScenePanel1);
        manageScenePanel1.setLayout(manageScenePanel1Layout);
        manageScenePanel1Layout.setHorizontalGroup(
            manageScenePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageScenePanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(manageElect, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageScenePanel1Layout.setVerticalGroup(
            manageScenePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageScenePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageElect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        jPanel3.add(manageScenePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 40));

        manageScenePanel2.setBackground(new java.awt.Color(215, 81, 81));
        manageScenePanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageScenePanel2MousePressed(evt);
            }
        });

        managePacker.setBackground(new java.awt.Color(215, 81, 81));
        managePacker.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        managePacker.setText("Hire Packers/Movers");
        managePacker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                managePackerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageScenePanel2Layout = new javax.swing.GroupLayout(manageScenePanel2);
        manageScenePanel2.setLayout(manageScenePanel2Layout);
        manageScenePanel2Layout.setHorizontalGroup(
            manageScenePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageScenePanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(managePacker, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        manageScenePanel2Layout.setVerticalGroup(
            manageScenePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageScenePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managePacker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        jPanel3.add(manageScenePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 280, 40));

        manageScenePanel3.setBackground(new java.awt.Color(215, 81, 81));
        manageScenePanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageScenePanel3MousePressed(evt);
            }
        });

        managePhoto.setBackground(new java.awt.Color(215, 81, 81));
        managePhoto.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        managePhoto.setText("Hire Photographer");
        managePhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                managePhotoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageScenePanel3Layout = new javax.swing.GroupLayout(manageScenePanel3);
        manageScenePanel3.setLayout(manageScenePanel3Layout);
        manageScenePanel3Layout.setHorizontalGroup(
            manageScenePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageScenePanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(managePhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        manageScenePanel3Layout.setVerticalGroup(
            manageScenePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageScenePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managePhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        jPanel3.add(manageScenePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 290, 40));

        cleanerPanel.setBackground(new java.awt.Color(215, 81, 81));
        cleanerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cleanerPanelMousePressed(evt);
            }
        });

        manageCleaner.setBackground(new java.awt.Color(215, 81, 81));
        manageCleaner.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageCleaner.setText("Hire Cleaner");
        manageCleaner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageCleanerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout cleanerPanelLayout = new javax.swing.GroupLayout(cleanerPanel);
        cleanerPanel.setLayout(cleanerPanelLayout);
        cleanerPanelLayout.setHorizontalGroup(
            cleanerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cleanerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageCleaner, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );
        cleanerPanelLayout.setVerticalGroup(
            cleanerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cleanerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageCleaner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        jPanel3.add(cleanerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 290, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void manageRequestPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageRequestPanelMousePressed
        // TODO add your handling code here:
        plumber();

    }//GEN-LAST:event_manageRequestPanelMousePressed

    private void plumberPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plumberPanelMousePressed
        // TODO add your handling code here:
        plumber();
    }//GEN-LAST:event_plumberPanelMousePressed

    
    private void manageElectMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageElectMousePressed
        // TODO add your handling code here:
        electrician();
    }//GEN-LAST:event_manageElectMousePressed

    private void manageScenePanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageScenePanel1MousePressed
        // TODO add your handling code here:
        electrician();
    }//GEN-LAST:event_manageScenePanel1MousePressed

    private void managePackerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePackerMousePressed
        // TODO add your handling code here:
         packerMover();
    }//GEN-LAST:event_managePackerMousePressed

    private void manageScenePanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageScenePanel2MousePressed
        // TODO add your handling code here:
        packerMover();
    }//GEN-LAST:event_manageScenePanel2MousePressed

    private void managePhotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePhotoMousePressed
        // TODO add your handling code here:
         photograher();
    }//GEN-LAST:event_managePhotoMousePressed

    private void manageScenePanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageScenePanel3MousePressed
        // TODO add your handling code here:
        photograher();
    }//GEN-LAST:event_manageScenePanel3MousePressed

    private void manageCleanerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCleanerMousePressed
        // TODO add your handling code here:
         clearner();
    }//GEN-LAST:event_manageCleanerMousePressed

    private void cleanerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanerPanelMousePressed
        // TODO add your handling code here:
        clearner();
    }//GEN-LAST:event_cleanerPanelMousePressed

    private void managePlumberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePlumberMousePressed
       
    }//GEN-LAST:event_managePlumberMousePressed

   private void plumber()
   {
       plumberPanel.setBackground(new Color(236, 113, 107));
        cleanerPanel.setBackground(new Color(215, 81, 81));
        manageScenePanel1.setBackground(new Color(215, 81, 81));
        manageScenePanel2.setBackground(new Color(215, 81, 81));
        manageScenePanel3.setBackground(new Color(215, 81, 81));
       HirePlumberJPanel hireService = new HirePlumberJPanel(userProcessContainer,organization,network,enterprise, property, userAccount,system);
        userProcessContainer.add("plumberWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
   }
   private void electrician()
   {
       plumberPanel.setBackground(new Color(236, 113, 107));
        cleanerPanel.setBackground(new Color(215, 81, 81));
        manageScenePanel1.setBackground(new Color(215, 81, 81));
        manageScenePanel2.setBackground(new Color(215, 81, 81));
        manageScenePanel3.setBackground(new Color(215, 81, 81));
       HireElectricianJPanel hireService = new HireElectricianJPanel(userProcessContainer, organization,network,enterprise,property, userAccount,system);
        userProcessContainer.add("ElectricianWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
   }
   private void clearner()
   {
       plumberPanel.setBackground(new Color(236, 113, 107));
        cleanerPanel.setBackground(new Color(215, 81, 81));
        manageScenePanel1.setBackground(new Color(215, 81, 81));
        manageScenePanel2.setBackground(new Color(215, 81, 81));
        manageScenePanel3.setBackground(new Color(215, 81, 81));
        HireCleanerJPanel hireService = new HireCleanerJPanel(userProcessContainer,organization,network,enterprise, property, userAccount,system);
        userProcessContainer.add("CleaningWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
   }
   private void packerMover()
   {
       plumberPanel.setBackground(new Color(236, 113, 107));
        cleanerPanel.setBackground(new Color(215, 81, 81));
        manageScenePanel1.setBackground(new Color(215, 81, 81));
        manageScenePanel2.setBackground(new Color(215, 81, 81));
        manageScenePanel3.setBackground(new Color(215, 81, 81));
        HirePackersJPanel hireService = new HirePackersJPanel(userProcessContainer, organization,network,enterprise,property, userAccount,system);
        userProcessContainer.add("HirePackersJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
   }
   private void photograher()
   {
       plumberPanel.setBackground(new Color(236, 113, 107));
        cleanerPanel.setBackground(new Color(215, 81, 81));
        manageScenePanel1.setBackground(new Color(215, 81, 81));
        manageScenePanel2.setBackground(new Color(215, 81, 81));
        manageScenePanel3.setBackground(new Color(215, 81, 81));
        HirePhotoJPanel hireService = new HirePhotoJPanel(userProcessContainer, organization,network,enterprise,property, userAccount,system);
        userProcessContainer.add("PhotoWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cleanerPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel manageCleaner;
    private javax.swing.JLabel manageElect;
    private javax.swing.JLabel managePacker;
    private javax.swing.JLabel managePhoto;
    private javax.swing.JLabel managePlumber;
    private javax.swing.JPanel manageRequestPanel;
    private javax.swing.JPanel manageScenePanel1;
    private javax.swing.JPanel manageScenePanel2;
    private javax.swing.JPanel manageScenePanel3;
    private javax.swing.JPanel plumberPanel;
    private javax.swing.JPanel rightSystemAdminPanel;
    // End of variables declaration//GEN-END:variables

    
}
