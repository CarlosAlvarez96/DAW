-- EJERCICIOS TEMA 4 BASE DE DATOS 

-- EJERCICIO 1 

	SELECT 5*10 , 5+10 , 10-5, 10/5;
	
-- EJERCICIO 2

	SELECT 5*10 "Multiplicacion", 5+10 "Suma", 10-5 "resta", 10/5 "División";

-- EJERCICIO 3

	SELECT nombre, apellido1,apellido2
	FROM asistente
	WHERE empresa = "BK Programación";

-- EJERCICIO 4
	SELECT *
	FROM sala
	ORDER BY capacidad DESC;

-- EJERCICIO 5

	SELECT *
	FROM asistente
	WHERE empresa = "BigSoft"
	ORDER BY fechaNac DESC;

-- EJERCICIO 6

	SELECT empresa, COUNT(*) "Total asistentes por cada empresa"
	FROM asistente
	GROUP BY empresa;

-- EJERCICIO 7
	
	SELECT nombre, apellido1, apellido2
	FROM asistente 
	ORDER BY apellido1 
	LIMIT 5;

-- EJERCICIO 8 

	SELECT tema, fecha
	FROM conferencia	
	WHERE turno = "T" AND sala = "Apolo" OR sala = "Zeus";

-- EJERCICIO 9

	SELECT *
	FROM asistente
	WHERE apellido1 LIKE "M%r%";

-- EJERCICIO 10

	SELECT *
	FROM conferencia
	WHERE precio BETWEEN 12 AND 19  AND tema != "Programacion Web";

-- EJERCICIO 11

	SELECT *, CONCAT(apellido1, " ", apellido2) "apellidos"
	FROM asistente
	WHERE fechaNac BETWEEN "1974/01/01" AND "1985/01/01" 
	ORDER BY fechaNac;

-- EJERCICIO 12

	SELECT *
	FROM conferencia
	WHERE tema LIKE "Programacio%"
	ORDER BY precio DESC;

-- EJERCICIO 13

	SELECT precio "Descuento 0%", precio*1.05 "Descuento 5%", precio*1.1 "Descuento 10%",
			precio*1.15 "Descuento 15%", precio*1.2 "Descuento 20%" 
	FROM conferencia;

-- EJERCICIO 14

	SELECT *, FLOOR(precio*1.05) precio_aumentado, DATE_FORMAT(fecha,'%d/%m/%Y') AS  fecha
	FROM conferencia
	ORDER BY precio_aumentado DESC;

-- EJERCICIO 15
 
	SELECT UPPER(codigo), UPPER(nombre), UPPER( CONCAT_WS(' ',apellido1, apellido2)) apellidos
	FROM ponente
	ORDER BY apellidos;

-- EJERCICIO 16

	SELECT UPPER(codigo), UPPER(nombre), UPPER( CONCAT_WS(' ',apellido1, NVL(apellido2,'*****')))apellidos 
	FROM ponente
	ORDER BY apellidos;

-- EJERCICIO 17
	
	SELECT UPPER(codigo), UPPER(nombre), UPPER( CONCAT_WS(' ',apellido1,NVL(apellido2,'*****')))apellidos,
	 RPAD(nombre,10,'*'), RPAD(apellido1,10,'*'), RPAD(NVL(apellido2,""),10,'*')
	FROM ponente
	ORDER BY apellidos;

-- EJERCICIO 18

	SELECT REPLACE(nombre,"José","Pepe") nombre_cambiado, CONCAT(apellido1,' ',apellido2),
	CHAR_LENGTH(nombre) + CHAR_LENGTH(apellido1) + CHAR_LENGTH(apellido2) longitud
	FROM asistente;

-- EJERCICIO 19

	SELECT nombre, apellido1, apellido2, DATEDIFF(NOW(),fechaNac) "Dias vividos"
	FROM asistente;

-- EJERCICIO 20

	SELECT nombre, CONCAT(apellido1, " ", apellido2) apellidos, DAYNAME(fechaNac) dia_nacimiento, 
	DAYOFYEAR(fechaNac) Dia_año, WEEKOFYEAR(fechaNac) Semana_año
	FROM asistente;

-- EJERCICIO 21
	
	SELECT COUNT(*) "Total salas"
	FROM sala
	WHERE capacidad >= 200;

-- EJERCICIO 22 

	SELECT  ROUND(AVG(gratificacion) ,2)"Media"
	FROM participar;

-- EJERCICIO 23

	SELECT  turno,COUNT(DISTINCT sala) distintas
	FROM conferencia
	GROUP BY turno;

