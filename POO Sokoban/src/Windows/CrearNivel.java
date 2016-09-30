
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

        btnPared = new javax.swing.JButton();
        btnCaja = new javax.swing.JButton();
        btnCajaRoja = new javax.swing.JButton();
        btnPersonaje = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Nivel Sokoban");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        btnPared.setBackground(new java.awt.Color(65, 195, 228));
        btnPared.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnPared.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/muro.jpeg"))); // NOI18N
        btnPared.setAlignmentX(0.5F);
        btnPared.setBorder(null);
        btnPared.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnPared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParedActionPerformed(evt);
            }
        });
        getContentPane().add(btnPared);
        btnPared.setBounds(1150, 250, 70, 70);

        btnCaja.setBackground(new java.awt.Color(65, 195, 228));
        btnCaja.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/caja.png"))); // NOI18N
        btnCaja.setAlignmentX(0.5F);
        btnCaja.setBorder(null);
        btnCaja.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCaja);
        btnCaja.setBounds(1150, 110, 70, 70);

        btnCajaRoja.setBackground(new java.awt.Color(65, 195, 228));
        btnCajaRoja.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnCajaRoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cajaRoja.jpg"))); // NOI18N
        btnCajaRoja.setAlignmentX(0.5F);
        btnCajaRoja.setBorder(null);
        btnCajaRoja.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnCajaRoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaRojaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCajaRoja);
        btnCajaRoja.setBounds(1150, 180, 70, 70);

        btnPersonaje.setBackground(new java.awt.Color(65, 195, 228));
        btnPersonaje.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnPersonaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBotons/mariobros.gif"))); // NOI18N
        btnPersonaje.setAlignmentX(0.5F);
        btnPersonaje.setBorder(null);
        btnPersonaje.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonajeActionPerformed(evt);
            }
        });
        getContentPane().add(btnPersonaje);
        btnPersonaje.setBounds(1150, 320, 70, 70);

        jLabel2.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel2.setText("Cantidad de columnas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 650, 360, 40);

        jLabel3.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel3.setText("Cantidad de movientos para resolver");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 590, 360, 40);

        jLabel4.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        jLabel4.setText("Cantidad de filas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 620, 360, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crear Nivel.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1280, 711);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnParedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParedActionPerformed
        
    }//GEN-LAST:event_btnParedActionPerformed

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCajaActionPerformed

    private void btnCajaRojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaRojaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCajaRojaActionPerformed

    private void btnPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPersonajeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearNivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaja;
    private javax.swing.JButton btnCajaRoja;
    private javax.swing.JButton btnPared;
    private javax.swing.JButton btnPersonaje;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
