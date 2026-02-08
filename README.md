# Practica 2 
En esta práctica se desarollará un API REST utilizando un Spring Boot cuyo objetivo es implementar un servicio para la 
gestión de carritos.
## Tabla de endPoints 
A continuación se presenta la tabla de Endpoints de la API REST desarollada. Esta tabla sirve como resumen del comportamiento 
de la API: 

![Arquitectura](/imagenes/Tabla.png)

Para verificar el funcionamiento de la API REST hay que hacer las peticiones necesarias HTTP desde postman.

En primer lugar, para probar el POST, envio un body en formato JSON para crear nuevos carritos y comprobar que se almacenan correctamente en el sistema 

![Arquitectura1](/imagenes/Post1.png)

![Arquitectura2](/imagenes/Post2.png)

A continuanción, mediante una petición GET, vemos la lista completa de carritos creados:

![Arquitectura3](/imagenes/Get1.png)

También podemos hacer una petición GET de forma individual de cada carrito mediante idCarrito :

![Arquitectura4](/imagenes/Get2.png)

Para eliminar un carrito concreto, hacemos una petición DELETE y comprobamos que ha funcionado correctamente mediante un GET : 

![Arquitectura5](/imagenes/Delete.png)

Por último, hacemos una petición PUT para modificar cualquiera de los campos de una carrito ya existente, enviando un JSON con los nuevos datos : 

![Arquitectura6](/imagenes/Put.png)