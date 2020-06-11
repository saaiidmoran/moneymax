/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultarCliente;

import casadeempeños.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Said
 */
public class Manejocuentas {
    Conectar con;
    Connection reg;
    Inicio_sesion ini;
    String cuenta;

    public Manejocuentas() {
        this.cuenta = Inicio_sesion.cuenta;
    }
    
    public  DefaultTableModel Consultartodas(){
        
        con=new Conectar();
         reg =con.conexion();
         DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("idCuenta");
            modelo.addColumn("Nombre");
            modelo.addColumn("Contraseña");
            modelo.addColumn("Acceso");
           
            String[]datos=new String[4];
            PreparedStatement pst;
             ResultSet rs;
            try {
            
            pst=reg.prepareStatement("SELECT * FROM empleados WHERE Nom_emp != ? ORDER BY Nom_emp");
            pst.setString(1,cuenta);
            rs=pst.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                modelo.addRow(datos);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(AgregarCuenta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Hubo un error en la operacion: "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Manejocuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
     return modelo;
    }
    
    public void Insertarcuenta(String nombre,String tipo,String contra){
       con=new Conectar();
       reg =con.conexion();
        try {
            String sql="INSERT INTO empleados (Nom_emp,contraseña,acceso)VALUES(?,?,?)";
            try {
                PreparedStatement pst =reg.prepareStatement(sql) ;
                pst.setString(1, nombre);
                pst.setString(2, contra);
                pst.setString(3, tipo);
                int n = pst.executeUpdate();
                if(n==1){
                    JOptionPane.showMessageDialog(null, "Agregado correctamente.");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(AgregarCuenta.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Hubo un error : "+ex);
            }
            reg.close();            
        } catch (SQLException ex) {
            Logger.getLogger(Manejocuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Eliminacuenta(String id){
        try {
            con=new Conectar();
            reg =con.conexion();
            PreparedStatement pst;
            
            try {
                pst=reg.prepareStatement("DELETE FROM empleados WHERE idEmpleado=?");
                pst.setString(1,id);
                int n = pst.executeUpdate();
                if(n==1){
                    JOptionPane.showMessageDialog(null, "Eliminado correctamente.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AgregarCuenta.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Hubo un error : "+ex);
            }
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Manejocuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public DefaultTableModel mostrarconsulta(String id){
            con=new Conectar();
            reg =con.conexion();
            DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("idCuenta");
            modelo.addColumn("Nombre");
            modelo.addColumn("Contraseña");
            modelo.addColumn("Acceso"); 
            String[]datos=new String[4];
            PreparedStatement pst;
            ResultSet rs;
            try {
           pst=reg.prepareStatement("SELECT * FROM empleados WHERE idEmpleado=?");
            pst.setString(1,id);
            rs=pst.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                modelo.addRow(datos);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AgregarCuenta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Hubo un error en la operacion: "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Manejocuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
       return modelo;  
    }
    public void ActualizaCuenta(String id,String nombre,String contraseña,String acceso){
        con=new Conectar();
         reg =con.conexion();
          PreparedStatement pst;
          
        try {
            pst =reg.prepareStatement("UPDATE empleados SET Nom_emp=?,contraseña=?,acceso=? WHERE idEmpleado=?");
            pst.setString(1, nombre);
            pst.setString(2, contraseña);
            pst.setString(3, acceso);
            pst.setString(4, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"¡Modificacion exitosa!");
        } catch (SQLException ex) {
            Logger.getLogger(Manejocuentas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Manejocuentas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
    }
    
    public void ActualizaContraseña(String contraseña,String nombre){
        con=new Conectar();
         reg =con.conexion();
          PreparedStatement pst;
          
        try {
            pst =reg.prepareStatement("UPDATE empleados SET contraseña=? WHERE Nom_emp=?");
            pst.setString(1, contraseña);
            pst.setString(2, nombre);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"¡Se actualizó la contraseña!");
        } catch (SQLException ex) {
            Logger.getLogger(Manejocuentas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Manejocuentas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
    }
}
