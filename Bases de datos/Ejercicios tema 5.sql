-- Carlos Álvarez Martín 
-- Ejercicios tema 5

-- Ejercicio 1

INSERT INTO fabricante VALUES(10,”Apple”);


-- Ejercicio 2

INSERT INTO fabricante(nombre) VALUES ("MSI"),("TP-Link");


-- Ejercicio 3

INSERT INTO product(id,nombre,precio,id_fabricante) VALUES(12,”Cepillo”,10.00,1);


-- Ejercicio 4

INSERT INTO producto(nombre,precio,id_fabricante) VALUES('Recogedor',10.00,1),('Sartén',25.00,6);


-- Ejercicio 5

CREATE TABLE fabricante_productos(
	nombre_fabricante VARCHAR(30),
	nombre_producto  VARCHAR(50),
	precio DECIMAL(5,2)
);
INSERT INTO fabricante_producto SELECT fabricante.nombre, product.nombre, precio
				   FROM fabricante JOIN producto ON (fabricante.id=producto.id);


-- Ejercicio 6

CREATE VIEW vista_fabricante_productos AS SELECT *
					        FROM fabricante_productos;


-- Ejercicio 7

DELETE FROM fabricante WHERE nombre=’Xiaomi’;


-- Ejercicio 8

DELETE FROM fabricante WHERE nombre=’Asus’;
No se puede, para ello tendría que ser con las siguientes sentencias
DELETE FROM producto WHERE id_fabricante=1;
DELETE FROM fabricante WHERE nombre=’Asus’;


-- Ejercicio 9

UPDATE fabricante SET id=30 WHERE nombre=’Huawei’;


-- Ejercicio 10

UPDATE fabricante SET id=20 WHERE nombre=’Lenovo’;


-- Ejercicio 11

UPDATE product SET precio=precio+5;


-- Ejercicio 12

DELETE FROM producto
WHERE nombre LIKE "Impresora%" AND precio < 200;

-- Ejercicio 13

UPDATE producto
SET precio = precio * 1.05
WHERE id_fabricante IN (SELECT id
			FROM fabricante
			WHERE nombre LIKE "_e%");

-- Ejercicio 14

UPDATE fabricante
SET nombre = CONCAT(nombre, "*")
WHERE id IN (SELECT id_fabricante
	     FROM prodcut
	     GROUP BY id_fabricante
	     HAVING AVG(precio) > 200)

-- Ejercicio 15

DELETE FROM fabricante
WHERE id NOT IN (SELECT id_fabricante
		 FROM producto);

-- Ejercicio 16

INSERT INTO socio (num_socio, nombre, apellido1, domicilio, poblacion, fec_nac)
VALUES (1007, "Francisco, "Sánchez", "Avda de las palmeras, 2", "Armilla", "1970/02/02");

-- Ejercicio 17

INSERT INTO alquiler (copia_pel, socio, fec_alquika)
VALUES(105,1007,CURDATE());

-- Ejercicio 18

UPDATE copia_pelicula
SET estado="ESTROPEADA", observacion="Rayado"
WHERE id_copia=101;

-- Ejercicio 19

DELETE FROM pelicula
WHERE titulo="El Orfanato";

-- Ejercicio 20



-- Ejercicio 21

UPDATE pelicula
SET genero="Dibujos"
WHERE genero="Animacion";

-- Ejercicio 22

DELETE FROM socio
WHERE num_socio IN (SELECT socio
		    FROM alquiler
		    WHERE fec_alquila < "2014-12-01" AND fec_devolucion IS NOT NULL);

-- Ejercicio 23

UPDATE pelicula
SET precio_alquiler = precio_alquiler + 0.20
WHERE codigo IN (SELECT pelicula
		 FROM pelicula
		 GROUP BY pelicula
		 HAVING COUNT(*) >= 2
);

-- Ejercicio 24

DELETE FROM copia_pelicula
WHERE estado = "ESTROPEADA"
AND pelicula IN (SELECT codigo
		 FROM pelicula
		 WHERE titulo LIKE "%FROZEN%");


