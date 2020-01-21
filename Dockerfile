FROM openjdk:8-jdk-alpine

RUN mkdir /app
WORKDIR /app
COPY target/*.jar /app/app.jar
ENTRYPOINT ["sh", "-c", "java -Xmx128m -Xms64m -jar app.jar"]