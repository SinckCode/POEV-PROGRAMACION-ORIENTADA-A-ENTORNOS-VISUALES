import java.util.ArrayList;
import java.util.Scanner;

class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidadDispo;
    private String descri;

    public Producto(String nombre, String categoria, double precio, int cantidadDispo, String descri) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadDispo = cantidadDispo;
        this.descri = descri;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", cantidadDispo=" + cantidadDispo +
                ", descri='" + descri + '\'' +
                '}';
    }

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
}

class GestionInventario {
    private ArrayList<Producto> inventario;

    public GestionInventario() {
        this.inventario = new ArrayList<>();
    }

    public void registrarProducto(Producto producto) {
        inventario.add(producto);
        System.out.println("Producto registrado con éxito.");
    }

    public void buscarProductoPorNombre(String nombre) {
        boolean encontrado = false;
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado:");
                System.out.println(producto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    public void buscarProductosPorCategoria(String categoria) {
        boolean encontrado = false;
        for (Producto producto : inventario) {
            if (producto.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println(producto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en la categoría especificada.");
        }
    }

    public void modificarProducto(String nombre) {
        Scanner scanner = new Scanner(System.in);
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Ingrese el nuevo precio para " + nombre + ": ");
                double nuevoPrecio = scanner.nextDouble();
                producto.setPrecio(nuevoPrecio);
                System.out.print("Ingrese la nueva cantidad disponible para " + nombre + ": ");
                int nuevaCantidad = scanner.nextInt();
                producto.setCantidadDispo(nuevaCantidad);
                System.out.println("Producto modificado con éxito.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void eliminarProducto(String nombre) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                inventario.remove(producto);
                System.out.println("Producto eliminado con éxito.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void generarInformeInventario() {
        System.out.println("Informe de inventario:");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
        System.out.println("Cantidad total de productos: " + inventario.size());
        double valorTotal = 0;
        for (Producto producto : inventario) {
            valorTotal += producto.getPrecio() * producto.getCantidadDispo();
        }
        System.out.println("Valor total del inventario: " + valorTotal);
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionInventario gestionInventario = new GestionInventario();

        int opcion;
        do {
            System.out.println("\n1. Registrar producto");
            System.out.println("2. Buscar producto por nombre");
            System.out.println("3. Buscar productos por categoría");
            System.out.println("4. Modificar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Generar informe de inventario");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la categoría del producto: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad disponible del producto: ");
                    int cantidadDisponible = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    System.out.print("Ingrese la descripción del producto: ");
                    String descripcion = scanner.nextLine();
                    gestionInventario.registrarProducto(new Producto(nombre, categoria, precio, cantidadDisponible, descripcion));
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    nombre = scanner.nextLine();
                    gestionInventario.buscarProductoPorNombre(nombre);
                    break;
                case 3:
                    System.out.print("Ingrese la categoría de productos a buscar: ");
                    categoria = scanner.nextLine();
                    gestionInventario.buscarProductosPorCategoria(categoria);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del producto a modificar: ");
                    nombre = scanner.nextLine();
                    gestionInventario.modificarProducto(nombre);
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    nombre = scanner.nextLine();
                    gestionInventario.eliminarProducto(nombre);
                    break;
                case 6:
                    gestionInventario.generarInformeInventario();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
