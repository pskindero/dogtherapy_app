FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD build/libs/dogtherapy-ui-0.0.1.war dogtherapy_ui.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dogtherapy_ui.war"]