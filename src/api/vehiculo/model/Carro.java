/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.model;

/**
 *
 * @author PC
 */
public class Carro extends Vehiculo{
    private String TipoTraccion;

    public Carro(String TipoTraccion, String marca, String modelo, String placa, double velocidadMax) {
        super(marca, modelo, placa, velocidadMax);
        this.TipoTraccion = TipoTraccion;
    }

    /**
     * @return the TipoTraccion
     */
    public String getTipoTraccion() {
        return TipoTraccion;
    }

    /**
     * @param TipoTraccion the TipoTraccion to set
     */
    public void setTipoTraccion(String TipoTraccion) {
        this.TipoTraccion = TipoTraccion;
    }
    
    
}
