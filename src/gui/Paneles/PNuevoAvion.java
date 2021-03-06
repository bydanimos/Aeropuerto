
package gui.Paneles;

import gui.ModeloTablas.ModeloTablaAerolineas;
import gui.ModeloTablas.ModeloTablaAviones;
import gui.ModeloTablas.ModeloTablaModelosAvion;
import gui.VAdministrador;
import java.util.Calendar;

public final class PNuevoAvion extends javax.swing.JPanel {

    private final VAdministrador va;

    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public PNuevoAvion(VAdministrador va) {
        this.va  = va;
        initComponents();
        this.buscarAerolineas();
        this.buscarModelosAvion();
        this.aerolineaText.setEditable(false);
        this.modeloText.setEditable(false);
        this.mensajeError.setVisible(false);
        Calendar cal = Calendar.getInstance();
        this.añoChooser.setEndYear(cal.get(Calendar.YEAR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gestionVuelosEtiqueta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAerolineas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaModelos = new javax.swing.JTable();
        añoLabel = new javax.swing.JLabel();
        añoChooser = new com.toedter.calendar.JYearChooser();
        aerolineaLabel = new javax.swing.JLabel();
        aerolineaText = new javax.swing.JTextField();
        modeloLabel = new javax.swing.JLabel();
        modeloText = new javax.swing.JTextField();
        añadirBoton = new javax.swing.JButton();
        cancelarBoton = new javax.swing.JButton();
        mensajeError = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        codigoText = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(769, 431));

        gestionVuelosEtiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gestionVuelosEtiqueta.setText("<html> <h1><CENTER>Gestión de aviones</CENTER></h1> </html>");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("<html> <CENTER>Buscar modelos de avión</CENTER> </html>");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("<html> <CENTER>Buscar aerolíneas</CENTER> </html>");
        jLabel2.setToolTipText("");

        tablaAerolineas.setModel(new ModeloTablaAerolineas());
        tablaAerolineas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAerolineasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAerolineas);

        tablaModelos.setModel(new ModeloTablaModelosAvion());
        tablaModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaModelosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaModelos);

        añoLabel.setText("Año de fabricación:");

        aerolineaLabel.setText("Nombre de la aerolínea:");

        modeloLabel.setText("Nombre del modelo:");

        añadirBoton.setText("Añadir");
        añadirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirBotonActionPerformed(evt);
            }
        });

        cancelarBoton.setText("Cancelar");
        cancelarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotonActionPerformed(evt);
            }
        });

        mensajeError.setForeground(new java.awt.Color(255, 0, 0));
        mensajeError.setText("¡Debes introducir todos los datos!");

        codigoLabel.setText("Código del avión:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gestionVuelosEtiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelarBoton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(añadirBoton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aerolineaLabel)
                                    .addComponent(codigoLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(aerolineaText, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(codigoText))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modeloLabel)
                                    .addComponent(añoLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(añoChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(modeloText, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(mensajeError)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gestionVuelosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(mensajeError)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeloText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modeloLabel)
                    .addComponent(aerolineaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aerolineaLabel))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(añoChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(añadirBoton)
                            .addComponent(cancelarBoton)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(añoLabel)
                        .addComponent(codigoLabel)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // ------------------------------------------------------------------------
    // ------------------------------- Eventos --------------------------------
    private void añadirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirBotonActionPerformed
        this.añadirAvion();
    }//GEN-LAST:event_añadirBotonActionPerformed

    private void tablaAerolineasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAerolineasMouseClicked
        this.rellenarAerolinea();
    }//GEN-LAST:event_tablaAerolineasMouseClicked

    private void tablaModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaModelosMouseClicked
        this.rellenarModeloAvion();
    }//GEN-LAST:event_tablaModelosMouseClicked

    private void cancelarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotonActionPerformed
        this.va.pulsarAviones();
    }//GEN-LAST:event_cancelarBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aerolineaLabel;
    private javax.swing.JTextField aerolineaText;
    private javax.swing.JButton añadirBoton;
    private com.toedter.calendar.JYearChooser añoChooser;
    private javax.swing.JLabel añoLabel;
    private javax.swing.JButton cancelarBoton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoText;
    private javax.swing.JLabel gestionVuelosEtiqueta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mensajeError;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JTextField modeloText;
    private javax.swing.JTable tablaAerolineas;
    private javax.swing.JTable tablaModelos;
    // End of variables declaration//GEN-END:variables

    // ------------------------------------------------------------------------
    // ------------------------------ Funciones -------------------------------
    public void buscarAerolineas() {
        this.mensajeError.setVisible(false);
        ModeloTablaAerolineas m = (ModeloTablaAerolineas) this.tablaAerolineas.getModel();

        m.setFilas(this.va.obtenerAerolineas(""));
    }

    public void buscarModelosAvion() {
        this.mensajeError.setVisible(false);
        ModeloTablaModelosAvion m = (ModeloTablaModelosAvion) this.tablaModelos.getModel();

        m.setFilas(this.va.obtenerModelosAvion(""));
    }

    public void rellenarAerolinea() {
        this.mensajeError.setVisible(false);
        ModeloTablaAerolineas m = (ModeloTablaAerolineas) this.tablaAerolineas.getModel();
        this.aerolineaText.setText(m.obtenerAerolinea(this.tablaAerolineas.getSelectedRow()).getNombre());
    }

    public void rellenarModeloAvion() {
        this.mensajeError.setVisible(false);
        ModeloTablaModelosAvion m = (ModeloTablaModelosAvion) this.tablaModelos.getModel();
        this.modeloText.setText(m.obtenerModeloAvion(this.tablaModelos.getSelectedRow()).getNombre());
    }

    public void añadirAvion() {
        ModeloTablaAerolineas ma = (ModeloTablaAerolineas) this.tablaAerolineas.getModel();
        ModeloTablaModelosAvion mm = (ModeloTablaModelosAvion) this.tablaModelos.getModel();
        if (!this.aerolineaText.getText().equals("") && !this.modeloText.getText().equals("") && 
            !this.codigoText.getText().equals("")) {
            
            if (this.va.añadirAvion(this.codigoText.getText(), ma.obtenerAerolinea(this.tablaAerolineas.getSelectedRow()),
                                    mm.obtenerModeloAvion(this.tablaModelos.getSelectedRow()), this.añoChooser.getYear())) {
                
                this.va.pulsarAviones();
            } else {
                this.mensajeError.setText("¡El código introducido ya pertenece a un avión existente!");
                this.mensajeError.setVisible(true);
            }
        } else {
            this.mensajeError.setText("¡Debes introducir todos los datos!");
            this.mensajeError.setVisible(true);
        }
    }

}
