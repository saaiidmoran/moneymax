/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

import java.awt.*;
import casadeempeños.Pantalla_bienvenido;

/**
 *
 * @author Said
 */


public class Almacen extends javax.swing.JFrame {

    /**
     * Creates new form Almacen
     */
    Consultas c;
    public Almacen() {
        initComponents();
       Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/LOGO.png"));
       setIconImage(icon);
       setVisible(true);
       jPanel1.setOpaque(false);
       c=new Consultas();
        Tablaalmacen.setModel(c.ConsultaGeneral());
    }
    
    
   
    

   

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        agregar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idArtelim = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaalmacen = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idArtcon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nombreartcon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        statusartcon = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        serie = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kilataje = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        locacion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        categoria = new javax.swing.JTextField();
        calidad = new javax.swing.JTextField();
        modalidad = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Almacen");
        setMaximumSize(new java.awt.Dimension(1220, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregar.setBackground(new java.awt.Color(96, 3, 3));
        agregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        agregar.setText("Agregar Articulo");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 30));

        consultar.setBackground(new java.awt.Color(96, 3, 3));
        consultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        getContentPane().add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 100, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿Que desea hacer con el almacén?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 320, 26));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eliminar articulo: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("idArticulo: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        idArtelim.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idArtelim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idArtelimActionPerformed(evt);
            }
        });
        getContentPane().add(idArtelim, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 90, -1));

        jButton1.setBackground(new java.awt.Color(96, 3, 3));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 80, 20));

        jScrollPane1.setBackground(new java.awt.Color(96, 3, 3));

        Tablaalmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tablaalmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaalmacenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablaalmacen);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 800, 190));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Consultar almacen:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Por id del articulo: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        idArtcon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idArtcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idArtconActionPerformed(evt);
            }
        });
        getContentPane().add(idArtcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 80, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Por nombre del articulo: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        nombreartcon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nombreartcon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreartconKeyTyped(evt);
            }
        });
        getContentPane().add(nombreartcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 100, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Por status: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        statusartcon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        statusartcon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                statusartconKeyTyped(evt);
            }
        });
        getContentPane().add(statusartcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 130, -1));

        jButton5.setBackground(new java.awt.Color(96, 3, 3));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Consulta todos los articulos: ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JLabel1.setText("Nombre: ");
        jPanel1.add(JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 75, 20));

        nombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 146, -1));

        marca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 146, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marca: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 75, 33));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Modelo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 75, 19));

        modelo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 146, -1));

        serie.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serieActionPerformed(evt);
            }
        });
        jPanel1.add(serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 146, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Serie:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Categoria:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        descripcion.setRows(5);
        jScrollPane2.setViewportView(descripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 197, 52));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Descripcion:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Estado/Calidad:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        kilataje.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(kilataje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 141, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Kilataje:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Modalidad:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        locacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(locacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 140, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Locación");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        JLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabel2.setForeground(new java.awt.Color(255, 255, 255));
        JLabel2.setText("id Articulo:");
        jPanel1.add(JLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 75, 26));

        id.setEditable(false);
        id.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 146, -1));

        jButton2.setBackground(new java.awt.Color(96, 3, 3));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        categoria.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 140, -1));

        calidad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(calidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 150, -1));

        modalidad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(modalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 400, 470));

        jButton3.setBackground(new java.awt.Color(96, 3, 3));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Go-back-icon (Custom).png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 50, -1));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo (Medium).jpg"))); // NOI18N
        jLabelfondo.setMaximumSize(new java.awt.Dimension(1220, 500));
        jLabelfondo.setMinimumSize(new java.awt.Dimension(1220, 500));
        jLabelfondo.setPreferredSize(new java.awt.Dimension(1220, 500));
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        c=new Consultas();
        Tablaalmacen.setModel(c.Consultaporid(idArtcon.getText(),statusartcon.getText(),nombreartcon.getText()));
        c=null;
        idArtcon.setText("");
        statusartcon.setText("");
        nombreartcon.setText("");
        idArtelim.setText("");
    }//GEN-LAST:event_consultarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Pantalla_bienvenido pbien=new Pantalla_bienvenido();
        pbien.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
         Articulo articulo=new Articulo();
         articulo.setVisible(true);
    }//GEN-LAST:event_agregarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    c=new Consultas();
    Tablaalmacen.setModel(c.ConsultaGeneral());

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        c=new Consultas();
        c.Eliminar(idArtelim.getText());
        idArtcon.setText("");
        statusartcon.setText("");
        nombreartcon.setText("");
        idArtelim.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idArtconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idArtconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idArtconActionPerformed

    private void idArtelimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idArtelimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idArtelimActionPerformed

    private void serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serieActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void TablaalmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaalmacenMouseClicked
        // TODO add your handling code here:
        int seleccion=Tablaalmacen.rowAtPoint(evt.getPoint());
        id.setText(String.valueOf(Tablaalmacen.getValueAt(seleccion, 0)));
        nombre.setText(String.valueOf(Tablaalmacen.getValueAt(seleccion, 1)));
        marca.setText(String.valueOf(Tablaalmacen.getValueAt(seleccion, 2)));
        modelo.setText(String.valueOf(Tablaalmacen.getValueAt(seleccion, 3)));
        serie.setText(String.valueOf(Tablaalmacen.getValueAt(seleccion, 4)));
        categoria.setText(String.valueOf(Tablaalmacen.getValueAt(seleccion, 5)));
        descripcion.setText(String.valueOf(Tablaalmacen.getValueAt(seleccion, 6)));
        calidad.setText(String.valueOf(Tablaalmacen.getValueAt(seleccion, 7)));
        kilataje.setText(String.valueOf(Tablaalmacen.getValueAt(seleccion, 8)));
        modalidad.setText(String.valueOf(Tablaalmacen.getValueAt(seleccion, 9)));
        locacion.setText(String.valueOf(Tablaalmacen.getValueAt(seleccion, 10)));
        
    }//GEN-LAST:event_TablaalmacenMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Modifica m=new Modifica();
        m.ModificaArticulo(id.getText(), nombre.getText(), marca.getText(), modelo.getText(), serie.getText(), categoria.getText(), descripcion.getText(), calidad.getText(), kilataje.getText(), modalidad.getText(), locacion.getText());
        c=new Consultas();
        Tablaalmacen.setModel(c.ConsultaGeneral());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void statusartconKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_statusartconKeyTyped
        // TODO add your handling code here:
        c=new Consultas();
        String status=statusartcon.getText()+evt.getKeyChar();
        Tablaalmacen.setModel(c.Consultaporid("", status,""));
    }//GEN-LAST:event_statusartconKeyTyped

    private void nombreartconKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreartconKeyTyped
        // TODO add your handling code here:
        c=new Consultas();
        String nombre1=nombreartcon.getText()+evt.getKeyChar();
        Tablaalmacen.setModel(c.Consultaporid("", "",nombre1));
    }//GEN-LAST:event_nombreartconKeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JTable Tablaalmacen;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField calidad;
    private javax.swing.JTextField categoria;
    private javax.swing.JButton consultar;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idArtcon;
    private javax.swing.JTextField idArtelim;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField kilataje;
    private javax.swing.JTextField locacion;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modalidad;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombreartcon;
    private javax.swing.JTextField serie;
    private javax.swing.JTextField statusartcon;
    // End of variables declaration//GEN-END:variables

}


