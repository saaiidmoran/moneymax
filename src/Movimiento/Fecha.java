/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimiento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saaii
 */
public class Fecha {
    
    public String fechaActual(){
        Date fecha =new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("yyyy-MM-dd");
        return formatoFecha.format(fecha);
    }
    
    public Date fechastringadateformat(String fecha){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date dt=null;
        try {
            dt=sdf.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(Fecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dt;
        
    }
    public String fechadateastring(Date fechafin){
        SimpleDateFormat formatoFecha=new SimpleDateFormat("yyyy-MM-dd");
        return formatoFecha.format(fechafin);
    }
    
}
