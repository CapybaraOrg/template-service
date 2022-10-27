FROM amazoncorretto:17.0.5

USER nobody

ARG JAR_FILE=build/libs/template-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
