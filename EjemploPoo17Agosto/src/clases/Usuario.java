/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author joses
 */
public class Usuario {
    private String nombre;
    private String cui;
    private int edad;
    private Vehiculo vehiculo;

    public Usuario(String nombre, String cui, int edad) {
        this.nombre = nombre;
        this.cui = cui;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCui() {
        return this.cui;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void DarMiInformacion(){
        System.out.println("Soy el usuario: " + this.nombre);
        System.out.println("Mi cui es: " + this.cui);
        System.out.println("Mi edad es: " + this.edad);
        System.out.println("#####################################################################");
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void DarMiInformacionDeMiVehiculo(){
        System.out.println("Soy el usuario: " + this.nombre + " y estos son los datos de mi vehiculo");
        System.out.println("La marca de mi vehiculo es: " + this.vehiculo.getMarca());
        System.out.println("La linea de mi vehiculo es: " + this.vehiculo.getLinea());
        System.out.println("La placa de mi vehiculo es: " + this.vehiculo.getPlaca());
        System.out.println("#####################################################################");
    }
    
}
