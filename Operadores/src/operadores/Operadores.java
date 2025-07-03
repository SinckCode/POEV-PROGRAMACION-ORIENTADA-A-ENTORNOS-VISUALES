package operadores;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dos valores al usuario
        System.out.print("Ingrese el primer valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        double valor2 = scanner.nextDouble();

        // Operadores aritméticos
        double suma = valor1 + valor2;
        double resta = valor1 - valor2;
        double multiplicacion = valor1 * valor2;
        double division = valor1 / valor2;
        double modulo = valor1 % valor2;
        double exponente = Math.pow(valor1, valor2);

        // Operadores de asignación
        double resultadoAsignacion = 0;
        resultadoAsignacion += valor1;
        resultadoAsignacion -= valor2;
        resultadoAsignacion *= valor1;
        resultadoAsignacion /= valor2;

        // Operadores unarios
        double valorUnario1 = -valor1;
        boolean valorUnario2 = !(valor1 > valor2);

        // Operadores de igualdad
        boolean igualdad = valor1 == valor2;
        boolean desigualdad = valor1 != valor2;

        // Operadores de relación
        boolean mayorQue = valor1 > valor2;
        boolean menorQue = valor1 < valor2;
        boolean mayorIgualQue = valor1 >= valor2;
        boolean menorIgualQue = valor1 <= valor2;

        // Operadores condicionales
        boolean condicionalAnd = (valor1 > 0) && (valor2 < 0);
        boolean condicionalOr = (valor1 > 0) || (valor2 < 0);

        // Operador ternario
        String resultadoTernario = (valor1 > valor2) ? "Valor1 es mayor" : "Valor2 es mayor o son iguales";

        // Imprimir resultados
        System.out.println("Operadores Aritméticos:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
        System.out.println("Exponente: " + exponente);

        System.out.println("\nOperadores de Asignación:");
        System.out.println("Resultado de la asignación: " + resultadoAsignacion);

        System.out.println("\nOperadores Unarios:");
        System.out.println("Valor1 negado: " + valorUnario1);
        System.out.println("No es mayor que: " + valorUnario2);

        System.out.println("\nOperadores de Igualdad:");
        System.out.println("Igualdad: " + igualdad);
        System.out.println("Desigualdad: " + desigualdad);

        System.out.println("\nOperadores de Relación:");
        System.out.println("Mayor que: " + mayorQue);
        System.out.println("Menor que: " + menorQue);
        System.out.println("Mayor o igual que: " + mayorIgualQue);
        System.out.println("Menor o igual que: " + menorIgualQue);

        System.out.println("\nOperadores Condicionales:");
        System.out.println("Condición con AND: " + condicionalAnd);
        System.out.println("Condición con OR: " + condicionalOr);

        System.out.println("\nOperador Ternario:");
        System.out.println(resultadoTernario);
    }
}

