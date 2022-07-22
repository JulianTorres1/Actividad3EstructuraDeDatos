package com.mycompany.trabajo3unidad3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class PilasTipoStack {
    public static void main(String[] args) {

        //Variables

        boolean on = true;
        int opcion = 0;
        String BusquedaString;
        Boolean tipo = false;
        //Objetos

        Stack<java.lang.constant.Constable> pila = new Stack<>();

        Scanner sc = new Scanner(System.in);

        //elementos PreCargados
        pila.push("nicolas");
        pila.push("edwin");
        pila.push("jonny");
        System.out.println("Elementos Pre-Cargados: " + pila.peek());

        while (on){

            System.out.println(pila);

            System.out.println("""
                Que Desea Realizar:
                    1. Ver Pila.
                    2. (Push) Ingresar dato a la pila.
                    3. (Pop ) sacar ultimo dato de la pila.
                    4. Contar los Elementos De la Pila.
                    5. verificar si la pila esta vacia.
                    6. sacar primer elemento en la Pila.
                    7. Buscar elemento en la Pila.
                    8. Ingresar varios elementos a la pila.
                    9. incertar una elemento en la Pila.
                    10. eliminar varios elementos consecutivos.
                    11. Obtener la posicion de un elemento en la Pila.
                    12. buscar elementos en base a su indice.
                    13. vaciar toda la pila.
                """);

            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Contenido de la Pila: " + pila);
                
            } else if (opcion == 2) {
                System.out.println("Ingrese texto a ingresar en la pila: ");
                pila.push(sc.next());
                
            } else if (opcion == 3) {
                System.out.println("Sacando ...");
                System.out.println(pila.pop());
                
            } else if (opcion == 4) {
                int cantidad = 0;
                for (int i = 0; i < pila.size(); i++) {
                    System.out.println("Contando Elemento: " + i);
                    cantidad++;
                }
                System.out.println("cantidad total de elementos: " + cantidad);
                
            } else if (opcion == 5) {
                if (pila.size() != 0) {
                    System.out.println("la Pila NO! esta vacia.");
                }else {
                    System.out.println("Pila esta vacia");
                }
            } else if (opcion == 6) {
                if (!pila.isEmpty()) {
                    System.out.println("Eliminado Primer elemento: " + pila.get(0));
                    pila.remove(0);
                    System.out.println("Estado de la pila: " + pila);
                }else {
                    System.out.println("pila true");
                }

            } else if (opcion == 7) {
                System.out.println("Dijite su elemento a buscar: ");
                BusquedaString = sc.next();
                System.out.println("El elemento ingresado es numero ( y / n ): ");
                String str = sc.next();
                if (Objects.equals(str, "y")) {
                    int entero = Integer.parseInt(String.valueOf(BusquedaString));

                    if (pila.contains(entero)) {
                        System.out.println("Se encontro el elemento " + entero + " en la pila!");
                    }else {
                        System.out.println("No se encontro el elemento " + entero + " en la pila!");
                    }

                }else if (Objects.equals(str, "n")){
                    if (pila.contains(BusquedaString)) {
                        System.out.println("Se encontro el elemento: " + BusquedaString + " en la Pila!");
                    }else {
                        System.out.println("No! Se encontro el elemento: " + BusquedaString + " en la Pila.");
                    }
                }

            }else if (opcion == 8){
                System.out.println("Cuanto elementos va a agregar (ingresar cantidad en nuemeros): ");
                int cantidad = sc.nextInt();
                Stack<String> pilaadd = new Stack<>();
                for (int i = 0; i < cantidad; i++){
                    System.out.println("ingrese ele lemento #" + i);
                    pilaadd.push(sc.next());
                }
                System.out.println("agregando los elementos ...");
                try {
                    pila.addAll(pilaadd);
                }catch (Exception e){
                    System.out.println("no Se pudo agregar " + e);
                }
            } else if (opcion == 9) {



            }else if (opcion == 10) {
                System.out.println("""
                        Seleccione una opcion:
                            1. (pop) eleminar varios elementos al final de la pila.
                            2. eliminar varios indices de la pila.
                            3. eliminar por contenido.
                        """);
                int opcionBorrar = sc.nextInt();

                if (opcionBorrar == 1) {
                    System.out.println("cuantos Pop de la pila desea realizar: ");
                    int pops = sc.nextInt();
                    for (int i = 0; i < pops; i++) {
                        pila.pop();
                    }
                }else if (opcionBorrar == 2) {
                    System.out.println("Cuantos elementos va a eliminar: ");
                    int cuantos = sc.nextInt();
                    for (int i = 0; i < cuantos; i++) {
                        try {
                            System.out.println("Ingrese el elemento # " + i + " a eliminar:");
                            int eliminar = sc.nextInt();
                            pila.remove(eliminar);
                            if (pila.contains(eliminar)) {
                                System.out.println("No se elimino el elemento deseado!");
                            }else {
                                System.out.println("se elemento el elemento deseado!");
                            }
                            eliminar = 0;
                        }catch (Exception e) {
                            System.out.println("no se elimino el elemento deseado Error: " + e.getMessage());
                        }
                    }
                    System.out.println("Elementos eliminados: " + cuantos);
                    System.out.println("Estado De la pila: " + pila);
                } else if (opcionBorrar == 3) {
                    System.out.println("Cuandos elementos eliminara: ");
                    int cuantos = sc.nextInt();
                    String [] elementos = new String[cuantos];

                    for (int i = 0; i < cuantos; i++) {
                        System.out.println("ingrese el contenido del elemento a eliminar:");
                        elementos[i] = sc.next();
                    }
                    System.out.println(Arrays.toString(elementos));

                    try {
                        for (String elemento : elementos) {
                            if (pila.contains(elemento)) {
                                pila.remove(elemento);
                            }
                        }
                    }catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    System.out.println("elementos: " + Arrays.toString(elementos) + " eliminados correctamente.");
                }

        } else if (opcion == 11) {
                boolean found = false;
                System.out.println("ingrese el contenido del elemento a buscar su posicion: ");
                String busquedaE = sc.next();
                for (int i = 0; i < pila.size(); i++) {
                    if (pila.get(i).equals(busquedaE)) {
                        System.out.println("el elemento " + busquedaE + " se encontro ne la posicion " + i);
                        found = true;
                    }else if (!found) {
                        System.out.println("No se encontro el elemento " + busquedaE);
                    }

                }
            }else if (opcion == 12){
                System.out.println("Ingrese el Indice del elemento a buscar:");
                int index = sc.nextInt();

                try {
                    System.out.println("Elemento en el indice " + index + " es: " + pila.elementAt(index));
                }catch (Exception e) {
                    System.out.println(Arrays.toString(new String[]{"No se encontro el elemento en el indice: error: " + e.getMessage()}));
                }

            }else if (opcion == 13){
                int tamagno = pila.size();
                for (int i = 0; i < tamagno; i++) {
                    pila.remove(0);
                }
                System.out.println(pila);
            } else if (opcion == 14) {
                System.out.println("Saliendo ...");
                break;
            }

        }

    }
}
