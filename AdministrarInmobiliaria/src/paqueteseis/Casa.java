
 
package paqueteseis;
import java.io.Serializable;
import paquetedos.Propietario;
import paquetecuatro.Ciudad;
import paquetetres.Ubicacion;
import paquetecinco.Constructora;


public class Casa implements Serializable {
    private Propietario propie;
    private double preC;
    private double numC;
    private double costoF;
    private Ubicacion ubic;
    private Ciudad ciud;
    private int numCuar;
    private Constructora cons;
    
    
    public Casa(double preCu,double numCu,
                int numCuart){
       preC = preCu;
       numC= numCu; 
       numCuar= numCuart;
    }
    
    
    
    
    public void establecerPropietario(Propietario propiet){
        propie = propiet;        
    }
    
    public void establecerPrecioCuadrado(double preCu){
        preC = preCu;        
    }
    public void establecerNumeroCuadrado(double numCu){
        numC= numCu;        
    }
    public void establecerUbicacion(Ubicacion ubica){
        ubic= ubica;        
    }
    public void establecerCiudad(Ciudad ciuda){
        ciud= ciuda;        
    }
    public void establecerNumeroCuartos(int numCuart){
        numCuar= numCuart;        
    }
    public void establecerConstructora(Constructora constr){
        cons = constr;        
    }
    public void calcularCostoFinal(){
        costoF= preC * numC;        
    }
  
    
    
        
        
    public Propietario obtenerPropietario() {
        return propie;
    }
    
    public double obtenerPrecioCuadrado() {
        return preC;
    }
    public double obtenerNumeroCuadrado() {
        return numC;
    }
    public Ubicacion obtenerUbicacion() {
        return ubic;
    }
    public Ciudad obtenerCiudad() {
        return ciud;
    }
    public int obtenerNumeroCuartos() {
        return numCuar;
    }
    public Constructora obtenerConstructora() {
        return cons;
    }
    public double obtenerCostoFinal() {
        return costoF;
    }
    
    
}
