Coding Exercise - Selenium Cucumber using SpringBoot
=====================================================
Framework uses spring boot with selenium webdriver and BDD with cucumber framework.

Spring related Annotations used:

@SpringBootApplication
marks a configuration class that declares one or more @Bean methods and also enables
component scanning in the entire project Structure and also enables auto-configuration.

@CucumberContextConfiguration
Configure an application context class for cucumber to use.

@SpringBootTest(classes = SpringBootBasicApplication.class)
Helps Spring boot to look for main configuration class (one with annotation @SpringBootApplication).

@Component
Spring will scan project for classes annotated with @Component . Instantiate them and
inject any specified dependencies into them. We dont have to write explicit code to Instantiate class objects.

@Value
This is used to assign default values to variables and method arguments. It is used for injecting values
into configuration variables.

@Autowired
It is used to inject object dependency implicitly. It can be used at constructor and field level.

Pre-requisites
==============
1) Java 1.8 or later (for core programming language)
2) Maven 3.8+ (for dependency management)

Getting Started
===============
Clone project from git repo
open project in Intellij
Run below command in terminal
mvn clean test