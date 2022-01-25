package com.huaweicloud.sdk.apig.v2;

import com.huaweicloud.sdk.apig.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class ApigAsyncClient {

    protected HcClient hcClient;

    public ApigAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ApigAsyncClient> newBuilder() {
        return new ClientBuilder<>(ApigAsyncClient::new);
    }

    /** 实例更新或绑定EIP 实例更新或绑定EIP
     *
     * @param AddEipV2Request 请求对象
     * @return CompletableFuture<AddEipV2Response> */
    public CompletableFuture<AddEipV2Response> addEipV2Async(AddEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.addEipV2);
    }

    /** 实例更新或绑定EIP 实例更新或绑定EIP
     *
     * @param AddEipV2Request 请求对象
     * @return AsyncInvoker<AddEipV2Request, AddEipV2Response> */
    public AsyncInvoker<AddEipV2Request, AddEipV2Response> addEipV2AsyncInvoker(AddEipV2Request request) {
        return new AsyncInvoker<AddEipV2Request, AddEipV2Response>(request, ApigMeta.addEipV2, hcClient);
    }

    /** 开启实例公网出口 实例开启公网出口
     *
     * @param AddEngressEipV2Request 请求对象
     * @return CompletableFuture<AddEngressEipV2Response> */
    public CompletableFuture<AddEngressEipV2Response> addEngressEipV2Async(AddEngressEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.addEngressEipV2);
    }

    /** 开启实例公网出口 实例开启公网出口
     *
     * @param AddEngressEipV2Request 请求对象
     * @return AsyncInvoker<AddEngressEipV2Request, AddEngressEipV2Response> */
    public AsyncInvoker<AddEngressEipV2Request, AddEngressEipV2Response> addEngressEipV2AsyncInvoker(
        AddEngressEipV2Request request) {
        return new AsyncInvoker<AddEngressEipV2Request, AddEngressEipV2Response>(request, ApigMeta.addEngressEipV2,
            hcClient);
    }

    /** 绑定域名证书 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。 本章节主要介绍为特定域名绑定证书。
     *
     * @param AssociateCertificateV2Request 请求对象
     * @return CompletableFuture<AssociateCertificateV2Response> */
    public CompletableFuture<AssociateCertificateV2Response> associateCertificateV2Async(
        AssociateCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateCertificateV2);
    }

    /** 绑定域名证书 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。 本章节主要介绍为特定域名绑定证书。
     *
     * @param AssociateCertificateV2Request 请求对象
     * @return AsyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response> */
    public AsyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response> associateCertificateV2AsyncInvoker(
        AssociateCertificateV2Request request) {
        return new AsyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response>(request,
            ApigMeta.associateCertificateV2, hcClient);
    }

    /** 绑定域名 用户自定义的域名，需要CNAME到API分组的子域名上才能生效，具体方法请参见《云解析服务用户指南》的“添加CANME类型记录集”章节。
     * 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     *
     * @param AssociateDomainV2Request 请求对象
     * @return CompletableFuture<AssociateDomainV2Response> */
    public CompletableFuture<AssociateDomainV2Response> associateDomainV2Async(AssociateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateDomainV2);
    }

    /** 绑定域名 用户自定义的域名，需要CNAME到API分组的子域名上才能生效，具体方法请参见《云解析服务用户指南》的“添加CANME类型记录集”章节。
     * 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     *
     * @param AssociateDomainV2Request 请求对象
     * @return AsyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response> */
    public AsyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response> associateDomainV2AsyncInvoker(
        AssociateDomainV2Request request) {
        return new AsyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response>(request,
            ApigMeta.associateDomainV2, hcClient);
    }

    /** 绑定签名密钥 签名密钥创建后，需要绑定到API才能生效。 将签名密钥绑定到API后，则API网关请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。
     * 将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     *
     * @param AssociateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<AssociateSignatureKeyV2Response> */
    public CompletableFuture<AssociateSignatureKeyV2Response> associateSignatureKeyV2Async(
        AssociateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateSignatureKeyV2);
    }

    /** 绑定签名密钥 签名密钥创建后，需要绑定到API才能生效。 将签名密钥绑定到API后，则API网关请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。
     * 将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     *
     * @param AssociateSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> */
    public AsyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> associateSignatureKeyV2AsyncInvoker(
        AssociateSignatureKeyV2Request request) {
        return new AsyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response>(request,
            ApigMeta.associateSignatureKeyV2, hcClient);
    }

    /** 创建自定义认证 创建自定义认证
     *
     * @param CreateCustomAuthorizerV2Request 请求对象
     * @return CompletableFuture<CreateCustomAuthorizerV2Response> */
    public CompletableFuture<CreateCustomAuthorizerV2Response> createCustomAuthorizerV2Async(
        CreateCustomAuthorizerV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createCustomAuthorizerV2);
    }

    /** 创建自定义认证 创建自定义认证
     *
     * @param CreateCustomAuthorizerV2Request 请求对象
     * @return AsyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> */
    public AsyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> createCustomAuthorizerV2AsyncInvoker(
        CreateCustomAuthorizerV2Request request) {
        return new AsyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response>(request,
            ApigMeta.createCustomAuthorizerV2, hcClient);
    }

    /** 创建环境 在实际的生产中，API提供者可能有多个环境，如开发环境、测试环境、生产环境等，用户可以自由将API发布到某个环境，供调用者调用。
     * 对于不同的环境，API的版本、请求地址甚至于包括请求消息等均有可能不同。如：某个API，v1.0的版本为稳定版本，发布到了生产环境供生产使用，同时，该API正处于迭代中，v1.1的版本是开发人员交付测试人员进行测试的版本，发布在测试环境上，而v1.2的版本目前开发团队正处于开发过程中，可以发布到开发环境进行自测等。
     * 为此，API网关提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接入API网关。
     *
     * @param CreateEnvironmentV2Request 请求对象
     * @return CompletableFuture<CreateEnvironmentV2Response> */
    public CompletableFuture<CreateEnvironmentV2Response> createEnvironmentV2Async(CreateEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createEnvironmentV2);
    }

    /** 创建环境 在实际的生产中，API提供者可能有多个环境，如开发环境、测试环境、生产环境等，用户可以自由将API发布到某个环境，供调用者调用。
     * 对于不同的环境，API的版本、请求地址甚至于包括请求消息等均有可能不同。如：某个API，v1.0的版本为稳定版本，发布到了生产环境供生产使用，同时，该API正处于迭代中，v1.1的版本是开发人员交付测试人员进行测试的版本，发布在测试环境上，而v1.2的版本目前开发团队正处于开发过程中，可以发布到开发环境进行自测等。
     * 为此，API网关提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接入API网关。
     *
     * @param CreateEnvironmentV2Request 请求对象
     * @return AsyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response> */
    public AsyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response> createEnvironmentV2AsyncInvoker(
        CreateEnvironmentV2Request request) {
        return new AsyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response>(request,
            ApigMeta.createEnvironmentV2, hcClient);
    }

    /** 新建变量 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。
     * 用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，API网关会将这些变量替换成真实的变量值，以达到不同环境的区分效果。
     * 环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。 &gt; 1.环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量 2.环境变量区分大小写，即变量ABC与变量abc是两个不同的变量
     * 3.设置了环境变量后，使用到该变量的API的调试功能将不可使用。
     * 4.定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     *
     * @param CreateEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<CreateEnvironmentVariableV2Response> */
    public CompletableFuture<CreateEnvironmentVariableV2Response> createEnvironmentVariableV2Async(
        CreateEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createEnvironmentVariableV2);
    }

    /** 新建变量 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。
     * 用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，API网关会将这些变量替换成真实的变量值，以达到不同环境的区分效果。
     * 环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。 &gt; 1.环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量 2.环境变量区分大小写，即变量ABC与变量abc是两个不同的变量
     * 3.设置了环境变量后，使用到该变量的API的调试功能将不可使用。
     * 4.定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     *
     * @param CreateEnvironmentVariableV2Request 请求对象
     * @return AsyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> */
    public AsyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> createEnvironmentVariableV2AsyncInvoker(
        CreateEnvironmentVariableV2Request request) {
        return new AsyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response>(request,
            ApigMeta.createEnvironmentVariableV2, hcClient);
    }

    /** 实例配置特性 为实例配置需要的特性。 支持配置的特性列表及特性配置示例如下： | 特性名称 | 特性描述 | 特性配置示例 | 特性配置参数 | | | | --------| :------- | :-------|
     * :-------| :-------| :-------| :------- | | | | 参数名称 | 参数描述 | 参数默认值 | 参数范围 | | lts |
     * 是否支持shubao访问日志上报功能。|{\&quot;name\&quot;:\&quot;lts\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;group_id\\\\\&quot;:
     * \\\&quot;\\,\\\\\&quot;topic_id\\\\\&quot;:\\\\\&quot;\\\\\&quot;,\\\\\&quot;log_group\\\\\&quot;:\\\\\&quot;\\\\\&quot;,\\\\\&quot;log_stream\\\\\&quot;:\\\\\&quot;\\\\\&quot;}\&quot;}
     * | group_id | 日志组ID | | | | | | | topic_id | 日志流ID | | | | | | | log_group | 日志组名称 | | | | | | | log_stream |
     * 日志流名称 | | | | ratelimit |
     * 是否支持自定义流控值。|{\&quot;name\&quot;:\&quot;ratelimit\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;api_limits\\\\\&quot;: 500}\&quot;} | api_limits | API全局默认流控值。注意：如果配置过小会导致业务持续被流控，请根据业务谨慎修改。 |
     * 200 次/秒 | 1-1000000 次/秒 | | request_body_size |
     * 是否支持指定最大请求Body大小。|{\&quot;name\&quot;:\&quot;request_body_size\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;104857600\&quot;} | request_body_size | 请求中允许携带的Body大小上限。 | 12 M | 1-9536 M | | backend_timeout |
     * 是否支持配置后端API最大超时时间。|{\&quot;name\&quot;:\&quot;backend_timeout\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\&quot;max_timeout\\\&quot;: 500}\&quot;} | max_timeout | API网关到后端服务的超时时间上限。 | 60000 ms | 1-600000 ms |
     * | app_token |
     * 是否开启app_token认证方式。|{\&quot;name\&quot;:\&quot;app_token\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;enable\\\\\&quot;: \\\\\&quot;on\\\\\&quot;, \\\\\&quot;app_token_expire_time\\\\\&quot;:
     * 3600, \\\\\&quot;app_token_uri\\\\\&quot;: \\\\\&quot;/v1/apigw/oauth2/token\\\\\&quot;,
     * \\\\\&quot;refresh_token_expire_time\\\\\&quot;: 7200}\&quot;} | enable | 是否开启 | off | on/off | | | | |
     * app_token_expire_time | access token的有效时间 | 3600 s | 1-72000 s | | | | | refresh_token_expire_time | refresh
     * token的有效时间 | 7200 s | 1-72000 s | | | | | app_token_uri | 获取token的uri | /v1/apigw/oauth2/token | | | | | |
     * app_token_key | token的加密key | | | | app_api_key |
     * 是否开启app_api_key认证方式。|{\&quot;name\&quot;:\&quot;app_api_key\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;on\&quot;} | | | off | on/off | | app_basic |
     * 是否开启app_basic认证方式。|{\&quot;name\&quot;:\&quot;app_basic\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;on\&quot;} | | | off | on/off | | app_secret |
     * 是否支持app_secret认证方式。|{\&quot;name\&quot;:\&quot;app_secret\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;on\&quot;} | | | off | on/off | | app_jwt |
     * 是否支持app_jwt认证方式。|{\&quot;name\&quot;:\&quot;app_jwt\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;enable\\\\\&quot;: \\\\\&quot;on\\\\\&quot;, \\\\\&quot;auth_header\\\\\&quot;:
     * \\\\\&quot;Authorization\\\\\&quot;}\&quot;}| enable | 是否开启app_jwt认证方式。 | off | on/off | | | | | auth_header |
     * app_jwt认证头 | Authorization | | | public_key |
     * 是否支持public_key类型的后端签名。|{\&quot;name\&quot;:\&quot;public_key\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;enable\\\\\&quot;: \\\\\&quot;on\\\\\&quot;, \\\\\&quot;public_key_uri_prefix\\\\\&quot;:
     * \\\\\&quot;/apigw/authadv/v2/public-key/\\\\\&quot;}\&quot;}| enable | 是否开启app_jwt认证方式。 | off | on/off | | | | |
     * public_key_uri_prefix | 获取public key的uri前缀 | /apigw/authadv/v2/public-key/ | | | backend_token_allow |
     * 是否支持普通租户透传token到后端。|{\&quot;name\&quot;:\&quot;backend_token_allow\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;backend_token_allow_users\\\\\&quot;: [\\\\\&quot;paas_apig_wwx548366_01\\\\\&quot;]}\&quot;}
     * | backend_token_allow_users | 透传token到后端普通租户白名单，匹配普通租户domain name正则表达式 | | | | backend_client_certificate |
     * 是否开启后端双向认证。|{\&quot;name\&quot;:\&quot;backend_client_certificate\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;enable\\\\\&quot;: \\\\\&quot;on\\\\\&quot;,\\\\\&quot;ca\\\\\&quot;:
     * \\\\\&quot;\\\\\&quot;,\\\\\&quot;content\\\\\&quot;: \\\\\&quot;\\\\\&quot;,\\\\\&quot;key\\\\\&quot;:
     * \\\\\&quot;\\\\\&quot;}\&quot;} | enable | 是否开启 | off | on/off | | | | | ca | 双向认证信任证书 | | | | | | | content |
     * 双向认证证书 | | | | | | | key | 双向认证信任私钥 | | | | ssl_ciphers |
     * 是否支持https加密套件。|{\&quot;name\&quot;:\&quot;ssl_ciphers\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;config\&quot;: \&quot;{\\\\\&quot;ssl_ciphers\\\\\&quot;:
     * [\\\\\&quot;ECDHE-ECDSA-AES256-GCM-SHA384\\\\\&quot;]}\&quot;} | ssl_ciphers |
     * 支持的加解密套件。ssl_ciphers数组中只允许出现默认值中的字符串，且数组不能为空。 | |
     * ECDHE-ECDSA-AES256-GCM-SHA384,ECDHE-RSA-AES256-GCM-SHA384,ECDHE-ECDSA-AES128-GCM-SHA256,ECDHE-RSA-AES128-GCM-SHA256,ECDHE-ECDSA-AES256-SHA384,ECDHE-RSA-AES256-SHA384,ECDHE-ECDSA-AES128-SHA256,ECDHE-RSA-AES128-SHA256
     * | | real_ip_from_xff |
     * 是否开启使用xff头作为访问控制、流控策略的源ip生效依据。|{\&quot;name\&quot;:\&quot;real_ip_from_xff\&quot;,\&quot;enable\&quot;:
     * true,\&quot;config\&quot;: \&quot;{\\\\\&quot;enable\\\\\&quot;:
     * \\\\\&quot;on\\\\\&quot;,\\\\\&quot;xff_index\\\\\&quot;: 1}\&quot;} | enable | 是否开启 | off | on/off | | | | |
     * xff_index | 源ip所在xff头的索引位置（支持负数，-1为最后一位，以此类推） | -1 | int32有效值 |
     *
     * @param CreateFeatureV2Request 请求对象
     * @return CompletableFuture<CreateFeatureV2Response> */
    public CompletableFuture<CreateFeatureV2Response> createFeatureV2Async(CreateFeatureV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createFeatureV2);
    }

    /** 实例配置特性 为实例配置需要的特性。 支持配置的特性列表及特性配置示例如下： | 特性名称 | 特性描述 | 特性配置示例 | 特性配置参数 | | | | --------| :------- | :-------|
     * :-------| :-------| :-------| :------- | | | | 参数名称 | 参数描述 | 参数默认值 | 参数范围 | | lts |
     * 是否支持shubao访问日志上报功能。|{\&quot;name\&quot;:\&quot;lts\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;group_id\\\\\&quot;:
     * \\\&quot;\\,\\\\\&quot;topic_id\\\\\&quot;:\\\\\&quot;\\\\\&quot;,\\\\\&quot;log_group\\\\\&quot;:\\\\\&quot;\\\\\&quot;,\\\\\&quot;log_stream\\\\\&quot;:\\\\\&quot;\\\\\&quot;}\&quot;}
     * | group_id | 日志组ID | | | | | | | topic_id | 日志流ID | | | | | | | log_group | 日志组名称 | | | | | | | log_stream |
     * 日志流名称 | | | | ratelimit |
     * 是否支持自定义流控值。|{\&quot;name\&quot;:\&quot;ratelimit\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;api_limits\\\\\&quot;: 500}\&quot;} | api_limits | API全局默认流控值。注意：如果配置过小会导致业务持续被流控，请根据业务谨慎修改。 |
     * 200 次/秒 | 1-1000000 次/秒 | | request_body_size |
     * 是否支持指定最大请求Body大小。|{\&quot;name\&quot;:\&quot;request_body_size\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;104857600\&quot;} | request_body_size | 请求中允许携带的Body大小上限。 | 12 M | 1-9536 M | | backend_timeout |
     * 是否支持配置后端API最大超时时间。|{\&quot;name\&quot;:\&quot;backend_timeout\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\&quot;max_timeout\\\&quot;: 500}\&quot;} | max_timeout | API网关到后端服务的超时时间上限。 | 60000 ms | 1-600000 ms |
     * | app_token |
     * 是否开启app_token认证方式。|{\&quot;name\&quot;:\&quot;app_token\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;enable\\\\\&quot;: \\\\\&quot;on\\\\\&quot;, \\\\\&quot;app_token_expire_time\\\\\&quot;:
     * 3600, \\\\\&quot;app_token_uri\\\\\&quot;: \\\\\&quot;/v1/apigw/oauth2/token\\\\\&quot;,
     * \\\\\&quot;refresh_token_expire_time\\\\\&quot;: 7200}\&quot;} | enable | 是否开启 | off | on/off | | | | |
     * app_token_expire_time | access token的有效时间 | 3600 s | 1-72000 s | | | | | refresh_token_expire_time | refresh
     * token的有效时间 | 7200 s | 1-72000 s | | | | | app_token_uri | 获取token的uri | /v1/apigw/oauth2/token | | | | | |
     * app_token_key | token的加密key | | | | app_api_key |
     * 是否开启app_api_key认证方式。|{\&quot;name\&quot;:\&quot;app_api_key\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;on\&quot;} | | | off | on/off | | app_basic |
     * 是否开启app_basic认证方式。|{\&quot;name\&quot;:\&quot;app_basic\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;on\&quot;} | | | off | on/off | | app_secret |
     * 是否支持app_secret认证方式。|{\&quot;name\&quot;:\&quot;app_secret\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;on\&quot;} | | | off | on/off | | app_jwt |
     * 是否支持app_jwt认证方式。|{\&quot;name\&quot;:\&quot;app_jwt\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;enable\\\\\&quot;: \\\\\&quot;on\\\\\&quot;, \\\\\&quot;auth_header\\\\\&quot;:
     * \\\\\&quot;Authorization\\\\\&quot;}\&quot;}| enable | 是否开启app_jwt认证方式。 | off | on/off | | | | | auth_header |
     * app_jwt认证头 | Authorization | | | public_key |
     * 是否支持public_key类型的后端签名。|{\&quot;name\&quot;:\&quot;public_key\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;enable\\\\\&quot;: \\\\\&quot;on\\\\\&quot;, \\\\\&quot;public_key_uri_prefix\\\\\&quot;:
     * \\\\\&quot;/apigw/authadv/v2/public-key/\\\\\&quot;}\&quot;}| enable | 是否开启app_jwt认证方式。 | off | on/off | | | | |
     * public_key_uri_prefix | 获取public key的uri前缀 | /apigw/authadv/v2/public-key/ | | | backend_token_allow |
     * 是否支持普通租户透传token到后端。|{\&quot;name\&quot;:\&quot;backend_token_allow\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;backend_token_allow_users\\\\\&quot;: [\\\\\&quot;paas_apig_wwx548366_01\\\\\&quot;]}\&quot;}
     * | backend_token_allow_users | 透传token到后端普通租户白名单，匹配普通租户domain name正则表达式 | | | | backend_client_certificate |
     * 是否开启后端双向认证。|{\&quot;name\&quot;:\&quot;backend_client_certificate\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;{\\\\\&quot;enable\\\\\&quot;: \\\\\&quot;on\\\\\&quot;,\\\\\&quot;ca\\\\\&quot;:
     * \\\\\&quot;\\\\\&quot;,\\\\\&quot;content\\\\\&quot;: \\\\\&quot;\\\\\&quot;,\\\\\&quot;key\\\\\&quot;:
     * \\\\\&quot;\\\\\&quot;}\&quot;} | enable | 是否开启 | off | on/off | | | | | ca | 双向认证信任证书 | | | | | | | content |
     * 双向认证证书 | | | | | | | key | 双向认证信任私钥 | | | | ssl_ciphers |
     * 是否支持https加密套件。|{\&quot;name\&quot;:\&quot;ssl_ciphers\&quot;,\&quot;enable\&quot;:true,\&quot;config\&quot;:
     * \&quot;config\&quot;: \&quot;{\\\\\&quot;ssl_ciphers\\\\\&quot;:
     * [\\\\\&quot;ECDHE-ECDSA-AES256-GCM-SHA384\\\\\&quot;]}\&quot;} | ssl_ciphers |
     * 支持的加解密套件。ssl_ciphers数组中只允许出现默认值中的字符串，且数组不能为空。 | |
     * ECDHE-ECDSA-AES256-GCM-SHA384,ECDHE-RSA-AES256-GCM-SHA384,ECDHE-ECDSA-AES128-GCM-SHA256,ECDHE-RSA-AES128-GCM-SHA256,ECDHE-ECDSA-AES256-SHA384,ECDHE-RSA-AES256-SHA384,ECDHE-ECDSA-AES128-SHA256,ECDHE-RSA-AES128-SHA256
     * | | real_ip_from_xff |
     * 是否开启使用xff头作为访问控制、流控策略的源ip生效依据。|{\&quot;name\&quot;:\&quot;real_ip_from_xff\&quot;,\&quot;enable\&quot;:
     * true,\&quot;config\&quot;: \&quot;{\\\\\&quot;enable\\\\\&quot;:
     * \\\\\&quot;on\\\\\&quot;,\\\\\&quot;xff_index\\\\\&quot;: 1}\&quot;} | enable | 是否开启 | off | on/off | | | | |
     * xff_index | 源ip所在xff头的索引位置（支持负数，-1为最后一位，以此类推） | -1 | int32有效值 |
     *
     * @param CreateFeatureV2Request 请求对象
     * @return AsyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response> */
    public AsyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response> createFeatureV2AsyncInvoker(
        CreateFeatureV2Request request) {
        return new AsyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response>(request, ApigMeta.createFeatureV2,
            hcClient);
    }

    /** 创建分组自定义响应 新增分组下自定义响应
     *
     * @param CreateGatewayResponseV2Request 请求对象
     * @return CompletableFuture<CreateGatewayResponseV2Response> */
    public CompletableFuture<CreateGatewayResponseV2Response> createGatewayResponseV2Async(
        CreateGatewayResponseV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createGatewayResponseV2);
    }

    /** 创建分组自定义响应 新增分组下自定义响应
     *
     * @param CreateGatewayResponseV2Request 请求对象
     * @return AsyncInvoker<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response> */
    public AsyncInvoker<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response> createGatewayResponseV2AsyncInvoker(
        CreateGatewayResponseV2Request request) {
        return new AsyncInvoker<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response>(request,
            ApigMeta.createGatewayResponseV2, hcClient);
    }

    /** 创建专享版实例 创建专享版实例
     *
     * @param CreateInstanceV2Request 请求对象
     * @return CompletableFuture<CreateInstanceV2Response> */
    public CompletableFuture<CreateInstanceV2Response> createInstanceV2Async(CreateInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createInstanceV2);
    }

    /** 创建专享版实例 创建专享版实例
     *
     * @param CreateInstanceV2Request 请求对象
     * @return AsyncInvoker<CreateInstanceV2Request, CreateInstanceV2Response> */
    public AsyncInvoker<CreateInstanceV2Request, CreateInstanceV2Response> createInstanceV2AsyncInvoker(
        CreateInstanceV2Request request) {
        return new AsyncInvoker<CreateInstanceV2Request, CreateInstanceV2Response>(request, ApigMeta.createInstanceV2,
            hcClient);
    }

    /** 创建流控策略 当API上线后，系统会默认给每个API提供一个流控策略，API提供者可以根据自身API的服务能力及负载情况变更这个流控策略。 流控策略即限制API在一定长度的时间内，能够允许被访问的最大次数。
     *
     * @param CreateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<CreateRequestThrottlingPolicyV2Response> */
    public CompletableFuture<CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2Async(
        CreateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createRequestThrottlingPolicyV2);
    }

    /** 创建流控策略 当API上线后，系统会默认给每个API提供一个流控策略，API提供者可以根据自身API的服务能力及负载情况变更这个流控策略。 流控策略即限制API在一定长度的时间内，能够允许被访问的最大次数。
     *
     * @param CreateRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> */
    public AsyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2AsyncInvoker(
        CreateRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response>(
            request, ApigMeta.createRequestThrottlingPolicyV2, hcClient);
    }

    /** 创建签名密钥 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。 其中，签名密钥就是API安全保护机制的一种。
     * 租户创建一个签名密钥，并将签名密钥与API进行绑定，则API网关在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是API网关发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。
     *
     * @param CreateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<CreateSignatureKeyV2Response> */
    public CompletableFuture<CreateSignatureKeyV2Response> createSignatureKeyV2Async(
        CreateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createSignatureKeyV2);
    }

    /** 创建签名密钥 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。 其中，签名密钥就是API安全保护机制的一种。
     * 租户创建一个签名密钥，并将签名密钥与API进行绑定，则API网关在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是API网关发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。
     *
     * @param CreateSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> */
    public AsyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> createSignatureKeyV2AsyncInvoker(
        CreateSignatureKeyV2Request request) {
        return new AsyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response>(request,
            ApigMeta.createSignatureKeyV2, hcClient);
    }

    /** 创建特殊设置 流控策略可以限制一段时间内可以访问API的最大次数，也可以限制一段时间内单个租户和单个APP可以访问API的最大次数。
     * 如果想要对某个特定的APP进行特殊设置，例如设置所有APP每分钟的访问次数为500次，但想设置APP1每分钟的访问次数为800次，可以通过在流控策略中设置特殊APP来实现该功能。
     * 为流控策略添加一个特殊设置的对象，可以是APP，也可以是租户。
     *
     * @param CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return CompletableFuture<CreateSpecialThrottlingConfigurationV2Response> */
    public CompletableFuture<CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2Async(
        CreateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createSpecialThrottlingConfigurationV2);
    }

    /** 创建特殊设置 流控策略可以限制一段时间内可以访问API的最大次数，也可以限制一段时间内单个租户和单个APP可以访问API的最大次数。
     * 如果想要对某个特定的APP进行特殊设置，例如设置所有APP每分钟的访问次数为500次，但想设置APP1每分钟的访问次数为800次，可以通过在流控策略中设置特殊APP来实现该功能。
     * 为流控策略添加一个特殊设置的对象，可以是APP，也可以是租户。
     *
     * @param CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return AsyncInvoker<CreateSpecialThrottlingConfigurationV2Request,
     *         CreateSpecialThrottlingConfigurationV2Response> */
    public AsyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2AsyncInvoker(
        CreateSpecialThrottlingConfigurationV2Request request) {
        return new AsyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response>(
            request, ApigMeta.createSpecialThrottlingConfigurationV2, hcClient);
    }

    /** 删除自定义认证 删除自定义认证
     *
     * @param DeleteCustomAuthorizerV2Request 请求对象
     * @return CompletableFuture<DeleteCustomAuthorizerV2Response> */
    public CompletableFuture<DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2Async(
        DeleteCustomAuthorizerV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteCustomAuthorizerV2);
    }

    /** 删除自定义认证 删除自定义认证
     *
     * @param DeleteCustomAuthorizerV2Request 请求对象
     * @return AsyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> */
    public AsyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2AsyncInvoker(
        DeleteCustomAuthorizerV2Request request) {
        return new AsyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response>(request,
            ApigMeta.deleteCustomAuthorizerV2, hcClient);
    }

    /** 删除环境 删除指定的环境。 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。 环境上存在已发布的API时，该环境不能被删除。
     *
     * @param DeleteEnvironmentV2Request 请求对象
     * @return CompletableFuture<DeleteEnvironmentV2Response> */
    public CompletableFuture<DeleteEnvironmentV2Response> deleteEnvironmentV2Async(DeleteEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteEnvironmentV2);
    }

    /** 删除环境 删除指定的环境。 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。 环境上存在已发布的API时，该环境不能被删除。
     *
     * @param DeleteEnvironmentV2Request 请求对象
     * @return AsyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> */
    public AsyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> deleteEnvironmentV2AsyncInvoker(
        DeleteEnvironmentV2Request request) {
        return new AsyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response>(request,
            ApigMeta.deleteEnvironmentV2, hcClient);
    }

    /** 删除变量 删除指定的环境变量。
     *
     * @param DeleteEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<DeleteEnvironmentVariableV2Response> */
    public CompletableFuture<DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2Async(
        DeleteEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteEnvironmentVariableV2);
    }

    /** 删除变量 删除指定的环境变量。
     *
     * @param DeleteEnvironmentVariableV2Request 请求对象
     * @return AsyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> */
    public AsyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2AsyncInvoker(
        DeleteEnvironmentVariableV2Request request) {
        return new AsyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response>(request,
            ApigMeta.deleteEnvironmentVariableV2, hcClient);
    }

    /** 删除分组指定错误类型的自定义响应配置 删除分组指定错误类型的自定义响应配置，还原为使用默认值的配置。
     *
     * @param DeleteGatewayResponseTypeV2Request 请求对象
     * @return CompletableFuture<DeleteGatewayResponseTypeV2Response> */
    public CompletableFuture<DeleteGatewayResponseTypeV2Response> deleteGatewayResponseTypeV2Async(
        DeleteGatewayResponseTypeV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteGatewayResponseTypeV2);
    }

    /** 删除分组指定错误类型的自定义响应配置 删除分组指定错误类型的自定义响应配置，还原为使用默认值的配置。
     *
     * @param DeleteGatewayResponseTypeV2Request 请求对象
     * @return AsyncInvoker<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response> */
    public AsyncInvoker<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response> deleteGatewayResponseTypeV2AsyncInvoker(
        DeleteGatewayResponseTypeV2Request request) {
        return new AsyncInvoker<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response>(request,
            ApigMeta.deleteGatewayResponseTypeV2, hcClient);
    }

    /** 删除分组自定义响应 删除分组自定义响应
     *
     * @param DeleteGatewayResponseV2Request 请求对象
     * @return CompletableFuture<DeleteGatewayResponseV2Response> */
    public CompletableFuture<DeleteGatewayResponseV2Response> deleteGatewayResponseV2Async(
        DeleteGatewayResponseV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteGatewayResponseV2);
    }

    /** 删除分组自定义响应 删除分组自定义响应
     *
     * @param DeleteGatewayResponseV2Request 请求对象
     * @return AsyncInvoker<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response> */
    public AsyncInvoker<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response> deleteGatewayResponseV2AsyncInvoker(
        DeleteGatewayResponseV2Request request) {
        return new AsyncInvoker<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response>(request,
            ApigMeta.deleteGatewayResponseV2, hcClient);
    }

    /** 删除专享版实例 删除专享版实例
     *
     * @param DeleteInstancesV2Request 请求对象
     * @return CompletableFuture<DeleteInstancesV2Response> */
    public CompletableFuture<DeleteInstancesV2Response> deleteInstancesV2Async(DeleteInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteInstancesV2);
    }

    /** 删除专享版实例 删除专享版实例
     *
     * @param DeleteInstancesV2Request 请求对象
     * @return AsyncInvoker<DeleteInstancesV2Request, DeleteInstancesV2Response> */
    public AsyncInvoker<DeleteInstancesV2Request, DeleteInstancesV2Response> deleteInstancesV2AsyncInvoker(
        DeleteInstancesV2Request request) {
        return new AsyncInvoker<DeleteInstancesV2Request, DeleteInstancesV2Response>(request,
            ApigMeta.deleteInstancesV2, hcClient);
    }

    /** 删除流控策略 删除指定的流控策略,以及该流控策略与API的所有绑定关系。
     *
     * @param DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<DeleteRequestThrottlingPolicyV2Response> */
    public CompletableFuture<DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2Async(
        DeleteRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteRequestThrottlingPolicyV2);
    }

    /** 删除流控策略 删除指定的流控策略,以及该流控策略与API的所有绑定关系。
     *
     * @param DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> */
    public AsyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2AsyncInvoker(
        DeleteRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response>(
            request, ApigMeta.deleteRequestThrottlingPolicyV2, hcClient);
    }

    /** 删除签名密钥 删除指定的签名密钥,删除签名密钥时，其配置的绑定关系会一并删除，相应的签名密钥会失效。
     *
     * @param DeleteSignatureKeyV2Request 请求对象
     * @return CompletableFuture<DeleteSignatureKeyV2Response> */
    public CompletableFuture<DeleteSignatureKeyV2Response> deleteSignatureKeyV2Async(
        DeleteSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteSignatureKeyV2);
    }

    /** 删除签名密钥 删除指定的签名密钥,删除签名密钥时，其配置的绑定关系会一并删除，相应的签名密钥会失效。
     *
     * @param DeleteSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> */
    public AsyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> deleteSignatureKeyV2AsyncInvoker(
        DeleteSignatureKeyV2Request request) {
        return new AsyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response>(request,
            ApigMeta.deleteSignatureKeyV2, hcClient);
    }

    /** 删除特殊设置 删除某个流控策略的某个特殊配置。
     *
     * @param DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return CompletableFuture<DeleteSpecialThrottlingConfigurationV2Response> */
    public CompletableFuture<DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2Async(
        DeleteSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteSpecialThrottlingConfigurationV2);
    }

    /** 删除特殊设置 删除某个流控策略的某个特殊配置。
     *
     * @param DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return AsyncInvoker<DeleteSpecialThrottlingConfigurationV2Request,
     *         DeleteSpecialThrottlingConfigurationV2Response> */
    public AsyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2AsyncInvoker(
        DeleteSpecialThrottlingConfigurationV2Request request) {
        return new AsyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response>(
            request, ApigMeta.deleteSpecialThrottlingConfigurationV2, hcClient);
    }

    /** 删除域名证书 如果域名证书不再需要或者已过期，则可以删除证书内容。
     *
     * @param DisassociateCertificateV2Request 请求对象
     * @return CompletableFuture<DisassociateCertificateV2Response> */
    public CompletableFuture<DisassociateCertificateV2Response> disassociateCertificateV2Async(
        DisassociateCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateCertificateV2);
    }

    /** 删除域名证书 如果域名证书不再需要或者已过期，则可以删除证书内容。
     *
     * @param DisassociateCertificateV2Request 请求对象
     * @return AsyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response> */
    public AsyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response> disassociateCertificateV2AsyncInvoker(
        DisassociateCertificateV2Request request) {
        return new AsyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response>(request,
            ApigMeta.disassociateCertificateV2, hcClient);
    }

    /** 解绑域名 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     *
     * @param DisassociateDomainV2Request 请求对象
     * @return CompletableFuture<DisassociateDomainV2Response> */
    public CompletableFuture<DisassociateDomainV2Response> disassociateDomainV2Async(
        DisassociateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateDomainV2);
    }

    /** 解绑域名 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     *
     * @param DisassociateDomainV2Request 请求对象
     * @return AsyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response> */
    public AsyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response> disassociateDomainV2AsyncInvoker(
        DisassociateDomainV2Request request) {
        return new AsyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response>(request,
            ApigMeta.disassociateDomainV2, hcClient);
    }

    /** 解除绑定 解除API与签名密钥的绑定关系。
     *
     * @param DisassociateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<DisassociateSignatureKeyV2Response> */
    public CompletableFuture<DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2Async(
        DisassociateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateSignatureKeyV2);
    }

    /** 解除绑定 解除API与签名密钥的绑定关系。
     *
     * @param DisassociateSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> */
    public AsyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2AsyncInvoker(
        DisassociateSignatureKeyV2Request request) {
        return new AsyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response>(request,
            ApigMeta.disassociateSignatureKeyV2, hcClient);
    }

    /** 查询API分组概况 查询租户名下的API分组概况。
     *
     * @param ListApiGroupsQuantitiesV2Request 请求对象
     * @return CompletableFuture<ListApiGroupsQuantitiesV2Response> */
    public CompletableFuture<ListApiGroupsQuantitiesV2Response> listApiGroupsQuantitiesV2Async(
        ListApiGroupsQuantitiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiGroupsQuantitiesV2);
    }

    /** 查询API分组概况 查询租户名下的API分组概况。
     *
     * @param ListApiGroupsQuantitiesV2Request 请求对象
     * @return AsyncInvoker<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> */
    public AsyncInvoker<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> listApiGroupsQuantitiesV2AsyncInvoker(
        ListApiGroupsQuantitiesV2Request request) {
        return new AsyncInvoker<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response>(request,
            ApigMeta.listApiGroupsQuantitiesV2, hcClient);
    }

    /** 查询API概况 查询租户名下的API概况：已发布到RELEASE环境的API个数，未发布到RELEASE环境的API个数。
     *
     * @param ListApiQuantitiesV2Request 请求对象
     * @return CompletableFuture<ListApiQuantitiesV2Response> */
    public CompletableFuture<ListApiQuantitiesV2Response> listApiQuantitiesV2Async(ListApiQuantitiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiQuantitiesV2);
    }

    /** 查询API概况 查询租户名下的API概况：已发布到RELEASE环境的API个数，未发布到RELEASE环境的API个数。
     *
     * @param ListApiQuantitiesV2Request 请求对象
     * @return AsyncInvoker<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> */
    public AsyncInvoker<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> listApiQuantitiesV2AsyncInvoker(
        ListApiQuantitiesV2Request request) {
        return new AsyncInvoker<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response>(request,
            ApigMeta.listApiQuantitiesV2, hcClient);
    }

    /** 查看签名密钥绑定的API列表 查询某个签名密钥上已经绑定的API列表。
     *
     * @param ListApisBindedToSignatureKeyV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToSignatureKeyV2Response> */
    public CompletableFuture<ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2Async(
        ListApisBindedToSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisBindedToSignatureKeyV2);
    }

    /** 查看签名密钥绑定的API列表 查询某个签名密钥上已经绑定的API列表。
     *
     * @param ListApisBindedToSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> */
    public AsyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2AsyncInvoker(
        ListApisBindedToSignatureKeyV2Request request) {
        return new AsyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response>(request,
            ApigMeta.listApisBindedToSignatureKeyV2, hcClient);
    }

    /** 查看签名密钥未绑定的API列表 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return CompletableFuture<ListApisNotBoundWithSignatureKeyV2Response> */
    public CompletableFuture<ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2Async(
        ListApisNotBoundWithSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisNotBoundWithSignatureKeyV2);
    }

    /** 查看签名密钥未绑定的API列表 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> */
    public AsyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2AsyncInvoker(
        ListApisNotBoundWithSignatureKeyV2Request request) {
        return new AsyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response>(
            request, ApigMeta.listApisNotBoundWithSignatureKeyV2, hcClient);
    }

    /** 查询APP概况 查询租户名下的APP概况：已进行API访问授权的APP个数，未进行API访问授权的APP个数。
     *
     * @param ListAppQuantitiesV2Request 请求对象
     * @return CompletableFuture<ListAppQuantitiesV2Response> */
    public CompletableFuture<ListAppQuantitiesV2Response> listAppQuantitiesV2Async(ListAppQuantitiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppQuantitiesV2);
    }

    /** 查询APP概况 查询租户名下的APP概况：已进行API访问授权的APP个数，未进行API访问授权的APP个数。
     *
     * @param ListAppQuantitiesV2Request 请求对象
     * @return AsyncInvoker<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> */
    public AsyncInvoker<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> listAppQuantitiesV2AsyncInvoker(
        ListAppQuantitiesV2Request request) {
        return new AsyncInvoker<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response>(request,
            ApigMeta.listAppQuantitiesV2, hcClient);
    }

    /** 查看可用区信息 查看可用区信息
     *
     * @param ListAvailableZonesV2Request 请求对象
     * @return CompletableFuture<ListAvailableZonesV2Response> */
    public CompletableFuture<ListAvailableZonesV2Response> listAvailableZonesV2Async(
        ListAvailableZonesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAvailableZonesV2);
    }

    /** 查看可用区信息 查看可用区信息
     *
     * @param ListAvailableZonesV2Request 请求对象
     * @return AsyncInvoker<ListAvailableZonesV2Request, ListAvailableZonesV2Response> */
    public AsyncInvoker<ListAvailableZonesV2Request, ListAvailableZonesV2Response> listAvailableZonesV2AsyncInvoker(
        ListAvailableZonesV2Request request) {
        return new AsyncInvoker<ListAvailableZonesV2Request, ListAvailableZonesV2Response>(request,
            ApigMeta.listAvailableZonesV2, hcClient);
    }

    /** 查询自定义认证列表 查询自定义认证列表
     *
     * @param ListCustomAuthorizersV2Request 请求对象
     * @return CompletableFuture<ListCustomAuthorizersV2Response> */
    public CompletableFuture<ListCustomAuthorizersV2Response> listCustomAuthorizersV2Async(
        ListCustomAuthorizersV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listCustomAuthorizersV2);
    }

    /** 查询自定义认证列表 查询自定义认证列表
     *
     * @param ListCustomAuthorizersV2Request 请求对象
     * @return AsyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> */
    public AsyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> listCustomAuthorizersV2AsyncInvoker(
        ListCustomAuthorizersV2Request request) {
        return new AsyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response>(request,
            ApigMeta.listCustomAuthorizersV2, hcClient);
    }

    /** 查询变量列表 查询分组下的所有环境变量的列表。
     *
     * @param ListEnvironmentVariablesV2Request 请求对象
     * @return CompletableFuture<ListEnvironmentVariablesV2Response> */
    public CompletableFuture<ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2Async(
        ListEnvironmentVariablesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listEnvironmentVariablesV2);
    }

    /** 查询变量列表 查询分组下的所有环境变量的列表。
     *
     * @param ListEnvironmentVariablesV2Request 请求对象
     * @return AsyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> */
    public AsyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2AsyncInvoker(
        ListEnvironmentVariablesV2Request request) {
        return new AsyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response>(request,
            ApigMeta.listEnvironmentVariablesV2, hcClient);
    }

    /** 查询环境列表 查询符合条件的环境列表。
     *
     * @param ListEnvironmentsV2Request 请求对象
     * @return CompletableFuture<ListEnvironmentsV2Response> */
    public CompletableFuture<ListEnvironmentsV2Response> listEnvironmentsV2Async(ListEnvironmentsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listEnvironmentsV2);
    }

    /** 查询环境列表 查询符合条件的环境列表。
     *
     * @param ListEnvironmentsV2Request 请求对象
     * @return AsyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response> */
    public AsyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response> listEnvironmentsV2AsyncInvoker(
        ListEnvironmentsV2Request request) {
        return new AsyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response>(request,
            ApigMeta.listEnvironmentsV2, hcClient);
    }

    /** 查看实例特性列表 查看实例特性列表。注意：实例不支持以下特性的需要联系技术支持升级实例版本。 当前支持的特性列表如下： 特性名称 | 特性描述 | 特性是否可配置| --------| :------- |
     * :-------| lts | 是否支持shubao访问日志上报功能。| 是 | gateway_responses | 是否支持网关自定义响应。| 否 | ratelimit | 是否支持自定义流控值。| 是 |
     * request_body_size | 是否支持指定最大请求Body大小。| 是 | backend_timeout | 是否支持配置后端API最大超时时间。| 是 | app_token |
     * 是否开启app_token认证方式。| 是 | app_api_key | 是否开启app_api_key认证方式。| 是 | app_basic | 是否开启app_basic认证方式。| 是 | app_secret |
     * 是否支持app_secret认证方式。| 是 | app_jwt | 是否支持app_jwt认证方式。| 是 | public_key | 是否支持public_key类型的后端签名。| 是 |
     * backend_token_allow | 是否支持普通租户透传token到后端。| 是 | sign_basic | 签名秘钥是否支持basic类型。| 否 | multi_auth | API是否支持双重认证方式。| 否
     * | backend_client_certificate | 是否开启后端双向认证。| 是 | ssl_ciphers | 是否支持https加密套件。 | 是 | route | 是否支持自定义路由。| 否 | cors |
     * 是否支持API使用插件功能。| 否 | real_ip_from_xff | 是否开启使用xff头作为访问控制、流控策略的源ip生效依据。 | 是 |
     *
     * @param ListFeaturesV2Request 请求对象
     * @return CompletableFuture<ListFeaturesV2Response> */
    public CompletableFuture<ListFeaturesV2Response> listFeaturesV2Async(ListFeaturesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listFeaturesV2);
    }

    /** 查看实例特性列表 查看实例特性列表。注意：实例不支持以下特性的需要联系技术支持升级实例版本。 当前支持的特性列表如下： 特性名称 | 特性描述 | 特性是否可配置| --------| :------- |
     * :-------| lts | 是否支持shubao访问日志上报功能。| 是 | gateway_responses | 是否支持网关自定义响应。| 否 | ratelimit | 是否支持自定义流控值。| 是 |
     * request_body_size | 是否支持指定最大请求Body大小。| 是 | backend_timeout | 是否支持配置后端API最大超时时间。| 是 | app_token |
     * 是否开启app_token认证方式。| 是 | app_api_key | 是否开启app_api_key认证方式。| 是 | app_basic | 是否开启app_basic认证方式。| 是 | app_secret |
     * 是否支持app_secret认证方式。| 是 | app_jwt | 是否支持app_jwt认证方式。| 是 | public_key | 是否支持public_key类型的后端签名。| 是 |
     * backend_token_allow | 是否支持普通租户透传token到后端。| 是 | sign_basic | 签名秘钥是否支持basic类型。| 否 | multi_auth | API是否支持双重认证方式。| 否
     * | backend_client_certificate | 是否开启后端双向认证。| 是 | ssl_ciphers | 是否支持https加密套件。 | 是 | route | 是否支持自定义路由。| 否 | cors |
     * 是否支持API使用插件功能。| 否 | real_ip_from_xff | 是否开启使用xff头作为访问控制、流控策略的源ip生效依据。 | 是 |
     *
     * @param ListFeaturesV2Request 请求对象
     * @return AsyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response> */
    public AsyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response> listFeaturesV2AsyncInvoker(
        ListFeaturesV2Request request) {
        return new AsyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response>(request, ApigMeta.listFeaturesV2,
            hcClient);
    }

    /** 查询分组自定义响应列表 查询分组自定义响应列表
     *
     * @param ListGatewayResponsesV2Request 请求对象
     * @return CompletableFuture<ListGatewayResponsesV2Response> */
    public CompletableFuture<ListGatewayResponsesV2Response> listGatewayResponsesV2Async(
        ListGatewayResponsesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listGatewayResponsesV2);
    }

    /** 查询分组自定义响应列表 查询分组自定义响应列表
     *
     * @param ListGatewayResponsesV2Request 请求对象
     * @return AsyncInvoker<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response> */
    public AsyncInvoker<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response> listGatewayResponsesV2AsyncInvoker(
        ListGatewayResponsesV2Request request) {
        return new AsyncInvoker<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response>(request,
            ApigMeta.listGatewayResponsesV2, hcClient);
    }

    /** 查询租户实例配置列表 查询租户实例配置列表
     *
     * @param ListInstanceConfigsV2Request 请求对象
     * @return CompletableFuture<ListInstanceConfigsV2Response> */
    public CompletableFuture<ListInstanceConfigsV2Response> listInstanceConfigsV2Async(
        ListInstanceConfigsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listInstanceConfigsV2);
    }

    /** 查询租户实例配置列表 查询租户实例配置列表
     *
     * @param ListInstanceConfigsV2Request 请求对象
     * @return AsyncInvoker<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response> */
    public AsyncInvoker<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response> listInstanceConfigsV2AsyncInvoker(
        ListInstanceConfigsV2Request request) {
        return new AsyncInvoker<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response>(request,
            ApigMeta.listInstanceConfigsV2, hcClient);
    }

    /** 查询专享版实例列表 查询专享版实例列表
     *
     * @param ListInstancesV2Request 请求对象
     * @return CompletableFuture<ListInstancesV2Response> */
    public CompletableFuture<ListInstancesV2Response> listInstancesV2Async(ListInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listInstancesV2);
    }

    /** 查询专享版实例列表 查询专享版实例列表
     *
     * @param ListInstancesV2Request 请求对象
     * @return AsyncInvoker<ListInstancesV2Request, ListInstancesV2Response> */
    public AsyncInvoker<ListInstancesV2Request, ListInstancesV2Response> listInstancesV2AsyncInvoker(
        ListInstancesV2Request request) {
        return new AsyncInvoker<ListInstancesV2Request, ListInstancesV2Response>(request, ApigMeta.listInstancesV2,
            hcClient);
    }

    /** API统计信息查询-最近一段时间 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。 &gt;
     * 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     *
     * @param ListLatelyApiStatisticsV2Request 请求对象
     * @return CompletableFuture<ListLatelyApiStatisticsV2Response> */
    public CompletableFuture<ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2Async(
        ListLatelyApiStatisticsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listLatelyApiStatisticsV2);
    }

    /** API统计信息查询-最近一段时间 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。 &gt;
     * 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     *
     * @param ListLatelyApiStatisticsV2Request 请求对象
     * @return AsyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> */
    public AsyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2AsyncInvoker(
        ListLatelyApiStatisticsV2Request request) {
        return new AsyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response>(request,
            ApigMeta.listLatelyApiStatisticsV2, hcClient);
    }

    /** 分组统计信息查询-最近一小时内 根据API分组的编号查询该分组下所有API被调用的总次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。 &gt;
     * 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     *
     * @param ListLatelyGroupStatisticsV2Request 请求对象
     * @return CompletableFuture<ListLatelyGroupStatisticsV2Response> */
    public CompletableFuture<ListLatelyGroupStatisticsV2Response> listLatelyGroupStatisticsV2Async(
        ListLatelyGroupStatisticsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listLatelyGroupStatisticsV2);
    }

    /** 分组统计信息查询-最近一小时内 根据API分组的编号查询该分组下所有API被调用的总次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。 &gt;
     * 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     *
     * @param ListLatelyGroupStatisticsV2Request 请求对象
     * @return AsyncInvoker<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response> */
    public AsyncInvoker<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response> listLatelyGroupStatisticsV2AsyncInvoker(
        ListLatelyGroupStatisticsV2Request request) {
        return new AsyncInvoker<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response>(request,
            ApigMeta.listLatelyGroupStatisticsV2, hcClient);
    }

    /** 查询某个实例的租户配置列表 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     *
     * @param ListProjectCofigsV2Request 请求对象
     * @return CompletableFuture<ListProjectCofigsV2Response> */
    public CompletableFuture<ListProjectCofigsV2Response> listProjectCofigsV2Async(ListProjectCofigsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listProjectCofigsV2);
    }

    /** 查询某个实例的租户配置列表 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     *
     * @param ListProjectCofigsV2Request 请求对象
     * @return AsyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response> */
    public AsyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response> listProjectCofigsV2AsyncInvoker(
        ListProjectCofigsV2Request request) {
        return new AsyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response>(request,
            ApigMeta.listProjectCofigsV2, hcClient);
    }

    /** 查询流控策略列表 查询所有流控策略的信息。
     *
     * @param ListRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ListRequestThrottlingPolicyV2Response> */
    public CompletableFuture<ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2Async(
        ListRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listRequestThrottlingPolicyV2);
    }

    /** 查询流控策略列表 查询所有流控策略的信息。
     *
     * @param ListRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> */
    public AsyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2AsyncInvoker(
        ListRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response>(request,
            ApigMeta.listRequestThrottlingPolicyV2, hcClient);
    }

    /** 查看API绑定的签名密钥列表 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     *
     * @param ListSignatureKeysBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListSignatureKeysBindedToApiV2Response> */
    public CompletableFuture<ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2Async(
        ListSignatureKeysBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listSignatureKeysBindedToApiV2);
    }

    /** 查看API绑定的签名密钥列表 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     *
     * @param ListSignatureKeysBindedToApiV2Request 请求对象
     * @return AsyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> */
    public AsyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2AsyncInvoker(
        ListSignatureKeysBindedToApiV2Request request) {
        return new AsyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response>(request,
            ApigMeta.listSignatureKeysBindedToApiV2, hcClient);
    }

    /** 查询签名密钥列表 查询所有签名密钥的信息。
     *
     * @param ListSignatureKeysV2Request 请求对象
     * @return CompletableFuture<ListSignatureKeysV2Response> */
    public CompletableFuture<ListSignatureKeysV2Response> listSignatureKeysV2Async(ListSignatureKeysV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listSignatureKeysV2);
    }

    /** 查询签名密钥列表 查询所有签名密钥的信息。
     *
     * @param ListSignatureKeysV2Request 请求对象
     * @return AsyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response> */
    public AsyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response> listSignatureKeysV2AsyncInvoker(
        ListSignatureKeysV2Request request) {
        return new AsyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response>(request,
            ApigMeta.listSignatureKeysV2, hcClient);
    }

    /** 查看特殊设置列表 查看给流控策略设置的特殊配置。
     *
     * @param ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return CompletableFuture<ListSpecialThrottlingConfigurationsV2Response> */
    public CompletableFuture<ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2Async(
        ListSpecialThrottlingConfigurationsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listSpecialThrottlingConfigurationsV2);
    }

    /** 查看特殊设置列表 查看给流控策略设置的特殊配置。
     *
     * @param ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return AsyncInvoker<ListSpecialThrottlingConfigurationsV2Request,
     *         ListSpecialThrottlingConfigurationsV2Response> */
    public AsyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2AsyncInvoker(
        ListSpecialThrottlingConfigurationsV2Request request) {
        return new AsyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response>(
            request, ApigMeta.listSpecialThrottlingConfigurationsV2, hcClient);
    }

    /** 查询标签列表 查询标签列表
     *
     * @param ListTagsV2Request 请求对象
     * @return CompletableFuture<ListTagsV2Response> */
    public CompletableFuture<ListTagsV2Response> listTagsV2Async(ListTagsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listTagsV2);
    }

    /** 查询标签列表 查询标签列表
     *
     * @param ListTagsV2Request 请求对象
     * @return AsyncInvoker<ListTagsV2Request, ListTagsV2Response> */
    public AsyncInvoker<ListTagsV2Request, ListTagsV2Response> listTagsV2AsyncInvoker(ListTagsV2Request request) {
        return new AsyncInvoker<ListTagsV2Request, ListTagsV2Response>(request, ApigMeta.listTagsV2, hcClient);
    }

    /** 实例解绑EIP 实例解绑EIP
     *
     * @param RemoveEipV2Request 请求对象
     * @return CompletableFuture<RemoveEipV2Response> */
    public CompletableFuture<RemoveEipV2Response> removeEipV2Async(RemoveEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.removeEipV2);
    }

    /** 实例解绑EIP 实例解绑EIP
     *
     * @param RemoveEipV2Request 请求对象
     * @return AsyncInvoker<RemoveEipV2Request, RemoveEipV2Response> */
    public AsyncInvoker<RemoveEipV2Request, RemoveEipV2Response> removeEipV2AsyncInvoker(RemoveEipV2Request request) {
        return new AsyncInvoker<RemoveEipV2Request, RemoveEipV2Response>(request, ApigMeta.removeEipV2, hcClient);
    }

    /** 关闭实例公网出口 关闭实例公网出口
     *
     * @param RemoveEngressEipV2Request 请求对象
     * @return CompletableFuture<RemoveEngressEipV2Response> */
    public CompletableFuture<RemoveEngressEipV2Response> removeEngressEipV2Async(RemoveEngressEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.removeEngressEipV2);
    }

    /** 关闭实例公网出口 关闭实例公网出口
     *
     * @param RemoveEngressEipV2Request 请求对象
     * @return AsyncInvoker<RemoveEngressEipV2Request, RemoveEngressEipV2Response> */
    public AsyncInvoker<RemoveEngressEipV2Request, RemoveEngressEipV2Response> removeEngressEipV2AsyncInvoker(
        RemoveEngressEipV2Request request) {
        return new AsyncInvoker<RemoveEngressEipV2Request, RemoveEngressEipV2Response>(request,
            ApigMeta.removeEngressEipV2, hcClient);
    }

    /** 查看自定义认证详情 查看自定义认证详情
     *
     * @param ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfCustomAuthorizersV2Response> */
    public CompletableFuture<ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2Async(
        ShowDetailsOfCustomAuthorizersV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfCustomAuthorizersV2);
    }

    /** 查看自定义认证详情 查看自定义认证详情
     *
     * @param ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> */
    public AsyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2AsyncInvoker(
        ShowDetailsOfCustomAuthorizersV2Request request) {
        return new AsyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response>(
            request, ApigMeta.showDetailsOfCustomAuthorizersV2, hcClient);
    }

    /** 查看域名证书 查看域名下绑定的证书详情。
     *
     * @param ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfDomainNameCertificateV2Response> */
    public CompletableFuture<ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2Async(
        ShowDetailsOfDomainNameCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfDomainNameCertificateV2);
    }

    /** 查看域名证书 查看域名下绑定的证书详情。
     *
     * @param ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfDomainNameCertificateV2Request,
     *         ShowDetailsOfDomainNameCertificateV2Response> */
    public AsyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2AsyncInvoker(
        ShowDetailsOfDomainNameCertificateV2Request request) {
        return new AsyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response>(
            request, ApigMeta.showDetailsOfDomainNameCertificateV2, hcClient);
    }

    /** 查看变量详情 查看指定的环境变量的详情。
     *
     * @param ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfEnvironmentVariableV2Response> */
    public CompletableFuture<ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2Async(
        ShowDetailsOfEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfEnvironmentVariableV2);
    }

    /** 查看变量详情 查看指定的环境变量的详情。
     *
     * @param ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> */
    public AsyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2AsyncInvoker(
        ShowDetailsOfEnvironmentVariableV2Request request) {
        return new AsyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response>(
            request, ApigMeta.showDetailsOfEnvironmentVariableV2, hcClient);
    }

    /** 查看分组下指定错误类型的自定义响应 查看分组下指定错误类型的自定义响应
     *
     * @param ShowDetailsOfGatewayResponseTypeV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfGatewayResponseTypeV2Response> */
    public CompletableFuture<ShowDetailsOfGatewayResponseTypeV2Response> showDetailsOfGatewayResponseTypeV2Async(
        ShowDetailsOfGatewayResponseTypeV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfGatewayResponseTypeV2);
    }

    /** 查看分组下指定错误类型的自定义响应 查看分组下指定错误类型的自定义响应
     *
     * @param ShowDetailsOfGatewayResponseTypeV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response> */
    public AsyncInvoker<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response> showDetailsOfGatewayResponseTypeV2AsyncInvoker(
        ShowDetailsOfGatewayResponseTypeV2Request request) {
        return new AsyncInvoker<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response>(
            request, ApigMeta.showDetailsOfGatewayResponseTypeV2, hcClient);
    }

    /** 查询分组自定义响应详情 查询分组自定义响应详情
     *
     * @param ShowDetailsOfGatewayResponseV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfGatewayResponseV2Response> */
    public CompletableFuture<ShowDetailsOfGatewayResponseV2Response> showDetailsOfGatewayResponseV2Async(
        ShowDetailsOfGatewayResponseV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfGatewayResponseV2);
    }

    /** 查询分组自定义响应详情 查询分组自定义响应详情
     *
     * @param ShowDetailsOfGatewayResponseV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response> */
    public AsyncInvoker<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response> showDetailsOfGatewayResponseV2AsyncInvoker(
        ShowDetailsOfGatewayResponseV2Request request) {
        return new AsyncInvoker<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response>(request,
            ApigMeta.showDetailsOfGatewayResponseV2, hcClient);
    }

    /** 查看专享版实例创建进度 查看专享版实例创建进度
     *
     * @param ShowDetailsOfInstanceProgressV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfInstanceProgressV2Response> */
    public CompletableFuture<ShowDetailsOfInstanceProgressV2Response> showDetailsOfInstanceProgressV2Async(
        ShowDetailsOfInstanceProgressV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfInstanceProgressV2);
    }

    /** 查看专享版实例创建进度 查看专享版实例创建进度
     *
     * @param ShowDetailsOfInstanceProgressV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response> */
    public AsyncInvoker<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response> showDetailsOfInstanceProgressV2AsyncInvoker(
        ShowDetailsOfInstanceProgressV2Request request) {
        return new AsyncInvoker<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response>(
            request, ApigMeta.showDetailsOfInstanceProgressV2, hcClient);
    }

    /** 查看专享版实例详情 查看专享版实例详情
     *
     * @param ShowDetailsOfInstanceV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfInstanceV2Response> */
    public CompletableFuture<ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2Async(
        ShowDetailsOfInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfInstanceV2);
    }

    /** 查看专享版实例详情 查看专享版实例详情
     *
     * @param ShowDetailsOfInstanceV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> */
    public AsyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2AsyncInvoker(
        ShowDetailsOfInstanceV2Request request) {
        return new AsyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response>(request,
            ApigMeta.showDetailsOfInstanceV2, hcClient);
    }

    /** 查看流控策略详情 查看指定流控策略的详细信息。
     *
     * @param ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfRequestThrottlingPolicyV2Response> */
    public CompletableFuture<ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2Async(
        ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfRequestThrottlingPolicyV2);
    }

    /** 查看流控策略详情 查看指定流控策略的详细信息。
     *
     * @param ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request,
     *         ShowDetailsOfRequestThrottlingPolicyV2Response> */
    public AsyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2AsyncInvoker(
        ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response>(
            request, ApigMeta.showDetailsOfRequestThrottlingPolicyV2, hcClient);
    }

    /** 修改自定义认证 修改自定义认证
     *
     * @param UpdateCustomAuthorizerV2Request 请求对象
     * @return CompletableFuture<UpdateCustomAuthorizerV2Response> */
    public CompletableFuture<UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2Async(
        UpdateCustomAuthorizerV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateCustomAuthorizerV2);
    }

    /** 修改自定义认证 修改自定义认证
     *
     * @param UpdateCustomAuthorizerV2Request 请求对象
     * @return AsyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> */
    public AsyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2AsyncInvoker(
        UpdateCustomAuthorizerV2Request request) {
        return new AsyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response>(request,
            ApigMeta.updateCustomAuthorizerV2, hcClient);
    }

    /** 修改域名 修改绑定的域名所对应的配置信息。
     *
     * @param UpdateDomainV2Request 请求对象
     * @return CompletableFuture<UpdateDomainV2Response> */
    public CompletableFuture<UpdateDomainV2Response> updateDomainV2Async(UpdateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateDomainV2);
    }

    /** 修改域名 修改绑定的域名所对应的配置信息。
     *
     * @param UpdateDomainV2Request 请求对象
     * @return AsyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response> */
    public AsyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response> updateDomainV2AsyncInvoker(
        UpdateDomainV2Request request) {
        return new AsyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response>(request, ApigMeta.updateDomainV2,
            hcClient);
    }

    /** 更新实例出公网带宽 更新实例出公网带宽
     *
     * @param UpdateEngressEipV2Request 请求对象
     * @return CompletableFuture<UpdateEngressEipV2Response> */
    public CompletableFuture<UpdateEngressEipV2Response> updateEngressEipV2Async(UpdateEngressEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateEngressEipV2);
    }

    /** 更新实例出公网带宽 更新实例出公网带宽
     *
     * @param UpdateEngressEipV2Request 请求对象
     * @return AsyncInvoker<UpdateEngressEipV2Request, UpdateEngressEipV2Response> */
    public AsyncInvoker<UpdateEngressEipV2Request, UpdateEngressEipV2Response> updateEngressEipV2AsyncInvoker(
        UpdateEngressEipV2Request request) {
        return new AsyncInvoker<UpdateEngressEipV2Request, UpdateEngressEipV2Response>(request,
            ApigMeta.updateEngressEipV2, hcClient);
    }

    /** 修改环境 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     *
     * @param UpdateEnvironmentV2Request 请求对象
     * @return CompletableFuture<UpdateEnvironmentV2Response> */
    public CompletableFuture<UpdateEnvironmentV2Response> updateEnvironmentV2Async(UpdateEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateEnvironmentV2);
    }

    /** 修改环境 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     *
     * @param UpdateEnvironmentV2Request 请求对象
     * @return AsyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> */
    public AsyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> updateEnvironmentV2AsyncInvoker(
        UpdateEnvironmentV2Request request) {
        return new AsyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response>(request,
            ApigMeta.updateEnvironmentV2, hcClient);
    }

    /** 修改分组下指定错误类型的自定义响应 修改分组下指定错误类型的自定义响应。
     *
     * @param UpdateGatewayResponseTypeV2Request 请求对象
     * @return CompletableFuture<UpdateGatewayResponseTypeV2Response> */
    public CompletableFuture<UpdateGatewayResponseTypeV2Response> updateGatewayResponseTypeV2Async(
        UpdateGatewayResponseTypeV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateGatewayResponseTypeV2);
    }

    /** 修改分组下指定错误类型的自定义响应 修改分组下指定错误类型的自定义响应。
     *
     * @param UpdateGatewayResponseTypeV2Request 请求对象
     * @return AsyncInvoker<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response> */
    public AsyncInvoker<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response> updateGatewayResponseTypeV2AsyncInvoker(
        UpdateGatewayResponseTypeV2Request request) {
        return new AsyncInvoker<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response>(request,
            ApigMeta.updateGatewayResponseTypeV2, hcClient);
    }

    /** 修改分组自定义响应 修改分组自定义响应
     *
     * @param UpdateGatewayResponseV2Request 请求对象
     * @return CompletableFuture<UpdateGatewayResponseV2Response> */
    public CompletableFuture<UpdateGatewayResponseV2Response> updateGatewayResponseV2Async(
        UpdateGatewayResponseV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateGatewayResponseV2);
    }

    /** 修改分组自定义响应 修改分组自定义响应
     *
     * @param UpdateGatewayResponseV2Request 请求对象
     * @return AsyncInvoker<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response> */
    public AsyncInvoker<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response> updateGatewayResponseV2AsyncInvoker(
        UpdateGatewayResponseV2Request request) {
        return new AsyncInvoker<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response>(request,
            ApigMeta.updateGatewayResponseV2, hcClient);
    }

    /** 更新专享版实例 更新专享版实例
     *
     * @param UpdateInstanceV2Request 请求对象
     * @return CompletableFuture<UpdateInstanceV2Response> */
    public CompletableFuture<UpdateInstanceV2Response> updateInstanceV2Async(UpdateInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateInstanceV2);
    }

    /** 更新专享版实例 更新专享版实例
     *
     * @param UpdateInstanceV2Request 请求对象
     * @return AsyncInvoker<UpdateInstanceV2Request, UpdateInstanceV2Response> */
    public AsyncInvoker<UpdateInstanceV2Request, UpdateInstanceV2Response> updateInstanceV2AsyncInvoker(
        UpdateInstanceV2Request request) {
        return new AsyncInvoker<UpdateInstanceV2Request, UpdateInstanceV2Response>(request, ApigMeta.updateInstanceV2,
            hcClient);
    }

    /** 修改流控策略 修改指定流控策略的详细信息。
     *
     * @param UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<UpdateRequestThrottlingPolicyV2Response> */
    public CompletableFuture<UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2Async(
        UpdateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateRequestThrottlingPolicyV2);
    }

    /** 修改流控策略 修改指定流控策略的详细信息。
     *
     * @param UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> */
    public AsyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2AsyncInvoker(
        UpdateRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response>(
            request, ApigMeta.updateRequestThrottlingPolicyV2, hcClient);
    }

    /** 修改签名密钥 修改指定签名密钥的详细信息。
     *
     * @param UpdateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<UpdateSignatureKeyV2Response> */
    public CompletableFuture<UpdateSignatureKeyV2Response> updateSignatureKeyV2Async(
        UpdateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateSignatureKeyV2);
    }

    /** 修改签名密钥 修改指定签名密钥的详细信息。
     *
     * @param UpdateSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> */
    public AsyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> updateSignatureKeyV2AsyncInvoker(
        UpdateSignatureKeyV2Request request) {
        return new AsyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response>(request,
            ApigMeta.updateSignatureKeyV2, hcClient);
    }

    /** 修改特殊设置 修改某个流控策略下的某个特殊设置。
     *
     * @param UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return CompletableFuture<UpdateSpecialThrottlingConfigurationV2Response> */
    public CompletableFuture<UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2Async(
        UpdateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateSpecialThrottlingConfigurationV2);
    }

    /** 修改特殊设置 修改某个流控策略下的某个特殊设置。
     *
     * @param UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return AsyncInvoker<UpdateSpecialThrottlingConfigurationV2Request,
     *         UpdateSpecialThrottlingConfigurationV2Response> */
    public AsyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2AsyncInvoker(
        UpdateSpecialThrottlingConfigurationV2Request request) {
        return new AsyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response>(
            request, ApigMeta.updateSpecialThrottlingConfigurationV2, hcClient);
    }

    /** 批量删除ACL策略 批量删除指定的多个ACL策略。 删除ACL策略时，如果存在ACL策略与API绑定关系，则无法删除。
     *
     * @param BatchDeleteAclV2Request 请求对象
     * @return CompletableFuture<BatchDeleteAclV2Response> */
    public CompletableFuture<BatchDeleteAclV2Response> batchDeleteAclV2Async(BatchDeleteAclV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchDeleteAclV2);
    }

    /** 批量删除ACL策略 批量删除指定的多个ACL策略。 删除ACL策略时，如果存在ACL策略与API绑定关系，则无法删除。
     *
     * @param BatchDeleteAclV2Request 请求对象
     * @return AsyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response> */
    public AsyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response> batchDeleteAclV2AsyncInvoker(
        BatchDeleteAclV2Request request) {
        return new AsyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response>(request, ApigMeta.batchDeleteAclV2,
            hcClient);
    }

    /** 创建ACL策略
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com\&quot;之类的网络域名。
     *
     * @param CreateAclStrategyV2Request 请求对象
     * @return CompletableFuture<CreateAclStrategyV2Response> */
    public CompletableFuture<CreateAclStrategyV2Response> createAclStrategyV2Async(CreateAclStrategyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAclStrategyV2);
    }

    /** 创建ACL策略
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com\&quot;之类的网络域名。
     *
     * @param CreateAclStrategyV2Request 请求对象
     * @return AsyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response> */
    public AsyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response> createAclStrategyV2AsyncInvoker(
        CreateAclStrategyV2Request request) {
        return new AsyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response>(request,
            ApigMeta.createAclStrategyV2, hcClient);
    }

    /** 删除ACL策略 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     *
     * @param DeleteAclV2Request 请求对象
     * @return CompletableFuture<DeleteAclV2Response> */
    public CompletableFuture<DeleteAclV2Response> deleteAclV2Async(DeleteAclV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteAclV2);
    }

    /** 删除ACL策略 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     *
     * @param DeleteAclV2Request 请求对象
     * @return AsyncInvoker<DeleteAclV2Request, DeleteAclV2Response> */
    public AsyncInvoker<DeleteAclV2Request, DeleteAclV2Response> deleteAclV2AsyncInvoker(DeleteAclV2Request request) {
        return new AsyncInvoker<DeleteAclV2Request, DeleteAclV2Response>(request, ApigMeta.deleteAclV2, hcClient);
    }

    /** 查看ACL策略列表 查询所有的ACL策略列表。
     *
     * @param ListAclStrategiesV2Request 请求对象
     * @return CompletableFuture<ListAclStrategiesV2Response> */
    public CompletableFuture<ListAclStrategiesV2Response> listAclStrategiesV2Async(ListAclStrategiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAclStrategiesV2);
    }

    /** 查看ACL策略列表 查询所有的ACL策略列表。
     *
     * @param ListAclStrategiesV2Request 请求对象
     * @return AsyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response> */
    public AsyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response> listAclStrategiesV2AsyncInvoker(
        ListAclStrategiesV2Request request) {
        return new AsyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response>(request,
            ApigMeta.listAclStrategiesV2, hcClient);
    }

    /** 查看ACL策略详情 查询指定ACL策略的详情。
     *
     * @param ShowDetailsOfAclPolicyV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAclPolicyV2Response> */
    public CompletableFuture<ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2Async(
        ShowDetailsOfAclPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfAclPolicyV2);
    }

    /** 查看ACL策略详情 查询指定ACL策略的详情。
     *
     * @param ShowDetailsOfAclPolicyV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> */
    public AsyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2AsyncInvoker(
        ShowDetailsOfAclPolicyV2Request request) {
        return new AsyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response>(request,
            ApigMeta.showDetailsOfAclPolicyV2, hcClient);
    }

    /** 修改ACL策略 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     *
     * @param UpdateAclStrategyV2Request 请求对象
     * @return CompletableFuture<UpdateAclStrategyV2Response> */
    public CompletableFuture<UpdateAclStrategyV2Response> updateAclStrategyV2Async(UpdateAclStrategyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateAclStrategyV2);
    }

    /** 修改ACL策略 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     *
     * @param UpdateAclStrategyV2Request 请求对象
     * @return AsyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> */
    public AsyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> updateAclStrategyV2AsyncInvoker(
        UpdateAclStrategyV2Request request) {
        return new AsyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response>(request,
            ApigMeta.updateAclStrategyV2, hcClient);
    }

    /** 绑定流控策略 将流控策略应用于API，则所有对该API的访问将会受到该流控策略的限制。
     * 当一定时间内的访问次数超过流控策略设置的API最大访问次数限制后，后续的访问将会被拒绝，从而能够较好的保护后端API免受异常流量的冲击，保障服务的稳定运行。
     * 为指定的API绑定流控策略，绑定时，需要指定在哪个环境上生效。同一个API发布到不同的环境可以绑定不同的流控策略；一个API在发布到特定环境后只能绑定一个默认的流控策略。
     *
     * @param AssociateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<AssociateRequestThrottlingPolicyV2Response> */
    public CompletableFuture<AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2Async(
        AssociateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateRequestThrottlingPolicyV2);
    }

    /** 绑定流控策略 将流控策略应用于API，则所有对该API的访问将会受到该流控策略的限制。
     * 当一定时间内的访问次数超过流控策略设置的API最大访问次数限制后，后续的访问将会被拒绝，从而能够较好的保护后端API免受异常流量的冲击，保障服务的稳定运行。
     * 为指定的API绑定流控策略，绑定时，需要指定在哪个环境上生效。同一个API发布到不同的环境可以绑定不同的流控策略；一个API在发布到特定环境后只能绑定一个默认的流控策略。
     *
     * @param AssociateRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> */
    public AsyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2AsyncInvoker(
        AssociateRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response>(
            request, ApigMeta.associateRequestThrottlingPolicyV2, hcClient);
    }

    /** 批量解绑流控策略 批量解除API与流控策略的绑定关系
     *
     * @param BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<BatchDisassociateThrottlingPolicyV2Response> */
    public CompletableFuture<BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2Async(
        BatchDisassociateThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchDisassociateThrottlingPolicyV2);
    }

    /** 批量解绑流控策略 批量解除API与流控策略的绑定关系
     *
     * @param BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> */
    public AsyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2AsyncInvoker(
        BatchDisassociateThrottlingPolicyV2Request request) {
        return new AsyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response>(
            request, ApigMeta.batchDisassociateThrottlingPolicyV2, hcClient);
    }

    /** 批量发布或下线API 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。
     *
     * @param BatchPublishOrOfflineApiV2Request 请求对象
     * @return CompletableFuture<BatchPublishOrOfflineApiV2Response> */
    public CompletableFuture<BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2Async(
        BatchPublishOrOfflineApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchPublishOrOfflineApiV2);
    }

    /** 批量发布或下线API 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。
     *
     * @param BatchPublishOrOfflineApiV2Request 请求对象
     * @return AsyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> */
    public AsyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2AsyncInvoker(
        BatchPublishOrOfflineApiV2Request request) {
        return new AsyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response>(request,
            ApigMeta.batchPublishOrOfflineApiV2, hcClient);
    }

    /** 切换API版本 API每次发布时，会基于当前的API定义生成一个版本。版本记录了API发布时的各种定义及状态。 多个版本之间可以进行随意切换。但一个API在一个环境上，只能有一个版本生效。
     *
     * @param ChangeApiVersionV2Request 请求对象
     * @return CompletableFuture<ChangeApiVersionV2Response> */
    public CompletableFuture<ChangeApiVersionV2Response> changeApiVersionV2Async(ChangeApiVersionV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.changeApiVersionV2);
    }

    /** 切换API版本 API每次发布时，会基于当前的API定义生成一个版本。版本记录了API发布时的各种定义及状态。 多个版本之间可以进行随意切换。但一个API在一个环境上，只能有一个版本生效。
     *
     * @param ChangeApiVersionV2Request 请求对象
     * @return AsyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response> */
    public AsyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response> changeApiVersionV2AsyncInvoker(
        ChangeApiVersionV2Request request) {
        return new AsyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response>(request,
            ApigMeta.changeApiVersionV2, hcClient);
    }

    /** 创建API分组 API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。
     *
     * @param CreateApiGroupV2Request 请求对象
     * @return CompletableFuture<CreateApiGroupV2Response> */
    public CompletableFuture<CreateApiGroupV2Response> createApiGroupV2Async(CreateApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createApiGroupV2);
    }

    /** 创建API分组 API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。
     *
     * @param CreateApiGroupV2Request 请求对象
     * @return AsyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response> */
    public AsyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response> createApiGroupV2AsyncInvoker(
        CreateApiGroupV2Request request) {
        return new AsyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response>(request, ApigMeta.createApiGroupV2,
            hcClient);
    }

    /** 注册API 添加一个API，API即一个服务接口，具体的服务能力。
     * API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了API网关如何去访问真实的后端服务。API的真实后端服务目前支持三种类型：传统的HTTP/HTTPS形式的web后端、函数工作流、MOCK。
     *
     * @param CreateApiV2Request 请求对象
     * @return CompletableFuture<CreateApiV2Response> */
    public CompletableFuture<CreateApiV2Response> createApiV2Async(CreateApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createApiV2);
    }

    /** 注册API 添加一个API，API即一个服务接口，具体的服务能力。
     * API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了API网关如何去访问真实的后端服务。API的真实后端服务目前支持三种类型：传统的HTTP/HTTPS形式的web后端、函数工作流、MOCK。
     *
     * @param CreateApiV2Request 请求对象
     * @return AsyncInvoker<CreateApiV2Request, CreateApiV2Response> */
    public AsyncInvoker<CreateApiV2Request, CreateApiV2Response> createApiV2AsyncInvoker(CreateApiV2Request request) {
        return new AsyncInvoker<CreateApiV2Request, CreateApiV2Response>(request, ApigMeta.createApiV2, hcClient);
    }

    /** 发布或下线API 对API进行发布或下线。 发布操作是将一个指定的API发布到一个指定的环境，API只有发布后，才能够被调用，且只能在该环境上才能被调用。未发布的API无法被调用。
     * 下线操作是将API从某个已发布的环境上下线，下线后，API将无法再被调用。
     *
     * @param CreateOrDeletePublishRecordForApiV2Request 请求对象
     * @return CompletableFuture<CreateOrDeletePublishRecordForApiV2Response> */
    public CompletableFuture<CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2Async(
        CreateOrDeletePublishRecordForApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createOrDeletePublishRecordForApiV2);
    }

    /** 发布或下线API 对API进行发布或下线。 发布操作是将一个指定的API发布到一个指定的环境，API只有发布后，才能够被调用，且只能在该环境上才能被调用。未发布的API无法被调用。
     * 下线操作是将API从某个已发布的环境上下线，下线后，API将无法再被调用。
     *
     * @param CreateOrDeletePublishRecordForApiV2Request 请求对象
     * @return AsyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> */
    public AsyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2AsyncInvoker(
        CreateOrDeletePublishRecordForApiV2Request request) {
        return new AsyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response>(
            request, ApigMeta.createOrDeletePublishRecordForApiV2, hcClient);
    }

    /** 调试API 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     *
     * @param DebugApiV2Request 请求对象
     * @return CompletableFuture<DebugApiV2Response> */
    public CompletableFuture<DebugApiV2Response> debugApiV2Async(DebugApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.debugApiV2);
    }

    /** 调试API 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     *
     * @param DebugApiV2Request 请求对象
     * @return AsyncInvoker<DebugApiV2Request, DebugApiV2Response> */
    public AsyncInvoker<DebugApiV2Request, DebugApiV2Response> debugApiV2AsyncInvoker(DebugApiV2Request request) {
        return new AsyncInvoker<DebugApiV2Request, DebugApiV2Response>(request, ApigMeta.debugApiV2, hcClient);
    }

    /** 根据版本编号下线API 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。
     *
     * @param DeleteApiByVersionIdV2Request 请求对象
     * @return CompletableFuture<DeleteApiByVersionIdV2Response> */
    public CompletableFuture<DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2Async(
        DeleteApiByVersionIdV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteApiByVersionIdV2);
    }

    /** 根据版本编号下线API 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。
     *
     * @param DeleteApiByVersionIdV2Request 请求对象
     * @return AsyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> */
    public AsyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2AsyncInvoker(
        DeleteApiByVersionIdV2Request request) {
        return new AsyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response>(request,
            ApigMeta.deleteApiByVersionIdV2, hcClient);
    }

    /** 删除API分组 删除指定的API分组。
     * 删除时，会一并删除直接或间接关联到该分组下的所有资源，包括API、独立域名、SSL证书、上架信息、分组下所有API的授权信息、编排信息、白名单配置、认证增强信息等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     *
     * @param DeleteApiGroupV2Request 请求对象
     * @return CompletableFuture<DeleteApiGroupV2Response> */
    public CompletableFuture<DeleteApiGroupV2Response> deleteApiGroupV2Async(DeleteApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteApiGroupV2);
    }

    /** 删除API分组 删除指定的API分组。
     * 删除时，会一并删除直接或间接关联到该分组下的所有资源，包括API、独立域名、SSL证书、上架信息、分组下所有API的授权信息、编排信息、白名单配置、认证增强信息等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     *
     * @param DeleteApiGroupV2Request 请求对象
     * @return AsyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response> */
    public AsyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response> deleteApiGroupV2AsyncInvoker(
        DeleteApiGroupV2Request request) {
        return new AsyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response>(request, ApigMeta.deleteApiGroupV2,
            hcClient);
    }

    /** 删除API 删除指定的API。 删除API时，会删除该API所有相关的资源信息或绑定关系，如API的发布记录，绑定的后端服务，对APP的授权信息等。
     *
     * @param DeleteApiV2Request 请求对象
     * @return CompletableFuture<DeleteApiV2Response> */
    public CompletableFuture<DeleteApiV2Response> deleteApiV2Async(DeleteApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteApiV2);
    }

    /** 删除API 删除指定的API。 删除API时，会删除该API所有相关的资源信息或绑定关系，如API的发布记录，绑定的后端服务，对APP的授权信息等。
     *
     * @param DeleteApiV2Request 请求对象
     * @return AsyncInvoker<DeleteApiV2Request, DeleteApiV2Response> */
    public AsyncInvoker<DeleteApiV2Request, DeleteApiV2Response> deleteApiV2AsyncInvoker(DeleteApiV2Request request) {
        return new AsyncInvoker<DeleteApiV2Request, DeleteApiV2Response>(request, ApigMeta.deleteApiV2, hcClient);
    }

    /** 解除API与流控策略的绑定关系 解除API与流控策略的绑定关系。
     *
     * @param DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<DisassociateRequestThrottlingPolicyV2Response> */
    public CompletableFuture<DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2Async(
        DisassociateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateRequestThrottlingPolicyV2);
    }

    /** 解除API与流控策略的绑定关系 解除API与流控策略的绑定关系。
     *
     * @param DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<DisassociateRequestThrottlingPolicyV2Request,
     *         DisassociateRequestThrottlingPolicyV2Response> */
    public AsyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2AsyncInvoker(
        DisassociateRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response>(
            request, ApigMeta.disassociateRequestThrottlingPolicyV2, hcClient);
    }

    /** 查询分组列表 查询API分组列表。 如果是租户操作，则查询该租户下所有的分组；如果是管理员操作，则查询的是所有租户的分组。
     *
     * @param ListApiGroupsV2Request 请求对象
     * @return CompletableFuture<ListApiGroupsV2Response> */
    public CompletableFuture<ListApiGroupsV2Response> listApiGroupsV2Async(ListApiGroupsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiGroupsV2);
    }

    /** 查询分组列表 查询API分组列表。 如果是租户操作，则查询该租户下所有的分组；如果是管理员操作，则查询的是所有租户的分组。
     *
     * @param ListApiGroupsV2Request 请求对象
     * @return AsyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response> */
    public AsyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response> listApiGroupsV2AsyncInvoker(
        ListApiGroupsV2Request request) {
        return new AsyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response>(request, ApigMeta.listApiGroupsV2,
            hcClient);
    }

    /** 查询API运行时定义 查看指定的API在指定的环境上的运行时定义，默认查询RELEASE环境上的运行时定义。 API的定义分为临时定义和运行时定义，分别代表如下含义： -
     * 临时定义：API在编辑中的定义，表示用户最后一次编辑后的API的状态 - 运行时定义：API在发布到某个环境时，对发布时的API的临时定义进行快照，固化出来的API的状态。 访问某个环境上的API，其实访问的就是其运行时的定义
     *
     * @param ListApiRuntimeDefinitionV2Request 请求对象
     * @return CompletableFuture<ListApiRuntimeDefinitionV2Response> */
    public CompletableFuture<ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2Async(
        ListApiRuntimeDefinitionV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiRuntimeDefinitionV2);
    }

    /** 查询API运行时定义 查看指定的API在指定的环境上的运行时定义，默认查询RELEASE环境上的运行时定义。 API的定义分为临时定义和运行时定义，分别代表如下含义： -
     * 临时定义：API在编辑中的定义，表示用户最后一次编辑后的API的状态 - 运行时定义：API在发布到某个环境时，对发布时的API的临时定义进行快照，固化出来的API的状态。 访问某个环境上的API，其实访问的就是其运行时的定义
     *
     * @param ListApiRuntimeDefinitionV2Request 请求对象
     * @return AsyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> */
    public AsyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2AsyncInvoker(
        ListApiRuntimeDefinitionV2Request request) {
        return new AsyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response>(request,
            ApigMeta.listApiRuntimeDefinitionV2, hcClient);
    }

    /** 查看版本详情 查询某个指定的版本详情。
     *
     * @param ListApiVersionDetailV2Request 请求对象
     * @return CompletableFuture<ListApiVersionDetailV2Response> */
    public CompletableFuture<ListApiVersionDetailV2Response> listApiVersionDetailV2Async(
        ListApiVersionDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiVersionDetailV2);
    }

    /** 查看版本详情 查询某个指定的版本详情。
     *
     * @param ListApiVersionDetailV2Request 请求对象
     * @return AsyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> */
    public AsyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> listApiVersionDetailV2AsyncInvoker(
        ListApiVersionDetailV2Request request) {
        return new AsyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response>(request,
            ApigMeta.listApiVersionDetailV2, hcClient);
    }

    /** 查询API历史版本列表 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     *
     * @param ListApiVersionsV2Request 请求对象
     * @return CompletableFuture<ListApiVersionsV2Response> */
    public CompletableFuture<ListApiVersionsV2Response> listApiVersionsV2Async(ListApiVersionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiVersionsV2);
    }

    /** 查询API历史版本列表 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     *
     * @param ListApiVersionsV2Request 请求对象
     * @return AsyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response> */
    public AsyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response> listApiVersionsV2AsyncInvoker(
        ListApiVersionsV2Request request) {
        return new AsyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response>(request,
            ApigMeta.listApiVersionsV2, hcClient);
    }

    /** 查看流控策略绑定的API列表 查询某个流控策略上已经绑定的API列表。
     *
     * @param ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToRequestThrottlingPolicyV2Response> */
    public CompletableFuture<ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2Async(
        ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisBindedToRequestThrottlingPolicyV2);
    }

    /** 查看流控策略绑定的API列表 查询某个流控策略上已经绑定的API列表。
     *
     * @param ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request,
     *         ListApisBindedToRequestThrottlingPolicyV2Response> */
    public AsyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2AsyncInvoker(
        ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response>(
            request, ApigMeta.listApisBindedToRequestThrottlingPolicyV2, hcClient);
    }

    /** 查看流控策略未绑定的API列表 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisUnbindedToRequestThrottlingPolicyV2Response> */
    public CompletableFuture<ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2Async(
        ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisUnbindedToRequestThrottlingPolicyV2);
    }

    /** 查看流控策略未绑定的API列表 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request,
     *         ListApisUnbindedToRequestThrottlingPolicyV2Response> */
    public AsyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2AsyncInvoker(
        ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response>(
            request, ApigMeta.listApisUnbindedToRequestThrottlingPolicyV2, hcClient);
    }

    /** 查询API列表 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息。
     *
     * @param ListApisV2Request 请求对象
     * @return CompletableFuture<ListApisV2Response> */
    public CompletableFuture<ListApisV2Response> listApisV2Async(ListApisV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisV2);
    }

    /** 查询API列表 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息。
     *
     * @param ListApisV2Request 请求对象
     * @return AsyncInvoker<ListApisV2Request, ListApisV2Response> */
    public AsyncInvoker<ListApisV2Request, ListApisV2Response> listApisV2AsyncInvoker(ListApisV2Request request) {
        return new AsyncInvoker<ListApisV2Request, ListApisV2Response>(request, ApigMeta.listApisV2, hcClient);
    }

    /** 查看API绑定的流控策略列表 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     *
     * @param ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListRequestThrottlingPoliciesBindedToApiV2Response> */
    public CompletableFuture<ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2Async(
        ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listRequestThrottlingPoliciesBindedToApiV2);
    }

    /** 查看API绑定的流控策略列表 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     *
     * @param ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return AsyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request,
     *         ListRequestThrottlingPoliciesBindedToApiV2Response> */
    public AsyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2AsyncInvoker(
        ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return new AsyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response>(
            request, ApigMeta.listRequestThrottlingPoliciesBindedToApiV2, hcClient);
    }

    /** 查询分组详情 查询指定分组的详细信息。
     *
     * @param ShowDetailsOfApiGroupV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfApiGroupV2Response> */
    public CompletableFuture<ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2Async(
        ShowDetailsOfApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfApiGroupV2);
    }

    /** 查询分组详情 查询指定分组的详细信息。
     *
     * @param ShowDetailsOfApiGroupV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> */
    public AsyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2AsyncInvoker(
        ShowDetailsOfApiGroupV2Request request) {
        return new AsyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response>(request,
            ApigMeta.showDetailsOfApiGroupV2, hcClient);
    }

    /** 查询API详情 查看指定的API的详细信息。
     *
     * @param ShowDetailsOfApiV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfApiV2Response> */
    public CompletableFuture<ShowDetailsOfApiV2Response> showDetailsOfApiV2Async(ShowDetailsOfApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfApiV2);
    }

    /** 查询API详情 查看指定的API的详细信息。
     *
     * @param ShowDetailsOfApiV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> */
    public AsyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> showDetailsOfApiV2AsyncInvoker(
        ShowDetailsOfApiV2Request request) {
        return new AsyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response>(request,
            ApigMeta.showDetailsOfApiV2, hcClient);
    }

    /** 修改API分组 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     *
     * @param UpdateApiGroupV2Request 请求对象
     * @return CompletableFuture<UpdateApiGroupV2Response> */
    public CompletableFuture<UpdateApiGroupV2Response> updateApiGroupV2Async(UpdateApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateApiGroupV2);
    }

    /** 修改API分组 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     *
     * @param UpdateApiGroupV2Request 请求对象
     * @return AsyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response> */
    public AsyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response> updateApiGroupV2AsyncInvoker(
        UpdateApiGroupV2Request request) {
        return new AsyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response>(request, ApigMeta.updateApiGroupV2,
            hcClient);
    }

    /** 修改API 修改指定API的信息，包括后端服务信息。
     *
     * @param UpdateApiV2Request 请求对象
     * @return CompletableFuture<UpdateApiV2Response> */
    public CompletableFuture<UpdateApiV2Response> updateApiV2Async(UpdateApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateApiV2);
    }

    /** 修改API 修改指定API的信息，包括后端服务信息。
     *
     * @param UpdateApiV2Request 请求对象
     * @return AsyncInvoker<UpdateApiV2Request, UpdateApiV2Response> */
    public AsyncInvoker<UpdateApiV2Request, UpdateApiV2Response> updateApiV2AsyncInvoker(UpdateApiV2Request request) {
        return new AsyncInvoker<UpdateApiV2Request, UpdateApiV2Response>(request, ApigMeta.updateApiV2, hcClient);
    }

    /** 批量解除API与ACL策略的绑定 批量解除API与ACL策略的绑定
     *
     * @param BatchDeleteApiAclBindingV2Request 请求对象
     * @return CompletableFuture<BatchDeleteApiAclBindingV2Response> */
    public CompletableFuture<BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2Async(
        BatchDeleteApiAclBindingV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchDeleteApiAclBindingV2);
    }

    /** 批量解除API与ACL策略的绑定 批量解除API与ACL策略的绑定
     *
     * @param BatchDeleteApiAclBindingV2Request 请求对象
     * @return AsyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> */
    public AsyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2AsyncInvoker(
        BatchDeleteApiAclBindingV2Request request) {
        return new AsyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response>(request,
            ApigMeta.batchDeleteApiAclBindingV2, hcClient);
    }

    /** 将API与ACL策略进行绑定 将API与ACL策略进行绑定。 同一个API发布到不同的环境可以绑定不同的ACL策略；一个API在发布到特定环境后只能绑定一个同一种类型的ACL策略。
     *
     * @param CreateApiAclBindingV2Request 请求对象
     * @return CompletableFuture<CreateApiAclBindingV2Response> */
    public CompletableFuture<CreateApiAclBindingV2Response> createApiAclBindingV2Async(
        CreateApiAclBindingV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createApiAclBindingV2);
    }

    /** 将API与ACL策略进行绑定 将API与ACL策略进行绑定。 同一个API发布到不同的环境可以绑定不同的ACL策略；一个API在发布到特定环境后只能绑定一个同一种类型的ACL策略。
     *
     * @param CreateApiAclBindingV2Request 请求对象
     * @return AsyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> */
    public AsyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> createApiAclBindingV2AsyncInvoker(
        CreateApiAclBindingV2Request request) {
        return new AsyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response>(request,
            ApigMeta.createApiAclBindingV2, hcClient);
    }

    /** 解除API与ACL策略的绑定 解除某条API与ACL策略的绑定关系
     *
     * @param DeleteApiAclBindingV2Request 请求对象
     * @return CompletableFuture<DeleteApiAclBindingV2Response> */
    public CompletableFuture<DeleteApiAclBindingV2Response> deleteApiAclBindingV2Async(
        DeleteApiAclBindingV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteApiAclBindingV2);
    }

    /** 解除API与ACL策略的绑定 解除某条API与ACL策略的绑定关系
     *
     * @param DeleteApiAclBindingV2Request 请求对象
     * @return AsyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> */
    public AsyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> deleteApiAclBindingV2AsyncInvoker(
        DeleteApiAclBindingV2Request request) {
        return new AsyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response>(request,
            ApigMeta.deleteApiAclBindingV2, hcClient);
    }

    /** 查看API绑定的ACL策略列表 查看API绑定的ACL策略列表
     *
     * @param ListAclPolicyBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListAclPolicyBindedToApiV2Response> */
    public CompletableFuture<ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2Async(
        ListAclPolicyBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAclPolicyBindedToApiV2);
    }

    /** 查看API绑定的ACL策略列表 查看API绑定的ACL策略列表
     *
     * @param ListAclPolicyBindedToApiV2Request 请求对象
     * @return AsyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> */
    public AsyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2AsyncInvoker(
        ListAclPolicyBindedToApiV2Request request) {
        return new AsyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response>(request,
            ApigMeta.listAclPolicyBindedToApiV2, hcClient);
    }

    /** 查看ACL策略绑定的API列表 查看ACL策略绑定的API列表
     *
     * @param ListApisBindedToAclPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToAclPolicyV2Response> */
    public CompletableFuture<ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2Async(
        ListApisBindedToAclPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisBindedToAclPolicyV2);
    }

    /** 查看ACL策略绑定的API列表 查看ACL策略绑定的API列表
     *
     * @param ListApisBindedToAclPolicyV2Request 请求对象
     * @return AsyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> */
    public AsyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2AsyncInvoker(
        ListApisBindedToAclPolicyV2Request request) {
        return new AsyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response>(request,
            ApigMeta.listApisBindedToAclPolicyV2, hcClient);
    }

    /** 查看ACL策略未绑定的API列表 查看ACL策略未绑定的API列表，需要API已发布
     *
     * @param ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisUnbindedToAclPolicyV2Response> */
    public CompletableFuture<ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2Async(
        ListApisUnbindedToAclPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisUnbindedToAclPolicyV2);
    }

    /** 查看ACL策略未绑定的API列表 查看ACL策略未绑定的API列表，需要API已发布
     *
     * @param ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return AsyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> */
    public AsyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2AsyncInvoker(
        ListApisUnbindedToAclPolicyV2Request request) {
        return new AsyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response>(request,
            ApigMeta.listApisUnbindedToAclPolicyV2, hcClient);
    }

    /** 解除授权 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     *
     * @param CancelingAuthorizationV2Request 请求对象
     * @return CompletableFuture<CancelingAuthorizationV2Response> */
    public CompletableFuture<CancelingAuthorizationV2Response> cancelingAuthorizationV2Async(
        CancelingAuthorizationV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.cancelingAuthorizationV2);
    }

    /** 解除授权 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     *
     * @param CancelingAuthorizationV2Request 请求对象
     * @return AsyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> */
    public AsyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> cancelingAuthorizationV2AsyncInvoker(
        CancelingAuthorizationV2Request request) {
        return new AsyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response>(request,
            ApigMeta.cancelingAuthorizationV2, hcClient);
    }

    /** 校验APP 校验app是否存在，非APP所有者可以调用该接口校验APP是否真实存在。这个接口只展示app的基本信息id 、name、 remark，其他信息不显示。
     *
     * @param CheckAppV2Request 请求对象
     * @return CompletableFuture<CheckAppV2Response> */
    public CompletableFuture<CheckAppV2Response> checkAppV2Async(CheckAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.checkAppV2);
    }

    /** 校验APP 校验app是否存在，非APP所有者可以调用该接口校验APP是否真实存在。这个接口只展示app的基本信息id 、name、 remark，其他信息不显示。
     *
     * @param CheckAppV2Request 请求对象
     * @return AsyncInvoker<CheckAppV2Request, CheckAppV2Response> */
    public AsyncInvoker<CheckAppV2Request, CheckAppV2Response> checkAppV2AsyncInvoker(CheckAppV2Request request) {
        return new AsyncInvoker<CheckAppV2Request, CheckAppV2Response>(request, ApigMeta.checkAppV2, hcClient);
    }

    /** 创建APP APP即应用，是一个可以访问API的身份标识。将API授权给APP后，APP即可调用API。 创建一个APP。
     *
     * @param CreateAnAppV2Request 请求对象
     * @return CompletableFuture<CreateAnAppV2Response> */
    public CompletableFuture<CreateAnAppV2Response> createAnAppV2Async(CreateAnAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAnAppV2);
    }

    /** 创建APP APP即应用，是一个可以访问API的身份标识。将API授权给APP后，APP即可调用API。 创建一个APP。
     *
     * @param CreateAnAppV2Request 请求对象
     * @return AsyncInvoker<CreateAnAppV2Request, CreateAnAppV2Response> */
    public AsyncInvoker<CreateAnAppV2Request, CreateAnAppV2Response> createAnAppV2AsyncInvoker(
        CreateAnAppV2Request request) {
        return new AsyncInvoker<CreateAnAppV2Request, CreateAnAppV2Response>(request, ApigMeta.createAnAppV2, hcClient);
    }

    /** 自动生成APP Code 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     *
     * @param CreateAppCodeAutoV2Request 请求对象
     * @return CompletableFuture<CreateAppCodeAutoV2Response> */
    public CompletableFuture<CreateAppCodeAutoV2Response> createAppCodeAutoV2Async(CreateAppCodeAutoV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAppCodeAutoV2);
    }

    /** 自动生成APP Code 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     *
     * @param CreateAppCodeAutoV2Request 请求对象
     * @return AsyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> */
    public AsyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> createAppCodeAutoV2AsyncInvoker(
        CreateAppCodeAutoV2Request request) {
        return new AsyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response>(request,
            ApigMeta.createAppCodeAutoV2, hcClient);
    }

    /** 创建APP Code App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param CreateAppCodeV2Request 请求对象
     * @return CompletableFuture<CreateAppCodeV2Response> */
    public CompletableFuture<CreateAppCodeV2Response> createAppCodeV2Async(CreateAppCodeV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAppCodeV2);
    }

    /** 创建APP Code App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param CreateAppCodeV2Request 请求对象
     * @return AsyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response> */
    public AsyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response> createAppCodeV2AsyncInvoker(
        CreateAppCodeV2Request request) {
        return new AsyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response>(request, ApigMeta.createAppCodeV2,
            hcClient);
    }

    /** APP授权 APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。
     *
     * @param CreateAuthorizingAppsV2Request 请求对象
     * @return CompletableFuture<CreateAuthorizingAppsV2Response> */
    public CompletableFuture<CreateAuthorizingAppsV2Response> createAuthorizingAppsV2Async(
        CreateAuthorizingAppsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAuthorizingAppsV2);
    }

    /** APP授权 APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。
     *
     * @param CreateAuthorizingAppsV2Request 请求对象
     * @return AsyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> */
    public AsyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> createAuthorizingAppsV2AsyncInvoker(
        CreateAuthorizingAppsV2Request request) {
        return new AsyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response>(request,
            ApigMeta.createAuthorizingAppsV2, hcClient);
    }

    /** 删除APP Code 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     *
     * @param DeleteAppCodeV2Request 请求对象
     * @return CompletableFuture<DeleteAppCodeV2Response> */
    public CompletableFuture<DeleteAppCodeV2Response> deleteAppCodeV2Async(DeleteAppCodeV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteAppCodeV2);
    }

    /** 删除APP Code 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     *
     * @param DeleteAppCodeV2Request 请求对象
     * @return AsyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response> */
    public AsyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response> deleteAppCodeV2AsyncInvoker(
        DeleteAppCodeV2Request request) {
        return new AsyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response>(request, ApigMeta.deleteAppCodeV2,
            hcClient);
    }

    /** 删除APP 删除指定的APP。 APP删除后，将无法再调用任何API；其中，云市场自动创建的APP无法被删除。
     *
     * @param DeleteAppV2Request 请求对象
     * @return CompletableFuture<DeleteAppV2Response> */
    public CompletableFuture<DeleteAppV2Response> deleteAppV2Async(DeleteAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteAppV2);
    }

    /** 删除APP 删除指定的APP。 APP删除后，将无法再调用任何API；其中，云市场自动创建的APP无法被删除。
     *
     * @param DeleteAppV2Request 请求对象
     * @return AsyncInvoker<DeleteAppV2Request, DeleteAppV2Response> */
    public AsyncInvoker<DeleteAppV2Request, DeleteAppV2Response> deleteAppV2AsyncInvoker(DeleteAppV2Request request) {
        return new AsyncInvoker<DeleteAppV2Request, DeleteAppV2Response>(request, ApigMeta.deleteAppV2, hcClient);
    }

    /** 查看APP已绑定的API列表 查询APP已经绑定的API列表。
     *
     * @param ListApisBindedToAppV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToAppV2Response> */
    public CompletableFuture<ListApisBindedToAppV2Response> listApisBindedToAppV2Async(
        ListApisBindedToAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisBindedToAppV2);
    }

    /** 查看APP已绑定的API列表 查询APP已经绑定的API列表。
     *
     * @param ListApisBindedToAppV2Request 请求对象
     * @return AsyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> */
    public AsyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> listApisBindedToAppV2AsyncInvoker(
        ListApisBindedToAppV2Request request) {
        return new AsyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response>(request,
            ApigMeta.listApisBindedToAppV2, hcClient);
    }

    /** 查看APP未绑定的API列表 查询指定环境上某个APP未绑定的API列表，包括自有API和从云市场购买的API。
     *
     * @param ListApisUnbindedToAppV2Request 请求对象
     * @return CompletableFuture<ListApisUnbindedToAppV2Response> */
    public CompletableFuture<ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2Async(
        ListApisUnbindedToAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisUnbindedToAppV2);
    }

    /** 查看APP未绑定的API列表 查询指定环境上某个APP未绑定的API列表，包括自有API和从云市场购买的API。
     *
     * @param ListApisUnbindedToAppV2Request 请求对象
     * @return AsyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> */
    public AsyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2AsyncInvoker(
        ListApisUnbindedToAppV2Request request) {
        return new AsyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response>(request,
            ApigMeta.listApisUnbindedToAppV2, hcClient);
    }

    /** 查询APP Code列表 查询App Code列表。
     *
     * @param ListAppCodesV2Request 请求对象
     * @return CompletableFuture<ListAppCodesV2Response> */
    public CompletableFuture<ListAppCodesV2Response> listAppCodesV2Async(ListAppCodesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppCodesV2);
    }

    /** 查询APP Code列表 查询App Code列表。
     *
     * @param ListAppCodesV2Request 请求对象
     * @return AsyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response> */
    public AsyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response> listAppCodesV2AsyncInvoker(
        ListAppCodesV2Request request) {
        return new AsyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response>(request, ApigMeta.listAppCodesV2,
            hcClient);
    }

    /** 查看API已绑定的APP列表 查询API绑定的APP列表。
     *
     * @param ListAppsBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListAppsBindedToApiV2Response> */
    public CompletableFuture<ListAppsBindedToApiV2Response> listAppsBindedToApiV2Async(
        ListAppsBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppsBindedToApiV2);
    }

    /** 查看API已绑定的APP列表 查询API绑定的APP列表。
     *
     * @param ListAppsBindedToApiV2Request 请求对象
     * @return AsyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> */
    public AsyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> listAppsBindedToApiV2AsyncInvoker(
        ListAppsBindedToApiV2Request request) {
        return new AsyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response>(request,
            ApigMeta.listAppsBindedToApiV2, hcClient);
    }

    /** 查询APP列表 查询APP列表。
     *
     * @param ListAppsV2Request 请求对象
     * @return CompletableFuture<ListAppsV2Response> */
    public CompletableFuture<ListAppsV2Response> listAppsV2Async(ListAppsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppsV2);
    }

    /** 查询APP列表 查询APP列表。
     *
     * @param ListAppsV2Request 请求对象
     * @return AsyncInvoker<ListAppsV2Request, ListAppsV2Response> */
    public AsyncInvoker<ListAppsV2Request, ListAppsV2Response> listAppsV2AsyncInvoker(ListAppsV2Request request) {
        return new AsyncInvoker<ListAppsV2Request, ListAppsV2Response>(request, ApigMeta.listAppsV2, hcClient);
    }

    /** 重置密钥 重置指定APP的密钥。
     *
     * @param ResettingAppSecretV2Request 请求对象
     * @return CompletableFuture<ResettingAppSecretV2Response> */
    public CompletableFuture<ResettingAppSecretV2Response> resettingAppSecretV2Async(
        ResettingAppSecretV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.resettingAppSecretV2);
    }

    /** 重置密钥 重置指定APP的密钥。
     *
     * @param ResettingAppSecretV2Request 请求对象
     * @return AsyncInvoker<ResettingAppSecretV2Request, ResettingAppSecretV2Response> */
    public AsyncInvoker<ResettingAppSecretV2Request, ResettingAppSecretV2Response> resettingAppSecretV2AsyncInvoker(
        ResettingAppSecretV2Request request) {
        return new AsyncInvoker<ResettingAppSecretV2Request, ResettingAppSecretV2Response>(request,
            ApigMeta.resettingAppSecretV2, hcClient);
    }

    /** 查看APP Code详情 App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param ShowDetailsOfAppCodeV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAppCodeV2Response> */
    public CompletableFuture<ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2Async(
        ShowDetailsOfAppCodeV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfAppCodeV2);
    }

    /** 查看APP Code详情 App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param ShowDetailsOfAppCodeV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> */
    public AsyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2AsyncInvoker(
        ShowDetailsOfAppCodeV2Request request) {
        return new AsyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response>(request,
            ApigMeta.showDetailsOfAppCodeV2, hcClient);
    }

    /** 查看APP详情 查看指定APP的详细信息。
     *
     * @param ShowDetailsOfAppV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAppV2Response> */
    public CompletableFuture<ShowDetailsOfAppV2Response> showDetailsOfAppV2Async(ShowDetailsOfAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfAppV2);
    }

    /** 查看APP详情 查看指定APP的详细信息。
     *
     * @param ShowDetailsOfAppV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> */
    public AsyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> showDetailsOfAppV2AsyncInvoker(
        ShowDetailsOfAppV2Request request) {
        return new AsyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response>(request,
            ApigMeta.showDetailsOfAppV2, hcClient);
    }

    /** 修改APP 修改指定APP的信息。其中可修改的属性为：name、remark，当支持用户自定义key和secret的开关开启时，app_key和app_secret也支持修改，其它属性不可修改。
     *
     * @param UpdateAppV2Request 请求对象
     * @return CompletableFuture<UpdateAppV2Response> */
    public CompletableFuture<UpdateAppV2Response> updateAppV2Async(UpdateAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateAppV2);
    }

    /** 修改APP 修改指定APP的信息。其中可修改的属性为：name、remark，当支持用户自定义key和secret的开关开启时，app_key和app_secret也支持修改，其它属性不可修改。
     *
     * @param UpdateAppV2Request 请求对象
     * @return AsyncInvoker<UpdateAppV2Request, UpdateAppV2Response> */
    public AsyncInvoker<UpdateAppV2Request, UpdateAppV2Response> updateAppV2AsyncInvoker(UpdateAppV2Request request) {
        return new AsyncInvoker<UpdateAppV2Request, UpdateAppV2Response>(request, ApigMeta.updateAppV2, hcClient);
    }

    /** 导出API 导出分组下API的定义信息。导出文件内容符合swagger标准规范，API网关自定义扩展字段请参考《API网关开发指南》的“导入导出API：扩展定义”章节。
     *
     * @param ExportApiDefinitionsV2Request 请求对象
     * @return CompletableFuture<ExportApiDefinitionsV2Response> */
    public CompletableFuture<ExportApiDefinitionsV2Response> exportApiDefinitionsV2Async(
        ExportApiDefinitionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.exportApiDefinitionsV2);
    }

    /** 导出API 导出分组下API的定义信息。导出文件内容符合swagger标准规范，API网关自定义扩展字段请参考《API网关开发指南》的“导入导出API：扩展定义”章节。
     *
     * @param ExportApiDefinitionsV2Request 请求对象
     * @return AsyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> */
    public AsyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> exportApiDefinitionsV2AsyncInvoker(
        ExportApiDefinitionsV2Request request) {
        return new AsyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response>(request,
            ApigMeta.exportApiDefinitionsV2, hcClient);
    }

    /** 导入API 导入API。导入文件内容需要符合swagger标准规范，API网关自定义扩展字段请参考《API网关开发指南》的“导入导出API：扩展定义”章节。
     *
     * @param ImportApiDefinitionsV2Request 请求对象
     * @return CompletableFuture<ImportApiDefinitionsV2Response> */
    public CompletableFuture<ImportApiDefinitionsV2Response> importApiDefinitionsV2Async(
        ImportApiDefinitionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.importApiDefinitionsV2);
    }

    /** 导入API 导入API。导入文件内容需要符合swagger标准规范，API网关自定义扩展字段请参考《API网关开发指南》的“导入导出API：扩展定义”章节。
     *
     * @param ImportApiDefinitionsV2Request 请求对象
     * @return AsyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> */
    public AsyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> importApiDefinitionsV2AsyncInvoker(
        ImportApiDefinitionsV2Request request) {
        return new AsyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response>(request,
            ApigMeta.importApiDefinitionsV2, hcClient);
    }

    /** 添加后端实例 为指定的VPC通道添加弹性云服务器
     *
     * @param AddingBackendInstancesV2Request 请求对象
     * @return CompletableFuture<AddingBackendInstancesV2Response> */
    public CompletableFuture<AddingBackendInstancesV2Response> addingBackendInstancesV2Async(
        AddingBackendInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.addingBackendInstancesV2);
    }

    /** 添加后端实例 为指定的VPC通道添加弹性云服务器
     *
     * @param AddingBackendInstancesV2Request 请求对象
     * @return AsyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> */
    public AsyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> addingBackendInstancesV2AsyncInvoker(
        AddingBackendInstancesV2Request request) {
        return new AsyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response>(request,
            ApigMeta.addingBackendInstancesV2, hcClient);
    }

    /** 创建VPC通道 在API网关中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便API网关直接访问私有VPC资源。 &gt; 每个用户最多创建30个VPC通道。
     *
     * @param CreateVpcChannelV2Request 请求对象
     * @return CompletableFuture<CreateVpcChannelV2Response> */
    public CompletableFuture<CreateVpcChannelV2Response> createVpcChannelV2Async(CreateVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createVpcChannelV2);
    }

    /** 创建VPC通道 在API网关中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便API网关直接访问私有VPC资源。 &gt; 每个用户最多创建30个VPC通道。
     *
     * @param CreateVpcChannelV2Request 请求对象
     * @return AsyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response> */
    public AsyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response> createVpcChannelV2AsyncInvoker(
        CreateVpcChannelV2Request request) {
        return new AsyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response>(request,
            ApigMeta.createVpcChannelV2, hcClient);
    }

    /** 删除后端实例 删除指定VPC通道中的弹性云服务器
     *
     * @param DeleteBackendInstanceV2Request 请求对象
     * @return CompletableFuture<DeleteBackendInstanceV2Response> */
    public CompletableFuture<DeleteBackendInstanceV2Response> deleteBackendInstanceV2Async(
        DeleteBackendInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteBackendInstanceV2);
    }

    /** 删除后端实例 删除指定VPC通道中的弹性云服务器
     *
     * @param DeleteBackendInstanceV2Request 请求对象
     * @return AsyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> */
    public AsyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> deleteBackendInstanceV2AsyncInvoker(
        DeleteBackendInstanceV2Request request) {
        return new AsyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response>(request,
            ApigMeta.deleteBackendInstanceV2, hcClient);
    }

    /** 删除VPC通道 删除指定的VPC通道
     *
     * @param DeleteVpcChannelV2Request 请求对象
     * @return CompletableFuture<DeleteVpcChannelV2Response> */
    public CompletableFuture<DeleteVpcChannelV2Response> deleteVpcChannelV2Async(DeleteVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteVpcChannelV2);
    }

    /** 删除VPC通道 删除指定的VPC通道
     *
     * @param DeleteVpcChannelV2Request 请求对象
     * @return AsyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> */
    public AsyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> deleteVpcChannelV2AsyncInvoker(
        DeleteVpcChannelV2Request request) {
        return new AsyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response>(request,
            ApigMeta.deleteVpcChannelV2, hcClient);
    }

    /** 查看后端实例列表 查看指定VPC通道的弹性云服务器列表。
     *
     * @param ListBackendInstancesV2Request 请求对象
     * @return CompletableFuture<ListBackendInstancesV2Response> */
    public CompletableFuture<ListBackendInstancesV2Response> listBackendInstancesV2Async(
        ListBackendInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listBackendInstancesV2);
    }

    /** 查看后端实例列表 查看指定VPC通道的弹性云服务器列表。
     *
     * @param ListBackendInstancesV2Request 请求对象
     * @return AsyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response> */
    public AsyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response> listBackendInstancesV2AsyncInvoker(
        ListBackendInstancesV2Request request) {
        return new AsyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response>(request,
            ApigMeta.listBackendInstancesV2, hcClient);
    }

    /** 查询VPC通道列表 查看VPC通道列表
     *
     * @param ListVpcChannelsV2Request 请求对象
     * @return CompletableFuture<ListVpcChannelsV2Response> */
    public CompletableFuture<ListVpcChannelsV2Response> listVpcChannelsV2Async(ListVpcChannelsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listVpcChannelsV2);
    }

    /** 查询VPC通道列表 查看VPC通道列表
     *
     * @param ListVpcChannelsV2Request 请求对象
     * @return AsyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response> */
    public AsyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response> listVpcChannelsV2AsyncInvoker(
        ListVpcChannelsV2Request request) {
        return new AsyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response>(request,
            ApigMeta.listVpcChannelsV2, hcClient);
    }

    /** 查看VPC通道详情 查看指定的VPC通道详情
     *
     * @param ShowDetailsOfVpcChannelV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfVpcChannelV2Response> */
    public CompletableFuture<ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2Async(
        ShowDetailsOfVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfVpcChannelV2);
    }

    /** 查看VPC通道详情 查看指定的VPC通道详情
     *
     * @param ShowDetailsOfVpcChannelV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> */
    public AsyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2AsyncInvoker(
        ShowDetailsOfVpcChannelV2Request request) {
        return new AsyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response>(request,
            ApigMeta.showDetailsOfVpcChannelV2, hcClient);
    }

    /** 更新VPC通道 更新指定VPC通道的参数
     *
     * @param UpdateVpcChannelV2Request 请求对象
     * @return CompletableFuture<UpdateVpcChannelV2Response> */
    public CompletableFuture<UpdateVpcChannelV2Response> updateVpcChannelV2Async(UpdateVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateVpcChannelV2);
    }

    /** 更新VPC通道 更新指定VPC通道的参数
     *
     * @param UpdateVpcChannelV2Request 请求对象
     * @return AsyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> */
    public AsyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> updateVpcChannelV2AsyncInvoker(
        UpdateVpcChannelV2Request request) {
        return new AsyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response>(request,
            ApigMeta.updateVpcChannelV2, hcClient);
    }

}
