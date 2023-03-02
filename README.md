English | [简体中文](README_CN.md)

<p align="center">
<a href="https://www.huaweicloud.com/"><img width="450px" height="102px" src="https://console-static.huaweicloud.com/static/authui/20210202115135/public/custom/images/logo-en.svg"></a>
</p>

<h1 align="center">Huawei Cloud Java Software Development Kit (Java SDK)</h1>

The Huawei Cloud Java SDK allows you to easily work with Huawei Cloud services such as Elastic Compute Service (ECS) and
Virtual Private Cloud (VPC) without the need to handle API related tasks.

This document introduces how to obtain and use Huawei Cloud Java SDK.

## Requirements

- To use Huawei Cloud Java SDK, you must have Huawei Cloud account as well as the Access Key (AK) and Secret key (SK) of the
  Huawei Cloud account. You can create an Access Key in the Huawei Cloud console. For more information,
  see [My Credentials](https://support.huaweicloud.com/en-us/usermanual-ca/en-us_topic_0046606340.html).

- To use Huawei Cloud Java SDK to access the APIs of specific service, please make sure you do have activated the
  service in [Huawei Cloud console](https://console.huaweicloud.com/?locale=en-us) if needed.

- Huawei Cloud Java SDK requires **Java JDK 1.8** or later.

## Install Java SDK

It is recommended to use Maven to declare dependencies to use our Java SDK.

At first, you need to [download](https://maven.apache.org/download.cgi)
and [install](https://maven.apache.org/install.html) Maven, and then declare dependencies in the `pom.xml` file in your
Java project.

Please choose a specific version number when specifying dependencies, otherwise it may cause unforeseen issues at build time.

### Individual Services

You can add depenencies for the specific services only. Take using ECS and VPC SDK for example, you need to
import `huaweicloud-sdk-ecs` and `huaweicloud-sdk-vpc` libraries:

``` xml
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-ecs</artifactId>
    <version>[3.0.40-rc, 3.2.0)</version>
</dependency>
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-vpc</artifactId>
    <version>[3.0.40-rc, 3.2.0)</version>
</dependency>
```

### Whole SDK

You can add only one dependency library to import all supported services.(3.0.40-rc or later)：

``` xml
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-all</artifactId>
    <version>[3.0.40-rc, 3.2.0)</version>
</dependency>
```

### Bundle SDK

If a third-party library conflict occurs, you can import a single bundle library(3.0.40-rc or later). The bundle library
contains all supported services and dependent JARs with third-party libraries relocated to different namespaces：

``` xml
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-bundle</artifactId>
    <version>[3.0.40-rc, 3.2.0)</version>
</dependency>
```

Common conflicts, such as Jackson and okhttp3 version conflicts.

## Code Example

- The following example shows how to query a list of VPCs synchronously in a specific region, you need to substitute
  your real `{Service}Client` for `VpcClient` in actual use.
- Substitute the values for `{your ak string}`, `{your sk string}`, `{your endpoint string}` and `{your project id}`.

``` java
package com.huaweicloud.sdk.test;

/* Import dependent module */
// Logger
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// Authentication
import com.huaweicloud.sdk.core.auth.BasicCredentials;
// Service response exception class
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
// Http Configuration
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.vpc.v2.VpcClient;
// Import the request and response classes
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void listVpcs(VpcClient client) {
        try {
            // Instantiate the ListVpcsRequest object and call the listVpcs interface
            ListVpcsResponse listVpcsResponse = client.listVpcs(new ListVpcsRequest().withLimit(1));
            // Output string response in json format
            logger.info(listVpcsResponse.toString());
        } catch (ServiceResponseException e) {
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
		
        // Http Configuration for client
        HttpConfig config = HttpConfig.getDefaultHttpConfig();
        config.withIgnoreSSLVerification(true);
		
        // Create the authentication
        BasicCredentials auth = new BasicCredentials()
            .withAk(ak)
            .withSk(sk)
            .withProjectId(projectId);
		
        // Create VpcClient instance
        VpcClient vpcClient = VpcClient.newBuilder()
            .withHttpConfig(config)
            .withCredential(auth)
            .withEndpoint(endpoint)
            .build();

        listVpcs(vpcClient);
    }
}
```

## Online Debugging

[API Explorer](https://apiexplorer.developer.intl.huaweicloud.com/apiexplorer/overview) provides api retrieval and online debugging, supports full fast retrieval, visual debugging, help document viewing, and online consultation.

## Changelog

Detailed changes for each released version are documented in
the [CHANGELOG.md](https://github.com/huaweicloud/huaweicloud-sdk-java-v3/blob/master/CHANGELOG.md).

## User Manual [:top:](#huawei-cloud-java-software-development-kit-java-sdk)

* [1. Client Configuration](#1-client-configuration-top)
    * [1.1 Default Configuration](#11-default-configuration-top)
    * [1.2 Network Proxy](#12-network-proxy-top)
    * [1.3 Timeout Configuration](#13-timeout-configuration-top)
    * [1.4 SSL Certification](#14-ssl-certification-top)
    * [1.5 Signing Algorithm](#15-signing-algorithm-top)
* [2. Credentials Configuration](#2-credentials-configuration-top)
    * [2.1 Use Permanent AK&SK](#21-use-permanent-aksk-top)
    * [2.2 Use Temporary AK&SK](#22-use-temporary-aksk-top)
    * [2.3 Use IdpId&IdTokenFile](#23-use-idpididtokenfile-top)
    * [2.4 Authentication Management](#24-authentication-management-top)
        * [2.4.1 Environment Variables](#241-environment-variables-top)
        * [2.4.2 Profile](#242-profile-top)
        * [2.4.3 Metadata](#243-metadata-top)
        * [2.4.4 Provider Chain](#244-provider-chain-top)
* [3. Client Initialization](#3-client-initialization-top)
    * [3.1 Initialize the client with specified Endpoint](#31-initialize-the-serviceclient-with-specified-endpoint-top)
    * [3.2 Initialize the client with specified Region (Recommended)](#32-initialize-the-serviceclient-with-specified-region-recommended-top)
    * [3.3 Custom Configuration](#33-custom-configuration-top)
        * [3.3.1 IAM endpoint configuration](#331-iam-endpoint-configuration-top)
        * [3.3.2 Region configuration](#332-region-configuration-top)
* [4. Send Requests and Handle Responses](#4-send-requests-and-handle-responses-top)
    * [4.1 Exceptions](#41-exceptions-top)
* [5. Use Asynchronous Client](#5-use-asynchronous-client-top)
* [6. Troubleshooting](#6-troubleshooting-top)
    * [6.1 Access Log](#61-access-log-top)
    * [6.2 Original HTTP Listener](#62-original-http-listener-top)
* [7. Retry For Request](#7-retry-for-request-top)
    * [7.1 Synchronous Retry](#71-synchronous-retry-top)
    * [7.2 Asynchronous Retry](#72-asynchronous-retry-top)
    * [7.3 Typical Usage Scenarios](#73-typical-usage-scenarios-top)
* [8. Upload and download files](#8-upload-and-download-files-top)

### 1. Client Configuration [:top:](#user-manual-top)

#### 1.1 Default Configuration [:top:](#user-manual-top)

``` java
import com.huaweicloud.sdk.core.http.HttpConfig;

// Use default configuration
HttpConfig config = HttpConfig.getDefaultHttpConfig();
```

#### 1.2 Network Proxy [:top:](#user-manual-top)

Java SDK only supports HTTP proxy configuration currently.

``` java
// Use network proxy if needed, the default protocol is `http`
config.withProxyHost("proxy.huawei.com")
    .withProxyPort(8080)
    .withProxyUsername("test")
    .withProxyPassword("test");
```

#### 1.3 Timeout Configuration [:top:](#user-manual-top)

``` java
// The default connection timeout is 60 seconds, change it if needed
config.withTimeout(60);
```

#### 1.4 SSL Certification [:top:](#user-manual-top)

Skip SSL certification:

``` java
// Skip SSL certification checking while using https protocol if needed
config.withIgnoreSSLVerification(true);
```

Customized configuration:

```java
// Configure SSLSocketFactory and TrustManager, user implementation is required.
config.withSSLSocketFactory(sslSocketFactory).
    withX509TrustManager(trustManager);
```

#### 1.5 Signing Algorithm [:top:](#user-manual-top)

```java
import com.huaweicloud.sdk.core.auth.SigningAlgorithm;
 
// Default signing algorithm is HMAC_SHA256
config.withSigningAlgorithm(SigningAlgorithm.HMAC_SHA256);
 
// JDK8u302+ is required when using HMAC_SM3
config.withSigningAlgorithm(SigningAlgorithm.HMAC_SM3);
```

### 2. Credentials Configuration [:top:](#user-manual-top)

There are two types of Huawei Cloud services, `regional` services and `global` services.

Global services contain BSS, DevStar, EPS, IAM, OSM, RMS, TMS.

For `regional` services' authentication, projectId is required to initialize BasicCredentials. 

For `global` services' authentication, domainId is required to initialize GlobalCredentials.

The following authentications are supported:

- permanent AK&SK
- temporary AK&SK + SecurityToken
- IdpId&IdTokenFile

**Parameter description**:

- `ak` is the access key ID for your account.
- `sk` is the secret access key for your account.
- `projectId` is the ID of your project depending on the region you want to operate.
- `domainId` is the account ID of Huawei Cloud.
- `securityToken` is the security token when using temporary AK/SK.

#### 2.1 Use Permanent AK&SK [:top:](#user-manual-top)

**Parameter description**:

- `ak` is the access key ID for your account.
- `sk` is the secret access key for your account.
- `projectId` is the ID of your project depending on the region you want to operate.
- `domainId` is the account ID of Huawei Cloud.

``` java
// Regional Services
    BasicCredentials basicCredentials = new BasicCredentials()
    .withAk(ak)
    .withSk(sk)
    .withProjectId(projectId)

// Global Services
GlobalCredentials globalCredentials = new GlobalCredentials()
    .withAk(ak)
    .withSk(sk)
    .withDomainId(domainId);
```

**Notice**:

- projectId/domainId supports **automatic acquisition** in version `3.0.26-beta` or later, if you want to use this
  feature, you need to provide the ak and sk of your account and the id of the region, and then build your client
  instance with method `withRegion()`, detailed example could refer
  to [3.2 Initialize the client with specified Region](#32-initialize-the-serviceclient-with-specified-region-recommended-top)
  .

#### 2.2 Use Temporary AK&SK [:top:](#user-manual-top)

A temporary access key and securityToken are issued by the system to IAM users, and can be valid for 15 minutes to 24 hours. After the validity period expires, you need to obtain them again. It's required to obtain temporary AK&SK and security token first, which could be obtained through
permanent AK&SK or through an agency.

- Obtaining a temporary access key and security token through token, you could refer to
document: https://support.huaweicloud.com/en-us/api-iam/iam_04_0002.html . The API mentioned in the document above
corresponds to the method of `CreateTemporaryAccessKeyByToken` in IAM SDK.

- Obtaining a temporary access key and security token through an agency, you could refer to
document: https://support.huaweicloud.com/en-us/api-iam/iam_04_0101.html . The API mentioned in the document above
corresponds to the method of `CreateTemporaryAccessKeyByAgency` in IAM SDK.

**Parameter description**:

- `ak` is the access key ID for your account.
- `sk` is the secret access key for your account.
- `projectId` is the ID of your project depending on the region you want to operate.
- `domainId` is the account ID of Huawei Cloud.
- `securityToken` is the security token when using temporary AK/SK.

``` java
// Regional services
BasicCredentials basicCredentials = new BasicCredentials()
    .withAk(ak)
    .withSk(sk)
    .withSecurityToken(securityToken)
    .withProjectId(projectId)

// Global services
GlobalCredentials globalCredentials = new GlobalCredentials()
    .withAk(ak)
    .withSk(sk)
    .withSecurityToken(securityToken)
    .withDomainId(domainId);
```

In the following two cases, the credential information will be obtained from the metadata of the instance:

1. BasicCredentials or GlobalCredentials were not manually specified when creating the client.
2. AK/SK was not specified when creating BasicCredentials or GlobalCredentials.

Refer to the [Obtaining Metadata](https://support.huaweicloud.com/intl/en-us/usermanual-ecs/ecs_03_0166.html) for more information.

```java
// Regional services
BasicCredentials credentials = new BasicCredentials().withProjectId(projectId);

// Global services
GlobalCredentials credentials = new GlobalCredentials().withDomainId(domainId);
```

#### 2.3 Use IdpId&IdTokenFile [:top:](#user-manual-top)

Obtain a federated identity authentication token using an OpenID Connect ID token, refer to the [Obtaining a Token with an OpenID Connect ID Token](https://support.huaweicloud.com/intl/en-us/api-iam/iam_13_0605.html)

**Parameter description**:

- `IdpId` Identity provider ID.
- `IdTokenFile` Id token file path. Id token is constructed by the enterprise IdP to carry the identity information of federated users.
- `projectId` is the ID of your project depending on your region which you want to operate.
- `domainId` is the account ID of Huawei Cloud.

``` java
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.GlobalCredentials;

// Regional service
BasicCredentials basicCredentials = new BasicCredentials()
    .withIdpId(idpId)
    .withIdTokenFile(idTokenFile)
    .withProjectId(projectId)

// Global service
GlobalCredentials globalCredentials = new GlobalCredentials()
    .withIdpId(idpId)
    .withIdTokenFile(idTokenFile)
    .withDomainId(domainId);
```

#### 2.4 Authentication Management [:top:](#user-manual-top)

Getting Authentication from providers is supported since `v3.0.97`

**Regional services** use `XxxCredentialProvider.getBasicCredentialXxxProvider()`

**Global services** use `XxxCredentialProvider.getGlobalCredentialXxxProvider()`

##### 2.4.1 Environment Variables [:top:](#user-manual-top)

**AK/SK Auth**

| Environment Variables  |  Notice |
| ------------ | ------------ |
| HUAWEICLOUD_SDK_AK  | Required，AccessKey  |
| HUAWEICLOUD_SDK_SK  |  Required，SecretKey |
| HUAWEICLOUD_SDK_SECURITY_TOKEN  | Optional, this parameter needs to be specified when using temporary ak/sk  |
| HUAWEICLOUD_SDK_PROJECT_ID  | Optional, used for regional services, required in multi-ProjectId scenarios  |
| HUAWEICLOUD_SDK_DOMAIN_ID  | Optional, used for global services  |

Configure environment variables:

```
// Linux
export HUAWEICLOUD_SDK_AK=YOUR_AK
export HUAWEICLOUD_SDK_SK=YOUR_SK

// Windows
set HUAWEICLOUD_SDK_AK=YOUR_AK
set HUAWEICLOUD_SDK_SK=YOUR_SK
```

Get the credentials from configured environment variables:

```java
import com.huaweicloud.sdk.core.auth.EnvCredentialProvider;
import com.huaweicloud.sdk.core.auth.ICredential;

// basic
EnvCredentialProvider basicProvider = EnvCredentialProvider.getBasicCredentialEnvProvider();
ICredential basicCred = basicProvider.getCredentials();

// global
EnvCredentialProvider globalProvider = EnvCredentialProvider.getGlobalCredentialEnvProvider();
ICredential globalCred = globalProvider.getCredentials();
```

**IdpId/IdTokenFile Auth**

| Environment Variables  |  Notice |
| ------------ | ------------ |
| HUAWEICLOUD_SDK_IDP_ID  | Required, identity provider Id |
| HUAWEICLOUD_SDK_ID_TOKEN_FILE  |  Required, id token file path |
| HUAWEICLOUD_SDK_PROJECT_ID  | For basic credentials, this parameter is required  |
| HUAWEICLOUD_SDK_DOMAIN_ID  | For global credentials, this parameter is required  |

Configure environment variables:

```
// Linux
export HUAWEICLOUD_SDK_IDP_ID=YOUR_IDP_ID
export HUAWEICLOUD_SDK_ID_TOKEN_FILE=/some_path/your_token_file
export HUAWEICLOUD_SDK_PROJECT_ID=YOUR_PROJECT_ID // For basic credentials, this parameter is required
export HUAWEICLOUD_SDK_DOMAIN_ID=YOUR_DOMAIN_ID // For global credentials, this parameter is required

// Windows
set HUAWEICLOUD_SDK_IDP_ID=YOUR_IDP_ID
set HUAWEICLOUD_SDK_ID_TOKEN_FILE=/some_path/your_token_file
set HUAWEICLOUD_SDK_PROJECT_ID=YOUR_PROJECT_ID // For basic credentials, this parameter is required
set HUAWEICLOUD_SDK_DOMAIN_ID=YOUR_DOMAIN_ID // For global credentials, this parameter is required
```

Get the credentials from configured environment variables:

```java
import com.huaweicloud.sdk.core.auth.EnvCredentialProvider;
import com.huaweicloud.sdk.core.auth.ICredential;

// basic
EnvCredentialProvider basicProvider = EnvCredentialProvider.getBasicCredentialEnvProvider();
ICredential basicCred = basicProvider.getCredentials();

// global
EnvCredentialProvider globalProvider = EnvCredentialProvider.getGlobalCredentialEnvProvider();
ICredential globalCred = globalProvider.getCredentials();
```

##### 2.4.2 Profile [:top:](#user-manual-top)

The profile will be read from the user's home directory by default, linux`~/.huaweicloud/credentials`,windows`C:\Users\USER_NAME\.huaweicloud\credentials`, the path to the profile can be modified by configuring the environment variable `HUAWEICLOUD_SDK_CREDENTIALS_FILE`

**AK/SK Auth**

| Configuration Parameters  |  Notice |
| ------------ | ------------ |
| ak  | Required，AccessKey  |
| sk  |  Required，SecretKey |
| security_token  | Optional, this parameter needs to be specified when using temporary ak/sk  |
| project_id  | Optional, used for regional services, required in multi-ProjectId scenarios  |
| domain_id  | Optional, used for global services  |
| iam_endpoint  | optional, endpoint for authentication, default is `https://iam.myhuaweicloud.com` |

The content of the profile is as follows:

```ini
[basic]
ak = your_ak
sk = your_sk

[global]
ak = your_ak
sk = your_sk
```

Get the credentials from profile:

```java
import com.huaweicloud.sdk.core.auth.ProfileCredentialProvider;
import com.huaweicloud.sdk.core.auth.ICredential;

// basic
ProfileCredentialProvider basicProvider = ProfileCredentialProvider.getBasicCredentialProfileProvider();
ICredential basicCred = basicProvider.getCredentials();

// global
ProfileCredentialProvider globalProvider = ProfileCredentialProvider.getGlobalCredentialProfileProvider();
ICredential globalCred = globalProvider.getCredentials();
```

**IdpId/IdTokenFile Auth**

| Configuration Parameters  |  Notice |
| ------------ | ------------ |
| idp_id  | Required, identity provider Id |
| id_token_file  |  Required, id token file path |
| project_id  | For basic credentials, this parameter is required  |
| domain_id  | For global credentials, this parameter is required  |
| iam_endpoint  | optional, endpoint for authentication, default is `https://iam.myhuaweicloud.com` |

The content of the profile is as follows:

```ini
[basic]
idp_id = your_idp_id
id_token_file = /some_path/your_token_file
project_id = your_project_id

[global]
idp_id = your_idp_id
id_token_file = /some_path/your_token_file
domainId = your_domain_id
```

Get the credentials from profile:

```java
import com.huaweicloud.sdk.core.auth.ProfileCredentialProvider;
import com.huaweicloud.sdk.core.auth.ICredential;

// basic
ProfileCredentialProvider basicProvider = ProfileCredentialProvider.getBasicCredentialProfileProvider();
ICredential basicCred = basicProvider.getCredentials();

// global
ProfileCredentialProvider globalProvider = ProfileCredentialProvider.getGlobalCredentialProfileProvider();
ICredential globalCred = globalProvider.getCredentials();
```

##### 2.4.3 Metadata [:top:](#user-manual-top)

Get temporary AK/SK and securitytoken from instance's metadata. Refer to the [Obtaining Metadata](https://support.huaweicloud.com/intl/en-us/usermanual-ecs/ecs_03_0166.html) for more information.

Manually obtain authentication from instance metadata:

```java
import com.huaweicloud.sdk.core.auth.MetadataCredentialProvider;
import com.huaweicloud.sdk.core.auth.ICredential;

// basic
MetadataCredentialProvider basicProvider = MetadataCredentialProvider.getBasicCredentialMetadataProvider();
ICredential basicCred = basicProvider.getCredentials();

// global
MetadataCredentialProvider globalProvider = MetadataCredentialProvider.getGlobalCredentialMetadataProvider();
ICredential globalCred = globalProvider.getCredentials();
```

##### 2.4.4 Provider Chain [:top:](#user-manual-top)

When creating a service client without credentials, try to load authentication in the order **Environment Variables -> Profile -> Metadata**

Get authentication from provider chain:

```java
import com.huaweicloud.sdk.core.auth.CredentialProviderChain;
import com.huaweicloud.sdk.core.auth.ICredential;

// basic
CredentialProviderChain basicChain = CredentialProviderChain.getBasicCredentialProviderChain();
ICredential basicCred = basicChain.getCredentials();

// global
CredentialProviderChain globalChain = CredentialProviderChain.getGlobalCredentialProviderChain();
ICredential globalCred = globalChain.getCredentials();
```

Custom credentials provider chain is supported:

```java
import com.huaweicloud.sdk.core.auth.CredentialProviderChain;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.auth.ICredentialProvider;
import com.huaweicloud.sdk.core.auth.MetadataCredentialProvider;
import com.huaweicloud.sdk.core.auth.ProfileCredentialProvider;

ICredentialProvider[] providers = new ICredentialProvider[]{
        MetadataCredentialProvider.getBasicCredentialMetadataProvider(),
        ProfileCredentialProvider.getBasicCredentialProfileProvider()
};
CredentialProviderChain chain = new CredentialProviderChain(providers);
ICredential cred = chain.getCredentials();
```

### 3. Client Initialization [:top:](#user-manual-top)

There are two ways to initialize the {Service}Client, you could choose one you preferred.

#### 3.1 Initialize the {Service}Client with specified Endpoint [:top:](#user-manual-top)

``` java
// Specify the endpoint, take the endpoint of VPC service in region of cn-north-4 for example
String endpoint = "https://vpc.cn-north-4.myhuaweicloud.com";

// Initialize the credentials, you should provide projectId or domainId in this way, take initializing BasicCredentials for example
BasicCredentials basicCredentials = new BasicCredentials()
    .withAk(ak)
    .withSk(sk)
    .withProjectId(projectId);

// Initialize specified service client instance, take initializing the regional service VPC's VpcClient for example
VpcClient vpcClient = VpcClient.newBuilder()
    .withHttpConfig(config)
    .withCredential(basicCredentials)
    .withEndpoint(endpoint)
    .build();
```

**where:**

- `endpoint` varies by services and regions,
  see [Regions and Endpoints](https://developer.huaweicloud.com/intl/en-us/endpoint) to obtain correct endpoint.

- When you meet some trouble in getting projectId using the specified region way, you could use this way instead.

#### 3.2 Initialize the {Service}Client with specified Region **(Recommended)** [:top:](#user-manual-top)

``` java
// dependency for region module
import com.huaweicloud.sdk.iam.v3.region.IamRegion;

// Initialize the credentials, projectId or domainId could be unassigned in this situation, take initializing GlobalCredentials for example
GlobalCredentials globalCredentials = new GlobalCredentials()
    .withAk(ak)
    .withSk(sk);

// Initialize specified service client instance, take initializing the global service IAM's IamClient for example
IamClient iamClient = IamClient.newBuilder()
    .withHttpConfig(config)
    .withCredential(globalCredentials)
    .withRegion(IamRegion.CN_NORTH_4)
    .build();
```

**Notice:**

- If you use `region` to initialize {Service}Client, projectId/domainId supports automatic acquisition, you don't need
  to configure it when initializing Credentials.

- Multiple ProjectId situation is **not supported**.

- Supported region list: af-south-1, ap-southeast-1, ap-southeast-2, ap-southeast-3, cn-east-2, cn-east-3, cn-north-1,
  cn-north-4, cn-south-1, cn-southwest-2, ru-northwest-2. You may get exception such as `Unsupported regionId` if your
  region don't in the list above.

**Comparison of the two ways:**

| Initialization | Advantages | Disadvantage |
| :---- | :---- | :---- |
| Specified Endpoint | The API can be invoked successfully once it has been published in the environment. | You need to prepare projectId and endpoint yourself.
| Specified Region | No need for projectId and endpoint, it supports automatic acquisition if you configure it in the right way. | The supported services and regions are limited.

#### 3.3 Custom Configuration

**Notice:** Supported since v3.0.93

##### 3.3.1 IAM endpoint configuration

Automatically acquiring projectId/domainId will invoke the [KeystoneListProjects](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=IAM&api=KeystoneListProjects) /[KeystoneListAuthDomains](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=IAM&api=KeystoneListAuthDomains) interface of IAM service. The default iam enpoint is `https://iam.myhuaweicloud.com`, you can modify the endpoint in the following two ways:

###### 3.3.1.1 Global scope

This configuration takes effect globally, specified by environment variable `HUAWEICLOUD_SDK_IAM_ENDPOINT`

```
//linux
export HUAWEICLOUD_SDK_IAM_ENDPOINT=https://iam.cn-north-4.myhuaweicloud.com

//windows
set HUAWEICLOUD_SDK_IAM_ENDPOINT=https://iam.cn-north-4.myhuaweicloud.com
```

###### 3.3.1.2 Credentials scope

This configuration is only valid for a credential, and it will override the global configuration

```java
import com.huaweicloud.sdk.core.auth.BasicCredentials;

String iamEndpoint = "https://iam.cn-north-4.myhuaweicloud.com";
BasicCredentials credentials = new BasicCredentials().withAk(ak).withSk(sk).withIamEndpoint(iamEndpoint);
```

##### 3.3.2 Region configuration

###### 3.3.2.1 Environment variable

Specified by environment variable, the format is `HUAWEICLOUD_SDK_REGION_{SERIVCE_NAME}_{REGION_ID}={endpoint}`

Notice: the name of environment variable is UPPER-CASE, replacing hyphens with underscores.

```
// Take ECS and IoTDA services as examples

// linux
export HUAWEICLOUD_SDK_REGION_ECS_CN_NORTH_99=https://ecs.cn-north-99.myhuaweicloud.com
export HUAWEICLOUD_SDK_REGION_IOTDA_AP_SOUTHEAST_10=https://iotda.ap-southwest-10.myhuaweicloud.com

// windows
set HUAWEICLOUD_SDK_REGION_ECS_CN_NORTH_99=https://ecs.cn-north-99.myhuaweicloud.com
set HUAWEICLOUD_SDK_REGION_IOTDA_AP_SOUTHEAST_10=https://iotda.ap-southwest-10.myhuaweicloud.com
```

###### 3.3.2.2 Profile

The profile will be read from the user's home directory by default, linux`~/.huaweicloud/regions.yaml`,windows`C:\Users\USER_NAME\.huaweicloud\regions.yaml`,the default file may not exist, but if the file exists and the content format is incorrect, an exception will be thrown for parsing errors.

The path to the profile can be modified by configuring the environment variable `HUAWEICLOUD_SDK_REGIONS_FILE`, like `HUAWEICLOUD_SDK_REGIONS_FILE=/tmp/my_regions.yml`

The file content format is as follows:

```yaml
# Serivce name is case-insensitive
ECS:
  - id: 'cn-north-10'
    endpoint: 'https://ecs.cn-north-10.myhuaweicloud.com'
  - id: 'cn-north-11'
    endpoint: 'https://ecs.cn-north-11.myhuaweicloud.com'
IoTDA:
  - id: 'ap-southwest-9'
    endpoint: 'https://iotda.ap-southwest-9.myhuaweicloud.com'
```

###### 3.3.2.3 Region supply chain

The default order is **environment variables -> profile -> region defined in SDK**, if the region is not found in the above ways, an exception will be thrown.

```java
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.ecs.v2.region.EcsRegion;

Region region1 = EcsRegion.valueOf("cn-north-10");
Region region2 = EcsRegion.valueOf("cn-north-11");
```

### 4. Send Requests and Handle Responses [:top:](#user-manual-top)

``` java
// send a request and print response, take interface of ListVpcs for example
ListVpcRequest request = new ListVpcsRequest().withLimit(1);

ListVpcsResponse response = client.listVpcs(request); 
logger.info(response.toString());
```

#### 4.1 Exceptions [:top:](#user-manual-top)

| Level 1 | Notice | Level 2 | Notice |
| :---- | :---- | :---- | :---- |
| ConnectionException | Connection error | HostUnreachableException | host is not reachable |
| | | SslHandShakeException | SSL certification error |
| | | ConnectionTimeoutException | connect timed out |
| RequestTimeoutException | Request timeout | CallTimeoutException | timeout for single request |
| | | RetryOutageException | no response after retrying |
| ServiceResponseException | service response error | ServerResponseException | server inner error, http status code: [500,] |
| | | ClientRequestException | invalid request, http status code: [400? 500) |

``` java
try {
    ListVpcRequest request = new ListVpcsRequest().withLimit(1);

    ListVpcsResponse response = client.listVpcs(request); 
    logger.info(response.toString());
} catch(ServiceResponseException e) {
    logger.error("HttpStatusCode: " + e.getHttpStatusCode());
    logger.error("RequestId: " + e.getRequestId());
    logger.error("ErrorCode: " + e.getErrorCode());
    logger.error("ErrorMsg: " + e.getErrorMsg());
}
```

### 5. Use Asynchronous Client [:top:](#user-manual-top)

``` java
// Initialize asynchronous client, take VpcAsyncClient for example
VpcAsyncClient vpcAsyncClient = VpcAsyncClient.newBuilder()
    .withHttpConfig(config)
    .withCredential(basicCredentials)
    .withEndpoint(endpoint)
    .build();

// send asynchronous request
CompletableFuture<ListVpcsResponse> future = vpcAsyncClient.listVpcsAsync(new ListVpcsRequest().withLimit(1));
// get asynchronous response
ListVpcsResponse response = future.get();
logger.info(response.toString());
```

### 6. Troubleshooting [:top:](#user-manual-top)

SDK supports `Access` log and `Debug` log which could be configured manually.

#### 6.1 Access Log [:top:](#user-manual-top)

**Notice:**
When running SDK, slf4j is used for printing log. If the log implementation library is not configured when running the
code example, and it prompts as follows:

``` shell
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
```

You can add corresponding library for log implementation according to actual situation of your target project. For
example, you can add one of the following dependency to your **pom.xml** file:

**slf4j**

``` xml
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-simple</artifactId>
    <version>1.7.21</version>
</dependency>
```

**logback**

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

**log4j**

``` xml
<dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
</dependency>
```

The SDK will print the access log by default, every request will be recorded to the console like:

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

You can shield access log in the log configuration depending on your project, or print access log to an independent
file.

For example, you can turn off the access log in logback:

``` xml
<logger name="HuaweiCloud-SDK-Access" level="OFF"> </logger>
```

#### 6.2 Original HTTP Listener [:top:](#user-manual-top)

In some situation, you may need to debug your http requests, original http request and response information will be
needed. The SDK provides a listener function to obtain the original encrypted http request and response information.

> :warning:  Warning: The original http log information is used in debugging stage only, please do not print the original http header or body in the production environment. These log information is not encrypted and contains sensitive data such as the password of your ECS virtual machine, or the password of your IAM user account, etc. When the response body is binary content, the body will be printed as "***" without detailed information.

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
        requestListener.body().orElse(""))))
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

### 7. Retry For Request [:top:](#user-manual-top)

When a request encounters a network exception or flow control on the interface, the request needs to be retried. The
Java SDK provides the retry method for our users which could be used to the requests of `GET` HTTP method. The retry
method has been supported on both synchronous client and asynchronous client, if you want to use the retry method, the
following parameters are required: `maxRetryTimes`, `retryCondition` and `backoffStrategy`.

- _maxRetryTimes_: the max value is 30, you could set to a positive integer no more than 30
- _retryCondition_: a lambda function, which determine the condition of when to retry, the java SDK provides a default
  condition, and its code is:

``` java
/**
 * The default retry condition, if the exception is ConnectionException or subclass of ConnectionException, the request would be retried.
 *
 * @param <ResT> Generics of response classes
 * @return BiFunction returns true or false which means whether to retry
 */
public static <ResT> BiFunction<ResT, SdkException, Boolean> defaultRetryCondition() {
    return (resp, exception) -> {
        if (Objects.nonNull(exception)) {
            return ConnectionException.class.isAssignableFrom(exception.getClass());
        }
        return false;
    };
}
```

- _backoffStrategy_: calculate the wait duration before next retry, the java SDK provides the default strategy which
  combines
  `random backoff` and `exponential backoff` as the algorithm to calculate the delay time before the next retry.

Now let's begin to introduce how could you use retry for different scenarios.

#### 7.1 Synchronous Retry [:top:](#user-manual-top)

If you want to use retry in synchronous client, you could use `invoker()` method in `{Service}Client`.

Take the interface `ShowJob` of ECS service for example, assume the request would retry at most 5 times, and the retry
condition use the default condition, the code would be like the following:

``` java
// initialize the sychronous client
EcsClient client = EcsClient.newBuilder()
    .withCredential(basicCredentials)
    .withRegion(EcsRegion.CN_NORTH_4)
    .withHttpConfig(config)
    .build();

String jobId = "{valid job id}";
ShowJobRequest request = new ShowJobRequest().withJobId(jobId);
try {
    ShowJobResponse response = client.showJobInvoker(request)
    // max retry times
    .retryTimes(5)
    // retry condition, which would be retried for ConnectionException
    .retryCondition(BaseInvoker.defaultRetryCondition())
    .invoke();
    logger.info(response.toString());
} catch (SdkException e) {
    logger.error("", e);
}
```

#### 7.2 Asynchronous Retry [:top:](#user-manual-top)

If you want to use retry in asynchronous client, you could use `invoker()` method in `{Service}Client`.

Take the interface `ShowJob` of ECS service for example, assume the request would retry at most 5 times, and the retry
condition use the default condition, the code would be like the following:

``` java
// initialize the asychronous client
EcsAsyncClient asyncClient = EcsAsyncClient.newBuilder()
    .withCredential(basicCredentials)
    .withRegion(EcsRegion.CN_NORTH_4)
    .withHttpConfig(config)
    .build();

String jobId = "{valid job id}";
ShowJobRequest request = new ShowJobRequest().withJobId(jobId);
try {
    ShowJobResponse response = asyncClient.showJobAsyncInvoker(request)
    // max retry times
    .retryTimes(5)
    // retry condition, which would be retried for ConnectionException
    .retryCondition(BaseInvoker.defaultRetryCondition())
    .invoke();
    logger.info(response.toString());
} catch (SdkException e) {
    logger.error("", e);
}
```

#### 7.3 Typical Usage Scenarios [:top:](#user-manual-top)

**Scenario 1**: If the response status code of the interface is 500(Server Error) or 429(Server Flow Control), retry for
the request, and the code would be like the following:

``` java 
String jobId = "{valid job id}";
ShowJobRequest request = new ShowJobRequest().withJobId(jobId);
try {
    ShowJobResponse response = client.showJobInvoker(request)
        .retryTimes(3)
        .retryCondition(
            (resp, ex) -> Objects.nonNull(ex) && ServiceResponseException.class.isAssignableFrom(ex.getClass())
                && (((ServiceResponseException) ex).getHttpStatusCode() == 429
                || ((ServiceResponseException) ex).getHttpStatusCode() == 500))
        .invoke();
    logger.info(response.toString());
} catch (InterruptedException e) {
    logger.error("InterruptedException", e);
} catch (ExecutionException e) {
    logger.error("ExecutionException", e);
}
```

**Scenario 2**: Retry for the specified job status, if the job status is success, then stop retry and do some other
things, and the code would be like the following:

``` java
String jobId = "{valid job id}";
ShowJobRequest request = new ShowJobRequest().withJobId(jobId);
try {
    // base delay of retry in milliseconeds
    final int baseDelay = 1000;
    // max backoff time in retry
    final int maxBackoffInMilliseconds = 30000;

    ShowJobResponse response = client.showJobInvoker(request)
    // max retry times
    .retryTimes(10)
    // Request retry condition, set the retry condition to stop when the job status is success
    .retryCondition((resp, ex) -> Objects.nonNull(resp) && !resp.getStatus().equals(ShowJobResponse.StatusEnum.SUCCESS))
     // Request backoff policy, calculate the next request time after each request fails
     // Polling job status requires a long basic delay
    .backoffStrategy(new SdkBackoffStrategy(baseDelay, maxBackoffInMilliseconds))
    .invoke();
    logger.info(response.toString());
} catch (SdkException e) {
    logger.error("", e);
}
```

### 8. Upload and download files [:top:](#user-manual-top)

Take the interface `CreateImageWatermark` of the service `Data Security Center` as an example, this interface needs to upload an image file and return the watermarked image file stream:

```java
package com.huaweicloud.sdk.test;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.dsc.v1.DscClient;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkRequest;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkRequestBody;
import com.huaweicloud.sdk.dsc.v1.model.CreateImageWatermarkResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;


public class CreateImageWatermarkDemo {

    public static void createImageWatermark(DscClient client) throws IOException {

        CreateImageWatermarkRequest request = new CreateImageWatermarkRequest();

        // Create a File object and a FileInputStream object.
        File file = new File("demo.jpg");
        FileInputStream fis = new FileInputStream(file);

        CreateImageWatermarkRequestBody body = new CreateImageWatermarkRequestBody()
                // Fill in file parameter.
                .withFile(fis, file.getName())
                .withBlindWatermark("test123");
        request.setBody(body);

        CreateImageWatermarkResponse response = client.createImageWatermark(request);
        fis.close();

        //Consumer of downloading files.
        Consumer<InputStream> consumer = inputStream -> {
            try {
                FileOutputStream out = new FileOutputStream("result.jpg");
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = inputStream.read(data))!= -1) {
                    out.write(data, 0, len);
                }

                inputStream.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        //Download files.
        response.consumeDownloadStream(consumer);
    }

    public static void main(String[] args) throws IOException {
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

        DscClient client = DscClient.newBuilder()
                .withHttpConfig(config)
                .withCredential(auth)
                .withEndpoint(endpoint)
                .build();

        createImageWatermark(client);

    }
    
}
```
