Generated by GWT WebAppCreator
==============================

Congratulations, you've successfully generated a starter project!  What next?

### How to create GWT application

    $ webAppCreator -noant -maven -XnoEclipse -out MyGwtWebApp org.mvnsearch.MyGwtWebApp

### Using Maven

If you have generated your project with the option '-maven', you have a 'pom.xml'
file ready to use. Assuming you have Maven installed in your system, 'mvn' is 
in your path, and you have access to maven repositories, you should be able to run:

mvn clean         # delete temporary stuff
mvn test          # run all the tests (gwt and junit)
mvn gwt:devmode   # run development mode (needs "mvn package" to be run before)
mvn package       # generate a .war package ready to deploy

For more information about other available goals, read Maven and gwt-maven-plugin 
documentation (http://maven.apache.org, https://tbroyer.github.io/gwt-maven-plugin/)