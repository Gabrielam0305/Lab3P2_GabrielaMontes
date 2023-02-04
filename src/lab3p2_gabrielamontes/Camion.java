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
public class Camion extends Vehiculo{
    private int carga;
    private int altura;
    private boolean retroexcavadora;

    public Camion() {
        super();
    }

    public Camion(int carga, int altura, boolean retroexcavadora, String color, String marca, String modelo, int anio, double precio, int llantas) {
        super(color, marca, modelo, anio, precio, llantas);
        this.carga = carga;
        this.altura = altura;
        this.retroexcavadora = retroexcavadora;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRetroexcavadora() {
        return retroexcavadora;
    }

    public void setRetroexcavadora(boolean retroexcavadora) {
        this.retroexcavadora = retroexcavadora;
    }

    @Override
    public String toString() {
        return "Camion{" + super.toString()+ "carga=" + carga + ", altura=" + altura + ", retroexcavadora=" + retroexcavadora + '}';
    }
    
    
}
