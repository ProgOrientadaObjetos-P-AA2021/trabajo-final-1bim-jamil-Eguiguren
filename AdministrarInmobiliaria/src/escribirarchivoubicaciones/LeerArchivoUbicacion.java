/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirarchivoubicaciones;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import paquetetres.Ubicacion;


/**
 *
 * @author jamil
 */
public class LeerArchivoUbicacion {
            private ObjectInputStream entrada;
    private ArrayList<Ubicacion> ubicacion;
    private String nombreArchivo;

    public LeerArchivoUbicacion(String n) {
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

    public void establecerubicacion() {
        // 
        ubicacion = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Ubicacion registro = (Ubicacion) entrada.readObject();
                    ubicacion.add(registro);
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

    public ArrayList<Ubicacion> obtenerubicacion() {
        return ubicacion;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Calificaciones\n";
        for (int i = 0; i < obtenerubicacion().size(); i++) {
            Ubicacion p = obtenerubicacion().get(i);
            cadena = String.format("%sNumero casa %s\nNombre barrio: %s\n"
                    + "Referencia: %s", cadena,
                    p.obtenerNumerocasa(),
                    p.obtenerNombrebarrio(),
                    p.obtenerReferencia());
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

