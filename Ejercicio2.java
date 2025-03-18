package com.mycompany.exanenpractico;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {
    // Atributo que almacenará todos los sueldos introducidos
    private ArrayList<Integer> sueldos;
    
    // Constructor: recopila los sueldos hasta que se introduce -1
    public Ejercicio2() {
        sueldos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el sueldo de cada persona (ingrese -1 para terminar):");
        while (true) {
            System.out.print("Sueldo: ");
            int sueldo = sc.nextInt();
            if (sueldo == -1) {
                break;
            }
            sueldos.add(sueldo);
        }
        // Nota: No se cierra el Scanner si se usará en otros métodos o en main.
    }
    
    // Método que muestra todos los sueldos ordenados de forma creciente
    public void mostrarSueldosOrdenados() {
        // Creamos una copia para no modificar el orden original almacenado en 'sueldos'
        ArrayList<Integer> sueldosOrdenados = new ArrayList<>(sueldos);
        Collections.sort(sueldosOrdenados);
        System.out.println("\nSueldos ordenados de forma creciente:");
        for (int sueldo : sueldosOrdenados) {
            System.out.print(sueldo + " ");
        }
        System.out.println(); // Salto de línea
    }
    
    // Método que muestra el sueldo máximo y el mínimo
    public void mostrarMaximoMinimo() {
        if (sueldos.isEmpty()) {
            System.out.println("No se han ingresado sueldos.");
            return;
        }
        int max = Collections.max(sueldos);
        int min = Collections.min(sueldos);
        System.out.println("\nSueldo máximo: " + max);
        System.out.println("Sueldo mínimo: " + min);
    }
    
    // Método que calcula y muestra la media de los sueldos
    public void mostrarMedia() {
        if (sueldos.isEmpty()) {
            System.out.println("No se han ingresado sueldos.");
            return;
        }
        int suma = 0;
        for (int sueldo : sueldos) {
            suma += sueldo;
        }
        double media = (double) suma / sueldos.size();
        System.out.println("\nMedia de sueldos: " + media);
    }
    
    // Método main para ejecutar la aplicación
    public static void main(String[] args) {
        Ejercicio2 encuesta = new Ejercicio2();
        if (encuesta.sueldos.isEmpty()) {
            System.out.println("No se ingresaron sueldos. Finalizando el programa.");
        } else {
            encuesta.mostrarSueldosOrdenados();
            encuesta.mostrarMaximoMinimo();
            encuesta.mostrarMedia();
        }
    }
}
