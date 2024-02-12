# Agile Software Development Camp (ASD-200-CMP)
## Java Cucumber Example using Gradle
All build and test commands can be run using the Makefile. For instance "make test" will run all unit tests. "make verify" will run all Cucumber tests.  

This example has a shell implementation for the case study, with one simple scenario implemented with failing acceptance tests. The output of these tests, with an example if living documentation and images, is exported to the output folder and published to GitHub pages on push to the develop branch.

For more information on how to use Cucumber and Specification by Example Tables, see https://www.baeldung.com/cucumber-data-tables. 

The UI is implemented using springshell in LevelUpGame.java. See https://docs.spring.io/spring-shell/docs/2.0.1.RELEASE/reference/htmlsingle/  To change the banner that displays when the app starts, edit src/main/resources/banner.txt. To change the prompt, change src/main/java/cli/LevelUpPrompt.java.

To run, 'make build', then 'make run'. LevelUpMain contains the main method for the application. LevelUpGame contains the commands and routing. GameController is the domaincontroller.



