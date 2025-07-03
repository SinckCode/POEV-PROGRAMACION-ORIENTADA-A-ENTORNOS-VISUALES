using System;

class DiaSemana
{
    static void Main(string[] args)
    {
        int valor;
        do
        {
            Console.WriteLine("Ingresa un numero para darte el dia de la semana");
            Console.WriteLine("Lunes = 1, Martes = 2, Miercoles = 3, Jueves = 4, Viernes = 5, Sabado = 6, Domingo = 7");
            var tipo = int.Parse(Console.ReadLine());

            switch (tipo)
            {
                case 1:
                    Console.WriteLine("El dia de la semana es Lunes ");
                    break;

                case 2:
                    Console.WriteLine("El dia de la semana es Martes ");
                    break;

                case 3:
                    Console.WriteLine("El dia de la semana es Miercoles ");
                    break;

                case 4:
                    Console.WriteLine("El dia de la semana es Jueves ");
                    break;

                case 5:
                    Console.WriteLine("El dia de la semana es Viernes ");
                    break;

                case 6:
                    Console.WriteLine("El dia de la semana es Sabado ");
                    break;

                case 7:
                    Console.WriteLine("El dia de la semana es Domingo ");
                    break;
            }

            Console.WriteLine("Quieres hacer otra operación? SI = 1 NO = 0");
            valor = int.Parse(Console.ReadLine());

        } while (valor == 1);
    }
}
