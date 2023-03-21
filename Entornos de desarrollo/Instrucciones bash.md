## Explicación en PDF 
Se clona el repositorio sobre el que vamos a trabajar
```Bash
git clone https://github.com/clase-daw/test.git
```
Nos ubicamos dentro de la carpeta del repositorio
```Bash
cd test/
```
Con git fetch --all descargamos los cambios de las ramas
```Bash
git fetch --all
```
Ver las ramas(local, en blanco)
```bash
git branch 
```
Ver las ramas(remoto, en rojo)
```bash
git branch -r
```
Nos vamos a la rama de nuestro grupo
```Bash
git checkout funcion_camara_fondo
```
Nos ubicamos en la carpeta del juego
```Bash
cd JuegoNaves_Framework
```
```Bash
git fetch --all
```
Nos traemos el codigo de la rama principal del desarrollo a nuestra carpeta local
```Bash
git pull origin develop
```
Ahora hacemos los cambios pertinentes en el código
Con git status -s comprobamos los cambios
```Bash
git status -s
```
Añadimos los cambios al staging área
```Bash
git add .
```
ver el historial de commit y las ramas de colorines:
```bash
git log --all --decorate --graph --color
```
Hacemos el commit con un mensaje que indica el cambio realizado 
```Bash
git commit -m "[Mensaje del commit]"
```
Hacemos un pull del contenido de nuestra rama para evitar problemas al hacer subir los cambios
```Bash
git pull origin [nombre rama]
```
Ahora realizamos un push para que actualice los cambios en nuestra rama
```Bash
git push origin [nombre rama]
```
Dentro del repositorio en el github deberia salir un un boton para hacer un pull request, el merge se realiza a la rama develop con base develop. 

![texto](H:/Mi unidad/2)


Despues el resto de miembres deberian aprobar el pull request.
