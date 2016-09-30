
package Windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        
        setResizable(false);    // no poder cambiar tamano a la ventana
        setSize(1280,720);      // tamano
        setLocationRelativeTo(null);    // posicionar ventana en centro
        setTitle("Menu Principal");   // poner titulo a ventana
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntRegistrarse = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bntRegistrarse.setBackground(new java.awt.Color(65, 195, 228));
        bntRegistrarse.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        bntRegistrarse.setText("Registrarse");
        bntRegistrarse.setAlignmentX(0.5F);
        bntRegistrarse.setBorder(null);
        bntRegistrarse.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bntRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(bntRegistrarse);
        bntRegistrarse.setBounds(530, 220, 257, 50);

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
        btnEstadisticas.setBounds(490, 270, 361, 50);

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
        btnSalir.setBounds(610, 320, 109, 50);

        btnIniciarSesion.setBackground(new java.awt.Color(65, 195, 228));
        btnIniciarSesion.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnIniciarSesion.setText("Iniciar Session");
        btnIniciarSesion.setAlignmentX(0.5F);
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion);
        btnIniciarSesion.setBounds(500, 170, 321, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegistrarseActionPerformed

        Registro Reg = new Registro();
        Reg.setVisible(true);
        Reg.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose(); // oculta esta ventana y abre la que estoy llamando
    }//GEN-LAST:event_bntRegistrarseActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        System.out.println("Estadisticas");
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        System.out.println("Inicia Sesion");     
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRegistrarse;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
