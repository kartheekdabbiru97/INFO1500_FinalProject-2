/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CorporateRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FundCharityEnterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.logging.*;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class DonateFunds extends javax.swing.JPanel {

    private JPanel userProcessConatiner;
    private UserAccount user;
    private EcoSystem eco;
    private Network network;
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public DonateFunds(JPanel userProcessContainer, UserAccount user, Network network, EcoSystem eco) {
        this.userProcessConatiner = userProcessContainer;
        this.user = user;
        this.eco = eco;
        this.network = network;
        initComponents();
        populateTable();

    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable1.getModel();
        model.setRowCount(0);
        int count = 0;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enter.getEnterpriseType().equals(Enterprise.EnterpriseType.Event)) {
                if (count != 0) {
                    FundCharityEnterprise camp = (FundCharityEnterprise) enter;
                    Object[] row = new Object[5];
                    row[0] = camp;
                    row[1] = camp.getStreet();;
                    row[2] = camp.getCity();
                    row[3] = camp.getState();
                    row[4] = camp.getZipcode();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        buttonBack = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();
        buttonPayFunds = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 243, 255));

        jLabel1.setBackground(new java.awt.Color(15, 19, 52));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FUND DONATION");
        jLabel1.setOpaque(true);

        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Applicant Name", "Street Address", "City", "State", "Zipcode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable1);

        buttonBack.setText("BACK");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        buttonRefresh.setText("REFRESH");

        buttonPayFunds.setText("PAY FUNDS");
        buttonPayFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPayFundsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonBack)
                        .addGap(499, 499, 499)
                        .addComponent(buttonPayFunds)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonRefresh)
                        .addGap(109, 109, 109))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(buttonRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBack)
                    .addComponent(buttonPayFunds))
                .addGap(0, 55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPayFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPayFundsActionPerformed
        logr.info("Pay funds action performed");
        int selectedRow = workRequestJTable1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select An Event To Donate");
            System.out.println(selectedRow);
            return;
        } else {
            String money = JOptionPane.showInputDialog(null, "Enter The Amount You Want To Donate?", "Donation Window", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(money);
            try {
                if (money.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter the Amount you want to donate in digits");
                    return;
                }
            } catch (NullPointerException et) {
//            JOptionPane.showMessageDialog(null, "Please Enter The Amount you want to donate");
                System.out.println("Cancel option");
                return;
            }
//        if(money.equals("")){
//            money = "0";
//        }

            FundCharityEnterprise e = (FundCharityEnterprise) workRequestJTable1.getValueAt(selectedRow, 0);
            try {
                e.setFundsCollected(Integer.parseInt(money));
                System.out.println(e.getFundsCollected());
                JOptionPane.showMessageDialog(null, "You have donated " + money + "$. Thank you for your valuable contribution! " + "\n" + " Funds Sent to System Admin for Assigning Hospital!");
            } catch (NumberFormatException ex) {
                //   System.out.println(e.getFundsCollected());
                JOptionPane.showMessageDialog(null, "Please Enter The Amount you want to donate in digits");
            }
        }
        logr.info("Funds paid for fundraiser event");
    }//GEN-LAST:event_buttonPayFundsActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        userProcessConatiner.remove(this);
        CardLayout layout = (CardLayout) userProcessConatiner.getLayout();
        layout.previous(userProcessConatiner);
    }//GEN-LAST:event_buttonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonPayFunds;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables
}
