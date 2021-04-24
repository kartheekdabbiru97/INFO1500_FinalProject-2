/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.VolunteerCampRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VolunteerApprovalStatus;
import java.text.SimpleDateFormat;
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

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class VolunteerRegistrationPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private static final Pattern mailPattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
    private static final Pattern ssnPattern = Pattern.compile("^\\d{3}-?\\d{2}-?\\d{4}$|^XXX-XX-XXXX$");
    private static final Pattern passportPattern = Pattern.compile("^\\d{3}-?\\d{2}-?\\d{4}$|^XXX-XX-XXXX$");
    private static final Pattern phonePattern = Pattern.compile("^\\D?(\\d{3})\\D?\\D?(\\d{3})\\D?(\\d{4})$");
    public static final String ACCOUNT_SID = System.getenv("AC94620339dfe3269c8e3d8f0d2abec054");
    public static final String AUTH_TOKEN = System.getenv("9aab8903d3935fbba81aed76246e04b9");

    /**
     * Creates new form VolunteerRegistration
     */
    public VolunteerRegistrationPanel(JPanel container, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = container;
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
            message.setSubject("Volunteer Registration");
            message.setText("Thank you for registering with us. Your account will be activated as soon as possible. We will send the updates in next email!");
            // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message");
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
            message.setSubject("Volunteer Registration");
            message.setText("Thank you for registering with us. Your account will be activated as soon as possible. We will send the updates in next email!");
            // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message.");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtdob = new com.toedter.calendar.JDateChooser();
        txtSSN = new javax.swing.JTextField();
        txtPassport = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtnumber = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        roleCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        comboProvider = new javax.swing.JComboBox<>();
        buttonSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 243, 255));

        jLabel1.setBackground(new java.awt.Color(15, 19, 52));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VOLUNTEER REGISTRATION");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Username");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("DOB");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("SSN");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Passport No.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Address");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Phone Number");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Email ID");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Role");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });

        txtPassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassportActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        txtnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumberActionPerformed(evt);
            }
        });

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VolunteerCampRole", "VolunteerEventRole" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Provider");

        comboProvider.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "ATT", "TMobile", "Sprint", "Verizon" }));

        buttonSubmit.setText("REGISTER");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnumber)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtPassport, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboProvider, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtemail)
                            .addComponent(roleCombo, 0, 205, Short.MAX_VALUE))))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonSubmit)
                .addGap(234, 234, 234))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSubmit)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void txtPassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassportActionPerformed

    private void txtnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumberActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        int check = 0;
        int co = 1;
        int checkMail = 0;
        int checkSsn = 0;
        int checkPhone = 0;
        int checkdate = 0;
        int checkPass = 0;
        int userCheck = 0;

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

//        Date dob = dob.getTime();
        Date sysDate = new Date();
        if (txtName.getText().isEmpty() || txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty() || txtemail.getText().isEmpty() || txtPassport.getText().isEmpty() || txtSSN.getText().isEmpty() || txtdob.getDate() == null || txtnumber.getText().isEmpty() || txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Registration cannot be completed as one or more fields are empty");
        } else {
            check = 1;

            SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
            format.setLenient(false);
            //dob = null;
            sysDate = new Date();
            name = txtName.getText();
            userName = txtUserName.getText();
            pass = txtPassword.getText();
            mail = txtemail.getText();
            phonenum = txtnumber.getText();
            networkProvider = comboProvider.getSelectedItem().toString();
            role = "null";
            passport1 = txtPassport.getText();
            checkMail = validateMail(txtemail.getText());
            if (checkMail == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter a valid Email-ID format");
                return;
            }
            try {

                //  dob = format.parse(dob.getTime());
                ssn1 = Long.parseLong(txtSSN.getText());
                pass1 = Long.parseLong(txtPassport.getText());
                number1 = Long.parseLong(txtnumber.getText());
                checkSsn = validateSsn(Long.toString(ssn1));
                checkPass = validatePassport(Long.toString(pass1));
                checkPhone = validatePhone(Long.toString(number1));

                long diff = sysDate.getTime() - txtdob.getDate().getTime();
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
                    JOptionPane.showMessageDialog(null, "Date of birth cannot enter a future date");
                    checkdate = 1;
                    return;
                }

                co = 0;

                if (checkSsn == 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid SSN format (9 digits only allowed)");
                    return;
                }

                if (checkPass == 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid Passport ID format (9 digits only allowed) ");
                    return;
                }

                if (checkPhone == 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid Phone Number format(10 digits)");
                    return;
                }

            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Please enter number for SSN, Passport and Phone Number");
                return;

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter number for SSN, Passport and Phone Number");
                return;
            }
            address1 = txtAddress.getText();

        }

        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, pass);
        if (userAccount == null) {
            for (Network network : system.getNetworkList()) {
                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
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
            JOptionPane.showMessageDialog(this, "Username already exists");
        } else if (userCheck == 0) {
            if (co == 0 && check == 1 && checkMail != 0 && checkSsn != 0 && checkPhone != 0 && checkdate == 0) {
                VolunteerApprovalStatus request = new VolunteerApprovalStatus();
                request.setTypeOfRequest("Volunteer");
                request.setName(name);
                request.setUsername(userName);
                request.setPassword(pass);
                request.setMailid(mail);
                request.setDob(txtdob.getDate());
                request.setPassport(passport1);
                request.setNumber(number1);
                request.setSsn(ssn1);
                request.setAddress(address1);
                request.setStatus("Pending");
                request.setNetworkProvider(networkProvider);
                if (roleCombo.getSelectedItem() == "VolunteerCampRole") {
                    role = (String) roleCombo.getSelectedItem();
                    request.setRole(role);
                    //System.out.println(role);

                }
                if (roleCombo.getSelectedItem() == "VolunteerEventRole") {
                    role = (String) roleCombo.getSelectedItem();
                    request.setRole(role);
                    // System.out.println(role);
                }

                for (Network network : system.getNetworkList()) {
                    //Step 2.a: check against each enterprise
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        for (UserAccount user : enterprise.getUserAccountDirectory().getUserAccountList()) {
                            if ((enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Event) && (roleCombo.getSelectedItem() == "VolunteerEventRole") && (user.getUsername().equals("mafund"))) {
                                //System.out.println(user);
                                user.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(this, "Registration submitted Successfully. Sent to Fund Admin for Approval!");
                                txtName.setText("");
                                txtUserName.setText("");
                                txtPassword.setText("");
                                txtemail.setText("");
                                txtPassport.setText("");
                                txtSSN.setText("");
                                txtnumber.setText("");
                                txtdob.setDate(null);
                                txtAddress.setText("");

                            } else if ((enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Camp) && (roleCombo.getSelectedItem() == "VolunteerCampRole") && user.getUsername().equals("macamp")) {
                                // System.out.println(user);
                                user.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(this, "Registration submitted Successfully. Sent to Camp Admin for Approval!");
                                txtName.setText("");
                                txtUserName.setText("");
                                txtPassword.setText("");
                                txtemail.setText("");
                                txtPassport.setText("");
                                txtSSN.setText("");
                                txtnumber.setText("");
                                txtdob.setDate(null);
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
    }//GEN-LAST:event_buttonSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JComboBox<String> comboProvider;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> roleCombo;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassport;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtUserName;
    private com.toedter.calendar.JDateChooser txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnumber;
    // End of variables declaration//GEN-END:variables
}
