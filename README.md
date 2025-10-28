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

![alt text](image-3.png)

![alt text](image-4.png)

## Nuevo(Correcciones)

✔ Mi contenedor MySQL es este y contiene estos puertos:

> docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=12345 e MYSQL_DATABASE=feria_mysql -e MYSQL_USER=Valery -e MYSQL_PASSWORD=12345 -p 3309:3306 -v C:\Users\Valery\mysql-data:/var/lib/mysql -d mysql:8.0

![alt text](image-6.png)

#### ✔ Mi contenedor SQLServer es este y contiene estos puertos:

> docker run --name sqlserver-container -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=12345" -e "MSSQL_PID=Express" -p 1434:1433 -v C:\Users\Valery\sqlserver-data:/var/opt/mssql -d mcr.microsoft.com/mssql/server:2022-latest

![alt text](image-7.png)

#### ✔ Mi contenedor PostgreSQL es este y contiene estos puertos:

> docker run --name postgres-container -e POSTGRES_USER=Valery -e POSTGRES_PASSWORD=12345 -e POSTGRES_DB=feria_postgres -p 5433:5432 -v C:\Users\Valery\postgres-data:/var/lib/postgresql/data -d postgres:15


![alt text](image-8.png)

#### ✔ Mi contenedor MongoDB es este y contiene estos puertos:

> docker run --name mongo-container -e MONGO_INITDB_ROOT_USERNAME=Valery -e MONGO_INITDB_ROOT_PASSWORD=12345 -e MONGO_INITDB_DATABASE=feria_mongo -p 27018:27017 -v C:\Users\Valery\mongo-data:/data/db -d mongo:7.0

![alt text](image-9.png)

Ya tenemos todos los contenedores en Docker

![alt text](image-10.png)

-docker ps -a: sirve para ver todos los contenedores(por si no esta en ejecucion)

![alt text](image-11.png)

-docker ps




Para pasar los motores contenedores en Destock:

##### 1. Entrar a la carpeta del proyecto


##### 2. Verificar que Docker funciona

Si Docker responde con la versión establecida, todo está listo para continuar.
##### 3. Levantar los contenedores por primera vez

• up = crea y ejecuta los contenedores.
•  -d = modo “detached”, todo corre en segundo plano.

##### 4. Verificamos el estado de los contenedores con este comando


Cual muestra qué contenedores están corriendo y en qué puertos

Por último, entramos a Docker y después entramos a los contenedores y así debe de aparecer 

 
![alt text](image.png)

![alt text](image-1.png)



# Parte 2

# Ubuntu

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