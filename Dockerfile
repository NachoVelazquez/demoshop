FROM eclipse-temurin:17 AS builder

# Establecemos el directorio de trabajo
WORKDIR /demoshop

# Copiamos la configuración del wrapper
COPY .mvn/ .mvn

#Copiamos las dependencias del fichero 
COPY pom.xml ./

#Copiamos los scrips para los wrapper mvnw para linux y mvnw.cmd para windows
COPY mvnw.cmd ./
COPY mvnw ./

#Resolvemos las dependencias del proyecto incluyendo plugins y reportes
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD [ "./mvnw", "spring-boot:run" ]