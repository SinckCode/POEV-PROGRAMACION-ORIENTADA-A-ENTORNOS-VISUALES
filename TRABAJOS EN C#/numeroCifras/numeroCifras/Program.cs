using System;

class NumeroCifras
{
    static void Main(string[] args)
    {
        int valor;

        do
        {
            Console.WriteLine("Ingresa un numero de entre 0 y 99999");
            int numero = int.Parse(Console.ReadLine());

            Console.WriteLine("El numero " + numero + " tiene " + numero.ToString().Length + " digitos");

            Console.WriteLine("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = int.Parse(Console.ReadLine());

        } while (valor == 1);
    }
}
