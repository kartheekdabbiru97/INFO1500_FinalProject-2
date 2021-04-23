/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.logging.*;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();
        populateComboBox();
    }

    void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network;
                row[2] = enterprise.getEnterpriseType();

                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        comboNetwork.removeAllItems();
        comboEnterpriseType.removeAllItems();

        for (Network network : system.getNetworkList()) {
            comboNetwork.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            comboEnterpriseType.addItem(type);
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        comboNetwork = new rojerusan.RSComboMetro();
        comboEnterpriseType = new rojerusan.RSComboMetro();
        bttnBack = new rojerusan.RSMaterialButtonRectangle();
        bttnSubmit = new rojerusan.RSMaterialButtonRectangle();
        bttnDelete = new rojerusan.RSMaterialButtonRectangle();
        bttnUpdate = new rojerusan.RSMaterialButtonRectangle();
        txtName = new rojerusan.RSMetroTextPlaceHolder();

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setSelectionBackground(new java.awt.Color(235, 122, 102));
        enterpriseJTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Network");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Enterprise Type");

        jPanel1.setBackground(new java.awt.Color(235, 122, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("WELCOME TO ENTERPRISE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        comboNetwork.setBackground(new java.awt.Color(235, 122, 102));
        comboNetwork.setForeground(new java.awt.Color(51, 51, 51));
        comboNetwork.setColorArrow(new java.awt.Color(235, 122, 102));
        comboNetwork.setColorBorde(new java.awt.Color(51, 51, 51));
        comboNetwork.setColorFondo(new java.awt.Color(235, 122, 102));
        comboNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNetworkActionPerformed(evt);
            }
        });

        comboEnterpriseType.setBackground(new java.awt.Color(235, 122, 102));
        comboEnterpriseType.setForeground(new java.awt.Color(51, 51, 51));
        comboEnterpriseType.setColorArrow(new java.awt.Color(235, 122, 102));
        comboEnterpriseType.setColorBorde(new java.awt.Color(51, 51, 51));
        comboEnterpriseType.setColorFondo(new java.awt.Color(235, 122, 102));

        bttnBack.setBackground(new java.awt.Color(235, 122, 102));
        bttnBack.setForeground(new java.awt.Color(51, 51, 51));
        bttnBack.setText("Back");
        bttnBack.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBackActionPerformed(evt);
            }
        });

        bttnSubmit.setBackground(new java.awt.Color(235, 122, 102));
        bttnSubmit.setForeground(new java.awt.Color(51, 51, 51));
        bttnSubmit.setText("Submit");
        bttnSubmit.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSubmitActionPerformed(evt);
            }
        });

        bttnDelete.setBackground(new java.awt.Color(235, 122, 102));
        bttnDelete.setForeground(new java.awt.Color(51, 51, 51));
        bttnDelete.setText("Delete");
        bttnDelete.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDeleteActionPerformed(evt);
            }
        });

        bttnUpdate.setBackground(new java.awt.Color(235, 122, 102));
        bttnUpdate.setForeground(new java.awt.Color(51, 51, 51));
        bttnUpdate.setText("Update");
        bttnUpdate.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnUpdateActionPerformed(evt);
            }
        });

        txtName.setForeground(new java.awt.Color(15, 19, 52));
        txtName.setToolTipText("");
        txtName.setBorderColor(new java.awt.Color(51, 51, 51));
        txtName.setBotonColor(new java.awt.Color(235, 122, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(comboNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNetworkActionPerformed

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bttnBackActionPerformed

    private void bttnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSubmitActionPerformed
        log.info("Submit Button aaction Performed");
        Network network = (Network) comboNetwork.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) comboEnterpriseType.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input, Please check.");
            return;
        }
        int check = 0;
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a Network name");
            check = 1;
        }
        if (check == 0) {
            String name = txtName.getText();
            
            if (!network.getEnterpriseDirectory().IsDuplicateEnterprise(name)) {

            Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);

            populateTable();
            txtName.setText("");
            JOptionPane.showMessageDialog(null, "Congrats! You have now created " + comboEnterpriseType.getSelectedItem() + " enterprise.");
            log.info("New Enterprise Created");
            }
            else{
                JOptionPane.showMessageDialog(null, "This name already exist");
            }
        }
    }//GEN-LAST:event_bttnSubmitActionPerformed

    private void bttnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteActionPerformed
        log.info("delete Button action Performed");
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow > 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String enterpriseName = (String) enterpriseJTable.getValueAt(selectedRow, 0);
                Network network = (Network) enterpriseJTable.getValueAt(selectedRow, 1);
                Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseJTable.getValueAt(selectedRow, 2);
                Enterprise enterprise = network.getEnterpriseDirectory().removeEnterprise(enterpriseName, type);
                populateTable();
                log.info("Enterprise deleted");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");

        }
    }//GEN-LAST:event_bttnDeleteActionPerformed

    private void bttnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnUpdateActionPerformed
        log.info("Update Button aaction Performed");
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow >= 0) {
            String enterpriseName = (String) enterpriseJTable.getValueAt(selectedRow, 0);
            Network network = (Network) enterpriseJTable.getValueAt(selectedRow, 1);
            Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseJTable.getValueAt(selectedRow, 2);
            UpdateEnterpriseJFrame f = new UpdateEnterpriseJFrame(system, network, enterpriseName, type, this);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
            log.info("UpdateNetworkJFrame");
            log.info("Enterprise has been updated");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_bttnUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnBack;
    private rojerusan.RSMaterialButtonRectangle bttnDelete;
    private rojerusan.RSMaterialButtonRectangle bttnSubmit;
    private rojerusan.RSMaterialButtonRectangle bttnUpdate;
    private rojerusan.RSComboMetro comboEnterpriseType;
    private rojerusan.RSComboMetro comboNetwork;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSMetroTextPlaceHolder txtName;
    // End of variables declaration//GEN-END:variables
}
