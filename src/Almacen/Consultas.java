/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;


import casadeempeños.Conectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Said
 */
public class Consultas {
    Conectar con;
    Connection reg;
  
    
    String nombre;
    String modo;
    
    public Consultas(){
        
        nombre=null;
        modo=null;
    }
    
    
    
    public DefaultTableModel ConsultaGeneral(){
        con = new Conectar();
        reg =con.conexion();
      DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("idArtiulo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Marca");
            modelo.addColumn("Modelo");
            modelo.addColumn("Serie");
            modelo.addColumn("Categoría");
            modelo.addColumn("Descripción");
            modelo.addColumn("Calidad/Estado");
            modelo.addColumn("Kilataje");
            modelo.addColumn("Status");
            modelo.addColumn("Locación");
            
            String[]datos=new String[11];
        try {
            Statement st=reg.createStatement();
             ResultSet rs=st.executeQuery("SELECT * FROM articulos ORDER BY Nombre_art");
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
                datos[10]=rs.getString(11);
                modelo.addRow(datos);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Hubo un error: "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
       return modelo;
    }
    
    public DefaultTableModel Consultaporid(String id,String status,String nombre){
        con = new Conectar();
        reg =con.conexion();
        DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("idArtiulo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Marca");
            modelo.addColumn("Modelo");
            modelo.addColumn("Serie");
            modelo.addColumn("Categoría");
            modelo.addColumn("Descripción");
            modelo.addColumn("Calidad/Estado");
            modelo.addColumn("Kilataje");
            modelo.addColumn("Status");
            modelo.addColumn("Locación");
            
            
            String[]datos=new String[11];
            PreparedStatement pst;
            ResultSet rs;
            if(!"".equals(id)){
             try {
                pst=reg.prepareStatement("SELECT * FROM articulos WHERE idArticulos=?");
            pst.setString(1,id);
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
                datos[10]=rs.getString(11);
                modelo.addRow(datos); 
            }   
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Hubo un error en la operacion: "+ex);
        }
            }
            else
                if(!"".equals(status)){
                     try {
                pst=reg.prepareStatement("SELECT * FROM articulos WHERE Modalidad like ?");
            pst.setString(1,status+"%");
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
                datos[10]=rs.getString(11);
                modelo.addRow(datos); 
            }   
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Hubo un error en la operacion: "+ex);
        }  
                }
            else
                    if(!"".equals(nombre)){
                           try {
                pst=reg.prepareStatement("SELECT * FROM articulos WHERE Nombre_art like ?");
            pst.setString(1,nombre+"%");
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
                datos[10]=rs.getString(11);
                modelo.addRow(datos); 
            }   
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Hubo un error en la operacion: "+ex);
        }
                    }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
            return modelo;
    }
    
    void Eliminar(String id){
        PreparedStatement pst;
        con = new Conectar();
        reg =con.conexion();
        
        try {
            pst=reg.prepareStatement("DELETE FROM articulos WHERE idArticulos=?");
             pst.setString(1,id);
             int n = pst.executeUpdate();
            if(n==1){
                JOptionPane.showMessageDialog(null, "Eliminado correctamente.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error : "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void agregart(String nombre,String marca,String modelo,String serie,String categ,String descrip,String edocal,String kilataje,String modalidad,String locacion){
     con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
        try {
            pst =reg.prepareStatement("INSERT INTO articulos (Nombre_art,Marca_art,Modelo_art,Serie_art,Categ_art,Descripcion,Estado_calidad,Kilataje,Modalidad,Locacion)VALUES(?,?,?,?,?,?,?,?,?,?)") ;
            pst.setString(1, nombre);
            pst.setString(2, marca);
            pst.setString(3, modelo);
            pst.setString(4, serie);
            pst.setString(5, categ);
            pst.setString(6, descrip);
            pst.setString(7, edocal);
            pst.setString(8, kilataje);
            pst.setString(9, modalidad);
            pst.setString(10, locacion);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Agregado correctamente");
             
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error : "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String ConsultaultArt(){
        String idarticulo=null;
            con=new Conectar();
            reg =con.conexion();
            PreparedStatement pst;
            ResultSet rs;
        try {
            pst=reg.prepareStatement("SELECT MAX(idArticulos) AS idArticulos FROM articulos");
            rs=pst.executeQuery();
            while(rs.next()){
                idarticulo=rs.getString(1);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error \n"+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return idarticulo;
    }
    
    public String ConsultaArt(String id){
           String[]datos=new String[11];
            con=new Conectar();
            reg =con.conexion();
            PreparedStatement pst;
            ResultSet rs;
        try {
            pst=reg.prepareStatement("SELECT * FROM articulos WHERE idArticulos=?");
            pst.setString(1,id);
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
                datos[10]=rs.getString(11);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error \n"+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return datos[9];
    }
    
    public void actualizart(String id){
     con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
        try {
            pst =reg.prepareStatement("UPDATE articulos SET Modalidad='Vendido' WHERE idArticulos=?") ;
            pst.setString(1, id);
            
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error : "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
