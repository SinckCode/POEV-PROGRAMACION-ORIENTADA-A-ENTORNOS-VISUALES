using System;

namespace ClasesCCuboPrisma
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Scanner scanner = new Scanner();

            Cubo cubo = new Cubo(0, 0, 0);
            Prisma prisma = new Prisma(0, 0, 0, 0, 0, 0);

            double anchura = 0.0;
            double altura = 0.0;
            double basePrisma = 0.0;

            int opcion;
            do
            {
                Console.WriteLine("\nCalcular el Area y el Volumen de un prisma y de un cubo");
                Console.WriteLine("CUBO");
                Console.WriteLine("1. Calcular el Area de un cubo");
                Console.WriteLine("2. Calcular el Volumen de un cubo");
                Console.WriteLine("PRISMA");
                Console.WriteLine("3. Calcular el Area de un prisma");
                Console.WriteLine("4. Calcular el Volumen de un prisma");
                Console.WriteLine("5. Salir");
                Console.Write("Ingrese la opcion: ");
                opcion = Convert.ToInt32(Console.ReadLine());

                switch (opcion)
                {
                    case 1:
                        Console.WriteLine("Ingresa el valor del lado");
                        double lado = Convert.ToDouble(Console.ReadLine());
                        cubo.SetLado(lado);
                        cubo.SetArea((lado * lado) * 6);
                        Console.WriteLine("_____________________________");
                        Console.WriteLine("El area es: " + cubo.GetArea());
                        Console.WriteLine("_____________________________");
                        break;

                    case 2:
                        Console.WriteLine("Ingresa el valor del lado");
                        lado = Convert.ToDouble(Console.ReadLine());
                        cubo.SetLado(lado);
                        cubo.SetVolumen(lado * lado * lado);
                        Console.WriteLine("_____________________________");
                        Console.WriteLine("El area es: " + cubo.GetVolumen());
                        Console.WriteLine("_____________________________");
                        break;

                    case 3:
                        Console.WriteLine("Ingresa el valor de la altura");
                        altura = Convert.ToDouble(Console.ReadLine());
                        Console.WriteLine("Ingresa el valor de la base");
                        basePrisma = Convert.ToDouble(Console.ReadLine());
                        Console.WriteLine("Ingresa el valor de la anchura");
                        anchura = Convert.ToDouble(Console.ReadLine());

                        Console.WriteLine("Es triangular o rectangular?");
                        Console.WriteLine("Triangular = 0 | Rectangular = 1");
                        int valor = Convert.ToInt32(Console.ReadLine());
                        if (valor == 1)
                        {
                            prisma.SetAltura(altura);
                            prisma.SetBase(basePrisma);
                            double areaBase = basePrisma * altura;
                            double areaLateral = basePrisma * anchura;
                            prisma.SetArea(2 * (areaBase) + 2 * (areaLateral));
                        }
                        else
                        {
                            double areaBaseTriangular = (1 * (basePrisma * altura)) / 2;
                            double areaLateralTriangular = (basePrisma * altura) / 2;
                            prisma.SetArea(areaBaseTriangular + areaLateralTriangular);
                        }

                        Console.WriteLine("_____________________________");
                        Console.WriteLine("El area del PRISMA es: " + prisma.GetArea());
                        Console.WriteLine("_____________________________");
                        break;

                    case 4:
                        Console.WriteLine("Ingresa el valor de la altura");
                        altura = Convert.ToDouble(Console.ReadLine());
                        Console.WriteLine("Ingresa el valor del area de la base TOTAL");
                        basePrisma = Convert.ToDouble(Console.ReadLine());
                        prisma.SetAltura(altura);
                        prisma.SetBase(basePrisma);
                        prisma.SetVolumen(altura * basePrisma);
                        Console.WriteLine("_____________________________");
                        Console.WriteLine("El volumen del prisma es: " + prisma.GetVolumen());
                        Console.WriteLine("_____________________________");
                        break;

                    default:
                        Console.WriteLine("Opcion no valida.");
                        break;
                }

                Console.WriteLine("Quieres hacer otra operacion?");
                Console.WriteLine("Si = 1 | NO = 0");
                opcion = Convert.ToInt32(Console.ReadLine());

            } while (opcion == 1);
        }
    }

    public class Scanner
    {
        public int NextInt()
        {
            return Convert.ToInt32(Console.ReadLine());
        }

        public double NextDouble()
        {
            return Convert.ToDouble(Console.ReadLine());
        }

        public void NextLine()
        {
            Console.ReadLine();
        }
    }

    public class Cubo
    {
        private double lado;
        private double volumen;
        private double area;

        public Cubo(double lado, double volumen, double area)
        {
            this.lado = lado;
            this.volumen = volumen;
            this.area = area;
        }

        public double GetArea()
        {
            return area;
        }

        public void SetArea(double area)
        {
            this.area = area;
        }

        public double GetLado()
        {
            return lado;
        }

        public void SetLado(double lado)
        {
            this.lado = lado;
        }

        public double GetVolumen()
        {
            return volumen;
        }

        public void SetVolumen(double volumen)
        {
            this.volumen = volumen;
        }

        public override string ToString()
        {
            return $"Cubo{{lado={lado}, volumen={volumen}, area={area}}}";
        }
    }

    public class Prisma : Cubo
    {
        protected double basePrisma;
        protected double altura;
        protected double ancho;

        public Prisma(double basePrisma, double altura, double ancho, double lado, double volumen, double area) : base(lado, volumen, area)
        {
            this.basePrisma = basePrisma;
            this.altura = altura;
            this.ancho = ancho;
        }

        public double GetBase()
        {
            return basePrisma;
        }

        public void SetBase(double basePrisma)
        {
            this.basePrisma = basePrisma;
        }

        public double GetAltura()
        {
            return altura;
        }

        public void SetAltura(double altura)
        {
            this.altura = altura;
        }

        public double GetAncho()
        {
            return ancho;
        }

        public void SetAncho(double ancho)
        {
            this.ancho = ancho;
        }

        public override string ToString()
        {
            return $"Prisma{{base={basePrisma}, altura={altura}, ancho={ancho}}}";
        }
    }
}
