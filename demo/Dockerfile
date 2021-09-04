FROM openjdk:11-jdk
VOLUME /tmp
COPY target/demo-*.jar appK8s.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/appK8s.jar"]