using System;

public class MatrizSuma
{
    public static void Main(string[] args)
    {
        int valor;

        int[,] datosUsuario = new int[4, 5];

        ingresarDatosMatriz(datosUsuario);

        do
        {
            mostrarMenu();
            int opcion = int.Parse(Console.ReadLine());

            switch (opcion)
            {
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
                    modificarCelda(datosUsuario);
                    break;
                default:
                    Console.WriteLine("Opción no válida.");
                    break;
            }

            mostrarMatriz(datosUsuario);

            Console.WriteLine("¿Quieres hacer otra operación? SI = 1, NO = 0");
            valor = int.Parse(Console.ReadLine());
        } while (valor == 1);
    }

    private static void mostrarMenu()
    {
        Console.WriteLine("1. Suma por fila");
        Console.WriteLine("2. Suma por columna");
        Console.WriteLine("3. Suma diagonal principal");
        Console.WriteLine("4. Suma diagonal inversa");
        Console.WriteLine("5. Promedio");
        Console.WriteLine("6. Modificar celda");
        Console.WriteLine("Elige una opción:");
    }

    private static void ingresarDatosMatriz(int[,] matriz)
    {
        Console.WriteLine("Ingresa los datos de la matriz (4x5):");
        for (int r = 0; r < matriz.GetLength(0); r++)
        {
            for (int c = 0; c < matriz.GetLength(1); c++)
            {
                matriz[r, c] = int.Parse(Console.ReadLine());
            }
        }
    }

    private static void mostrarMatriz(int[,] matriz)
    {
        Console.WriteLine("Matriz actual:");
        for (int r = 0; r < matriz.GetLength(0); r++)
        {
            for (int c = 0; c < matriz.GetLength(1); c++)
            {
                Console.Write(matriz[r, c] + "\t");
            }
            Console.WriteLine();
        }
    }

    private static void sumarPorFila(int[,] matriz)
    {
        for (int r = 0; r < matriz.GetLength(0); r++)
        {
            int sumaFila = 0;
            for (int c = 0; c < matriz.GetLength(1); c++)
            {
                sumaFila += matriz[r, c];
            }
            Console.WriteLine("Suma de la fila " + (r + 1) + ": " + sumaFila);
        }
    }

    private static void sumarPorColumna(int[,] matriz)
    {
        for (int c = 0; c < matriz.GetLength(1); c++)
        {
            int sumaColumna = 0;
            for (int r = 0; r < matriz.GetLength(0); r++)
            {
                sumaColumna += matriz[r, c];
            }
            Console.WriteLine("Suma de la columna " + (c + 1) + ": " + sumaColumna);
        }
    }

    private static void mostrarSumaDiagonalPrincipal(int[,] matriz)
    {
        int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < Math.Min(matriz.GetLength(0), matriz.GetLength(1)); i++)
        {
            sumaDiagonalPrincipal += matriz[i, i];
        }
        Console.WriteLine("Suma de la diagonal principal: " + sumaDiagonalPrincipal);
    }

    private static void mostrarSumaDiagonalInversa(int[,] matriz)
    {
        int sumaDiagonalInversa = 0;
        for (int i = 0; i < Math.Min(matriz.GetLength(0), matriz.GetLength(1)); i++)
        {
            sumaDiagonalInversa += matriz[i, matriz.GetLength(1) - 1 - i];
        }
        Console.WriteLine("Suma de la diagonal inversa: " + sumaDiagonalInversa);
    }

    private static void mostrarPromedio(int[,] matriz)
    {
        int sumaTotal = 0;
        for (int r = 0; r < matriz.GetLength(0); r++)
        {
            for (int c = 0; c < matriz.GetLength(1); c++)
            {
                sumaTotal += matriz[r, c];
            }
        }
        double promedio = (double)sumaTotal / (matriz.GetLength(0) * matriz.GetLength(1));
        Console.WriteLine("Promedio de la matriz: " + promedio);
    }

    private static void modificarCelda(int[,] matriz)
    {
        Console.WriteLine("Ingresa la fila y la columna de la celda a modificar:");
        int fila = int.Parse(Console.ReadLine());
        int columna = int.Parse(Console.ReadLine());
        if (fila >= 0 && fila < matriz.GetLength(0) && columna >= 0 && columna < matriz.GetLength(1))
        {
            Console.WriteLine("Ingresa el nuevo valor para la celda:");
            int nuevoValor = int.Parse(Console.ReadLine());
            matriz[fila, columna] = nuevoValor;
            Console.WriteLine("Celda modificada correctamente.");
        }
        else
        {
            Console.WriteLine("Fila o columna fuera de rango.");
        }
    }
}
