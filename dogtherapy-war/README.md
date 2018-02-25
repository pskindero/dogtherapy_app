##Dogtherapy War component


#### Gradle Build

gradle war --info


#### Run application from jar

java -jar dogtherapy-war/build/libs/dogtherapy-war-0.0.1.war


#### Docker
docker build -t dogtherapy_war_image .
docker run --rm -P -p 32080:8080  --name dogtherapy_war_container dogtherapy_war_image
**Access:** http://localhost:32080/contact