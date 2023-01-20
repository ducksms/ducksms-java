# SmsApi

All URIs are relative to *https://ducksms.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**smsSend**](SmsApi.md#smsSend) | **POST** /api/v1/sms/send | Send Sms


<a name="smsSend"></a>
# **smsSend**
> PreviewSmsSend smsSend(smsSchema)

Send Sms

Create a new sms

### Example
```java
// Import classes:
import com.ducksms.client.ApiClient;
import com.ducksms.client.ApiException;
import com.ducksms.client.Configuration;
import com.ducksms.client.auth.*;
import com.ducksms.client.models.*;
import com.ducksms.client.api.SmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ducksms.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    SmsApi apiInstance = new SmsApi(defaultClient);
    SmsSchema smsSchema = new SmsSchema(); // SmsSchema | Create a new sms
    try {
      PreviewSmsSend result = apiInstance.smsSend(smsSchema);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsApi#smsSend");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsSchema** | [**SmsSchema**](SmsSchema.md)| Create a new sms | [optional]

### Return type

[**PreviewSmsSend**](PreviewSmsSend.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Sms preview |  -  |
**201** | Sms created |  -  |
**400** | Invalid request |  -  |
**401** | Unauthenticated |  -  |
**422** | Validation errors |  -  |
**500** | Server error |  -  |

