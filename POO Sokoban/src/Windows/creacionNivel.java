/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

/**
 *
 * @author Antonio Rodriguez
 */
public class creacionNivel extends javax.swing.JFrame {

    /**
     * Creates new form creacionNivel
     */
    public creacionNivel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCaja = new javax.swing.JButton();
        btnPared = new javax.swing.JButton();
        btnPersonaje = new javax.swing.JButton();
        btnCajaRoja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

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
        btnCaja.setBounds(1080, 210, 70, 70);

        btnPared.setBackground(new java.awt.Color(65, 195, 228));
        btnPared.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnPared.setAlignmentX(0.5F);
        btnPared.setBorder(null);
        btnPared.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnPared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParedActionPerformed(evt);
            }
        });
        getContentPane().add(btnPared);
        btnPared.setBounds(1171, 328, 70, 70);

        btnPersonaje.setBackground(new java.awt.Color(65, 195, 228));
        btnPersonaje.setFont(new java.awt.Font("Minecrafter Alt", 0, 36)); // NOI18N
        btnPersonaje.setAlignmentX(0.5F);
        btnPersonaje.setBorder(null);
        btnPersonaje.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonajeActionPerformed(evt);
            }
        });
        getContentPane().add(btnPersonaje);
        btnPersonaje.setBounds(1171, 398, 80, 70);

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
        btnCajaRoja.setBounds(1170, 210, 70, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCajaActionPerformed

    private void btnParedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParedActionPerformed

    }//GEN-LAST:event_btnParedActionPerformed

    private void btnPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPersonajeActionPerformed

    private void btnCajaRojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaRojaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCajaRojaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(creacionNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(creacionNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(creacionNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(creacionNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new creacionNivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaja;
    private javax.swing.JButton btnCajaRoja;
    private javax.swing.JButton btnPared;
    private javax.swing.JButton btnPersonaje;
    // End of variables declaration//GEN-END:variables
}
