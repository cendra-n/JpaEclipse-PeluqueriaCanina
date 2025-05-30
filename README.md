# 🐕 Sistema de Gestión para Peluquería Canina - Proyecto Mejorado

## 📌 Descripción
Sistema completo para gestión de clientes y mascotas en una peluquería canina, desarrollado en **Java 21** con mejoras significativas sobre la versión base de TodoCode Academy.

## 🚀 Características Mejoradas

### 🔍 Filtros Avanzados
- **Búsqueda por mascota**: Filtra registros por nombre de mascota
- **Búsqueda por dueño**: Filtra registros por nombre del propietario
- **Resaltado visual**: Filas con atención especial se marcan en gris

### 🛡️ Validaciones Robustas
- Validación de campos obligatorios
- Restricciones de longitud para nombres, razas y colores
- Validación de formatos para DNI y teléfono
- Verificación de opciones (SI/NO) para campos booleanos

### 🖼️ Interfaz Mejorada
- Diseño visual renovado con imágenes personalizadas
- Experiencia de usuario optimizada
- Mensajes de confirmación y error contextuales

## ⚙️ Tecnologías

| Componente       | Tecnología           |
|------------------|----------------------|
| Lenguaje         | Java 21              |
| IDE              | NetBeans 21          |
| Persistencia     | JPA con EclipseLink  |
| Base de datos    | MySQL 8.x            |
| Interfaz gráfica | Swing                |
| Gestor de builds | Maven                |

## 📋 Requisitos

1. **Java Development Kit 21+**
2. **NetBeans 21** (versión obligatoria para compatibilidad con imágenes)
3. **MySQL Server** con:
   - Base de datos llamada `peluqueriacanina`
   - Usuario con permisos (configurar en `persistence.xml`)
4. **MySQL Connector/J 8.0.17**

## 🛠️ Instalación

1. Clonar repositorio:
   ```bash
   git clone https://github.com/cendra-n/JpaEclipselink-peluqueriaCanina.git
   ```

2. Configurar base de datos:
   ```sql
   CREATE DATABASE peluqueriacanina;
   ```

3. Configurar `persistence.xml`:
   ```xml
   <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/peluqueriacanina"/>
   <property name="javax.persistence.jdbc.user" value="tu_usuario"/>
   <property name="javax.persistence.jdbc.password" value="tu_contraseña"/>
   ```

4. Importar en NetBeans como proyecto Maven

## ▶️ Ejecución

1. Abrir la clase principal: `PeluqueriaCanina.java`
2. Ejecutar como aplicación Java

## 📚 Documentación

El proyecto incluye:
- **JavaDoc completo** para todas las clases
- Comentarios detallados en código
- Validaciones documentadas

## ✨ Créditos

Basado en el curso de **TodoCode Academy** con mejoras significativas:
- Sistema de filtrado avanzado
- Validaciones de formulario
- Diseño de interfaz mejorado
- Documentación profesional
- Indicadores visuales para mascotas con necesidades especiales

## 🆘 Soporte

Para problemas técnicos:
1. Verificar que MySQL esté corriendo
2. Confirmar versión de NetBeans (21+)
3. Revisar configuración en `persistence.xml`
4. Validar que las dependencias Maven se descargaron correctamente
