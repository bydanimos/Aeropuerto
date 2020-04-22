package gui;

import aplicacion.aviones.Aerolinea;
import aplicacion.servicios.Tienda;
import aplicacion.usuarios.Usuario;
import aplicacion.vuelos.Vuelo;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import javax.swing.JPanel;

public class VAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form VAdministrador
     */
    private aplicacion.FachadaAplicacion fa;
    JPanel panelActual;
    /** Creates new form VAdministrador */
    public VAdministrador(aplicacion.FachadaAplicacion fa) {
        this.fa=fa;
        this.panelActual = new PPrincipal(this);
        initComponents();
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void adminLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLabel1MouseClicked
        this.panelActual.setVisible(false);
        this.panelActual = new PPrincipal(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
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

    // ------------------------------- Usuarios -------------------------------
    public void pulsarUsuarios(){
        this.panelActual.setVisible(false);
        this.panelActual = new PAdminUsuarios(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
        ((PAdminUsuarios)this.panelActual).buscarUsuarios();
    }
    
    public java.util.List<Usuario> obtenerUsuarios(String dni, String id, String nombre, String primerApellido, String segundoApellido){
        return this.fa.obtenerUsuarios(dni,id,nombre,primerApellido,segundoApellido);
    }
    
    public String getTipoUsuario(Usuario u){
        return this.fa.getTipoUsuario(u);
    }
    
    public void modificarUsuario(Usuario u, String tipoAnterior, String tipoNuevo){
        this.fa.modificarUsuario(u,tipoAnterior,tipoNuevo);
    }
    
    public java.util.List<Usuario> obtenerUsuariosControl(String dni, String id, String nombre, String primerApellido, String segundoApellido){
        return this.fa.obtenerUsuariosControl(dni,id,nombre,primerApellido,segundoApellido);
    }

    // ------------------------------- Tiendas -------------------------------
    public void pulsarTiendas() {
        this.panelActual.setVisible(false);
        this.panelActual = new PTiendas(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
        ((PTiendas)this.panelActual).buscarTiendas(true);
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
    
    // ------------------------------- Vuelos -------------------------------
    public void pulsarVuelos() {
        this.panelActual.setVisible(false);
        this.panelActual = new PVuelos(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }
    
    public List<Vuelo> obtenerVuelos(String codigo, String origen, String destino, Timestamp fechaSalida, Timestamp fechaLlegada) {
        return this.fa.obtenerVuelos(codigo, origen, destino, fechaSalida, fechaLlegada);
    }
    
    // ------------------------------- Aerolineas -------------------------------
    
    public void pulsarAerolineas() {
        this.panelActual.setVisible(false);
        this.panelActual = new PAerolineas(this);
        this.panelPrincipalAdministrador.add(this.panelActual);
        this.panelActual.setVisible(true);
    }
    
    public List<Aerolinea> obtenerAerolineas (String nombre){
        return this.fa.obtenerAerolineas(nombre);
    }
            
            
}

