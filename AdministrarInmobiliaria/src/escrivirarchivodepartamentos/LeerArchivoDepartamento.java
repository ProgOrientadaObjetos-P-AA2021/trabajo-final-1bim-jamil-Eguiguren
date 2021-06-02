/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrivirarchivodepartamentos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import paqueteseis.Departamento;

/**
 *
 * @author jamil
 */
public class LeerArchivoDepartamento {
    private ObjectInputStream entrada;
    private ArrayList<Departamento> departamento;
    private String nombreArchivo;

    public LeerArchivoDepartamento(String n) {
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } // fin de try
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo.");

            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerDepartamento() {
        // 
        departamento = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Departamento registro = (Departamento) entrada.readObject();
                    departamento.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    // System.err.println("No hay datos en el archivo: " + ex);
                    break;
                }
            }
        }

    }

    public ArrayList<Departamento> obtenerdepartamento() {
        return departamento;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Calificaciones\n";
        for (int i = 0; i < obtenerdepartamento().size(); i++) {
            Departamento p = obtenerdepartamento().get(i);
            cadena = String.format("%sPrecio Cuadrado: %.2f\n"
                    + "Numero Cadrado: %.2f\nValor Alicuota: %.2f\n"
                    + "CostoFinal: %.2f\nPrecio: %.2f\n", cadena,
                    p.obtenerPrecioCuadrado(),
                    p.obtenerNumeroCuadrado(),
                    p.obtenerValorAlicuota(),
                    p.obtenerCostoFinal(),
                    p.obtenerPrecio());
          }
        return cadena;
    }
   
    // cierra el archivo y termina la aplicación
    public void cerrarArchivo() {
        try // cierra el archivo y sale
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método cerrarArchivo
}
    

