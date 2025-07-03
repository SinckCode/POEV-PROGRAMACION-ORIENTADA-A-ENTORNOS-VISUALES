using System;

class Array5Elem
{
    static void Main(string[] args)
    {
        int valor;

        do
        {
            int numIngres = 5;

            int[] valores = new int[numIngres];

            for (int i = 0; i < numIngres; i++)
            {
                Console.WriteLine("Escribe el valor del num " + (i + 1));
                valores[i] = int.Parse(Console.ReadLine());
            }

            Console.WriteLine("pos val");
            for (int i = 0; i < numIngres; i++)
            {
                Console.WriteLine(i + "   " + valores[i]);
            }

            Console.WriteLine("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = int.Parse(Console.ReadLine());

        } while (valor == 1);
    }
}
