FROM java:8
EXPOSE 9090
ADD /target/MicroService.jar MicroService.jar
ENTRYPOINT ["java","-jar","MicroService.jar"]