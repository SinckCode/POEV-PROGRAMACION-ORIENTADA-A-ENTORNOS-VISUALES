
import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int valor;
        var valor2 = 0;
        do {
            System.out.println("Ingresa un numero para darte el dia de la semana");
            System.out.println("Lunes = 1, Martes = 2, Miercoles = 3, Jueves = 4, Viernes = 5, Sabado = 6, Domingo = 7");
            var tipo = lector.nextInt();

            switch (tipo) {
                case 1:
                    System.out.println("El dia de la semana es Lunes ");

                    break;

                case 2:
                    System.out.println("El dia de la semana es Martes ");

                    break;

                case 3:
                    System.out.println("El dia de la semana es Miercoles ");

                    break;

                case 4:
                    System.out.println("El dia de la semana es Jueves ");

                    break;

                case 5:
                    System.out.println("El dia de la semana es Viernes ");

                    break;

                case 6:
                    System.out.println("El dia de la semana es Sabado ");

                    break;

                case 7:
                    System.out.println("El dia de la semana es Domingo ");

                    break;

            }

            System.out.println("Quieres hacer otra operación? SI = 1 NO = 0");
            valor = lector.nextInt();

            

        } while (valor == 1);
    }

}
