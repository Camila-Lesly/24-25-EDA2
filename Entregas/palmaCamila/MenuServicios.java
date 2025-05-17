package Entregas.palmaCamila;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MenuServicios {

    public void procesarAnadirActa(ActaCalificaciones acta, Scanner sc) {
        System.out.println("\n---[ Añadir Nueva Acta ]---");
        System.out.print("ID del estudiante: ");
        String id = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        int ec = LeerNotas.leerNota(sc, "Evaluación continua");
        int ep = LeerNotas.leerNota(sc, "Evaluación profesor");
        int exParcial = LeerNotas.leerNota(sc, "Examen parcial");
        int exFinal = LeerNotas.leerNota(sc, "Examen final");
 
        Estudiante nuevo = new Estudiante(id, nombre, apellido, ec, ep, exParcial, exFinal);
        
        try {
            acta.agregarEstudiante(nuevo);
            System.out.println("Acta registrada con éxito en la blockchain.");
        } catch (RuntimeException e) {
            System.err.println("Error al registrar el acta: " + e.getMessage());
        }
    }

    public void procesarMostrarTodasActas(ActaCalificaciones acta, SimpleDateFormat fmt) {
        System.out.println("\n---[ Todas las Actas en la Blockchain ]---");
        if (acta.getCadena().isEmpty()) {
            System.out.println("No hay actas registradas todavía.");
        } else {
            for (Bloque b : acta.getCadena()) {
                Estudiante e = b.getEstudiante();
                Date fecha = new Date(b.getTimestamp() * 1000L); 
                System.out.println("Estudiante: " + e.getNombre() + " " + e.getApellido());
                System.out.println("  ID: " + e.getStudentId());
                System.out.println("  Fecha de registro: " + fmt.format(fecha));
                System.out.println("  Promedio final: " + String.format("%.2f", e.calcularPromedio()));
                System.out.println("  Hash del bloque: " + b.getHash());
                System.out.println("  Hash anterior: " + b.getHashAnterior());
                System.out.println("---------------------------------------------");
            }
        }
    }

    public void procesarVerificarIntegridad(ActaCalificaciones acta) {
        System.out.println("\n---[ Verificación de Integridad de la Blockchain ]---");
        if (acta.getCadena().isEmpty()) {
            System.out.println("La cadena está vacía. No hay nada que verificar.");
        } else {
            boolean valido = acta.verificarIntegridad();
            if (valido) {
                System.out.println("INTEGRIDAD VERIFICADA! La cadena de actas es consistente.");
            } else {
                System.out.println("ALERTA DE INTEGRIDAD! La cadena de actas ha sido alterada o es inconsistente.");
            }
        }
    }

    public void procesarBuscarActaPorId(ActaCalificaciones acta, Scanner sc, SimpleDateFormat fmt) {
        System.out.println("\n---[ Buscar Acta por ID de Estudiante ]---");
        System.out.print("Introduce el ID del estudiante a buscar: ");
        String busqueda = sc.nextLine();
        Bloque bloqueEncontrado = null;

        for (Bloque b : acta.getCadena()) {
            if (b.getEstudiante().getStudentId().equals(busqueda)) {
                bloqueEncontrado = b;
                break;
            }
        }

        if (bloqueEncontrado != null) {
            Estudiante e2 = bloqueEncontrado.getEstudiante();
            Date f = new Date(bloqueEncontrado.getTimestamp() * 1000L); 
            System.out.println("\n--- Acta Encontrada ---");
            System.out.println("Estudiante: " + e2.getNombre() + " " + e2.getApellido());
            System.out.println("  ID: " + e2.getStudentId());
            System.out.println("  Fecha de registro: " + fmt.format(f));
            System.out.println("  Promedio final: " + String.format("%.2f", e2.calcularPromedio()));
            System.out.println("  Hash del bloque: " + bloqueEncontrado.getHash());
            System.out.println("  Hash anterior: " + bloqueEncontrado.getHashAnterior());
        } else {
            System.out.println("No se encontró ningún acta para el ID: " + busqueda);
        }
    }

    public void procesarSalirDelSistema() {
        System.out.println("\nSaliendo del sistema... Hasta pronto!");
    }
}
