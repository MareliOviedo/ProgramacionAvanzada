package Modelo;

import java.util.ArrayList;

public class ListaGenerica<T> {

    private ArrayList<T> lista;

    public ListaGenerica() {
        lista = new ArrayList<>();
    }

    public void agregar(T elemento) {
        lista.add(elemento);
    }

    public ArrayList<T> getElementos() {
        return lista;
    }
}
