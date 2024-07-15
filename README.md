# Beeceptor API Testing with RestAssured and TestNG

![image](https://github.com/user-attachments/assets/cf3a1a6a-6797-4603-8345-df9418f57d00)


## Introduction

This project includes test cases for various HTTP methods such as GET, POST, DELETE, and PUT on the Beeceptor mock API. The tests are designed to ensure the API endpoints are functioning as expected.

## Prerequisites
- IDE (e.g., IntelliJ, Eclipse, Springtool Suite)

## Dependencies

Add the following dependencies in our `pom.xml`:

<dependencies>
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>4.3.3</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.4.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>com.googlecode.json-simple</groupId>
        <artifactId>json-simple</artifactId>
        <version>1.1.1</version>
    </dependency>
</dependencies>

## Test Cases

getHooks: Fetches all hooks.

scheduleHook: Schedules a new hook.

getHook: Fetches a specific hook by ID.

deleteHook: Deletes a specific hook by ID.

updateHook: Updates a hook with new information.
