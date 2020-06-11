/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

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
public class Modifica {
    
    private Conectar con;
    private Connection reg;
    
    public void ModificaArticulo(String id,String nombre,String marca,String modelo,String serie,String categoria,String descripcion,String calidad,String kilataje,String modalidad,String locacion){
     con = new Conectar();
     reg =con.conexion();
     PreparedStatement pst;
     
        try {
            pst =reg.prepareStatement("UPDATE articulos SET Nombre_art=?,Marca_art=?,Modelo_art=?,Serie_art=?,Categ_art=?,Descripcion=?,Estado_calidad=?,Kilataje=?,Modalidad=?,Locacion=? WHERE idArticulos=?");
            pst.setString(1, nombre);
            pst.setString(2, marca);
            pst.setString(3, modelo);
            pst.setString(4, serie);
            pst.setString(5, categoria);
            pst.setString(6, descripcion);
            pst.setString(7, calidad);
            pst.setString(8, kilataje);
            pst.setString(9, modalidad);
            pst.setString(10, locacion);
            pst.setString(11, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Modificación exitosa");
            
        } catch (SQLException ex) {
            Logger.getLogger(Modifica.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
        try {
            reg.close();
        } catch (SQLException ex) {
            Logger.getLogger(Modifica.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"Error\n"+ex);
        }
    }
    
}
