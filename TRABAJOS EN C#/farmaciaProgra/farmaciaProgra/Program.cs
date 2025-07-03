using System;

class FarmaciaProgra
{
    static void Main(string[] args)
    {
        int valor;

        do
        {
            Console.WriteLine("Ingresa el valor de tu compra");
            double compra = double.Parse(Console.ReadLine());
            Console.WriteLine("Pagaras de contado o con tarjeta? Contado = 1 Tarjeta = 2");
            int pago = int.Parse(Console.ReadLine());

            if (pago == 1)
            {
                double descReca = compra - (compra * 0.05);
                Console.WriteLine("Felicidades!! se te hizo un descuento");
                Console.WriteLine("Tu total es de: " + descReca);
            }
            else
            {
                double descReca = (compra * 0.03) + compra;
                Console.WriteLine("Lo siento, tuvimos que cobrar un extra");
                Console.WriteLine("Tu total es de: " + descReca);
            }

            Console.WriteLine("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = int.Parse(Console.ReadLine());

        } while (valor == 1);
    }
}
