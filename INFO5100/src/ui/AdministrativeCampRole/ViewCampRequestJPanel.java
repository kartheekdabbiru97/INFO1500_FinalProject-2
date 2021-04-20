/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeCampRole;

import java.util.Date;

/**
 *
 * @author ashishroy
 */
public class ViewCampRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCampRequestJPanel
     */
    public ViewCampRequestJPanel() {
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
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        healthcampDate = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmboEnterprise = new rojerusan.RSComboMetro();
        bttnBack = new rojerusan.RSMaterialButtonRectangle();
        bttnApprove = new rojerusan.RSMaterialButtonRectangle();
        txtCampID = new rojerusan.RSMetroTextPlaceHolder();
        txtName = new rojerusan.RSMetroTextPlaceHolder();
        txtStreetAddress = new rojerusan.RSMetroTextPlaceHolder();
        txtCity = new rojerusan.RSMetroTextPlaceHolder();
        txtState = new rojerusan.RSMetroTextPlaceHolder();
        txtZipCode = new rojerusan.RSMetroTextPlaceHolder();
        txtNumberPeopleAffected = new rojerusan.RSMetroTextPlaceHolder();
        txtAffectedChildren = new rojerusan.RSMetroTextPlaceHolder();
        txtAddectedElders = new rojerusan.RSMetroTextPlaceHolder();

        setBackground(new java.awt.Color(232, 243, 255));

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CAMP REQUEST MANAGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("State");

        healthcampDate.setBackground(new java.awt.Color(15, 19, 52));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("ZipCode");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("No of People Affected");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Percentage of Affected Children");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Percentage of Affected Elders");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Camp ID");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Health Camp Event Date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Enterprise");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Street Address");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("City");

        cmboEnterprise.setBackground(new java.awt.Color(15, 19, 52));
        cmboEnterprise.setColorArrow(new java.awt.Color(15, 19, 52));
        cmboEnterprise.setColorBorde(new java.awt.Color(15, 19, 52));
        cmboEnterprise.setColorFondo(new java.awt.Color(15, 19, 52));

        bttnBack.setBackground(new java.awt.Color(15, 19, 52));
        bttnBack.setText("Back");
        bttnBack.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBackActionPerformed(evt);
            }
        });

        bttnApprove.setBackground(new java.awt.Color(15, 19, 52));
        bttnApprove.setText("APPROVE");
        bttnApprove.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnApproveActionPerformed(evt);
            }
        });

        txtCampID.setForeground(new java.awt.Color(15, 19, 52));
        txtCampID.setToolTipText("");
        txtCampID.setBorderColor(new java.awt.Color(15, 19, 52));
        txtCampID.setBotonColor(new java.awt.Color(15, 19, 52));
        txtCampID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampIDActionPerformed(evt);
            }
        });

        txtName.setForeground(new java.awt.Color(15, 19, 52));
        txtName.setToolTipText("");
        txtName.setBorderColor(new java.awt.Color(15, 19, 52));
        txtName.setBotonColor(new java.awt.Color(15, 19, 52));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtStreetAddress.setForeground(new java.awt.Color(15, 19, 52));
        txtStreetAddress.setToolTipText("");
        txtStreetAddress.setBorderColor(new java.awt.Color(15, 19, 52));
        txtStreetAddress.setBotonColor(new java.awt.Color(15, 19, 52));
        txtStreetAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetAddressActionPerformed(evt);
            }
        });

        txtCity.setForeground(new java.awt.Color(15, 19, 52));
        txtCity.setToolTipText("");
        txtCity.setBorderColor(new java.awt.Color(15, 19, 52));
        txtCity.setBotonColor(new java.awt.Color(15, 19, 52));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txtState.setForeground(new java.awt.Color(15, 19, 52));
        txtState.setToolTipText("");
        txtState.setBorderColor(new java.awt.Color(15, 19, 52));
        txtState.setBotonColor(new java.awt.Color(15, 19, 52));
        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        txtZipCode.setForeground(new java.awt.Color(15, 19, 52));
        txtZipCode.setToolTipText("");
        txtZipCode.setBorderColor(new java.awt.Color(15, 19, 52));
        txtZipCode.setBotonColor(new java.awt.Color(15, 19, 52));
        txtZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCodeActionPerformed(evt);
            }
        });

        txtNumberPeopleAffected.setForeground(new java.awt.Color(15, 19, 52));
        txtNumberPeopleAffected.setToolTipText("");
        txtNumberPeopleAffected.setBorderColor(new java.awt.Color(15, 19, 52));
        txtNumberPeopleAffected.setBotonColor(new java.awt.Color(15, 19, 52));
        txtNumberPeopleAffected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberPeopleAffectedActionPerformed(evt);
            }
        });

        txtAffectedChildren.setForeground(new java.awt.Color(15, 19, 52));
        txtAffectedChildren.setToolTipText("");
        txtAffectedChildren.setBorderColor(new java.awt.Color(15, 19, 52));
        txtAffectedChildren.setBotonColor(new java.awt.Color(15, 19, 52));
        txtAffectedChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAffectedChildrenActionPerformed(evt);
            }
        });

        txtAddectedElders.setForeground(new java.awt.Color(15, 19, 52));
        txtAddectedElders.setToolTipText("");
        txtAddectedElders.setBorderColor(new java.awt.Color(15, 19, 52));
        txtAddectedElders.setBotonColor(new java.awt.Color(15, 19, 52));
        txtAddectedElders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddectedEldersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel4)
                    .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCampID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumberPeopleAffected, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAffectedChildren, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddectedElders, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthcampDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmboEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCampID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNumberPeopleAffected, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtAffectedChildren, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtAddectedElders, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(healthcampDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmboEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnBackActionPerformed

    private void bttnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnApproveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnApproveActionPerformed

    private void txtCampIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtStreetAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetAddressActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed

    private void txtNumberPeopleAffectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberPeopleAffectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberPeopleAffectedActionPerformed

    private void txtAffectedChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAffectedChildrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAffectedChildrenActionPerformed

    private void txtAddectedEldersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddectedEldersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddectedEldersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnApprove;
    private rojerusan.RSMaterialButtonRectangle bttnBack;
    private rojerusan.RSComboMetro cmboEnterprise;
    private com.toedter.calendar.JDateChooser healthcampDate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSMetroTextPlaceHolder txtAddectedElders;
    private rojerusan.RSMetroTextPlaceHolder txtAffectedChildren;
    private rojerusan.RSMetroTextPlaceHolder txtCampID;
    private rojerusan.RSMetroTextPlaceHolder txtCity;
    private rojerusan.RSMetroTextPlaceHolder txtName;
    private rojerusan.RSMetroTextPlaceHolder txtNumberPeopleAffected;
    private rojerusan.RSMetroTextPlaceHolder txtState;
    private rojerusan.RSMetroTextPlaceHolder txtStreetAddress;
    private rojerusan.RSMetroTextPlaceHolder txtZipCode;
    // End of variables declaration//GEN-END:variables
}
