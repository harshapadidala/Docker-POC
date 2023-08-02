# Docker-POC
Dockerize a Spring boot application

### Commands used

In root path of project where docker file is located, Run following commad to build docker image

docker build --tag=message-server:latest .

Check images

docker images

Run docker container from our image

docker run -p 8081:8080 message-server:fix

This will start our application in Docker, and we can access it from the host machine at localhost:8881/messages. Here it's important to define the port mapping, which maps a port on the host (8881) to the port inside Docker (8880). This is the port we defined in the docker file
