/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.model;

/**
 *
 * @author PC
 */
public class Moto extends Vehiculo {
    private double cilindraje;

    public Moto(double cilindraje, String marca, String modelo, String placa, double velocidadMax) {
        super(marca, modelo, placa, velocidadMax);
        this.cilindraje = cilindraje;
    }

    /**
     * @return the cilindraje
     */
    public double getCilindraje() {
        return cilindraje;
    }

    /**
     * @param cilindraje the cilindraje to set
     */
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
}
