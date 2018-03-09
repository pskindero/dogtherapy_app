FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD build/libs/dogtherapy-ui-0.0.1.war dogtherapy_ui.war

#Generate Self-signed certificate
RUN /usr/lib/jvm/default-jvm/bin/keytool -genkey \
	-alias dogtherapy \
	-storetype PKCS12 \
	-keyalg RSA \
	-keysize 2048 \
	-keystore /root/dogtherapy.p12 \
	-storepass dogtherapy \
	-dname " CN=Patryk Skinderowicz, OU=pskindero, O=pskindero, L=Cracow, ST=Lesser Poland, C=PL"


ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dogtherapy_ui.war"]