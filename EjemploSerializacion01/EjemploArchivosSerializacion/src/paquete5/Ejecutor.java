/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import paquete5.Hospital;

/**
 *
 * @author spart
 */
public class Ejecutor {
    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "Hospitales.data";

        Hospital h1 = new Hospital("San Agustin",250, 1000, "1150331963");
        Hospital h2 = new Hospital("Isidro Ayora",100, 5000, "1180923424");
        Hospital h3 = new Hospital("Mogrovejo",175, 75000, "1149594030");
        Hospital h4 = new Hospital("San Jose",100, 25000, "11604948484");

        Hospital[] lista = {h1, h2, h3, h4};
        
        paquete5.EscrituraArchivoSecuencial archivo = new
        paquete5.EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        paquete5.LecturaArchivoSecuencial lectura = new paquete5.LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospital();
        System.out.println(lectura);
    }
}
