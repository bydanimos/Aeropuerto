/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseDatos;

import aplicacion.usuarios.*;
import baseDatos.usuarios.*;
import aplicacion.servicios.*;
import aplicacion.vuelos.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
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

    public FachadaBaseDatos (aplicacion.FachadaAplicacion fa){
        
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
            this.conexion=java.sql.DriverManager.getConnection("jdbc:"+gestor+"://"+
                    configuracion.getProperty("servidor")+":"+
                    configuracion.getProperty("puerto")+"/"+
                    configuracion.getProperty("baseDatos"),
                    usuario);

            
            this.daoUsuarios = new DAOUsuarios(this.conexion, this.fa);
            this.daoAdministradores = new DAOAdministrador(this.conexion,this.fa);
            this.daoPersonalLaboral = new DAOPersonalLaboral(this.conexion, this.fa);
            this.daoPersonalExterno = new DAOPersonalExterno(this.conexion, this.fa);
            this.daoServicios = new DAOServicios(this.conexion, this.fa);
            this.daoVuelos = new DAOVuelos(this.conexion, this.fa);
          

        } catch (FileNotFoundException f){
            System.out.println(f.getMessage());
            this.fa.muestraExcepcion(f.getMessage());
        } catch (IOException i){
            System.out.println(i.getMessage());
            this.fa.muestraExcepcion(i.getMessage());
        } 
        catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
            this.fa.muestraExcepcion(e.getMessage());
        }
    }
    
    public Usuario validarUsuario(String idUsuario, String clave){
        return this.daoUsuarios.validarUsuario(idUsuario, clave);
    }
    
    public Administrador validarAdministrador(String id, String clave){
        return this.daoAdministradores.validarAdministrador(id, clave);
    }
    
    public PersonalLaboral validarPersonalLaboral(String id, String clave){
        return this.daoPersonalLaboral.validarPersonalLaboral(id, clave);
    }
    
    public PersonalExterno validarPersonalExterno(String id, String clave){
        return this.daoPersonalExterno.validarPersonalExterno(id, clave);
    }
    
    public Usuario getUsuarioActual() {
        return this.fa.getUsuarioActual();
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.fa.setUsuarioActual(usuarioActual);
    }
    
    public java.util.List<Usuario> consultarRegistroUsuarios(String id, String dni, String nombre, String ap1, String ap2){
        return this.daoUsuarios.consultarRegistroUsuarios(id,dni,nombre,ap1,ap2);
    }
    
    public boolean registrarUsuario(Usuario u){
        return this.daoUsuarios.insertarUsuario(u);
    }
    public void borrarUsuario(String dni){
        this.daoUsuarios.borrarUsuario(dni);
    }
    public void modificarUsuario(Usuario u){
        this.daoUsuarios.modificarUsuario(u);
    }
    
    public void insertarAdministrador(Administrador ad){
        this.daoAdministradores.insertarAdministrador(ad);
    }
    public void borrarAdministrador(String dni){
        this.daoAdministradores.borrarAdministrador(dni);
    }
    public void modificarAdministrador(Administrador ad){
        this.daoAdministradores.modificarAdministrador(ad);
    }
    
    public boolean comprobarId(String text) {
        return this.daoUsuarios.comprobarId(text);
    }
    
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
    
    public List<Vuelo> obtenerVuelos(String codigo, String origen, String destino, Timestamp fechaSalida, Timestamp fechaLlegada) {
        return this.daoVuelos.obtenerVuelos(codigo, origen, destino, fechaSalida, fechaLlegada);
    }
    
    /*public java.util.List<Libro> consultarCatalogo(Integer id, String titulo, String isbn, String autor){
        return daoLibros.consultarCatalogo(id, titulo, isbn, autor);
    }

    public Libro consultarLibro(Integer idLibro){
        return daoLibros.consultarLibro(idLibro);
    }
    public java.util.List<Ejemplar> consultarEjemplaresLibro(Integer idLibro){
        return daoLibros.consultarEjemplaresLibro(idLibro);
    }
    public java.util.List<String> obtenerRestoCategorias(Integer idLibro){
        return daoLibros.obtenerRestoCategorias(idLibro);
    }
    public Integer insertarLibro(Libro libro){
       return daoLibros.insertarLibro(libro);
    }
    public void borrarLibro(Integer idLibro){
        daoLibros.borrarLibro(idLibro);
    }
    public void modificarLibro(Libro libro){
         daoLibros.modificarLibro(libro);
    }
    public void modificarCategoriasLibro(Integer idLibro, java.util.List<String> categorias){
       daoLibros.modificarCategoriasLibro(idLibro, categorias);
    }
    public void insertarEjemplarLibro(Integer idLibro, Ejemplar ejemplar){
        daoLibros.insertarEjemplarLibro(idLibro, ejemplar);
    }
    public void borrarEjemplaresLibro(Integer idLibro, java.util.List<Integer> numsEjemplar){
        daoLibros.borrarEjemplaresLibro(idLibro, numsEjemplar);
    }
    public void modificarEjemplarLibro(Integer idLibro, Ejemplar ejemplar){
        daoLibros.modificarEjemplarLibro(idLibro, ejemplar);
    }

    public Usuario validarUsuario(String idUsuario, String clave){
        return daoUsuarios.validarUsuario(idUsuario, clave);
    }
   
    public java.util.List<Categoria> consultarCategorias(){
        return daoCategorias.consultarCategorias();
    }

    
    public java.util.List<Usuario> consultarRegistroUsuarios(String id, String nombre){
        return daoUsuarios.consultarRegistroUsuarios(id,nombre);
    }
    
    public void nuevoUsuario(Usuario u){
        daoUsuarios.insertarUsuario(u);
    }
    
    public void borrarUsuario(String id){
        daoUsuarios.borrarUsuario(id);
    }
    
    public void modificarUsuario(Usuario u){
        daoUsuarios.modificarUsuario(u);
    }
    
    public boolean existenPrestamos(Usuario u){
        return daoPrestamos.existenPrestamos(u);
    }
    
    public Integer getCuantosPrestamosVencidos(String id){
        return daoPrestamos.getCuantosPrestamosVencidos(id);
    }
    
    public Prestamo getPrestamo(Ejemplar ej){
        return daoPrestamos.getPrestamo(ej);
    }
    
    public void anhadirCategoria(String nombre, String descripcion){
        daoCategorias.anhadirCategoria(nombre,descripcion);
    }
    
    public void borrarCategoria(String nombre){
        daoCategorias.borrarCategoria(nombre);
    }
    
    public boolean tieneLibros(String nombre){
        return daoCategorias.tieneLibros(nombre);
    }
    
    /*public boolean tienePrestamosVencidos(String id){
        return daoPrestamos.tienePrestamosVencidos(id);
    }
    
    public void realizarPrestamo(Ejemplar ejemplar, String id){
        daoPrestamos.realizarPrestamo(ejemplar,id);
    }
    
    public void devolverEjemplar(Ejemplar ej){
        daoPrestamos.devolverEjemplar(ej);
    }
    
    public boolean existeCategoria(String nombre){
        return daoCategorias.existeCategoria(nombre);
    }
    
    public void modificarCategoria(String nombre, String descripcion){
        daoCategorias.modificarCategoria(nombre, descripcion);
    }
    
    public Categoria getCategoria(String nombre){
        return daoCategorias.getCategoria(nombre);
    }
    
    public boolean existeRegistroPrestamo(Ejemplar ej){
        return daoPrestamos.existeRegistroPrestamo(ej);
    }
    
    public Libro getLibro(Integer id){
        return daoLibros.consultarLibro(id);
    }*/


}
