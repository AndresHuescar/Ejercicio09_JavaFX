# Ejercicio 9 - JavaFX

## Descripción

Este proyecto corresponde al ejercicio 9 del bloque BC5 de JavaFX.

El objetivo del ejercicio es modificar el ejemplo anterior para que, al hacer clic en el botón, el texto introducido se muestre en una etiqueta y después se limpie el campo de texto.

## Tecnologías utilizadas

- Java
- JavaFX
- Maven
- IntelliJ IDEA

## Funcionamiento

La aplicación muestra una ventana con una etiqueta, un campo de texto y un botón.

El usuario escribe un texto en el campo de texto y pulsa el botón.

Al pulsar el botón:

1. El texto escrito se muestra en la etiqueta.
2. El campo de texto se limpia automáticamente.

## Conceptos utilizados

- `Application`: clase base para crear aplicaciones JavaFX.
- `Stage`: ventana principal de la aplicación.
- `Scene`: contenido visual de la ventana.
- `Label`: control utilizado para mostrar texto.
- `TextField`: campo donde el usuario puede escribir texto.
- `Button`: botón que ejecuta una acción.
- `setOnAction`: método utilizado para programar el evento del botón.
- `getText`: obtiene el texto escrito en el campo.
- `setText`: cambia el texto de la etiqueta.
- `clear`: limpia el contenido del campo de texto.
- `VBox`: layout que organiza los elementos en vertical.

## Estructura del proyecto

```text
Ejercicio09_JavaFX
 ├── pom.xml
 └── src
     └── main
         └── java
             └── org
                 └── example
                     └── Main.java
```

## Cómo ejecutar el proyecto

Para ejecutar el proyecto desde IntelliJ IDEA:

1. Abrir el proyecto en IntelliJ.
2. Sincronizar el archivo `pom.xml` con Maven.
3. Abrir el panel Maven.
4. Ejecutar:

```bash
mvn javafx:run
```

## Autor

Andrés Huéscar Fernández
