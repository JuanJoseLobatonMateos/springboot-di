```markdown
# Spring Boot - Inyección de Dependencias

## Descripción
Este proyecto demuestra el uso de la Inyección de Dependencias (DI) en Spring Boot, un concepto fundamental en el ecosistema Spring que permite reducir el acoplamiento entre componentes de una aplicación.

## Características
- Ejemplos prácticos de inyección de dependencias mediante:
  - Anotaciones (@Autowired, @Component, @Service, etc.)
  - Configuración por Java (@Configuration, @Bean)
  - Diferentes tipos de inyección (por constructor, setter y campo)
- Ciclo de vida de los beans
- Ámbitos de los beans (singleton, prototype, etc.)
- Uso de perfiles para diferentes entornos

## Requisitos previos
- Java 11 o superior
- Maven 3.6 o superior
- IDE compatible con Spring Boot (recomendado: Spring Tool Suite, IntelliJ IDEA o VS Code)

## Instalación y ejecución
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/JuanJoseLobatonMateos/springboot-di.git
   ```
2. Navegar al directorio del proyecto:
   ```bash
   cd springboot-di
   ```
3. Ejecutar la aplicación con Maven:
   ```bash
   mvn spring-boot:run
   ```

## Estructura del proyecto
```
springboot-di/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── springbootdi/
│   │   │               ├── controllers/
│   │   │               ├── models/
│   │   │               ├── services/
│   │   │               └── SpringbootDiApplication.java
│   │   └── resources/
│   └── test/
├── .gitignore
├── pom.xml
└── README.md
```

## Licencia
[MIT](LICENSE)

## Autor
Juan José Lobatón Mateos
