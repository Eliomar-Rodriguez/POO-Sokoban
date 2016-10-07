
package Windows;

import Class.Nivel;
import Class.SokobanPrincipal;


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
        txtIdNivel = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbTamano = new javax.swing.JComboBox<>();
        btnAtras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMovimientos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Nivel Sokoban");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel3.setText("numero de nivel");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 120, 580, 40);

        txtIdNivel.setFont(new java.awt.Font("Minecrafter", 0, 18)); // NOI18N
        getContentPane().add(txtIdNivel);
        txtIdNivel.setBounds(780, 120, 270, 40);

        btnGenerar.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar);
        btnGenerar.setBounds(540, 390, 210, 50);

        jLabel5.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel5.setText("Seleccione el tamano de la matriz");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 240, 580, 40);

        cmbTamano.setFont(new java.awt.Font("Minecrafter", 0, 18)); // NOI18N
        cmbTamano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "13", "14", "15" }));
        cmbTamano.setSelectedIndex(-1);
        getContentPane().add(cmbTamano);
        cmbTamano.setBounds(780, 240, 270, 40);

        btnAtras.setFont(new java.awt.Font("Minecrafter Alt", 0, 24)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras);
        btnAtras.setBounds(0, 0, 120, 40);

        jLabel4.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel4.setText("Cantidad de movientos para resolver");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 180, 580, 40);

        txtMovimientos.setFont(new java.awt.Font("Minecrafter", 0, 18)); // NOI18N
        txtMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMovimientosActionPerformed(evt);
            }
        });
        getContentPane().add(txtMovimientos);
        txtMovimientos.setBounds(780, 180, 270, 40);

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

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        
        Nivel nivel = new Nivel();
        int tamano =0;
        if (cmbTamano.getSelectedIndex()==0)
            tamano = 10;
        else if (cmbTamano.getSelectedIndex()==1)
            tamano = 11;
        else if (cmbTamano.getSelectedIndex()==2)
            tamano = 12;
        else if (cmbTamano.getSelectedIndex()==3)
            tamano = 13;
        else if (cmbTamano.getSelectedIndex()==4)
            tamano = 14;
        else if (cmbTamano.getSelectedIndex()==5)
            tamano = 15;
        
        nivel.setColumnas(tamano);
        nivel.setFilas(tamano);
        nivel.setIdNivel(Integer.parseInt(txtIdNivel.getText()));
        nivel.setCantMoves(Integer.parseInt(txtMovimientos.getText()));
        //nivel.setIdAdmin(idAdmin); // ver como diantres le pongo el id del admin xD
        
        SokobanPrincipal.crearMatriz(tamano); // esto no va aqui creo
        /*
        hay que pensar bien muchas cosas
            - el crear matriz mas bien deberia llamarse en crear nivel
            - tengo que encontrar la manera de obtener el idAmin con el que me registre
        */
              
        
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void txtMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMovimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMovimientosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearNivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cmbTamano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtIdNivel;
    private javax.swing.JTextField txtMovimientos;
    // End of variables declaration//GEN-END:variables
}
