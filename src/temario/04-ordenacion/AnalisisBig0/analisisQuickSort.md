## Complejidad (Notación Big O)

| Caso           | Tiempo       | Espacio     |
|----------------|:------------:|:-----------:|
| Mejor caso     | O(n log n)   | O(log n)    |
| Promedio       | O(n log n)   | O(log n)    |
| Peor caso      | O(n²)        | O(log n)    |

- El espacio adicional O(log n) corresponde al stack de llamadas recursivas.

---

## Ventajas, Desventajas y Casos de uso

| Ventajas                                                                                           | Desventajas                                                                                         | Casos de uso específicos                                           |
|----------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------|
| - En promedio muy rápido: O(n log n) con constantes pequeñas.                                       | - Peor caso O(n²) cuando el pivote es siempre extremo (lista ya ordenada o inversa).               | - Ordenamiento general en memoria, cuando los datos no son adversos. |
| - In-place: requiere solo O(log n) espacio adicional.                                               | - No estable (cambia el orden relativo de elementos iguales).                                       | - Sistemas con restricciones de espacio, donde O(log n) es aceptable. |
| - Divide y vencerás: funcionamiento claro y fácil de implementar.                                   | - Puede degradarse si no se elige bien el pivote.                                                   | - Lenguajes y bibliotecas estándar (p. ej. `Arrays.sort` en Java). |
| - Buen uso de caché y localidad de referencia en la mayoría de los casos.                          | - Recursión profunda en listas muy grandes sin optimización (puede causar stack overflow).         | - Aplicaciones donde el peor caso se mitiga con aleatorización o pivote medio. |
| - Variantes (pivote aleatorio, mediana de tres) reducen la probabilidad de casos patológicos.      |                                                                                                     | - Cuando se necesita un algoritmo “todoterreno” y se aplican mejoras en la selección de pivote. |
