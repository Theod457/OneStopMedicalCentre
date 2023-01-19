                                                                                                                      bnnnnnnnnnnnnnnnnnnn                                    package main.resources.medicalCentre;

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

    public static int docID, dateSelectCheck = 0, l = 0, r;
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
                name2.setFont(new java.awt.Font("Ubuntu", 1, 18));
                name2.setText("Name : ");
                this.add(name2);
                name2.setOpaque(true);
                name2.setBounds(x, y, 100, 50);
                // y+=50

                JLabel name1 = new JLabel();
                name1.setFont(new java.awt.Font("Ubuntu", 1, 18));
                name1.setText(String.valueOf(rp.getString("DOCTOR_NAME")));
                this.add(name1);
                name1.setOpaque(true);
                name1.setBounds(w, y, 200, 50);
                // System.out.println(rp.getString(2));
                y += 45;

                JLabel time2 = new JLabel();
                time2.setFont(new java.awt.Font("Ubuntu", 1, 18));
                time2.setText("Time : ");
                this.add(time2);
                time2.setOpaque(true);
                time2.setBounds(x, y, 100, 50);

                JLabel time = new JLabel();
                time.setFont(new java.awt.Font("Ubuntu", 1, 18));
                time.setText(String.valueOf(rp.getString("DOCTOR_TIME")));
                this.add(time);
                time.setOpaque(true);
                time.setBounds(w, y, 100, 50);
                // x+=100;
                y += 45;
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
                bookButton.setFont(new java.awt.Font("Ubuntu", 1, 19));
                this.add(bookButton);
                bookButton.setOpaque(true);
                bookButton.setBounds(80, y, 215, 55);
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
                                stmt.executeUpdate(
                                        "insert into appointment(USER_ID, DOCTOR_ID, APPOINTMENT_DATE, APPOINTMENT_TIME)" + "values("
                                                + Login.userIDInput + "," + doctorIDInput + ",'" + dateString + "','" + doctorTable.getTime("DOCTOR_TIME") + "')");
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(116, 150, 93));
        setForeground(new java.awt.Color(153, 255, 0));

        jToggleButton1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jToggleButton1.setText("Back");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(40, 89, 79));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/hospitalIcon.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Amrita Hospital ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(613, 613, 613)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(55, 55, 55))
        );

        jButton1.setBackground(java.awt.Color.gray);
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("Confirm Date");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(3, 56, 38));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.gray);
        jLabel1.setText("Select Doctor");

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(628, 628, 628)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1451, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );

        pack();
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
        Main m = new Main();
        dispose();
        m.setVisible(true);
    }// GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
