FROM openjdk:17-jdk-alpine
EXPOSE 8080
EXPOSE 5432
WORKDIR /app
COPY target/tour-firm-project-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
