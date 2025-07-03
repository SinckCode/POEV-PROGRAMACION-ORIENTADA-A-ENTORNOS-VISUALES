/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesccuboprisma;

import java.util.Scanner;

/**
 *
 * @author soyan
 */
public class ClasescCuboPrisma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cubo cubo = new Cubo(0, 0, 0);
        Prisma prisma = new Prisma(0, 0, 0, 0, 0, 0);

        double anchura = 0.0;
        double altura = 0.0;
        double base = 0.0;

        int opcion;
        do {
            System.out.println("\nCalcular el Area y el Volumen de un prisma y de un cubo");
            System.out.println("CUBO");
            System.out.println("1. Calcular el Area de un cubo");
            System.out.println("2. Calcular el Volumen de un cubo");
            System.out.println("PRISMA");
            System.out.println("3. Calcular el Area de un prisma");
            System.out.println("4. Calcular el Volumen de un prisma");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrea el valor del lado");
                    double lado = scanner.nextDouble();
                    cubo.setLado(lado);
                    cubo.setArea((lado * lado) * 6);
                    System.out.println("_____________________________");
                    System.out.println("El area es: " + cubo.getArea());
                    System.out.println("_____________________________");

                    break;

                case 2:
                    System.out.println("Ingrea el valor del lado");
                    lado = scanner.nextDouble();
                    cubo.setLado(lado);
                    cubo.setVolumen(lado * lado * lado);
                    System.out.println("_____________________________");
                    System.out.println("El area es: " + cubo.getVolumen());
                    System.out.println("_____________________________");

                    break;

                case 3:
                    System.out.println("Ingrea el valor de la altura");
                    altura = scanner.nextDouble();
                    System.out.println("Ingrea el valor de la base");
                    base = scanner.nextDouble();
                    System.out.println("Ingrea el valor de la anchura");
                    anchura = scanner.nextDouble();
                    
                    System.out.println("Es triangular o rectangular?");
                    System.out.println("Triangular = 0 | Rectangular = 1");
                    int valor = scanner.nextInt();
                    if (valor == 1) {
                    prisma.setAltura(altura);
                    prisma.setBase(base);
                    double areaBase = base * altura;
                    double areaLate = base * anchura;
                    prisma.setArea(2*(areaBase) + 2*(areaLate));
                    }else{
                        double areabasee = (1*(base * altura))/2;
                        double arealatee = (base *altura)/2;
                        prisma.setArea(areabasee + arealatee);

                    }
                    
                    System.out.println("_____________________________");
                    System.out.println("El area del PRISMA es: " + prisma.getArea());
                    System.out.println("_____________________________");

                    break;

                case 4:
                    System.out.println("Ingrea el valor de la altura");
                    altura = scanner.nextDouble();
                    System.out.println("Ingrea el valor del area de la base TOTAL");
                    base = scanner.nextDouble();
                    prisma.setAltura(altura);
                    prisma.setBase(base);
                    prisma.setVolumen(altura * base);
                    System.out.println("_____________________________");
                    System.out.println("El volumen del prisma es: " + prisma.getVolumen());
                    System.out.println("_____________________________");

                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.println("Quieres hacer otra operacion?");
            System.out.println("Si = 1 | NO = 0");
            opcion = scanner.nextInt();

        } while (opcion == 1);

        scanner.close();
    }

}
