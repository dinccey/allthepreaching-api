# First stage: build the jar using Maven
FROM maven:3.9.6-amazoncorretto-21 AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package -Dmaven.test.skip

# Second stage: run the jar using Corretto
FROM amazoncorretto:21
COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar"]
