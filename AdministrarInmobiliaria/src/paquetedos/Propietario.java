/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Propietario  implements Serializable{
    private String nomb;
    private String apell;
    private String id;
    
    
    public Propietario (String nombr, String apelli, String ide){
        nomb = nombr;
        apell = apelli;
        id = ide;
    }

    
    
    public void establecerNombre(String nombr){
        nomb = nombr;        
    }
    
    public void establecerApellido(String apelli){
        apell = apelli;        
    }
        public void establecerId(String ide){
        id = ide;        
    }
  
    
    
    public String obtenerNombre() {
        return nomb;
    }
    
    public String obtenerApellido() {
        return apell;
    }
    public String obtenerId() {
        return id;
    }
    
}


