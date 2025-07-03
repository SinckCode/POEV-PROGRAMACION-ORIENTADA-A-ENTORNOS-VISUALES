package test;

import domain.GestionInventario;

import java.util.Scanner;

// Clase principal Inventario
public class Inventarioo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionInventario gestionInventario = new GestionInventario("", "", 0.0, 0, ""); 

        gestionInventario.precargarProductos();

        int opcion;
        do {
            System.out.println("\n1. Registrar producto");
            System.out.println("2. Buscar producto por nombre");
            System.out.println("3. Buscar productos por categoria");
            System.out.println("4. Buscar productos por rango de precio");
            System.out.println("5. Modificar producto");
            System.out.println("6. Eliminar producto");
            System.out.println("7. Generar informe de inventario");
            System.out.println("8. Salir");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

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
                    System.out.print("Ingrese la descripcion del producto: ");
                    String descripcion = scanner.nextLine();
                    gestionInventario.registrarProducto(new GestionInventario(nombre, categoria, precio, cantidadDisponible, descripcion));
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    nombre = scanner.nextLine();
                    gestionInventario.buscarProductoPorNombre(nombre);
                    break;
                case 3:
                    System.out.print("Ingrese la categoria de productos a buscar: ");
                    categoria = scanner.nextLine();
                    gestionInventario.buscarProductosPorCategoria(categoria);
                    break;
                case 4:
                    System.out.print("Ingrese el rango de precios a buscar: ");
                    System.out.println("Ingresa el precio Maximo");
                    double precioMinimo = scanner.nextDouble();
                    System.out.println("Ingresa el precio Minimo");

                    double precioMaximo = scanner.nextDouble();
                    gestionInventario.buscarProductosPorRangoPrecios(precioMinimo, precioMaximo);
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del producto a modificar: ");
                    nombre = scanner.nextLine();
                    gestionInventario.modificarProducto(nombre);
                    break;
                case 6:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    nombre = scanner.nextLine();
                    gestionInventario.eliminarProducto(nombre);
                    break;
                case 7:
                    gestionInventario.generarInformeInventario();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}
