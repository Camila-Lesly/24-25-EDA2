| Paso / Componente       | Conteo aproximado            | Notación   |
|-------------------------|------------------------------|------------|
| **Inicialización**      | k operaciones (inicializar array de conteo) | O(k)       |
| **Conteo de frecuencias** | n operaciones (recorrer array de entrada)   | O(n)       |
| **Cálculo de prefijos** | k operaciones (sumas acumulativas)          | O(k)       |
| **Distribución**        | n operaciones (colocar en array de salida)  | O(n)       |
| **Copiar al original**  | n operaciones (si se copia de salida)       | O(n)       |
| **Espacio auxiliar**    | n + k elementos (output + count)            | O(n + k)   |


## 🔍 Análisis de Counting Sort

|  **Ventajas**                                                                                      | **Desventajas**                                                                                 |  **Casos de uso específicos**                                                     |
|------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| - **O(n + k)**: lineal si k no supera mucho a n.                                                     | - Usa **O(n + k)** espacio auxiliar (count + output).                                            | - Cuando k (alcance de valores) es pequeño/moderado respecto a n.                   |
| - **Estable**: preserva el orden relativo de elementos iguales.                                      | - No es in-place: requiere arreglos adicionales.                                                 | - Ordenar calificaciones, conteo de frecuencias o histrogramas.                     |
| - No depende de comparaciones: muy rápido en escenarios adecuados.                                   | - Si k ≫ n, el coste en tiempo y memoria crece innecesariamente.                                 | - Procesamiento de grandes lotes de enteros pequeños (p. ej. rangos 0–255).        |
| - Sencillo de implementar y depurar.                                                                 | - No maneja valores negativos sin transformación o desplazamiento previo del rango.               | - Aplicaciones de filtrado/counting en imágenes (valores de píxel 0–255).          |
| - Base de otros algoritmos no comparativos (Radix Sort).                                             | - No generalizable a datos continuos sin discretizar o mapear a índices enteros.                 | - Escenarios en los que la estabilidad es clave (p. ej. orden por nivel o bucket). |
