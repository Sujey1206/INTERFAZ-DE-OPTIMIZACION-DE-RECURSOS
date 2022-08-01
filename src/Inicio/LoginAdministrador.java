package Inicio;
import Controlador.ControladorCuentas;
import Modelo.ConsultasCuentas;
import Modelo.ConsultasPersonal;
import Modelo.Cuentas;
import VistaJefeAlmacén.JefeEleccion;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class LoginAdministrador extends javax.swing.JFrame {
    Timer tiempo;
    Mensajes pc = new Mensajes();
    static int i = 3, segundos = 11, n = 0;
    static String usuario[] = new String[25], user;
    static String password[] = new String[25], pass;
    public LoginAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        Contenedor.setBackground(new Color(0, 0, 0, 0));
        usuario[0] = "admin";
        password[0] = "admin";
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        Contenedor = new javax.swing.JPanel();
        btndoc = new javax.swing.JButton();
        btnadmi = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btningresar = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Contenedor.add(btndoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 190, 70));

        btnadmi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadmi.setText("JEFE DE ALMACÉN");
        btnadmi.setBorderPainted(false);
        btnadmi.setContentAreaFilled(false);
        btnadmi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnadmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadmiActionPerformed(evt);
            }
        });
        Contenedor.add(btnadmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 200, 90));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(false);
        Contenedor.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 270, 40));

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpassword.setBorder(null);
        txtpassword.setOpaque(false);
        Contenedor.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 270, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/JEFE (1).png"))); // NOI18N
        jLabel6.setText(".");
        Contenedor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 380, 530));

        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen4 (1).png"))); // NOI18N
        btningresar.setBorderPainted(false);
        btningresar.setContentAreaFilled(false);
        btningresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        Contenedor.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 260, 90));
        Contenedor.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 330, 20));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-80_icon-icons.com_57340 (1).png"))); // NOI18N
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        Contenedor.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 40, 40));

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
        Contenedor.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 610, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/JEFEALMACEN (1) (1).png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1121, 735));
        Contenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 740));

        getContentPane().add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndocActionPerformed
        ConsultasPersonal modeloD = new ConsultasPersonal();
        LoginPersonal vista = new LoginPersonal();
        Cuentas cuentas = new Cuentas();
        ConsultasCuentas modeloCD= new ConsultasCuentas();
        ControladorCuentas controlador = new ControladorCuentas(vista, cuentas, modeloCD, modeloD);
        controlador.iniciarD();
        vista.setVisible(true);
        dispose();
    }//GEN-LAST:event_btndocActionPerformed

    private void btnadmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadmiActionPerformed
        LoginAdministrador admin = new LoginAdministrador();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnadmiActionPerformed

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
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
    }//GEN-LAST:event_btningresarActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu_principal = new Menu();
        menu_principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed
      
      public void datosllenos() {
        int band = 0;
        for (int j = 0; j <= n; j++) {
            if (usuario[j].equals(user) && password[j].equals(pass)) {
                JefeEleccion admi = new JefeEleccion();                
                admi.setVisible(true);
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
                            btnadmi.setEnabled(true);
                            btndoc.setEnabled(true);
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
    
     public void limpiar() {
        txtUsuario.setText("");
        txtpassword.setText("");
        txtUsuario.requestFocus();
    }
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnadmi;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btndoc;
    private javax.swing.JButton btningresar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables

}