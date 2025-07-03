import java.util.Scanner;

public class NumeroCifras {

    public static void main(String[] args) {
        
        
        Scanner lector = new Scanner(System.in);

        int valor;
        
        do {
            System.out.println("Ingresa un numero de entre 0 y 99999");
            int numero = lector.nextInt();
            
            
            System.out.println("El numero " + numero + " tiene " + Integer.toString(numero).length() + " digitos");


            System.out.println("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = lector.nextInt();

        } while (valor == 1);
    }

  

}
