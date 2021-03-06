package aplicacion;

import aplicacion.aviones.Aerolinea;
import aplicacion.aviones.Avion;
import aplicacion.aviones.ModeloAvion;
import aplicacion.aviones.Terminal;
import aplicacion.servicios.CocheAlquiler;
import aplicacion.servicios.Tienda;
import aplicacion.usuarios.Usuario;
import aplicacion.vuelos.Vuelo;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import aplicacion.usuarios.TipoSexo;
import aplicacion.usuarios.PersonalLaboral;
import aplicacion.vuelos.TipoAsiento;

public class FachadaAplicacion {

    private final gui.FachadaGui fgui;
    private final baseDatos.FachadaBaseDatos fbd;
    private final GestionUsuarios cu;
    private final GestionServicios cs;
    private final GestionVuelos cv;
    private final GestionAviones ca;
    private final GestionDni cd;
    private Usuario usuarioActual;

    // -------------------------------------------------------------------------
    // ------------------------------ Constructor ------------------------------
    public FachadaAplicacion() {
        this.fgui = new gui.FachadaGui(this);
        this.fbd = new baseDatos.FachadaBaseDatos(this);
        this.cu = new GestionUsuarios(this.fgui, this.fbd);
        this.cs = new GestionServicios(this.fgui, this.fbd);
        this.cv = new GestionVuelos(this.fgui, this.fbd);
        this.ca = new GestionAviones(this.fgui, this.fbd);
        this.cd = new GestionDni();
    }

    //--------------------------------------------------------------------------
    // -------------------------------- Main -----------------------------------
    public static void main(String args[]) {
        FachadaAplicacion fa;

        fa = new FachadaAplicacion();
        fa.iniciaInterfazUsuario();
    }

