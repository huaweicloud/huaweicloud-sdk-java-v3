English | [简体中文](README_CN.md)

# HuaweiCloud Java Software Development Kit (Java SDK)

The HuaweiCloud Java SDK allows you to easily work with Huawei Cloud services such as Elastic Compute Service (ECS) and Virtual Private Cloud (VPC) without the need to handle API related tasks.

This document introduces how to obtain and use HuaweiCloud Java SDK.

## Getting Started

- To use HuaweiCloud Java SDK, you must have Huawei Cloud account as well as the Access Key and Secret key of the HuaweiCloud account.

    The accessKey is required when initializing `{Service}Client`. You can create an AccessKey in the Huawei Cloud console. For more information, see [My Credentials](https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html).

- HuaweiCloud Java SDK requires **Java JDK 1.8** or later.

## Install Java SDK

You could obtain and install Java SDK through following methods:

- Use Maven to declare dependencies (Recommended)

    It is recommended to use Maven to declare dependencies to use our Java SDK. At first, you need to [download](https://maven.apache.org/download.cgi) and [install](https://maven.apache.org/install.html) Maven, and then declare dependencies in the `pom.xml` file in your Java project. 
    
    You must install `huaweicloud-sdk-core` library no matter which product/service development kit you need to use. Take using VPC SDK for example, you need to install `huaweicloud-sdk-core` library and `huaweicloud-sdk-vpc` library: 

    ``` xml
    <dependency>
        <groupId>com.huaweicloud.sdk</groupId>
        <artifactId>huaweicloud-sdk-core</artifactId>
        <version>[3.0.30-rc, 3.1.0-rc)</version>
    </dependency>
    <dependency>
        <groupId>com.huaweicloud.sdk</groupId>
        <artifactId>huaweicloud-sdk-vpc</artifactId>
        <version>[3.0.30-rc, 3.1.0-rc)</version>
    </dependency>
    ```

## Use Java SDK

1. Import the required modules as follows

    ``` java
    // User authentification
    import com.huaweicloud.sdk.core.auth.BasicCredentials;
    // Exceptions
    import com.huaweicloud.sdk.core.exception.ClientRequestException;
    import com.huaweicloud.sdk.core.exception.ServerResponseException;
    // Http related configuration
    import com.huaweicloud.sdk.core.http.HttpConfig;
    // {Service}Client, replace Vpc to your specified service, take VpcClient for example
    import com.huaweicloud.sdk.vpc.v2.VpcClient;
    // {Service}Region, replace Vpc to your specified service, take VpcRegion for example
    import com.huaweicloud.sdk.vpc.v2.region.VpcRegion;
    import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
    import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;
    // Logger
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    ```

2. Config the `{Service}Client` configurations

    2.1 Use default configuration

    ``` java
    // Use default configuration
    HttpConfig config = HttpConfig.getDefaultHttpConfig();
    ```

    2.2  Proxy(Optional)

    ``` java
    // Use proxy if needed
    config.withProxyHost("proxy.huawei.com")
        .withProxyPort(8080)
        .withProxyUsername("test")
        .withProxyPassword("test");
    ```

    2.3 Connection(Optional)

    ``` java
    // seconds to wait for the server to send data before giving up
    config.withTimeout(3);
    ```

    2.4 SSL Certification(Optional)

    ``` java
    // Skip ssl certification checking while using https protocol if needed
    config.withIgnoreSSLVerification(true);
    ```

3. Initialize Credentials

    3.1 Use permanent AK/SK
    
    ``` java
    // Regional Services
        BasicCredentials credentials = new BasicCredentials()
        .withAk(ak)
        .withSk(sk)
        .withProjectId(projectId)
   
    // Global Services
    GlobalCredentials credentials = new GlobalCredentials()
        .withAk(ak)
        .withSk(sk)
        .withDomainId(domainId);
    ```
    
    **where:**
    Global services currently only support BSS, DevStar, EPS, IAM, OSM, RMS, TMS.
    
    For Regional services' authentication, projectId is required. 
    For global services' authentication, domainId is required, projectId should be null.

    If you use {Service}Region to initialize {Service}Client, projectId/domainId supports automatic acquisition, you don't need to configure it when initializing Credentials.  Multiple ProjectId situation is not supported.
 
    - `ak` is the access key ID for your account.
    - `sk` is the secret access key for your account.
    - `projectId` is the ID of your project depending on your region which you want to operate.
    - `domainId` is the account ID of huaweicloud.
    
    3.2 Use temporary AK/SK
    
    It's preferred to obtain temporary access key, security key and security token first, which could be obtained through permanent access key and security key or through an agency.
    
    Obtaining a temporary access key token through permanent access key and security key, you could refer to document: https://support.huaweicloud.com/en-us/api-iam/iam_04_0002.html . The API mentioned in the document above corresponds to the method of createTemporaryAccessKeyByToken in IAM SDK.
    
    Obtaining a temporary access key and security token through an agency, you could refer to document: https://support.huaweicloud.com/en-us/api-iam/iam_04_0101.html . The API mentioned in the document above corresponds to the method of createTemporaryAccessKeyByAgency in IAM SDK.
    
    ``` java
        // Region级服务
        BasicCredentials credentials = new BasicCredentials()
            .withAk(ak)
            .withSk(sk)
            .withSecurityToken(securityToken)
            .withProjectId(projectId)
       
        // Global级服务
        GlobalCredentials credentials = new GlobalCredentials()
            .withAk(ak)
            .withSk(sk)
            .withSecurityToken(securityToken)
            .withDomainId(domainId);
    ```

4. Initialize the {Service}Client instance (Two ways)

    4.1 Specify Endpoint when initializing the instance of {Service}Client
    ``` java
    // Initialize specified service client instance, take VpcClient for example
    VpcClient vpcClient = VpcClient.newBuilder()
        .withHttpConfig(config)
        .withCredential(credentials)
        .withEndpoint(endpoint)
        .build();
    ```

    **where:**
    - `endpoint` is the service specific endpoints, see [Regions and Endpoints](https://developer.huaweicloud.com/intl/en-us/endpoint).

    4.2 Specify Region when initializing {Service}Client **(Recommended)**

    ``` java
    // Initialize specified service client instance, take IamClient for example
    IamClient iamClient = IamClient.newBuilder()
        .withHttpConfig(config)
        .withCredential(credentials)
        .withRegion(IamRegion.CN_NORTH_4)
        .build();
    ```

    **where:**
    - If you use {Service}Region to initialize {Service}Client, projectId/domainId supports automatic acquisition, you don't need to configure it when initializing Credentials.
    - Multiple ProjectId situation is not supported.  

5. Send a request and print response

    ``` java
    // send request and print response, take interface of ListVpcs for example
    ListVpcsResponse listVpcsResponse = vpcClient.listVpcs(new ListVpcsRequest());
    logger.info(listVpcsResponse.toString());
    ```

6. Exceptions

    | Level 1 | Notice | Level 2 | Notice |
    | :---- | :---- | :---- | :---- |
    | ConnectionException | Connection error | HostUnreachableException | Host is not reachable |
    | | | SslHandShakeException | SSL certification error |
    | RequestTimeoutException | Request timeout | CallTimeoutException | timeout for single request |
    | | | RetryOutageException | no response after retrying |
    | ServiceResponseException | service response error | ServerResponseException | server inner error, http status code: [500,] |
    | | | ClientRequestException | invalid request, http status code: [400? 500) |

    ``` java
    try {
        ListVpcResponse listVpcResponse = client.listVpcs(new ListVpcsRequest());
    } catch(ServiceResponseException e) {
        logger.error("HttpStatusCode: " + e.getHttpStatusCode());
        logger.error("RequestId: " + e.getRequestId());
        logger.error("ErrorCode: " + e.getErrorCode());
        logger.error("ErrorMsg: " + e.getErrorMsg());
    }
    ```

7. Use Asynchronous Client

    ``` java
    // Initialize asynchronous client, take VpcAsyncClient for example
    VpcAsyncClient vpcAsyncClient = VpcAsyncClient.newBuilder()
        .withHttpConfig(config)
        .withCredential(credentials)
        .withEndpoint(endpoint)
        .build();

    // send asynchronous request
    CompletableFuture<ListVpcsResponse> future = vpcAsyncClient.listVpcsAsync(new ListVpcsRequest());
    // get asynchronous response
    ListVpcsResponse response = future.get();
    logger.info(response.toString());
    ```

8. Access Log

    **Notice:**
    When running SDK, slf4j is used for printing log. If the log implementation library is not configured when running the code example, and it prompts as follows:

    ``` shell
    SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
    SLF4J: Defaulting to no-operation (NOP) logger implementation
    SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
    ```

    You can add corresponding library for log implementation according to actual situation of your target project. For example, you can add one of the following dependency to your **pom.xml** file:

    slf4j

    ``` xml
     <dependency>
         <groupId>org.slf4j</groupId>
         <artifactId>slf4j-simple</artifactId>
         <version>1.7.21</version>
     </dependency>
    ```

    logback

    ``` xml
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
        <version>1.2.3</version>
    </dependency>
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-core</artifactId>
        <version>1.2.3</version>
    </dependency>
    ```

    log4j

    ``` xml
    <dependency>
        <groupId>log4j</groupId>
        <artifactId>log4j</artifactId>
        <version>1.2.17</version>
    </dependency>
    ```

    The SDK will print the access log by default, every request will be recorded in console like:

    ``` shell
    16:53:04.905 [main] INFO HuaweiCloud-SDK-Access - "GET https://ecs.cn-southwest-2.myhuaweicloud.com/v1/077d6a6c19000fdd2f3bc00150080291/cloudservers/detail?offset=1&limit=25" 200 2251 deabe20c14f997a0291fc451a4da16a4
    16:53:06.212 [main] INFO HuaweiCloud-SDK-Access - "PUT https://ecs.cn-southwest-2.myhuaweicloud.com/v1/077d6a6c19000fdd2f3bc00150080291/cloudservers/1aeac6fb-a2f2-48dc-9052-36637d119dd3" 200 880 f16f70e3fe245c11ab741760f8689a01
    17:02:37.734 [main] INFO HuaweiCloud-SDK-Access - "GET https://ecs.cn-southwest-2.myhuaweicloud.com/v1/077d6a6c19000fdd2f3bc00150080291/cloudservers/detail?offset=1&limit=-1" 400 165 8c3c8b6fed4482d28e1929a78dc93f04
    ```

    SDK access log name is "HuaweiCloud-SDK-Access", and out log format is:

    ``` text
    "{httpMethod} {uri}" {httpStatusCode} {responseContentLength} {requestId}
    ```

    **Where:**
    - `requestId` is the ID returned by HuaweiCloud API Gateway, which can be used for user guarantee or issue tracking.

    You can shield access log in the log configuration depending on your project, or print access log to an independent file.

    For example, you can turn off the access log in logback:

    ``` xml
    <logger name="HuaweiCloud-SDK-Access" level="OFF"> </logger>
    ```

9. Original HTTP Listener

    In some situation, you may need to debug your http requests, original http request and response information will be needed. The SDK provides a listener function to obtain the original encrypted http request and response information.

    > :warning:  Warning: The original http log information are used in debugging stage only, please do not print the original http header or body in the production environment. These log information are not encrypted and contain sensitive data such as the password of your ECS virtual machine or the password of your IAM user account, etc. When the response body is binary content, the body will be printed as "***" without detailed information.

    ``` java
    HttpConfig config = new HttpConfig().addHttpListener(HttpListener.forRequestListener(requestListener ->
        // Original http request message will be printed after registing the listener,
        // Please do not turn on http log printing in the production environment.
        logger.debug("REQUEST: {} {} {} {}",
            requestListener.httpMethod(),
            requestListener.uri(),
            requestListener.headers().entrySet().stream().flatMap(entry ->
                entry.getValue().stream().map(value -> entry.getKey() + " : " + value))
                .collect(Collectors.joining(";")),
            requestListener.body().orElse(""))));
        .addHttpListener(HttpListener.forResponseListener(responseListener ->
        // Original http request message will be printed after registing the listener,
        // Please do not turn on http log printing in the production environment.
        logger.debug("RESPONSE: {} {} {} {} {}",
            responseListener.httpMethod(),
            responseListener.uri(),
            responseListener.statusCode(),
            responseListener.headers().entrySet().stream().flatMap(entry ->
                entry.getValue().stream().map(value -> entry.getKey() + " : " + value))
                .collect(Collectors.joining(";")),
            responseListener.body().orElse(""))));

    VpcClient vpcClient = VpcClient.newBuilder()
        .withHttpConfig(config)
        .withCredential(auth)
        .withEndpoint(endpoint)
        .build();
    ```

## Code Example

- The following example shows how to query a list of VPC synchronously in a specific region, you need to substitute your real `{Service}Client` for `VpcClient` in actual use.
- Substitute the values for `{your ak string}`, `{your sk string}`, `{your endpoint string}` and `{your project id}`.

    ``` java
    package com.huaweicloud.sdk.test;

    import com.huaweicloud.sdk.core.auth.BasicCredentials;
    import com.huaweicloud.sdk.core.exception.ClientRequestException;
    import com.huaweicloud.sdk.core.http.HttpConfig;
    import com.huaweicloud.sdk.vpc.v2.VpcClient;
    import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
    import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;

    public class Application {
        private static final Logger logger = LoggerFactory.getLogger(Application.class);

        public static void listVpcs(VpcClient client) {
            try {
                ListVpcsResponse listVpcsResponse = client.listVpcs(new ListVpcsRequest().withLimit(1));
                logger.info(listVpcsResponse.toString());
            } catch (ClientRequestException e) {
                logger.error("HttpStatusCode: " + e.getHttpStatusCode());
                logger.error("RequestId: " + e.getRequestId());
                logger.error("ErrorCode: " + e.getErrorCode());
                logger.error("ErrorMsg: " + e.getErrorMsg());
            }
        }

        public static void main(String[] args) {
            String ak = "{your ak string}";
            String sk = "{your sk string}";
            String endpoint = "{your endpoint string}";
            String projectId = "{your project id}";

            HttpConfig config = HttpConfig.getDefaultHttpConfig();
            config.withIgnoreSSLVerification(true);

            BasicCredentials auth = new BasicCredentials()
                .withAk(ak)
                .withSk(sk)
                .withProjectId(projectId);

            VpcClient vpcClient = VpcClient.newBuilder()
                .withHttpConfig(config)
                .withCredential(auth)
                .withEndpoint(endpoint)
                .build();

            listVpcs(vpcClient);
        }
    }
    ```
