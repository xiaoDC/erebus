FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/erebus.jar /erebus/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/erebus/app.jar"]
