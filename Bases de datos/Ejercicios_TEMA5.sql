-- 1. Insertar un nuevo fabricante (por ejemplo, Apple) indicando su id y su nombre.
INSERT INTO fabricante (id, nombre)
VALUES ('10', 'Apple')
-- 2. Insertar dos nuevos fabricantes (por ejemplo, MSI y TP-Link) indicando solamente su nombre haciendo uso
-- de una única sentencia SQL.


-- 3. Insertar un nuevo producto (ver algún producto del fabricante en cuestión) asociado a uno de los nuevos
-- fabricantes. La sentencia de inserción debe incluir: id, nombre, precio e id_fabricante.


-- 4. Insertar dos nuevos productos (ver productos del fabricante en cuestión) asociado a uno de los nuevos
-- fabricantes. La sentencia de inserción debe ser única e incluir: nombre, precio e id_fabricante.


-- 5. Crear una nueva tabla con el nombre fabricante_productos que tenga las siguientes columnas:
-- nombre_fabricante, nombre_producto y precio. 
-- Una vez creada la tabla insertar todos los registros de la BD
-- “tienda” en esta tabla haciendo uso de una única operación de inserción.


-- 6. Crear una vista con el nombre vista_fabricante_productos que tenga las siguientes columnas:
-- nombre_fabricante, nombre_producto y precio.


-- 7. Eliminar el fabricante Xiaomi. ¿Es posible eliminarlo? Si no fuese posible, ¿qué cambios se deberían realizar
-- para que fuese posible borrarlo?


-- 8. Eliminar el fabricante Asus. ¿Es posible eliminarlo? Si no fuese posible, ¿qué cambios se deberían realizar para
-- que fuese posible borrarlo?


-- 9. Actualizar el código del fabricante Huawei y asignarle el valor 30. ¿Es posible actualizarlo? Si no fuese posible,
-- ¿qué cambios se deberían realizar para que fuese posible actualizarlo?


-- 10. Actualizar el código del fabricante Lenovo y asignarle el valor 20. ¿Es posible actualizarlo? Si no fuese posible,
-- ¿qué cambios se deberían realizar para que fuese posible actualizarlo?


-- 11. Actualizar el precio de todos los productos sumándole 5 € al precio actual.


-- 12. Eliminar todas las impresoras que tienen un precio menor de 200 €.


-- 13. Incrementar en un 5% el precio de los productos que pertenecen a los fabricantes en los que el nombre en su
-- segundo carácter tiene una “e”.


-- 14. Añadir un “*” al final del nombre del fabricante para aquellos en los que el precio medio de sus productos sea
-- superior a 200.


-- 15. Eliminar todos los fabricantes que no tienen productos asignados.


-- 16. Insertar un nuevo socio con los siguientes datos:
-- Núm. Socio: 1007
-- Nombre: Francisco
-- Apellido 1: Sánchez
-- Domicilio: Avda. de las Palmeras, 2
-- Población: Armilla
-- Fecha de nacimiento: 02/02/1970
-- NOTA: el resto de campos no deben ser introducidos.


-- 17. Registrar el primer alquiler del socio 1007 que se lleva la copia 105 (correspondiente a la película "Lo
-- imposible") en la fecha actual (en la que se está haciendo la tarea).


-- 18. Modificar el estado de la copia de la película con id 101 a "ESTROPEADA" incluyendo como observación
-- "Rayado".


-- 19. Eliminar la película cuyo título es "El Orfanato".
-- Utilizando sentencias SQL, realizar las siguientes operaciones:


-- 20. Insertar una nueva película (inventando los datos) y después dar de alta dos copias para dicha película con el
-- estado "FUNCIONA".


-- 21. Actualizar todas las películas que tengan como género "Animación" y reemplazarlo por "Dibujos".


-- 22. Eliminar aquellos socios cuya última película alquilada sea anterior al 1 de diciembre de 2014.


-- 23. Incrementar en 20 céntimos el precio del alquiler a todas las películas que tengan más de dos copias.


-- 24. Eliminar todas las copias de las películas que contengan la palabra "FROZEN" y que su estado sea
-- "ESTROPEADA".


-- 25. (** Difícil - Opcional) Actualizar el precio de alquiler de aquellas películas cuyo número total de alquileres (de
-- todas sus copias) sea inferior a la media de los alquileres de todas las películas. El precio debe reducirse en
-- un 50% de su precio original.


-- 26. (*** Difícil - Opcional) Insertar en la tabla socio_vip todos los datos del socio que más número de alquileres
-- tenga en el último trimestre del año 2014 insertando en el campo trim_anyo_vip el valor "TRIM4_2014".

