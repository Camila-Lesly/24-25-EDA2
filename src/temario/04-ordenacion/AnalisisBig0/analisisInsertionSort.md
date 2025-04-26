## Complejidad Big O de algoritmos de ordenación no comparativos

| Algoritmo        | Mejor caso  | Caso promedio | Peor caso  |
|------------------|:-----------:|:-------------:|:----------:|
| **Counting Sort**| O(n + k)    | O(n + k)      | O(n + k)   |
| **Radix Sort**   | O(d·(n + b))| O(d·(n + b))  | O(d·(n + b))|
| **Bucket Sort**  | O(n + k)    | O(n + k)      | O(n²)      |

- _n_ = número de elementos  
- _k_ = rango de valores (Counting/​Bucket)  
- _d_ = dígitos o pases (Radix)  
- _b_ = base o número de cubetas (Radix/​Bucket)  


## ¿Qué?

Los algoritmos de ordenación no comparativos utilizan técnicas como el conteo, la distribución o la manipulación de dígitos para colocar cada elemento en su posición final sin comparar A con B. Los más destacados son:

- **Counting Sort**  
- **Radix Sort**  
- **Bucket Sort**  

Bajo condiciones apropiadas, pueden alcanzar complejidades lineales **O(n)**, rompiendo la barrera de los comparativos.

## ¿Para qué?

1. Superar límites teóricos de los comparativos (log n).  
2. Ordenar enteros en rangos acotados de forma muy eficiente.  
3. Reducir operaciones costosas de comparación.  
4. Garantizar estabilidad (Counting y Radix).  
5. Facilitar paralelización (Bucket, Radix).

Aplicaciones típicas: bases de datos, procesamiento en tiempo real, big data, procesamiento de imágenes, simulaciones científicas.

## ¿Cómo?

A continuación, un resumen comparativo en Markdown:

| Algoritmo        | Complejidad      | Ventajas                                                                                 | Desventajas                                                                                 | Casos de uso específicos                                       |
|------------------|------------------|------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|----------------------------------------------------------------|
| **Counting Sort**| O(n + k)         | • Lineal si k≈O(n) <br> • Estable <br> • Muy rápido <br> • Sencillo                     | • Espacio O(n + k) <br> • No in-place <br> • Ineficiente si k≫n <br> • Negativos requieren ajuste | • Rangos pequeños (p.ej. 0–255) <br> • Histogramas de imágenes <br> • Conteo de frecuencias |
| **Radix Sort**   | O(d·(n + b))     | • Lineal si d,y b constantes <br> • Estable <br> • Sin comparaciones directas            | • Depende de d y b <br> • No in-place                                                          | • Enteros/cadenas de longitud fija <br> • Ordenamiento multiatributo |
| **Bucket Sort**  | O(n + k) promedio <br> O(n²) peor | • Muy eficiente si distribución uniforme <br> • Maneja continuos <br> • Paralelizable           | • Peor caso O(n²) si todo en una cubeta <br> • Espacio O(n + k) <br> • k crítico             | • Datos uniformemente distribuidos <br> • Flotantes en [0,1) <br> • Sistemas distribuidos |
