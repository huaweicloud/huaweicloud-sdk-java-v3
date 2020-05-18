[English](./README.md) | 简体中文

# 华为云  Java 软件开发工具包（Java SDK）

欢迎使用华为云 Java SDK。

华为云 Java SDK 让您无需关心请求细节即可快速使用云服务器、虚拟私有云等多个华为云服务。

这里将向您介绍如何获取并使用华为云 Java SDK。

## 在线示例

[API Explorer](https://apiexplorer.developer.huaweicloud.com/apiexplorer/overview) 提供API检索及平台调试，支持全量快速检索、可视化调试、帮助文档查看、在线咨询。


## 现在开始

- 要使用  Java SDK，您需要拥有华为云账号以及该账号对应的 Access Key（AK）和 Secret Access Key（SK）。请在华为云控制台“我的凭证-访问密钥”页面上创建和查看您的AKSK。更多信息请查看[我的凭证](https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html)。
- 华为云 Java SDK 支持 **Java JDK 1.8** 及其以上版本


## SDK 获取和安装

您可以通过如下方式获取和安装 SDK：

- 通过 Maven 安装依赖（推荐）
通过 Maven 安装项目依赖是使用 Java SDK 的推荐方法，首先您需要在您的操作系统中[下载]( https://maven.apache.org/download.cgi )并[安装 Maven]( https://maven.apache.org/install.html ) ，安装完成后您只需在 Java 项目的 `pom.xml` 文件加入相应的依赖项即可。
```xml
<dependency>
    <groupId>com.huaweicloud.sdk</groupId>
    <artifactId>huaweicloud-sdk</artifactId>
    <!-- 请到maven仓库中找到最新的版本 -->
    <version>3.0.1-beta</version>
</dependency>
```

- 通过源码包安装
1. 前往 [Github](https://github.com/huaweicloud/huaweicloud-sdk-java-v3.git) 上下载源码压缩包。
2. 将源码压缩包解压到您项目中合适的位置。
3. 具体使用方法可参考[代码实例](#代码实例)

### 开始使用

1. 导入依赖模块：
``` java
// 用户身份认证
import com.huaweicloud.sdk.core.auth.BasicCredentials;
// 请求异常类
import com.huaweicloud.sdk.core.exception.ClientRequestException;
import com.huaweicloud.sdk.core.exception.ServerResponseException;
// 导入相应产品的 {Service}Client
import com.huaweicloud.sdk.vpc.v2.VpcClient;
// 导入待请求接口的 request 和 response 类
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;
// 日志打印
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
```
2. 配置客户端属性
```java
// 使用默认配置
HttpConfig config = HttpConfig.getDefaultHttpConfig();

// 配置Proxy(可选)
config.withProxyHost("http://proxy.huaweicloud.com")
    .withProxyPort(8080)
    .withProxyUsername("test")
    .withProxyPassword("test");

// Https请求跳过服务器端SSL证书验证（可选）
config.withIgnoreSSLVerification(true);
```
3. 初始化客户端
``` java
BasicCredentials auth = new BasicCredentials()
	.withAk(ak)
	.withSk(sk)
	.withProjectId(projectId);

VpcClient vpcClient = VpcClient.newBuilder()
	.withConfig(config)
	.withCredential(auth)
	.withEndpoint(endpoint)
	.build();
```
说明：
 - `ak` 华为云账号Access Key
 - `sk` 华为云账号Secret Access Key
 - `projectId` 项目ID，根据你想操作的项目所属区域选择对应的项目ID
 - `endpoint` 华为云各服务应用区域和各服务的终端节点，详情请查看[地区和终端节点](https://developer.huaweicloud.com/endpoint)。

4. 发送请求并查看响应
```java
ListVpcsResponse listVpcsResponse = vpcClient.listVpcs(new ListVpcsRequest().withLimit(1));
logger.info(listVpcsResponse.toString());
```

## 代码实例

使用如下代码查询特定 Region 下的 VPC 清单，调用前请根据实际情况替换如下变量： `{your ak string}`、`{your sk string}`、`{your endpoint string}`以及`{your project id}`

```java
package com.huaweicloud.sdk.test;

// 用户身份认证
import com.huaweicloud.sdk.core.auth.BasicCredentials;
// 请求异常类
import com.huaweicloud.sdk.core.exception.ClientRequestException;
import com.huaweicloud.sdk.core.exception.ServerResponseException;
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
    public static void main(String[] args) {
    	// 配置客户端属性
        HttpConfig config = HttpConfig.getDefaultHttpConfig();
        config.withIgnoreSSLVerification(true);

        String ak = "{your ak string}";
        String sk = "{your sk string}";
        String endpoint = "{your endpoint string}";
        String projectId = "{your project id}";
        
        // 创建认证
        BasicCredentials auth = new BasicCredentials()
            .withAk(ak)
            .withSk(sk)
            .withProjectId(projectId);
            
        // 创建VpcClient实例并初始化
        VpcClient vpcClient = VpcClient.newBuilder()
            .withConfig(config)
            .withCredential(auth)
            .withEndpoint(endpoint)
            .build();

        try {
            // 实例化ListVpcsRequest请求对象，调用listVpcs接口，
            ListVpcsResponse listVpcsResponse = vpcClient.listVpcs(new ListVpcsRequest().withLimit(1));
            // 输出json格式的字符串响应
            logger.info(listVpcsResponse.toString());
        } catch (ClientRequestException e) {  // 捕获客户端异常
            logger.error("HttpStatusCode:" + e.getHttpStatusCode() + ", ErrorMsg: " + e.getErrorMsg());
        } catch (ServerResponseException e) { // 捕获服务端异常
            logger.error("HttpStatusCode:" + e.getHttpStatusCode() + ", ErrorMsg: " + e.getErrorMsg());
        } catch (ConnectionException e) {     // 捕获网络异常
            logger.error("Connection error: ", e);
        }
    }
}
```

