/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listausuariospriority;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaUsuariosPriority {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el nombre (o 'fin' para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equals("fin")) {
                continuar = false;
            } else {
                System.out.print("Ingrese la edad: ");
                int edad = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese la direccion: ");
                String direccion = scanner.nextLine();

                System.out.print("Ingrese el telefono: ");
                String telefono = scanner.nextLine();

                Persona persona = new Persona(nombre, edad, direccion, telefono);
                insertarPorEdad(persona, personas);
            }

        }

        System.out.println("\nLista de personas ordenada por edad (mayor a menor):");
        System.out.println(personas);

        
        
    }

    private static void insertarPorEdad(Persona persona, ArrayList<Persona> personas) {
        int i = 0;
        while (i < personas.size() && personas.get(i).getEdad() > persona.getEdad()) {
            i++;
        }
        personas.add(i, persona);
    }
}

class Persona {

    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;

    public Persona(String nombre, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Direccion: " + direccion + ", Telefono: " + telefono;
    }
}
