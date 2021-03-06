/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeHospitalRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
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
        organizationJComboBox.removeAllItems();
        //System.out.println(enterprise.getEnterpriseType() == EnterpriseType.Hospital);
        //System.out.println(enterprise.getEnterpriseType().equals("Hospital"));
        if (enterprise.getEnterpriseType() == EnterpriseType.Hospital) {
            for (OrganizationType type : Organization.OrganizationType.values()) {
                if ((type.getValue().equals(OrganizationType.Doctor.getValue())) || (type.getValue().equals(OrganizationType.Lab.getValue())) || (type.getValue().equals(OrganizationType.Nurse.getValue())) || (type.getValue().equals(OrganizationType.Receptionist.getValue()))) {
                    organizationJComboBox.addItem(type);
                }
            }
        } else if (enterprise.getEnterpriseType() == EnterpriseType.Event) {
            for (OrganizationType type : Organization.OrganizationType.values()) {
                if ((type.getValue().equals(OrganizationType.Fund.getValue())) || (type.getValue().equals(OrganizationType.VolunteerEvent.getValue()))) {
                    organizationJComboBox.addItem(type);
                }
            }
        } else if (enterprise.getEnterpriseType() == EnterpriseType.Camp) {
            for (OrganizationType type : Organization.OrganizationType.values()) {
                if ((type.getValue().equals(OrganizationType.VolunteerCamp.getValue()))) {
                    organizationJComboBox.addItem(type);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new rojerusan.RSComboMetro();
        bttnBack = new rojerusan.RSMaterialButtonRectangle();
        bttnBack1 = new rojerusan.RSMaterialButtonRectangle();
        bttnBack2 = new rojerusan.RSMaterialButtonRectangle();

        setBackground(new java.awt.Color(255, 255, 255));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
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
        organizationJTable.setSelectionBackground(new java.awt.Color(235, 122, 102));
        organizationJTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(organizationJTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Organization Type");

        jPanel1.setBackground(new java.awt.Color(235, 122, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("ORGANIZATION MANAGEMENT - HOSPITAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        organizationJComboBox.setBackground(new java.awt.Color(235, 122, 102));
        organizationJComboBox.setForeground(new java.awt.Color(51, 51, 51));
        organizationJComboBox.setColorArrow(new java.awt.Color(235, 122, 102));
        organizationJComboBox.setColorBorde(new java.awt.Color(51, 51, 51));
        organizationJComboBox.setColorFondo(new java.awt.Color(235, 122, 102));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        bttnBack.setBackground(new java.awt.Color(235, 122, 102));
        bttnBack.setForeground(new java.awt.Color(51, 51, 51));
        bttnBack.setText("Back");
        bttnBack.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBackActionPerformed(evt);
            }
        });

        bttnBack1.setBackground(new java.awt.Color(235, 122, 102));
        bttnBack1.setForeground(new java.awt.Color(51, 51, 51));
        bttnBack1.setText("ADD");
        bttnBack1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBack1ActionPerformed(evt);
            }
        });

        bttnBack2.setBackground(new java.awt.Color(235, 122, 102));
        bttnBack2.setForeground(new java.awt.Color(51, 51, 51));
        bttnBack2.setText("DELETE");
        bttnBack2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bttnBackActionPerformed

    private void bttnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBack1ActionPerformed
        // TODO add your handling code here:
        OrganizationType type = (OrganizationType) organizationJComboBox.getSelectedItem();
        enterprise.getOrganizationDirectory().createOrganization(type);
        populateTable();
        JOptionPane.showMessageDialog(null, "An Organization has been added successfully");

    }//GEN-LAST:event_bttnBack1ActionPerformed

    private void bttnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBack2ActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_bttnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnBack;
    private rojerusan.RSMaterialButtonRectangle bttnBack1;
    private rojerusan.RSMaterialButtonRectangle bttnBack2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSComboMetro organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
