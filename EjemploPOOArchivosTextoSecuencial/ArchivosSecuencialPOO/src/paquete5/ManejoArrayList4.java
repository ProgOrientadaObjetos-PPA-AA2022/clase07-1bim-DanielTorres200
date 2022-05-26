package paquete5;

import java.util.ArrayList;
import paquete1.Empresa;

public class ManejoArrayList4 {
    public static void main(String[] args) {
        Empresa c1 = new Empresa("Star Media", "Loja");
        Empresa c2 = new Empresa("ITC", "Loja");
        Empresa c3 = new Empresa("ElectroCompu", "Loja");
        Empresa c4 = new Empresa("Mundo Videojuego", "Loja");
        
        // ArrayList
        ArrayList <Empresa> empresa = new ArrayList<>();
        empresa.add(c1);
        empresa.add(c2);
        empresa.add(c3);
        empresa.add(c4);
        
        
        for (int i = 0; i < empresa.size(); i++) {
            System.out.printf("%s - %s \n",
            empresa.get(i).obtenerNombre(),
            empresa.get(i).obtenerCiudad());
        }
    }
}
