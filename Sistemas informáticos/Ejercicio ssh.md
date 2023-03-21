1. Instalar SSH con:

```bash
sudo apt-get instal openssh-server
```

Luego ponemos el puerto descomentando "#port 22" y asignandole un puerto 1XXX que queramos en el archivo de configuración
"/etc/ssh/sshd_config" con:

```bash
sudo nano /etc/ssh/sshd_config
```

2. Crear un usuario en el servidor llamado "userssh" con contraseña "toor" que tenga la consola /bin/bash y su directorio de trabajo se /home/user

```bash
sudo useradd -md /home/user -s /bin/bash -p toor userssh
```
si ponemos echo$? y devuelve 0 es que está creado
Para verlo:
```bash
cat /etc/passwd/ | grep "userssh"
```
//En el examen pedira como compruebo si soy el root?:
// if [[ `whoami`!= "root" ]];then
// > echo "no soy el root"
// > echo "soy el root"
// > fi
// no soy el root 

3. Añadir configuración al archivo de configuración /etc/ssh/sshd_config

- Se abre con:

```bash
sudo nano /etc/ssh/sshd_config
```
- Al final añadimos un comentario con # ----------- CONFIGURACIÓN ACCESO A SSH ------------ 
- Debajo añadimos:
	AllowUsers userssh
- Guardamos

4. Vamos a reiniciar el servicio

- Comprobamos el servicio con:

```bash
systemctl status sshd.service
```

- Lo reiniciamos con:
```bash
systemctl restart sshd.service
```
- Ahora desde el cliente intentamos conectarnos al ssh:
```bash
connecto to host userssh@[ip.servidor] port 1XXX
```
Y le ponemos la contraseña port

5. Cambiar puerto al 1492

```bash

```

6. Permitir acceso al usuario "userssh" por ssh

```bash

```

7. Probar desde un cliente el acceso




//Con el comando scp copiamos una ssh

//Para enviar del cliente al servidor
```bash
scp -P [puerto] [ficheros_a_enviar]user@ip:[carpeta]----> del servidor
```
//Para enviar del servidor al cliente
```bash
scp -P [puerto] user@ip:[carpeta/ficheros] /rutaCliente --------->
```

Crear un script que le pase como parámetro una dirección ip. Si la dirección ip existe(ping)
copiará un fichero llamado datos.txt del equipo cliente al equipo remoto. Si el fichero 
datos.txt no existe mostrará mensaje de error y no hará nada.

=============================================================================================

#! /bin/bash

#--------------Declaración de variable----------------

read -p "Introduzca una dirección ip" ip
hacerPing "ping $ip"


if (( $hacerPing | grep "ms$" ))
then 
  if [ ! -e /tmp/archivo.txt ]; then
   echo "El archivo no existe"
  else
   cp /home/usuarioCliente/datos.txt /home/usuarioServidor  
  fi
fi


