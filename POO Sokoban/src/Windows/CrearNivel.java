
package Windows;


public class CrearNivel extends javax.swing.JFrame {


    public CrearNivel() {
        initComponents();
        
        //
        setResizable(false);    // no poder cambiar tamano a la ventana
        setSize(1280,720);      // tamano
        setLocationRelativeTo(null);    // posicionar ventana en centro
        setTitle("Crear Niveles Sokoban");   // poner titulo a ventana
        //
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMovimientos = new javax.swing.JTextField();
        txtFilas = new javax.swing.JTextField();
        txtColumnas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Nivel Sokoban");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel3.setText("Cantidad de movientos para resolver");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 180, 580, 40);

        jLabel4.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel4.setText("Cantidad de columnas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 300, 580, 40);

        txtMovimientos.setFont(new java.awt.Font("Minecrafter", 0, 18)); // NOI18N
        getContentPane().add(txtMovimientos);
        txtMovimientos.setBounds(800, 180, 270, 40);

        txtFilas.setFont(new java.awt.Font("Minecrafter", 0, 18)); // NOI18N
        getContentPane().add(txtFilas);
        txtFilas.setBounds(800, 240, 270, 40);

        txtColumnas.setFont(new java.awt.Font("Minecrafter", 0, 18)); // NOI18N
        getContentPane().add(txtColumnas);
        txtColumnas.setBounds(800, 300, 270, 40);

        jButton1.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        jButton1.setText("Generar");
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 390, 210, 50);

        jLabel5.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel5.setText("Cantidad de filas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 240, 580, 40);

        btnAtras.setFont(new java.awt.Font("Minecrafter Alt", 0, 24)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras);
        btnAtras.setBounds(0, 0, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\POO proyecto\\POO-Sokoban\\POO Sokoban\\src\\Images\\crear Nivel.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 1280, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        MenuAdmin inicio = new MenuAdmin();
        inicio.setVisible(true);
        inicio.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearNivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    private javax.swing.JTextField txtMovimientos;
    // End of variables declaration//GEN-END:variables
}
