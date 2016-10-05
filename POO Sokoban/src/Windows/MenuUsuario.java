
package Windows;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MenuUsuario extends javax.swing.JFrame {

    public MenuUsuario() {
        initComponents();
        
        setResizable(false);    // no poder cambiar tamano a la ventana
        setSize(1280,720);      // tamano
        setLocationRelativeTo(null);    // posicionar ventana en centro
        setTitle("Menu Principal");   // poner titulo a ventana
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnConfigPerf = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnCrearGrupo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnSalir.setBackground(new java.awt.Color(0, 199, 230));
        btnSalir.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setAlignmentX(0.5F);
        btnSalir.setBorder(null);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(600, 340, 120, 50);

        btnConfigPerf.setBackground(new java.awt.Color(0, 199, 230));
        btnConfigPerf.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnConfigPerf.setText("Configurar perfil");
        btnConfigPerf.setAlignmentX(0.5F);
        btnConfigPerf.setBorder(null);
        btnConfigPerf.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnConfigPerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigPerfActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfigPerf);
        btnConfigPerf.setBounds(470, 290, 390, 50);

        btnEstadisticas.setBackground(new java.awt.Color(0, 199, 230));
        btnEstadisticas.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.setAlignmentX(0.5F);
        btnEstadisticas.setBorder(null);
        btnEstadisticas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstadisticas);
        btnEstadisticas.setBounds(520, 240, 280, 50);

        btnJugar.setBackground(new java.awt.Color(0, 199, 230));
        btnJugar.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.setAlignmentX(0.5F);
        btnJugar.setBorder(null);
        btnJugar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar);
        btnJugar.setBounds(600, 140, 123, 50);

        btnCrearGrupo.setBackground(new java.awt.Color(0, 199, 230));
        btnCrearGrupo.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnCrearGrupo.setText("crear grupo");
        btnCrearGrupo.setAlignmentX(0.5F);
        btnCrearGrupo.setBorder(null);
        btnCrearGrupo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearGrupo);
        btnCrearGrupo.setBounds(520, 190, 280, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\POO proyecto\\POO-Sokoban\\POO Sokoban\\src\\Images\\menuUsu.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LogIn inicio = new LogIn();
        inicio.setVisible(true);
        inicio.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConfigPerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigPerfActionPerformed
        ConfigUsuario config = new ConfigUsuario();
        config.setVisible(true);
        config.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnConfigPerfActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        Estadisticas es = new Estadisticas();
        es.setVisible(true);
        es.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        Juego game = new Juego();
        game.setVisible(true);
        game.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnCrearGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearGrupoActionPerformed
        CrearGrupo gru = new CrearGrupo();
        gru.setVisible(true);
        gru.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose(); // oculta esta ventana y abre la que estoy llamando
    }//GEN-LAST:event_btnCrearGrupoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfigPerf;
    private javax.swing.JButton btnCrearGrupo;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
