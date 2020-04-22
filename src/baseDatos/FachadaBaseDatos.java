/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.aviones.Aerolinea;
import aplicacion.aviones.Avion;
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

    private aplicacion.FachadaAplicacion fa;
    private java.sql.Connection conexion;
    private DAOUsuarios daoUsuarios;
    private DAOAdministrador daoAdministradores;
    private DAOPersonalLaboral daoPersonalLaboral;
    private DAOPersonalExterno daoPersonalExterno;
    private DAOServicios daoServicios;
    private DAOVuelos daoVuelos;
    private DAOAviones daoAviones;

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

    public Usuario validarUsuario(String idUsuario, String clave) {
        return this.daoUsuarios.validarUsuario(idUsuario, clave);
    }

    public Administrador validarAdministrador(String id, String clave) {
        return this.daoAdministradores.validarAdministrador(id, clave);
    }

    public PersonalLaboral validarPersonalLaboral(String id, String clave) {
        return this.daoPersonalLaboral.validarPersonalLaboral(id, clave);
    }

    public PersonalExterno validarPersonalExterno(String id, String clave) {
        return this.daoPersonalExterno.validarPersonalExterno(id, clave);
    }

    public Usuario getUsuarioActual() {
        return this.fa.getUsuarioActual();
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.fa.setUsuarioActual(usuarioActual);
    }

    public java.util.List<Usuario> consultarRegistroUsuarios(String id, String dni, String nombre, String ap1, String ap2) {
        return this.daoUsuarios.consultarRegistroUsuarios(id, dni, nombre, ap1, ap2);
    }

    public boolean registrarUsuario(Usuario u) {
        return this.daoUsuarios.insertarUsuario(u);
    }

    public void borrarUsuario(String dni) {
        this.daoUsuarios.borrarUsuario(dni);
    }

    public void modificarUsuario(Usuario u) {
        this.daoUsuarios.modificarUsuario(u);
    }

    public Usuario getUsuario(String id) {
        return this.daoUsuarios.getUsuario(id);
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

    public java.util.List<Usuario> obtenerUsuariosControl(String dni, String id, String nombre, String primerApellido, String segundoApellido) {
        return this.daoUsuarios.obtenerUsuariosControl(dni, id, nombre, primerApellido, segundoApellido);
    }

    public boolean comprobarId(String text) {
        return this.daoUsuarios.comprobarId(text);
    }

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

    public List<Vuelo> obtenerVuelos(String codigo, String origen, String destino, Timestamp fechaSalida, Timestamp fechaLlegada) {
        return this.daoVuelos.obtenerVuelos(codigo, origen, destino, fechaSalida, fechaLlegada);
    }

    public List<Avion> obtenerAviones(String codigo, String aerolinea, int retirado) {
        return this.daoAviones.obtenerAviones(codigo, aerolinea, retirado);
    }

    public ArrayList<Terminal> obtenerTerminales() {
        return this.daoServicios.obtenerTerminales();
    }
    
    public List<Aerolinea> obtenerAerolineas(String nombre){
        return this.daoAviones.obtenerAerolineas(nombre);
    }

}
