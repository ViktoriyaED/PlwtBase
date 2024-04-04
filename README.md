# J_Plwt project for automation testing


![](https://img.shields.io/badge/java-version%2017-blue?style=flat-square)
![](https://img.shields.io/badge/playwright-v.1.40.0-red?style=flat-square)
![](https://img.shields.io/badge/testng-v.7.9.0-success?style=flat-square)
![](https://img.shields.io/badge/allure-v.2.21.0-yellow?style=flat-square)
![](https://img.shields.io/badge/log4j-v.2.21.0-orange?style=flat-square)

---
* Project Description 

## Java | Playwright | TestNG | Log4j | Allure Report

---

## Installation Steps

- Before running the project locally, ensure that [Maven](https://maven.apache.org/download.cgi) and [Java 17](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html) are installed on your local machine.
- Clone the repository to your local machine.
- Create 'access.properties' and 'browser.properties' files using the templates located in the 'src/test/resources' directory
- Open the newly created file 'access.properties' and input the URL address.

## Languages and Frameworks

The project uses the following:

- *[Java 17](https://openjdk.org/projects/jdk/17/)* as the programming language.
- *[Maven](https://maven.apache.org/index.html)* as a builder and manager of project.
- *[Playwright](https://playwright.dev/)* as the framework for Web Testing and Automation.
- *[TestNG](https://testng.org/doc/)* as the Testing Framework.
- *[IntelliJ IDEA](https://www.jetbrains.com/idea/)* as the Integrated Development Environment.

## Project Structure

The project is structured as follows:

```
└───src
    └───test
        ├───java
        │   ├───pages     
        │   ├───runner
        │   └───tests
        │
        └───resources
```
## Project Features

####
* To ensure an organized and efficient approach to the testing process, the project has been structured using the **Page Object Model (POM)**.
  This design pattern allows for easy maintenance and scalability of the test framework, ensuring that any future changes or additions can be easily integrated into the existing structure.
####
* In order to provide comprehensive and insightful reports on the test results, the project utilizes **Allure Report**.
####
* After installation, a command can be used in the terminal to <b>run tests</b> locally: `mvn clean test`
####
* Generate local <b>Allure report</b>: `mvn allure:serve`
####
* Check the last Allure report on CI: [Allure Report]()

---