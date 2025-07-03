using System;

class MaquiRegis
{
    static void Main(string[] args)
    {
        int valor;
        do
        {
            Console.WriteLine("Ingresa el total a pagar: ");
            double totalP = ObtenerCantidadValida();
            Console.WriteLine("Cantidad a dar: ");
            double canti = ObtenerCantidadValida();

            double cambio = totalP - canti;

            if (cambio < 0)
            {
                Console.WriteLine("Te sobra: " + (-cambio));
            }
            else if (cambio > 0)
            {
                Console.WriteLine("Te falta por pagar: " + cambio);
            }
            else
            {
                Console.WriteLine("No hay cambio.");
            }

            // Convertir el cambio a palabras
            Console.WriteLine("Cambio en palabras: " + ConvertirCambioAPalabras(cambio));

            Console.WriteLine("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = int.Parse(Console.ReadLine());

        } while (valor == 1);
    }

    // Función para obtener una cantidad válida (mayor que cero) desde el usuario
    public static double ObtenerCantidadValida()
    {
        double cantidad;
        do
        {
            while (!double.TryParse(Console.ReadLine(), out cantidad))
            {
                Console.WriteLine("Por favor, ingresa un valor válido.");
            }
            if (cantidad <= 0)
            {
                Console.WriteLine("Por favor, ingresa un valor mayor que cero.");
            }
        } while (cantidad <= 0);
        return cantidad;
    }

    // Función para convertir el cambio a palabras
    public static string ConvertirCambioAPalabras(double cambio)
    {
        // Definir arreglos con nombres de unidades, decenas y centenas
        string[] unidades = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
        string[] decenas = { "", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa" };
        string[] centenas = { "", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos" };

        // Verificar si el cambio es cero
        if (cambio == 0)
        {
            return "cero pesos";
        }

        // Dividir el cambio en parte entera y decimal
        int parteEntera = (int)cambio;
        int parteDecimal = (int)((cambio - parteEntera) * 100);

        // Convertir la parte entera a palabras
        string cambioPalabras = "";
        if (parteEntera > 0)
        {
            int centena = parteEntera / 100;
            int decena = (parteEntera % 100) / 10;
            int unidad = parteEntera % 10;

            if (centena > 0)
            {
                cambioPalabras += centenas[centena] + " ";
            }

            if (decena == 1)
            {
                cambioPalabras += decenas[unidad] + " ";
            }
            else
            {
                cambioPalabras += decenas[decena] + " " + unidades[unidad] + " ";
            }

            cambioPalabras += "pesos ";
        }

        // Convertir la parte decimal a palabras
        if (parteDecimal > 0)
        {
            int decena = parteDecimal / 10;
            int unidad = parteDecimal % 10;

            if (decena == 1)
            {
                cambioPalabras += decenas[unidad] + " ";
            }
            else
            {
                cambioPalabras += decenas[decena] + " " + unidades[unidad] + " ";
            }

            cambioPalabras += "centavos";
        }

        return cambioPalabras.Trim();
    }
}
