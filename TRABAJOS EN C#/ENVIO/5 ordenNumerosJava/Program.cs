using System;

class OrdenNumeros
{
    static void Main(string[] args)
    {
        int valor;

        do
        {
            Console.WriteLine("Ingresa el valor 1");
            int valor1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Ingresa el valor 2");
            int valor2 = int.Parse(Console.ReadLine());
            Console.WriteLine("Ingresa el valor 3");
            int valor3 = int.Parse(Console.ReadLine());

            if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3)
            {
                Console.WriteLine("El orden es el siguiente: ");
                Console.WriteLine(" " + valor1 + " " + valor2 + " " + valor3);
            }
            else
            {
                if (valor2 > valor3)
                {
                    Console.WriteLine("El orden es el siguiente: ");
                    Console.WriteLine(" " + valor2 + " " + valor3 + " " + valor1);
                }
                else
                {
                    Console.WriteLine("El orden de mayor a menor es el siguiente: ");
                    Console.WriteLine(" " + valor3 + " " + valor2 + " " + valor1);
                }
            }

            Console.WriteLine("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = int.Parse(Console.ReadLine());

        } while (valor == 1);
    }
}
