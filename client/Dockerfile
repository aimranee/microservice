FROM openjdk:17-alpine

WORKDIR /app

COPY target/client-0.0.1-SNAPSHOT.jar /app/client-service.jar

EXPOSE 8088

CMD ["java", "-jar", "/app/client-service.jar"]
