# 🐶 Sistema de Gestión de Peluquería Canina

Este proyecto es una aplicación desarrollada en **Java 21** con **NetBeans 21**, utilizando **JPA con EclipseLink** para la persistencia de datos. Permite gestionar clientes y mascotas de una peluquería canina de manera eficiente.

## 🚀 Tecnologías utilizadas

- **Java 21**
- **NetBeans 21**
- **Maven** (Gestor de dependencias)
- **JPA (EclipseLink)**
- **MySQL**
- **Swing** (Interfaz gráfica)

## ⚠️ Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalado lo siguiente:

- **Java 21+**
- **NetBeans 21** (Versiones anteriores pueden no cargar correctamente las imágenes)
- **MySQL** instalado
- **MySQL Connector/J 8.0.17** (Otras versiones pueden generar incompatibilidades)
- Configurar la conexión en `persistence.xml`

## 📦 Instalación y ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/cendra-n/JpaEclipse-PeluqueriaCanina.git
   ```
2. **Configurar la base de datos:**
   - Crear una base de datos vacía en MySQL llamada **`peluqueriacanina`**.
   - Asegurarse de que el usuario y la contraseña de MySQL sean correctos en el archivo `persistence.xml`.
3. **Abrir el proyecto en NetBeans:**
   - Importarlo como un **proyecto Maven**.
   - Verificar que se descarguen las dependencias.
4. **Ejecutar la aplicación** desde la clase `PeluqueriaCanina.java`.

## 📷 Características del sistema

✔️ **Interfaz gráfica amigable** creada con Swing.
✔️ **Gestión de clientes y mascotas:** Agregar, modificar y visualizar registros.
✔️ **Persistencia con JPA y EclipseLink.**
✔️ **Base de datos MySQL**, con mapeo automático desde JPA.

## 📌 Notas

- El sistema mapea la base de datos desde cero, por lo que no es necesario importar estructuras manualmente.
- En caso de errores de conexión, verificar que el servicio de MySQL esté en ejecución.
- **NetBeans 21 es necesario para cargar correctamente las imágenes en la interfaz**.

## ✨ Créditos

Proyecto desarrollado siguiendo la consigna y explicaciones de **TodoCode Academy**, al que agregué modificaciones y ajustes personales para mejorar su funcionalidad y adaptarlo a mi aprendizaje.

## 🎥 Demostración del proyecto
Puedes ver el sistema en funcionamiento aquí: [Ver video](https://drive.google.com/file/d/1cT-mwjQ_23sAmSas5OR0yzITshFIJRL1/view?usp=sharing)






