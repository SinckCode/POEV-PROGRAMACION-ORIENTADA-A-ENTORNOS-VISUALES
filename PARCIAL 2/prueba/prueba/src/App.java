import java.util.Scanner;

class Asiento {
    private boolean reservado;

    public Asiento() {
        this.reservado = false;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void reservar() {
        if (!reservado) {
            this.reservado = true;
            System.out.println("¡Asiento reservado con éxito!");
        } else {
            System.out.println("¡Lo sentimos, ese asiento ya se encuentra reservado!");
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            this.reservado = false;
            System.out.println("¡Reserva cancelada con éxito!");
        } else {
            System.out.println("¡El asiento seleccionado no tiene reserva, cancelación invalida!");
        }
    }

    @Override
    public String toString() {
        return "[" + (reservado ? "X" : " ") + "]";
    }
}

class Sala {
    private ArrayList<ArrayList<Asiento>> asientos;

    public Sala(int filas, int columnas) {
        this.asientos = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            ArrayList<Asiento> filaAsientos = new ArrayList<>();
            for (int j = 0; j < columnas; j++) {
                filaAsientos.add(new Asiento());
            }
            this.asientos.add(filaAsientos);
        }
    }

    public void reservarAsiento(int fila, int columna) {
        this.asientos.get(fila).get(columna).reservar();
    }

    public void cancelarReservaAsiento(int fila, int columna) {
        this.asientos.get(fila).get(columna).cancelarReserva();
    }

    public String mostrarEstadoAsientos() {
        StringBuilder estado = new StringBuilder();
        for (int i = 0; i < this.asientos.size(); i++) {
            for (int j = 0; j < this.asientos.get(i).size(); j++) {
                estado.append(this.asientos.get(i).get(j).toString());
            }
            estado.append("\n");
        }
        return estado.toString();
    }
}

class Cine {
    private ArrayList<Sala> salas;
    private static Scanner scanner = new Scanner(System.in);

    public Cine(int numSalas, int funcionesPorSala, int filasPorSala, int columnasPorSala) {
        this.salas = new ArrayList<>();
        for (int i = 0; i < numSalas; i++) {
            Sala sala = new Sala(filasPorSala, columnasPorSala);
            for (int j = 0; j < funcionesPorSala; j++) {
                this.salas.add(sala);
            }
        }
    }

    public void reservarAsiento(int sala, int funcion, int fila, int columna) {
        if (sala < 1 || sala > this.salas.size() / 3 || funcion < 1 || funcion > 3) {
            System.out.println("¡Sala o función no válida!");
            return;
        }
        int index = (sala - 1) * 3 + funcion - 1;
        this.salas.get(index).reservarAsiento(fila, columna);
    }

    public void cancelarReservaAsiento(int sala, int funcion, int fila, int columna) {
        if (sala < 1 || sala > this.salas.size() / 3 || funcion < 1 || funcion > 3) {
            System.out.println("¡Sala o función no válida!");
            return;
        }
        int index = (sala - 1) * 3 + funcion - 1;
        this.salas.get(index).cancelarReservaAsiento(fila, columna);
    }

    public String mostrarEstadoAsientosSala(int sala, int funcion) {
        if (sala < 1 || sala > this.salas.size() / 3 || funcion < 1 || funcion > 3) {
            return "¡Sala o función no válida!";
        }
        int index = (sala - 1) * 3 + funcion - 1;
        return this.salas.get(index).mostrarEstadoAsientos();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static void cerrarScanner() {
        scanner.close();
    }
}

public class App {
    public static void main(String[] args) {
        // Crear un cine con 4 salas y 3 funciones por sala
        Cine cine = new Cine(4, 3, 8, 8);

        // Mostrar las funciones disponibles
        System.out.println("Funciones disponibles:");
        System.out.println("1. 10:00 am");
        System.out.println("2. 2:00 pm");
        System.out.println("3. 7:00 pm");

        // Mostrar las películas en cada sala
        System.out.println("Las funciones de hoy son:");
        System.out.println("Sala 1: Titanic");
        System.out.println("Sala 2: Star Wars");
        System.out.println("Sala 3: John Wick");
        System.out.println("Sala 4: El Hobbit");

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Reservar asiento");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Mostrar estado de los asientos en una sala");
            System.out.println("4. Salir");
            opcion = Cine.leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    int sala = Cine.leerEntero("Ingrese el número de sala: ");
                    int funcion = Cine.leerEntero("Ingrese la función a la que desea asistir: ");
                    if (sala < 1 || sala > 4 || funcion < 1 || funcion > 3) {
                        System.out.println("¡Sala o función no válida!");
                        break;
                    }
                    int fila = Cine.leerEntero("Ingrese la fila del asiento: ");
                    int columna = Cine.leerEntero("Ingrese la columna del asiento: ");

                    cine.reservarAsiento(sala, funcion, fila, columna);

                    // Mostrar el estado de los asientos en la sala seleccionada
                    System.out.println("Estado de los asientos en la sala " + sala + ", función " + funcion + ":");
                    System.out.println(cine.mostrarEstadoAsientosSala(sala, funcion));
                    break;
                case 2:
                    sala = Cine.leerEntero("Ingrese el número de sala: ");
                    funcion = Cine.leerEntero("Ingrese la función: ");
                    if (sala < 1 || sala > 4 || funcion < 1 || funcion > 3) {
                        System.out.println("¡Sala o función no válida!");
                        break;
                    }
                    fila = Cine.leerEntero("Ingrese la fila del asiento: ");
                    columna = Cine.leerEntero("Ingrese la columna del asiento: ");

                    cine.cancelarReservaAsiento(sala, funcion, fila, columna);

                    // Mostrar el estado de los asientos en la sala seleccionada
                    System.out.println("Estado de los asientos en la sala " + sala + ", función " + funcion + ":");
                    System.out.println(cine.mostrarEstadoAsientosSala(sala, funcion));
                    break;
                case 3:
                    sala = Cine.leerEntero("Ingrese el número de sala: ");
                    funcion = Cine.leerEntero("Ingrese la función: ");
                    if (sala < 1 || sala > 4 || funcion < 1 || funcion > 3) {
                        System.out.println("¡Sala o función no válida!");
                        break;
                    }

                    // Mostrar el estado de los asientos en la sala seleccionada
                    System.out.println("Estado de los asientos en la sala " + sala + ", función " + funcion + ":");
                    System.out.println(cine.mostrarEstadoAsientosSala(sala, funcion));
                    break;
                case 4:
                    System.out.println("¡Gracias por utilizar nuestro servicio!");
                    break;
                default:
                    System.out.println("¡Opción no válida!");
            }
        } while (opcion != 4);

        Cine.cerrarScanner();
    }
}