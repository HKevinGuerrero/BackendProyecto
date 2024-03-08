
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package api.vehiculoo;

import api.vehiculo.domain.services.PruebaRutaVehiculo;
import api.vehiculo.model.Carro;
import api.vehiculo.model.Moto;
import java.util.Scanner;


/**
 *
 * kevin Jose Guerrero 
 * Daniel Eduardo Barrios
 * Deyfren Bravo Herrera
 * @author PC
 */
public class ApiVehiculoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipo;
        String tipoo;
        String tipoomoto;
        
        do{
            System.out.println("---Ingrese los datos del vehiculo---");
            System.out.print("¿Es carro o moto?: ");
            tipo= scanner.next();
            if ("carro".equals(tipo)||"Carro".equals(tipo)){
                System.out.print("Ingrese que tipo de carro es (mecanico o automatico): ");
                tipoo=scanner.next();
                if("mecanico".equals(tipoo)||"Mecanico".equals(tipoo) || "automatico".equals(tipoo)|| "Automatico".equals(tipoo)){
                    
                    System.out.print("Ingrese la marca del carro: ");
                    String MarcaAuto=scanner.next();
                    System.out.print("Ingrese la placa del carro: ");
                    String PlacaAuto=scanner.next();
                    System.out.print("Ingrese modelo del auto: ");
                    String modeloAuto=scanner.next();
                    System.out.print("Ingrese la velocidad maxima: ");
                    double VelocidadMax=scanner.nextDouble();
                    
                    
                    Carro carro =new Carro(tipoo,MarcaAuto,modeloAuto,PlacaAuto,VelocidadMax);
                     PruebaRutaVehiculo pruebaRutaCarro = new PruebaRutaVehiculo(carro);
                     
                     System.out.println("---Realizando prueba del carro---");
                     pruebaRutaCarro.acelerar();
                     pruebaRutaCarro.direccion();
                     pruebaRutaCarro.estacionamiento();
                     pruebaRutaCarro.frenar();
  
                }else{
                    System.out.println("Ingrese nuevamente la informacion");
                }
            }else{
                
            }if("Moto".equals(tipo)||"moto".equals(tipo)){
                System.out.print("Ingrese que tipo de moto ");
                tipoomoto=scanner.next();
                if("mecanico".equals(tipoomoto)||"Mecanico".equals(tipoomoto) || "automatico".equals(tipoomoto)|| "Automatico".equals(tipoomoto)){
                    System.out.print("Ingrese la marca de la moto: ");
                    String Marcamoto=scanner.next();
                    System.out.print("Ingrese la placa de la moto ");
                    String Placamoto=scanner.next();
                    System.out.print("Ingrese modelo de la moto: ");
                    String modelomoto=scanner.next();
                    System.out.print("Ingrese la velocidad maxima de la moto: ");
                    double VelocidadMaxMoto=scanner.nextDouble();
                    System.out.print("Ingrese el cilindraje de la moto: ");
                    double cilindraje=scanner.nextDouble();
                    
                    Moto moto=new Moto(cilindraje, Marcamoto, modelomoto, Placamoto, VelocidadMaxMoto);
                    PruebaRutaVehiculo pruebarutaMoto=new PruebaRutaVehiculo(moto);
                    
                    pruebarutaMoto.acelerar();
                    pruebarutaMoto.direccion();
                    pruebarutaMoto.estacionamiento();
                    pruebarutaMoto.frenar();
                }
                
            }
            
        }while(!tipo.equalsIgnoreCase("fin"));
       
         
    }
    
}
