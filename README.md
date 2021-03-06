[![Build Status](https://travis-ci.org/xaavito/jwtProject.png?branch=master)](https://travis-ci.org/xaavito/jwtProject)
[![codecov](https://codecov.io/gh/xaavito/jwtProject/branch/master/graph/badge.svg)](https://codecov.io/gh/xaavito/jwtProject)


# JWT Simple Project

By Javier Martin Gonzalez

# Tecnologias Utilizadas:

- Java8: El core de la app
- SpringBoot: Api para dar manejo de aplicacion Rest, sencilla, rapida, ideal para el ejercicio en cuestion
- MongoDB: BD No relacional, embebida para este caso, queria darle una vuelta a las BD no relaciones y no defraudo
- Log4j: Logueo
- jUnit: Testing
- Lombok: Ahorro de lineas de configuracion con un par de anotations
- Maven: Librerias
- Swagger: Documentador de API endpoints.
- Jacoco: Cobertura y reportes


# Instrucciones para lanzar la aplicacion en localhost

1) Clonar el proyecto de github (https://github.com/xaavito/jwtProject)

2) Una vez clonado en un repo propio basta con ir a la carpeta template y desde la consola

					java -jar target/jwtProject-0.0.1-SNAPSHOT.jar

3) Acceder via explorador a:

							localhost:8080/add-anuncio

							localhost:8080/get-anuncios
							
							localhost:8080/get-anuncios/{id}
							
							localhost:8080/add-usuario

							localhost:8080/get-usuarios
							
							Autorizacion
							
							localhost:8080/user
							
							
# Tests

Conexion con Travis que ejecuta los tests y se puede ver en el Badge, Ademas adjutno esta captura de pantalla.

![testing](./tests/Tests.png)

# Coverage

Cobertura de codigo a traves de los tests.

![cobertura](./coverage/Coverage.png)

El reporte completo se puede encontrar en: [Reporte](https://github.com/xaavito/jwtProject/blob/master/coverage/Advertising%20Manager-jacoco-ut/index.html)


# Swagger

http://localhost:8080/v2/api-docs 

http://localhost:8080/swagger-ui.html#/ 

# Ejemplo

https://blog.softtek.com/es/autenticando-apis-con-spring-y-jwt
https://www.javainuse.com/spring/boot-jwt

# Banner generator

https://devops.datenkollektiv.de/banner.txt/index.html

