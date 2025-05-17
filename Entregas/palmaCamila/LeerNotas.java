package Entregas.palmaCamila; 

import java.util.Scanner;

public class LeerNotas {
     
    public static int leerNota(Scanner sc, String descripcion) {
        int nota;
        String promptMessage = descripcion + " (0–10): ";
        String errorMessageValida = "Debe ser un número entero. " + promptMessage;
        String errorMessageRango = "La nota debe estar entre 0 y 10.";

        do {
            System.out.print(promptMessage);
            while (!sc.hasNextInt()) {
                System.out.print(errorMessageValida);
                sc.next();
            }
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println(errorMessageRango);
            }
        } while (nota < 0 || nota > 10);
        sc.nextLine();
        return nota;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notaContinua = leerNota(scanner, "Evaluación continua");
        System.out.println("Nota ingresada: " + notaContinua);

        int notaProfesor = leerNota(scanner, "Evaluación profesor");
        System.out.println("Nota ingresada: " + notaProfesor);
        scanner.close();
    }
    
}