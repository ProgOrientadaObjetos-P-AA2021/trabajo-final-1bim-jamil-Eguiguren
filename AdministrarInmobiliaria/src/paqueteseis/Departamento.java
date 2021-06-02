/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

import java.io.Serializable;
import paquetecinco.Constructora;
import paquetecuatro.Ciudad;
import paquetedos.Propietario;
import paquetetres.Ubicacion;

/**
 *
 * @author reroes
 */
public class Departamento  implements Serializable{
    private Propietario propie;
    private double preC;
    private double numC;
    private double valorAl;
    private double costoF;
    private double prec;
    private Ubicacion ubic;
    private Ciudad ciud;
    private String nombreE;
    private String ubiD;
    private Constructora cons;
    
    
    public Departamento(double preCu,double valorAli,
            double numCu,double preci){
       preC = preCu;
       numC= numCu;
       valorAl = valorAli;
       prec = preci;

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
    public void establecerValorAlicuota(double valorAli){
        valorAl = valorAli;        
    }
    public void establecerPrecio(double preci){
        prec = preci;        
    }
    public void establecerUbicacion(Ubicacion ubica){
        ubic= ubica;        
    }
    public void establecerCiudad(Ciudad ciuda){
        ciud= ciuda;        
    }
    public void establecerNombreEdificio(String nombreEd){
        nombreE= nombreEd;        
    }
    public void establecerUbicacionDepartamento(String ubiDe){
        ubiD= ubiDe;        
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
    public double obtenerValorAlicuota() {
        return valorAl;
    }
    public double obtenerPrecio() {
        return prec;
    }
    public Ubicacion obtenerUbicacion() {
        return ubic;
    }
    public Ciudad obtenerCiudad() {
        return ciud;
    }
    public String obtenerNombreEdificio() {
        return nombreE;
    }
    public String obtenerUbicacionDepartamento() {
        return ubiD;
    }
    public Constructora obtenerConstructora() {
        return cons;
    }
    public double obtenerCostoFinal() {
        return costoF;
    }
    
    
}
