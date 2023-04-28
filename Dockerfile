FROM openjdk:17
EXPOSE 8585
ADD build/libs/com.hdfc.capstoneproject.employeeinformation.jar com.hdfc.capstoneproject.employeeinformation.jar
ENTRYPOINT ["java","-jar","/com.hdfc.capstoneproject.employeeinformation.jar"]


#FROM openjdk:17-jdk-alpine
#WORKDIR /app
#COPY build/libs/com.hdfc.capstoneproject.employeeinformation.jar .
#ENTRYPOINT ["java","-jar","com.hdfc.capstoneproject.employeeinformation.jar"]