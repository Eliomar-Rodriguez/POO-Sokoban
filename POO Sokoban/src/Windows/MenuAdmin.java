
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
        btnCrearRegla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        btnCrearNivel.setBounds(500, 180, 260, 50);

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
        btnSalir.setBounds(580, 330, 109, 50);

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
        btnEstadisticas.setBounds(450, 280, 361, 50);

        btnCrearRegla.setBackground(new java.awt.Color(65, 195, 228));
        btnCrearRegla.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnCrearRegla.setText("Reglas");
        btnCrearRegla.setAlignmentX(0.5F);
        btnCrearRegla.setBorder(null);
        btnCrearRegla.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnCrearRegla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearReglaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearRegla);
        btnCrearRegla.setBounds(550, 230, 170, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNivelActionPerformed
        System.out.println("Estadisticas");
    }//GEN-LAST:event_btnCrearNivelActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnCrearReglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearReglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearReglaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearNivel;
    private javax.swing.JButton btnCrearRegla;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
