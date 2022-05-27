/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;
public class Ejecutor {
    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "Hospital.txt";
        
        Hospital h1 = new Hospital("San Agustin",250, 100000);
        Hospital h2 = new Hospital("Isidro Ayora",100, 500000);
        Hospital h3 = new Hospital("Mogrovejo",175, 75000);
        Hospital h4 = new Hospital("San Jose",100, 25000);
        

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistro(h1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        
        // establecer el valor del atributo registro
        archivo.establecerRegistro(h2);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
            
        // establecer el valor del atributo registro
        archivo.establecerRegistro(h3);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        
        // establecer el valor del atributo registro
        archivo.establecerRegistro(h4);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        
        // proceso para lectura del archivo
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        // System.out.println(lectura.toString());
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
