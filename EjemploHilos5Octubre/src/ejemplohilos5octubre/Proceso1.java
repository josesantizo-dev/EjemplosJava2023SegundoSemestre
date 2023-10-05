/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplohilos5octubre;

import java.time.LocalDateTime;

/**
 *
 * @author joses
 */
public class Proceso1 extends Thread {

    @Override
    public void run() {
        LocalDateTime fechaActual = LocalDateTime.now();
        for (int i = 0; i < 50; i++) {
            System.out.println("Proceso1 " + i + " " + fechaActual);
            fechaActual = LocalDateTime.now();
        }
    }

    public void imprimirFechaActual() {
        LocalDateTime fechaActual = LocalDateTime.now();
        for (int i = 0; i < 50; i++) {
            System.out.println("Proceso1 " + i + " " + fechaActual);
            fechaActual = LocalDateTime.now();
        }
    }

}
