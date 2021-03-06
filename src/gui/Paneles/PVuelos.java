
package gui.Paneles;

import gui.ModeloTablas.ModeloTablaAviones;
import gui.ModeloTablas.ModeloTablaVuelos;
import aplicacion.aviones.Avion;
import aplicacion.aviones.Terminal;
import aplicacion.vuelos.Vuelo;
import gui.VAdministrador;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javax.swing.SpinnerNumberModel;


public final class PVuelos extends javax.swing.JPanel {

    private final VAdministrador va;
    private ArrayList<Terminal> terminales;

    // ------------------------------------------------------------------------
    // ----------------------------- Constructor ------------------------------
    public PVuelos(VAdministrador va) {
        this.va  = va;
        initComponents();
        this.botonNuevo.setEnabled(true);
        this.botonEditar.setEnabled(false);
        this.gestionPanel.setVisible(true);
        this.editarNuevoPanel.setVisible(false);
        this.mensajeObligatorios.setVisible(false);
        this.mensajePrecio.setVisible(false);
        this.mensajeFinal.setVisible(false);
        this.obtenerTerminales();
        this.buscarVuelos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gestionPanel = new javax.swing.JPanel();
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
        jScrollPane = new javax.swing.JScrollPane();
        vuelosTable = new javax.swing.JTable();
        editarNuevoPanel = new javax.swing.JPanel();
        gestionVuelosEtiqueta = new javax.swing.JLabel();
        codigoEtiqueta = new javax.swing.JLabel();
        origenEtiqueta = new javax.swing.JLabel();
        destinoEtiqueta = new javax.swing.JLabel();
        salidaTeoricaEtiqueta = new javax.swing.JLabel();
        salidaRealEtiqueta = new javax.swing.JLabel();
        llegadaTeoricaEtiqueta = new javax.swing.JLabel();
        llegadaRealEtiqueta = new javax.swing.JLabel();
        precioNormalEtiqueta = new javax.swing.JLabel();
        precioPremiumEtiqueta = new javax.swing.JLabel();
        terminalEtiqueta = new javax.swing.JLabel();
        puertaEmbarqueEtiqueta = new javax.swing.JLabel();
        codigoAvionEtiqueta = new javax.swing.JLabel();
        codigoText = new javax.swing.JTextField();
        origenText = new javax.swing.JTextField();
        destinoText = new javax.swing.JTextField();
        precioNormalText = new javax.swing.JTextField();
        precioPremiumText = new javax.swing.JTextField();
        terminalOpciones = new javax.swing.JComboBox<>();
        codigoAvionText = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        mensajeObligatorios = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jLabel1 = new javax.swing.JLabel();
        avionEtiqueta = new javax.swing.JLabel();
        aerolineaEtiqueta = new javax.swing.JLabel();
        avionText = new javax.swing.JTextField();
        aerolineaText = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAviones = new javax.swing.JTable();
        mensajePrecio = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(32767, 1));
        puertaEmbarqueText = new javax.swing.JTextField();
        canceladoCheckbox = new javax.swing.JCheckBox();
        mensajeFinal = new javax.swing.JLabel();
        salidaTeoricaText = new com.toedter.calendar.JSpinnerDateEditor();
        salidaRealText = new com.toedter.calendar.JSpinnerDateEditor();
        llegadaTeoricaText = new com.toedter.calendar.JSpinnerDateEditor();
        llegadaRealText = new com.toedter.calendar.JSpinnerDateEditor();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));

        setPreferredSize(new java.awt.Dimension(813, 590));
        setSize(new java.awt.Dimension(815, 625));

        gestionPanel.setPreferredSize(new java.awt.Dimension(813, 385));

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
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        origenLabel.setText("Origen:");

        destinoLabel.setText("Destino:");

        fechaLlegadaLabel.setText("Fecha llegada:");

        vuelosTable.setModel(new ModeloTablaVuelos());
        jScrollPane.setViewportView(vuelosTable);

        javax.swing.GroupLayout gestionPanelLayout = new javax.swing.GroupLayout(gestionPanel);
        gestionPanel.setLayout(gestionPanelLayout);
        gestionPanelLayout.setHorizontalGroup(
            gestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(gestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gestionPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(gestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(gestionPanelLayout.createSequentialGroup()
                        .addGroup(gestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gestionPanelLayout.createSequentialGroup()
                                .addComponent(codigoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(origenLabel))
                            .addGroup(gestionPanelLayout.createSequentialGroup()
                                .addComponent(fechaSalidaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gestionPanelLayout.createSequentialGroup()
                                .addComponent(fechaLlegadaLabel)
                                .addGap(18, 18, 18)
                                .addComponent(fechaLlegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionPanelLayout.createSequentialGroup()
                                .addComponent(origenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(destinoLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(gestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(destinoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarButton))
                        .addGap(53, 53, 53))))
            .addGroup(gestionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gestionVuelosLabel)
                .addGap(53, 53, 53))
        );
        gestionPanelLayout.setVerticalGroup(
            gestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gestionVuelosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(gestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(origenLabel)
                    .addComponent(origenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinoLabel)
                    .addComponent(destinoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaLlegadaLabel)
                    .addComponent(fechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton)
                    .addComponent(fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaSalidaLabel))
                .addGroup(gestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gestionPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(botonEditar)
                        .addGap(56, 56, 56)
                        .addComponent(botonNuevo))
                    .addGroup(gestionPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        editarNuevoPanel.setPreferredSize(new java.awt.Dimension(781, 590));

        gestionVuelosEtiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gestionVuelosEtiqueta.setText("<html> <h1><CENTER>Gestión de vuelos</CENTER></h1> </html>");

        codigoEtiqueta.setText("Código*:");

        origenEtiqueta.setText("Origen*:");

        destinoEtiqueta.setText("Destino*:");

        salidaTeoricaEtiqueta.setText("Fecha salida teórica*:");

        salidaRealEtiqueta.setText("Fecha salida real:");

        llegadaTeoricaEtiqueta.setText("Fecha llegada teórica*:");

        llegadaRealEtiqueta.setText("Fecha llegada real:");

        precioNormalEtiqueta.setText("Precio normal*:");

        precioPremiumEtiqueta.setText("Precio premium:");

        terminalEtiqueta.setText("Terminal*:");

        puertaEmbarqueEtiqueta.setText("Puerta de embarque:");

        codigoAvionEtiqueta.setText("Código del avión*:");

        precioNormalText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precioNormalTextKeyReleased(evt);
            }
        });

        terminalOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        terminalOpciones.setToolTipText("");
        terminalOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminalOpcionesActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        mensajeObligatorios.setForeground(new java.awt.Color(255, 0, 0));
        mensajeObligatorios.setText("¡Los campos que contienen * son obligatorios!");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("<html> <CENTER>Buscar aviones</CENTER> </html>");
        jLabel1.setToolTipText("");

        avionEtiqueta.setText("Código avión:");

        aerolineaEtiqueta.setText("Aerolínea:");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        tablaAviones.setModel(new ModeloTablaAviones());
        tablaAviones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAvionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAviones);

        mensajePrecio.setForeground(new java.awt.Color(255, 0, 0));
        mensajePrecio.setText("¡El precio introducido no es correcto!");

        canceladoCheckbox.setText("Cancelado");

        mensajeFinal.setForeground(new java.awt.Color(255, 0, 0));
        mensajeFinal.setText("¡Se ha producido un error guardando el vuelo!");

        javax.swing.GroupLayout editarNuevoPanelLayout = new javax.swing.GroupLayout(editarNuevoPanel);
        editarNuevoPanel.setLayout(editarNuevoPanelLayout);
        editarNuevoPanelLayout.setHorizontalGroup(
            editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                        .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(destinoEtiqueta)
                                    .addComponent(origenEtiqueta)
                                    .addComponent(codigoEtiqueta))
                                .addGap(18, 18, 18)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(origenText)
                                    .addComponent(destinoText)
                                    .addComponent(codigoText)))
                            .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioNormalEtiqueta)
                                    .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(precioPremiumEtiqueta, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(terminalEtiqueta)))
                                .addGap(18, 18, 18)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(terminalOpciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(precioNormalText)
                                    .addComponent(precioPremiumText)))
                            .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                                .addComponent(puertaEmbarqueEtiqueta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(puertaEmbarqueText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarNuevoPanelLayout.createSequentialGroup()
                                .addComponent(codigoAvionEtiqueta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(canceladoCheckbox)
                                    .addComponent(codigoAvionText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                        .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salidaTeoricaEtiqueta)
                            .addComponent(salidaRealEtiqueta)
                            .addComponent(llegadaTeoricaEtiqueta)
                            .addComponent(llegadaRealEtiqueta))
                        .addGap(18, 18, 18)
                        .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(llegadaTeoricaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salidaTeoricaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 6, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarNuevoPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salidaRealText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(llegadaRealText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                        .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                                            .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(avionEtiqueta)
                                                .addComponent(aerolineaEtiqueta))
                                            .addGap(24, 24, 24)
                                            .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(aerolineaText, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(avionText, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(34, 34, 34))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarNuevoPanelLayout.createSequentialGroup()
                                            .addComponent(botonCancelar)
                                            .addGap(102, 102, 102)
                                            .addComponent(botonGuardar)
                                            .addGap(29, 29, 29)))
                                    .addComponent(botonBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)))
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mensajeObligatorios)
                            .addComponent(mensajeFinal)))
                    .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(mensajePrecio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarNuevoPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(gestionVuelosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        editarNuevoPanelLayout.setVerticalGroup(
            editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gestionVuelosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                        .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(codigoEtiqueta)
                                    .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(origenEtiqueta)
                                    .addComponent(origenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(destinoEtiqueta)
                                    .addComponent(destinoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(salidaTeoricaEtiqueta)
                                    .addComponent(salidaTeoricaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(salidaRealEtiqueta)
                                    .addComponent(salidaRealText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(llegadaTeoricaEtiqueta)
                                    .addComponent(llegadaTeoricaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(llegadaRealEtiqueta)
                                    .addComponent(llegadaRealText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioNormalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precioNormalEtiqueta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(precioPremiumEtiqueta)
                                    .addComponent(precioPremiumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(terminalEtiqueta)
                                    .addComponent(terminalOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(puertaEmbarqueEtiqueta)
                                    .addComponent(puertaEmbarqueText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(codigoAvionEtiqueta)
                                    .addComponent(codigoAvionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(canceladoCheckbox)
                            .addComponent(botonCancelar)
                            .addComponent(botonGuardar))
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avionEtiqueta)
                            .addComponent(avionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aerolineaEtiqueta)
                            .addComponent(aerolineaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscar)
                        .addGroup(editarNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editarNuevoPanelLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(mensajePrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensajeObligatorios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensajeFinal)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(editarNuevoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gestionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gestionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarNuevoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // ------------------------------------------------------------------------
    // ------------------------------- Eventos --------------------------------
    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        this.buscarVuelos();
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        this.va.setSize(this.va.getWidth(), 690);

        this.codigoAvionText.setEditable(false);
        this.precioPremiumText.setEditable(false);
        this.codigoText.setEditable(true);
        this.origenText.setEditable(true);
        this.destinoText.setEditable(true);
        this.salidaTeoricaText.setEnabled(true);
        this.llegadaTeoricaText.setEnabled(true);

        this.gestionPanel.setVisible(false);
        this.editarNuevoPanel.setVisible(true);
        this.vaciarCampos();
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.va.setSize(this.va.getWidth(), 500);

        this.editarNuevoPanel.setVisible(false);
        this.gestionPanel.setVisible(true);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        this.guardarVuelo();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        this.buscarAviones();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void tablaAvionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAvionesMouseClicked
        this.rellenarCodigoAvion();
    }//GEN-LAST:event_tablaAvionesMouseClicked

    private void precioNormalTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioNormalTextKeyReleased
        this.calcularPrecioPremium();
    }//GEN-LAST:event_precioNormalTextKeyReleased

    private void terminalOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminalOpcionesActionPerformed
        this.fijarPuertas();
    }//GEN-LAST:event_terminalOpcionesActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        this.va.setSize(this.va.getWidth(), 690);

        this.codigoAvionText.setEditable(false);
        this.precioPremiumText.setEditable(false);
        this.codigoText.setEditable(false);
        this.origenText.setEditable(false);
        this.destinoText.setEditable(false);
        this.salidaTeoricaText.setEnabled(false);
        this.llegadaTeoricaText.setEnabled(false);

        this.gestionPanel.setVisible(false);
        this.editarNuevoPanel.setVisible(true);
        this.rellenarCuadrosEditar();
    }//GEN-LAST:event_botonEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aerolineaEtiqueta;
    private javax.swing.JTextField aerolineaText;
    private javax.swing.JLabel avionEtiqueta;
    private javax.swing.JTextField avionText;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton buscarButton;
    private javax.swing.JCheckBox canceladoCheckbox;
    private javax.swing.JLabel codigoAvionEtiqueta;
    private javax.swing.JTextField codigoAvionText;
    private javax.swing.JLabel codigoEtiqueta;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoText;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JLabel destinoEtiqueta;
    private javax.swing.JLabel destinoLabel;
    private javax.swing.JTextField destinoText;
    private javax.swing.JTextField destinoTextField;
    private javax.swing.JPanel editarNuevoPanel;
    private com.toedter.calendar.JDateChooser fechaLlegada;
    private javax.swing.JLabel fechaLlegadaLabel;
    private com.toedter.calendar.JDateChooser fechaSalida;
    private javax.swing.JLabel fechaSalidaLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JPanel gestionPanel;
    private javax.swing.JLabel gestionVuelosEtiqueta;
    private javax.swing.JLabel gestionVuelosLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel llegadaRealEtiqueta;
    private com.toedter.calendar.JSpinnerDateEditor llegadaRealText;
    private javax.swing.JLabel llegadaTeoricaEtiqueta;
    private com.toedter.calendar.JSpinnerDateEditor llegadaTeoricaText;
    private javax.swing.JLabel mensajeFinal;
    private javax.swing.JLabel mensajeObligatorios;
    private javax.swing.JLabel mensajePrecio;
    private javax.swing.JLabel origenEtiqueta;
    private javax.swing.JLabel origenLabel;
    private javax.swing.JTextField origenText;
    private javax.swing.JTextField origenTextField;
    private javax.swing.JLabel precioNormalEtiqueta;
    private javax.swing.JTextField precioNormalText;
    private javax.swing.JLabel precioPremiumEtiqueta;
    private javax.swing.JTextField precioPremiumText;
    private javax.swing.JLabel puertaEmbarqueEtiqueta;
    private javax.swing.JTextField puertaEmbarqueText;
    private javax.swing.JLabel salidaRealEtiqueta;
    private com.toedter.calendar.JSpinnerDateEditor salidaRealText;
    private javax.swing.JLabel salidaTeoricaEtiqueta;
    private com.toedter.calendar.JSpinnerDateEditor salidaTeoricaText;
    private javax.swing.JTable tablaAviones;
    private javax.swing.JLabel terminalEtiqueta;
    private javax.swing.JComboBox<String> terminalOpciones;
    private javax.swing.JTable vuelosTable;
    // End of variables declaration//GEN-END:variables

    // ------------------------------------------------------------------------
    // ------------------------------ Funciones -------------------------------
    public void buscarVuelos() {
        ModeloTablaVuelos m;
        m = (ModeloTablaVuelos) this.vuelosTable.getModel();

        Timestamp fSalida = null, fLlegada = null;
        if (this.fechaSalida.getDate() != null) {
            fSalida = new java.sql.Timestamp(this.fechaSalida.getDate().getTime());
        }
        if (this.fechaLlegada.getDate() != null) {
            fLlegada = new java.sql.Timestamp(this.fechaLlegada.getDate().getTime());
        }

        m.setFilas(this.va.obtenerVuelos(this.codigoTextField.getText(),
                   this.origenTextField.getText(), this.destinoTextField.getText(),
                   fSalida, fLlegada));
        if (m.getRowCount() > 0) {
            this.vuelosTable.setRowSelectionInterval(0, 0);
            this.botonEditar.setEnabled(true);
        } else {
            this.botonEditar.setEnabled(false);
        }
    }

    public boolean comprobarCampos() {
        this.mensajePrecio.setVisible(false);
        this.mensajeObligatorios.setVisible(false);
        Date aux = new Date();
        if (this.codigoText.getText().equals("") || this.origenText.getText().equals("")
                || this.destinoText.getText().equals("")
                || (this.salidaTeoricaText.getDate().getTime() <= aux.getTime())
                || (this.llegadaTeoricaText.getDate().getTime() <= aux.getTime()) || this.precioNormalText.getText().equals("")
                || (this.terminalOpciones.getSelectedIndex() == 0) || this.codigoAvionText.getText().equals("")) {
            this.mensajeObligatorios.setVisible(true);
            return false;
        } else {
            this.mensajeObligatorios.setVisible(false);
            if (this.salidaTeoricaText.getDate().getTime() < this.llegadaTeoricaText.getDate().getTime()) {
                if (!this.puertaEmbarqueText.getText().equals("")) {
                    try {
                        int puerta = Integer.parseInt(this.puertaEmbarqueText.getText());
                        Terminal terminal = this.terminales.get(this.terminalOpciones.getSelectedIndex() - 1);
                        if ((puerta < terminal.getPrimeraPuerta()) || (puerta > terminal.getUltimaPuerta())) {
                            this.mensajePrecio.setText("¡La puerta introducida no es correcta!");
                            this.mensajePrecio.setVisible(true);
                            return false;
                        }
                    } catch (Exception exc) {
                        this.mensajePrecio.setText("¡La puerta introducida no es correcta!");
                        this.mensajePrecio.setVisible(true);
                        return false;
                    }
                } else {
                    this.mensajePrecio.setText("¡La puerta introducida no es correcta!");
                    this.mensajePrecio.setVisible(true);
                    return false;
                }
            } else {
                this.mensajePrecio.setText("¡La fecha de llegada debe ser mayor que la de salida!");
                this.mensajePrecio.setVisible(true);
                return false;
            }
            return this.calcularPrecioPremium();
        }
    }

    public void buscarAviones() {
        ModeloTablaAviones m;
        m = (ModeloTablaAviones) this.tablaAviones.getModel();

        m.setFilas(this.va.obtenerAviones(this.avionText.getText(), this.aerolineaText.getText(), 0));
//        if (m.getRowCount() > 0) {
//            this.tablaAviones.setRowSelectionInterval(0, 0);
//            codigoAvionText.setText(m.obtenerAvion(this.tablaAviones.getSelectedRow()).getCodigo());
//        }
    }

    public void rellenarCodigoAvion() {
        ModeloTablaAviones m = (ModeloTablaAviones) this.tablaAviones.getModel();
        this.codigoAvionText.setText(m.obtenerAvion(this.tablaAviones.getSelectedRow()).getCodigo());
    }

    public boolean calcularPrecioPremium() {
        this.mensajePrecio.setVisible(false);
        try {
            float precioNormal = Float.parseFloat(this.precioNormalText.getText());
            this.precioPremiumText.setText((precioNormal * 1.3) + "");
            return true;
        } catch (Exception exc) {
            this.mensajePrecio.setText("¡El precio introducido no es correcto!");
            this.mensajePrecio.setVisible(true);
            return false;
        }
    }

    public void obtenerTerminales() {
        this.terminales = this.va.obtenerTerminales();
        this.terminales.forEach((terminal) -> {
            this.terminalOpciones.addItem(terminal.getNumero() + "");
        });
    }

    public void fijarPuertas() {
        int item = this.terminalOpciones.getSelectedIndex();
        if (item == 0) {
            this.puertaEmbarqueEtiqueta.setText("Puerta de embarque:");
        } else {
            Terminal terminal = this.terminales.get(item - 1);
            this.puertaEmbarqueEtiqueta.setText("Puerta de embarque (" + terminal.getPrimeraPuerta() + "-" 
                                                + terminal.getUltimaPuerta() + "):");
        }
    }

    public Avion buscarAvion(String codigoAvion) {
        ModeloTablaAviones m = (ModeloTablaAviones) this.tablaAviones.getModel();
        Avion avionAux;
        for (int i = 0; i < m.getRowCount(); i++) {
            avionAux = m.obtenerAvion(i);
            if (avionAux.getCodigo().equals(codigoAvion)) {
                return avionAux;
            }
        }
        return null;
    }

    public void guardarVuelo() {
        this.mensajeFinal.setVisible(false);
        if (this.comprobarCampos()) {
            Date aux = new Date();
            Avion avion = this.buscarAvion(this.codigoAvionText.getText());
            int puertaEmbarque = 0;
            Timestamp fSalidaR = null, fLlegadaR = null;
            Timestamp fSalidaT = new Timestamp(this.salidaTeoricaText.getDate().getTime());
            Timestamp fLlegadaT = new Timestamp(this.llegadaTeoricaText.getDate().getTime());
            if (this.salidaRealText.getDate().getTime() > aux.getTime()) {
                fSalidaR = new Timestamp(this.salidaRealText.getDate().getTime());
            } else {
                fSalidaR = fSalidaT;
            }
            if (this.llegadaRealText.getDate().getTime() > aux.getTime()) {
                fLlegadaR = new Timestamp(this.llegadaRealText.getDate().getTime());
            } else {
                fLlegadaR = fLlegadaT;
            }
            if (!this.puertaEmbarqueText.getText().equals("")) {
                puertaEmbarque
                        = Integer.parseInt(this.puertaEmbarqueText.getText()); //esta excepcion ya se comprueba arriba
            }
            Terminal terminal = this.terminales.get(this.terminalOpciones.getSelectedIndex() - 1);
            Vuelo vuelo = new Vuelo(terminal, avion, this.codigoAvionText.getText(),
                    this.destinoText.getText(), this.origenText.getText(),
                    fSalidaT, fSalidaR, fLlegadaT, fLlegadaR,
                    Float.parseFloat(this.precioNormalText.getText()),
                    puertaEmbarque, this.canceladoCheckbox.isSelected());

            if (this.va.guardarVuelo(vuelo)) {
                this.va.setSize(this.va.getWidth(), 500);
                this.editarNuevoPanel.setVisible(false);
                this.gestionPanel.setVisible(true);
                this.buscarVuelos();
            } else {
                this.mensajeFinal.setVisible(false);
            }
        }
    }

    public void rellenarCuadrosEditar() {
        ModeloTablaVuelos m = (ModeloTablaVuelos) this.vuelosTable.getModel();
        Vuelo vuelo = m.obtenerVuelo(this.vuelosTable.getSelectedRow());

        this.codigoText.setText(vuelo.getNumeroVuelo());
        this.origenText.setText(vuelo.getOrigen());
        this.destinoText.setText(vuelo.getDestino());
        this.salidaTeoricaText.setDate((Date) vuelo.getFechaSalida());
        this.salidaRealText.setDate((Date) vuelo.getFechaSalidaReal());
        this.llegadaTeoricaText.setDate((Date) vuelo.getFechaLlegada());
        this.llegadaRealText.setDate((Date) vuelo.getFechaLlegadaReal());
        this.precioNormalText.setText(vuelo.getPrecioActual() + "");
        this.precioPremiumText.setText((vuelo.getPrecioActual() * 1.3) + "");
        this.terminalOpciones.setSelectedIndex(vuelo.getTerminal().getNumero());
        this.puertaEmbarqueText.setText(vuelo.getPuertaEmbarque() + "");
        this.codigoAvionText.setText(vuelo.getAvion().getCodigo());
        this.canceladoCheckbox.setSelected(vuelo.isCancelado());
        this.buscarAviones();
    }

    public void vaciarCampos() {
        this.codigoText.setText("");
        this.origenText.setText("");
        this.destinoText.setText("");
        this.salidaTeoricaText.setDate(new Date());
        this.salidaRealText.setEnabled(false);
        this.salidaRealText.setDate(new Date());
        this.llegadaTeoricaText.setDate(new Date());
        this.llegadaRealText.setEnabled(false);
        this.llegadaRealText.setDate(new Date());
        this.precioNormalText.setText("");
        this.precioPremiumText.setText("");
        this.terminalOpciones.setSelectedIndex(0);
        this.puertaEmbarqueText.setText("");
        this.codigoAvionText.setText("");
        this.canceladoCheckbox.setSelected(false);
        this.buscarAviones();
    }
}
