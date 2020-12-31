package com.huaweicloud.sdk.roma.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.roma.v2.model.*;

public class RomaClient {
    protected HcClient hcClient;

    public RomaClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RomaClient> newBuilder() {
        return new ClientBuilder<>(RomaClient::new);
    }


    /**
     * 添加子设备到网关
     * 添加子设备到网关
     *
     * @param AddSubsetsToGatewayRequest 请求对象
     * @return AddSubsetsToGatewayResponse
     */
    public AddSubsetsToGatewayResponse addSubsetsToGateway(AddSubsetsToGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.addSubsetsToGateway);
    }

    /**
     * 客户端配额绑定客户端应用列表
     * 客户端配额绑定客户端应用列表
     *
     * @param AssociateAppsForAppQuotaRequest 请求对象
     * @return AssociateAppsForAppQuotaResponse
     */
    public AssociateAppsForAppQuotaResponse associateAppsForAppQuota(AssociateAppsForAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.associateAppsForAppQuota);
    }

    /**
     * 绑定域名证书
     * 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。 本章节主要介绍为特定域名绑定证书。
     *
     * @param AssociateCertificateV2Request 请求对象
     * @return AssociateCertificateV2Response
     */
    public AssociateCertificateV2Response associateCertificateV2(AssociateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.associateCertificateV2);
    }

    /**
     * 绑定域名
     * 用户自定义的域名，需要CNAME到API分组的子域名上才能生效，具体方法请参见《云解析服务用户指南》的“添加CANME类型记录集”章节。 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     *
     * @param AssociateDomainV2Request 请求对象
     * @return AssociateDomainV2Response
     */
    public AssociateDomainV2Response associateDomainV2(AssociateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.associateDomainV2);
    }

    /**
     * 绑定签名密钥
     * 签名密钥创建后，需要绑定到API才能生效。  将签名密钥绑定到API后，则ROMA Connect APIC请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。  将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     *
     * @param AssociateSignatureKeyV2Request 请求对象
     * @return AssociateSignatureKeyV2Response
     */
    public AssociateSignatureKeyV2Response associateSignatureKeyV2(AssociateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.associateSignatureKeyV2);
    }

    /**
     * 批量添加设备到设备分组
     * 批量添加设备到设备分组
     *
     * @param BatchAddDeviceToGroupRequest 请求对象
     * @return BatchAddDeviceToGroupResponse
     */
    public BatchAddDeviceToGroupResponse batchAddDeviceToGroup(BatchAddDeviceToGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchAddDeviceToGroup);
    }

    /**
     * 批量删除Topic
     * 批量删除Topic。
     *
     * @param BatchDeleteMqsInstanceTopicRequest 请求对象
     * @return BatchDeleteMqsInstanceTopicResponse
     */
    public BatchDeleteMqsInstanceTopicResponse batchDeleteMqsInstanceTopic(BatchDeleteMqsInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDeleteMqsInstanceTopic);
    }

    /**
     * 批量删除规则
     * 批量删除规则
     *
     * @param BatchDeleteRulesRequest 请求对象
     * @return BatchDeleteRulesResponse
     */
    public BatchDeleteRulesResponse batchDeleteRules(BatchDeleteRulesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDeleteRules);
    }

    /**
     * 设备批量下线
     * 设备批量下线
     *
     * @param BatchFreezeDevicesRequest 请求对象
     * @return BatchFreezeDevicesResponse
     */
    public BatchFreezeDevicesResponse batchFreezeDevices(BatchFreezeDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchFreezeDevices);
    }

    /**
     * 校验自定义后端API定义
     * 校验自定义后端API定义。校验自定义后端API的路径或名称是否已存在
     *
     * @param CheckLivedataApisV2Request 请求对象
     * @return CheckLivedataApisV2Response
     */
    public CheckLivedataApisV2Response checkLivedataApisV2(CheckLivedataApisV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkLivedataApisV2);
    }

    /**
     * 自动生成APP Code
     * 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     *
     * @param CreateAppCodeAutoV2Request 请求对象
     * @return CreateAppCodeAutoV2Response
     */
    public CreateAppCodeAutoV2Response createAppCodeAutoV2(CreateAppCodeAutoV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createAppCodeAutoV2);
    }

    /**
     * 创建APP Code
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param CreateAppCodeV2Request 请求对象
     * @return CreateAppCodeV2Response
     */
    public CreateAppCodeV2Response createAppCodeV2(CreateAppCodeV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createAppCodeV2);
    }

    /**
     * 创建应用配置
     * 创建应用配置
     *
     * @param CreateAppConfigV2Request 请求对象
     * @return CreateAppConfigV2Response
     */
    public CreateAppConfigV2Response createAppConfigV2(CreateAppConfigV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createAppConfigV2);
    }

    /**
     * 创建客户端配额
     * 创建客户端配额
     *
     * @param CreateAppQuotaRequest 请求对象
     * @return CreateAppQuotaResponse
     */
    public CreateAppQuotaResponse createAppQuota(CreateAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createAppQuota);
    }

    /**
     * 创建命令
     * 创建命令
     *
     * @param CreateCommandRequest 请求对象
     * @return CreateCommandResponse
     */
    public CreateCommandResponse createCommand(CreateCommandRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createCommand);
    }

    /**
     * 创建自定义认证
     * 创建自定义认证
     *
     * @param CreateCustomAuthorizerV2Request 请求对象
     * @return CreateCustomAuthorizerV2Response
     */
    public CreateCustomAuthorizerV2Response createCustomAuthorizerV2(CreateCustomAuthorizerV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createCustomAuthorizerV2);
    }

    /**
     * 添加目标数据源
     * 添加目标数据源
     *
     * @param CreateDestinationRequest 请求对象
     * @return CreateDestinationResponse
     */
    public CreateDestinationResponse createDestination(CreateDestinationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createDestination);
    }

    /**
     * 创建设备
     * 创建设备
     *
     * @param CreateDeviceRequest 请求对象
     * @return CreateDeviceResponse
     */
    public CreateDeviceResponse createDevice(CreateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createDevice);
    }

    /**
     * 创建设备分组
     * 创建设备分组
     *
     * @param CreateDeviceGroupRequest 请求对象
     * @return CreateDeviceGroupResponse
     */
    public CreateDeviceGroupResponse createDeviceGroup(CreateDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createDeviceGroup);
    }

    /**
     * 创建环境
     * 在实际的生产中，API提供者可能有多个环境，如开发环境、测试环境、生产环境等，用户可以自由将API发布到某个环境，供调用者调用。  对于不同的环境，API的版本、请求地址甚至于包括请求消息等均有可能不同。如：某个API，v1.0的版本为稳定版本，发布到了生产环境供生产使用，同时，该API正处于迭代中，v1.1的版本是开发人员交付测试人员进行测试的版本，发布在测试环境上，而v1.2的版本目前开发团队正处于开发过程中，可以发布到开发环境进行自测等。  为此，ROMA Connect APIC提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接入ROMA Connect APIC。
     *
     * @param CreateEnvironmentV2Request 请求对象
     * @return CreateEnvironmentV2Response
     */
    public CreateEnvironmentV2Response createEnvironmentV2(CreateEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createEnvironmentV2);
    }

    /**
     * 新建变量
     * 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。  用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，ROMA Connect APIC会将这些变量替换成真实的变量值，以达到不同环境的区分效果。  环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。 &gt; 1.环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量   2.环境变量区分大小写，即变量ABC与变量abc是两个不同的变量   3.设置了环境变量后，使用到该变量的API的调试功能将不可使用。   4.定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     *
     * @param CreateEnvironmentVariableV2Request 请求对象
     * @return CreateEnvironmentVariableV2Response
     */
    public CreateEnvironmentVariableV2Response createEnvironmentVariableV2(CreateEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createEnvironmentVariableV2);
    }

    /**
     * 实例配置特性
     * 为实例配置需要的特性。  支持配置的特性列表及特性配置请参考“附录 &gt; 实例支持的APIC特性”
     *
     * @param CreateFeatureV2Request 请求对象
     * @return CreateFeatureV2Response
     */
    public CreateFeatureV2Response createFeatureV2(CreateFeatureV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createFeatureV2);
    }

    /**
     * 创建后端API脚本
     * 在某个实例中创建后端API脚本。
     *
     * @param CreateLiveDataApiScriptV2Request 请求对象
     * @return CreateLiveDataApiScriptV2Response
     */
    public CreateLiveDataApiScriptV2Response createLiveDataApiScriptV2(CreateLiveDataApiScriptV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createLiveDataApiScriptV2);
    }

    /**
     * 创建后端API
     * 在某个实例中创建后端API。
     *
     * @param CreateLiveDataApiV2Request 请求对象
     * @return CreateLiveDataApiV2Response
     */
    public CreateLiveDataApiV2Response createLiveDataApiV2(CreateLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createLiveDataApiV2);
    }

    /**
     * 创建Topic
     * 创建Topic。
     *
     * @param CreateMqsInstanceTopicRequest 请求对象
     * @return CreateMqsInstanceTopicResponse
     */
    public CreateMqsInstanceTopicResponse createMqsInstanceTopic(CreateMqsInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createMqsInstanceTopic);
    }

    /**
     * 创建产品
     * 创建产品
     *
     * @param CreateProductRequest 请求对象
     * @return CreateProductResponse
     */
    public CreateProductResponse createProduct(CreateProductRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createProduct);
    }

    /**
     * 创建产品模板
     * 创建产品模板
     *
     * @param CreateProductTemplateRequest 请求对象
     * @return CreateProductTemplateResponse
     */
    public CreateProductTemplateResponse createProductTemplate(CreateProductTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createProductTemplate);
    }

    /**
     * 添加产品主题
     * 添加产品主题
     *
     * @param CreateProductTopicRequest 请求对象
     * @return CreateProductTopicResponse
     */
    public CreateProductTopicResponse createProductTopic(CreateProductTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createProductTopic);
    }

    /**
     * 创建属性
     * 创建属性
     *
     * @param CreatePropertyRequest 请求对象
     * @return CreatePropertyResponse
     */
    public CreatePropertyResponse createProperty(CreatePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createProperty);
    }

    /**
     * 创建请求属性
     * 创建请求属性
     *
     * @param CreateRequestPropertyRequest 请求对象
     * @return CreateRequestPropertyResponse
     */
    public CreateRequestPropertyResponse createRequestProperty(CreateRequestPropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createRequestProperty);
    }

    /**
     * 创建流控策略
     * 当API上线后，系统会默认给每个API提供一个流控策略，API提供者可以根据自身API的服务能力及负载情况变更这个流控策略。 流控策略即限制API在一定长度的时间内，能够允许被访问的最大次数。
     *
     * @param CreateRequestThrottlingPolicyV2Request 请求对象
     * @return CreateRequestThrottlingPolicyV2Response
     */
    public CreateRequestThrottlingPolicyV2Response createRequestThrottlingPolicyV2(CreateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createRequestThrottlingPolicyV2);
    }

    /**
     * 创建响应属性
     * 创建响应属性
     *
     * @param CreateResponsePropertyRequest 请求对象
     * @return CreateResponsePropertyResponse
     */
    public CreateResponsePropertyResponse createResponseProperty(CreateResponsePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createResponseProperty);
    }

    /**
     * 创建规则
     * 创建规则
     *
     * @param CreateRuleRequest 请求对象
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createRule);
    }

    /**
     * 创建服务
     * 创建服务
     *
     * @param CreateServiceRequest 请求对象
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createService);
    }

    /**
     * 创建签名密钥
     * 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。  其中，签名密钥就是API安全保护机制的一种。  租户创建一个签名密钥，并将签名密钥与API进行绑定，则ROMA Connect APIC在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是ROMA Connect APIC发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。 
     *
     * @param CreateSignatureKeyV2Request 请求对象
     * @return CreateSignatureKeyV2Response
     */
    public CreateSignatureKeyV2Response createSignatureKeyV2(CreateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createSignatureKeyV2);
    }

    /**
     * 添加源数据源
     * 添加源数据源
     *
     * @param CreateSourceRequest 请求对象
     * @return CreateSourceResponse
     */
    public CreateSourceResponse createSource(CreateSourceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createSource);
    }

    /**
     * 创建特殊设置
     * 流控策略可以限制一段时间内可以访问API的最大次数，也可以限制一段时间内单个租户和单个APP可以访问API的最大次数。  如果想要对某个特定的APP进行特殊设置，例如设置所有APP每分钟的访问次数为500次，但想设置APP1每分钟的访问次数为800次，可以通过在流控策略中设置特殊APP来实现该功能。  为流控策略添加一个特殊设置的对象，可以是APP，也可以是租户。
     *
     * @param CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return CreateSpecialThrottlingConfigurationV2Response
     */
    public CreateSpecialThrottlingConfigurationV2Response createSpecialThrottlingConfigurationV2(CreateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createSpecialThrottlingConfigurationV2);
    }

    /**
     * 测试后端API
     * 测试后端API是否可用。
     *
     * @param DebugLiveDataApiV2Request 请求对象
     * @return DebugLiveDataApiV2Response
     */
    public DebugLiveDataApiV2Response debugLiveDataApiV2(DebugLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.debugLiveDataApiV2);
    }

    /**
     * 规则调试
     * 规则调试
     *
     * @param DebugRuleRequest 请求对象
     * @return DebugRuleResponse
     */
    public DebugRuleResponse debugRule(DebugRuleRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.debugRule);
    }

    /**
     * 删除APP的访问控制
     * 删除客户端配置的访问控制信息。
     *
     * @param DeleteAppAclRequest 请求对象
     * @return DeleteAppAclResponse
     */
    public DeleteAppAclResponse deleteAppAcl(DeleteAppAclRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteAppAcl);
    }

    /**
     * 删除APP Code
     * 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     *
     * @param DeleteAppCodeV2Request 请求对象
     * @return DeleteAppCodeV2Response
     */
    public DeleteAppCodeV2Response deleteAppCodeV2(DeleteAppCodeV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteAppCodeV2);
    }

    /**
     * 删除应用配置
     * 删除应用配置
     *
     * @param DeleteAppConfigV2Request 请求对象
     * @return DeleteAppConfigV2Response
     */
    public DeleteAppConfigV2Response deleteAppConfigV2(DeleteAppConfigV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteAppConfigV2);
    }

    /**
     * 删除客户端配额
     * 删除客户端配额。删除客户端配额时，同时删除客户端配额和客户端应用的关联关系
     *
     * @param DeleteAppQuotaRequest 请求对象
     * @return DeleteAppQuotaResponse
     */
    public DeleteAppQuotaResponse deleteAppQuota(DeleteAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteAppQuota);
    }

    /**
     * 删除命令
     * 删除命令
     *
     * @param DeleteCommandRequest 请求对象
     * @return DeleteCommandResponse
     */
    public DeleteCommandResponse deleteCommand(DeleteCommandRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteCommand);
    }

    /**
     * 删除自定义认证
     * 删除自定义认证
     *
     * @param DeleteCustomAuthorizerV2Request 请求对象
     * @return DeleteCustomAuthorizerV2Response
     */
    public DeleteCustomAuthorizerV2Response deleteCustomAuthorizerV2(DeleteCustomAuthorizerV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteCustomAuthorizerV2);
    }

    /**
     * 删除目标数据源
     * 删除目标数据源
     *
     * @param DeleteDestinationRequest 请求对象
     * @return DeleteDestinationResponse
     */
    public DeleteDestinationResponse deleteDestination(DeleteDestinationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteDestination);
    }

    /**
     * 删除设备
     * 删除指定设备ID的设备
     *
     * @param DeleteDeviceRequest 请求对象
     * @return DeleteDeviceResponse
     */
    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteDevice);
    }

    /**
     * 删除设备分组内的设备
     * 删除设备分组内的设备
     *
     * @param DeleteDeviceFromGroupRequest 请求对象
     * @return DeleteDeviceFromGroupResponse
     */
    public DeleteDeviceFromGroupResponse deleteDeviceFromGroup(DeleteDeviceFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteDeviceFromGroup);
    }

    /**
     * 删除设备分组
     * 删除分组
     *
     * @param DeleteDeviceGroupRequest 请求对象
     * @return DeleteDeviceGroupResponse
     */
    public DeleteDeviceGroupResponse deleteDeviceGroup(DeleteDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteDeviceGroup);
    }

    /**
     * 删除环境
     * 删除指定的环境。 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。
     *
     * @param DeleteEnvironmentV2Request 请求对象
     * @return DeleteEnvironmentV2Response
     */
    public DeleteEnvironmentV2Response deleteEnvironmentV2(DeleteEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteEnvironmentV2);
    }

    /**
     * 删除变量
     * 删除指定的环境变量。
     *
     * @param DeleteEnvironmentVariableV2Request 请求对象
     * @return DeleteEnvironmentVariableV2Response
     */
    public DeleteEnvironmentVariableV2Response deleteEnvironmentVariableV2(DeleteEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteEnvironmentVariableV2);
    }

    /**
     * 删除后端API
     * 在某个实例中删除后端API。
     *
     * @param DeleteLiveDataApiV2Request 请求对象
     * @return DeleteLiveDataApiV2Response
     */
    public DeleteLiveDataApiV2Response deleteLiveDataApiV2(DeleteLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteLiveDataApiV2);
    }

    /**
     * 批量删除Topic
     * 批量删除Topic。
     *
     * @param DeleteMqsInstanceTopicRequest 请求对象
     * @return DeleteMqsInstanceTopicResponse
     */
    public DeleteMqsInstanceTopicResponse deleteMqsInstanceTopic(DeleteMqsInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteMqsInstanceTopic);
    }

    /**
     * 删除产品
     * 删除产品
     *
     * @param DeleteProductRequest 请求对象
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteProduct);
    }

    /**
     * 删除产品模板
     * 删除产品模板
     *
     * @param DeleteProductTemplateRequest 请求对象
     * @return DeleteProductTemplateResponse
     */
    public DeleteProductTemplateResponse deleteProductTemplate(DeleteProductTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteProductTemplate);
    }

    /**
     * 删除产品主题
     * 删除产品主题
     *
     * @param DeleteProductTopicRequest 请求对象
     * @return DeleteProductTopicResponse
     */
    public DeleteProductTopicResponse deleteProductTopic(DeleteProductTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteProductTopic);
    }

    /**
     * 删除请求属性
     * 删除请求属性
     *
     * @param DeleteRequestPropertyRequest 请求对象
     * @return DeleteRequestPropertyResponse
     */
    public DeleteRequestPropertyResponse deleteRequestProperty(DeleteRequestPropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteRequestProperty);
    }

    /**
     * 删除流控策略
     * 删除指定的流控策略,以及该流控策略与API的所有绑定关系。
     *
     * @param DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return DeleteRequestThrottlingPolicyV2Response
     */
    public DeleteRequestThrottlingPolicyV2Response deleteRequestThrottlingPolicyV2(DeleteRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteRequestThrottlingPolicyV2);
    }

    /**
     * 删除响应属性
     * 删除响应属性
     *
     * @param DeleteResponsePropertyRequest 请求对象
     * @return DeleteResponsePropertyResponse
     */
    public DeleteResponsePropertyResponse deleteResponseProperty(DeleteResponsePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteResponseProperty);
    }

    /**
     * 删除规则
     * 删除规则
     *
     * @param DeleteRuleRequest 请求对象
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteRule);
    }

    /**
     * 删除服务
     * 删除服务
     *
     * @param DeleteServiceRequest 请求对象
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteService);
    }

    /**
     * 删除签名密钥
     * 删除指定的签名密钥,删除签名密钥时，其配置的绑定关系会一并删除，相应的签名密钥会失效。
     *
     * @param DeleteSignatureKeyV2Request 请求对象
     * @return DeleteSignatureKeyV2Response
     */
    public DeleteSignatureKeyV2Response deleteSignatureKeyV2(DeleteSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteSignatureKeyV2);
    }

    /**
     * 删除源数据源
     * 删除源数据源
     *
     * @param DeleteSourceRequest 请求对象
     * @return DeleteSourceResponse
     */
    public DeleteSourceResponse deleteSource(DeleteSourceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteSource);
    }

    /**
     * 删除特殊设置
     * 删除某个流控策略的某个特殊配置。
     *
     * @param DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return DeleteSpecialThrottlingConfigurationV2Response
     */
    public DeleteSpecialThrottlingConfigurationV2Response deleteSpecialThrottlingConfigurationV2(DeleteSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteSpecialThrottlingConfigurationV2);
    }

    /**
     * 解除客户端配额和客户端应用的绑定
     * 解除客户端配额和客户端应用的绑定
     *
     * @param DisassociateAppQuotaWithAppRequest 请求对象
     * @return DisassociateAppQuotaWithAppResponse
     */
    public DisassociateAppQuotaWithAppResponse disassociateAppQuotaWithApp(DisassociateAppQuotaWithAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.disassociateAppQuotaWithApp);
    }

    /**
     * 删除域名证书
     * 如果域名证书不再需要或者已过期，则可以删除证书内容。
     *
     * @param DisassociateCertificateV2Request 请求对象
     * @return DisassociateCertificateV2Response
     */
    public DisassociateCertificateV2Response disassociateCertificateV2(DisassociateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.disassociateCertificateV2);
    }

    /**
     * 解绑域名
     * 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     *
     * @param DisassociateDomainV2Request 请求对象
     * @return DisassociateDomainV2Response
     */
    public DisassociateDomainV2Response disassociateDomainV2(DisassociateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.disassociateDomainV2);
    }

    /**
     * 解除绑定
     * 解除API与签名密钥的绑定关系。
     *
     * @param DisassociateSignatureKeyV2Request 请求对象
     * @return DisassociateSignatureKeyV2Response
     */
    public DisassociateSignatureKeyV2Response disassociateSignatureKeyV2(DisassociateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.disassociateSignatureKeyV2);
    }

    /**
     * 导出产品
     * 导出产品
     *
     * @param DownloadProductsRequest 请求对象
     * @return DownloadProductsResponse
     */
    public DownloadProductsResponse downloadProducts(DownloadProductsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.downloadProducts);
    }

    /**
     * 导出Topic
     * 导出Topic。
     *
     * @param ExportMqsInstanceTopicRequest 请求对象
     * @return ExportMqsInstanceTopicResponse
     */
    public ExportMqsInstanceTopicResponse exportMqsInstanceTopic(ExportMqsInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.exportMqsInstanceTopic);
    }

    /**
     * 导入Topic
     * 导入Topic。
     *
     * @param ImportMqsInstanceTopicRequest 请求对象
     * @return ImportMqsInstanceTopicResponse
     */
    public ImportMqsInstanceTopicResponse importMqsInstanceTopic(ImportMqsInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.importMqsInstanceTopic);
    }

    /**
     * 查看签名密钥绑定的API列表
     * 查询某个签名密钥上已经绑定的API列表。
     *
     * @param ListApisBindedToSignatureKeyV2Request 请求对象
     * @return ListApisBindedToSignatureKeyV2Response
     */
    public ListApisBindedToSignatureKeyV2Response listApisBindedToSignatureKeyV2(ListApisBindedToSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisBindedToSignatureKeyV2);
    }

    /**
     * 查看签名密钥未绑定的API列表
     * 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return ListApisNotBoundWithSignatureKeyV2Response
     */
    public ListApisNotBoundWithSignatureKeyV2Response listApisNotBoundWithSignatureKeyV2(ListApisNotBoundWithSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisNotBoundWithSignatureKeyV2);
    }

    /**
     * 查询APP Code列表
     * 查询App Code列表。
     *
     * @param ListAppCodesV2Request 请求对象
     * @return ListAppCodesV2Response
     */
    public ListAppCodesV2Response listAppCodesV2(ListAppCodesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppCodesV2);
    }

    /**
     * 查询应用配置列表
     * 查询应用配置列表
     *
     * @param ListAppConfigsV2Request 请求对象
     * @return ListAppConfigsV2Response
     */
    public ListAppConfigsV2Response listAppConfigsV2(ListAppConfigsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppConfigsV2);
    }

    /**
     * 查询客户端配额可绑定的客户端应用列表
     * 查询客户端配额可绑定的客户端应用列表。支持按客户端应用名称模糊搜索
     *
     * @param ListAppQuotaBindableAppsRequest 请求对象
     * @return ListAppQuotaBindableAppsResponse
     */
    public ListAppQuotaBindableAppsResponse listAppQuotaBindableApps(ListAppQuotaBindableAppsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppQuotaBindableApps);
    }

    /**
     * 查询客户端配额已绑定的客户端应用列表
     * 查询客户端配额已绑定的客户端应用列表。支持按客户端应用名称模糊匹配
     *
     * @param ListAppQuotaBoundAppsRequest 请求对象
     * @return ListAppQuotaBoundAppsResponse
     */
    public ListAppQuotaBoundAppsResponse listAppQuotaBoundApps(ListAppQuotaBoundAppsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppQuotaBoundApps);
    }

    /**
     * 获取客户端配额列表
     * 获取客户端配额列表。支持根据名称模糊查询
     *
     * @param ListAppQuotasRequest 请求对象
     * @return ListAppQuotasResponse
     */
    public ListAppQuotasResponse listAppQuotas(ListAppQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppQuotas);
    }

    /**
     * 查询APP列表
     * 查询APP列表。
     *
     * @param ListAppsV2Request 请求对象
     * @return ListAppsV2Response
     */
    public ListAppsV2Response listAppsV2(ListAppsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppsV2);
    }

    /**
     * 查询命令
     * 查询命令
     *
     * @param ListCommandsRequest 请求对象
     * @return ListCommandsResponse
     */
    public ListCommandsResponse listCommands(ListCommandsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listCommands);
    }

    /**
     * 查询自定义认证列表
     * 查询自定义认证列表
     *
     * @param ListCustomAuthorizersV2Request 请求对象
     * @return ListCustomAuthorizersV2Response
     */
    public ListCustomAuthorizersV2Response listCustomAuthorizersV2(ListCustomAuthorizersV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listCustomAuthorizersV2);
    }

    /**
     * 查询目标数据源列表
     * 查询目标数据源列表
     *
     * @param ListDestinationsRequest 请求对象
     * @return ListDestinationsResponse
     */
    public ListDestinationsResponse listDestinations(ListDestinationsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDestinations);
    }

    /**
     * 查询设备
     * 查询设备
     *
     * @param ListDevicesRequest 请求对象
     * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevices(ListDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDevices);
    }

    /**
     * 查询产品内设备数量
     * 查询产品内设备数量
     *
     * @param ListDevicesInProductRequest 请求对象
     * @return ListDevicesInProductResponse
     */
    public ListDevicesInProductResponse listDevicesInProduct(ListDevicesInProductRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDevicesInProduct);
    }

    /**
     * 查询变量列表
     * 查询分组下的所有环境变量的列表。
     *
     * @param ListEnvironmentVariablesV2Request 请求对象
     * @return ListEnvironmentVariablesV2Response
     */
    public ListEnvironmentVariablesV2Response listEnvironmentVariablesV2(ListEnvironmentVariablesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listEnvironmentVariablesV2);
    }

    /**
     * 查询环境列表
     * 查询符合条件的环境列表。
     *
     * @param ListEnvironmentsV2Request 请求对象
     * @return ListEnvironmentsV2Response
     */
    public ListEnvironmentsV2Response listEnvironmentsV2(ListEnvironmentsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listEnvironmentsV2);
    }

    /**
     * 查看实例特性列表
     * 查看实例特性列表。注意：实例不支持以下特性的需要联系技术支持升级实例版本。  支持配置的特性列表及特性配置请参考“附录 &gt; 实例支持的APIC特性”
     *
     * @param ListFeaturesV2Request 请求对象
     * @return ListFeaturesV2Response
     */
    public ListFeaturesV2Response listFeaturesV2(ListFeaturesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listFeaturesV2);
    }

    /**
     * API指标统计值查询-最近一段时间
     * 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。 &gt; 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     *
     * @param ListLatelyApiStatisticsV2Request 请求对象
     * @return ListLatelyApiStatisticsV2Response
     */
    public ListLatelyApiStatisticsV2Response listLatelyApiStatisticsV2(ListLatelyApiStatisticsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listLatelyApiStatisticsV2);
    }

    /**
     * 查询后端API部署历史
     * 在某个实例中查询后端API的部署记录。
     *
     * @param ListLiveDataApiDeploymentHistoryV2Request 请求对象
     * @return ListLiveDataApiDeploymentHistoryV2Response
     */
    public ListLiveDataApiDeploymentHistoryV2Response listLiveDataApiDeploymentHistoryV2(ListLiveDataApiDeploymentHistoryV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listLiveDataApiDeploymentHistoryV2);
    }

    /**
     * 查询后端API测试结果
     * 在某个实例中查询后端API的测试结果。
     *
     * @param ListLiveDataApiTestHistoryV2Request 请求对象
     * @return ListLiveDataApiTestHistoryV2Response
     */
    public ListLiveDataApiTestHistoryV2Response listLiveDataApiTestHistoryV2(ListLiveDataApiTestHistoryV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listLiveDataApiTestHistoryV2);
    }

    /**
     * 查询后端API列表
     * 获取某个实例下的所有后端API。
     *
     * @param ListLiveDataApiV2Request 请求对象
     * @return ListLiveDataApiV2Response
     */
    public ListLiveDataApiV2Response listLiveDataApiV2(ListLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listLiveDataApiV2);
    }

    /**
     * 查询自定义后端服务数据源列表
     * 查询自定义后端服务数据源列表。
     *
     * @param ListLiveDataDataSourcesV2Request 请求对象
     * @return ListLiveDataDataSourcesV2Response
     */
    public ListLiveDataDataSourcesV2Response listLiveDataDataSourcesV2(ListLiveDataDataSourcesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listLiveDataDataSourcesV2);
    }

    /**
     * 查询自定义后端服务配额
     * 查询自定义后端服务配额。
     *
     * @param ListLiveDataQuotaV2Request 请求对象
     * @return ListLiveDataQuotaV2Response
     */
    public ListLiveDataQuotaV2Response listLiveDataQuotaV2(ListLiveDataQuotaV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listLiveDataQuotaV2);
    }

    /**
     * 任务监控信息列表查询
     * 查询所有任务的监控信息
     *
     * @param ListMonitorInfosRequest 请求对象
     * @return ListMonitorInfosResponse
     */
    public ListMonitorInfosResponse listMonitorInfos(ListMonitorInfosRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listMonitorInfos);
    }

    /**
     * 任务监控日志查询
     * 查询单个任务的所有日志信息
     *
     * @param ListMonitorLogRequest 请求对象
     * @return ListMonitorLogResponse
     */
    public ListMonitorLogResponse listMonitorLog(ListMonitorLogRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listMonitorLog);
    }

    /**
     * 查询Topic列表
     * 查询Topic列表。
     *
     * @param ListMqsInstanceTopicsRequest 请求对象
     * @return ListMqsInstanceTopicsResponse
     */
    public ListMqsInstanceTopicsResponse listMqsInstanceTopics(ListMqsInstanceTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listMqsInstanceTopics);
    }

    /**
     * 查询产品模板
     * 查询产品模板
     *
     * @param ListProductTemplatesRequest 请求对象
     * @return ListProductTemplatesResponse
     */
    public ListProductTemplatesResponse listProductTemplates(ListProductTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listProductTemplates);
    }

    /**
     * 查询产品主题
     * 查询产品主题
     *
     * @param ListProductTopicsRequest 请求对象
     * @return ListProductTopicsResponse
     */
    public ListProductTopicsResponse listProductTopics(ListProductTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listProductTopics);
    }

    /**
     * 查询产品
     * 查询产品
     *
     * @param ListProductsRequest 请求对象
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listProducts);
    }

    /**
     * 查询某个实例的租户配置列表
     * 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     *
     * @param ListProjectCofigsV2Request 请求对象
     * @return ListProjectCofigsV2Response
     */
    public ListProjectCofigsV2Response listProjectCofigsV2(ListProjectCofigsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listProjectCofigsV2);
    }

    /**
     * 查询属性
     * 查询属性
     *
     * @param ListPropertiesRequest 请求对象
     * @return ListPropertiesResponse
     */
    public ListPropertiesResponse listProperties(ListPropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listProperties);
    }

    /**
     * 查询请求属性
     * 查询请求属性
     *
     * @param ListRequestPropertiesRequest 请求对象
     * @return ListRequestPropertiesResponse
     */
    public ListRequestPropertiesResponse listRequestProperties(ListRequestPropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listRequestProperties);
    }

    /**
     * 查询流控策略列表
     * 查询所有流控策略的信息。
     *
     * @param ListRequestThrottlingPolicyV2Request 请求对象
     * @return ListRequestThrottlingPolicyV2Response
     */
    public ListRequestThrottlingPolicyV2Response listRequestThrottlingPolicyV2(ListRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listRequestThrottlingPolicyV2);
    }

    /**
     * 查询响应属性
     * 查询响应属性
     *
     * @param ListResponsePropertiesRequest 请求对象
     * @return ListResponsePropertiesResponse
     */
    public ListResponsePropertiesResponse listResponseProperties(ListResponsePropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listResponseProperties);
    }

    /**
     * 查询规则
     * 查询规则
     *
     * @param ListRulesRequest 请求对象
     * @return ListRulesResponse
     */
    public ListRulesResponse listRules(ListRulesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listRules);
    }

    /**
     * 查询服务
     * 查询服务
     *
     * @param ListServicesRequest 请求对象
     * @return ListServicesResponse
     */
    public ListServicesResponse listServices(ListServicesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listServices);
    }

    /**
     * 查询设备影子
     * 查询设备影子
     *
     * @param ListShadowsRequest 请求对象
     * @return ListShadowsResponse
     */
    public ListShadowsResponse listShadows(ListShadowsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listShadows);
    }

    /**
     * 查看API绑定的签名密钥列表
     * 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     *
     * @param ListSignatureKeysBindedToApiV2Request 请求对象
     * @return ListSignatureKeysBindedToApiV2Response
     */
    public ListSignatureKeysBindedToApiV2Response listSignatureKeysBindedToApiV2(ListSignatureKeysBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listSignatureKeysBindedToApiV2);
    }

    /**
     * 查询签名密钥列表
     * 查询所有签名密钥的信息。
     *
     * @param ListSignatureKeysV2Request 请求对象
     * @return ListSignatureKeysV2Response
     */
    public ListSignatureKeysV2Response listSignatureKeysV2(ListSignatureKeysV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listSignatureKeysV2);
    }

    /**
     * 查询源数据源列表
     * 查询源数据源列表
     *
     * @param ListSourcesRequest 请求对象
     * @return ListSourcesResponse
     */
    public ListSourcesResponse listSources(ListSourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listSources);
    }

    /**
     * 查看特殊设置列表
     * 查看给流控策略设置的特殊配置。
     *
     * @param ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return ListSpecialThrottlingConfigurationsV2Response
     */
    public ListSpecialThrottlingConfigurationsV2Response listSpecialThrottlingConfigurationsV2(ListSpecialThrottlingConfigurationsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listSpecialThrottlingConfigurationsV2);
    }

    /**
     * 查询API指标统计值
     * 查询某个实例下的API统计信息。
     *
     * @param ListStatisticsApiRequest 请求对象
     * @return ListStatisticsApiResponse
     */
    public ListStatisticsApiResponse listStatisticsApi(ListStatisticsApiRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listStatisticsApi);
    }

    /**
     * 查询子设备
     * 查询子设备
     *
     * @param ListSubsetsRequest 请求对象
     * @return ListSubsetsResponse
     */
    public ListSubsetsResponse listSubsets(ListSubsetsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listSubsets);
    }

    /**
     * 查询标签列表
     * 查询标签列表
     *
     * @param ListTagsV2Request 请求对象
     * @return ListTagsV2Response
     */
    public ListTagsV2Response listTagsV2(ListTagsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listTagsV2);
    }

    /**
     * 查询设备主题
     * 查询设备主题
     *
     * @param ListTopicsRequest 请求对象
     * @return ListTopicsResponse
     */
    public ListTopicsResponse listTopics(ListTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listTopics);
    }

    /**
     * 部署后端API
     * 在某个实例中部署后端API。
     *
     * @param PublishLiveDataApiV2Request 请求对象
     * @return PublishLiveDataApiV2Response
     */
    public PublishLiveDataApiV2Response publishLiveDataApiV2(PublishLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.publishLiveDataApiV2);
    }

    /**
     * 重置设备鉴权信息
     * 重置设备鉴权信息
     *
     * @param ResetAuthenticationRequest 请求对象
     * @return ResetAuthenticationResponse
     */
    public ResetAuthenticationResponse resetAuthentication(ResetAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.resetAuthentication);
    }

    /**
     * 重发消息
     * 重发消息。
     *
     * @param ResetMessagesRequest 请求对象
     * @return ResetMessagesResponse
     */
    public ResetMessagesResponse resetMessages(ResetMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.resetMessages);
    }

    /**
     * 重置产品鉴权信息
     * 重置产品鉴权信息
     *
     * @param ResetProductAuthenticationRequest 请求对象
     * @return ResetProductAuthenticationResponse
     */
    public ResetProductAuthenticationResponse resetProductAuthentication(ResetProductAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.resetProductAuthentication);
    }

    /**
     * 发送命令
     * 发送命令
     *
     * @param SendCommandRequest 请求对象
     * @return SendCommandResponse
     */
    public SendCommandResponse sendCommand(SendCommandRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.sendCommand);
    }

    /**
     * 查询客户端应用关联的应用配额
     * 查看指定客户端应用关联的应用配额。
     *
     * @param ShowAppBoundAppQuotaRequest 请求对象
     * @return ShowAppBoundAppQuotaResponse
     */
    public ShowAppBoundAppQuotaResponse showAppBoundAppQuota(ShowAppBoundAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showAppBoundAppQuota);
    }

    /**
     * 获取客户端配额详情
     * 获取客户端配额详情
     *
     * @param ShowAppQuotaRequest 请求对象
     * @return ShowAppQuotaResponse
     */
    public ShowAppQuotaResponse showAppQuota(ShowAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showAppQuota);
    }

    /**
     * 查询设备鉴权信息
     * 查询设备鉴权信息
     *
     * @param ShowAuthenticationRequest 请求对象
     * @return ShowAuthenticationResponse
     */
    public ShowAuthenticationResponse showAuthentication(ShowAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showAuthentication);
    }

    /**
     * 查询命令详情
     * 查询命令详情
     *
     * @param ShowCommandRequest 请求对象
     * @return ShowCommandResponse
     */
    public ShowCommandResponse showCommand(ShowCommandRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showCommand);
    }

    /**
     * 查看APP的访问控制详情
     * 查看APP的访问控制详情。
     *
     * @param ShowDetailsOfAppAclRequest 请求对象
     * @return ShowDetailsOfAppAclResponse
     */
    public ShowDetailsOfAppAclResponse showDetailsOfAppAcl(ShowDetailsOfAppAclRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfAppAcl);
    }

    /**
     * 查看APP Code详情
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param ShowDetailsOfAppCodeV2Request 请求对象
     * @return ShowDetailsOfAppCodeV2Response
     */
    public ShowDetailsOfAppCodeV2Response showDetailsOfAppCodeV2(ShowDetailsOfAppCodeV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfAppCodeV2);
    }

    /**
     * 查看应用配置详情
     * 查看应用配置详情
     *
     * @param ShowDetailsOfAppConfigV2Request 请求对象
     * @return ShowDetailsOfAppConfigV2Response
     */
    public ShowDetailsOfAppConfigV2Response showDetailsOfAppConfigV2(ShowDetailsOfAppConfigV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfAppConfigV2);
    }

    /**
     * 查看APP详情
     * 查看指定APP的详细信息。
     *
     * @param ShowDetailsOfAppV2Request 请求对象
     * @return ShowDetailsOfAppV2Response
     */
    public ShowDetailsOfAppV2Response showDetailsOfAppV2(ShowDetailsOfAppV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfAppV2);
    }

    /**
     * 查看自定义认证详情
     * 查看自定义认证详情
     *
     * @param ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return ShowDetailsOfCustomAuthorizersV2Response
     */
    public ShowDetailsOfCustomAuthorizersV2Response showDetailsOfCustomAuthorizersV2(ShowDetailsOfCustomAuthorizersV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfCustomAuthorizersV2);
    }

    /**
     * 查看域名证书
     * 查看域名下绑定的证书详情。
     *
     * @param ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return ShowDetailsOfDomainNameCertificateV2Response
     */
    public ShowDetailsOfDomainNameCertificateV2Response showDetailsOfDomainNameCertificateV2(ShowDetailsOfDomainNameCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfDomainNameCertificateV2);
    }

    /**
     * 查看变量详情
     * 查看指定的环境变量的详情。
     *
     * @param ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return ShowDetailsOfEnvironmentVariableV2Response
     */
    public ShowDetailsOfEnvironmentVariableV2Response showDetailsOfEnvironmentVariableV2(ShowDetailsOfEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfEnvironmentVariableV2);
    }

    /**
     * 查看ROMA Connect实例详情
     * 查看ROMA Connect实例详情
     *
     * @param ShowDetailsOfInstanceV2Request 请求对象
     * @return ShowDetailsOfInstanceV2Response
     */
    public ShowDetailsOfInstanceV2Response showDetailsOfInstanceV2(ShowDetailsOfInstanceV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfInstanceV2);
    }

    /**
     * 查看流控策略详情
     * 查看指定流控策略的详细信息。
     *
     * @param ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return ShowDetailsOfRequestThrottlingPolicyV2Response
     */
    public ShowDetailsOfRequestThrottlingPolicyV2Response showDetailsOfRequestThrottlingPolicyV2(ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfRequestThrottlingPolicyV2);
    }

    /**
     * 查询设备详情
     * 查询设备详情
     *
     * @param ShowDeviceRequest 请求对象
     * @return ShowDeviceResponse
     */
    public ShowDeviceResponse showDevice(ShowDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDevice);
    }

    /**
     * 查询设备分组详情
     * 获取设备分组及下一层分组信息
     *
     * @param ShowDeviceGroupRequest 请求对象
     * @return ShowDeviceGroupResponse
     */
    public ShowDeviceGroupResponse showDeviceGroup(ShowDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDeviceGroup);
    }

    /**
     * 查询所有设备分组
     * 查询所有设备分组
     *
     * @param ShowDeviceGroupTreeRequest 请求对象
     * @return ShowDeviceGroupTreeResponse
     */
    public ShowDeviceGroupTreeResponse showDeviceGroupTree(ShowDeviceGroupTreeRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDeviceGroupTree);
    }

    /**
     * 查询后端API详情
     * 查询后端API的详细信息。
     *
     * @param ShowLiveDataApiV2Request 请求对象
     * @return ShowLiveDataApiV2Response
     */
    public ShowLiveDataApiV2Response showLiveDataApiV2(ShowLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showLiveDataApiV2);
    }

    /**
     * 查询消息
     * 查询消息。
     *
     * @param ShowMqsInstanceMessagesRequest 请求对象
     * @return ShowMqsInstanceMessagesResponse
     */
    public ShowMqsInstanceMessagesResponse showMqsInstanceMessages(ShowMqsInstanceMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showMqsInstanceMessages);
    }

    /**
     * 查询Topic权限
     * 查询Topic权限。
     *
     * @param ShowMqsInstanceTopicAccessPolicyRequest 请求对象
     * @return ShowMqsInstanceTopicAccessPolicyResponse
     */
    public ShowMqsInstanceTopicAccessPolicyResponse showMqsInstanceTopicAccessPolicy(ShowMqsInstanceTopicAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showMqsInstanceTopicAccessPolicy);
    }

    /**
     * 查询产品详情
     * 查询产品详情
     *
     * @param ShowProductRequest 请求对象
     * @return ShowProductResponse
     */
    public ShowProductResponse showProduct(ShowProductRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showProduct);
    }

    /**
     * 查询产品鉴权信息
     * 查询产品鉴权信息
     *
     * @param ShowProductAuthenticationRequest 请求对象
     * @return ShowProductAuthenticationResponse
     */
    public ShowProductAuthenticationResponse showProductAuthentication(ShowProductAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showProductAuthentication);
    }

    /**
     * 查询响应属性详情
     * 查询响应属性详情
     *
     * @param ShowResponsePropertyRequest 请求对象
     * @return ShowResponsePropertyResponse
     */
    public ShowResponsePropertyResponse showResponseProperty(ShowResponsePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showResponseProperty);
    }

    /**
     * 查询规则详情
     * 查询规则详情
     *
     * @param ShowRuleRequest 请求对象
     * @return ShowRuleResponse
     */
    public ShowRuleResponse showRule(ShowRuleRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showRule);
    }

    /**
     * 查询服务详情
     * 查询服务详情
     *
     * @param ShowServiceRequest 请求对象
     * @return ShowServiceResponse
     */
    public ShowServiceResponse showService(ShowServiceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showService);
    }

    /**
     * 撤销后端API
     * 在某个实例中取消部署后端API。
     *
     * @param UnpublishLiveDataApiV2Request 请求对象
     * @return UnpublishLiveDataApiV2Response
     */
    public UnpublishLiveDataApiV2Response unpublishLiveDataApiV2(UnpublishLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.unpublishLiveDataApiV2);
    }

    /**
     * 设置APP的访问控制
     * 设置客户端配置的访问控制。
     *
     * @param UpdateAppAclRequest 请求对象
     * @return UpdateAppAclResponse
     */
    public UpdateAppAclResponse updateAppAcl(UpdateAppAclRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateAppAcl);
    }

    /**
     * 修改应用配置
     * 修改应用配置
     *
     * @param UpdateAppConfigV2Request 请求对象
     * @return UpdateAppConfigV2Response
     */
    public UpdateAppConfigV2Response updateAppConfigV2(UpdateAppConfigV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateAppConfigV2);
    }

    /**
     * 修改客户端配额
     * 修改客户端配额
     *
     * @param UpdateAppQuotaRequest 请求对象
     * @return UpdateAppQuotaResponse
     */
    public UpdateAppQuotaResponse updateAppQuota(UpdateAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateAppQuota);
    }

    /**
     * 修改命令
     * 修改命令
     *
     * @param UpdateCommandRequest 请求对象
     * @return UpdateCommandResponse
     */
    public UpdateCommandResponse updateCommand(UpdateCommandRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateCommand);
    }

    /**
     * 修改自定义认证
     * 修改自定义认证
     *
     * @param UpdateCustomAuthorizerV2Request 请求对象
     * @return UpdateCustomAuthorizerV2Response
     */
    public UpdateCustomAuthorizerV2Response updateCustomAuthorizerV2(UpdateCustomAuthorizerV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateCustomAuthorizerV2);
    }

    /**
     * 修改设备
     * 修改设备信息
     *
     * @param UpdateDeviceRequest 请求对象
     * @return UpdateDeviceResponse
     */
    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateDevice);
    }

    /**
     * 修改设备分组
     * 修改设备分组
     *
     * @param UpdateDeviceGroupRequest 请求对象
     * @return UpdateDeviceGroupResponse
     */
    public UpdateDeviceGroupResponse updateDeviceGroup(UpdateDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateDeviceGroup);
    }

    /**
     * 修改域名
     * 修改绑定的域名所对应的配置信息。
     *
     * @param UpdateDomainV2Request 请求对象
     * @return UpdateDomainV2Response
     */
    public UpdateDomainV2Response updateDomainV2(UpdateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateDomainV2);
    }

    /**
     * 修改环境
     * 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     *
     * @param UpdateEnvironmentV2Request 请求对象
     * @return UpdateEnvironmentV2Response
     */
    public UpdateEnvironmentV2Response updateEnvironmentV2(UpdateEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateEnvironmentV2);
    }

    /**
     * 修改变量
     * 修改环境变量。环境变量引用位置为api的后端服务地址时，修改对应环境变量会将使用该变量的所有api重新发布。
     *
     * @param UpdateEnvironmentVariableV2Request 请求对象
     * @return UpdateEnvironmentVariableV2Response
     */
    public UpdateEnvironmentVariableV2Response updateEnvironmentVariableV2(UpdateEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateEnvironmentVariableV2);
    }

    /**
     * 修改后端API
     * 在某个实例中更新后端API的参数。
     *
     * @param UpdateLiveDataApiV2Request 请求对象
     * @return UpdateLiveDataApiV2Response
     */
    public UpdateLiveDataApiV2Response updateLiveDataApiV2(UpdateLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateLiveDataApiV2);
    }

    /**
     * 修改Topic
     * 修改Topic。
     *
     * @param UpdateMqsInstanceTopicRequest 请求对象
     * @return UpdateMqsInstanceTopicResponse
     */
    public UpdateMqsInstanceTopicResponse updateMqsInstanceTopic(UpdateMqsInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateMqsInstanceTopic);
    }

    /**
     * 修改产品信息
     * 修改产品信息
     *
     * @param UpdateProductRequest 请求对象
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateProduct);
    }

    /**
     * 修改产品模板
     * 修改产品模板
     *
     * @param UpdateProductTemplateRequest 请求对象
     * @return UpdateProductTemplateResponse
     */
    public UpdateProductTemplateResponse updateProductTemplate(UpdateProductTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateProductTemplate);
    }

    /**
     * 更新产品主题
     * 更新产品主题
     *
     * @param UpdateProductTopicRequest 请求对象
     * @return UpdateProductTopicResponse
     */
    public UpdateProductTopicResponse updateProductTopic(UpdateProductTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateProductTopic);
    }

    /**
     * 修改请求属性
     * 修改请求属性
     *
     * @param UpdateRequestPropertyRequest 请求对象
     * @return UpdateRequestPropertyResponse
     */
    public UpdateRequestPropertyResponse updateRequestProperty(UpdateRequestPropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateRequestProperty);
    }

    /**
     * 修改流控策略
     * 修改指定流控策略的详细信息。
     *
     * @param UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return UpdateRequestThrottlingPolicyV2Response
     */
    public UpdateRequestThrottlingPolicyV2Response updateRequestThrottlingPolicyV2(UpdateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateRequestThrottlingPolicyV2);
    }

    /**
     * 修改响应属性
     * 修改响应属性
     *
     * @param UpdateResponsePropertyRequest 请求对象
     * @return UpdateResponsePropertyResponse
     */
    public UpdateResponsePropertyResponse updateResponseProperty(UpdateResponsePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateResponseProperty);
    }

    /**
     * 修改规则
     * 修改规则
     *
     * @param UpdateRuleRequest 请求对象
     * @return UpdateRuleResponse
     */
    public UpdateRuleResponse updateRule(UpdateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateRule);
    }

    /**
     * 修改服务
     * 修改服务
     *
     * @param UpdateServiceRequest 请求对象
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateService);
    }

    /**
     * 修改签名密钥
     * 修改指定签名密钥的详细信息。
     *
     * @param UpdateSignatureKeyV2Request 请求对象
     * @return UpdateSignatureKeyV2Response
     */
    public UpdateSignatureKeyV2Response updateSignatureKeyV2(UpdateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateSignatureKeyV2);
    }

    /**
     * 修改特殊设置
     * 修改某个流控策略下的某个特殊设置。
     *
     * @param UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return UpdateSpecialThrottlingConfigurationV2Response
     */
    public UpdateSpecialThrottlingConfigurationV2Response updateSpecialThrottlingConfigurationV2(UpdateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateSpecialThrottlingConfigurationV2);
    }

    /**
     * 更新Topic权限
     * 更新Topic权限。
     *
     * @param UpdateTopicAccessPolicyRequest 请求对象
     * @return UpdateTopicAccessPolicyResponse
     */
    public UpdateTopicAccessPolicyResponse updateTopicAccessPolicy(UpdateTopicAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateTopicAccessPolicy);
    }

    /**
     * 导入产品
     * 导入产品
     *
     * @param UploadProductRequest 请求对象
     * @return UploadProductResponse
     */
    public UploadProductResponse uploadProduct(UploadProductRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.uploadProduct);
    }

    /**
     * 批量删除ACL策略
     * 批量删除指定的多个ACL策略。  删除ACL策略时，如果存在ACL策略与API绑定关系，则无法删除。
     *
     * @param BatchDeleteAclV2Request 请求对象
     * @return BatchDeleteAclV2Response
     */
    public BatchDeleteAclV2Response batchDeleteAclV2(BatchDeleteAclV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDeleteAclV2);
    }

    /**
     * 创建ACL策略
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com\&quot;之类的网络域名。
     *
     * @param CreateAclStrategyV2Request 请求对象
     * @return CreateAclStrategyV2Response
     */
    public CreateAclStrategyV2Response createAclStrategyV2(CreateAclStrategyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createAclStrategyV2);
    }

    /**
     * 删除ACL策略
     * 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     *
     * @param DeleteAclV2Request 请求对象
     * @return DeleteAclV2Response
     */
    public DeleteAclV2Response deleteAclV2(DeleteAclV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteAclV2);
    }

    /**
     * 查看ACL策略列表
     * 查询所有的ACL策略列表。 
     *
     * @param ListAclStrategiesV2Request 请求对象
     * @return ListAclStrategiesV2Response
     */
    public ListAclStrategiesV2Response listAclStrategiesV2(ListAclStrategiesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAclStrategiesV2);
    }

    /**
     * 查看ACL策略详情
     * 查询指定ACL策略的详情。
     *
     * @param ShowDetailsOfAclPolicyV2Request 请求对象
     * @return ShowDetailsOfAclPolicyV2Response
     */
    public ShowDetailsOfAclPolicyV2Response showDetailsOfAclPolicyV2(ShowDetailsOfAclPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfAclPolicyV2);
    }

    /**
     * 修改ACL策略
     * 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     *
     * @param UpdateAclStrategyV2Request 请求对象
     * @return UpdateAclStrategyV2Response
     */
    public UpdateAclStrategyV2Response updateAclStrategyV2(UpdateAclStrategyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateAclStrategyV2);
    }

    /**
     * 绑定流控策略
     * 将流控策略应用于API，则所有对该API的访问将会受到该流控策略的限制。  当一定时间内的访问次数超过流控策略设置的API最大访问次数限制后，后续的访问将会被拒绝，从而能够较好的保护后端API免受异常流量的冲击，保障服务的稳定运行。  为指定的API绑定流控策略，绑定时，需要指定在哪个环境上生效。同一个API发布到不同的环境可以绑定不同的流控策略；一个API在发布到特定环境后只能绑定一个默认的流控策略。
     *
     * @param AssociateRequestThrottlingPolicyV2Request 请求对象
     * @return AssociateRequestThrottlingPolicyV2Response
     */
    public AssociateRequestThrottlingPolicyV2Response associateRequestThrottlingPolicyV2(AssociateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.associateRequestThrottlingPolicyV2);
    }

    /**
     * 批量解绑流控策略
     * 批量解除API与流控策略的绑定关系
     *
     * @param BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return BatchDisassociateThrottlingPolicyV2Response
     */
    public BatchDisassociateThrottlingPolicyV2Response batchDisassociateThrottlingPolicyV2(BatchDisassociateThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDisassociateThrottlingPolicyV2);
    }

    /**
     * 批量发布或下线API
     * 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。
     *
     * @param BatchPublishOrOfflineApiV2Request 请求对象
     * @return BatchPublishOrOfflineApiV2Response
     */
    public BatchPublishOrOfflineApiV2Response batchPublishOrOfflineApiV2(BatchPublishOrOfflineApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchPublishOrOfflineApiV2);
    }

    /**
     * 切换API版本
     * API每次发布时，会基于当前的API定义生成一个版本。版本记录了API发布时的各种定义及状态。  多个版本之间可以进行随意切换。但一个API在一个环境上，只能有一个版本生效。
     *
     * @param ChangeApiVersionV2Request 请求对象
     * @return ChangeApiVersionV2Response
     */
    public ChangeApiVersionV2Response changeApiVersionV2(ChangeApiVersionV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.changeApiVersionV2);
    }

    /**
     * 校验API分组名称是否存在
     * 校验API分组名称是否存在。
     *
     * @param CheckApiGroupsV2Request 请求对象
     * @return CheckApiGroupsV2Response
     */
    public CheckApiGroupsV2Response checkApiGroupsV2(CheckApiGroupsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkApiGroupsV2);
    }

    /**
     * 校验API定义
     * 校验API定义。校验API的路径或名称是否已存在
     *
     * @param CheckApisV2Request 请求对象
     * @return CheckApisV2Response
     */
    public CheckApisV2Response checkApisV2(CheckApisV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkApisV2);
    }

    /**
     * 创建API分组
     * API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。 
     *
     * @param CreateApiGroupV2Request 请求对象
     * @return CreateApiGroupV2Response
     */
    public CreateApiGroupV2Response createApiGroupV2(CreateApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createApiGroupV2);
    }

    /**
     * 创建API
     * 添加一个API，API即一个服务接口，具体的服务能力。  API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了ROMA Connect如何去访问真实的后端服务。API的真实后端服务目前支持三种类型：传统的HTTP/HTTPS形式的web后端、函数工作流、MOCK。 
     *
     * @param CreateApiV2Request 请求对象
     * @return CreateApiV2Response
     */
    public CreateApiV2Response createApiV2(CreateApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createApiV2);
    }

    /**
     * 发布或下线API
     * 对API进行发布或下线。  发布操作是将一个指定的API发布到一个指定的环境，API只有发布后，才能够被调用，且只能在该环境上才能被调用。未发布的API无法被调用。  下线操作是将API从某个已发布的环境上下线，下线后，API将无法再被调用。
     *
     * @param CreateOrDeletePublishRecordForApiV2Request 请求对象
     * @return CreateOrDeletePublishRecordForApiV2Response
     */
    public CreateOrDeletePublishRecordForApiV2Response createOrDeletePublishRecordForApiV2(CreateOrDeletePublishRecordForApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createOrDeletePublishRecordForApiV2);
    }

    /**
     * 调试API
     * 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     *
     * @param DebugApiV2Request 请求对象
     * @return DebugApiV2Response
     */
    public DebugApiV2Response debugApiV2(DebugApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.debugApiV2);
    }

    /**
     * 根据版本编号下线API
     * 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。  该接口供FunctionGraph服务使用。
     *
     * @param DeleteApiByVersionIdV2Request 请求对象
     * @return DeleteApiByVersionIdV2Response
     */
    public DeleteApiByVersionIdV2Response deleteApiByVersionIdV2(DeleteApiByVersionIdV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteApiByVersionIdV2);
    }

    /**
     * 删除API分组
     * 删除指定的API分组。  删除时，会一并删除直接或间接关联到该分组下的所有资源，包括API、独立域名、SSL证书、上架信息、分组下所有API的授权信息、编排信息、白名单配置、认证增强信息等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     *
     * @param DeleteApiGroupV2Request 请求对象
     * @return DeleteApiGroupV2Response
     */
    public DeleteApiGroupV2Response deleteApiGroupV2(DeleteApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteApiGroupV2);
    }

    /**
     * 删除API
     * 删除指定的API。  删除API时，会删除该API所有相关的资源信息或绑定关系，如API的发布记录，绑定的后端服务，对APP的授权信息等。
     *
     * @param DeleteApiV2Request 请求对象
     * @return DeleteApiV2Response
     */
    public DeleteApiV2Response deleteApiV2(DeleteApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteApiV2);
    }

    /**
     * 解除API与流控策略的绑定关系
     * 解除API与流控策略的绑定关系。
     *
     * @param DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return DisassociateRequestThrottlingPolicyV2Response
     */
    public DisassociateRequestThrottlingPolicyV2Response disassociateRequestThrottlingPolicyV2(DisassociateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.disassociateRequestThrottlingPolicyV2);
    }

    /**
     * 查询分组列表
     * 查询API分组列表。  如果是租户操作，则查询该租户下所有的分组；如果是管理员操作，则查询的是所有租户的分组。
     *
     * @param ListApiGroupsV2Request 请求对象
     * @return ListApiGroupsV2Response
     */
    public ListApiGroupsV2Response listApiGroupsV2(ListApiGroupsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApiGroupsV2);
    }

    /**
     * 查询API运行时定义
     * 查看指定的API在指定的环境上的运行时定义，默认查询RELEASE环境上的运行时定义。  API的定义分为临时定义和运行时定义，分别代表如下含义： - 临时定义：API在编辑中的定义，表示用户最后一次编辑后的API的状态 - 运行时定义：API在发布到某个环境时，对发布时的API的临时定义进行快照，固化出来的API的状态。  访问某个环境上的API，其实访问的就是其运行时的定义
     *
     * @param ListApiRuntimeDefinitionV2Request 请求对象
     * @return ListApiRuntimeDefinitionV2Response
     */
    public ListApiRuntimeDefinitionV2Response listApiRuntimeDefinitionV2(ListApiRuntimeDefinitionV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApiRuntimeDefinitionV2);
    }

    /**
     * 查看版本详情
     * 查询某个指定的版本详情。
     *
     * @param ListApiVersionDetailV2Request 请求对象
     * @return ListApiVersionDetailV2Response
     */
    public ListApiVersionDetailV2Response listApiVersionDetailV2(ListApiVersionDetailV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApiVersionDetailV2);
    }

    /**
     * 查询API历史版本列表
     * 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     *
     * @param ListApiVersionsV2Request 请求对象
     * @return ListApiVersionsV2Response
     */
    public ListApiVersionsV2Response listApiVersionsV2(ListApiVersionsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApiVersionsV2);
    }

    /**
     * 查看流控策略绑定的API列表
     * 查询某个流控策略上已经绑定的API列表。
     *
     * @param ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return ListApisBindedToRequestThrottlingPolicyV2Response
     */
    public ListApisBindedToRequestThrottlingPolicyV2Response listApisBindedToRequestThrottlingPolicyV2(ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisBindedToRequestThrottlingPolicyV2);
    }

    /**
     * 查看流控策略未绑定的API列表
     * 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return ListApisUnbindedToRequestThrottlingPolicyV2Response
     */
    public ListApisUnbindedToRequestThrottlingPolicyV2Response listApisUnbindedToRequestThrottlingPolicyV2(ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisUnbindedToRequestThrottlingPolicyV2);
    }

    /**
     * 查询API列表
     * 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息。
     *
     * @param ListApisV2Request 请求对象
     * @return ListApisV2Response
     */
    public ListApisV2Response listApisV2(ListApisV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisV2);
    }

    /**
     * 查看API绑定的流控策略列表
     * 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     *
     * @param ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return ListRequestThrottlingPoliciesBindedToApiV2Response
     */
    public ListRequestThrottlingPoliciesBindedToApiV2Response listRequestThrottlingPoliciesBindedToApiV2(ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listRequestThrottlingPoliciesBindedToApiV2);
    }

    /**
     * 查询分组详情
     * 查询指定分组的详细信息。
     *
     * @param ShowDetailsOfApiGroupV2Request 请求对象
     * @return ShowDetailsOfApiGroupV2Response
     */
    public ShowDetailsOfApiGroupV2Response showDetailsOfApiGroupV2(ShowDetailsOfApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfApiGroupV2);
    }

    /**
     * 查询API详情
     * 查看指定的API的详细信息。
     *
     * @param ShowDetailsOfApiV2Request 请求对象
     * @return ShowDetailsOfApiV2Response
     */
    public ShowDetailsOfApiV2Response showDetailsOfApiV2(ShowDetailsOfApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfApiV2);
    }

    /**
     * 修改API分组
     * 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     *
     * @param UpdateApiGroupV2Request 请求对象
     * @return UpdateApiGroupV2Response
     */
    public UpdateApiGroupV2Response updateApiGroupV2(UpdateApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateApiGroupV2);
    }

    /**
     * 修改API
     * 修改指定API的信息，包括后端服务信息。
     *
     * @param UpdateApiV2Request 请求对象
     * @return UpdateApiV2Response
     */
    public UpdateApiV2Response updateApiV2(UpdateApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateApiV2);
    }

    /**
     * 批量解除API与ACL策略的绑定
     * 批量解除API与ACL策略的绑定
     *
     * @param BatchDeleteApiAclBindingV2Request 请求对象
     * @return BatchDeleteApiAclBindingV2Response
     */
    public BatchDeleteApiAclBindingV2Response batchDeleteApiAclBindingV2(BatchDeleteApiAclBindingV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDeleteApiAclBindingV2);
    }

    /**
     * 将API与ACL策略进行绑定
     * 将API与ACL策略进行绑定。  同一个API发布到不同的环境可以绑定不同的ACL策略；一个API在发布到特定环境后只能绑定一个同一种类型的ACL策略。
     *
     * @param CreateApiAclBindingV2Request 请求对象
     * @return CreateApiAclBindingV2Response
     */
    public CreateApiAclBindingV2Response createApiAclBindingV2(CreateApiAclBindingV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createApiAclBindingV2);
    }

    /**
     * 解除API与ACL策略的绑定
     * 解除某条API与ACL策略的绑定关系
     *
     * @param DeleteApiAclBindingV2Request 请求对象
     * @return DeleteApiAclBindingV2Response
     */
    public DeleteApiAclBindingV2Response deleteApiAclBindingV2(DeleteApiAclBindingV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteApiAclBindingV2);
    }

    /**
     * 查看API绑定的ACL策略列表
     * 查看API绑定的ACL策略列表
     *
     * @param ListAclPolicyBindedToApiV2Request 请求对象
     * @return ListAclPolicyBindedToApiV2Response
     */
    public ListAclPolicyBindedToApiV2Response listAclPolicyBindedToApiV2(ListAclPolicyBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAclPolicyBindedToApiV2);
    }

    /**
     * 查看ACL策略绑定的API列表
     * 查看ACL策略绑定的API列表
     *
     * @param ListApisBindedToAclPolicyV2Request 请求对象
     * @return ListApisBindedToAclPolicyV2Response
     */
    public ListApisBindedToAclPolicyV2Response listApisBindedToAclPolicyV2(ListApisBindedToAclPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisBindedToAclPolicyV2);
    }

    /**
     * 查看ACL策略未绑定的API列表
     * 查看ACL策略未绑定的API列表，需要API已发布
     *
     * @param ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return ListApisUnbindedToAclPolicyV2Response
     */
    public ListApisUnbindedToAclPolicyV2Response listApisUnbindedToAclPolicyV2(ListApisUnbindedToAclPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisUnbindedToAclPolicyV2);
    }

    /**
     * 解除授权
     * 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     *
     * @param CancelingAuthorizationV2Request 请求对象
     * @return CancelingAuthorizationV2Response
     */
    public CancelingAuthorizationV2Response cancelingAuthorizationV2(CancelingAuthorizationV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.cancelingAuthorizationV2);
    }

    /**
     * APP授权
     * APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。 
     *
     * @param CreateAuthorizingAppsV2Request 请求对象
     * @return CreateAuthorizingAppsV2Response
     */
    public CreateAuthorizingAppsV2Response createAuthorizingAppsV2(CreateAuthorizingAppsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createAuthorizingAppsV2);
    }

    /**
     * 查看APP已绑定的API列表
     * 查询APP已经绑定的API列表。
     *
     * @param ListApisBindedToAppV2Request 请求对象
     * @return ListApisBindedToAppV2Response
     */
    public ListApisBindedToAppV2Response listApisBindedToAppV2(ListApisBindedToAppV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisBindedToAppV2);
    }

    /**
     * 查看APP未绑定的API列表
     * 查询指定环境上某个APP未绑定的API列表，包括自有API和从云市场购买的API。
     *
     * @param ListApisUnbindedToAppV2Request 请求对象
     * @return ListApisUnbindedToAppV2Response
     */
    public ListApisUnbindedToAppV2Response listApisUnbindedToAppV2(ListApisUnbindedToAppV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisUnbindedToAppV2);
    }

    /**
     * 查看API已绑定的APP列表
     * 查询API绑定的APP列表。
     *
     * @param ListAppsBindedToApiV2Request 请求对象
     * @return ListAppsBindedToApiV2Response
     */
    public ListAppsBindedToApiV2Response listAppsBindedToApiV2(ListAppsBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppsBindedToApiV2);
    }

    /**
     * 查看APP下路径冲突的api列表
     * 查询指定APP下路径冲突的api列表。
     *
     * @param ListDuplicateApisForAppV2Request 请求对象
     * @return ListDuplicateApisForAppV2Response
     */
    public ListDuplicateApisForAppV2Response listDuplicateApisForAppV2(ListDuplicateApisForAppV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDuplicateApisForAppV2);
    }

    /**
     * 查询MQS实例列表
     * 查询MQS实例列表。
     *
     * @param ListMqsInstanceRequest 请求对象
     * @return ListMqsInstanceResponse
     */
    public ListMqsInstanceResponse listMqsInstance(ListMqsInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listMqsInstance);
    }

    /**
     * 查询MQS实例详情
     * 查询指定MQS实例详情。
     *
     * @param ShowMqsInstanceRequest 请求对象
     * @return ShowMqsInstanceResponse
     */
    public ShowMqsInstanceResponse showMqsInstance(ShowMqsInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showMqsInstance);
    }

    /**
     * 导出API
     * 导出分组下API的定义信息，导出文件内容符合swagger标准规范。
     *
     * @param ExportApiDefinitionsV2Request 请求对象
     * @return ExportApiDefinitionsV2Response
     */
    public ExportApiDefinitionsV2Response exportApiDefinitionsV2(ExportApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.exportApiDefinitionsV2);
    }

    /**
     * 导出自定义后端API
     * 导出自定义后端API，导出文件内容符合swagger标准规范。
     *
     * @param ExportLiveDataApiDefinitionsV2Request 请求对象
     * @return ExportLiveDataApiDefinitionsV2Response
     */
    public ExportLiveDataApiDefinitionsV2Response exportLiveDataApiDefinitionsV2(ExportLiveDataApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.exportLiveDataApiDefinitionsV2);
    }

    /**
     * 导入API
     * 导入API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考《ROMA Connect用户指南》的“附录：前端API的Swagger扩展定义”章节。
     *
     * @param ImportApiDefinitionsV2Request 请求对象
     * @return ImportApiDefinitionsV2Response
     */
    public ImportApiDefinitionsV2Response importApiDefinitionsV2(ImportApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.importApiDefinitionsV2);
    }

    /**
     * 导入自定义后端API
     * 导入自定义后端API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考《ROMA Connect用户指南》的“附录：后端API的Swagger扩展定义”章节
     *
     * @param ImportLiveDataApiDefinitionsV2Request 请求对象
     * @return ImportLiveDataApiDefinitionsV2Response
     */
    public ImportLiveDataApiDefinitionsV2Response importLiveDataApiDefinitionsV2(ImportLiveDataApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.importLiveDataApiDefinitionsV2);
    }

    /**
     * 添加后端实例
     * 为指定的VPC通道添加弹性云服务器
     *
     * @param AddingBackendInstancesV2Request 请求对象
     * @return AddingBackendInstancesV2Response
     */
    public AddingBackendInstancesV2Response addingBackendInstancesV2(AddingBackendInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.addingBackendInstancesV2);
    }

    /**
     * 创建VPC通道
     * 在ROMA Connect APIC中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便ROMA Connect APIC直接访问私有VPC资源。 &gt; 每个用户最多创建30个VPC通道。
     *
     * @param CreateVpcChannelV2Request 请求对象
     * @return CreateVpcChannelV2Response
     */
    public CreateVpcChannelV2Response createVpcChannelV2(CreateVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createVpcChannelV2);
    }

    /**
     * 删除后端实例
     * 删除指定VPC通道中的弹性云服务器
     *
     * @param DeleteBackendInstanceV2Request 请求对象
     * @return DeleteBackendInstanceV2Response
     */
    public DeleteBackendInstanceV2Response deleteBackendInstanceV2(DeleteBackendInstanceV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteBackendInstanceV2);
    }

    /**
     * 删除VPC通道
     * 删除指定的VPC通道
     *
     * @param DeleteVpcChannelV2Request 请求对象
     * @return DeleteVpcChannelV2Response
     */
    public DeleteVpcChannelV2Response deleteVpcChannelV2(DeleteVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteVpcChannelV2);
    }

    /**
     * 查看后端实例列表
     * 查看指定VPC通道的弹性云服务器列表。
     *
     * @param ListBackendInstancesV2Request 请求对象
     * @return ListBackendInstancesV2Response
     */
    public ListBackendInstancesV2Response listBackendInstancesV2(ListBackendInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listBackendInstancesV2);
    }

    /**
     * 查询VPC通道列表
     * 查看VPC通道列表
     *
     * @param ListVpcChannelsV2Request 请求对象
     * @return ListVpcChannelsV2Response
     */
    public ListVpcChannelsV2Response listVpcChannelsV2(ListVpcChannelsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listVpcChannelsV2);
    }

    /**
     * 查看VPC通道详情
     * 查看指定的VPC通道详情
     *
     * @param ShowDetailsOfVpcChannelV2Request 请求对象
     * @return ShowDetailsOfVpcChannelV2Response
     */
    public ShowDetailsOfVpcChannelV2Response showDetailsOfVpcChannelV2(ShowDetailsOfVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfVpcChannelV2);
    }

    /**
     * 更新VPC通道
     * 更新指定VPC通道的参数
     *
     * @param UpdateVpcChannelV2Request 请求对象
     * @return UpdateVpcChannelV2Response
     */
    public UpdateVpcChannelV2Response updateVpcChannelV2(UpdateVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateVpcChannelV2);
    }

}