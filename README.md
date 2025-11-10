# Documentación paso a paso del taller BD FeriaInternacional

Aprendiz: Valery Sinaí Trujillo Quintero.

N° Ficha: 3145555

## Parte 1
 Preparar la estructura del proyecto para Docker

#### Objetivo
Tener correctamente organizada la carpeta del proyecto con todos los archivos necesarios para levantar los contenedores de tus bases de datos (MongoDB, MySQL, PostgreSQL, SQL Server) usando Docker y Docker Compose.

### 1. Verficamos la estructura

-La carpeta principal es llamada feria-docker lo cual dentro de ella tenemos esta estructura 

![alt text](image-2.png)

¿Por qué es importante tener estructurada esta carpeta?
Porque Docker necesita estas rutas para montar volúmenes y ejecutar scripts automáticamente cuando se crean los contenedores.

### 2. ¿Qué contiene docker-compose.yml?
Este archivo define todos los contenedores y volumes. Ejemplo básico explicado:

![alt text](image-13.png)

![alt text](image-14.png)

## Explicacion del archivo docker-compose.yml

### Encabezado del archivo

![alt text](image-49.png)

   • version: indica la versión del formato de Docker Compose que se está usando.

   • '3.8' es una versión moderna compatible con Docker Engine 19.03 o superior.

   • Define la sintaxis y las capacidades disponibles para declarar servicios, redes y volúmenes.

### Sección principal

![alt text](image-50.png)

   • services: es la sección donde se definen todos los contenedores que Docker Compose va a crear.

   • Cada servicio representará un contenedor individual, como postgres, mysql, mongo, o sqlserver.

### Servicio 1: PostgreSQL
  
![alt text](image-51.png)

   • Nombre del servicio. Puedes usarlo como hostname en conexiones internas dentro del mismo docker-compose (por ejemplo: host=postgres).

   ![alt text](image-52.png)

   • Usa la imagen oficial de PostgreSQL versión 15 desde Docker Hub.

   ![alt text](image-53.png)

   • Asigna un nombre personalizado al contenedor, en este caso feria_postgres.

   ![alt text](image-54.png)

   • Indica que el contenedor se reiniciará automáticamente si se detiene, falla o cuando Docker se reinicie.

   ![alt text](image-55.png)

   • environment: define variables de entorno dentro del contenedor.

     • POSTGRES_USER: crea el usuario principal (admin).

     • POSTGRES_PASSWORD: define su contraseña.

     • POSTGRES_DB: crea automáticamente una base de datos inicial llamada mydb.

     
   ![alt text](image-56.png)

   • Expone el puerto 5432 del contenedor al puerto 5432 del host (tu computadora).

    • Así puedes conectarte con herramientas externas (pgAdmin, DBeaver, etc.) usando localhost:5432.

   ![alt text](image-57.png) 

   • volumen persistente:

     • Mapea la carpeta local ./data/postgres (en tu PC) con la carpeta del contenedor /var/lib/postgresql/data.

     • Así los datos se guardan incluso si el contenedor se elimina.  

### Servicio 2: MySQL

   ![alt text](image-58.png)

   • Nombre del servicio MySQL.

   ![alt text](image-59.png)

   • Usa la imagen oficial de MySQL versión 8.

   ![alt text](image-60.png)

   • Nombra el contenedor como feria_mysql.

   ![alt text](image-61.png) 

   • Igual que antes: reinicio automático.

   ![alt text](image-62.png)

   • Variables de entorno para inicializar MySQL:

    MYSQL_ROOT_PASSWORD: contraseña del usuario root.

    MYSQL_DATABASE: crea una base de datos inicial llamada mydb.

    MYSQL_USER: crea un usuario llamado user.

    MYSQL_PASSWORD: contraseña del usuario user.

   ![alt text](image-63.png)

   • Expone el puerto estándar de MySQL 3306 al mismo puerto local.

   ![alt text](image-64.png)

   • Guarda los datos de MySQL en la carpeta local ./data/mysql.

