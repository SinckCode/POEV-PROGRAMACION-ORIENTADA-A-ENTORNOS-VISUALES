import java.util.Scanner;

public class MaquiRegis {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int valor;
        do {
            System.out.println("Ingresa el total a pagar: ");
            double totalP = obtenerCantidadValida(lector);
            System.out.println("Cantidad a dar: ");
            double canti = obtenerCantidadValida(lector);

            double cambio = totalP - canti;

            if (cambio < 0) {
                System.out.println("Te sobra: " + (-cambio));
            } else if (cambio > 0) {
                System.out.println("Te falta por pagar: " + cambio);
            } else {
                System.out.println("No hay cambio.");
            }

            // Convertir el cambio a palabras
            System.out.println("Cambio en palabras: " + convertirCambioAPalabras(cambio));

            System.out.println("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = lector.nextInt();

        } while (valor == 1);
        lector.close();
    }

    // Función para obtener una cantidad válida (mayor que cero) desde el usuario
    public static double obtenerCantidadValida(Scanner lector) {
        double cantidad;
        do {
            while (!lector.hasNextDouble()) {
                System.out.println("Por favor, ingresa un valor válido.");
                lector.next();
            }
            cantidad = lector.nextDouble();
            if (cantidad <= 0) {
                System.out.println("Por favor, ingresa un valor mayor que cero.");
            }
        } while (cantidad <= 0);
        return cantidad;
    }

    // Función para convertir el cambio a palabras
    public static String convertirCambioAPalabras(double cambio) {
        // Definir arreglos con nombres de unidades, decenas y centenas
        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String[] centenas = {"", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};

        // Verificar si el cambio es cero
        if (cambio == 0) {
            return "cero pesos";
        }

        // Dividir el cambio en parte entera y decimal
        int parteEntera = (int) cambio;
        int parteDecimal = (int) ((cambio - parteEntera) * 100);

        // Convertir la parte entera a palabras
        String cambioPalabras = "";
        if (parteEntera > 0) {
            int centena = parteEntera / 100;
            int decena = (parteEntera % 100) / 10;
            int unidad = parteEntera % 10;

            if (centena > 0) {
                cambioPalabras += centenas[centena] + " ";
            }

            if (decena == 1) {
                cambioPalabras += decenas[unidad] + " ";
            } else {
                cambioPalabras += decenas[decena] + " " + unidades[unidad] + " ";
            }

            cambioPalabras += "pesos ";
        }

        // Convertir la parte decimal a palabras
        if (parteDecimal > 0) {
            int decena = parteDecimal / 10;
            int unidad = parteDecimal % 10;

            if (decena == 1) {
                cambioPalabras += decenas[unidad] + " ";
            } else {
                cambioPalabras += decenas[decena] + " " + unidades[unidad] + " ";
            }

            cambioPalabras += "centavos";
        }

        return cambioPalabras.trim();
    }
}
