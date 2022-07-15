package com.mycompany.trabajo3unidad3;

import java.util.Stack;

public class PilasTipoStack {
    public static void main(String[] args) {
        System.out.println("""
                Que Desea Realizar:
                    1. nada jaja
                """);

        Stack pila = new Stack();
        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println(pila);

        pila.push(4);

        System.out.println(pila);

        pila.pop();


    }
}
