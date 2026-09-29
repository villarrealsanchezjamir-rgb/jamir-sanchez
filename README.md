# Sistema Integral de Gestión de Flota Vehicular

Repositorio preparado para visualizar la estructura del modelo orientado a objetos en **GitDiagram**.

## Qué se agregó

- `src/main/java/com/gestionvehiculos/domain/`: 25 clases Java del dominio.
- Las asociaciones entre clases están representadas mediante atributos tipados (`Vehiculo`, `Conductor`, `Mantenimiento`, etc.).
- La jerarquía `Usuario -> Administrador / SupervisorFlota / Mecanico` está representada mediante herencia.
- `diagramas/`: diagramas Mermaid de apoyo para GitHub y documentación.
- Se conservaron los documentos Word y PDF originales del trabajo.

## Cómo verlo en GitDiagram

1. Crea un repositorio nuevo en GitHub.
2. Sube el contenido de este proyecto.
3. Abre `https://gitdiagram.com/`.
4. Pega la URL del repositorio de GitHub o escribe `usuario/nombre-del-repositorio`.
5. GitDiagram podrá analizar las clases Java y sus relaciones para generar el diagrama interactivo.

> Importante: los documentos `.docx` y `.pdf` contienen imágenes de diagramas, pero GitDiagram no las utiliza como código fuente. Por eso el modelo fue representado también como código Java estructurado.

## Modelo

El dominio está organizado en siete módulos:

1. Organización y flota
2. Operación y transporte
3. Mantenimiento
4. Control operativo
5. Documentación y seguros
6. Monitoreo y avisos
7. Usuarios y roles
