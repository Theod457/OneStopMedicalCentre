package main.resources.medicalCentre;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author raghavendhra
 */
public class Register extends javax.swing.JFrame {
    public static String IDInput;
    public static String usernameInput;
    public static String passwordInput;
    public static String repasswordInput;
    public static int IDCheck = 0;
    public static int passwordCheck = 0;
    public static int rePasswordCheck = 0;
    public static int usernameCheck = 0;
    public static int contactCheck = 0;
    public static int addressCheck = 0;
    public static int duplicateUserCheck = 0;
    public static String finalPasswordInput;
    public static String genderInput;
    public static String bloodInput;
    public static String contactInput;
    public static String addressInput;

    /**
     * Creates new form Signup
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        repassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        bloodg1 = new javax.swing.JComboBox<>();
        city = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        genders = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Contact = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        identityNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 0));
        setForeground(new java.awt.Color(0, 102, 102));
        setResizable(false);
        setSize(new java.awt.Dimension(1550, 825));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/DoctorHelpingPatient.png"))); // NOI18N
        jLabel12.setText("jLabel12");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Name (as per IC/Passport)");

        username.setToolTipText("username must not contain only symbols");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("Password");

        password.setToolTipText("password must be between 8-20 characters");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setText("Re-Enter Password");

        repassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repasswordActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel6.setText("Blood Type");

        bloodg1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-","B+", "B-", "AB+", "AB-" }));
        bloodg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodg1ActionPerformed(evt);
            }
        });

        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("*");

        genders.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gendersMouseClicked(evt);
            }
        });
        genders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendersActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel8.setText("Address");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel7.setText("Contact");

        Contact.setToolTipText("Contract must include country code. Example: +60142927219");
        Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(0, 102, 51));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("SIGN UP");
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel11.setText("IC/Passport Number");

        identityNumber.setToolTipText("Example: 020204075129 (IC), A12345678(Passport)");
        identityNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identityNumberActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Already have an account?");

        Login.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 0, 204));
        Login.setText("Login now");
        Login.setBorder(null);
        Login.setBorderPainted(false);
        Login.setContentAreaFilled(false);
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel10.setText("Gender");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("*");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("*");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("*");

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 51));
        jLabel16.setText("*");

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 51));
        jLabel17.setText("*");

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 51));
        jLabel18.setText("*");

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 51));
        jLabel19.setText("*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addComponent(username)
                            .addComponent(identityNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(repassword)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)))
                        .addGap(191, 191, 191)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Contact, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(city)
                            .addComponent(genders, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addComponent(bloodg1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(identityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genders, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloodg1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contact))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 204, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel4.setText("CREATE ACCOUNT");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(218, 218, 218)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactActionPerformed
        contactInput = Contact.getText();
        int contactLength = contactInput.length();
        // input validation: All phone number globally can only have between 8 and 16 digits, including +
        // Lowest: Niue +683-xxxx (8 digits)
        // Highest: Austria +43-xxxxxxxxxxxxx (16 digits)
        if (contactLength == 0){
            contactCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Contact field cannot be empty.");
        }
        else if (contactLength >= 8 && contactLength <= 16) {
            contactCheck = 1;
        } else {
            contactCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Phone Number is Invalid. Please Enter a Valid Phone Number. \n Example: +60123456789");
        }
    }//GEN-LAST:event_ContactActionPerformed

    private void gendersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendersActionPerformed
        genderInput = (String) genders.getSelectedItem();
    }//GEN-LAST:event_gendersActionPerformed

    private void gendersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gendersMouseClicked
        //do nothing
    }//GEN-LAST:event_gendersMouseClicked

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        addressInput = city.getText();
        if (addressInput.length() == 0) {
            addressCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Address field cannot be empty.");
        } else {
            addressCheck = 1;
        }
    }//GEN-LAST:event_cityActionPerformed

    private void bloodg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodg1ActionPerformed
        bloodInput = (String) bloodg1.getSelectedItem();
    }//GEN-LAST:event_bloodg1ActionPerformed

    private void repasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repasswordActionPerformed
        repasswordInput = repassword.getText();
        // check whether the passwords match if and only if the password is valid
        if (passwordCheck == 1) {
            if (passwordInput.equals(repasswordInput)) {
                rePasswordCheck = 1;
                finalPasswordInput = passwordInput;
            } else {
                rePasswordCheck = 0;
                JOptionPane.showMessageDialog(rootPane, "Passwords Do not Match. Please Retype Your Passwords.");
            }
        }
    }//GEN-LAST:event_repasswordActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        passwordInput = password.getText();
        if (passwordInput.length() == 0){
            passwordCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Password field cannot be empty");
        }
        else if (passwordInput.length() < 8 || passwordInput.length() > 20) {
            passwordCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Please Enter a Valid Password. Your Password Must Be Between 8 to 20 Characters Long.");
        }
        else{
            passwordCheck = 1;
        }
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        usernameInput = username.getText();

        int nameLength = usernameInput.length(), l = 0;
        // check the name to make sure that not all of them are symbols, and not empty
        for (int i = 0; i < nameLength; i++) {
            if (usernameInput.charAt(i) >= 33 && usernameInput.charAt(i) <= 57) {
                l++;
            }
        }
        if (nameLength==0) {
            usernameCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Name field cannot be empty.");
        }
        else if (l == nameLength) {
            usernameCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Please enter a valid name. Your name cannot be composed of only symbols.");
        }
        else {
            usernameCheck = 1;
        }
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main ma = new Main();
        dispose();
        ma.setVisible(true);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void identityNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identityNumberActionPerformed
        IDInput = identityNumber.getText();

        // The maximum possible digits for IC and passport number is only 12.
        if (IDInput.length() == 0) {
            IDCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Identification/Passport Number field cannot be empty.");
        }
        else if (IDInput.length() > 12){
            IDCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Please Enter a Valid Identification/Passport Number. \n IC Example: 020312070142 \n Passport Example: A12345678");
        }
        else {
            IDCheck = 1;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopmedicalcentre", "root",
                        "WinMyDowSQL119");
                // ResultSet.TYPE_SCROLL_INSENSITIVE enables us to use rs.first() to move the pointer back to the start of the result set
                // This is because the pointer is moved forward once during if(rs.next() == false)
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery("select * from user");
                if (rs.next() == false) {
                    duplicateUserCheck = 1;
                }
                else {
                    rs.beforeFirst();
                    while (rs.next())
                    {
                        if (!IDInput.equals(rs.getString("USER_ID"))) {
                            duplicateUserCheck = 1;
                            continue;
                        }
                        else {
                            duplicateUserCheck = 0;
                            JOptionPane.showMessageDialog(rootPane, "User already exists with the ID/Passport Number " + IDInput);
                            break;
                        }
                    }
                }
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_identityNumberActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        usernameActionPerformed(evt);
        identityNumberActionPerformed(evt);
        passwordActionPerformed(evt);
        repasswordActionPerformed(evt);
        bloodg1ActionPerformed(evt);
        gendersActionPerformed(evt);
        ContactActionPerformed(evt);
        cityActionPerformed(evt);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopmedicalcentre", "root",
                    "WinMyDowSQL119");
            Statement stmt = conn.createStatement();
            // stmt.executeQuery("use doctorappointment");
            ResultSet rs = stmt.executeQuery("select * from user");
            System.out.println("Checking");
            System.out.println(passwordCheck);
            System.out.println(rePasswordCheck);
            System.out.println(duplicateUserCheck);
            System.out.println(usernameCheck);
            System.out.println(contactCheck);
            System.out.println(addressCheck);
            System.out.println(IDCheck);

            if (passwordCheck == 1 && rePasswordCheck == 1 && duplicateUserCheck == 1 && usernameCheck == 1 && contactCheck == 1 && addressCheck == 1 && IDCheck == 1) {
                stmt.executeUpdate("insert into user(USER_ID, USER_NAME,USER_PASS,USER_GENDER,USER_BLOOD,USER_CONTACT,USER_ADDRESS)" + "values('"
                        + IDInput + "','" + usernameInput + "','" + finalPasswordInput + "','" + genderInput + "','" + bloodInput + "'," + contactInput + ",'" + addressInput
                        + "')");
                JOptionPane.showMessageDialog(rootPane, "Registration Successful");
                Login login = new Login();
                dispose();
                login.setVisible(true);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // set all checks to 0 every time the "Register" button is clicked, so that the input validation can be performed once again
        IDCheck = 0;
        passwordCheck = 0;
        rePasswordCheck = 0;
        usernameCheck = 0;
        contactCheck = 0;
        addressCheck = 0;
        duplicateUserCheck = 0;
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        Login login = new Login();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_LoginActionPerformed




    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        // try {
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // Connection conn =
        // DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopmedicalcentre", "root", "WinMyDowSQL119");
        // Statement stmt=conn.createStatement();
        // //stmt.executeQuery("use doctorappointment");
        // //ResultSet rs=stmt.executeQuery("select * from user");
        //// while(rs.next())
        //// {
        //// System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        // if(passwordCheck==1)
        // {
        // stmt.executeUpdate("insert into user(username,password)"+ "values('"+
        // usernameInput + "','"+finalPasswordInput+"')");
        // }
        // conn.close();
        // }
        // catch (Exception e) {
        // e.printStackTrace();
        // }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contact;
    private javax.swing.JButton Login;
    private javax.swing.JComboBox<String> bloodg1;
    private javax.swing.JTextField city;
    private javax.swing.JComboBox<String> genders;
    private javax.swing.JTextField identityNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField repassword;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
