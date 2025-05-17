package Entregas.palmaCamila;

import java.util.ArrayList;
import java.util.List;

public class ActaCalificaciones {

    private List<Bloque> cadena;

    public ActaCalificaciones() {
        this.cadena = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        String hashAnterior;
        if (this.cadena.isEmpty()) {
            hashAnterior = "0";
        } else {
            hashAnterior = this.cadena.get(this.cadena.size() - 1).getHash();
        }
        Bloque nuevoBloque = new Bloque(e, hashAnterior);
        this.cadena.add(nuevoBloque);
        
    }

    public boolean verificarIntegridad() {
        if (cadena.isEmpty()) {
            return true;
        }

            Bloque bloqueGenesis = cadena.get(0);
            if (!"0".equals(bloqueGenesis.getHashAnterior())) {
                System.err.println("Error de integridad: El hash anterior del bloque Genesis no es '0'.");
                return false;
            }
            if (!bloqueGenesis.getHash().equals(bloqueGenesis.calcularHash())) {
                System.err.println("Error de integridad: El bloque Genesis ha sido alterado.");
                return false;
            }

            for (int i = 1; i < this.cadena.size(); i++) {
                Bloque bloqueActual = this.cadena.get(i);
                Bloque bloqueAnterior = this.cadena.get(i - 1);

                if (!bloqueActual.getHash().equals(bloqueActual.calcularHash())) {
                    System.err.println("Error de integridad: El bloque con estudiante ID " +
                                       bloqueActual.getEstudiante().getStudentId() + " ha sido alterado.");
                    return false;
                }

                if (!bloqueActual.getHashAnterior().equals(bloqueAnterior.getHash())) {
                    System.err.println("Error de integridad: Cadena rota en bloque con estudiante ID " +
                                       bloqueActual.getEstudiante().getStudentId() +
                                       ". El hash anterior no coincide.");
                    return false;
                }
            }
        
        return true;
    }

    public List<Bloque> getCadena() {
        return this.cadena;
    }
}