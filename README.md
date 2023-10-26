# spring-boot-internationalization


This is a Spring Boot project that demonstrates how to implement internationalization (i18n) in a web application. It allows you to display content in different languages by specifying the `lang` parameter in the URL.

## Prerequisites

- Java 21
- Apache Maven

## Getting Started

1. Clone the repository to your local machine:

   ```shell
   git clone https://github.com/abhay-ahire-ttpl/spring-boot-internationalization.git


2. Build the project using Maven

    ```shell
    mvn clean install

3. Run the Spring Boot application:
    ```shell
    java -jar target/spring-boot-internationalization-project.jar

OR

Run locally using below command:

    mvn spring-boot:run

4. Access the application in your browser at http://localhost:9191/welcome.

## Internationalization

The project uses Spring Boot's built-in internationalization support. You can specify the desired language by adding the lang parameter to the URL. For example:

* English: http://localhost:9191/welcome
* Polish: http://localhost:9191/welcome?lang=pl_PL
* French: http://localhost:9191/welcome?lang=fr_FR

The application will load language-specific properties files to display content in the chosen language.

## Language Properties

You can configure the text and messages for different languages in the resources directory. For each language, there should be a properties file named after the locale (e.g., messages_en_EN.properties, messages_pl_PL.properties, messages_fr_FR.properties).