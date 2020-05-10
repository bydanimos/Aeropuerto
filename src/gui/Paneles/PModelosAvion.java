
package gui.Paneles;

import aplicacion.aviones.ModeloAvion;
import gui.ModeloTablas.*;
import gui.VAdministrador;

public final class PModelosAvion extends javax.swing.JPanel {
    
    private final VAdministrador va;

    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public PModelosAvion(VAdministrador va) {
        this.va = va;
        initComponents();
        this.borrarBoton.setEnabled(false);
        this.mensajeError.setVisible(false);
        this.buscarModelosAvion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gestionVuelosEtiqueta = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        buscarBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaModelos = new javax.swing.JTable();
        nuevoBoton = new javax.swing.JButton();
        actualizarBoton = new javax.swing.JButton();
        borrarBoton = new javax.swing.JButton();
        cancelarBoton = new javax.swing.JButton();
        mensajeError = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(769, 431));

        gestionVuelosEtiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gestionVuelosEtiqueta.setText("<html> <h1><CENTER>Gestión de aviones</CENTER></h1> </html>");

        nombreLabel.setText("Nombre del modelo:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("<html> <CENTER>Modelos de avión</CENTER> </html>");
        jLabel2.setToolTipText("");

        buscarBoton.setText("Buscar");
        buscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotonActionPerformed(evt);
            }
        });

        tablaModelos.setModel(new ModeloTablaModelosAvion());
        tablaModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaModelosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaModelos);

        nuevoBoton.setText("Nuevo");
        nuevoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoBotonActionPerformed(evt);
            }
        });

        actualizarBoton.setText("Actualizar");
        actualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBotonActionPerformed(evt);
            }
        });

        borrarBoton.setText("Borrar");
        borrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBotonActionPerformed(evt);
            }
        });

        cancelarBoton.setText("Cancelar");
        cancelarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotonActionPerformed(evt);
            }
        });

        mensajeError.setForeground(new java.awt.Color(255, 0, 0));
        mensajeError.setText("¡Faltan datos por introducir!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(nombreLabel)
                        .addGap(18, 18, 18)
                        .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(buscarBoton)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gestionVuelosEtiqueta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(borrarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mensajeError)
                        .addGap(84, 84, 84)
                        .addComponent(actualizarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nuevoBoton)
                        .addGap(3, 3, 3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gestionVuelosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelarBoton)
                        .addComponent(borrarBoton)
                        .addComponent(actualizarBoton)
                        .addComponent(nuevoBoton))
                    .addComponent(mensajeError))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // ------------------------------------------------------------------------
    // ------------------------------- Eventos --------------------------------
    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed
        this.buscarModelosAvion();
    }//GEN-LAST:event_buscarBotonActionPerformed

    private void cancelarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotonActionPerformed
        this.va.pulsarAviones();
    }//GEN-LAST:event_cancelarBotonActionPerformed

    private void tablaModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaModelosMouseClicked
        this.comprobarBorrar();
    }//GEN-LAST:event_tablaModelosMouseClicked

    private void nuevoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBotonActionPerformed
        this.nuevoModelo();
    }//GEN-LAST:event_nuevoBotonActionPerformed

    private void borrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBotonActionPerformed
        this.borrarModelo();
    }//GEN-LAST:event_borrarBotonActionPerformed

    private void actualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBotonActionPerformed
        this.actualizarTabla();
    }//GEN-LAST:event_actualizarBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBoton;
    private javax.swing.JButton borrarBoton;
    private javax.swing.JButton buscarBoton;
    private javax.swing.JButton cancelarBoton;
    private javax.swing.JLabel gestionVuelosEtiqueta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensajeError;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreText;
    private javax.swing.JButton nuevoBoton;
    private javax.swing.JTable tablaModelos;
    // End of variables declaration//GEN-END:variables

    // ------------------------------------------------------------------------
    // ------------------------------ Funciones -------------------------------
    public void buscarModelosAvion() {
        this.mensajeError.setVisible(false);
        ModeloTablaModelosAvion m = (ModeloTablaModelosAvion) this.tablaModelos.getModel();

        m.setFilas(this.va.obtenerModelosAvion(this.nombreText.getText()));
        
        this.borrarBoton.setEnabled(false);
    }
    
    public void comprobarBorrar() {
        ModeloTablaModelosAvion m = (ModeloTablaModelosAvion) this.tablaModelos.getModel();
        ModeloAvion modeloAvion = m.obtenerModeloAvion(this.tablaModelos.getSelectedRow());
        if (modeloAvion.isEliminable()) {
            this.borrarBoton.setEnabled(true);
        } else {
            this.borrarBoton.setEnabled(false);
        }
    }
    
    public void nuevoModelo() {
        this.mensajeError.setVisible(false);
        ModeloTablaModelosAvion m = (ModeloTablaModelosAvion) this.tablaModelos.getModel();
        m.nuevoModelo();
        tablaModelos.setRowSelectionInterval(m.getRowCount() - 1, m.getRowCount() - 1);
    }
    
    public void borrarModelo() {
        this.mensajeError.setVisible(false);
        ModeloTablaModelosAvion m = (ModeloTablaModelosAvion) this.tablaModelos.getModel();
        ModeloAvion modeloAvion = m.obtenerModeloAvion(this.tablaModelos.getSelectedRow());
        m.borrarModeloAvion(this.tablaModelos.getSelectedRow());
        this.va.borrarModeloAvion(modeloAvion);
    }
    
    public void actualizarTabla() {
        ModeloTablaModelosAvion m = (ModeloTablaModelosAvion) this.tablaModelos.getModel();
        for (ModeloAvion modelo : m.getModelos()) {
            if (modelo.getNombre() == null || modelo.getCapacidadNormal() < 0 || modelo.getCapacidadPremium() < 0 ||
                    modelo.getConsumo() < 0 || modelo.getEmpresaFabricante() == null) {
                this.mensajeError.setText("¡Faltan datos por introducir!");
                this.mensajeError.setVisible(true);
                break;
            } else {
                if (!this.va.actualizarModelosAvion(m.getModelos())) {
                    this.mensajeError.setText("¡Se ha producido un error!");
                    this.mensajeError.setVisible(true);
                }
            }
        }
    }

}
