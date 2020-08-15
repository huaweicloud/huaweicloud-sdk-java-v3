[English](./README.md) | 简体中文

# 华为云  Java 软件开发工具包（Java SDK）

欢迎使用华为云 Java SDK。

华为云 Java SDK 让您无需关心请求细节即可快速使用云服务器、虚拟私有云等多个华为云服务。

这里将向您介绍如何获取并使用华为云 Java SDK。

## 在线示例

[API Explorer](https://apiexplorer.developer.huaweicloud.com/apiexplorer/overview) 提供API检索及平台调试，支持全量快速检索、可视化调试、帮助文档查看、在线咨询。

## 现在开始

- 要使用华为云 Java SDK，您需要拥有华为云账号以及该账号对应的 Access Key（AK）和 Secret Access Key（SK）。请在华为云控制台“我的凭证-访问密钥”页面上创建和查看您的 AK/SK。更多信息请查看[访问密钥]( https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html )。
- 华为云 Java SDK 支持 **Java JDK 1.8** 及其以上版本。

## SDK 获取和安装

您可以通过如下方式获取和安装 SDK：

- 通过 Maven 安装依赖（推荐）

    通过 Maven 安装项目依赖是使用 Java SDK 的推荐方法，首先您需要在您的操作系统中[下载]( https://maven.apache.org/download.cgi )并[安装 Maven]( https://maven.apache.org/install.html ) ，安装完成后您只需在 Java 项目的 `pom.xml` 文件加入相应的依赖项即可。
    
    无论您要使用哪个产品/服务的开发工具包，都必须安装`huaweicloud-sdk-core`。以使用虚拟私有云VPC SDK为例，您需要安装`huaweicloud-sdk-core`和`huaweicloud-sdk-vpc`：

    ``` xml
    <dependency>
        <groupId>com.huaweicloud.sdk</groupId>
        <artifactId>huaweicloud-sdk-core</artifactId>
        <version>[3.0.1-beta, 3.1.0-beta)</version>
    </dependency>
    <dependency>
        <groupId>com.huaweicloud.sdk</groupId>
        <artifactId>huaweicloud-sdk-vpc</artifactId>
        <version>[3.0.1-beta, 3.1.0-beta)</version>
    </dependency>
    ```

### 开始使用

1. 导入依赖模块：

    ``` java
    // 用户身份认证
    import com.huaweicloud.sdk.core.auth.BasicCredentials;
    // 请求异常类
    import com.huaweicloud.sdk.core.exception.ClientRequestException;
    import com.huaweicloud.sdk.core.exception.ServerResponseException;
    // Http 配置
    import com.huaweicloud.sdk.core.http.HttpConfig;
    // 导入指定云服务的 {Service}Client，此处以 VpcClient 为例
    import com.huaweicloud.sdk.vpc.v2.VpcClient;
    // 导入待请求接口的 request 和 response 类
    import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
    import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;
    // 日志打印
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    ```

2. 配置客户端属性

    2.1 默认配置

    ``` java
    // 使用默认配置
    HttpConfig config = HttpConfig.getDefaultHttpConfig();
    ```

    2.2 代理配置（可选）

    ``` java
    // 使用代理服务器（可选）
    config.withProxyHost("http://proxy.huaweicloud.com")
        .withProxyPort(8080)
        .withProxyUsername("test")
        .withProxyPassword("test");
    ```

    2.3 连接配置（可选）

    ``` java 
    // 配置连接超时（可选）
    config.withTimeout(3);
    ```

    2.4 SSL配置（可选）

    ``` java
    // 配置跳过服务端证书验证（可选）
    config.withIgnoreSSLVerification(true);
    ```

3. 初始化认证信息

    3.1 使用永久AK/SK
    
    ``` java
    // Region级服务
    BasicCredentials credentials = new BasicCredentials()
        .withAk(ak)
        .withSk(sk)
        .withProjectId(projectId)
   
    // Global级服务
    GlobalCredentials credentials = new GlobalCredentials()
        .withAk(ak)
        .withSk(sk)
        .withDomainId(domainId);
    ```

    **说明**：
    全局服务当前仅支持IAM, TMS, EPS。
    
    Region级服务仅需要提供 projectId。Global级服务需要提供domainId。

    - `ak` 华为云账号 Access Key 。
    - `sk` 华为云账号 Secret Access Key 。
    - `projectId` 云服务所在项目 ID ，根据你想操作的项目所属区域选择对应的项目 ID 。
    - `domainId` 华为云账号ID 。
    
    3.2 使用临时AK/SK
    
    首选需要获得临时AK、SK和SecurityToken，获取可以从永久AK/SK获得，或者通过委托授权首选获得
    
    通过永久AK/SK获得可以参考文档：https://support.huaweicloud.com/api-iam/iam_04_0002.html, 对应IAM SDK 中的createTemporaryAccessKeyByToken方法。
    
    通过委托授权获得可以参考文档：https://support.huaweicloud.com/api-iam/iam_04_0101.html, 对应IAM SDK 中的createTemporaryAccessKeyByAgency方法。
    
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
    
4. 初始化客户端

    ``` java
   // 初始化指定云服务的客户端 {Service}Client ，以初始化 VpcClient 为例
    VpcClient vpcClient = VpcClient.newBuilder()
        .withHttpConfig(config)
        .withCredential(credentials)
        .withEndpoint(endpoint)
        .build();
    ```

    **说明：**
    - `endpoint` 华为云各服务应用区域和各服务的终端节点，详情请查看[地区和终端节点](https://developer.huaweicloud.com/endpoint)。

5. 发送请求并查看响应

    ``` java
    // 初始化请求，以调用接口 ListVpcs 为例
    ListVpcsResponse listVpcsResponse = vpcClient.listVpcs(new ListVpcsRequest());
    logger.info(listVpcsResponse.toString());
    ```

6. 异常处理

    | 一级分类 | 一级分类说明 | 二级分类 | 二级分类说明 |
    | :---- | :---- | :---- | :---- |
    | ConnectionException | 连接类异常 | HostUnreachableException | 网络不可达、被拒绝 |
    | | | SslHandShakeException | SSL认证异常 |
    | RequestTimeoutException | 响应超时异常 | CallTimeoutException | 单次请求，服务器处理超时未返回 |
    | | | RetryOutageException | 在重试策略消耗完成已后，仍无有效的响应 |
    | ServiceResponseException | 服务器响应异常 | ServerResponseException | 服务端内部错误，Http响应码：[500,] |
    | | | ClientRequestException | 请求参数不合法，Http响应码：[400， 500) |

    ``` java
    // 异常处理
    try {
        ListVpcResponse listVpcResponse = client.listVpcs(new ListVpcsRequest());
    } catch(ServiceResponseException e) {
        logger.error("HttpStatusCode: " + e.getHttpStatusCode());
        logger.error("RequestId: " + e.getRequestId());
        logger.error("ErrorCode: " + e.getErrorCode());
        logger.error("ErrorMsg: " + e.getErrorMsg());
    }
    ```

7. 异步客户端使用

    ``` java
    // 初始化异步客户端，以初始化 VpcAsyncClient 为例
    VpcAsyncClient vpcAsyncClient = VpcAsyncClient.newBuilder()
        .withHttpConfig(config)
        .withCredential(credentials)
        .withEndpoint(endpoint)
        .build();

    // 发送异步请求
    CompletableFuture<ListVpcsResponse> future = vpcAsyncClient.listVpcsAsync(new ListVpcsRequest());

    // 获取异步请求结果
    ListVpcsResponse response = future.get();
    logger.info(response.toString());
    ```

8. 访问日志

    **注意：** SDK在运行的时候采用了slf4j进行日志打印，如果在运行代码实例时，未配置日志实现库，会有提示如下：

    ``` shell
    SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
    SLF4J: Defaulting to no-operation (NOP) logger implementation
    SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
    ```

    所以根据目标项目实际情况引入对应的日志实现，请在对应的工程项目的 pom.xml 文件中引入日志实现的依赖，如：

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

   SDK默认会打印访问日志，每次请求都会有一条记录：

   ``` shell
   16:53:04.905 [main] INFO HuaweiCloud-SDK-Access - "GET https://ecs.cn-southwest-2.myhuaweicloud.com/v1/077d6a6c19000fdd2f3bc00150080291/cloudservers/detail?offset=1&limit=25" 200 2251 deabe20c14f997a0291fc451a4da16a4
   16:53:06.212 [main] INFO HuaweiCloud-SDK-Access - "PUT https://ecs.cn-southwest-2.myhuaweicloud.com/v1/077d6a6c19000fdd2f3bc00150080291/cloudservers/1aeac6fb-a2f2-48dc-9052-36637d119dd3" 200 880 f16f70e3fe245c11ab741760f8689a01
   17:02:37.734 [main] INFO HuaweiCloud-SDK-Access - "GET https://ecs.cn-southwest-2.myhuaweicloud.com/v1/077d6a6c19000fdd2f3bc00150080291/cloudservers/detail?offset=1&limit=-1" 400 165 8c3c8b6fed4482d28e1929a78dc93f04
   ```

   日志名称为"HuaweiCloud-SDK-Access", 日志格式为:

   ``` text
   "{httpMethod} {uri}" {httpStatusCode} {responseContentLength} {requestId}
   ```

   其中requestId是华为云APIG返回的请求ID，可以用户保障或者问题跟踪。

   可以根据项目情况在对应的日志配置文件中对访问日志进行屏蔽，或者单独打印到独立文件中。

   例如在logback中关闭访问日志：

   ``` xml
   <logger name="HuaweiCloud-SDK-Access" level="OFF"> </logger>
   ```

9. 原始Http侦听器

    在某些场景下可能对业务发出的Http请求进行Debug，需要看到原始的Http请求和返回信息，SDK提供侦听器功能来获取原始的为加密的Http请求和返回信息。

    > :warning:  Warning: 原始信息打印仅在debug阶段使用，请不要在生产系统中将原始的Http头和Body信息打印到日志，这些信息并未加密且其中包含敏感数据，例如所创建虚拟机的密码，IAM用户的密码等;
    当Body体为二进制内容,即Content-Type标识为二进制时 body为"***",详细内容不输出。

    ``` java
    HttpConfig config = new HttpConfig().addHttpListener(HttpListener.forRequestListener(requestListener ->
        // 注册侦听器后打印Http Request 原始信息,请勿在生产系统中使用
        logger.debug("REQUEST: {} {} {} {}",
            requestListener.httpMethod(),
            requestListener.uri(),
            requestListener.headers().entrySet().stream().flatMap(entry ->
                entry.getValue().stream().map(value -> entry.getKey() + " : " + value))
                .collect(Collectors.joining(";")),
            requestListener.body().orElse(""))));
        .addHttpListener(HttpListener.forResponseListener(responseListener ->
        // 注册侦听器后打印Http Request 原始信息,请勿在生产系统中使用
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

## 代码实例

- 使用如下代码同步查询特定 Region 下的 VPC 清单，实际使用中请将 `VpcClient` 替换为您使用的产品/服务相应的 `{Service}Client`。
- 调用前请根据实际情况替换如下变量： `{your ak string}`、`{your sk string}`、`{your endpoint string}` 以及 `{your project id}`。

    ``` java
    package com.huaweicloud.sdk.test;

    // 用户身份认证
    import com.huaweicloud.sdk.core.auth.BasicCredentials;
    // 请求异常类
    import com.huaweicloud.sdk.core.exception.ClientRequestException;
    import com.huaweicloud.sdk.core.exception.ServerResponseException;
    // Http配置
    import com.huaweicloud.sdk.core.http.HttpConfig;
    // 导入相应产品的 {Service}Client
    import com.huaweicloud.sdk.vpc.v2.VpcClient;
    // 导入待请求接口的 request 和 response 类
    import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
    import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;
    // 日志打印
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;

    public class Application {
        private static final Logger logger = LoggerFactory.getLogger(Application.class);

        public static void listVpcs(VpcClient client) {
            try {
                // 实例化ListVpcsRequest请求对象，调用listVpcs接口
                ListVpcsResponse listVpcsResponse = client.listVpcs(new ListVpcsRequest().withLimit(1));
                // 输出json格式的字符串响应
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

            // 配置客户端属性
            HttpConfig config = HttpConfig.getDefaultHttpConfig();
            config.withIgnoreSSLVerification(true);

            // 创建认证
            BasicCredentials auth = new BasicCredentials()
                .withAk(ak)
                .withSk(sk)
                .withProjectId(projectId);

            // 创建VpcClient实例并初始化
            VpcClient vpcClient = VpcClient.newBuilder()
                .withHttpConfig(config)
                .withCredential(auth)
                .withEndpoint(endpoint)
                .build();

            listVpcs(vpcClient);
        }
    }
    ```
