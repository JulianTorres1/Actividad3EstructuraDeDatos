package com.mycompany.trabajo3unidad3;

import javax.swing.plaf.synth.SynthTreeUI;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class ColasTipoQueue {
    public static void main(String[] args) {

        // Primero Creamos nuestro objeto cola que a su ves es una cola tipo Queue
        Queue<String> cola = new LinkedList<String>();

        Scanner sc = new Scanner(System.in);

        int enable = 1;
        int opcion = 0;
        int nuemeroDeElementos;

        // Elementos Pre-Cargados
        cola.add("Nicolas");
        cola.add("jonny");
        cola.add("Edwin");

        System.out.println("Elementos PreCargados: " + cola);


        while (enable == 1){
            System.out.println("""
                    Que Desea Realizar:
                        1. Ver los elementos de la cola.
                        2. incertar un elemento en la cola.
                        3. eliminar el ultimo elemento en la cola
                        4. saber cuantos elementos hay dentro de la cola.
                        5. verificar si la cola esta vacia.
                        6. Buscar un elemento Dentro de la cola.
                        7. Obtener posicion de un elemento.
                        8. Obtener la posicion X de un elemento.
                        9. Eliminar un elemento cualquiera de la cola.
                        10. agregar una subCola dentro de la cola existente.
                        11. Eliminar varios elementos consecutivos de la cola.
                        12. Borrar todos los elementos de la cola.
                        13. Salir
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
            } else if (opcion == 4) {
                nuemeroDeElementos = cola.size();
                System.out.println("Hay " + nuemeroDeElementos);
            } else if (opcion == 5) {
                if (cola.size() == 0) {
                    System.out.println("La cola esta vacia");
                } else {
                    nuemeroDeElementos = cola.size();
                    System.out.println("La cola No! esta vacia con un " + nuemeroDeElementos + " elementos");
                }
            } else if (opcion == 6) {
                System.out.println("dijite el elemento a buscar: ");
                String busqueda = sc.next();
                if (cola.contains(busqueda)) {
                    System.out.println("Objeto " + busqueda + " encontrado");
                }else {
                    System.out.println("Objeto No encontrado :C");
                }
            }else if (opcion == 7){
                System.out.println("ingrese el Contenido a encontrar su indice");
                String content = sc.next();

                for (int i = 0; i < cola.size(); i++) {
                    if (((LinkedList<String>) cola).get(i).contains(content)) {
                        System.out.println("El elemento " + content + " equivale al indice " + i);
                    }else {
                        System.out.println("el elemento no exite dentro de la cola");
                    }
                }
            }else if (opcion == 8){
                System.out.printf("Dijite  la posicion de elemento a Buscar\n");
                for (int i = 0; i < cola.size(); i++) {
                    System.out.println("Indices disponibles " + i);
                }
                int index = sc.nextInt();
                String elementoIndex = ((LinkedList<String>) cola).get(index);
                System.out.println("el elemento en el indice "+ index + " es " + elementoIndex);

            }else if (opcion == 9){
                System.out.println("dispone de los siguientes elementos: " + cola);
                System.out.println("Ingrese el Contenido del elemento a eliminar:");

                String Contenido = sc.next();
                cola.remove(Contenido);
                System.out.println("Resultado: " + cola);

            }else if (opcion == 10){
                System.out.println("ingresa el nuemero de elemento a agregar");
                int cuantoselementos = sc.nextInt();
                Queue<String> subCola = new LinkedList<String>();
                for (int i = 0; i < cuantoselementos ;i++){
                    System.out.println("ingresa el contenido del elemento " + i);
                    subCola.add(sc.next());
                }
                cola.add(String.valueOf(subCola));
                System.out.println("Resultado: " + cola);

            }else if (opcion == 11){
                System.out.println("""
                        Seleccione una opcion:
                            1. eliminar los siguientes elementos en la cola.
                            2. eliminar por contenido.
                        """);
                int opcionEliminar = sc.nextInt();

                if (opcionEliminar == 1){
                    System.out.println("Ingrese el nuemro de elementos que desea eliminar: ");
                    int cuantosEliminar = sc.nextInt();
                    for (int i = 0; i < cuantosEliminar; i++) {
                        cola.remove();
                    }
                    System.out.println("Elementos eliminados!, Cola: " + cola );
                } else if (opcionEliminar == 2) {
                    System.out.println("Cuantos elementos eliminara? ");
                    int cuantosIndex = sc.nextInt();
                    for (int i = 0; i < cuantosIndex; i++) {
                        System.out.println("ingrese el contenido del elemento " + i +" a eliminar: ");
                        String deleteElemento = sc.next();
                        try {
                            cola.remove(deleteElemento);
                        }catch (Exception e) {
                            System.out.println("No se encontro el elemento a eliminar: " + deleteElemento + "\n" + e.getMessage());
                        }
                    }
                    System.out.println("Elementos eliminados, Cola: " + cola);
                }

            }else if (opcion == 12){
                System.out.println("Borrando ....");
                Iterator<String> itr = cola.iterator();

                while (itr.hasNext())
                {
                    cola.remove();
                    System.out.println("Borrando");
                }
                System.out.println("Todos los elementos han sido eliminados!, elementos: " + cola.size());
                System.out.println(cola);
            }else if (opcion == 13){
                System.out.println("Saliendo ...");
                break;
            }
        }
    }
}
