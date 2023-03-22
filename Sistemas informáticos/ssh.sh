#!/bin/bash

#Autor: Carlos Álvarez
#Descripcion: Pide como parámetro una ip, si es válida manda el
#fichero datos.txt y lo envía al equipo remoto

# ----------- Declaración de variable ---------------

ip=`ping -c 1 $1 | tail -2 | head -1 | tr -s " " "|" | cut -d"|" -f4`


# ----------- Condicional --------------

if (( $ip == "0" ));
then
 echo "ip no válida"
 exit 1
fi

# ----------- Inicio Aplicación -----------


if [[ ! -f datos.txt ]];then
echo "No existe"
exit 2
fi

read -p "Introduzca el nombre del usuario: " user
read -p "Introduzca el puerto: " port
read -p "Introduzca la ruta del directorio: " ruta
scp -P $port datos.txt $user@$1:$ruta
