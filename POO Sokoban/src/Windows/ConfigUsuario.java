/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Antonio Rodriguez
 */
public class ConfigUsuario extends javax.swing.JFrame {

    /**
     * Creates new form ConfigUsuario
     */
    public ConfigUsuario() {
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

        mostrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        cmbUsers = new javax.swing.JComboBox<>();
        txtDate = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        txtMail = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuración cuenta de Usuario");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 300, 300));

        buscar.setFont(new java.awt.Font("Minecrafter Alt", 0, 22)); // NOI18N
        buscar.setText("Cargar foto");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, -1, 40));

        jLabel7.setFont(new java.awt.Font("Minecrafter", 0, 20)); // NOI18N
        jLabel7.setText("Nombre completo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 256, 24));

        jLabel8.setFont(new java.awt.Font("Minecrafter", 0, 20)); // NOI18N
        jLabel8.setText("Cedula");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 99, 24));

        jLabel9.setFont(new java.awt.Font("Minecrafter", 0, 20)); // NOI18N
        jLabel9.setText("Correo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 101, 24));

        jLabel10.setFont(new java.awt.Font("Minecrafter", 0, 20)); // NOI18N
        jLabel10.setText("Contrasena");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 180, 24));

        jLabel11.setFont(new java.awt.Font("Minecrafter", 0, 20)); // NOI18N
        jLabel11.setText("Fecha de registro");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 280, 24));

        jLabel13.setFont(new java.awt.Font("Minecrafter", 0, 20)); // NOI18N
        jLabel13.setText("Tipo de usuario");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 224, 24));

        jLabel2.setFont(new java.awt.Font("Minecrafter", 0, 20)); // NOI18N
        jLabel2.setText("Nacionalidad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 190, 30));

        txtNacionalidad.setBackground(new java.awt.Color(204, 255, 255));
        txtNacionalidad.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });
        txtNacionalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNacionalidadKeyPressed(evt);
            }
        });
        getContentPane().add(txtNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 260, -1));

        cmbUsers.setBackground(new java.awt.Color(204, 255, 255));
        cmbUsers.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cmbUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario normal(Jugador)" }));
        cmbUsers.setSelectedIndex(-1);
        cmbUsers.setToolTipText("");
        cmbUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbUsersMouseClicked(evt);
            }
        });
        cmbUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsersActionPerformed(evt);
            }
        });
        getContentPane().add(cmbUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 260, -1));

        txtDate.setEditable(false);
        txtDate.setBackground(new java.awt.Color(204, 255, 255));
        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 260, -1));

        txtPass.setBackground(new java.awt.Color(204, 255, 255));
        txtPass.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtPass.setEchoChar('*');
        txtPass.setPreferredSize(new java.awt.Dimension(5, 26));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 260, 30));

        txtMail.setBackground(new java.awt.Color(204, 255, 255));
        txtMail.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMailKeyPressed(evt);
            }
        });
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 260, -1));

        txtId.setBackground(new java.awt.Color(204, 255, 255));
        txtId.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 260, -1));

        txtName.setBackground(new java.awt.Color(204, 255, 255));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 260, -1));

        btnSave.setBackground(new java.awt.Color(120, 204, 255));
        btnSave.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnSave.setText("Guardar cambios");
        btnSave.setAlignmentX(0.5F);
        btnSave.setBorder(null);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\POO proyecto\\POO-Sokoban\\POO Sokoban\\src\\Images\\editPerfilUsu.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed

    }//GEN-LAST:event_mostrarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        JFileChooser nuevo = new JFileChooser ();
        // se establece el formato de la imagen a aceptar
        FileFilter varas = null;
        nuevo.setFileFilter(varas);
        //abrir la ventana de dialogo en esta ventana para seleccionar imagen
        int var =nuevo.showOpenDialog(this);
        if (var==JFileChooser.APPROVE_OPTION){   // si selecciono una imagen
            //obtener el archivo seleeccionado
            String seleccionado= nuevo.getSelectedFile().getPath();
            // obtener direccion donde se guardara la imagen
            String direccion= nuevo.getSelectedFile().toString();
            mostrar.setIcon(new ImageIcon(seleccionado));
            ImageIcon imagen = new ImageIcon(seleccionado);
            Image photo = imagen.getImage();
            //cambiar tamaño a la imagen
            Image nueva = photo.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
            //generando imageicon con la nueva imagen
            ImageIcon icono= new ImageIcon(nueva);
            mostrar.setIcon(icono);
            mostrar.setSize(300, 300);
            String direccionImagen = seleccionado;
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed

    }//GEN-LAST:event_txtNacionalidadActionPerformed

    private void txtNacionalidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNacionalidadKeyPressed
        //lblNation.setVisible(false);
    }//GEN-LAST:event_txtNacionalidadKeyPressed

    private void cmbUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUsersMouseClicked
        //lblAviso.setVisible(false);
    }//GEN-LAST:event_cmbUsersMouseClicked

    private void cmbUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsersActionPerformed
        /*if (cmbUsers.getSelectedIndex()==0)
        panelAdmin.setVisible(true);
        else if (cmbUsers.getSelectedIndex()==1)
        panelAdmin.setVisible(false);
        lblTipUser.setVisible(false);*/
    }//GEN-LAST:event_cmbUsersActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        //lblPass.setVisible(false);
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void txtMailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyPressed
        //lblMail.setVisible(false);
    }//GEN-LAST:event_txtMailKeyPressed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        //lblId.setVisible(false);
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        //lblNombre.setVisible(false);
    }//GEN-LAST:event_txtNameKeyPressed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        /// instancias
        /*Administrador admin = new Administrador();
        //Administrador admin = new Administrador();
        //UsuarioNormal jugador = new UsuarioNormal();
        admin.setFoto("");
        SokobanPrincipal soko = new SokobanPrincipal();
        ArrayList<Persona> lista = soko.getListaUsuarios();

        if (cmbUsers.getSelectedIndex()==-1) // sino eligieron opcion manda mensaje
        lblTipUser.setVisible(true);
        else if (cmbUsers.getSelectedIndex()==0){

            if (txtName.getText().isEmpty() | txtId.getText().isEmpty() | txtMail.getText().isEmpty() | txtPass.getPassword().length==0 | txtNacionalidad.getText().isEmpty()){

                if (txtNacionalidad.getText().isEmpty())
                lblNation.setVisible(true);

                if (txtId.getText().isEmpty())    // si esta vacio se puede usar tambien el .equals("")
                lblId.setVisible(true);     // poner visible el asterisco de error

                if (txtMail.getText().isEmpty())
                lblMail.setVisible(true);

                if (txtName.getText().isEmpty())    // si esta vacio se puede usar tambien el .equals("")
                lblNombre.setVisible(true);     // poner visible el asterisco de error

                if (txtPass.getPassword().length == 0)
                lblPass.setVisible(true);     // poner visible el asterisco de error
                lblAviso.setVisible(true);
            }
            else{
                admin.setNacionalidad(txtNacionalidad.getText());
                admin.setCedula(txtId.getText());
                admin.setNombre(txtName.getText());
                admin.setCorreo(txtMail.getText());

                char [] arrayC = txtPass.getPassword(); // como el getPassword me devuelve un arreglo de char entonces yo lo paso a string
                String pass = new String(arrayC);

                admin.setContra(pass);
                admin.setTipoUsuario(cmbUsers.getSelectedIndex());
                admin.setFechaReg(txtDate.getText());

                lista.add(admin);
                System.out.println("Agregado con exito!");
            }
        }
        else if(cmbUsers.getSelectedIndex()==1){ // usuario normal

        }

        LogIn login = new LogIn();
        login.setVisible(true);
        login.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose(); // oculta esta ventana y abre la que estoy llamando
        */
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(ConfigUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> cmbUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
