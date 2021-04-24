/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SponsorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SponsorApprovalStatus;
import Business.WorkQueue.WorkRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static ui.VolunteerCampRole.VolunteerRegistrationPanel.sendEmailMessage;
import static ui.VolunteerCampRole.VolunteerRegistrationPanel.sendTextMessage;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class SponsorRegistrationPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private static final Pattern mailPattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
    private static final Pattern ssnPattern = Pattern.compile("^\\d{3}-?\\d{2}-?\\d{4}$|^XXX-XX-XXXX$");
    private static final Pattern passportPattern = Pattern.compile("^\\d{3}-?\\d{2}-?\\d{4}$|^XXX-XX-XXXX$");
    private static final Pattern phonePattern = Pattern.compile("^\\D?(\\d{3})\\D?\\D?(\\d{3})\\D?(\\d{4})$");

    /**
     * Creates new form VolunteerRegistration
     */
    public SponsorRegistrationPanel(JPanel userProcessContainerÏ, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
    }

    private int validateMail(String validate) {
        Matcher match = mailPattern.matcher(validate);
        if (match.matches()) {
            return 1;
        }
        return 0;
    }

    private int validatePassport(String validate) {
        Matcher match = passportPattern.matcher(validate);
        System.out.println(match.matches());
        if (match.matches()) {
            return 1;
        }
        return 0;
    }

    private int validateSsn(String validate) {
        Matcher match = ssnPattern.matcher(validate);
        System.out.println(match.matches());
        if (match.matches()) {
            return 1;
        }
        return 0;
    }

    private int validatePhone(String validate) {
        Matcher match = phonePattern.matcher(validate);
        System.out.println(match.matches());
        if (match.matches()) {
            return 1;
        }
        return 0;
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
            message.setSubject("Sponsor Registration");
            message.setText("Thank you for registering with us. Your account will be approved as soon as possible and will be notified to you in the next email.");
            // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Message sent!");
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
            message.setSubject("Sponsor Registration");
            message.setText("Thank you for registering with us. Your account will be approved as soon as possible and will be notified to you in the next email.");
            // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message!");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid Number!");
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
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        roleCombo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtpassport = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtDob = new com.toedter.calendar.JDateChooser();
        txtPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboProvider = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(232, 243, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(15, 19, 52));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO SPONSOR REGSITRATION");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Username");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Password");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Role");

        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GeneralRole", "CorporateRole", "StudentRole" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Email ID");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Phone Number");

        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("DOB");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("SSN");

        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Passport No");

        txtpassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassportActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Address");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Provider");

        comboProvider.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "ATT", "TMobile", "Verizon", "Sprint" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel8))))
                        .addGap(45, 45, 45)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumber)
                    .addComponent(txtName)
                    .addComponent(txtUsername)
                    .addComponent(txtSSN)
                    .addComponent(txtpassport)
                    .addComponent(txtDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtEmail)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1)
                    .addComponent(comboProvider, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roleCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void txtpassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int check = 0;
        int co = 1;
        int checkMail = 0;
        int userCheck = 0;
        int checkSsn = 0;
        int checkPass = 0;
        int checkPhone = 0;
        int checkdate = 0;
        int ssnDup = 0;
        int passDup = 0;

        String name = null;
        String userName = null;
        String pass = null;
        String mail = null;
        String role = "null";
        String passport1 = null;
        String address1 = null;
        String phonenum = null;
        String networkProvider = null;
        long ssn1 = 0;
        long pass1 = 0;
        long number1 = 0;
        //  Date dob1 = null;
        Date sysDate = null;
        if (txtName.getText().isEmpty() || txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() || txtEmail.getText().isEmpty() || txtpassport.getText().isEmpty() || txtSSN.getText().isEmpty() || txtDob.getDate() == null || txtNumber.getText().isEmpty() || txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Registration cannot be completed as one or more fields are empty");
            return;
        } else {
            check = 1;
            SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
            format.setLenient(false);
            //     dob1 = null;
            sysDate = new Date();

            name = txtName.getText();
            userName = txtUsername.getText();
            pass = txtPassword.getText();
            mail = txtEmail.getText();
            phonenum = txtNumber.getText();
            networkProvider = comboProvider.getSelectedItem().toString();
            role = "null";
            passport1 = txtpassport.getText();
            checkMail = validateMail(txtEmail.getText());
            if (checkMail == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter a valid Email-ID format");
                return;
            }
            try {
                //       dob1 = format.parse(dob.getText());
                ssn1 = Long.parseLong(txtSSN.getText());
                pass1 = Long.parseLong(txtpassport.getText());
                number1 = Long.parseLong(txtNumber.getText());
                checkSsn = validateSsn(Long.toString(ssn1));
                checkPass = validatePassport(Long.toString(pass1));
                checkPhone = validatePhone(Long.toString(number1));

                long diff = sysDate.getTime() - txtDob.getDate().getTime();
                long diffDays = diff / (24 * 60 * 60 * 1000);
                long years = diffDays / 365;

                System.out.println(diff);
                System.out.println(diffDays);
                System.out.println(years);
                if ((years < 16 && diff > 0) && (years >= 0 && diff > 0)) {
                    JOptionPane.showMessageDialog(null, "Cannot enroll as age is less than 16 years");
                    checkdate = 1;
                    return;
                }

                if (diff < 0) {
                    JOptionPane.showMessageDialog(null, "Date of Birth cannot be a future date");
                    checkdate = 1;
                    return;
                }

                co = 0;

                if (checkSsn == 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid SSN format (9 digits only allowed) ");
                    return;
                }

                if (checkPass == 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid Passport ID format (9 digits only allowed) ");
                    return;
                }

                if (checkPhone == 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid Phone format(10 digits)");
                    return;
                }
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Please enter number for SSN and Phone Number");
                return;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter number for SSN and Phone Number");
                return;
            }
            address1 = txtAddress.getText();
        }
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, pass);
        if (userAccount == null) {
            for (Network network : system.getNetworkList()) {
                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    System.out.println(enterprise.getOrganizationDirectory().getOrganizationList());
                    System.out.println("***************************reg****************************");
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        System.out.println(organization);
                        userAccount = organization.getUserAccountDirectory().authenticateUser(userName, pass);
                        System.out.println(userAccount);
                        if (userAccount != null) {
                            userCheck++;
                            System.out.println(userAccount);
                            // break;
                        }
                    }
                }
            }
        }

        System.out.println(userCheck);
        if (userCheck > 0) {
            JOptionPane.showMessageDialog(this, "User name already exists!");
        } else if (userCheck == 0) {
            if (co == 0 && check == 1 && checkMail != 0 && checkSsn != 0 && checkPhone != 0 && checkdate == 0) {
                SponsorApprovalStatus request = new SponsorApprovalStatus();
                request.setTypeOfRequest("Sponsor");
                request.setName(name);
                request.setUsername(userName);
                request.setPassword(pass);
                request.setMailid(mail);
                request.setDob(txtDob.getDate());
                request.setPassport(passport1);
                request.setNumber(number1);
                request.setSsn(ssn1);
                request.setAddress(address1);
                request.setStatus("Pending");
                request.setNetworkProvider(networkProvider);
                if (roleCombo.getSelectedItem() == "GeneralRole") {
                    role = (String) roleCombo.getSelectedItem();
                    request.setRole(role);
//                    System.out.println(request.getRole());
                }
                if (roleCombo.getSelectedItem() == "CorporateRole") {
                    role = (String) roleCombo.getSelectedItem();
                    request.setRole(role);
//                     System.out.println(role);
                }
                if (roleCombo.getSelectedItem() == "StudentRole") {
                    role = (String) roleCombo.getSelectedItem();
                    request.setRole(role);

//                    System.out.println(role);
                }
                for (Network network : system.getNetworkList()) {
                    //Step 2.a: check against each enterprise
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        System.out.println(enterprise.getOrganizationDirectory().getOrganizationList());
                        System.out.println("***************************reg into****************************");
                        for (UserAccount user : enterprise.getUserAccountDirectory().getUserAccountList()) {
                            if ((enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Event) && (roleCombo.getSelectedItem() == "GeneralRole") && (user.getUsername().equals("mafund"))) {
                                //System.out.println(user);
                                user.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(this, "Registration submitted Successfully. Sent to Fund Admin for Approval!");
                                txtName.setText("");
                                txtUsername.setText("");
                                txtPassword.setText("");
                                txtEmail.setText("");
                                txtpassport.setText("");
                                txtSSN.setText("");
                                txtNumber.setText("");
                                txtDob.setDate(null);
                                txtAddress.setText("");
                            } else if ((enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Event) && (roleCombo.getSelectedItem() == "CorporateRole") && (user.getUsername().equals("mafund"))) {
                                // System.out.println(user);
                                user.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(this, "Registration submitted Successfully. Sent to Fund Admin for Approval!");
                                txtName.setText("");
                                txtUsername.setText("");
                                txtPassword.setText("");
                                txtEmail.setText("");
                                txtpassport.setText("");
                                txtSSN.setText("");
                                txtNumber.setText("");
                                txtDob.setDate(null);
                                txtAddress.setText("");
                            } else if ((enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Event) && (roleCombo.getSelectedItem() == "StudentRole") && (user.getUsername().equals("mafund"))) {
                                // System.out.println(user);
                                user.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(this, "Registration submitted Successfully. Sent to Fund Admin for Approval!");
                                txtName.setText("");
                                txtUsername.setText("");
                                txtPassword.setText("");
                                txtEmail.setText("");
                                txtpassport.setText("");
                                txtSSN.setText("");
                                txtNumber.setText("");
                                txtDob.setDate(null);
                                txtAddress.setText("");
                            }
                        }
                    }
                }
            }
        }

        String contact = "";
        if (comboProvider.getSelectedItem().equals("ATT")) {
            contact = phonenum + "@txt.att.net";
        } else if (comboProvider.getSelectedItem().equals("Verizon")) {
            contact = phonenum + "@vmobl.com";
        } else if (comboProvider.getSelectedItem().equals("Sprint")) {
            contact = phonenum + "@messaging.sprintpcs.com";
        } else if (comboProvider.getSelectedItem().equals("TMobile")) {
            contact = phonenum + "@tmomail.net";
        }
        sendEmailMessage(mail);
        System.out.println("**********" + contact);
        sendTextMessage(contact);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboProvider;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> roleCombo;
    private javax.swing.JTextArea txtAddress;
    private com.toedter.calendar.JDateChooser txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtpassport;
    // End of variables declaration//GEN-END:variables
}
