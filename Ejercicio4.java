package com.mycompany.exanenpractico;


import java.util.Scanner;

public class Ejercicio4 {
    // Atributos que almacenan la frase y la palabra introducidas por el usuario
    private String frase;
    private String palabra;
    
    // Constructor: solicita la frase y la palabra al usuario
    public Ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        System.out.print("Introduce una palabra: ");
        palabra = sc.nextLine();
        sc.close();
    }
    
    // Método que cuenta cuántas veces aparece la palabra en la frase
    public int contarOcurrencias() {
        int contador = 0;
        int index = 0;
        
        // Se utiliza indexOf para buscar la palabra y se recorre la frase
        while ((index = frase.indexOf(palabra, index)) != -1) {
            contador++;
            index += palabra.length();
        }
        
        return contador;
    }
    
    // Método main para ejecutar la aplicación
    public static void main(String[] args) {
        Ejercicio4 buscador = new Ejercicio4();
        int veces = buscador.contarOcurrencias();
        System.out.println("La palabra \"" + buscador.palabra + "\" aparece " + veces + " veces en la frase.");
    }
}
