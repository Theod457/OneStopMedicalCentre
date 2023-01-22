package main.resources.medicalCentre;

import java.io.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raghavendhra
 */
public class ViewAppointments extends javax.swing.JFrame {
    public static int appID;

    /**
     * Creates new form ViewAppointments
     */
    public ViewAppointments() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopmedicalcentre", "root",
                    "WinMyDowSQL119");
            Statement stmt = conn.createStatement();
            ResultSet rp = stmt.executeQuery(
                    "select a.APPOINTMENT_ID, d.DOCTOR_NAME, a.APPOINTMENT_DATE, a.APPOINTMENT_TIME from appointment as a,doctor as d where a.DOCTOR_ID=d.DOCTOR_ID and (a.APPOINTMENT_DATE >=(select curdate()) and USER_ID="
                            + Login.userIDInput + ")");
            int x = 800;
            int w = 950;
            int y = 250;

            int labelButtonSequence = 1;
            while (rp.next()) {
//                rp.next();
//                rp.previous();
                JLabel name2 = new JLabel();
                name2.setFont(new java.awt.Font("Ubuntu", 1, 17));
                name2.setText("Name : ");
                this.add(name2);
                name2.setOpaque(true);
                name2.setBounds(x, y, 80, 50);
                // y+=50

                JLabel name1 = new JLabel();
                name1.setFont(new java.awt.Font("Ubuntu", 1, 17));
                name1.setText(String.valueOf(rp.getString("d.DOCTOR_NAME")));
                this.add(name1);
                name1.setOpaque(true);
                name1.setBounds(w, y, 200, 50);
                // System.out.println(rp.getString(2));
                y += 40;

                JLabel date2 = new JLabel();
                date2.setFont(new java.awt.Font("Ubuntu", 1, 17));
                date2.setText("Date : ");
                this.add(date2);
                date2.setOpaque(true);
                date2.setBounds(x, y, 80, 50);

                JLabel date = new JLabel();
                date.setFont(new java.awt.Font("Ubuntu", 1, 17));
                date.setText(String.valueOf(rp.getDate("a.APPOINTMENT_DATE")));
                this.add(date);
                date.setOpaque(true);
                date.setBounds(w, y, 100, 50);
                // x+=100;
                y += 40;
                // y-=50;

                JLabel time2 = new JLabel();
                time2.setFont(new java.awt.Font("Ubuntu", 1, 17));
                time2.setText("Time : ");
                this.add(time2);
                time2.setOpaque(true);
                time2.setBounds(x, y, 100, 50);
                // y-=50;

                JLabel time = new JLabel();
                time.setFont(new java.awt.Font("Ubuntu", 1, 17));
                time.setText(String.valueOf(rp.getTime("a.APPOINTMENT_TIME")));
                this.add(time);
                time.setOpaque(true);
                time.setBounds(w, y, 150, 50);
                y += 55;

                appID = rp.getInt("APPOINTMENT_ID");
                // System.out.println(appID);
                ChooseAppointment.ea = 1;
                JButton editButton = new JButton("Edit Appointment");
                editButton.setToolTipText(String.valueOf(rp.getInt("APPOINTMENT_ID")));
                editButton.setFont(new java.awt.Font("Ubuntu", 1, 19));
                this.add(editButton);
                editButton.setOpaque(true);
                editButton.setBounds(700, y, 210, 45);
                editButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        appID = Integer.valueOf(editButton.getToolTipText());
//                        String oo = editButton.getText();
//                        int h = oo.length();
//                        // char ch = getCharFromString(o, h-1);
//                        // System.out.println(h);
//                        if (h == 17) {
//                            r = oo.charAt(h - 1) - '0';
//                        } else {
//                            int b = oo.charAt(h - 2) - '0';
//                            int bb = oo.charAt(h - 1) - '0';
//                            r = (b * 10) + bb;
//                        }
                        EditAppointment o = new EditAppointment();
                        dispose();
                        o.setVisible(true);
                    }
                });
                JButton cancelButton = new JButton("Cancel Appointment");
                cancelButton.setToolTipText(String.valueOf(rp.getInt("APPOINTMENT_ID")));
                cancelButton.setFont(new java.awt.Font("Ubuntu", 1, 19));
                this.add(cancelButton);
                cancelButton.setOpaque(true);
                cancelButton.setBounds(930, y, 230, 45);
                cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        appID = Integer.valueOf(cancelButton.getToolTipText());
//                        String oo = cancelButton.getText();
//                        int h = oo.length();
//                        // char ch = getCharFromString(o, h-1);
//                        // System.out.println(h);
//                        // System.out.println(h);
//                        if (h == 19) {
//                            r = oo.charAt(h - 1) - '0';
//                        } else {
//                            int b = oo.charAt(h - 2) - '0';
//                            int bb = oo.charAt(h - 1) - '0';
//                            r = (b * 10) + bb;
//                        }
                        CancelAppointment o = new CancelAppointment();
                        dispose();
                        o.setVisible(true);
                    }
                });
                x = 800;
                y += 50;
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(13, 91, 107));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/hospitalIcon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("AMRITA HOSPITAL");

        jButton2.setBackground(new java.awt.Color(3, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LOG OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1037, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 205, 112, 55));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel3.setText("YOUR UPCOMING APPOINTMENTS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 540, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "APPOINTMENT ID", "APPOINTMENT DATE", "APPOINTMENT TIME", "DOCTOR NAME"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 890, 450));

        jPanel2.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(3, 153, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/FrontpageBackground.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(-4, 160, 2040, 670);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopmedicalcentre", "root",
                    "WinMyDowSQL119");// TODO add your handling code here:
            
            Statement stmt = conn.createStatement();
            ResultSet appointmentTable = stmt.executeQuery(
                    "select APPOINTMENT_ID, APPOINTMENT_DATE, APPOINTMENT_TIME, DOCTOR_ID from appointment where USER_ID = " + Login.userIDInput + " and APPOINTMENT_DATE => sysdate()");
            
            while(appointmentTable.next()){
                String appointmentID = appointmentTable.getString("APPOINTMENT_ID");
                String appointmentDate = appointmentTable.getString("APPOINTMENT_DATE");
                String appointmentTime = appointmentTable.getString("APPOINTMENT_TIME");
                String doctorID = appointmentTable.getString("DOCTOR_ID");
                
                
                String tbData[] = {appointmentID, appointmentDate, appointmentTime, doctorID};
                    DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                    tblModel.addRow(tbData);
            }
        }catch(Exception e){
            e.printStackTrace();
        }  
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FrontPage fp = new FrontPage();
        dispose();
        fp.setVisible(true);
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ChooseAppointment ca = new ChooseAppointment();
        dispose();
        ca.setVisible(true);
    }// GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAppointments.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAppointments.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAppointments.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAppointments.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAppointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
