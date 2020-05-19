English | [简体中文](./README_ZH.md)

# HuaweiCloud Java Software Development Kit (Java SDK)

The HuaweiCloud Java SDK allows you to easily work with Huawei Cloud services such as Elastic Compute Service (ECS) and Virtual Private Cloud (VPC) without the need to handle API related tasks.

This document introduces how to obtain and use HuaweiCloud Java SDK.

## Getting Started

- To use HuaweiCloud Java SDK, you must have Huawei Cloud account as well as the Access Key and Secret key of the HuaweiCloud account.
The accessKey is required when initializing {Service}Client. You can create an AccessKey in the Huawei Cloud console. For more information, see [My Credentials](https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html).

- HuaweiCloud Java SDK requires Java JDK 1.8 or later.

## Install Java SDK

You could obtain and install Java SDK through following methods:

- Use Maven to declare dependencies (Recommended)

It is recommended to use Maven to declare dependencies to use our Java SDK. At first, you need to [download](https://maven.apache.org/download.cgi) and [install](https://maven.apache.org/install.html) Maven, and then declare dependencies in the `pom.xml` file in your Java project.

``` xml
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk</artifactId>
    <!-- please find the latest version in the Maven Repository -->
    <version>3.0.1-beta</version>
</dependency>
```

- Use source code

1. Download our source code package on [Github](https://github.com/huaweicloud/huaweicloud-sdk-java-v3.git).
2. Unzip the source code package and apply it for a necessary location in your project.
3. For specific usage, please refer to [Code Example](#Code Example).

## Use Java SDK

1.  Import the required modules as follows:

   ``` java
   import com.huaweicloud.sdk.core.auth.BasicCredentials;
   import com.huaweicloud.sdk.core.exception.ClientRequestException;
   import com.huaweicloud.sdk.core.exception.ServerResponseException;
   import com.huaweicloud.sdk.vpc.v2.VpcClient;
   import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
   import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;
   import org.slf4j.Logger;
   import org.slf4j.LoggerFactory;
   ```

2. Config the `{Service}Client` configurations: 

   ```java
   HttpConfig config = HttpConfig.getDefaultHttpConfig();
   
   config.withProxyHost("http://proxy.huaweicloud.com")
       .withProxyPort(8080)
       .withProxyUsername("test")
       .withProxyPassword("test");
   
   config.withIgnoreSSLVerification(true);
   ```

3. Initialize the `{Service}Client` instance:

   ``` java
   BasicCredentials auth = new BasicCredentials()
   	.withAk(ak)
   	.withSk(sk)
   	.withProjectId(projectId);
   
   VpcClient vpcClient = VpcClient.newBuilder()
   	.withHttpConfig(config)
   	.withCredential(auth)
   	.withEndpoint(endpoint)
   	.build();
   ```
   where：
    - `ak` is the access key ID for your account.
   - `sk` is the secret access key for your account.
   - `projectId` is the ID of your project depending on your region which you want to operate.
    - `endpoint` is the service specific endpoints, see [Regions and Endpoints](https://developer.huaweicloud.com/intl/en-us/endpoint)

4. Send a request and print response. 

   ```java
   ListVpcsResponse listVpcsResponse = vpcClient.listVpcs(new ListVpcsRequest().withLimit(1));
   logger.info(listVpcsResponse.toString());
   ```

## Code Example 

The following example shows how to query a list of VPC in a specific region. Substitute the values for `{your ak string}`, `{your sk string}`, `{your endpoint string}` and `{your project id}`.

```java
package com.huaweicloud.sdk.test;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.exception.ClientRequestException;
import com.huaweicloud.sdk.core.exception.ServerResponseException;
import com.huaweicloud.sdk.vpc.v2.VpcClient;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        HttpConfig config = HttpConfig.getDefaultHttpConfig();
        config.withIgnoreSSLVerification(true);

        String ak = "{your ak string}";
        String sk = "{your sk string}";
        String endpoint = "{your endpoint string}";
        String projectId = "{your project id}";

        BasicCredentials auth = new BasicCredentials()
            .withAk(ak)
            .withSk(sk)
            .withProjectId(projectId);
            
        VpcClient vpcClient = VpcClient.newBuilder()
            .withHttpConfig(config)
            .withCredential(auth)
            .withEndpoint(endpoint)
            .build();

        try {
            ListVpcsResponse listVpcsResponse = vpcClient.listVpcs(new ListVpcsRequest().withLimit(1));
            logger.info(listVpcsResponse.toString());
        } catch (ClientRequestException e) {
            logger.error("HttpStatusCode:" + e.getHttpStatusCode() + ", ErrorMsg: " + e.getErrorMsg());
        } catch (ServerResponseException e) {
            logger.error("HttpStatusCode:" + e.getHttpStatusCode() + ", ErrorMsg: " + e.getErrorMsg());
        } catch (ConnectionException e) {
            logger.error("Connection error: ", e);
        }
    }
}
```

