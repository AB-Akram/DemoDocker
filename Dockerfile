FROM openjdk:17-jdk

WORKDIR /app

COPY target/docker-0.0.1-SNAPSHOT.jar /app/demoDocker.jar

EXPOSE 8080

# this cmd will excute in workdir for we can found the our jar
CMD ["java", "-jar" ,"demoDocker.jar"]
