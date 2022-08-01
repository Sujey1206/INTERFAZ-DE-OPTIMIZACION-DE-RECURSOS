package Inicio;
import CambioContraseña.ContraseñaPersonal;
import static Conexión.Conexion.getConnection;
import Controlador.ControladorRecursos;
import Modelo.*;
import VistaPersonal.RegistroRecursos;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LoginPersonal extends javax.swing.JFrame {

    Timer tiempo;
    Mensajes pc = new Mensajes();
    ContraseñaPersonal contra = new ContraseñaPersonal();
    static int i = 3, segundos = 11, cambio = 0;
    int n;
    String usuario[] = new String[25], user;
    String password[] = new String[25], pass;

    public LoginPersonal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        contenedord.setBackground(new Color(0, 0, 0, 0));
        CuentasPersonal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedord = new javax.swing.JPanel();
        btndoc = new javax.swing.JButton();
        btnadmi = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        btningresar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        mensaje = new javax.swing.JLabel();
        btncambiarcontraseña = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndoc.setText("PERSONAL");
        btndoc.setBorderPainted(false);
        btndoc.setContentAreaFilled(false);
        btndoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndocActionPerformed(evt);
            }
        });
        contenedord.add(btndoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 220, 100));

        btnadmi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadmi.setText("JEFE DE ALMACÉN");
        btnadmi.setBorderPainted(false);
        btnadmi.setContentAreaFilled(false);
        btnadmi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadmiActionPerformed(evt);
            }
        });
        contenedord.add(btnadmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 200, 90));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-80_icon-icons.com_57340 (1).png"))); // NOI18N
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        contenedord.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 40, 40));

        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen4 (1).png"))); // NOI18N
        btningresar.setBorderPainted(false);
        btningresar.setContentAreaFilled(false);
        btningresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        contenedord.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 260, 90));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(false);
        contenedord.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 290, 40));

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpassword.setBorder(null);
        txtpassword.setOpaque(false);
        contenedord.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 280, 40));
        contenedord.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 660, 330, 20));

        btncambiarcontraseña.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btncambiarcontraseña.setText("¿Desea cambiar su contraseña?");
        btncambiarcontraseña.setBorderPainted(false);
        btncambiarcontraseña.setContentAreaFilled(false);
        btncambiarcontraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncambiarcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiarcontraseñaActionPerformed(evt);
            }
        });
        contenedord.add(btncambiarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/traba_1.png"))); // NOI18N
        contenedord.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 380, 530));

        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home_house_building_property_icon_148675.png"))); // NOI18N
        btnMenu.setText("Menu Principal");
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home_house_building_property_icon_148675.png"))); // NOI18N
        btnMenu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        contenedord.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 610, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/fontper.png"))); // NOI18N
        contenedord.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, -1));

        getContentPane().add(contenedord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void CuentasPersonal() {
        Connection conexion = getConnection();
        try {
            n=0;
            Statement leer = conexion.createStatement();
            ResultSet rs = leer.executeQuery("SELECT * FROM cuentas ");
            while (rs.next()) {
                usuario[n] = rs.getString("usuario");
                password[n] = rs.getString("contraseña");
                n++;
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }
    private void btndocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndocActionPerformed
        LoginPersonal doc = new LoginPersonal();
        doc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btndocActionPerformed

    private void btnadmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadmiActionPerformed
        LoginAdministrador admin = new LoginAdministrador();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnadmiActionPerformed
    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed
    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        if (n == 0) {
            JOptionPane.showMessageDialog(null, "No hay profesores registrados", "ERROR", 0);
        } else {
            CuentasPersonal();
            user = txtUsuario.getText();
            pass = String.valueOf(txtpassword.getPassword());
            if (user.isEmpty() && pass.isEmpty()) {
                pc.Condi1();
                pc.setVisible(true);
            } else {
                if (user.isEmpty()) {
                    pc.Condi2();
                    pc.setVisible(true);
                } else {
                    if (pass.isEmpty()) {
                        pc.Condi3();
                        pc.setVisible(true);
                    } else {
                        datosllenos();
                    }
                }
            }
        }
    }//GEN-LAST:event_btningresarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu_principal = new Menu();
        menu_principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed
    String UsuaCambio, ContraCambio;
    private void btncambiarcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambiarcontraseñaActionPerformed
        try {
            UsuaCambio = JOptionPane.showInputDialog(null, "Ingrese el usuario del cual desea cambiar la contraseña: ", "Usuario", 1);
            ContraCambio = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ", "Contraseña", 1);
            cambio = 0;
            for (int j = 0; j < n; j++) {
                if (usuario[j].compareTo(UsuaCambio) == 0 && password[j].compareTo(ContraCambio) == 0) {
                    cambio++;
                    cambiocontraseña();
                }
            }
            if (cambio == 0) {
                JOptionPane.showMessageDialog(null, "¡¡Error!! Este usuario no existe");
            } else {
                contra.setVisible(true);
                dispose();
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "       Operación cancelada", "Advertencia", 0);
        }
    }//GEN-LAST:event_btncambiarcontraseñaActionPerformed
    ContraseñaPersonal contr = new ContraseñaPersonal();

    public void cambiocontraseña() {
        Connection conexion = getConnection();
        try {
            Statement leer = conexion.createStatement();
            ResultSet rs = leer.executeQuery("SELECT * FROM cuentas ");
            while (rs.next()) {
                if (UsuaCambio.compareTo(rs.getString("usuario")) == 0 && ContraCambio.compareTo(rs.getString("contraseña")) == 0) {
                    contr.setVid(rs.getInt("idcuenta"));
                    contr.setUsu(rs.getString("usuario"));
                }
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }

    public void datosllenos() {
        int band = 0;
        for (int j = 0; j < n; j++) {
            if (usuario[j].equals(user) && password[j].equals(pass)) {
                RegistroRecursos vista = new RegistroRecursos();
                Recursos recursos= new Recursos();
                ConsultasRecursos modelo=new ConsultasRecursos();
                Monitoreo monitoreo = new Monitoreo();
                ConsultasMonitoreo modeloM = new ConsultasMonitoreo();
                ConsultasPersonal modeloP = new ConsultasPersonal();
                ControladorRecursos controlador = new ControladorRecursos(vista, recursos, modelo,monitoreo,modeloM,modeloP,user);
                controlador.iniciar();
                vista.setVisible(true);
                dispose();
                band = 1;
                i = 3;
                break;
            } else {
                band = 0;
            }
        }
        if (band == 0) {
            i--;
            if (i != 0) {
                pc.mens(i);
                pc.setVisible(true);
            }
            limpiar();
            if (i == 0) {
                txtpassword.setEnabled(false);
                txtUsuario.setEnabled(false);
                btningresar.setEnabled(false);
                btnadmi.setEnabled(false);
                btndoc.setEnabled(false);
                btnMenu.setEnabled(false);
                tiempo = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        segundos--;
                        mensaje.setText("Espere " + segundos + " para volver a ingresar");
                        if (segundos == 0) {
                            tiempo.stop();
                            txtpassword.setEnabled(true);
                            txtUsuario.setEnabled(true);
                            btningresar.setEnabled(true);
                            btndoc.setEnabled(true);
                            btnadmi.setEnabled(true);
                            btnMenu.setEnabled(true);
                            mensaje.setText("");
                            txtUsuario.requestFocus();
                            i = 3;
                            segundos = 11;
                        }
                    }
                });
                tiempo.start();
            }
        }
    }

    public String usuario() {
        return user;
    }

    public void limpiar() {
        txtUsuario.setText("");
        txtpassword.setText("");
        txtUsuario.requestFocus();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnadmi;
    private javax.swing.JButton btncambiarcontraseña;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btndoc;
    public javax.swing.JButton btningresar;
    private javax.swing.JPanel contenedord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextField txtUsuario;
    public javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables

}
