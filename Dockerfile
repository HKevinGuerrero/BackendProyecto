
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

# Usa una imagen de OpenJDK
FROM openjdk:17-jdk-slim

# Configura el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR a la imagen
COPY build/libs/mi-aplicacion-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto que usará la aplicación
EXPOSE 8090

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
