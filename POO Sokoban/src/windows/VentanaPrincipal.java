
package windows;

import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal extends javax.swing.JPanel {

    public VentanaPrincipal() {
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

        jButton1 = new javax.swing.JButton();

        setInheritsPopupMenu(true);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jButton1.setBackground(new java.awt.Color(19, 207, 255));
        jButton1.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        jButton1.setText("Iniciar Session");
        jButton1.setAlignmentX(0.5F);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(454, 454, 454)
                .addComponent(jButton1)
                .addContainerGap(473, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jButton1)
                .addContainerGap(434, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
