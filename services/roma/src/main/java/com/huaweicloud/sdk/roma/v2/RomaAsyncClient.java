package com.huaweicloud.sdk.roma.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.roma.v2.model.*;

public class RomaAsyncClient {
    protected HcClient hcClient;

    public RomaAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RomaAsyncClient> newBuilder() {
        return new ClientBuilder<>(RomaAsyncClient::new);
    }


    /**
     * 添加子设备到网关
     * 添加子设备到网关
     *
     * @param AddSubsetsToGatewayRequest 请求对象
     * @return CompletableFuture<AddSubsetsToGatewayResponse>
     */
    public CompletableFuture<AddSubsetsToGatewayResponse> addSubsetsToGatewayAsync(AddSubsetsToGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.addSubsetsToGateway);
    }

    /**
     * 客户端配额绑定客户端应用列表
     * 客户端配额绑定客户端应用列表
     *
     * @param AssociateAppsForAppQuotaRequest 请求对象
     * @return CompletableFuture<AssociateAppsForAppQuotaResponse>
     */
    public CompletableFuture<AssociateAppsForAppQuotaResponse> associateAppsForAppQuotaAsync(AssociateAppsForAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.associateAppsForAppQuota);
    }

    /**
     * 绑定域名证书
     * 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。 本章节主要介绍为特定域名绑定证书。
     *
     * @param AssociateCertificateV2Request 请求对象
     * @return CompletableFuture<AssociateCertificateV2Response>
     */
    public CompletableFuture<AssociateCertificateV2Response> associateCertificateV2Async(AssociateCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.associateCertificateV2);
    }

    /**
     * 绑定域名
     * 用户自定义的域名，需要CNAME到API分组的子域名上才能生效，具体方法请参见《云解析服务用户指南》的“添加CANME类型记录集”章节。 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     *
     * @param AssociateDomainV2Request 请求对象
     * @return CompletableFuture<AssociateDomainV2Response>
     */
    public CompletableFuture<AssociateDomainV2Response> associateDomainV2Async(AssociateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.associateDomainV2);
    }

    /**
     * 绑定签名密钥
     * 签名密钥创建后，需要绑定到API才能生效。  将签名密钥绑定到API后，则ROMA Connect APIC请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。  将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     *
     * @param AssociateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<AssociateSignatureKeyV2Response>
     */
    public CompletableFuture<AssociateSignatureKeyV2Response> associateSignatureKeyV2Async(AssociateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.associateSignatureKeyV2);
    }

    /**
     * 批量添加设备到设备分组
     * 批量添加设备到设备分组
     *
     * @param BatchAddDeviceToGroupRequest 请求对象
     * @return CompletableFuture<BatchAddDeviceToGroupResponse>
     */
    public CompletableFuture<BatchAddDeviceToGroupResponse> batchAddDeviceToGroupAsync(BatchAddDeviceToGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchAddDeviceToGroup);
    }

    /**
     * 批量删除Topic
     * 批量删除Topic。
     *
     * @param BatchDeleteMqsInstanceTopicRequest 请求对象
     * @return CompletableFuture<BatchDeleteMqsInstanceTopicResponse>
     */
    public CompletableFuture<BatchDeleteMqsInstanceTopicResponse> batchDeleteMqsInstanceTopicAsync(BatchDeleteMqsInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchDeleteMqsInstanceTopic);
    }

    /**
     * 批量删除规则
     * 批量删除规则
     *
     * @param BatchDeleteRulesRequest 请求对象
     * @return CompletableFuture<BatchDeleteRulesResponse>
     */
    public CompletableFuture<BatchDeleteRulesResponse> batchDeleteRulesAsync(BatchDeleteRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchDeleteRules);
    }

    /**
     * 设备批量下线
     * 设备批量下线
     *
     * @param BatchFreezeDevicesRequest 请求对象
     * @return CompletableFuture<BatchFreezeDevicesResponse>
     */
    public CompletableFuture<BatchFreezeDevicesResponse> batchFreezeDevicesAsync(BatchFreezeDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchFreezeDevices);
    }

    /**
     * 校验自定义后端API定义
     * 校验自定义后端API定义。校验自定义后端API的路径或名称是否已存在
     *
     * @param CheckLivedataApisV2Request 请求对象
     * @return CompletableFuture<CheckLivedataApisV2Response>
     */
    public CompletableFuture<CheckLivedataApisV2Response> checkLivedataApisV2Async(CheckLivedataApisV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkLivedataApisV2);
    }

    /**
     * 自动生成APP Code
     * 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     *
     * @param CreateAppCodeAutoV2Request 请求对象
     * @return CompletableFuture<CreateAppCodeAutoV2Response>
     */
    public CompletableFuture<CreateAppCodeAutoV2Response> createAppCodeAutoV2Async(CreateAppCodeAutoV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createAppCodeAutoV2);
    }

    /**
     * 创建APP Code
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param CreateAppCodeV2Request 请求对象
     * @return CompletableFuture<CreateAppCodeV2Response>
     */
    public CompletableFuture<CreateAppCodeV2Response> createAppCodeV2Async(CreateAppCodeV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createAppCodeV2);
    }

    /**
     * 创建应用配置
     * 创建应用配置
     *
     * @param CreateAppConfigV2Request 请求对象
     * @return CompletableFuture<CreateAppConfigV2Response>
     */
    public CompletableFuture<CreateAppConfigV2Response> createAppConfigV2Async(CreateAppConfigV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createAppConfigV2);
    }

    /**
     * 创建客户端配额
     * 创建客户端配额
     *
     * @param CreateAppQuotaRequest 请求对象
     * @return CompletableFuture<CreateAppQuotaResponse>
     */
    public CompletableFuture<CreateAppQuotaResponse> createAppQuotaAsync(CreateAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createAppQuota);
    }

    /**
     * 创建命令
     * 创建命令
     *
     * @param CreateCommandRequest 请求对象
     * @return CompletableFuture<CreateCommandResponse>
     */
    public CompletableFuture<CreateCommandResponse> createCommandAsync(CreateCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createCommand);
    }

    /**
     * 创建自定义认证
     * 创建自定义认证
     *
     * @param CreateCustomAuthorizerV2Request 请求对象
     * @return CompletableFuture<CreateCustomAuthorizerV2Response>
     */
    public CompletableFuture<CreateCustomAuthorizerV2Response> createCustomAuthorizerV2Async(CreateCustomAuthorizerV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createCustomAuthorizerV2);
    }

    /**
     * 添加目标数据源
     * 添加目标数据源
     *
     * @param CreateDestinationRequest 请求对象
     * @return CompletableFuture<CreateDestinationResponse>
     */
    public CompletableFuture<CreateDestinationResponse> createDestinationAsync(CreateDestinationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createDestination);
    }

    /**
     * 创建设备
     * 创建设备
     *
     * @param CreateDeviceRequest 请求对象
     * @return CompletableFuture<CreateDeviceResponse>
     */
    public CompletableFuture<CreateDeviceResponse> createDeviceAsync(CreateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createDevice);
    }

    /**
     * 创建设备分组
     * 创建设备分组
     *
     * @param CreateDeviceGroupRequest 请求对象
     * @return CompletableFuture<CreateDeviceGroupResponse>
     */
    public CompletableFuture<CreateDeviceGroupResponse> createDeviceGroupAsync(CreateDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createDeviceGroup);
    }

    /**
     * 创建环境
     * 在实际的生产中，API提供者可能有多个环境，如开发环境、测试环境、生产环境等，用户可以自由将API发布到某个环境，供调用者调用。  对于不同的环境，API的版本、请求地址甚至于包括请求消息等均有可能不同。如：某个API，v1.0的版本为稳定版本，发布到了生产环境供生产使用，同时，该API正处于迭代中，v1.1的版本是开发人员交付测试人员进行测试的版本，发布在测试环境上，而v1.2的版本目前开发团队正处于开发过程中，可以发布到开发环境进行自测等。  为此，ROMA Connect APIC提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接入ROMA Connect APIC。
     *
     * @param CreateEnvironmentV2Request 请求对象
     * @return CompletableFuture<CreateEnvironmentV2Response>
     */
    public CompletableFuture<CreateEnvironmentV2Response> createEnvironmentV2Async(CreateEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createEnvironmentV2);
    }

    /**
     * 新建变量
     * 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。  用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，ROMA Connect APIC会将这些变量替换成真实的变量值，以达到不同环境的区分效果。  环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。 &gt; 1.环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量   2.环境变量区分大小写，即变量ABC与变量abc是两个不同的变量   3.设置了环境变量后，使用到该变量的API的调试功能将不可使用。   4.定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     *
     * @param CreateEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<CreateEnvironmentVariableV2Response>
     */
    public CompletableFuture<CreateEnvironmentVariableV2Response> createEnvironmentVariableV2Async(CreateEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createEnvironmentVariableV2);
    }

    /**
     * 实例配置特性
     * 为实例配置需要的特性。  支持配置的特性列表及特性配置请参考“附录 &gt; 实例支持的APIC特性”
     *
     * @param CreateFeatureV2Request 请求对象
     * @return CompletableFuture<CreateFeatureV2Response>
     */
    public CompletableFuture<CreateFeatureV2Response> createFeatureV2Async(CreateFeatureV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createFeatureV2);
    }

    /**
     * 创建后端API脚本
     * 在某个实例中创建后端API脚本。
     *
     * @param CreateLiveDataApiScriptV2Request 请求对象
     * @return CompletableFuture<CreateLiveDataApiScriptV2Response>
     */
    public CompletableFuture<CreateLiveDataApiScriptV2Response> createLiveDataApiScriptV2Async(CreateLiveDataApiScriptV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createLiveDataApiScriptV2);
    }

    /**
     * 创建后端API
     * 在某个实例中创建后端API。
     *
     * @param CreateLiveDataApiV2Request 请求对象
     * @return CompletableFuture<CreateLiveDataApiV2Response>
     */
    public CompletableFuture<CreateLiveDataApiV2Response> createLiveDataApiV2Async(CreateLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createLiveDataApiV2);
    }

    /**
     * 创建Topic
     * 创建Topic。
     *
     * @param CreateMqsInstanceTopicRequest 请求对象
     * @return CompletableFuture<CreateMqsInstanceTopicResponse>
     */
    public CompletableFuture<CreateMqsInstanceTopicResponse> createMqsInstanceTopicAsync(CreateMqsInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createMqsInstanceTopic);
    }

    /**
     * 创建产品
     * 创建产品
     *
     * @param CreateProductRequest 请求对象
     * @return CompletableFuture<CreateProductResponse>
     */
    public CompletableFuture<CreateProductResponse> createProductAsync(CreateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createProduct);
    }

    /**
     * 创建产品模板
     * 创建产品模板
     *
     * @param CreateProductTemplateRequest 请求对象
     * @return CompletableFuture<CreateProductTemplateResponse>
     */
    public CompletableFuture<CreateProductTemplateResponse> createProductTemplateAsync(CreateProductTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createProductTemplate);
    }

    /**
     * 添加产品主题
     * 添加产品主题
     *
     * @param CreateProductTopicRequest 请求对象
     * @return CompletableFuture<CreateProductTopicResponse>
     */
    public CompletableFuture<CreateProductTopicResponse> createProductTopicAsync(CreateProductTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createProductTopic);
    }

    /**
     * 创建属性
     * 创建属性
     *
     * @param CreatePropertyRequest 请求对象
     * @return CompletableFuture<CreatePropertyResponse>
     */
    public CompletableFuture<CreatePropertyResponse> createPropertyAsync(CreatePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createProperty);
    }

    /**
     * 创建请求属性
     * 创建请求属性
     *
     * @param CreateRequestPropertyRequest 请求对象
     * @return CompletableFuture<CreateRequestPropertyResponse>
     */
    public CompletableFuture<CreateRequestPropertyResponse> createRequestPropertyAsync(CreateRequestPropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createRequestProperty);
    }

    /**
     * 创建流控策略
     * 当API上线后，系统会默认给每个API提供一个流控策略，API提供者可以根据自身API的服务能力及负载情况变更这个流控策略。 流控策略即限制API在一定长度的时间内，能够允许被访问的最大次数。
     *
     * @param CreateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<CreateRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2Async(CreateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createRequestThrottlingPolicyV2);
    }

    /**
     * 创建响应属性
     * 创建响应属性
     *
     * @param CreateResponsePropertyRequest 请求对象
     * @return CompletableFuture<CreateResponsePropertyResponse>
     */
    public CompletableFuture<CreateResponsePropertyResponse> createResponsePropertyAsync(CreateResponsePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createResponseProperty);
    }

    /**
     * 创建规则
     * 创建规则
     *
     * @param CreateRuleRequest 请求对象
     * @return CompletableFuture<CreateRuleResponse>
     */
    public CompletableFuture<CreateRuleResponse> createRuleAsync(CreateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createRule);
    }

    /**
     * 创建服务
     * 创建服务
     *
     * @param CreateServiceRequest 请求对象
     * @return CompletableFuture<CreateServiceResponse>
     */
    public CompletableFuture<CreateServiceResponse> createServiceAsync(CreateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createService);
    }

    /**
     * 创建签名密钥
     * 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。  其中，签名密钥就是API安全保护机制的一种。  租户创建一个签名密钥，并将签名密钥与API进行绑定，则ROMA Connect APIC在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是ROMA Connect APIC发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。 
     *
     * @param CreateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<CreateSignatureKeyV2Response>
     */
    public CompletableFuture<CreateSignatureKeyV2Response> createSignatureKeyV2Async(CreateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createSignatureKeyV2);
    }

    /**
     * 添加源数据源
     * 添加源数据源
     *
     * @param CreateSourceRequest 请求对象
     * @return CompletableFuture<CreateSourceResponse>
     */
    public CompletableFuture<CreateSourceResponse> createSourceAsync(CreateSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createSource);
    }

    /**
     * 创建特殊设置
     * 流控策略可以限制一段时间内可以访问API的最大次数，也可以限制一段时间内单个租户和单个APP可以访问API的最大次数。  如果想要对某个特定的APP进行特殊设置，例如设置所有APP每分钟的访问次数为500次，但想设置APP1每分钟的访问次数为800次，可以通过在流控策略中设置特殊APP来实现该功能。  为流控策略添加一个特殊设置的对象，可以是APP，也可以是租户。
     *
     * @param CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return CompletableFuture<CreateSpecialThrottlingConfigurationV2Response>
     */
    public CompletableFuture<CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2Async(CreateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createSpecialThrottlingConfigurationV2);
    }

    /**
     * 测试后端API
     * 测试后端API是否可用。
     *
     * @param DebugLiveDataApiV2Request 请求对象
     * @return CompletableFuture<DebugLiveDataApiV2Response>
     */
    public CompletableFuture<DebugLiveDataApiV2Response> debugLiveDataApiV2Async(DebugLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.debugLiveDataApiV2);
    }

    /**
     * 规则调试
     * 规则调试
     *
     * @param DebugRuleRequest 请求对象
     * @return CompletableFuture<DebugRuleResponse>
     */
    public CompletableFuture<DebugRuleResponse> debugRuleAsync(DebugRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.debugRule);
    }

    /**
     * 删除APP的访问控制
     * 删除客户端配置的访问控制信息。
     *
     * @param DeleteAppAclRequest 请求对象
     * @return CompletableFuture<DeleteAppAclResponse>
     */
    public CompletableFuture<DeleteAppAclResponse> deleteAppAclAsync(DeleteAppAclRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteAppAcl);
    }

    /**
     * 删除APP Code
     * 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     *
     * @param DeleteAppCodeV2Request 请求对象
     * @return CompletableFuture<DeleteAppCodeV2Response>
     */
    public CompletableFuture<DeleteAppCodeV2Response> deleteAppCodeV2Async(DeleteAppCodeV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteAppCodeV2);
    }

    /**
     * 删除应用配置
     * 删除应用配置
     *
     * @param DeleteAppConfigV2Request 请求对象
     * @return CompletableFuture<DeleteAppConfigV2Response>
     */
    public CompletableFuture<DeleteAppConfigV2Response> deleteAppConfigV2Async(DeleteAppConfigV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteAppConfigV2);
    }

    /**
     * 删除客户端配额
     * 删除客户端配额。删除客户端配额时，同时删除客户端配额和客户端应用的关联关系
     *
     * @param DeleteAppQuotaRequest 请求对象
     * @return CompletableFuture<DeleteAppQuotaResponse>
     */
    public CompletableFuture<DeleteAppQuotaResponse> deleteAppQuotaAsync(DeleteAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteAppQuota);
    }

    /**
     * 删除命令
     * 删除命令
     *
     * @param DeleteCommandRequest 请求对象
     * @return CompletableFuture<DeleteCommandResponse>
     */
    public CompletableFuture<DeleteCommandResponse> deleteCommandAsync(DeleteCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteCommand);
    }

    /**
     * 删除自定义认证
     * 删除自定义认证
     *
     * @param DeleteCustomAuthorizerV2Request 请求对象
     * @return CompletableFuture<DeleteCustomAuthorizerV2Response>
     */
    public CompletableFuture<DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2Async(DeleteCustomAuthorizerV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteCustomAuthorizerV2);
    }

    /**
     * 删除目标数据源
     * 删除目标数据源
     *
     * @param DeleteDestinationRequest 请求对象
     * @return CompletableFuture<DeleteDestinationResponse>
     */
    public CompletableFuture<DeleteDestinationResponse> deleteDestinationAsync(DeleteDestinationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteDestination);
    }

    /**
     * 删除设备
     * 删除指定设备ID的设备
     *
     * @param DeleteDeviceRequest 请求对象
     * @return CompletableFuture<DeleteDeviceResponse>
     */
    public CompletableFuture<DeleteDeviceResponse> deleteDeviceAsync(DeleteDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteDevice);
    }

    /**
     * 删除设备分组内的设备
     * 删除设备分组内的设备
     *
     * @param DeleteDeviceFromGroupRequest 请求对象
     * @return CompletableFuture<DeleteDeviceFromGroupResponse>
     */
    public CompletableFuture<DeleteDeviceFromGroupResponse> deleteDeviceFromGroupAsync(DeleteDeviceFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteDeviceFromGroup);
    }

    /**
     * 删除设备分组
     * 删除分组
     *
     * @param DeleteDeviceGroupRequest 请求对象
     * @return CompletableFuture<DeleteDeviceGroupResponse>
     */
    public CompletableFuture<DeleteDeviceGroupResponse> deleteDeviceGroupAsync(DeleteDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteDeviceGroup);
    }

    /**
     * 删除环境
     * 删除指定的环境。 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。
     *
     * @param DeleteEnvironmentV2Request 请求对象
     * @return CompletableFuture<DeleteEnvironmentV2Response>
     */
    public CompletableFuture<DeleteEnvironmentV2Response> deleteEnvironmentV2Async(DeleteEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteEnvironmentV2);
    }

    /**
     * 删除变量
     * 删除指定的环境变量。
     *
     * @param DeleteEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<DeleteEnvironmentVariableV2Response>
     */
    public CompletableFuture<DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2Async(DeleteEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteEnvironmentVariableV2);
    }

    /**
     * 删除后端API
     * 在某个实例中删除后端API。
     *
     * @param DeleteLiveDataApiV2Request 请求对象
     * @return CompletableFuture<DeleteLiveDataApiV2Response>
     */
    public CompletableFuture<DeleteLiveDataApiV2Response> deleteLiveDataApiV2Async(DeleteLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteLiveDataApiV2);
    }

    /**
     * 批量删除Topic
     * 批量删除Topic。
     *
     * @param DeleteMqsInstanceTopicRequest 请求对象
     * @return CompletableFuture<DeleteMqsInstanceTopicResponse>
     */
    public CompletableFuture<DeleteMqsInstanceTopicResponse> deleteMqsInstanceTopicAsync(DeleteMqsInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteMqsInstanceTopic);
    }

    /**
     * 删除产品
     * 删除产品
     *
     * @param DeleteProductRequest 请求对象
     * @return CompletableFuture<DeleteProductResponse>
     */
    public CompletableFuture<DeleteProductResponse> deleteProductAsync(DeleteProductRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteProduct);
    }

    /**
     * 删除产品模板
     * 删除产品模板
     *
     * @param DeleteProductTemplateRequest 请求对象
     * @return CompletableFuture<DeleteProductTemplateResponse>
     */
    public CompletableFuture<DeleteProductTemplateResponse> deleteProductTemplateAsync(DeleteProductTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteProductTemplate);
    }

    /**
     * 删除产品主题
     * 删除产品主题
     *
     * @param DeleteProductTopicRequest 请求对象
     * @return CompletableFuture<DeleteProductTopicResponse>
     */
    public CompletableFuture<DeleteProductTopicResponse> deleteProductTopicAsync(DeleteProductTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteProductTopic);
    }

    /**
     * 删除请求属性
     * 删除请求属性
     *
     * @param DeleteRequestPropertyRequest 请求对象
     * @return CompletableFuture<DeleteRequestPropertyResponse>
     */
    public CompletableFuture<DeleteRequestPropertyResponse> deleteRequestPropertyAsync(DeleteRequestPropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteRequestProperty);
    }

    /**
     * 删除流控策略
     * 删除指定的流控策略,以及该流控策略与API的所有绑定关系。
     *
     * @param DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<DeleteRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2Async(DeleteRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteRequestThrottlingPolicyV2);
    }

    /**
     * 删除响应属性
     * 删除响应属性
     *
     * @param DeleteResponsePropertyRequest 请求对象
     * @return CompletableFuture<DeleteResponsePropertyResponse>
     */
    public CompletableFuture<DeleteResponsePropertyResponse> deleteResponsePropertyAsync(DeleteResponsePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteResponseProperty);
    }

    /**
     * 删除规则
     * 删除规则
     *
     * @param DeleteRuleRequest 请求对象
     * @return CompletableFuture<DeleteRuleResponse>
     */
    public CompletableFuture<DeleteRuleResponse> deleteRuleAsync(DeleteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteRule);
    }

    /**
     * 删除服务
     * 删除服务
     *
     * @param DeleteServiceRequest 请求对象
     * @return CompletableFuture<DeleteServiceResponse>
     */
    public CompletableFuture<DeleteServiceResponse> deleteServiceAsync(DeleteServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteService);
    }

    /**
     * 删除签名密钥
     * 删除指定的签名密钥,删除签名密钥时，其配置的绑定关系会一并删除，相应的签名密钥会失效。
     *
     * @param DeleteSignatureKeyV2Request 请求对象
     * @return CompletableFuture<DeleteSignatureKeyV2Response>
     */
    public CompletableFuture<DeleteSignatureKeyV2Response> deleteSignatureKeyV2Async(DeleteSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteSignatureKeyV2);
    }

    /**
     * 删除源数据源
     * 删除源数据源
     *
     * @param DeleteSourceRequest 请求对象
     * @return CompletableFuture<DeleteSourceResponse>
     */
    public CompletableFuture<DeleteSourceResponse> deleteSourceAsync(DeleteSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteSource);
    }

    /**
     * 删除特殊设置
     * 删除某个流控策略的某个特殊配置。
     *
     * @param DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return CompletableFuture<DeleteSpecialThrottlingConfigurationV2Response>
     */
    public CompletableFuture<DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2Async(DeleteSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteSpecialThrottlingConfigurationV2);
    }

    /**
     * 解除客户端配额和客户端应用的绑定
     * 解除客户端配额和客户端应用的绑定
     *
     * @param DisassociateAppQuotaWithAppRequest 请求对象
     * @return CompletableFuture<DisassociateAppQuotaWithAppResponse>
     */
    public CompletableFuture<DisassociateAppQuotaWithAppResponse> disassociateAppQuotaWithAppAsync(DisassociateAppQuotaWithAppRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.disassociateAppQuotaWithApp);
    }

    /**
     * 删除域名证书
     * 如果域名证书不再需要或者已过期，则可以删除证书内容。
     *
     * @param DisassociateCertificateV2Request 请求对象
     * @return CompletableFuture<DisassociateCertificateV2Response>
     */
    public CompletableFuture<DisassociateCertificateV2Response> disassociateCertificateV2Async(DisassociateCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.disassociateCertificateV2);
    }

    /**
     * 解绑域名
     * 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     *
     * @param DisassociateDomainV2Request 请求对象
     * @return CompletableFuture<DisassociateDomainV2Response>
     */
    public CompletableFuture<DisassociateDomainV2Response> disassociateDomainV2Async(DisassociateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.disassociateDomainV2);
    }

    /**
     * 解除绑定
     * 解除API与签名密钥的绑定关系。
     *
     * @param DisassociateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<DisassociateSignatureKeyV2Response>
     */
    public CompletableFuture<DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2Async(DisassociateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.disassociateSignatureKeyV2);
    }

    /**
     * 导出产品
     * 导出产品
     *
     * @param DownloadProductsRequest 请求对象
     * @return CompletableFuture<DownloadProductsResponse>
     */
    public CompletableFuture<DownloadProductsResponse> downloadProductsAsync(DownloadProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.downloadProducts);
    }

    /**
     * 导出Topic
     * 导出Topic。
     *
     * @param ExportMqsInstanceTopicRequest 请求对象
     * @return CompletableFuture<ExportMqsInstanceTopicResponse>
     */
    public CompletableFuture<ExportMqsInstanceTopicResponse> exportMqsInstanceTopicAsync(ExportMqsInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.exportMqsInstanceTopic);
    }

    /**
     * 导入Topic
     * 导入Topic。
     *
     * @param ImportMqsInstanceTopicRequest 请求对象
     * @return CompletableFuture<ImportMqsInstanceTopicResponse>
     */
    public CompletableFuture<ImportMqsInstanceTopicResponse> importMqsInstanceTopicAsync(ImportMqsInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.importMqsInstanceTopic);
    }

    /**
     * 查看签名密钥绑定的API列表
     * 查询某个签名密钥上已经绑定的API列表。
     *
     * @param ListApisBindedToSignatureKeyV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToSignatureKeyV2Response>
     */
    public CompletableFuture<ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2Async(ListApisBindedToSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisBindedToSignatureKeyV2);
    }

    /**
     * 查看签名密钥未绑定的API列表
     * 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return CompletableFuture<ListApisNotBoundWithSignatureKeyV2Response>
     */
    public CompletableFuture<ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2Async(ListApisNotBoundWithSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisNotBoundWithSignatureKeyV2);
    }

    /**
     * 查询APP Code列表
     * 查询App Code列表。
     *
     * @param ListAppCodesV2Request 请求对象
     * @return CompletableFuture<ListAppCodesV2Response>
     */
    public CompletableFuture<ListAppCodesV2Response> listAppCodesV2Async(ListAppCodesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppCodesV2);
    }

    /**
     * 查询应用配置列表
     * 查询应用配置列表
     *
     * @param ListAppConfigsV2Request 请求对象
     * @return CompletableFuture<ListAppConfigsV2Response>
     */
    public CompletableFuture<ListAppConfigsV2Response> listAppConfigsV2Async(ListAppConfigsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppConfigsV2);
    }

    /**
     * 查询客户端配额可绑定的客户端应用列表
     * 查询客户端配额可绑定的客户端应用列表。支持按客户端应用名称模糊搜索
     *
     * @param ListAppQuotaBindableAppsRequest 请求对象
     * @return CompletableFuture<ListAppQuotaBindableAppsResponse>
     */
    public CompletableFuture<ListAppQuotaBindableAppsResponse> listAppQuotaBindableAppsAsync(ListAppQuotaBindableAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppQuotaBindableApps);
    }

    /**
     * 查询客户端配额已绑定的客户端应用列表
     * 查询客户端配额已绑定的客户端应用列表。支持按客户端应用名称模糊匹配
     *
     * @param ListAppQuotaBoundAppsRequest 请求对象
     * @return CompletableFuture<ListAppQuotaBoundAppsResponse>
     */
    public CompletableFuture<ListAppQuotaBoundAppsResponse> listAppQuotaBoundAppsAsync(ListAppQuotaBoundAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppQuotaBoundApps);
    }

    /**
     * 获取客户端配额列表
     * 获取客户端配额列表。支持根据名称模糊查询
     *
     * @param ListAppQuotasRequest 请求对象
     * @return CompletableFuture<ListAppQuotasResponse>
     */
    public CompletableFuture<ListAppQuotasResponse> listAppQuotasAsync(ListAppQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppQuotas);
    }

    /**
     * 查询APP列表
     * 查询APP列表。
     *
     * @param ListAppsV2Request 请求对象
     * @return CompletableFuture<ListAppsV2Response>
     */
    public CompletableFuture<ListAppsV2Response> listAppsV2Async(ListAppsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppsV2);
    }

    /**
     * 查询命令
     * 查询命令
     *
     * @param ListCommandsRequest 请求对象
     * @return CompletableFuture<ListCommandsResponse>
     */
    public CompletableFuture<ListCommandsResponse> listCommandsAsync(ListCommandsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listCommands);
    }

    /**
     * 查询自定义认证列表
     * 查询自定义认证列表
     *
     * @param ListCustomAuthorizersV2Request 请求对象
     * @return CompletableFuture<ListCustomAuthorizersV2Response>
     */
    public CompletableFuture<ListCustomAuthorizersV2Response> listCustomAuthorizersV2Async(ListCustomAuthorizersV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listCustomAuthorizersV2);
    }

    /**
     * 查询目标数据源列表
     * 查询目标数据源列表
     *
     * @param ListDestinationsRequest 请求对象
     * @return CompletableFuture<ListDestinationsResponse>
     */
    public CompletableFuture<ListDestinationsResponse> listDestinationsAsync(ListDestinationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listDestinations);
    }

    /**
     * 查询设备
     * 查询设备
     *
     * @param ListDevicesRequest 请求对象
     * @return CompletableFuture<ListDevicesResponse>
     */
    public CompletableFuture<ListDevicesResponse> listDevicesAsync(ListDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listDevices);
    }

    /**
     * 查询产品内设备数量
     * 查询产品内设备数量
     *
     * @param ListDevicesInProductRequest 请求对象
     * @return CompletableFuture<ListDevicesInProductResponse>
     */
    public CompletableFuture<ListDevicesInProductResponse> listDevicesInProductAsync(ListDevicesInProductRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listDevicesInProduct);
    }

    /**
     * 查询变量列表
     * 查询分组下的所有环境变量的列表。
     *
     * @param ListEnvironmentVariablesV2Request 请求对象
     * @return CompletableFuture<ListEnvironmentVariablesV2Response>
     */
    public CompletableFuture<ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2Async(ListEnvironmentVariablesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listEnvironmentVariablesV2);
    }

    /**
     * 查询环境列表
     * 查询符合条件的环境列表。
     *
     * @param ListEnvironmentsV2Request 请求对象
     * @return CompletableFuture<ListEnvironmentsV2Response>
     */
    public CompletableFuture<ListEnvironmentsV2Response> listEnvironmentsV2Async(ListEnvironmentsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listEnvironmentsV2);
    }

    /**
     * 查看实例特性列表
     * 查看实例特性列表。注意：实例不支持以下特性的需要联系技术支持升级实例版本。  支持配置的特性列表及特性配置请参考“附录 &gt; 实例支持的APIC特性”
     *
     * @param ListFeaturesV2Request 请求对象
     * @return CompletableFuture<ListFeaturesV2Response>
     */
    public CompletableFuture<ListFeaturesV2Response> listFeaturesV2Async(ListFeaturesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listFeaturesV2);
    }

    /**
     * API指标统计值查询-最近一段时间
     * 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。 &gt; 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     *
     * @param ListLatelyApiStatisticsV2Request 请求对象
     * @return CompletableFuture<ListLatelyApiStatisticsV2Response>
     */
    public CompletableFuture<ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2Async(ListLatelyApiStatisticsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listLatelyApiStatisticsV2);
    }

    /**
     * 查询后端API部署历史
     * 在某个实例中查询后端API的部署记录。
     *
     * @param ListLiveDataApiDeploymentHistoryV2Request 请求对象
     * @return CompletableFuture<ListLiveDataApiDeploymentHistoryV2Response>
     */
    public CompletableFuture<ListLiveDataApiDeploymentHistoryV2Response> listLiveDataApiDeploymentHistoryV2Async(ListLiveDataApiDeploymentHistoryV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listLiveDataApiDeploymentHistoryV2);
    }

    /**
     * 查询后端API测试结果
     * 在某个实例中查询后端API的测试结果。
     *
     * @param ListLiveDataApiTestHistoryV2Request 请求对象
     * @return CompletableFuture<ListLiveDataApiTestHistoryV2Response>
     */
    public CompletableFuture<ListLiveDataApiTestHistoryV2Response> listLiveDataApiTestHistoryV2Async(ListLiveDataApiTestHistoryV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listLiveDataApiTestHistoryV2);
    }

    /**
     * 查询后端API列表
     * 获取某个实例下的所有后端API。
     *
     * @param ListLiveDataApiV2Request 请求对象
     * @return CompletableFuture<ListLiveDataApiV2Response>
     */
    public CompletableFuture<ListLiveDataApiV2Response> listLiveDataApiV2Async(ListLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listLiveDataApiV2);
    }

    /**
     * 查询自定义后端服务数据源列表
     * 查询自定义后端服务数据源列表。
     *
     * @param ListLiveDataDataSourcesV2Request 请求对象
     * @return CompletableFuture<ListLiveDataDataSourcesV2Response>
     */
    public CompletableFuture<ListLiveDataDataSourcesV2Response> listLiveDataDataSourcesV2Async(ListLiveDataDataSourcesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listLiveDataDataSourcesV2);
    }

    /**
     * 查询自定义后端服务配额
     * 查询自定义后端服务配额。
     *
     * @param ListLiveDataQuotaV2Request 请求对象
     * @return CompletableFuture<ListLiveDataQuotaV2Response>
     */
    public CompletableFuture<ListLiveDataQuotaV2Response> listLiveDataQuotaV2Async(ListLiveDataQuotaV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listLiveDataQuotaV2);
    }

    /**
     * 任务监控信息列表查询
     * 查询所有任务的监控信息
     *
     * @param ListMonitorInfosRequest 请求对象
     * @return CompletableFuture<ListMonitorInfosResponse>
     */
    public CompletableFuture<ListMonitorInfosResponse> listMonitorInfosAsync(ListMonitorInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listMonitorInfos);
    }

    /**
     * 任务监控日志查询
     * 查询单个任务的所有日志信息
     *
     * @param ListMonitorLogRequest 请求对象
     * @return CompletableFuture<ListMonitorLogResponse>
     */
    public CompletableFuture<ListMonitorLogResponse> listMonitorLogAsync(ListMonitorLogRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listMonitorLog);
    }

    /**
     * 查询Topic列表
     * 查询Topic列表。
     *
     * @param ListMqsInstanceTopicsRequest 请求对象
     * @return CompletableFuture<ListMqsInstanceTopicsResponse>
     */
    public CompletableFuture<ListMqsInstanceTopicsResponse> listMqsInstanceTopicsAsync(ListMqsInstanceTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listMqsInstanceTopics);
    }

    /**
     * 查询产品模板
     * 查询产品模板
     *
     * @param ListProductTemplatesRequest 请求对象
     * @return CompletableFuture<ListProductTemplatesResponse>
     */
    public CompletableFuture<ListProductTemplatesResponse> listProductTemplatesAsync(ListProductTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listProductTemplates);
    }

    /**
     * 查询产品主题
     * 查询产品主题
     *
     * @param ListProductTopicsRequest 请求对象
     * @return CompletableFuture<ListProductTopicsResponse>
     */
    public CompletableFuture<ListProductTopicsResponse> listProductTopicsAsync(ListProductTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listProductTopics);
    }

    /**
     * 查询产品
     * 查询产品
     *
     * @param ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse>
     */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listProducts);
    }

    /**
     * 查询某个实例的租户配置列表
     * 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     *
     * @param ListProjectCofigsV2Request 请求对象
     * @return CompletableFuture<ListProjectCofigsV2Response>
     */
    public CompletableFuture<ListProjectCofigsV2Response> listProjectCofigsV2Async(ListProjectCofigsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listProjectCofigsV2);
    }

    /**
     * 查询属性
     * 查询属性
     *
     * @param ListPropertiesRequest 请求对象
     * @return CompletableFuture<ListPropertiesResponse>
     */
    public CompletableFuture<ListPropertiesResponse> listPropertiesAsync(ListPropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listProperties);
    }

    /**
     * 查询请求属性
     * 查询请求属性
     *
     * @param ListRequestPropertiesRequest 请求对象
     * @return CompletableFuture<ListRequestPropertiesResponse>
     */
    public CompletableFuture<ListRequestPropertiesResponse> listRequestPropertiesAsync(ListRequestPropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listRequestProperties);
    }

    /**
     * 查询流控策略列表
     * 查询所有流控策略的信息。
     *
     * @param ListRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ListRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2Async(ListRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listRequestThrottlingPolicyV2);
    }

    /**
     * 查询响应属性
     * 查询响应属性
     *
     * @param ListResponsePropertiesRequest 请求对象
     * @return CompletableFuture<ListResponsePropertiesResponse>
     */
    public CompletableFuture<ListResponsePropertiesResponse> listResponsePropertiesAsync(ListResponsePropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listResponseProperties);
    }

    /**
     * 查询规则
     * 查询规则
     *
     * @param ListRulesRequest 请求对象
     * @return CompletableFuture<ListRulesResponse>
     */
    public CompletableFuture<ListRulesResponse> listRulesAsync(ListRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listRules);
    }

    /**
     * 查询服务
     * 查询服务
     *
     * @param ListServicesRequest 请求对象
     * @return CompletableFuture<ListServicesResponse>
     */
    public CompletableFuture<ListServicesResponse> listServicesAsync(ListServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listServices);
    }

    /**
     * 查询设备影子
     * 查询设备影子
     *
     * @param ListShadowsRequest 请求对象
     * @return CompletableFuture<ListShadowsResponse>
     */
    public CompletableFuture<ListShadowsResponse> listShadowsAsync(ListShadowsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listShadows);
    }

    /**
     * 查看API绑定的签名密钥列表
     * 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     *
     * @param ListSignatureKeysBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListSignatureKeysBindedToApiV2Response>
     */
    public CompletableFuture<ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2Async(ListSignatureKeysBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listSignatureKeysBindedToApiV2);
    }

    /**
     * 查询签名密钥列表
     * 查询所有签名密钥的信息。
     *
     * @param ListSignatureKeysV2Request 请求对象
     * @return CompletableFuture<ListSignatureKeysV2Response>
     */
    public CompletableFuture<ListSignatureKeysV2Response> listSignatureKeysV2Async(ListSignatureKeysV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listSignatureKeysV2);
    }

    /**
     * 查询源数据源列表
     * 查询源数据源列表
     *
     * @param ListSourcesRequest 请求对象
     * @return CompletableFuture<ListSourcesResponse>
     */
    public CompletableFuture<ListSourcesResponse> listSourcesAsync(ListSourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listSources);
    }

    /**
     * 查看特殊设置列表
     * 查看给流控策略设置的特殊配置。
     *
     * @param ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return CompletableFuture<ListSpecialThrottlingConfigurationsV2Response>
     */
    public CompletableFuture<ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2Async(ListSpecialThrottlingConfigurationsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listSpecialThrottlingConfigurationsV2);
    }

    /**
     * 查询API指标统计值
     * 查询某个实例下的API统计信息。
     *
     * @param ListStatisticsApiRequest 请求对象
     * @return CompletableFuture<ListStatisticsApiResponse>
     */
    public CompletableFuture<ListStatisticsApiResponse> listStatisticsApiAsync(ListStatisticsApiRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listStatisticsApi);
    }

    /**
     * 查询子设备
     * 查询子设备
     *
     * @param ListSubsetsRequest 请求对象
     * @return CompletableFuture<ListSubsetsResponse>
     */
    public CompletableFuture<ListSubsetsResponse> listSubsetsAsync(ListSubsetsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listSubsets);
    }

    /**
     * 查询标签列表
     * 查询标签列表
     *
     * @param ListTagsV2Request 请求对象
     * @return CompletableFuture<ListTagsV2Response>
     */
    public CompletableFuture<ListTagsV2Response> listTagsV2Async(ListTagsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listTagsV2);
    }

    /**
     * 查询设备主题
     * 查询设备主题
     *
     * @param ListTopicsRequest 请求对象
     * @return CompletableFuture<ListTopicsResponse>
     */
    public CompletableFuture<ListTopicsResponse> listTopicsAsync(ListTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listTopics);
    }

    /**
     * 部署后端API
     * 在某个实例中部署后端API。
     *
     * @param PublishLiveDataApiV2Request 请求对象
     * @return CompletableFuture<PublishLiveDataApiV2Response>
     */
    public CompletableFuture<PublishLiveDataApiV2Response> publishLiveDataApiV2Async(PublishLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.publishLiveDataApiV2);
    }

    /**
     * 重置设备鉴权信息
     * 重置设备鉴权信息
     *
     * @param ResetAuthenticationRequest 请求对象
     * @return CompletableFuture<ResetAuthenticationResponse>
     */
    public CompletableFuture<ResetAuthenticationResponse> resetAuthenticationAsync(ResetAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.resetAuthentication);
    }

    /**
     * 重发消息
     * 重发消息。
     *
     * @param ResetMessagesRequest 请求对象
     * @return CompletableFuture<ResetMessagesResponse>
     */
    public CompletableFuture<ResetMessagesResponse> resetMessagesAsync(ResetMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.resetMessages);
    }

    /**
     * 重置产品鉴权信息
     * 重置产品鉴权信息
     *
     * @param ResetProductAuthenticationRequest 请求对象
     * @return CompletableFuture<ResetProductAuthenticationResponse>
     */
    public CompletableFuture<ResetProductAuthenticationResponse> resetProductAuthenticationAsync(ResetProductAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.resetProductAuthentication);
    }

    /**
     * 发送命令
     * 发送命令
     *
     * @param SendCommandRequest 请求对象
     * @return CompletableFuture<SendCommandResponse>
     */
    public CompletableFuture<SendCommandResponse> sendCommandAsync(SendCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.sendCommand);
    }

    /**
     * 查询客户端应用关联的应用配额
     * 查看指定客户端应用关联的应用配额。
     *
     * @param ShowAppBoundAppQuotaRequest 请求对象
     * @return CompletableFuture<ShowAppBoundAppQuotaResponse>
     */
    public CompletableFuture<ShowAppBoundAppQuotaResponse> showAppBoundAppQuotaAsync(ShowAppBoundAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showAppBoundAppQuota);
    }

    /**
     * 获取客户端配额详情
     * 获取客户端配额详情
     *
     * @param ShowAppQuotaRequest 请求对象
     * @return CompletableFuture<ShowAppQuotaResponse>
     */
    public CompletableFuture<ShowAppQuotaResponse> showAppQuotaAsync(ShowAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showAppQuota);
    }

    /**
     * 查询设备鉴权信息
     * 查询设备鉴权信息
     *
     * @param ShowAuthenticationRequest 请求对象
     * @return CompletableFuture<ShowAuthenticationResponse>
     */
    public CompletableFuture<ShowAuthenticationResponse> showAuthenticationAsync(ShowAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showAuthentication);
    }

    /**
     * 查询命令详情
     * 查询命令详情
     *
     * @param ShowCommandRequest 请求对象
     * @return CompletableFuture<ShowCommandResponse>
     */
    public CompletableFuture<ShowCommandResponse> showCommandAsync(ShowCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showCommand);
    }

    /**
     * 查看APP的访问控制详情
     * 查看APP的访问控制详情。
     *
     * @param ShowDetailsOfAppAclRequest 请求对象
     * @return CompletableFuture<ShowDetailsOfAppAclResponse>
     */
    public CompletableFuture<ShowDetailsOfAppAclResponse> showDetailsOfAppAclAsync(ShowDetailsOfAppAclRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfAppAcl);
    }

    /**
     * 查看APP Code详情
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param ShowDetailsOfAppCodeV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAppCodeV2Response>
     */
    public CompletableFuture<ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2Async(ShowDetailsOfAppCodeV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfAppCodeV2);
    }

    /**
     * 查看应用配置详情
     * 查看应用配置详情
     *
     * @param ShowDetailsOfAppConfigV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAppConfigV2Response>
     */
    public CompletableFuture<ShowDetailsOfAppConfigV2Response> showDetailsOfAppConfigV2Async(ShowDetailsOfAppConfigV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfAppConfigV2);
    }

    /**
     * 查看APP详情
     * 查看指定APP的详细信息。
     *
     * @param ShowDetailsOfAppV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAppV2Response>
     */
    public CompletableFuture<ShowDetailsOfAppV2Response> showDetailsOfAppV2Async(ShowDetailsOfAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfAppV2);
    }

    /**
     * 查看自定义认证详情
     * 查看自定义认证详情
     *
     * @param ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfCustomAuthorizersV2Response>
     */
    public CompletableFuture<ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2Async(ShowDetailsOfCustomAuthorizersV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfCustomAuthorizersV2);
    }

    /**
     * 查看域名证书
     * 查看域名下绑定的证书详情。
     *
     * @param ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfDomainNameCertificateV2Response>
     */
    public CompletableFuture<ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2Async(ShowDetailsOfDomainNameCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfDomainNameCertificateV2);
    }

    /**
     * 查看变量详情
     * 查看指定的环境变量的详情。
     *
     * @param ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfEnvironmentVariableV2Response>
     */
    public CompletableFuture<ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2Async(ShowDetailsOfEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfEnvironmentVariableV2);
    }

    /**
     * 查看ROMA Connect实例详情
     * 查看ROMA Connect实例详情
     *
     * @param ShowDetailsOfInstanceV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfInstanceV2Response>
     */
    public CompletableFuture<ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2Async(ShowDetailsOfInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfInstanceV2);
    }

    /**
     * 查看流控策略详情
     * 查看指定流控策略的详细信息。
     *
     * @param ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2Async(ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfRequestThrottlingPolicyV2);
    }

    /**
     * 查询设备详情
     * 查询设备详情
     *
     * @param ShowDeviceRequest 请求对象
     * @return CompletableFuture<ShowDeviceResponse>
     */
    public CompletableFuture<ShowDeviceResponse> showDeviceAsync(ShowDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDevice);
    }

    /**
     * 查询设备分组详情
     * 获取设备分组及下一层分组信息
     *
     * @param ShowDeviceGroupRequest 请求对象
     * @return CompletableFuture<ShowDeviceGroupResponse>
     */
    public CompletableFuture<ShowDeviceGroupResponse> showDeviceGroupAsync(ShowDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDeviceGroup);
    }

    /**
     * 查询所有设备分组
     * 查询所有设备分组
     *
     * @param ShowDeviceGroupTreeRequest 请求对象
     * @return CompletableFuture<ShowDeviceGroupTreeResponse>
     */
    public CompletableFuture<ShowDeviceGroupTreeResponse> showDeviceGroupTreeAsync(ShowDeviceGroupTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDeviceGroupTree);
    }

    /**
     * 查询后端API详情
     * 查询后端API的详细信息。
     *
     * @param ShowLiveDataApiV2Request 请求对象
     * @return CompletableFuture<ShowLiveDataApiV2Response>
     */
    public CompletableFuture<ShowLiveDataApiV2Response> showLiveDataApiV2Async(ShowLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showLiveDataApiV2);
    }

    /**
     * 查询消息
     * 查询消息。
     *
     * @param ShowMqsInstanceMessagesRequest 请求对象
     * @return CompletableFuture<ShowMqsInstanceMessagesResponse>
     */
    public CompletableFuture<ShowMqsInstanceMessagesResponse> showMqsInstanceMessagesAsync(ShowMqsInstanceMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showMqsInstanceMessages);
    }

    /**
     * 查询Topic权限
     * 查询Topic权限。
     *
     * @param ShowMqsInstanceTopicAccessPolicyRequest 请求对象
     * @return CompletableFuture<ShowMqsInstanceTopicAccessPolicyResponse>
     */
    public CompletableFuture<ShowMqsInstanceTopicAccessPolicyResponse> showMqsInstanceTopicAccessPolicyAsync(ShowMqsInstanceTopicAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showMqsInstanceTopicAccessPolicy);
    }

    /**
     * 查询产品详情
     * 查询产品详情
     *
     * @param ShowProductRequest 请求对象
     * @return CompletableFuture<ShowProductResponse>
     */
    public CompletableFuture<ShowProductResponse> showProductAsync(ShowProductRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showProduct);
    }

    /**
     * 查询产品鉴权信息
     * 查询产品鉴权信息
     *
     * @param ShowProductAuthenticationRequest 请求对象
     * @return CompletableFuture<ShowProductAuthenticationResponse>
     */
    public CompletableFuture<ShowProductAuthenticationResponse> showProductAuthenticationAsync(ShowProductAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showProductAuthentication);
    }

    /**
     * 查询响应属性详情
     * 查询响应属性详情
     *
     * @param ShowResponsePropertyRequest 请求对象
     * @return CompletableFuture<ShowResponsePropertyResponse>
     */
    public CompletableFuture<ShowResponsePropertyResponse> showResponsePropertyAsync(ShowResponsePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showResponseProperty);
    }

    /**
     * 查询规则详情
     * 查询规则详情
     *
     * @param ShowRuleRequest 请求对象
     * @return CompletableFuture<ShowRuleResponse>
     */
    public CompletableFuture<ShowRuleResponse> showRuleAsync(ShowRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showRule);
    }

    /**
     * 查询服务详情
     * 查询服务详情
     *
     * @param ShowServiceRequest 请求对象
     * @return CompletableFuture<ShowServiceResponse>
     */
    public CompletableFuture<ShowServiceResponse> showServiceAsync(ShowServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showService);
    }

    /**
     * 撤销后端API
     * 在某个实例中取消部署后端API。
     *
     * @param UnpublishLiveDataApiV2Request 请求对象
     * @return CompletableFuture<UnpublishLiveDataApiV2Response>
     */
    public CompletableFuture<UnpublishLiveDataApiV2Response> unpublishLiveDataApiV2Async(UnpublishLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.unpublishLiveDataApiV2);
    }

    /**
     * 设置APP的访问控制
     * 设置客户端配置的访问控制。
     *
     * @param UpdateAppAclRequest 请求对象
     * @return CompletableFuture<UpdateAppAclResponse>
     */
    public CompletableFuture<UpdateAppAclResponse> updateAppAclAsync(UpdateAppAclRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateAppAcl);
    }

    /**
     * 修改应用配置
     * 修改应用配置
     *
     * @param UpdateAppConfigV2Request 请求对象
     * @return CompletableFuture<UpdateAppConfigV2Response>
     */
    public CompletableFuture<UpdateAppConfigV2Response> updateAppConfigV2Async(UpdateAppConfigV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateAppConfigV2);
    }

    /**
     * 修改客户端配额
     * 修改客户端配额
     *
     * @param UpdateAppQuotaRequest 请求对象
     * @return CompletableFuture<UpdateAppQuotaResponse>
     */
    public CompletableFuture<UpdateAppQuotaResponse> updateAppQuotaAsync(UpdateAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateAppQuota);
    }

    /**
     * 修改命令
     * 修改命令
     *
     * @param UpdateCommandRequest 请求对象
     * @return CompletableFuture<UpdateCommandResponse>
     */
    public CompletableFuture<UpdateCommandResponse> updateCommandAsync(UpdateCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateCommand);
    }

    /**
     * 修改自定义认证
     * 修改自定义认证
     *
     * @param UpdateCustomAuthorizerV2Request 请求对象
     * @return CompletableFuture<UpdateCustomAuthorizerV2Response>
     */
    public CompletableFuture<UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2Async(UpdateCustomAuthorizerV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateCustomAuthorizerV2);
    }

    /**
     * 修改设备
     * 修改设备信息
     *
     * @param UpdateDeviceRequest 请求对象
     * @return CompletableFuture<UpdateDeviceResponse>
     */
    public CompletableFuture<UpdateDeviceResponse> updateDeviceAsync(UpdateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateDevice);
    }

    /**
     * 修改设备分组
     * 修改设备分组
     *
     * @param UpdateDeviceGroupRequest 请求对象
     * @return CompletableFuture<UpdateDeviceGroupResponse>
     */
    public CompletableFuture<UpdateDeviceGroupResponse> updateDeviceGroupAsync(UpdateDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateDeviceGroup);
    }

    /**
     * 修改域名
     * 修改绑定的域名所对应的配置信息。
     *
     * @param UpdateDomainV2Request 请求对象
     * @return CompletableFuture<UpdateDomainV2Response>
     */
    public CompletableFuture<UpdateDomainV2Response> updateDomainV2Async(UpdateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateDomainV2);
    }

    /**
     * 修改环境
     * 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     *
     * @param UpdateEnvironmentV2Request 请求对象
     * @return CompletableFuture<UpdateEnvironmentV2Response>
     */
    public CompletableFuture<UpdateEnvironmentV2Response> updateEnvironmentV2Async(UpdateEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateEnvironmentV2);
    }

    /**
     * 修改变量
     * 修改环境变量。环境变量引用位置为api的后端服务地址时，修改对应环境变量会将使用该变量的所有api重新发布。
     *
     * @param UpdateEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<UpdateEnvironmentVariableV2Response>
     */
    public CompletableFuture<UpdateEnvironmentVariableV2Response> updateEnvironmentVariableV2Async(UpdateEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateEnvironmentVariableV2);
    }

    /**
     * 修改后端API
     * 在某个实例中更新后端API的参数。
     *
     * @param UpdateLiveDataApiV2Request 请求对象
     * @return CompletableFuture<UpdateLiveDataApiV2Response>
     */
    public CompletableFuture<UpdateLiveDataApiV2Response> updateLiveDataApiV2Async(UpdateLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateLiveDataApiV2);
    }

    /**
     * 修改Topic
     * 修改Topic。
     *
     * @param UpdateMqsInstanceTopicRequest 请求对象
     * @return CompletableFuture<UpdateMqsInstanceTopicResponse>
     */
    public CompletableFuture<UpdateMqsInstanceTopicResponse> updateMqsInstanceTopicAsync(UpdateMqsInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateMqsInstanceTopic);
    }

    /**
     * 修改产品信息
     * 修改产品信息
     *
     * @param UpdateProductRequest 请求对象
     * @return CompletableFuture<UpdateProductResponse>
     */
    public CompletableFuture<UpdateProductResponse> updateProductAsync(UpdateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateProduct);
    }

    /**
     * 修改产品模板
     * 修改产品模板
     *
     * @param UpdateProductTemplateRequest 请求对象
     * @return CompletableFuture<UpdateProductTemplateResponse>
     */
    public CompletableFuture<UpdateProductTemplateResponse> updateProductTemplateAsync(UpdateProductTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateProductTemplate);
    }

    /**
     * 更新产品主题
     * 更新产品主题
     *
     * @param UpdateProductTopicRequest 请求对象
     * @return CompletableFuture<UpdateProductTopicResponse>
     */
    public CompletableFuture<UpdateProductTopicResponse> updateProductTopicAsync(UpdateProductTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateProductTopic);
    }

    /**
     * 修改请求属性
     * 修改请求属性
     *
     * @param UpdateRequestPropertyRequest 请求对象
     * @return CompletableFuture<UpdateRequestPropertyResponse>
     */
    public CompletableFuture<UpdateRequestPropertyResponse> updateRequestPropertyAsync(UpdateRequestPropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateRequestProperty);
    }

    /**
     * 修改流控策略
     * 修改指定流控策略的详细信息。
     *
     * @param UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<UpdateRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2Async(UpdateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateRequestThrottlingPolicyV2);
    }

    /**
     * 修改响应属性
     * 修改响应属性
     *
     * @param UpdateResponsePropertyRequest 请求对象
     * @return CompletableFuture<UpdateResponsePropertyResponse>
     */
    public CompletableFuture<UpdateResponsePropertyResponse> updateResponsePropertyAsync(UpdateResponsePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateResponseProperty);
    }

    /**
     * 修改规则
     * 修改规则
     *
     * @param UpdateRuleRequest 请求对象
     * @return CompletableFuture<UpdateRuleResponse>
     */
    public CompletableFuture<UpdateRuleResponse> updateRuleAsync(UpdateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateRule);
    }

    /**
     * 修改服务
     * 修改服务
     *
     * @param UpdateServiceRequest 请求对象
     * @return CompletableFuture<UpdateServiceResponse>
     */
    public CompletableFuture<UpdateServiceResponse> updateServiceAsync(UpdateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateService);
    }

    /**
     * 修改签名密钥
     * 修改指定签名密钥的详细信息。
     *
     * @param UpdateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<UpdateSignatureKeyV2Response>
     */
    public CompletableFuture<UpdateSignatureKeyV2Response> updateSignatureKeyV2Async(UpdateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateSignatureKeyV2);
    }

    /**
     * 修改特殊设置
     * 修改某个流控策略下的某个特殊设置。
     *
     * @param UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return CompletableFuture<UpdateSpecialThrottlingConfigurationV2Response>
     */
    public CompletableFuture<UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2Async(UpdateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateSpecialThrottlingConfigurationV2);
    }

    /**
     * 更新Topic权限
     * 更新Topic权限。
     *
     * @param UpdateTopicAccessPolicyRequest 请求对象
     * @return CompletableFuture<UpdateTopicAccessPolicyResponse>
     */
    public CompletableFuture<UpdateTopicAccessPolicyResponse> updateTopicAccessPolicyAsync(UpdateTopicAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateTopicAccessPolicy);
    }

    /**
     * 导入产品
     * 导入产品
     *
     * @param UploadProductRequest 请求对象
     * @return CompletableFuture<UploadProductResponse>
     */
    public CompletableFuture<UploadProductResponse> uploadProductAsync(UploadProductRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.uploadProduct);
    }

    /**
     * 批量删除ACL策略
     * 批量删除指定的多个ACL策略。  删除ACL策略时，如果存在ACL策略与API绑定关系，则无法删除。
     *
     * @param BatchDeleteAclV2Request 请求对象
     * @return CompletableFuture<BatchDeleteAclV2Response>
     */
    public CompletableFuture<BatchDeleteAclV2Response> batchDeleteAclV2Async(BatchDeleteAclV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchDeleteAclV2);
    }

    /**
     * 创建ACL策略
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com\&quot;之类的网络域名。
     *
     * @param CreateAclStrategyV2Request 请求对象
     * @return CompletableFuture<CreateAclStrategyV2Response>
     */
    public CompletableFuture<CreateAclStrategyV2Response> createAclStrategyV2Async(CreateAclStrategyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createAclStrategyV2);
    }

    /**
     * 删除ACL策略
     * 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     *
     * @param DeleteAclV2Request 请求对象
     * @return CompletableFuture<DeleteAclV2Response>
     */
    public CompletableFuture<DeleteAclV2Response> deleteAclV2Async(DeleteAclV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteAclV2);
    }

    /**
     * 查看ACL策略列表
     * 查询所有的ACL策略列表。 
     *
     * @param ListAclStrategiesV2Request 请求对象
     * @return CompletableFuture<ListAclStrategiesV2Response>
     */
    public CompletableFuture<ListAclStrategiesV2Response> listAclStrategiesV2Async(ListAclStrategiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAclStrategiesV2);
    }

    /**
     * 查看ACL策略详情
     * 查询指定ACL策略的详情。
     *
     * @param ShowDetailsOfAclPolicyV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAclPolicyV2Response>
     */
    public CompletableFuture<ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2Async(ShowDetailsOfAclPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfAclPolicyV2);
    }

    /**
     * 修改ACL策略
     * 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     *
     * @param UpdateAclStrategyV2Request 请求对象
     * @return CompletableFuture<UpdateAclStrategyV2Response>
     */
    public CompletableFuture<UpdateAclStrategyV2Response> updateAclStrategyV2Async(UpdateAclStrategyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateAclStrategyV2);
    }

    /**
     * 绑定流控策略
     * 将流控策略应用于API，则所有对该API的访问将会受到该流控策略的限制。  当一定时间内的访问次数超过流控策略设置的API最大访问次数限制后，后续的访问将会被拒绝，从而能够较好的保护后端API免受异常流量的冲击，保障服务的稳定运行。  为指定的API绑定流控策略，绑定时，需要指定在哪个环境上生效。同一个API发布到不同的环境可以绑定不同的流控策略；一个API在发布到特定环境后只能绑定一个默认的流控策略。
     *
     * @param AssociateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<AssociateRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2Async(AssociateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.associateRequestThrottlingPolicyV2);
    }

    /**
     * 批量解绑流控策略
     * 批量解除API与流控策略的绑定关系
     *
     * @param BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<BatchDisassociateThrottlingPolicyV2Response>
     */
    public CompletableFuture<BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2Async(BatchDisassociateThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchDisassociateThrottlingPolicyV2);
    }

    /**
     * 批量发布或下线API
     * 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。
     *
     * @param BatchPublishOrOfflineApiV2Request 请求对象
     * @return CompletableFuture<BatchPublishOrOfflineApiV2Response>
     */
    public CompletableFuture<BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2Async(BatchPublishOrOfflineApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchPublishOrOfflineApiV2);
    }

    /**
     * 切换API版本
     * API每次发布时，会基于当前的API定义生成一个版本。版本记录了API发布时的各种定义及状态。  多个版本之间可以进行随意切换。但一个API在一个环境上，只能有一个版本生效。
     *
     * @param ChangeApiVersionV2Request 请求对象
     * @return CompletableFuture<ChangeApiVersionV2Response>
     */
    public CompletableFuture<ChangeApiVersionV2Response> changeApiVersionV2Async(ChangeApiVersionV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.changeApiVersionV2);
    }

    /**
     * 校验API分组名称是否存在
     * 校验API分组名称是否存在。
     *
     * @param CheckApiGroupsV2Request 请求对象
     * @return CompletableFuture<CheckApiGroupsV2Response>
     */
    public CompletableFuture<CheckApiGroupsV2Response> checkApiGroupsV2Async(CheckApiGroupsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkApiGroupsV2);
    }

    /**
     * 校验API定义
     * 校验API定义。校验API的路径或名称是否已存在
     *
     * @param CheckApisV2Request 请求对象
     * @return CompletableFuture<CheckApisV2Response>
     */
    public CompletableFuture<CheckApisV2Response> checkApisV2Async(CheckApisV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkApisV2);
    }

    /**
     * 创建API分组
     * API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。 
     *
     * @param CreateApiGroupV2Request 请求对象
     * @return CompletableFuture<CreateApiGroupV2Response>
     */
    public CompletableFuture<CreateApiGroupV2Response> createApiGroupV2Async(CreateApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createApiGroupV2);
    }

    /**
     * 创建API
     * 添加一个API，API即一个服务接口，具体的服务能力。  API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了ROMA Connect如何去访问真实的后端服务。API的真实后端服务目前支持三种类型：传统的HTTP/HTTPS形式的web后端、函数工作流、MOCK。 
     *
     * @param CreateApiV2Request 请求对象
     * @return CompletableFuture<CreateApiV2Response>
     */
    public CompletableFuture<CreateApiV2Response> createApiV2Async(CreateApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createApiV2);
    }

    /**
     * 发布或下线API
     * 对API进行发布或下线。  发布操作是将一个指定的API发布到一个指定的环境，API只有发布后，才能够被调用，且只能在该环境上才能被调用。未发布的API无法被调用。  下线操作是将API从某个已发布的环境上下线，下线后，API将无法再被调用。
     *
     * @param CreateOrDeletePublishRecordForApiV2Request 请求对象
     * @return CompletableFuture<CreateOrDeletePublishRecordForApiV2Response>
     */
    public CompletableFuture<CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2Async(CreateOrDeletePublishRecordForApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createOrDeletePublishRecordForApiV2);
    }

    /**
     * 调试API
     * 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     *
     * @param DebugApiV2Request 请求对象
     * @return CompletableFuture<DebugApiV2Response>
     */
    public CompletableFuture<DebugApiV2Response> debugApiV2Async(DebugApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.debugApiV2);
    }

    /**
     * 根据版本编号下线API
     * 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。  该接口供FunctionGraph服务使用。
     *
     * @param DeleteApiByVersionIdV2Request 请求对象
     * @return CompletableFuture<DeleteApiByVersionIdV2Response>
     */
    public CompletableFuture<DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2Async(DeleteApiByVersionIdV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteApiByVersionIdV2);
    }

    /**
     * 删除API分组
     * 删除指定的API分组。  删除时，会一并删除直接或间接关联到该分组下的所有资源，包括API、独立域名、SSL证书、上架信息、分组下所有API的授权信息、编排信息、白名单配置、认证增强信息等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     *
     * @param DeleteApiGroupV2Request 请求对象
     * @return CompletableFuture<DeleteApiGroupV2Response>
     */
    public CompletableFuture<DeleteApiGroupV2Response> deleteApiGroupV2Async(DeleteApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteApiGroupV2);
    }

    /**
     * 删除API
     * 删除指定的API。  删除API时，会删除该API所有相关的资源信息或绑定关系，如API的发布记录，绑定的后端服务，对APP的授权信息等。
     *
     * @param DeleteApiV2Request 请求对象
     * @return CompletableFuture<DeleteApiV2Response>
     */
    public CompletableFuture<DeleteApiV2Response> deleteApiV2Async(DeleteApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteApiV2);
    }

    /**
     * 解除API与流控策略的绑定关系
     * 解除API与流控策略的绑定关系。
     *
     * @param DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<DisassociateRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2Async(DisassociateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.disassociateRequestThrottlingPolicyV2);
    }

    /**
     * 查询分组列表
     * 查询API分组列表。  如果是租户操作，则查询该租户下所有的分组；如果是管理员操作，则查询的是所有租户的分组。
     *
     * @param ListApiGroupsV2Request 请求对象
     * @return CompletableFuture<ListApiGroupsV2Response>
     */
    public CompletableFuture<ListApiGroupsV2Response> listApiGroupsV2Async(ListApiGroupsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApiGroupsV2);
    }

    /**
     * 查询API运行时定义
     * 查看指定的API在指定的环境上的运行时定义，默认查询RELEASE环境上的运行时定义。  API的定义分为临时定义和运行时定义，分别代表如下含义： - 临时定义：API在编辑中的定义，表示用户最后一次编辑后的API的状态 - 运行时定义：API在发布到某个环境时，对发布时的API的临时定义进行快照，固化出来的API的状态。  访问某个环境上的API，其实访问的就是其运行时的定义
     *
     * @param ListApiRuntimeDefinitionV2Request 请求对象
     * @return CompletableFuture<ListApiRuntimeDefinitionV2Response>
     */
    public CompletableFuture<ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2Async(ListApiRuntimeDefinitionV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApiRuntimeDefinitionV2);
    }

    /**
     * 查看版本详情
     * 查询某个指定的版本详情。
     *
     * @param ListApiVersionDetailV2Request 请求对象
     * @return CompletableFuture<ListApiVersionDetailV2Response>
     */
    public CompletableFuture<ListApiVersionDetailV2Response> listApiVersionDetailV2Async(ListApiVersionDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApiVersionDetailV2);
    }

    /**
     * 查询API历史版本列表
     * 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     *
     * @param ListApiVersionsV2Request 请求对象
     * @return CompletableFuture<ListApiVersionsV2Response>
     */
    public CompletableFuture<ListApiVersionsV2Response> listApiVersionsV2Async(ListApiVersionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApiVersionsV2);
    }

    /**
     * 查看流控策略绑定的API列表
     * 查询某个流控策略上已经绑定的API列表。
     *
     * @param ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2Async(ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisBindedToRequestThrottlingPolicyV2);
    }

    /**
     * 查看流控策略未绑定的API列表
     * 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisUnbindedToRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2Async(ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisUnbindedToRequestThrottlingPolicyV2);
    }

    /**
     * 查询API列表
     * 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息。
     *
     * @param ListApisV2Request 请求对象
     * @return CompletableFuture<ListApisV2Response>
     */
    public CompletableFuture<ListApisV2Response> listApisV2Async(ListApisV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisV2);
    }

    /**
     * 查看API绑定的流控策略列表
     * 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     *
     * @param ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListRequestThrottlingPoliciesBindedToApiV2Response>
     */
    public CompletableFuture<ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2Async(ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listRequestThrottlingPoliciesBindedToApiV2);
    }

    /**
     * 查询分组详情
     * 查询指定分组的详细信息。
     *
     * @param ShowDetailsOfApiGroupV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfApiGroupV2Response>
     */
    public CompletableFuture<ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2Async(ShowDetailsOfApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfApiGroupV2);
    }

    /**
     * 查询API详情
     * 查看指定的API的详细信息。
     *
     * @param ShowDetailsOfApiV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfApiV2Response>
     */
    public CompletableFuture<ShowDetailsOfApiV2Response> showDetailsOfApiV2Async(ShowDetailsOfApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfApiV2);
    }

    /**
     * 修改API分组
     * 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     *
     * @param UpdateApiGroupV2Request 请求对象
     * @return CompletableFuture<UpdateApiGroupV2Response>
     */
    public CompletableFuture<UpdateApiGroupV2Response> updateApiGroupV2Async(UpdateApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateApiGroupV2);
    }

    /**
     * 修改API
     * 修改指定API的信息，包括后端服务信息。
     *
     * @param UpdateApiV2Request 请求对象
     * @return CompletableFuture<UpdateApiV2Response>
     */
    public CompletableFuture<UpdateApiV2Response> updateApiV2Async(UpdateApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateApiV2);
    }

    /**
     * 批量解除API与ACL策略的绑定
     * 批量解除API与ACL策略的绑定
     *
     * @param BatchDeleteApiAclBindingV2Request 请求对象
     * @return CompletableFuture<BatchDeleteApiAclBindingV2Response>
     */
    public CompletableFuture<BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2Async(BatchDeleteApiAclBindingV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchDeleteApiAclBindingV2);
    }

    /**
     * 将API与ACL策略进行绑定
     * 将API与ACL策略进行绑定。  同一个API发布到不同的环境可以绑定不同的ACL策略；一个API在发布到特定环境后只能绑定一个同一种类型的ACL策略。
     *
     * @param CreateApiAclBindingV2Request 请求对象
     * @return CompletableFuture<CreateApiAclBindingV2Response>
     */
    public CompletableFuture<CreateApiAclBindingV2Response> createApiAclBindingV2Async(CreateApiAclBindingV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createApiAclBindingV2);
    }

    /**
     * 解除API与ACL策略的绑定
     * 解除某条API与ACL策略的绑定关系
     *
     * @param DeleteApiAclBindingV2Request 请求对象
     * @return CompletableFuture<DeleteApiAclBindingV2Response>
     */
    public CompletableFuture<DeleteApiAclBindingV2Response> deleteApiAclBindingV2Async(DeleteApiAclBindingV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteApiAclBindingV2);
    }

    /**
     * 查看API绑定的ACL策略列表
     * 查看API绑定的ACL策略列表
     *
     * @param ListAclPolicyBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListAclPolicyBindedToApiV2Response>
     */
    public CompletableFuture<ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2Async(ListAclPolicyBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAclPolicyBindedToApiV2);
    }

    /**
     * 查看ACL策略绑定的API列表
     * 查看ACL策略绑定的API列表
     *
     * @param ListApisBindedToAclPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToAclPolicyV2Response>
     */
    public CompletableFuture<ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2Async(ListApisBindedToAclPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisBindedToAclPolicyV2);
    }

    /**
     * 查看ACL策略未绑定的API列表
     * 查看ACL策略未绑定的API列表，需要API已发布
     *
     * @param ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisUnbindedToAclPolicyV2Response>
     */
    public CompletableFuture<ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2Async(ListApisUnbindedToAclPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisUnbindedToAclPolicyV2);
    }

    /**
     * 解除授权
     * 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     *
     * @param CancelingAuthorizationV2Request 请求对象
     * @return CompletableFuture<CancelingAuthorizationV2Response>
     */
    public CompletableFuture<CancelingAuthorizationV2Response> cancelingAuthorizationV2Async(CancelingAuthorizationV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.cancelingAuthorizationV2);
    }

    /**
     * APP授权
     * APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。 
     *
     * @param CreateAuthorizingAppsV2Request 请求对象
     * @return CompletableFuture<CreateAuthorizingAppsV2Response>
     */
    public CompletableFuture<CreateAuthorizingAppsV2Response> createAuthorizingAppsV2Async(CreateAuthorizingAppsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createAuthorizingAppsV2);
    }

    /**
     * 查看APP已绑定的API列表
     * 查询APP已经绑定的API列表。
     *
     * @param ListApisBindedToAppV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToAppV2Response>
     */
    public CompletableFuture<ListApisBindedToAppV2Response> listApisBindedToAppV2Async(ListApisBindedToAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisBindedToAppV2);
    }

    /**
     * 查看APP未绑定的API列表
     * 查询指定环境上某个APP未绑定的API列表，包括自有API和从云市场购买的API。
     *
     * @param ListApisUnbindedToAppV2Request 请求对象
     * @return CompletableFuture<ListApisUnbindedToAppV2Response>
     */
    public CompletableFuture<ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2Async(ListApisUnbindedToAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisUnbindedToAppV2);
    }

    /**
     * 查看API已绑定的APP列表
     * 查询API绑定的APP列表。
     *
     * @param ListAppsBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListAppsBindedToApiV2Response>
     */
    public CompletableFuture<ListAppsBindedToApiV2Response> listAppsBindedToApiV2Async(ListAppsBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppsBindedToApiV2);
    }

    /**
     * 查看APP下路径冲突的api列表
     * 查询指定APP下路径冲突的api列表。
     *
     * @param ListDuplicateApisForAppV2Request 请求对象
     * @return CompletableFuture<ListDuplicateApisForAppV2Response>
     */
    public CompletableFuture<ListDuplicateApisForAppV2Response> listDuplicateApisForAppV2Async(ListDuplicateApisForAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listDuplicateApisForAppV2);
    }

    /**
     * 查询MQS实例列表
     * 查询MQS实例列表。
     *
     * @param ListMqsInstanceRequest 请求对象
     * @return CompletableFuture<ListMqsInstanceResponse>
     */
    public CompletableFuture<ListMqsInstanceResponse> listMqsInstanceAsync(ListMqsInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listMqsInstance);
    }

    /**
     * 查询MQS实例详情
     * 查询指定MQS实例详情。
     *
     * @param ShowMqsInstanceRequest 请求对象
     * @return CompletableFuture<ShowMqsInstanceResponse>
     */
    public CompletableFuture<ShowMqsInstanceResponse> showMqsInstanceAsync(ShowMqsInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showMqsInstance);
    }

    /**
     * 导出API
     * 导出分组下API的定义信息，导出文件内容符合swagger标准规范。
     *
     * @param ExportApiDefinitionsV2Request 请求对象
     * @return CompletableFuture<ExportApiDefinitionsV2Response>
     */
    public CompletableFuture<ExportApiDefinitionsV2Response> exportApiDefinitionsV2Async(ExportApiDefinitionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.exportApiDefinitionsV2);
    }

    /**
     * 导出自定义后端API
     * 导出自定义后端API，导出文件内容符合swagger标准规范。
     *
     * @param ExportLiveDataApiDefinitionsV2Request 请求对象
     * @return CompletableFuture<ExportLiveDataApiDefinitionsV2Response>
     */
    public CompletableFuture<ExportLiveDataApiDefinitionsV2Response> exportLiveDataApiDefinitionsV2Async(ExportLiveDataApiDefinitionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.exportLiveDataApiDefinitionsV2);
    }

    /**
     * 导入API
     * 导入API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考《ROMA Connect用户指南》的“附录：前端API的Swagger扩展定义”章节。
     *
     * @param ImportApiDefinitionsV2Request 请求对象
     * @return CompletableFuture<ImportApiDefinitionsV2Response>
     */
    public CompletableFuture<ImportApiDefinitionsV2Response> importApiDefinitionsV2Async(ImportApiDefinitionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.importApiDefinitionsV2);
    }

    /**
     * 导入自定义后端API
     * 导入自定义后端API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考《ROMA Connect用户指南》的“附录：后端API的Swagger扩展定义”章节
     *
     * @param ImportLiveDataApiDefinitionsV2Request 请求对象
     * @return CompletableFuture<ImportLiveDataApiDefinitionsV2Response>
     */
    public CompletableFuture<ImportLiveDataApiDefinitionsV2Response> importLiveDataApiDefinitionsV2Async(ImportLiveDataApiDefinitionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.importLiveDataApiDefinitionsV2);
    }

    /**
     * 添加后端实例
     * 为指定的VPC通道添加弹性云服务器
     *
     * @param AddingBackendInstancesV2Request 请求对象
     * @return CompletableFuture<AddingBackendInstancesV2Response>
     */
    public CompletableFuture<AddingBackendInstancesV2Response> addingBackendInstancesV2Async(AddingBackendInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.addingBackendInstancesV2);
    }

    /**
     * 创建VPC通道
     * 在ROMA Connect APIC中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便ROMA Connect APIC直接访问私有VPC资源。 &gt; 每个用户最多创建30个VPC通道。
     *
     * @param CreateVpcChannelV2Request 请求对象
     * @return CompletableFuture<CreateVpcChannelV2Response>
     */
    public CompletableFuture<CreateVpcChannelV2Response> createVpcChannelV2Async(CreateVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createVpcChannelV2);
    }

    /**
     * 删除后端实例
     * 删除指定VPC通道中的弹性云服务器
     *
     * @param DeleteBackendInstanceV2Request 请求对象
     * @return CompletableFuture<DeleteBackendInstanceV2Response>
     */
    public CompletableFuture<DeleteBackendInstanceV2Response> deleteBackendInstanceV2Async(DeleteBackendInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteBackendInstanceV2);
    }

    /**
     * 删除VPC通道
     * 删除指定的VPC通道
     *
     * @param DeleteVpcChannelV2Request 请求对象
     * @return CompletableFuture<DeleteVpcChannelV2Response>
     */
    public CompletableFuture<DeleteVpcChannelV2Response> deleteVpcChannelV2Async(DeleteVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteVpcChannelV2);
    }

    /**
     * 查看后端实例列表
     * 查看指定VPC通道的弹性云服务器列表。
     *
     * @param ListBackendInstancesV2Request 请求对象
     * @return CompletableFuture<ListBackendInstancesV2Response>
     */
    public CompletableFuture<ListBackendInstancesV2Response> listBackendInstancesV2Async(ListBackendInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listBackendInstancesV2);
    }

    /**
     * 查询VPC通道列表
     * 查看VPC通道列表
     *
     * @param ListVpcChannelsV2Request 请求对象
     * @return CompletableFuture<ListVpcChannelsV2Response>
     */
    public CompletableFuture<ListVpcChannelsV2Response> listVpcChannelsV2Async(ListVpcChannelsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listVpcChannelsV2);
    }

    /**
     * 查看VPC通道详情
     * 查看指定的VPC通道详情
     *
     * @param ShowDetailsOfVpcChannelV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfVpcChannelV2Response>
     */
    public CompletableFuture<ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2Async(ShowDetailsOfVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfVpcChannelV2);
    }

    /**
     * 更新VPC通道
     * 更新指定VPC通道的参数
     *
     * @param UpdateVpcChannelV2Request 请求对象
     * @return CompletableFuture<UpdateVpcChannelV2Response>
     */
    public CompletableFuture<UpdateVpcChannelV2Response> updateVpcChannelV2Async(UpdateVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateVpcChannelV2);
    }

}