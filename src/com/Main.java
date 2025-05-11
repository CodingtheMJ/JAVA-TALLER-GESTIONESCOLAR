package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = -1;

        // Crear instancia
        Escuela escuela = new Escuela();

        do {
            System.out.println("\nElija una opción:");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Buscar Estudiante por ID");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Nombre del estudiante:");
                    String nombre = scanner.nextLine();

                    System.out.println("Identificación del estudiante:");
                    int iden = scanner.nextInt();

                    System.out.println("Calificación del estudiante:");
                    double cal = scanner.nextDouble();
                    scanner.nextLine();

                    Estudiante nuevoEstudiante = new Estudiante(nombre, iden, cal);
                    escuela.agregarEstudiante(nuevoEstudiante);
                    break;

                case 2:
                    System.out.println("Ingrese el ID del estudiante que desea buscar:");
                    int buscarId = scanner.nextInt();
                    scanner.nextLine();

                    escuela.buscarEstudiante(buscarId);
                    break;

                case 3:
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (menu != 3);
    }
}
