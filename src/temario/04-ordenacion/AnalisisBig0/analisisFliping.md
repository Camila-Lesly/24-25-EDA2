## Pancake Sort (Flipping)

### Complejidad (Notación Big O)

| Caso            | Tiempo   | Espacio |
|-----------------|:--------:|:-------:|
| **Mejor caso**  | O(n)     | O(1)    |
| **Promedio**    | O(n²)    | O(1)    |
| **Peor caso**   | O(n²)    | O(1)    |

> Utiliza únicamente operaciones de “flip” (reversión de prefijos) y trabaja in-place.

---

### Ventajas, Desventajas y Casos de uso

| Ventajas                                                         | Desventajas                                                        | Casos de uso específicos                                      |
|------------------------------------------------------------------|--------------------------------------------------------------------|----------------------------------------------------------------|
| - Solo opera con reversión de subarreglos (flip).<br>- In-place: no requiere almacenamiento auxiliar. | - Tiempo cuadrático en la práctica (muchas operaciones de flip).<br>- No es estable (cambia orden relativo de iguales). | - Escenarios didácticos: enseñar técnicas de ordenamiento.<br>- Robótica: ordenar elementos con herramientas de volteo.<br>- Juegos y puzzles basados en “pancakes”. |
| - Conceptualmente simple: mueve el mayor al final en cada iteración. | - Gran número de flips: cada elemento puede requerir dos flips por colocación. | - Algoritmos de demostración de límite inferior de comparativos. |
| - Espacio constante: ideal cuando la memoria es crítica.        | - Muy ineficiente para conjuntos grandes comparado con O(n log n).  | - Contextos donde sólo se dispone de operación de reversión.  |

> **Nota:**  
> - Un “flip” invierte el prefijo del arreglo hasta una posición dada.  
> - Aunque rara vez usado en producción, Pancake Sort es útil para ilustrar el poder de técnicas in-place y operaciones primitivas de reversión.