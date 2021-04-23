/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeCampRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Organization.OrganizationType;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private OrganizationDirectory directory;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateTable();
        populateCombo();
    }

    private void populateCombo() {
        cmboOrganizationType.removeAllItems();
        //System.out.println(enterprise.getEnterpriseType() == EnterpriseType.Hospital);
        //System.out.println(enterprise.getEnterpriseType().equals("Hospital"));
        if (enterprise.getEnterpriseType() == EnterpriseType.Hospital) {
            for (OrganizationType type : Organization.OrganizationType.values()) {
                if ((type.getValue().equals(OrganizationType.Doctor.getValue())) || (type.getValue().equals(OrganizationType.Lab.getValue())) || (type.getValue().equals(OrganizationType.Nurse.getValue()))) {
                    cmboOrganizationType.addItem(type);
                }
            }
        } else if (enterprise.getEnterpriseType() == EnterpriseType.Event) {
            for (OrganizationType type : Organization.OrganizationType.values()) {
                if ((type.getValue().equals(OrganizationType.Fund.getValue())) || (type.getValue().equals(OrganizationType.VolunteerEvent.getValue()))) {
                    cmboOrganizationType.addItem(type);
                }
            }
        } else if (enterprise.getEnterpriseType() == EnterpriseType.Camp) {
            for (OrganizationType type : Organization.OrganizationType.values()) {
                if ((type.getValue().equals(OrganizationType.VolunteerCamp.getValue()))) {
                    cmboOrganizationType.addItem(type);
                }
            }
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization;

            model.addRow(row);
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
        organizationJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        bttnBack = new rojerusan.RSMaterialButtonRectangle();
        bttnAddOrganization = new rojerusan.RSMaterialButtonRectangle();
        bttnDeleteOrganization = new rojerusan.RSMaterialButtonRectangle();
        cmboOrganizationType = new rojerusan.RSComboMetro();

        setBackground(new java.awt.Color(232, 243, 255));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization ID", "Organization Name"
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
        organizationJTable.setSelectionBackground(new java.awt.Color(15, 19, 52));
        jScrollPane1.setViewportView(organizationJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Organization Type ");

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ORGANIZATION MANAGEMENT - CAMP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        bttnBack.setBackground(new java.awt.Color(15, 19, 52));
        bttnBack.setText("Back");
        bttnBack.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBackActionPerformed(evt);
            }
        });

        bttnAddOrganization.setBackground(new java.awt.Color(15, 19, 52));
        bttnAddOrganization.setText("Add Organization");
        bttnAddOrganization.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAddOrganizationActionPerformed(evt);
            }
        });

        bttnDeleteOrganization.setBackground(new java.awt.Color(15, 19, 52));
        bttnDeleteOrganization.setText("Delete Organization");
        bttnDeleteOrganization.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnDeleteOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDeleteOrganizationActionPerformed(evt);
            }
        });

        cmboOrganizationType.setBackground(new java.awt.Color(15, 19, 52));
        cmboOrganizationType.setColorArrow(new java.awt.Color(15, 19, 52));
        cmboOrganizationType.setColorBorde(new java.awt.Color(15, 19, 52));
        cmboOrganizationType.setColorFondo(new java.awt.Color(15, 19, 52));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmboOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnAddOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(bttnDeleteOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmboOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnAddOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnDeleteOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bttnBackActionPerformed

    private void bttnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAddOrganizationActionPerformed
        OrganizationType type = (OrganizationType) cmboOrganizationType.getSelectedItem();
        enterprise.getOrganizationDirectory().createOrganization(type);
        populateTable();
        JOptionPane.showMessageDialog(null, "An Organization has been added successfully");
    }//GEN-LAST:event_bttnAddOrganizationActionPerformed

    private void bttnDeleteOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteOrganizationActionPerformed
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        int selectedRow = organizationJTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                Organization organization = (Organization) organizationJTable.getValueAt(selectedRow, 1);
                enterprise.getOrganizationDirectory().removeOrganization(organization);
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_bttnDeleteOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnAddOrganization;
    private rojerusan.RSMaterialButtonRectangle bttnBack;
    private rojerusan.RSMaterialButtonRectangle bttnDeleteOrganization;
    private rojerusan.RSComboMetro cmboOrganizationType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
