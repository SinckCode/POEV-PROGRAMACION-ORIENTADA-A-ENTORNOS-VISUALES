import java.util.Scanner;

public class EnterosDife {

    public static void main(String[] args) {
        
        
        Scanner lector = new Scanner(System.in);

        int valor;
        do {
            System.out.println("Ingresa el valor 1");
            int valor1 = lector.nextInt();
            System.out.println("Ingresa el valor 2");
            int valor2 = lector.nextInt();

            

            if (valor1 > valor2) {
                System.out.println("El valor mayor es: " + valor1);
            } else{
                System.out.println("El valor mayor es: " + valor2);
            }

            System.out.println("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = lector.nextInt();

        } while (valor == 1);
    }

  

}
