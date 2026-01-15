[English](./README.md) | 简体中文

<p align="center">
  <a href="https://www.huaweicloud.com/"><img width="270px" height="90px" src="https://console-static.huaweicloud.com/static/authui/20210202115135/public/custom/images/logo.svg"></a>
</p>

<h1 align="center">华为云开发者 Java 软件开发工具包（Java SDK）</h1>

![Java](https://img.shields.io/badge/Java-8%2B-007396?logo=java&logoColor=white)
[![Maven Central Version](https://img.shields.io/maven-central/v/com.huaweicloud.sdk/huaweicloud-sdk)](https://central.sonatype.com/search?q=huaweicloud-sdk&namespace=com.huaweicloud.sdk)
[![License](https://img.shields.io/badge/license-Apache--2.0-green)](https://www.apache.org/licenses/LICENSE-2.0)

欢迎使用华为云 Java SDK 。

华为云 Java SDK 让您无需关心请求细节即可快速使用弹性云服务器（ECS）、虚拟私有云（VPC）等多个华为云服务。

这里将向您介绍如何获取并使用华为云 Java SDK 。

## 使用前提

- 要使用华为云 Java SDK ，您需要拥有华为云账号以及该账号对应的 Access Key（AK）和 Secret Access Key（SK）。请在华为云控制台 “我的凭证-访问密钥” 页面上创建和查看您的 AK&SK
  。更多信息请查看 [访问密钥](https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html) 。

- 要使用华为云 Java SDK 访问指定服务的 API
  ，您需要确认已在 [华为云控制台](https://console.huaweicloud.com/console/?locale=zh-cn&region=cn-north-4#/home) 开通当前服务。

- 华为云 Java SDK 支持 **Java JDK 1.8** 及其以上版本。

## 隐私声明

- 收集信息：
为完成华为云服务开放API调用的必要校验，SDK需要使用由华为云控制台下载的用户访问密钥（AK）进行签名，该过程不会上传您的私有密钥（SK）。

- 本工具默认会在请求头User-Agent中附加额外信息，附加信息包括客户端调用服务时所使用的SDK语言、客户端库版本、操作系统、时区语言信息和一个随机标识符，上述信息将用于保护您及您的用户的华为云账号安全。您可以通过自定义User-Agent的方式关闭上述行为 。

- 数据处理方式：当您使用本工具提供的服务开放API功能时，您的相关数据（如上传的文件、提交的文本内容）将通过加密传输通道（HTTPS） 直接发送至华为云服务端进行处理。

- 该过程由华为云服务端完成计算、存储或分析，数据不会在本应用客户端本地处理或持久化存储。

- 华为云将根据其服务协议和隐私政策作为数据处理方独立处理这些数据，我们仅作为控制方发起API请求。数据处理结果将返回至本工具供您使用。

- 华为云官方隐私声明：https://www.huaweicloud.com/declaration/sa_prp.html

## SDK 获取和安装

推荐您通过 Maven 安装依赖的方式使用华为云 Java SDK：

首先您需要在您的操作系统中 [下载](https://maven.apache.org/download.cgi) 并 [安装](https://maven.apache.org/install.html) Maven ，安装完成后您只需在
Maven 项目的 `pom.xml` 文件加入相应的依赖项即可。

指定依赖时请选择特定的版本号，否则可能会在构建时导致不可预见的问题。

您可以通过 [SDK中心](https://console.huaweicloud.com/apiexplorer/#/sdkcenter?language=Java) 或 [Maven中心仓库](https://central.sonatype.com/search?q=huaweicloud-sdk&namespace=com.huaweicloud.sdk) 查询SDK版本信息。

### 独立服务包：

根据需要独立引入SDK依赖包 。以 ECS 和 VPC SDK 为例，您需要安装 `huaweicloud-sdk-ecs`和 `huaweicloud-sdk-vpc`：

``` xml
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-ecs</artifactId>
    <version>${version}</version>
</dependency>
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-vpc</artifactId>
    <version>${version}</version>
</dependency>
```

### 整个SDK包：

支持只添加一个依赖包导入所有支持的服务(3.0.40-rc及以上版本)：

```xml

<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-all</artifactId>
    <version>${version}</version>
</dependency>
```

### 整个SDK Bundle包：

当出现第三方库冲突的时候，可以引入如下bundle包(3.0.40-rc及以上版本)，该包包含所有支持的服务和重定向了SDK依赖的第三方软件，避免和业务自身依赖的库产生冲突：

```xml

<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-bundle</artifactId>
    <version>${version}</version>
</dependency>
```

常见冲突例如Jackson，okhttp3版本冲突等。

**注意：** bundle包已经包含了core包和云服务集合包，不要再单独引入core包和服务包，根据maven依赖解析顺序，可能会导致bundle包不生效。

以下为错误示例：

```xml
<!-- 引入core包，会覆盖掉bundle包中的core包，请删除此依赖 -->
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-core</artifactId>
    <version>${version}</version>
</dependency>
<!-- 引入ecs包，会覆盖掉bundle包中的ecs服务包，请删除此依赖 -->
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-ecs</artifactId>
    <version>${version}</version>
</dependency>
<!-- 只保留bundle包即可 -->
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk-bundle</artifactId>
    <version>${version}</version>
</dependency>
```

## 代码示例

- 使用如下代码同步查询指定 Region 下的 VPC 列表，实际使用中请将 `VpcClient` 替换为您使用的产品/服务相应的 `{Service}Client` 。
- 认证用的ak和sk直接写到代码中有很大的安全风险，建议在配置文件或者环境变量中密文存放，使用时解密，确保安全。
- 本示例中的ak和sk保存在环境变量中，运行本示例前请先在本地环境中配置环境变量`HUAWEICLOUD_SDK_AK`和`HUAWEICLOUD_SDK_SK`。

**精简示例**

``` java
package com.huaweicloud.sdk.test;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exception.RequestTimeoutException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.vpc.v2.VpcClient;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;
import com.huaweicloud.sdk.vpc.v2.region.VpcRegion;

public class Application {
    public static void main(String[] args) {
        // 配置认证信息
        // 可通过环境变量等方式配置认证信息，参考2.4认证信息管理章节
        ICredential auth = new BasicCredentials()
                .withAk(System.getenv("HUAWEICLOUD_SDK_AK"))
                .withSk(System.getenv("HUAWEICLOUD_SDK_SK"));

        // 创建服务客户端
        VpcClient client = VpcClient.newBuilder()
                .withCredential(auth)
                .withRegion(VpcRegion.valueOf("cn-north-4"))
                .build();

        // 发送请求并获取响应
        ListVpcsRequest request = new ListVpcsRequest();
        try {
            ListVpcsResponse response = client.listVpcs(request);
            System.out.println(response.toString());
        } catch (ConnectionException | RequestTimeoutException e) {
            e.printStackTrace();
        } catch (ServiceResponseException e) {
            e.printStackTrace();
            System.out.println(e.getHttpStatusCode());
            System.out.println(e.getRequestId());
            System.out.println(e.getErrorCode());
            System.out.println(e.getErrorMsg());
        }
    }
}
```

**详细示例**

```java
package com.huaweicloud.sdk.test;

import com.huaweicloud.sdk.core.HttpListener;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.auth.SigningAlgorithm;
import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exception.RequestTimeoutException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.vpc.v2.VpcClient;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;
import com.huaweicloud.sdk.vpc.v2.region.VpcRegion;

import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        // 配置认证信息
        ICredential auth = new BasicCredentials()
                // 可通过环境变量等方式配置认证信息，参考2.4认证信息管理章节
                .withAk(System.getenv("HUAWEICLOUD_SDK_AK"))
                .withSk(System.getenv("HUAWEICLOUD_SDK_SK"))
                // 如果未填写ProjectId，SDK会自动调用IAM服务查询所在region对应的项目id
                .withProjectId("{your projectId string}")
                // 配置SDK内置的IAM服务地址
                .withIamEndpoint("https://iam.cn-north-4.myhuaweicloud.com");

        // 使用默认配置
        HttpConfig httpConfig = HttpConfig.getDefaultHttpConfig();
        // 配置是否忽略SSL证书校验， 默认不忽略
        httpConfig.withIgnoreSSLVerification(true);
        // 默认连接超时时间为60秒，可根据需要配置（v3.1.94及之前的版本）
        httpConfig.withTimeout(60);
        // 默认连接超时时间为60秒，可根据需要配置（v3.1.95版本起，优先使用withConnectionTimeout）
        httpConfig.withConnectionTimeout(60);
        // 默认读取超时时间为120秒，可根据需要配置
        httpConfig.withReadTimeout(120);
        // 根据需要配置网络代理，网络代理默认的协议为 `http` 协议
        // 请根据实际情况替换示例中的代理地址和端口号
        httpConfig.withProxyHost("proxy.huaweicloud.com")
                .withProxyPort(8080)
                // 如果代理需要认证，请配置用户名和密码
                .withProxyUsername(System.getenv("PROXY_USERNAME"))
                .withProxyPassword(System.getenv("PROXY_PASSWORD"));
        // 自定义SSLSocketFactory和TrustManager，需要用户自行实现
        httpConfig.withSSLSocketFactory(sslSocketFactory)
                .withX509TrustManager(trustManager);
        // 使用HMAC_SM3签名算法（需要JDK8u302及以上版本），默认签名算法为HMAC_SHA256
        httpConfig.withSigningAlgorithm(SigningAlgorithm.HMAC_SM3);
        // 注册监听器后打印原始请求信息,请勿用于生产环境
        HttpListener requestListener = HttpListener.forRequestListener(listener ->
                System.out.printf("> Request %s %s\n> Headers:\n%s\n> Body: %s\n",
                        listener.httpMethod(),
                        listener.uri(),
                        listener.headers().entrySet().stream()
                                .flatMap(entry -> entry.getValue().stream().map(
                                        value -> "\t" + entry.getKey() + ": " + value))
                                .collect(Collectors.joining("\n")),
                        listener.body().orElse("")));
        httpConfig.addHttpListener(requestListener);
        // 注册监听器后打印原始响应信息,请勿用于生产环境
        HttpListener responseListener = HttpListener.forResponseListener(listener ->
                System.out.printf("< Response %s %s %s\n< Headers:\n%s\n< Body: %s\n",
                        listener.httpMethod(),
                        listener.uri(),
                        listener.statusCode(),
                        listener.headers().entrySet().stream()
                                .flatMap(entry -> entry.getValue().stream().map(
                                        value -> "\t" + entry.getKey() + ": " + value))
                                .collect(Collectors.joining("\n")),
                        listener.body().orElse("")));
        httpConfig.addHttpListener(responseListener);

        // 创建服务客户端
        VpcClient client = VpcClient.newBuilder()
                // 配置认证信息
                .withCredential(auth)
                // 配置地区, 如果地区不存在会抛出IllegalArgumentException
                .withRegion(VpcRegion.valueOf("cn-north-4"))
                // HTTP配置
                .withHttpConfig(httpConfig)
                .build();

        // 创建请求
        ListVpcsRequest request = new ListVpcsRequest();
        // 配置每页返回的个数
        request.setLimit(1);
        try {
            // 发送请求并获取响应
            ListVpcsResponse response = client.listVpcs(request);
            System.out.println(response.toString());
        } catch (ConnectionException | RequestTimeoutException e) {
            e.printStackTrace();
        } catch (ServiceResponseException e) {
            e.printStackTrace();
            System.out.println(e.getHttpStatusCode());
            System.out.println(e.getRequestId());
            System.out.println(e.getErrorCode());
            System.out.println(e.getErrorMsg());
        }
    }
}
```

## 在线调试

[API Explorer](https://apiexplorer.developer.huaweicloud.com/apiexplorer/overview)
提供API检索、SDK示例及平台调试，支持全量快速检索、可视化调试、帮助文档查看、在线咨询。

## 变更日志

每个版本的详细更改记录可在 [变更日志](https://github.com/huaweicloud/huaweicloud-sdk-java-v3/blob/master/CHANGELOG_CN.md) 中查看。

## 用户手册 [:top:](#华为云开发者-java-软件开发工具包java-sdk)

* [1. 客户端连接参数](#1-客户端连接参数-top)
    * [1.1 默认配置](#11-默认配置-top)
    * [1.2 网络代理](#12-网络代理-top)
    * [1.3 超时配置](#13-超时配置-top)
    * [1.4 SSL 配置](#14-ssl-配置-top)
    * [1.5 签名算法](#15-签名算法-top)
* [2. 认证信息配置](#2-认证信息配置-top)
    * [2.1 使用临时 AK 和 SK](#21-使用临时-ak-和-sk-top)
    * [2.2 使用永久 AK 和 SK](#22-使用永久-ak-和-sk-top)
    * [2.3 使用 IdpId 和 IdTokenFile](#23-使用-idpid-和-idtokenfile-top)
    * [2.4 认证信息管理](#24-认证信息管理-top)
        * [2.4.1 环境变量](#241-环境变量-top)
        * [2.4.2 配置文件](#242-配置文件-top)
        * [2.4.3 实例元数据](#243-实例元数据-top)
        * [2.4.4 认证信息提供链](#244-认证信息提供链-top)
* [3. 客户端初始化](#3-客户端初始化-top)
    * [3.1 指定云服务 Endpoint 方式](#31-指定云服务-endpoint-方式-top)
    * [3.2 指定 Region 方式（推荐）](#32-指定-region-方式-推荐-top)
    * [3.3 自定义配置](#33-自定义配置-top)
        * [3.3.1 IAM endpoint配置](#331-iam-endpoint配置-top)
        * [3.3.2 Region配置](#332-region配置-top)
    * [3.4 用户代理](#34-用户代理-top)
* [4. 发送请求并查看响应](#4-发送请求并查看响应-top)
    * [4.1 异常处理](#41-异常处理-top)
* [5. 异步客户端使用](#5-异步客户端使用-top)
* [6. 故障处理](#6-故障处理-top)
    * [6.1 访问日志](#61-访问日志-top)
    * [6.2 HTTP 监听器](#62-http-监听器-top)
* [7. 接口调用器](#7-接口调用器-top)
    * [7.1 自定义请求头](#71-自定义请求头-top)
    * [7.2 请求重试](#72-请求重试-top)
        * [7.2.1 同步客户端请求重试](#721-同步客户端请求重试-top)
        * [7.2.2 异步客户端请求重试](#722-异步客户端请求重试-top)
        * [7.2.3 典型重试场景调用示例](#723-典型重试场景调用示例-top)
* [8. 文件上传与下载](#8-文件上传与下载-top)
    * [8.1 上传与下载](#81-上传与下载-top)
    * [8.2 获取进度](#82-获取进度-top)
* [9. FAQ](#9-faq-top)
    * [9.1 云联盟场景如何调用](#91-云联盟场景如何调用-top)

### 1. 客户端连接参数 [:top:](#用户手册-top)

#### 1.1 默认配置 [:top:](#用户手册-top)

``` java
import com.huaweicloud.sdk.core.http.HttpConfig;

// 使用默认配置
HttpConfig httpConfig = HttpConfig.getDefaultHttpConfig();

VpcClient client = VpcClient.newBuilder()
        .withHttpConfig(httpConfig)
        .build();
```

#### 1.2 网络代理 [:top:](#用户手册-top)

当前 Java SDK 仅支持配置 HTTP 代理。

``` java
// 根据需要配置网络代理，网络代理默认的协议为 `http` 协议
HttpConfig httpConfig = HttpConfig.getDefaultHttpConfig()
    // 请根据实际情况替换示例中的代理地址和端口号
    .withProxyHost("proxy.xxx.com")
    .withProxyPort(12345)
    // 如果代理需要认证，请配置用户名和密码
    // 本示例中的账号和密码保存在环境变量中，运行本示例前请先在本地环境中配置环境变量PROXY_USERNAME和PROXY_PASSWORD
    .withProxyUsername(System.getenv("PROXY_USERNAME"))
    .withProxyPassword(System.getenv("PROXY_PASSWORD"));

VpcClient client = VpcClient.newBuilder()
        .withHttpConfig(httpConfig)
        .build();
```

#### 1.3 超时配置 [:top:](#用户手册-top)

``` java

HttpConfig httpConfig = HttpConfig.getDefaultHttpConfig()
// 默认连接超时时间为60秒，可根据需要配置（v3.1.94及之前的版本）
.withTimeout(60);
// 默认连接超时时间为60秒，可根据需要调整（v3.1.95版本起，优先使用withConnectionTimeout）
.withConnectionTimeout(60)
// 默认读取超时时间为120秒，可根据需要调整
.withReadTimeout(120);

VpcClient client = VpcClient.newBuilder()
        .withHttpConfig(httpConfig)
        .build();
```

#### 1.4 SSL 配置 [:top:](#用户手册-top)

SDK使用的是 **Java 默认信任库**，即 `$JAVA_HOME/lib/security/cacerts`中的证书，如果其中**证书链不完整或不受信任**可能会导致**SSLHandshakeException、SSLPeerUnverifiedException、SunCertPathBuilderException**等异常，可以通过 **Java自带工具 keytool** 确认证书是否存在问题。

同时SDK也支持 **SSL跳过验证** 和 **自定义配置**。

跳过验证：

``` java
// 根据需要配置是否跳过SSL证书验证, 请勿用于生产环境
HttpConfig httpConfig = HttpConfig.getDefaultHttpConfig().withIgnoreSSLVerification(true);

VpcClient client = VpcClient.newBuilder()
        .withHttpConfig(httpConfig)
        .build();
```

自定义配置：

```java
// 自定义SSLSocketFactory、TrustManager和HostnameVerifier，需要用户自行实现
HttpConfig httpConfig = HttpConfig.getDefaultHttpConfig()
    .withSSLSocketFactory(sslSocketFactory)
    .withX509TrustManager(trustManager)
    .withHostnameVerifier(hostnameVerifier);

VpcClient client = VpcClient.newBuilder()
        .withHttpConfig(httpConfig)
        .build();
```

#### 1.5 签名算法 [:top:](#用户手册-top)

```java
import com.huaweicloud.sdk.core.auth.SigningAlgorithm;

// 使用HMAC_SM3签名算法需要JDK8u302及以上版本, 默认签名算法为HMAC_SHA256
HttpConfig.getDefaultHttpConfig().withSigningAlgorithm(SigningAlgorithm.HMAC_SM3);

VpcClient client = VpcClient.newBuilder()
        .withHttpConfig(httpConfig)
        .build();
```

### 2. 认证信息配置 [:top:](#用户手册-top)

华为云服务存在两种部署方式，Region 级服务和 Global 级服务。

Global 级服务有 BSS、DevStar、EPS、IAM、OSM、RMS、TMS。

Region 级服务使用 BasicCredentials 初始化，需要提供 projectId 。

Global 级服务使用 GlobalCredentials 初始化，需要提供 domainId 。

客户端认证方式支持以下几种：

- 临时 AK&SK&SecurityToken 认证
- 永久 AK&SK 认证
- IdpId&IdTokenFile 认证

#### 2.1 使用临时 AK 和 SK [:top:](#用户手册-top)

临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期可在15分钟至24小时范围内设置，过期后需要重新获取。 首先需要获得临时 AK、SK 和 SecurityToken ，可以从永久 AK&SK 获得，或者通过委托授权获得。

- 通过永久 AK&SK 获得可以参考文档：https://support.huaweicloud.com/api-iam/iam_04_0002.html ，对应 IAM SDK
  中的 `CreateTemporaryAccessKeyByToken` 方法。

- 通过委托授权获得可以参考文档：https://support.huaweicloud.com/api-iam/iam_04_0101.html ，对应 IAM SDK
  中的 `CreateTemporaryAccessKeyByAgency` 方法。

**认证参数说明**：

- `ak` - 华为云账号 Access Key
- `sk` - 华为云账号 Secret Access Key
- `projectId` - 云服务所在项目 ID ，根据你想操作的项目所属区域选择对应的项目 ID
- `domainId` - 华为云账号 ID
- `securityToken` - 采用临时 AK&SK 认证场景下的安全票据

临时 AK&SK&SecurityToken 获取成功后，可使用如下方式初始化认证信息：

``` java
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.GlobalCredentials;

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

#### 2.2 使用永久 AK 和 SK [:top:](#用户手册-top)

> ⚠️华为云主账号为管理员，对资源及云服务具有完全的访问权限，AK和SK一旦泄露，会给系统带来信息安全风险，不建议使用。
> 推荐使用最小化授权的IAM用户的AK和SK，关于IAM的安全使用最佳实践，请参考[IAM的安全使用最佳实践](https://support.huaweicloud.com/bestpractice-iam/iam_0426.html)。

获取AK/SK请参考 https://support.huaweicloud.com/devg-apisign/api-sign-provide-aksk.html

**认证参数说明**：

- `ak` - 华为云账号 Access Key
- `sk` - 华为云账号 Secret Access Key
- `projectId` - 云服务所在项目 ID ，根据你想操作的项目所属区域选择对应的项目 ID
- `domainId` - 华为云账号 ID

``` java
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.GlobalCredentials;

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

#### 2.3 使用 IdpId 和 IdTokenFile [:top:](#用户手册-top)

通过OpenID Connect ID token方式获取联邦认证token, 可参考文档：[获取联邦认证token(OpenID Connect ID token方式)](https://support.huaweicloud.com/api-iam/iam_13_0605.html)

**认证参数说明**：

- `IdpId` 身份提供商ID
- `IdTokenFile` 存放id_token的文件路径，id_token由企业IdP构建，携带联邦用户身份信息
- `projectId` 云服务所在项目 ID ，根据你想操作的项目所属区域选择对应的项目 ID
- `domainId` 华为云账号 ID

``` java
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.GlobalCredentials;

// Region级服务
BasicCredentials basicCredentials = new BasicCredentials()
    .withIdpId(idpId)
    .withIdTokenFile(idTokenFile)
    .withProjectId(projectId)

// Global级服务
GlobalCredentials globalCredentials = new GlobalCredentials()
    .withIdpId(idpId)
    .withIdTokenFile(idTokenFile)
    .withDomainId(domainId);
```

#### 2.4 认证信息管理 [:top:](#用户手册-top)

从**3.0.97**版本起，支持从各类提供器中获取认证信息

**Region级服务** 请使用 `XxxCredentialProvider.getBasicCredentialXxxProvider()`

**Global级服务** 请使用 `XxxCredentialProvider.getGlobalCredentialXxxProvider()`

##### 2.4.1 环境变量 [:top:](#用户手册-top)

**AK/SK认证**

| 环境变量  |  说明 |
| ------------ | ------------ |
| HUAWEICLOUD_SDK_AK  | 必填，AccessKey  |
| HUAWEICLOUD_SDK_SK  |  必填，SecretKey |
| HUAWEICLOUD_SDK_SECURITY_TOKEN  | 可选, 使用临时ak/sk认证时需要指定该参数  |
| HUAWEICLOUD_SDK_PROJECT_ID  | 可选，用于Region级服务，多ProjectId场景下必填  |
| HUAWEICLOUD_SDK_DOMAIN_ID  | 可选，用于Global级服务  |

配置环境变量：

```
// Linux
export HUAWEICLOUD_SDK_AK=YOUR_AK
export HUAWEICLOUD_SDK_SK=YOUR_SK

// Windows
set HUAWEICLOUD_SDK_AK=YOUR_AK
set HUAWEICLOUD_SDK_SK=YOUR_SK
```

从配置的环境变量中获取认证信息：

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

**IdpId/IdTokenFile认证**

| 环境变量  |  说明 |
| ------------ | ------------ |
| HUAWEICLOUD_SDK_IDP_ID  | 必填，身份提供商ID |
| HUAWEICLOUD_SDK_ID_TOKEN_FILE  |  必填，存放id_token的文件路径 |
| HUAWEICLOUD_SDK_PROJECT_ID  | basic类型认证时，该参数必填  |
| HUAWEICLOUD_SDK_DOMAIN_ID  | global类型认证时，该参数必填  |

配置环境变量：

```
// Linux
export HUAWEICLOUD_SDK_IDP_ID=YOUR_IDP_ID
export HUAWEICLOUD_SDK_ID_TOKEN_FILE=/some_path/your_token_file
export HUAWEICLOUD_SDK_PROJECT_ID=YOUR_PROJECT_ID // basic认证时必填
export HUAWEICLOUD_SDK_DOMAIN_ID=YOUR_DOMAIN_ID // global认证时必填

// Windows
set HUAWEICLOUD_SDK_IDP_ID=YOUR_IDP_ID
set HUAWEICLOUD_SDK_ID_TOKEN_FILE=/some_path/your_token_file
set HUAWEICLOUD_SDK_PROJECT_ID=YOUR_PROJECT_ID // basic认证时必填
set HUAWEICLOUD_SDK_DOMAIN_ID=YOUR_DOMAIN_ID // global认证时必填
```

从配置的环境变量中获取认证信息：

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

##### 2.4.2 配置文件 [:top:](#用户手册-top)

默认会从用户主目录下读取认证信息配置文件，linux为`~/.huaweicloud/credentials`，windows为`C:\Users\USER_NAME\.huaweicloud\credentials`，可以通过配置环境变量`HUAWEICLOUD_SDK_CREDENTIALS_FILE`来修改默认文件的路径

**AK/SK认证**

| 配置参数  |  说明 |
| ------------ | ------------ |
| ak  | 必填，AccessKey  |
| sk  |  必填，SecretKey |
| security_token  | 可选, 使用临时ak/sk认证时需要指定该参数  |
| project_id  | 可选，用于Region级服务，多ProjectId场景下必填  |
| domain_id  | 可选，用于Global级服务  |
| iam_endpoint  | 可选，用于身份认证的endpoint，默认为`https://iam.myhuaweicloud.com` |

配置文件内容如下：

```ini
[basic]
ak = your_ak
sk = your_sk

[global]
ak = your_ak
sk = your_sk
```

从配置文件中读取认证信息：

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

**IdpId/IdTokenFile认证**

| 配置参数  |  说明 |
| ------------ | ------------ |
| idp_id  | 必填，身份提供商ID |
| id_token_file  |  必填，存放id_token的文件路径 |
| project_id  | basic类型认证时，该参数必填  |
| domain_id  | global类型认证时，该参数必填  |
| iam_endpoint  | 可选，用于身份认证的endpoint，默认为`https://iam.myhuaweicloud.com` |

配置文件内容如下：

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

从配置文件中读取认证信息：

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

##### 2.4.3 实例元数据 [:top:](#用户手册-top)

从实例元数据获取临时AK/SK和securitytoken，关于元数据获取请参阅：[元数据获取](https://support.huaweicloud.com/usermanual-ecs/ecs_03_0166.html)

手动获取实例元数据认证信息：

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

##### 2.4.4 认证信息提供链 [:top:](#用户手册-top)

在创建服务客户端，未显式指定认证信息时，按照顺序 **环境变量 -> 配置文件 -> 实例元数据** 尝试加载认证信息

通过提供链获取认证信息：

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

支持自定义认证信息提供链：

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

### 3. 客户端初始化 [:top:](#用户手册-top)

客户端初始化有两种方式，可根据需要选择下列两种方式中的一种：

#### 3.1 指定云服务 Endpoint 方式 [:top:](#用户手册-top)

``` java
// 初始化客户端认证信息，需要填写相应 projectId/domainId，以初始化 BasicCredentials 为例
BasicCredentials basicCredentials = new BasicCredentials()
    .withAk(ak)
    .withSk(sk)
    .withProjectId(projectId);

// 初始化指定云服务的客户端 {Service}Client ，以初始化 Region 级服务 VPC 的 VpcClient 为例
VpcClient vpcClient = VpcClient.newBuilder()
    .withHttpConfig(config)
    .withCredential(basicCredentials)
    // 指定终端节点，以 VPC 服务北京四的 endpoint 为例
    .withEndpoint("https://vpc.cn-north-4.myhuaweicloud.com")
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
    .withCredential(globalCredentials)
    .withRegion(IamRegion.CN_NORTH_4)
    .build();
```

**说明：**

- 指定 Region 方式创建客户端的场景，支持自动获取用户的 projectId 或者 domainId，初始化认证信息时可无需指定相应参数。

- **不适用**于 `多ProjectId` 的场景。

- 支持指定的 Region 可通过[地区和终端节点](https://console.huaweicloud.com/apiexplorer/#/endpoint)查询。调用不支持的 region 可能会抛出 `Unsupported regionId` 的异常信息。

**两种方式对比：**

| 初始化方式 | 优势 | 劣势 |
| :---- | :---- | :---- |
| 指定云服务 Endpoint 方式 | 只要接口已在当前环境发布就可以成功调用 | 需要用户自行查找并填写 projectId 和 endpoint
| 指定 Region 方式 | 无需指定 projectId 和 endpoint，按照要求配置即可自动获取该值并回填 | 支持的服务和 region 有限制

#### 3.3 自定义配置 [:top:](#用户手册-top)

**注：** 3.0.93版本起支持

##### 3.3.1 IAM endpoint配置 [:top:](#用户手册-top)

自动获取用户的 projectId 和 domainId 会分别调用统一身份认证服务的 [KeystoneListProjects](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=IAM&api=KeystoneListProjects) 和 [KeystoneListAuthDomains](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=IAM&api=KeystoneListAuthDomains) 接口。

默认访问的endpoint会从[映射表](./core/src/main/resources/iam_endpoints.json)中查询，如果查不到则会使用默认值 **https://iam.myhuaweicloud.com**

**欧洲站用户需要指定 endpoint 为 https://iam.eu-west-101.myhuaweicloud.eu** ，用户可以通过以下两种方式来修改endpoint

###### 3.3.1.1 全局级 [:top:](#用户手册-top)

全局范围生效，通过环境变量`HUAWEICLOUD_SDK_IAM_ENDPOINT`指定

```
//linux
export HUAWEICLOUD_SDK_IAM_ENDPOINT=https://iam.cn-north-4.myhuaweicloud.com

//windows
set HUAWEICLOUD_SDK_IAM_ENDPOINT=https://iam.cn-north-4.myhuaweicloud.com
```

###### 3.3.1.2 凭证级 [:top:](#用户手册-top)

只对单个凭证生效，会覆盖全局配置

```java
import com.huaweicloud.sdk.core.auth.BasicCredentials;

BasicCredentials credentials = new BasicCredentials()
	.withAk(ak)
    .withSk(sk)
    .withIamEndpoint("https://iam.cn-north-4.myhuaweicloud.com");
```

##### 3.3.2 Region配置 [:top:](#用户手册-top)

###### 3.3.2.1 代码配置  [:top:](#用户手册-top)

```java
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.ecs.v2.EcsClient;

// 使用自定义的regionId和endpoint创建一个region
Region region = new Region("cn-north-9", "https://ecs.cn-north-9.myhuaweicloud.com");

EcsClient client = EcsClient.newBuilder()
    .withCredential(auth)
    .withRegion(region)
    .build();
```

###### 3.3.2.2 环境变量 [:top:](#用户手册-top)

通过环境变量配置，格式为`HUAWEICLOUD_SDK_REGION_{SERVICE_NAME}_{REGION_ID}={endpoint}`

注：环境变量名全大写，中划线替换为下划线

```
// 以ECS和IoTDA服务为例

// linux
export HUAWEICLOUD_SDK_REGION_ECS_CN_NORTH_9=https://ecs.cn-north-9.myhuaweicloud.com
export HUAWEICLOUD_SDK_REGION_IOTDA_AP_SOUTHEAST_1=https://iotda.ap-southwest-1.myhuaweicloud.com

// windows
set HUAWEICLOUD_SDK_REGION_ECS_CN_NORTH_9=https://ecs.cn-north-9.myhuaweicloud.com
set HUAWEICLOUD_SDK_REGION_IOTDA_AP_SOUTHEAST_1=https://iotda.ap-southwest-1.myhuaweicloud.com
```

从**3.1.62**版本起，支持配置一个region对应多个endpoint，主要endpoint无法连接会自动切换到备用endpoint

格式为`HUAWEICLOUD_SDK_REGION_{SERVICE_NAME}_{REGION_ID}={endpoint1},{endpoint2}`, 多个endpoint之间用英文逗号隔开, 比如`HUAWEICLOUD_SDK_REGION_ECS_CN_NORTH_9=https://ecs.cn-north-9.myhuaweicloud.com,https://ecs.cn-north-9.myhuaweicloud.cn`

###### 3.3.2.3 文件配置 [:top:](#用户手册-top)

通过yaml文件配置，默认会从用户主目录下读取region配置文件，linux为`~/.huaweicloud/regions.yaml`，windows为`C:\Users\USER_NAME\.huaweicloud\regions.yaml`，默认配置文件可以不存在，但是如果配置文件存在且内容格式不对会解析错误抛出异常。

可以通过配置环境变量`HUAWEICLOUD_SDK_REGIONS_FILE`来修改默认文件的路径，如`HUAWEICLOUD_SDK_REGIONS_FILE=/tmp/my_regions.yml`

文件内容格式如下：

```yaml
# 服务名不区分大小写
ECS:
  - id: 'cn-north-1'
    endpoint: 'https://ecs.cn-north-1.myhuaweicloud.com'
  - id: 'cn-north-9'
    endpoint: 'https://ecs.cn-north-9.myhuaweicloud.com'
IoTDA:
  - id: 'ap-southwest-1'
    endpoint: 'https://iotda.ap-southwest-1.myhuaweicloud.com'
```

从**3.1.62**版本起，支持配置一个region对应多个endpoint，主要endpoint无法连接会自动切换到备用endpoint，格式如下：

```yaml
ECS:
  - id: 'cn-north-1'
    endpoints:
      - 'https://ecs.cn-north-1.myhuaweicloud.com'
      - 'https://ecs.cn-north-1.myhuaweicloud.cn'
```

###### 3.3.2.4 Region提供链 [:top:](#用户手册-top)

**Region.valueOf(regionId)** 方法默认查找顺序为 **环境变量 -> 配置文件 -> SDK中已定义Region**，以上方式都找不到region会抛出异常 **IllegalArgumentException**，获取region示例：

```java
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.ecs.v2.region.EcsRegion;

Region region1 = EcsRegion.valueOf("cn-north-1");
Region region2 = EcsRegion.valueOf("cn-north-9");
```

#### 3.4 用户代理 [:top:](#用户手册-top)

从**3.1.164**版本起，默认会在请求头User-Agent中附加额外信息，用于识别客户端调用服务时所使用的SDK语言、客户端库版本以及平台信息等。 User-Agent包含Java版本、操作系统和时区语言信息，同时会生成一个随机标识符追加到User-Agent信息中。随机标识符会存储在用户主目录下，linux为 `~/.huaweicloud/application_id`，windows为`C:\Users\USER_NAME\.huaweicloud\application_id`。

上述信息将用于保护您及您的用户的华为云账号安全。

您可以通过自定义User-Agent的方式关闭上述行为，自定义User-Agent信息建议长度不超过50个字符，仅可包含ASCII可打印字符：

```java
HttpConfig httpConfig = HttpConfig.getDefaultHttpConfig()
        // 追加自定义User-Agent信息，替代默认追加内容
        .withUserAgent("custom user agent...");

IamClient client = IamClient.newBuilder()
        .withHttpConfig(httpConfig)
        .build();
```


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
| | | ConnectionTimeoutException | 连接超时异常 |
| RequestTimeoutException | 响应超时异常 | CallTimeoutException | 单次请求，服务器处理超时未返回，包括读写超时等异常 |
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

**注意：** SDK在运行的时候默认采用slf4j的实现库进行日志打印，如果在运行代码实例时，未配置日志实现库，会有提示如下：

``` text
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
```

*更多关于使用slf4j的常见问题请参阅： [Frequently Asked Questions about SLF4J](https://www.slf4j.org/faq.html)*

SDK支持的slf4j与对应的日志实现的版本关系请参考 [Declaring project dependencies for logging](https://www.slf4j.org/manual.html#projectDep)

SDK 默认会打印访问日志，每次请求都会有一条记录：

``` text
16:53:04.905 [main] INFO HuaweiCloud-SDK-Access - "GET https://ecs.cn-southwest-2.myhuaweicloud.com/v1/077d6a6c19000fdd2f3bc00150080291/cloudservers/detail?offset=1&limit=25" 200 2251 deabe20c14f997a0291fc451a4da16a4 233
16:53:06.212 [main] INFO HuaweiCloud-SDK-Access - "PUT https://ecs.cn-southwest-2.myhuaweicloud.com/v1/077d6a6c19000fdd2f3bc00150080291/cloudservers/1aeac6fb-a2f2-48dc-9052-36637d119dd3" 200 880 f16f70e3fe245c11ab741760f8689a01 234
17:02:37.734 [main] INFO HuaweiCloud-SDK-Access - "GET https://ecs.cn-southwest-2.myhuaweicloud.com/v1/077d6a6c19000fdd2f3bc00150080291/cloudservers/detail?offset=1&limit=-1" 400 165 8c3c8b6fed4482d28e1929a78dc93f04 235
```

日志名称为 "HuaweiCloud-SDK-Access" , 日志格式为：

``` text
"{httpMethod} {uri}" {httpStatusCode} {responseContentLength} {requestId} {durationMs}
```

其中 requestId 是华为云 API Gateway 返回的请求 ID ，可以用于用户报障或者问题跟踪。

可以根据项目情况在对应的日志配置文件中对访问日志进行屏蔽，或者单独打印到独立文件中。

例如在 logback 中关闭访问日志：

``` xml
<logger name="HuaweiCloud-SDK-Access" level="OFF"> </logger>
```

#### 6.2 HTTP 监听器 [:top:](#用户手册-top)

在某些场景下可能对业务发出的 HTTP 请求进行 Debug ，需要看到原始的 HTTP 请求和返回信息， SDK 提供监听器功能来获取原始的为加密的 HTTP 请求和返回信息。

> :warning:  Warning: 原始信息打印仅在 Debug 阶段使用，请不要在生产系统中打印原始的 HTTP 头和 Body 信息，这些信息并未加密且其中包含敏感数据，例如所创建虚拟机的密码，IAM 用户的密码等；当 Body 体为二进制内容，即 Content-Type 标识为二进制时，Body 为"***"，详细内容不输出。

``` java
import com.huaweicloud.sdk.core.HttpListener;
import com.huaweicloud.sdk.core.http.HttpConfig;

HttpConfig httpConfig = HttpConfig.getDefaultHttpConfig();

// 注册监听器后打印原始请求信息,请勿用于生产环境
HttpListener requestListener = HttpListener.forRequestListener(listener ->
        System.out.printf("> Request %s %s\n> Headers:\n%s\n> Body: %s\n",
                listener.httpMethod(),
                listener.uri(),
                listener.headers().entrySet().stream()
                        .flatMap(entry -> entry.getValue().stream().map(
                                value -> "\t" + entry.getKey() + ": " + value))
                        .collect(Collectors.joining("\n")),
                listener.body().orElse("")));
httpConfig.addHttpListener(requestListener);

// 注册监听器后打印原始响应信息,请勿用于生产环境
HttpListener responseListener = HttpListener.forResponseListener(listener ->
        System.out.printf("< Response %s %s %s\n< Headers:\n%s\n< Body: %s\n",
                listener.httpMethod(),
                listener.uri(),
                listener.statusCode(),
                listener.headers().entrySet().stream()
                        .flatMap(entry -> entry.getValue().stream().map(
                                value -> "\t" + entry.getKey() + ": " + value))
                        .collect(Collectors.joining("\n")),
                listener.body().orElse("")));
httpConfig.addHttpListener(responseListener);

VpcClient vpcClient = VpcClient.newBuilder()
    .withHttpConfig(httpConfig)
    .build();
```

### 7. 接口调用器 [:top:](#用户手册-top)

#### 7.1 自定义请求头 [:top:](#用户手册-top)

可以根据需要灵活地配置请求头域参数，非必要**请勿**指定诸如`Host`、`Authorization`、`User-Agent`、`Content-Type`等通用请求头，可能会导致接口调用错误。

``` java
EcsClient client = EcsClient.newBuilder()
    .withCredential(basicCredentials)
    .withRegion(EcsRegion.CN_NORTH_4)
    .build();

String jobId = "{valid job id}";
ShowJobRequest request = new ShowJobRequest().withJobId(jobId);
try {
    ShowJobResponse response = client.showJobInvoker(request)
    // 自定义请求头
    .addHeader("key1", "value1")
    .addHeader("key2", "value2")
    .invoke();
    logger.info(response.toString());
} catch (SdkException e) {
    logger.error("", e);
}
```

#### 7.2 请求重试 [:top:](#用户手册-top)

当请求遇到网络异常或者流控场景的时候，通常需要对请求进行重试。Java SDK 提供了请求重试的入口，可用于请求方式为 `GET`
的请求。重试配置支持同步客户端和异步客户端，如需使用重试，需要配置最大重试次数、重试条件和重试策略。其中，

- _最大重试次数_：30 次，可设置任意不大于 30 的正整数
- _重试条件_：lambda 函数，提供默认的重试条件，会对 ConnectionException 进行重试，关键代码如下：

``` java
/**
 * 默认重试条件，当请求响应状态异常，并且异常类型为 ConnectionException 及其子类时，会执行重试
 *
 * @param <ResT> 响应类的泛型
 * @return BiFunction 返回值为布尔类型的 true / false
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

- _重试策略_：每次重试前的等待时间，提供默认的 SdkBackoffStrategy 策略，采用(随机数 + 指数退避)的算法计算下次重试前的等待时间。

以下将针对不同的场景介绍重试的具体使用。

##### 7.2.1 同步客户端请求重试 [:top:](#用户手册-top)

在同步客户端中使用重试，需要使用 {Service}Client 中提供的 invoker 方法，SDK 对连接超时类的异常提供了默认的重试条件，用户可以直接调用。

以 ECS 服务的 `ShowJob` 接口为例，最多重试5次，使用默认重试条件，代码如下：

``` java
// 初始化同步客户端
EcsClient client = EcsClient.newBuilder()
    .withCredential(basicCredentials)
    .withRegion(EcsRegion.CN_NORTH_4)
    .build();

String jobId = "{valid job id}";
ShowJobRequest request = new ShowJobRequest().withJobId(jobId);
try {
    ShowJobResponse response = client.showJobInvoker(request)
    // 请求最大重试次数
    .retryTimes(5)
    // 请求重试条件，默认的重试条件为网络连接异常自动重试
    .retryCondition(BaseInvoker.defaultRetryCondition())
    .invoke();
    logger.info(response.toString());
} catch (SdkException e) {
    logger.error("", e);
}
```

##### 7.2.2 异步客户端请求重试 [:top:](#用户手册-top)

在异步客户端中使用重试，需要使用 {Service}Client 中提供的 invoker 方法，SDK 对连接超时类的异常提供了默认的重试条件，用户可以直接调用。

以 ECS 服务的 `ShowJob` 接口为例，最多重试5次，使用默认重试条件，代码如下：

``` java
// 初始化异步客户端
EcsAsyncClient asyncClient = EcsAsyncClient.newBuilder()
    .withCredential(basicCredentials)
    .withRegion(EcsRegion.CN_NORTH_4)
    .build();

String jobId = "{valid job id}";
ShowJobRequest request = new ShowJobRequest().withJobId(jobId);
try {
    ShowJobResponse response = asyncClient.showJobAsyncInvoker(request)
    // 请求最大重试次数
    .retryTimes(5)
    // 请求重试条件，默认的重试条件为网络连接异常自动重试
    .retryCondition(BaseInvoker.defaultRetryCondition())
    .invoke();
    logger.info(response.toString());
} catch (SdkException e) {
    logger.error("", e);
}
```

##### 7.2.3 典型重试场景调用示例 [:top:](#用户手册-top)

**场景1**：当接口响应状态码为 500(服务器端异常) 或者 429(服务器端流控) 时，对请求进行重试。示例代码如下：

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

**场景2**：针对 job 指定状态进行重试，如 job 状态为成功时停止重试，执行下一步操作。示例代码如下：

``` java
String jobId = "{valid job id}";
ShowJobRequest request = new ShowJobRequest().withJobId(jobId);
try {
    // 退避等待的基础时间(毫秒)
    final int baseDelay = 1000;
    // 退避等待的最长时间
    final int maxBackoffInMilliseconds = 30000;

    ShowJobResponse response = client.showJobInvoker(request)
    // 请求最大重试次数
    .retryTimes(10)
    // 请求重试条件，将重试条件设置为job状态是success的时候停止重试
    .retryCondition((resp, ex) -> Objects.nonNull(resp) && !resp.getStatus().equals(ShowJobResponse.StatusEnum.SUCCESS))
    // 请求退避策略，计算每次请求失败后下次的请求时间，轮询 job 状态需要设置较长的基础等待时间
    .backoffStrategy(new SdkBackoffStrategy(baseDelay, maxBackoffInMilliseconds))
    .invoke();
    logger.info(response.toString());
} catch (SdkException e) {
    logger.error("", e);
}
```

### 8. 文件上传与下载 [:top:](#用户手册-top)

#### 8.1 上传与下载 [:top:](#用户手册-top)

以数据安全中心服务的嵌入图片水印接口为例，该接口需要上传一个图片文件，并返回加过水印的图片文件流：

```java
package com.huaweicloud.sdk.test;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
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

        // 创建File对象和FileInputStream对象
        File file = new File("demo.jpg");
        FileInputStream fis = new FileInputStream(file);

        CreateImageWatermarkRequestBody body = new CreateImageWatermarkRequestBody()
                // 文件传参
                .withFile(fis, file.getName())
                .withBlindWatermark("test123");
        request.setBody(body);

        CreateImageWatermarkResponse response = client.createImageWatermark(request);
        fis.close();

        //下载文件的consumer
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

        //下载文件
        response.consumeDownloadStream(consumer);
    }

    public static void main(String[] args) throws IOException {
        String ak = System.getenv("HUAWEICLOUD_SDK_AK");
        String sk = System.getenv("HUAWEICLOUD_SDK_SK");
        String endpoint = "{your endpoint string}";
        String projectId = "{your project id}";
        BasicCredentials auth = new BasicCredentials()
                .withAk(ak)
                .withSk(sk)
                .withProjectId(projectId);

        DscClient client = DscClient.newBuilder()
                .withCredential(auth)
                .withEndpoint(endpoint)
                .build();

        createImageWatermark(client);

    }

}
```

#### 8.2 获取进度 [:top:](#用户手册-top)

以对象存储服务的上传对象和下载对象接口为例：

```java
package com.huaweicloud.sdk.test;

import com.huaweicloud.sdk.obs.v1.ObsClient;
import com.huaweicloud.sdk.obs.v1.ObsCredentials;
import com.huaweicloud.sdk.obs.v1.model.GetObjectRequest;
import com.huaweicloud.sdk.obs.v1.model.GetObjectResponse;
import com.huaweicloud.sdk.obs.v1.model.PutObjectRequest;
import com.huaweicloud.sdk.obs.v1.model.PutObjectResponse;
import com.huaweicloud.sdk.obs.v1.region.ObsRegion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;

public class ObsDemo {

    // 上传对象
    public static void putObject(ObsClient client) throws IOException {
        PutObjectRequest request = new PutObjectRequest().withBucketName("bucketname").withObjectKey("objectname");
        FileInputStream fileInputStream = new FileInputStream("/tmp/file-to-upload");
        request.setUploadStream(fileInputStream);

        request.setProgressListener(progressStatus -> {
            // 获取上传平均速率(B/S)
            System.out.println("AverageSpeed:" + progressStatus.getAverageSpeed());
            // 获取上传进度百分比
            System.out.println("TransferPercentage:" + progressStatus.getTransferPercentage());
        });
        // 每上传1MB数据反馈进度
        request.setProgressInterval(1024 * 1024L);

        PutObjectResponse response = client.putObject(request);
        System.out.println(response.getHttpStatusCode());
        fileInputStream.close();
    }

    // 下载对象
    public static void getObject(ObsClient client) {
        GetObjectRequest request = new GetObjectRequest().withBucketName("bucketname").withObjectKey("objectname");

        request.setProgressListener(progressStatus -> {
            // 获取下载平均速率(B/S)
            System.out.println("AverageSpeed:" + progressStatus.getAverageSpeed());
            // 获取下载进度百分比
            System.out.println("TransferPercentage:" + progressStatus.getTransferPercentage());
        });
        // 每下载1MB数据反馈进度
        request.setProgressInterval(1024 * 1024L);

        GetObjectResponse response = client.getObject(request);
        System.out.println(response.getHttpStatusCode());

        //下载文件的consumer
        Consumer<InputStream> consumer = inputStream -> {
            try {
                FileOutputStream out = new FileOutputStream("/tmp/downloaded-file");
                byte[] data = new byte[1024];
                int len;
                while ((len = inputStream.read(data)) != -1) {
                    out.write(data, 0, len);
                }

                inputStream.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        response.consumeDownloadStream(consumer);
    }

    public static void main(String[] args) throws IOException {
        ObsCredentials credentials = new ObsCredentials()
                .withAk(System.getenv("HUAWEICLOUD_SDK_AK"))
                .withSk(System.getenv("HUAWEICLOUD_SDK_SK"));

        ObsClient client = ObsClient.newBuilder()
                .withCredential(credentials)
                .withRegion(ObsRegion.valueOf("cn-north-1"))
                .build();

        putObject(client);
        getObject(client);
    }
}
```

### 9. FAQ [:top:](#用户手册-top)

#### 9.1 云联盟场景如何调用 [:top:](#用户手册-top)

```java
// 初始化客户端认证信息，需要填写相应 projectId/domainId，以初始化 BasicCredentials 为例
BasicCredentials basicCredentials = new BasicCredentials()
    // 请使用华为云AK/SK, 非云联盟AK/SK
	.withAk(ak)
	.withSk(sk)
	.withProjectId(projectId);

// 初始化指定云服务的客户端 {Service}Client，以初始化 Region 级服务 VPC 的 VpcClient 为例
VpcClient vpcClient = VpcClient.newBuilder()
	.withCredential(basicCredentials)
	// 指定终端节点，以 云联盟都柏林节点调用 VPC 服务为例
	.withEndpoint("https://vpc.eu-west-101.myhuaweicloud.com")
	.build();
```