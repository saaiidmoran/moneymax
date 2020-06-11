/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casadeempeños;

import ConsultarReporte.ConsultasMov;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saaii
 */
public class NotificaconesSQL {
    private DefaultTableModel modelo;
    private Conectar con;
    private Connection reg;
    public DefaultTableModel ConsultaEmpeñosfecha(String fecha1){
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
            pst=reg.prepareStatement("SELECT * FROM empeños WHERE Fecha_fin_emp<=? AND Estado!='Retirado'");
            pst.setString(1,fecha1);
            
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
                this.CambiaEstado(datos[0]);
                modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(NotificaconesSQL.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
    try {
        reg.close();
    } catch (SQLException ex) {
        Logger.getLogger(NotificaconesSQL.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Hay un error \n"+ex);
    }
        return modelo;
    
    }
    
     public DefaultTableModel ConsultaApartadosfecha(String fecha1){
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
        pst=reg.prepareStatement("SELECT * FROM apartados WHERE Fecha_fin_apart<=? AND Precio_apart!=Refrendo AND Precio_apart!='0'");
            pst.setString(1,fecha1);
           
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
    return modelo;
    
    }
     
      public void RetiroEmp(String id){
        con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
     String stado="Retirado";
        try {
            pst =reg.prepareStatement("UPDATE empeños SET Estado=? WHERE idEmpeños=?") ;
            pst.setString(1, stado);
            pst.setString(2, id);
            pst.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(NotificaconesSQL.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(NotificaconesSQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
    }
      
       public void CambiaEstado(String id){
        con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
     String stado="No Renovado";
        try {
            pst =reg.prepareStatement("UPDATE empeños SET Estado=? WHERE idEmpeños=?") ;
            pst.setString(1, stado);
            pst.setString(2, id);
            pst.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(NotificaconesSQL.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(NotificaconesSQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
    }
    
       public void actualizart(String id){
     con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
        try {
            pst =reg.prepareStatement("UPDATE articulos SET Modalidad='En Venta' WHERE idArticulos=?") ;
            pst.setString(1, id);
             pst.executeUpdate();
              JOptionPane.showMessageDialog(null,"¡El articulo se puso en venta!");
        } catch (SQLException ex) {
            Logger.getLogger(NotificaconesSQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error : "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(NotificaconesSQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error : "+ex);
        }
    }
       
       public void RefAprt(String id){
        con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
     String precioaprt="0";
        try {
            pst =reg.prepareStatement("UPDATE apartados SET Precio_apart=? WHERE idApartados=?") ;
            pst.setString(1, precioaprt);
            pst.setString(2, id);
            pst.executeUpdate();
            
         
        } catch (SQLException ex) {
            Logger.getLogger(NotificaconesSQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(NotificaconesSQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hubo un error \n: "+ex);
        }
    }
}
