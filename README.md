# Portfolio Backend — Spring Boot API

API REST desarrollada en **Java 11 / Spring Boot**, que sirve como backend del [portfolio dinámico](https://github.com/agustinmedina/Front-Entrega2) (frontend en Angular). Expone endpoints para gestionar el contenido del sitio (usuario, educación, experiencia, habilidades y proyectos) de forma persistente en base de datos.

🔗 **Frontend relacionado:** [Front-Entrega2](https://github.com/agustinmedina/Front-Entrega2)
🎥 **Video demostración:** [YouTube](https://www.youtube.com/watch?v=yeM37T-QIN4)

---

## 📋 Descripción

Backend que centraliza la información de un portfolio personal, permitiendo operaciones CRUD sobre las distintas secciones del sitio (usuario/perfil, educación, experiencia, skills, proyectos) a través de una API REST protegida con Spring Security y JWT.

---

## 🛠️ Stack técnico

- **Java 11**
- **Spring Boot 2.6.7**
  - Spring Web (API REST)
  - Spring Data JPA (persistencia)
  - Spring Security (autenticación)
- **JWT** (`io.jsonwebtoken:jjwt`) para autenticación stateless
- **MySQL** como base de datos principal (conector `mysql-connector-java`)
- **H2** como base de datos en memoria para desarrollo/testing
- **Lombok** para reducir código repetitivo (getters/setters)
- **Maven** como gestor de dependencias y build

---

## 🗂️ Modelo de datos

| Entidad | Campos principales |
|---|---|
| **Usuario** | `id`, `nombre`, `apellido`, `titulo`, `descripcion`, `fotoPerfil` |
| **Educacion** | `idEdu`, `tituloEdu`, `fechaEdu`, `descEdu`, `imagenEdu` |

> El proyecto sigue una arquitectura en capas: `controller` → `service` → `repository` → `model`, con manejo de excepciones dedicado (`UserNotFoundException`).

---

## 📡 Endpoints disponibles

### Usuario
| Método | Endpoint | Descripción |
|---|---|---|
| `GET` | `/usuario/id/{id}` | Obtiene un usuario por ID |
| `PUT` | `/usuario/update` | Actualiza los datos del usuario |

### Educación
| Método | Endpoint | Descripción |
|---|---|---|
| `GET` | `/educacion/all` | Lista todas las entradas de educación |
| `POST` | `/educacion/add` | Crea una nueva entrada de educación |
| `PUT` | `/educacion/update` | Actualiza una entrada existente |
| `DELETE` | `/educacion/delete/{id}` | Elimina una entrada por ID |

> El resto de las entidades del portfolio (Experiencia, Skill, Proyecto) siguen la misma estructura CRUD.

---

## 🚀 Instalación y uso local

### Requisitos previos
- Java 11
- MySQL corriendo localmente
- Maven (o usar el wrapper incluido `./mvnw`)

### Configuración de base de datos
Crear una base de datos MySQL llamada `portfoliojava2` y ajustar credenciales en `src/main/resources/application.properties` si es necesario:

```properties
spring.datasource.url = jdbc:mysql://localhost:3306/portfoliojava2?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
```

### Clonar y ejecutar

```bash
git clone https://github.com/agustinmedina/Portfolio-backened.git
cd Portfolio-backened

# Con el wrapper de Maven
./mvnw spring-boot:run
```

La API queda disponible en `http://localhost:8080`.

> ⚠️ Requiere que el [frontend](https://github.com/agustinmedina/Front-Entrega2) esté configurado para apuntar a esta URL para que la carga y edición de datos funcione end-to-end.

### Build del proyecto

```bash
./mvnw clean package
```

---

## 🔐 Seguridad

El proyecto incluye **Spring Security** junto con generación y validación de tokens **JWT**, protegiendo las rutas de edición del portfolio para que solo el usuario autenticado pueda modificar el contenido.

---

## 🔧 Mejoras pendientes

- Completar controladores REST para Experiencia, Skill y Proyecto (actualmente solo Usuario y Educación tienen controlador expuesto)
- Tests unitarios
- Documentación de API con Swagger/OpenAPI
- Dockerizar el servicio para despliegue

---

## 👤 Autor

**Agustín Medina Soto**
[GitHub](https://github.com/agustinmedina) · [LinkedIn](https://www.linkedin.com/in/agustin-medina-soto-a1a2a7132/) · [Portfolio](https://agustinmedina.github.io)
