package domain;

// Clase abstracta Producto
public abstract class Producto {
    // Atributos de la clase Producto
    protected String nombre;
    protected String categoria;
    protected double precio;
    protected int cantidadDispo;
    protected String descri;

    // Constructor de la clase Producto
    public Producto(String nombre, String categoria, double precio, int cantidadDispo, String descri) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadDispo = cantidadDispo;
        this.descri = descri;
    }

    // Métodos de acceso para los atributos de Producto
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDispo() {
        return cantidadDispo;
    }

    public void setCantidadDispo(int cantidadDispo) {
        this.cantidadDispo = cantidadDispo;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    // Método toString para representar la información del Producto como cadena
@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("+----------------------+----------------------+------------+----------------------+----------------------------------------+\n");
    sb.append(String.format("| %-20s | %-20s | %-10s | %-20s | %-38s |\n", "Nombre", "Categoria", "Precio", "Cant. Disponible", "Descripcion"));
    sb.append("+----------------------+----------------------+------------+----------------------+----------------------------------------+\n");
    sb.append(String.format("| %-20s | %-20s | %-10.2f | %-20d | %-38s |\n", nombre, categoria, precio, cantidadDispo, descri));
    sb.append("+----------------------+----------------------+------------+----------------------+----------------------------------------+\n");
    return sb.toString();
}
}
