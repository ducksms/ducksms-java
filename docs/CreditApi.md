# CreditApi

All URIs are relative to *https://ducksms.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**creditBalance**](CreditApi.md#creditBalance) | **GET** /api/v1/credits/balance | Credit Balance
[**creditHistory**](CreditApi.md#creditHistory) | **GET** /api/v1/credits/history | Credit History


<a name="creditBalance"></a>
# **creditBalance**
> CreditBalance creditBalance()

Credit Balance

Get available credit balance

### Example
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

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreditBalance**](CreditBalance.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get available credit balance |  -  |
**400** | Invalid request |  -  |
**401** | Unauthenticated |  -  |
**500** | Server error |  -  |

<a name="creditHistory"></a>
# **creditHistory**
> CreditHistory creditHistory(page, filterType, filterSmsSmsid)

Credit History

Get all credit history

### Example
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
    Integer page = 1; // Integer | Page number
    String filterType = credit; // String | Filter by credit type
    Integer filterSmsSmsid = 1009771270; // Integer | Filter by sms id
    try {
      CreditHistory result = apiInstance.creditHistory(page, filterType, filterSmsSmsid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditApi#creditHistory");
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
 **filterType** | **String**| Filter by credit type | [optional] [enum: credit, charge, pending, freeze, bonus]
 **filterSmsSmsid** | **Integer**| Filter by sms id | [optional]

### Return type

[**CreditHistory**](CreditHistory.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List all the credit history |  * X-Pagination-Count - Total data count <br>  * X-Pagination-Page - Pagination page number <br>  * X-Pagination-Limit - Pagination limit per page <br>  |
**400** | Invalid request |  -  |
**401** | Unauthenticated |  -  |
**404** | No data found |  -  |
**500** | Server error |  -  |

