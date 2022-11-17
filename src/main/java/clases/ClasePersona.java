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

    private String nombre;
    private int edad;
    private String NIF;
    private char sexo;
    private double peso;
    private double altura;

    public ClasePersona() {
        this.NIF = generaNIF();
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
        this.NIF = generaNIF();
    }
    
    public void darLike (ClaseSerie serie){
        serie.darLike();
    }

    public static boolean filtrarSexo(char sexo) {

        return sexo == 'H' || sexo == 'M' || sexo == 'O';
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
        
        return this.edad >= 18;
    }
    
    public float calcularIMC(double peso, double altura){
        
        return (float)(this.peso / Math.pow(this.altura, 2));
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNif() {
        return NIF;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        if (filtrarSexo(sexo)) {
            this.sexo = sexo;
        } else {
            this.sexo = 'O';
        }
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "ClasePersona{" + "nombre=" + nombre + ", edad=" + edad + ", NIF=" + NIF + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    

}
