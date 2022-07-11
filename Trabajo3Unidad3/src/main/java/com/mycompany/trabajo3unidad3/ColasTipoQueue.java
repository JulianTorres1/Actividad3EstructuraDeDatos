package com.mycompany.trabajo3unidad3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColasTipoQueue {
    public static void main(String[] args) {

        // Primero Creamos nuestro objeto cola que a su ves es una cola tipo Queue
        Queue<String> cola = new LinkedList<String>();

        Scanner sc = new Scanner(System.in);

        int enable = 1;
        int opcion = 0;

        while (enable == 1){
            System.out.println("""
                    Que Desea Realizar:
                        1. Ver los elementos de la cola.
                        2. incertar un elemento en la cola.
                        3. eliminar el ultimo elemento en la cola
                        5. Salir
                    """);

            opcion = sc.nextInt();

            if (opcion == 1){
                System.out.println("Contenido: " + cola );
            } else if (opcion == 2) {
                System.out.println("Ingrese el Texto a ingresar: " );
                cola.add(sc.next());
            } else if (opcion == 3) {
                System.out.println("Eliminando ...");
                cola.remove();
            } else if (opcion == 5) {
                System.out.println("Saliendo ...");
                break;
            }
        }
    }
}
