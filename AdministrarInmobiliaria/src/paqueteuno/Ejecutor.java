/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

;







import escrivirarchivodepartamentos.LeerArchivoDepartamento;
import leerarchivocasas.LeerArchivoCasa;
import escribirarchivoconstructoras.LeerArchivoConstructora;
import lecturaarchivociudades.LeerArchivoCiudad;
import escribirarchivoubicaciones.LeerArchivoUbicacion;
import escrivirarchivodepartamentos.EscribirArchivoDepartamento;
import lecturaarchivoPropietario.LeerArchivoPropietario;
import paqueteseis.Departamento;
import leerarchivocasas.EscribirArchivoCasa;
import paqueteseis.Casa;
import escribirarchivoconstructoras.EscribirArchivoConstructora;
import paquetecinco.Constructora;
import lecturaarchivociudades.EscribirArchivoCiudad;
import paquetecuatro.Ciudad;
import escribirarchivoubicaciones.EscribirArchivoUbicacion;
import paquetetres.Ubicacion;
import lecturaarchivoPropietario.EscribirArchivoPropietario;
import paquetedos.Propietario;
import java.util.Scanner;


/**
 *
 * @author reroes
 */


public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreCons;
        String idEmpr;
        String nombreCiu;
        String nombrePr;
        String nomb;
        String apell;
        String id;
        int numC;
        String nomB;
        String ref;
        boolean bandera = true;
        int numero;
        String nombreArchivo1 = "Propietario.txt";
        String nombreArchivo2 = "Ubicacion.txt";
        String nombreArchivo3 = "Ciudad.txt";
        String nombreArchivo4 = "Constructora.txt";
        String nombreArchivo5 = "Casa.txt";
        String nombreArchivo6 = "Departamento.txt";

        do {

            System.out.println("Ingrese un numero para realizar la accion:\n"
                    + "-1 para Ingresar datos del Propietario: \n"
                    + "-2 para Ingresar datos del ubicacion: \n"
                    + "-3 para Ingresar datos de la Ciudad: \n"
                    + "-4 para Ingresar datos de la Constructoras: \n"
                    + "-5 para Ingresar datos de la casass: \n"
                    + "-6 para Ingresar datos de los departamentos: \n"
                    + "-7 para presentar todos los datos: ");
            numero = sc.nextInt();
            sc.nextLine();
            switch (numero) {
                case 1:
                    //Propietario
                    System.out.println("Ingrese el nombre del propietario: ");
                    nomb = sc.nextLine();

                    System.out.println("Ingrese el apellido del propietario: ");
                    apell = sc.nextLine();

                    System.out.println("Ingrese la idetificacion del propietario: ");
                    id = sc.nextLine();

                    Propietario ob1 = new Propietario(nomb, apell, id);

                    EscribirArchivoPropietario escritura1 = new EscribirArchivoPropietario(nombreArchivo1);
                    // establecer el valor del atributo registro
                    escritura1.establecerRegistro(ob1);
                    // estabalecer en el archivo el atributo del registro
                    escritura1.establecerSalida();

                    escritura1.cerrarArchivo();

                    break;
                case 2:
                    //ubicacion
                    System.out.println("Ingrese el numero de casa: ");
                    numC = sc.nextInt();
                    sc.nextInt();
                    System.out.println("Ingrese el nombre del barrioa: ");
                    nomB = sc.nextLine();

                    System.out.println("Ingrese una referencia: ");
                    ref = sc.nextLine();

                    Ubicacion ob2 = new Ubicacion(numC, nomB, ref);

                    EscribirArchivoUbicacion escritura2 = new EscribirArchivoUbicacion(nombreArchivo2);
                    // establecer el valor del atributo registro
                    escritura2.establecerRegistro(ob2);
                    // estabalecer en el archivo el atributo del registro
                    escritura2.establecerSalida();

                    escritura2.cerrarArchivo();

                    break;

                case 3:
                    //Ciudad
                    System.out.println("Ingrese el nombre de la ciudad: ");
                    nombreCiu = sc.nextLine();

                    System.out.println("Ingrese el nombre de la provincia: ");
                    nombrePr = sc.nextLine();

                    Ciudad ob3 = new Ciudad(nombreCiu, nombrePr);
                    EscribirArchivoCiudad escritura3 = new EscribirArchivoCiudad(nombreArchivo3);
                    // establecer el valor del atributo registro
                    escritura3.establecerRegistro(ob3);
                    // estabalecer en el archivo el atributo del registro
                    escritura3.establecerSalida();

                    escritura3.cerrarArchivo();
                    break;

                case 4:
                    //Constructoras
                    System.out.println("Ingrese el nombre de laconstructora: ");
                    nombreCons = sc.nextLine();

                    System.out.println("Ingrese el id de la empresa: ");
                    idEmpr = sc.nextLine();

                    Constructora ob4 = new Constructora(nombreCons, idEmpr);

                    EscribirArchivoConstructora escritura4 = new EscribirArchivoConstructora(nombreArchivo4);
                    // establecer el valor del atributo registro
                    escritura4.establecerRegistro(ob4);
                    // estabalecer en el archivo el atributo del registro
                    escritura4.establecerSalida();

                    escritura4.cerrarArchivo();

                    break;

                case 5:
                    //casa
                    double preC;
                    double numCu;
                    double costoF;
                    int numCuar;

                    System.out.println("Ingrese el Precio Cuadrado: ");
                    preC = sc.nextDouble();

                    System.out.println("Ingrese el Numero Cuadrado: ");
                    numCu = sc.nextDouble();

                    System.out.println("Ingrese el Numero de cuartos: ");
                    numCuar = sc.nextInt();
                    sc.nextInt();
                    Casa ob5 = new Casa(preC, numCu, numCuar);

                    EscribirArchivoCasa escritura5 = new EscribirArchivoCasa(nombreArchivo5);
                    // establecer el valor del atributo registro
                    escritura5.establecerRegistro(ob5);
                    // estabalecer en el archivo el atributo del registro
                    escritura5.establecerSalida();

                    escritura5.cerrarArchivo();
                    break;

                case 6:
                    //Departamento
                    double preCua;
                    double numCuadra;
                    double valorAl;
                    double costoFi;
                    double prec;

                    System.out.println("Ingrese el Precio Cuadrado: ");
                    preCua = sc.nextDouble();

                    System.out.println("Ingrese el Numero Cuadrado: ");
                    numCuadra = sc.nextDouble();

                    System.out.println("Ingrese el Valor Alicuota: ");
                    valorAl = sc.nextInt();

                    System.out.println("Ingrese el Precio: ");
                    prec = sc.nextInt();
                    sc.nextInt();
                    Departamento ob6 = new Departamento(preCua, numCuadra, valorAl, prec);

                    EscribirArchivoDepartamento escritura6 = new EscribirArchivoDepartamento(nombreArchivo6);
                    // establecer el valor del atributo registro
                    escritura6.establecerRegistro(ob6);
                    // estabalecer en el archivo el atributo del registro
                    escritura6.establecerSalida();

                    escritura6.cerrarArchivo();

                    break;

                case 7:
                    LeerArchivoPropietario lectura1 = new LeerArchivoPropietario(nombreArchivo1);
                    lectura1.establecerPropietario();
                    System.out.println(lectura1);

                    LeerArchivoUbicacion lectura2 = new LeerArchivoUbicacion(nombreArchivo2);
                    lectura2.establecerubicacion();
                    System.out.println(lectura2);

                    LeerArchivoCiudad lectura3 = new LeerArchivoCiudad(nombreArchivo3);
                    lectura3.establecerCiudad();
                    System.out.println(lectura3);

                    LeerArchivoConstructora lectura4 = new LeerArchivoConstructora(nombreArchivo4);
                    lectura4.establecerConstructora();
                    System.out.println(lectura4);

                    LeerArchivoCasa lectura5 = new LeerArchivoCasa(nombreArchivo5);
                    lectura5.establecerCasa();
                    System.out.println(lectura5);

                    LeerArchivoDepartamento lectura6 = new LeerArchivoDepartamento(nombreArchivo6);
                    lectura6.establecerDepartamento();
                    System.out.println(lectura6);

                    break;
            }

        } while (bandera);
    }
}
