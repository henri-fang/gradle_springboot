FROM openjdk:8-jre-stretch
MAINTAINER Ming Fang (tushuguanwc)
EXPOSE 8080
RUN mkdir /app
WORKDIR /app
ADD ./run.sh /app/
ADD ./build/libs/springboot-app.jar /app/lib/
CMD ["./run.sh", "/app/lib/springboot-app.jar"]
