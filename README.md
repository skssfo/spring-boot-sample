# spring-boot-sample

Sample code that uses Spring boot and Spring MVC to build a service that supports performing basic CRUD operations with REST API.

# API
* GET /topics
* GET /topics/{topicId}
* POST /topics
* PUT /topics/{topicId}
* DELETE /topics/{topicId}

# How to build
* mvn install - producer a .jar file without any dependencies included
* mvn package spring-boot:repackage - producer a uber .jar with all dependencies included

# How to run
* Producer the uber .jar
* java -jar target/samples-1.0.0-SNAPSHOT.jar
* The service listens on port 8080 for HTTP requests. 
* Example, HTTP GET to http://localhost:8080/topics returns a json response with a list of topics
* When sending PUT/POST requests, make sure to set the 'Content-Type' request header to 'application/json'
* Postman chrome extension can be used to test
