# Stage 1: Download and extract OpenJDK 21
FROM openjdk:21-jdk-slim as openjdk_stage

# Stage 2: Build your final image
FROM mongo:latest

# Copy OpenJDK 21 from the previous stage
COPY --from=openjdk_stage /usr/local/openjdk-21 /usr/local/openjdk-21

# Set the JAVA_HOME environment variable
ENV JAVA_HOME=/usr/local/openjdk-21

# Update the PATH environment variable to include the Java bin directory
ENV PATH="$PATH:$JAVA_HOME/bin"

# Expose the MongoDB port
EXPOSE 27017

# Start the MongoDB server
CMD ["mongod"]
