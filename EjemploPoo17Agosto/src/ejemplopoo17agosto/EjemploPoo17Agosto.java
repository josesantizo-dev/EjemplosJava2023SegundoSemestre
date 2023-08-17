/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopoo17agosto;

import clases.Usuario;
import clases.Vehiculo;

/**
 *
 * @author joses
 */
public class EjemploPoo17Agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Usuario usuarioA = new Usuario("Roberto", "123456789",20);
        usuarioA.setNombre("Armando");
        usuarioA.DarMiInformacion();
        
        Vehiculo vehiculoDeUsuarioA = new Vehiculo("Toyota","Yaris","123ABC");
        usuarioA.setVehiculo(vehiculoDeUsuarioA);
        
        usuarioA.DarMiInformacionDeMiVehiculo();
        
        Usuario usuarioB = new Usuario("Celeste", "111222333", 25);
        usuarioB.DarMiInformacion();
    }
}
