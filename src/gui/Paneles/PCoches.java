package gui.Paneles;

import gui.ModeloTablas.ModeloTablaCoches;
import gui.VAdministrador;


public final class PCoches extends javax.swing.JPanel {

    private final VAdministrador va;
    private boolean borrarPulsado;
    private boolean editar;

    //--------------------------------------------------------------------------
    // ----------------------------- Constructor -------------------------------
    public PCoches(VAdministrador va) {
        this.va  = va;
        this.borrarPulsado = false;
        this.editar = false;
        initComponents();
        this.precioDiaTextField.setEditable(false);
        this.retiraLabel.setVisible(false);
        this.editLabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matriculaLabel = new javax.swing.JLabel();
        modeloLabel = new javax.swing.JLabel();
        numPlazasLabel = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();
        matriculaTextField = new javax.swing.JTextField();
        modeloTextField = new javax.swing.JTextField();
        numPlazasComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        cochesTable = new javax.swing.JTable();
        eliminarButton = new javax.swing.JButton();
        nuevoButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        cochesLabel = new javax.swing.JLabel();
        modificarButton = new javax.swing.JButton();
        precioDiaLabel = new javax.swing.JLabel();
        precioDiaTextField = new javax.swing.JTextField();
        editLabel = new javax.swing.JLabel();
        retiraLabel = new javax.swing.JLabel();

        matriculaLabel.setText("Matrícula: ");

        modeloLabel.setText("Modelo: ");

        numPlazasLabel.setText("Núm. Plazas: ");

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        numPlazasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "4", "5", "7", "8" }));

        cochesTable.setModel(new ModeloTablaCoches());
        cochesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cochesTableMouseClicked(evt);
            }
        });
        cochesTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cochesTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cochesTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(cochesTable);

        eliminarButton.setText("Retirar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        nuevoButton.setText("Nuevo");
        nuevoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoButtonActionPerformed(evt);
            }
        });

        actualizarButton.setText("Actualizar");
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });

        cochesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cochesLabel.setText("<html>\n<h1><CENTER> Coches </CENTER></h1>\n</html>");

        modificarButton.setText("Editar");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        precioDiaLabel.setText("Precio Dia: ");

        editLabel.setForeground(new java.awt.Color(36, 230, 19));
        editLabel.setText("¡Editado con éxito!");

        retiraLabel.setForeground(new java.awt.Color(19, 229, 14));
        retiraLabel.setText("¡Retirado con éxito!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eliminarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retiraLabel)
                        .addGap(31, 31, 31)
                        .addComponent(actualizarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editLabel)
                        .addGap(18, 18, 18)
                        .addComponent(modificarButton)
                        .addGap(66, 66, 66)
                        .addComponent(nuevoButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numPlazasLabel)
                            .addComponent(matriculaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matriculaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numPlazasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modeloLabel)
                            .addComponent(buscarButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(precioDiaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(precioDiaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(modeloTextField)))
                    .addComponent(cochesLabel))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cochesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculaLabel)
                    .addComponent(matriculaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modeloLabel)
                    .addComponent(modeloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numPlazasLabel)
                    .addComponent(numPlazasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton)
                    .addComponent(precioDiaLabel)
                    .addComponent(precioDiaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarButton)
                    .addComponent(nuevoButton)
                    .addComponent(actualizarButton)
                    .addComponent(modificarButton)
                    .addComponent(editLabel)
                    .addComponent(retiraLabel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    // ------------------------------- Eventos ---------------------------------
    private void cochesTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cochesTableKeyPressed
        // actualizarSeleccionado();
    }//GEN-LAST:event_cochesTableKeyPressed

    private void cochesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cochesTableMouseClicked
        this.actualizarSeleccionado();
    }//GEN-LAST:event_cochesTableMouseClicked

    private void cochesTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cochesTableKeyReleased
        this.actualizarSeleccionado();
    }//GEN-LAST:event_cochesTableKeyReleased

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        this.borrarCoche();
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        this.actualizarTabla();
    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void nuevoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoButtonActionPerformed
        this.nuevoCoche();
    }//GEN-LAST:event_nuevoButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        this.buscarCoches();
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        this.editar();
    }//GEN-LAST:event_modificarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel cochesLabel;
    private javax.swing.JTable cochesTable;
    private javax.swing.JLabel editLabel;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel matriculaLabel;
    private javax.swing.JTextField matriculaTextField;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JTextField modeloTextField;
    private javax.swing.JButton modificarButton;
    private javax.swing.JButton nuevoButton;
    private javax.swing.JComboBox<String> numPlazasComboBox;
    private javax.swing.JLabel numPlazasLabel;
    private javax.swing.JLabel precioDiaLabel;
    private javax.swing.JTextField precioDiaTextField;
    private javax.swing.JLabel retiraLabel;
    // End of variables declaration//GEN-END:variables

    //--------------------------------------------------------------------------
    // ------------------------------ Funciones --------------------------------
    // Función que busca un coche en la base de datos por matrícula, número de 
    // plazas o modelo
    public final void buscarCoches() {
        ModeloTablaCoches m;
        m = (ModeloTablaCoches) this.cochesTable.getModel();
        String matricula = this.matriculaTextField.getText();
        String modelo = this.modeloTextField.getText();
        int numPlazas = this.seleccionarBuscar();

        m.setFilas(this.va.obtenerCoches(matricula, numPlazas, modelo));
        if (m.getRowCount() > 0) {
            this.cochesTable.setRowSelectionInterval(0, 0);
            // actualizarSeleccionado();
        }
    }

    private final void actualizarSeleccionado() {
        ModeloTablaCoches m;
        m = (ModeloTablaCoches) this.cochesTable.getModel();

        int fila = this.cochesTable.getSelectedRow();
        if (fila != -1) {
            this.matriculaTextField.setText("" + m.getValueAt(fila, 0));
            this.modeloTextField.setText("" + m.getValueAt(fila, 1));
            int numCombo = seleccionarCombo((int) m.getValueAt(fila, 5));
            this.numPlazasComboBox.setSelectedIndex(numCombo);
            this.precioDiaTextField.setText("" + m.getValueAt(fila, 3));
        }
    }
    
    private final int seleccionarBuscar() {
        switch (this.numPlazasComboBox.getSelectedIndex()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 7;
            case 6:
                return 8;
            default:
                return 0;
        }
    }

    // Nos devuelve el número del combo box según el número que hay en la tabla
    private final int seleccionarCombo(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            default:
                return 0;
        }
    }

    // Función que borra el coche seleccionado de la tabla en la base de datos
    private final void borrarCoche() {
        ModeloTablaCoches m;
        m = (ModeloTablaCoches) this.cochesTable.getModel();

        int fila = this.cochesTable.getSelectedRow();
        String matricula;
        if (fila != -1) {
            matricula = "" + m.getValueAt(fila, 0);
            this.va.borrarCocheAlquiler(matricula);
            this.retiraLabel.setVisible(true);
        }
        if (!this.borrarPulsado) {
            this.borrarPulsado = true;
        }
    }

    private final void actualizarTabla() {
        this.borrarPulsado = false;
        this.eliminarButton.setEnabled(true);
        this.buscarButton.setEnabled(true);
        this.precioDiaTextField.setEditable(false);
        this.retiraLabel.setVisible(false);
        this.editLabel.setVisible(false);
        ModeloTablaCoches m;
        m = (ModeloTablaCoches) this.cochesTable.getModel();
        m.setFilas(this.va.obtenerCoches("", 0, ""));
        if (m.getRowCount() > 0) {
            this.cochesTable.setRowSelectionInterval(0, 0);
            actualizarSeleccionado();
        }
    }

    private void nuevoCoche() {
        this.va.pulsarNuevoCoche();
    }

    private final void editar() {
        if (!this.editar) {
            this.precioDiaTextField.setEditable(true);
            this.cochesTable.setEnabled(false);
            this.modificarButton.setText("Guardar");
        } else {
            float precio = 0;
            String matricula = "";
            ModeloTablaCoches m;
            m = (ModeloTablaCoches) this.cochesTable.getModel();

            int fila = this.cochesTable.getSelectedRow();
            if (fila != -1) {
                matricula = ("" + m.getValueAt(fila, 0));
            }
            try {
                precio = Float.parseFloat(this.precioDiaTextField.getText());
                this.va.actualizarCocheAlquiler(matricula, precio);
            } catch (NumberFormatException e) {
                
            }
            this.editLabel.setVisible(true);
            this.cochesTable.setEnabled(true);
            this.modificarButton.setText("Editar");
        }
        this.editar = !this.editar;
    }
}
