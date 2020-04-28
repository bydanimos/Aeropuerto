package gui.Paneles;

import gui.ModeloTablas.ModeloTablaCoches;
import aplicacion.servicios.CocheAlquiler;
import gui.VAdministrador;

/**
 *
 * @author dani
 */
public class PCoches extends javax.swing.JPanel {

    private final VAdministrador va;
    private boolean borrarPulsado;

    /**
     * Creates new form PCoches
     *
     * @param va
     */
    public PCoches(VAdministrador va) {
        this.va  = va;
        this.borrarPulsado = false;
        initComponents();
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

        matriculaLabel.setText("Matrícula: ");

        modeloLabel.setText("Modelo: ");

        numPlazasLabel.setText("Núm. Plazas: ");

        buscarButton.setText("Buscar");

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

        eliminarButton.setText("Eliminar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eliminarButton)
                        .addGap(262, 262, 262)
                        .addComponent(actualizarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                        .addComponent(nuevoButton))
                    .addComponent(jScrollPane1)
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modeloLabel)
                                .addGap(18, 18, 18)
                                .addComponent(modeloTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscarButton)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(cochesLabel))
                .addContainerGap(36, Short.MAX_VALUE))
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
                    .addComponent(buscarButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarButton)
                    .addComponent(nuevoButton)
                    .addComponent(actualizarButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cochesTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cochesTableKeyPressed
        // actualizarSeleccionado();
    }//GEN-LAST:event_cochesTableKeyPressed

    private void cochesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cochesTableMouseClicked
        actualizarSeleccionado();
    }//GEN-LAST:event_cochesTableMouseClicked

    private void cochesTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cochesTableKeyReleased
        actualizarSeleccionado();
    }//GEN-LAST:event_cochesTableKeyReleased

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        borrarCoche();
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void nuevoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoButtonActionPerformed
        nuevoCoche();
    }//GEN-LAST:event_nuevoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel cochesLabel;
    private javax.swing.JTable cochesTable;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel matriculaLabel;
    private javax.swing.JTextField matriculaTextField;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JTextField modeloTextField;
    private javax.swing.JButton nuevoButton;
    private javax.swing.JComboBox<String> numPlazasComboBox;
    private javax.swing.JLabel numPlazasLabel;
    // End of variables declaration//GEN-END:variables

    // Función que busca un coche en la base de datos por matrícula, número de 
    // plazas o modelo
    public void buscarCoches() {
        ModeloTablaCoches m;
        m = (ModeloTablaCoches) this.cochesTable.getModel();
        int itemSelected = this.numPlazasComboBox.getSelectedIndex();
        String matricula = this.matriculaTextField.getText();
        String modelo = this.modeloTextField.getText();
        int numPlazas = this.numPlazasComboBox.getSelectedIndex();

        m.setFilas(this.va.obtenerCoches(matricula, numPlazas, modelo));
        if (m.getRowCount() > 0) {
            this.cochesTable.setRowSelectionInterval(0, 0);
            // actualizarSeleccionado();
        }
    }

    private void actualizarSeleccionado() {
        ModeloTablaCoches m;
        m = (ModeloTablaCoches) this.cochesTable.getModel();

        int fila = this.cochesTable.getSelectedRow();
        if (fila != -1) {
            this.matriculaTextField.setText("" + m.getValueAt(fila, 0));
            this.modeloTextField.setText("" + m.getValueAt(fila, 1));
            int numCombo = seleccionarCombo((int) m.getValueAt(fila, 5));
            this.numPlazasComboBox.setSelectedIndex(numCombo);
        }
    }

    // Nos devuelve el número del combo box según el número que hay en la tabla
    private int seleccionarCombo(int i) {
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
    private void borrarCoche() {
        ModeloTablaCoches m;
        m = (ModeloTablaCoches) this.cochesTable.getModel();

        int fila = this.cochesTable.getSelectedRow();
        String matricula;
        if (fila != -1) {
            matricula = (String) m.getValueAt(fila, 0);
            this.va.borrarCocheAlquiler(matricula);
        }
        if (!this.borrarPulsado) {
            this.borrarPulsado = true;
        }
    }

    private void actualizarTabla() {
        this.borrarPulsado = false;
        this.eliminarButton.setEnabled(true);
        this.buscarButton.setEnabled(true);
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
}
