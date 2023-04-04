codigo_oficina, ciudad, pais, region, codigo_postal, telefono, linea_direccion1, linea_direccion2

-- Ejercicio 1

INSERT INTO jardineria(codigo_oficina, ciudad, pais, region, codigo_postal, telefono, linea_direccion1, linea_direccion2)
VALUES("GRA-ES", "Granada", "España", "Andalucía", 18100, +32 958321222, "Calle Huelva,28", "3B derecha")

-- Ejercicio 2

INSERT INTO empleado(id_empleado,nombre,apellido1,apellido2,extension,email,codigo_oficina,id_jefe,puesto)
VALUES(99,"Carlos","Álvarez", "Martín", 3333, "carlos@jardineria.es","GRA-ES",3,"Representante de ventas");

-- Ejercicio 3

INSERT INTO cliente(id_cliente, nombre_cliente, nombre_contacto, apellido_contacto, telefono, fax,linea_direccion1,linea_direccion2,ciudad,region,pais,codigo_postal,id_empleado_rep_ventas,limite_credito)
VALUES(33, "Modas Paqui", "Paqui", "Martínez", "+34 958324567","3472834792", "Calle Alcázar, 32", "Calle Mesones, 32", "Granada", "Andalucía", "España", 18100, 99, 32239.00)

-- Ejercicio 14
INSERT INTO oficina VALUES ('MAL-ES', 'Málaga', 'España', 'Andalucía', '29012', '+34 959236621', 'Calle Fígaro, 136', NULL);
INSERT INTO empleado VALUES (33, 'Lionel', 'Messi', 'Cuccitini', '1000', 'LeoMessi@gmail.com', 'MAL-ES',NULL, 'Representante de ventas'),
(34, 'Luis', 'Suarez', 'Martín', '1000', 'LuisSuarez@gmail.com', 'MAL-ES',33, 'Representante de ventas'),
(35, 'Neymar', 'JR', 'Dos santos', '1000', 'NJRDS@gmail.com', 'MAL-ES',33, 'Representante de ventas');

-- 15. Inserta tres clientes que tengan como representantes de ventas los empleados que se han
-- creado en el ejercicio anterior.

INSERT INTO cliente VALUES 
('C001', 'Juan', 'García', 'Pérez', 'jgarcia@gmail.com', 'Calle Alameda, 45', 'Málaga', 'España', 'Andalucía', '29010', '+34 951236587', '33'),
('C002', 'María', 'Fernández', 'González', 'mfernandez@gmail.com', 'Calle Larios, 32', 'Málaga', 'España', 'Andalucía', '29005', '+34 951236589', '34'),
('C003', 'Pedro', 'Ruiz', 'Sánchez', 'pruiz@gmail.com', 'Avenida Andalucía, 67', 'Málaga', 'España', 'Andalucía', '29017', '+34 951236590', '35');




