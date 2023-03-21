# Repositorio-DAW
//Listar el archivo de configuración de git
```bash
git config -l
```

//Establecer un nombre de usuario de git
```bash
git config --global user.name nombreUser
```
//Establecer un correo de git
```bash
git config --global user.email nombre@correo.es
```
//Establecer un editor de codigo como predeterminado
```bash
git config --global core.editor "code --wait"
```
```bash
git config --global -e 
```
//Configurar git para windows para evitar problemas con los saltos de línea al hacer merge
```bash
git config --global core.autocrlf true 
```
//Ir a la ruta del archivo que quiero añadir a git
```bash
cd DirectorioComiteable/
```
//Inicializar un repositorio
```bash
git init
```
//Añadir todo al staging area
```bash
git add . (todo)
```
//Añadir archivo al staging area
```bash
git add nombreArchivo
```
//Añadir todos los archivos con una extensión
```bash
git add*.extensión
```
//Mostrar el estado de mis archivos
```bash
git status -s(Para verlo de forma detallada)
```
//Nuevo commit con nombre
```bash
git commmit -m "nombre commit"
```
//Eliminar archivo
```bash
git rm nombreArchivo.extensión
```
//Restaurar archivo
```bash
git restore nombreArchivo.extensión
```
//Renombrar archivo
```bash
git add nombreArchivo.extensión NuevoNombre.extensión 
```
//Renombrar archivo y añadir al staging area
```bash
git mv nombreArchivo.extensión NuevoNombre.extensión 
```
//Muestra el historial de los commit
```bash
git log --oneline 
´´´
// Clonar un repositorio remoto
```bash
git clone url-del-repositorio
```
// Ver la lista de ramas en el repositorio
```bash
git branch
```
// Cambiar a una rama existente
```bash
git checkout nombre-de-la-rama
```
// Crear y cambiar a una nueva rama
```bash
git checkout -b nombre-de-la-rama
```
// Fusionar una rama en la rama actual
```bash
git merge nombre-de-la-rama
```
// Descargar cambios del repositorio remoto y fusionarlos con la rama actual
```bash
git pull origin nombre-de-la-rama
```
// Enviar cambios locales al repositorio remoto
```bash
git push origin nombre-de-la-rama
```
// Ver los cambios realizados en los archivos del repositorio desde el último commit
```bash
git diff
```
// Descartar cambios locales en un archivo
```bash
git checkout nombre-del-archivo
```
// Ver los cambios realizados en un archivo desde el último commit
```bash
git diff nombre-del-archivo
```
// Ver la lista de repositorios remotos
```bash
git remote -v
```
// Eliminar un repositorio remoto
```bash
git remote rm nombre-del-repositorio-remoto
```
