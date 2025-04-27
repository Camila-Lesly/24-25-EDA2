| Paso / Componente     | Conteo aproximado    | Notación |
|-----------------------|----------------------|----------|
| **Inicialización**    | 1 operación          | O(1)     |
| **Comparaciones**     | ≃ n(n–1)/2           | O(n²)    |
| **Swaps (peor caso)** | ≃ n(n–1)/2           | O(n²)    |
| **Bucle exterior**    | n–1 ≃ n              | O(n)     |
| **Chequeo “flag”**    | ≤ n comparaciones    | O(n)     |
| **Espacio auxiliar**  | Variables temporales y flag | O(1) |


---

## Ventajas, Desventajas y Casos específicos de uso

| Ventajas                                                                                         | Desventajas                                                              | Casos específicos de uso                                                                 |
|--------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
| - Muy sencillo de entender e implementar.<br>- In-place (sin memoria auxiliar).<br>- Detecta pronto si ya está ordenado (flag).<br>- Estable (preserva orden relativo de iguales). | - Muy ineficiente en listas grandes (O(n²)).<br>- Intercambios frecuentes (costoso si swap es caro).<br>- No aprovecha divide-y-vencerás ni paralelismo. | - Listas muy pequeñas (p. ej. < 30 elementos).<br>- Listas ya casi ordenadas (casi O(n)).<br>- Sistemas con recursos muy limitados y datos sencillos.<br>- Introducción y enseñanza de algoritmos de ordenamiento. |