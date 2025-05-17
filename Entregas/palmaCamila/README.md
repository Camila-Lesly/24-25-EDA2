# Reto: Inmutabilidad del Acta de Notas usando Hash

## Objetivo

Garantizar que el acta de notas sea un dato inmutable utilizando un sistema de verificación mediante hash. Cualquier intento de modificación debe ser detectado de forma automática.

## Reglas del sistema

### 1. Identificación del alumno

Cada alumno posee un identificador único e inmutable (`student_id`). Este identificador se asocia con sus calificaciones, que se componen de:

- Evaluación continua
- Evaluación del profesor
- Examen parcial
- Examen final

### 2. Cálculo del promedio y del hash

El promedio final se calcula a partir de las tres notas anteriores. Luego, se genera un hash a partir de los siguientes datos concatenados:


Este hash actúa como firma de verificación de la integridad del acta.

### 3. Verificación del acta

Se manejan dos códigos:

- `codigo_almacenado`: contiene el hash generado originalmente, junto con información como el grado y su abreviatura. Ejemplo: `GII2B8238493`
- `codigo_actual`: es el código generado nuevamente a partir de los datos actuales del acta.

Se debe cumplir la siguiente condición:


### 4. Propósito del hash

- Asegura que las notas de los alumnos no puedan ser modificadas una vez registradas.
- Permite verificar de forma segura la autenticidad e integridad de las actas.
- El cálculo del hash debe ser determinístico: si los datos no cambian, el hash debe permanecer idéntico.

### 5. Validación automática

Cada vez que se quiera consultar o usar el acta, el sistema recalcula el hash con los datos actuales. Si este nuevo hash no coincide con el almacenado originalmente, se deberá generar una alerta indicando que el acta ha sido alterada.

# Solución con Hash y Blockchain

## ¿Cómo funciona?

El sistema está compuesto por una cadena de bloques (blockchain), donde cada bloque contiene la información académica de un estudiante. Cada bloque incluye:

- Identificador único del estudiante (`studentId`)
- Calificaciones individuales: evaluación continua, evaluación del profesor, examen parcial y examen final
- Promedio final calculado automáticamente
- Un hash generado a partir de los datos anteriores
- El hash del bloque anterior
- Un sello de tiempo (timestamp)

Esta cadena de bloques se comporta como un libro de registros seguro. Cada vez que se agrega un nuevo estudiante, se crea un nuevo bloque que enlaza con el bloque anterior, formando así una cadena. La seguridad del sistema se basa en el cálculo del hash: si algún dato del bloque cambia, el hash resultante también cambia, lo cual rompe la consistencia de la cadena.

## Principios clave del sistema

- **Inmutabilidad**: una vez que un bloque ha sido creado, cualquier modificación en los datos rompe la cadena, permitiendo detectar alteraciones.
- **Verificabilidad**: en cualquier momento, el sistema puede recorrer la cadena y verificar que los hashes coinciden. Si no coinciden, se genera una alerta de integridad.
- **Determinismo**: el algoritmo de hash garantiza que, si los datos no han cambiado, el resultado del hash será siempre el mismo.
- **Trazabilidad**: al estar encadenados, los bloques conservan un historial de integridad desde el primer registro hasta el más reciente.

## Aplicaciones

Este sistema es ideal para instituciones educativas que deseen almacenar las calificaciones de manera confiable, evitando manipulaciones posteriores. También puede adaptarse a otros contextos donde se requiera asegurar la integridad de datos secuenciales y críticos.

## Verificación automática

Antes de consultar o utilizar un acta, el sistema recalcula el hash con los datos actuales del estudiante. Luego compara este valor con el hash original almacenado en el bloque. Si los valores no coinciden, el sistema detecta que el acta ha sido modificada e informa del problema.

