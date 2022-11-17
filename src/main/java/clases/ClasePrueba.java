/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author FX506
 */
public class ClasePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClasePersona persona1 = ServicioPersonas.solicitarDatosPersona();
        ClasePersona persona2 = new ClasePersona();
        persona2.setNombre("Noelia");
        persona2.setEdad(30);
        persona2.setSexo('M');
        persona2.setPeso(65);
        persona2.setAltura(1.59);
        System.out.println(persona1);
        System.out.println(persona2);
        
        System.out.println("IMC de Persona 1: " + persona1.calcularIMC(0, 0));

        if(persona1.esMayorEdad()){
            System.out.println("Persona 1 es mayor de edad");
        } else{
            System.out.println("Persona 1 es menor de edad");
        }
        
        System.out.println("IMC de Persona 2 : " + persona2.calcularIMC(0, 0));
        if(persona2.esMayorEdad()){
            System.out.println("Persona 2 es mayor de edad");
        } else{
            System.out.println("Persona 2 es menor de edad");
        }
        
        if (persona1.calcularIMC(0, 0) < 18.5){
            System.out.println("Persona 1 tiene bajo peso");
        }else if(persona1.calcularIMC(0, 0) < 24.9){
            System.out.println("Persona 1 tiene un peso adecuado");
        } else{
            System.out.println("Pêrsona 1 tiene sobrepeso");
        }
        
        if (persona2.calcularIMC(0, 0) < 18.5){
            System.out.println("Persona 2 tiene bajo peso");
        }else if(persona2.calcularIMC(0, 0) < 24.9){
            System.out.println("Persona 2 tiene un peso adecuado");
        } else{
            System.out.println("Persona 2 tiene sobrepeso");
        }
        
        ClaseSerie s1 = new ClaseSerie("Los Simpson", "Comedia", "...", "Ni idea", 1000, 200);
        persona1.darLike(s1);
        System.out.println(s1);
    }
    
   
}
