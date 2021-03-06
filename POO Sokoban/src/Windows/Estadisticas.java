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
public class Estadisticas extends javax.swing.JFrame {

    /**
     * Creates new form Estadisticas
     */
    public Estadisticas() {
        initComponents();
        setResizable(false);
        txtNivel.setVisible(false);
        jLabel2.setVisible(false);
        txtIdJug.setVisible(false);
        jLabel1.setVisible(false);
        btnMostrar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbEstadisticas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        panelEstadisticas = new javax.swing.JPanel();
        txtIdJug = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNivel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        cmbEstadisticas.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        cmbEstadisticas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estadisticas de un usuario", "Historial de un jugador", "Todos los usuarios que han superado un nivel" }));
        cmbEstadisticas.setSelectedIndex(-1);
        cmbEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(cmbEstadisticas);
        cmbEstadisticas.setBounds(290, 200, 750, 40);

        jLabel1.setFont(new java.awt.Font("Minecrafter", 1, 24)); // NOI18N
        jLabel1.setText("Cedula del jugador");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 270, 310, 40);

        javax.swing.GroupLayout panelEstadisticasLayout = new javax.swing.GroupLayout(panelEstadisticas);
        panelEstadisticas.setLayout(panelEstadisticasLayout);
        panelEstadisticasLayout.setHorizontalGroup(
            panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        panelEstadisticasLayout.setVerticalGroup(
            panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        getContentPane().add(panelEstadisticas);
        panelEstadisticas.setBounds(290, 340, 730, 220);

        txtIdJug.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        getContentPane().add(txtIdJug);
        txtIdJug.setBounds(600, 270, 180, 38);

        btnMostrar.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        btnMostrar.setText("Mostrar");
        getContentPane().add(btnMostrar);
        btnMostrar.setBounds(790, 270, 170, 40);

        jLabel2.setFont(new java.awt.Font("Minecrafter", 1, 24)); // NOI18N
        jLabel2.setText("Numero de nivel");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 270, 320, 40);

        txtNivel.setFont(new java.awt.Font("Minecrafter", 0, 24)); // NOI18N
        getContentPane().add(txtNivel);
        txtNivel.setBounds(600, 270, 180, 40);

        jLabel4.setFont(new java.awt.Font("Minecrafter", 1, 24)); // NOI18N
        jLabel4.setText("seleccione una opcion");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 150, 490, 40);

        btnAtras.setFont(new java.awt.Font("Minecrafter Alt", 0, 24)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras);
        btnAtras.setBounds(0, 0, 120, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/estadisticas.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -10, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadisticasActionPerformed
        if (cmbEstadisticas.getSelectedIndex()==0 | cmbEstadisticas.getSelectedIndex()==1){
            txtNivel.setVisible(false);
            jLabel2.setVisible(false);
            txtIdJug.setVisible(true);
            jLabel1.setVisible(true);
            btnMostrar.setVisible(true);
        }
            
        else if (cmbEstadisticas.getSelectedIndex()==2){
            txtNivel.setVisible(true);
            jLabel2.setVisible(true);
            txtIdJug.setVisible(false);
            jLabel1.setVisible(false);
            btnMostrar.setVisible(true);
        }                  
                   
    }//GEN-LAST:event_cmbEstadisticasActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        MenuAdmin inicio = new MenuAdmin();
        inicio.setVisible(true);
        inicio.setDefaultCloseOperation(HIDE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> cmbEstadisticas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelEstadisticas;
    private javax.swing.JTextField txtIdJug;
    private javax.swing.JTextField txtNivel;
    // End of variables declaration//GEN-END:variables
}
