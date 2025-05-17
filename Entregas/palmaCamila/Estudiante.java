package Entregas.palmaCamila;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Estudiante extends Persona implements IHashable {
    private String studentId;
    private int evalContinua;
    private int evalProfesor;
    private int examenParcial;
    private int examenFinal;

    public Estudiante(String studentId, String nombre, String apellido,
                      int evalContinua, int evalProfesor, int examenParcial, int examenFinal) {
        super(nombre, apellido);
        this.studentId = studentId;
        this.evalContinua = evalContinua;
        this.evalProfesor = evalProfesor;
        this.examenParcial = examenParcial;
        this.examenFinal = examenFinal;
    }

    public double calcularPromedio() {
        return (evalContinua + evalProfesor + examenParcial + examenFinal) / 4.0;
    }

    public String generarHash() {
        try {
            String datos = studentId + ":" +
                           super.getNombre() + ":" +
                           super.getApellido() + ":" +
                           evalContinua + ":" +
                           evalProfesor + ":" +
                           examenParcial + ":" +
                           examenFinal + ":" +
                           String.format("%.2f", calcularPromedio());

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(datos.getBytes()); 
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error critico: Algoritmo SHA-256 no encontrado durante la generacion de hash para Estudiante ID: " + studentId);
            return null; 
        }
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }
    
    public int getEvalContinua() {
        return evalContinua;
    }

    public int getEvalProfesor() {
        return evalProfesor;
    }

    public int getExamenParcial() {
        return examenParcial;
    }

    public int getExamenFinal() {
        return examenFinal;
    }
}
