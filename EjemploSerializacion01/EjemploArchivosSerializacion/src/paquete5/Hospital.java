/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;
import paquete5.Hospital;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    
    String nombre;
    int numeroCamas;
    double presupuesto;
    String idHospital;
    
    public Hospital(String nombreH, int numeroC, double p, String idH) {
        this.nombre = nombreH; 
        this.numeroCamas = numeroC;
        this.presupuesto = p; 
        this.idHospital = idH;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerNumeroCamas(int n) {
        numeroCamas = n; 
    }
    
    public void establecerPresupuesto(double n) {
        presupuesto = n;
    }
    
    public void establecerIDDoctor(String n){
        idHospital = n;
    }

    public String obtenerNombre() {
        return nombre;
    }
    
    public int obtenerNumeroCamas() {
        return numeroCamas;
    }
    
    public double obtenerPresupuesto() {
        return presupuesto;
    }  
    
    public String obtenerIdDoctor(){
        return idHospital;
    }
    @Override
    public String toString(){
        String valor = String.format("%s-(%d)-%.2f - %s\n", obtenerNombre(),obtenerNumeroCamas(),
                obtenerPresupuesto(),obtenerIdDoctor());
        return valor;
    }
}