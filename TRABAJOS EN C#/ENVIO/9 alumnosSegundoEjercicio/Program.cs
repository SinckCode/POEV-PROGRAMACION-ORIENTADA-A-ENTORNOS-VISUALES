using System;

class AlumnosSegundoEjer
{
    static void Main(string[] args)
    {
        int valor;

        do
        {
            Console.WriteLine("Cuantos alumnos va a ingresar?");
            int alumnosTotal = int.Parse(Console.ReadLine());

            string[] nombreAlumnos = new string[alumnosTotal];
            float[] calificaciones = new float[alumnosTotal];

            for (int i = 0; i < alumnosTotal; i++)
            {
                Console.WriteLine("Escribe el nombre del alumno num " + (i + 1));
                nombreAlumnos[i] = Console.ReadLine();
            }

            for (int i = 0; i < alumnosTotal; i++)
            {
                Console.WriteLine("Escribe la calificacion del alumno " + nombreAlumnos[i] + " numero " + (i + 1));
                calificaciones[i] = float.Parse(Console.ReadLine());
            }

            Console.WriteLine("NO. | Nombre del Alumno | Calificacion | Calificacion en Letra");

            for (int i = 0; i < alumnosTotal; i++)
            {
                int calificacionEntera = (int)calificaciones[i];
                float calificacionDecimal = calificaciones[i] - calificacionEntera;
                string letra = "";
                string letraDecimal = "";

                switch (calificacionEntera)
                {
                    case 0: letra = ""; break;
                    case 1: letra = "Uno"; break;
                    case 2: letra = "Dos"; break;
                    case 3: letra = "Tres"; break;
                    case 4: letra = "Cuatro"; break;
                    case 5: letra = "Cinco"; break;
                    case 6: letra = "Seis"; break;
                    case 7: letra = "Siete"; break;
                    case 8: letra = "Ocho"; break;
                    case 9: letra = "Nueve"; break;
                    case 10: letra = "Diez"; break;
                }

                if (calificacionDecimal > 0)
                {
                    switch ((int)(calificacionDecimal * 10))
                    {
                        case 0: letraDecimal = "cero"; break;
                        case 1: letraDecimal = "uno"; break;
                        case 2: letraDecimal = "dos"; break;
                        case 3: letraDecimal = "tres"; break;
                        case 4: letraDecimal = "cuatro"; break;
                        case 5: letraDecimal = "cinco"; break;
                        case 6: letraDecimal = "seis"; break;
                        case 7: letraDecimal = "siete"; break;
                        case 8: letraDecimal = "ocho"; break;
                        case 9: letraDecimal = "nueve"; break;
                    }
                }

                Console.WriteLine((i + 1) + "      " + nombreAlumnos[i] + "                  " + calificaciones[i] + "         " + letra + " punto " + letraDecimal);
            }

            Console.WriteLine("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = int.Parse(Console.ReadLine());

        } while (valor == 1);
    }
}
