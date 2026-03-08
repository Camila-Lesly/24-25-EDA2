package palmaCamila;

import java.util.ArrayList;
import java.util.List;

public class IndiceOrdenado {
    private String[] claves;
    private int[] posiciones;
    private int cantidadValores;

    public IndiceOrdenado(int capacidadMaxima) {
        claves = new String[capacidadMaxima];
        posiciones = new int[capacidadMaxima];
        cantidadValores = 0;
    }

    public void agregar(String valor, int posicion) {
        if (cantidadValores >= claves.length) {
            throw new IllegalStateException("Capacidad máxima alcanzada");
        }
        claves[cantidadValores] = valor;
        posiciones[cantidadValores] = posicion;
        cantidadValores++;
    }

    public int[] buscar(String valor) {
        List<Integer> resultados = new ArrayList<>();
        for (int i = 0; i < cantidadValores; i++) {
            if (claves[i].equals(valor)) {
                resultados.add(posiciones[i]);
            }
        }

        int[] res = new int[resultados.size()];
        for (int i = 0; i < resultados.size(); i++) {
            res[i] = resultados.get(i);
        }
        return res;
    }

    public boolean contiene(String valor) {
        for (int i = 0; i < cantidadValores; i++) {
            if (claves[i].equals(valor)) {
                return true;
            }
        }
        return false;
    }
}