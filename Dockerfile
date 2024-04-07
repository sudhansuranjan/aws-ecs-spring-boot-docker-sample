FROM  openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/aws-ecs-spring-boot-docker.jar aws-ecs-spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/aws-ecs-spring-boot-docker.jar"]