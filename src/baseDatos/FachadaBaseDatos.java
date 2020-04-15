/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseDatos;

import aplicacion.*;
import aplicacion.usuarios.*;
import baseDatos.usuarios.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class FachadaBaseDatos {
    private aplicacion.FachadaAplicacion fa;
    private java.sql.Connection conexion;
    private DAOUsuarios daoUsuarios;
    private DAOAdministrador daoAdministradores;
    private DAOPersonalLaboral daoPersonalLaboral;
    private DAOPersonalExterno daoPersonalExterno;

    public FachadaBaseDatos (aplicacion.FachadaAplicacion fa){
        
        Properties configuracion = new Properties();
        this.fa=fa;
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

            
            daoUsuarios = new DAOUsuarios(conexion, fa);
            daoAdministradores = new DAOAdministrador(conexion,fa);
            daoPersonalLaboral = new DAOPersonalLaboral(conexion, fa);
            daoPersonalExterno = new DAOPersonalExterno(conexion, fa);;
          

        } catch (FileNotFoundException f){
            System.out.println(f.getMessage());
            fa.muestraExcepcion(f.getMessage());
        } catch (IOException i){
            System.out.println(i.getMessage());
            fa.muestraExcepcion(i.getMessage());
        } 
        catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
            fa.muestraExcepcion(e.getMessage());
        }
    }
    
    public Usuario validarUsuario(String idUsuario, String clave){
        return daoUsuarios.validarUsuario(idUsuario, clave);
    }
    
    public Administrador validarAdministrador(String id, String clave){
        return daoAdministradores.validarAdministrador(id, clave);
    }
    
    public PersonalLaboral validarPersonalLaboral(String id, String clave){
        return daoPersonalLaboral.validarPersonalLaboral(id, clave);
    }
    
    public PersonalExterno validarPersonalExterno(String id, String clave){
        return daoPersonalExterno.validarPersonalExterno(id, clave);
    }
    
    public Usuario getUsuarioActual() {
        return fa.getUsuarioActual();
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        fa.setUsuarioActual(usuarioActual);
    }
    
    public java.util.List<Usuario> consultarRegistroUsuarios(String id, String dni, String nombre, String ap1, String ap2){
        return daoUsuarios.consultarRegistroUsuarios(id,dni,nombre,ap1,ap2);
    }
    
    public void insertarUsuario(Usuario u){
        daoUsuarios.insertarUsuario(u);
    }
    public void borrarUsuario(String dni){
        daoUsuarios.borrarUsuario(dni);
    }
    public void modificarUsuario(Usuario u){
        daoUsuarios.modificarUsuario(u);
    }
    
    public void insertarAdministrador(Administrador ad){
        daoAdministradores.insertarAdministrador(ad);
    }
    public void borrarAdministrador(String dni){
        daoAdministradores.borrarAdministrador(dni);
    }
    public void modificarAdministrador(Administrador ad){
        daoAdministradores.modificarAdministrador(ad);
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
