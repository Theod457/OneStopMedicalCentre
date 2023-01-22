package main.resources.medicalCentre;

import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.sql.Time;
//import static onlinedoctorappointmentsystem.Login;

/**
 *
 * @author raghavendhra
 */
public class SelectDoctor extends javax.swing.JFrame {

    public static int docID, dateSelectCheck = 0;
    public static Date date = new Date();
    public static String dateString;
    public static Time time;

    // public static Statement stmt;
    /**
     * Creates new form Selectdoctory
     */
    public SelectDoctor() {
        initComponents();
        int x, y, w, dateSelectCheck;
        date = null;
        String docname1 = Specialisation.docName;
        String name;
        JLabel[] array = new JLabel[10];

        // for(int i=0;i<10;i++)
        // {
        // array[i] = new JLabel("raghs"+i);
        // array[i].setText("i"+i);
        // this.add(array[i]);
        // array[i].setOpaque(true);
        // array[i].setBounds(x, y, 40, 40);
        // // array[i].setBackground(Color.CYAN);
        // //array[i].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        // x += 140;
        //
        // // System.out.println(array[i].toString());
        // }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopmedicalcentre", "root",
                    "WinMyDowSQL119");
            Statement stmt = conn.createStatement();
            ResultSet rp = stmt.executeQuery("select * from doctor where DOCTOR_SPEC='" + docname1 + "'");
            x = 70;
            w = 260;
            y = 250;
            // name1.setText(" " );
            while (rp.next()) {
                // rp.next();
                // rp.previous();
                JLabel name2 = new JLabel();
                name2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20));
                name2.setText("Name : ");
                this.add(name2);
                name2.setOpaque(true);
                name2.setBounds(x, y, 100, 70);
                // y+=50

                JLabel name1 = new JLabel();
                name1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20));
                name1.setText(String.valueOf(rp.getString("DOCTOR_NAME")));
                this.add(name1);
                name1.setOpaque(true);
                name1.setBounds(w, y, 200, 70);
                // System.out.println(rp.getString(2));
                y += 65;

                JLabel time2 = new JLabel();
                time2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20));
                time2.setText("Time : ");
                this.add(time2);
                time2.setOpaque(true);
                time2.setBounds(x, y, 100, 70);

                JLabel time = new JLabel();
                time.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20));
                time.setText(String.valueOf(rp.getString("DOCTOR_TIME")));
                this.add(time);
                time.setOpaque(true);
                time.setBounds(w, y, 100, 70);
                // x+=100;
                y += 65;
                // y-=50;

//                JLabel gender1 = new JLabel();
//                gender1.setFont(new java.awt.Font("Ubuntu", 1, 18));
//                gender1.setText("Gender : ");
//                this.add(gender1);
//                gender1.setOpaque(true);
//                gender1.setBounds(x, y, 100, 50);
//                // y-=50;
//
//                JLabel amount1 = new JLabel();
//                amount1.setFont(new java.awt.Font("Ubuntu", 1, 18));
//                amount1.setText("Amount : ");
//                this.add(amount1);
//                amount1.setOpaque(true);
//                amount1.setBounds(x, y, 100, 50);
//                // x+=50;

//                JLabel amount = new JLabel();
//                amount.setFont(new java.awt.Font("Ubuntu", 1, 18));
//                amount.setText(String.valueOf(rp.getString(5)));
//                this.add(amount);
//                amount.setOpaque(true);
//                amount.setBounds(w, y, 150, 50);
//                // .setText(String.valueOf(rp.getString(2)));
//                // name1=null;
//                y += 55;
                docID = rp.getInt("DOCTOR_ID");
                // System.out.println(docID);
                JButton bookButton = new JButton(" Book Appointment");
                bookButton.setToolTipText(String.valueOf(rp.getInt("DOCTOR_ID")));
                bookButton.setFont(new java.awt.Font("Segoe UI Bold", 1, 20));
                this.add(bookButton);
                bookButton.setOpaque(true);
                bookButton.setBounds(70, y, 215, 55);
                bookButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // System.out.println(docID);
