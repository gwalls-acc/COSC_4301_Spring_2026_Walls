# Name: Gloria Walls
# Instructor: Professor Jon-Mikel Pearson
# Assignment: Project 1
# Due Date 02/14/2026
# Course/Section:  COSC 4301 -Section 1
# FileName: Dockerfile

# Use a lightweight JDK image
FROM eclipse-temurin:17-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the Java files into the container
COPY . /app

# Compile the Java file
RUN javac *.java

# Run the compiled program
CMD ["java", "Main"]