package parte2;
import java.util.ArrayList;

public class ListaCategorias {
    private ArrayList<Categoria> categorias;

    public ListaCategorias() {
        this.categorias = new ArrayList<>();
    }

    public void agregarCategoria(Categoria c) {
        categorias.add(c);
    }

    public ArrayList<Categoria> getLista() {
        return categorias;
    }
}