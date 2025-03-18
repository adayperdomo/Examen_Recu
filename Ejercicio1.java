package com.mycompany.exanenpractico;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    // Array que contendrá los 100 números aleatorios
    private int[] numeros;

    // Constructor: genera el array y lo rellena con números aleatorios entre 0 y 99
    public Ejercicio1() {
        numeros = new int[100];
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }
    }

    // Método para conocer el mayor de los números
    public int obtenerMayor() {
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }

    // Método para conocer el menor de los números
    public int obtenerMenor() {
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }

    // Método para obtener la suma de todos los números
    public int obtenerSuma() {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    // Método para obtener la media de todos los números
    public double obtenerMedia() {
        return (double) obtenerSuma() / numeros.length;
    }

    // Método para sustituir el valor de un elemento por otro número (se valida la posición)
    public void modificarElemento(int posicion, int nuevoValor) {
        if (posicion >= 0 && posicion < numeros.length) {
            numeros[posicion] = nuevoValor;
            System.out.println("El valor en la posición " + posicion + " ha sido modificado a " + nuevoValor);
        } else {
            System.out.println("Posición no válida. Debe estar entre 0 y " + (numeros.length - 1));
        }
    }

    // Método principal que muestra el menú de opciones y llama a los métodos correspondientes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio1 ejercicio = new Ejercicio1();
        int opcion;
        
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Conocer el mayor de los números.");
            System.out.println("2. Conocer el menor de los números.");
            System.out.println("3. Obtener la suma de todos los números.");
            System.out.println("4. Obtener la media de todos los números.");
            System.out.println("5. Sustituir el valor de un elemento.");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción (1-6): ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("El mayor de los números es: " + ejercicio.obtenerMayor());
                    break;
                case 2:
                    System.out.println("El menor de los números es: " + ejercicio.obtenerMenor());
                    break;
                case 3:
                    System.out.println("La suma de todos los números es: " + ejercicio.obtenerSuma());
                    break;
                case 4:
                    System.out.println("La media de todos los números es: " + ejercicio.obtenerMedia());
                    break;
                case 5:
                    System.out.print("Introduzca la posición a modificar (0-99): ");
                    int pos = sc.nextInt();
                    System.out.print("Introduzca el nuevo valor: ");
                    int nuevoValor = sc.nextInt();
                    ejercicio.modificarElemento(pos, nuevoValor);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);
        
        sc.close();
    }
}
