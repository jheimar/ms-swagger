FROM openjdk:11.0-jdk
ENV APP_FILE swagger-example-1.0.0.jar
ENV APP_HOME /usr/app
EXPOSE 8080
COPY swagger-example/target/*.jar $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]