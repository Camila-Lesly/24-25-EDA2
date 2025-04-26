## Complejidad (Notación Big O)

| Caso           | Tiempo      | Espacio     |
|----------------|:-----------:|:-----------:|
| **Mejor caso** | O(n log n)  | O(log n)    |
| **Promedio**   | O(n log n)  | O(log n)    |
| **Peor caso**  | O(n log n)  | O(log n)    |

> El espacio adicional corresponde al stack de recursión de QuickSort/HeapSort (profundidad O(log n)).  

---

## Ventajas, Desventajas y Casos de uso

| Ventajas                                                                                                  | Desventajas                                                                                              | Casos de uso específicos                                                |
|-----------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------|
| - Garantiza O(n log n) en todos los casos combinando QuickSort y HeapSort.                                 | - Implementación más compleja que un único algoritmo.                                                    | - Bibliotecas de ordenamiento genérico (`std::sort`, `Arrays.sort`).      |
| - Rendimiento promedio cercano al de QuickSort gracias al pivote y particionamiento inicial.               | - Overhead de introspección (cálculo de profundidad, cambios de algoritmo).                              | - Sistemas que procesan datos con distribuciones desconocidas o adversas. |
| - Se adapta a tamaños pequeños usando Insertion Sort (mejor localidad de caché y menores constantes).     | - No es estable (no preserva orden de elementos iguales).                                               | - Entornos donde la robustez y predictibilidad son críticas (bases de datos, sistemas en tiempo real). |
| - Robusto frente a ataques que fuerzan el peor caso de QuickSort (detecta y cambia a HeapSort).           | - Requiere recursión y varios umbrales/tamaños a sintonizar (p. ej. 16 para Insertion).                   | - Lenguajes/plataformas donde se busca un único “sort” óptimo en la práctica. |
| - Balance óptimo entre complejidad teórica y rendimiento práctico en hardware moderno.                   | - Ligera penalización de constante oculta frente a QuickSort puro en datos “bien comportados”.           | - Aplicaciones críticas donde el peor caso de O(n²) no es aceptable.       |
