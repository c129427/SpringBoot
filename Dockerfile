FROM maven:3.9.16-eclipse-temurin-17 AS build

WORKDIR /workspace

COPY pom.xml .
RUN mvn -B dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre

WORKDIR /app

RUN groupadd --system spring \
    && useradd --system --gid spring --home-dir /app spring

COPY --from=build --chown=spring:spring /workspace/target/*.jar app.jar

ENV SERVER_ADDRESS=0.0.0.0

USER spring

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "app.jar"]
