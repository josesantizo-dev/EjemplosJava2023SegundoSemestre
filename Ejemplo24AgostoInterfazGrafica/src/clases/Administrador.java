/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author joses
 */
public class Administrador extends Persona {

    private static ArrayList<Alumno> alumnos = new ArrayList<>();

    public Administrador(String usuario, String password) {
        super(usuario, password);
    }

    public static ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public static void setAlumnos(ArrayList<Alumno> alumnos) {
        Administrador.alumnos = alumnos;
    }

}
