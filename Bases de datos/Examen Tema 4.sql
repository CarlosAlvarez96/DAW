-- Carlos Álvarez Martín

-- Ejercicio 1

SELECT nombre, apellido1, apellido2
FROM asistente
WHERE sexo= 'H'  AND empresa='BigSoft' OR empresa='BK Programacion' AND fechaNac BETWEEN '1970/01/01' AND '1990/12/31'
ORDER BY fechaNac DESC; 

-- Ejercicio 2

SELECT CONCAT_WS(' ',nombre,apellido1,apellido2) nombreApellidos, DATE_FORMAT(fechaNac,"%d/%m/%Y"), empresa
FROM asistente
WHERE nombre LIKE '_a%' 
ORDER BY fechaNac DESC;

-- Ejercicio 3
SELECT idPonente,CONCAT_WS(' ',nombre,apellido1,apellido2) nombreApellidos,  especialidad
FROM ponente
ORDER BY apellido1 DESC
LIMIT 5;

-- Ejercicio 4

SELECT idPonente AS 'id', nombre, apellido1
FROM ponente JOIN asistente ON(id = asiste.idAsistente)
ORDER BY apellido1 ASC;

-- Ejercicio 5

SELECT DISTINCT tema, ROUND(precio+precio*1.05,2), DATE_FORMAT(fecha,"%d/%m/%Y"),nombreSala ,capacidad
FROM conferencia 
	JOIN sala ON(capacidad = sala.capacidad)
	JOIN sala ON(conferencia.nombreSala = sala.nombreSala)
WHERE turno='T'
ORDER BY fecha ASC;

-- Ejercicio 6


-- Ejercicio 7


-- Ejercicio 8


-- Ejercicio 9

SELECT tema
FROM conferencia
WHERE fechaNac=ALL (SELECT fechaNac
FROM asistente
WHERE fechaNac=(SELECT MAX(fechaNac)
FROM asistente))
ORDER BY tema ASC;

-- Ejercicio 10
