/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultarReporte;

import casadeempeños.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Said
 */
public class ConsultasMov {
private static final Logger LOG = Logger.getLogger(ConsultasMov.class.getName());
    
    
    private DefaultTableModel modelo;
    private Conectar con;
    private Connection reg;
    public ConsultasMov(){
     modelo=null;
     
    }
    public DefaultTableModel ConsultaCompras(){
        con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idCompra");
            modelo.addColumn("Fecha");
            modelo.addColumn("Precio");
            modelo.addColumn("idEmpleado");
            modelo.addColumn("idCliente");
            modelo.addColumn("idArticulo");
            String[]datos=new String[6];
    try {
        Statement st=reg.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM compras");
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
    public DefaultTableModel ConsultaComprasfecha(String fecha1,String fecha2){
        con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idCompra");
            modelo.addColumn("Fecha");
            modelo.addColumn("Precio");
            modelo.addColumn("idEmpleado");
            modelo.addColumn("idCliente");
            modelo.addColumn("idArticulo");
            String[]datos=new String[6];
            PreparedStatement pst;
            ResultSet rs;
    try {
      pst=reg.prepareStatement("SELECT * FROM compras WHERE Fecha_comp BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
        
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
    public DefaultTableModel ConsultaComprasid(){
        con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idCompra");
            modelo.addColumn("Precio");
            String[]datos=new String[2];
    try {
        Statement st=reg.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM compras");
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(3);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
    public DefaultTableModel ConsultaComprasidfecha(String fecha1,String fecha2){
        con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idCompra");
            modelo.addColumn("Precio");
            String[]datos=new String[2];
            PreparedStatement pst;
            ResultSet rs;
    try {
        pst=reg.prepareStatement("SELECT * FROM compras WHERE Fecha_comp BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(3);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
    public DefaultTableModel ConsultaVentas(){
            con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idVenta");
            modelo.addColumn("Fecha");
            modelo.addColumn("Precio");
            modelo.addColumn("idEmpleado");
            modelo.addColumn("idCliente");
            modelo.addColumn("idArticulo");
            String[]datos=new String[6];
    try {
        Statement st=reg.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM ventas");
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
     public DefaultTableModel ConsultaVentasfecha(String fecha1,String fecha2){
            con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idVenta");
            modelo.addColumn("Fecha");
            modelo.addColumn("Precio");
            modelo.addColumn("idEmpleado");
            modelo.addColumn("idCliente");
            modelo.addColumn("idArticulo");
            String[]datos=new String[6];
            PreparedStatement pst;
            ResultSet rs;
    try {
        pst=reg.prepareStatement("SELECT * FROM ventas WHERE Fecha_venta BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
                while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
    public DefaultTableModel ConsultaVentasid(){
            con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idVenta");
            modelo.addColumn("Precio");
            String[]datos=new String[2];
    try {
        Statement st=reg.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM ventas");
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(3);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
     public DefaultTableModel ConsultaVentasidfecha(String fecha1,String fecha2){
            con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idVenta");
            modelo.addColumn("Precio");
            String[]datos=new String[2];
            PreparedStatement pst;
            ResultSet rs;
    try {
        pst=reg.prepareStatement("SELECT * FROM ventas WHERE Fecha_venta BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(3);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
    public DefaultTableModel ConsultaEmpeños(){
         con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idEmpeño");
            modelo.addColumn("Fecha inicial");
            modelo.addColumn("Fecha final");
            modelo.addColumn("Prestamo");
            modelo.addColumn("Renovaciones (Total)");
            modelo.addColumn("Finiquito");
            modelo.addColumn("Estado");
            modelo.addColumn("idEmpleado");
            modelo.addColumn("idCliente");
            modelo.addColumn("idArticulo");
            
            String[]datos=new String[10];
    try {
        Statement st=reg.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM empeños");
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
     public DefaultTableModel ConsultaEmpeñosfecha(String fecha1,String fecha2){
         con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idEmpeño");
            modelo.addColumn("Fecha inicial");
            modelo.addColumn("Fecha final");
            modelo.addColumn("Prestamo");
            modelo.addColumn("Renovaciónes (Total)");
            modelo.addColumn("Finiquito");
            modelo.addColumn("Estado");
            modelo.addColumn("idEmpleado");
            modelo.addColumn("idCliente");
            modelo.addColumn("idArticulo");
            String[]datos=new String[10];
             PreparedStatement pst;
             ResultSet rs;
    try {
            pst=reg.prepareStatement("SELECT * FROM empeños WHERE Fecha_ini_emp BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
                while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);//
                datos[4]=rs.getString(5);//
                datos[5]=rs.getString(6);//
                datos[6]=rs.getString(7);//
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
    public DefaultTableModel ConsultaEmpeñosrefid(){
         con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idEmpeño");
            modelo.addColumn("Total de renovaciónes");
            String[]datos=new String[2];
    try {
        Statement st=reg.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM empeños");
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(5);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
     public DefaultTableModel ConsultaEmpeñosrefidfecha(String fecha1,String fecha2){
         con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idEmpeño");
            modelo.addColumn("Total de renovaciones");
            String[]datos=new String[2];
            PreparedStatement pst;
             ResultSet rs;
    try {
            pst=reg.prepareStatement("SELECT * FROM empeños WHERE Fecha_ini_emp BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(5);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
        public DefaultTableModel ConsultaEmpeñosprestid(){
         con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idEmpeño");
            modelo.addColumn("Prestamo");
            String[]datos=new String[2];
    try {
        Statement st=reg.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM empeños");
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(4);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
        
        public DefaultTableModel ConsultaEmpeñosfinid(){
         con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idEmpeño");
            modelo.addColumn("Finiquito");
            String[]datos=new String[2];
    try {
        Statement st=reg.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM empeños");
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(6);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
        
        public DefaultTableModel ConsultaEmpeñosfinidfecha(String fecha1,String fecha2){
         con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idEmpeño");
            modelo.addColumn("Finiquito");
            String[]datos=new String[2];
            PreparedStatement pst;
             ResultSet rs;
    try {
        pst=reg.prepareStatement("SELECT * FROM empeños WHERE Fecha_ini_emp BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(6);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }

        
        
         public DefaultTableModel ConsultaEmpeñosprestidfecha(String fecha1,String fecha2){
         con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idEmpeño");
            modelo.addColumn("Prestamo");
            String[]datos=new String[2];
            PreparedStatement pst;
             ResultSet rs;
    try {
        pst=reg.prepareStatement("SELECT * FROM empeños WHERE Fecha_ini_emp BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(4);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
         
         public String[] Consulta1emp(String id){
             con=new Conectar();
             reg =con.conexion();
             String datos[]=new String[6];  
             PreparedStatement pst;
             ResultSet rs;
    try {
        pst =reg.prepareStatement("SELECT * FROM  empeños WHERE idEmpeños=?") ;
        pst.setString(1, id);
        rs=pst.executeQuery();
        
            

        while(rs.next()){
                datos[0]=rs.getString(4);
                datos[1]=rs.getString(5);
                datos[2]=rs.getString(6);
                datos[3]=rs.getString(2);
                datos[4]=rs.getString(3);
                datos[5]=rs.getString(7);
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Hubo un error al ejecutar la sentencia SQL: \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Hubo un error al cerrar la conexion con la Base de Datos: \n"+ex);
    }
    if(datos[0]==null|datos[1]==null){
         JOptionPane.showMessageDialog(null,"El empeño que desea consultar no existe");
         return null;
        }
    else{
    return datos; 
    }
    }
         
          public String[] Consulta1apart(String id){
             con=new Conectar();
             reg =con.conexion();
             String datos[]=new String[3];  
             PreparedStatement pst;
             ResultSet rs;
    try {
        pst =reg.prepareStatement("SELECT * FROM  apartados WHERE idApartados=?") ;
        pst.setString(1, id);
        rs=pst.executeQuery();
        while(rs.next()){
                datos[0]=rs.getString(4);
                datos[1]=rs.getString(5);
                datos[3]=rs.getString(8);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Hubo un error al ejecutar la sentencia SQL: \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Hubo un error al cerrar la conexion con la Base de Datos: \n"+ex);
    }
    if(datos[0]==null|datos[1]==null){
         JOptionPane.showMessageDialog(null,"El apartado que desea consultar no existe");
         return null;
        }
    else{
    return datos; 
    }
    }
    
    public DefaultTableModel ConsultaApartados(){
           con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idApartado");
            modelo.addColumn("Fecha inicial");
            modelo.addColumn("Fecha final");
            modelo.addColumn("Precio");
            modelo.addColumn("Refrendo");
            modelo.addColumn("idEmpleado");
            modelo.addColumn("idCliente");
            modelo.addColumn("idArticulo");
            modelo.addColumn("Estado");
            String[]datos=new String[9];
    try {
        Statement st=reg.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM apartados");
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                if(datos[3].equals(datos[4])){
                datos[8]="Concretado";    
                }
                else{
                datos[8]="Pendiente";    
                }
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }

    
    public DefaultTableModel ConsultaApartadosfecha(String fecha1,String fecha2){
           con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idApartado");
            modelo.addColumn("Fecha inicial");
            modelo.addColumn("Fecha final");
            modelo.addColumn("Precio");
            modelo.addColumn("Refrendo");
            modelo.addColumn("idEmpleado");
            modelo.addColumn("idCliente");
            modelo.addColumn("idArticulo");
            modelo.addColumn("Estado");
            String[]datos=new String[9];
            PreparedStatement pst;
            ResultSet rs;

    try {
        pst=reg.prepareStatement("SELECT * FROM apartados WHERE Fecha_ini_apart BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                if(datos[3].equals(datos[4])){
                datos[8]="Concretado";    
                }
                else{
                datos[8]="Pendiente";    
                }
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
   
     public DefaultTableModel ConsultaApartadosid(){
         con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idApartado");
            modelo.addColumn("Refrendo");
            String[]datos=new String[2];
    try {
        Statement st=reg.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM apartados");
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(5);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
     
     public DefaultTableModel ConsultaApartadosidFecha(String fecha1,String fecha2){
         con=new Conectar();
       reg =con.conexion();
       modelo=new DefaultTableModel();
            modelo.addColumn("idApartao");
            modelo.addColumn("Refrendo");
            String[]datos=new String[2];
            PreparedStatement pst;
             ResultSet rs;
    try {
        pst=reg.prepareStatement("SELECT * FROM apartados WHERE Fecha_ini_apart BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
        while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(5);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(ConsultasMov.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return getModel();
    }
    
    /**
     * @return the model
     */
    public DefaultTableModel getModel() {
        return modelo;
    }

    /**
     * @param model the model to set
     */
    public void setModel(DefaultTableModel model) {
        this.modelo = model;
    }
}