### Servicio 3: MongoDB

   ![alt text](image-65.png)

   • Nombre del servicio MongoDB.

   ![alt text](image-66.png)

   • Usa la imagen oficial de MongoDB versión 6.

   ![alt text](image-67.png)

   • Nombra el contenedor feria_mongo.

   ![alt text](image-68.png) 

   • Se reiniciará automáticamente si se detiene.

   ![alt text](image-69.png)

   • Variables para crear un usuario administrador inicial (root / root123).

   ![alt text](image-70.png)

   • Expone el puerto estándar de MongoDB 27017 al host.

   ![alt text](image-71.png)

   • Guarda los datos persistentes en ./data/mongo (en tu máquina).

### Servicio 4: SQL Server   

  ![alt text](image-72.png)

  • Nombre del servicio para Microsoft SQL Server.

  ![alt text](image-73.png)

  • Usa la imagen oficial de Microsoft SQL Server versión 2022.

  ![alt text](image-74.png)

  • Nombra el contenedor feria_mssql.

  ![alt text](image-75.png)

  • Se reinicia automáticamente.

  ![alt text](image-76.png)

  • Variables necesarias para que SQL Server funcione:

    SA_PASSWORD: contraseña del usuario administrador sa (debe cumplir con reglas de complejidad).

    ACCEPT_EULA: acepta el contrato de licencia (obligatorio).

  ![alt text](image-77.png) 

  • Expone el puerto 1433, usado por defecto por SQL Server.

  ![alt text](image-78.png)

  • Guarda los datos persistentes en la carpeta ./data/mssql.


## Docker (con los 4 motores)

#### 1. Navegamos la carpeta del proyecto feria-docker

![alt text](image-20.png)

Con este comando lo cual debe aparecer como en la imagen 

> cd C:\Users\Valery\Desktop\feria-docker

#### 2. Levantamos los 4 contenedores con Docker Compose con este codigo

> docker-compose up -d

Este comando va poder:

- Descargar las imágenes si no las tienes
- Crear la red `feria-docker_default`
- Crear los 4 contenedores (postgres, mysql, mongo, sqlserver)
 Esperamos que termine la descarga para que despues nos aparezca esto en la terminal
Deberías ver algo como:

![alt text](image-21.png)

#### 3. Verificamos los 4 contenedores que esten corriendo

![alt text](image-22.png)

#### 4. Por ultimo vamos a las aplicación de Docker y verificamos que los contenedores se vean y esten en funcionamiento.

![alt text](image-23.png)

![alt text](image-24.png)

### Crear contenedor de ubuntu
> docker run -it --name ubuntu ubuntu

### Entrar al contenedor
> docker exec -it ubuntu bash
## Sql server
## Entrar como super usuario
> sudo su

### Instalar herramientas necesarias
>apt update
apt install -y wget gnupg software-properties-common apt-transport-https

Instalamos ubuntu en la terminal con este comando: 
![alt text](image-5.png)

![alt text](image-12.png)

Conectar la BD a los containers

• Posgrest

 > PASO 1: Verificar la ruta del archivo

 ![alt text](image-25.png)

 Al momento de ponerlo en la terminal debe aparecer esto:

 ![alt text](image-26.png)

> PASO 2: Ejecutar el script en PostgreSQL

![alt text](image-27.png)

En la terminal se ve así:

![alt text](image-28.png)

![alt text](image-29.png)

![alt text](image-30.png)

> PASO 3: Verificar que se creó la base de datos

Nos conectamos a PostgreSQL:

![alt text](image-31.png)

En la terminal se ve así:

![alt text](image-32.png)

Una vez dentro de ella, verificamos las tablas:
![alt text](image-34.png)

Ver los schemas:

![alt text](image-33.png)

Y así seguimos haciendo con cada una de nuestras BD de los 4 motores para que pueda funcionar.


