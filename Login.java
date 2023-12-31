/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fee.management.system;
import java.sql.*;
import java.sql.DriverManager;
import javax.xml.transform.Result;
import java.util.Date;
import javax.swing.JOptionPane;
import java.lang.*;
/**
 *
 * @author sathw
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    //private static Connection conn;
    //String curl="jdbc:mysql://localhost:3306/database?zeroDateTimeBehavior=CONVERT_TO_NULL";
    void userVerification(String username,String password){
        PreparedStatement pst;
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/database?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Sathwik3010@");
            String sql="Select * from Signup where username=? and password=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,username );
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Login Successfull!!");
                home home=new home();
                home.show();
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Wrong username or password!!");
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnback = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();
        lblerror = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 503, 60));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Enter Password :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 100, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Enter Username:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 100, 30));

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 170, -1));

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 170, -1));

        btnback.setBackground(new java.awt.Color(153, 255, 204));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel2.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        btnlogin.setBackground(new java.awt.Color(153, 255, 204));
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        btnsignup.setBackground(new java.awt.Color(153, 255, 204));
        btnsignup.setText("Signup");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel2.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        lblerror.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.add(lblerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 290, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 530, 270));

        setSize(new java.awt.Dimension(517, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        String username=txtusername.getText();
        String password=txtpassword.getText();
        
        if(username.trim().equals("")|| password.trim().equals("")){
            lblerror.setText("Please enter username and password");
        }
        else{
           userVerification(username,password); 
        }
        
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        // TODO add your handling code here:
        Signup_Page sp=new Signup_Page();
        sp.show();
        this.dispose();
        
    }//GEN-LAST:event_btnsignupActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblerror;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
