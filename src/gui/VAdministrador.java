package gui;

import gui.Paneles.*;
import gui.Paneles.PAdminUsuarios;
import aplicacion.aviones.Aerolinea;
import aplicacion.aviones.Avion;
import aplicacion.aviones.ModeloAvion;
import aplicacion.aviones.Terminal;
import aplicacion.servicios.CocheAlquiler;
import aplicacion.servicios.Tienda;
import aplicacion.usuarios.*;
import aplicacion.vuelos.Vuelo;
import gui.Paneles.PNuevoCoche;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import aplicacion.usuarios.TipoSexo;
import aplicacion.usuarios.PersonalLaboral;
import aplicacion.vuelos.TipoAsiento;

public class VAdministrador extends javax.swing.JFrame {

    private final aplicacion.FachadaAplicacion fa;
    private JPanel panelActual;

    /**
     * Creates new form VAdministrador
     *
     * @param fa
     */
    public VAdministrador(aplicacion.FachadaAplicacion fa) {
        this.fa = fa;
        this.panelActual = new PPrincipal(this);
        initComponents();
        this.setSize(this.getWidth(), 500);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        aeroEtseLabel = new javax.swing.JLabel();
        vuelosLabel = new javax.swing.JLabel();
        areaPersoLabel = new javax.swing.JLabel();
        serviciosLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        adminLabel = new javax.swing.JLabel();
        adminLabel1 = new javax.swing.JLabel();
        avionFotoLabel = new javax.swing.JLabel();
        panelPrincipalAdministrador = new javax.swing.JPanel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        aeroEtseLabel.setText("<html> <h1> AEROETSE </h1> </html>");

        vuelosLabel.setText("<html>\n<h2> Vuelos </h2>\n</html>");

        areaPersoLabel.setText("<html>\n<h2> Área Personal </h2>\n</html>");

        serviciosLabel.setText("<html>\n<h2> Servicios </h2>\n</html>");

        infoLabel.setText("<html>\n<h2> Información </h2>\n</html>");

        adminLabel.setText("<html> <h2> Administrador </h2> </html>");

        adminLabel1.setBackground(new java.awt.Color(102, 153, 255));
        adminLabel1.setForeground(new java.awt.Color(0, 102, 255));
        adminLabel1.setText("<html> <h2> Administrador </h2> </html>");
        adminLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLabel1MouseClicked(evt);
            }
        });

        avionFotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/avion_.png"))); // NOI18N

        panelPrincipalAdministrador.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aeroEtseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                        .addComponent(adminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(412, 412, 412))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(adminLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(areaPersoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(serviciosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(vuelosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))
                                    .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(panelPrincipalAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(avionFotoLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aeroEtseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(areaPersoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(serviciosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(avionFotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(vuelosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelPrincipalAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // -------------------------------------------------------------------------
    // -------------------------------- Eventos --------------------------------
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void adminLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLabel1MouseClicked
        this.volver();
    }//GEN-LAST:event_adminLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel adminLabel1;
    private javax.swing.JLabel aeroEtseLabel;
    private javax.swing.JLabel areaPersoLabel;
    private javax.swing.JLabel avionFotoLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JPanel panelPrincipalAdministrador;
    private javax.swing.JLabel serviciosLabel;
    private javax.swing.JLabel vuelosLabel;
    // End of variables declaration//GEN-END:variables

    // -------------------------------------------------------------------------
    // ------------------------------ Funciones --------------------------------
    public void volver() {
        this.setSize(this.getWidth(), 500);

        this.panelActual.setVisible(false);
        this.panelActual = new PPrincipal(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Usuarios --------------------------------
    public void pulsarUsuarios() {
        this.panelActual.setVisible(false);
        this.panelActual = new PAdminUsuarios(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
        ((PAdminUsuarios) this.panelActual).buscarUsuarios();
    }

    public java.util.List<Usuario> obtenerUsuarios(String dni, String id, String nombre, 
                                                   String primerApellido, String segundoApellido) {
        return this.fa.obtenerUsuarios(dni, id, nombre, primerApellido, segundoApellido);
    }

    public String getTipoUsuario(Usuario u) {
        return this.fa.getTipoUsuario(u);
    }

    public void modificarUsuario(Usuario u, String tipoAnterior, String tipoNuevo) {
        this.fa.modificarUsuario(u, tipoAnterior, tipoNuevo);
    }

    public java.util.List<Usuario> obtenerUsuariosControl(String dni, String id, 
                                                          String nombre, String primerApellido, 
                                                          String segundoApellido) {
        return this.fa.obtenerUsuariosControl(dni, id, nombre, primerApellido, segundoApellido);
    }

    public boolean borrarUsuario(Usuario u) {
        return this.fa.borrarUsuario(u);
    }

    // -------------------------------------------------------------------------
    // -------------------------------- Tiendas --------------------------------
    public void pulsarTiendas() {
        this.panelActual.setVisible(false);
        this.panelActual = new PTiendas(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
        ((PTiendas) this.panelActual).buscarTiendas(true);
    }

    public List<Tienda> obtenerTiendas(String nombre, int codigo, int terminal) {
        return this.fa.obtenerTiendas(nombre, codigo, terminal);
    }

    public void anhadirTienda(String nombre, int terminal, String tipo) {
        this.fa.anhadirTienda(nombre, terminal, tipo);
    }

    public void editarTienda(int terminal, int codigo, String nombre, String tipo) {
        this.fa.editarTienda(terminal, codigo, nombre, tipo);
    }

    public void borrarTienda(int terminal, int codigo) {
        this.fa.borrarTienda(terminal, codigo);
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Vuelos -------------------------------
    public void pulsarVuelos() {
        this.panelActual.setVisible(false);
        this.panelActual = new PVuelos(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }

    public List<Vuelo> obtenerVuelos(String codigo, String origen, String destino, 
                                     Timestamp fechaSalida, Timestamp fechaLlegada) {
        return this.fa.obtenerVuelos(codigo, origen, destino, fechaSalida, fechaLlegada);
    }

    public ArrayList<Terminal> obtenerTerminales() {
        return this.fa.obtenerTerminales();
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Aerolineas ------------------------------
    public void pulsarAerolineas() {
        this.panelActual.setVisible(false);
        this.panelActual = new PAerolineas(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }

    public List<Aerolinea> obtenerAerolineas(String nombre) {
        return this.fa.obtenerAerolineas(nombre);
    }

    public boolean guardarVuelo(Vuelo vuelo) {
        return this.fa.guardarVuelo(vuelo);
    }

    public void modificarAerolinea(Aerolinea aerolinea) {
        this.fa.modificarAerolinea(aerolinea);
    }

    public Aerolinea getAerolinea(String nombre) {
        return this.fa.getAerolinea(nombre);
    }

    public void anhadirAerolinea(Aerolinea aerolinea) {
        this.fa.anhadirAerolinea(aerolinea);
    }

    public void eliminarAerolineas(List<Aerolinea> aerolineas) {
        this.fa.eliminarAerolineas(aerolineas);
    }

    public boolean esAerolineaBorrable(Aerolinea aerolinea) {
        return this.fa.esAerolineaBorrable(aerolinea);
    }

    // -------------------------------------------------------------------------
    // -------------------------------- Coches ---------------------------------
    public void pulsarCoches() {
        this.panelActual.setVisible(false);
        this.panelActual = new PCoches(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
        ((PCoches) this.panelActual).buscarCoches();
    }

    public ArrayList<CocheAlquiler> obtenerCoches(String matricula, int numPlazas, String modelo) {
        return this.fa.obtenerCoches(matricula, numPlazas, modelo);
    }

    public void borrarCocheAlquiler(String matricula) {
        this.fa.borrarCocheAlquiler(matricula);
    }

    public void insertarCocheAlquiler(CocheAlquiler co) {
        this.fa.insertarCocheAlquiler(co);
    }
    
    public void actualizarCocheAlquiler(String matricula, float precio) {
        this.fa.actualizarCocheAlquiler(matricula, precio);
    }

    // -------------------------------------------------------------------------
    // ----------------------------- Coche Nuevo -------------------------------
    public void pulsarNuevoCoche() {
        this.panelActual.setVisible(false);
        this.panelActual = new PNuevoCoche(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }

    // -------------------------------------------------------------------------
    // --------------------------- Personal Laboral ----------------------------
    public void pulsarPersonalLaboral() {
        this.panelActual.setVisible(false);
        this.panelActual = new PPersonalLaboral(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
        ((PPersonalLaboral) this.panelActual).buscar();
    }
    
    public List<PersonalLaboral> obtenerPersonalLaboral(String dni, String id, 
            String nombre, String ape1, String ape2, boolean servicio) {
        return this.fa.obtenerPersonalLaboral(dni, id, nombre, ape1, ape2, servicio);
    }
    
    public void modLaborDescripPersonalLaboral(PersonalLaboral pl) {
        this.fa.modLaborDescripPersonalLaboral(pl);
    }
    
    public void pulsarVerTarea(PersonalLaboral pl) {
        this.panelActual.setVisible(false);
        this.panelActual = new PModificarPersonalLaboral(this, pl);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Aviones ---------------------------------
    public void pulsarAviones() {
        this.panelActual.setVisible(false);
        this.panelActual = new PAviones(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }

    public List<Avion> obtenerAviones(String codigo, String aerolinea, int retirado) {
        return this.fa.obtenerAviones(codigo, aerolinea, retirado);
    }

    public boolean actualizarAviones(List<Avion> aviones) {
        return this.fa.actualizarAviones(aviones);
    }

    public void pulsarAñadirAvion() {
        this.panelActual.setVisible(false);
        this.panelActual = new PNuevoAvion(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }

    public List<ModeloAvion> obtenerModelosAvion(String nombre) {
        return this.fa.obtenerModelosAvion(nombre);
    }

    public boolean añadirAvion(String codigo, Aerolinea aerolinea, ModeloAvion modeloAvion, 
                               int anhoFabricacion) {
        return this.fa.añadirAvion(codigo, aerolinea, modeloAvion, anhoFabricacion);
    }

    public void pulsarVerModelos() {
        this.panelActual.setVisible(false);
        this.panelActual = new PModelosAvion(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }

    public void borrarModeloAvion(ModeloAvion modeloAvion) {
        this.fa.borrarModeloAvion(modeloAvion);
    }

    public boolean actualizarModelosAvion(List<ModeloAvion> modelosAvion) {
        return this.fa.actualizarModelosAvion(modelosAvion);
    }
    
    // -------------------------------------------------------------------------
    // ------------------------- Estadísticas Vuelos ---------------------------
    public void pulsarEstadisticas() {
        this.panelActual.setVisible(false);
        this.panelActual = new PEstadisticas(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }
    
    public Aerolinea getAerolineaVuelo(Vuelo vuelo) {
        return this.fa.getAerolineaVuelo(vuelo);
    }
    
    public String getNacionalidadMayoritariaVuelo(Vuelo vuelo) {
        return this.fa.getNacionalidadMayoritariaVuelo(vuelo);
    }
    
    public Integer getNTipoVuelo(Vuelo vuelo,TipoAsiento ta) {
        return this.fa.getNTipoVuelo(vuelo,ta);
    }
    
    public Integer getNSexoVuelo(Vuelo vuelo, TipoSexo ts) {
        return this.fa.getNSexoVuelo(vuelo,ts);
    } 
    
    public List<Vuelo> obtenerVuelos(String origen,String destino,Timestamp tSalida) {
        return this.fa.obtenerVuelos(origen, destino,tSalida);
    }
    
    //--------------------------------------------------------------------------
    // ----------------------- Estadísticas Usuarios ---------------------------
    public List<String> calcularEstNacionalidades() {
        return this.fa.calcularEstNacionalidades();
    }
    
    public float calcularEstSexo(TipoSexo sexo) {
        return this.fa.calcularEstSexo(sexo);
    }
    
    public float calcularEstBillete(String tipo) {
        return this.fa.calcularEstBillete(tipo);
    }
    
    public float calcularEstCoche() {
        return this.fa.calcularEstCoche();
    }
    
    public float calcularEstAcompanhante() {
        return this.fa.calcularEstAcompanhante();
    }
    
    public float calcularEstMaletas() {
        return this.fa.calcularEstMaletas();
    }
    
    public float calcularEstMediaMaletas() {
        return this.fa.calcularEstMediaMaletas();
    }
    
    // -------------------------------------------------------------------------
    // ---------------------- Estadísticas Trabajadores ------------------------
    public String trabajadorSemana() {
        return this.fa.trabajadorSemana();
    }

    public String trabajadorMes() {
        return this.fa.trabajadorMes();
    }

    public String trabajadorAnho() {
        return this.fa.trabajadorAnho();
    }
}
