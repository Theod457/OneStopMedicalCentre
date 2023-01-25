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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raghavendhra
 */
public class ViewAppointments extends javax.swing.JFrame {
    public static String appID;

    /**
     * Creates new form ViewAppointments
     */
    public ViewAppointments() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopmedicalcentre", "root",
                    "WinMyDowSQL119");// TODO add your handling code here:
            
            Statement stmt = conn.createStatement();
            ResultSet appointmentTable = stmt.executeQuery(
                    "select a.APPOINTMENT_ID, a.APPOINTMENT_DATE, a.APPOINTMENT_TIME, d.DOCTOR_NAME, d.DOCTOR_SPEC from appointment as a,doctor as d where a.DOCTOR_ID = d.DOCTOR_ID and a.APPOINTMENT_DATE >= sysdate() and a.USER_ID=" +
                            "'" + Login.userIDInput + "'" + " order by a.APPOINTMENT_DATE");
            
            while(appointmentTable.next()){
                String appointmentID = appointmentTable.getString("a.APPOINTMENT_ID");
                String appointmentDate = appointmentTable.getString("a.APPOINTMENT_DATE");
                String appointmentTime = appointmentTable.getString("a.APPOINTMENT_TIME");
                String doctorName = appointmentTable.getString("d.DOCTOR_NAME");
                String doctorSpec = appointmentTable.getString("d.DOCTOR_SPEC");
                
                String tbData[] = {appointmentID, appointmentDate, appointmentTime, doctorName, doctorSpec};
                    DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                    tblModel.addRow(tbData);
            }
            conn.close();
        }catch(Exception e){
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
        jLogOutButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBackButton = new javax.swing.JButton();
        jEditButton = new javax.swing.JButton();
        jDeleteButton = new javax.swing.JButton();
        jHistoryButton = new javax.swing.JButton();
        jNewButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(13, 91, 107));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/hospitalIcon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("AMRITA HOSPITAL");

        jLogOutButton.setBackground(new java.awt.Color(3, 153, 153));
        jLogOutButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLogOutButton.setForeground(new java.awt.Color(255, 255, 255));
        jLogOutButton.setText("LOG OUT");
        jLogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(312, 312, 312)
                .addComponent(jLogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, -1));

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/clipboard.png"))); // NOI18N
        jLabel3.setText("YOUR UPCOMING APPOINTMENTS");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(460, 170, 740, 100);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "APPOINTMENT ID", "APPOINTMENT DATE", "APPOINTMENT TIME", "DOCTOR NAME", "SPECIALISATION"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(370, 270, 890, 420);

        jBackButton.setBackground(new java.awt.Color(3, 153, 153));
        jBackButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jBackButton.setForeground(new java.awt.Color(255, 255, 255));
        jBackButton.setText("BACK");
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jBackButton);
        jBackButton.setBounds(110, 270, 112, 55);

        jEditButton.setBackground(new java.awt.Color(0, 102, 51));
        jEditButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jEditButton.setForeground(new java.awt.Color(255, 255, 255));
        jEditButton.setText("EDIT APPOINTMENT");
        jEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jEditButton);
        jEditButton.setBounds(370, 700, 410, 50);

        jDeleteButton.setBackground(new java.awt.Color(0, 102, 51));
        jDeleteButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        jDeleteButton.setText("DELETE APPOINTMENT");
        jDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jDeleteButton);
        jDeleteButton.setBounds(850, 700, 410, 50);

        jHistoryButton.setBackground(new java.awt.Color(0, 102, 51));
        jHistoryButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jHistoryButton.setForeground(new java.awt.Color(255, 255, 255));
        jHistoryButton.setText("APPOINTMENT HISTORY");
        jHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHistoryButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jHistoryButton);
        jHistoryButton.setBounds(850, 760, 410, 50);

        jNewButton.setBackground(new java.awt.Color(0, 102, 51));
        jNewButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jNewButton.setForeground(new java.awt.Color(255, 255, 255));
        jNewButton.setText("BOOK NEW APPOINTMENT");
        jNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jNewButton);
        jNewButton.setBounds(370, 760, 410, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/Appointment_icon__2.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(1210, 510, 400, 390);

        jLabel4.setBackground(new java.awt.Color(3, 153, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/FrontpageBackground.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(-4, 160, 2040, 670);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditButtonActionPerformed
        int index = jTable1.getSelectedRow();
        
        if(index<0)
        {
            JOptionPane.showMessageDialog(rootPane, "No rows selected."); 
        } else {
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            appID = model.getValueAt(index, 0).toString();
            EditAppointment o = new EditAppointment();
            dispose();
            o.setVisible(true);  
        }
    }//GEN-LAST:event_jEditButtonActionPerformed

    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed
        int index = jTable1.getSelectedRow();
        
        if(index<0)
        {
            JOptionPane.showMessageDialog(rootPane, "No rows selected.");
        } else {
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            appID = model.getValueAt(index, 0).toString();
            CancelAppointment o = new CancelAppointment();
            dispose();
            o.setVisible(true);  
        }
    }//GEN-LAST:event_jDeleteButtonActionPerformed

    private void jNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewButtonActionPerformed
        SelectSpecialisation s = new SelectSpecialisation();
        dispose();
        s.setVisible(true);        
    }//GEN-LAST:event_jNewButtonActionPerformed

    private void jHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHistoryButtonActionPerformed
        AppointmentHistory ah = new AppointmentHistory();
        dispose();
        ah.setVisible(true);
    }//GEN-LAST:event_jHistoryButtonActionPerformed

    private void jLogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?",
                        "Warning", JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) {    
            FrontPage fp = new FrontPage();
            dispose();
            fp.setVisible(true);
        }
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        AppointmentMainPage ca = new AppointmentMainPage();
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
    private javax.swing.JButton jBackButton;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JButton jEditButton;
    private javax.swing.JButton jHistoryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jLogOutButton;
    private javax.swing.JButton jNewButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
