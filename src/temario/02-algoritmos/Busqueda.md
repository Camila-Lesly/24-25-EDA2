## Ej.: una búsqueda

```java
static final int NO_ENCONTRADO = -1;

public int busquedaLineal(int[] array, int objetivo) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == objetivo)
          return i;
    }
    return NO_ENCONTRADO;
}

public int busquedaBinaria(int[] arrayOrdenado, int objetivo) {
    int inicio = 0;
    int fin = arrayOrdenado.length - 1;
    
    while (inicio <= fin) {
        int medio = (inicio + fin) / 2;
        if (arrayOrdenado[medio] == objetivo)
            return medio;
        if (arrayOrdenado[medio] < objetivo)
            inicio = medio + 1;
        else
            fin = medio - 1;
    }
    return NO_ENCONTRADO;
}
```

|Tamaño<br>*n*|Operaciones<br><small>busquedaLineal()</small>|Operaciones<br><small>busquedaBinaria()</small>|Tiempo*<br><small>busquedaLineal()|Tiempo*<br><small>busquedaBinaria()|¡La diferencia!|
|-:|-:|-:|-|-|-|
|1|1|1|0.000001 s|0.000001  s|=|
|10|10|3.32|0.00001 s|0.00000332 s|3x más rápido|
|100|100|6.64|0.0001 s|0.00000664 s|15x más rápido|
|1,000|1,000|9.97|0.001 s|0.00000997 s|100x más rápido|
|10,000|10,000|13.29|0.01 s|0.0000133 s|752x más rápido|

> *Asumiendo 1 microsegundo (0.000001 segundos) por operación*

Lo interesante aquí es notar que:

1. Para arrays pequeños (n=1) no hay diferencia significativa.
1. La diferencia se vuelve más dramática conforme crece n.
1. Para n=10,000, la búsqueda binaria es 752 veces más rápida.
1. Los números de O(log n) son log₂(n), ya que en cada paso dividimos por 2.

En el contexto de los algoritmos, la evaluación de la eficiencia se hace utilizando la notación Big O

### Notación Big O

Es una notación matemática que describe el **comportamiento límite superior de una función cuando el argumento tiende hacia un valor particular o infinito**.

En el contexto de los algoritmos, se utiliza para describir su complejidad temporal o espacial, es decir, cómo cambia el tiempo de ejecución o el espacio de memoria requerido con el tamaño de la entrada.

|Tamaño<br>n|O(n)|O(log n)|O(n) tiempo*|O(log n) tiempo*|¡La diferencia!|
|-:|-:|-:|-|-|-|
|1|1|0|0.000001 s|0 s|=|
|10|10|3.32|0.00001 s|0.00000332 s|3x más rápido|
|100|100|6.64|0.0001 s|0.00000664 s|15x más rápido|
|1,000|1,000|9.97|0.001 s|0.00000997 s|100x más rápido|
|10,000|10,000|13.29|0.01 s|0.0000133 s|752x más rápido|

> *Asumiendo 1 microsegundo (0.000001 segundos) por operación*
