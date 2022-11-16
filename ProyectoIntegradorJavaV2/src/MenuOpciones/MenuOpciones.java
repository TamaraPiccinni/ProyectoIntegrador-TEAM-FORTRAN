
package MenuOpciones;

import InterfasGrafica.BuscarPersonal;
import InterfasGrafica.Condicion;
import InterfasGrafica.Estadistica;
import InterfasGrafica.IngresoDatos;
import InterfasGrafica.ListarPersonal;

public class MenuOpciones extends javax.swing.JFrame {

    public MenuOpciones() {
        initComponents();
        this.setTitle("MENU OPCIONES");
        this.setSize(300, 500);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
        btn_condicion = new javax.swing.JButton();
        btn_estadistica = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELIJA UNA OPCION");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 40, 170, 50);

        btn_registrar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar.setText("Registro Persona ");
        btn_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrarMouseClicked(evt);
            }
        });
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar);
        btn_registrar.setBounds(70, 120, 130, 30);

        btn_buscar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setText("Buscar Personal");
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_buscar);
        btn_buscar.setBounds(70, 160, 130, 28);

        btn_listar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_listar.setForeground(new java.awt.Color(0, 0, 0));
        btn_listar.setText("Lista de Registro");
        btn_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_listar);
        btn_listar.setBounds(70, 200, 130, 28);

        btn_condicion.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_condicion.setForeground(new java.awt.Color(0, 0, 0));
        btn_condicion.setText("Condición Personal");
        btn_condicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_condicionMouseClicked(evt);
            }
        });
        jPanel1.add(btn_condicion);
        btn_condicion.setBounds(70, 250, 140, 28);

        btn_estadistica.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_estadistica.setForeground(new java.awt.Color(0, 0, 0));
        btn_estadistica.setText("Estadista de Sueldos ");
        btn_estadistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_estadisticaMouseClicked(evt);
            }
        });
        jPanel1.add(btn_estadistica);
        btn_estadistica.setBounds(70, 290, 150, 28);

        btn_salir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("Salir");
        jPanel1.add(btn_salir);
        btn_salir.setBounds(100, 370, 73, 28);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseClicked
      IngresoDatos datos = new IngresoDatos();
      datos.setVisible(true);
    }//GEN-LAST:event_btn_registrarMouseClicked

    private void btn_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseClicked
        BuscarPersonal buscar = new BuscarPersonal();
        buscar.setVisible(true);
    }//GEN-LAST:event_btn_buscarMouseClicked

    private void btn_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listarMouseClicked
       ListarPersonal listar = new ListarPersonal();
       listar.setVisible(true);
    }//GEN-LAST:event_btn_listarMouseClicked

    private void btn_condicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_condicionMouseClicked
       Condicion personal = new Condicion();
       personal.setVisible(true);
    }//GEN-LAST:event_btn_condicionMouseClicked

    private void btn_estadisticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_estadisticaMouseClicked
        Estadistica sueldo = new Estadistica();
        sueldo.setVisible(true);
    }//GEN-LAST:event_btn_estadisticaMouseClicked

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOpciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_condicion;
    private javax.swing.JButton btn_estadistica;
    private javax.swing.JButton btn_listar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
