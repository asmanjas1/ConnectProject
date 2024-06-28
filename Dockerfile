From openjdk:17
WORKDIR /app
COPY ./target/ConnectProject-1.0-SNAPSHOT.jar /app
EXPOSE 8091
CMD ["java", "-jar", "ConnectProject-1.0-SNAPSHOT.jar"]