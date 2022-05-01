FROM openjdk:11
ADD target/shopping-mall-webapp.jar shopping-mall-webapp.jar
ENTRYPOINT ["java", "-jar","shopping-mall-webapp.jar"]
EXPOSE 8080
