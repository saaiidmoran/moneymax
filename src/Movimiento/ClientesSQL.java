/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimiento;

import casadeempeños.Conectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ClientesSQL {
   Conectar con;
    Connection reg; 
    
    public void AgregarCliente(String Nombre,String Telefono){
     con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
       try {
           pst=reg.prepareStatement("INSERT INTO CLIENTES (Cliente_nom,Cliente_tel)VALUES(?,?)");
           pst.setString(1, Nombre);
            pst.setString(2, Telefono);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Agregado correctamente");
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ ex);
       }
       try {
           reg.close();
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public void Eliminar(String id){
     con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst; 
     
       try {
           pst=reg.prepareStatement("DELETE FROM clientes WHERE idClientes=?");
           pst.setString(1, id);
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Eliminado correctamente");
           
           
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
       try {
           reg.close();
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
    }
    
    public DefaultTableModel ConsultaClientes(){
     con = new Conectar();
     reg =con.conexion();
      DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("idCliente");
            modelo.addColumn("Nombre");
            modelo.addColumn("Numero");
            String[]datos=new String[3];
            
       try {
           Statement st=reg.createStatement();
           ResultSet rs=st.executeQuery("SELECT * FROM clientes ORDER BY Cliente_nom");
           while(rs.next()){
               datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                modelo.addRow(datos);
                
           }
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
       try {
           reg.close();
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
           return modelo;
    }
   
    
        public String ConsultaultCliente(){
        String idcliente=null;
            con = new Conectar();
            reg =con.conexion();
            PreparedStatement pst;
            ResultSet rs;
        try {
            
            pst=reg.prepareStatement("SELECT MAX(idClientes) AS idCleintes from clientes");
            rs=pst.executeQuery();
            while(rs.next()){
                idcliente=rs.getString(1);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error \n"+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idcliente;
    }
        public void ModificarCliete(String id,String nombre,String telefono){
     con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
       try {
           pst =reg.prepareStatement("UPDATE clientes SET Cliente_nom=?,Cliente_tel=? WHERE idClientes=?");
           pst.setString(1, nombre);
            pst.setString(2, telefono);
             pst.setString(3, id);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null,"Modificación exitosa");
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
       try {
           reg.close();
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
        }
        public DefaultTableModel Consultapornombre(String nombre){
        con = new Conectar();
        reg =con.conexion();
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("idCliente");
            modelo.addColumn("Nombre");
            modelo.addColumn("Marca");
            String[]datos=new String[3];
            PreparedStatement pst;
            ResultSet rs;
       try {
           pst=reg.prepareStatement("SELECT * FROM clientes WHERE Cliente_nom like ?");
           pst.setString(1, nombre+"%");
           rs=pst.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                modelo.addRow(datos); 
            }
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
       try {
           reg.close();
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
           return modelo; 
        
        }
        public String[] Consultaporid(String id){
        con = new Conectar();
        reg =con.conexion();
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("idCliente");
            modelo.addColumn("Nombre");
            modelo.addColumn("Marca");
            String[]datos=new String[3];
            PreparedStatement pst;
            ResultSet rs;
       try {
           pst=reg.prepareStatement("SELECT * FROM clientes WHERE idClientes=?");
           pst.setString(1, id);
           rs=pst.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                
            }
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
       try {
           reg.close();
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       } 
        return datos;
        }
        
        public DefaultTableModel ConsultaComprascliente (String id,String fecha){
        con = new Conectar();
        reg =con.conexion();
        DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("idCompra");
            modelo.addColumn("Fecha");
            modelo.addColumn("Precio");
            modelo.addColumn("idEmpleado");
            modelo.addColumn("idCliente");
            modelo.addColumn("idArticulo");
            String[]datos=new String[6];
            PreparedStatement pst;
            ResultSet rs;
            if(!"".equals(fecha) && !"".equals(id)){
            try { 
                pst=reg.prepareStatement("SELECT * FROM compras WHERE Clientes_idClientes=? AND Fecha_comp=?");
                pst.setString(1, id);
                pst.setString(2, fecha);
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
                Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
            }
            }
            if(!"".equals(id)&&"".equals(fecha)){
       try {
           pst=reg.prepareStatement("SELECT * FROM compras WHERE Clientes_idClientes=?");
           pst.setString(1, id);
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
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
            }
            if(!"".equals(fecha)&&"".equals(id)){
            try {  
                pst=reg.prepareStatement("SELECT * FROM compras WHERE Fecha_comp=?");
                 pst.setString(1, fecha);
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
                Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
            }
            }
            
       try {
           reg.close();
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
           return modelo; 
        
        }
        
        public DefaultTableModel ConsultaVentascliente (String id,String fecha){
        con = new Conectar();
        reg =con.conexion();
        DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("idVenta");
            modelo.addColumn("Fecha");
            modelo.addColumn("Precio");
            modelo.addColumn("idEmpleado");
            modelo.addColumn("idCliente");
            modelo.addColumn("idArticulo");
            String[]datos=new String[6];
            PreparedStatement pst;
            ResultSet rs;
            if(!"".equals(fecha) && !"".equals(id)){
            try { 
                pst=reg.prepareStatement("SELECT * FROM ventas WHERE Clientes_idClientes=? AND Fecha_venta=?");
                pst.setString(1, id);
                pst.setString(2, fecha);
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
                Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
            }
            }
            if(!"".equals(id)&&"".equals(fecha)){
       try {
           pst=reg.prepareStatement("SELECT * FROM ventas WHERE Clientes_idClientes=?");
           pst.setString(1, id);
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
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
            }
            if(!"".equals(fecha)&&"".equals(id)){
            try {  
                pst=reg.prepareStatement("SELECT * FROM ventas WHERE Fecha_venta=?");
                 pst.setString(1, fecha);
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
                Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
            }
            }
            
       try {
           reg.close();
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
           return modelo; 
        
        }
        
        public DefaultTableModel ConsultaEmpeñoscliente (String id,String fecha){
        con = new Conectar();
        reg =con.conexion();
        DefaultTableModel modelo=new DefaultTableModel();
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
            PreparedStatement pst;
            ResultSet rs;
            if(!"".equals(fecha) && !"".equals(id)){
            try { 
                pst=reg.prepareStatement("SELECT * FROM empeños WHERE Clientes_idClientes=? AND Fecha_ini_emp=?");
                pst.setString(1, id);
                pst.setString(2, fecha);
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
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                modelo.addRow(datos); 
            }
            } catch (SQLException ex) {
                Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
            }
            }
            if(!"".equals(id)&&"".equals(fecha)){
       try {
           pst=reg.prepareStatement("SELECT * FROM empeños WHERE Clientes_idClientes=?");
           pst.setString(1, id);
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
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                modelo.addRow(datos); 
            }
            
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
            }
            if(!"".equals(fecha)&&"".equals(id)){
            try {  
                pst=reg.prepareStatement("SELECT * FROM empeños WHERE Fecha_ini_emp=?");
                 pst.setString(1, fecha);
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
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                modelo.addRow(datos); 
            }
            } catch (SQLException ex) {
                Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
            }
            }
            
       try {
           reg.close();
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
           return modelo; 
        
        }
        
         public DefaultTableModel ConsultaApartadoscliente (String id,String fecha){
        con = new Conectar();
        reg =con.conexion();
        DefaultTableModel modelo=new DefaultTableModel();
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
            if(!"".equals(fecha) && !"".equals(id)){
            try { 
                pst=reg.prepareStatement("SELECT * FROM apartados WHERE Clientes_idClientes=? AND Fecha_ini_apart=?");
                pst.setString(1, id);
                pst.setString(2, fecha);
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
                Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
            }
            }
            if(!"".equals(id)&&"".equals(fecha)){
       try {
           pst=reg.prepareStatement("SELECT * FROM apartados WHERE Clientes_idClientes=?");
           pst.setString(1, id);
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
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
            }
            if(!"".equals(fecha)&&"".equals(id)){
            try {  
                pst=reg.prepareStatement("SELECT * FROM apartados WHERE Fecha_ini_apart=?");
                 pst.setString(1, fecha);
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
                Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
            }
            }
            
       try {
           reg.close();
       } catch (SQLException ex) {
           Logger.getLogger(ClientesSQL.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Ocurrio un error: \n"+ex);
       }
           return modelo; 
        
        }
}

