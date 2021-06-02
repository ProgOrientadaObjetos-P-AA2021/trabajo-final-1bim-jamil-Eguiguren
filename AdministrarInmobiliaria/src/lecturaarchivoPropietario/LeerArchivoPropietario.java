/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaarchivoPropietario;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import paquetedos.Propietario;

/**
 *
 * @author jamil
 */
public class LeerArchivoPropietario {
    
    private ObjectInputStream entrada;
    private ArrayList<Propietario> propietario;
    private String nombreArchivo;

    public LeerArchivoPropietario(String n) {
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

    public void establecerPropietario() {
        // 
        propietario = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Propietario registro = (Propietario) entrada.readObject();
                    propietario.add(registro);
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

    public ArrayList<Propietario> obtenerpropietario() {
        return propietario;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Calificaciones\n";
        for (int i = 0; i < obtenerpropietario().size(); i++) {
            Propietario p = obtenerpropietario().get(i);
            cadena = String.format("%sNombre: %s\nApellido: %s\nId: %s\n", cadena,
                    p.obtenerNombre(),
                    p.obtenerId(),
                    p.obtenerApellido());
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

    

