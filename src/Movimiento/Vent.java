/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimiento;


import casadeempeños.Inicio_sesion;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Almacen.Consultas;
import java.awt.Component;

/**
 *
 * @author saaii
 */

public class Vent extends javax.swing.JPanel {

    /**
     * Creates new form Vent
     */
    RegistroMov reg=new RegistroMov();
    public Vent() {
        initComponents();
        PanelCliente.setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        empatiend2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FechaVenta = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        idArticulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PrecioVenta = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PanelCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NombreCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TelefonoCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        idCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Atiende: ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        empatiend2.setEditable(false);
        empatiend2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        empatiend2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatiend2ActionPerformed(evt);
            }
        });
        add(empatiend2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 100, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));
        add(FechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 130, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("id del articulo: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        idArticulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(idArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 110, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio de venta: ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        PrecioVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(PrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 110, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("VENTA");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        PanelCliente.setBackground(new java.awt.Color(0, 0, 0));
        PanelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del cliente: ");
        PanelCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        NombreCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreClienteActionPerformed(evt);
            }
        });
        NombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreClienteKeyTyped(evt);
            }
        });
        PanelCliente.add(NombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 100, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono: ");
        PanelCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        TelefonoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PanelCliente.add(TelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Datos del cliente:");
        PanelCliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Ok");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PanelCliente.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        PanelCliente.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 640, 80));

        add(PanelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 680, 170));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("idCliente:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        idCliente.setEditable(false);
        idCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Datos de la venta:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void empatiend2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatiend2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empatiend2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         for(Component c:this.getComponents()){
                c.setEnabled(false);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Consultas con=new Consultas();
        if("En Venta".equals(con.ConsultaArt(idArticulo.getText()))){
       reg.RegistraVenta(new SimpleDateFormat("yyyy-MM-dd").format(FechaVenta.getDate()),PrecioVenta.getText(), Inicio_sesion.id, idArticulo.getText(),idCliente.getText());
      
       con.actualizart(idArticulo.getText());
        for(Component c:this.getComponents()){
                c.setEnabled(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"El articulo que desea vender no está a la venta");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if("No existe".equals(reg.ConsultaCliente(NombreCliente.getText()))){
          reg.InsertarClinte(NombreCliente.getText(), TelefonoCliente.getText());
          idCliente.setText(reg.ConsultaultCliente());
        }
        else{
            idCliente.setText(reg.ConsultaCliente(NombreCliente.getText()));
        }
         for(Component c:PanelCliente.getComponents()){
                c.setEnabled(false);
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void NombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreClienteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int seleccion=jTable1.rowAtPoint(evt.getPoint());
        String id=String.valueOf(jTable1.getValueAt(seleccion, 0));
        String nombre=String.valueOf(jTable1.getValueAt(seleccion,1));
        String telefono=String.valueOf(jTable1.getValueAt(seleccion,2));
        NombreCliente.setText(nombre);
        TelefonoCliente.setText(telefono);
    }//GEN-LAST:event_jTable1MouseClicked

    private void NombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreClienteKeyTyped
        // TODO add your handling code here:
        ClientesSQL a=new ClientesSQL();
         String busqueda=NombreCliente.getText()+evt.getKeyChar();
         jTable1.setModel(a.Consultapornombre(busqueda));
    }//GEN-LAST:event_NombreClienteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaVenta;
    private javax.swing.JTextField NombreCliente;
    private javax.swing.JPanel PanelCliente;
    private javax.swing.JTextField PrecioVenta;
    private javax.swing.JTextField TelefonoCliente;
    public static javax.swing.JTextField empatiend2;
    private javax.swing.JTextField idArticulo;
    private javax.swing.JTextField idCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}