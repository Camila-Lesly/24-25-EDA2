# Categorías principales de Big O

Big O|Nombre|Descripción|Ejemplo
-|-|-|-
**O(1)** | constante | **El mejor.** El algoritmo siempre toma la misma cantidad de tiempo, independientemente de la cantidad de datos. |Buscar un elemento de un array por su índice.
**O(log n)** | logarítmico | **Muy bueno.** Este tipo de algoritmos reduce a la mitad la cantidad de datos en cada iteración. Si tienes 100 elementos, toma alrededor de 7 pasos encontrar la respuesta. Con 1,000 elementos, toma 10 pasos. Y 1,000,000 de elementos solo toman 20 pasos. Esto es súper rápido incluso para grandes cantidades de datos.|Búsqueda binaria.
**O(n)** | lineal | **Bueno.** Si tienes 100 elementos, esto hace 100 unidades de trabajo. Doblar la cantidad de elementos hace que el algoritmo tome exactamente el doble de tiempo (200 unidades de trabajo).|Búsqueda secuencial.
**O(n log n)** | "linealítmico" | **Decente.** Esto es ligeramente peor que lineal pero no demasiado malo.|Los algoritmos de ordenación de propósito general más rápidos.
**O(n²)** | cuadrático | **Un poco lento.** Si tienes 100 elementos, esto hace 100^2 = 10,000 unidades de trabajo. Doblar la cantidad de elementos lo hace cuatro veces más lento (porque 2 al cuadrado es igual a 4).|Algoritmos que usan bucles anidados, como el ordenamiento por inserción.
**O(n³)** | cúbico | **Rendimiento pobre.** Si tienes 100 elementos, esto hace 100^3 = 1,000,000 unidades de trabajo. Doblar el tamaño de entrada lo hace ocho veces más lento.|Multiplicación de matrices.
**O(2^n)** | exponencial | **Rendimiento muy pobre.** Quieres evitar este tipo de algoritmos, pero a veces no tienes opción. Agregar solo un bit a la entrada duplica el tiempo de ejecución.|Problema del vendedor viajero.
**O(n!)** | factorial | **Intolerablemente lento.** Literalmente toma millones de años hacer cualquier cosa.|Generar todas las permutaciones|
