/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ubicacion implements Serializable{
    private int numC;
    private String nomB;
    private String ref;
    
    
    public Ubicacion (int numCa, String nomBa, String refe){
        numC = numCa;
        nomB = nomBa;
        ref = refe;
    }

    
    
    public void establecerNumerocasa(int numCa){
        numC = numCa;        
    }
    
    public void establecerNombrebarrio(String nomBa){
        nomB = nomBa;        
    }
        public void establecerReferencia(String refe){
        ref= refe;        
    }
  
    
    
    public int obtenerNumerocasa() {
        return numC;
    }
    
    public String obtenerNombrebarrio() {
        return nomB;
    }
    public String obtenerReferencia() {
        return ref;
    }
    
}
