/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Random;

/**
 *
 * @author noelia
 */
public class ClasePersona {

    String nombre;
    int edad;
    String nif;
    char sexo;
    double peso;
    double altura;

    public ClasePersona() {
    }

    public ClasePersona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        if (filtrarSexo(sexo)) {
            this.sexo = sexo;
        } else {
            this.sexo = 'O';
        }
        this.nif = generaNIF();
    }

    public static boolean filtrarSexo(char sexo) {

        if (sexo == 'H' || sexo == 'M' || sexo == 'O') {
            return true;
        } else {
            return false;
        }
    }

    public static String generaNIF() {
        String numero = "";

        Random aleatorio = new Random();
        for (int i = 0; i <= 8; i++) {   
            numero = numero + Integer.toString(aleatorio.nextInt(10));
        }
        
        int resto = Integer.parseInt(numero) % 23;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        numero = numero + letras.charAt(resto);
        
        return numero;
    }
    
    public boolean esMayorEdad(){
        if (this.edad >= 18){
            return true;
        } else {
            return false;
        }
    }
    
    

}
