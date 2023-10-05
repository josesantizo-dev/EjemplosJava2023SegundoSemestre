/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author joses
 */
public class MateriaPrima extends Thread {

    private Color color;
    private int posicionX;
    private int posicionY;
    private int tiempo;
    private JPanel bolita;

    public MateriaPrima(Color color, int posicionX, int posicionY, int tiempo) {
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.tiempo = tiempo;
        this.bolita = new JPanel();
        this.bolita.setSize(25, 25);
        this.bolita.setLocation(posicionX, posicionY);
        this.bolita.setForeground(color);
        this.bolita.setBackground(color);
    }

    @Override
    public void run() {
        try {
            if (this.bolita.getX() > this.posicionX) {
                for (int i = this.bolita.getX(); i > this.posicionX; i--) {
                    this.bolita.setLocation(i, this.bolita.getY());
                    Thread.sleep(5);
                }
            } else if (this.bolita.getX() <= this.posicionX) {
                for (int i = this.bolita.getX(); i <= this.posicionX; i++) {
                    this.bolita.setLocation(i, this.bolita.getY());
                    Thread.sleep(5);
                }
            }
            if (this.bolita.getY() > this.posicionY) {
                for (int i = this.bolita.getY(); i > this.posicionY; i--) {
                    this.bolita.setLocation(this.bolita.getX(), i);
                    Thread.sleep(5);
                }
            } else if (this.bolita.getY() <= this.posicionY) {
                for (int i = this.bolita.getY(); i <= this.posicionY; i++) {
                    this.bolita.setLocation(this.bolita.getX(), i);
                    Thread.sleep(5);
                }
            }
            // Sleep for 5 seconds
        } catch (InterruptedException e) {
            // Handle the exception if the sleep is interrupted
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public JPanel getBolita() {
        return bolita;
    }

    public void setBolita(JPanel bolita) {
        this.bolita = bolita;
    }
}
