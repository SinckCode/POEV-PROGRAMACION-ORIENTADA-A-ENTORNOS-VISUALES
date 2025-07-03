using System;

class Val3Calc
{
    static void Main(string[] args)
    {
        Console.WriteLine("Ingresa 3 valores");
        var num1 = double.Parse(Console.ReadLine());
        var num2 = double.Parse(Console.ReadLine());
        var num3 = double.Parse(Console.ReadLine());
        int valor;
        int valor2 = 0;
        do
        {
            Console.WriteLine("Que operacion quieres realizar?");
            Console.WriteLine("Suma = 1, Resta = 2, Multiplicacion = 3, Division = 4");
            var tipo = int.Parse(Console.ReadLine());

            switch (tipo)
            {
                case 1:
                    Console.WriteLine("SUMA: ");
                    var suma = num1 + num2 + num3;
                    Console.WriteLine("el valor de la suma es: " + suma);
                    break;

                case 2:
                    Console.WriteLine("RESTA: ");
                    var resta = num1 - num2 - num3;
                    Console.WriteLine("el valor de la resta es: " + resta);
                    break;

                case 3:
                    Console.WriteLine("MULTIPLICACION");
                    var multi = num1 * num2 * num3;
                    Console.WriteLine("el valor de la Multiplicacion es: " + multi);
                    break;

                case 4:
                    Console.WriteLine("DIVISION");
                    var divi = num1 / num2 / num3;
                    Console.WriteLine("el valor de la Division es: " + divi);
                    break;
            }

            Console.WriteLine("Quieres hacer otra operación? SI = 1 NO = 0");
            valor = int.Parse(Console.ReadLine());

            Console.WriteLine("Deseas ingresar otros valores? SI = 1 NO = 0");
            valor2 = int.Parse(Console.ReadLine());
            if (valor2 == 1)
            {
                num1 = double.Parse(Console.ReadLine());
                num2 = double.Parse(Console.ReadLine());
                num3 = double.Parse(Console.ReadLine());
            }
        } while (valor == 1);
    }
}
