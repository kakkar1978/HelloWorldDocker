# HelloWorldDocker
Build a simple Spring Boot app Hello World:
Step 1 :Building a simple Spring Boot application which will run inside a docker container.
Step 2: Required Software
          -docker (1.6.0 or above)
          -openjdk
          -Maven 3.0+
          -Ubuntu Machines installed on Google Cloud Platform
          -Spring tool Suite
Step 3: Build a Simple Hello World App using Spring boot.     
Step 4:Clone Source Code from Github Repositery 
       Public Path:https://github.com/kakkar1978/HelloWorldDocker.git
Step 5:Build project with Maven
           mvn clean install
Step 6:Move application to data folder
          mv ./target/hello*.jar ./data
Step 7: Build Docker image
           docker build -t="hello-world-java" .
Step 8 :Run Docker image
        sudo docker run -p 80:8080  --name=App2 hello-world-java
Step 9 :Test application
first you need to find ContainerId of the running Docker image
            sudo docker ps -a
Step 10: test applichation
             curl http://35.189.47.19:80 
Step 11: Outcome       
the respone should be
Hello World

Use below public Ip to view the results
http://http://35.189.47.19:80

Deliverables 
Access to Github/Bitbucket repo with application codebase
Public Path:https://github.com/kakkar1978/HelloWorldDocker.git
README with application documentation including design and instructions on how to run it 
Path as follows
Dockerfile (stored in the above repo)
Path as follow
https://github.com/kakkar1978/HelloWorldDocker/tree/master/src/docker
Docker image published on Dockerhub
Steps:
docker login
  sudo docker login
  sudo docker images
  sudo docker push dockertestee/hello-world-java
  sudo docker tag 6136a40b2d82 dockertestee/hello-world-java
  sudo docker push dockertestee/hello-world-java

Path:https://hub.docker.com/r/dockertestee/hello-world-java/
Username:dockertestee
password: Password@123

