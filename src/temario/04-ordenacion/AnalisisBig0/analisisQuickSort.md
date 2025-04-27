| Paso / Componente              | Conteo aproximado                                               | Notación                        |
|--------------------------------|-----------------------------------------------------------------|---------------------------------|
| **Inicialización**             | 1 operación (selección de pivote, variables auxiliares)        | O(1)                            |
| **Comparaciones (partición)**  | ≃ n comparaciones × log₂n niveles = n·log₂n                     | O(n log n) avg; O(n²) worst     |
| **Swaps (partición)**          | ≃ n swaps × log₂n niveles = n·log₂n                             | O(n log n) avg; O(n²) worst     |
| **Llamadas recursivas**        | ≃ 2 T(n/2) → ≈ log₂n niveles de llamadas                        | O(n) overhead                   |
| **Espacio auxiliar**           | Profundidad de pila ≈ log₂n llamadas simultáneas                | O(log n)                        |


## Ventajas, Desventajas y Casos de uso

| Ventajas                                                                                           | Desventajas                                                                                         | Casos de uso específicos                                           |
|----------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------|
| - En promedio muy rápido: O(n log n) con constantes pequeñas.                                       | - Peor caso O(n²) cuando el pivote es siempre extremo (lista ya ordenada o inversa).               | - Ordenamiento general en memoria, cuando los datos no son adversos. |
| - In-place: requiere solo O(log n) espacio adicional.                                               | - No estable (cambia el orden relativo de elementos iguales).                                       | - Sistemas con restricciones de espacio, donde O(log n) es aceptable. |
| - Divide y vencerás: funcionamiento claro y fácil de implementar.                                   | - Puede degradarse si no se elige bien el pivote.                                                   | - Lenguajes y bibliotecas estándar (p. ej. `Arrays.sort` en Java). |
| - Buen uso de caché y localidad de referencia en la mayoría de los casos.                          | - Recursión profunda en listas muy grandes sin optimización (puede causar stack overflow).         | - Aplicaciones donde el peor caso se mitiga con aleatorización o pivote medio. |
| - Variantes (pivote aleatorio, mediana de tres) reducen la probabilidad de casos patológicos.      |                                                                                                     | - Cuando se necesita un algoritmo “todoterreno” y se aplican mejoras en la selección de pivote. |