-- EJERCICIO 24

	SELECT  turno,COUNT(DISTINCT sala) "Salas distintas"
	FROM conferencia
	WHERE sala !="Apolo"
	GROUP BY turno;

-- EJERCICIO 25

	SELECT  turno,COUNT(DISTINCT sala) "Salas distintas"
	FROM conferencia
	WHERE sala !="Apolo" AND turno="M"
	GROUP BY turno;

-- EJERCICIO 26

	SELECT  empresa, sexo, COUNT(*) total
	FROM asistente
	GROUP BY empresa, sexo;

-- EJERCICIO 27

	SELECT NVL(empresa,"Sin empresa asignada"),sexo, COUNT(*) total
	FROM asistente
	GROUP BY empresa, sexo;

-- EJERCICIO 28

	SELECT sexo, NVL(empresa,"Sin empresa asignada"),COUNT(*) total
	FROM asistente
	WHERE sexo ="H"
	GROUP BY empresa, sexo;

-- EJERCICIO 29

	SELECT nombre, referencia, tema
	FROM conferencia JOIN participar ON (conferencia.referencia = participar.refConferencia)
	JOIN ponente ON (participar.codPonente=ponente.codigo);

-- EJERCICIO 30

	SELECT asistente.nombre, CONCAT(asistente.apellido1," ",NVL(asistente.apellido2,"")) AS "apellidos"
	FROM asistente JOIN asistir ON (asistente.codigo = asistir.codAsistente)
	WHERE refConferencia="PWB1314";

-- EJERCICIO 31

	SELECT tema, COUNT(DISTINCT nombre) AS "nª Asistentes"
	FROM asistente JOIN asistir ON (asistente.codigo=asistir.codAsistente)
	JOIN conferencia ON (asistir.refConferencia=conferencia.referencia)
	GROUP BY tema;

-- EJERCICIO 32

	SELECT ponente.nombre, ponente.apellido1, ponente.apellido2, sala, tema, numOrden
	FROM ponente JOIN participar ON (ponente.codigo = participar.codPonente)
	JOIN conferencia ON (participar.refConferencia = conferencia.referencia)
	ORDER BY tema, numOrden;

-- EJERCICIO 33

	SELECT tema, sala, COUNT(*) AS TotalAsistentes
	FROM asistir JOIN conferencia ON (asistir.refConferencia = conferencia.referencia)
	GROUP BY tema, sala
	ORDER BY TotalAsistentes DESC;

	-- A partir de aqui estan mal

-- EJERCICIO 34

	SELECT DISTINCT nombre, apellido1, apellido2, conferencia.sala
	FROM ponente 
	JOIN participar ON (ponente.codigo = participar.codPonente)
	JOIN conferencia ON (participar.refConferencia = conferencia.referencia)
	WHERE sala="Afrodita";


-- EJERCICIO 35

	SELECT *
	FROM ponente
	WHERE apellido1= ALL (SELECT apellido1
				FROM asistente
				WHERE fechaNac=(SELECT MAX(fechaNac)
				FROM asistente));

-- EJERCICIO 36

	SELECT *
	FROM ponente
	WHERE codigo IN (SELECT codPonente
					FROM participar 
					WHERE refConferencia IN (SELECT referencia
											FROM conferencia
											WHERE sala="Afrodita"));

-- EJERCICIO 37

	SELECT *
	FROM asistente
	WHERE codigo IN (SELECT codAsistente
					FROM asistir JOIN conferencia ON (asistir.refConferencia=conferencia.referencia)
					WHERE tema="Programación Web")
					AND empresa="BigSoft";

-- EJERCICIO 38

	SELECT *
	FROM asistente
	WHERE sexo="H" AND fechaNac < "1985/01/01"
		AND codigo IN (SELECT codAsistente
					FROM asistir
					WHERE refConferencia IN (SELECT referencia
											FROM conferencia
											WHERE tema="Programación Web"));

-- EJERCICIO 39

	SELECT nombre,apellido1,apellido2,SUM(gratificacion) AS total
	FROM ponente JOIN participar ON (ponente.codigo=participar.codPonente)
	GROUP BY nombre,apellido1,apellido2;

-- EJERCICIO 40

	SELECT asistente.*,tema
	FROM asistente JOIN asistir ON (asistente.codigo=asistir.codAsistente)
					JOIN conferencia ON (asistir.refConferencia=conferencia.referencia)
	WHERE fecha="2013/10/02"
	ORDER BY tema,nombre,apellido1