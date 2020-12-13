/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AgentRole;
import Business.Role.BuilderRole;
import Business.Role.BuyerRole;
import Business.Role.CleaningRole;
import Business.Role.ElectricianRole;
import Business.Role.InspectorRole;
import Business.Role.PackersMoversRole;
import Business.Role.PhotographerRole;
import Business.Role.SellerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import Business.WorkQueue.*;

/**
 *
 * @author Mayank
 */
public class BarGraphforStatusofWR extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    JFreeChart barChart;

    /**
     * Creates new form ViewScenesGraph
     */
    public BarGraphforStatusofWR(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateBarGraph();
    }

    public void populateBarGraph() {
        barChart = ChartFactory.createBarChart(
                "Sample",
                "Status",
                "Work Request Count",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel1.removeAll();
        jPanel1.add(chartPanel, BorderLayout.CENTER);
        jPanel1.validate();
    }

    private CategoryDataset createDataset() {
        final String completed = "Completed";
        final String requested = "Pending";
        final String accepted = "In Progress";
        final DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();
        int AgentRCompletedCount = 0, AgentRRequestedCount = 0, AgentRAcceptedCount = 0,
                InspectorRCompletedCount = 0, InspectorRRequestedCount = 0, InspectorRAcceptedCount = 0,
                CleanerRCompletedCount = 0, CleanerRRequestedCount = 0, CleanerRAcceptedCount = 0,
                BuilderRCompletedCount = 0, BuilderRRequestedCount = 0, BuilderRAcceptedCount = 0,
                ElectricianRCompletedCount = 0, ElectricianRRequestedCount = 0, ElectricianRAcceptedCount = 0,
                PhotographerRCompletedCount = 0, PhotographerRRequestedCount = 0, PhotographerRAcceptedCount = 0,
                PackersMoversRCompletedCount = 0, PackersMoversRRequestedCount = 0, PackersMoversRAcceptedCount = 0;
        DefaultPieDataset result = new DefaultPieDataset();

        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                    if (wr instanceof AgentRequest) {
                        if (wr.getStatus().equals("Completed")) {
                            AgentRCompletedCount++;
                        } else if (wr.getStatus().equals("Pending")) {
                            AgentRRequestedCount++;
                        } else if (wr.getStatus().equals("In Progress")) {
                            AgentRAcceptedCount++;
                        }
                    } else if (wr instanceof InspectRequest) {
                        if (wr.getStatus().equals("Completed")) {
                            InspectorRCompletedCount++;
                        } else if (wr.getStatus().equals("Pending")) {
                            InspectorRRequestedCount++;
                        } else if (wr.getStatus().equals("In Progress")) {
                            InspectorRAcceptedCount++;
                        }
                    } else if (wr instanceof CleaningRequest) {
                        if (wr.getStatus().equals("Completed")) {
                            CleanerRCompletedCount++;
                        } else if (wr.getStatus().equals("Pending")) {
                            CleanerRRequestedCount++;
                        } else if (wr.getStatus().equals("In Progress")) {
                            CleanerRAcceptedCount++;
                        }
                    } else if (wr instanceof BuilderRequest) {
                        if (wr.getStatus().equals("Completed")) {
                            BuilderRCompletedCount++;
                        } else if (wr.getStatus().equals("Pending")) {
                            BuilderRRequestedCount++;
                        } else if (wr.getStatus().equals("In Progress")) {
                            BuilderRAcceptedCount++;
                        }
                    } else if (wr instanceof ElectricianRequest) {
                        if (wr.getStatus().equals("Completed")) {
                            ElectricianRCompletedCount++;
                        } else if (wr.getStatus().equals("Pending")) {
                            ElectricianRRequestedCount++;
                        } else if (wr.getStatus().equals("In Progress")) {
                            ElectricianRAcceptedCount++;
                        }
                    } else if (wr instanceof PhotographerRequest) {
                        if (wr.getStatus().equals("Completed")) {
                            PhotographerRCompletedCount++;
                        } else if (wr.getStatus().equals("Pending")) {
                            PhotographerRRequestedCount++;
                        } else if (wr.getStatus().equals("In Progress")) {
                            PhotographerRAcceptedCount++;
                        }
                    } else if (wr instanceof PackerRequest) {
                        if (wr.getStatus().equals("Completed")) {
                            PackersMoversRCompletedCount++;
                        } else if (wr.getStatus().equals("Pending")) {
                            PackersMoversRRequestedCount++;
                        } else if (wr.getStatus().equals("In Progress")) {
                            PackersMoversRAcceptedCount++;
                        }
                    }
                }
            }
        }
        dataset.addValue(AgentRCompletedCount, "Agent", completed);
        dataset.addValue(AgentRRequestedCount, "Agent", requested);
        dataset.addValue(AgentRAcceptedCount, "Agent", accepted);
        dataset.addValue(InspectorRCompletedCount, "Inspector", completed);
        dataset.addValue(InspectorRRequestedCount, "Inspector", requested);
        dataset.addValue(InspectorRAcceptedCount, "Inspector", accepted);
        dataset.addValue(CleanerRCompletedCount, "Cleaner", completed);
        dataset.addValue(CleanerRRequestedCount, "Cleaner", requested);
        dataset.addValue(CleanerRAcceptedCount, "Cleaner", accepted);
        dataset.addValue(BuilderRCompletedCount, "Builder", completed);
        dataset.addValue(BuilderRRequestedCount, "Builder", requested);
        dataset.addValue(BuilderRAcceptedCount, "Builder", accepted);
        dataset.addValue(ElectricianRCompletedCount, "Electrician", completed);
        dataset.addValue(ElectricianRRequestedCount, "Electrician", requested);
        dataset.addValue(ElectricianRAcceptedCount, "Electrician", accepted);
        dataset.addValue(PhotographerRCompletedCount, "Photographer", completed);
        dataset.addValue(PhotographerRRequestedCount, "Photographer", requested);
        dataset.addValue(PhotographerRAcceptedCount, "Photographer", accepted);
        dataset.addValue(PackersMoversRCompletedCount, "Packers-Movers", completed);
        dataset.addValue(PackersMoversRRequestedCount, "Packers-Movers", requested);
        dataset.addValue(PackersMoversRAcceptedCount, "Packers-Movers", accepted);
        return dataset;
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
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 860, 600));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 56, 82));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("WORK-REQUEST ANALYSIS PER USER ROLE");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 594, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/bar-chart-big.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
