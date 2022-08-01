package VistaPersonal;
import java.util.Date;
import Inicio.LoginPersonal;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class RegistroRecursos extends javax.swing.JFrame implements Runnable{
    String hora,min,seg;
    Thread hilo;
    public String fecha=fecha();
    public String hor;
    public RegistroRecursos() {
        initComponents();
        setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        lbFecha.setText(fecha());
        hilo=new Thread(this);
        hilo.start();
        lbHora2.setVisible(false);
        lbFecha2.setVisible(false);
    }
    public void hora(){
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        min = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
    }
    public void run(){
        Thread current = Thread.currentThread();
        while(current==hilo){
            hora();
            lbHora.setText(hora+":"+min);
            hor=hora+":"+min;
        }
    }
    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtablaRecursos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        txtProv = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();
        txtDesc = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        lbHora = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbHora2 = new javax.swing.JLabel();
        lbFecha2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtIdrec = new javax.swing.JTextField();

        jLabel20.setText("jLabel20");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "REPORTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        JtablaRecursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JtablaRecursos.setSelectionBackground(new java.awt.Color(174, 225, 252));
        JtablaRecursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JtablaRecursosMousePressed(evt);
            }
        });
        JtablaRecursos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JtablaRecursosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(JtablaRecursos);

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/search_book_open_search_locate_6178.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/search_book_open_search_locate_6178 (1).png"))); // NOI18N
        btnBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/search_book_open_search_locate_6178.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 1030, 240));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "DATOS DEL RECURSO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Nombre producto");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 38, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Proveedor");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 77, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Cantidad");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 116, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("Descripción");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 38, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("Fecha");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 78, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 38, 238, -1));
        jPanel3.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 114, 238, -1));
        jPanel3.add(txtProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 76, 238, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setText("Tipo de producto");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 155, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setText("Hora");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 113, -1, 26));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/student_pupil_disciple_follower_adherent_apostle_icon_146774 (1).png"))); // NOI18N
        btnRegistrar.setText("  Registrar Recurso");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/student_pupil_disciple_follower_adherent_apostle_icon_146774 (1).png"))); // NOI18N
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiante48.png"))); // NOI18N
        btnRegistrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiante48.png"))); // NOI18N
        btnRegistrar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 198, -1, -1));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder-498-student-notes-note-education-4212916_114953.png"))); // NOI18N
        btnModificar.setText("   Modificar");
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder-498-student-notes-note-education-4212916_114953.png"))); // NOI18N
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar48.png"))); // NOI18N
        btnModificar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar48.png"))); // NOI18N
        btnModificar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 198, 164, 52));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seo-social-web-network-internet_262_icon-icons.com_61518.png"))); // NOI18N
        btnEliminar.setText("  Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seo-social-web-network-internet_262_icon-icons.com_61518.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar48.png"))); // NOI18N
        btnEliminar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar48.png"))); // NOI18N
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 198, 164, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setText("Costo por unidad");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 158, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/3792081-broom-halloween-magic-witch_109049 (1).png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/3792081-broom-halloween-magic-witch_109049_1.png"))); // NOI18N
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/3792081-broom-halloween-magic-witch_109049 (1).png"))); // NOI18N
        jPanel3.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 190, 164, -1));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Pintura", "Soldadura", "Carroceria" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });
        jPanel3.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 152, 238, -1));
        jPanel3.add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 40, 263, -1));
        jPanel3.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 160, 263, -1));

        lbHora.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbHora.setText("00:00:00");
        jPanel3.add(lbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 110, -1));
        lbHora.getAccessibleContext().setAccessibleName("DD/MM/YYYY");

        lbFecha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbFecha.setText("DD/MM/YYYY");
        jPanel3.add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 78, 140, -1));

        lbHora2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbHora2.setText("00:00:00");
        jPanel3.add(lbHora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 110, -1));

        lbFecha2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbFecha2.setText("DD/MM/YYYY");
        jPanel3.add(lbFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 78, 140, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 1030, 270));

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/CERRART.png"))); // NOI18N
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
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 190, 50));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SOFTWARE/personal.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 680));

        txtIdrec.setText("jTextField1");
        getContentPane().add(txtIdrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
       
    }//GEN-LAST:event_cbTipoActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        LoginPersonal LD = new LoginPersonal();
        LD.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void JtablaRecursosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtablaRecursosMousePressed
        lbHora.setVisible(false);
        lbHora2.setVisible(true);
        lbFecha.setVisible(false);
        lbFecha2.setVisible(true);
        int seleccionar = JtablaRecursos.getSelectedRow();
        txtIdrec.setText(JtablaRecursos.getValueAt(seleccionar, 0).toString());
        txtNombre.setText(JtablaRecursos.getValueAt(seleccionar, 1).toString());
        txtProv.setText(JtablaRecursos.getValueAt(seleccionar, 2).toString());
        txtCant.setText(JtablaRecursos.getValueAt(seleccionar, 3).toString());
        cbTipo.setSelectedItem(JtablaRecursos.getValueAt(seleccionar, 4).toString());
        txtDesc.setText(JtablaRecursos.getValueAt(seleccionar, 5).toString());
        lbFecha2.setText(JtablaRecursos.getValueAt(seleccionar, 6).toString());
        lbHora2.setText(JtablaRecursos.getValueAt(seleccionar, 7).toString());
        txtCosto.setText(JtablaRecursos.getValueAt(seleccionar, 8).toString());
        
    }//GEN-LAST:event_JtablaRecursosMousePressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void JtablaRecursosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtablaRecursosKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP) || (evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            int seleccionar = JtablaRecursos.getSelectedRow();
            txtIdrec.setText(JtablaRecursos.getValueAt(seleccionar, 0).toString());
            txtNombre.setText(JtablaRecursos.getValueAt(seleccionar, 1).toString());
            txtProv.setText(JtablaRecursos.getValueAt(seleccionar, 2).toString());
            txtCant.setText(JtablaRecursos.getValueAt(seleccionar, 3).toString());
            cbTipo.setSelectedItem(JtablaRecursos.getValueAt(seleccionar, 4).toString());
            txtDesc.setText(JtablaRecursos.getValueAt(seleccionar, 5).toString());
            lbFecha2.setText(JtablaRecursos.getValueAt(seleccionar, 6).toString());
            lbHora2.setText(JtablaRecursos.getValueAt(seleccionar, 7).toString());
            txtCosto.setText(JtablaRecursos.getValueAt(seleccionar, 8).toString());
        }
    }//GEN-LAST:event_JtablaRecursosKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroRecursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable JtablaRecursos;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lbFecha;
    public javax.swing.JLabel lbFecha2;
    public javax.swing.JLabel lbHora;
    public javax.swing.JLabel lbHora2;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtCant;
    public javax.swing.JTextField txtCosto;
    public javax.swing.JTextField txtDesc;
    public javax.swing.JTextField txtIdrec;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtProv;
    // End of variables declaration//GEN-END:variables
}
