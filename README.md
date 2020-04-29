# WebUiTestAutomationCucumber
Web User Interface Test Automation Portfolio Project to demonstrate automation of test in an online shopping site 
using Selenium Webdriver and cucumber (specifically for Chrome browser) with java as the base programming language

src/Features folder contains cucumber .feature files for each individual feature test for the online web site

src/test/java/Base contains the Base utility classes used for feature step definitions

src/test/java/com/jechrz/defs contains hook file used for each feature scenario run and corresponding step definition files for each .feature file under src/Features

Code applies Dependency Injection to reduce tight coupling with page objects when being rendered by each test scenario (see BaseUtil file)
