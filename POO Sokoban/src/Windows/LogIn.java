
package Windows;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
        
        setResizable(false);    // no poder cambiar tamano a la ventana
        setSize(900,620);      // tamano
        setLocationRelativeTo(null);    // posicionar ventana en centro
        setTitle("Iniciar Sesion Sokoban");   // poner titulo a ventana
        lblAviso.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnEntrar1 = new javax.swing.JButton();
        lblAviso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Minecrafter", 0, 30)); // NOI18N
        jLabel1.setText("usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 220, 190, 40);

        jLabel2.setFont(new java.awt.Font("Minecrafter", 0, 30)); // NOI18N
        jLabel2.setText("contrasena");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 280, 230, 40);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(410, 210, 280, 40);

        btnEntrar.setFont(new java.awt.Font("Minecrafter Alt", 0, 30)); // NOI18N
        btnEntrar.setText("Registrarse");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(310, 470, 260, 50);

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPasswordField1.setEchoChar('*');
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(410, 270, 280, 40);

        btnEntrar1.setFont(new java.awt.Font("Minecrafter Alt", 0, 30)); // NOI18N
        btnEntrar1.setText("Entrar");
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar1);
        btnEntrar1.setBounds(350, 410, 170, 50);

        lblAviso.setFont(new java.awt.Font("Minecrafter", 0, 18)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 51, 51));
        lblAviso.setText("usuario o contrasena incorrecta");
        getContentPane().add(lblAviso);
        lblAviso.setBounds(250, 340, 380, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iniciar sesion.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 890, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Registro reg = new Registro();
        reg.setVisible(true);
        reg.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose(); // cierra esta ventana
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed
        lblAviso.setVisible(true);
    }//GEN-LAST:event_btnEntrar1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEntrar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAviso;
    // End of variables declaration//GEN-END:variables
}
