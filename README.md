# jax-rs-rest-service
Simple Server and Rest Service using jax-rs and jetty

### Requirements:<br>
Java 8 - v1.8.0_92 or later<br>
Gradle build tool<br>

This project contains everything you need to create and start a simple web server that uses Jax-RS rest services. To test, fork and clone this repository. Ensure you have gradle installed on your machine(https://gradle.org/install/) and navigate to the base project directory. 

This project combines my simple server project and JAX-RS to create a simple project structure that has a basic web server and two services. 

To run:<br>
Run `$ chmod 700 run.sh`<br>
Run `$ ./run.sh` to build project <br>
<b>OR</b><br>
Run `$ ./run.sh start` to both build project and start the simple server<br>

If you want to build the project on your own, run `$ gradle cleanEclipse eclipse build fatJar`. This will build the jar and in the <b>SimpleServer/build/libs</b> called project-jar.jar and you can run the jar on your own using `$ java -jar SimpleServer/build/libs/project-jar.jar` You may also bring the project up in eclipse and run the SimpleServer.java class.

Navigate to SimpleServer/src/main/java/JettyServer.java. Run JettyServer.java and then navigate to http://localhost:8080/hello/response and http://localhost:8080/goodbye/response to see the responses to the two services. 
