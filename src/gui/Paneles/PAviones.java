
package gui.Paneles;

import aplicacion.aviones.Avion;
import gui.ModeloTablas.ModeloTablaAviones2;
import gui.VAdministrador;

public final class PAviones extends javax.swing.JPanel {
    
    private final VAdministrador va;

    // -------------------------------------------------------------------------
    // ------------------------------- Constructor -----------------------------
    public PAviones(VAdministrador va) {
        this.va = va;
        initComponents();
        this.buscarAviones();
        this.mensajeError.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gestionVuelosEtiqueta = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        codigoText = new javax.swing.JTextField();
        aerolineaLabel = new javax.swing.JLabel();
        aerolineaText = new javax.swing.JTextField();
        ScrollPanel = new javax.swing.JScrollPane();
        tablaAviones = new javax.swing.JTable();
        buscarBoton = new javax.swing.JButton();
        añadirBoton = new javax.swing.JButton();
        actualizarBoton = new javax.swing.JButton();
        verModelosBoton = new javax.swing.JButton();
        mensajeError = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(1, 0), new java.awt.Dimension(1, 0), new java.awt.Dimension(1, 32767));

        gestionVuelosEtiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gestionVuelosEtiqueta.setText("<html> <h1><CENTER>Gestión de aviones</CENTER></h1> </html>");

        codigoLabel.setText("Código:");

        aerolineaLabel.setText("Aerolínea:");

        tablaAviones.setModel(new ModeloTablaAviones2());
        ScrollPanel.setViewportView(tablaAviones);

        buscarBoton.setText("Buscar");
        buscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotonActionPerformed(evt);
            }
        });

        añadirBoton.setText("Añadir");
        añadirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirBotonActionPerformed(evt);
            }
        });

        actualizarBoton.setText("Actualizar");
        actualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBotonActionPerformed(evt);
            }
        });

        verModelosBoton.setText("Ver modelos");
        verModelosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verModelosBotonActionPerformed(evt);
            }
        });

        mensajeError.setForeground(new java.awt.Color(255, 0, 0));
        mensajeError.setText("¡Error modificando los datos del avión, aerolínea no existente!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(verModelosBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actualizarBoton)
                        .addGap(18, 18, 18)
                        .addComponent(añadirBoton)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ScrollPanel)
                            .addComponent(gestionVuelosEtiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(codigoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aerolineaLabel)
                                .addGap(37, 37, 37)
                                .addComponent(aerolineaText, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buscarBoton)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mensajeError)
                        .addGap(191, 191, 191))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gestionVuelosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel)
                    .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aerolineaLabel)
                    .addComponent(aerolineaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mensajeError)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarBoton)
                    .addComponent(añadirBoton)
                    .addComponent(verModelosBoton))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    // -------------------------------------------------------------------------
    // --------------------------------- Eventos -------------------------------
    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed
        this.buscarAviones();
    }//GEN-LAST:event_buscarBotonActionPerformed

    private void actualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBotonActionPerformed
        this.actualizarAviones();
    }//GEN-LAST:event_actualizarBotonActionPerformed

    private void añadirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirBotonActionPerformed
        this.pulsarAñadirAvion();
    }//GEN-LAST:event_añadirBotonActionPerformed

    private void verModelosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verModelosBotonActionPerformed
        this.pulsarVerModelos();
    }//GEN-LAST:event_verModelosBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JButton actualizarBoton;
    private javax.swing.JLabel aerolineaLabel;
    private javax.swing.JTextField aerolineaText;
    private javax.swing.JButton añadirBoton;
    private javax.swing.JButton buscarBoton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoText;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel gestionVuelosEtiqueta;
    private javax.swing.JLabel mensajeError;
    private javax.swing.JTable tablaAviones;
    private javax.swing.JButton verModelosBoton;
    // End of variables declaration//GEN-END:variables

    // -------------------------------------------------------------------------
    // -------------------------------- Funciones ------------------------------
    private final void buscarAviones() {
        this.mensajeError.setVisible(false);
        ModeloTablaAviones2 m = (ModeloTablaAviones2) this.tablaAviones.getModel();
        
        m.setFilas(this.va.obtenerAviones(this.codigoText.getText(), 
                                          this.aerolineaText.getText(), 2));
    }
    
    private final void actualizarAviones() {
        this.mensajeError.setVisible(false);
        ModeloTablaAviones2 m = (ModeloTablaAviones2) this.tablaAviones.getModel();
        boolean resultado = this.va.actualizarAviones(m.getFilas());
        this.buscarAviones();
        if (!resultado) {
            this.mensajeError.setVisible(true);
        }
    }
    
    private final void pulsarAñadirAvion() {
        this.va.pulsarAñadirAvion();
    }
    
    private final void pulsarVerModelos() {
        this.va.pulsarVerModelos();
    }
}


