FROM openjdk:11
EXPOSE 8060
ADD target/cicd-demo6.jar cicd-demo6.jar
ENTRYPOINT ["java","-jar","/cicd-demo6.jar"]