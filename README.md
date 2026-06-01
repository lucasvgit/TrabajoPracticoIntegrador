Sistema Integrador de Mesa de Ayuda (Ticketing) - Java

Descripción del Proyecto

Este repositorio contiene el Trabajo Práctico Integrador enfocado en el diseño y modelado de un sistema de **Mesa de Ayuda y Gestión de Incidentes**. El software fue desarrollado utilizando **Java** y aplicando fuertemente los pilares de la **Programación Orientada a Objetos (POO).

El sistema permite administrar el ciclo de vida de los reportes técnicos de una empresa, vinculando clientes, operadores y técnicos especializados para resolver problemas en servicios específicos.

Arquitectura y Clases Principales

El modelo de datos está estructurado en base a las siguientes entidades interconectadas:
*   `Main.java`: Punto de entrada del sistema y simulación de la carga de datos.
*   `MesaDeAyuda.java`: Orquestador principal de la lógica de negocio y asignación de tareas.
*   `Incidente.java`: Entidad central que registra el problema, el cliente afectado, el estado de la resolución y el técnico asignado.
*   `Cliente.java` & `Tecnico.java`: Modelado de los actores del sistema con sus respectivos atributos y comportamientos.
*   `Especialidad.java` & `Problema.java`: Clasificación técnica de los incidentes para lograr una asignación eficiente al operador (`Operador.java`) correspondiente.

 Conceptos Técnicos Aplicados
*   Programación Orientada a Objetos (POO): Encapsulamiento, abstracción y relaciones entre objetos (Asociación, Agregación y Composición).
*   Lógica de Negocio: Algoritmos de validación para emparejar la especialidad de un técnico con el tipo de problema del incidente.


Proyecto desarrollado originalmente en el marco de formación técnica y consolidado en el portafolio profesional de Vowk Studio.
