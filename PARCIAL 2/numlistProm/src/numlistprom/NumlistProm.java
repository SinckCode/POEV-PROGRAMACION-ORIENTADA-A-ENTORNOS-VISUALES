package numlistprom;

import java.util.ArrayList;
import java.util.Scanner;

public class NumlistProm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        boolean continuar = true;
        int suma = 0;
        int contador = 0;

        System.out.println("Ingrese numeros enteros (ingrese 'fin' para terminar):");
        while (continuar) {
            String input = scanner.nextLine();
            if (input.equals("fin")) {
                continuar = false;
            } else {
                try {
                    int numero = Integer.parseInt(input);
                    suma += numero;
                    contador++;
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada invalida. Por favor, ingrese un numero entero valido.");
                }
            }
        }

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los numeros ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron numeros.");
        }
        
        
        
    }
}
