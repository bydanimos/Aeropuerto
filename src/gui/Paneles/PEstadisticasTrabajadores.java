
package gui.Paneles;

import gui.ModeloTablas.ModeloTablaEstadisticasTrabajadores;
import gui.VAdministrador;

/**
 *
 * @author dani
 */
public class PEstadisticasTrabajadores extends javax.swing.JPanel {

    private final VAdministrador va;
    /**
     * Creates new form PEstadisticasTrabajadores
     * @param va
     */
    public PEstadisticasTrabajadores(VAdministrador va) {
        this.va = va;
        initComponents();
        this.trabSemWinLabel.setText(this.va.trabajadorSemana());
        this.trabMesWinLabel.setText(this.va.trabajadorMes());
        this.trabAnhoWinLabel.setText(this.va.trabajadorAnho());
        this.buscar(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estatLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        primerApeLabel = new javax.swing.JLabel();
        primerApeTextField = new javax.swing.JTextField();
        dniLabel = new javax.swing.JLabel();
        dniTextField = new javax.swing.JTextField();
        segunApeLabel = new javax.swing.JLabel();
        segunApeTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        statWorkersTable = new javax.swing.JTable();
        trabSemanaLabel = new javax.swing.JLabel();
        trabMesLabel = new javax.swing.JLabel();
        trabSemWinLabel = new javax.swing.JLabel();
        trabMesWinLabel = new javax.swing.JLabel();
        trabAnhoLabel = new javax.swing.JLabel();
        trabAnhoWinLabel = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();

        estatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estatLabel.setText("<html><h1>Estadísticas Trabajadores </h1></html>");

        nombreLabel.setText("Nombre: ");

        primerApeLabel.setText("Apellido 1: ");

        dniLabel.setText("DNI: ");

        segunApeLabel.setText("Apellido 2:");

        statWorkersTable.setModel(new ModeloTablaEstadisticasTrabajadores());
        jScrollPane1.setViewportView(statWorkersTable);

        trabSemanaLabel.setText("Trabajador de la semana: ");

        trabMesLabel.setText("Trabajador del mes: ");

        trabSemWinLabel.setText("jLabel2");

        trabMesWinLabel.setText("jLabel1");

        trabAnhoLabel.setText("Trabajador del año: ");

        trabAnhoWinLabel.setText("jLabel1");

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estatLabel)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel)
                            .addComponent(dniLabel))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(dniTextField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(primerApeLabel)
                            .addComponent(segunApeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(primerApeTextField)
                            .addComponent(segunApeTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trabAnhoLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(trabSemanaLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(trabMesLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buscarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(trabSemWinLabel)
                                    .addComponent(trabMesWinLabel)
                                    .addComponent(trabAnhoWinLabel))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primerApeLabel)
                    .addComponent(primerApeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLabel)
                    .addComponent(dniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segunApeLabel)
                    .addComponent(segunApeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trabSemanaLabel)
                    .addComponent(trabSemWinLabel))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscarButton)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trabMesLabel)
                            .addComponent(trabMesWinLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trabAnhoLabel)
                            .addComponent(trabAnhoWinLabel))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        this.buscar(false);
    }//GEN-LAST:event_buscarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JLabel estatLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel primerApeLabel;
    private javax.swing.JTextField primerApeTextField;
    private javax.swing.JLabel segunApeLabel;
    private javax.swing.JTextField segunApeTextField;
    private javax.swing.JTable statWorkersTable;
    private javax.swing.JLabel trabAnhoLabel;
    private javax.swing.JLabel trabAnhoWinLabel;
    private javax.swing.JLabel trabMesLabel;
    private javax.swing.JLabel trabMesWinLabel;
    private javax.swing.JLabel trabSemWinLabel;
    private javax.swing.JLabel trabSemanaLabel;
    // End of variables declaration//GEN-END:variables

    private void buscar(boolean fuera) {
        ModeloTablaEstadisticasTrabajadores mp;
        mp = (ModeloTablaEstadisticasTrabajadores) this.statWorkersTable.getModel();
        if (!fuera) {
            String dni = this.dniTextField.getText();
            String nombre = this.nombreTextField.getText();
            String ape1 = this.primerApeTextField.getText();
            String ape2 = this.segunApeTextField.getText();
        
            mp.setFilas(this.va.obtenerPersonalLaboral(dni, "", nombre, 
                    ape1, ape2, true));
            mp.anhadirFilas(this.va.obtenerPersonalLaboral(dni, "", nombre, 
                    ape1, ape2, false));
        } else {
            mp.setFilas(this.va.obtenerPersonalLaboral("", "", "", "", "", true));
            mp.anhadirFilas(this.va.obtenerPersonalLaboral("", "", "", "", "", false));
        }
        
        if (mp.getRowCount() > 0) {
            this.statWorkersTable.setRowSelectionInterval(0, 0);
        }
    }
}