    //--------------------------------------------------------------------------
    // ------------------------- Getters / Settets -----------------------------
    public Usuario getUsuarioActual() {
        return this.usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    //--------------------------------------------------------------------------
    // ------------------------- Iniciar aplicación ----------------------------
    public void iniciaInterfazUsuario() {
        this.fgui.iniciaVista();
    }

    public void muestraExcepcion(String e) {
        this.fgui.muestraExcepcion(e);
    }

    public boolean comprobarAutentificacion(String idUsuario, String clave) {
        return this.cu.comprobarAutentificacion(idUsuario, clave);
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Vuelos ----------------------------------
    public List<Vuelo> obtenerVuelos(String codigo, String origen, String destino,
                                     Timestamp fechaSalida, Timestamp fechaLlegada) {
        return this.cv.obtenerVuelos(codigo, origen, destino, fechaSalida, fechaLlegada);
    }

    public ArrayList<Terminal> obtenerTerminales() {
        return this.cs.obtenerTerminales();
    }

    public boolean guardarVuelo(Vuelo vuelo) {
        return this.cv.guardarVuelo(vuelo);
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Tiendas ---------------------------------
    public void anhadirTienda(String nombre, int terminal, String tipo) {
        this.cs.anhadirTienda(nombre, terminal, tipo);
    }

    public List<Tienda> obtenerTiendas(String nombre, int codigo, int terminal) {
        return this.cs.obtenerTiendas(nombre, codigo, terminal);
    }

    public void borrarTienda(int terminal, int codigo) {
        this.cs.borrarTienda(terminal, codigo);
    }

    public void editarTienda(int terminal, int codigo, String nombre, String tipo) {
        this.cs.editarTienda(terminal, codigo, nombre, tipo);
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Usuarios --------------------------------
    public String getTipoUsuario(Usuario u) {
        return cu.getTipoUsuario(u);
    }

    public void modificarUsuario(Usuario u, String tipoAnterior, String tipoNuevo) {
        this.cu.modificarUsuario(u, tipoAnterior, tipoNuevo);
    }

    public java.util.List<Usuario> obtenerUsuariosControl(String dni, String id, String nombre,
                                                          String primerApellido, String segundoApellido) {
        return this.cu.obtenerUsuariosControl(dni, id, nombre, primerApellido, segundoApellido);
    }

    public void nuevoUsuario() {
        this.cu.nuevoUsuario();
    }

    public boolean registrarUsuario(Usuario usuario) {
        return this.cu.registrarUsuario(usuario);
    }

    public boolean comprobarId(String text) {
        return this.cu.comprobarId(text);
    }

    public boolean comprobarDni(String dni) {
        return this.cd.dniCorrecto(dni);
    }

    public java.util.List<Usuario> obtenerUsuarios(String dni, String id, String nombre,
                                                   String primerApellido, String segundoApellido) {
        return this.cu.obtenerUsuarios(dni, id, nombre, primerApellido, segundoApellido);
    }

    public boolean borrarUsuario(Usuario u) {
        return this.cu.borrarUsuario(u);
    }

    // ---------------------------------------------------------------------------
    // ------------------------------- Aerolineas --------------------------------    
    public List<Aerolinea> obtenerAerolineas(String nombre) {
        return this.ca.obtenerAerolineas(nombre);
    }

    public void modificarAerolinea(Aerolinea aerolinea) {
        this.ca.modificarAerolinea(aerolinea);
    }

    public Aerolinea getAerolinea(String nombre) {
        return this.ca.getAerolinea(nombre);
    }

    public void anhadirAerolinea(Aerolinea aerolinea) {
        this.ca.anhadirAerolinea(aerolinea);
    }

    public void eliminarAerolineas(List<Aerolinea> aerolineas) {
        this.ca.eliminarAerolineas(aerolineas);
    }

    public boolean esAerolineaBorrable(Aerolinea aerolinea) {
        return this.ca.esAerolineaBorrable(aerolinea);
    }

    // -------------------------------------------------------------------------
    // -------------------------------- Coches ---------------------------------
    public ArrayList<CocheAlquiler> obtenerCoches(String matricula, int numPlazas, String modelo) {
        return this.cs.obtenerCoches(matricula, numPlazas, modelo);
    }

    public void borrarCocheAlquiler(String matricula) {
        this.cs.borrarCocheAlquiler(matricula);
    }

    public void insertarCocheAlquiler(CocheAlquiler co) {
        this.cs.insertarCocheAlquiler(co);
    }
    
    public void actualizarCocheAlquiler(String matricula, float precio) {
        this.cs.actualizarCocheAlquiler(matricula, precio);
    }
    // -------------------------------------------------------------------------
    // -------------------------------- Aviones --------------------------------

    public List<Avion> obtenerAviones(String codigo, String aerolinea, int retirado) {
        return this.ca.obtenerAviones(codigo, aerolinea, retirado);
    }

    public boolean actualizarAviones(List<Avion> aviones) {
        return this.ca.actualizarAviones(aviones);
    }

    public List<ModeloAvion> obtenerModelosAvion(String nombre) {
        return this.ca.obtenerModelosAvion(nombre);
    }

    public boolean añadirAvion(String codigo, Aerolinea aerolinea,
                               ModeloAvion modeloAvion, int anhoFabricacion) {
        return this.ca.añadirAvion(codigo, aerolinea, modeloAvion, anhoFabricacion);
    }

    public void borrarModeloAvion(ModeloAvion modeloAvion) {
        this.ca.borrarModeloAvion(modeloAvion);
    }

    public boolean actualizarModelosAvion(List<ModeloAvion> modelosAvion) {
        return this.ca.actualizarModelosAvion(modelosAvion);
    }
    
    // -------------------------------------------------------------------------
    // ---------------------------- Personal Laboral ---------------------------
    public List<PersonalLaboral> obtenerPersonalLaboral(String dni, String id, String nombre,
                                                        String ape1, String ape2, boolean servicio) {
        return this.cu.obtenerPersonalLaboral(dni, id, nombre, ape1, ape2, servicio);
    }

    public void modLaborDescripPersonalLaboral(PersonalLaboral pl) {
        this.cu.modLaborDescripPersonalLaboral(pl);
    }
    
    // -------------------------------------------------------------------------
    // ------------------------ Estadisticas Aerolineas ------------------------
    public Aerolinea getAerolineaVuelo(Vuelo vuelo) {
        return this.cv.getAerolineaVuelo(vuelo);
    }
    public String getNacionalidadMayoritariaVuelo(Vuelo vuelo) {
        return this.cv.getNacionalidadMayoritariaVuelo(vuelo);
    }
    public Integer getNTipoVuelo(Vuelo vuelo,TipoAsiento ta) {
        return this.cv.getNTipoVuelo(vuelo,ta);
    }
    public Integer getNSexoVuelo(Vuelo vuelo, TipoSexo ts) {
        return this.cv.getNSexoVuelo(vuelo,ts);
    } 
    
    public List<Vuelo> obtenerVuelos(String origen,String destino, Timestamp tSalida) {
        return this.cv.obtenerVuelos(origen, destino,tSalida);
    }
    
    
    //--------------------------------------------------------------------------
    // ----------------------- Estadísticas Usuarios ---------------------------
    public List<String> calcularEstNacionalidades() {
        return this.cu.calcularEstNacionalidades();
    }
    
    public float calcularEstSexo(TipoSexo sexo) {
        return this.cu.calcularEstSexo(sexo);
    }
    
    public float calcularEstBillete(String tipo) {
        return this.cu.calcularEstBillete(tipo);
    }
    
    public float calcularEstCoche() {
        return this.cu.calcularEstCoche();
    }
    
    public float calcularEstAcompanhante() {
        return this.cu.calcularEstAcompanhante();
    }
    
    public float calcularEstMaletas() {
        return this.cu.calcularEstMaletas();
    }
    
    public float calcularEstMediaMaletas() {
        return this.cu.calcularEstMediaMaletas();
    }
   
    // -------------------------------------------------------------------------
    // ---------------------- Estadísticas Trabajadores ------------------------
    public String trabajadorSemana() {
        return this.cu.trabajadorSemana();
    }

    public String trabajadorMes() {
        return this.cu.trabajadorMes();
    }

    public String trabajadorAnho() {
        return this.cu.trabajadorAnho();
    }
    // -------------------------------------------------------------------------
}
