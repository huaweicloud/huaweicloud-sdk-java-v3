package com.huaweicloud.sdk.apig.v2;

import com.huaweicloud.sdk.apig.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class ApigClient {

    protected HcClient hcClient;

    public ApigClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ApigClient> newBuilder() {
        return new ClientBuilder<>(ApigClient::new);
    }

    /** 实例更新或绑定EIP 实例更新或绑定EIP
     *
     * @param AddEipV2Request 请求对象
     * @return AddEipV2Response */
    public AddEipV2Response addEipV2(AddEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.addEipV2);
    }

    /** 实例更新或绑定EIP 实例更新或绑定EIP
     *
     * @param AddEipV2Request 请求对象
     * @return SyncInvoker<AddEipV2Request, AddEipV2Response> */
    public SyncInvoker<AddEipV2Request, AddEipV2Response> addEipV2Invoker(AddEipV2Request request) {
        return new SyncInvoker<AddEipV2Request, AddEipV2Response>(request, ApigMeta.addEipV2, hcClient);
    }

    /** 开启实例公网出口 实例开启公网出口
     *
     * @param AddEngressEipV2Request 请求对象
     * @return AddEngressEipV2Response */
    public AddEngressEipV2Response addEngressEipV2(AddEngressEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.addEngressEipV2);
    }

    /** 开启实例公网出口 实例开启公网出口
     *
     * @param AddEngressEipV2Request 请求对象
     * @return SyncInvoker<AddEngressEipV2Request, AddEngressEipV2Response> */
    public SyncInvoker<AddEngressEipV2Request, AddEngressEipV2Response> addEngressEipV2Invoker(
        AddEngressEipV2Request request) {
        return new SyncInvoker<AddEngressEipV2Request, AddEngressEipV2Response>(request, ApigMeta.addEngressEipV2,
            hcClient);
    }

    /** 绑定域名证书 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。 本章节主要介绍为特定域名绑定证书。
     *
     * @param AssociateCertificateV2Request 请求对象
     * @return AssociateCertificateV2Response */
    public AssociateCertificateV2Response associateCertificateV2(AssociateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateCertificateV2);
    }

    /** 绑定域名证书 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。 本章节主要介绍为特定域名绑定证书。
     *
     * @param AssociateCertificateV2Request 请求对象
     * @return SyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response> */
    public SyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response> associateCertificateV2Invoker(
        AssociateCertificateV2Request request) {
        return new SyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response>(request,
            ApigMeta.associateCertificateV2, hcClient);
    }

    /** 绑定域名 用户自定义的域名，需要CNAME到API分组的子域名上才能生效，具体方法请参见《云解析服务用户指南》的“添加CANME类型记录集”章节。
     * 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     *
     * @param AssociateDomainV2Request 请求对象
     * @return AssociateDomainV2Response */
    public AssociateDomainV2Response associateDomainV2(AssociateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateDomainV2);
    }

    /** 绑定域名 用户自定义的域名，需要CNAME到API分组的子域名上才能生效，具体方法请参见《云解析服务用户指南》的“添加CANME类型记录集”章节。
     * 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     *
     * @param AssociateDomainV2Request 请求对象
     * @return SyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response> */
    public SyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response> associateDomainV2Invoker(
        AssociateDomainV2Request request) {
        return new SyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response>(request, ApigMeta.associateDomainV2,
            hcClient);
    }

    /** 绑定签名密钥 签名密钥创建后，需要绑定到API才能生效。 将签名密钥绑定到API后，则API网关请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。
     * 将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     *
     * @param AssociateSignatureKeyV2Request 请求对象
     * @return AssociateSignatureKeyV2Response */
    public AssociateSignatureKeyV2Response associateSignatureKeyV2(AssociateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateSignatureKeyV2);
    }

    /** 绑定签名密钥 签名密钥创建后，需要绑定到API才能生效。 将签名密钥绑定到API后，则API网关请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。
     * 将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     *
     * @param AssociateSignatureKeyV2Request 请求对象
     * @return SyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> */
    public SyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> associateSignatureKeyV2Invoker(
        AssociateSignatureKeyV2Request request) {
        return new SyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response>(request,
            ApigMeta.associateSignatureKeyV2, hcClient);
    }

    /** 创建自定义认证 创建自定义认证
     *
     * @param CreateCustomAuthorizerV2Request 请求对象
     * @return CreateCustomAuthorizerV2Response */
    public CreateCustomAuthorizerV2Response createCustomAuthorizerV2(CreateCustomAuthorizerV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createCustomAuthorizerV2);
    }

    /** 创建自定义认证 创建自定义认证
     *
     * @param CreateCustomAuthorizerV2Request 请求对象
     * @return SyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> */
    public SyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> createCustomAuthorizerV2Invoker(
        CreateCustomAuthorizerV2Request request) {
        return new SyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response>(request,
            ApigMeta.createCustomAuthorizerV2, hcClient);
    }

    /** 创建环境 在实际的生产中，API提供者可能有多个环境，如开发环境、测试环境、生产环境等，用户可以自由将API发布到某个环境，供调用者调用。
     * 对于不同的环境，API的版本、请求地址甚至于包括请求消息等均有可能不同。如：某个API，v1.0的版本为稳定版本，发布到了生产环境供生产使用，同时，该API正处于迭代中，v1.1的版本是开发人员交付测试人员进行测试的版本，发布在测试环境上，而v1.2的版本目前开发团队正处于开发过程中，可以发布到开发环境进行自测等。
     * 为此，API网关提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接入API网关。
     *
     * @param CreateEnvironmentV2Request 请求对象
     * @return CreateEnvironmentV2Response */
    public CreateEnvironmentV2Response createEnvironmentV2(CreateEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createEnvironmentV2);
    }

    /** 创建环境 在实际的生产中，API提供者可能有多个环境，如开发环境、测试环境、生产环境等，用户可以自由将API发布到某个环境，供调用者调用。
     * 对于不同的环境，API的版本、请求地址甚至于包括请求消息等均有可能不同。如：某个API，v1.0的版本为稳定版本，发布到了生产环境供生产使用，同时，该API正处于迭代中，v1.1的版本是开发人员交付测试人员进行测试的版本，发布在测试环境上，而v1.2的版本目前开发团队正处于开发过程中，可以发布到开发环境进行自测等。
     * 为此，API网关提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接入API网关。
     *
     * @param CreateEnvironmentV2Request 请求对象
     * @return SyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response> */
    public SyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response> createEnvironmentV2Invoker(
        CreateEnvironmentV2Request request) {
        return new SyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response>(request,
            ApigMeta.createEnvironmentV2, hcClient);
    }

    /** 新建变量 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。
     * 用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，API网关会将这些变量替换成真实的变量值，以达到不同环境的区分效果。
     * 环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。 &gt; 1.环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量 2.环境变量区分大小写，即变量ABC与变量abc是两个不同的变量
     * 3.设置了环境变量后，使用到该变量的API的调试功能将不可使用。
     * 4.定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     *
     * @param CreateEnvironmentVariableV2Request 请求对象
     * @return CreateEnvironmentVariableV2Response */
    public CreateEnvironmentVariableV2Response createEnvironmentVariableV2(CreateEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createEnvironmentVariableV2);
    }

    /** 新建变量 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。
     * 用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，API网关会将这些变量替换成真实的变量值，以达到不同环境的区分效果。
     * 环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。 &gt; 1.环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量 2.环境变量区分大小写，即变量ABC与变量abc是两个不同的变量
     * 3.设置了环境变量后，使用到该变量的API的调试功能将不可使用。
     * 4.定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     *
     * @param CreateEnvironmentVariableV2Request 请求对象
     * @return SyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> */
    public SyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> createEnvironmentVariableV2Invoker(
        CreateEnvironmentVariableV2Request request) {
        return new SyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response>(request,
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
     * @return CreateFeatureV2Response */
    public CreateFeatureV2Response createFeatureV2(CreateFeatureV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createFeatureV2);
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
     * @return SyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response> */
    public SyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response> createFeatureV2Invoker(
        CreateFeatureV2Request request) {
        return new SyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response>(request, ApigMeta.createFeatureV2,
            hcClient);
    }

    /** 创建分组自定义响应 新增分组下自定义响应
     *
     * @param CreateGatewayResponseV2Request 请求对象
     * @return CreateGatewayResponseV2Response */
    public CreateGatewayResponseV2Response createGatewayResponseV2(CreateGatewayResponseV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createGatewayResponseV2);
    }

    /** 创建分组自定义响应 新增分组下自定义响应
     *
     * @param CreateGatewayResponseV2Request 请求对象
     * @return SyncInvoker<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response> */
    public SyncInvoker<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response> createGatewayResponseV2Invoker(
        CreateGatewayResponseV2Request request) {
        return new SyncInvoker<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response>(request,
            ApigMeta.createGatewayResponseV2, hcClient);
    }

    /** 创建专享版实例 创建专享版实例
     *
     * @param CreateInstanceV2Request 请求对象
     * @return CreateInstanceV2Response */
    public CreateInstanceV2Response createInstanceV2(CreateInstanceV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createInstanceV2);
    }

    /** 创建专享版实例 创建专享版实例
     *
     * @param CreateInstanceV2Request 请求对象
     * @return SyncInvoker<CreateInstanceV2Request, CreateInstanceV2Response> */
    public SyncInvoker<CreateInstanceV2Request, CreateInstanceV2Response> createInstanceV2Invoker(
        CreateInstanceV2Request request) {
        return new SyncInvoker<CreateInstanceV2Request, CreateInstanceV2Response>(request, ApigMeta.createInstanceV2,
            hcClient);
    }

    /** 创建流控策略 当API上线后，系统会默认给每个API提供一个流控策略，API提供者可以根据自身API的服务能力及负载情况变更这个流控策略。 流控策略即限制API在一定长度的时间内，能够允许被访问的最大次数。
     *
     * @param CreateRequestThrottlingPolicyV2Request 请求对象
     * @return CreateRequestThrottlingPolicyV2Response */
    public CreateRequestThrottlingPolicyV2Response createRequestThrottlingPolicyV2(
        CreateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createRequestThrottlingPolicyV2);
    }

    /** 创建流控策略 当API上线后，系统会默认给每个API提供一个流控策略，API提供者可以根据自身API的服务能力及负载情况变更这个流控策略。 流控策略即限制API在一定长度的时间内，能够允许被访问的最大次数。
     *
     * @param CreateRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> */
    public SyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2Invoker(
        CreateRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response>(request,
            ApigMeta.createRequestThrottlingPolicyV2, hcClient);
    }

    /** 创建签名密钥 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。 其中，签名密钥就是API安全保护机制的一种。
     * 租户创建一个签名密钥，并将签名密钥与API进行绑定，则API网关在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是API网关发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。
     *
     * @param CreateSignatureKeyV2Request 请求对象
     * @return CreateSignatureKeyV2Response */
    public CreateSignatureKeyV2Response createSignatureKeyV2(CreateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createSignatureKeyV2);
    }

    /** 创建签名密钥 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。 其中，签名密钥就是API安全保护机制的一种。
     * 租户创建一个签名密钥，并将签名密钥与API进行绑定，则API网关在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是API网关发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。
     *
     * @param CreateSignatureKeyV2Request 请求对象
     * @return SyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> */
    public SyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> createSignatureKeyV2Invoker(
        CreateSignatureKeyV2Request request) {
        return new SyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response>(request,
            ApigMeta.createSignatureKeyV2, hcClient);
    }

    /** 创建特殊设置 流控策略可以限制一段时间内可以访问API的最大次数，也可以限制一段时间内单个租户和单个APP可以访问API的最大次数。
     * 如果想要对某个特定的APP进行特殊设置，例如设置所有APP每分钟的访问次数为500次，但想设置APP1每分钟的访问次数为800次，可以通过在流控策略中设置特殊APP来实现该功能。
     * 为流控策略添加一个特殊设置的对象，可以是APP，也可以是租户。
     *
     * @param CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return CreateSpecialThrottlingConfigurationV2Response */
    public CreateSpecialThrottlingConfigurationV2Response createSpecialThrottlingConfigurationV2(
        CreateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createSpecialThrottlingConfigurationV2);
    }

    /** 创建特殊设置 流控策略可以限制一段时间内可以访问API的最大次数，也可以限制一段时间内单个租户和单个APP可以访问API的最大次数。
     * 如果想要对某个特定的APP进行特殊设置，例如设置所有APP每分钟的访问次数为500次，但想设置APP1每分钟的访问次数为800次，可以通过在流控策略中设置特殊APP来实现该功能。
     * 为流控策略添加一个特殊设置的对象，可以是APP，也可以是租户。
     *
     * @param CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return SyncInvoker<CreateSpecialThrottlingConfigurationV2Request,
     *         CreateSpecialThrottlingConfigurationV2Response> */
    public SyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2Invoker(
        CreateSpecialThrottlingConfigurationV2Request request) {
        return new SyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response>(
            request, ApigMeta.createSpecialThrottlingConfigurationV2, hcClient);
    }

    /** 删除自定义认证 删除自定义认证
     *
     * @param DeleteCustomAuthorizerV2Request 请求对象
     * @return DeleteCustomAuthorizerV2Response */
    public DeleteCustomAuthorizerV2Response deleteCustomAuthorizerV2(DeleteCustomAuthorizerV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteCustomAuthorizerV2);
    }

    /** 删除自定义认证 删除自定义认证
     *
     * @param DeleteCustomAuthorizerV2Request 请求对象
     * @return SyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> */
    public SyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2Invoker(
        DeleteCustomAuthorizerV2Request request) {
        return new SyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response>(request,
            ApigMeta.deleteCustomAuthorizerV2, hcClient);
    }

    /** 删除环境 删除指定的环境。 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。 环境上存在已发布的API时，该环境不能被删除。
     *
     * @param DeleteEnvironmentV2Request 请求对象
     * @return DeleteEnvironmentV2Response */
    public DeleteEnvironmentV2Response deleteEnvironmentV2(DeleteEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteEnvironmentV2);
    }

    /** 删除环境 删除指定的环境。 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。 环境上存在已发布的API时，该环境不能被删除。
     *
     * @param DeleteEnvironmentV2Request 请求对象
     * @return SyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> */
    public SyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> deleteEnvironmentV2Invoker(
        DeleteEnvironmentV2Request request) {
        return new SyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response>(request,
            ApigMeta.deleteEnvironmentV2, hcClient);
    }

    /** 删除变量 删除指定的环境变量。
     *
     * @param DeleteEnvironmentVariableV2Request 请求对象
     * @return DeleteEnvironmentVariableV2Response */
    public DeleteEnvironmentVariableV2Response deleteEnvironmentVariableV2(DeleteEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteEnvironmentVariableV2);
    }

    /** 删除变量 删除指定的环境变量。
     *
     * @param DeleteEnvironmentVariableV2Request 请求对象
     * @return SyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> */
    public SyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2Invoker(
        DeleteEnvironmentVariableV2Request request) {
        return new SyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response>(request,
            ApigMeta.deleteEnvironmentVariableV2, hcClient);
    }

    /** 删除分组指定错误类型的自定义响应配置 删除分组指定错误类型的自定义响应配置，还原为使用默认值的配置。
     *
     * @param DeleteGatewayResponseTypeV2Request 请求对象
     * @return DeleteGatewayResponseTypeV2Response */
    public DeleteGatewayResponseTypeV2Response deleteGatewayResponseTypeV2(DeleteGatewayResponseTypeV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteGatewayResponseTypeV2);
    }

    /** 删除分组指定错误类型的自定义响应配置 删除分组指定错误类型的自定义响应配置，还原为使用默认值的配置。
     *
     * @param DeleteGatewayResponseTypeV2Request 请求对象
     * @return SyncInvoker<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response> */
    public SyncInvoker<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response> deleteGatewayResponseTypeV2Invoker(
        DeleteGatewayResponseTypeV2Request request) {
        return new SyncInvoker<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response>(request,
            ApigMeta.deleteGatewayResponseTypeV2, hcClient);
    }

    /** 删除分组自定义响应 删除分组自定义响应
     *
     * @param DeleteGatewayResponseV2Request 请求对象
     * @return DeleteGatewayResponseV2Response */
    public DeleteGatewayResponseV2Response deleteGatewayResponseV2(DeleteGatewayResponseV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteGatewayResponseV2);
    }

    /** 删除分组自定义响应 删除分组自定义响应
     *
     * @param DeleteGatewayResponseV2Request 请求对象
     * @return SyncInvoker<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response> */
    public SyncInvoker<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response> deleteGatewayResponseV2Invoker(
        DeleteGatewayResponseV2Request request) {
        return new SyncInvoker<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response>(request,
            ApigMeta.deleteGatewayResponseV2, hcClient);
    }

    /** 删除专享版实例 删除专享版实例
     *
     * @param DeleteInstancesV2Request 请求对象
     * @return DeleteInstancesV2Response */
    public DeleteInstancesV2Response deleteInstancesV2(DeleteInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteInstancesV2);
    }

    /** 删除专享版实例 删除专享版实例
     *
     * @param DeleteInstancesV2Request 请求对象
     * @return SyncInvoker<DeleteInstancesV2Request, DeleteInstancesV2Response> */
    public SyncInvoker<DeleteInstancesV2Request, DeleteInstancesV2Response> deleteInstancesV2Invoker(
        DeleteInstancesV2Request request) {
        return new SyncInvoker<DeleteInstancesV2Request, DeleteInstancesV2Response>(request, ApigMeta.deleteInstancesV2,
            hcClient);
    }

    /** 删除流控策略 删除指定的流控策略,以及该流控策略与API的所有绑定关系。
     *
     * @param DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return DeleteRequestThrottlingPolicyV2Response */
    public DeleteRequestThrottlingPolicyV2Response deleteRequestThrottlingPolicyV2(
        DeleteRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteRequestThrottlingPolicyV2);
    }

    /** 删除流控策略 删除指定的流控策略,以及该流控策略与API的所有绑定关系。
     *
     * @param DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> */
    public SyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2Invoker(
        DeleteRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response>(request,
            ApigMeta.deleteRequestThrottlingPolicyV2, hcClient);
    }

    /** 删除签名密钥 删除指定的签名密钥,删除签名密钥时，其配置的绑定关系会一并删除，相应的签名密钥会失效。
     *
     * @param DeleteSignatureKeyV2Request 请求对象
     * @return DeleteSignatureKeyV2Response */
    public DeleteSignatureKeyV2Response deleteSignatureKeyV2(DeleteSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteSignatureKeyV2);
    }

    /** 删除签名密钥 删除指定的签名密钥,删除签名密钥时，其配置的绑定关系会一并删除，相应的签名密钥会失效。
     *
     * @param DeleteSignatureKeyV2Request 请求对象
     * @return SyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> */
    public SyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> deleteSignatureKeyV2Invoker(
        DeleteSignatureKeyV2Request request) {
        return new SyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response>(request,
            ApigMeta.deleteSignatureKeyV2, hcClient);
    }

    /** 删除特殊设置 删除某个流控策略的某个特殊配置。
     *
     * @param DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return DeleteSpecialThrottlingConfigurationV2Response */
    public DeleteSpecialThrottlingConfigurationV2Response deleteSpecialThrottlingConfigurationV2(
        DeleteSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteSpecialThrottlingConfigurationV2);
    }

    /** 删除特殊设置 删除某个流控策略的某个特殊配置。
     *
     * @param DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return SyncInvoker<DeleteSpecialThrottlingConfigurationV2Request,
     *         DeleteSpecialThrottlingConfigurationV2Response> */
    public SyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2Invoker(
        DeleteSpecialThrottlingConfigurationV2Request request) {
        return new SyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response>(
            request, ApigMeta.deleteSpecialThrottlingConfigurationV2, hcClient);
    }

    /** 删除域名证书 如果域名证书不再需要或者已过期，则可以删除证书内容。
     *
     * @param DisassociateCertificateV2Request 请求对象
     * @return DisassociateCertificateV2Response */
    public DisassociateCertificateV2Response disassociateCertificateV2(DisassociateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateCertificateV2);
    }

    /** 删除域名证书 如果域名证书不再需要或者已过期，则可以删除证书内容。
     *
     * @param DisassociateCertificateV2Request 请求对象
     * @return SyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response> */
    public SyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response> disassociateCertificateV2Invoker(
        DisassociateCertificateV2Request request) {
        return new SyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response>(request,
            ApigMeta.disassociateCertificateV2, hcClient);
    }

    /** 解绑域名 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     *
     * @param DisassociateDomainV2Request 请求对象
     * @return DisassociateDomainV2Response */
    public DisassociateDomainV2Response disassociateDomainV2(DisassociateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateDomainV2);
    }

    /** 解绑域名 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     *
     * @param DisassociateDomainV2Request 请求对象
     * @return SyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response> */
    public SyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response> disassociateDomainV2Invoker(
        DisassociateDomainV2Request request) {
        return new SyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response>(request,
            ApigMeta.disassociateDomainV2, hcClient);
    }

    /** 解除绑定 解除API与签名密钥的绑定关系。
     *
     * @param DisassociateSignatureKeyV2Request 请求对象
     * @return DisassociateSignatureKeyV2Response */
    public DisassociateSignatureKeyV2Response disassociateSignatureKeyV2(DisassociateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateSignatureKeyV2);
    }

    /** 解除绑定 解除API与签名密钥的绑定关系。
     *
     * @param DisassociateSignatureKeyV2Request 请求对象
     * @return SyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> */
    public SyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2Invoker(
        DisassociateSignatureKeyV2Request request) {
        return new SyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response>(request,
            ApigMeta.disassociateSignatureKeyV2, hcClient);
    }

    /** 查询API分组概况 查询租户名下的API分组概况。
     *
     * @param ListApiGroupsQuantitiesV2Request 请求对象
     * @return ListApiGroupsQuantitiesV2Response */
    public ListApiGroupsQuantitiesV2Response listApiGroupsQuantitiesV2(ListApiGroupsQuantitiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiGroupsQuantitiesV2);
    }

    /** 查询API分组概况 查询租户名下的API分组概况。
     *
     * @param ListApiGroupsQuantitiesV2Request 请求对象
     * @return SyncInvoker<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> */
    public SyncInvoker<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> listApiGroupsQuantitiesV2Invoker(
        ListApiGroupsQuantitiesV2Request request) {
        return new SyncInvoker<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response>(request,
            ApigMeta.listApiGroupsQuantitiesV2, hcClient);
    }

    /** 查询API概况 查询租户名下的API概况：已发布到RELEASE环境的API个数，未发布到RELEASE环境的API个数。
     *
     * @param ListApiQuantitiesV2Request 请求对象
     * @return ListApiQuantitiesV2Response */
    public ListApiQuantitiesV2Response listApiQuantitiesV2(ListApiQuantitiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiQuantitiesV2);
    }

    /** 查询API概况 查询租户名下的API概况：已发布到RELEASE环境的API个数，未发布到RELEASE环境的API个数。
     *
     * @param ListApiQuantitiesV2Request 请求对象
     * @return SyncInvoker<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> */
    public SyncInvoker<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> listApiQuantitiesV2Invoker(
        ListApiQuantitiesV2Request request) {
        return new SyncInvoker<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response>(request,
            ApigMeta.listApiQuantitiesV2, hcClient);
    }

    /** 查看签名密钥绑定的API列表 查询某个签名密钥上已经绑定的API列表。
     *
     * @param ListApisBindedToSignatureKeyV2Request 请求对象
     * @return ListApisBindedToSignatureKeyV2Response */
    public ListApisBindedToSignatureKeyV2Response listApisBindedToSignatureKeyV2(
        ListApisBindedToSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToSignatureKeyV2);
    }

    /** 查看签名密钥绑定的API列表 查询某个签名密钥上已经绑定的API列表。
     *
     * @param ListApisBindedToSignatureKeyV2Request 请求对象
     * @return SyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> */
    public SyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2Invoker(
        ListApisBindedToSignatureKeyV2Request request) {
        return new SyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response>(request,
            ApigMeta.listApisBindedToSignatureKeyV2, hcClient);
    }

    /** 查看签名密钥未绑定的API列表 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return ListApisNotBoundWithSignatureKeyV2Response */
    public ListApisNotBoundWithSignatureKeyV2Response listApisNotBoundWithSignatureKeyV2(
        ListApisNotBoundWithSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisNotBoundWithSignatureKeyV2);
    }

    /** 查看签名密钥未绑定的API列表 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return SyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> */
    public SyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2Invoker(
        ListApisNotBoundWithSignatureKeyV2Request request) {
        return new SyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response>(
            request, ApigMeta.listApisNotBoundWithSignatureKeyV2, hcClient);
    }

    /** 查询APP概况 查询租户名下的APP概况：已进行API访问授权的APP个数，未进行API访问授权的APP个数。
     *
     * @param ListAppQuantitiesV2Request 请求对象
     * @return ListAppQuantitiesV2Response */
    public ListAppQuantitiesV2Response listAppQuantitiesV2(ListAppQuantitiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppQuantitiesV2);
    }

    /** 查询APP概况 查询租户名下的APP概况：已进行API访问授权的APP个数，未进行API访问授权的APP个数。
     *
     * @param ListAppQuantitiesV2Request 请求对象
     * @return SyncInvoker<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> */
    public SyncInvoker<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> listAppQuantitiesV2Invoker(
        ListAppQuantitiesV2Request request) {
        return new SyncInvoker<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response>(request,
            ApigMeta.listAppQuantitiesV2, hcClient);
    }

    /** 查看可用区信息 查看可用区信息
     *
     * @param ListAvailableZonesV2Request 请求对象
     * @return ListAvailableZonesV2Response */
    public ListAvailableZonesV2Response listAvailableZonesV2(ListAvailableZonesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAvailableZonesV2);
    }

    /** 查看可用区信息 查看可用区信息
     *
     * @param ListAvailableZonesV2Request 请求对象
     * @return SyncInvoker<ListAvailableZonesV2Request, ListAvailableZonesV2Response> */
    public SyncInvoker<ListAvailableZonesV2Request, ListAvailableZonesV2Response> listAvailableZonesV2Invoker(
        ListAvailableZonesV2Request request) {
        return new SyncInvoker<ListAvailableZonesV2Request, ListAvailableZonesV2Response>(request,
            ApigMeta.listAvailableZonesV2, hcClient);
    }

    /** 查询自定义认证列表 查询自定义认证列表
     *
     * @param ListCustomAuthorizersV2Request 请求对象
     * @return ListCustomAuthorizersV2Response */
    public ListCustomAuthorizersV2Response listCustomAuthorizersV2(ListCustomAuthorizersV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listCustomAuthorizersV2);
    }

    /** 查询自定义认证列表 查询自定义认证列表
     *
     * @param ListCustomAuthorizersV2Request 请求对象
     * @return SyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> */
    public SyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> listCustomAuthorizersV2Invoker(
        ListCustomAuthorizersV2Request request) {
        return new SyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response>(request,
            ApigMeta.listCustomAuthorizersV2, hcClient);
    }

    /** 查询变量列表 查询分组下的所有环境变量的列表。
     *
     * @param ListEnvironmentVariablesV2Request 请求对象
     * @return ListEnvironmentVariablesV2Response */
    public ListEnvironmentVariablesV2Response listEnvironmentVariablesV2(ListEnvironmentVariablesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listEnvironmentVariablesV2);
    }

    /** 查询变量列表 查询分组下的所有环境变量的列表。
     *
     * @param ListEnvironmentVariablesV2Request 请求对象
     * @return SyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> */
    public SyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2Invoker(
        ListEnvironmentVariablesV2Request request) {
        return new SyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response>(request,
            ApigMeta.listEnvironmentVariablesV2, hcClient);
    }

    /** 查询环境列表 查询符合条件的环境列表。
     *
     * @param ListEnvironmentsV2Request 请求对象
     * @return ListEnvironmentsV2Response */
    public ListEnvironmentsV2Response listEnvironmentsV2(ListEnvironmentsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listEnvironmentsV2);
    }

    /** 查询环境列表 查询符合条件的环境列表。
     *
     * @param ListEnvironmentsV2Request 请求对象
     * @return SyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response> */
    public SyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response> listEnvironmentsV2Invoker(
        ListEnvironmentsV2Request request) {
        return new SyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response>(request,
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
     * @return ListFeaturesV2Response */
    public ListFeaturesV2Response listFeaturesV2(ListFeaturesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listFeaturesV2);
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
     * @return SyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response> */
    public SyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response> listFeaturesV2Invoker(
        ListFeaturesV2Request request) {
        return new SyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response>(request, ApigMeta.listFeaturesV2,
            hcClient);
    }

    /** 查询分组自定义响应列表 查询分组自定义响应列表
     *
     * @param ListGatewayResponsesV2Request 请求对象
     * @return ListGatewayResponsesV2Response */
    public ListGatewayResponsesV2Response listGatewayResponsesV2(ListGatewayResponsesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listGatewayResponsesV2);
    }

    /** 查询分组自定义响应列表 查询分组自定义响应列表
     *
     * @param ListGatewayResponsesV2Request 请求对象
     * @return SyncInvoker<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response> */
    public SyncInvoker<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response> listGatewayResponsesV2Invoker(
        ListGatewayResponsesV2Request request) {
        return new SyncInvoker<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response>(request,
            ApigMeta.listGatewayResponsesV2, hcClient);
    }

    /** 查询租户实例配置列表 查询租户实例配置列表
     *
     * @param ListInstanceCofigsV2Request 请求对象
     * @return ListInstanceCofigsV2Response */
    public ListInstanceCofigsV2Response listInstanceCofigsV2(ListInstanceCofigsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listInstanceCofigsV2);
    }

    /** 查询租户实例配置列表 查询租户实例配置列表
     *
     * @param ListInstanceCofigsV2Request 请求对象
     * @return SyncInvoker<ListInstanceCofigsV2Request, ListInstanceCofigsV2Response> */
    public SyncInvoker<ListInstanceCofigsV2Request, ListInstanceCofigsV2Response> listInstanceCofigsV2Invoker(
        ListInstanceCofigsV2Request request) {
        return new SyncInvoker<ListInstanceCofigsV2Request, ListInstanceCofigsV2Response>(request,
            ApigMeta.listInstanceCofigsV2, hcClient);
    }

    /** 查询专享版实例列表 查询专享版实例列表
     *
     * @param ListInstancesV2Request 请求对象
     * @return ListInstancesV2Response */
    public ListInstancesV2Response listInstancesV2(ListInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listInstancesV2);
    }

    /** 查询专享版实例列表 查询专享版实例列表
     *
     * @param ListInstancesV2Request 请求对象
     * @return SyncInvoker<ListInstancesV2Request, ListInstancesV2Response> */
    public SyncInvoker<ListInstancesV2Request, ListInstancesV2Response> listInstancesV2Invoker(
        ListInstancesV2Request request) {
        return new SyncInvoker<ListInstancesV2Request, ListInstancesV2Response>(request, ApigMeta.listInstancesV2,
            hcClient);
    }

    /** API统计信息查询-最近一段时间 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。 &gt;
     * 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     *
     * @param ListLatelyApiStatisticsV2Request 请求对象
     * @return ListLatelyApiStatisticsV2Response */
    public ListLatelyApiStatisticsV2Response listLatelyApiStatisticsV2(ListLatelyApiStatisticsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listLatelyApiStatisticsV2);
    }

    /** API统计信息查询-最近一段时间 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。 &gt;
     * 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     *
     * @param ListLatelyApiStatisticsV2Request 请求对象
     * @return SyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> */
    public SyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2Invoker(
        ListLatelyApiStatisticsV2Request request) {
        return new SyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response>(request,
            ApigMeta.listLatelyApiStatisticsV2, hcClient);
    }

    /** 分组统计信息查询-最近一小时内 根据API分组的编号查询该分组下所有API被调用的总次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。 &gt;
     * 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     *
     * @param ListLatelyGroupStatisticsV2Request 请求对象
     * @return ListLatelyGroupStatisticsV2Response */
    public ListLatelyGroupStatisticsV2Response listLatelyGroupStatisticsV2(ListLatelyGroupStatisticsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listLatelyGroupStatisticsV2);
    }

    /** 分组统计信息查询-最近一小时内 根据API分组的编号查询该分组下所有API被调用的总次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。 &gt;
     * 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     *
     * @param ListLatelyGroupStatisticsV2Request 请求对象
     * @return SyncInvoker<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response> */
    public SyncInvoker<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response> listLatelyGroupStatisticsV2Invoker(
        ListLatelyGroupStatisticsV2Request request) {
        return new SyncInvoker<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response>(request,
            ApigMeta.listLatelyGroupStatisticsV2, hcClient);
    }

    /** 查询某个实例的租户配置列表 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     *
     * @param ListProjectCofigsV2Request 请求对象
     * @return ListProjectCofigsV2Response */
    public ListProjectCofigsV2Response listProjectCofigsV2(ListProjectCofigsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listProjectCofigsV2);
    }

    /** 查询某个实例的租户配置列表 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     *
     * @param ListProjectCofigsV2Request 请求对象
     * @return SyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response> */
    public SyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response> listProjectCofigsV2Invoker(
        ListProjectCofigsV2Request request) {
        return new SyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response>(request,
            ApigMeta.listProjectCofigsV2, hcClient);
    }

    /** 查询流控策略列表 查询所有流控策略的信息。
     *
     * @param ListRequestThrottlingPolicyV2Request 请求对象
     * @return ListRequestThrottlingPolicyV2Response */
    public ListRequestThrottlingPolicyV2Response listRequestThrottlingPolicyV2(
        ListRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listRequestThrottlingPolicyV2);
    }

    /** 查询流控策略列表 查询所有流控策略的信息。
     *
     * @param ListRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> */
    public SyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2Invoker(
        ListRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response>(request,
            ApigMeta.listRequestThrottlingPolicyV2, hcClient);
    }

    /** 查看API绑定的签名密钥列表 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     *
     * @param ListSignatureKeysBindedToApiV2Request 请求对象
     * @return ListSignatureKeysBindedToApiV2Response */
    public ListSignatureKeysBindedToApiV2Response listSignatureKeysBindedToApiV2(
        ListSignatureKeysBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listSignatureKeysBindedToApiV2);
    }

    /** 查看API绑定的签名密钥列表 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     *
     * @param ListSignatureKeysBindedToApiV2Request 请求对象
     * @return SyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> */
    public SyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2Invoker(
        ListSignatureKeysBindedToApiV2Request request) {
        return new SyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response>(request,
            ApigMeta.listSignatureKeysBindedToApiV2, hcClient);
    }

    /** 查询签名密钥列表 查询所有签名密钥的信息。
     *
     * @param ListSignatureKeysV2Request 请求对象
     * @return ListSignatureKeysV2Response */
    public ListSignatureKeysV2Response listSignatureKeysV2(ListSignatureKeysV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listSignatureKeysV2);
    }

    /** 查询签名密钥列表 查询所有签名密钥的信息。
     *
     * @param ListSignatureKeysV2Request 请求对象
     * @return SyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response> */
    public SyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response> listSignatureKeysV2Invoker(
        ListSignatureKeysV2Request request) {
        return new SyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response>(request,
            ApigMeta.listSignatureKeysV2, hcClient);
    }

    /** 查看特殊设置列表 查看给流控策略设置的特殊配置。
     *
     * @param ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return ListSpecialThrottlingConfigurationsV2Response */
    public ListSpecialThrottlingConfigurationsV2Response listSpecialThrottlingConfigurationsV2(
        ListSpecialThrottlingConfigurationsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listSpecialThrottlingConfigurationsV2);
    }

    /** 查看特殊设置列表 查看给流控策略设置的特殊配置。
     *
     * @param ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return SyncInvoker<ListSpecialThrottlingConfigurationsV2Request,
     *         ListSpecialThrottlingConfigurationsV2Response> */
    public SyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2Invoker(
        ListSpecialThrottlingConfigurationsV2Request request) {
        return new SyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response>(
            request, ApigMeta.listSpecialThrottlingConfigurationsV2, hcClient);
    }

    /** 查询标签列表 查询标签列表
     *
     * @param ListTagsV2Request 请求对象
     * @return ListTagsV2Response */
    public ListTagsV2Response listTagsV2(ListTagsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listTagsV2);
    }

    /** 查询标签列表 查询标签列表
     *
     * @param ListTagsV2Request 请求对象
     * @return SyncInvoker<ListTagsV2Request, ListTagsV2Response> */
    public SyncInvoker<ListTagsV2Request, ListTagsV2Response> listTagsV2Invoker(ListTagsV2Request request) {
        return new SyncInvoker<ListTagsV2Request, ListTagsV2Response>(request, ApigMeta.listTagsV2, hcClient);
    }

    /** 实例解绑EIP 实例解绑EIP
     *
     * @param RemoveEipV2Request 请求对象
     * @return RemoveEipV2Response */
    public RemoveEipV2Response removeEipV2(RemoveEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.removeEipV2);
    }

    /** 实例解绑EIP 实例解绑EIP
     *
     * @param RemoveEipV2Request 请求对象
     * @return SyncInvoker<RemoveEipV2Request, RemoveEipV2Response> */
    public SyncInvoker<RemoveEipV2Request, RemoveEipV2Response> removeEipV2Invoker(RemoveEipV2Request request) {
        return new SyncInvoker<RemoveEipV2Request, RemoveEipV2Response>(request, ApigMeta.removeEipV2, hcClient);
    }

    /** 关闭实例公网出口 关闭实例公网出口
     *
     * @param RemoveEngressEipV2Request 请求对象
     * @return RemoveEngressEipV2Response */
    public RemoveEngressEipV2Response removeEngressEipV2(RemoveEngressEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.removeEngressEipV2);
    }

    /** 关闭实例公网出口 关闭实例公网出口
     *
     * @param RemoveEngressEipV2Request 请求对象
     * @return SyncInvoker<RemoveEngressEipV2Request, RemoveEngressEipV2Response> */
    public SyncInvoker<RemoveEngressEipV2Request, RemoveEngressEipV2Response> removeEngressEipV2Invoker(
        RemoveEngressEipV2Request request) {
        return new SyncInvoker<RemoveEngressEipV2Request, RemoveEngressEipV2Response>(request,
            ApigMeta.removeEngressEipV2, hcClient);
    }

    /** 查看自定义认证详情 查看自定义认证详情
     *
     * @param ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return ShowDetailsOfCustomAuthorizersV2Response */
    public ShowDetailsOfCustomAuthorizersV2Response showDetailsOfCustomAuthorizersV2(
        ShowDetailsOfCustomAuthorizersV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfCustomAuthorizersV2);
    }

    /** 查看自定义认证详情 查看自定义认证详情
     *
     * @param ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> */
    public SyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2Invoker(
        ShowDetailsOfCustomAuthorizersV2Request request) {
        return new SyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response>(
            request, ApigMeta.showDetailsOfCustomAuthorizersV2, hcClient);
    }

    /** 查看域名证书 查看域名下绑定的证书详情。
     *
     * @param ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return ShowDetailsOfDomainNameCertificateV2Response */
    public ShowDetailsOfDomainNameCertificateV2Response showDetailsOfDomainNameCertificateV2(
        ShowDetailsOfDomainNameCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfDomainNameCertificateV2);
    }

    /** 查看域名证书 查看域名下绑定的证书详情。
     *
     * @param ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> */
    public SyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2Invoker(
        ShowDetailsOfDomainNameCertificateV2Request request) {
        return new SyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response>(
            request, ApigMeta.showDetailsOfDomainNameCertificateV2, hcClient);
    }

    /** 查看变量详情 查看指定的环境变量的详情。
     *
     * @param ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return ShowDetailsOfEnvironmentVariableV2Response */
    public ShowDetailsOfEnvironmentVariableV2Response showDetailsOfEnvironmentVariableV2(
        ShowDetailsOfEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfEnvironmentVariableV2);
    }

    /** 查看变量详情 查看指定的环境变量的详情。
     *
     * @param ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> */
    public SyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2Invoker(
        ShowDetailsOfEnvironmentVariableV2Request request) {
        return new SyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response>(
            request, ApigMeta.showDetailsOfEnvironmentVariableV2, hcClient);
    }

    /** 查看分组下指定错误类型的自定义响应 查看分组下指定错误类型的自定义响应
     *
     * @param ShowDetailsOfGatewayResponseTypeV2Request 请求对象
     * @return ShowDetailsOfGatewayResponseTypeV2Response */
    public ShowDetailsOfGatewayResponseTypeV2Response showDetailsOfGatewayResponseTypeV2(
        ShowDetailsOfGatewayResponseTypeV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfGatewayResponseTypeV2);
    }

    /** 查看分组下指定错误类型的自定义响应 查看分组下指定错误类型的自定义响应
     *
     * @param ShowDetailsOfGatewayResponseTypeV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response> */
    public SyncInvoker<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response> showDetailsOfGatewayResponseTypeV2Invoker(
        ShowDetailsOfGatewayResponseTypeV2Request request) {
        return new SyncInvoker<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response>(
            request, ApigMeta.showDetailsOfGatewayResponseTypeV2, hcClient);
    }

    /** 查询分组自定义响应详情 查询分组自定义响应详情
     *
     * @param ShowDetailsOfGatewayResponseV2Request 请求对象
     * @return ShowDetailsOfGatewayResponseV2Response */
    public ShowDetailsOfGatewayResponseV2Response showDetailsOfGatewayResponseV2(
        ShowDetailsOfGatewayResponseV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfGatewayResponseV2);
    }

    /** 查询分组自定义响应详情 查询分组自定义响应详情
     *
     * @param ShowDetailsOfGatewayResponseV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response> */
    public SyncInvoker<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response> showDetailsOfGatewayResponseV2Invoker(
        ShowDetailsOfGatewayResponseV2Request request) {
        return new SyncInvoker<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response>(request,
            ApigMeta.showDetailsOfGatewayResponseV2, hcClient);
    }

    /** 查看专享版实例创建进度 查看专享版实例创建进度
     *
     * @param ShowDetailsOfInstanceProgressV2Request 请求对象
     * @return ShowDetailsOfInstanceProgressV2Response */
    public ShowDetailsOfInstanceProgressV2Response showDetailsOfInstanceProgressV2(
        ShowDetailsOfInstanceProgressV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfInstanceProgressV2);
    }

    /** 查看专享版实例创建进度 查看专享版实例创建进度
     *
     * @param ShowDetailsOfInstanceProgressV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response> */
    public SyncInvoker<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response> showDetailsOfInstanceProgressV2Invoker(
        ShowDetailsOfInstanceProgressV2Request request) {
        return new SyncInvoker<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response>(request,
            ApigMeta.showDetailsOfInstanceProgressV2, hcClient);
    }

    /** 查看专享版实例详情 查看专享版实例详情
     *
     * @param ShowDetailsOfInstanceV2Request 请求对象
     * @return ShowDetailsOfInstanceV2Response */
    public ShowDetailsOfInstanceV2Response showDetailsOfInstanceV2(ShowDetailsOfInstanceV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfInstanceV2);
    }

    /** 查看专享版实例详情 查看专享版实例详情
     *
     * @param ShowDetailsOfInstanceV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> */
    public SyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2Invoker(
        ShowDetailsOfInstanceV2Request request) {
        return new SyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response>(request,
            ApigMeta.showDetailsOfInstanceV2, hcClient);
    }

    /** 查看流控策略详情 查看指定流控策略的详细信息。
     *
     * @param ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return ShowDetailsOfRequestThrottlingPolicyV2Response */
    public ShowDetailsOfRequestThrottlingPolicyV2Response showDetailsOfRequestThrottlingPolicyV2(
        ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfRequestThrottlingPolicyV2);
    }

    /** 查看流控策略详情 查看指定流控策略的详细信息。
     *
     * @param ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request,
     *         ShowDetailsOfRequestThrottlingPolicyV2Response> */
    public SyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2Invoker(
        ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response>(
            request, ApigMeta.showDetailsOfRequestThrottlingPolicyV2, hcClient);
    }

    /** 修改自定义认证 修改自定义认证
     *
     * @param UpdateCustomAuthorizerV2Request 请求对象
     * @return UpdateCustomAuthorizerV2Response */
    public UpdateCustomAuthorizerV2Response updateCustomAuthorizerV2(UpdateCustomAuthorizerV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateCustomAuthorizerV2);
    }

    /** 修改自定义认证 修改自定义认证
     *
     * @param UpdateCustomAuthorizerV2Request 请求对象
     * @return SyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> */
    public SyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2Invoker(
        UpdateCustomAuthorizerV2Request request) {
        return new SyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response>(request,
            ApigMeta.updateCustomAuthorizerV2, hcClient);
    }

    /** 修改域名 修改绑定的域名所对应的配置信息。
     *
     * @param UpdateDomainV2Request 请求对象
     * @return UpdateDomainV2Response */
    public UpdateDomainV2Response updateDomainV2(UpdateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateDomainV2);
    }

    /** 修改域名 修改绑定的域名所对应的配置信息。
     *
     * @param UpdateDomainV2Request 请求对象
     * @return SyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response> */
    public SyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response> updateDomainV2Invoker(
        UpdateDomainV2Request request) {
        return new SyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response>(request, ApigMeta.updateDomainV2,
            hcClient);
    }

    /** 更新实例出公网带宽 更新实例出公网带宽
     *
     * @param UpdateEngressEipV2Request 请求对象
     * @return UpdateEngressEipV2Response */
    public UpdateEngressEipV2Response updateEngressEipV2(UpdateEngressEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateEngressEipV2);
    }

    /** 更新实例出公网带宽 更新实例出公网带宽
     *
     * @param UpdateEngressEipV2Request 请求对象
     * @return SyncInvoker<UpdateEngressEipV2Request, UpdateEngressEipV2Response> */
    public SyncInvoker<UpdateEngressEipV2Request, UpdateEngressEipV2Response> updateEngressEipV2Invoker(
        UpdateEngressEipV2Request request) {
        return new SyncInvoker<UpdateEngressEipV2Request, UpdateEngressEipV2Response>(request,
            ApigMeta.updateEngressEipV2, hcClient);
    }

    /** 修改环境 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     *
     * @param UpdateEnvironmentV2Request 请求对象
     * @return UpdateEnvironmentV2Response */
    public UpdateEnvironmentV2Response updateEnvironmentV2(UpdateEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateEnvironmentV2);
    }

    /** 修改环境 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     *
     * @param UpdateEnvironmentV2Request 请求对象
     * @return SyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> */
    public SyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> updateEnvironmentV2Invoker(
        UpdateEnvironmentV2Request request) {
        return new SyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response>(request,
            ApigMeta.updateEnvironmentV2, hcClient);
    }

    /** 修改分组下指定错误类型的自定义响应 修改分组下指定错误类型的自定义响应。
     *
     * @param UpdateGatewayResponseTypeV2Request 请求对象
     * @return UpdateGatewayResponseTypeV2Response */
    public UpdateGatewayResponseTypeV2Response updateGatewayResponseTypeV2(UpdateGatewayResponseTypeV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateGatewayResponseTypeV2);
    }

    /** 修改分组下指定错误类型的自定义响应 修改分组下指定错误类型的自定义响应。
     *
     * @param UpdateGatewayResponseTypeV2Request 请求对象
     * @return SyncInvoker<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response> */
    public SyncInvoker<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response> updateGatewayResponseTypeV2Invoker(
        UpdateGatewayResponseTypeV2Request request) {
        return new SyncInvoker<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response>(request,
            ApigMeta.updateGatewayResponseTypeV2, hcClient);
    }

    /** 修改分组自定义响应 修改分组自定义响应
     *
     * @param UpdateGatewayResponseV2Request 请求对象
     * @return UpdateGatewayResponseV2Response */
    public UpdateGatewayResponseV2Response updateGatewayResponseV2(UpdateGatewayResponseV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateGatewayResponseV2);
    }

    /** 修改分组自定义响应 修改分组自定义响应
     *
     * @param UpdateGatewayResponseV2Request 请求对象
     * @return SyncInvoker<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response> */
    public SyncInvoker<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response> updateGatewayResponseV2Invoker(
        UpdateGatewayResponseV2Request request) {
        return new SyncInvoker<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response>(request,
            ApigMeta.updateGatewayResponseV2, hcClient);
    }

    /** 更新专享版实例 更新专享版实例
     *
     * @param UpdateInstanceV2Request 请求对象
     * @return UpdateInstanceV2Response */
    public UpdateInstanceV2Response updateInstanceV2(UpdateInstanceV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateInstanceV2);
    }

    /** 更新专享版实例 更新专享版实例
     *
     * @param UpdateInstanceV2Request 请求对象
     * @return SyncInvoker<UpdateInstanceV2Request, UpdateInstanceV2Response> */
    public SyncInvoker<UpdateInstanceV2Request, UpdateInstanceV2Response> updateInstanceV2Invoker(
        UpdateInstanceV2Request request) {
        return new SyncInvoker<UpdateInstanceV2Request, UpdateInstanceV2Response>(request, ApigMeta.updateInstanceV2,
            hcClient);
    }

    /** 修改流控策略 修改指定流控策略的详细信息。
     *
     * @param UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return UpdateRequestThrottlingPolicyV2Response */
    public UpdateRequestThrottlingPolicyV2Response updateRequestThrottlingPolicyV2(
        UpdateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateRequestThrottlingPolicyV2);
    }

    /** 修改流控策略 修改指定流控策略的详细信息。
     *
     * @param UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> */
    public SyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2Invoker(
        UpdateRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response>(request,
            ApigMeta.updateRequestThrottlingPolicyV2, hcClient);
    }

    /** 修改签名密钥 修改指定签名密钥的详细信息。
     *
     * @param UpdateSignatureKeyV2Request 请求对象
     * @return UpdateSignatureKeyV2Response */
    public UpdateSignatureKeyV2Response updateSignatureKeyV2(UpdateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateSignatureKeyV2);
    }

    /** 修改签名密钥 修改指定签名密钥的详细信息。
     *
     * @param UpdateSignatureKeyV2Request 请求对象
     * @return SyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> */
    public SyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> updateSignatureKeyV2Invoker(
        UpdateSignatureKeyV2Request request) {
        return new SyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response>(request,
            ApigMeta.updateSignatureKeyV2, hcClient);
    }

    /** 修改特殊设置 修改某个流控策略下的某个特殊设置。
     *
     * @param UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return UpdateSpecialThrottlingConfigurationV2Response */
    public UpdateSpecialThrottlingConfigurationV2Response updateSpecialThrottlingConfigurationV2(
        UpdateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateSpecialThrottlingConfigurationV2);
    }

    /** 修改特殊设置 修改某个流控策略下的某个特殊设置。
     *
     * @param UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return SyncInvoker<UpdateSpecialThrottlingConfigurationV2Request,
     *         UpdateSpecialThrottlingConfigurationV2Response> */
    public SyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2Invoker(
        UpdateSpecialThrottlingConfigurationV2Request request) {
        return new SyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response>(
            request, ApigMeta.updateSpecialThrottlingConfigurationV2, hcClient);
    }

    /** 批量删除ACL策略 批量删除指定的多个ACL策略。 删除ACL策略时，如果存在ACL策略与API绑定关系，则无法删除。
     *
     * @param BatchDeleteAclV2Request 请求对象
     * @return BatchDeleteAclV2Response */
    public BatchDeleteAclV2Response batchDeleteAclV2(BatchDeleteAclV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.batchDeleteAclV2);
    }

    /** 批量删除ACL策略 批量删除指定的多个ACL策略。 删除ACL策略时，如果存在ACL策略与API绑定关系，则无法删除。
     *
     * @param BatchDeleteAclV2Request 请求对象
     * @return SyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response> */
    public SyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response> batchDeleteAclV2Invoker(
        BatchDeleteAclV2Request request) {
        return new SyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response>(request, ApigMeta.batchDeleteAclV2,
            hcClient);
    }

    /** 创建ACL策略
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com\&quot;之类的网络域名。
     *
     * @param CreateAclStrategyV2Request 请求对象
     * @return CreateAclStrategyV2Response */
    public CreateAclStrategyV2Response createAclStrategyV2(CreateAclStrategyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createAclStrategyV2);
    }

    /** 创建ACL策略
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com\&quot;之类的网络域名。
     *
     * @param CreateAclStrategyV2Request 请求对象
     * @return SyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response> */
    public SyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response> createAclStrategyV2Invoker(
        CreateAclStrategyV2Request request) {
        return new SyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response>(request,
            ApigMeta.createAclStrategyV2, hcClient);
    }

    /** 删除ACL策略 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     *
     * @param DeleteAclV2Request 请求对象
     * @return DeleteAclV2Response */
    public DeleteAclV2Response deleteAclV2(DeleteAclV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteAclV2);
    }

    /** 删除ACL策略 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     *
     * @param DeleteAclV2Request 请求对象
     * @return SyncInvoker<DeleteAclV2Request, DeleteAclV2Response> */
    public SyncInvoker<DeleteAclV2Request, DeleteAclV2Response> deleteAclV2Invoker(DeleteAclV2Request request) {
        return new SyncInvoker<DeleteAclV2Request, DeleteAclV2Response>(request, ApigMeta.deleteAclV2, hcClient);
    }

    /** 查看ACL策略列表 查询所有的ACL策略列表。
     *
     * @param ListAclStrategiesV2Request 请求对象
     * @return ListAclStrategiesV2Response */
    public ListAclStrategiesV2Response listAclStrategiesV2(ListAclStrategiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAclStrategiesV2);
    }

    /** 查看ACL策略列表 查询所有的ACL策略列表。
     *
     * @param ListAclStrategiesV2Request 请求对象
     * @return SyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response> */
    public SyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response> listAclStrategiesV2Invoker(
        ListAclStrategiesV2Request request) {
        return new SyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response>(request,
            ApigMeta.listAclStrategiesV2, hcClient);
    }

    /** 查看ACL策略详情 查询指定ACL策略的详情。
     *
     * @param ShowDetailsOfAclPolicyV2Request 请求对象
     * @return ShowDetailsOfAclPolicyV2Response */
    public ShowDetailsOfAclPolicyV2Response showDetailsOfAclPolicyV2(ShowDetailsOfAclPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfAclPolicyV2);
    }

    /** 查看ACL策略详情 查询指定ACL策略的详情。
     *
     * @param ShowDetailsOfAclPolicyV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> */
    public SyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2Invoker(
        ShowDetailsOfAclPolicyV2Request request) {
        return new SyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response>(request,
            ApigMeta.showDetailsOfAclPolicyV2, hcClient);
    }

    /** 修改ACL策略 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     *
     * @param UpdateAclStrategyV2Request 请求对象
     * @return UpdateAclStrategyV2Response */
    public UpdateAclStrategyV2Response updateAclStrategyV2(UpdateAclStrategyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateAclStrategyV2);
    }

    /** 修改ACL策略 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     *
     * @param UpdateAclStrategyV2Request 请求对象
     * @return SyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> */
    public SyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> updateAclStrategyV2Invoker(
        UpdateAclStrategyV2Request request) {
        return new SyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response>(request,
            ApigMeta.updateAclStrategyV2, hcClient);
    }

    /** 绑定流控策略 将流控策略应用于API，则所有对该API的访问将会受到该流控策略的限制。
     * 当一定时间内的访问次数超过流控策略设置的API最大访问次数限制后，后续的访问将会被拒绝，从而能够较好的保护后端API免受异常流量的冲击，保障服务的稳定运行。
     * 为指定的API绑定流控策略，绑定时，需要指定在哪个环境上生效。同一个API发布到不同的环境可以绑定不同的流控策略；一个API在发布到特定环境后只能绑定一个默认的流控策略。
     *
     * @param AssociateRequestThrottlingPolicyV2Request 请求对象
     * @return AssociateRequestThrottlingPolicyV2Response */
    public AssociateRequestThrottlingPolicyV2Response associateRequestThrottlingPolicyV2(
        AssociateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateRequestThrottlingPolicyV2);
    }

    /** 绑定流控策略 将流控策略应用于API，则所有对该API的访问将会受到该流控策略的限制。
     * 当一定时间内的访问次数超过流控策略设置的API最大访问次数限制后，后续的访问将会被拒绝，从而能够较好的保护后端API免受异常流量的冲击，保障服务的稳定运行。
     * 为指定的API绑定流控策略，绑定时，需要指定在哪个环境上生效。同一个API发布到不同的环境可以绑定不同的流控策略；一个API在发布到特定环境后只能绑定一个默认的流控策略。
     *
     * @param AssociateRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> */
    public SyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2Invoker(
        AssociateRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response>(
            request, ApigMeta.associateRequestThrottlingPolicyV2, hcClient);
    }

    /** 批量解绑流控策略 批量解除API与流控策略的绑定关系
     *
     * @param BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return BatchDisassociateThrottlingPolicyV2Response */
    public BatchDisassociateThrottlingPolicyV2Response batchDisassociateThrottlingPolicyV2(
        BatchDisassociateThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.batchDisassociateThrottlingPolicyV2);
    }

    /** 批量解绑流控策略 批量解除API与流控策略的绑定关系
     *
     * @param BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> */
    public SyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2Invoker(
        BatchDisassociateThrottlingPolicyV2Request request) {
        return new SyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response>(
            request, ApigMeta.batchDisassociateThrottlingPolicyV2, hcClient);
    }

    /** 批量发布或下线API 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。
     *
     * @param BatchPublishOrOfflineApiV2Request 请求对象
     * @return BatchPublishOrOfflineApiV2Response */
    public BatchPublishOrOfflineApiV2Response batchPublishOrOfflineApiV2(BatchPublishOrOfflineApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.batchPublishOrOfflineApiV2);
    }

    /** 批量发布或下线API 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。
     *
     * @param BatchPublishOrOfflineApiV2Request 请求对象
     * @return SyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> */
    public SyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2Invoker(
        BatchPublishOrOfflineApiV2Request request) {
        return new SyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response>(request,
            ApigMeta.batchPublishOrOfflineApiV2, hcClient);
    }

    /** 切换API版本 API每次发布时，会基于当前的API定义生成一个版本。版本记录了API发布时的各种定义及状态。 多个版本之间可以进行随意切换。但一个API在一个环境上，只能有一个版本生效。
     *
     * @param ChangeApiVersionV2Request 请求对象
     * @return ChangeApiVersionV2Response */
    public ChangeApiVersionV2Response changeApiVersionV2(ChangeApiVersionV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.changeApiVersionV2);
    }

    /** 切换API版本 API每次发布时，会基于当前的API定义生成一个版本。版本记录了API发布时的各种定义及状态。 多个版本之间可以进行随意切换。但一个API在一个环境上，只能有一个版本生效。
     *
     * @param ChangeApiVersionV2Request 请求对象
     * @return SyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response> */
    public SyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response> changeApiVersionV2Invoker(
        ChangeApiVersionV2Request request) {
        return new SyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response>(request,
            ApigMeta.changeApiVersionV2, hcClient);
    }

    /** 创建API分组 API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。
     *
     * @param CreateApiGroupV2Request 请求对象
     * @return CreateApiGroupV2Response */
    public CreateApiGroupV2Response createApiGroupV2(CreateApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createApiGroupV2);
    }

    /** 创建API分组 API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。
     *
     * @param CreateApiGroupV2Request 请求对象
     * @return SyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response> */
    public SyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response> createApiGroupV2Invoker(
        CreateApiGroupV2Request request) {
        return new SyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response>(request, ApigMeta.createApiGroupV2,
            hcClient);
    }

    /** 注册API 添加一个API，API即一个服务接口，具体的服务能力。
     * API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了API网关如何去访问真实的后端服务。API的真实后端服务目前支持三种类型：传统的HTTP/HTTPS形式的web后端、函数工作流、MOCK。
     *
     * @param CreateApiV2Request 请求对象
     * @return CreateApiV2Response */
    public CreateApiV2Response createApiV2(CreateApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createApiV2);
    }

    /** 注册API 添加一个API，API即一个服务接口，具体的服务能力。
     * API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了API网关如何去访问真实的后端服务。API的真实后端服务目前支持三种类型：传统的HTTP/HTTPS形式的web后端、函数工作流、MOCK。
     *
     * @param CreateApiV2Request 请求对象
     * @return SyncInvoker<CreateApiV2Request, CreateApiV2Response> */
    public SyncInvoker<CreateApiV2Request, CreateApiV2Response> createApiV2Invoker(CreateApiV2Request request) {
        return new SyncInvoker<CreateApiV2Request, CreateApiV2Response>(request, ApigMeta.createApiV2, hcClient);
    }

    /** 发布或下线API 对API进行发布或下线。 发布操作是将一个指定的API发布到一个指定的环境，API只有发布后，才能够被调用，且只能在该环境上才能被调用。未发布的API无法被调用。
     * 下线操作是将API从某个已发布的环境上下线，下线后，API将无法再被调用。
     *
     * @param CreateOrDeletePublishRecordForApiV2Request 请求对象
     * @return CreateOrDeletePublishRecordForApiV2Response */
    public CreateOrDeletePublishRecordForApiV2Response createOrDeletePublishRecordForApiV2(
        CreateOrDeletePublishRecordForApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createOrDeletePublishRecordForApiV2);
    }

    /** 发布或下线API 对API进行发布或下线。 发布操作是将一个指定的API发布到一个指定的环境，API只有发布后，才能够被调用，且只能在该环境上才能被调用。未发布的API无法被调用。
     * 下线操作是将API从某个已发布的环境上下线，下线后，API将无法再被调用。
     *
     * @param CreateOrDeletePublishRecordForApiV2Request 请求对象
     * @return SyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> */
    public SyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2Invoker(
        CreateOrDeletePublishRecordForApiV2Request request) {
        return new SyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response>(
            request, ApigMeta.createOrDeletePublishRecordForApiV2, hcClient);
    }

    /** 调试API 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     *
     * @param DebugApiV2Request 请求对象
     * @return DebugApiV2Response */
    public DebugApiV2Response debugApiV2(DebugApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.debugApiV2);
    }

    /** 调试API 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     *
     * @param DebugApiV2Request 请求对象
     * @return SyncInvoker<DebugApiV2Request, DebugApiV2Response> */
    public SyncInvoker<DebugApiV2Request, DebugApiV2Response> debugApiV2Invoker(DebugApiV2Request request) {
        return new SyncInvoker<DebugApiV2Request, DebugApiV2Response>(request, ApigMeta.debugApiV2, hcClient);
    }

    /** 根据版本编号下线API 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。
     *
     * @param DeleteApiByVersionIdV2Request 请求对象
     * @return DeleteApiByVersionIdV2Response */
    public DeleteApiByVersionIdV2Response deleteApiByVersionIdV2(DeleteApiByVersionIdV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteApiByVersionIdV2);
    }

    /** 根据版本编号下线API 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。
     *
     * @param DeleteApiByVersionIdV2Request 请求对象
     * @return SyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> */
    public SyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2Invoker(
        DeleteApiByVersionIdV2Request request) {
        return new SyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response>(request,
            ApigMeta.deleteApiByVersionIdV2, hcClient);
    }

    /** 删除API分组 删除指定的API分组。
     * 删除时，会一并删除直接或间接关联到该分组下的所有资源，包括API、独立域名、SSL证书、上架信息、分组下所有API的授权信息、编排信息、白名单配置、认证增强信息等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     *
     * @param DeleteApiGroupV2Request 请求对象
     * @return DeleteApiGroupV2Response */
    public DeleteApiGroupV2Response deleteApiGroupV2(DeleteApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteApiGroupV2);
    }

    /** 删除API分组 删除指定的API分组。
     * 删除时，会一并删除直接或间接关联到该分组下的所有资源，包括API、独立域名、SSL证书、上架信息、分组下所有API的授权信息、编排信息、白名单配置、认证增强信息等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     *
     * @param DeleteApiGroupV2Request 请求对象
     * @return SyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response> */
    public SyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response> deleteApiGroupV2Invoker(
        DeleteApiGroupV2Request request) {
        return new SyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response>(request, ApigMeta.deleteApiGroupV2,
            hcClient);
    }

    /** 删除API 删除指定的API。 删除API时，会删除该API所有相关的资源信息或绑定关系，如API的发布记录，绑定的后端服务，对APP的授权信息等。
     *
     * @param DeleteApiV2Request 请求对象
     * @return DeleteApiV2Response */
    public DeleteApiV2Response deleteApiV2(DeleteApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteApiV2);
    }

    /** 删除API 删除指定的API。 删除API时，会删除该API所有相关的资源信息或绑定关系，如API的发布记录，绑定的后端服务，对APP的授权信息等。
     *
     * @param DeleteApiV2Request 请求对象
     * @return SyncInvoker<DeleteApiV2Request, DeleteApiV2Response> */
    public SyncInvoker<DeleteApiV2Request, DeleteApiV2Response> deleteApiV2Invoker(DeleteApiV2Request request) {
        return new SyncInvoker<DeleteApiV2Request, DeleteApiV2Response>(request, ApigMeta.deleteApiV2, hcClient);
    }

    /** 解除API与流控策略的绑定关系 解除API与流控策略的绑定关系。
     *
     * @param DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return DisassociateRequestThrottlingPolicyV2Response */
    public DisassociateRequestThrottlingPolicyV2Response disassociateRequestThrottlingPolicyV2(
        DisassociateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateRequestThrottlingPolicyV2);
    }

    /** 解除API与流控策略的绑定关系 解除API与流控策略的绑定关系。
     *
     * @param DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<DisassociateRequestThrottlingPolicyV2Request,
     *         DisassociateRequestThrottlingPolicyV2Response> */
    public SyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2Invoker(
        DisassociateRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response>(
            request, ApigMeta.disassociateRequestThrottlingPolicyV2, hcClient);
    }

    /** 查询分组列表 查询API分组列表。 如果是租户操作，则查询该租户下所有的分组；如果是管理员操作，则查询的是所有租户的分组。
     *
     * @param ListApiGroupsV2Request 请求对象
     * @return ListApiGroupsV2Response */
    public ListApiGroupsV2Response listApiGroupsV2(ListApiGroupsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiGroupsV2);
    }

    /** 查询分组列表 查询API分组列表。 如果是租户操作，则查询该租户下所有的分组；如果是管理员操作，则查询的是所有租户的分组。
     *
     * @param ListApiGroupsV2Request 请求对象
     * @return SyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response> */
    public SyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response> listApiGroupsV2Invoker(
        ListApiGroupsV2Request request) {
        return new SyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response>(request, ApigMeta.listApiGroupsV2,
            hcClient);
    }

    /** 查询API运行时定义 查看指定的API在指定的环境上的运行时定义，默认查询RELEASE环境上的运行时定义。 API的定义分为临时定义和运行时定义，分别代表如下含义： -
     * 临时定义：API在编辑中的定义，表示用户最后一次编辑后的API的状态 - 运行时定义：API在发布到某个环境时，对发布时的API的临时定义进行快照，固化出来的API的状态。 访问某个环境上的API，其实访问的就是其运行时的定义
     *
     * @param ListApiRuntimeDefinitionV2Request 请求对象
     * @return ListApiRuntimeDefinitionV2Response */
    public ListApiRuntimeDefinitionV2Response listApiRuntimeDefinitionV2(ListApiRuntimeDefinitionV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiRuntimeDefinitionV2);
    }

    /** 查询API运行时定义 查看指定的API在指定的环境上的运行时定义，默认查询RELEASE环境上的运行时定义。 API的定义分为临时定义和运行时定义，分别代表如下含义： -
     * 临时定义：API在编辑中的定义，表示用户最后一次编辑后的API的状态 - 运行时定义：API在发布到某个环境时，对发布时的API的临时定义进行快照，固化出来的API的状态。 访问某个环境上的API，其实访问的就是其运行时的定义
     *
     * @param ListApiRuntimeDefinitionV2Request 请求对象
     * @return SyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> */
    public SyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2Invoker(
        ListApiRuntimeDefinitionV2Request request) {
        return new SyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response>(request,
            ApigMeta.listApiRuntimeDefinitionV2, hcClient);
    }

    /** 查看版本详情 查询某个指定的版本详情。
     *
     * @param ListApiVersionDetailV2Request 请求对象
     * @return ListApiVersionDetailV2Response */
    public ListApiVersionDetailV2Response listApiVersionDetailV2(ListApiVersionDetailV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiVersionDetailV2);
    }

    /** 查看版本详情 查询某个指定的版本详情。
     *
     * @param ListApiVersionDetailV2Request 请求对象
     * @return SyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> */
    public SyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> listApiVersionDetailV2Invoker(
        ListApiVersionDetailV2Request request) {
        return new SyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response>(request,
            ApigMeta.listApiVersionDetailV2, hcClient);
    }

    /** 查询API历史版本列表 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     *
     * @param ListApiVersionsV2Request 请求对象
     * @return ListApiVersionsV2Response */
    public ListApiVersionsV2Response listApiVersionsV2(ListApiVersionsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiVersionsV2);
    }

    /** 查询API历史版本列表 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     *
     * @param ListApiVersionsV2Request 请求对象
     * @return SyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response> */
    public SyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response> listApiVersionsV2Invoker(
        ListApiVersionsV2Request request) {
        return new SyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response>(request, ApigMeta.listApiVersionsV2,
            hcClient);
    }

    /** 查看流控策略绑定的API列表 查询某个流控策略上已经绑定的API列表。
     *
     * @param ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return ListApisBindedToRequestThrottlingPolicyV2Response */
    public ListApisBindedToRequestThrottlingPolicyV2Response listApisBindedToRequestThrottlingPolicyV2(
        ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToRequestThrottlingPolicyV2);
    }

    /** 查看流控策略绑定的API列表 查询某个流控策略上已经绑定的API列表。
     *
     * @param ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request,
     *         ListApisBindedToRequestThrottlingPolicyV2Response> */
    public SyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2Invoker(
        ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response>(
            request, ApigMeta.listApisBindedToRequestThrottlingPolicyV2, hcClient);
    }

    /** 查看流控策略未绑定的API列表 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return ListApisUnbindedToRequestThrottlingPolicyV2Response */
    public ListApisUnbindedToRequestThrottlingPolicyV2Response listApisUnbindedToRequestThrottlingPolicyV2(
        ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisUnbindedToRequestThrottlingPolicyV2);
    }

    /** 查看流控策略未绑定的API列表 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request,
     *         ListApisUnbindedToRequestThrottlingPolicyV2Response> */
    public SyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2Invoker(
        ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response>(
            request, ApigMeta.listApisUnbindedToRequestThrottlingPolicyV2, hcClient);
    }

    /** 查询API列表 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息。
     *
     * @param ListApisV2Request 请求对象
     * @return ListApisV2Response */
    public ListApisV2Response listApisV2(ListApisV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisV2);
    }

    /** 查询API列表 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息。
     *
     * @param ListApisV2Request 请求对象
     * @return SyncInvoker<ListApisV2Request, ListApisV2Response> */
    public SyncInvoker<ListApisV2Request, ListApisV2Response> listApisV2Invoker(ListApisV2Request request) {
        return new SyncInvoker<ListApisV2Request, ListApisV2Response>(request, ApigMeta.listApisV2, hcClient);
    }

    /** 查看API绑定的流控策略列表 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     *
     * @param ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return ListRequestThrottlingPoliciesBindedToApiV2Response */
    public ListRequestThrottlingPoliciesBindedToApiV2Response listRequestThrottlingPoliciesBindedToApiV2(
        ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listRequestThrottlingPoliciesBindedToApiV2);
    }

    /** 查看API绑定的流控策略列表 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     *
     * @param ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return SyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request,
     *         ListRequestThrottlingPoliciesBindedToApiV2Response> */
    public SyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2Invoker(
        ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return new SyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response>(
            request, ApigMeta.listRequestThrottlingPoliciesBindedToApiV2, hcClient);
    }

    /** 查询分组详情 查询指定分组的详细信息。
     *
     * @param ShowDetailsOfApiGroupV2Request 请求对象
     * @return ShowDetailsOfApiGroupV2Response */
    public ShowDetailsOfApiGroupV2Response showDetailsOfApiGroupV2(ShowDetailsOfApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfApiGroupV2);
    }

    /** 查询分组详情 查询指定分组的详细信息。
     *
     * @param ShowDetailsOfApiGroupV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> */
    public SyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2Invoker(
        ShowDetailsOfApiGroupV2Request request) {
        return new SyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response>(request,
            ApigMeta.showDetailsOfApiGroupV2, hcClient);
    }

    /** 查询API详情 查看指定的API的详细信息。
     *
     * @param ShowDetailsOfApiV2Request 请求对象
     * @return ShowDetailsOfApiV2Response */
    public ShowDetailsOfApiV2Response showDetailsOfApiV2(ShowDetailsOfApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfApiV2);
    }

    /** 查询API详情 查看指定的API的详细信息。
     *
     * @param ShowDetailsOfApiV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> */
    public SyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> showDetailsOfApiV2Invoker(
        ShowDetailsOfApiV2Request request) {
        return new SyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response>(request,
            ApigMeta.showDetailsOfApiV2, hcClient);
    }

    /** 修改API分组 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     *
     * @param UpdateApiGroupV2Request 请求对象
     * @return UpdateApiGroupV2Response */
    public UpdateApiGroupV2Response updateApiGroupV2(UpdateApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateApiGroupV2);
    }

    /** 修改API分组 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     *
     * @param UpdateApiGroupV2Request 请求对象
     * @return SyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response> */
    public SyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response> updateApiGroupV2Invoker(
        UpdateApiGroupV2Request request) {
        return new SyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response>(request, ApigMeta.updateApiGroupV2,
            hcClient);
    }

    /** 修改API 修改指定API的信息，包括后端服务信息。
     *
     * @param UpdateApiV2Request 请求对象
     * @return UpdateApiV2Response */
    public UpdateApiV2Response updateApiV2(UpdateApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateApiV2);
    }

    /** 修改API 修改指定API的信息，包括后端服务信息。
     *
     * @param UpdateApiV2Request 请求对象
     * @return SyncInvoker<UpdateApiV2Request, UpdateApiV2Response> */
    public SyncInvoker<UpdateApiV2Request, UpdateApiV2Response> updateApiV2Invoker(UpdateApiV2Request request) {
        return new SyncInvoker<UpdateApiV2Request, UpdateApiV2Response>(request, ApigMeta.updateApiV2, hcClient);
    }

    /** 批量解除API与ACL策略的绑定 批量解除API与ACL策略的绑定
     *
     * @param BatchDeleteApiAclBindingV2Request 请求对象
     * @return BatchDeleteApiAclBindingV2Response */
    public BatchDeleteApiAclBindingV2Response batchDeleteApiAclBindingV2(BatchDeleteApiAclBindingV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.batchDeleteApiAclBindingV2);
    }

    /** 批量解除API与ACL策略的绑定 批量解除API与ACL策略的绑定
     *
     * @param BatchDeleteApiAclBindingV2Request 请求对象
     * @return SyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> */
    public SyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2Invoker(
        BatchDeleteApiAclBindingV2Request request) {
        return new SyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response>(request,
            ApigMeta.batchDeleteApiAclBindingV2, hcClient);
    }

    /** 将API与ACL策略进行绑定 将API与ACL策略进行绑定。 同一个API发布到不同的环境可以绑定不同的ACL策略；一个API在发布到特定环境后只能绑定一个同一种类型的ACL策略。
     *
     * @param CreateApiAclBindingV2Request 请求对象
     * @return CreateApiAclBindingV2Response */
    public CreateApiAclBindingV2Response createApiAclBindingV2(CreateApiAclBindingV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createApiAclBindingV2);
    }

    /** 将API与ACL策略进行绑定 将API与ACL策略进行绑定。 同一个API发布到不同的环境可以绑定不同的ACL策略；一个API在发布到特定环境后只能绑定一个同一种类型的ACL策略。
     *
     * @param CreateApiAclBindingV2Request 请求对象
     * @return SyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> */
    public SyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> createApiAclBindingV2Invoker(
        CreateApiAclBindingV2Request request) {
        return new SyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response>(request,
            ApigMeta.createApiAclBindingV2, hcClient);
    }

    /** 解除API与ACL策略的绑定 解除某条API与ACL策略的绑定关系
     *
     * @param DeleteApiAclBindingV2Request 请求对象
     * @return DeleteApiAclBindingV2Response */
    public DeleteApiAclBindingV2Response deleteApiAclBindingV2(DeleteApiAclBindingV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteApiAclBindingV2);
    }

    /** 解除API与ACL策略的绑定 解除某条API与ACL策略的绑定关系
     *
     * @param DeleteApiAclBindingV2Request 请求对象
     * @return SyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> */
    public SyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> deleteApiAclBindingV2Invoker(
        DeleteApiAclBindingV2Request request) {
        return new SyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response>(request,
            ApigMeta.deleteApiAclBindingV2, hcClient);
    }

    /** 查看API绑定的ACL策略列表 查看API绑定的ACL策略列表
     *
     * @param ListAclPolicyBindedToApiV2Request 请求对象
     * @return ListAclPolicyBindedToApiV2Response */
    public ListAclPolicyBindedToApiV2Response listAclPolicyBindedToApiV2(ListAclPolicyBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAclPolicyBindedToApiV2);
    }

    /** 查看API绑定的ACL策略列表 查看API绑定的ACL策略列表
     *
     * @param ListAclPolicyBindedToApiV2Request 请求对象
     * @return SyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> */
    public SyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2Invoker(
        ListAclPolicyBindedToApiV2Request request) {
        return new SyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response>(request,
            ApigMeta.listAclPolicyBindedToApiV2, hcClient);
    }

    /** 查看ACL策略绑定的API列表 查看ACL策略绑定的API列表
     *
     * @param ListApisBindedToAclPolicyV2Request 请求对象
     * @return ListApisBindedToAclPolicyV2Response */
    public ListApisBindedToAclPolicyV2Response listApisBindedToAclPolicyV2(ListApisBindedToAclPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToAclPolicyV2);
    }

    /** 查看ACL策略绑定的API列表 查看ACL策略绑定的API列表
     *
     * @param ListApisBindedToAclPolicyV2Request 请求对象
     * @return SyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> */
    public SyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2Invoker(
        ListApisBindedToAclPolicyV2Request request) {
        return new SyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response>(request,
            ApigMeta.listApisBindedToAclPolicyV2, hcClient);
    }

    /** 查看ACL策略未绑定的API列表 查看ACL策略未绑定的API列表，需要API已发布
     *
     * @param ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return ListApisUnbindedToAclPolicyV2Response */
    public ListApisUnbindedToAclPolicyV2Response listApisUnbindedToAclPolicyV2(
        ListApisUnbindedToAclPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisUnbindedToAclPolicyV2);
    }

    /** 查看ACL策略未绑定的API列表 查看ACL策略未绑定的API列表，需要API已发布
     *
     * @param ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return SyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> */
    public SyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2Invoker(
        ListApisUnbindedToAclPolicyV2Request request) {
        return new SyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response>(request,
            ApigMeta.listApisUnbindedToAclPolicyV2, hcClient);
    }

    /** 解除授权 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     *
     * @param CancelingAuthorizationV2Request 请求对象
     * @return CancelingAuthorizationV2Response */
    public CancelingAuthorizationV2Response cancelingAuthorizationV2(CancelingAuthorizationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.cancelingAuthorizationV2);
    }

    /** 解除授权 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     *
     * @param CancelingAuthorizationV2Request 请求对象
     * @return SyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> */
    public SyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> cancelingAuthorizationV2Invoker(
        CancelingAuthorizationV2Request request) {
        return new SyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response>(request,
            ApigMeta.cancelingAuthorizationV2, hcClient);
    }

    /** 校验APP 校验app是否存在，非APP所有者可以调用该接口校验APP是否真实存在。这个接口只展示app的基本信息id 、name、 remark，其他信息不显示。
     *
     * @param CheckAppV2Request 请求对象
     * @return CheckAppV2Response */
    public CheckAppV2Response checkAppV2(CheckAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.checkAppV2);
    }

    /** 校验APP 校验app是否存在，非APP所有者可以调用该接口校验APP是否真实存在。这个接口只展示app的基本信息id 、name、 remark，其他信息不显示。
     *
     * @param CheckAppV2Request 请求对象
     * @return SyncInvoker<CheckAppV2Request, CheckAppV2Response> */
    public SyncInvoker<CheckAppV2Request, CheckAppV2Response> checkAppV2Invoker(CheckAppV2Request request) {
        return new SyncInvoker<CheckAppV2Request, CheckAppV2Response>(request, ApigMeta.checkAppV2, hcClient);
    }

    /** 创建APP APP即应用，是一个可以访问API的身份标识。将API授权给APP后，APP即可调用API。 创建一个APP。
     *
     * @param CreateAnAppV2Request 请求对象
     * @return CreateAnAppV2Response */
    public CreateAnAppV2Response createAnAppV2(CreateAnAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createAnAppV2);
    }

    /** 创建APP APP即应用，是一个可以访问API的身份标识。将API授权给APP后，APP即可调用API。 创建一个APP。
     *
     * @param CreateAnAppV2Request 请求对象
     * @return SyncInvoker<CreateAnAppV2Request, CreateAnAppV2Response> */
    public SyncInvoker<CreateAnAppV2Request, CreateAnAppV2Response> createAnAppV2Invoker(CreateAnAppV2Request request) {
        return new SyncInvoker<CreateAnAppV2Request, CreateAnAppV2Response>(request, ApigMeta.createAnAppV2, hcClient);
    }

    /** 自动生成APP Code 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     *
     * @param CreateAppCodeAutoV2Request 请求对象
     * @return CreateAppCodeAutoV2Response */
    public CreateAppCodeAutoV2Response createAppCodeAutoV2(CreateAppCodeAutoV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createAppCodeAutoV2);
    }

    /** 自动生成APP Code 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     *
     * @param CreateAppCodeAutoV2Request 请求对象
     * @return SyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> */
    public SyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> createAppCodeAutoV2Invoker(
        CreateAppCodeAutoV2Request request) {
        return new SyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response>(request,
            ApigMeta.createAppCodeAutoV2, hcClient);
    }

    /** 创建APP Code App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param CreateAppCodeV2Request 请求对象
     * @return CreateAppCodeV2Response */
    public CreateAppCodeV2Response createAppCodeV2(CreateAppCodeV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createAppCodeV2);
    }

    /** 创建APP Code App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param CreateAppCodeV2Request 请求对象
     * @return SyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response> */
    public SyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response> createAppCodeV2Invoker(
        CreateAppCodeV2Request request) {
        return new SyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response>(request, ApigMeta.createAppCodeV2,
            hcClient);
    }

    /** APP授权 APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。
     *
     * @param CreateAuthorizingAppsV2Request 请求对象
     * @return CreateAuthorizingAppsV2Response */
    public CreateAuthorizingAppsV2Response createAuthorizingAppsV2(CreateAuthorizingAppsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createAuthorizingAppsV2);
    }

    /** APP授权 APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。
     *
     * @param CreateAuthorizingAppsV2Request 请求对象
     * @return SyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> */
    public SyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> createAuthorizingAppsV2Invoker(
        CreateAuthorizingAppsV2Request request) {
        return new SyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response>(request,
            ApigMeta.createAuthorizingAppsV2, hcClient);
    }

    /** 删除APP Code 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     *
     * @param DeleteAppCodeV2Request 请求对象
     * @return DeleteAppCodeV2Response */
    public DeleteAppCodeV2Response deleteAppCodeV2(DeleteAppCodeV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteAppCodeV2);
    }

    /** 删除APP Code 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     *
     * @param DeleteAppCodeV2Request 请求对象
     * @return SyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response> */
    public SyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response> deleteAppCodeV2Invoker(
        DeleteAppCodeV2Request request) {
        return new SyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response>(request, ApigMeta.deleteAppCodeV2,
            hcClient);
    }

    /** 删除APP 删除指定的APP。 APP删除后，将无法再调用任何API；其中，云市场自动创建的APP无法被删除。
     *
     * @param DeleteAppV2Request 请求对象
     * @return DeleteAppV2Response */
    public DeleteAppV2Response deleteAppV2(DeleteAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteAppV2);
    }

    /** 删除APP 删除指定的APP。 APP删除后，将无法再调用任何API；其中，云市场自动创建的APP无法被删除。
     *
     * @param DeleteAppV2Request 请求对象
     * @return SyncInvoker<DeleteAppV2Request, DeleteAppV2Response> */
    public SyncInvoker<DeleteAppV2Request, DeleteAppV2Response> deleteAppV2Invoker(DeleteAppV2Request request) {
        return new SyncInvoker<DeleteAppV2Request, DeleteAppV2Response>(request, ApigMeta.deleteAppV2, hcClient);
    }

    /** 查看APP已绑定的API列表 查询APP已经绑定的API列表。
     *
     * @param ListApisBindedToAppV2Request 请求对象
     * @return ListApisBindedToAppV2Response */
    public ListApisBindedToAppV2Response listApisBindedToAppV2(ListApisBindedToAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToAppV2);
    }

    /** 查看APP已绑定的API列表 查询APP已经绑定的API列表。
     *
     * @param ListApisBindedToAppV2Request 请求对象
     * @return SyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> */
    public SyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> listApisBindedToAppV2Invoker(
        ListApisBindedToAppV2Request request) {
        return new SyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response>(request,
            ApigMeta.listApisBindedToAppV2, hcClient);
    }

    /** 查看APP未绑定的API列表 查询指定环境上某个APP未绑定的API列表，包括自有API和从云市场购买的API。
     *
     * @param ListApisUnbindedToAppV2Request 请求对象
     * @return ListApisUnbindedToAppV2Response */
    public ListApisUnbindedToAppV2Response listApisUnbindedToAppV2(ListApisUnbindedToAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisUnbindedToAppV2);
    }

    /** 查看APP未绑定的API列表 查询指定环境上某个APP未绑定的API列表，包括自有API和从云市场购买的API。
     *
     * @param ListApisUnbindedToAppV2Request 请求对象
     * @return SyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> */
    public SyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2Invoker(
        ListApisUnbindedToAppV2Request request) {
        return new SyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response>(request,
            ApigMeta.listApisUnbindedToAppV2, hcClient);
    }

    /** 查询APP Code列表 查询App Code列表。
     *
     * @param ListAppCodesV2Request 请求对象
     * @return ListAppCodesV2Response */
    public ListAppCodesV2Response listAppCodesV2(ListAppCodesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppCodesV2);
    }

    /** 查询APP Code列表 查询App Code列表。
     *
     * @param ListAppCodesV2Request 请求对象
     * @return SyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response> */
    public SyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response> listAppCodesV2Invoker(
        ListAppCodesV2Request request) {
        return new SyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response>(request, ApigMeta.listAppCodesV2,
            hcClient);
    }

    /** 查看API已绑定的APP列表 查询API绑定的APP列表。
     *
     * @param ListAppsBindedToApiV2Request 请求对象
     * @return ListAppsBindedToApiV2Response */
    public ListAppsBindedToApiV2Response listAppsBindedToApiV2(ListAppsBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppsBindedToApiV2);
    }

    /** 查看API已绑定的APP列表 查询API绑定的APP列表。
     *
     * @param ListAppsBindedToApiV2Request 请求对象
     * @return SyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> */
    public SyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> listAppsBindedToApiV2Invoker(
        ListAppsBindedToApiV2Request request) {
        return new SyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response>(request,
            ApigMeta.listAppsBindedToApiV2, hcClient);
    }

    /** 查询APP列表 查询APP列表。
     *
     * @param ListAppsV2Request 请求对象
     * @return ListAppsV2Response */
    public ListAppsV2Response listAppsV2(ListAppsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppsV2);
    }

    /** 查询APP列表 查询APP列表。
     *
     * @param ListAppsV2Request 请求对象
     * @return SyncInvoker<ListAppsV2Request, ListAppsV2Response> */
    public SyncInvoker<ListAppsV2Request, ListAppsV2Response> listAppsV2Invoker(ListAppsV2Request request) {
        return new SyncInvoker<ListAppsV2Request, ListAppsV2Response>(request, ApigMeta.listAppsV2, hcClient);
    }

    /** 重置密钥 重置指定APP的密钥。
     *
     * @param ResettingAppSecretV2Request 请求对象
     * @return ResettingAppSecretV2Response */
    public ResettingAppSecretV2Response resettingAppSecretV2(ResettingAppSecretV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.resettingAppSecretV2);
    }

    /** 重置密钥 重置指定APP的密钥。
     *
     * @param ResettingAppSecretV2Request 请求对象
     * @return SyncInvoker<ResettingAppSecretV2Request, ResettingAppSecretV2Response> */
    public SyncInvoker<ResettingAppSecretV2Request, ResettingAppSecretV2Response> resettingAppSecretV2Invoker(
        ResettingAppSecretV2Request request) {
        return new SyncInvoker<ResettingAppSecretV2Request, ResettingAppSecretV2Response>(request,
            ApigMeta.resettingAppSecretV2, hcClient);
    }

    /** 查看APP Code详情 App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param ShowDetailsOfAppCodeV2Request 请求对象
     * @return ShowDetailsOfAppCodeV2Response */
    public ShowDetailsOfAppCodeV2Response showDetailsOfAppCodeV2(ShowDetailsOfAppCodeV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfAppCodeV2);
    }

    /** 查看APP Code详情 App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param ShowDetailsOfAppCodeV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> */
    public SyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2Invoker(
        ShowDetailsOfAppCodeV2Request request) {
        return new SyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response>(request,
            ApigMeta.showDetailsOfAppCodeV2, hcClient);
    }

    /** 查看APP详情 查看指定APP的详细信息。
     *
     * @param ShowDetailsOfAppV2Request 请求对象
     * @return ShowDetailsOfAppV2Response */
    public ShowDetailsOfAppV2Response showDetailsOfAppV2(ShowDetailsOfAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfAppV2);
    }

    /** 查看APP详情 查看指定APP的详细信息。
     *
     * @param ShowDetailsOfAppV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> */
    public SyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> showDetailsOfAppV2Invoker(
        ShowDetailsOfAppV2Request request) {
        return new SyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response>(request,
            ApigMeta.showDetailsOfAppV2, hcClient);
    }

    /** 修改APP 修改指定APP的信息。其中可修改的属性为：name、remark，当支持用户自定义key和secret的开关开启时，app_key和app_secret也支持修改，其它属性不可修改。
     *
     * @param UpdateAppV2Request 请求对象
     * @return UpdateAppV2Response */
    public UpdateAppV2Response updateAppV2(UpdateAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateAppV2);
    }

    /** 修改APP 修改指定APP的信息。其中可修改的属性为：name、remark，当支持用户自定义key和secret的开关开启时，app_key和app_secret也支持修改，其它属性不可修改。
     *
     * @param UpdateAppV2Request 请求对象
     * @return SyncInvoker<UpdateAppV2Request, UpdateAppV2Response> */
    public SyncInvoker<UpdateAppV2Request, UpdateAppV2Response> updateAppV2Invoker(UpdateAppV2Request request) {
        return new SyncInvoker<UpdateAppV2Request, UpdateAppV2Response>(request, ApigMeta.updateAppV2, hcClient);
    }

    /** 导出API 导出分组下API的定义信息。导出文件内容符合swagger标准规范，API网关自定义扩展字段请参考《API网关开发指南》的“导入导出API：扩展定义”章节。
     *
     * @param ExportApiDefinitionsV2Request 请求对象
     * @return ExportApiDefinitionsV2Response */
    public ExportApiDefinitionsV2Response exportApiDefinitionsV2(ExportApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.exportApiDefinitionsV2);
    }

    /** 导出API 导出分组下API的定义信息。导出文件内容符合swagger标准规范，API网关自定义扩展字段请参考《API网关开发指南》的“导入导出API：扩展定义”章节。
     *
     * @param ExportApiDefinitionsV2Request 请求对象
     * @return SyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> */
    public SyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> exportApiDefinitionsV2Invoker(
        ExportApiDefinitionsV2Request request) {
        return new SyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response>(request,
            ApigMeta.exportApiDefinitionsV2, hcClient);
    }

    /** 导入API 导入API。导入文件内容需要符合swagger标准规范，API网关自定义扩展字段请参考《API网关开发指南》的“导入导出API：扩展定义”章节。
     *
     * @param ImportApiDefinitionsV2Request 请求对象
     * @return ImportApiDefinitionsV2Response */
    public ImportApiDefinitionsV2Response importApiDefinitionsV2(ImportApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.importApiDefinitionsV2);
    }

    /** 导入API 导入API。导入文件内容需要符合swagger标准规范，API网关自定义扩展字段请参考《API网关开发指南》的“导入导出API：扩展定义”章节。
     *
     * @param ImportApiDefinitionsV2Request 请求对象
     * @return SyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> */
    public SyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> importApiDefinitionsV2Invoker(
        ImportApiDefinitionsV2Request request) {
        return new SyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response>(request,
            ApigMeta.importApiDefinitionsV2, hcClient);
    }

    /** 添加后端实例 为指定的VPC通道添加弹性云服务器
     *
     * @param AddingBackendInstancesV2Request 请求对象
     * @return AddingBackendInstancesV2Response */
    public AddingBackendInstancesV2Response addingBackendInstancesV2(AddingBackendInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.addingBackendInstancesV2);
    }

    /** 添加后端实例 为指定的VPC通道添加弹性云服务器
     *
     * @param AddingBackendInstancesV2Request 请求对象
     * @return SyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> */
    public SyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> addingBackendInstancesV2Invoker(
        AddingBackendInstancesV2Request request) {
        return new SyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response>(request,
            ApigMeta.addingBackendInstancesV2, hcClient);
    }

    /** 创建VPC通道 在API网关中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便API网关直接访问私有VPC资源。 &gt; 每个用户最多创建30个VPC通道。
     *
     * @param CreateVpcChannelV2Request 请求对象
     * @return CreateVpcChannelV2Response */
    public CreateVpcChannelV2Response createVpcChannelV2(CreateVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createVpcChannelV2);
    }

    /** 创建VPC通道 在API网关中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便API网关直接访问私有VPC资源。 &gt; 每个用户最多创建30个VPC通道。
     *
     * @param CreateVpcChannelV2Request 请求对象
     * @return SyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response> */
    public SyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response> createVpcChannelV2Invoker(
        CreateVpcChannelV2Request request) {
        return new SyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response>(request,
            ApigMeta.createVpcChannelV2, hcClient);
    }

    /** 删除后端实例 删除指定VPC通道中的弹性云服务器
     *
     * @param DeleteBackendInstanceV2Request 请求对象
     * @return DeleteBackendInstanceV2Response */
    public DeleteBackendInstanceV2Response deleteBackendInstanceV2(DeleteBackendInstanceV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteBackendInstanceV2);
    }

    /** 删除后端实例 删除指定VPC通道中的弹性云服务器
     *
     * @param DeleteBackendInstanceV2Request 请求对象
     * @return SyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> */
    public SyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> deleteBackendInstanceV2Invoker(
        DeleteBackendInstanceV2Request request) {
        return new SyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response>(request,
            ApigMeta.deleteBackendInstanceV2, hcClient);
    }

    /** 删除VPC通道 删除指定的VPC通道
     *
     * @param DeleteVpcChannelV2Request 请求对象
     * @return DeleteVpcChannelV2Response */
    public DeleteVpcChannelV2Response deleteVpcChannelV2(DeleteVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteVpcChannelV2);
    }

    /** 删除VPC通道 删除指定的VPC通道
     *
     * @param DeleteVpcChannelV2Request 请求对象
     * @return SyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> */
    public SyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> deleteVpcChannelV2Invoker(
        DeleteVpcChannelV2Request request) {
        return new SyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response>(request,
            ApigMeta.deleteVpcChannelV2, hcClient);
    }

    /** 查看后端实例列表 查看指定VPC通道的弹性云服务器列表。
     *
     * @param ListBackendInstancesV2Request 请求对象
     * @return ListBackendInstancesV2Response */
    public ListBackendInstancesV2Response listBackendInstancesV2(ListBackendInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listBackendInstancesV2);
    }

    /** 查看后端实例列表 查看指定VPC通道的弹性云服务器列表。
     *
     * @param ListBackendInstancesV2Request 请求对象
     * @return SyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response> */
    public SyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response> listBackendInstancesV2Invoker(
        ListBackendInstancesV2Request request) {
        return new SyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response>(request,
            ApigMeta.listBackendInstancesV2, hcClient);
    }

    /** 查询VPC通道列表 查看VPC通道列表
     *
     * @param ListVpcChannelsV2Request 请求对象
     * @return ListVpcChannelsV2Response */
    public ListVpcChannelsV2Response listVpcChannelsV2(ListVpcChannelsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listVpcChannelsV2);
    }

    /** 查询VPC通道列表 查看VPC通道列表
     *
     * @param ListVpcChannelsV2Request 请求对象
     * @return SyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response> */
    public SyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response> listVpcChannelsV2Invoker(
        ListVpcChannelsV2Request request) {
        return new SyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response>(request, ApigMeta.listVpcChannelsV2,
            hcClient);
    }

    /** 查看VPC通道详情 查看指定的VPC通道详情
     *
     * @param ShowDetailsOfVpcChannelV2Request 请求对象
     * @return ShowDetailsOfVpcChannelV2Response */
    public ShowDetailsOfVpcChannelV2Response showDetailsOfVpcChannelV2(ShowDetailsOfVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfVpcChannelV2);
    }

    /** 查看VPC通道详情 查看指定的VPC通道详情
     *
     * @param ShowDetailsOfVpcChannelV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> */
    public SyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2Invoker(
        ShowDetailsOfVpcChannelV2Request request) {
        return new SyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response>(request,
            ApigMeta.showDetailsOfVpcChannelV2, hcClient);
    }

    /** 更新VPC通道 更新指定VPC通道的参数
     *
     * @param UpdateVpcChannelV2Request 请求对象
     * @return UpdateVpcChannelV2Response */
    public UpdateVpcChannelV2Response updateVpcChannelV2(UpdateVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateVpcChannelV2);
    }

    /** 更新VPC通道 更新指定VPC通道的参数
     *
     * @param UpdateVpcChannelV2Request 请求对象
     * @return SyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> */
    public SyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> updateVpcChannelV2Invoker(
        UpdateVpcChannelV2Request request) {
        return new SyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response>(request,
            ApigMeta.updateVpcChannelV2, hcClient);
    }

}
