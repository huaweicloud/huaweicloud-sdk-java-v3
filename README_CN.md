[English](./README.md) | 简体中文

<p align="center">
  <a href="https://www.huaweicloud.com/"><img width="270px" height="90px" src="https://console-static.huaweicloud.com/static/authui/20210202115135/public/custom/images/logo.svg"></a>
</p>

<h1 align="center">华为云开发者 Java 软件开发工具包（Java SDK）</h1>

欢迎使用华为云 Java SDK 。

华为云 Java SDK 让您无需关心请求细节即可快速使用弹性云服务器、虚拟私有云等多个华为云服务。

这里将向您介绍如何获取并使用华为云 Java SDK 。

## 使用前提

- 要使用华为云 Java SDK ，您需要拥有华为云账号以及该账号对应的 Access Key（AK）和 Secret Access Key（SK）。请在华为云控制台 “我的凭证-访问密钥” 页面上创建和查看您的 AK&SK
  。更多信息请查看 [访问密钥](https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html) 。

- 要使用华为云 Java SDK 访问指定服务的 API
  ，您需要确认已在 [华为云控制台](https://console.huaweicloud.com/console/?locale=zh-cn&region=cn-north-4#/home) 开通当前服务。

- 华为云 Java SDK 支持 **Java JDK 1.8** 及其以上版本。

## SDK 获取和安装

推荐您通过 Maven 安装依赖的方式使用华为云 Java SDK：

首先您需要在您的操作系统中 [下载](https://maven.apache.org/download.cgi) 并 [安装](https://maven.apache.org/install.html) Maven ，安装完成后您只需在
Maven 项目的 `pom.xml` 文件加入相应的依赖项即可。

### 独立服务包：

根据需要独立引入SDK依赖包 。以使用云服务器ECS和虚拟私有云 VPC SDK 为例，您需要安装 `huaweicloud-sdk-ecs`和 `huaweicloud-sdk-vpc` ：

``` xml
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-ecs</artifactId>
    <version>[3.0.40-rc, 3.1.0-rc)</version>
</dependency>
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-vpc</artifactId>
    <version>[3.0.40-rc, 3.1.0-rc)</version>
</dependency>
```

### 整个SDK包：

可以只添加一个依赖包导入所有支持的服务(3.0.40-rc版本后)：

```xml
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-all</artifactId>
    <version>3.0.40-rc</version>
</dependency>
```

### 整个SDK Bundle包：

当出现第三方库冲突的时候，可以引入如下bundle包(3.0.40-rc版本后)，该包包含所有支持的服务和重定向了SDK依赖的第三方软件，避免和业务自身依赖的库产生冲突：

```xml
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-bundle</artifactId>
    <version>3.0.40-rc</version>
</dependency>
```

常见冲突例如Jackson，okhttp3版本冲突等。



## 代码示例

- 使用如下代码同步查询指定 Region 下的 VPC 列表，实际使用中请将 `VpcClient` 替换为您使用的产品/服务相应的 `{Service}Client` 。
- 调用前请根据实际情况替换如下变量： `{your ak string}`、`{your sk string}`、`{your endpoint string}` 以及 `{your project id}`。

``` java
package com.huaweicloud.sdk.test;

/* 导入依赖模块 */
// 日志打印
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// 用户身份认证
import com.huaweicloud.sdk.core.auth.BasicCredentials;
// 请求异常类
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
// Http配置
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.vpc.v2.VpcClient;
// 导入待请求接口的 request 和 response 类
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void listVpcs(VpcClient client) {
        try {
            // 实例化ListVpcsRequest请求对象，调用listVpcs接口
            ListVpcsResponse listVpcsResponse = client.listVpcs(new ListVpcsRequest().withLimit(1));
            // 输出json格式的字符串响应
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

## 在线调试

[API Explorer](https://apiexplorer.developer.huaweicloud.com/apiexplorer/overview)
提供API检索及平台调试，支持全量快速检索、可视化调试、帮助文档查看、在线咨询。

## 变更日志

每个版本的详细更改记录可在 [变更日志](https://github.com/huaweicloud/huaweicloud-sdk-java-v3/blob/master/CHANGELOG_CN.md) 中查看。

## 用户手册 [:top:](#华为云开发者-java-软件开发工具包java-sdk)

* [1. 客户端连接参数](#1-客户端连接参数-top)
    * [1.1 默认配置](#11-默认配置-top)
    * [1.2 网络代理](#12-网络代理-top)
    * [1.3 超时配置](#13-超时配置-top)
    * [1.4 SSL 配置](#14-ssl-配置-top)
* [2. 客户端认证信息](#2-客户端认证信息-top)
    * [2.1 使用永久 AK 和 SK](#21-使用永久-ak-和-sk-top)
    * [2.2 使用临时 AK 和 SK](#22-使用临时-ak-和-sk-top)
* [3. 客户端初始化](#3-客户端初始化-top)
    * [3.1 指定云服务 Endpoint 方式](#31-指定云服务-endpoint-方式-top)
    * [3.2 指定 Region 方式（推荐）](#32-指定-region-方式-推荐-top)
* [4. 发送请求并查看响应](#4-发送请求并查看响应-top)
    * [4.1 异常处理](#41-异常处理-top)
* [5. 异步客户端使用](#5-异步客户端使用-top)
* [6. 故障处理](#6-故障处理-top)
    * [6.1 访问日志](#61-访问日志-top)
    * [6.2 HTTP 监听器](#62-http-监听器-top)

### 1. 客户端连接参数 [:top:](#用户手册-top)

#### 1.1 默认配置 [:top:](#用户手册-top)

``` java
// 使用默认配置
HttpConfig config = HttpConfig.getDefaultHttpConfig();
```

#### 1.2 网络代理 [:top:](#用户手册-top)

当前 Java SDK 仅支持配置 HTTP 代理。

``` java
// 根据需要配置网络代理，网络代理默认的协议为 `http` 协议
config.withProxyHost("proxy.huaweicloud.com")
    .withProxyPort(8080)
    .withProxyUsername("test")
    .withProxyPassword("test");
```

#### 1.3 超时配置 [:top:](#用户手册-top)

``` java 
// 默认连接超时时间为60秒，可根据需要调整
config.withTimeout(60);
```

#### 1.4 SSL 配置 [:top:](#用户手册-top)

``` java
// 根据需要配置是否跳过SSL证书验证
config.withIgnoreSSLVerification(true);
```

### 2. 客户端认证信息 [:top:](#用户手册-top)

华为云服务存在两种部署方式，Region 级服务和 Global 级服务。

Global 级服务有 BSS、DevStar、EPS、IAM、OSM、RMS、TMS。

Region 级服务使用 BasicCredentials 初始化，需要提供 projectId 。Global 级服务使用 GlobalCredentials 初始化，需要提供 domainId 。

**认证参数说明**：

- `ak` - 华为云账号 Access Key
- `sk` - 华为云账号 Secret Access Key
- `projectId` - 云服务所在项目 ID ，根据你想操作的项目所属区域选择对应的项目 ID
- `domainId` - 华为云账号 ID
- `securityToken` - 采用临时 AK&SK 认证场景下的安全票据

客户端认证可以使用永久 AK&SK 认证，也可以使用临时 AK&SK&SecurityToken 认证。

#### 2.1 使用永久 AK 和 SK [:top:](#用户手册-top)

``` java
// Region级服务
BasicCredentials basicCredentials = new BasicCredentials()
    .withAk(ak)
    .withSk(sk)
    .withProjectId(projectId);

// Global级服务
GlobalCredentials globalCredentials = new GlobalCredentials()
    .withAk(ak)
    .withSk(sk)
    .withDomainId(domainId);
```

**说明**：

- `3.0.26-beta` 及以上版本支持自动获取 projectId/domainId ，用户需要指定当前华为云账号的永久 AK&SK 和 对应的 region_id，同时在初始化客户端时配合 `withRegion()`
  方法使用。代码示例详见 [3.2 指定Region方式（推荐）](#32-指定-region-方式-推荐-top)。

#### 2.2 使用临时 AK 和 SK [:top:](#用户手册-top)

首先需要获得临时 AK、SK 和 SecurityToken ，可以从永久 AK&SK 获得，或者通过委托授权获得。

- 通过永久 AK&SK 获得可以参考文档：https://support.huaweicloud.com/api-iam/iam_04_0002.html ，对应 IAM SDK
  中的 `CreateTemporaryAccessKeyByToken` 方法。

- 通过委托授权获得可以参考文档：https://support.huaweicloud.com/api-iam/iam_04_0101.html ，对应 IAM SDK
  中的 `CreateTemporaryAccessKeyByAgency` 方法。

临时 AK&SK&SecurityToken 获取成功后，可使用如下方式初始化认证信息：

``` java
// Region级服务
BasicCredentials basicCredentials = new BasicCredentials()
    .withAk(ak)
    .withSk(sk)
    .withSecurityToken(securityToken)
    .withProjectId(projectId)

// Global级服务
GlobalCredentials globalCredentials = new GlobalCredentials()
    .withAk(ak)
    .withSk(sk)
    .withSecurityToken(securityToken)
    .withDomainId(domainId);
```

### 3. 客户端初始化 [:top:](#用户手册-top)

客户端初始化有两种方式，可根据需要选择下列两种方式中的一种：

#### 3.1 指定云服务 Endpoint 方式 [:top:](#用户手册-top)

``` java
// 指定终端节点，以 VPC 服务北京四的 endpoint 为例
String endpoint = "https://vpc.cn-north-4.myhuaweicloud.com";

// 初始化客户端认证信息，需要填写相应 projectId/domainId，以初始化 BasicCredentials 为例
BasicCredentials basicCredentials = new BasicCredentials()
    .withAk(ak)
    .withSk(sk)
    .withProjectId(projectId);

// 初始化指定云服务的客户端 {Service}Client ，以初始化 Region 级服务 VPC 的 VpcClient 为例
VpcClient vpcClient = VpcClient.newBuilder()
    .withHttpConfig(config)
    .withCredential(basicCredentials)
    .withEndpoint(endpoint)
    .build();
```

**说明：**

- `endpoint` 是华为云各服务应用区域和各服务的终端节点，详情请查看 [地区和终端节点](https://developer.huaweicloud.com/endpoint) 。
  
- 当用户使用指定 Region 方式无法自动获取 projectId 时，可以使用当前方式调用接口。

#### 3.2 指定 Region 方式 **（推荐）** [:top:](#用户手册-top)

``` java
// 增加region依赖
import com.huaweicloud.sdk.iam.v3.region.IamRegion;

// 初始化客户端认证信息，使用当前客户端初始化方式可不填 projectId/domainId，以初始化 GlobalCredentials 为例
GlobalCredentials globalCredentials = new GlobalCredentials()
    .withAk(ak)
    .withSk(sk);

// 初始化指定云服务的客户端 {Service}Client ，以初始化 Global 级服务 IAM 的 IamClient 为例
IamClient iamClient = IamClient.newBuilder()
    .withHttpConfig(config)
    .withCredential(globalCredentials)
    .withRegion(IamRegion.CN_NORTH_4)
    .build();
```

**说明：**

- 指定 Region 方式创建客户端的场景，支持自动获取用户的 projectId 或者 domainId，初始化认证信息时可无需指定相应参数。

- **不适用**于 `多ProjectId` 的场景。

- 当前支持指定 Region 方式初始化客户端的 region_id : af-south-1, ap-southeast-1, ap-southeast-2, ap-southeast-3, cn-east-2, cn-east-3,
  cn-north-1, cn-north-4, cn-south-1, cn-southwest-2, ru-northwest-2。调用其他 region 可能会抛出 `Unsupported regionId` 的异常信息。

**两种方式对比：**

| 初始化方式 | 优势 | 劣势 |
| :---- | :---- | :---- | 
| 指定云服务 Endpoint 方式 | 只要接口已在当前环境发布就可以成功调用 | 需要用户自行查找并填写 projectId 和 endpoint
| 指定 Region 方式 | 无需指定 projectId 和 endpoint，按照要求配置即可自动获取该值并回填 | 支持的服务和 region 有限制

### 4. 发送请求并查看响应 [:top:](#用户手册-top)

``` java
// 初始化请求，以调用接口 ListVpcs 为例
ListVpcRequest request = new ListVpcsRequest().withLimit(1);

ListVpcsResponse response = client.listVpcs(request); 
logger.info(response.toString());
```

#### 4.1 异常处理 [:top:](#用户手册-top)

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

### 5. 异步客户端使用 [:top:](#用户手册-top)

``` java
// 初始化异步客户端，以初始化 VpcAsyncClient 为例
VpcAsyncClient vpcAsyncClient = VpcAsyncClient.newBuilder()
    .withHttpConfig(config)
    .withCredential(basicCredentials)
    .withEndpoint(endpoint)
    .build();

// 发送异步请求
CompletableFuture<ListVpcsResponse> future = vpcAsyncClient.listVpcsAsync(new ListVpcsRequest().withLimit(1));

// 获取异步请求结果
ListVpcsResponse response = future.get();
```

### 6. 故障处理 [:top:](#用户手册-top)

SDK 提供 Access 级别的访问日志及 Debug 级别的原始 HTTP 监听器日志，用户可根据需要进行配置。

#### 6.1 访问日志 [:top:](#用户手册-top)

**注意：** SDK在运行的时候默认采用slf4j进行日志打印，如果在运行代码实例时，未配置日志实现库，会有提示如下：

``` text
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
```

所以需要用户根据目标项目实际情况引入对应的日志实现，请在对应的工程项目的 pom.xml 文件中引入日志实现的依赖，如：

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

SDK 默认会打印访问日志，每次请求都会有一条记录：

``` text
16:53:04.905 [main] INFO HuaweiCloud-SDK-Access - "GET https://ecs.cn-southwest-2.myhuaweicloud.com/v1/077d6a6c19000fdd2f3bc00150080291/cloudservers/detail?offset=1&limit=25" 200 2251 deabe20c14f997a0291fc451a4da16a4
16:53:06.212 [main] INFO HuaweiCloud-SDK-Access - "PUT https://ecs.cn-southwest-2.myhuaweicloud.com/v1/077d6a6c19000fdd2f3bc00150080291/cloudservers/1aeac6fb-a2f2-48dc-9052-36637d119dd3" 200 880 f16f70e3fe245c11ab741760f8689a01
17:02:37.734 [main] INFO HuaweiCloud-SDK-Access - "GET https://ecs.cn-southwest-2.myhuaweicloud.com/v1/077d6a6c19000fdd2f3bc00150080291/cloudservers/detail?offset=1&limit=-1" 400 165 8c3c8b6fed4482d28e1929a78dc93f04
```

日志名称为 "HuaweiCloud-SDK-Access" , 日志格式为：

``` text
"{httpMethod} {uri}" {httpStatusCode} {responseContentLength} {requestId}
```

其中 requestId 是华为云 API Gateway 返回的请求 ID ，可以用于用户报障或者问题跟踪。

可以根据项目情况在对应的日志配置文件中对访问日志进行屏蔽，或者单独打印到独立文件中。

例如在 logback 中关闭访问日志：

``` xml
<logger name="HuaweiCloud-SDK-Access" level="OFF"> </logger>
```

#### 6.2 HTTP 监听器 [:top:](#用户手册-top)

在某些场景下可能对业务发出的 HTTP 请求进行 Debug ，需要看到原始的 HTTP 请求和返回信息， SDK 提供监听器功能来获取原始的为加密的 HTTP 请求和返回信息。

> :warning:  Warning: 原始信息打印仅在 Debug 阶段使用，请不要在生产系统中将原始的 HTTP 头和 Body 信息打印到日志，这些信息并未加密且其中包含敏感数据，例如所创建虚拟机的密码，IAM 用户的密码等；当 Body 体为二进制内容，即 Content-Type 标识为二进制时，Body 为"***"，详细内容不输出。

``` java
HttpConfig config = new HttpConfig().addHttpListener(HttpListener.forRequestListener(requestListener ->
    // 注册监听器后打印Http Request 原始信息,请勿在生产系统中使用
    logger.debug("REQUEST: {} {} {} {}",
        requestListener.httpMethod(),
        requestListener.uri(),
        requestListener.headers().entrySet().stream().flatMap(entry ->
            entry.getValue().stream().map(value -> entry.getKey() + " : " + value))
            .collect(Collectors.joining(";")),
        requestListener.body().orElse(""))))
    .addHttpListener(HttpListener.forResponseListener(responseListener ->
        // 注册监听器后打印Http Request 原始信息,请勿在生产系统中使用
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
