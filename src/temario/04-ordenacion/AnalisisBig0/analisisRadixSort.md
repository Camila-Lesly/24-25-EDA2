## Complejidad (Notación Big O)

| Caso           | Tiempo            | Espacio         |
|----------------|:-----------------:|:---------------:|
| Mejor caso     | O(d·(n + k))      | O(n + k)        |
| Promedio       | O(d·(n + k))      | O(n + k)        |
| Peor caso      | O(d·(n + k))      | O(n + k)        |

- _n_ = número de elementos  
- _d_ = número de dígitos del valor máximo  
- _k_ = rango de valores posibles por dígito (por ejemplo, 10 en decimal)  

---

## Ventajas, Desventajas y Casos de uso

| Ventajas                                                                                             | Desventajas                                                                                           | Casos de uso específicos                                              |
|------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------|
| - Puede alcanzar efectivamente O(n) cuando _d_ y _k_ son constantes pequeñas.                         | - No in-place: requiere espacio auxiliar O(n + k).                                                   | - Ordenamiento de grandes volúmenes de enteros con número fijo de dígitos. |
| - Estable: mantiene el orden relativo de valores iguales.                                             | - No maneja negativos sin preprocesamiento (offset).                                                 | - Procesamiento de logs, timestamps, códigos postales, identificadores.   |
| - Rendimiento predecible, no sufre casos patológicos como QuickSort.                                  | - Cada pasada (por dígito) añade overhead, útil sólo si _d_·_k_ ≪ n·log n.                             | - Sistemas de base de datos y colas de prioridad donde se conocen rangos. |
| - Fácil paralelización: cada pasada o cada grupo de dígitos puede procesarse en paralelo.            | - Rango de dígitos muy grande (_k_≫n) degrada tiempo y memoria.                                     | - Ordenamiento de valores binarios o hexadecimales en hardware especializado. |
| - Base de otros algoritmos (p. ej. Radix Sort LSD y MSD).                                             | - No generaliza bien a datos continuos sin discretizar a dígitos enteros.                            | - Filtrado y clasificación en procesamiento de flujos en tiempo real.      |
