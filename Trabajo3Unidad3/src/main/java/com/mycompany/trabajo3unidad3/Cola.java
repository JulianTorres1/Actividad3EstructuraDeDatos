package com.mycompany.trabajo3unidad3;

import javax.swing.*;

public class Cola {

    private Nodo NodoInicial, Nodofinal;
    String InfoCola = "";

    public Cola(){
        NodoInicial = null;
        Nodofinal = null;
    }
    // Metodo Para Comprobar que la cola este vacia
    public boolean ColaVacia(){
        if (NodoInicial == null) {
            return true;
        }
        else {
            return false;
        }
    }

    // Metodo Para Incertar Elementos En La Cola
    public void IncertaCola(int parametro){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.infoNodo = parametro;

        nuevoNodo.SiguienteNodo = null;

        if (ColaVacia()){
            NodoInicial = nuevoNodo;
            Nodofinal = nuevoNodo;
        } else {
            Nodofinal.SiguienteNodo = nuevoNodo;
            Nodofinal = nuevoNodo;
        }
    }

    // Metodo para extraer elementos de la cola
    public int ExtraerCola(){
        if (!ColaVacia()){
            int info = NodoInicial.infoNodo;

            if(NodoInicial == Nodofinal){
                NodoInicial = null;
                Nodofinal = null;
            }else{
                NodoInicial = NodoInicial.SiguienteNodo;
            }
            return info;
        }
        return Integer.MAX_VALUE;
    }

    // Metodo para mostrar todo el contenido de nuestra cola
    public void MostrarCola(){
        Nodo recorrido = NodoInicial;
        String ColaInvertida = " ";

        while (recorrido != null){
            InfoCola = String.valueOf(recorrido.infoNodo);
            recorrido = recorrido.SiguienteNodo;
        }

        String cadena [] = InfoCola.split("  ");

        for (int i = cadena.length - 1; i < 0; i++) {
            ColaInvertida += " " + cadena[i];
        }
        System.out.printf("Contenido: "+ColaInvertida);
        System.out.println(ColaInvertida);
        JOptionPane.showMessageDialog(null, ColaInvertida);
    }

}



























