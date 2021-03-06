
package gui.Paneles;

import gui.ModeloTablas.ModeloTablaTiendas;
import aplicacion.servicios.Tienda;
import gui.VAdministrador;


public final class PTiendas extends javax.swing.JPanel {

    private final VAdministrador va;
    private boolean primNombre;
    private boolean editarGuardar;
    private boolean anhadirGuardar;

    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public PTiendas(VAdministrador va) {
        this.va  = va;
        this.primNombre = true;
        this.editarGuardar = false;
        this.anhadirGuardar = false;
        initComponents();
        this.borrarExiLabel.setVisible(false);
        this.anhaExitoLabel.setVisible(false);
        this.errorCodigoLabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tiendasLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        terminalLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        terminalComboBox = new javax.swing.JComboBox<>();
        buscarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tiendasTable = new javax.swing.JTable();
        codigoLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        tipoLabel = new javax.swing.JLabel();
        tipoTextField = new javax.swing.JTextField();
        borrarButton = new javax.swing.JButton();
        anhadirButton = new javax.swing.JButton();
        borrarExiLabel = new javax.swing.JLabel();
        anhaExitoLabel = new javax.swing.JLabel();
        vacCamposButton = new javax.swing.JButton();
        errorCodigoLabel = new javax.swing.JLabel();
        editarGuardarButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(813, 385));

        tiendasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiendasLabel.setText("<html>\n<h1><CENTER>Tiendas</CENTER></h1>\n</html>");

        nombreLabel.setText("Nombre: ");

        terminalLabel.setText("Terminal: ");

