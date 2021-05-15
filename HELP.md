# Read Me First
The following was discovered as part of building this project:
* The original package name 'com.example.graphql-starter-vehicle' is invalid and this project uses 'com.example.graphqlstartervehicle' instead.

# [GENERAL] Getting Started
For further reference, please consider the following sections:
### Reference Documentation

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.4/maven-plugin/reference/html/#build-image)

# ABOUT THIS PROJECT


-Source Tutorial: <br>[GraphQL Java Example for Beginners [Spring Boot]](https://dzone.com/articles/a-beginners-guide-to-graphql-with-spring-boot)

-<br>[Git Repo](https://github.com/swathisprasad/graphql-with-spring-boot)
# Major issues faced:

(1) I had a trouble configuring H2 Database like below <br><br>
Error Message
```
***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class


Action:

Consider the following:
    If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
    If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).
```
Solution: I removed all Unwanted Maven dependencies around H2, JPA, that were auto-attempting to create a DB<br><br> 
<br><br>Error message: 
```
If you want an embedded database please put a supported one on the classpath. If you have database settings to be loaded from a particular profile you may need to active it (no profiles are currently active).
```
Solution: I created my own InMemory Map based repository. I had to explicitly add a line in application.properties (as suggested in https://www.fatalerrors.org/a/0ttx0Q.html) and 

# HOW TO TEST
Run the Spring Boot application
Open this link — http://localhost:8080/graphiql — in the browser.