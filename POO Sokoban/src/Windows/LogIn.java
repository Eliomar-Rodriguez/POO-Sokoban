
package Windows;

import Class.Persona;
import Class.SokobanPrincipal;
import java.util.ArrayList;

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
        txtUsuario = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        btnEntrar1 = new javax.swing.JButton();
        lblAviso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 620));
        setMinimumSize(new java.awt.Dimension(900, 620));
        setPreferredSize(new java.awt.Dimension(900, 620));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Minecrafter", 0, 30)); // NOI18N
        jLabel1.setText("Cedula usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 220, 280, 40);

        jLabel2.setFont(new java.awt.Font("Minecrafter", 0, 30)); // NOI18N
        jLabel2.setText("Contrasena");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 290, 230, 40);

        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(470, 210, 230, 40);

        btnEntrar.setFont(new java.awt.Font("Minecrafter Alt", 0, 30)); // NOI18N
        btnEntrar.setText("Registrarse");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(300, 460, 247, 50);

        txtPass.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtPass.setEchoChar('*');
        getContentPane().add(txtPass);
        txtPass.setBounds(470, 280, 230, 40);

        btnEntrar1.setFont(new java.awt.Font("Minecrafter Alt", 0, 30)); // NOI18N
        btnEntrar1.setText("Entrar");
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar1);
        btnEntrar1.setBounds(350, 390, 160, 50);

        lblAviso.setFont(new java.awt.Font("Minecrafter", 0, 18)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 51, 51));
        lblAviso.setText("Usuario o contraseña incorrecta");
        getContentPane().add(lblAviso);
        lblAviso.setBounds(280, 340, 380, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iniciar sesion.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(900, 620));
        jLabel3.setMinimumSize(new java.awt.Dimension(900, 620));
        jLabel3.setPreferredSize(new java.awt.Dimension(900, 620));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 910, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Registro reg = new Registro();
        reg.setVisible(true);
        reg.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose(); // cierra esta ventana
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed
        SokobanPrincipal sok = new SokobanPrincipal();
        
        ArrayList<Persona> lista = sok.getListaUsuarios();
        
        if (txtUsuario.getText().isEmpty() | txtPass.getPassword().length == 0)  // si alguno de los dos campos esta vacio muestro alerta
            lblAviso.setVisible(true);
        else{                
            char [] arrayC = txtPass.getPassword(); // como el getPassword me devuelve un arreglo de char entonces yo lo paso a string
            String pass = new String(arrayC);
                    
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getContra()==pass && lista.get(i).getCedula()==txtUsuario.getText())
                    if (lista.get(i).getTipoUsuario()==0){//admin
                        MenuAdmin menAdm = new MenuAdmin();
                        menAdm.setVisible(true);
                        menAdm.setDefaultCloseOperation(HIDE_ON_CLOSE);
                        dispose();
                    }
                    else if (lista.get(i).getTipoUsuario()==1){ // usuario normal
                        MenuUsuario menUsu = new MenuUsuario();
                        menUsu.setVisible(true);
                        menUsu.setDefaultCloseOperation(HIDE_ON_CLOSE);
                        dispose();
                    }
                        
            }   
        }
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
    private javax.swing.JLabel lblAviso;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
