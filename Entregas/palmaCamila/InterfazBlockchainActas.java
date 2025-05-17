package Entregas.palmaCamila;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InterfazBlockchainActas {

    private static void mostrarMenuPrincipal() {
        System.out.println("\n╔═════════════════════════════════════════════╗");
        System.out.println("║     SISTEMA DE ACTAS DE NOTAS BLOCKCHAIN    ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        System.out.println("1. Añadir nueva acta de estudiante");
        System.out.println("2. Mostrar todas las actas");
        System.out.println("3. Verificar integridad de la cadena de actas");
        System.out.println("4. Buscar acta por ID de estudiante");
        System.out.println("0. Salir");
        System.out.println("───────────────────────────────────────────────");
        System.out.print("Seleccione una opción: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ActaCalificaciones acta = new ActaCalificaciones();
        MenuServicios menuServicios = new MenuServicios(); 
        
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        int opcion = -1;

        do {
            mostrarMenuPrincipal();
            
            while (!sc.hasNextInt()) {
                System.out.println("Opción no válida. Por favor, ingrese un número.");
                mostrarMenuPrincipal();
                sc.next(); 
            }
            opcion = sc.nextInt();
            sc.nextLine(); 

            try {
                switch (opcion) {
                    case 1:
                        menuServicios.procesarAnadirActa(acta, sc);
                        break;
                    case 2:
                        menuServicios.procesarMostrarTodasActas(acta, fmt);
                        break;
                    case 3:
                        menuServicios.procesarVerificarIntegridad(acta);
                        break;
                    case 4:
                        menuServicios.procesarBuscarActaPorId(acta, sc, fmt);
                        break;
                    case 0:
                        menuServicios.procesarSalirDelSistema();
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            } catch (Exception ex) {
                System.err.println("Error CRITICO con el algoritmo de Hashing: " + ex.getMessage());
                ex.printStackTrace(); 
            } 
            
            if (opcion != 0) { 
                System.out.println("\nPresione Enter para continuar...");
                sc.nextLine(); 
            }

        } while (opcion != 0);

        sc.close();
    }
}