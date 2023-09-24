FROM openjdk:11
EXPOSE 8080
ADD target/broker-jms.jar broker-jms.jar
ENTRYPOINT ["java","-jar","/devops-integration.jar"]