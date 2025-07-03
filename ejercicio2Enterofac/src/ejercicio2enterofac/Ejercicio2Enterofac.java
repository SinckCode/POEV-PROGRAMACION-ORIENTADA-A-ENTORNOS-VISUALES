
import java.util.Scanner;

public class Ejercicio2Enterofac {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int valor;

        do {
            System.out.println("Dame un numero");
            int numero = lector.nextInt();
            
            if (numero == 0) {
                System.out.println("No existe un factorial");
                
            }else{
                if (numero == 0 || numero == 1) {
                    
                }
            }
            
            System.out.println("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = lector.nextInt();

        } while (valor == 1);
    }

}
