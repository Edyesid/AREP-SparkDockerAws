# Arquitecturas empresariales - Taller de de modularización con virtualización e Introducción a Docker y a AWS

--------------------------------------------------------------------------------------------------------------

## Prerequisitos

--------------------------------------------------------------------------------------------------------------


## Descarga y instalación

Para clonar este repositorio basta con copiar la siguiente linea en un Shell de cualquier sistema operativo

```
git clone https://github.com/Edyesid/AREP-SparkDockerAws
```

Es recomendable tener instalado maven en su computadora para poder visualizar de una mejor manera las pruebas y compilación del taller. para esto dirijase al pagina de maven y siga los pasos de instalación.

[install maven](https://maven.apache.org/install.html)

Una vez que tenga maven en su computadora, dirijase a la carpeta raiz de este repositorio y para compilar el proyecto se deber introducir el siguiente comando:

```
mvn clean install
```

## Pruebas


## Construido

[Eclipse](https://www.eclipse.org/) plataforma de código abierto para el desarrollo de aplicaciones
[IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/)

## Pasos realizados

Primera parte crear la aplicación web

para poder probarla ejecutamos el siguiente comando

```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.SparkDockerwebLive.SparkWebServer"
```

![exec](imagenes/exec.png)

![hello](imagenes/hello.png)

Use docker-compose para generar automáticamente una configuración docker.

![compose](imagenes/compose.png)

![ps](imagenes/ps.png)

![docker](imagenes/docker.png)

## Autor

Edwin Yesid Rodriguez Maldonado

## Licencia

Este proyecto esta bajo la licencia GNU GENERAL PUBLIC LICENSE
