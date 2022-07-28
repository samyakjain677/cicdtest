FROM openjdk:8-alpine
ARG JAR_VERSION=build/libs/cidemo-0.0.1-SNAPSHOT.jar
COPY ${JAR_VERSION} app.jar
ENTRYPOINT ["java","-Xmx512m", "-Xms256m", "-jar","app.jar"]