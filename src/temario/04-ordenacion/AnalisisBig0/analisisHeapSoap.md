## Complejidad (Notación Big O)

| Caso           | Tiempo      | Espacio  |
|----------------|:-----------:|:--------:|
| Mejor caso     | O(n log n)  | O(1)     |
| Promedio       | O(n log n)  | O(1)     |
| Peor caso      | O(n log n)  | O(1)     |

---

## Ventajas, Desventajas y Casos de uso

| Ventajas                                                                 | Desventajas                                                            | Casos de uso específicos                                                         |
|--------------------------------------------------------------------------|------------------------------------------------------------------------|----------------------------------------------------------------------------------|
| - Rendimiento garantizado O(n log n) en todos los casos                  | - No es estable (cambia el orden relativo de elementos iguales)        | - Sistemas de tiempo real donde importa el peor caso                            |
| - In-place: no requiere memoria auxiliar adicional                       | - Operaciones de sifteo (“heapify”) y swaps frecuentes                 | - Entornos con memoria limitada                                                  |
| - Basado en estructura de montículo, útil también como cola de prioridad | - Localidad de memoria pobre (accesos saltarinos)                      | - Cuando se necesita extraer repetidamente el máximo/mínimo (sorting + PQ off-line) |
| - No depende de recursión profunda                                        | - Rendimiento medio un poco más lento que QuickSort en datos aleatorios | - Situaciones que exijan un comportamiento predecible sin picos de tiempo       |

---

> **Nota:**  
> - Heap Sort construye primero un montículo máximo (o mínimo) en O(n), luego extrae elementos en O(n log n) mediante sucesivos “heapify”.  
> - Al ser in-place y con límite superior estricto, es una buena elección en sistemas donde los recursos y la consistencia de rendimiento son críticos.