
import java.util.Scanner;

public class MatrizSuma {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int valor;

        int[][] datosUsuario = new int[4][5];

        ingresarDatosMatriz(datosUsuario, lector);

        do {
            mostrarMenu();
            int opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    sumarPorFila(datosUsuario);
                    break;
                case 2:
                    sumarPorColumna(datosUsuario);
                    break;
                case 3:
                    mostrarSumaDiagonalPrincipal(datosUsuario);
                    break;
                case 4:
                    mostrarSumaDiagonalInversa(datosUsuario);
                    break;
                case 5:
                    mostrarPromedio(datosUsuario);
                    break;
                case 6:
                    modificarCelda(datosUsuario, lector);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            mostrarMatriz(datosUsuario);

            System.out.println("¿Quieres hacer otra operación? SI = 1, NO = 0");
            valor = lector.nextInt();
        } while (valor == 1);
    }

    private static void mostrarMenu() {
        System.out.println("1. Suma por fila");
        System.out.println("2. Suma por columna");
        System.out.println("3. Suma diagonal principal");
        System.out.println("4. Suma diagonal inversa");
        System.out.println("5. Promedio");
        System.out.println("6. Modificar celda");
        System.out.println("Elige una opción:");
    }

    private static void ingresarDatosMatriz(int[][] matriz, Scanner lector) {
        System.out.println("Ingresa los datos de la matriz (4x5):");
        for (int r = 0; r < matriz.length; r++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matriz[r][c] = lector.nextInt();
            }
        }
    }

    private static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz actual:");
        for (int r = 0; r < matriz.length; r++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[r][c] + "\t");
            }
            System.out.println();
        }
    }

    private static void sumarPorFila(int[][] matriz) {
        for (int r = 0; r < matriz.length; r++) {
            int sumaFila = 0;
            for (int c = 0; c < matriz[0].length; c++) {
                sumaFila += matriz[r][c];
            }
            System.out.println("Suma de la fila " + (r + 1) + ": " + sumaFila);
        }
    }

    private static void sumarPorColumna(int[][] matriz) {
        for (int c = 0; c < matriz[0].length; c++) {
            int sumaColumna = 0;
            for (int r = 0; r < matriz.length; r++) {
                sumaColumna += matriz[r][c];
            }
            System.out.println("Suma de la columna " + (c + 1) + ": " + sumaColumna);
        }
    }

    private static void mostrarSumaDiagonalPrincipal(int[][] matriz) {
        int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal);
    }

    private static void mostrarSumaDiagonalInversa(int[][] matriz) {
        int sumaDiagonalInversa = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalInversa += matriz[i][matriz[0].length - 1 - i];
        }
        System.out.println("Suma de la diagonal inversa: " + sumaDiagonalInversa);
    }

    private static void mostrarPromedio(int[][] matriz) {
        int sumaTotal = 0;
        for (int r = 0; r < matriz.length; r++) {
            for (int c = 0; c < matriz[0].length; c++) {
                sumaTotal += matriz[r][c];
            }
        }
        double promedio = (double) sumaTotal / (matriz.length * matriz[0].length);
        System.out.println("Promedio de la matriz: " + promedio);
    }

    private static void modificarCelda(int[][] matriz, Scanner lector) {
        System.out.println("Ingresa la fila y la columna de la celda a modificar:");
        int fila = lector.nextInt();
        int columna = lector.nextInt();
        if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[0].length) {
            System.out.println("Ingresa el nuevo valor para la celda:");
            int nuevoValor = lector.nextInt();
            matriz[fila][columna] = nuevoValor;
            System.out.println("Celda modificada correctamente.");
        } else {
            System.out.println("Fila o columna fuera de rango.");
        }
    }
}
