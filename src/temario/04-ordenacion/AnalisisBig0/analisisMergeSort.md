| Paso / Componente           | Conteo aproximado                                            | Notación       |
|-----------------------------|--------------------------------------------------------------|----------------|
| **Inicialización**          | 1 operación + O(n) (reservar array auxiliar de tamaño n)     | O(n)           |
| **División recursiva**      | ≃ 2·n–1 llamadas recursivas (crea subproblemas de tamaño 1)  | O(n)           |
| **Fusión de subarreglos**   | ≃ n comparaciones y movimientos por nivel × log₂n niveles    | O(n log n)     |
| **Copia al array original** | ≃ n movimientos por nivel × log₂n niveles                   | O(n log n)     |
| **Espacio auxiliar**        | n elementos (array temporal)                                 | O(n)           |


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
