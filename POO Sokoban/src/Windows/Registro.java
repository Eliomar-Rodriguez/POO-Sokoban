/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import java.util.Calendar;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        
        setResizable(false);    // no poder cambiar tamano a la ventana
        setSize(1280,720);      // tamano
        setLocationRelativeTo(null);    // posicionar ventana en centro
        setTitle("Registro Sokoban");   // poner titulo a ventana
        
    /// para cargar fecha en caja de texto de fecha
        Calendar Cal= Calendar.getInstance(); 
        String fec= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR); 
        txtDate.setText(fec);
        
        ///
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbUsers = new javax.swing.JComboBox<>();
        txtDate = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel11.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel11.setText("fecha de registro");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(349, 395, 264, 24);

        jLabel12.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel12.setText("Tipo de usuario");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(349, 455, 224, 24);

        cmbUsers.setBackground(new java.awt.Color(204, 255, 255));
        cmbUsers.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cmbUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario normal(Jugador)" }));
        cmbUsers.setToolTipText("");
        getContentPane().add(cmbUsers);
        cmbUsers.setBounds(643, 445, 264, 34);

        txtDate.setBackground(new java.awt.Color(204, 255, 255));
        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtDate.setEnabled(false);
        getContentPane().add(txtDate);
        txtDate.setBounds(643, 388, 264, 34);

        txtPass.setBackground(new java.awt.Color(204, 255, 255));
        txtPass.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtPass);
        txtPass.setBounds(643, 329, 264, 34);

        txtMail.setBackground(new java.awt.Color(204, 255, 255));
        txtMail.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        getContentPane().add(txtMail);
        txtMail.setBounds(643, 265, 264, 34);

        txtId.setBackground(new java.awt.Color(204, 255, 255));
        txtId.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtId);
        txtId.setBounds(643, 207, 264, 34);

        jLabel7.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel7.setText("Nombre completo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(349, 156, 256, 24);

        txtName.setBackground(new java.awt.Color(204, 255, 255));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(643, 149, 264, 34);

        jLabel8.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel8.setText("Cedula");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(349, 214, 99, 24);

        btnSave.setBackground(new java.awt.Color(135, 225, 243));
        btnSave.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnSave.setText("resgistrar");
        btnSave.setAlignmentX(0.5F);
        btnSave.setBorder(null);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(520, 500, 233, 45);

        jLabel9.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel9.setText("correo");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(349, 272, 101, 24);

        jLabel10.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel10.setText("contrasena");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(349, 336, 168, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Registrar.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        LogIn login = new LogIn();
        login.setVisible(true);
        dispose(); // oculta esta ventana y abre la que estoy llamando
    }//GEN-LAST:event_btnSaveActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
