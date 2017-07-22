# jax-rs-rest-service
Simple Server and Rest Service using jax-rs and jetty

This project combines my simple server project and JAX-RS to create a simple project structure that has a basic web server and two services. To run, clone repo and navigate to the root directory and run `gradle cleanEclipse eclipse build` to gather the dependencies. Then import the project into eclipse. Navigate to SimpleServer/src/main/java/JettyServer.java. Run JettyServer.java and then navigate to http://localhost:8080/hello/response and http://localhost:8080/goodbye/response to see the responses to the two services. 
