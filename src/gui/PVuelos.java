/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.Timestamp;

/**
 *
 * @author david
 */
public class PVuelos extends javax.swing.JPanel {

    private VAdministrador va;
    /**
     * Creates new form PVuelos
     */
    public PVuelos(VAdministrador va) {
        this.va = va;
        initComponents();
        this.botonNuevo.setEnabled(true);
        this.botonEditar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gestionVuelosLabel = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        fechaSalidaLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        origenLabel = new javax.swing.JLabel();
        origenTextField = new javax.swing.JTextField();
        destinoLabel = new javax.swing.JLabel();
        destinoTextField = new javax.swing.JTextField();
        fechaSalida = new com.toedter.calendar.JDateChooser();
        fechaLlegadaLabel = new javax.swing.JLabel();
        fechaLlegada = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        vuelosTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(813, 385));

        gestionVuelosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gestionVuelosLabel.setText("<html> <h1><CENTER>Gestión de vuelos</CENTER></h1> </html>");

        codigoLabel.setText("Código:");

        fechaSalidaLabel.setText("Fecha salida: ");

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        botonNuevo.setText("Nuevo");

        botonEditar.setText("Editar");

        origenLabel.setText("Origen:");

        destinoLabel.setText("Destino:");

        fechaLlegadaLabel.setText("Fecha llegada:");

        vuelosTable.setModel(new ModeloTablaVuelos());
        jScrollPane1.setViewportView(vuelosTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gestionVuelosLabel)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codigoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(origenLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fechaSalidaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fechaLlegadaLabel)
                                .addGap(18, 18, 18)
                                .addComponent(fechaLlegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(origenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(destinoLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(destinoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarButton))
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gestionVuelosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(origenLabel)
                    .addComponent(origenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinoLabel)
                    .addComponent(destinoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaLlegadaLabel)
                    .addComponent(fechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton)
                    .addComponent(fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaSalidaLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(botonEditar)
                        .addGap(56, 56, 56)
                        .addComponent(botonNuevo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
       this.buscarVuelos();
    }//GEN-LAST:event_buscarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JLabel destinoLabel;
    private javax.swing.JTextField destinoTextField;
    private com.toedter.calendar.JDateChooser fechaLlegada;
    private javax.swing.JLabel fechaLlegadaLabel;
    private com.toedter.calendar.JDateChooser fechaSalida;
    private javax.swing.JLabel fechaSalidaLabel;
    private javax.swing.JLabel gestionVuelosLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel origenLabel;
    private javax.swing.JTextField origenTextField;
    private javax.swing.JTable vuelosTable;
    // End of variables declaration//GEN-END:variables
    
    public void buscarVuelos() {
        ModeloTablaVuelos m;
        m = (ModeloTablaVuelos) this.vuelosTable.getModel();
        
        Timestamp fSalida = null, fLlegada = null;
        if(fechaSalida.getDate() != null){
            fSalida = new java.sql.Timestamp(fechaSalida.getDate().getTime());
            fSalida.setNanos(0);
            fSalida.setSeconds(0);
            fSalida.setMinutes(0);
            fSalida.setHours(0);
        }
        if(fechaLlegada.getDate() != null){
            fLlegada = new java.sql.Timestamp(fechaLlegada.getDate().getTime());
            fLlegada.setNanos(0);
            fLlegada.setSeconds(0);
            fLlegada.setMinutes(0);
            fLlegada.setHours(0);
        }
        
        m.setFilas(this.va.obtenerVuelos(codigoTextField.getText(), origenTextField.getText(), destinoTextField.getText(), fSalida, fLlegada));
        if (m.getRowCount() > 0) {
            this.vuelosTable.setRowSelectionInterval(0, 0);
            botonEditar.setEnabled(true);
        }
        else{
            botonEditar.setEnabled(false);
        }
    }
}
