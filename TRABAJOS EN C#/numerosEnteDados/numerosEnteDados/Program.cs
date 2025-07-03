using System;

class Program
{
    static void Main(string[] args)


    {
        int valor = 1;

        do
        {
            Console.WriteLine("Ingrese el primer número:");
            int numero1 = int.Parse(Console.ReadLine());

            Console.WriteLine("Ingrese el segundo número:");
            int numero2 = int.Parse(Console.ReadLine());

            int sumaPares = SumarNumerosPares(numero1, numero2);
            Console.WriteLine($"La suma de todos los números pares entre {numero1} y {numero2} es: {sumaPares}");


            Console.WriteLine("Quieres hacer otra operación? SI = 1 | NO = 0");
            valor = int.Parse(Console.ReadLine());

        } while (valor == 1);
        
    }

    static int SumarNumerosPares(int inicio, int fin)
    {
        int suma = 0;
        // Si el primer número es mayor que el segundo, intercambiarlos para tener el rango correcto
        if (inicio > fin)
        {
            int temp = inicio;
            inicio = fin;
            fin = temp;
        }

        // Iterar desde el número inicial hasta el número final, sumando solo los números pares
        for (int i = inicio; i <= fin; i++)
        {
            if (i % 2 == 0)
            {
                suma += i;
            }
        }

        return suma;
    }
}



