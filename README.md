# retoEnlaceOperativo

Este proyecto consiste en la automatización de la página de demostración **demoBlaze**. Los escenarios automatizados
incluyen el registro de usuario, inicio de sesión, adición de productos al carrito y validación del monto total de los
productos. El proyecto está desarrollado utilizando **Java 11**, el patrón **Screenplay** con **Serenity BDD**, *
*Cucumber** y **Gradle**.

## Tabla de Contenidos

- [Introducción](#introducción)
- [Stack Tecnológico](#stack-tecnológico)
- [Instalación](#instalación)
- [Ejecución](#ejecución)
- [Uso de los Escenarios](#uso-de-los-escenarios)
- [Contribución](#contribución)
- [Licencia](#licencia)

## Introducción

**retoEnlaceOperativo** es un proyecto de automatización que tiene como objetivo facilitar la prueba de funcionalidades
clave en la página **demoBlaze**. Esto incluye procesos de registro, inicio de sesión de usuario, adición de productos
al carrito y la verificación de la suma total de los productos en la compra.

## Stack Tecnológico

- **IntelliJ IDEA**: Entorno de desarrollo integrado.
- **Java 11**: Lenguaje de programación.
- **Screenplay Pattern** con **Serenity BDD**: Framework de automatización de pruebas.
- **Cucumber**: Para la definición de escenarios de pruebas en formato Gherkin.
- **Gradle**: Sistema de automatización de construcción.

## Instalación

Sigue los pasos a continuación para clonar el repositorio y configurar el proyecto:

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/RobertAroca93/retoEnlaceOperativo.git

## Ejecución

## Uso de los escenarios

Los escenarios de prueba están escritos en formato Gherkin y pueden encontrarse en la carpeta
src/test/resources/features.
Para ejecutar un escenario específico, asegúrate de que el archivo de características esté correctamente configurado en
la carpeta correspondiente.

- ** RegistroTest.java**: ejecuta el escenario para el registro exitoso.
- ** LoginTest.java**: ejecuta el escenario para el login.
- ** AgregarProductosTest.java**: agrega los productos al carrito y valida que el monto sea igual al total.

## Contribución

Si deseas contribuir a este proyecto, sigue los siguientes pasos:

1. Haz un fork del repositorio.
2. Crea una rama nueva (git checkout -b mi-feature).
3. Realiza tus cambios y haz commit (git commit -m 'Añadí una nueva función').
4. Haz push de tu rama (git push origin mi-feature).
5. Crea un pull request describiendo los cambios realizados.

## Licencia

Este archivo `README.md` proporciona una guía clara sobre qué es el proyecto, cómo instalarlo, ejecutarlo y contribuir.

