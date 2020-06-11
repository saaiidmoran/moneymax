
package casadeempeños;

public class Excepciones extends Exception{
    public Excepciones(){
        super("Por favor llena los datos faltantes.");
    }
    
    public void nombre_tel(String nombre, String Tel) throws Excepciones{
      if("".equals(nombre)||"".equals(Tel))throw new Excepciones();
            }
     public void nombre_fecha_precio(String nombre, String fecha,String precio) throws Excepciones{
      if("".equals(nombre)||"".equals(fecha)||"".equals(precio))throw new Excepciones();
            }
    //caso de string
    public boolean cadena(String nombre){
        return "".equals(nombre);
    }
    
    //para caso de int
    public boolean entero(int tel){
        return "".equals(tel);
    }
}
