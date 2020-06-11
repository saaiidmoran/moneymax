/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimiento;



import casadeempeños.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Said
 */
public class RegistroMov {
    private static final Logger LOG = Logger.getLogger(RegistroMov.class.getName());
    private Conectar con;
    private Connection reg;
    
    
    
    
    public void RegistraCompra(String fecha,String precio,String id_Empleado,String id_Articulo, String id_Cliente ){
       con=new Conectar();
       reg =con.conexion();
        String sql;
        sql = "INSERT INTO compras (Fecha_comp,Precio_comp,Empleados_idEmpleado,Clientes_idClientes,Articulos_idArticulos)VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pst =reg.prepareStatement(sql) ;
                pst.setString(1, fecha);
                pst.setString(2, precio);
                pst.setString(3, id_Empleado);
                pst.setString(4, id_Cliente);
                pst.setString(5, id_Articulo);
                int n = pst.executeUpdate();
                if(n==1){
                    JOptionPane.showMessageDialog(null, "Compra registrada con éxito.");
                }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error : "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RegistraVenta(String fecha,String precio,String id_Empleado,String id_Articulo, String id_Cliente){
       con=new Conectar();
       reg =con.conexion();
       String sql;
        sql = "INSERT INTO ventas (Fecha_venta,Precio_venta,Empleados_idEmpleado,Clientes_idClientes,Articulos_idArticulos)VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pst =reg.prepareStatement(sql) ;
                pst.setString(1, fecha);
                pst.setString(2, precio);
                pst.setString(3, id_Empleado);
                pst.setString(4, id_Cliente);
                pst.setString(5, id_Articulo);
                int n = pst.executeUpdate();
                if(n==1){
                    JOptionPane.showMessageDialog(null, "Venta registrada con éxito.");
                }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RegistraEmpeño(String fechaini,String fechafin,String prestamo,String renovacion,String finiquito,String estado,String id_Empleado,String id_Cliente,String id_Articulo){
       con=new Conectar();
       reg =con.conexion();
       String sql;
       sql = "INSERT INTO empeños (Fecha_ini_emp,Fecha_fin_emp,Prestamo,Renovacion,Finiquito,Estado,Empleados_idEmpleado,Clientes_idClientes,Articulos_idArticulos)VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst =reg.prepareStatement(sql) ;
            pst.setString(1, fechaini);
            pst.setString(2, fechafin);
            pst.setString(3, prestamo);
            pst.setString(4, renovacion);
            pst.setString(5, finiquito);
            pst.setString(6, estado);
            pst.setString(7, id_Empleado);
            pst.setString(8, id_Cliente);
            pst.setString(9, id_Articulo);
            int n = pst.executeUpdate();
            if(n==1){
            JOptionPane.showMessageDialog(null, "Empeño registrado con éxito.");
                }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Hubo un error : "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RegistraApartado(String fechaini,String fechafin,String precioapart,String refrendo,String id_Empleado,String id_Cliente,String id_Articulo){
     con=new Conectar();
       reg =con.conexion();
       String sql;
       sql = "INSERT INTO apartados (Fecha_ini_apart,Fecha_fin_apart,Precio_apart,Refrendo,Empleados_idEmpleado,Clientes_idClientes,Articulos_idArticulos)VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst =reg.prepareStatement(sql) ;
            pst.setString(1, fechaini);
            pst.setString(2, fechafin);
            pst.setString(3, precioapart);
            pst.setString(4, refrendo);
            pst.setString(5, id_Empleado);
            pst.setString(6, id_Cliente);
            pst.setString(7, id_Articulo);
            
            int n = pst.executeUpdate();
            if(n==1){
            JOptionPane.showMessageDialog(null, "Apartado registrado con éxito.");
                }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error : "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RefEmp(String id,String ref,String fechafinew){
        con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
     String stado="Renovado";
        try {
            pst =reg.prepareStatement("UPDATE empeños SET Renovacion=?,Estado=?,Fecha_fin_emp=? WHERE idEmpeños=?") ;
            pst.setString(1, ref);
            pst.setString(2,stado);
            pst.setString(3, fechafinew);
            pst.setString(4, id);
            pst.executeUpdate();
            
         JOptionPane.showMessageDialog(null,"La renovacion se efectuó con exito");
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
    }
    public void RetiroEmp(String id,String finiquito){
        con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
     String stado="Retirado";
        try {
            pst =reg.prepareStatement("UPDATE empeños SET Finiquito=?,Estado=? WHERE idEmpeños=?") ;
            pst.setString(1, finiquito);
            pst.setString(2, stado);
            pst.setString(3, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Operación exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
    }
    
    public void RefAprt(String id,String ref){
        con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
        try {
            pst =reg.prepareStatement("UPDATE apartados SET Refrendo=? WHERE idApartados=?") ;
            pst.setString(1, ref);
            pst.setString(2, id);
            pst.executeUpdate();
            
         JOptionPane.showMessageDialog(null,"El refrendo se efectuó con exito");
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
    }
    
    public String ConsultaCliente(String nombre){
        String idcliente=null;
            con=new Conectar();
            reg =con.conexion();
            PreparedStatement pst;
            ResultSet rs;
        try {
            
            pst=reg.prepareStatement("SELECT * FROM clientes WHERE Cliente_nom=?");
            pst.setString(1,nombre);
            rs=pst.executeQuery();
            while(rs.next()){
                idcliente=rs.getString(1);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(idcliente==null){
        return "No existe";    
        }
        else
        return idcliente;
    }
    
    public void InsertarClinte(String nom,String tel){
      con=new Conectar();
       reg =con.conexion();
       String sql;
       sql = "INSERT INTO clientes (Cliente_nom,Cliente_tel)VALUES(?,?)";
        try {
            PreparedStatement pst =reg.prepareStatement(sql);
            pst.setString(1, nom);
            pst.setString(2, tel);
            int n = pst.executeUpdate();
            if(n==1){
            JOptionPane.showMessageDialog(null, "Cliente agregado.");
                }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error \n"+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String ConsultaultCliente(){
        String idcliente=null;
            con=new Conectar();
            reg =con.conexion();
            PreparedStatement pst;
            ResultSet rs;
        try {
            
            pst=reg.prepareStatement("SELECT MAX(idClientes) AS idClientes from clientes");
            rs=pst.executeQuery();
            while(rs.next()){
                idcliente=rs.getString(1);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error \n"+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroMov.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idcliente;
    }
    
}
