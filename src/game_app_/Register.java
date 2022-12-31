/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package game_app_;
import game_app_.Validation;
import java.io.FileNotFoundException;
import java.io.PrintStream;
/**
 *
 * @author Desi
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        register = new javax.swing.JLabel();
        LabelUsername = new javax.swing.JLabel();
        LabelAge = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        LabelEmail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        LabelPassword = new javax.swing.JLabel();
        LabelRepeatPassword = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        rpassword = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        Background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");

        jPanel1.setPreferredSize(new java.awt.Dimension(560, 400));
        jPanel1.setLayout(null);

        register.setFont(new java.awt.Font("Candara", 0, 30)); // NOI18N
        register.setText("Register");
        jPanel1.add(register);
        register.setBounds(221, 45, 105, 37);

        LabelUsername.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        LabelUsername.setText("Username");
        jPanel1.add(LabelUsername);
        LabelUsername.setBounds(82, 121, 78, 22);

        LabelAge.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        LabelAge.setText("Age");
        jPanel1.add(LabelAge);
        LabelAge.setBounds(82, 164, 40, 22);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(267, 118, 245, 22);
        jPanel1.add(age);
        age.setBounds(267, 161, 245, 22);

        LabelEmail.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        LabelEmail.setText("Email");
        jPanel1.add(LabelEmail);
        LabelEmail.setBounds(82, 207, 41, 22);
        jPanel1.add(email);
        email.setBounds(267, 204, 245, 22);

        LabelPassword.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        LabelPassword.setText("Password");
        jPanel1.add(LabelPassword);
        LabelPassword.setBounds(82, 250, 74, 22);

        LabelRepeatPassword.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        LabelRepeatPassword.setText("Repeat Password");
        jPanel1.add(LabelRepeatPassword);
        LabelRepeatPassword.setBounds(82, 293, 133, 22);
        jPanel1.add(password);
        password.setBounds(267, 247, 245, 22);
        jPanel1.add(rpassword);
        rpassword.setBounds(267, 290, 245, 22);

        submit.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        submit.setText("Submit");
        submit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(230, 350, 88, 29);

        Background1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Desi\\OneDrive\\Desktop\\117624_2.jpg")); // NOI18N
        jPanel1.add(Background1);
        Background1.setBounds(-3, -4, 570, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        
        String username1=username.getText();
        String age1= age.getText();
        String email1= email.getText();
        String password1= password.getText();
        String rpassword1= rpassword.getText();
        
        Validation b = new Validation();
        
      if(b.Username(username1)==true && b.Age(age1)==true && b.Email(email1)==true &&
              b.Password(password1)==true && b.RepeatPassword(rpassword1,password1)){
          
          
         
      }
        
        
    }//GEN-LAST:event_submitActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        
    }//GEN-LAST:event_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background1;
    private javax.swing.JLabel LabelAge;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelRepeatPassword;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JTextField age;
    private javax.swing.JTextField email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField password;
    private javax.swing.JLabel register;
    private javax.swing.JTextField rpassword;
    private javax.swing.JButton submit;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
