FROM openjdk:11.0.4-jre-slim

RUN mkdir /app

WORKDIR /app

ADD ./target/info-1.0-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "info-1.0-SNAPSHOT.jar"]

# test travis