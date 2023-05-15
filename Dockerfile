FROM openjdk:17.0.1-jdk-slim

WORKDIR /user-cpf-api

COPY target/*.jar /user-cpf-api/app.jar

EXPOSE 8081

CMD java -XX:+UseContainerSupport -jar app.jar