#!/bin/bash

SCR_NAME=$0


#Exit codes
SUCCESS=0
FAILURE=1

GRADLE=/usr/bin/gradle
DOCKER=/usr/bin/docker
DOCKER_COMPOSE=/usr/local/bin/docker-compose

print_usage() { 
  echo "${SCR_NAME} ARG"
}

build() { 
  ${GRADLE} build clean
}

deploy() {
  ${DOCKER_COMPOSE} up --build
}

remove() {
    ${DOCKER} network rm $(${DOCKER} network ls -q)
	${DOCKER} rm $(${DOCKER} ps -a -q)
	${DOCKER_COMPOSE} rm --all
}


############## MAIN PROGRAM ######################

if [ $# != 0 ]; then
  
  case $1 in
    "build") build;;
    "deploy") deploy;;
    "remove") remove;;
  esac
  
else

  print_usage
  exit ${FAILURE}

fi