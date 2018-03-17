# Dogtherapy Web Application


### Versions

v0.0.1          Backend is working from IDE
v0.0.2          Backend and frontend is working from IDE
v0.0.3          All working, ports and IPs for containers
v0.0.4          HTTPS


### Gradle tasks

**Build application:** gradle clean build --refresh-dependencies


### Setup system using Docker

Build application:
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
	
### TODO
- prepare db schema
- jpa - use only persistence.xml
- docker - read params of db from
- docker - create schema from script
