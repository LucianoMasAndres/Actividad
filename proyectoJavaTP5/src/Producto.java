public class Producto {
    private int codigo;
    private String nombre;
    private int precio;
    Producto(int codigo, String nombre, int precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;          // misma referencia
        if (obj == null || getClass() != obj.getClass()) return false; // distinto tipo
        Producto other = (Producto) obj;
        return this.codigo == other.codigo;    // comparación por contenido
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
