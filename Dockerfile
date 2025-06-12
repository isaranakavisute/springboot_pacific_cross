FROM maven:3.9.8-eclipse-temurin-21 AS builder

WORKDIR /usr/app/
COPY . /usr/app
RUN mvn package -Dmaven.test.skip
RUN JAR_FILE="target/*.jar"; cp ${JAR_FILE} /app.jar

FROM openjdk:21
WORKDIR /usr/app
COPY --from=builder /app.jar /usr/app
EXPOSE 8080

CMD ["java","-jar","app.jar"]
