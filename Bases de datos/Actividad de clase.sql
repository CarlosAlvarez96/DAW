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

-- Ejercicio 4

