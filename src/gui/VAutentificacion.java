package gui;

public class VAutentificacion extends javax.swing.JDialog {

    private aplicacion.FachadaAplicacion fa;
    private boolean primeraUser;
    private boolean primeraPass;

    public VAutentificacion(java.awt.Frame parent, boolean modal, aplicacion.FachadaAplicacion fa) {
        super(parent, modal);
        this.fa = fa;
        initComponents();
        this.incorrectLabel.setVisible(false);
        this.primeraUser = true;
        this.primeraPass = true;
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accederButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        incorrectLabel = new javax.swing.JLabel();
        aeropuetoLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        registrarseLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        accederButton.setText("Acceder >");

        cancelarButton.setText("Cancelar");
        cancelarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarButtonMouseClicked(evt);
            }
        });

        incorrectLabel.setForeground(new java.awt.Color(237, 1, 1));
        incorrectLabel.setText("¡Auntenticación Incorrecta!");

        aeropuetoLabel.setText("<html>\n<h1> AEROPUERTO </h1>\n</html>\n");

        usernameTextField.setText("Username");
        usernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextFieldMouseClicked(evt);
            }
        });
        usernameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTextFieldKeyPressed(evt);
            }
        });

        PasswordField.setText("Password");
        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
        });

        registrarseLabel.setText("<html>\n¿No estás registrado?<br>\n<center>Regístrate</center>\n</html>");
        registrarseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarseLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aeropuetoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(incorrectLabel)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelarButton)
                        .addGap(116, 116, 116)
                        .addComponent(accederButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(registrarseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aeropuetoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(incorrectLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accederButton)
                    .addComponent(cancelarButton))
                .addGap(18, 18, 18)
                .addComponent(registrarseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void usernameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextFieldMouseClicked
        this.usernameTextField.setText("");
    }//GEN-LAST:event_usernameTextFieldMouseClicked

    private void cancelarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cancelarButtonMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if ("".equals(this.PasswordField.getPassword())) {
            this.PasswordField.setText("Password");
        }
        if (this.usernameTextField.getText().equals("")) {
            this.usernameTextField.setText("Username");
        }
    }//GEN-LAST:event_formMouseClicked

    private void usernameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextFieldKeyPressed
        if (this.primeraUser) {
            this.usernameTextField.setText("");
            this.primeraUser = false;
        }
    }//GEN-LAST:event_usernameTextFieldKeyPressed

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyPressed
        if (this.primeraPass) {
            this.PasswordField.setText("");
            this.primeraPass = false;
        }
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            acceder();
        }
    }//GEN-LAST:event_PasswordFieldKeyPressed

    private void registrarseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseLabelMouseClicked
        registrar();
    }//GEN-LAST:event_registrarseLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton accederButton;
    private javax.swing.JLabel aeropuetoLabel;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel incorrectLabel;
    private javax.swing.JLabel registrarseLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

    private void acceder(){
        if (this.fa.comprobarAutentificacion(usernameTextField.getText(), PasswordField.getPassword())) {
            this.dispose();
        } else {
            this.incorrectLabel.setVisible(true);
        }
    }

    private void registrar(){
        
    }
}
