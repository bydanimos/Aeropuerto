
package gui.Paneles;

import aplicacion.usuarios.PersonalLaboral;
import gui.ModeloTablas.ModeloTablaPersonalLaboral;
import gui.VAdministrador;


public final class PPersonalLaboral extends javax.swing.JPanel {

    private final VAdministrador va;
    private ModeloTablaPersonalLaboral mp;;
    
    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public PPersonalLaboral(VAdministrador va) {
        this.va = va;
        initComponents();
        this.servicioCheckBox.setSelected(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        persLaboralLabel = new javax.swing.JLabel();
        dniLabel = new javax.swing.JLabel();
        primerApellidoLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        servicioCheckBox = new javax.swing.JCheckBox();
        idTextField = new javax.swing.JTextField();
        primerApeTextField = new javax.swing.JTextField();
        dniTextField = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        nombreLabel = new javax.swing.JLabel();
        segunApellidoLabel = new javax.swing.JLabel();
        segunApeTextField = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        personalTable = new javax.swing.JTable();
        editarButton = new javax.swing.JButton();

        persLaboralLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        persLaboralLabel.setText("<html> <h1> Personal Laboral </h1> </html>");

        dniLabel.setText("DNI: ");

        primerApellidoLabel.setText("Apellido 1: ");

        idLabel.setText("ID: ");

        servicioCheckBox.setText("De servicio");
    
        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        nombreLabel.setText("Nombre: ");

        segunApellidoLabel.setText("Apellido 2: ");

        personalTable.setModel(new ModeloTablaPersonalLaboral());
        personalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personalTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personalTable);

        editarButton.setText("Editar / Ver Tarea");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(persLaboralLabel)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editarButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(idLabel)
                                            .addComponent(primerApellidoLabel)
                                            .addComponent(dniLabel))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(idTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                            .addComponent(primerApeTextField)
                                            .addComponent(dniTextField))
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreLabel)
                                            .addComponent(segunApellidoLabel)
                                            .addComponent(servicioCheckBox))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(152, 152, 152)
                                                .addComponent(buscarButton))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(segunApeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                                .addComponent(nombreTextField)))))
                                .addGap(60, 60, 60))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(persLaboralLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLabel)
                    .addComponent(dniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerApellidoLabel)
                    .addComponent(primerApeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segunApellidoLabel)
                    .addComponent(segunApeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(servicioCheckBox)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editarButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // ------------------------------------------------------------------------
    // ------------------------------- Eventos --------------------------------
    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        this.buscar(false);
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        this.verTarea();
    }//GEN-LAST:event_editarButtonActionPerformed

    private void personalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personalTableMouseClicked
        this.mirarSeleccionado();
    }//GEN-LAST:event_personalTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JButton editarButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel persLaboralLabel;
    private javax.swing.JTable personalTable;
    private javax.swing.JTextField primerApeTextField;
    private javax.swing.JLabel primerApellidoLabel;
    private javax.swing.JTextField segunApeTextField;
    private javax.swing.JLabel segunApellidoLabel;
    private javax.swing.JCheckBox servicioCheckBox;
    // End of variables declaration//GEN-END:variables

    // ------------------------------------------------------------------------
    // --------------------------- Función pública ----------------------------
    public void buscar() {
        this.buscar(true);
    }
    
    // ------------------------------------------------------------------------
    // -------------------------- Funciones privadas --------------------------
    private void buscar(boolean fuera) {
        this.mp = (ModeloTablaPersonalLaboral) this.personalTable.getModel();
        if (!fuera) {
            String dni = this.dniTextField.getText();
            String id = this.idTextField.getText();
            String nombre = this.nombreTextField.getText();
            String ape1 = this.primerApeTextField.getText();
            String ape2 = this.segunApeTextField.getText();
            boolean servicio = this.servicioCheckBox.isSelected();
        
            this.mp.setFilas(this.va.obtenerPersonalLaboral(dni, id, nombre, 
                    ape1, ape2, servicio));
        } else {
            this.mp.setFilas(this.va.obtenerPersonalLaboral("", "", "", "", "", true));
        }
        
        if (this.mp.getRowCount() > 0) {
            this.personalTable.setRowSelectionInterval(0, 0);
            this.editarButton.setEnabled(true);
            // actualizarSeleccionado();
        } else {
            this.editarButton.setEnabled(false);
        }
    }

    private void verTarea() {
        int select = this.personalTable.getSelectedRow();
        PersonalLaboral pl = this.mp.obtenerPersonalLaboral(select);
        this.va.pulsarVerTarea(pl);
    }

    private void mirarSeleccionado() {
        if (this.personalTable.getSelectedRow() != -1) {
            this.editarButton.setEnabled(true);
        } else {
            this.editarButton.setEnabled(false);
        }
    }
}
