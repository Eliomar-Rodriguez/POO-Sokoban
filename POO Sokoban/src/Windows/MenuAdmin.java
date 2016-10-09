
package Windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MenuAdmin extends javax.swing.JFrame {

    public MenuAdmin() {
        initComponents();
        
        setResizable(false);    // no poder cambiar tamano a la ventana
        setSize(1280,720);      // tamano
        setLocationRelativeTo(null);    // posicionar ventana en centro
        setTitle("Menu Principal");   // poner titulo a ventana
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearNivel = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnCrearRegla1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnCrearNivel.setBackground(new java.awt.Color(65, 195, 228));
        btnCrearNivel.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnCrearNivel.setText("Crear nivel");
        btnCrearNivel.setAlignmentX(0.5F);
        btnCrearNivel.setBorder(null);
        btnCrearNivel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnCrearNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNivelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearNivel);
        btnCrearNivel.setBounds(500, 160, 260, 50);

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
        btnSalir.setBounds(580, 360, 108, 50);

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
        btnEstadisticas.setBounds(450, 260, 360, 50);

        btnReporte.setBackground(new java.awt.Color(65, 195, 228));
        btnReporte.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnReporte.setText("Reportes");
        btnReporte.setAlignmentX(0.5F);
        btnReporte.setBorder(null);
        btnReporte.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporte);
        btnReporte.setBounds(530, 310, 210, 50);

        btnCrearRegla1.setBackground(new java.awt.Color(65, 195, 228));
        btnCrearRegla1.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnCrearRegla1.setText("Reglas");
        btnCrearRegla1.setAlignmentX(0.5F);
        btnCrearRegla1.setBorder(null);
        btnCrearRegla1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnCrearRegla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRegla1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearRegla1);
        btnCrearRegla1.setBounds(550, 210, 170, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNivelActionPerformed
        CrearNivel nivel = new CrearNivel();
        nivel.setVisible(true);
        nivel.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnCrearNivelActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LogIn inicio = new LogIn();
        inicio.setVisible(true);
        inicio.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        Reportes5mejoresentodo es = new Reportes5mejoresentodo();
        es.setVisible(true);
        es.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        Reportes es = new Reportes();
        es.setVisible(true);
        es.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnCrearRegla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRegla1ActionPerformed
        Reglamento re = new Reglamento();
        re.setVisible(true);
        re.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnCrearRegla1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearNivel;
    private javax.swing.JButton btnCrearRegla1;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
