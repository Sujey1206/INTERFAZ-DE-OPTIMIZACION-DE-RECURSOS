package Inicio;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import Controlador.ControladorCuentas;
import Modelo.ConsultasCuentas;
import Modelo.ConsultasPersonal;
import Modelo.Cuentas;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
public class Menu extends javax.swing.JFrame implements Runnable{
    String hora,min,seg;
    Thread hilo;
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        lbFecha.setText(fecha());
        String fecha=fecha();
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
    }
    
    public void hora(){
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        min = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        seg = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    public void run(){
        Thread current = Thread.currentThread();
        while(current==hilo){
            hora();
            lbHora.setText(hora+":"+min+":"+seg);
            String hor=hora+":"+min+":"+seg; 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btndoc = new javax.swing.JButton();
        btnadmin = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JButton();
        lbHora = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/iconT.png"))); // NOI18N
        btndoc.setText("   PERSONAL");
        btndoc.setBorderPainted(false);
        btndoc.setContentAreaFilled(false);
        btndoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndocActionPerformed(evt);
            }
        });
        jPanel1.add(btndoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 220, 70));

        btnadmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/iconJ.png"))); // NOI18N
        btnadmin.setText("  JEFE DE ALMACÉN");
        btnadmin.setBorderPainted(false);
        btnadmin.setContentAreaFilled(false);
        btnadmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });
        jPanel1.add(btnadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, 60));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-80_icon-icons.com_57340 (1).png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 40, 40));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jLabel3.setText("\"Carrocerías Torres\"");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jLabel4.setText("Bienvenido a nuestra empresa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        btnInformacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/User_Manual-80_icon-icons.com_57245.png"))); // NOI18N
        btnInformacion.setBorderPainted(false);
        btnInformacion.setContentAreaFilled(false);
        btnInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInformacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/User_Manual-80_icon-icons.com_57245.png"))); // NOI18N
        btnInformacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/User_Manual-80_icon-icons.com_57245 (1).png"))); // NOI18N
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, -1, 70));

        lbHora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbHora.setText("00:00:00");
        jPanel1.add(lbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 630, 110, -1));

        lbFecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbFecha.setText("DD/MM/YYYY");
        jPanel1.add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 670, 140, -1));
        lbFecha.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 17)); // NOI18N
        jLabel1.setText("La empresa Carrocerías Torres cuenta con 23 años de experiencia  y se dedica a la fabricación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 750, 40));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel6.setText("distrito de Santa  Anita. La empresa esta divida en tres áreas las cuales son el área de");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 720, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel8.setText("está gestionada con métodos tradicionales. ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 380, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel5.setText("carrocerías de madera y metal.Se encuentra ubicado en una zona  industrial en el distrito");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 760, 20));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel9.setText("contamos con un personal calificado y con mucha experiencia laboral. La empresa ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel7.setText("  producción,  de comercialización y área de finanzas, en cada una de estas áreas  ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 700, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/mision-vision-tour-in-peru.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 530, 330));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/MENU.png"))); // NOI18N
        jPanel1.add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 730));

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

    private void btnadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminActionPerformed
        LoginAdministrador admin = new LoginAdministrador();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnadminActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        abrir("MANUAL DE USUARIO-CARROCERIA");
    }//GEN-LAST:event_btnInformacionActionPerformed
    public void abrir(String nombre) {
        try {
            File path = new File(nombre+".pdf");
            Desktop.getDesktop().open(path);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Atención", 2);
        }
    }
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
      MisionVision mision = new MisionVision();
      mision.setVisible(true);
      dispose();  
    }//GEN-LAST:event_jLabel11MouseClicked
    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btndoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lblfondo;
    // End of variables declaration//GEN-END:variables

}
