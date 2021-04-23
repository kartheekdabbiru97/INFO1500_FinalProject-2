/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeEventRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jo-ji
 */
public class CreateFundEvent extends javax.swing.JPanel {

    /**
     * Creates new form CreateFundEvent
     */
    private JPanel userProcessContainer;
    private WorkRequest request;
    private UserAccount user;
    private Enterprise enter;
    private Network network;
 //   private static final Pattern ZIP_PATTERN = Pattern.compile("/^(\\d{5}(-\\d{4})?|([a-z][a-z]?\\d\\d?|[a-z{2}\\d[a-z]) ?\\d[a-z][a-z])$/i;");

    public CreateFundEvent(JPanel userProcessContainer, WorkRequest request, UserAccount user, Enterprise enter, Network network) {
        this.userProcessContainer = userProcessContainer;
        this.enter = enter;
        this.request = request;
        this.user = user;
        this.network = network;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eventName = new javax.swing.JTextField();
        street = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        zipCode = new javax.swing.JTextField();
        processJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eventApproxFund = new javax.swing.JTextField();
        eventDate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(232, 243, 255));

        jLabel1.setBackground(new java.awt.Color(15, 19, 52));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE FUNDRAISER EVENT");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Event Name");

        eventName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventNameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Street Address");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("City");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("State");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("ZipCode");

        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });

        processJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        processJButton.setText("APPROVE");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fund To Be Collected(Approx)");

        eventApproxFund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventApproxFundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eventApproxFund, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(state, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zipCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(eventName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(street)
                            .addComponent(city)
                            .addComponent(eventDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processJButton)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(eventApproxFund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processJButton)
                    .addComponent(backJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(110, 110, 110))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eventNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventNameActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int check = 0;
        int checkdate = 0;
        if (eventDate.getDate() == null || zipCode.getText().isEmpty() || state.getText().isEmpty() || city.getText().isEmpty() || street.getText().isEmpty() || eventName.getText().isEmpty() || eventApproxFund.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all the fields");
        } else {
            check = 1;
            Enterprise enterprise = null;
            //System.out.println(business.getNetworkList());
            // enterprise = new CampEnterprise(Integer.toString(request.getCampId()));
            Date eventDay = null;
            Date sysDate = null;
            SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
            format.setLenient(false);
            try {

                eventDay = eventDate.getDate();
                sysDate = new Date();
                long diff = sysDate.getTime() - eventDay.getTime();
                long diff1 = eventDay.getTime() - sysDate.getTime();
                long diff1Days = diff1 / (24 * 60 * 60 * 1000);
                long years = diff1Days / 365;

                if (diff > 0) {
                    JOptionPane.showMessageDialog(null, "Cannot enter a previous date");
                    checkdate = 1;
                }

                if (diff1Days >= 4 && check == 1 && checkdate == 0) {
                    request.setStatus("Funding Process is going on");
                    int zipcodeVal= validateZipCode(zipCode.getText());
                     if (zipcodeVal == 0) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid 5 digit zip code");
                            return;
                     }
                    enterprise = network.getEnterpriseDirectory().createAndAddEventEnterprise(eventName.getText(), street.getText(), city.getText(), state.getText(), zipCode.getText(), eventDay, Enterprise.EnterpriseType.Event, Integer.parseInt(eventApproxFund.getText()));
                    Employee empl = enterprise.getEmployeeDirectory().createEmployee("admin");
                    String username = "admin_" + eventName.getText();
                    enterprise.getUserAccountDirectory().createUserAccount(username, "admin", empl, new AdminRole());
                    enterprise.getOrganizationDirectory().createOrganization(Organization.OrganizationType.VolunteerEvent);
                    enterprise.getOrganizationDirectory().createOrganization(Organization.OrganizationType.Fund);
                    JOptionPane.showMessageDialog(null, "FundRaiser Event Approved. Sponsors can donate for this event!");
                    eventApproxFund.setText("");
                    eventDate.setDate(null);
                    eventName.setText("");
                    street.setText("");
                    city.setText("");
                    state.setText("");
                    zipCode.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a Date after 4 days");
                }
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Please Enter Appropriate Date MM-dd-yyyy");
            }

        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FundRequests fund = (FundRequests) component;
        fund.populateTable();;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void eventApproxFundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventApproxFundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventApproxFundActionPerformed
    private int validateZipCode(String validate) {
    //    Matcher match = ZIP_PATTERN.matcher(validate);
    try{
    int zipcodeVal = Integer.parseInt(validate);
        if (validate.length() >= 6) {
            return 0;
        }
        return 1;
    }catch(NumberFormatException e){
        return 0;
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private rojerusan.RSMaterialButtonRectangle bttnBack;
    private rojerusan.RSMaterialButtonRectangle bttnBack1;
    private javax.swing.JTextField city;
    private javax.swing.JTextField eventApproxFund;
    private com.toedter.calendar.JDateChooser eventDate;
    private javax.swing.JTextField eventName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton processJButton;
    private javax.swing.JTextField state;
    private javax.swing.JTextField street;
    private javax.swing.JTextField zipCode;
    // End of variables declaration//GEN-END:variables
}
