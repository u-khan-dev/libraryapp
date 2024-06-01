FROM openjdk:22

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/sampleproject-0.0.1-SNAPSHOT.jar /app/sampleproject-0.0.1-SNAPSHOT.jar

# Expose the port your application runs on
EXPOSE 8080

# Command to run your application
CMD ["java", "-jar", "sampleproject-0.0.1-SNAPSHOT.jar"]
