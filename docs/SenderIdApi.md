# SenderIdApi

All URIs are relative to *https://ducksms.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSender**](SenderIdApi.md#createSender) | **POST** /api/v1/senders | Create a Sender ID
[**deleteSender**](SenderIdApi.md#deleteSender) | **DELETE** /api/v1/senders/{id} | Delete a Sender ID
[**getSender**](SenderIdApi.md#getSender) | **GET** /api/v1/senders/{id} | Get a single Sender ID
[**listSender**](SenderIdApi.md#listSender) | **GET** /api/v1/senders | List Sender ID
[**updateSender**](SenderIdApi.md#updateSender) | **POST** /api/v1/senders/{id} | Update a Sender ID


<a name="createSender"></a>
# **createSender**
> CreatedSender createSender(sender)

Create a Sender ID

Create a new sender id

### Example
```java
// Import classes:
import com.ducksms.client.ApiClient;
import com.ducksms.client.ApiException;
import com.ducksms.client.Configuration;
import com.ducksms.client.auth.*;
import com.ducksms.client.models.*;
import com.ducksms.client.api.SenderIdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ducksms.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    SenderIdApi apiInstance = new SenderIdApi(defaultClient);
    Sender sender = new Sender(); // Sender | Create a new sender
    try {
      CreatedSender result = apiInstance.createSender(sender);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderIdApi#createSender");
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
 **sender** | [**Sender**](Sender.md)| Create a new sender | [optional]

### Return type

[**CreatedSender**](CreatedSender.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Sender ID created |  -  |
**400** | Invalid request |  -  |
**401** | Unauthenticated |  -  |
**422** | Validation errors |  -  |
**500** | Server error |  -  |

<a name="deleteSender"></a>
# **deleteSender**
> DeletedSender deleteSender(id)

Delete a Sender ID

Delete an existing sender id

### Example
```java
// Import classes:
import com.ducksms.client.ApiClient;
import com.ducksms.client.ApiException;
import com.ducksms.client.Configuration;
import com.ducksms.client.auth.*;
import com.ducksms.client.models.*;
import com.ducksms.client.api.SenderIdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ducksms.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    SenderIdApi apiInstance = new SenderIdApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      DeletedSender result = apiInstance.deleteSender(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderIdApi#deleteSender");
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

[**DeletedSender**](DeletedSender.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Sender deleted |  -  |
**400** | Invalid request |  -  |
**401** | Unauthenticated |  -  |
**404** | No data found |  -  |
**500** | Server error |  -  |

<a name="getSender"></a>
# **getSender**
> GetSender getSender(id)

Get a single Sender ID

Get details on a single sender id

### Example
```java
// Import classes:
import com.ducksms.client.ApiClient;
import com.ducksms.client.ApiException;
import com.ducksms.client.Configuration;
import com.ducksms.client.auth.*;
import com.ducksms.client.models.*;
import com.ducksms.client.api.SenderIdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ducksms.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    SenderIdApi apiInstance = new SenderIdApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetSender result = apiInstance.getSender(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderIdApi#getSender");
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

[**GetSender**](GetSender.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get details on a single sender |  -  |
**400** | Invalid request |  -  |
**401** | Unauthenticated |  -  |
**404** | No data found |  -  |
**500** | Server error |  -  |

<a name="listSender"></a>
# **listSender**
> ListSender listSender(page, filterName, filterStatus)

List Sender ID

List all the senders

### Example
```java
// Import classes:
import com.ducksms.client.ApiClient;
import com.ducksms.client.ApiException;
import com.ducksms.client.Configuration;
import com.ducksms.client.auth.*;
import com.ducksms.client.models.*;
import com.ducksms.client.api.SenderIdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ducksms.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    SenderIdApi apiInstance = new SenderIdApi(defaultClient);
    Integer page = 1; // Integer | Page number
    String filterName = DUCKSMS; // String | Filter by sender name
    String filterStatus = active; // String | Filter by sender status
    try {
      ListSender result = apiInstance.listSender(page, filterName, filterStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderIdApi#listSender");
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
 **filterName** | **String**| Filter by sender name | [optional]
 **filterStatus** | **String**| Filter by sender status | [optional] [enum: active, inactive]

### Return type

[**ListSender**](ListSender.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List all the senders |  * X-Pagination-Count - Total data count <br>  * X-Pagination-Page - Pagination page number <br>  * X-Pagination-Limit - Pagination limit per page <br>  |
**400** | Invalid request |  -  |
**401** | Unauthenticated |  -  |
**404** | No data found |  -  |
**500** | Server error |  -  |

<a name="updateSender"></a>
# **updateSender**
> UpdatedSender updateSender(id, sender)

Update a Sender ID

Update an existing sender id

### Example
```java
// Import classes:
import com.ducksms.client.ApiClient;
import com.ducksms.client.ApiException;
import com.ducksms.client.Configuration;
import com.ducksms.client.auth.*;
import com.ducksms.client.models.*;
import com.ducksms.client.api.SenderIdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ducksms.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    SenderIdApi apiInstance = new SenderIdApi(defaultClient);
    String id = "id_example"; // String | 
    Sender sender = new Sender(); // Sender | Update an existing sender id
    try {
      UpdatedSender result = apiInstance.updateSender(id, sender);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderIdApi#updateSender");
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
 **sender** | [**Sender**](Sender.md)| Update an existing sender id | [optional]

### Return type

[**UpdatedSender**](UpdatedSender.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Sender updated |  -  |
**400** | Invalid request |  -  |
**401** | Unauthenticated |  -  |
**404** | No data found |  -  |
**422** | Validation errors |  -  |
**500** | Server error |  -  |

