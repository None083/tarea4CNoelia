/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author noelia
 */
public class MisPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClasePersona juan = new ClasePersona();
        System.out.println(juan);
        ClasePersona maria = new ClasePersona("María", 23, 'M', 60.3, 1.70);
        
        ClaseSerie s1 = new ClaseSerie("Los Simpson", "Comedia", "...", "Ni idea", 1000, 200);
        ClaseSerie s2 = new ClaseSerie("House of cards", "Drama", "...", "Ni idea", 6, 0);
        System.out.println(s1);
        maria.darLike(s1);
        System.out.println(s1);
        juan.darLike(s2);
        System.out.println(s2);
        
        juan.setSexo('i');
        System.out.println(juan);
        
        
        
        System.out.println(maria);
        juan.setEdad(15);
        System.out.println("IMC María " + maria.calcularIMC(0, 0));
        
        ClasePersona persona1 = ServicioPersonas.solicitarDatosPersona();
        System.out.println(persona1);
    }
    
    
}
