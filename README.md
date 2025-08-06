# ⚙️ Instrucciones para ejecutar las pruebas localmente

## ✅ Pre-requisitos

Asegúrate de tener lo siguiente instalado en tu máquina:

- Java JDK 17 o superior
- Apache Maven
- Un IDE (Visual Studio Code, IntelliJ IDEA, etc.)
- GeckoDriver (para Firefox) y ChromeDriver, o utilizar WebDriverManager (ya incluido en el proyecto)

---

## 📦 Clonar el proyecto

```bash
git clone https://github.com/Javitodev1/SENCE-proyecto-2.git
cd SENCE-proyecto-2
```
## Compilar y descargar dependencias
```bash
mvn clean install
```
## 🚀 Ejecutar un test específico
```bash
mvn -Dtest=Leccion1test test
```
## 📊 Ver resultados
- Las capturas de pantalla en caso de error se guardarán en la carpeta:
```bash
/screenshots
```
- Los logs y los resultados se podrán consultar en:
```bash
/target/surefire-reports
```

## ------------------------------

# 📌 Presentación del Proyecto de Automatización Funcional

Este proyecto consiste en una suite de pruebas automatizadas construida con **Java**, **Selenium WebDriver** y **TestNG**, enfocada en validar los flujos críticos de una aplicación web con funcionalidades de registro e inicio de sesión.

## 🎯 Objetivo

Validar funcionalmente:
- Registro de usuarios (campos obligatorios, formatos inválidos)
- Inicio de sesión con credenciales válidas e inválidas
- Bloqueo tras múltiples intentos fallidos

## 🧪 Tecnología utilizada
- Java + Maven
- Selenium WebDriver
- TestNG
- WebDriverManager
- Firefox y Chrome

## 📁 Estructura del código
- `pages/`: Clases que representan páginas web (POM)
- `test/`: Clases que contienen los casos de prueba
- `resources/datos/`: Archivos CSV u otras fuentes de datos

## 📊 Resultados
- ✔ 6 combinaciones de datos probadas
- ✔ 4 flujos automatizados
- ✔ Capturas generadas en fallos
- ✔ Pruebas ejecutadas en Chrome y Firefox

## 🎓 Lecciones aprendidas
- Aplicación de POM para mejorar mantenimiento
- Manejo de múltiples navegadores y datos externos
- Importancia de sincronización con WebDriverWait

