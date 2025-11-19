🎓 Simulador de Admisión Universitaria UDA
Aplicación web desarrollada con Spring Boot y Thymeleaf para simular el proceso de admisión a la Universidad de Atacama, permitiendo a los postulantes calcular sus posibilidades de ingreso según sus puntajes y datos académicos.

🔗 URL Producción: https://simulador.uda.cl
📦 Repositorio: https://github.com/mjtapia/simulador.git

📋 Descripción

El Simulador de Admisión UDA es una herramienta interactiva que guía a los estudiantes a través de un proceso de tres pasos para evaluar sus opciones de ingreso a diferentes carreras universitarias.

✨ Características Principales

Interfaz intuitiva con navegación por pasos
Formulario multi-sección con validación en tiempo real
Diseño responsive adaptable a dispositivos móviles
Identidad visual UDA con colores corporativos
Sistema de validación de campos obligatorios
Modal de términos y condiciones con información de tratamiento de datos
🛠️ Tecnologías Utilizadas

Backend

Java 17 - Lenguaje de programación
Spring Boot - Framework de aplicación
Thymeleaf - Motor de plantillas
MySQL - Base de datos
Maven - Gestor de dependencias
Frontend

HTML5 - Estructura semántica
CSS3 - Estilos personalizados con variables CSS
Bootstrap 5.3 - Framework responsive
JavaScript - Validación y navegación entre secciones
Line Awesome - Iconografía
Google Fonts - Tipografía Montserrat
Infraestructura

Servidor: Debian
Producción: https://simulador.uda.cl
📦 Estructura del Proyecto

simulador-uda/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── cl/uda/simulador/
│   │   │       ├── controller/      # Controladores Spring MVC
│   │   │       ├── model/           # Entidades JPA
│   │   │       ├── repository/      # Repositorios JPA
│   │   │       └── service/         # Lógica de negocio
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── favicon.png
│   │       │   └── images/
│   │       │       └── bg-calendario.jpg
│   │       ├── templates/           # Plantillas Thymeleaf
│   │       │   └── index.html
│   │       └── application.properties
│   └── test/                        # Tests unitarios
├── pom.xml                          # Configuración Maven
└── README.md
🚀 Instalación y Uso

Requisitos Previos

Java JDK 17 o superior
Maven 3.6+
MySQL 8.0+
Git
Instalación Local

Clonar el repositorio
Copygit clone https://github.com/mjtapia/simulador.git
cd simulador
Configurar base de datos MySQL
CopyCREATE DATABASE simulador_uda;
CREATE USER 'simulador_user'@'localhost' IDENTIFIED BY 'tu_password';
GRANT ALL PRIVILEGES ON simulador_uda.* TO 'simulador_user'@'localhost';
FLUSH PRIVILEGES;
Configurar application.properties
Copyspring.datasource.url=jdbc:mysql://localhost:3306/simulador_uda
spring.datasource.username=simulador_user
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
Compilar y ejecutar
Copymvn clean install
mvn spring-boot:run
Acceder a la aplicación
http://localhost:8080
Despliegue en Producción (Debian)

Instalar dependencias
Copysudo apt update
sudo apt install openjdk-17-jdk maven mysql-server
Compilar JAR
Copymvn clean package -DskipTests
Ejecutar como servicio
Copyjava -jar target/simulador-0.0.1-SNAPSHOT.jar
Uso

Paso 1: Datos Personales
Completa RUT, email, nombre, apellidos
Ingresa teléfono y año de egreso
Paso 2: Puntajes
Selecciona la carrera de interés
Ingresa puntajes de pruebas (150-1000)
Acepta términos y condiciones
Paso 3: Resultados
Visualiza el resultado de la simulación
Recibe confirmación por email
🎨 Paleta de Colores

Copy--primary-color: #3b6a75    /* Verde azulado UDA */
--secondary-color: #f7b900  /* Amarillo UDA */
--background-color: #f3f2ed /* Beige claro */
--background-footer: #1c2a44 /* Azul oscuro */
📝 Campos del Formulario

Datos Personales (Obligatorios)

RUT y dígito verificador
Email
Nombre y apellidos
Móvil
Año de egreso
Puntajes (Obligatorios)

Carrera seleccionada
Puntaje Matemáticas
Competencia Matemática
NEM (Notas Enseñanza Media)
Lenguaje
Ranking
Puntajes (Opcionales)

Ciencias
Historia y Ciencias Sociales
Teléfono fijo
🔒 Privacidad y Datos

El simulador cumple con la Ley Nº 19.628 de protección de datos personales. Los datos recopilados se utilizan exclusivamente para:

Comunicación institucional
Invitaciones a actividades académicas
Estudios estadísticos internos
📱 Características Responsive

Móvil: Diseño optimizado para pantallas pequeñas
Tablet: Ajuste de columnas y espaciado
Desktop: Experiencia completa con navegación visual
🔧 Funcionalidades JavaScript

Validación de campos obligatorios
Navegación entre secciones con animaciones
Formato automático de RUT
Scroll suave en navegación
Reset de formulario
🌐 Enlaces Importantes

Universidad: https://uda.cl
Admisión: https://admision.uda.cl
Redes Sociales:
Facebook Admisión UDA
Instagram Admisión UDA
📞 Contacto UDA

Campus Central

📍 Copayapu #485
☎️ +56 52 2 255422
Campus Medicina

📍 Los Carrera #1579
Campus Cordillera

📍 Copayapu #2862
Sede Vallenar

📍 Av. Costanera #105
🔧 Configuración Adicional

Variables de Entorno

Copyexport SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/simulador_uda
export SPRING_DATASOURCE_USERNAME=simulador_user
export SPRING_DATASOURCE_PASSWORD=tu_password
Profiles de Spring

dev - Desarrollo local
prod - Producción en Debian
Copymvn spring-boot:run -Dspring-boot.run.profiles=prod
🧪 Testing

Copy# Ejecutar tests unitarios
mvn test

# Ejecutar tests de integración
mvn verify
📊 Base de Datos

Tablas Principales

postulantes - Información personal de postulantes
simulaciones - Registros de simulaciones realizadas
carreras - Catálogo de carreras disponibles
puntajes - Puntajes ingresados por postulante
📄 Licencia

© 2025 Universidad de Atacama. Todos los derechos reservados.

🤝 Soporte

Para consultas sobre el simulador o el proceso de admisión:

📧 servicios@uda.cl
📧 cumplimiento@uda.cl
👨‍💻 Contribución

Fork el proyecto
Crea una rama para tu feature (git checkout -b feature/AmazingFeature)
Commit tus cambios (git commit -m 'Add some AmazingFeature')
Push a la rama (git push origin feature/AmazingFeature)
Abre un Pull Request
📚 Recursos Adicionales

Documentación Spring Boot
Guía Thymeleaf
Bootstrap 5.3 Docs
Desarrollado para la Universidad de Atacama - La única casa de estudios superiores estatal de la región de Atacama.
Stack: Java 17 + Spring Boot + Thymeleaf + MySQL + Bootstrap 5