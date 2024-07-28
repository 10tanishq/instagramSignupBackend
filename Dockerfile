# Stage 1: Build the application
FROM maven:3.8.3-openjdk-17-slim AS build
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Create the final image
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/login-0.0.1-SNAPSHOT.jar login.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "login.jar"]