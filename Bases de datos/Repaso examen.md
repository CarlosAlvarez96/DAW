# **TEMA 4 BASES DE DATOS**  

 El **DML** (Lenguaje de manipulacion de datos) está orientado a las Consultas y al manejo de los datos. Tiene **4 sentencias: SELECT, INSERT, DELETE** y **UPDATE**.
 Para definir las estructuras donde agrupar información se usará la sentencia **SELECT**.

 La cláusula **SELECT** es esencial en una consulta de SQL, ya que especifica las columnas o expresiones que se desean mostrar en los resultados de la consulta. 
 - La cláusula SELECT se utiliza para indicar las columnas que se desean mostrar en la tabla de resultados de la consulta.
- Se pueden seleccionar nombres de columnas, constantes, expresiones o funciones SQL.
- Es posible nombrar las columnas anteponiendo el nombre de la tabla de la que proceden, utilizar el comodín asterisco para seleccionar todas las columnas de una tabla, poner alias a los nombres de las columnas y escribir la consulta en una o varias líneas.
- Los modificadores ALL, DISTINCT y DISTINCTROW se utilizan para indicar si se deben incluir o no filas repetidas en el resultado de la consulta.
- La opción por defecto es ALL y DISTINCT elimina las filas repetidas en el resultado de la consulta.
- DISTINCTROW es un sinónimo de DISTINCT.

 La cláusula **FROM** es opcional, pero se utiliza para indicar las tablas de las que se extraen los datos. 
 - En la sentencia SELECT se indica de dónde se obtienen las columnas que se van a seleccionar.
- Se usa la cláusula FROM para definir los nombres de las tablas de las que proceden las columnas.
- Las consultas multitabla se explican en otro punto.
- Se pueden asociar alias a las tablas para abreviar, y no es necesario encerrarlos entre comillas. Los alias se pueden utilizar para hacer referencia a la tabla en otras cláusulas.

 La cláusula **WHERE** también es opcional, pero se utiliza para filtrar los resultados de la consulta en función de una condición específica. 
- La cláusula WHERE se utiliza para especificar una condición que deben cumplir los registros para ser seleccionados.
- Las condiciones se denominan predicados y pueden ser más o menos complejos.
- Se pueden diferenciar cinco tipos de condiciones: comparación de valores o expresiones, rango de valores, conjunto de valores, comparación de cadenas con patrones y valores NULL.
- Los operandos utilizados en las condiciones pueden ser nombres de columnas, constantes o expresiones.
- Los operadores que se pueden usar en las condiciones pueden ser aritméticos, de comparación, lógicos, etc.

 Las cláusulas **GROUP BY** y **HAVING** se utilizan para agrupar filas cuando hay columnas o valores calculados en común. 
- La cláusula GROUP BY se usa para agrupar filas con los mismos valores.
- Se puede usar junto con HAVING para establecer condiciones en los resultados agrupados.
- No se puede usar WHERE con la columna agrupada por GROUP BY, se debe hacer con HAVING.
- SQL permite agrupar totales mediante GROUP BY.
- Las funciones de agregado se utilizan dentro de una cláusula SELECT para obtener un único valor aplicable a un grupo de registros.
- La consulta devuelve un solo registro con los resultados totales.
 
 La cláusula **ORDER BY** se utiliza para ordenar los resultados de la consulta según un criterio específico. 
 - La cláusula ORDER BY se utiliza para especificar el criterio de ordenación de la respuesta a una consulta. Para ordenar por apellidos en orden ascendente la consulta sería así:
```SQL
SELECT nombre, apellido1, apellido2
FROM asistente
WHERE sexo = 'Hombre'
ORDER BY apellido1 ASC, apellido2 ASC;
```
 En este caso, se utiliza ASC para especificar el orden ascendente de los apellidos. También se podría haber utilizado DESC para ordenar en orden descendente. Es importante tener en cuenta que si no se especifica el tipo de ordenación, por defecto será ascendente. Además, se puede ordenar por más de una columna, como se muestra en el ejemplo.

 La cláusula **LIMIT** se utiliza para limitar el número de filas que se muestran en los resultados de la consulta.
 La cláusula LIMIT en una consulta SELECT permite limitar la cantidad de registros que se retornan. Se pueden pasar uno o dos argumentos numéricos enteros positivos: el primer argumento indica el número del primer registro a retornar y el segundo argumento indica el número máximo de registros a retornar. El número del registro inicial es 0. Si el segundo argumento es mayor que la cantidad de registros de la tabla, se limita hasta el último registro.

## **Resumido**     


Cláusula SELECT:

* Usada para consultar datos de una o varias tablas de una base de datos.
* La sintaxis básica es: SELECT columna1, columna2, ... FROM tabla WHERE condicion;
* puede ser utilizado para seleccionar todas las columnas.
* La cláusula DISTINCT se usa para eliminar duplicados de la consulta.

Cláusula WHERE:

* Usada para filtrar los resultados de una consulta.
* La sintaxis básica es: SELECT columna1, columna2, ... FROM tabla WHERE condicion;
* Se pueden utilizar operadores lógicos como AND y OR.
* También se pueden utilizar operadores de comparación como =, <, >, <=, >= y <>.
* La cláusula IN se usa para especificar varios valores posibles.
* La cláusula LIKE se usa para buscar patrones.

Cláusula ORDER BY:

* Usada para especificar el criterio de ordenación de la respuesta a una consulta.
* La sintaxis básica es: SELECT columna1, columna2, ... FROM tabla ORDER BY columna1 [ASC | DESC], ..., columnaN [ASC | DESC];
* ASC es utilizado para ordenar en orden ascendente, mientras que DESC se usa para ordenar en orden descendente.

Cláusula GROUP BY:

* Usada para agrupar los resultados de una consulta por una o más columnas.
* La sintaxis básica es: SELECT columna1, columna2, ... FROM tabla GROUP BY columna1, columna2, ...;
* Permite realizar operaciones de agregación como SUM, COUNT, AVG, entre otras, en los datos agrupados.
* Se pueden utilizar cláusulas adicionales como HAVING para filtrar los resultados de la consulta después de la agrupación

Cláusula LIMIT:

* Usada para limitar los registros que se retornan en una consulta SELECT.
* La sintaxis básica es: SELECT columna1, columna2, ... FROM tabla LIMIT offset, cantidad;
offset indica el número del primer registro a retornar.
cantidad indica el número máximo de registros a retornar. Si se supera la cantidad de registros de la tabla, se limita hasta el último registro.

 Un ejemplo de ésta sintaxis quedaría asi: 
 ```SQL
    SELECT columna_1, columna_2, columna_3
    FROM tabla_1, tabla_2
    WHERE condicion_1 = 'valor' AND condicion_2 < 10
    GROUP BY columna_1
    HAVING COUNT(columna_2) > 5
    ORDER BY columna_3 DESC
    LIMIT 10;
 ```
 
 El **resultado** de una **consulta** siempre será una **tabla** de datos.

 Si se incluye la cláusula **DISTINCT** después de SELECT, **se suprimirán** aquellas resultado que tengan igual valor que otras (**filas duplicadas**).



 Consultas simples sobre una tabla.

 Consultas sobre el contenido de varias tablas mediante composiciones internas.

 Consultas sobre el contenido de varias tablas mediante composiciones externas.

 Consultas resumen.

 Consultas con subconsultas.