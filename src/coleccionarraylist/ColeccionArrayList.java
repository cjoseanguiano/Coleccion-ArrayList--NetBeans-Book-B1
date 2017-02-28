/*
ColeccionArrayList
 */
package coleccionarraylist;

import java.util.ArrayList;

/**
 *
 * @author carlosjoseanguiano
 */
public class ColeccionArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> elemento = new ArrayList<>();

        elemento.add("rojo" );
        elemento.add(0, "Amarillo" );

        System.out.printf("\nMostrar contenido de lista con ciclo controlado por contador: ");

        //Muestra colores de la lista
        for (int i = 0; i < elemento.size(); i++) {
            System.out.printf(" %s", elemento.get(i));
        }
        //Muestra colores usando foreach en el metodo mostrar
        mostrar(elemento, "\nMostrar contenido de lista con instruccion for mejorada: ");

        elemento.add("Verde");
        elemento.add("Amarillo");
        mostrar(elemento, "Lista con dos nuevos elementos :");

        elemento.remove("Amarillo");
        mostrar(elemento, "Eliminar primera instancia de amarillo");

        elemento.remove(1);
        mostrar(elemento, "Eliminar segundo elemento de la lista (verde) :");

        //Verifica si hay un valor en la lista
        System.out.printf("\"rojo\" %sesta en la lista\n", elemento.contains("rojo") ? "" : "no ");

        //Muestra el numero de elementos en la lista
        System.out.printf("Tamanio %s\n", elemento.size());
    }

    public static void mostrar(ArrayList<String> elements, String encabezado) {
        System.out.printf(encabezado);

        for (String element : elements) {
            System.out.printf(" %s ", element);
        }
        System.out.println();
    }
}
