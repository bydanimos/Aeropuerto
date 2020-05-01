
package baseDatos;

import aplicacion.aviones.Aerolinea;
import aplicacion.aviones.Avion;
import aplicacion.aviones.ModeloAvion;
import aplicacion.aviones.Terminal;
import aplicacion.usuarios.*;
import baseDatos.usuarios.*;
import aplicacion.servicios.*;
import aplicacion.vuelos.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class FachadaBaseDatos {

    private final aplicacion.FachadaAplicacion fa;
    private java.sql.Connection conexion;
    private DAOUsuarios daoUsuarios;
    private DAOAdministrador daoAdministradores;
    private DAOPersonalLaboral daoPersonalLaboral;
    private DAOPersonalExterno daoPersonalExterno;
    private DAOServicios daoServicios;
    private DAOVuelos daoVuelos;
    private DAOAviones daoAviones;

    // -------------------------------------------------------------------------
    // ------------------------------ Constructor ------------------------------
    public FachadaBaseDatos(aplicacion.FachadaAplicacion fa) {

        Properties configuracion = new Properties();
        this.fa = fa;
        FileInputStream arqConfiguracion;

        try {
            arqConfiguracion = new FileInputStream("baseDatos.properties");
            configuracion.load(arqConfiguracion);
            arqConfiguracion.close();

            Properties usuario = new Properties();

            String gestor = configuracion.getProperty("gestor");

            usuario.setProperty("user", configuracion.getProperty("usuario"));
            usuario.setProperty("password", configuracion.getProperty("clave"));
            this.conexion = java.sql.DriverManager.getConnection("jdbc:" + gestor + "://"
                    + configuracion.getProperty("servidor") + ":"
                    + configuracion.getProperty("puerto") + "/"
                    + configuracion.getProperty("baseDatos"),
                    usuario);

            this.daoUsuarios = new DAOUsuarios(this.conexion, this.fa);
            this.daoAdministradores = new DAOAdministrador(this.conexion, this.fa);
            this.daoPersonalLaboral = new DAOPersonalLaboral(this.conexion, this.fa);
            this.daoPersonalExterno = new DAOPersonalExterno(this.conexion, this.fa);
            this.daoServicios = new DAOServicios(this.conexion, this.fa);
            this.daoVuelos = new DAOVuelos(this.conexion, this.fa);
            this.daoAviones = new DAOAviones(this.conexion, this.fa);

        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
            this.fa.muestraExcepcion(f.getMessage());
        } catch (IOException i) {
            System.out.println(i.getMessage());
            this.fa.muestraExcepcion(i.getMessage());
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            this.fa.muestraExcepcion(e.getMessage());
        }
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Usuario -------------------------------
    public Usuario validarUsuario(String idUsuario, String clave) {
        return this.daoUsuarios.validarUsuario(idUsuario, clave);
    }

    public Usuario getUsuarioActual() {
        return this.fa.getUsuarioActual();
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.fa.setUsuarioActual(usuarioActual);
    }

    public boolean borrarUsuario(String dni) {
        return this.daoUsuarios.borrarUsuario(dni);
    }

    public void modificarUsuario(Usuario u) {
        this.daoUsuarios.modificarUsuario(u);
    }

    public Usuario getUsuario(String id) {
        return this.daoUsuarios.getUsuario(id);
    }

    // -------------------------------------------------------------------------
    // ----------------------------- Usuario General ---------------------------
    public void modificarUsuarioGeneral(Usuario u, String tipoAnterior, String tipoNuevo) {
        if (!tipoAnterior.equals(tipoNuevo)) {
            if (!tipoAnterior.equals("Usuario")) {
                this.borrarTipo(u, tipoAnterior);
            }
            if (!tipoNuevo.equals("Usuario")) {
                this.insertarTipo(u, tipoNuevo);
            }
        }
        this.modificarUsuario(u);
    }

    // -------------------------------------------------------------------------
    // ----------------------------- Administrador -----------------------------
    public Administrador validarAdministrador(String id, String clave) {
        return this.daoAdministradores.validarAdministrador(id, clave);
    }

    public void insertarAdministrador(Administrador ad) {
        this.daoAdministradores.insertarAdministrador(ad);
    }

    public void borrarAdministrador(String dni) {
        this.daoAdministradores.borrarAdministrador(dni);
    }

    public void modificarAdministrador(Administrador ad) {
        this.daoAdministradores.modificarAdministrador(ad);
    }

    public Administrador getAdministrador(String id) {
        return this.daoAdministradores.getAdministrador(id);
    }

    // -------------------------------------------------------------------------
    // ---------------------------- Personal Laboral ---------------------------
    public PersonalLaboral validarPersonalLaboral(String id, String clave) {
        return this.daoPersonalLaboral.validarPersonalLaboral(id, clave);
    }

    public void insertarPersonalLaboral(PersonalLaboral pl) {
        this.daoPersonalLaboral.insertarPersonalLaboral(pl);
    }

    public void borrarPersonalLaboral(String dni) {
        this.daoPersonalLaboral.borrarPersonalLaboral(dni);
    }

    public void modificarPersonalLaboral(PersonalLaboral pl) {
        this.daoPersonalLaboral.modificarPersonalLaboral(pl);
    }

    public PersonalLaboral getPersonalLaboral(String dni) {
        return this.daoPersonalLaboral.getPersonalLaboral(dni);
    }
    
    public List<PersonalLaboral> obtenerPersonalLaboral(String dni, String id, 
            String nombre, String ape1, String ape2, boolean servicio) {
        return this.daoPersonalLaboral.obtenerPersonalLaboral(dni, id, nombre, ape1, ape2, servicio);
    }

    // -------------------------------------------------------------------------
    // ---------------------------- Personal Externo ---------------------------
    public PersonalExterno validarPersonalExterno(String id, String clave) {
        return this.daoPersonalExterno.validarPersonalExterno(id, clave);
    }

    public void insertarPersonalExterno(PersonalExterno pe) {
        this.daoPersonalExterno.insertarPersonalExterno(pe);
    }

    public void borrarPersonalExterno(String dni) {
        this.daoPersonalExterno.borrarPersonalExterno(dni);
    }

    public void modificarPersonalExterno(PersonalExterno pe) {
        this.daoPersonalExterno.modificarPersonalExterno(pe);
    }

    public PersonalExterno getPersonalExterno(String id) {
        return this.daoPersonalExterno.getPersonalExterno(id);
    }

    // -------------------------------------------------------------------------
    // ----------------------------- Registro Usuario --------------------------
    public java.util.List<Usuario> consultarRegistroUsuarios(String id, String dni, String nombre, String ap1, String ap2) {
        return this.daoUsuarios.consultarRegistroUsuarios(id, dni, nombre, ap1, ap2);
    }

    public boolean registrarUsuario(Usuario u) {
        return this.daoUsuarios.insertarUsuario(u);
    }

    // -------------------------------------------------------------------------
    // ----------------------------- Tipo Usuarios -----------------------------
    public String getTipoUsuario(Usuario u) {
        if (this.getAdministrador(u.getDni()) != null) {
            return "Administrador";
        } else if (this.getPersonalExterno(u.getDni()) != null) {
            return "Personal Externo";
        } else if (this.getPersonalLaboral(u.getDni()) != null) {
            return "Personal Laboral";
        } else {
            return "Usuario";
        }
    }

    public void borrarTipo(Usuario u, String tipoAnterior) {
        switch (tipoAnterior) {
            case "Administrador":
                this.borrarAdministrador(u.getDni());
                break;
            case "Personal Laboral":
                this.borrarPersonalLaboral(u.getDni());
                break;
            case "Personal Externo":
                this.borrarPersonalExterno(u.getDni());
                break;
        }
    }

    public void insertarTipo(Usuario u, String tipoNuevo) {
        switch (tipoNuevo) {
            case "Administrador":
                Administrador adm = new Administrador(u.getDni(), u.getId(), u.getContrasenha(), u.getCorreoElectronico(), u.getNombre(),
                        u.getApellido1(), u.getApellido2(), u.getSexo(), u.getPaisProcedencia(), u.getTelefono());
                this.insertarAdministrador(adm);
                break;
            case "Personal Laboral":
                PersonalLaboral pl = new PersonalLaboral(u.getDni(), u.getId(), u.getContrasenha(), u.getCorreoElectronico(), u.getNombre(),
                        u.getApellido1(), u.getApellido2(), u.getSexo(), u.getPaisProcedencia(), u.getTelefono());
                this.insertarPersonalLaboral(pl);
                break;
            case "Personal Externo":
                PersonalExterno pe = new PersonalExterno(u.getDni(), u.getId(), u.getContrasenha(), u.getCorreoElectronico(), u.getNombre(),
                        u.getApellido1(), u.getApellido2(), u.getSexo(), u.getPaisProcedencia(), u.getTelefono());
                this.insertarPersonalExterno(pe);
                break;
        }
    }

    // -------------------------------------------------------------------------
    // ---------------------------- Control Usuarios ---------------------------
    public java.util.List<Usuario> obtenerUsuariosControl(String dni, String id, String nombre, String primerApellido, String segundoApellido) {
        return this.daoUsuarios.obtenerUsuariosControl(dni, id, nombre, primerApellido, segundoApellido);
    }

    public boolean comprobarId(String text) {
        return this.daoUsuarios.comprobarId(text);
    }

    // -------------------------------------------------------------------------
    // -------------------------------- Tiendas --------------------------------
    public List<Tienda> obtenerTiendas(String nombre, int codigo, int terminal) {
        return this.daoServicios.obtenerTiendas(nombre, codigo, terminal);
    }

    public void anhadirTienda(String nombre, int terminal, String tipo) {
        this.daoServicios.anhadirTienda(nombre, terminal, tipo);
    }

    public void borrarTienda(int terminal, int codigo) {
        this.daoServicios.borrarTienda(terminal, codigo);
    }

    public void editarTienda(int terminal, int codigo, String nombre, String tipo) {
        this.daoServicios.editarTienda(terminal, codigo, nombre, tipo);
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Vuelos --------------------------------
    public List<Vuelo> obtenerVuelos(String codigo, String origen, String destino, Timestamp fechaSalida, Timestamp fechaLlegada) {
        return this.daoVuelos.obtenerVuelos(codigo, origen, destino, fechaSalida, fechaLlegada);
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Terminales ------------------------------
    public ArrayList<Terminal> obtenerTerminales() {
        return this.daoServicios.obtenerTerminales();
    }

    public boolean guardarVuelo(Vuelo vuelo) {
        return this.daoVuelos.guardarVuelo(vuelo);
    }

    // -------------------------------------------------------------------------
    // ------------------------------- Aerolíneas ------------------------------
    public void modificarAerolinea(Aerolinea aerolinea) {
        this.daoAviones.modificarAerolinea(aerolinea);
    }

    public Aerolinea getAerolinea(String nombre) {
        return this.daoAviones.getAerolinea(nombre);
    }

    public void anhadirAerolinea(Aerolinea aerolinea) {
        this.daoAviones.anhadirAerolinea(aerolinea);
    }

    public void eliminarAerolineas(List<Aerolinea> aerolineas) {
        this.daoAviones.eliminarAerolineas(aerolineas);
    }

    public boolean esAerolineaBorrable(Aerolinea aerolinea) {
        return this.daoAviones.esAerolineaBorrable(aerolinea);
    }

    public List<Aerolinea> obtenerAerolineas(String nombre) {
        return this.daoAviones.obtenerAerolineas(nombre);
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Coches --------------------------------
    public ArrayList<CocheAlquiler> obtenerCoches(String matricula, int numPlazas, String modelo) {
        return this.daoServicios.obtenerCoches(matricula, numPlazas, modelo);
    }

    public void borrarCocheAlquiler(String matricula) {
        this.daoServicios.borrarCocheAlquiler(matricula);
    }

    public void insertarCocheAlquiler(CocheAlquiler co) {
        this.daoServicios.insertarCocheAlquiler(co);
    }

    // -------------------------------------------------------------------------
    // --------------------------------- Aviones -------------------------------
    public List<Avion> obtenerAviones(String codigo, String aerolinea, int retirado) {
        return this.daoAviones.obtenerAviones(codigo, aerolinea, retirado);
    }

    public boolean actualizarAvion(Avion avion) {
        return this.daoAviones.actualizarAvion(avion);
    }

    public List<ModeloAvion> obtenerModelosAvion(String nombre) {
        return this.daoAviones.obtenerModelosAvion(nombre);
    }

    public boolean añadirAvion(String codigo, Aerolinea aerolinea, ModeloAvion modeloAvion, int anhoFabricacion) {
        return this.daoAviones.añadirAvion(codigo, aerolinea, modeloAvion, anhoFabricacion);
    }

    public void borrarModeloAvion(ModeloAvion modeloAvion) {
        this.daoAviones.borrarModeloAvion(modeloAvion);
    }

    public boolean actualizarModeloAvion(ModeloAvion modeloAvion) {
        return this.daoAviones.actualizarModeloAvion(modeloAvion);
    }
    
    // -------------------------------------------------------------------------
    // --------------------------- Estadisticas Vuelos --------------------------
    public Aerolinea getAerolineaVuelo(Vuelo vuelo){
        return this.daoVuelos.getAerolineaVuelo(vuelo);
    }
    
    public String getNacionalidadMayoritariaVuelo(Vuelo vuelo){
        return this.daoVuelos.getNacionalidadMayoritariaVuelo(vuelo);
    }
    public Integer getNTipoVuelo(Vuelo vuelo,TipoAsiento ta){
        return this.daoVuelos.getNTipoVuelo(vuelo,ta);
    }
    public Integer getNSexoVuelo(Vuelo vuelo, TipoSexo ts){
        return this.daoVuelos.getNSexoVuelo(vuelo,ts);
    }
    
    public List<Vuelo> obtenerVuelos(String origen,String destino,Timestamp tSalida){
        return this.daoVuelos.obtenerVuelos("",origen, destino,tSalida,null);
    }
    //--------------------------------------------------------------------

}
