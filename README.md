# ducksms-java

Ducksms
- API version: 1.0.0
  - Build date: 2023-01-20T08:27:51.507139Z[Etc/UTC]

Ducksms is a leading SMS messaging service provider offering one-way SMS communication services from your internet enabled computer. The API allow you to directly communicate and manage a SMS with our SMS gateway system.

  For more information, please visit [https://ducksms.com/](https://ducksms.com/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ducksms</groupId>
  <artifactId>ducksms-java</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ducksms:ducksms-java:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ducksms-java-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.ducksms.client.ApiClient;
import com.ducksms.client.ApiException;
import com.ducksms.client.Configuration;
import com.ducksms.client.auth.*;
import com.ducksms.client.models.*;
import com.ducksms.client.api.CreditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ducksms.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    CreditApi apiInstance = new CreditApi(defaultClient);
    try {
      CreditBalance result = apiInstance.creditBalance();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditApi#creditBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```


## Documentation for API Endpoints

All URIs are relative to *https://ducksms.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CreditApi* | [**creditBalance**](docs/CreditApi.md#creditBalance) | **GET** /api/v1/credits/balance | Credit Balance
*CreditApi* | [**creditHistory**](docs/CreditApi.md#creditHistory) | **GET** /api/v1/credits/history | Credit History
*SenderIdApi* | [**createSender**](docs/SenderIdApi.md#createSender) | **POST** /api/v1/senders | Create a Sender ID
*SenderIdApi* | [**deleteSender**](docs/SenderIdApi.md#deleteSender) | **DELETE** /api/v1/senders/{id} | Delete a Sender ID
*SenderIdApi* | [**getSender**](docs/SenderIdApi.md#getSender) | **GET** /api/v1/senders/{id} | Get a single Sender ID
*SenderIdApi* | [**listSender**](docs/SenderIdApi.md#listSender) | **GET** /api/v1/senders | List Sender ID
*SenderIdApi* | [**updateSender**](docs/SenderIdApi.md#updateSender) | **POST** /api/v1/senders/{id} | Update a Sender ID
*SmsApi* | [**smsSend**](docs/SmsApi.md#smsSend) | **POST** /api/v1/sms/send | Send Sms
*SmsScheduleApi* | [**cancelSmsSchedule**](docs/SmsScheduleApi.md#cancelSmsSchedule) | **DELETE** /api/v1/sms/scheduled/{id} | Cancel Sms Schedule
*SmsScheduleApi* | [**listSmsSchedule**](docs/SmsScheduleApi.md#listSmsSchedule) | **GET** /api/v1/sms/scheduled | List Sms Schedule


## Documentation for Models

 - [CancelSmsSchedule](docs/CancelSmsSchedule.md)
 - [CreatedSender](docs/CreatedSender.md)
 - [CreatedSmsSend](docs/CreatedSmsSend.md)
 - [CreditBalance](docs/CreditBalance.md)
 - [CreditHistory](docs/CreditHistory.md)
 - [DeletedSender](docs/DeletedSender.md)
 - [ErrorException](docs/ErrorException.md)
 - [ErrorInvalidRequest](docs/ErrorInvalidRequest.md)
 - [ErrorNotFound](docs/ErrorNotFound.md)
 - [ErrorUnauthenticated](docs/ErrorUnauthenticated.md)
 - [ErrorValidation](docs/ErrorValidation.md)
 - [GetSender](docs/GetSender.md)
 - [ListSender](docs/ListSender.md)
 - [ListSmsSchedule](docs/ListSmsSchedule.md)
 - [PreviewSmsSend](docs/PreviewSmsSend.md)
 - [Sender](docs/Sender.md)
 - [SmsSchema](docs/SmsSchema.md)
 - [UpdatedSender](docs/UpdatedSender.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BearerToken

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
