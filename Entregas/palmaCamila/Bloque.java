package Entregas.palmaCamila;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

public class Bloque {
    private String hash;
    private String hashAnterior;
    private Estudiante estudiante;
    private long timestamp;

    public Bloque(Estudiante estudiante, String hashAnterior) {
        this.estudiante = estudiante;
        this.hashAnterior = hashAnterior;
        this.timestamp = Instant.now().getEpochSecond();
        this.hash = calcularHash(); 
    }

    public String calcularHash() {
        try {
            String datos = this.hashAnterior + this.timestamp + this.estudiante.generarHash();
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(datos.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error critico: Algoritmo SHA-256 no encontrado durante el calculo del hash.");
            return null; 
        }
    }
    
    public long getTimestamp() {
        return this.timestamp;
    }

    public String getHash() {
        return this.hash;
    }

    public String getHashAnterior() {
        return this.hashAnterior;
    }

    public Estudiante getEstudiante() {
        return this.estudiante;
    }
}
