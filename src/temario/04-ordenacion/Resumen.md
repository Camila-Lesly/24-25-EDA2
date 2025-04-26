## Conceptos base

| Concepto     | Descripción                                                                 | Ejemplos                                            |
|--------------|-----------------------------------------------------------------------------|-----------------------------------------------------|
| **In-place** | Modifica el array original sin usar espacio extra significativo (O(1)).     | Bubble, Selection, Insertion, Quick, Heap, Intro    |
| **Estable**  | Mantiene el orden relativo de elementos iguales.                            | Bubble, Insertion, Merge, Counting, Radix           |
| **Externa**  | Diseñados para ordenar bloques que no caben enteros en memoria.             | Merge (streaming, archivos), variantes de Radix MSD |
| **Híbrida**  | Combinan varios algoritmos según tamaño o profundidad de recursión.         | IntroSort                                           |

### Tipos de algoritmos

| Basados en comparación | No basados en comparación              |
|------------------------|----------------------------------------|
| Comparan elementos     | Aprovechan propiedades de rango, dígitos o distribución |
| Ejemplos: Bubble, Quick, Merge, Heap, Insertion, Selection, Intro  | Ejemplos: Counting, Radix, Bucket       |

### Resumen de algoritmos y uso recomendado

| Algoritmo         | Tipo             | Estable | In-place | Interna/Externa/Híbrida | Cuándo usarlo                                |
|-------------------|------------------|:-------:|:--------:|:-----------------------:|----------------------------------------------|
| Bubble Sort       | Comparativo      | Sí      | Sí       | Interna                 | _n_ muy pequeño (<30), prototipos rápidos    |
| Selection Sort    | Comparativo      | No      | Sí       | Interna                 | Minimizar swaps cuando swap es caro          |
| Insertion Sort    | Comparativo      | Sí      | Sí       | Interna                 | _n_ pequeño (<100) o casi ordenado           |
| Merge Sort        | Comparativo      | Sí      | No       | Interna / Externa       | _n_ grande, estable, ordenación externa      |
| Quick Sort        | Comparativo      | No      | Sí       | Interna                 | Uso general en memoria, datos aleatorios     |
| Heap Sort         | Comparativo      | No      | Sí       | Interna                 | Predictible O(n log n), memoria limitada     |
| Intro Sort        | Híbrido          | No      | Sí       | Interna / Híbrida       | Biblioteca “todoterreno”: rápido y robusto   |
| Counting Sort     | No comparativo   | Sí      | No       | Interna                 | Enteros rango pequeño (0–k), estable         |
| Radix Sort        | No comparativo   | Sí      | No       | Interna / Externa (MSD) | Dígitos fijos, grandes volúmenes, estable    |
| Bucket Sort       | No comparativo   | Depende | No       | Interna                 | Datos uniformes, flotantes [0,1), paralelizable |

> **Leyenda**  
> - _n_: número de elementos  
> - _k_: rango de claves (Counting/Bucket)  
> - _d_: número de dígitos (Radix)  
