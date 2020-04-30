
package gui.Paneles;

import gui.ModeloTablas.ModeloTablaPersonalLaboral;
import gui.VAdministrador;

/**
 *
 * @author dani
 */
public class PPersonalLaboral extends javax.swing.JPanel {

    private final VAdministrador va;
    /**
     * Creates new form PPersonalLaboral
     * @param va
     */
    public PPersonalLaboral(VAdministrador va) {
        this.va = va;
        initComponents();
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

        persLaboralLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        persLaboralLabel.setText("<html> <h1> Personal Laboral </h1> </html>");

        dniLabel.setText("DNI: ");

        primerApellidoLabel.setText("Apellido 1: ");

        idLabel.setText("ID: ");

        servicioCheckBox.setText("De servicio");
        servicioCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicioCheckBoxActionPerformed(evt);
            }
        });

        buscarButton.setText("Buscar");

        nombreLabel.setText("Nombre: ");

        segunApellidoLabel.setText("Apellido 2: ");

        personalTable.setModel(new ModeloTablaPersonalLaboral());
        jScrollPane1.setViewportView(personalTable);

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(servicioCheckBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buscarButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreLabel)
                                            .addComponent(segunApellidoLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(segunApeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                            .addComponent(nombreTextField))))))
                        .addGap(60, 60, 60))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void servicioCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicioCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servicioCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniTextField;
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
}
