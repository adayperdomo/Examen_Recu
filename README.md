# Ejercicio1

```
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
```

#Ejercicio2

```
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
```

#Ejercicio3

```
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
```

#Ejercicio4

```
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
```
