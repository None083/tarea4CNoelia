/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class ServicioPersonas {
    
    public static ClasePersona solicitarDatosPersona(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿cómo te llamas?");
        String nombre = teclado.nextLine();
        System.out.println("¿Qué edad tienes?");
        int edad = teclado.nextInt();
        System.out.println("¿Cuál es tu sexo?");
        char sexo = teclado.next().charAt(0);
        System.out.println("¿Cuál es tu peso?");
        double peso = teclado.nextDouble();
        System.out.println("¿cuál es tu altura?");
        double altura = teclado.nextDouble();
        
        return new ClasePersona(nombre, edad, sexo, peso, altura);
    }
    
    
    
}
