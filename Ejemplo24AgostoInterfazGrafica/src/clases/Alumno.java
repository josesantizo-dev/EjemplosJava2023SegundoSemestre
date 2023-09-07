/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.ImageIcon;

/**
 *
 * @author joses
 */
public class Alumno extends Persona {

    private ImageIcon foto;

    public Alumno(int codigo, String nombre, String apellido, String correo, String genero, String usuario, String password, ImageIcon foto) {
        super(codigo, nombre, apellido, correo, genero, usuario, password);
        this.foto = foto;
    }

    public Alumno(int codigo, String nombre, String apellido, String correo, String genero) {
        super(codigo, nombre, apellido, correo, genero);
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

}
