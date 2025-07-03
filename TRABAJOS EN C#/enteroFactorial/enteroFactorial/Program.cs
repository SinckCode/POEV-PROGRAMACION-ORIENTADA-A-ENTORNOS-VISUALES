using System;

class Program
{
    static void Main(string[] args)
    {


        int valor = 1;
        do
        {

            Console.WriteLine("Ingrese un número entero para calcular su factorial:");
            int numero = int.Parse(Console.ReadLine());

            long factorial = CalcularFactorial(numero);
            Console.WriteLine($"El factorial de {numero} es: {factorial}");

            Console.WriteLine("Deseas hacer otra operacion? SI = 1 | NO= 0");
            valor = int.Parse(Console.ReadLine());


        } while (valor == 1);
        
    }

    static long CalcularFactorial(int n)
    {
        if (n < 0)
        {
            throw new ArgumentException("El factorial no está definido para números negativos.");
        }
        else if (n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            long resultado = 1;
            for (int i = 2; i <= n; i++)
            {
                resultado *= i;
            }
            return resultado;
        }
    }
}
