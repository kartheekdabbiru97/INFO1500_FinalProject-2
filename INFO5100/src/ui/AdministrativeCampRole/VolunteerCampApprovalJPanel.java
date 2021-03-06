/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeCampRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.SendMailUsingAuthentication;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.mail.*;
import java.util.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.swing.JOptionPane;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class VolunteerCampApprovalJPanel extends javax.swing.JPanel {

    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private UserAccount userAccount;

    /**
     * Creates new form VolunteerAprovalJPanel
     */
    public VolunteerCampApprovalJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.toString().equals("Volunteer")) {
                Object[] row = new Object[8];
                row[0] = request;
                row[1] = request.getVolunteerName();
                row[2] = request.getUsername();
                row[3] = request.getDob();
                row[4] = request.getSsn();
                row[5] = request.getMailid();
                row[6] = request.getRole();
                row[7] = request.getStatus();

                //String result = ((VolunteerApprovalStatus) request).getTestResult();
                // row[3] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
        }
    }

    public static void sendEmailMessage(String emailId) {
// Recipient's email ID needs to be mentioned.
        String to = emailId;
        String from = "aedxaxis@gmail.com";
        String pass = "info5000";
// Assuming you are sending email from localhost
// String host = "192.168.0.16";

// Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
// properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

// Setup mail server
// properties.setProperty("mail.smtp.host", host);
// properties.put("mail.smtp.starttls.enable", "true");
// Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
// Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

// Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

// Set To: header field of the header.
            message.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(to));

// Set Subject: header field
            message.setSubject("Volunteer Registration Update");
            message.setText("Thank you for registering with us. Your account has been approved");
// Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }

    public static void sendTextMessage(String contact) {
        // Recipient's email ID needs to be mentioned.
        String to = contact;
        System.out.println(contact);
        String from = "aedxaxis@gmail.com";
        String pass = "info5000";
        // Assuming you are sending email from localhost
        // String host = "192.168.0.16";
        // Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
        // properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        // Setup mail server
        // properties.setProperty("mail.smtp.host", host);
        //  properties.put("mail.smtp.starttls.enable", "true");
        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);
        //       final PasswordAuthentication auth = new PasswordAuthentication(from, pass);
//Session session = Session.getDefaultInstance(properties, new Authenticator() {
//    @Override
//    protected PasswordAuthentication getPasswordAuthentication() { return auth; }
//});
//Session session = Session.getInstance(properties);
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(contact));

            // Set Subject: header field
            message.setSubject("Volunteer Registration Update");
            message.setText("Thank you for registering with us. Your account has been approved");
            // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message!");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid number");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        bttnRefresh = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        bttnBack = new rojerusan.RSMaterialButtonRectangle();
        bttanApprove = new rojerusan.RSMaterialButtonRectangle();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(235, 122, 102));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("VOLUNTEER CAMP ROLE APPROVAL");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(51, 51, 51));
        enterpriseLabel.setText("Enterprise Name:");

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(51, 51, 51));
        valueLabel.setText("<value>");

        bttnRefresh.setBackground(new java.awt.Color(255, 255, 255));
        bttnRefresh.setForeground(new java.awt.Color(15, 19, 52));
        bttnRefresh.setText("Refresh");
        bttnRefresh.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                        .addComponent(bttnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Name", "Username", "Date of Birth", "SSN", "Email ID", "Role", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        workRequestJTable.setSelectionBackground(new java.awt.Color(235, 122, 102));
        workRequestJTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(workRequestJTable);

        bttnBack.setBackground(new java.awt.Color(235, 122, 102));
        bttnBack.setForeground(new java.awt.Color(51, 51, 51));
        bttnBack.setText("Back");
        bttnBack.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBackActionPerformed(evt);
            }
        });

        bttanApprove.setBackground(new java.awt.Color(235, 122, 102));
        bttanApprove.setForeground(new java.awt.Color(51, 51, 51));
        bttanApprove.setText("APPROVE");
        bttanApprove.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttanApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttanApproveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttanApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttanApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 281, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bttnBackActionPerformed

    private void bttanApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttanApproveActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "Already in completed state!");
        }
        Employee employee = null;
        Role role = null;
            System.out.println(enterprise.getOrganizationDirectory().getOrganizationList());
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            System.out.println(request.getRole());
            //System.out.println(request.getRole().equals("VolunteerCampRole"));
            if (request.getRole().equals("VolunteerCampRole")) {
                org.getEmployeeDirectory().createEmployee(request.getVolunteerName());
                System.out.println("loooooooooooooooooooooooooooooooooooooooooool");
                for (Employee e : org.getEmployeeDirectory().getEmployeeList()) {
                    if (request.getVolunteerName() == e.getName()) {
                        employee = e;
                    }
                    for (Role r : org.getSupportedRole()) {
                        //System.out.println(r);
                        if (request.getRole().equals("VolunteerCampRole")) {
                            role = r;
                        }
                    }
                }
                org.getUserAccountDirectory().createUserAccount(request.getUsername(), request.getPassword(), employee, role);
                
                break;
            } else if (request.getRole().equals("VolunteerEventRole")) {
                if (org.toString().equals("Event Organization")) {
                    org.getEmployeeDirectory().createEmployee(request.getVolunteerName());
                    for (Employee e : org.getEmployeeDirectory().getEmployeeList()) {
                        if (request.getVolunteerName() == e.getName()) {
                            employee = e;
                        }

                        for (Role r : org.getSupportedRole()) {
                            if (r.toString().equals("VolunteerEventRole")) {
                                role = r;
                            }
                        }
                    }
                    org.getUserAccountDirectory().createUserAccount(request.getUsername(), request.getPassword(), employee, role);
                }
            }
        }
        request.setStatus("Completed");
        populateRequestTable();
        if (request.getStatus().equals("Completed")) {

            String email = request.getMailid();
            System.out.println(email);
            sendEmailMessage(email);
            String provider = request.getNetworkProvider();
            long num = request.getNumber();
            String numStr = Long.toString(num);
            System.out.println("N" + numStr);
            System.out.println("P" + provider);
            String contact = "";
            if (provider.equals("ATT")) {
                contact = numStr + "@txt.att.net";
            } else if (provider.equals("Verizon")) {
                contact = numStr + "@vmobl.com";
            } else if (provider.equals("Sprint")) {
                contact = numStr + "@messaging.sprintpcs.com";
            } else if (provider.equals("TMobile")) {
                contact = numStr + "@tmomail.net";
            }
            System.out.println("*****VCamp*****" + contact);
            sendTextMessage(contact);

        }
    }//GEN-LAST:event_bttanApproveActionPerformed

    private void bttnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRefreshActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_bttnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttanApprove;
    private rojerusan.RSMaterialButtonRectangle bttnBack;
    private rojerusan.RSMaterialButtonRectangle bttnRefresh;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
