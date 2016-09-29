
package Windows;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
        
        setResizable(false);    // no poder cambiar tamano a la ventana
        setSize(900,620);      // tamano
        setLocationRelativeTo(null);    // posicionar ventana en centro
        setTitle("Iniciar Sesion Sokoban");   // poner titulo a ventana
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
        jLabel2.setBounds(180, 310, 230, 40);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(410, 210, 280, 40);

        btnEntrar.setFont(new java.awt.Font("Minecrafter Alt", 0, 30)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(350, 400, 170, 50);

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPasswordField1.setEchoChar('*');
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(410, 300, 280, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iniciar sesion.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(90, 620));
        jLabel3.setMinimumSize(new java.awt.Dimension(900, 620));
        jLabel3.setPreferredSize(new java.awt.Dimension(900, 620));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 890, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
