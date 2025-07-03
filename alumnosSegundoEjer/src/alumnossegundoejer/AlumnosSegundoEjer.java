
import java.util.Arrays;
import java.util.Scanner;

public class AlumnosSegundoEjer {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int valor;

        do {

            System.out.println("Cuantos alumnos va a ingresar?");
            int alumnosTotal = lector.nextInt();

            String[] nombreAlumnos = new String[alumnosTotal];
            float[] calificaciones = new float[alumnosTotal];
            int[] calificacionesEnteras = new int[alumnosTotal];
            float[] calificacionesDecimal = new float[alumnosTotal];

            for (int i = 0; i < alumnosTotal; i++) {
                System.out.println("Escribe el nombre del alumno num "+ (i + 1));
                nombreAlumnos[i] = lector.next();
            }

            for (int i = 0; i < alumnosTotal; i++) {
                System.out.println("Escribe la calificacion del alumno " + nombreAlumnos[i] + " numero " + (i + 1));
                calificaciones[i] = lector.nextFloat();
            }
            
            System.out.println("NO. | Nombre del Alumno | Calificacion | Calificacion en Letra");
            for (int i = 0; i < alumnosTotal; i++) {
            
                calificacionesEnteras[i] = (int) calificaciones[i];
                calificacionesDecimal[i] = calificaciones[i] - calificacionesEnteras[i];
                String letra = "";
                String letra2 = "";
                
                

                if (calificacionesEnteras[i] == 0) {
                    
                } else {
                    if (calificacionesEnteras[i] == 1) {
                        letra = "Uno";
                    } else {
                        if (calificacionesEnteras[i] == 2) {
                            letra = "Dos";
                        } else {
                            if (calificacionesEnteras[i] == 3) {
                                letra = "Tres";
                            } else {
                                if (calificacionesEnteras[i] == 4) {
                                    letra = "Cuatro";
                                } else {
                                    if (calificacionesEnteras[i] == 5) {
                                        letra = "Cinco";
                                    } else {
                                        if (calificacionesEnteras[i] == 6) {
                                            letra = "Seis";
                                        } else {
                                            if (calificacionesEnteras[i] == 7) {
                                                letra = "Siete";
                                            } else {
                                                if (calificacionesEnteras[i] == 8) {
                                                    letra = "Ocho";
                                                } else {
                                                    if (calificacionesEnteras[i] == 9) {
                                                        letra = "Nueve";
                                                    } else {
                                                        if (calificacionesEnteras[i] == 10) {
                                                            letra = "Diez";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                //SEPARAMOS LOS CONDICIONALES
                //CONDICIONAL PARA LOS DECIMALES
                
                if (calificacionesDecimal[i] <= 0.0) {
                    letra2 = "cero";
                } else {
                    if (calificacionesDecimal[i] < 0.1 && calificacionesDecimal[i] >= 0.0) {
                        letra2 = "cero";
                    } else {
                        if (calificacionesDecimal[i] < 0.2 && calificacionesDecimal[i] >= 0.1) {
                            letra2 = "uno";
                        } else {
                            if (calificacionesDecimal[i] < 0.3 && calificacionesDecimal[i] >= 0.2) {
                                letra2 = "dos";
                            } else {
                                if (calificacionesDecimal[i] < 0.4 && calificacionesDecimal[i] >= 0.3) {
                                    letra2 = "tres";
                                } else {
                                    if (calificacionesDecimal[i] < 0.5 && calificacionesDecimal[i] >= 0.4) {
                                        letra2 = "cuatro";
                                    } else {
                                        if (calificacionesDecimal[i] < 0.6 && calificacionesDecimal[i] >= 0.5) {
                                            letra2 = "cinco";
                                        } else {
                                            if (calificacionesDecimal[i] < 0.7 && calificacionesDecimal[i] >= 0.6) {
                                                letra2 = "seis";
                                            } else {
                                                if (calificacionesDecimal[i] < 0.8 && calificacionesDecimal[i] >= 0.7) {
                                                    letra2 = "siete";
                                                } else {
                                                    if (calificacionesDecimal[i] < 0.9 && calificacionesDecimal[i] >= 0.8) {
                                                        letra2 = "ocho";

                                                    }else{
                                                        if (calificacionesDecimal[i] >= 0.9) {
                                                        letra2 = "nueve";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    
                System.out.println((i + 1) + "      " + nombreAlumnos[i] + "                  " + calificaciones[i]+ "         " + letra+ " punto " + letra2);

                }
                
                
            

            }

            System.out.println("Quieres hacer otra operacion? SI = 1 NO = 0");
            valor = lector.nextInt();

        } while (valor == 1);
    }

}
