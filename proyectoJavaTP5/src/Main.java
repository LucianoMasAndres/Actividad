import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto(20,"Machete", 12345);
        Producto producto1 = new Producto(20, "Sandia", 123456);
        Producto producto2 = new Producto(32, "Sandalia", 321);
        ArrayList<Producto> lista = new ArrayList<>();

        if (!lista.contains(producto1)) lista.add(producto1);
        if (!lista.contains(producto)) lista.add(producto);
        if (!lista.contains(producto2)) lista.add(producto2);
        for (Producto p : lista) {
            System.out.println(p.getCodigo() + " - " + p.getNombre() + " - $" + p.getPrecio());
        }

    }
}