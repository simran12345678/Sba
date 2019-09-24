FROM openjdk:8
EXPOSE 8001
ADD target/UserMicroservices.jar UserMicroservices.jar
ENTRYPOINT ["java", "-jar", "UserMicroservices.jar"]