//                        String o = bookButton.getText();
//                        int h = o.length();
//                        // char ch = getCharFromString(o, h-1);
//                        System.out.println(h);
//                        if (h == 17) {
//                            r = o.charAt(h - 1) - '0';
//                        } else {
//                            int bookButton = o.charAt(h - 2) - '0';
//                            int bb = o.charAt(h - 1) - '0';
//                            r = (bookButton * 10) + bb;
//                        }
                        // System.out.println(o.charAt(h-1));
                        // System.out.println(o);
                        // time = rp.getTime("DOCTOR_TIME");
                        // System.out.println(SelectDoctor.docID);
                        if (SelectDoctor.dateSelectCheck == 0) {
                            JOptionPane.showMessageDialog(rootPane, "Please Select A Date");
                        } else {
                            try {
                                int doctorIDInput = Integer.valueOf(bookButton.getToolTipText());
                                Class.forName("com.mysql.cj.jdbc.Driver");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopmedicalcentre", "root",
                                        "WinMyDowSQL119");
                                Statement stmt = conn.createStatement();
                                ResultSet doctorTable = stmt.executeQuery("select * from doctor where DOCTOR_ID=" + doctorIDInput);
                                doctorTable.next();
                                System.out.println(Login.userIDInput);
                                stmt.executeUpdate(
                                        "insert into appointment(USER_ID, DOCTOR_ID, APPOINTMENT_DATE, APPOINTMENT_TIME)" + "values("
                                                + "'" + Login.userIDInput + "'" + "," + doctorIDInput + ",'" + dateString + "','" + doctorTable.getTime("DOCTOR_TIME") + "')");
                                Payment f = new Payment();
                                dispose();
                                f.setVisible(true);
                            } catch (Exception dateSelectCheck) {
                                dateSelectCheck.printStackTrace();
                            }
                        }
                    }
                });
                // if(SelectDoctor.l==1)
                // {
                // stmt.executeUpdate("insert into appointment(docID,DOCTOR_ID,APPOINTMENT_DATE)"+
                // "values("+Login.userIDInput+","+doctor_id+",'"+date+"')");
                //
                // break;
                // }
                x = 70;
                y += 50;
                // i++;
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1540, 810));
        setSize(new java.awt.Dimension(1540, 810));
        getContentPane().setLayout(null);

        jToggleButton1.setBackground(new java.awt.Color(2, 153, 153));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setSelected(true);
        jToggleButton1.setText("BACK");
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(15, 190, 135, 45);

        jPanel1.setBackground(new java.awt.Color(14, 94, 111));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/hospitalIcon.png"))); // NOI18N

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(14, 94, 111));
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        label1.setForeground(java.awt.Color.white);
        label1.setName(""); // NOI18N
        label1.setText("Amrita Hospital");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 1195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 564, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1939, 170);

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("CONFIRM DATE");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1040, 690, 200, 50);

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT DOCTOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 190, 350, 41);

        jButton2.setBackground(new java.awt.Color(2, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LOG OUT");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1380, 190, 135, 45);

        jCalendar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 30, true));
        jCalendar1.setDate(new java.util.Date(1674380306000L));
        jCalendar1.setMinimumSize(new java.awt.Dimension(250, 250));
        jCalendar1.setPreferredSize(new java.awt.Dimension(250, 250));
        getContentPane().add(jCalendar1);
        jCalendar1.setBounds(890, 260, 500, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        Specialisation s = new Specialisation();
        dispose();
        s.setVisible(true);
    }// GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Date comdate = new Date();
        String f;
        dateSelectCheck = 1;
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        dateString = dcn.format(jCalendar1.getDate());
        JOptionPane.showMessageDialog(rootPane, "Date Selection Confirmed");
        // dcn.format(comdate);
        // System.out.println(comdate);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FrontPage fp = new FrontPage();
        dispose();
        fp.setVisible(true);
    }// GEN-LAST:event_jButton2ActionPerformed

//        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
//        // TODO add your handling code here:
//        ConfirmAppointment ca = new ConfirmAppointment();
//        dispose();
//        ca.setVisible(true);
//    }// GEN-LAST:event_jButton3ActionPerformed
        
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
            java.util.logging.Logger.getLogger(SelectDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
