
package paquetecinco;

import java.io.Serializable;

public class Constructora  implements Serializable{
    private String nombreCons;
    private String idEmpr;
    
    public Constructora(String nombreConst, String idEmpre){
      nombreCons = nombreConst;
      idEmpr =  idEmpre;       
    }
    
    
    public void establecerNombreCons(String nombreConst){
        nombreCons = nombreConst;
    }
    public void establecerIdEmpr(String idEmpre){
        idEmpr = idEmpre;
    }
    
    public String obtenerNombreCons() {
        return nombreCons;
    }
    public String obtenerIdEmpr() {
        return idEmpr;
    }
            
    
}
