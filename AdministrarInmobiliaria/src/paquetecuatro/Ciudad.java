/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ciudad  implements Serializable{
    private String nombreCiu;
    private String nombrePr;
    
    public Ciudad(String nombreCiud, String nombrePro){
      nombreCiu = nombreCiud;
      nombrePr =  nombrePro;       
    }
    
    
    public void establecerNombreCiu(String nombreCiud){
        nombreCiu = nombreCiud;
    }
    public void establecerNombrePr(String nombrePro){
        nombrePr = nombrePro;
    }
    
    public String obtenerNombreCiu() {
        return nombreCiu;
    }
    public String obtenerNombrePr() {
        return nombrePr;
    }
       
    
}
