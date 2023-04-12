FROM openjdk:17-alpine

COPY /target/spring-0.0.1-SNAPSHOT /spy.jar

CMD ["java","-jar","spy.jar"]
