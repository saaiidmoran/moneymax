/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casadeempeños;

/**
 *
 * @author Said
 */
import java.sql.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Inicio_sesion {
   
    public static String id,cuenta,contra,acceso;
     Conectar con;
     Connection reg;
     
    
    public String Iniciar(String cuenta,String contraseña){
        
        if(!"".equals(cuenta)&&!"".equals(contraseña)){
        con = new Conectar();
        reg =con.conexion();
        PreparedStatement pst;
        ResultSet rs;
            try {
                pst=reg.prepareStatement("SELECT * FROM empleados WHERE Nom_emp=?");
                pst.setString(1,cuenta);
                
                rs=pst.executeQuery();
                
                while (rs.next()){
                id=rs.getString(1);
                Inicio_sesion.cuenta=rs.getString(2);
                contra=rs.getString(3);
                acceso=rs.getString(4);
                }
                
               
                
            } catch (SQLException ex) {
                Logger.getLogger(Inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Ocurrio un error: "+ex);
                
            }
            if(id==null|Inicio_sesion.cuenta==null|contra==null|acceso==null){
                return "Incorrecto";
            }
              if(!contra.equals(contraseña)){ 
                 acceso="Incorrecto";
                }
              
            try {
                reg.close();
            } catch (SQLException ex) {
                Logger.getLogger(Inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }    
         else{
                acceso="Incorrecto";
                }
        return acceso; 
       
    }
    
    public String getCuenta(){
        return cuenta;
    }
    
}