        nombreTextField.setText("ETSEshop");
        nombreTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreTextFieldMouseClicked(evt);
            }
        });
        nombreTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreTextFieldKeyPressed(evt);
            }
        });

        terminalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoger", "T1", "T2", "T3" }));

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        tiendasTable.setModel(new ModeloTablaTiendas());
        tiendasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiendasTableMouseClicked(evt);
            }
        });
        tiendasTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tiendasTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tiendasTable);

        codigoLabel.setText("Código: ");

        tipoLabel.setText("Tipo: ");

        borrarButton.setText("Borrar");
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });

        anhadirButton.setText("Añadir");
        anhadirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anhadirButtonActionPerformed(evt);
            }
        });

        borrarExiLabel.setForeground(new java.awt.Color(33, 220, 23));
        borrarExiLabel.setText("Tienda borrada con éxito!");

        anhaExitoLabel.setForeground(new java.awt.Color(33, 220, 23));
        anhaExitoLabel.setText("¡Tienda añadida con éxito!");

        vacCamposButton.setText("Vaciar Campos");
        vacCamposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacCamposButtonActionPerformed(evt);
            }
        });

        errorCodigoLabel.setForeground(new java.awt.Color(218, 41, 41));
        errorCodigoLabel.setText("¡Introduce un número en el campo 'Código'!");

        editarGuardarButton.setText("Editar");
        editarGuardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarGuardarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tiendasLabel)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel)
                            .addComponent(codigoLabel))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(codigoTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editarGuardarButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(terminalLabel)
                            .addComponent(tipoLabel))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(terminalComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(138, 138, 138))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(borrarButton)
                        .addGap(18, 18, 18)
                        .addComponent(borrarExiLabel)
                        .addGap(40, 40, 40)
                        .addComponent(vacCamposButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(anhaExitoLabel)
                        .addGap(27, 27, 27)
                        .addComponent(anhadirButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorCodigoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarButton)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tiendasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarButton)
                    .addComponent(terminalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terminalLabel)
                    .addComponent(codigoLabel)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarGuardarButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoLabel)
                    .addComponent(tipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(errorCodigoLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrarButton)
                    .addComponent(anhadirButton)
                    .addComponent(borrarExiLabel)
                    .addComponent(anhaExitoLabel)
                    .addComponent(vacCamposButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // ------------------------------------------------------------------------
    // ------------------------------- Eventos --------------------------------
    private void nombreTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTextFieldMouseClicked
        if (this.primNombre) {
            this.nombreTextField.setText("");
            this.primNombre = false;
        }
    }//GEN-LAST:event_nombreTextFieldMouseClicked

    private void nombreTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTextFieldKeyPressed
        if (this.primNombre) {
            this.nombreTextField.setText("");
            this.primNombre = false;
        }
    }//GEN-LAST:event_nombreTextFieldKeyPressed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        this.buscarTiendas(false);
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void borrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed
        this.borrar();
    }//GEN-LAST:event_borrarButtonActionPerformed

    private void anhadirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anhadirButtonActionPerformed
        this.anhadir();
    }//GEN-LAST:event_anhadirButtonActionPerformed

    private void tiendasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiendasTableMouseClicked
        this.actualizarTabla();
    }//GEN-LAST:event_tiendasTableMouseClicked

    private void vacCamposButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacCamposButtonActionPerformed
        this.vaciarCampos();
    }//GEN-LAST:event_vacCamposButtonActionPerformed

    private void editarGuardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarGuardarButtonActionPerformed
        this.editar();
    }//GEN-LAST:event_editarGuardarButtonActionPerformed

    private void tiendasTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiendasTableKeyReleased
        this.actualizarTabla();
    }//GEN-LAST:event_tiendasTableKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anhaExitoLabel;
    private javax.swing.JButton anhadirButton;
    private javax.swing.JButton borrarButton;
    private javax.swing.JLabel borrarExiLabel;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JButton editarGuardarButton;
    private javax.swing.JLabel errorCodigoLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JComboBox<String> terminalComboBox;
    private javax.swing.JLabel terminalLabel;
    private javax.swing.JLabel tiendasLabel;
    private javax.swing.JTable tiendasTable;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JTextField tipoTextField;
    private javax.swing.JButton vacCamposButton;
    // End of variables declaration//GEN-END:variables

    // ------------------------------------------------------------------------
    // --------------------------- Función publica ----------------------------
    public void buscarTiendas(boolean todas) {
        ModeloTablaTiendas m;
        m = (ModeloTablaTiendas) this.tiendasTable.getModel();
        int itemSelected = this.terminalComboBox.getSelectedIndex();
                    this.errorCodigoLabel.setVisible(false);

        if (todas) {
            m.setFilas(this.va.obtenerTiendas("", 0, 0));
        } else {
            try {
                int codigo = 0;
                if (!this.codigoTextField.getText().equals("")) {
                    try {
                        codigo = Integer.parseInt(this.codigoTextField.getText());
                    } catch (NumberFormatException e) {
                        this.errorCodigoLabel.setVisible(true);
                        codigo = -1;
                    }
                }
                if (this.primNombre) {
                    buscar(m, "", itemSelected, codigo);
                } else {
                    buscar(m, this.nombreTextField.getText(), itemSelected, codigo);
                }
            } catch (NumberFormatException e) {
                this.errorCodigoLabel.setVisible(true);
            }
        }
        if (m.getRowCount() > 0) {
            this.tiendasTable.setRowSelectionInterval(0, 0);
            actualizarTabla();
        }
    }

    // ------------------------------------------------------------------------
    // -------------------------- Funciones privadas --------------------------
    private void buscar(ModeloTablaTiendas m, String nombre, int term, int cod) {
        if (term > 0) {
            if (cod >= 0) {
                m.setFilas(this.va.obtenerTiendas(nombre, cod, term));
            }
        } else {
            if (cod >= 0) {
                m.setFilas(this.va.obtenerTiendas(nombre, cod, 0));
            } 
        }
    }
    
    private void editarAnhadir(boolean editar) {
        this.codigoTextField.setEditable(editar);
        this.borrarButton.setEnabled(editar);
        this.buscarButton.setEnabled(editar);
        this.tiendasTable.setEnabled(editar);
        this.tiendasTable.setFocusable(editar);
    }

    private void anhadir() {
        if (!this.editarGuardar) {
            this.editarAnhadir(false);
        this.editarGuardarButton.setEnabled(false);
            this.anhadirButton.setText("Guardar");
            this.primNombre = true;
        } else {
            if (!this.nombreTextField.getText().equals("")) {
                if (this.terminalComboBox.getSelectedIndex() != 0) {
                    if (!this.tipoTextField.getText().equals("")) {
                        this.va.anhadirTienda(this.nombreTextField.getText(),
                                              this.terminalComboBox.getSelectedIndex(),
                                              this.tipoTextField.getText());
                        this.buscarTiendas(false);
                        this.anhaExitoLabel.setVisible(true);
                        this.editarGuardarButton.setEnabled(true);
                        this.editarAnhadir(true);
                        this.anhadirButton.setText("Añadir");
                    }
                }
            }
        }
        this.editarGuardar = !this.editarGuardar;
    }

    private void borrar() {
        ModeloTablaTiendas mt;
        Tienda tienda;
        int row = this.tiendasTable.getSelectedRow();
        mt = (ModeloTablaTiendas) this.tiendasTable.getModel();

        if (row != -1) {
            this.va.borrarTienda((int) mt.getValueAt(row, 0),
                    (int) mt.getValueAt(row, 1));
            mt.borrarTienda(row);
            this.borrarExiLabel.setVisible(true);
        } else {
            this.borrarExiLabel.setVisible(false);
        }
    }

    private void actualizarTabla() {
        this.borrarExiLabel.setVisible(false);
        this.anhaExitoLabel.setVisible(false);
        // this.errorCodigoLabel.setVisible(false);
        ModeloTablaTiendas mt;
        Tienda tienda;
        int row = this.tiendasTable.getSelectedRow();
        mt = (ModeloTablaTiendas) this.tiendasTable.getModel();

        if (row != -1) {
            this.terminalComboBox.setSelectedIndex((int) mt.getValueAt(row, 0));
            this.codigoTextField.setText("" + mt.getValueAt(row, 1));
            this.nombreTextField.setText("" + mt.getValueAt(row, 2));
            this.tipoTextField.setText("" + mt.getValueAt(row, 3));
        }
    }

    private void vaciarCampos() {
        this.codigoTextField.setText("");
        this.nombreTextField.setText("");
        this.tipoTextField.setText("");
        this.terminalComboBox.setSelectedIndex(0);
    }
    
    private void editar(boolean bloquear) {
        this.editarAnhadir(bloquear);
        this.terminalComboBox.setEnabled(bloquear);
        this.anhadirButton.setEnabled(bloquear);
        this.vacCamposButton.setEnabled(bloquear);
    }

    private void editar() {
        // EditarGuardar a false nos dice que vamos a editar los campos
        if (!this.editarGuardar) {
            this.editar(false);
            this.editarGuardarButton.setText("Guardar");
            this.primNombre = true;
        } else {
            ModeloTablaTiendas m;
            m = (ModeloTablaTiendas) this.tiendasTable.getModel();
            int fila = this.tiendasTable.getSelectedRow();
            int terminal = (int) m.getValueAt(fila, 0);
            int codigo = (int) m.getValueAt(fila, 1);
            
            this.editar(true);
            this.editarGuardarButton.setText("Editar");
            this.va.editarTienda(terminal, codigo, this.nombreTextField.getText(), 
                                 this.tipoTextField.getText());
            m.setFilas(this.va.obtenerTiendas("", 0, 0));
            this.tiendasTable.setRowSelectionInterval(fila, 0);
            actualizarTabla();
            this.primNombre = false;
        }
        this.editarGuardar = !this.editarGuardar;
    }
}
