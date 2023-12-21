FROM openjdk:17-alpine

WORKDIR /app

COPY target/server-0.0.1-SNAPSHOT.jar /app/eureka-server.jar

EXPOSE 8761

CMD ["java", "-jar", "/app/eureka-server.jar"]
