## Radix Sort

| Paso / Componente               | Conteo aproximado                | Notación            |
|---------------------------------|----------------------------------|---------------------|
| **Inicialización de contador**  | k operaciones por dígito         | O(k) por dígito     |
| **Conteo de frecuencias**       | n operaciones por dígito         | O(n) por dígito     |
| **Cálculo de prefijos**         | k operaciones por dígito         | O(k) por dígito     |
| **Redistribución de elementos** | n operaciones por dígito         | O(n) por dígito     |
| **Número de pasadas**           | d pasadas                        | Multiplica O(d)     |
| **Total**                       | d·(n + k) operaciones            | O(d·(n + k))        |
| **Espacio auxiliar**            | n + k elementos                  | O(n + k)            |

> _n_ = número de elementos, _d_ = dígitos, _k_ = rango de valores por dígito.


## Ventajas, Desventajas y Casos de uso

| Ventajas                                                                                             | Desventajas                                                                                           | Casos de uso específicos                                              |
|------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------|
| - Puede alcanzar efectivamente O(n) cuando _d_ y _k_ son constantes pequeñas.                         | - No in-place: requiere espacio auxiliar O(n + k).                                                   | - Ordenamiento de grandes volúmenes de enteros con número fijo de dígitos. |
| - Estable: mantiene el orden relativo de valores iguales.                                             | - No maneja negativos sin preprocesamiento (offset).                                                 | - Procesamiento de logs, timestamps, códigos postales, identificadores.   |
| - Rendimiento predecible, no sufre casos patológicos como QuickSort.                                  | - Cada pasada (por dígito) añade overhead, útil sólo si _d_·_k_ ≪ n·log n.                             | - Sistemas de base de datos y colas de prioridad donde se conocen rangos. |
| - Fácil paralelización: cada pasada o cada grupo de dígitos puede procesarse en paralelo.            | - Rango de dígitos muy grande (_k_≫n) degrada tiempo y memoria.                                     | - Ordenamiento de valores binarios o hexadecimales en hardware especializado. |
| - Base de otros algoritmos (p. ej. Radix Sort LSD y MSD).                                             | - No generaliza bien a datos continuos sin discretizar a dígitos enteros.                            | - Filtrado y clasificación en procesamiento de flujos en tiempo real.      |
