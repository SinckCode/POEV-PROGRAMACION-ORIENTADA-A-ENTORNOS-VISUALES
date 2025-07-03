using System;

class Val3Calc
{
    static void Main(string[] args)
    {
   

        int valor;
        do
        {
            Console.WriteLine("Ingresa el valor 1");
            var num1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Ingresa el valor 2");
            var num2 = int.Parse(Console.ReadLine());

            if (num1 > num2)
            {
                Console.WriteLine("El valor mayor es: " + num1);
            }
            else
            {
                Console.WriteLine("El valor mayor es: " + num2);

            }


            Console.WriteLine("Quieres hacer otra operación? SI = 1 NO = 0");
            valor = int.Parse(Console.ReadLine());

        } while (valor == 1);
    }
}
