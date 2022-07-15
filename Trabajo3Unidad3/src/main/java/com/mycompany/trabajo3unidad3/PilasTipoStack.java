package com.mycompany.trabajo3unidad3;

import java.util.Scanner;
import java.util.Stack;

public class PilasTipoStack {
    public static void main(String[] args) {

        //Variables

        boolean on = true;
        int opcion = 0;
        //Objetos

        Stack pila = new Stack();

        Scanner sc = new Scanner(System.in);

        //elementos PreCargados
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println("Elementos Pre-Cargados: " + pila.peek());


        while (on){

            System.out.println("""
                Que Desea Realizar:
                    1. Ver Pila
                    2. (Push) Ingresar dato a la pila
                    3. (Pop ) sacar ultimo dato de la pila
                """);

            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Contenido: " + pila);
            } else if (opcion == 2) {
                System.out.println("Ingrese texto a ingresar en la pila: ");

                pila.push(sc.next());

            } else if (opcion == 3) {
                System.out.println("Sacando ...");
                System.out.println(pila.pop());
            }
        }


    }
}
