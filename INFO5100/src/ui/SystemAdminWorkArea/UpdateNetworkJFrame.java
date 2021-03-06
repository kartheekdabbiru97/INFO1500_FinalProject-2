/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Network.Network;
import javax.swing.JOptionPane;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class UpdateNetworkJFrame extends javax.swing.JFrame {

    private EcoSystem system;
    private Network selectedNetwork;
    private ManageNetworkJPanel panel;

    /**
     * Creates new form UpdateNetworkJFrame
     */
    UpdateNetworkJFrame(EcoSystem system, Network network, ManageNetworkJPanel panel) {
        this.system = system;
        this.selectedNetwork = network;
        this.panel = panel;
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        txtNetworkName.setText(selectedNetwork.getName());
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNetworkName = new rojerusan.RSMetroTextPlaceHolder();
        bttnSave = new rojerusan.RSMaterialButtonRectangle();
        bttnCancel = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 122, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("UPDATE NETWORK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Network Name:");

        txtNetworkName.setForeground(new java.awt.Color(51, 51, 51));
        txtNetworkName.setToolTipText("");
        txtNetworkName.setBorderColor(new java.awt.Color(51, 51, 51));
        txtNetworkName.setBotonColor(new java.awt.Color(235, 122, 102));
        txtNetworkName.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtNetworkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetworkNameActionPerformed(evt);
            }
        });

        bttnSave.setBackground(new java.awt.Color(235, 122, 102));
        bttnSave.setForeground(new java.awt.Color(51, 51, 51));
        bttnSave.setText("Save");
        bttnSave.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSaveActionPerformed(evt);
            }
        });

        bttnCancel.setBackground(new java.awt.Color(235, 122, 102));
        bttnCancel.setForeground(new java.awt.Color(51, 51, 51));
        bttnCancel.setText("Cancel");
        bttnCancel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(txtNetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(bttnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(bttnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSaveActionPerformed
        String name = txtNetworkName.getText();
        if (!name.equals("")) {
            if (!system.isDuplicateNetwork(name)) {
                system.updateNetwork(this.selectedNetwork, name);
                DB4OUtil.getInstance().storeSystem(system);
                this.panel.populateNetworkTable();
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "This name already exist");
            }
        } else {
            JOptionPane.showMessageDialog(null, "The Network cannot be null");
        }
    }//GEN-LAST:event_bttnSaveActionPerformed

    private void bttnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_bttnCancelActionPerformed

    private void txtNetworkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetworkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNetworkNameActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnCancel;
    private rojerusan.RSMaterialButtonRectangle bttnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSMetroTextPlaceHolder txtNetworkName;
    // End of variables declaration//GEN-END:variables
}
