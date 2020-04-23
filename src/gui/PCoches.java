
package gui;

/**
 *
 * @author dani
 */
public class PCoches extends javax.swing.JPanel {

    private final VAdministrador va;
    /**
     * Creates new form PCoches
     * @param va
     */
    public PCoches(VAdministrador va) {
        this.va = va;
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

        numPlazasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "4", "5" }));

        cochesTable.setModel(new ModeloTablaCoches());
        jScrollPane1.setViewportView(cochesTable);

        eliminarButton.setText("Eliminar");

        nuevoButton.setText("Nuevo");

        actualizarButton.setText("Actualizar");

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
}
