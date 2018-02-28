#!/bin/bash

SCR_NAME=$0

#Exit codes
SUCCESS=0
FAILURE=1

GRADLE=/usr/bin/gradle
DOCKER=/usr/bin/docker
DOCKER_COMPOSE=/usr/local/bin/docker-compose


print_usage() {
  echo "Usage: " 
  echo "${SCR_NAME} ARG"
}

build() {
  echo "STARTING STEP - Build application"
  ${GRADLE} clean build
  rc=$?
  echo "FINISHED STEP - Build application, result: $rc"
  return $rc
}

deploy() {
  echo "STARTING STEP - Deploy application"
  sudo ${DOCKER_COMPOSE} up --build -d
  rc=$?
  echo "FINISHED STEP - Deploy application, result: $rc"
  return $rc

}

remove() {
  echo "STARTING STEP - Cleanup environment"
  sudo ${DOCKER} stop $(${DOCKER} ps -a -q)
  sudo ${DOCKER} network rm $(${DOCKER} network ls -q)
  sudo ${DOCKER} rm $(${DOCKER} ps -a -q)
  rc=$SUCCESS
  echo "FINISHED STEP - Cleanup environment, result: $rc"
  return $rc
  
}

tests() { 
  echo "STARTING STEP - Run tests"
  rc=$?
  echo "FINISHED STEP - Build application, result: $rc"
  return $rc
}


############## MAIN PROGRAM ######################

if [ $# != 0 ]; then

  INPUT=$@
  if [[ "$#" == "1" && "$1" == "all" ]]; then
    INPUT="remove build deploy tests"
  fi

  for ARG in $INPUT[@]
  do

    rc=$SUCCESS
    case $ARG in
      "build") 
      	build
      	rc=$?
      	;;
      "deploy") 
        deploy
      	rc=$?
      	;;
      "remove") 
        remove
      	rc=$?
      	;;
      "tests") 
        tests
      	rc=$?
      	;;
    esac
    
    if [ "$rc" != "$SUCCESS" ]; then
      echo "Step failed with result $rc"
      exit $rc
    fi
    
  done
  
else

  print_usage
  exit ${FAILURE}

fi