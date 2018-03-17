#!/bin/bash
#
# TODO:
# - fix problem with wrong java in sudo mode
#

SCR_NAME=$0

#Exit codes
SUCCESS=0
FAILURE=1

#Input arguments
CLEANUP_STEP="cleanup"
BUILD_STEP="build"
DEPLOY_STEP="deploy"
TEST_STEP="test"
ALL_STEPS="all"

GRADLE=/usr/bin/gradle
DOCKER=/usr/bin/docker
DOCKER_COMPOSE=/usr/local/bin/docker-compose
JAVA=/usr/lib/jvm/java-8-openjdk-amd64/bin/java
TESTS_JAR=dogtherapy-testware/build/libs/testware.jar

print_usage() {
  echo "Usage: " 
  echo "${SCR_NAME} ARGS"
  echo "  $ALL_STEPS"
  echo "  $CLEANUP_STEP"
  echo "  $BUILD_STEP"
  echo "  $DEPLOY_STEP"
  echo "  $TEST_STEP"
  echo "  $ALL_STEPS"
}

build() {
  echo "STARTING STEP - Build application"
  sudo chmod -R 777 *
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

cleanup_env() {
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
  if [ -e ${TESTS_JAR} ]; then
    sudo chmod 777 ${TESTS_JAR}
    ${JAVA} -classpath ${TESTS_JAR} com.pskindero.dogtherapy.test.TestRunner
    rc=$?
  else 
  	rc=${FAILURE}
  fi
  echo "FINISHED STEP - Build application, result: $rc"
  return $rc
}

############## MAIN PROGRAM ######################

if [ $# != 0 ]; then

  if [[ "$#" == "1" && "$1" == "$ALL_STEPS" ]]; then
    INPUT="$CLEANUP_STEP $BUILD_STEP $DEPLOY_STEP $TEST_STEP"
  else
    INPUT=( "$@" )
  fi

  for ARG in ${INPUT[@]}; do
    rc=$SUCCESS
    case $ARG in
      "$CLEANUP_STEP") 
        cleanup_env
      	rc=$?
      	;;
      "$BUILD_STEP") 
      	build
      	rc=$?
      	;;
      "$DEPLOY_STEP") 
        deploy
      	rc=$?
      	;;
      "$TEST_STEP") 
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