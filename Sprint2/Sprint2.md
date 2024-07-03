# Segundo Sprint: Uso de docker y mejora de la estrategia de pruebas (12 puntos)
## Objetivos
- Contenerización del sistema: Utilizar Docker para contenerizar la aplicación y asegurar su
portabilidad.
- Refinamiento del tDD: Continuar utilizando TDD para cualquier nueva funcionalidad o
mejora.
- Mejora de la estrategia de pruebas: Integrar la estrategia de pruebas en un entorno
Dockerizado.
- Refactorización y código limpio: Continuar refactorizando el código para mantener su
calidad.
- Métricas de calidad: Continuar monitoreando y mejorando las métricas de calidad del
código.
## Actividades
1. Contenerización del Sistema:
    - Crear un Dockerfile para construir la imagen de la aplicación.
    - Configurar un docker-compose.yml si se necesitan múltiples servicios (bases de
datos, servicios de simulación de clima).
2. Refinamiento del TDD:
    - Escribir nuevas pruebas para cualquier funcionalidad adicional.
    - Asegurar que todas las pruebas existentes pasen en el entorno Dockerizado.
3. Mejora de la estrategia de pruebas:
    - Integrar las pruebas unitarias y de integración en el pipeline de Docker.
    - Asegurar que los stubs y fakes funcionen correctamente en el entorno
contenerizado.
4. Refactorización y código limpio:
    - Continuar refactorizando el código para mejorar la calidad y mantener la adherencia
    a los principios de diseño limpio.
5. Métricas de Calidad:
    - Monitorear la cobertura de pruebas y la complejidad del código en el entorno
    Dockerizado.
    - Utilizar herramientas de análisis de código para asegurar la calidad.
Entregables
    - Imágenes Docker y archivos de configuración (Dockerfile, docker-compose.yml).
    - Código fuente actualizado con nuevas funcionalidades y mejoras.
    - Conjunto de pruebas actualizado y funcionando en el entorno Docker.
    - Reportes de métricas de calidad del código.

## Salida esperada
Cuando ejecutas la aplicación con las condiciones climáticas especificadas (Temperatura de 35°C,
Lluvia de 25mm, Viento de 55km/h), deberías ver la siguiente salida en la consola:
Alerta: Temperatura Alta!
Alerta: Lluvia Intensa!
Alerta: Viento Fuerte!