## Complejidad (Notación Big O)

| Caso               | Tiempo      | Espacio      |
|--------------------|:-----------:|:------------:|
| **Mejor caso**     | O(n + k)    | O(n + k)     |
| **Caso promedio**  | O(n + k)    | O(n + k)     |
| **Peor caso**      | O(n²)       | O(n + k)     |

> Donde _n_ es el número de elementos y _k_ el número de cubetas.

---

## Análisis de Bucket Sort

| Ventajas                                                                                  | Desventajas                                                                                       | Casos de uso específicos                                                                                 |
|---------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|
| - O(n + k) en promedio: muy eficiente si los datos siguen distribución uniforme.           | - Peor caso O(n²) si todos los elementos caen en la misma cubeta.                                      | - Datos continuos uniformes (p.ej. floats en [0,1)).                                                        |
| - Maneja valores continuos sin necesidad de discretización previa.                         | - Requiere espacio adicional para las cubetas: O(n + k).                                               | - Grandes volúmenes donde la distribución es conocida y uniforme.                                           |
| - Facilita la paralelización: cada cubeta se ordena de forma independiente.               | - Elección de _k_ (número de cubetas) crítica: mal dimensionamiento degrada eficiencia.               | - Sistemas multiprocesador o distribuido que puedan ordenarlas en paralelo.                                 |
| - Estabilidad condicional (depende del algoritmo en cada cubeta).                           | - Sobrecarga de inicialización y concatenación de cubetas para _n_ muy pequeño.                       | - Procesamiento de métricas estadísticas, simulaciones científicas e imágenes digitales con rango definido. |
| - Flexible: permite ajustar estrategias de particionamiento según datos.                   | - Collections.sort (u otro) en cada cubeta añade coste adicional.                                      | - Contextos donde Counting Sort no aplica por datos no discretos, pero se conoce rango y distribución.      |