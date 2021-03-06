
package Windows;

import Class.Administrador;
import Class.Persona;
import Class.SokobanPrincipal;
import Class.UsuarioNormal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LogIn extends javax.swing.JFrame {
    
    public LogIn() {
        
        initComponents();
        
        setResizable(false);    // no poder cambiar tamano a la ventana
        setSize(900,620);      // tamano
        setLocationRelativeTo(null);    // posicionar ventana en centro
        setTitle("Iniciar Sesion Sokoban");   // poner titulo a ventana
        lblNoExiste.setVisible(false);
        lblAviso.setVisible(false);
        
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        txtPassLogin = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblNoExiste = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 620));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Minecrafter", 0, 30)); // NOI18N
        jLabel1.setText("cedula usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 220, 280, 40);

        jLabel2.setFont(new java.awt.Font("Minecrafter", 0, 30)); // NOI18N
        jLabel2.setText("contrasena");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 290, 230, 40);

        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(470, 210, 230, 40);

        btnRegistrarse.setFont(new java.awt.Font("Minecrafter Alt", 0, 30)); // NOI18N
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse);
        btnRegistrarse.setBounds(300, 460, 260, 50);

        txtPassLogin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtPassLogin.setEchoChar('*');
        getContentPane().add(txtPassLogin);
        txtPassLogin.setBounds(470, 280, 230, 40);

        btnEntrar.setFont(new java.awt.Font("Minecrafter Alt", 0, 30)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(350, 400, 160, 50);

        lblNoExiste.setFont(new java.awt.Font("Minecrafter", 0, 18)); // NOI18N
        lblNoExiste.setForeground(new java.awt.Color(255, 51, 51));
        lblNoExiste.setText("El usuario ingresado no existe");
        getContentPane().add(lblNoExiste);
        lblNoExiste.setBounds(270, 340, 350, 40);

        lblAviso.setFont(new java.awt.Font("Minecrafter", 0, 18)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 51, 51));
        lblAviso.setText("Usuario o contrasena incorrecta");
        getContentPane().add(lblAviso);
        lblAviso.setBounds(260, 340, 380, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iniciar sesion.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -20, 900, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        Registro reg = new Registro();
        reg.setVisible(true);
        reg.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose(); // cierra esta ventana
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
         String contraseña = new String(txtPassLogin.getPassword());
            System.out.println("len de la lista"+SokobanPrincipal.listaUsuarios.size()+"contra " + contraseña);   
        if (txtUsuario.getText().isEmpty() | txtPassLogin.getPassword().length==0)  // si alguno de los dos campos esta vacio muestro alerta
            lblAviso.setVisible(true);
        else{
            //char [] arrayC = txtPassLogin.getPassword();
            
            for (int i = 0; i < SokobanPrincipal.listaUsuarios.size(); i++) {
                    
                    if (SokobanPrincipal.listaUsuarios.get(i).getCedula()==(txtUsuario.getText()) && SokobanPrincipal.listaUsuarios.get(i).getContra()==(contraseña)){
                        
                        if (SokobanPrincipal.listaUsuarios.get(i).getTipoUsuario()==0){//admin
                            MenuAdmin menAdm = new MenuAdmin();
                            menAdm.setVisible(true);
                            menAdm.setDefaultCloseOperation(HIDE_ON_CLOSE);
                            dispose();
                        }
                        else if (SokobanPrincipal.listaUsuarios.get(i).getTipoUsuario()==1){ // usuario normal
                            MenuUsuario menUsu = new MenuUsuario();
                            menUsu.setVisible(true);
                            menUsu.setDefaultCloseOperation(HIDE_ON_CLOSE);
                            dispose();
                        }
                    }
                     
            }  
            lblAviso.setVisible(false);
            lblNoExiste.setVisible(true);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        SokobanPrincipal soko = new SokobanPrincipal();
        
        Administrador admin = new Administrador("Costarricense",0,0,"Administrador","212223","admin1@administradores.com","abcd","05/10/2016","C:\\Users\\Peniche\\Documents\\NetBeansProjects\\POO-Sokoban\\POO Sokoban\\src\\ImgUsers\\2.jpg",0);
        soko.setListaUsuarios(admin);
        
        UsuarioNormal jugador = new UsuarioNormal(4,45,0,"Usuario","121314","josecarlos95@gmail.com","1234","03/10/2016","C:\\Users\\Peniche\\Documents\\NetBeansProjects\\POO-Sokoban\\POO Sokoban\\src\\ImgUsers\\1.jpg",1);
        soko.setListaUsuarios(jugador);
        
    }//GEN-LAST:event_formWindowOpened

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblNoExiste;
    private javax.swing.JPasswordField txtPassLogin;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
