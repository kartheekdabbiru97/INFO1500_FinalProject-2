/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeCampRole;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class HealthcampRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HealthcampRequestJPanel
     */
    public HealthcampRequestJPanel() {
        initComponents();
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
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HEALTH CAMP REQUEST PANEL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(618, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Name", "Camp ID", "Hospital Name", "City", "Date", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(workRequestJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnrefreshActionPerformed
        // TODO add your handling code here:
//        populateTable();
    }//GEN-LAST:event_bttnrefreshActionPerformed

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        // TODO add your handling code here:
//        userProcessContainer.remove(this);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bttnBackActionPerformed

    private void bttnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
//            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }

//        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
//        request.setReceiver(userAccount);
        //request.setStatus("Pending");
//        populateTable();
//        ViewCampRequestJPanel viewCamp = new ViewCampRequestJPanel(userProcessContainer, userAccount, business, request, network, enterprise);
//        userProcessContainer.add("ViewCampRequestJPanel", viewCamp);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_bttnViewDetailsActionPerformed

    private void bttnGenerateBarChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnGenerateBarChartActionPerformed
        // TODO add your handling code here:
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // dataset.setValue(80, "M", "M");
//        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
//
//            //System.out.println(e.getName()+ "---" +e.getEnterpriseType().equals(Enterprise.EnterpriseType.Camp));
//            if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Camp)) {
//                CampEnterprise c = (CampEnterprise) e;
//                System.out.println(c.getName());
//                System.out.println(c.getPeopleAffected());
//                if (c.getPeopleAffected() != null) {
//                    dataset.setValue(Double.parseDouble(c.getPeopleAffected()), "No. of People Affected", c.getName());
//                }
//            }
//
//        }

//        JFreeChart chart = ChartFactory.createBarChart("People affected respective to Areas", "Camp Name", "No. of People Affected", dataset, PlotOrientation.VERTICAL, false, true, false);
//        CategoryPlot p = chart.getCategoryPlot();
//        p.setRangeGridlinePaint(Color.BLACK);
//        ChartFrame frame = new ChartFrame("Plot for Most Affected People in Different Areas", chart);
//        frame.setVisible(true);
//        frame.setSize(450, 350);
    }//GEN-LAST:event_bttnGenerateBarChartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
