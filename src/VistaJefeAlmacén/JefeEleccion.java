package VistaJefeAlmacén;
import Controlador.*;
import Modelo.*;
import Inicio.LoginAdministrador;
import java.awt.Color;
public class JefeEleccion extends javax.swing.JFrame {

    public JefeEleccion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btncerrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAdmDocente = new javax.swing.JButton();
        btnAdmAlumno = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-80_icon-icons.com_57340 (1).png"))); // NOI18N
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 30, 40, 40));

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backarrow1_80790.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 620, -1, -1));

        jButton1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/ICONJT.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 270, 240));

        btnAdmDocente.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnAdmDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/ICONTT.png"))); // NOI18N
        btnAdmDocente.setText("Administrar Personal");
        btnAdmDocente.setBorder(null);
        btnAdmDocente.setBorderPainted(false);
        btnAdmDocente.setContentAreaFilled(false);
        btnAdmDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmDocente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdmDocente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdmDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmDocenteActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdmDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 260, 280));

        btnAdmAlumno.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnAdmAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/recursos.png"))); // NOI18N
        btnAdmAlumno.setText("Administrar Recursos");
        btnAdmAlumno.setBorder(null);
        btnAdmAlumno.setBorderPainted(false);
        btnAdmAlumno.setContentAreaFilled(false);
        btnAdmAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdmAlumno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdmAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 290, 280));

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        jLabel3.setText("Bienvenido Jefe de almacén");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/eleccion.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        LoginAdministrador adm=new LoginAdministrador();
        adm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAdmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmAlumnoActionPerformed
        AdmiRecursos vista = new AdmiRecursos();
        Monitoreo monitoreo= new Monitoreo();
        ConsultasMonitoreo modelo=new ConsultasMonitoreo();
        ControladorMonitoreo controlador = new ControladorMonitoreo(vista, monitoreo, modelo);
        controlador.iniciar();
        ConsultasRecursos modeloR = new ConsultasRecursos();
        Reporte_PDF dis=new Reporte_PDF(modeloR);
        ReporteGeneral_PDF rep=new ReporteGeneral_PDF(modeloR);
        vista.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdmAlumnoActionPerformed

    private void btnAdmDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmDocenteActionPerformed
        AdmiPersonal vista = new AdmiPersonal();
        Personal docente= new Personal();
        ConsultasPersonal modelo=new ConsultasPersonal();
        ControladorPersonal controlador = new ControladorPersonal(vista, docente, modelo);
        controlador.iniciar();
        vista.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdmDocenteActionPerformed

 
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JefeEleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmAlumno;
    private javax.swing.JButton btnAdmDocente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
