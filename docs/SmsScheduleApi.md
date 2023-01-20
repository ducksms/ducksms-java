# SmsScheduleApi

All URIs are relative to *https://ducksms.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelSmsSchedule**](SmsScheduleApi.md#cancelSmsSchedule) | **DELETE** /api/v1/sms/scheduled/{id} | Cancel Sms Schedule
[**listSmsSchedule**](SmsScheduleApi.md#listSmsSchedule) | **GET** /api/v1/sms/scheduled | List Sms Schedule


<a name="cancelSmsSchedule"></a>
# **cancelSmsSchedule**
> CancelSmsSchedule cancelSmsSchedule(id)

Cancel Sms Schedule

Cancel existing sms schedule

### Example
```java
// Import classes:
import com.ducksms.client.ApiClient;
import com.ducksms.client.ApiException;
import com.ducksms.client.Configuration;
import com.ducksms.client.auth.*;
import com.ducksms.client.models.*;
import com.ducksms.client.api.SmsScheduleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ducksms.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    SmsScheduleApi apiInstance = new SmsScheduleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CancelSmsSchedule result = apiInstance.cancelSmsSchedule(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsScheduleApi#cancelSmsSchedule");
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
 **id** | **String**|  |

### Return type

[**CancelSmsSchedule**](CancelSmsSchedule.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Cancel existing sms schedule |  -  |
**400** | Invalid request |  -  |
**401** | Unauthenticated |  -  |
**404** | No data found |  -  |
**500** | Server error |  -  |

<a name="listSmsSchedule"></a>
# **listSmsSchedule**
> ListSmsSchedule listSmsSchedule(page, filterSenderName, filterType, filterMessageType, filterStatus)

List Sms Schedule

List all the sms schedule

### Example
```java
// Import classes:
import com.ducksms.client.ApiClient;
import com.ducksms.client.ApiException;
import com.ducksms.client.Configuration;
import com.ducksms.client.auth.*;
import com.ducksms.client.models.*;
import com.ducksms.client.api.SmsScheduleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ducksms.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    SmsScheduleApi apiInstance = new SmsScheduleApi(defaultClient);
    Integer page = 1; // Integer | Page number
    String filterSenderName = DUCKSMS; // String | Filter by sender id name
    String filterType = quick; // String | Filter by sms type
    String filterMessageType = ascii; // String | Filter by sms message type
    String filterStatus = pending; // String | Filter by sms status
    try {
      ListSmsSchedule result = apiInstance.listSmsSchedule(page, filterSenderName, filterType, filterMessageType, filterStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsScheduleApi#listSmsSchedule");
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
 **page** | **Integer**| Page number | [optional]
 **filterSenderName** | **String**| Filter by sender id name | [optional]
 **filterType** | **String**| Filter by sms type | [optional] [enum: quick, bulk]
 **filterMessageType** | **String**| Filter by sms message type | [optional] [enum: ascii, unicode]
 **filterStatus** | **String**| Filter by sms status | [optional] [enum: pending, processing, completed, failed, cancelled]

### Return type

[**ListSmsSchedule**](ListSmsSchedule.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List all the sms schedule |  * X-Pagination-Count - Total data count <br>  * X-Pagination-Page - Pagination page number <br>  * X-Pagination-Limit - Pagination limit per page <br>  |
**400** | Invalid request |  -  |
**401** | Unauthenticated |  -  |
**404** | No data found |  -  |
**500** | Server error |  -  |

