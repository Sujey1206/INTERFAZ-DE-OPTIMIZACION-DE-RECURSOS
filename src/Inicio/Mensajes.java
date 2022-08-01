package Inicio;
import java.awt.Color;
public class Mensajes extends javax.swing.JFrame {
    public Mensajes() {
        initComponents();
        setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));
    }
    public void mens(int i){
        lblmensaje.setText("Los campos usuario y contraseña están incorrectos ");
        lblmensaje1.setText("le quedan "+i+" intento(s) ");
    }   
    public void Condi1(){
        lblmensaje.setText("Los campos usuario y contraseña están vacios ");
        lblmensaje1.setText("Complete los campos por favor ");
    }
    public void Condi2(){
        lblmensaje.setText("El campo usuario está vacio ");
        lblmensaje1.setText("Complete el campo por favor ");
    }
    public void Condi3(){
        lblmensaje.setText("El campo contraseña está vacio ");
        lblmensaje1.setText("Complete el campo por favor ");
    }
    public void Condi4(){
        lblmensaje.setText("El campo confirmar contraseña está vacio ");
        lblmensaje1.setText("Complete el campo por favor ");
    }
    public void Condi5(){
        lblmensaje.setText("Los campos contraseña no coinciden");
        lblmensaje1.setText("Verifique su contraseña por favor");
    }
    public void Condi6(){
        lblmensaje.setText("Los campos están vacios ");
        lblmensaje1.setText("Complete los campos por favor ");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblmensaje = new javax.swing.JLabel();
        lblmensaje1 = new javax.swing.JLabel();
        btnboton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(174, 225, 252), 6));
        jPanel1.setForeground(new java.awt.Color(174, 225, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblmensaje.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblmensaje.setForeground(new java.awt.Color(126, 206, 233));
        lblmensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 320, 30));

        lblmensaje1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblmensaje1.setForeground(new java.awt.Color(126, 206, 233));
        lblmensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 230, 30));

        btnboton.setBackground(new java.awt.Color(174, 225, 242));
        btnboton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnboton.setForeground(new java.awt.Color(255, 255, 255));
        btnboton.setText("OK");
        btnboton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        btnboton.setBorderPainted(false);
        btnboton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnboton.setFocusable(false);
        btnboton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnboton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbotonActionPerformed(evt);
            }
        });
        jPanel1.add(btnboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbotonActionPerformed
        dispose(); 
    }//GEN-LAST:event_btnbotonActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mensajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnboton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblmensaje1;
    // End of variables declaration//GEN-END:variables
}
