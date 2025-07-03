using System;

class Program
{
    static void Main(string[] args)
    {

        int valor = 1;

        do
        {
            Console.WriteLine("Ingrese un número entero para verificar si es primo:");
            int numero = int.Parse(Console.ReadLine());

            bool esPrimo = EsPrimo(numero);
            if (esPrimo)
            {
                Console.WriteLine($"{numero} es un número primo.");
            }
            else
            {
                Console.WriteLine($"{numero} no es un número primo.");
            }


            Console.WriteLine("Quieres realizar otra operación? SI = 1 | NO = 0");
            valor = int.Parse(Console.ReadLine());

        } while (valor == 1);
       
    }

    static bool EsPrimo(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        // Verificar divisibilidad por números desde 2 hasta la raíz cuadrada de n
        for (int i = 2; i <= Math.Sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false; // Si n es divisible por i, entonces n no es primo
            }
        }
        return true; // Si no se encontró ningún divisor entre 2 y la raíz cuadrada de n, entonces n es primo
    }
}
