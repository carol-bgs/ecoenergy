FROM --platform=linux/amd64 eclipse-temurin:17-jre

WORKDIR /app

COPY target/ecoenergy-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]