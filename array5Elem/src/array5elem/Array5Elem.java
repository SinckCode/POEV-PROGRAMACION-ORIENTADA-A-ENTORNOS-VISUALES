
import java.util.Scanner;

public class Array5Elem {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int valor;

        do {
       
        int numIngres = 5;

        int[] valores = new int[numIngres];

        for (int i = 0; i < numIngres; i++) {
            System.out.println("Escribe el valor del num " + (i + 1));
            valores[i] = lector.nextInt();
        }
        System.out.println("pos val");
        for (int i = 0; i < numIngres; i++) {
            
            System.out.println(i + "   " + valores[i]);
        }


            
            System.out.println("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = lector.nextInt();

        } while (valor == 1);
    }

}

    
