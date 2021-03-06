
package gui.Paneles;

import gui.VAdministrador;


public final class PPrincipal extends javax.swing.JPanel {

    private final VAdministrador va;
    
    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public PPrincipal(VAdministrador va) {
        this.va = va;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonVuelos = new javax.swing.JButton();
        BotonTiendas = new javax.swing.JButton();
        BotonUsuarios = new javax.swing.JButton();
        BotonAviones = new javax.swing.JButton();
        BotonAerolineas = new javax.swing.JButton();
        BotonCoches = new javax.swing.JButton();
        BotonPersonalLaboral = new javax.swing.JButton();
        BotonEstadisticas = new javax.swing.JButton();

        BotonVuelos.setText("Vuelos");
        BotonVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVuelosActionPerformed(evt);
            }
        });

        BotonTiendas.setText("Tiendas");
        BotonTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTiendasActionPerformed(evt);
            }
        });

        BotonUsuarios.setText("Usuarios");
        BotonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsuariosActionPerformed(evt);
            }
        });

        BotonAviones.setText("Aviones");
        BotonAviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAvionesActionPerformed(evt);
            }
        });

        BotonAerolineas.setText("Aerolineas");
        BotonAerolineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAerolineasActionPerformed(evt);
            }
        });

        BotonCoches.setText("Coches");
        BotonCoches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCochesActionPerformed(evt);
            }
        });

        BotonPersonalLaboral.setText("Personal Laboral");
        BotonPersonalLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPersonalLaboralActionPerformed(evt);
            }
        });

        BotonEstadisticas.setText("Estadísticas");
        BotonEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(BotonAviones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonPersonalLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTiendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAerolineas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAerolineas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAviones, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonPersonalLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // ------------------------------------------------------------------------
    // ------------------------------- Eventos --------------------------------
    private void BotonAvionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAvionesActionPerformed
        this.va.pulsarAviones();
    }//GEN-LAST:event_BotonAvionesActionPerformed

    private void BotonPersonalLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPersonalLaboralActionPerformed
        this.va.pulsarPersonalLaboral();
    }//GEN-LAST:event_BotonPersonalLaboralActionPerformed

    private void BotonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuariosActionPerformed
        // TODO add your handling code here:
        this.va.pulsarUsuarios();
    }//GEN-LAST:event_BotonUsuariosActionPerformed

    private void BotonVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVuelosActionPerformed
        this.va.pulsarVuelos();
    }//GEN-LAST:event_BotonVuelosActionPerformed

    private void BotonTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTiendasActionPerformed
        this.va.pulsarTiendas();
    }//GEN-LAST:event_BotonTiendasActionPerformed

    private void BotonAerolineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAerolineasActionPerformed
        // TODO add your handling code here:
        this.va.pulsarAerolineas();
    }//GEN-LAST:event_BotonAerolineasActionPerformed

    private void BotonCochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCochesActionPerformed
        this.va.pulsarCoches();
    }//GEN-LAST:event_BotonCochesActionPerformed
    private void BotonEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEstadisticasActionPerformed
        this.va.pulsarEstadisticas();
    }//GEN-LAST:event_BotonEstadisticasActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAerolineas;
    private javax.swing.JButton BotonAviones;
    private javax.swing.JButton BotonCoches;
    private javax.swing.JButton BotonEstadisticas;
    private javax.swing.JButton BotonPersonalLaboral;
    private javax.swing.JButton BotonTiendas;
    private javax.swing.JButton BotonUsuarios;
    private javax.swing.JButton BotonVuelos;
    // End of variables declaration//GEN-END:variables
}
