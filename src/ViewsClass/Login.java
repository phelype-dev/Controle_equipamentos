/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewsClass;

import controller.Autentica_login;
import javax.swing.JOptionPane;
import model.LoginBeans;

/**
 *
 * @author phelype
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        btnAcessar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        textPassword = new javax.swing.JPasswordField();
        JLABELFUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensSystem/default(1).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 30, 80, 75);

        textUsuario.setBackground(new java.awt.Color(105, 105, 105));
        textUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textUsuario.setToolTipText("");
        getContentPane().add(textUsuario);
        textUsuario.setBounds(30, 120, 200, 30);

        btnAcessar.setBackground(new java.awt.Color(105, 105, 105));
        btnAcessar.setText("Acessar");
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        btnAcessar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAcessarKeyPressed(evt);
            }
        });
        getContentPane().add(btnAcessar);
        btnAcessar.setBounds(30, 200, 200, 31);

        btnCancelar.setBackground(new java.awt.Color(105, 105, 105));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(30, 240, 200, 31);

        textPassword.setBackground(new java.awt.Color(105, 105, 105));
        textPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(textPassword);
        textPassword.setBounds(30, 160, 200, 30);

        JLABELFUNDO.setIcon(new javax.swing.ImageIcon("/home/phelype/Imagens/projeto-de-fundo-escuro-abstrato-de-meio-tom_1017-15505.jpg")); // NOI18N
        getContentPane().add(JLABELFUNDO);
        JLABELFUNDO.setBounds(0, 0, 270, 290);

        setSize(new java.awt.Dimension(262, 315));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static String log, s;
    Autentica_login aut = new Autentica_login();
    
    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
          Autentica_login login = new Autentica_login();
          boolean valida = login.Autentica(textUsuario.getText(), textPassword.getText());
          if(valida == true){
              if(login.ativo == true){
                  Home home = new Home();
                  home.setVisible(true);
                  dispose();
                  log = String.valueOf(textUsuario.getText());
                  System.out.println("ClassLogin.:"+log);
              }else{
                  JOptionPane.showMessageDialog(null, "Usu??rio n??o autorizado !");
              }
          }
    }//GEN-LAST:event_btnAcessarActionPerformed

    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAcessarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAcessarKeyPressed
          /*Autentica_login login = new Autentica_login();
          boolean valida = login.Autentica(textUsuario.getText(), textPassword.getText());
          if(valida == true){
              if(login.ativo == true){
                  Home home = new Home();
                  home.setVisible(true);
                  dispose();
                 
              }else{
                  JOptionPane.showMessageDialog(null, "Usu??rio n??o autorizado !");
              }
          }*/
    }//GEN-LAST:event_btnAcessarKeyPressed

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
    private javax.swing.JLabel JLABELFUNDO;
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
