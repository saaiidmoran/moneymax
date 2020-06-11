/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultarReporte;

import Movimiento.ModificaMov;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;


/**
 *
 * @author Gerardo
 */
public class Reportecompras extends javax.swing.JFrame {

    /**
     * Creates new form Reportecompras
     */
    ConsultasMov a=new ConsultasMov();
    public Reportecompras() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/LOGO.png"));
       setIconImage(icon);
        setVisible(true);
        TablaCompras.setModel(a.ConsultaCompras());
        SumasMov suma=new SumasMov();
        totalcompra.setText("$"+suma.SumaCompras());
        jPanel1.setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonatras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Fecha2 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCompras = new javax.swing.JTable();
        jLabel = new javax.swing.JLabel();
        totalcompra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Fecha1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Clienteid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        empleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        articulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta reporte de compras");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonatras.setBackground(new java.awt.Color(96, 3, 3));
        jButtonatras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonatras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Go-back-icon (Custom).png"))); // NOI18N
        jButtonatras.setBorderPainted(false);
        jButtonatras.setContentAreaFilled(false);
        jButtonatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonatrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("al:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 40, -1));

        Fecha2.setBackground(new java.awt.Color(96, 3, 3));
        getContentPane().add(Fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 110, -1));

        TablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCompras);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 380));

        jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setText("Total de compras:");
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 130, -1));

        totalcompra.setEditable(false);
        totalcompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(totalcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 120, -1));

        jButton1.setBackground(new java.awt.Color(96, 3, 3));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de reporte del:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, -1));

        Fecha1.setBackground(new java.awt.Color(96, 3, 3));
        getContentPane().add(Fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("idEmpleado:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 90, 20));

        fecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 130, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("idCliente:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        Clienteid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Clienteid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteidActionPerformed(evt);
            }
        });
        jPanel1.add(Clienteid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 130, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 60, 20));

        empleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoActionPerformed(evt);
            }
        });
        jPanel1.add(empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 130, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("idCompra:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 80, 20));

        id.setEditable(false);
        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 130, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("id del Articulo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        articulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(articulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 130, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio de compra: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, -1));

        Precio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, -1));

        jButton2.setBackground(new java.awt.Color(96, 3, 3));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 380, 330));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo (Medium).jpg"))); // NOI18N
        jLabelfondo.setText("jLabel1");
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonatrasActionPerformed
       this.dispose();
       Consultar_Reporte  con_reporte=new Consultar_Reporte();
       con_reporte.setVisible(true);
    }//GEN-LAST:event_jButtonatrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       TablaCompras.setModel(a.ConsultaComprasfecha(new SimpleDateFormat("yyyy-MM-dd").format(Fecha1.getDate()),new SimpleDateFormat("yyyy-MM-dd").format(Fecha2.getDate())));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void ClienteidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteidActionPerformed

    private void empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empleadoActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void TablaComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaComprasMouseClicked
        // TODO add your handling code here:
        int seleccion=TablaCompras.rowAtPoint(evt.getPoint());
        id.setText(String.valueOf(TablaCompras.getValueAt(seleccion, 0)));
        fecha.setText(String.valueOf(TablaCompras.getValueAt(seleccion, 1)));
        Precio.setText(String.valueOf(TablaCompras.getValueAt(seleccion, 2)));
        empleado.setText(String.valueOf(TablaCompras.getValueAt(seleccion, 3)));
        Clienteid.setText(String.valueOf(TablaCompras.getValueAt(seleccion, 4)));
        articulo.setText(String.valueOf(TablaCompras.getValueAt(seleccion, 5)));
    }//GEN-LAST:event_TablaComprasMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ModificaMov m=new ModificaMov();
        m.ModificaCompra(id.getText(), fecha.getText(), Precio.getText(), empleado.getText(), Clienteid.getText(), articulo.getText());
        TablaCompras.setModel(a.ConsultaCompras());
        SumasMov suma=new SumasMov();
        totalcompra.setText("$"+suma.SumaCompras());
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Clienteid;
    private com.toedter.calendar.JDateChooser Fecha1;
    private com.toedter.calendar.JDateChooser Fecha2;
    private javax.swing.JTextField Precio;
    private javax.swing.JTable TablaCompras;
    private javax.swing.JTextField articulo;
    public static javax.swing.JTextField empleado;
    public static javax.swing.JTextField fecha;
    public static javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonatras;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField totalcompra;
    // End of variables declaration//GEN-END:variables
}
