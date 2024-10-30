# Fase 1: Build do projeto
FROM maven:3.9.1-openjdk-11 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# Fase 2: Execução com Tomcat
FROM tomcat:10.1.19-jdk11

COPY --from=build /app/target/Crud.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
