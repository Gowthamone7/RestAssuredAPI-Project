# Rest Assured API Project

A Java-based API automation practice project using **REST Assured**, **TestNG**, and **Maven**. The test suite demonstrates how to send HTTP requests, validate response status codes and JSON content, work with request bodies, and verify API response schemas.

## What is covered

- GET requests with response body and field assertions
- POST requests with JSON request payloads
- PUT, PATCH, and DELETE operations
- Status code, header, content type, and response-time inspection
- JSON Schema validation
- Assertions using Hamcrest matchers
- Tests against the public [ReqRes API](https://reqres.in/)
- Optional CRUD tests against a local API at `http://localhost:3000`

## Technology stack

- Java
- Maven
- REST Assured 7.0.0-RC1
- TestNG 7.12.0
- JSON Simple
- REST Assured JSON Schema Validator

## Project structure

```text
RestAssuredAPI-Project/
└── RestAssuredAutomationPractice/
    ├── pom.xml
    └── src/test/java/tests/
        ├── GetAndPostExamples.java
        ├── JSONSchemaValidator.java
        ├── PutPatchExample.java
        ├── SoapXmlResponse.java
        ├── TestEx1.java
        └── TestonlocalAPI.java
```

## Prerequisites

- JDK 8 or later
- Apache Maven
- Internet access for the ReqRes tests
- A locally running API at `http://localhost:3000` for the local API tests

## Run the tests

From the Maven project directory:

```bash
cd RestAssuredAPI-Project/RestAssuredAutomationPractice
mvn test
```

To run an individual TestNG class:

```bash
mvn -Dtest=GetAndPostExamples test
```

## Notes

The ReqRes examples use public test endpoints and may depend on the availability or behavior of that service. The local API tests are intended for a separately running service and should be enabled or executed only when that service is available.
