import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class ProgramaEstacionamiento {

    private static LocalTime[] horaEntrada = new LocalTime[5]; // Array para almacenar horas de entrada

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int valor;

        String[][] datosUsuario = new String[5][5];

        do {
            mostrarMenu();
            int opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa los datos de los Autos");
                    ingresarDatosMatriz(datosUsuario, lector);
                    break;
                case 2:
                    sacarCarros(datosUsuario);
                    break;
                case 3:
                    mostrarMatriz(datosUsuario);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.println("¿Quieres hacer otra operacion? SI = 1, NO = 0");
            valor = lector.nextInt();
        } while (valor == 1);
    }

    private static void mostrarMenu() {
        System.out.println("1. Ingresar carros");
        System.out.println("2. Sacar carros");
        System.out.println("3. Mostrar Matriz");
        System.out.println("Elige una opcion:");
    }

    private static void ingresarDatosMatriz(String[][] datosUsuario, Scanner lector) {
        Random gen = new Random();

        System.out.println("Dame la hora de entrada de 5 autos (formato HH:MM):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Auto " + (i + 1) + ": ");
            datosUsuario[i][0] = lector.next();
            horaEntrada[i] = LocalTime.parse(datosUsuario[i][0]);
        }
    }

    private static void mostrarMatriz(String[][] datosUsuario) {
        System.out.println("Matriz actual:");
        for (String[] fila : datosUsuario) {
            for (String dato : fila) {
                if (dato == null) {
                    System.out.print("|" + "\t");
                } else {
                    System.out.print(dato + "\t");
                }
            }
            System.out.println();
        }
    }

    private static void sacarCarros(String[][] datosUsuario) {
        Random gen = new Random();

        for (int i = 0; i < datosUsuario.length; i++) {
            if (datosUsuario[i][0] != null) { // Verificar si el auto esta estacionado
                LocalTime horaActual = generarHoraAleatoria(gen);
                
                long minutosEstacionado;
                
                if (horaActual.isAfter(horaEntrada[i])) {
                    minutosEstacionado = horaEntrada[i].until(horaActual, java.time.temporal.ChronoUnit.MINUTES);
                } else {
                    minutosEstacionado = horaEntrada[i].until(LocalTime.MAX, java.time.temporal.ChronoUnit.MINUTES);
                    minutosEstacionado += LocalTime.MIN.until(horaActual, java.time.temporal.ChronoUnit.MINUTES);
                }
                
                long horasEstacionado = minutosEstacionado / 60;
                minutosEstacionado %= 60;

                // Calcular cuota
                double cuota = (25 * horasEstacionado) + (0.4167 * minutosEstacionado);

                // Imprimir resultados
                System.out.println("La hora actual es: " + horaActual);
                System.out.println("El carro " + (i + 1) + " entro a las: " + datosUsuario[i][0]);
                System.out.println("Ha estado estacionado por " + horasEstacionado + " horas y " + minutosEstacionado + " minutos.");
                System.out.println("La cuota a pagar es: " + cuota);
                System.out.println();
            }
        }
    }
    
    private static LocalTime generarHoraAleatoria(Random gen) {
        int hora = gen.nextInt(24); // Hora aleatoria entre 0 y 23
        int minutos = gen.nextInt(60); // Minutos aleatorios entre 0 y 59
        return LocalTime.of(hora, minutos);
    }
}
