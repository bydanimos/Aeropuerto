
package gui.Paneles;

import aplicacion.servicios.CocheAlquiler;
import gui.VAdministrador;

public final class PNuevoCoche extends javax.swing.JPanel {

    private final VAdministrador va;
    
    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public PNuevoCoche(VAdministrador va) {
        this.va  = va;
        initComponents();
        this.mostrarAdvertencias(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevoCocheLabel = new javax.swing.JLabel();
        matriculaLabel = new javax.swing.JLabel();
        descripcionLabel = new javax.swing.JLabel();
        volverButton = new javax.swing.JButton();
        guardarCambiosButton = new javax.swing.JButton();
        matriculaTextField = new javax.swing.JTextField();
        modeloLabel = new javax.swing.JLabel();
        modeloTextField = new javax.swing.JTextField();
        caballosLabel = new javax.swing.JLabel();
        caballosTextField = new javax.swing.JTextField();
        precioPorDiaLabel = new javax.swing.JLabel();
        precioPorDiaTextField = new javax.swing.JTextField();
        tipoCombustibleLabel = new javax.swing.JLabel();
        combustibleComboBox = new javax.swing.JComboBox<>();
        numPuertasLabel = new javax.swing.JLabel();
        numPuertasComboBox = new javax.swing.JComboBox<>();
        numPlazasLabel = new javax.swing.JLabel();
        numPlazasComboBox = new javax.swing.JComboBox<>();
        matIncorrectaLabel = new javax.swing.JLabel();
        modeIncorrectLabel = new javax.swing.JLabel();
        cabIncorrectoLabel = new javax.swing.JLabel();
        preIncorrectoLabel = new javax.swing.JLabel();
        pueIncorrectaLabel = new javax.swing.JLabel();
        plaIncorrectaLabel = new javax.swing.JLabel();
        comIncorrectoLabel = new javax.swing.JLabel();
        introCorrectoLabel = new javax.swing.JLabel();

        nuevoCocheLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoCocheLabel.setText("<html> <h1> Nuevo Coche </h1> </html>\n");

        matriculaLabel.setText("Matrícula: ");

        descripcionLabel.setText("<html> \n   Para añadir un nuevo coche rellena todos los campos, si quieres cancelar pulsa \"Volver\". <br>\n   Tras haber rellenado los campos asegúrese de pulsar \"Guardar Cambios\" antes de pulsar \"Volver\". <br> </html>");

        volverButton.setText("Volver");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        guardarCambiosButton.setText("Guardar");
        guardarCambiosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCambiosButtonActionPerformed(evt);
            }
        });

        modeloLabel.setText("Modelo: ");

        caballosLabel.setText("Caballos: ");

        precioPorDiaLabel.setText("Precio por día: ");

        tipoCombustibleLabel.setText("Combustible: ");

        combustibleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Gasolina", "Gasóleo", "Gas", "Eléctrico", "Híbrido" }));

        numPuertasLabel.setText("Núm Puertas: ");

        numPuertasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "2", "3", "4", "5" }));

        numPlazasLabel.setText("Núm Plazas: ");

        numPlazasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "4", "5", "7", "8" }));

        matIncorrectaLabel.setForeground(new java.awt.Color(235, 49, 49));
        matIncorrectaLabel.setText("¡Matrícula Incorrecta!");

        modeIncorrectLabel.setForeground(new java.awt.Color(228, 39, 39));
        modeIncorrectLabel.setText("¡Introduzca un modelo!");

        cabIncorrectoLabel.setForeground(new java.awt.Color(233, 42, 42));
        cabIncorrectoLabel.setText("¡Introduzca un número de caballos!");

        preIncorrectoLabel.setForeground(new java.awt.Color(231, 49, 49));
        preIncorrectoLabel.setText("¡Introduce un precio válido!");

        pueIncorrectaLabel.setForeground(new java.awt.Color(229, 54, 54));
        pueIncorrectaLabel.setText("¡Seleccione un número!");

        plaIncorrectaLabel.setForeground(new java.awt.Color(235, 44, 44));
        plaIncorrectaLabel.setText("¡Seleccione un número de plazas!");

        comIncorrectoLabel.setForeground(new java.awt.Color(227, 52, 52));
        comIncorrectoLabel.setText("¡Seleccione un tipo de combustible!");

        introCorrectoLabel.setForeground(new java.awt.Color(39, 215, 58));
        introCorrectoLabel.setText("¡Guardado con éxito!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuevoCocheLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardarCambiosButton)
                        .addGap(18, 18, 18)
                        .addComponent(introCorrectoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descripcionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tipoCombustibleLabel)
                                .addGap(18, 18, 18)
                                .addComponent(combustibleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(matIncorrectaLabel)
                                    .addComponent(preIncorrectoLabel))
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cabIncorrectoLabel)
                                    .addComponent(modeIncorrectLabel)
                                    .addComponent(comIncorrectoLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pueIncorrectaLabel)
                                    .addComponent(plaIncorrectaLabel))))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioPorDiaLabel)
                            .addComponent(matriculaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matriculaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioPorDiaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modeloLabel)
                                .addGap(45, 45, 45)
                                .addComponent(modeloTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(caballosLabel)
                                .addGap(39, 39, 39)
                                .addComponent(caballosTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numPlazasLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numPlazasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numPuertasLabel)
                                .addGap(18, 18, 18)
                                .addComponent(numPuertasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nuevoCocheLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descripcionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculaLabel)
                    .addComponent(matriculaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modeloLabel)
                    .addComponent(modeloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPorDiaLabel)
                    .addComponent(precioPorDiaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caballosLabel)
                    .addComponent(caballosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoCombustibleLabel)
                    .addComponent(combustibleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numPlazasLabel)
                    .addComponent(numPlazasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numPuertasLabel)
                    .addComponent(numPuertasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matIncorrectaLabel)
                    .addComponent(modeIncorrectLabel)
                    .addComponent(pueIncorrectaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preIncorrectoLabel)
                    .addComponent(cabIncorrectoLabel)
                    .addComponent(plaIncorrectaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(volverButton)
                        .addComponent(guardarCambiosButton)
                        .addComponent(introCorrectoLabel))
                    .addComponent(comIncorrectoLabel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // ------------------------------------------------------------------------
    // ------------------------------- Eventos --------------------------------
    private void guardarCambiosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosButtonActionPerformed
        this.anhadirCoche();
    }//GEN-LAST:event_guardarCambiosButtonActionPerformed

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        this.volver();
    }//GEN-LAST:event_volverButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cabIncorrectoLabel;
    private javax.swing.JLabel caballosLabel;
    private javax.swing.JTextField caballosTextField;
    private javax.swing.JLabel comIncorrectoLabel;
    private javax.swing.JComboBox<String> combustibleComboBox;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JButton guardarCambiosButton;
    private javax.swing.JLabel introCorrectoLabel;
    private javax.swing.JLabel matIncorrectaLabel;
    private javax.swing.JLabel matriculaLabel;
    private javax.swing.JTextField matriculaTextField;
    private javax.swing.JLabel modeIncorrectLabel;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JTextField modeloTextField;
    private javax.swing.JLabel nuevoCocheLabel;
    private javax.swing.JComboBox<String> numPlazasComboBox;
    private javax.swing.JLabel numPlazasLabel;
    private javax.swing.JComboBox<String> numPuertasComboBox;
    private javax.swing.JLabel numPuertasLabel;
    private javax.swing.JLabel plaIncorrectaLabel;
    private javax.swing.JLabel preIncorrectoLabel;
    private javax.swing.JLabel precioPorDiaLabel;
    private javax.swing.JTextField precioPorDiaTextField;
    private javax.swing.JLabel pueIncorrectaLabel;
    private javax.swing.JLabel tipoCombustibleLabel;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables

    // ------------------------------------------------------------------------
    // ------------------------------ Funciones -------------------------------
    private void anhadirCoche() {
        CocheAlquiler co;
        String matricula, modelo, combustible;
        boolean seguir = true;
        int caballos = 0, numPlazas = 0, numPuertas = 0;
        float precioPorDia = 0;
        
        if ((matricula = this.matriculaTextField.getText()).length() != 7) {
            seguir = false;
            this.matIncorrectaLabel.setVisible(true);
        }
        
        if ((modelo = this.modeloTextField.getText()).equals("")) {
            seguir = false;
            this.modeIncorrectLabel.setVisible(true);
        }
        
        try {
            caballos = Integer.parseInt(this.caballosTextField.getText());
        } catch (NumberFormatException w) {
            seguir = false;
            this.cabIncorrectoLabel.setVisible(true);
        }
        
        try {
            precioPorDia = Float.parseFloat(this.precioPorDiaTextField.getText());
        } catch (NumberFormatException w) {
            seguir = false;
            this.preIncorrectoLabel.setVisible(true);
        }
        
        combustible = (String) this.combustibleComboBox.getSelectedItem();
        if (combustible.equals("Seleccionar")) {
            seguir = false;
            this.comIncorrectoLabel.setVisible(true);
        }
        
        if ((numPlazas = this.seleccionarComboPlazas()) == 0) {
            seguir = false;
            this.plaIncorrectaLabel.setVisible(true);
        }
        
        if ((numPuertas = this.seleccionarComboPuertas()) == 0) {
            seguir = false;
            this.pueIncorrectaLabel.setVisible(true);
        }
        
        if (seguir) {
            co = new CocheAlquiler(matricula, modelo, caballos, precioPorDia, 
                    combustible, numPlazas, numPuertas, false);
            this.va.insertarCocheAlquiler(co);
            this.vaciarCampos();
            this.mostrarAdvertencias(false);
            this.introCorrectoLabel.setVisible(true);
        }
    }
    
    // Nos devuelve el número del plazas según el número seleccionado en el 
    // combobox
    private int seleccionarComboPlazas() {
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
    
    // Nos devuelve el número de puertas según el número seleccionado en el 
    // combobox
    private int seleccionarComboPuertas() {
        switch (this.numPuertasComboBox.getSelectedIndex()) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                return 0;
        }
    } 

    private void volver() {
        this.va.pulsarCoches();
    }

    private void vaciarCampos() {
        this.numPlazasComboBox.setSelectedIndex(0);
        this.numPuertasComboBox.setSelectedIndex(0);
        this.combustibleComboBox.setSelectedIndex(0);
        this.precioPorDiaTextField.setText("");
        this.caballosTextField.setText("");
        this.modeloTextField.setText("");
        this.matriculaTextField.setText("");
    }
    
    private void mostrarAdvertencias(boolean mostrar) {
        this.matIncorrectaLabel.setVisible(mostrar);
        this.modeIncorrectLabel.setVisible(mostrar);
        this.cabIncorrectoLabel.setVisible(mostrar);
        this.preIncorrectoLabel.setVisible(mostrar);
        this.pueIncorrectaLabel.setVisible(mostrar);
        this.plaIncorrectaLabel.setVisible(mostrar);
        this.comIncorrectoLabel.setVisible(mostrar);
        this.introCorrectoLabel.setVisible(mostrar);
    }
}
