
package gui.Paneles;

import gui.ModeloTablas.ModeloTablaAerolineas;
import aplicacion.aviones.Aerolinea;
import gui.VAdministrador;
import java.util.ArrayList;
import java.util.List;


public final class PAerolineas extends javax.swing.JPanel {

    private final VAdministrador va;
    private List<Aerolinea> aerolineasBorradas;
    
    // -------------------------------------------------------------------------
    // ------------------------------ Constructor ------------------------------
    public PAerolineas(VAdministrador va) {
        this.va = va;
        initComponents();
        this.buscarAerolineas();
        this.aerolineasBorradas = new ArrayList<>();
        this.PPAerolineas.setVisible(true);
        this.PEditarAerolineas.setVisible(false);
        this.errorCompleto.setVisible(false);
        this.errorNombre.setVisible(false);
        this.errorNoBorrable.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PPAerolineas = new javax.swing.JPanel();
        botonActualizar = new javax.swing.JButton();
        botonAnhadir = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAerolineas = new javax.swing.JTable();
        botonBuscar = new javax.swing.JButton();
        txtNombreAerolinea = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        errorNoBorrable = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PEditarAerolineas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEditarNombre = new javax.swing.JTextField();
        txtEditarPais = new javax.swing.JTextField();
        txtEditarPrecio = new javax.swing.JTextField();
        txtEditarPeso = new javax.swing.JTextField();
        botonEditarAnhadir = new javax.swing.JButton();
        botonEditarCancelar = new javax.swing.JButton();
        errorCompleto = new javax.swing.JLabel();
        errorNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        botonActualizar.setText("Actualizar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        botonAnhadir.setText("Añadir");
        botonAnhadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnhadirActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        tablaAerolineas.setModel(new ModeloTablaAerolineas(this));
        jScrollPane1.setViewportView(tablaAerolineas);

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        errorNoBorrable.setForeground(new java.awt.Color(255, 0, 0));
        errorNoBorrable.setText("¡La aerolinea marcada no es borrable!");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel8.setText("Gestión aerolineas");

        javax.swing.GroupLayout PPAerolineasLayout = new javax.swing.GroupLayout(PPAerolineas);
        PPAerolineas.setLayout(PPAerolineasLayout);
        PPAerolineasLayout.setHorizontalGroup(
            PPAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPAerolineasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PPAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PPAerolineasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(PPAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PPAerolineasLayout.createSequentialGroup()
                                .addComponent(txtNombreAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPAerolineasLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)))
                        .addGap(49, 49, 49))
                    .addGroup(PPAerolineasLayout.createSequentialGroup()
                        .addGroup(PPAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PPAerolineasLayout.createSequentialGroup()
                                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(errorNoBorrable, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(botonAnhadir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        PPAerolineasLayout.setVerticalGroup(
            PPAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPAerolineasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PPAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(PPAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBorrar)
                    .addComponent(botonAnhadir)
                    .addComponent(botonActualizar)
                    .addComponent(errorNoBorrable))
                .addGap(30, 30, 30))
        );

        jLabel2.setText("Nombre");

        jLabel3.setText("Pais Sede");

        jLabel4.setText("Precio base maleta");

        jLabel5.setText("Peso base maleta");

        txtEditarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        botonEditarAnhadir.setText("Añadir");
        botonEditarAnhadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarAnhadirActionPerformed(evt);
            }
        });

        botonEditarCancelar.setText("Cancelar");

        errorCompleto.setForeground(new java.awt.Color(255, 0, 0));
        errorCompleto.setText("¡ No puede haber huecos vacíos !");

        errorNombre.setForeground(new java.awt.Color(255, 0, 0));
        errorNombre.setText("¡El nombre de la aerolinea ya existe!");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setText("Añadir aerolinea");

        jLabel7.setForeground(new java.awt.Color(125, 125, 125));
        jLabel7.setText("Todos los campos son obligatorios");

