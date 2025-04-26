## Complejidad (Notación Big O)

| Caso            | Tiempo | Espacio |
|-----------------|:------:|:-------:|
| **Mejor caso**     | O(n)   | O(1)    |
| **Caso promedio**  | O(n²)  | O(1)    |
| **Peor caso**      | O(n²)  | O(1)    |

---

## Ventajas, Desventajas y Casos específicos de uso

| Ventajas                                                                                         | Desventajas                                                              | Casos específicos de uso                                                                 |
|--------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| - Muy sencillo de entender e implementar.<br>- In-place (sin memoria auxiliar).<br>- Detecta pronto si ya está ordenado (flag).<br>- Estable (preserva orden relativo de iguales). | - Muy ineficiente en listas grandes (O(n²)).<br>- Intercambios frecuentes (costoso si swap es caro).<br>- No aprovecha divide-y-vencerás ni paralelismo. | - Listas muy pequeñas (p. ej. < 30 elementos).<br>- Listas ya casi ordenadas (casi O(n)).<br>- Sistemas con recursos muy limitados y datos sencillos.<br>- Introducción y enseñanza de algoritmos de ordenamiento. |