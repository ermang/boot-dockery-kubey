#docker/dockerfile:1

FROM maven:3.8.6-openjdk-11

WORKDIR /opt/app

COPY ./target/boot-dockery-kubey-1.0-SNAPSHOT.jar /opt/app/

CMD java -jar ./boot-dockery-kubey-1.0-SNAPSHOT.jar
