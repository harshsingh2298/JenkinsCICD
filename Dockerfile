# Use an official OpenJDK image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /opt

# Set environment variable for the port
ENV PORT 9035

# Expose the port that Spring Boot will run on
EXPOSE 8080

# Copy the JAR file from the target directory into the container
COPY target/demo-0.0.1-SNAPSHOT.jar /opt/demo-0.0.1-SNAPSHOT.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
