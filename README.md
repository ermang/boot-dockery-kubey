# boot-dockery-kubey

just a simple spring-boot application


## 1.Requirements

jdk11  
maven  

## 2.How to build&run

### From cmd
cd to project_dir  
mvn package  
cd target  
java -jar boot-dockery-kubey-1.0-SNAPSHOT.jar --spring.profiles.active=local

### From IDE

open com.eg.boot.dockery.kubey.Application  
IDE should show a play icon at the class name. Click it  
you will get error, to set the profile =>  
near the play icon click Applicaton-> Edit Configurations set Program arguments  
--spring.profiles.active=local

### From Docker 

cd to project_dir  
mvn package  
docker build --tag boot-dockery-kubey:1.0 .  
docker run -it --rm -e SPRING_PROFILES_ACTIVE=local -p 8080:8080 boot-dockery-kubey:1.0


