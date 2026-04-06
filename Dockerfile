# Estágio 1: Build (Compilação do código)
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

# Estágio 2: Run (Execução da API)
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]