        javax.swing.GroupLayout PEditarAerolineasLayout = new javax.swing.GroupLayout(PEditarAerolineas);
        PEditarAerolineas.setLayout(PEditarAerolineasLayout);
        PEditarAerolineasLayout.setHorizontalGroup(
            PEditarAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEditarAerolineasLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(PEditarAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PEditarAerolineasLayout.createSequentialGroup()
                        .addGroup(PEditarAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PEditarAerolineasLayout.createSequentialGroup()
                                .addGroup(PEditarAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PEditarAerolineasLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PEditarAerolineasLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEditarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PEditarAerolineasLayout.createSequentialGroup()
                                .addComponent(botonEditarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(274, 274, 274)))
                        .addGap(57, 57, 57)
                        .addGroup(PEditarAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEditarAnhadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PEditarAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PEditarAerolineasLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEditarPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PEditarAerolineasLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEditarPais, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PEditarAerolineasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(PEditarAerolineasLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(PEditarAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(PEditarAerolineasLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(errorCompleto)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PEditarAerolineasLayout.setVerticalGroup(
            PEditarAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PEditarAerolineasLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(PEditarAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtEditarPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(PEditarAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEditarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditarPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorNombre)
                .addGap(13, 13, 13)
                .addComponent(errorCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PEditarAerolineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEditarCancelar)
                    .addComponent(botonEditarAnhadir))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(PPAerolineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PEditarAerolineas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PPAerolineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PEditarAerolineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // -------------------------------------------------------------------------
    // -------------------------------- Eventos --------------------------------
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        this.buscarAerolineas();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonAnhadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnhadirActionPerformed
        this.anhadirAerolinea();
    }//GEN-LAST:event_botonAnhadirActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        this.actualizarInfo();
        this.buscarAerolineas();
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        this.borrarAerolinea();
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonEditarAnhadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarAnhadirActionPerformed
      this.errorCompleto.setVisible(false);
      this.errorNombre.setVisible(false);
      if (this.comprobarCompleto()) {
        if (this.comprobarNombre()) {
            this.anhadirNuevaAerolinea();
            this.PEditarAerolineas.setVisible(false);
            this.PPAerolineas.setVisible(true);
            this.buscarAerolineas();
        } else {
            this.errorNombre.setVisible(true);
        }
      } else {
          this.errorCompleto.setVisible(true);
      }
    }//GEN-LAST:event_botonEditarAnhadirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PEditarAerolineas;
    private javax.swing.JPanel PPAerolineas;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAnhadir;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEditarAnhadir;
    private javax.swing.JButton botonEditarCancelar;
    private javax.swing.JLabel errorCompleto;
    private javax.swing.JLabel errorNoBorrable;
    private javax.swing.JLabel errorNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAerolineas;
    private javax.swing.JTextField txtEditarNombre;
    private javax.swing.JTextField txtEditarPais;
    private javax.swing.JTextField txtEditarPeso;
    private javax.swing.JTextField txtEditarPrecio;
    private javax.swing.JTextField txtNombreAerolinea;
    // End of variables declaration//GEN-END:variables

    // -------------------------------------------------------------------------
    // ------------------------------- Funciones -------------------------------
    private void buscarAerolineas() {
        ModeloTablaAerolineas m;
        m = (ModeloTablaAerolineas) this.tablaAerolineas.getModel();
        m.setFilas(this.va.obtenerAerolineas(this.txtNombreAerolinea.getText()));
        if (m.getRowCount() > 0) {
            this.tablaAerolineas.setRowSelectionInterval(0, 0);
            this.botonBorrar.setEnabled(true);
        } else {
            this.botonBorrar.setEnabled(false);
        }
    }
    
    private void anhadirAerolinea() {
        this.PPAerolineas.setVisible(false);
        this.PEditarAerolineas.setVisible(true);
    }
    
    private boolean comprobarCompleto() {
        return !(this.txtEditarNombre.getText().equals("") || 
                this.txtEditarPais.getText().equals("") || 
                this.txtEditarPeso.getText().equals("") || 
                this.txtEditarPrecio.getText().equals(""));
    }
    
    private boolean comprobarNombre() {
        return this.va.getAerolinea(this.txtEditarNombre.getText()) == null;
    }
    
    private void anhadirNuevaAerolinea() {
        float precio = 0;
        try {
            precio = Float.parseFloat(this.txtEditarPrecio.getText());
        } catch (NumberFormatException e) {
            precio = 0;
        }
        Aerolinea aerolinea;
        aerolinea = new Aerolinea(this.txtEditarNombre.getText(), 
                                  this.txtEditarPais.getText(), precio, precio);
        this.va.anhadirAerolinea(aerolinea);
    }
    
    private void borrarAerolinea() { 
        this.errorNoBorrable.setVisible(false);
        Aerolinea a;
        ModeloTablaAerolineas m;
        m = (ModeloTablaAerolineas) this.tablaAerolineas.getModel();
        a = m.obtenerAerolinea(this.tablaAerolineas.getSelectedRow());
        if (this.va.esAerolineaBorrable(a)) {
            this.aerolineasBorradas.add(m.obtenerAerolinea(this.tablaAerolineas.getSelectedRow()));
            m.borrarAerolinea(this.tablaAerolineas.getSelectedRow());
            if (m.getRowCount() == 0) {
                this.botonBorrar.setEnabled(false);
            } else {
                this.tablaAerolineas.setRowSelectionInterval(0, 0);
            }
        } else {
            this.errorNoBorrable.setVisible(true);
        }
    }
    
    private void actualizarInfo() {
        ModeloTablaAerolineas m;
        m = (ModeloTablaAerolineas) this.tablaAerolineas.getModel();
        for (int i = 0; i < m.getRowCount(); i++) {
            this.va.modificarAerolinea(m.obtenerAerolinea(i));
        }
        if (this.aerolineasBorradas.size() > 0) {
            this.va.eliminarAerolineas(this.aerolineasBorradas);
        }
    }
}
