#pull base image
FROM openjdk

#maintainer 
MAINTAINER rajneesh.kakkar@gmail.com

#expose port 8080
#EXPOSE 8080

#default command
CMD java -jar /data/spring-boot-hello-world-poc-0.0.1-SNAPSHOT.jar

#copy hello world to docker image
ADD ./data/spring-boot-hello-world-poc-0.0.1-SNAPSHOT.jar /data/spring-boot-hello-world-poc-0.0.1-SNAPSHOT.jar
