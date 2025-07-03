import java.util.Scanner;

public class OrdenNumeros {

    public static void main(String[] args) {
        
        
        Scanner lector = new Scanner(System.in);

        int valor;
        
        do {
            System.out.println("Ingresa el valor 1");
            int valor1 = lector.nextInt();
            System.out.println("Ingresa el valor 2");
            int valor2 = lector.nextInt();
            System.out.println("Ingresa el valor 3");
            int valor3 = lector.nextInt();

            

            if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
                System.out.println("El orden es el siguiente: ");
                System.out.println( " " + valor1 + " " + valor2 + " " + valor3);
            } else{
                if (valor2 > valor3) {
                    System.out.println("El orden es el siguiente: ");
                System.out.println( " " + valor2 + " " + valor3 + " " + valor2);
                }else{
                    System.out.println("El orden de mayor a menor es el siguiente: ");
                System.out.println( " " + valor3 + " " + valor2 + " " + valor1);
                }
            }

            System.out.println("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = lector.nextInt();

        } while (valor == 1);
    }

  

}
