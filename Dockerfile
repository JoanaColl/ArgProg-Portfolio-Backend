FROM amazoncorretto:11
MAINTAINER JC
COPY target/jc-0.0.1-SNAPSHOT.jar jc-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jc-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080