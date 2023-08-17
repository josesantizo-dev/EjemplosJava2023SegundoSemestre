/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author joses
 */
public class Vehiculo {
    private String marca;
    private String linea;
    private String placa;

    public Vehiculo(String marca, String linea, String placa) {
        this.marca = marca;
        this.linea = linea;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getLinea() {
        return linea;
    }

    public String getPlaca() {
        return placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
