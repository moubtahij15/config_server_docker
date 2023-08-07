FROM openjdk:17

ARG JAR_FILE=target/config-server-docker-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} configserver.jar

ENTRYPOINT ["java", "-jar", "/configserver.jar"]

EXPOSE 8900