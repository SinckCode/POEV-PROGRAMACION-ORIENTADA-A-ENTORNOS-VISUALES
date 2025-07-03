
import java.util.Scanner;

public class Val3Calc {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa 3 valores");
        var num1 = lector.nextDouble();
        var num2 = lector.nextDouble();
        var num3 = lector.nextDouble();
        int valor;
        var valor2 = 0;
        do {

            System.out.println("Que operacion quieres realizar?");
            System.out.println("Suma = 1, Resta = 2, Multiplicacion = 3, Division = 4");
            var tipo = lector.nextInt();

            switch (tipo) {
                case 1:
                    System.out.println("SUMA: ");
                    var suma = num1 + num2 + num3;
                    System.out.println("el valor de la suma es: " + suma);
                    break;

                case 2:
                    System.out.println("RESTA: ");
                    var resta = num1 - num2 - num3;
                    System.out.println("el valor de la resta es: " + resta);

                    break;

                case 3:
                    System.out.println("MULTIPLICACION");
                    var multi = num1 * num2 * num3;
                    System.out.println("el valor de la Multiplicacion es: " + multi);

                    break;

                case 4:
                    System.out.println("DIVISION");
                    var divi = num1 / num2 / num3;
                    System.out.println("el valor de la Division es: " + divi);

                    break;

            }

            System.out.println("Quieres hacer otra operación? SI = 1 NO = 0");
            valor = lector.nextInt();

            System.out.println("Deseas ingresar otros valores? SI = 1 NO = 0");
            valor2 = lector.nextInt();
            if (valor2 == 1) {
                num1 = lector.nextDouble();
                num2 = lector.nextDouble();
                num3 = lector.nextDouble();
            }

        } while (valor == 1);
    }

}
