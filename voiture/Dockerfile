FROM openjdk:17-alpine

WORKDIR /app

COPY target/voiture-0.0.1-SNAPSHOT.jar /app/voiture-service.jar

EXPOSE 8089

CMD ["java", "-jar", "/app/voiture-service.jar"]
