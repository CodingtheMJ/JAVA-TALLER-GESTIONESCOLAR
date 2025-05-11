package com;

import java.util.HashSet;
import java.util.Set;

public class Escuela {

    private Set<Estudiante> datosEstudiante;

    public Escuela() {
        datosEstudiante = new HashSet<>();
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        for (Estudiante estudiantea : datosEstudiante) {
            if (estudiantea.getIdentificacion() == estudiante.getIdentificacion()) {
                System.out.println("EL ID ingresado ya existe. Estudiante no agregado");
                return false;
            }
        }

        if (estudiante.getCalificacion() < 0 || estudiante.getCalificacion() > 10) {
            System.out.println("Calificación inválida. Debe estar entre 0 y 10");
            return false;
        }

        datosEstudiante.add(estudiante);
        System.out.println("Estudiante agregado");
        return true;
    }

    public Estudiante buscarEstudiante(int id) {
        for (Estudiante estudiante : datosEstudiante) {
            if (estudiante.getIdentificacion() == id) {
                System.out.println("Resultado de búsqueda: " + estudiante);
                return estudiante;
            }
        }
        System.out.println("Estudiante no encontrado");
        return null;
    }
}
