package domain;

import java.util.ArrayList;
import java.util.Scanner;

// Clase GestionInventario que extiende Producto
public class GestionInventario extends Producto {

    // Atributo de la clase GestionInventario
    private ArrayList<Producto> inventario;

    // Constructor de GestionInventario que inicializa el inventario y llama al constructor de Producto
    public GestionInventario(String nombre, String categoria, double precio, int cantidadDispo, String descri) {
        super(nombre, categoria, precio, cantidadDispo, descri);
        this.inventario = new ArrayList<>();
    }

    // Método para registrar un producto en el inventario
    public void registrarProducto(Producto producto) {
        inventario.add(producto);
        System.out.println("Producto registrado con exito.");
    }

    // Método para eliminar un producto del inventario por nombre
    public void eliminarProducto(String nombre) {
        Producto productoAEliminar = null;
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                productoAEliminar = producto;
                break;
            }
        }
        if (productoAEliminar != null) {
            inventario.remove(productoAEliminar);
            System.out.println("Producto eliminado con exito.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Método para generar un informe del inventario
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

    public void modificarProducto(String nombre) {
    Scanner scanner = new Scanner(System.in);
    for (Producto producto : inventario) {
        if (producto.getNombre().equalsIgnoreCase(nombre)) {
            System.out.print("Ingrese el nuevo precio para " + nombre + ": ");
            double nuevoPrecio = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea pendiente
            producto.setPrecio(nuevoPrecio);
            
            System.out.print("Ingrese la nueva cantidad disponible para " + nombre + ": ");
            int nuevaCantidad = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente
            producto.setCantidadDispo(nuevaCantidad);
            
            System.out.print("Ingrese una nueva descripcion para " + nombre + ": ");
            String nuevaDescri = scanner.nextLine();
            producto.setDescri(nuevaDescri);
            
            System.out.println("Producto modificado con exito.");
            return;
        }
    }
    System.out.println("Producto no encontrado.");
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
            System.out.println("No se encontraron productos en la categoria especificada.");
        }
    }

    public void buscarProductosPorRangoPrecios(double precioMinimo, double precioMaximo) {
        boolean encontrado = false;
        for (Producto producto : inventario) {
            double precioProducto = producto.getPrecio();
            if (precioProducto >= precioMinimo && precioProducto <= precioMaximo) {
                System.out.println(producto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos dentro del rango de precios especificado.");
        }
    }

    // Método para precargar algunos productos de ejemplo
    public void precargarProductos() {
        Producto producto1 = new GestionInventario("Camisa", "Ropa", 25.99, 100, "Camisa de algodon para hombre");
        Producto producto2 = new GestionInventario("Pantalon", "Ropa", 35.99, 80, "Pantalon de mezclilla para mujer");
        Producto producto3 = new GestionInventario("Zapatos", "Calzado", 49.99, 50, "Zapatos deportivos unisex");
        Producto producto4 = new GestionInventario("Sombrero", "Accesorio", 15.50, 120, "Sombrero de ala ancha para el sol");
        Producto producto5 = new GestionInventario("Bufanda", "Accesorio", 10.25, 90, "Bufanda de lana suave");
        Producto producto6 = new GestionInventario("Reloj", "Accesorio", 79.99, 30, "Reloj de pulsera analogico para hombre");
        Producto producto7 = new GestionInventario("Mochila", "Accesorio", 45.75, 60, "Mochila resistente para actividades al aire libre");
        Producto producto8 = new GestionInventario("Botas", "Calzado", 59.99, 40, "Botas de senderismo impermeables");
        Producto producto9 = new GestionInventario("Guantes", "Accesorio", 7.99, 110, "Guantes de invierno termicos");
        Producto producto10 = new GestionInventario("Vestido", "Ropa", 42.50, 70, "Vestido floral de verano");

        inventario.add(producto1);
        inventario.add(producto2);
        inventario.add(producto3);
        inventario.add(producto4);
        inventario.add(producto5);
        inventario.add(producto6);
        inventario.add(producto7);
        inventario.add(producto8);
        inventario.add(producto9);
        inventario.add(producto10);
    }

}
