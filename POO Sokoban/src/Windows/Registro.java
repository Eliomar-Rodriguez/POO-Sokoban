
package Windows;

import Class.Administrador;
import Class.Persona;
import Class.SokobanPrincipal;
import Class.UsuarioNormal;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

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
        
        // oculto las senales de aviso y el panel
        panelAdmin.setVisible(false);
        lblId.setVisible(false);
        lblMail.setVisible(false);
        lblNation.setVisible(false);
        lblNombre.setVisible(false);
        lblPass.setVisible(false);
        lblTipUser.setVisible(false);
        lblAviso.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbUsers = new javax.swing.JComboBox<>();
        txtMail = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelAdmin = new javax.swing.JPanel();
        panelAdmin3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDate1 = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        lblNation = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        lblTipUser = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        mostrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Registrar.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel11.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel11.setText("fecha de registro");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(180, 300, 264, 24);

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
        getContentPane().add(cmbUsers);
        cmbUsers.setBounds(470, 330, 260, 34);

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
        getContentPane().add(txtMail);
        txtMail.setBounds(470, 210, 260, 34);

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
        getContentPane().add(txtId);
        txtId.setBounds(470, 170, 260, 34);

        jLabel7.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel7.setText("Nombre completo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(180, 140, 256, 24);

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
        getContentPane().add(txtName);
        txtName.setBounds(470, 130, 260, 34);

        jLabel8.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel8.setText("Cedula");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 180, 99, 24);

        btnSave.setBackground(new java.awt.Color(120, 213, 233));
        btnSave.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnSave.setText("resgistrar");
        btnSave.setAlignmentX(0.5F);
        btnSave.setBorder(null);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(350, 460, 233, 40);

        jLabel9.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel9.setText("correo");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 220, 101, 24);

        jLabel10.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel10.setText("contrasena");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 260, 168, 24);

        panelAdmin.setBackground(new java.awt.Color(120, 213, 233));
        panelAdmin.setLayout(null);
        panelAdmin.add(panelAdmin3);
        panelAdmin3.setBounds(340, 350, 550, 140);

        jLabel12.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel12.setText("Tipo de usuario");
        panelAdmin.add(jLabel12);
        jLabel12.setBounds(340, 320, 224, 24);

        jLabel14.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel14.setText("Tipo de usuario");
        panelAdmin.add(jLabel14);
        jLabel14.setBounds(340, 320, 224, 24);

        jLabel2.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel2.setText("Nacionalidad");
        panelAdmin.add(jLabel2);
        jLabel2.setBounds(10, 20, 190, 30);

        txtDate1.setBackground(new java.awt.Color(204, 255, 255));
        txtDate1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtDate1.setEnabled(false);
        txtDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDate1ActionPerformed(evt);
            }
        });
        panelAdmin.add(txtDate1);
        txtDate1.setBounds(630, 270, 264, 34);

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
        panelAdmin.add(txtNacionalidad);
        txtNacionalidad.setBounds(310, 10, 260, 34);

        lblNation.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblNation.setForeground(new java.awt.Color(255, 51, 51));
        lblNation.setText("*");
        panelAdmin.add(lblNation);
        lblNation.setBounds(580, 10, 20, 40);

        getContentPane().add(panelAdmin);
        panelAdmin.setBounds(170, 360, 600, 60);

        jLabel13.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel13.setText("Tipo de usuario");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(180, 320, 224, 70);

        txtDate.setEditable(false);
        txtDate.setBackground(new java.awt.Color(204, 255, 255));
        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtDate);
        txtDate.setBounds(470, 290, 260, 32);

        lblNombre.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 51, 51));
        lblNombre.setText("*");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(740, 130, 20, 40);

        lblId.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 51, 51));
        lblId.setText("*");
        getContentPane().add(lblId);
        lblId.setBounds(740, 170, 20, 40);

        lblMail.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblMail.setForeground(new java.awt.Color(255, 51, 51));
        lblMail.setText("*");
        getContentPane().add(lblMail);
        lblMail.setBounds(740, 210, 20, 40);

        lblPass.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 51, 51));
        lblPass.setText("*");
        getContentPane().add(lblPass);
        lblPass.setBounds(740, 250, 20, 40);

        lblAviso.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 51, 51));
        lblAviso.setText("Debe llenar todos los datos");
        getContentPane().add(lblAviso);
        lblAviso.setBounds(260, 420, 440, 40);

        lblTipUser.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblTipUser.setForeground(new java.awt.Color(255, 51, 51));
        lblTipUser.setText("*");
        getContentPane().add(lblTipUser);
        lblTipUser.setBounds(740, 330, 20, 40);

        txtPass.setBackground(new java.awt.Color(204, 255, 255));
        txtPass.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtPass.setEchoChar('*');
        txtPass.setPreferredSize(new java.awt.Dimension(5, 26));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        getContentPane().add(txtPass);
        txtPass.setBounds(470, 250, 260, 30);

        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar);
        mostrar.setBounds(780, 130, 300, 300);

        buscar.setFont(new java.awt.Font("Minecrafter Alt", 0, 22)); // NOI18N
        buscar.setText("Cargar foto");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(819, 440, 220, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed
    private void limpiar(){
        txtDate.setText("");
        txtId.setText("");
        txtMail.setText("");
        txtNacionalidad.setText("");
        txtPass.setText("");
        txtName.setText("");
        cmbUsers.setSelectedIndex(-1);
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        /// instancias
        Administrador admin = new Administrador();  
        //Administrador admin = new Administrador();
        UsuarioNormal jugador = new UsuarioNormal();
        //admin.setFoto("");
        SokobanPrincipal soko = new SokobanPrincipal();
        ArrayList<Persona> lista = soko.getListaUsuarios();
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

                /*LogIn login = new LogIn();
                login.setVisible(true);
                login.setDefaultCloseOperation(HIDE_ON_CLOSE);
                dispose(); // oculta esta ventana y abre la que estoy llamando*/
            
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
        
    }//GEN-LAST:event_txtNacionalidadActionPerformed

    private void cmbUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsersActionPerformed
        if (cmbUsers.getSelectedIndex()==0)
            panelAdmin.setVisible(true);
        else if (cmbUsers.getSelectedIndex()==1)
            panelAdmin.setVisible(false);
        lblTipUser.setVisible(false);
        
    }//GEN-LAST:event_cmbUsersActionPerformed

    private void txtDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDate1ActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        lblNombre.setVisible(false);
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        lblId.setVisible(false);
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtMailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyPressed
        lblMail.setVisible(false);
    }//GEN-LAST:event_txtMailKeyPressed

    private void cmbUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUsersMouseClicked
        lblAviso.setVisible(false);
    }//GEN-LAST:event_cmbUsersMouseClicked

    private void txtNacionalidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNacionalidadKeyPressed
        lblNation.setVisible(false);
    }//GEN-LAST:event_txtNacionalidadKeyPressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        lblPass.setVisible(false);
    }//GEN-LAST:event_txtPassKeyPressed

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
            Image nueva= photo.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
            //generando imageicon con la nueva imagen
            ImageIcon icono= new ImageIcon(nueva);
            mostrar.setIcon(icono);
            mostrar.setSize(300, 300);
            String direccionImagen = seleccionado;
        }
    }//GEN-LAST:event_buscarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> cmbUsers;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNation;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTipUser;
    private javax.swing.JButton mostrar;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelAdmin3;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
