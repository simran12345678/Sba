FROM openjdk:8
EXPOSE 8003
ADD target/UpdateMicroservices.jar UpdateMicroservices.jar
ENTRYPOINT ["java", "-jar", "UpdateMicroservices.jar"]



