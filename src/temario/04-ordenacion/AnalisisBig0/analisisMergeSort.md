## Complejidad (Notación Big O)

| Caso           | Tiempo      | Espacio     |
|----------------|:-----------:|:-----------:|
| Mejor caso     | O(n log n)  | O(n)        |
| Promedio       | O(n log n)  | O(n)        |
| Peor caso      | O(n log n)  | O(n)        |

- _n_ = número de elementos  
- El espacio adicional O(n) corresponde a los arreglos temporales empleados en la fusión.

---

## Ventajas, Desventajas y Casos de uso

| Ventajas                                                                                     | Desventajas                                                                                       | Casos de uso específicos                                           |
|----------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|--------------------------------------------------------------------|
| • Complejidad garantizada O(n log n) en todos los casos                                      | • Requiere espacio auxiliar O(n)                                                                  | • Sistemas de archivos y bases de datos (ordenamiento externo)     |
| • Estable: preserva el orden relativo de elementos iguales                                   | • Sobrecarga de constante oculta en la copia/fusión de subarreglos                                | • Listas vinculadas (se fusiona sin índice aleatorio)             |
| • Excelente localidad de acceso en lectura secuencial                                        | • Menor rendimiento en arreglos muy pequeños vs. Insertion Sort                                   | • Entornos donde la estabilidad es imprescindible                 |
| • Se adapta bien a paralelización (fusiones independientes)                                  | • Implementación recursiva puede agotar stack si no se optimiza                                   | • Procesamiento de flujos y pipelines de datos streaming          |
| • Divide y vencerás: código claro y modular                                                  | • Más complejo de implementar que algoritmos simples                                             | • Casos en que se desea combinar múltiples sublistas ordenadas    |
