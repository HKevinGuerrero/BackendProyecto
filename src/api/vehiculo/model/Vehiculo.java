/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.model;

/**
 *
 * @author PC
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private double velocidadMax;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String placa, double velocidadMax) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidadMax = velocidadMax;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }
    

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the velocidadMax
     */
    public double getVelocidadMax() {
        return velocidadMax;
    }

    /**
     * @param velocidadMax the velocidadMax to set
     */
    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    
}
