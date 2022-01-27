package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Producto> listaProductos = rellenarListaProductos();


    }

    private static List<Producto> rellenarListaProductos() {
        List<Producto> lista = new ArrayList<>();
        lista.add(new Producto(1,"Naranjo", "Arbol que da naranjas",40.5));
        lista.add(new Producto(2, "Suculenta", "Planta que almacena agua en sus hojas", 5.3));
        lista.add(new Producto(3, "Manzana", "Arbol que da manzanas", 30.6));
        return lista;
    }
}
