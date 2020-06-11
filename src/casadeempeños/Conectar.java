
package casadeempeños;
import java.sql.*;
import javax.swing.*;

public class Conectar {
    
    Connection con=null;
    public Connection conexion (){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con =DriverManager.getConnection("jdbc:mysql://localhost/casaempeños?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","15Noviembre1996");
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Conexion no establecida."+e);
            System.out.println(e);
            
        }
        return con;
    }
    public Connection desconectar(){
        con=null;
        return con;
    }
    
}
