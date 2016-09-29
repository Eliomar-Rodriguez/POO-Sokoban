
package windows;

import java.awt.*;
import javax.swing.*;
public class VentanaInicio extends javax.swing.JPanel {

    public VentanaInicio() {
        initComponents();
        this.setSize(1280,720);
        
    }
    @Override
    public void paintComponent(Graphics g)
    {
        Dimension tam = getSize();
        ImageIcon ImageFondo = new ImageIcon(new ImageIcon(getClass().getResource("/Images/MainImage.jpg")).getImage());
        g.drawImage(ImageFondo.getImage(), 0,0 , 1280,720,null);
        setOpaque(false);  
        super.paintComponents(g);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntRegistrar = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setInheritsPopupMenu(true);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        bntRegistrar.setBackground(new java.awt.Color(65, 195, 228));
        bntRegistrar.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        bntRegistrar.setText("Registrarse");
        bntRegistrar.setAlignmentX(0.5F);
        bntRegistrar.setBorder(null);
        bntRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bntRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRegistrarActionPerformed(evt);
            }
        });

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

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIniciarSesion)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bntRegistrar)
                        .addGap(54, 54, 54))
                    .addComponent(btnEstadisticas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(135, 135, 135)))
                .addContainerGap(462, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(512, 512, 512))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstadisticas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(369, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bntRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegistrarActionPerformed

        Registro Reg = new Registro();
        Reg.setVisible(true);
        
        //this.pack();
// TODO add your handling code here:
    }//GEN-LAST:event_bntRegistrarActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        // TODO add your handling code here:
        System.out.println("Estadisticas");
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    System.exit(1);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        System.out.println("Inicia Sesion");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRegistrar;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
