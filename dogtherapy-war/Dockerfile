FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD build/libs/dogtherapy-war-0.0.1.war dogtherapy_war.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dogtherapy_war.war"]