# Parte 2
## Ubuntu

### Paso 1: Verificamos la instalación de Docker Desktop 

Desde la terminal ponemos el comando:

![alt text](image-35.png)

En mi terminal aparecio esto

![alt text](image-36.png)

Si Docker está correctamente instalado, mostrará información del servidor y los contenedores activos que tiene:

![alt text](image-37.png)

En mi terminal aparecio esto lo que podemos decir que ya está completamente instalado

### Paso 2: Habilitamos la integración con WSL (Ubuntu)

  1. Abrimos Docker Desktop y en la parte de configuración( lo podemos ver arriba en el lado derecho) y la deamos click

![alt text](image-38.png)

  2. Vamos a la parte donde dice Settings → Resources → WSL Integration

![alt text](image-39.png)

  3. Activamos la casilla correspondiente a tu distribución de Ubuntu

Pulsar Apply & Restart

![alt text](image-40.png)

### Paso 3: Verificamos la conexión desde Ubuntu

![alt text](image-41.png)

la conexión fue exitosa, vemos la información similar a la obtenida en Windows (contenedores, imágenes, versión, etc.)

### Paso 4: Listar los contenedores activos

Para ver todos los contenedores en ejecución desde Ubuntu:

docker ps
 Colocamos este comando y en la terminal se ve así:

![alt text](image-42.png)

### Paso 5: Entramos a un contenedor desde Ubuntu

![alt text](image-43.png)

Luego nos conectamos al cliente de MySQL:

![alt text](image-44.png)

Aquí nos pide una contraseña.

![alt text](image-45.png)

Colocamos la contraseña que le asignamos en el archivo  docker-compose.yml que es:

![alt text](image-47.png)

### Paso 6: Salimos del contenedor

![alt text](image-48.png)

# Parte 3 
### Levantar bases de datos con Docker dentro de Ubuntu (WSL)

#### Paso 1: Instalamos WSL + Ubuntu en caso de que no lo tengamos

Ejecutamos esto en PowerShell como Administrador (Windows):

![alt text](image-79.png)

Luego abrimos la app de Ubuntu desde el menú Inicio y crea tu usuario (te pedirá nombre y contraseña).

#### Paso 2: Abrimos el Ubuntu (WSL) y actualizamos paquetes

Abrimos Ubuntu y ejecutamos este comando:

![alt text](image-80.png)

#### Paso 3: Instalamos dependencias para Docker

Utilizamo este comando:

![alt text](image-81.png)

#### Paso 4: Añadimos la llave GPG y repositorio oficial de Docker

######  Creamos la carpeta para llaves con este comando:

![alt text](image-82.png)

##### Descargamos la llave GPG oficial de Docker con este comando:

![alt text](image-83.png)

##### Agregamos el repositorio de Docker (estable) on este comando:

![alt text](image-84.png)

#### Paso 5: Instalamos el docker Engine y Docker Compose plugin

![alt text](image-85.png)

#### Paso 6: Verificamos la instalación

![alt text](image-86.png)

#### Paso 7: Permitimos usar Docker sin sudo (opcional y conveniente)

![alt text](image-87.png)

Despues de esto cierramos la ventana de Ubuntu y vuélvela a abrir (o reinicia sesión) para que el cambio surta efecto

#### Paso 8: Creamos la carpeta del proyecto y pegar el docker-compose.yml

![alt text](image-88.png)

Mi archivo docker-compose.yml (ejemplo ya provisto) debe contener los servicios: postgres, mysql, mongo, sqlserver y volúmenes mapeados a ./data/....

#### Paso 9: Levantamos los contenedores (en segundo plano)

![alt text](image-89.png)

> -d = detached (se ejecutan en segundo plano).

La primera vez descargará las imágenes (puede tardar).

#### Paso 10: Verificamos que los contenedores estén corriendo

![alt text](image-90.png)




