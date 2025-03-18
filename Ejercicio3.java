package com.mycompany.exanenpractico;


import java.util.Scanner;

public class Ejercicio3 {
    // Atributo que almacenará la frase ingresada
    private String frase;
    
    // Constructor que solicita la frase al usuario
    public Ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        // Se cierra el Scanner si no se utilizará en otros métodos
        sc.close();
    }
    
    // Método que cuenta y devuelve la cantidad de espacios en blanco en la frase
    public int contarEspacios() {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }
    
    // Método main para ejecutar la aplicación
    public static void main(String[] args) {
        Ejercicio3 app = new Ejercicio3();
        int espacios = app.contarEspacios();
        System.out.println("La frase tiene " + espacios + " espacios en blanco.");
    }
}
