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
public class Bus extends Vehiculo{
    private int pasajeros;
    private String tipo;

    public Bus() {
        super();
    }

    public Bus(int pasajeros, String color, String marca, String modelo, int anio, double precio, int llantas) {
        super(color, marca, modelo, anio, precio, llantas);
        this.pasajeros = pasajeros;
        if (pasajeros>50){
            this.tipo = "De ruta";
        }else{
            this.tipo="Rapidito";
        }
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Bus{" + "pasajeros=" + pasajeros + ", tipo=" + tipo + ", cmaxima="+'}';
    }
    
    
    
    
}
