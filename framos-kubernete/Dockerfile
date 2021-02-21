FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ADD ./target/framos-kubernete-0.0.1-SNAPSHOT.jar framos-kubernete.jar
ENTRYPOINT ["java","-jar","/framos-kubernete.jar"]
