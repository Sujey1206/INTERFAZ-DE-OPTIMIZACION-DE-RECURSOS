package CambioContraseña;
import Inicio.Mensajes;
import Inicio.LoginPersonal;
import Modelo.ConsultasCuentas;
import Modelo.Cuentas;
import java.awt.Color;
public class ContraseñaPersonal extends javax.swing.JFrame {
    Cuentas cu=new Cuentas();
    Mensajes pc = new Mensajes();
    static String pass1,pass2;
    public ContraseñaPersonal() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btncerrar = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        btnVolver = new javax.swing.JButton();
        txtPass2 = new javax.swing.JPasswordField();
        btnRestore = new javax.swing.JButton();
        lblesperando = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncerrar.setBackground(new java.awt.Color(255, 255, 255));
        btncerrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btncerrar.setForeground(new java.awt.Color(255, 255, 255));
        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-80_icon-icons.com_57340 (1).png"))); // NOI18N
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.setFocusPainted(false);
        btncerrar.setFocusable(false);
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 50, 50));

        txtPass.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        txtPass.setBorder(null);
        txtPass.setOpaque(false);
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 290, 30));

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backarrow1_80790.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 620, -1, -1));

        txtPass2.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        txtPass2.setBorder(null);
        txtPass2.setOpaque(false);
        jPanel1.add(txtPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 570, 230, 30));

        btnRestore.setBackground(new java.awt.Color(255, 255, 255));
        btnRestore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRestore.setForeground(new java.awt.Color(255, 255, 255));
        btnRestore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCambiar (2).png"))); // NOI18N
        btnRestore.setBorder(null);
        btnRestore.setBorderPainted(false);
        btnRestore.setContentAreaFilled(false);
        btnRestore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRestore.setFocusPainted(false);
        btnRestore.setFocusable(false);
        btnRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestoreActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestore, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, 140, 60));

        lblesperando.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        lblesperando.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblesperando, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, 280, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/personalC.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 390, 520));

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        jLabel3.setText("Cambio de contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/cambio (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestoreActionPerformed
        pass1=String.valueOf(txtPass.getPassword());
        pass2=String.valueOf(txtPass2.getPassword());
        if(pass1.isEmpty() && pass2.isEmpty())
        {
            pc.Condi6();
            pc.setVisible(true);
        }else{
            if (pass1.isEmpty()) {
                pc.Condi3();
                pc.setVisible(true);
            } else {
                if (pass2.isEmpty()) {
                    pc.Condi4();
                    pc.setVisible(true);
                } else {
                    if (pass1.compareTo(pass2) != 0) {
                        txtPass.setText("");
                        txtPass2.setText("");
                        txtPass.requestFocus();
                        pc.Condi5();
                        pc.setVisible(true);
                    } else {
                        txtPass.setEnabled(false);
                        txtPass2.setEnabled(false);
                        cu.setIdcuenta(getVid());
                        cu.setUsuario(getUsu());
                        cu.setContraseña(Integer.parseInt(pass1));
                        ConsultasCuentas con=new ConsultasCuentas();
                        con.modificar(cu);
                        lblesperando.setText("¡Contraseña cambiada exitosamente!");
                        btnRestore.setEnabled(false);
                    }
                }
            }
        }
        txtPass.setText("");
        txtPass2.setText("");
        txtPass.requestFocus();
    }//GEN-LAST:event_btnRestoreActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        LoginPersonal per=new LoginPersonal();
        per.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    static int vid;
    static String usu;

    public int getVid() {
        return vid;
    }

    public  void setVid(int vid) {
        this.vid = vid;
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }
      
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContraseñaPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestore;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblesperando;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass2;
    // End of variables declaration//GEN-END:variables
}
