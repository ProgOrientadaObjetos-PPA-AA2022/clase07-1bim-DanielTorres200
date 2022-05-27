/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.io.FileWriter;
import java.util.Formatter;
/**
 *
 * @author reroes
 */
public class ArchivoEscritura {
   private String nombreArchivo;
    private String rutaArchivo;
    private Hospital registro;
    private Formatter salidaArchivo;

    public ArchivoEscritura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s",
                nombreArchivo);

    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());;
    }

    public void establecerRegistro(Hospital n) {
        registro = n;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public Hospital obtenerRegistro() {
        return registro;
    }

    // agrega registros al archivo
    public void establecerSalida() {
        try {
            salidaArchivo = new Formatter(new FileWriter(rutaArchivo, true));
            Hospital p = obtenerRegistro();
            String cadenaRegistro = String.format("%s;%s;%.2f",
                    p.obtenerNombre(),
                    p.obtenerNumeroCamas(),
                    p.obtenerPresupuesto()
            );
            salidaArchivo.format("%s\n", cadenaRegistro);
            salidaArchivo.close();
        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.err.println(e);

        }
    }
    public void cerrarArchivo() {
        if (salidaArchivo != null) {
            salidaArchivo.close();
        } // cierra el archivo

    }
}
