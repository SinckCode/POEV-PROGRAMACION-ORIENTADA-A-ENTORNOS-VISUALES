import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListaNDupli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listaOriginal = new ArrayList<>();
        Random rand = new Random();
        System.out.println("Dime el tamaño de la lista");

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            listaOriginal.add(rand.nextInt(26)); // Valores aleatorios entre 0 y 25
        }

        System.out.println("Lista original: " + listaOriginal);

        eliminarDuplicados(listaOriginal);

        System.out.println("Lista sin duplicados: " + listaOriginal);
    }

    public static void eliminarDuplicados(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            int elementoActual = lista.get(i);
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j) == elementoActual) {
                    lista.remove(j);
                    j--; // Ajustamos el índice porque se eliminó un elemento
                }
            }
        }
    }
}
