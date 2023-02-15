package alumnos;

import Alumno.Alumno;
import java.util.Scanner;

/**
 * Alumnos.java
 * 
 * @author Andres Conde Garcia
 */

public class Alumnos {

    public static void muestraDatos(Alumno[] alum) {
        // Muestra los datos de los alumnos /////////////////////////////////

        System.out.println("Los datos introducidos son los siguientes:");

        double sumaDeMedias = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + i
                    + "\nNombre: " + alum[i].getNombre()
                    + "\nNota media: " + alum[i].getNota()
                    + "\n----------------------------");

            sumaDeMedias += alum[i].getNota();
        } // for i

        System.out.println("La media global de la clase es " + sumaDeMedias / 5);
    }

    public static void anyadirAlumno(int contador, Alumno[] alum) {
        Scanner entrada = new Scanner(System.in);

        String nombreIntroducido;
        double notaIntroducida;

        alum[contador] = new Alumno();
        System.out.println("Alumno " + contador
                + "\nNombre: ");
        nombreIntroducido = entrada.nextLine();
        (alum[contador]).setNombre(nombreIntroducido);
        System.out.print("Nota media: ");
        notaIntroducida = entrada.nextDouble();
        alum[contador].setNota(notaIntroducida);
    }

    public static void main(String[] args) {

        // Define la estructura, un array de 5 alumnos
        // pero no crea los objetos
        Alumno[] alum = new Alumno[5];

        // Pide los datos de los alumnos /////////////////////////////////
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");

        for (int i = 0; i < 5; i++) {
            anyadirAlumno(i, alum);
        } // for i

        muestraDatos(alum);
    }
}
