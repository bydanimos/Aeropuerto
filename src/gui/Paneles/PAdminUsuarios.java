/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.Paneles;

import gui.ModeloTablas.ModeloTablaControlUsuarios;
import gui.ModeloTablas.ModeloTablaDatosUsuarios;
import aplicacion.usuarios.*;
import gui.VAdministrador;

/**
 *
 * @author ruben
 */
public class PAdminUsuarios extends javax.swing.JPanel {

    VAdministrador va;
    
    public PAdminUsuarios(VAdministrador va) {
        this.va = va;
        initComponents();
        this.panelEditar.setVisible(false);
        this.errorFaltanDatos.setVisible(false);
        //this.buscarControlUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEditar = new javax.swing.JPanel();
        botonEditarActualizar = new javax.swing.JButton();
        botonEditarCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEditarDni = new javax.swing.JTextField();
        txtEditarId = new javax.swing.JTextField();
        txtEditarEmail = new javax.swing.JTextField();
        txtEditarPrimerApellido = new javax.swing.JTextField();
        txtEditarNombre = new javax.swing.JTextField();
        txtEditarSegundoApellido = new javax.swing.JTextField();
        comboEditarTipo = new javax.swing.JComboBox<>();
        comboEditarSexo = new javax.swing.JComboBox<>();
        txtEditarPais = new javax.swing.JTextField();
        txtEditarTelefono = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        errorFaltanDatos = new javax.swing.JLabel();
        bloqueDatosControl = new javax.swing.JTabbedPane();
        panelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosUsuarios = new javax.swing.JTable();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtSegundoApellido = new javax.swing.JTextField();
        txtPrimerApellido = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        panelControlPasajeros = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtControlId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        botonControlBuscar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtControlDni = new javax.swing.JTextField();
        txtControlNombre = new javax.swing.JTextField();
        txtControlSegundoApellido = new javax.swing.JTextField();
        txtControlPrimerApellido = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaControlUsuarios = new javax.swing.JTable();

        botonEditarActualizar.setText("Actualizar");
        botonEditarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActualizarActionPerformed(evt);
            }
        });

        botonEditarCancelar.setText("Cancelar");
        botonEditarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI");

        jLabel7.setText("ID");

        jLabel8.setText("Email");

        jLabel11.setText("Nombre");

        jLabel12.setText("Primer apellido");

        jLabel13.setText("Segundo apellido");

        jLabel14.setText("Sexo");

        jLabel15.setText("Tipo");

        jLabel16.setText("Pais");

        jLabel17.setText("Telefono");

        txtEditarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarDniActionPerformed(evt);
            }
        });

        comboEditarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario Normal", "Administrador", "Personal Laboral", "Trabajador Externo" }));

        comboEditarSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otro", "Hombre", "Mujer" }));

        errorFaltanDatos.setForeground(new java.awt.Color(255, 0, 0));
        errorFaltanDatos.setText("¡Se deben completar todos los campos!");

        javax.swing.GroupLayout panelEditarLayout = new javax.swing.GroupLayout(panelEditar);
        panelEditar.setLayout(panelEditarLayout);
        panelEditarLayout.setHorizontalGroup(
            panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditarLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEditarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEditarId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEditarEmail))
                    .addGroup(panelEditarLayout.createSequentialGroup()
                        .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEditarLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(2, 2, 2)
                                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelEditarLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(errorFaltanDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 54, Short.MAX_VALUE))
                                    .addGroup(panelEditarLayout.createSequentialGroup()
                                        .addComponent(comboEditarSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEditarPais, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))))
                            .addGroup(panelEditarLayout.createSequentialGroup()
                                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelEditarLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelEditarLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEditarSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEditarLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(comboEditarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonEditarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelEditarLayout.createSequentialGroup()
                                        .addComponent(botonEditarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(212, 212, 212))))
                            .addGroup(panelEditarLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEditarPrimerApellido))
                            .addGroup(panelEditarLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEditarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        panelEditarLayout.setVerticalGroup(
            panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtEditarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtEditarPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEditarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtEditarSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEditarSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtEditarPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(txtEditarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonEditarActualizar)
                        .addGroup(panelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonEditarCancelar)
                            .addComponent(errorFaltanDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel23))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel2.setText("DNI");

        jLabel3.setText("Primer Apellido");

        jLabel4.setText("ID");

        jLabel5.setText("Nombre");

        jLabel6.setText("Segundo Apellido");

        tablaDatosUsuarios.setModel(new ModeloTablaDatosUsuarios(this));
        jScrollPane1.setViewportView(tablaDatosUsuarios);

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(botonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtId))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)
                                .addComponent(txtDni))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(42, 42, 42)
                                .addComponent(txtNombre))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEditar)
                    .addComponent(botonEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bloqueDatosControl.addTab("Datos", panelDatos);

        jLabel9.setText("DNI");

        jLabel10.setText("Primer Apellido");

        jLabel18.setText("ID");

        jLabel19.setText("Nombre");

        botonControlBuscar.setText("Buscar");
        botonControlBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonControlBuscarActionPerformed2(evt);
            }
        });

        jLabel20.setText("Segundo Apellido");

        txtControlDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtControlDniActionPerformed(evt);
            }
        });

        tablaControlUsuarios.setModel(new ModeloTablaControlUsuarios(this));
        jScrollPane2.setViewportView(tablaControlUsuarios);

        javax.swing.GroupLayout panelControlPasajerosLayout = new javax.swing.GroupLayout(panelControlPasajeros);
        panelControlPasajeros.setLayout(panelControlPasajerosLayout);
        panelControlPasajerosLayout.setHorizontalGroup(
            panelControlPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlPasajerosLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(panelControlPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(panelControlPasajerosLayout.createSequentialGroup()
                        .addGroup(panelControlPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelControlPasajerosLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txtControlId))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelControlPasajerosLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(39, 39, 39)
                                .addComponent(txtControlDni, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelControlPasajerosLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtControlPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(panelControlPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelControlPasajerosLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(42, 42, 42)
                                .addComponent(txtControlNombre))
                            .addGroup(panelControlPasajerosLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txtControlSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonControlBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(99, 99, 99))
        );
        panelControlPasajerosLayout.setVerticalGroup(
            panelControlPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlPasajerosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelControlPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtControlDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel19)
                    .addComponent(txtControlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelControlPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtControlSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel10)
                    .addComponent(txtControlPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelControlPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtControlId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonControlBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        bloqueDatosControl.addTab("Control de pasajeros", panelControlPasajeros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bloqueDatosControl, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bloqueDatosControl, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        buscarUsuarios();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        // TODO add your handling code here:
        this.bloqueDatosControl.setVisible(false);
        this.panelEditar.setVisible(true);
        actualizarCuadrosEditar();
    }//GEN-LAST:event_botonEditarActionPerformed

    private void txtEditarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditarDniActionPerformed

    private void botonEditarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarCancelarActionPerformed
        // TODO add your handling code here:
        this.panelEditar.setVisible(false);
        this.bloqueDatosControl.setVisible(true);
        this.buscarUsuarios();
    }//GEN-LAST:event_botonEditarCancelarActionPerformed

    private void botonEditarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActualizarActionPerformed
        this.errorFaltanDatos.setVisible(false);
        if(this.datosCompletos()){
                this.actualizarDatos();
        }else{
            this.errorFaltanDatos.setVisible(true);
        }
    }//GEN-LAST:event_botonEditarActualizarActionPerformed

    private void botonControlBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscar1ActionPerformed
        
    }//GEN-LAST:event_botonBuscar1ActionPerformed

    private void txtControlDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtControlDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtControlDniActionPerformed

    private void botonControlBuscarActionPerformed2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonControlBuscarActionPerformed2
        this.buscarControlUsuarios();
    }//GEN-LAST:event_botonControlBuscarActionPerformed2


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane bloqueDatosControl;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonControlBuscar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEditarActualizar;
    private javax.swing.JButton botonEditarCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JComboBox<String> comboEditarSexo;
    private javax.swing.JComboBox<String> comboEditarTipo;
    private javax.swing.JLabel errorFaltanDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelControlPasajeros;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelEditar;
    private javax.swing.JTable tablaControlUsuarios;
    private javax.swing.JTable tablaDatosUsuarios;
    private javax.swing.JTextField txtControlDni;
    private javax.swing.JTextField txtControlId;
    private javax.swing.JTextField txtControlNombre;
    private javax.swing.JTextField txtControlPrimerApellido;
    private javax.swing.JTextField txtControlSegundoApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEditarDni;
    private javax.swing.JTextField txtEditarEmail;
    private javax.swing.JTextField txtEditarId;
    private javax.swing.JTextField txtEditarNombre;
    private javax.swing.JTextField txtEditarPais;
    private javax.swing.JTextField txtEditarPrimerApellido;
    private javax.swing.JTextField txtEditarSegundoApellido;
    private javax.swing.JTextField txtEditarTelefono;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtSegundoApellido;
    // End of variables declaration//GEN-END:variables

    public void buscarUsuarios(){
        ModeloTablaDatosUsuarios m;
        m=(ModeloTablaDatosUsuarios) tablaDatosUsuarios.getModel();
        m.setFilas(this.va.obtenerUsuarios(txtDni.getText(),txtId.getText(),txtNombre.getText(),txtPrimerApellido.getText(),txtSegundoApellido.getText()));
        if (m.getRowCount() > 0) {
            tablaDatosUsuarios.setRowSelectionInterval(0, 0);
            botonEliminar.setEnabled(true);
            botonEditar.setEnabled(true);
        }
        else{
            botonEliminar.setEnabled(false);
            botonEditar.setEnabled(true);
        }
    }
    
     public void actualizarCuadrosEditar(){
        ModeloTablaDatosUsuarios mu;
        mu=(ModeloTablaDatosUsuarios) tablaDatosUsuarios.getModel();
        Usuario u = mu.obtenerUsuario(tablaDatosUsuarios.getSelectedRow());
        txtEditarDni.setText(u.getDni());
        txtEditarId.setText(u.getId());
        txtEditarEmail.setText(u.getCorreoElectronico());
        txtEditarNombre.setText(u.getNombre());
        txtEditarPrimerApellido.setText(u.getApellido1());
        txtEditarSegundoApellido.setText(u.getApellido2());
        txtEditarPais.setText(u.getPaisProcedencia());
        txtEditarTelefono.setText(u.getTelefono().toString());
        Object obj;
        if(u.getSexo() == TipoSexo.o){
            obj = comboEditarSexo.getItemAt(0);
        }else if(u.getSexo() == TipoSexo.h){
            obj = comboEditarSexo.getItemAt(1);
        }else{
            obj = comboEditarSexo.getItemAt(2);
        }
        comboEditarSexo.setSelectedItem(obj);
        
        String tipoUsuario = this.va.getTipoUsuario(u);
        if(tipoUsuario.equals("Usuario")){
            obj = comboEditarTipo.getItemAt(0);
        }else if(tipoUsuario.equals("Administrador")){
            obj = comboEditarTipo.getItemAt(1);
        }else if(tipoUsuario.equals("Personal Laboral")){
            obj = comboEditarTipo.getItemAt(2);
        }else{
            obj = comboEditarTipo.getItemAt(3);
        }
        comboEditarTipo.setSelectedItem(obj);
        botonEditarActualizar.setEnabled(true);
    }
     
    public void actualizarDatos(){
        ModeloTablaDatosUsuarios mu;
        mu=(ModeloTablaDatosUsuarios) tablaDatosUsuarios.getModel();
        Usuario u = mu.obtenerUsuario(tablaDatosUsuarios.getSelectedRow());
        String tipoAnterior = this.va.getTipoUsuario(u);
        String tipoNuevo = this.comboEditarTipo.getSelectedItem().toString();
        TipoSexo ts;
        switch((String)this.comboEditarSexo.getSelectedItem()){
            case "h":
                ts = TipoSexo.h;
                break;
            case "m":
                ts = TipoSexo.m;
                break;
            default:
                ts = TipoSexo.o;
        }
        Usuario user = new Usuario(this.txtEditarDni.getText(),this.txtEditarId.getText(),this.txtEditarEmail.getText(),this.txtEditarNombre.getText(),
                this.txtEditarPrimerApellido.getText(),this.txtEditarSegundoApellido.getText(),ts,this.txtEditarPais.getText(),Integer.parseInt(this.txtEditarTelefono.getText()));
        
        this.va.modificarUsuario(user,tipoAnterior,tipoNuevo);
    }
    
    
    public Boolean datosCompletos(){
        return !(this.txtEditarDni.getText().equals("") || this.txtEditarId.getText().equals("") || this.txtEditarEmail.getText().equals("") || 
                 this.txtEditarPais.getText().equals("") || this.txtEditarTelefono.getText().equals("") || this.txtEditarPrimerApellido.getText().equals("") ||
                this.txtEditarSegundoApellido.getText().equals("") || this.txtEditarNombre.getText().equals(""));
    }
    
    public String getTipoUsuario(Usuario u){
        return this.va.getTipoUsuario(u);
    }
    
    public void buscarControlUsuarios(){
        ModeloTablaControlUsuarios m;
        m=(ModeloTablaControlUsuarios) tablaControlUsuarios.getModel();
        m.setFilas(this.va.obtenerUsuariosControl(txtControlDni.getText(),txtControlId.getText(),txtControlNombre.getText(),txtControlPrimerApellido.getText(),txtControlSegundoApellido.getText()));
    }
}

