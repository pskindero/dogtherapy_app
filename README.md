# Dogtherapy Web Application

### Technologies overview:
- Java 8, Spring framework, Spring Boot, Hibernate

- HTML5, CSS, AngularJS

- Gradle, Docker


### Versions

v0.0.1   Backend is working from IDE



### Gradle tasks

**Build application:** gradle clean build --refresh-dependencies


### Setup system using Docker

docker-compose up --build

Remove all containers:
	docker rm $(docker ps -a -q)
Remove all networks:
    docker network rm $(docker network ls -q)

Remove all images: 
	docker rmi $(docker images -q)
	docker-compose rm --all

Get container id: 
	docker inspect --format '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' $CONTANER_ID

Get container logs:
   docker logs CONTAINER_ID
	
###TODO
- prepare db schema
- gradle - jar-with-dependencies
- jpa - use only persistence.xml
- docker - read params of db from
- docker - create schema from script
