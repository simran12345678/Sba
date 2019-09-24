FROM openjdk:8
EXPOSE 8002
ADD target/AdminMicroservices.jar AdminMicroservices.jar
ENTRYPOINT ["java", "-jar", "AdminMicroservices.jar"]



