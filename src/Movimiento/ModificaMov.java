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

/**
 *
 * @author saaii
 */
public class ModificaMov {
    
    private Conectar con;
    private Connection reg;
    
    public void ModificaCompra(String id,String fecha,String precio,String empleado,String cliente,String articulo){
     con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
        try {
            pst =reg.prepareStatement("UPDATE compras SET Fecha_comp=?,Precio_comp=?,Empleados_idEmpleado=?,Clientes_idClientes=?,Articulos_idArticulos=? WHERE idCompras=?");
            pst.setString(1,fecha );
            pst.setString(2,precio );
            pst.setString(3, empleado);
            pst.setString(4,cliente);
            pst.setString(5,articulo );
            pst.setString(6,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Modificación exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(ModificaMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModificaMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
        
    }
    
    public void ModificaVenta(String id,String fecha,String precio,String empleado,String cliente,String articulo){
       con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst; 
        try {
            pst =reg.prepareStatement("UPDATE ventas SET Fecha_venta=?,Precio_venta=?,Empleados_idEmpleado=?,Clientes_idClientes=?,Articulos_idArticulos=? WHERE idVentas=?");
            pst.setString(1,fecha );
            pst.setString(2,precio );
            pst.setString(3, empleado);
            pst.setString(4,cliente);
            pst.setString(5,articulo );
            pst.setString(6,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Modificación exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(ModificaMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModificaMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
    }
    
    public void ModificaEmpeño(String id,String fechaini,String fechafin,String prestamo,String renovacion,String finiquito,String estado,String empleado,String cliente,String articulo){
        con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst; 
        try {
            pst =reg.prepareStatement("UPDATE empeños SET Fecha_ini_emp=?,Fecha_fin_emp=?,Prestamo=?,Renovacion=?,Finiquito=?,Estado=?,Empleados_idEmpleado=?,Clientes_idClientes=?,Articulos_idArticulos=? WHERE idEmpeños=?");
            pst.setString(1,fechaini);
            pst.setString(2,fechafin);
            pst.setString(3,prestamo);
            pst.setString(4,renovacion);
            pst.setString(5,finiquito);
            pst.setString(6, estado);
            pst.setString(7, empleado);
            pst.setString(8,cliente);
            pst.setString(9,articulo );
            pst.setString(10,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Modificación exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(ModificaMov.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModificaMov.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
    }
    
    public void ModificaApartado(String id,String fechaini,String fechafin,String precio,String refrendo,String empleado,String cliente,String articulo){
        con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
        try {
            pst =reg.prepareStatement("UPDATE apartados SET Fecha_ini_apart=?,Fecha_fin_apart=?,Precio_apart=?,Refrendo=?,Empleados_idEmpleado=?,Clientes_idClientes=?,Articulos_idArticulos=? WHERE idApartados=?");
            pst.setString(1,fechaini);
            pst.setString(2,fechafin);
            pst.setString(3,precio);
            pst.setString(4,refrendo);
            pst.setString(5, empleado);
            pst.setString(6,cliente);
            pst.setString(7,articulo );
            pst.setString(8,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Modificación exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(ModificaMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModificaMov.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }

    }
    
    
}
