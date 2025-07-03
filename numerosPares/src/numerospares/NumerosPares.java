
import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int valor;

        do {
            System.out.println("Ingresa el valor inferior");
            int infe = lector.nextInt();
            System.out.println("Ingresa el valor superior");
            int supe = lector.nextInt();
            
  
            if (infe % 2 == 0) {
                infe += 2;
            } else{
                supe += 1;
            }

            int n = (supe - infe)/2;
            int s = ((infe + supe)/2)* n;
            
            System.out.println("La suma da como resultado: " + s);
            
            
            System.out.println("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = lector.nextInt();

        } while (valor == 1);
    }

}
