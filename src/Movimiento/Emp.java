/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimiento;

import Almacen.Consultas;
import casadeempeños.Inicio_sesion;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author saaii
 */
public class Emp extends javax.swing.JPanel {

    /**
     * Creates new form Emp
     */
     RegistroMov reg=new RegistroMov();
    public Emp() {
        initComponents();
        this.setOpaque(false);
        PanelArt.setOpaque(false);
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

        jLabel4 = new javax.swing.JLabel();
        empatiend3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Fechaini = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        Fechafin = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        idArticulo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Prestamo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Renovación = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        PanelArt = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        JLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        serie = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        estadocal = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        kilataje = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        modalidad = new javax.swing.JComboBox();
        Limpiar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        locacion = new javax.swing.JTextField();
        idCliente = new javax.swing.JLabel();
        Clienteid = new javax.swing.JTextField();
        PanelCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nomclient = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TelClient = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Finiquito = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Atiende: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        empatiend3.setEditable(false);
        empatiend3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        empatiend3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatiend3ActionPerformed(evt);
            }
        });
        add(empatiend3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 120, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de empeño: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        Fechaini.setBackground(new java.awt.Color(96, 3, 3));
        add(Fechaini, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 130, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de vencimiento: ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        Fechafin.setBackground(new java.awt.Color(96, 3, 3));
        add(Fechafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 130, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("id del Articulo ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, -1));

        idArticulo.setEditable(false);
        idArticulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(idArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 120, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Prestamo: ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        Prestamo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Prestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PrestamoKeyPressed(evt);
            }
        });
        add(Prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 100, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Renovación:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, -1, -1));

        Renovación.setEditable(false);
        Renovación.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Renovación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenovaciónActionPerformed(evt);
            }
        });
        Renovación.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RenovaciónKeyPressed(evt);
            }
        });
        add(Renovación, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 100, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EMPEÑO");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        PanelArt.setBackground(new java.awt.Color(51, 51, 51));
        PanelArt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Llenar los datos del articulo: ");
        PanelArt.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        JLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JLabel1.setText("Nombre: ");
        PanelArt.add(JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 20));

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PanelArt.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 146, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Marca: ");
        PanelArt.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 75, 20));

        marca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PanelArt.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 146, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Modelo:");
        PanelArt.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 75, 19));

        modelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PanelArt.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 146, -1));

        serie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serieActionPerformed(evt);
            }
        });
        PanelArt.add(serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 146, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Serie:");
        PanelArt.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Categoria:");
        PanelArt.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        categoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        categoria.setForeground(new java.awt.Color(255, 255, 255));
        categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguna", "Electronico", "Oro", "Plata", "Otros", "Herramientas", "Bicicleta", "Linea Blanca", "Audio", "Video", "Muebles", "Fiseres domesticos" }));
        PanelArt.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 146, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Descripcion:");
        PanelArt.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        PanelArt.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 197, 52));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Estado/Calidad:");
        PanelArt.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        estadocal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        estadocal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buena", "Mala", "Regular" }));
        PanelArt.add(estadocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 141, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Kilataje:");
        PanelArt.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        kilataje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PanelArt.add(kilataje, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 141, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Modalidad:");
        PanelArt.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        modalidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modalidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Empeñado", "Apartado", "En Venta", " ", "Vendido" }));
        PanelArt.add(modalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 141, -1));

        Limpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        PanelArt.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        Aceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        PanelArt.add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Locación");
        PanelArt.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        locacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PanelArt.add(locacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 130, -1));

        add(PanelArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 800, 250));

        idCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idCliente.setForeground(new java.awt.Color(255, 255, 255));
        idCliente.setText("idCliente:");
        add(idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        Clienteid.setEditable(false);
        Clienteid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Clienteid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteidActionPerformed(evt);
            }
        });
        add(Clienteid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 110, -1));

        PanelCliente.setBackground(new java.awt.Color(51, 51, 51));
        PanelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del cliente: ");
        PanelCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 150, 20));

        Nomclient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nomclient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomclientKeyTyped(evt);
            }
        });
        PanelCliente.add(Nomclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 130, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono: ");
        PanelCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        TelClient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PanelCliente.add(TelClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 140, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelCliente.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

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

        PanelCliente.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 680, 100));

        add(PanelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 760, 160));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Finiquito:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, -1, -1));

        Finiquito.setEditable(false);
        Finiquito.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(Finiquito, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo (Medium).jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 590));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 590));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 590));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void empatiend3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatiend3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empatiend3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String cliente=Clienteid.getText();
        reg.RegistraEmpeño(new SimpleDateFormat("yyyy-MM-dd").format(Fechaini.getDate()),new SimpleDateFormat("yyyy-MM-dd").format(Fechafin.getDate()),Prestamo.getText(),"0","0","No Renovado",Inicio_sesion.id, cliente, idArticulo.getText());
       for(Component c:this.getComponents()){
                c.setEnabled(false);
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for(Component c:this.getComponents()){
                c.setEnabled(false);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serieActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        nombre.setText(null);
        marca.setText(null);
        modelo.setText(null);
        serie.setText(null);
        descripcion.setText(null);
        kilataje.setText(null);
    }//GEN-LAST:event_LimpiarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if("".equals(nombre.getText()) | "".equals(marca.getText()) | "".equals(modelo.getText())|"".equals(serie.getText())|"".equals((String)categoria.getSelectedItem())|"".equals(descripcion.getText())|"".equals((String)estadocal.getSelectedItem())|"".equals(kilataje.getText())|"".equals((String)modalidad.getSelectedItem())){
            JOptionPane.showMessageDialog(null,"Algún campo quedó vacío");
        }else{
            Consultas con=new Consultas();
            con.agregart(nombre.getText(),marca.getText(),modelo.getText(),serie.getText(),(String)categoria.getSelectedItem(),descripcion.getText(),(String)estadocal.getSelectedItem(),kilataje.getText(),(String)modalidad.getSelectedItem(),locacion.getText());
            PanelArt.hide();
            idArticulo.setText(con.ConsultaultArt());
        }

    }//GEN-LAST:event_AceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if("No existe".equals(reg.ConsultaCliente(Nomclient.getText()))){
            reg.InsertarClinte(Nomclient.getText(),TelClient.getText());
            Clienteid.setText(reg.ConsultaultCliente());
        }
        else{
            Clienteid.setText(reg.ConsultaCliente(Nomclient.getText()));
        }
        for(Component c:PanelCliente.getComponents()){
                c.setEnabled(false);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ClienteidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteidActionPerformed

    private void RenovaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenovaciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RenovaciónActionPerformed

    private void RenovaciónKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RenovaciónKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RenovaciónKeyPressed

    private void PrestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrestamoKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             Prestamo.getText();
             int prestamo=Integer.parseInt(Prestamo.getText());
             int renovacion,finiquito;
             renovacion=prestamo/5;
             finiquito=renovacion+prestamo;
             Renovación.setText(String.valueOf(renovacion));
             Finiquito.setText(String.valueOf(finiquito));
         }
    }//GEN-LAST:event_PrestamoKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int seleccion=jTable1.rowAtPoint(evt.getPoint());
        String id=String.valueOf(jTable1.getValueAt(seleccion, 0));
        String nombre=String.valueOf(jTable1.getValueAt(seleccion,1));
        String telefono=String.valueOf(jTable1.getValueAt(seleccion,2));
        Nomclient.setText(nombre);
        TelClient.setText(telefono);
    }//GEN-LAST:event_jTable1MouseClicked

    private void NomclientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomclientKeyTyped
        // TODO add your handling code here:
        ClientesSQL a=new ClientesSQL();
         String busqueda=Nomclient.getText()+evt.getKeyChar();
         jTable1.setModel(a.Consultapornombre(busqueda));
    }//GEN-LAST:event_NomclientKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JTextField Clienteid;
    private com.toedter.calendar.JDateChooser Fechafin;
    private com.toedter.calendar.JDateChooser Fechaini;
    private javax.swing.JTextField Finiquito;
    private javax.swing.JLabel JLabel1;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Nomclient;
    private javax.swing.JPanel PanelArt;
    private javax.swing.JPanel PanelCliente;
    private javax.swing.JTextField Prestamo;
    private javax.swing.JTextField Renovación;
    private javax.swing.JTextField TelClient;
    private javax.swing.JComboBox categoria;
    private javax.swing.JTextArea descripcion;
    public static javax.swing.JTextField empatiend3;
    private javax.swing.JComboBox estadocal;
    private javax.swing.JTextField idArticulo;
    private javax.swing.JLabel idCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kilataje;
    private javax.swing.JTextField locacion;
    private javax.swing.JTextField marca;
    private javax.swing.JComboBox modalidad;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField serie;
    // End of variables declaration//GEN-END:variables
}
