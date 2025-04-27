| Paso / Componente            | Conteo aproximado                                                     | Notación           |
|------------------------------|-----------------------------------------------------------------------|--------------------|
| **Inicialización**           | 1 operación (cálculo de profundidad máxima `2·⌊log₂n⌋`, umbrales, variables de control) | O(1)               |
| **Quicksort recursivo**      | ≃ 2·n·log₂n comparaciones (≈2n por nivel × log₂n niveles)             | O(n·log n) promedio |
| **HeapSort (fallback)**      | ≤ n·log₂n comparaciones (heapify + extracciones al superar profundidad)  | O(n·log n) peor    |
| **Insertion Sort (pequeños)**| ≃ (t/2)·n comparaciones (ordenación de subarreglos ≤ t; t constante)     | O(n)               |
| **Espacio auxiliar**         | ≃ 2·log₂n niveles de recursión (stack de llamadas)                    | O(log n)           |


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
