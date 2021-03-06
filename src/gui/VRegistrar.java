package gui;

import aplicacion.usuarios.Usuario;

public class VRegistrar extends javax.swing.JFrame {

    private final aplicacion.FachadaAplicacion fa;
    private boolean primeraPass;
    private boolean primeraRepitPass;

    // -------------------------------------------------------------------------
    // ------------------------------ Constructor ------------------------------
    public VRegistrar(aplicacion.FachadaAplicacion fa) {
        this.fa = fa;
        initComponents();
        this.dniIncorrectLabel.setVisible(false);
        this.contraDistintLabel.setVisible(false);
        this.idRepetidoLabel.setVisible(false);
        this.contraDistintLabel.setVisible(false);
        this.sexoErrorLabel.setVisible(false);
        this.todosCamposLabel.setVisible(false);
        this.primeraPass = true;
        this.primeraRepitPass = true;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aeropuertoLabel = new javax.swing.JLabel();
        dniLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        contrasnhaLabel = new javax.swing.JLabel();
        repitPassLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        primerApellLabel = new javax.swing.JLabel();
        segunApellLabel = new javax.swing.JLabel();
        paisLabel = new javax.swing.JLabel();
        telefonLabel = new javax.swing.JLabel();
        dniTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        mailTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        repitPasswordField = new javax.swing.JPasswordField();
        nombreTextField = new javax.swing.JTextField();
        primApeTextField = new javax.swing.JTextField();
        segunApeTextField = new javax.swing.JTextField();
        paisTextField = new javax.swing.JTextField();
        telefonoTextField = new javax.swing.JTextField();
        dniIncorrectLabel = new javax.swing.JLabel();
        idRepetidoLabel = new javax.swing.JLabel();
        contraDistintLabel = new javax.swing.JLabel();
        registrarseButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        sexoLabel = new javax.swing.JLabel();
        sexoComboBox = new javax.swing.JComboBox<>();
        sexoErrorLabel = new javax.swing.JLabel();
        todosCamposLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        aeropuertoLabel.setText("<html>\n<h1>REGISTRARSE</h1>\n</html>");

        dniLabel.setText("DNI: ");

        idLabel.setText("ID: ");

        mailLabel.setText("EMAIL: ");

        contrasnhaLabel.setText("CONTRASEÑA: ");

        repitPassLabel.setText("REPETIR CONTRASEÑA: ");

        nombreLabel.setText("NOMBRE: ");

        primerApellLabel.setText("PRIMER APELLIDO: ");

        segunApellLabel.setText("SEGUNDO APELLIDO: ");

        paisLabel.setText("PAÍS: ");

        telefonLabel.setText("TELÉFONO: ");

        PasswordField.setText("Password");
        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
        });

        repitPasswordField.setText("Password");
        repitPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                repitPasswordFieldKeyPressed(evt);
            }
        });

        telefonoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefonoTextFieldKeyPressed(evt);
            }
        });

        dniIncorrectLabel.setForeground(new java.awt.Color(232, 19, 19));
        dniIncorrectLabel.setText("<html>\n¡DNI incorrecto!\n</html>\n");

        idRepetidoLabel.setForeground(new java.awt.Color(226, 33, 33));
        idRepetidoLabel.setText("<html>\n¡ID repetido!\n</html>\n");

        contraDistintLabel.setForeground(new java.awt.Color(228, 27, 27));
        contraDistintLabel.setText("<html>\n<center>\n¡Las contraseñas deben <br>\nser iguales! </center>\n</html>");

        registrarseButton.setText("Registrarse");
        registrarseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseButtonActionPerformed(evt);
            }
        });
        registrarseButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                registrarseButtonKeyPressed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarButtonMouseClicked(evt);
            }
        });
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        sexoLabel.setText("SEXO: ");

        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Hombre", "Mujer", "No especifica" }));

        sexoErrorLabel.setForeground(new java.awt.Color(228, 39, 39));
        sexoErrorLabel.setText("<html>\nRecuerde indicar su sexo.<br>\n</html>");

        todosCamposLabel.setForeground(new java.awt.Color(232, 36, 36));
        todosCamposLabel.setText("<html>\n¡Debe rellenar todos los campos antes de registrarse!\n</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(todosCamposLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 279, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefonLabel)
                                    .addComponent(paisLabel)
                                    .addComponent(sexoLabel)
                                    .addComponent(segunApellLabel)
                                    .addComponent(primerApellLabel)
                                    .addComponent(nombreLabel))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paisTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sexoComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(segunApeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(primApeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(telefonoTextField)
                                    .addComponent(nombreTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(repitPassLabel)
                                    .addComponent(contrasnhaLabel)
                                    .addComponent(mailLabel)
                                    .addComponent(idLabel)
                                    .addComponent(dniLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idTextField)
                                    .addComponent(mailTextField)
                                    .addComponent(PasswordField)
                                    .addComponent(repitPasswordField)
                                    .addComponent(dniTextField))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dniIncorrectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idRepetidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraDistintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexoErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarButton)
                        .addGap(18, 18, 18)
                        .addComponent(registrarseButton)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(aeropuertoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aeropuertoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLabel)
                    .addComponent(dniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniIncorrectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idRepetidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailLabel)
                    .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(contrasnhaLabel)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contraDistintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repitPassLabel)
                    .addComponent(repitPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerApellLabel)
                    .addComponent(primApeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segunApellLabel)
                    .addComponent(segunApeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paisLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarseButton)
                    .addComponent(cancelarButton)
                    .addComponent(todosCamposLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // -------------------------------------------------------------------------
    // ------------------------------- Eventos ---------------------------------
    private void registrarseButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registrarseButtonKeyPressed
        this.registrarUsuario();
    }//GEN-LAST:event_registrarseButtonKeyPressed

    private void cancelarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButtonMouseClicked
        this.dispose();
        this.fa.iniciaInterfazUsuario();
    }//GEN-LAST:event_cancelarButtonMouseClicked

    private void telefonoTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoTextFieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            this.registrarUsuario();
        }
    }//GEN-LAST:event_telefonoTextFieldKeyPressed

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyPressed
        if (this.primeraPass) {
            this.PasswordField.setText("");
            this.primeraPass = false;
        }
    }//GEN-LAST:event_PasswordFieldKeyPressed

    private void repitPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repitPasswordFieldKeyPressed
        if (this.primeraRepitPass) {
            this.repitPasswordField.setText("");
            this.primeraRepitPass = false;
        }
    }//GEN-LAST:event_repitPasswordFieldKeyPressed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
        this.fa.iniciaInterfazUsuario();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void registrarseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseButtonActionPerformed
        this.registrarUsuario();
    }//GEN-LAST:event_registrarseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel aeropuertoLabel;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel contraDistintLabel;
    private javax.swing.JLabel contrasnhaLabel;
    private javax.swing.JLabel dniIncorrectLabel;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idRepetidoLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel paisLabel;
    private javax.swing.JTextField paisTextField;
    private javax.swing.JTextField primApeTextField;
    private javax.swing.JLabel primerApellLabel;
    private javax.swing.JButton registrarseButton;
    private javax.swing.JLabel repitPassLabel;
    private javax.swing.JPasswordField repitPasswordField;
    private javax.swing.JTextField segunApeTextField;
    private javax.swing.JLabel segunApellLabel;
    private javax.swing.JComboBox<String> sexoComboBox;
    private javax.swing.JLabel sexoErrorLabel;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JLabel telefonLabel;
    private javax.swing.JTextField telefonoTextField;
    private javax.swing.JLabel todosCamposLabel;
    // End of variables declaration//GEN-END:variables

    // -------------------------------------------------------------------------
    // ------------------------------- Funciones -------------------------------
    // Función que coge del combobox el sexo introducido por el usuario
    private aplicacion.usuarios.TipoSexo getSexo() {
        switch (this.sexoComboBox.getSelectedIndex()) {
            case 1:
                return aplicacion.usuarios.TipoSexo.h;
            case 2:
                return aplicacion.usuarios.TipoSexo.m;
            case 3:
                return aplicacion.usuarios.TipoSexo.o;
            default:
                return null;
        }
    }

    // Función encargada de comprobar que los datos introducidos por el usuario
    // son válidos para introducirlos en la base de datos
    private void registrarUsuario() {
        Usuario usuario;
        boolean seguir = true;
        this.dniIncorrectLabel.setVisible(false);
        this.contraDistintLabel.setVisible(false);
        this.idRepetidoLabel.setVisible(false);
        this.sexoErrorLabel.setVisible(false);
        this.todosCamposLabel.setVisible(false);

        if (this.dniTextField.getText().equals("")) {
            seguir = false;
        } else {
            if (!this.fa.comprobarDni(this.dniTextField.getText())) {
                this.dniIncorrectLabel.setVisible(true);
                seguir = false;
            }
        }

        if (!this.PasswordField.getText().equals(this.repitPasswordField.getText())) {
            this.contraDistintLabel.setVisible(true);
            seguir = false;
        }
        if (this.fa.comprobarId(this.idRepetidoLabel.getText())) {
            this.idRepetidoLabel.setVisible(true);
            seguir = false;
        }
        if (this.getSexo() == null) {
            this.sexoErrorLabel.setVisible(true);
            seguir = false;
        }
        if (this.mailTextField.getText().equals("")){
            this.todosCamposLabel.setVisible(true);
            seguir = false;
        }
        if (this.nombreTextField.getText().equals("") || 
                this.primApeTextField.getText().equals("") ||
                this.segunApeTextField.getText().equals("")){
            seguir = false;
            this.todosCamposLabel.setVisible(true);
        }
        int telefono;
        // Nos aseguramos que sea un número lo introducido, en otro caso ponemos
        // que el num de telf es 0, ya que no es necesario almacenarlo en la base
        // de datos
        try {
            telefono = Integer.parseInt(this.telefonoTextField.getText());
        } catch (NumberFormatException e) {
            // seguir = false;
            telefono = 0;
        }
        
        // Si se cumplieron todos los requisitos creamos el usuario
        if (seguir) {

            usuario = new Usuario(this.dniTextField.getText(), 
                    this.idTextField.getText(), this.PasswordField.getText(),
                    this.mailTextField.getText(), this.nombreTextField.getText(), 
                    this.primApeTextField.getText(), this.segunApeTextField.getText(),
                    getSexo(), this.paisTextField.getText(), telefono);

            // Si el usuario se registró correctamen cerramos la ventana y le 
            // mostramos la ventana para que se pueda loguear
            if (this.fa.registrarUsuario(usuario)) {
                this.dispose();
                this.fa.iniciaInterfazUsuario();
            } else {
                this.todosCamposLabel.setVisible(true);
            }
        }
    }

}
