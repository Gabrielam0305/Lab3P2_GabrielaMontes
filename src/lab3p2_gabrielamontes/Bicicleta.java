/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gabrielamontes;

/**
 *
 * @author Gabriela Montes
 */
public class Bicicleta extends Vehiculo{
    private String descripcion;
    private int radio;
    private String tipo;

    public Bicicleta() {
        super();
    }

    public Bicicleta(String descripcion, int radio, String tipo) {
        this.descripcion = descripcion;
        this.radio = radio;
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "descripcion=" + descripcion + ", radio=" + radio + ", tipo=" + tipo + '}';
    }
    
}
