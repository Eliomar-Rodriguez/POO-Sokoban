/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Class.Administrador;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Antonio Rodriguez
 */
public class ConfigAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ConfigAdmin
     */
    public ConfigAdmin() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        mostrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        txtMail = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuración cuenta de Administrador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);
        getContentPane().add(mostrar);
        mostrar.setBounds(760, 170, 340, 310);

        buscar.setFont(new java.awt.Font("Minecrafter Alt", 0, 22)); // NOI18N
        buscar.setText("Cargar foto");
        getContentPane().add(buscar);
        buscar.setBounds(840, 490, 200, 40);

        jLabel7.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel7.setText("Nombre completo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(206, 150, 270, 30);

        jLabel8.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel8.setText("Cedula");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 200, 260, 30);

        jLabel9.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel9.setText("Correo");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(210, 250, 270, 30);

        jLabel10.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel10.setText("Contrasena");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(210, 300, 260, 30);

        jLabel2.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel2.setText("Nacionalidad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 350, 280, 30);

        txtNacionalidad.setBackground(new java.awt.Color(204, 255, 255));
        txtNacionalidad.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtNacionalidad);
        txtNacionalidad.setBounds(480, 340, 260, 40);

        txtPass.setBackground(new java.awt.Color(204, 255, 255));
        txtPass.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtPass.setEchoChar('*');
        txtPass.setPreferredSize(new java.awt.Dimension(5, 26));
        getContentPane().add(txtPass);
        txtPass.setBounds(480, 290, 260, 40);

        txtMail.setBackground(new java.awt.Color(204, 255, 255));
        txtMail.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtMail);
        txtMail.setBounds(480, 240, 260, 40);

        txtId.setBackground(new java.awt.Color(204, 255, 255));
        txtId.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtId);
        txtId.setBounds(480, 190, 260, 40);

        txtName.setBackground(new java.awt.Color(204, 255, 255));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(480, 140, 260, 40);

        btnSave.setBackground(new java.awt.Color(120, 204, 255));
        btnSave.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnSave.setText("Guardar cambios");
        btnSave.setAlignmentX(0.5F);
        btnSave.setBorder(null);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(btnSave);
        btnSave.setBounds(270, 400, 370, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Windows/editPerfil.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1280, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConfigAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton buscar;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
