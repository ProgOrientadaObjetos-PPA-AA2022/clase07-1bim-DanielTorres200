/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author spart
 */
public class Ejecutor2 {
    public static void main(String[] args) {
     // nombre del archivo
        String nombreArchivo = "Hospitales.data";
        String buscarDoctor = "6623";
        Hospital h;
        LecturaArchivoSecuencial lectura =  new LecturaArchivoSecuencial (nombreArchivo);
        lectura.establecerIdentificador(buscarDoctor);
        lectura.establecerDoctorBuscado();
        h = lectura.obtenerDoctorBuscado();
        if(h!=null){
            System.out.println(h);
        }else{
            System.out.println("Medico no encontrado");
        }
        
    }
}
