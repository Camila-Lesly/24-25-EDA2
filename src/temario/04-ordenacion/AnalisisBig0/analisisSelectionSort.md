| Paso / Componente         | Conteo aproximado                           | Notación |
|---------------------------|---------------------------------------------|----------|
| **Inicialización**        | 1 operación (variables i, j, minIndex)      | O(1)     |
| **Bucle exterior**        | n–1 iteraciones                             | O(n)     |
| **Bucle interior**        | ∑ᵢ₌₀ⁿ⁻² (n–1–i) = n(n–1)/2 comparaciones    | O(n²)    |
| **Selección del mínimo**  | Incluida en las comparaciones               | O(n²)    |
| **Intercambios**          | ≤ n–1 swaps                                 | O(n)     |
| **Espacio auxiliar**      | Variables temporales (swap)                 | O(1)     |


## Ventajas, Desventajas y Casos de uso

| Ventajas                                                                                 | Desventajas                                                                   | Casos de uso específicos                                              |
|------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|------------------------------------------------------------------------|
| - Realiza sólo n – 1 intercambios en total                                             | - Tiempo quadrático en todos los casos (O(n²)), muy lento para n grande      | - Listas muy pequeñas (p. ej. n < 30)                                   |
| - In-place, sin espacio auxiliar adicional (O(1))                                      | - No estable: puede cambiar el orden relativo de elementos iguales           | - Cuando el coste de swap es mucho mayor que el de comparación          |
| - Determinista: número fijo de comparaciones y swaps                                     | - No aprovecha datos parcialmente ordenados (no mejora en mejor caso)        | - Sistemas con memoria extremadamente limitada                         |
| - Muy fácil de entender e implementar                                                   | - Peor uso de caché y localidad de referencia                                | - Contextos educativos y de demostración de algoritmos                 |
