
package gui.Paneles;

import aplicacion.aviones.Aerolinea;
import aplicacion.usuarios.TipoSexo;
import aplicacion.vuelos.TipoAsiento;
import aplicacion.vuelos.Vuelo;
import gui.ModeloTablas.ModeloTablaEstadisticasTrabajadores;
import gui.ModeloTablas.ModeloTablaEstadisticasVuelos;
import gui.VAdministrador;
import java.sql.Timestamp;
import java.util.List;

public class PEstadisticas extends javax.swing.JPanel {

    private final VAdministrador va;
    
    public PEstadisticas(VAdministrador va) {
        this.va = va;
        this.va.setSize(this.va.getWidth() + 160, this.va.getHeight() + 40);
        initComponents();
        this.setSize(this.va.getWidth() + 160, this.va.getHeight() + 40);
        this.panelEstadisticasVuelos.setVisible(true);
        /*this.buscarVuelos();
        this.calcularEstadisticas();*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelEstadisticasVuelos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstadisticasVuelos = new javax.swing.JTable();
        dateSalidaVuelos = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOrigenVuelos = new javax.swing.JTextField();
        txtDestinoVuelos = new javax.swing.JTextField();
        botonBuscarVuelos = new javax.swing.JButton();
        panelEstadisticasUsuarios = new javax.swing.JPanel();
        nacionalidadLabel = new javax.swing.JLabel();
        nacionalidad1Text = new javax.swing.JTextField();
        nacionalidad2Text = new javax.swing.JTextField();
        nacionalidad3Text = new javax.swing.JTextField();
        hombresLabel = new javax.swing.JLabel();
        mujeresLabel = new javax.swing.JLabel();
        normalLabel = new javax.swing.JLabel();
        premiumLabel = new javax.swing.JLabel();
        cocheLabel = new javax.swing.JLabel();
        acompanhanteLabel = new javax.swing.JLabel();
        maletaLabel = new javax.swing.JLabel();
        maletasFacturadasLabel = new javax.swing.JLabel();
        hombresText = new javax.swing.JTextField();
        mujeresText = new javax.swing.JTextField();
        normalText = new javax.swing.JTextField();
        premiumText = new javax.swing.JTextField();
        cochesText = new javax.swing.JTextField();
        acompanhanteText = new javax.swing.JTextField();
        maletaText = new javax.swing.JTextField();
        maletasFacturadasText = new javax.swing.JTextField();
        panelStatWorkers = new javax.swing.JPanel();
        estatLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        primerApeLabel = new javax.swing.JLabel();
        primerApeTextField = new javax.swing.JTextField();
        dniLabel = new javax.swing.JLabel();
        dniTextField = new javax.swing.JTextField();
        segunApeLabel = new javax.swing.JLabel();
        segunApeTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        statWorkersTable = new javax.swing.JTable();
        trabSemanaLabel = new javax.swing.JLabel();
        trabMesLabel = new javax.swing.JLabel();
        trabSemWinLabel = new javax.swing.JLabel();
        trabMesWinLabel = new javax.swing.JLabel();
        trabAnhoLabel = new javax.swing.JLabel();
        trabAnhoWinLabel = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(813, 410));

        tablaEstadisticasVuelos.setModel(new ModeloTablaEstadisticasVuelos(this));
        jScrollPane1.setViewportView(tablaEstadisticasVuelos);

        jLabel1.setText("Fecha Salida");

        jLabel2.setText("Origen");

        jLabel3.setText("Destino");

        txtDestinoVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoVuelosActionPerformed(evt);
            }
        });

        botonBuscarVuelos.setText("Buscar");
        botonBuscarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarVuelosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEstadisticasVuelosLayout = new javax.swing.GroupLayout(panelEstadisticasVuelos);
        panelEstadisticasVuelos.setLayout(panelEstadisticasVuelosLayout);
        panelEstadisticasVuelosLayout.setHorizontalGroup(
            panelEstadisticasVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticasVuelosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstadisticasVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelEstadisticasVuelosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtOrigenVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelEstadisticasVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadisticasVuelosLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateSalidaVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(txtDestinoVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonBuscarVuelos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelEstadisticasVuelosLayout.setVerticalGroup(
            panelEstadisticasVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadisticasVuelosLayout.createSequentialGroup()
                .addGroup(panelEstadisticasVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstadisticasVuelosLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panelEstadisticasVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtDestinoVuelos)
                            .addComponent(txtOrigenVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(panelEstadisticasVuelosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateSalidaVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(botonBuscarVuelos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Vuelos", panelEstadisticasVuelos);

        panelEstadisticasUsuarios.setPreferredSize(new java.awt.Dimension(787, 325));

        nacionalidadLabel.setText("Nacionalidades mayoritarias:");

        hombresLabel.setText("Pasajeros hombres:");

        mujeresLabel.setText("Pasajeros mujeres:");

        normalLabel.setText("Pasajeros normal:");

        premiumLabel.setText("Pasajeros premium:");

        cocheLabel.setText("Pasajeros que reservan coche:");

        acompanhanteLabel.setText("Pasajeros que contratan acompañante:");

        maletaLabel.setText("Pasajeros que facturan maleta:");

        maletasFacturadasLabel.setText("Media de maletas/pasajero:");

        javax.swing.GroupLayout panelEstadisticasUsuariosLayout = new javax.swing.GroupLayout(panelEstadisticasUsuarios);
        panelEstadisticasUsuarios.setLayout(panelEstadisticasUsuariosLayout);
        panelEstadisticasUsuariosLayout.setHorizontalGroup(
            panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadisticasUsuariosLayout.createSequentialGroup()
                .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstadisticasUsuariosLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mujeresLabel)
                            .addComponent(hombresLabel)
                            .addComponent(normalLabel)
                            .addComponent(premiumLabel))
                        .addGap(18, 18, 18)
                        .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(premiumText, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(normalText)
                            .addComponent(hombresText)
                            .addComponent(mujeresText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadisticasUsuariosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nacionalidadLabel)
                        .addGap(6, 6, 6)))
                .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEstadisticasUsuariosLayout.createSequentialGroup()
                        .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nacionalidad3Text, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nacionalidad2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nacionalidad1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadisticasUsuariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelEstadisticasUsuariosLayout.createSequentialGroup()
                                .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(acompanhanteLabel)
                                    .addComponent(maletasFacturadasLabel))
                                .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelEstadisticasUsuariosLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(acompanhanteText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(maletasFacturadasText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelEstadisticasUsuariosLayout.createSequentialGroup()
                                .addComponent(cocheLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cochesText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEstadisticasUsuariosLayout.createSequentialGroup()
                                .addComponent(maletaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(maletaText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))))
        );
        panelEstadisticasUsuariosLayout.setVerticalGroup(
            panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticasUsuariosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nacionalidadLabel)
                    .addComponent(nacionalidad1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nacionalidad2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nacionalidad3Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hombresLabel)
                    .addComponent(cocheLabel)
                    .addComponent(hombresText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cochesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mujeresLabel)
                    .addComponent(acompanhanteLabel)
                    .addComponent(mujeresText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acompanhanteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maletaLabel)
                    .addComponent(maletaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(normalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(normalLabel))
                .addGap(18, 18, 18)
                .addGroup(panelEstadisticasUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maletasFacturadasLabel)
                    .addComponent(maletasFacturadasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(premiumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(premiumLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuarios", panelEstadisticasUsuarios);

        panelStatWorkers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelStatWorkersMouseClicked(evt);
            }
        });

        estatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estatLabel.setText("<html><h1>Estadísticas Trabajadores </h1></html>");

        nombreLabel.setText("Nombre: ");

        primerApeLabel.setText("Apellido 1: ");

        dniLabel.setText("DNI: ");

        segunApeLabel.setText("Apellido 2:");

        statWorkersTable.setModel(new ModeloTablaEstadisticasTrabajadores());
        jScrollPane2.setViewportView(statWorkersTable);

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

        javax.swing.GroupLayout panelStatWorkersLayout = new javax.swing.GroupLayout(panelStatWorkers);
        panelStatWorkers.setLayout(panelStatWorkersLayout);
        panelStatWorkersLayout.setHorizontalGroup(
            panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStatWorkersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estatLabel)
                .addContainerGap())
            .addGroup(panelStatWorkersLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStatWorkersLayout.createSequentialGroup()
                        .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel)
                            .addComponent(dniLabel))
                        .addGap(32, 32, 32)
                        .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(dniTextField))
                        .addGap(18, 18, 18)
                        .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(primerApeLabel)
                            .addComponent(segunApeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(primerApeTextField)
                            .addComponent(segunApeTextField)))
                    .addGroup(panelStatWorkersLayout.createSequentialGroup()
                        .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trabAnhoLabel)
                            .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(trabSemanaLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(trabMesLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelStatWorkersLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buscarButton))
                            .addGroup(panelStatWorkersLayout.createSequentialGroup()
                                .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(trabSemWinLabel)
                                    .addComponent(trabMesWinLabel)
                                    .addComponent(trabAnhoWinLabel))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(37, 37, 37))
        );
        panelStatWorkersLayout.setVerticalGroup(
            panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatWorkersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primerApeLabel)
                    .addComponent(primerApeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLabel)
                    .addComponent(dniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segunApeLabel)
                    .addComponent(segunApeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trabSemanaLabel)
                    .addComponent(trabSemWinLabel))
                .addGap(8, 8, 8)
                .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarButton)
                    .addGroup(panelStatWorkersLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trabMesLabel)
                            .addComponent(trabMesWinLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelStatWorkersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trabAnhoLabel)
                            .addComponent(trabAnhoWinLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Trabajadores", panelStatWorkers);

        jLabel21.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("<html> <h1>Estadísticas </h1> </htlm>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Vuelos");
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarVuelosActionPerformed
        this.buscarVuelos();
    }//GEN-LAST:event_botonBuscarVuelosActionPerformed

    private void txtDestinoVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoVuelosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoVuelosActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        this.buscar(false);
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void panelStatWorkersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelStatWorkersMouseClicked
        this.buscar(true);
    }//GEN-LAST:event_panelStatWorkersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acompanhanteLabel;
    private javax.swing.JTextField acompanhanteText;
    private javax.swing.JButton botonBuscarVuelos;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel cocheLabel;
    private javax.swing.JTextField cochesText;
    private com.toedter.calendar.JDateChooser dateSalidaVuelos;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JLabel estatLabel;
    private javax.swing.JLabel hombresLabel;
    private javax.swing.JTextField hombresText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel maletaLabel;
    private javax.swing.JTextField maletaText;
    private javax.swing.JLabel maletasFacturadasLabel;
    private javax.swing.JTextField maletasFacturadasText;
    private javax.swing.JLabel mujeresLabel;
    private javax.swing.JTextField mujeresText;
    private javax.swing.JTextField nacionalidad1Text;
    private javax.swing.JTextField nacionalidad2Text;
    private javax.swing.JTextField nacionalidad3Text;
    private javax.swing.JLabel nacionalidadLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel normalLabel;
    private javax.swing.JTextField normalText;
    private javax.swing.JPanel panelEstadisticasUsuarios;
    private javax.swing.JPanel panelEstadisticasVuelos;
    private javax.swing.JPanel panelStatWorkers;
    private javax.swing.JLabel premiumLabel;
    private javax.swing.JTextField premiumText;
    private javax.swing.JLabel primerApeLabel;
    private javax.swing.JTextField primerApeTextField;
    private javax.swing.JLabel segunApeLabel;
    private javax.swing.JTextField segunApeTextField;
    private javax.swing.JTable statWorkersTable;
    private javax.swing.JTable tablaEstadisticasVuelos;
    private javax.swing.JLabel trabAnhoLabel;
    private javax.swing.JLabel trabAnhoWinLabel;
    private javax.swing.JLabel trabMesLabel;
    private javax.swing.JLabel trabMesWinLabel;
    private javax.swing.JLabel trabSemWinLabel;
    private javax.swing.JLabel trabSemanaLabel;
    private javax.swing.JTextField txtDestinoVuelos;
    private javax.swing.JTextField txtOrigenVuelos;
    // End of variables declaration//GEN-END:variables

    public void buscarVuelos(){
        ModeloTablaEstadisticasVuelos m;
        Timestamp tSalida = null;
        if (this.dateSalidaVuelos.getDate() != null){
            tSalida = new java.sql.Timestamp(this.dateSalidaVuelos.getDate().getTime());
        }
        m=(ModeloTablaEstadisticasVuelos) this.tablaEstadisticasVuelos.getModel();
        m.setFilas(this.va.obtenerVuelos(this.txtOrigenVuelos.getText(),this.txtDestinoVuelos.getText(),tSalida));
        if (m.getRowCount() > 0) {
            this.tablaEstadisticasVuelos.setRowSelectionInterval(0, 0);
        }
    }
    
    public Aerolinea getAerolineaVuelo(Vuelo vuelo) {
        return this.va.getAerolineaVuelo(vuelo);
    }
    
    public String getNacionalidadMayoritariaVuelo(Vuelo vuelo) {
        return this.va.getNacionalidadMayoritariaVuelo(vuelo);
    }
    public Integer getNTipoVuelo(Vuelo vuelo,TipoAsiento ta) {
        return this.va.getNTipoVuelo(vuelo,ta);
    }
    public Integer getNSexoVuelo(Vuelo vuelo, TipoSexo ts) {
        return this.va.getNSexoVuelo(vuelo,ts);
    }
    
    public void calcularEstadisticas() {
        float resultado;
        this.nacionalidad1Text.setEditable(false);
        this.nacionalidad2Text.setEditable(false);
        this.nacionalidad3Text.setEditable(false);
        this.hombresText.setEditable(false);
        this.mujeresText.setEditable(false);
        this.normalText.setEditable(false);
        this.premiumText.setEditable(false);
        this.cochesText.setEditable(false);
        this.acompanhanteText.setEditable(false);
        this.maletaText.setEditable(false);
        this.maletasFacturadasText.setEditable(false);
        
        //calculamos las nacionalidades
        List<String> nacionalidades = this.va.calcularEstNacionalidades();
        if(nacionalidades != null){
            if(nacionalidades.get(0) != null) this.nacionalidad1Text.setText("1. " + nacionalidades.get(0));
            else this.nacionalidad1Text.setText("No consta.");
            if(nacionalidades.get(1) != null) this.nacionalidad2Text.setText("2. " + nacionalidades.get(1));
            else this.nacionalidad2Text.setText("No consta.");
            if(nacionalidades.get(2) != null) this.nacionalidad3Text.setText("3. " + nacionalidades.get(2));
            else this.nacionalidad3Text.setText("No consta.");
        }
        
        //calculamos el porcentaje de hombres
        resultado = this.va.calcularEstSexo(TipoSexo.h);
        this.hombresText.setText(resultado + " %");
        
        //calculamos el porcentaje de mujeres
        resultado = this.va.calcularEstSexo(TipoSexo.m);
        this.mujeresText.setText(resultado + " %");
        
        //calculamos el porcentaje de pasajeros normales
        resultado = this.va.calcularEstBillete("normal");
        this.normalText.setText(resultado + " %");
        
        //calculamos el porcentaje de pasajeros premium
        resultado = this.va.calcularEstBillete("premium");
        this.premiumText.setText(resultado + " %");
        
        //calculamos el porcentaje de pasajeros que reservan coche
        resultado = this.va.calcularEstCoche();
        this.cochesText.setText(resultado + " %");
        
        //calculamos el porcentaje de pasajeros que reservan coche
        resultado = this.va.calcularEstAcompanhante();
        this.acompanhanteText.setText(resultado + " %");
        
        //calculamos el porcentaje de pasajeros que facturan maleta
        resultado = this.va.calcularEstMaletas();
        this.maletaText.setText(resultado + " %");
        
        //calculamos la media de maletas por pasajero
        resultado = this.va.calcularEstMediaMaletas();
        this.maletasFacturadasText.setText(resultado + " maletas");   
    }

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
