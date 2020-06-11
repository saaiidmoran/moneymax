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


/**
 *
 * @author saaii
 */
public class SumasMov {
    
    private Conectar con;
    private Connection reg;
    String suma="";
    
      public String SumaCompras(){
          con=new Conectar();
          reg=con.conexion();
        try {
            Statement st=reg.createStatement();
            ResultSet rs=st.executeQuery("SELECT SUM(Precio_comp) from compras");
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        if(suma==null){
          return "0";  
        }
        else
        return suma;
      }
      
      public String SumaComprasfecha(String fecha1,String fecha2){
          con=new Conectar();
          reg=con.conexion();
          PreparedStatement pst;
            ResultSet rs;
        try {
             pst=reg.prepareStatement( "SELECT SUM(Precio_comp) from compras WHERE Fecha_comp BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        if(suma==null){
          return "0";  
        }
        else
        return suma;
      }
      
      public String SumaVentas(){
          con=new Conectar();
          reg=con.conexion();
          Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("SELECT SUM(Precio_venta)from ventas");
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
          if(suma==null){
            return "0";
        }else
          return suma;
      }
       
       public String SumaVentasfecha(String fecha1,String fecha2){
          con=new Conectar();
          reg=con.conexion();
          PreparedStatement pst;
            ResultSet rs;
        try {
            pst=reg.prepareStatement("SELECT SUM(Precio_venta)from ventas WHERE Fecha_venta BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        if(suma==null){
            return "0";
        }else
          return suma;
      }
      
      public String Suma_prestEmpeños(){
          con=new Conectar();
          reg=con.conexion();
          Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("SELECT SUM(Prestamo)from empeños");
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
         if(suma==null){
            return "0";
        }else
          return suma;
      }  
      public String Suma_prestEmpeñosfecha(String fecha1,String fecha2){
          con=new Conectar();
          reg=con.conexion();
          PreparedStatement pst;
            ResultSet rs;
        try {
             pst=reg.prepareStatement("SELECT SUM(Prestamo)from empeños WHERE Fecha_ini_emp BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        if(suma==null){
            return "0";
        }else
          return suma;
      } 
      
            public String Suma_refEmpeños(){
          con=new Conectar();
          reg=con.conexion();
          Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("SELECT SUM(Renovacion) from empeños");
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
          if(suma==null){
            return "0";
        }else
          return suma;
      } 
            
            public String Suma_refEmpeñosfecha(String fecha1,String fecha2){
          con=new Conectar();
          reg=con.conexion();
         PreparedStatement pst;
            ResultSet rs;
        try {
            pst=reg.prepareStatement("SELECT SUM(Renovacion) from empeños WHERE Fecha_ini_emp BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        if(suma==null){
            return "0";
        }else
          return suma;
      } 
            
          public String Suma_precioApartados(){
          con=new Conectar();
          reg=con.conexion();
          Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("SELECT SUM(Precio_apart) from apartados");
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
          return suma;
      }
          
           public String Suma_precioApartadosfecha(String fecha1,String fecha2){
          con=new Conectar();
          reg=con.conexion();
         PreparedStatement pst;
         ResultSet rs;
        try {
             pst=reg.prepareStatement("SELECT SUM(Precio_apart) from apartados WHERE Fecha_ini_apart BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        if(suma==null){
            return "0";
        }else
          return suma;
      }
    
      public String Suma_refApartados(){
          con=new Conectar();
          reg=con.conexion();
          Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("SELECT SUM(Refrendo) from apartados");
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        if(suma==null){
            return "0";
        }else 
        return suma;
      }
      
       public String Suma_refApartadosfecha(String fecha1,String fecha2){
          con=new Conectar();
          reg=con.conexion();
          Statement st;
           PreparedStatement pst;
         ResultSet rs;
        try {
            pst=reg.prepareStatement("SELECT SUM(Refrendo) from apartados WHERE Fecha_ini_apart BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        if(suma==null){
            return "0";
        }else
          return suma;
      }
       
       public String Suma_finiemp(){
          con=new Conectar();
          reg=con.conexion();
          Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("SELECT SUM(Finiquito) from empeños");
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        if(suma==null){
            return "0";
        }else 
        return suma;
      }
       
       public String Suma_finiempfecha(String fecha1,String fecha2){
          con=new Conectar();
          reg=con.conexion();
          Statement st;
           PreparedStatement pst;
         ResultSet rs;
        try {
            pst=reg.prepareStatement("SELECT SUM(Finiquito) from empeños WHERE Fecha_ini_emp BETWEEN ? AND ?");
            pst.setString(1,fecha1);
            pst.setString(2,fecha2);
            rs=pst.executeQuery();
            while(rs.next()){
                suma=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(SumasMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error:\n"+ ex);
        }
        if(suma==null){
            return "0";
        }else
          return suma;
      }
}
