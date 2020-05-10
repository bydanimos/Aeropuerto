
package gui.Paneles;

import aplicacion.usuarios.PersonalLaboral;
import gui.VAdministrador;

public final class PModificarPersonalLaboral extends javax.swing.JPanel {

    private final VAdministrador va;
    private PersonalLaboral pl;
    
   // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public PModificarPersonalLaboral(VAdministrador va, PersonalLaboral pl) {
        this.va = va;
        this.pl = pl;
        initComponents();
        this.nombreTextField.setText(this.pl.getNombre() + " " +
                this.pl.getApellido1() + " " + this.pl.getApellido2());
        this.descrTextArea.setText(this.pl.getDescripcionTarea());
        this.laborTextField.setText(this.pl.getLabor());
        this.nombreTextField.setEditable(false);
        this.guardadoCorrecLabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        persLaboralLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        laborLabel = new javax.swing.JLabel();
        laborTextField = new javax.swing.JTextField();
        descripcionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descrTextArea = new javax.swing.JTextArea();
        volverButton = new javax.swing.JButton();
        guardarButton = new javax.swing.JButton();
        guardadoCorrecLabel = new javax.swing.JLabel();

        persLaboralLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        persLaboralLabel.setText("<html> <h1> Personal Laboral </h1> </html>");

        nombreLabel.setText("Nombre: ");

        laborLabel.setText("Labor: ");

        descripcionLabel.setText("Descripcion: ");

        descrTextArea.setColumns(20);
        descrTextArea.setRows(5);
        jScrollPane1.setViewportView(descrTextArea);

        volverButton.setText("Volver");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        guardadoCorrecLabel.setForeground(new java.awt.Color(26, 221, 21));
        guardadoCorrecLabel.setText("¡Guardado con éxito!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(persLaboralLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volverButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardadoCorrecLabel)
                        .addGap(18, 18, 18)
                        .addComponent(guardarButton))
                    .addComponent(jScrollPane1)
                    .addComponent(descripcionLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLabel)
                        .addGap(18, 18, 18)
                        .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(laborLabel)
                        .addGap(32, 32, 32)
                        .addComponent(laborTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(persLaboralLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laborLabel)
                    .addComponent(laborTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(descripcionLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverButton)
                    .addComponent(guardarButton)
                    .addComponent(guardadoCorrecLabel))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // ------------------------------------------------------------------------
    // ------------------------------- Eventos --------------------------------
    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        this.volver();
    }//GEN-LAST:event_volverButtonActionPerformed

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        this.guardar();
    }//GEN-LAST:event_guardarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descrTextArea;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JLabel guardadoCorrecLabel;
    private javax.swing.JButton guardarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel laborLabel;
    private javax.swing.JTextField laborTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel persLaboralLabel;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables

    // ------------------------------------------------------------------------
    // ------------------------------ Funciones -------------------------------
    private void volver() {
        this.va.pulsarPersonalLaboral();
    }
    
    private void guardar() {
        if (!this.laborTextField.getText().equals(this.pl.getLabor()) || 
            !this.descrTextArea.getText().equals(this.pl.getDescripcionTarea())) {
            
            this.pl.setLabor(this.laborTextField.getText());
            this.pl.setDescripcionTarea(this.descrTextArea.getText());
            this.va.modLaborDescripPersonalLaboral(this.pl);
            this.guardadoCorrecLabel.setVisible(true);
        } else {
            this.guardadoCorrecLabel.setVisible(false);
        }
        
    }
}
