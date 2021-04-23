/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeEventRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.FundCharityEnterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class FundraiserEvents extends javax.swing.JPanel {

    /**
     * Creates new form FundraiserEvents
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;

    public FundraiserEvents(JPanel userProcessContainer, Enterprise enterprise, Network network) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
        initComponents();
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        int count = 0;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enter.getEnterpriseType().equals(Enterprise.EnterpriseType.Event)) {
                if (count != 0) {
                    FundCharityEnterprise event = (FundCharityEnterprise) enter;
                    Object[] row = new Object[7];
                    row[0] = event;
                    row[1] = event.getStreet();
                    row[2] = event.getCity();
                    row[3] = event.getState();
                    row[4] = event.getZipcode();
                    row[5] = event.getBudgetCount();
                    row[6] = event.getFundsCollected();
                    model.addRow(row);
                } else {
                    count++;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();
        buttonCharts = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 243, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Street", "City", "State", "Zipcode", "Budget", "Funds Collected"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jLabel1.setBackground(new java.awt.Color(15, 19, 52));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FUNDRAISER EVENTS");
        jLabel1.setOpaque(true);

        buttonBack.setText("BACK");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        buttonCharts.setText("GENERATE CHARTS");
        buttonCharts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChartsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(buttonBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCharts)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBack)
                    .addComponent(buttonCharts))
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonChartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChartsActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // dataset.setValue(80, "M", "M");
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {

            //System.out.println(e.getName() + "---" + e.getEnterpriseType().equals(Enterprise.EnterpriseType.Camp));
            if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Event)) {
                FundCharityEnterprise ep = (FundCharityEnterprise) e;
                // System.out.println(ep.getFundsCollected());
                //System.out.println();
                if (ep.getFundsCollected() != 0) {
                    dataset.setValue(ep.getFundsCollected(), "Funds Collected", ep.getName());
                }
            }
        }

        JFreeChart chart = ChartFactory.createBarChart("Funds Collected Per Camp", "Event Camp Name", "Total Funds", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("Plot for Most Affected People in Different Areas", chart);
        frame.setVisible(true);
        frame.setSize(450, 350);
    }//GEN-LAST:event_buttonChartsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonCharts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
