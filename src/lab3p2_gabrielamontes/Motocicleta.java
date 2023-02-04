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
public class Motocicleta extends Vehiculo{
    private String desplazamientomotor;
    private boolean electrica;

    public Motocicleta() {
        super();
    }

    public Motocicleta(String desplazamientomotor, boolean electrica, String color, String marca, String modelo, int anio, double precio, int llantas) {
        super(color, marca, modelo, anio, precio, llantas);
        this.desplazamientomotor = desplazamientomotor;
        this.electrica = electrica;
    }

    public String getDesplazamientomotor() {
        return desplazamientomotor;
    }

    public void setDesplazamientomotor(String desplazamientomotor) {
        this.desplazamientomotor = desplazamientomotor;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + super.toString()+ "desplazamientomotor=" + desplazamientomotor + ", electrica=" + electrica + '}';
    }
    
}
