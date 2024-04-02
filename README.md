# J_Plwt project for automation testing

---
* Project Description 

## Java | Playwright | TestNG | Log4j | Allure Report

---

## Installation Steps

- Before running the project locally, ensure that [Maven](https://maven.apache.org/download.cgi) and [Java 17](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html) are installed on your local machine.
- Clone the repository to your local machine.
- Duplicate the file 'access.properties.TEMPLATE' and 'browser.properties.TEMPLATE' found in the 'src/test/resources' directory.
- Save this duplicate in the same location, removing the '.TEMPLATE' extension from its name.
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

```bash
📦:.
|___test
    |___java
    |     |___pages
    |     |___runner
    |     |___tests
    |___resources
    

```
## Project Features

####
* To ensure an organized and efficient approach to the testing process, the project has been structured using the Page Object Model (POM).
  This design pattern allows for easy maintenance and scalability of the test framework, ensuring that any future changes or additions can be easily integrated into the existing structure.
####
* In order to provide comprehensive and insightful reports on the test results, the project utilizes Allure Report.
####
* Go to the resources package and copy the file access.properties.TEMPLATE and browser.properties.TEMPLATE.
  Paste it into the resources package and rename the new file to access.properties and browser.properties.
####
* After installation, a command can be used in the terminal to <b>run the tests</b> locally: `mvn clean test`
####
* Generate local <b>allure report</b>: `mvn allure:serve`
####
* Check the last allure report on CI: [Allure Report]()

---
![](https://img.shields.io/badge/java-version%2017-blue?style=flat-square)
![](https://img.shields.io/badge/playwright-v.1.40.0-red?style=flat-square)
![](https://img.shields.io/badge/testng-v.7.9.0-success?style=flat-square)
![](https://img.shields.io/badge/allure-v.2.21.0-yellow?style=flat-square)
![](https://img.shields.io/badge/log4j-v.2.21.0-orange?style=flat-square)