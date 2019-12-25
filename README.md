# scala-spring-api
Test Code for Running Scala in a Spring RESTful Framework.

Based off the following source https://dzone.com/articles/spring-web-services-with-scala .  Had to make a few changes to the directions specified there. Mainly:

1.	Took out the h2 config class and put the line “spring.h2.console.enabled=true” in application properties (source: https://www.baeldung.com/spring-boot-h2-database#h2-console)
2.	Had to make ID in the Entity class explicitly typed as a java.lang.Long and similarly type java.lang.Iterable for lists of users in the UserService.  There is probably a better way to do this.
3. Changed Security configurations for development purposes. Should be cvhanged prior to running in prod. 

