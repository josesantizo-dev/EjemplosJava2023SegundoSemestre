/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplohilos5octubre;

/**
 *
 * @author joses
 */
public class EjemploHilos5Octubre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Proceso1 miProceso1 = new Proceso1(); //Heredando Thread
        Proceso1 miProceso3 = new Proceso1(); //Heredando Thread
        
        Proceso2 miProceso2Temporal = new Proceso2();
        Thread miProceso2 = new Thread(miProceso2Temporal);//Implementando Runnable
        
        System.out.println("SIN HILOS");
        miProceso1.imprimirFechaActual();
        miProceso2Temporal.imprimirFechaActual();
        
        System.out.println("CON HILOS");
        miProceso1.start();
        miProceso2.start();
        miProceso3.start();
        
        boolean estaVivoProceso1 = miProceso1.isAlive();
        
        while(estaVivoProceso1){
            System.out.println("Proceso1 esta vivo");
            estaVivoProceso1 = miProceso1.isAlive();
        }
        System.out.println("Proceso1 esta muerto");
    }
    
}
