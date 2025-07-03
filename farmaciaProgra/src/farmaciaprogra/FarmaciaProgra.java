
import java.util.Scanner;

public class FarmaciaProgra {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int valor;

        do {
            System.out.println("Ingresa el valor de tu compra");
            double compra = lector.nextDouble();
            System.out.println("Pagaras de contado o con tarjeta? Contado = 1 Tarjeta = 2");
            int pago = lector.nextInt();

            if (pago == 1) {
                double descReca = compra - (compra * 0.05);
                System.out.println("Felicidades!! se te hizo un decuento");
                System.out.println("Tu total es de: " + descReca);
            } else {
                double descReca = (compra * 0.03) + compra;
                System.out.println("Lo siento, tuvimos que cobrar un extra");
                System.out.println("Tu total es de: " + descReca);

            }

            System.out.println("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = lector.nextInt();

        } while (valor == 1);
    }

}
