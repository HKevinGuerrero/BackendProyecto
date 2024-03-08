/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.domain.services;

import api.vehiculo.model.Vehiculo;

/**
 *
 * @author PC
 */
public class PruebaRutaVehiculo implements PruebaRuta{
    
    private Vehiculo vehiculo; //se utilizará para almacenar información sobre un vehículo relacionado con la prueba de ruta.

    public PruebaRutaVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

   
    @Override
    public void acelerar() {
        System.out.println("Acelerando el Vehiculo "+ vehiculo.getMarca()+" con numero de placa de: "+ vehiculo.getPlaca()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el Vehiculo "+ vehiculo.getMarca()+" con numero de placa de: "+ vehiculo.getPlaca()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void estacionamiento() {
        System.out.println("Estacionando el Vehiculo "+ vehiculo.getMarca()+" con numero de placa de: "+ vehiculo.getPlaca()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void direccion() {
        System.out.println("Direccionando el Vehiculo "+ vehiculo.getMarca()+" con numero de placa de: "+ vehiculo.getPlaca()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
