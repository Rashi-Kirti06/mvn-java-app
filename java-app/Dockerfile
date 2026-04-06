# Stage 1: Build
FROM maven:3.8.5-openjdk-17 AS build
# Set a working directory so files aren't scattered in root
WORKDIR /app
COPY . .
# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Use the exact name of your JAR file found in your target folder
COPY --from=build /app/target/java-app-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
