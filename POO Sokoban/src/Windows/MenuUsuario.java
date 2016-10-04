
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

        bntCrearGrupo = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnConfigPerf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bntCrearGrupo.setBackground(new java.awt.Color(65, 195, 228));
        bntCrearGrupo.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        bntCrearGrupo.setText("Crear grupo");
        bntCrearGrupo.setAlignmentX(0.5F);
        bntCrearGrupo.setBorder(null);
        bntCrearGrupo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bntCrearGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCrearGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(bntCrearGrupo);
        bntCrearGrupo.setBounds(530, 240, 280, 50);

        btnEstadisticas.setBackground(new java.awt.Color(65, 195, 228));
        btnEstadisticas.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnEstadisticas.setText("Ver estadisticas");
        btnEstadisticas.setAlignmentX(0.5F);
        btnEstadisticas.setBorder(null);
        btnEstadisticas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstadisticas);
        btnEstadisticas.setBounds(550, 290, 252, 50);

        btnSalir.setBackground(new java.awt.Color(65, 195, 228));
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
        btnSalir.setBounds(620, 390, 120, 50);

        btnJugar.setBackground(new java.awt.Color(65, 195, 228));
        btnJugar.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.setAlignmentX(0.5F);
        btnJugar.setBorder(null);
        btnJugar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar);
        btnJugar.setBounds(610, 190, 130, 50);

        btnConfigPerf.setBackground(new java.awt.Color(65, 195, 228));
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
        btnConfigPerf.setBounds(480, 340, 390, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCrearGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCrearGrupoActionPerformed

        Registro Reg = new Registro();
        Reg.setVisible(true);
        Reg.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose(); // oculta esta ventana y abre la que estoy llamando
    }//GEN-LAST:event_bntCrearGrupoActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        System.out.println("Estadisticas");
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        System.out.println("Inicia Sesion");     
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnConfigPerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigPerfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigPerfActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCrearGrupo;
    private javax.swing.JButton btnConfigPerf;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
