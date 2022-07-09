/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajo3unidad3;

import java.util.Scanner;

/**
 *
 * @author nicolast
 */
public class Trabajo3Unidad3 {

    public static void main(String[] args) {
        System.out.println("Trabajo # 3 De Estructura De Datos: ");

        int opcion = 6;
        int informacionNodo = 0;
        Cola cola = new Cola();

        Scanner sc = new Scanner(System.in);




        while (opcion != 0){
            System.out.println("""
                Elija Que Desea hacer:
                
                1.Comprobar que la cola esta vacia.
                2.Incertar elementos en la cola.
                3.Extraer elementos de la cola.
                4.Mostrar elementos de la cola.
                5.Salir
                """);

            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Comprobando ...");
                if (cola.ColaVacia()) {
                    System.out.println("La cola esta vacia!");
                }else {
                    System.out.println("La Cola No esta Vacia!");
                }
            }

            if (opcion == 2) {
                System.out.println("Incertar");
            }

            if (opcion == 3) {
                System.out.println("Extraer");
            }

            if (opcion == 4) {
                System.out.println("Mostrar");
            }
            if (opcion == 5) {
                System.out.println("Saliendo ...");
                break;
            }
        }




    }
}
