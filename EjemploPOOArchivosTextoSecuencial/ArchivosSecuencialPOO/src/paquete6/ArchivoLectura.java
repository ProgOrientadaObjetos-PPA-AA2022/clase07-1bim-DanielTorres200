/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArchivoLectura {
    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Hospital> lista;

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s", nombreArchivo);
        // data/profesores.txt
        File f = new File(rutaArchivo); // data/profesores.txt
        if (f.exists()) {
            try {
                entrada = new Scanner(new File(rutaArchivo));
                // entrada = new Scanner(System.in);
                // entrada = new Scanner(f);
            } // fin de try
            catch (FileNotFoundException e) {
                System.err.println("Error al leer del archivo: " + e);

            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    // establecer valores de cada línea
    // en la lista de tipo Profesor
    public void establecerLista() {
        lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {

            String linea = entrada.nextLine();
            
            ArrayList<String> linea_partes = new ArrayList<>(
                    Arrays.asList(linea.split(";")));
            
            String nombre = linea_partes.get(0);
            int numeroCamas = Integer.parseInt(linea_partes.get(1));
            double presupuesto = Integer.parseInt(linea_partes.get(1));

            Hospital h = new Hospital(nombre,numeroCamas,presupuesto);

            lista.add(h);

        } 
    }

    public ArrayList<Hospital> obtenerLista() {

        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

    @Override
    public String toString() {
        String cadena = "Hospitales\n";
        for (int i = 0; i < obtenerLista().size(); i++) {
            Hospital hosp = obtenerLista().get(i); // Obj. Profesor
            cadena = String.format("%s;%d;%f", cadena,
                    i + 1,
                    hosp.obtenerNombre(),// obtenerLista().get(i).obtenerNombre(),
                    hosp.obtenerNumeroCamas(),
                    hosp.obtenerPresupuesto());    // obtenerLista().get(i).obtenerTipo());
        }
        return cadena;
    }
}

