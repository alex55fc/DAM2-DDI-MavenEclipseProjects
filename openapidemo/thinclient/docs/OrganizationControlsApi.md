# OrganizationControlsApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDepartment**](OrganizationControlsApi.md#createDepartment) | **POST** /api/departments | 
[**createEmployee**](OrganizationControlsApi.md#createEmployee) | **POST** /api/employees | 
[**getAllDepartments**](OrganizationControlsApi.md#getAllDepartments) | **GET** /api/departments | 
[**getAllEmployees**](OrganizationControlsApi.md#getAllEmployees) | **GET** /api/employees | If departmentId is not passed, get all employees. Otherwise get employees from specific department.
[**getDepartment**](OrganizationControlsApi.md#getDepartment) | **GET** /api/departments/{id} | 
[**getEmployee**](OrganizationControlsApi.md#getEmployee) | **GET** /api/employees/{id} | 
[**updateEmployee**](OrganizationControlsApi.md#updateEmployee) | **PUT** /api/employees | 



## createDepartment

> String createDepartment(department)



### Example

```java
// Import classes:
import com.xyz.openapi.thinclient.invoker.ApiClient;
import com.xyz.openapi.thinclient.invoker.ApiException;
import com.xyz.openapi.thinclient.invoker.Configuration;
import com.xyz.openapi.thinclient.invoker.models.*;
import com.xyz.openapi.thinclient.api.OrganizationControlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        OrganizationControlsApi apiInstance = new OrganizationControlsApi(defaultClient);
        Department department = new Department(); // Department | 
        try {
            String result = apiInstance.createDepartment(department);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationControlsApi#createDepartment");
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
 **department** | [**Department**](Department.md)|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createEmployee

> String createEmployee(UNKNOWN_BASE_TYPE)



### Example

```java
// Import classes:
import com.xyz.openapi.thinclient.invoker.ApiClient;
import com.xyz.openapi.thinclient.invoker.ApiException;
import com.xyz.openapi.thinclient.invoker.Configuration;
import com.xyz.openapi.thinclient.invoker.models.*;
import com.xyz.openapi.thinclient.api.OrganizationControlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        OrganizationControlsApi apiInstance = new OrganizationControlsApi(defaultClient);
        UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE = new UNKNOWN_BASE_TYPE(); // UNKNOWN_BASE_TYPE | 
        try {
            String result = apiInstance.createEmployee(UNKNOWN_BASE_TYPE);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationControlsApi#createEmployee");
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
 **UNKNOWN_BASE_TYPE** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getAllDepartments

> List&lt;Department&gt; getAllDepartments()



### Example

```java
// Import classes:
import com.xyz.openapi.thinclient.invoker.ApiClient;
import com.xyz.openapi.thinclient.invoker.ApiException;
import com.xyz.openapi.thinclient.invoker.Configuration;
import com.xyz.openapi.thinclient.invoker.models.*;
import com.xyz.openapi.thinclient.api.OrganizationControlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        OrganizationControlsApi apiInstance = new OrganizationControlsApi(defaultClient);
        try {
            List<Department> result = apiInstance.getAllDepartments();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationControlsApi#getAllDepartments");
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

[**List&lt;Department&gt;**](Department.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getAllEmployees

> EmployeeList getAllEmployees(deptId)

If departmentId is not passed, get all employees. Otherwise get employees from specific department.

### Example

```java
// Import classes:
import com.xyz.openapi.thinclient.invoker.ApiClient;
import com.xyz.openapi.thinclient.invoker.ApiException;
import com.xyz.openapi.thinclient.invoker.Configuration;
import com.xyz.openapi.thinclient.invoker.models.*;
import com.xyz.openapi.thinclient.api.OrganizationControlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        OrganizationControlsApi apiInstance = new OrganizationControlsApi(defaultClient);
        String deptId = "deptId_example"; // String | 
        try {
            EmployeeList result = apiInstance.getAllEmployees(deptId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationControlsApi#getAllEmployees");
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
 **deptId** | **String**|  | [optional]

### Return type

[**EmployeeList**](EmployeeList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Internal Server Error |  -  |
| **200** | OK |  -  |


## getDepartment

> Department getDepartment(id)



### Example

```java
// Import classes:
import com.xyz.openapi.thinclient.invoker.ApiClient;
import com.xyz.openapi.thinclient.invoker.ApiException;
import com.xyz.openapi.thinclient.invoker.Configuration;
import com.xyz.openapi.thinclient.invoker.models.*;
import com.xyz.openapi.thinclient.api.OrganizationControlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        OrganizationControlsApi apiInstance = new OrganizationControlsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            Department result = apiInstance.getDepartment(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationControlsApi#getDepartment");
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

[**Department**](Department.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getEmployee

> OneOfContractEmployeeRegularEmployee getEmployee(id)



### Example

```java
// Import classes:
import com.xyz.openapi.thinclient.invoker.ApiClient;
import com.xyz.openapi.thinclient.invoker.ApiException;
import com.xyz.openapi.thinclient.invoker.Configuration;
import com.xyz.openapi.thinclient.invoker.models.*;
import com.xyz.openapi.thinclient.api.OrganizationControlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        OrganizationControlsApi apiInstance = new OrganizationControlsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            OneOfContractEmployeeRegularEmployee result = apiInstance.getEmployee(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationControlsApi#getEmployee");
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

[**OneOfContractEmployeeRegularEmployee**](OneOfContractEmployeeRegularEmployee.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateEmployee

> String updateEmployee(UNKNOWN_BASE_TYPE)



### Example

```java
// Import classes:
import com.xyz.openapi.thinclient.invoker.ApiClient;
import com.xyz.openapi.thinclient.invoker.ApiException;
import com.xyz.openapi.thinclient.invoker.Configuration;
import com.xyz.openapi.thinclient.invoker.models.*;
import com.xyz.openapi.thinclient.api.OrganizationControlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        OrganizationControlsApi apiInstance = new OrganizationControlsApi(defaultClient);
        UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE = new UNKNOWN_BASE_TYPE(); // UNKNOWN_BASE_TYPE | 
        try {
            String result = apiInstance.updateEmployee(UNKNOWN_BASE_TYPE);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationControlsApi#updateEmployee");
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
 **UNKNOWN_BASE_TYPE** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

