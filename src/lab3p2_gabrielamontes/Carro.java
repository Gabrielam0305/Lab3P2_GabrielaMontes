/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gabrielamontes;

import java.awt.Color;

/**
 *
 * @author Gabriela Montes
 */
public class Carro extends Vehiculo {
    private int puertas;
    private String motor;
    private int velocidad;

    public Carro() {
        super();
    }

    public Carro(int puertas, String motor, int velocidad, String color, String marca, String modelo, int anio, double precio, int llantas) {
        super(color, marca, modelo, anio, precio, llantas);
        this.puertas = puertas;
        this.motor = motor;
        this.velocidad = velocidad;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Carro{" + super.toString()+ "puertas=" + puertas + ", motor=" + motor + ", velocidad=" + velocidad + '}';
    }
    
}
