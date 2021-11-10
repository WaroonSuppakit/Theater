FROM openjdk:16-jdk-slim
COPY target/theater-1.0.2.jar theater.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/theater.jar"]