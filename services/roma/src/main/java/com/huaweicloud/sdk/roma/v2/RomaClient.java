package com.huaweicloud.sdk.roma.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
     * 添加子设备到网关
     * 添加子设备到网关
     *
     * @param AddSubsetsToGatewayRequest 请求对象
     * @return SyncInvoker<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse>
     */
    public SyncInvoker<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse> addSubsetsToGatewayInvoker(AddSubsetsToGatewayRequest request) {
        return new SyncInvoker<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse>(request, RomaMeta.addSubsetsToGateway, hcClient);
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
     * 客户端配额绑定客户端应用列表
     * 客户端配额绑定客户端应用列表
     *
     * @param AssociateAppsForAppQuotaRequest 请求对象
     * @return SyncInvoker<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse>
     */
    public SyncInvoker<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse> associateAppsForAppQuotaInvoker(AssociateAppsForAppQuotaRequest request) {
        return new SyncInvoker<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse>(request, RomaMeta.associateAppsForAppQuota, hcClient);
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
     * 绑定域名证书
     * 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。 本章节主要介绍为特定域名绑定证书。
     *
     * @param AssociateCertificateV2Request 请求对象
     * @return SyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response>
     */
    public SyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response> associateCertificateV2Invoker(AssociateCertificateV2Request request) {
        return new SyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response>(request, RomaMeta.associateCertificateV2, hcClient);
    }

    /**
     * 绑定域名
     * 用户自定义的域名，需要CNAME到API分组的子域名上才能生效。 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     *
     * @param AssociateDomainV2Request 请求对象
     * @return AssociateDomainV2Response
     */
    public AssociateDomainV2Response associateDomainV2(AssociateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.associateDomainV2);
    }

    /**
     * 绑定域名
     * 用户自定义的域名，需要CNAME到API分组的子域名上才能生效。 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     *
     * @param AssociateDomainV2Request 请求对象
     * @return SyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response>
     */
    public SyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response> associateDomainV2Invoker(AssociateDomainV2Request request) {
        return new SyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response>(request, RomaMeta.associateDomainV2, hcClient);
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
     * 绑定签名密钥
     * 签名密钥创建后，需要绑定到API才能生效。  将签名密钥绑定到API后，则ROMA Connect APIC请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。  将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     *
     * @param AssociateSignatureKeyV2Request 请求对象
     * @return SyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response>
     */
    public SyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> associateSignatureKeyV2Invoker(AssociateSignatureKeyV2Request request) {
        return new SyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response>(request, RomaMeta.associateSignatureKeyV2, hcClient);
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
     * 批量添加设备到设备分组
     * 批量添加设备到设备分组
     *
     * @param BatchAddDeviceToGroupRequest 请求对象
     * @return SyncInvoker<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse>
     */
    public SyncInvoker<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse> batchAddDeviceToGroupInvoker(BatchAddDeviceToGroupRequest request) {
        return new SyncInvoker<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse>(request, RomaMeta.batchAddDeviceToGroup, hcClient);
    }

    /**
     * 批量删除设备
     * 批量删除设备
     *
     * @param BatchDeleteDevicesRequest 请求对象
     * @return BatchDeleteDevicesResponse
     */
    public BatchDeleteDevicesResponse batchDeleteDevices(BatchDeleteDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDeleteDevices);
    }

    /**
     * 批量删除设备
     * 批量删除设备
     *
     * @param BatchDeleteDevicesRequest 请求对象
     * @return SyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse>
     */
    public SyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> batchDeleteDevicesInvoker(BatchDeleteDevicesRequest request) {
        return new SyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse>(request, RomaMeta.batchDeleteDevices, hcClient);
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
     * 批量删除Topic
     * 批量删除Topic。
     *
     * @param BatchDeleteMqsInstanceTopicRequest 请求对象
     * @return SyncInvoker<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse>
     */
    public SyncInvoker<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse> batchDeleteMqsInstanceTopicInvoker(BatchDeleteMqsInstanceTopicRequest request) {
        return new SyncInvoker<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse>(request, RomaMeta.batchDeleteMqsInstanceTopic, hcClient);
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
     * 批量删除规则
     * 批量删除规则
     *
     * @param BatchDeleteRulesRequest 请求对象
     * @return SyncInvoker<BatchDeleteRulesRequest, BatchDeleteRulesResponse>
     */
    public SyncInvoker<BatchDeleteRulesRequest, BatchDeleteRulesResponse> batchDeleteRulesInvoker(BatchDeleteRulesRequest request) {
        return new SyncInvoker<BatchDeleteRulesRequest, BatchDeleteRulesResponse>(request, RomaMeta.batchDeleteRules, hcClient);
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
     * 设备批量下线
     * 设备批量下线
     *
     * @param BatchFreezeDevicesRequest 请求对象
     * @return SyncInvoker<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse>
     */
    public SyncInvoker<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse> batchFreezeDevicesInvoker(BatchFreezeDevicesRequest request) {
        return new SyncInvoker<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse>(request, RomaMeta.batchFreezeDevices, hcClient);
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
     * 校验自定义后端API定义
     * 校验自定义后端API定义。校验自定义后端API的路径或名称是否已存在
     *
     * @param CheckLivedataApisV2Request 请求对象
     * @return SyncInvoker<CheckLivedataApisV2Request, CheckLivedataApisV2Response>
     */
    public SyncInvoker<CheckLivedataApisV2Request, CheckLivedataApisV2Response> checkLivedataApisV2Invoker(CheckLivedataApisV2Request request) {
        return new SyncInvoker<CheckLivedataApisV2Request, CheckLivedataApisV2Response>(request, RomaMeta.checkLivedataApisV2, hcClient);
    }

    /**
     * 设备数量统计
     * 设备数量统计
     *
     * @param CountDevicesRequest 请求对象
     * @return CountDevicesResponse
     */
    public CountDevicesResponse countDevices(CountDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.countDevices);
    }

    /**
     * 设备数量统计
     * 设备数量统计
     *
     * @param CountDevicesRequest 请求对象
     * @return SyncInvoker<CountDevicesRequest, CountDevicesResponse>
     */
    public SyncInvoker<CountDevicesRequest, CountDevicesResponse> countDevicesInvoker(CountDevicesRequest request) {
        return new SyncInvoker<CountDevicesRequest, CountDevicesResponse>(request, RomaMeta.countDevices, hcClient);
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
     * 自动生成APP Code
     * 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     *
     * @param CreateAppCodeAutoV2Request 请求对象
     * @return SyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response>
     */
    public SyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> createAppCodeAutoV2Invoker(CreateAppCodeAutoV2Request request) {
        return new SyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response>(request, RomaMeta.createAppCodeAutoV2, hcClient);
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
     * 创建APP Code
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param CreateAppCodeV2Request 请求对象
     * @return SyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response>
     */
    public SyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response> createAppCodeV2Invoker(CreateAppCodeV2Request request) {
        return new SyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response>(request, RomaMeta.createAppCodeV2, hcClient);
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
     * 创建应用配置
     * 创建应用配置
     *
     * @param CreateAppConfigV2Request 请求对象
     * @return SyncInvoker<CreateAppConfigV2Request, CreateAppConfigV2Response>
     */
    public SyncInvoker<CreateAppConfigV2Request, CreateAppConfigV2Response> createAppConfigV2Invoker(CreateAppConfigV2Request request) {
        return new SyncInvoker<CreateAppConfigV2Request, CreateAppConfigV2Response>(request, RomaMeta.createAppConfigV2, hcClient);
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
     * 创建客户端配额
     * 创建客户端配额
     *
     * @param CreateAppQuotaRequest 请求对象
     * @return SyncInvoker<CreateAppQuotaRequest, CreateAppQuotaResponse>
     */
    public SyncInvoker<CreateAppQuotaRequest, CreateAppQuotaResponse> createAppQuotaInvoker(CreateAppQuotaRequest request) {
        return new SyncInvoker<CreateAppQuotaRequest, CreateAppQuotaResponse>(request, RomaMeta.createAppQuota, hcClient);
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
     * 创建命令
     * 创建命令
     *
     * @param CreateCommandRequest 请求对象
     * @return SyncInvoker<CreateCommandRequest, CreateCommandResponse>
     */
    public SyncInvoker<CreateCommandRequest, CreateCommandResponse> createCommandInvoker(CreateCommandRequest request) {
        return new SyncInvoker<CreateCommandRequest, CreateCommandResponse>(request, RomaMeta.createCommand, hcClient);
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
     * 创建自定义认证
     * 创建自定义认证
     *
     * @param CreateCustomAuthorizerV2Request 请求对象
     * @return SyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response>
     */
    public SyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> createCustomAuthorizerV2Invoker(CreateCustomAuthorizerV2Request request) {
        return new SyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response>(request, RomaMeta.createCustomAuthorizerV2, hcClient);
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
     * 添加目标数据源
     * 添加目标数据源
     *
     * @param CreateDestinationRequest 请求对象
     * @return SyncInvoker<CreateDestinationRequest, CreateDestinationResponse>
     */
    public SyncInvoker<CreateDestinationRequest, CreateDestinationResponse> createDestinationInvoker(CreateDestinationRequest request) {
        return new SyncInvoker<CreateDestinationRequest, CreateDestinationResponse>(request, RomaMeta.createDestination, hcClient);
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
     * 创建设备
     * 创建设备
     *
     * @param CreateDeviceRequest 请求对象
     * @return SyncInvoker<CreateDeviceRequest, CreateDeviceResponse>
     */
    public SyncInvoker<CreateDeviceRequest, CreateDeviceResponse> createDeviceInvoker(CreateDeviceRequest request) {
        return new SyncInvoker<CreateDeviceRequest, CreateDeviceResponse>(request, RomaMeta.createDevice, hcClient);
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
     * 创建设备分组
     * 创建设备分组
     *
     * @param CreateDeviceGroupRequest 请求对象
     * @return SyncInvoker<CreateDeviceGroupRequest, CreateDeviceGroupResponse>
     */
    public SyncInvoker<CreateDeviceGroupRequest, CreateDeviceGroupResponse> createDeviceGroupInvoker(CreateDeviceGroupRequest request) {
        return new SyncInvoker<CreateDeviceGroupRequest, CreateDeviceGroupResponse>(request, RomaMeta.createDeviceGroup, hcClient);
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
     * 创建环境
     * 在实际的生产中，API提供者可能有多个环境，如开发环境、测试环境、生产环境等，用户可以自由将API发布到某个环境，供调用者调用。  对于不同的环境，API的版本、请求地址甚至于包括请求消息等均有可能不同。如：某个API，v1.0的版本为稳定版本，发布到了生产环境供生产使用，同时，该API正处于迭代中，v1.1的版本是开发人员交付测试人员进行测试的版本，发布在测试环境上，而v1.2的版本目前开发团队正处于开发过程中，可以发布到开发环境进行自测等。  为此，ROMA Connect APIC提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接入ROMA Connect APIC。
     *
     * @param CreateEnvironmentV2Request 请求对象
     * @return SyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response>
     */
    public SyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response> createEnvironmentV2Invoker(CreateEnvironmentV2Request request) {
        return new SyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response>(request, RomaMeta.createEnvironmentV2, hcClient);
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
     * 新建变量
     * 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。  用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，ROMA Connect APIC会将这些变量替换成真实的变量值，以达到不同环境的区分效果。  环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。 &gt; 1.环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量   2.环境变量区分大小写，即变量ABC与变量abc是两个不同的变量   3.设置了环境变量后，使用到该变量的API的调试功能将不可使用。   4.定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     *
     * @param CreateEnvironmentVariableV2Request 请求对象
     * @return SyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response>
     */
    public SyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> createEnvironmentVariableV2Invoker(CreateEnvironmentVariableV2Request request) {
        return new SyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response>(request, RomaMeta.createEnvironmentVariableV2, hcClient);
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
     * 实例配置特性
     * 为实例配置需要的特性。  支持配置的特性列表及特性配置请参考“附录 &gt; 实例支持的APIC特性”
     *
     * @param CreateFeatureV2Request 请求对象
     * @return SyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response>
     */
    public SyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response> createFeatureV2Invoker(CreateFeatureV2Request request) {
        return new SyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response>(request, RomaMeta.createFeatureV2, hcClient);
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
     * 创建后端API脚本
     * 在某个实例中创建后端API脚本。
     *
     * @param CreateLiveDataApiScriptV2Request 请求对象
     * @return SyncInvoker<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response>
     */
    public SyncInvoker<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response> createLiveDataApiScriptV2Invoker(CreateLiveDataApiScriptV2Request request) {
        return new SyncInvoker<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response>(request, RomaMeta.createLiveDataApiScriptV2, hcClient);
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
     * 创建后端API
     * 在某个实例中创建后端API。
     *
     * @param CreateLiveDataApiV2Request 请求对象
     * @return SyncInvoker<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response>
     */
    public SyncInvoker<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response> createLiveDataApiV2Invoker(CreateLiveDataApiV2Request request) {
        return new SyncInvoker<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response>(request, RomaMeta.createLiveDataApiV2, hcClient);
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
     * 创建Topic
     * 创建Topic。
     *
     * @param CreateMqsInstanceTopicRequest 请求对象
     * @return SyncInvoker<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse>
     */
    public SyncInvoker<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse> createMqsInstanceTopicInvoker(CreateMqsInstanceTopicRequest request) {
        return new SyncInvoker<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse>(request, RomaMeta.createMqsInstanceTopic, hcClient);
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
     * 创建产品
     * 创建产品
     *
     * @param CreateProductRequest 请求对象
     * @return SyncInvoker<CreateProductRequest, CreateProductResponse>
     */
    public SyncInvoker<CreateProductRequest, CreateProductResponse> createProductInvoker(CreateProductRequest request) {
        return new SyncInvoker<CreateProductRequest, CreateProductResponse>(request, RomaMeta.createProduct, hcClient);
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
     * 创建产品模板
     * 创建产品模板
     *
     * @param CreateProductTemplateRequest 请求对象
     * @return SyncInvoker<CreateProductTemplateRequest, CreateProductTemplateResponse>
     */
    public SyncInvoker<CreateProductTemplateRequest, CreateProductTemplateResponse> createProductTemplateInvoker(CreateProductTemplateRequest request) {
        return new SyncInvoker<CreateProductTemplateRequest, CreateProductTemplateResponse>(request, RomaMeta.createProductTemplate, hcClient);
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
     * 添加产品主题
     * 添加产品主题
     *
     * @param CreateProductTopicRequest 请求对象
     * @return SyncInvoker<CreateProductTopicRequest, CreateProductTopicResponse>
     */
    public SyncInvoker<CreateProductTopicRequest, CreateProductTopicResponse> createProductTopicInvoker(CreateProductTopicRequest request) {
        return new SyncInvoker<CreateProductTopicRequest, CreateProductTopicResponse>(request, RomaMeta.createProductTopic, hcClient);
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
     * 创建属性
     * 创建属性
     *
     * @param CreatePropertyRequest 请求对象
     * @return SyncInvoker<CreatePropertyRequest, CreatePropertyResponse>
     */
    public SyncInvoker<CreatePropertyRequest, CreatePropertyResponse> createPropertyInvoker(CreatePropertyRequest request) {
        return new SyncInvoker<CreatePropertyRequest, CreatePropertyResponse>(request, RomaMeta.createProperty, hcClient);
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
     * 创建请求属性
     * 创建请求属性
     *
     * @param CreateRequestPropertyRequest 请求对象
     * @return SyncInvoker<CreateRequestPropertyRequest, CreateRequestPropertyResponse>
     */
    public SyncInvoker<CreateRequestPropertyRequest, CreateRequestPropertyResponse> createRequestPropertyInvoker(CreateRequestPropertyRequest request) {
        return new SyncInvoker<CreateRequestPropertyRequest, CreateRequestPropertyResponse>(request, RomaMeta.createRequestProperty, hcClient);
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
     * 创建流控策略
     * 当API上线后，系统会默认给每个API提供一个流控策略，API提供者可以根据自身API的服务能力及负载情况变更这个流控策略。 流控策略即限制API在一定长度的时间内，能够允许被访问的最大次数。
     *
     * @param CreateRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2Invoker(CreateRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response>(request, RomaMeta.createRequestThrottlingPolicyV2, hcClient);
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
     * 创建响应属性
     * 创建响应属性
     *
     * @param CreateResponsePropertyRequest 请求对象
     * @return SyncInvoker<CreateResponsePropertyRequest, CreateResponsePropertyResponse>
     */
    public SyncInvoker<CreateResponsePropertyRequest, CreateResponsePropertyResponse> createResponsePropertyInvoker(CreateResponsePropertyRequest request) {
        return new SyncInvoker<CreateResponsePropertyRequest, CreateResponsePropertyResponse>(request, RomaMeta.createResponseProperty, hcClient);
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
     * 创建规则
     * 创建规则
     *
     * @param CreateRuleRequest 请求对象
     * @return SyncInvoker<CreateRuleRequest, CreateRuleResponse>
     */
    public SyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleInvoker(CreateRuleRequest request) {
        return new SyncInvoker<CreateRuleRequest, CreateRuleResponse>(request, RomaMeta.createRule, hcClient);
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
     * 创建服务
     * 创建服务
     *
     * @param CreateServiceRequest 请求对象
     * @return SyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public SyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceInvoker(CreateServiceRequest request) {
        return new SyncInvoker<CreateServiceRequest, CreateServiceResponse>(request, RomaMeta.createService, hcClient);
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
     * 创建签名密钥
     * 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。  其中，签名密钥就是API安全保护机制的一种。  租户创建一个签名密钥，并将签名密钥与API进行绑定，则ROMA Connect APIC在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是ROMA Connect APIC发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。 
     *
     * @param CreateSignatureKeyV2Request 请求对象
     * @return SyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response>
     */
    public SyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> createSignatureKeyV2Invoker(CreateSignatureKeyV2Request request) {
        return new SyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response>(request, RomaMeta.createSignatureKeyV2, hcClient);
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
     * 添加源数据源
     * 添加源数据源
     *
     * @param CreateSourceRequest 请求对象
     * @return SyncInvoker<CreateSourceRequest, CreateSourceResponse>
     */
    public SyncInvoker<CreateSourceRequest, CreateSourceResponse> createSourceInvoker(CreateSourceRequest request) {
        return new SyncInvoker<CreateSourceRequest, CreateSourceResponse>(request, RomaMeta.createSource, hcClient);
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
     * 创建特殊设置
     * 流控策略可以限制一段时间内可以访问API的最大次数，也可以限制一段时间内单个租户和单个APP可以访问API的最大次数。  如果想要对某个特定的APP进行特殊设置，例如设置所有APP每分钟的访问次数为500次，但想设置APP1每分钟的访问次数为800次，可以通过在流控策略中设置特殊APP来实现该功能。  为流控策略添加一个特殊设置的对象，可以是APP，也可以是租户。
     *
     * @param CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return SyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response>
     */
    public SyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2Invoker(CreateSpecialThrottlingConfigurationV2Request request) {
        return new SyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response>(request, RomaMeta.createSpecialThrottlingConfigurationV2, hcClient);
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
     * 测试后端API
     * 测试后端API是否可用。
     *
     * @param DebugLiveDataApiV2Request 请求对象
     * @return SyncInvoker<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response>
     */
    public SyncInvoker<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response> debugLiveDataApiV2Invoker(DebugLiveDataApiV2Request request) {
        return new SyncInvoker<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response>(request, RomaMeta.debugLiveDataApiV2, hcClient);
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
     * 规则调试
     * 规则调试
     *
     * @param DebugRuleRequest 请求对象
     * @return SyncInvoker<DebugRuleRequest, DebugRuleResponse>
     */
    public SyncInvoker<DebugRuleRequest, DebugRuleResponse> debugRuleInvoker(DebugRuleRequest request) {
        return new SyncInvoker<DebugRuleRequest, DebugRuleResponse>(request, RomaMeta.debugRule, hcClient);
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
     * 删除APP的访问控制
     * 删除客户端配置的访问控制信息。
     *
     * @param DeleteAppAclRequest 请求对象
     * @return SyncInvoker<DeleteAppAclRequest, DeleteAppAclResponse>
     */
    public SyncInvoker<DeleteAppAclRequest, DeleteAppAclResponse> deleteAppAclInvoker(DeleteAppAclRequest request) {
        return new SyncInvoker<DeleteAppAclRequest, DeleteAppAclResponse>(request, RomaMeta.deleteAppAcl, hcClient);
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
     * 删除APP Code
     * 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     *
     * @param DeleteAppCodeV2Request 请求对象
     * @return SyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response>
     */
    public SyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response> deleteAppCodeV2Invoker(DeleteAppCodeV2Request request) {
        return new SyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response>(request, RomaMeta.deleteAppCodeV2, hcClient);
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
     * 删除应用配置
     * 删除应用配置
     *
     * @param DeleteAppConfigV2Request 请求对象
     * @return SyncInvoker<DeleteAppConfigV2Request, DeleteAppConfigV2Response>
     */
    public SyncInvoker<DeleteAppConfigV2Request, DeleteAppConfigV2Response> deleteAppConfigV2Invoker(DeleteAppConfigV2Request request) {
        return new SyncInvoker<DeleteAppConfigV2Request, DeleteAppConfigV2Response>(request, RomaMeta.deleteAppConfigV2, hcClient);
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
     * 删除客户端配额
     * 删除客户端配额。删除客户端配额时，同时删除客户端配额和客户端应用的关联关系
     *
     * @param DeleteAppQuotaRequest 请求对象
     * @return SyncInvoker<DeleteAppQuotaRequest, DeleteAppQuotaResponse>
     */
    public SyncInvoker<DeleteAppQuotaRequest, DeleteAppQuotaResponse> deleteAppQuotaInvoker(DeleteAppQuotaRequest request) {
        return new SyncInvoker<DeleteAppQuotaRequest, DeleteAppQuotaResponse>(request, RomaMeta.deleteAppQuota, hcClient);
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
     * 删除命令
     * 删除命令
     *
     * @param DeleteCommandRequest 请求对象
     * @return SyncInvoker<DeleteCommandRequest, DeleteCommandResponse>
     */
    public SyncInvoker<DeleteCommandRequest, DeleteCommandResponse> deleteCommandInvoker(DeleteCommandRequest request) {
        return new SyncInvoker<DeleteCommandRequest, DeleteCommandResponse>(request, RomaMeta.deleteCommand, hcClient);
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
     * 删除自定义认证
     * 删除自定义认证
     *
     * @param DeleteCustomAuthorizerV2Request 请求对象
     * @return SyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response>
     */
    public SyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2Invoker(DeleteCustomAuthorizerV2Request request) {
        return new SyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response>(request, RomaMeta.deleteCustomAuthorizerV2, hcClient);
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
     * 删除目标数据源
     * 删除目标数据源
     *
     * @param DeleteDestinationRequest 请求对象
     * @return SyncInvoker<DeleteDestinationRequest, DeleteDestinationResponse>
     */
    public SyncInvoker<DeleteDestinationRequest, DeleteDestinationResponse> deleteDestinationInvoker(DeleteDestinationRequest request) {
        return new SyncInvoker<DeleteDestinationRequest, DeleteDestinationResponse>(request, RomaMeta.deleteDestination, hcClient);
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
     * 删除设备
     * 删除指定设备ID的设备
     *
     * @param DeleteDeviceRequest 请求对象
     * @return SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>
     */
    public SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceInvoker(DeleteDeviceRequest request) {
        return new SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>(request, RomaMeta.deleteDevice, hcClient);
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
     * 删除设备分组内的设备
     * 删除设备分组内的设备
     *
     * @param DeleteDeviceFromGroupRequest 请求对象
     * @return SyncInvoker<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse>
     */
    public SyncInvoker<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse> deleteDeviceFromGroupInvoker(DeleteDeviceFromGroupRequest request) {
        return new SyncInvoker<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse>(request, RomaMeta.deleteDeviceFromGroup, hcClient);
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
     * 删除设备分组
     * 删除分组
     *
     * @param DeleteDeviceGroupRequest 请求对象
     * @return SyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse>
     */
    public SyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> deleteDeviceGroupInvoker(DeleteDeviceGroupRequest request) {
        return new SyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse>(request, RomaMeta.deleteDeviceGroup, hcClient);
    }

    /**
     * 删除环境
     * 删除指定的环境。 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。环境上存在已发布的API时，该环境不能被删除。
     *
     * @param DeleteEnvironmentV2Request 请求对象
     * @return DeleteEnvironmentV2Response
     */
    public DeleteEnvironmentV2Response deleteEnvironmentV2(DeleteEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteEnvironmentV2);
    }

    /**
     * 删除环境
     * 删除指定的环境。 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。环境上存在已发布的API时，该环境不能被删除。
     *
     * @param DeleteEnvironmentV2Request 请求对象
     * @return SyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response>
     */
    public SyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> deleteEnvironmentV2Invoker(DeleteEnvironmentV2Request request) {
        return new SyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response>(request, RomaMeta.deleteEnvironmentV2, hcClient);
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
     * 删除变量
     * 删除指定的环境变量。
     *
     * @param DeleteEnvironmentVariableV2Request 请求对象
     * @return SyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response>
     */
    public SyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2Invoker(DeleteEnvironmentVariableV2Request request) {
        return new SyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response>(request, RomaMeta.deleteEnvironmentVariableV2, hcClient);
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
     * 删除后端API
     * 在某个实例中删除后端API。
     *
     * @param DeleteLiveDataApiV2Request 请求对象
     * @return SyncInvoker<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response>
     */
    public SyncInvoker<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response> deleteLiveDataApiV2Invoker(DeleteLiveDataApiV2Request request) {
        return new SyncInvoker<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response>(request, RomaMeta.deleteLiveDataApiV2, hcClient);
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
     * 批量删除Topic
     * 批量删除Topic。
     *
     * @param DeleteMqsInstanceTopicRequest 请求对象
     * @return SyncInvoker<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse>
     */
    public SyncInvoker<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse> deleteMqsInstanceTopicInvoker(DeleteMqsInstanceTopicRequest request) {
        return new SyncInvoker<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse>(request, RomaMeta.deleteMqsInstanceTopic, hcClient);
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
     * 删除产品
     * 删除产品
     *
     * @param DeleteProductRequest 请求对象
     * @return SyncInvoker<DeleteProductRequest, DeleteProductResponse>
     */
    public SyncInvoker<DeleteProductRequest, DeleteProductResponse> deleteProductInvoker(DeleteProductRequest request) {
        return new SyncInvoker<DeleteProductRequest, DeleteProductResponse>(request, RomaMeta.deleteProduct, hcClient);
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
     * 删除产品模板
     * 删除产品模板
     *
     * @param DeleteProductTemplateRequest 请求对象
     * @return SyncInvoker<DeleteProductTemplateRequest, DeleteProductTemplateResponse>
     */
    public SyncInvoker<DeleteProductTemplateRequest, DeleteProductTemplateResponse> deleteProductTemplateInvoker(DeleteProductTemplateRequest request) {
        return new SyncInvoker<DeleteProductTemplateRequest, DeleteProductTemplateResponse>(request, RomaMeta.deleteProductTemplate, hcClient);
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
     * 删除产品主题
     * 删除产品主题
     *
     * @param DeleteProductTopicRequest 请求对象
     * @return SyncInvoker<DeleteProductTopicRequest, DeleteProductTopicResponse>
     */
    public SyncInvoker<DeleteProductTopicRequest, DeleteProductTopicResponse> deleteProductTopicInvoker(DeleteProductTopicRequest request) {
        return new SyncInvoker<DeleteProductTopicRequest, DeleteProductTopicResponse>(request, RomaMeta.deleteProductTopic, hcClient);
    }

    /**
     * 删除服务属性
     * 删除服务属性
     *
     * @param DeletePropertyRequest 请求对象
     * @return DeletePropertyResponse
     */
    public DeletePropertyResponse deleteProperty(DeletePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteProperty);
    }

    /**
     * 删除服务属性
     * 删除服务属性
     *
     * @param DeletePropertyRequest 请求对象
     * @return SyncInvoker<DeletePropertyRequest, DeletePropertyResponse>
     */
    public SyncInvoker<DeletePropertyRequest, DeletePropertyResponse> deletePropertyInvoker(DeletePropertyRequest request) {
        return new SyncInvoker<DeletePropertyRequest, DeletePropertyResponse>(request, RomaMeta.deleteProperty, hcClient);
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
     * 删除请求属性
     * 删除请求属性
     *
     * @param DeleteRequestPropertyRequest 请求对象
     * @return SyncInvoker<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse>
     */
    public SyncInvoker<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse> deleteRequestPropertyInvoker(DeleteRequestPropertyRequest request) {
        return new SyncInvoker<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse>(request, RomaMeta.deleteRequestProperty, hcClient);
    }

    /**
     * 删除流控策略
     * 删除指定的流控策略。当该流控策略绑定了API时，需要先解除流控策略与API的所有绑定关系后再删除。
     *
     * @param DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return DeleteRequestThrottlingPolicyV2Response
     */
    public DeleteRequestThrottlingPolicyV2Response deleteRequestThrottlingPolicyV2(DeleteRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteRequestThrottlingPolicyV2);
    }

    /**
     * 删除流控策略
     * 删除指定的流控策略。当该流控策略绑定了API时，需要先解除流控策略与API的所有绑定关系后再删除。
     *
     * @param DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2Invoker(DeleteRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response>(request, RomaMeta.deleteRequestThrottlingPolicyV2, hcClient);
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
     * 删除响应属性
     * 删除响应属性
     *
     * @param DeleteResponsePropertyRequest 请求对象
     * @return SyncInvoker<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse>
     */
    public SyncInvoker<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse> deleteResponsePropertyInvoker(DeleteResponsePropertyRequest request) {
        return new SyncInvoker<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse>(request, RomaMeta.deleteResponseProperty, hcClient);
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
     * 删除规则
     * 删除规则
     *
     * @param DeleteRuleRequest 请求对象
     * @return SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public SyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleInvoker(DeleteRuleRequest request) {
        return new SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>(request, RomaMeta.deleteRule, hcClient);
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
     * 删除服务
     * 删除服务
     *
     * @param DeleteServiceRequest 请求对象
     * @return SyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public SyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceInvoker(DeleteServiceRequest request) {
        return new SyncInvoker<DeleteServiceRequest, DeleteServiceResponse>(request, RomaMeta.deleteService, hcClient);
    }

    /**
     * 删除签名密钥
     * 删除指定的签名密钥。签名密钥绑定了API时无法删除，需要先解除与API的绑定关系后删除。
     *
     * @param DeleteSignatureKeyV2Request 请求对象
     * @return DeleteSignatureKeyV2Response
     */
    public DeleteSignatureKeyV2Response deleteSignatureKeyV2(DeleteSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteSignatureKeyV2);
    }

    /**
     * 删除签名密钥
     * 删除指定的签名密钥。签名密钥绑定了API时无法删除，需要先解除与API的绑定关系后删除。
     *
     * @param DeleteSignatureKeyV2Request 请求对象
     * @return SyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response>
     */
    public SyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> deleteSignatureKeyV2Invoker(DeleteSignatureKeyV2Request request) {
        return new SyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response>(request, RomaMeta.deleteSignatureKeyV2, hcClient);
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
     * 删除源数据源
     * 删除源数据源
     *
     * @param DeleteSourceRequest 请求对象
     * @return SyncInvoker<DeleteSourceRequest, DeleteSourceResponse>
     */
    public SyncInvoker<DeleteSourceRequest, DeleteSourceResponse> deleteSourceInvoker(DeleteSourceRequest request) {
        return new SyncInvoker<DeleteSourceRequest, DeleteSourceResponse>(request, RomaMeta.deleteSource, hcClient);
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
     * 删除特殊设置
     * 删除某个流控策略的某个特殊配置。
     *
     * @param DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return SyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response>
     */
    public SyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2Invoker(DeleteSpecialThrottlingConfigurationV2Request request) {
        return new SyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response>(request, RomaMeta.deleteSpecialThrottlingConfigurationV2, hcClient);
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
     * 解除客户端配额和客户端应用的绑定
     * 解除客户端配额和客户端应用的绑定
     *
     * @param DisassociateAppQuotaWithAppRequest 请求对象
     * @return SyncInvoker<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse>
     */
    public SyncInvoker<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse> disassociateAppQuotaWithAppInvoker(DisassociateAppQuotaWithAppRequest request) {
        return new SyncInvoker<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse>(request, RomaMeta.disassociateAppQuotaWithApp, hcClient);
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
     * 删除域名证书
     * 如果域名证书不再需要或者已过期，则可以删除证书内容。
     *
     * @param DisassociateCertificateV2Request 请求对象
     * @return SyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response>
     */
    public SyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response> disassociateCertificateV2Invoker(DisassociateCertificateV2Request request) {
        return new SyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response>(request, RomaMeta.disassociateCertificateV2, hcClient);
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
     * 解绑域名
     * 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     *
     * @param DisassociateDomainV2Request 请求对象
     * @return SyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response>
     */
    public SyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response> disassociateDomainV2Invoker(DisassociateDomainV2Request request) {
        return new SyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response>(request, RomaMeta.disassociateDomainV2, hcClient);
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
     * 解除绑定
     * 解除API与签名密钥的绑定关系。
     *
     * @param DisassociateSignatureKeyV2Request 请求对象
     * @return SyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response>
     */
    public SyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2Invoker(DisassociateSignatureKeyV2Request request) {
        return new SyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response>(request, RomaMeta.disassociateSignatureKeyV2, hcClient);
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
     * 导出产品
     * 导出产品
     *
     * @param DownloadProductsRequest 请求对象
     * @return SyncInvoker<DownloadProductsRequest, DownloadProductsResponse>
     */
    public SyncInvoker<DownloadProductsRequest, DownloadProductsResponse> downloadProductsInvoker(DownloadProductsRequest request) {
        return new SyncInvoker<DownloadProductsRequest, DownloadProductsResponse>(request, RomaMeta.downloadProducts, hcClient);
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
     * 导出Topic
     * 导出Topic。
     *
     * @param ExportMqsInstanceTopicRequest 请求对象
     * @return SyncInvoker<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse>
     */
    public SyncInvoker<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse> exportMqsInstanceTopicInvoker(ExportMqsInstanceTopicRequest request) {
        return new SyncInvoker<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse>(request, RomaMeta.exportMqsInstanceTopic, hcClient);
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
     * 导入Topic
     * 导入Topic。
     *
     * @param ImportMqsInstanceTopicRequest 请求对象
     * @return SyncInvoker<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse>
     */
    public SyncInvoker<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse> importMqsInstanceTopicInvoker(ImportMqsInstanceTopicRequest request) {
        return new SyncInvoker<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse>(request, RomaMeta.importMqsInstanceTopic, hcClient);
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
     * 查看签名密钥绑定的API列表
     * 查询某个签名密钥上已经绑定的API列表。
     *
     * @param ListApisBindedToSignatureKeyV2Request 请求对象
     * @return SyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response>
     */
    public SyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2Invoker(ListApisBindedToSignatureKeyV2Request request) {
        return new SyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response>(request, RomaMeta.listApisBindedToSignatureKeyV2, hcClient);
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
     * 查看签名密钥未绑定的API列表
     * 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return SyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response>
     */
    public SyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2Invoker(ListApisNotBoundWithSignatureKeyV2Request request) {
        return new SyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response>(request, RomaMeta.listApisNotBoundWithSignatureKeyV2, hcClient);
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
     * 查询APP Code列表
     * 查询App Code列表。
     *
     * @param ListAppCodesV2Request 请求对象
     * @return SyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response>
     */
    public SyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response> listAppCodesV2Invoker(ListAppCodesV2Request request) {
        return new SyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response>(request, RomaMeta.listAppCodesV2, hcClient);
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
     * 查询应用配置列表
     * 查询应用配置列表
     *
     * @param ListAppConfigsV2Request 请求对象
     * @return SyncInvoker<ListAppConfigsV2Request, ListAppConfigsV2Response>
     */
    public SyncInvoker<ListAppConfigsV2Request, ListAppConfigsV2Response> listAppConfigsV2Invoker(ListAppConfigsV2Request request) {
        return new SyncInvoker<ListAppConfigsV2Request, ListAppConfigsV2Response>(request, RomaMeta.listAppConfigsV2, hcClient);
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
     * 查询客户端配额可绑定的客户端应用列表
     * 查询客户端配额可绑定的客户端应用列表。支持按客户端应用名称模糊搜索
     *
     * @param ListAppQuotaBindableAppsRequest 请求对象
     * @return SyncInvoker<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse>
     */
    public SyncInvoker<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse> listAppQuotaBindableAppsInvoker(ListAppQuotaBindableAppsRequest request) {
        return new SyncInvoker<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse>(request, RomaMeta.listAppQuotaBindableApps, hcClient);
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
     * 查询客户端配额已绑定的客户端应用列表
     * 查询客户端配额已绑定的客户端应用列表。支持按客户端应用名称模糊匹配
     *
     * @param ListAppQuotaBoundAppsRequest 请求对象
     * @return SyncInvoker<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse>
     */
    public SyncInvoker<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse> listAppQuotaBoundAppsInvoker(ListAppQuotaBoundAppsRequest request) {
        return new SyncInvoker<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse>(request, RomaMeta.listAppQuotaBoundApps, hcClient);
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
     * 获取客户端配额列表
     * 获取客户端配额列表。支持根据名称模糊查询
     *
     * @param ListAppQuotasRequest 请求对象
     * @return SyncInvoker<ListAppQuotasRequest, ListAppQuotasResponse>
     */
    public SyncInvoker<ListAppQuotasRequest, ListAppQuotasResponse> listAppQuotasInvoker(ListAppQuotasRequest request) {
        return new SyncInvoker<ListAppQuotasRequest, ListAppQuotasResponse>(request, RomaMeta.listAppQuotas, hcClient);
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
     * 查询APP列表
     * 查询APP列表。
     *
     * @param ListAppsV2Request 请求对象
     * @return SyncInvoker<ListAppsV2Request, ListAppsV2Response>
     */
    public SyncInvoker<ListAppsV2Request, ListAppsV2Response> listAppsV2Invoker(ListAppsV2Request request) {
        return new SyncInvoker<ListAppsV2Request, ListAppsV2Response>(request, RomaMeta.listAppsV2, hcClient);
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
     * 查询命令
     * 查询命令
     *
     * @param ListCommandsRequest 请求对象
     * @return SyncInvoker<ListCommandsRequest, ListCommandsResponse>
     */
    public SyncInvoker<ListCommandsRequest, ListCommandsResponse> listCommandsInvoker(ListCommandsRequest request) {
        return new SyncInvoker<ListCommandsRequest, ListCommandsResponse>(request, RomaMeta.listCommands, hcClient);
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
     * 查询自定义认证列表
     * 查询自定义认证列表
     *
     * @param ListCustomAuthorizersV2Request 请求对象
     * @return SyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response>
     */
    public SyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> listCustomAuthorizersV2Invoker(ListCustomAuthorizersV2Request request) {
        return new SyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response>(request, RomaMeta.listCustomAuthorizersV2, hcClient);
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
     * 查询目标数据源列表
     * 查询目标数据源列表
     *
     * @param ListDestinationsRequest 请求对象
     * @return SyncInvoker<ListDestinationsRequest, ListDestinationsResponse>
     */
    public SyncInvoker<ListDestinationsRequest, ListDestinationsResponse> listDestinationsInvoker(ListDestinationsRequest request) {
        return new SyncInvoker<ListDestinationsRequest, ListDestinationsResponse>(request, RomaMeta.listDestinations, hcClient);
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
     * 查询设备
     * 查询设备
     *
     * @param ListDevicesRequest 请求对象
     * @return SyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public SyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesInvoker(ListDevicesRequest request) {
        return new SyncInvoker<ListDevicesRequest, ListDevicesResponse>(request, RomaMeta.listDevices, hcClient);
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
     * 查询产品内设备数量
     * 查询产品内设备数量
     *
     * @param ListDevicesInProductRequest 请求对象
     * @return SyncInvoker<ListDevicesInProductRequest, ListDevicesInProductResponse>
     */
    public SyncInvoker<ListDevicesInProductRequest, ListDevicesInProductResponse> listDevicesInProductInvoker(ListDevicesInProductRequest request) {
        return new SyncInvoker<ListDevicesInProductRequest, ListDevicesInProductResponse>(request, RomaMeta.listDevicesInProduct, hcClient);
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
     * 查询变量列表
     * 查询分组下的所有环境变量的列表。
     *
     * @param ListEnvironmentVariablesV2Request 请求对象
     * @return SyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response>
     */
    public SyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2Invoker(ListEnvironmentVariablesV2Request request) {
        return new SyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response>(request, RomaMeta.listEnvironmentVariablesV2, hcClient);
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
     * 查询环境列表
     * 查询符合条件的环境列表。
     *
     * @param ListEnvironmentsV2Request 请求对象
     * @return SyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response>
     */
    public SyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response> listEnvironmentsV2Invoker(ListEnvironmentsV2Request request) {
        return new SyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response>(request, RomaMeta.listEnvironmentsV2, hcClient);
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
     * 查看实例特性列表
     * 查看实例特性列表。注意：实例不支持以下特性的需要联系技术支持升级实例版本。  支持配置的特性列表及特性配置请参考“附录 &gt; 实例支持的APIC特性”
     *
     * @param ListFeaturesV2Request 请求对象
     * @return SyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response>
     */
    public SyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response> listFeaturesV2Invoker(ListFeaturesV2Request request) {
        return new SyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response>(request, RomaMeta.listFeaturesV2, hcClient);
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
     * API指标统计值查询-最近一段时间
     * 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。 &gt; 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     *
     * @param ListLatelyApiStatisticsV2Request 请求对象
     * @return SyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response>
     */
    public SyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2Invoker(ListLatelyApiStatisticsV2Request request) {
        return new SyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response>(request, RomaMeta.listLatelyApiStatisticsV2, hcClient);
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
     * 查询后端API部署历史
     * 在某个实例中查询后端API的部署记录。
     *
     * @param ListLiveDataApiDeploymentHistoryV2Request 请求对象
     * @return SyncInvoker<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response>
     */
    public SyncInvoker<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response> listLiveDataApiDeploymentHistoryV2Invoker(ListLiveDataApiDeploymentHistoryV2Request request) {
        return new SyncInvoker<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response>(request, RomaMeta.listLiveDataApiDeploymentHistoryV2, hcClient);
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
     * 查询后端API测试结果
     * 在某个实例中查询后端API的测试结果。
     *
     * @param ListLiveDataApiTestHistoryV2Request 请求对象
     * @return SyncInvoker<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response>
     */
    public SyncInvoker<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response> listLiveDataApiTestHistoryV2Invoker(ListLiveDataApiTestHistoryV2Request request) {
        return new SyncInvoker<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response>(request, RomaMeta.listLiveDataApiTestHistoryV2, hcClient);
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
     * 查询后端API列表
     * 获取某个实例下的所有后端API。
     *
     * @param ListLiveDataApiV2Request 请求对象
     * @return SyncInvoker<ListLiveDataApiV2Request, ListLiveDataApiV2Response>
     */
    public SyncInvoker<ListLiveDataApiV2Request, ListLiveDataApiV2Response> listLiveDataApiV2Invoker(ListLiveDataApiV2Request request) {
        return new SyncInvoker<ListLiveDataApiV2Request, ListLiveDataApiV2Response>(request, RomaMeta.listLiveDataApiV2, hcClient);
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
     * 查询自定义后端服务数据源列表
     * 查询自定义后端服务数据源列表。
     *
     * @param ListLiveDataDataSourcesV2Request 请求对象
     * @return SyncInvoker<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response>
     */
    public SyncInvoker<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response> listLiveDataDataSourcesV2Invoker(ListLiveDataDataSourcesV2Request request) {
        return new SyncInvoker<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response>(request, RomaMeta.listLiveDataDataSourcesV2, hcClient);
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
     * 查询自定义后端服务配额
     * 查询自定义后端服务配额。
     *
     * @param ListLiveDataQuotaV2Request 请求对象
     * @return SyncInvoker<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response>
     */
    public SyncInvoker<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response> listLiveDataQuotaV2Invoker(ListLiveDataQuotaV2Request request) {
        return new SyncInvoker<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response>(request, RomaMeta.listLiveDataQuotaV2, hcClient);
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
     * 任务监控信息列表查询
     * 查询所有任务的监控信息
     *
     * @param ListMonitorInfosRequest 请求对象
     * @return SyncInvoker<ListMonitorInfosRequest, ListMonitorInfosResponse>
     */
    public SyncInvoker<ListMonitorInfosRequest, ListMonitorInfosResponse> listMonitorInfosInvoker(ListMonitorInfosRequest request) {
        return new SyncInvoker<ListMonitorInfosRequest, ListMonitorInfosResponse>(request, RomaMeta.listMonitorInfos, hcClient);
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
     * 任务监控日志查询
     * 查询单个任务的所有日志信息
     *
     * @param ListMonitorLogRequest 请求对象
     * @return SyncInvoker<ListMonitorLogRequest, ListMonitorLogResponse>
     */
    public SyncInvoker<ListMonitorLogRequest, ListMonitorLogResponse> listMonitorLogInvoker(ListMonitorLogRequest request) {
        return new SyncInvoker<ListMonitorLogRequest, ListMonitorLogResponse>(request, RomaMeta.listMonitorLog, hcClient);
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
     * 查询Topic列表
     * 查询Topic列表。
     *
     * @param ListMqsInstanceTopicsRequest 请求对象
     * @return SyncInvoker<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse>
     */
    public SyncInvoker<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse> listMqsInstanceTopicsInvoker(ListMqsInstanceTopicsRequest request) {
        return new SyncInvoker<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse>(request, RomaMeta.listMqsInstanceTopics, hcClient);
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
     * 查询产品模板
     * 查询产品模板
     *
     * @param ListProductTemplatesRequest 请求对象
     * @return SyncInvoker<ListProductTemplatesRequest, ListProductTemplatesResponse>
     */
    public SyncInvoker<ListProductTemplatesRequest, ListProductTemplatesResponse> listProductTemplatesInvoker(ListProductTemplatesRequest request) {
        return new SyncInvoker<ListProductTemplatesRequest, ListProductTemplatesResponse>(request, RomaMeta.listProductTemplates, hcClient);
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
     * 查询产品主题
     * 查询产品主题
     *
     * @param ListProductTopicsRequest 请求对象
     * @return SyncInvoker<ListProductTopicsRequest, ListProductTopicsResponse>
     */
    public SyncInvoker<ListProductTopicsRequest, ListProductTopicsResponse> listProductTopicsInvoker(ListProductTopicsRequest request) {
        return new SyncInvoker<ListProductTopicsRequest, ListProductTopicsResponse>(request, RomaMeta.listProductTopics, hcClient);
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
     * 查询产品
     * 查询产品
     *
     * @param ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<ListProductsRequest, ListProductsResponse>(request, RomaMeta.listProducts, hcClient);
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
     * 查询某个实例的租户配置列表
     * 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     *
     * @param ListProjectCofigsV2Request 请求对象
     * @return SyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response>
     */
    public SyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response> listProjectCofigsV2Invoker(ListProjectCofigsV2Request request) {
        return new SyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response>(request, RomaMeta.listProjectCofigsV2, hcClient);
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
     * 查询属性
     * 查询属性
     *
     * @param ListPropertiesRequest 请求对象
     * @return SyncInvoker<ListPropertiesRequest, ListPropertiesResponse>
     */
    public SyncInvoker<ListPropertiesRequest, ListPropertiesResponse> listPropertiesInvoker(ListPropertiesRequest request) {
        return new SyncInvoker<ListPropertiesRequest, ListPropertiesResponse>(request, RomaMeta.listProperties, hcClient);
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
     * 查询请求属性
     * 查询请求属性
     *
     * @param ListRequestPropertiesRequest 请求对象
     * @return SyncInvoker<ListRequestPropertiesRequest, ListRequestPropertiesResponse>
     */
    public SyncInvoker<ListRequestPropertiesRequest, ListRequestPropertiesResponse> listRequestPropertiesInvoker(ListRequestPropertiesRequest request) {
        return new SyncInvoker<ListRequestPropertiesRequest, ListRequestPropertiesResponse>(request, RomaMeta.listRequestProperties, hcClient);
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
     * 查询流控策略列表
     * 查询所有流控策略的信息。
     *
     * @param ListRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2Invoker(ListRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response>(request, RomaMeta.listRequestThrottlingPolicyV2, hcClient);
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
     * 查询响应属性
     * 查询响应属性
     *
     * @param ListResponsePropertiesRequest 请求对象
     * @return SyncInvoker<ListResponsePropertiesRequest, ListResponsePropertiesResponse>
     */
    public SyncInvoker<ListResponsePropertiesRequest, ListResponsePropertiesResponse> listResponsePropertiesInvoker(ListResponsePropertiesRequest request) {
        return new SyncInvoker<ListResponsePropertiesRequest, ListResponsePropertiesResponse>(request, RomaMeta.listResponseProperties, hcClient);
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
     * 查询规则
     * 查询规则
     *
     * @param ListRulesRequest 请求对象
     * @return SyncInvoker<ListRulesRequest, ListRulesResponse>
     */
    public SyncInvoker<ListRulesRequest, ListRulesResponse> listRulesInvoker(ListRulesRequest request) {
        return new SyncInvoker<ListRulesRequest, ListRulesResponse>(request, RomaMeta.listRules, hcClient);
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
     * 查询服务
     * 查询服务
     *
     * @param ListServicesRequest 请求对象
     * @return SyncInvoker<ListServicesRequest, ListServicesResponse>
     */
    public SyncInvoker<ListServicesRequest, ListServicesResponse> listServicesInvoker(ListServicesRequest request) {
        return new SyncInvoker<ListServicesRequest, ListServicesResponse>(request, RomaMeta.listServices, hcClient);
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
     * 查询设备影子
     * 查询设备影子
     *
     * @param ListShadowsRequest 请求对象
     * @return SyncInvoker<ListShadowsRequest, ListShadowsResponse>
     */
    public SyncInvoker<ListShadowsRequest, ListShadowsResponse> listShadowsInvoker(ListShadowsRequest request) {
        return new SyncInvoker<ListShadowsRequest, ListShadowsResponse>(request, RomaMeta.listShadows, hcClient);
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
     * 查看API绑定的签名密钥列表
     * 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     *
     * @param ListSignatureKeysBindedToApiV2Request 请求对象
     * @return SyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response>
     */
    public SyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2Invoker(ListSignatureKeysBindedToApiV2Request request) {
        return new SyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response>(request, RomaMeta.listSignatureKeysBindedToApiV2, hcClient);
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
     * 查询签名密钥列表
     * 查询所有签名密钥的信息。
     *
     * @param ListSignatureKeysV2Request 请求对象
     * @return SyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response>
     */
    public SyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response> listSignatureKeysV2Invoker(ListSignatureKeysV2Request request) {
        return new SyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response>(request, RomaMeta.listSignatureKeysV2, hcClient);
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
     * 查询源数据源列表
     * 查询源数据源列表
     *
     * @param ListSourcesRequest 请求对象
     * @return SyncInvoker<ListSourcesRequest, ListSourcesResponse>
     */
    public SyncInvoker<ListSourcesRequest, ListSourcesResponse> listSourcesInvoker(ListSourcesRequest request) {
        return new SyncInvoker<ListSourcesRequest, ListSourcesResponse>(request, RomaMeta.listSources, hcClient);
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
     * 查看特殊设置列表
     * 查看给流控策略设置的特殊配置。
     *
     * @param ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return SyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response>
     */
    public SyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2Invoker(ListSpecialThrottlingConfigurationsV2Request request) {
        return new SyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response>(request, RomaMeta.listSpecialThrottlingConfigurationsV2, hcClient);
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
     * 查询API指标统计值
     * 查询某个实例下的API统计信息。
     *
     * @param ListStatisticsApiRequest 请求对象
     * @return SyncInvoker<ListStatisticsApiRequest, ListStatisticsApiResponse>
     */
    public SyncInvoker<ListStatisticsApiRequest, ListStatisticsApiResponse> listStatisticsApiInvoker(ListStatisticsApiRequest request) {
        return new SyncInvoker<ListStatisticsApiRequest, ListStatisticsApiResponse>(request, RomaMeta.listStatisticsApi, hcClient);
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
     * 查询子设备
     * 查询子设备
     *
     * @param ListSubsetsRequest 请求对象
     * @return SyncInvoker<ListSubsetsRequest, ListSubsetsResponse>
     */
    public SyncInvoker<ListSubsetsRequest, ListSubsetsResponse> listSubsetsInvoker(ListSubsetsRequest request) {
        return new SyncInvoker<ListSubsetsRequest, ListSubsetsResponse>(request, RomaMeta.listSubsets, hcClient);
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
     * 查询标签列表
     * 查询标签列表
     *
     * @param ListTagsV2Request 请求对象
     * @return SyncInvoker<ListTagsV2Request, ListTagsV2Response>
     */
    public SyncInvoker<ListTagsV2Request, ListTagsV2Response> listTagsV2Invoker(ListTagsV2Request request) {
        return new SyncInvoker<ListTagsV2Request, ListTagsV2Response>(request, RomaMeta.listTagsV2, hcClient);
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
     * 查询设备主题
     * 查询设备主题
     *
     * @param ListTopicsRequest 请求对象
     * @return SyncInvoker<ListTopicsRequest, ListTopicsResponse>
     */
    public SyncInvoker<ListTopicsRequest, ListTopicsResponse> listTopicsInvoker(ListTopicsRequest request) {
        return new SyncInvoker<ListTopicsRequest, ListTopicsResponse>(request, RomaMeta.listTopics, hcClient);
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
     * 部署后端API
     * 在某个实例中部署后端API。
     *
     * @param PublishLiveDataApiV2Request 请求对象
     * @return SyncInvoker<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response>
     */
    public SyncInvoker<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response> publishLiveDataApiV2Invoker(PublishLiveDataApiV2Request request) {
        return new SyncInvoker<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response>(request, RomaMeta.publishLiveDataApiV2, hcClient);
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
     * 重置设备鉴权信息
     * 重置设备鉴权信息
     *
     * @param ResetAuthenticationRequest 请求对象
     * @return SyncInvoker<ResetAuthenticationRequest, ResetAuthenticationResponse>
     */
    public SyncInvoker<ResetAuthenticationRequest, ResetAuthenticationResponse> resetAuthenticationInvoker(ResetAuthenticationRequest request) {
        return new SyncInvoker<ResetAuthenticationRequest, ResetAuthenticationResponse>(request, RomaMeta.resetAuthentication, hcClient);
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
     * 重发消息
     * 重发消息。
     *
     * @param ResetMessagesRequest 请求对象
     * @return SyncInvoker<ResetMessagesRequest, ResetMessagesResponse>
     */
    public SyncInvoker<ResetMessagesRequest, ResetMessagesResponse> resetMessagesInvoker(ResetMessagesRequest request) {
        return new SyncInvoker<ResetMessagesRequest, ResetMessagesResponse>(request, RomaMeta.resetMessages, hcClient);
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
     * 重置产品鉴权信息
     * 重置产品鉴权信息
     *
     * @param ResetProductAuthenticationRequest 请求对象
     * @return SyncInvoker<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse>
     */
    public SyncInvoker<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse> resetProductAuthenticationInvoker(ResetProductAuthenticationRequest request) {
        return new SyncInvoker<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse>(request, RomaMeta.resetProductAuthentication, hcClient);
    }

    /**
     * 手工触发单个任务
     * 手工触发一次任务调度
     *
     * @param RunTaskRequest 请求对象
     * @return RunTaskResponse
     */
    public RunTaskResponse runTask(RunTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.runTask);
    }

    /**
     * 手工触发单个任务
     * 手工触发一次任务调度
     *
     * @param RunTaskRequest 请求对象
     * @return SyncInvoker<RunTaskRequest, RunTaskResponse>
     */
    public SyncInvoker<RunTaskRequest, RunTaskResponse> runTaskInvoker(RunTaskRequest request) {
        return new SyncInvoker<RunTaskRequest, RunTaskResponse>(request, RomaMeta.runTask, hcClient);
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
     * 发送命令
     * 发送命令
     *
     * @param SendCommandRequest 请求对象
     * @return SyncInvoker<SendCommandRequest, SendCommandResponse>
     */
    public SyncInvoker<SendCommandRequest, SendCommandResponse> sendCommandInvoker(SendCommandRequest request) {
        return new SyncInvoker<SendCommandRequest, SendCommandResponse>(request, RomaMeta.sendCommand, hcClient);
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
     * 查询客户端应用关联的应用配额
     * 查看指定客户端应用关联的应用配额。
     *
     * @param ShowAppBoundAppQuotaRequest 请求对象
     * @return SyncInvoker<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse>
     */
    public SyncInvoker<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse> showAppBoundAppQuotaInvoker(ShowAppBoundAppQuotaRequest request) {
        return new SyncInvoker<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse>(request, RomaMeta.showAppBoundAppQuota, hcClient);
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
     * 获取客户端配额详情
     * 获取客户端配额详情
     *
     * @param ShowAppQuotaRequest 请求对象
     * @return SyncInvoker<ShowAppQuotaRequest, ShowAppQuotaResponse>
     */
    public SyncInvoker<ShowAppQuotaRequest, ShowAppQuotaResponse> showAppQuotaInvoker(ShowAppQuotaRequest request) {
        return new SyncInvoker<ShowAppQuotaRequest, ShowAppQuotaResponse>(request, RomaMeta.showAppQuota, hcClient);
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
     * 查询设备鉴权信息
     * 查询设备鉴权信息
     *
     * @param ShowAuthenticationRequest 请求对象
     * @return SyncInvoker<ShowAuthenticationRequest, ShowAuthenticationResponse>
     */
    public SyncInvoker<ShowAuthenticationRequest, ShowAuthenticationResponse> showAuthenticationInvoker(ShowAuthenticationRequest request) {
        return new SyncInvoker<ShowAuthenticationRequest, ShowAuthenticationResponse>(request, RomaMeta.showAuthentication, hcClient);
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
     * 查询命令详情
     * 查询命令详情
     *
     * @param ShowCommandRequest 请求对象
     * @return SyncInvoker<ShowCommandRequest, ShowCommandResponse>
     */
    public SyncInvoker<ShowCommandRequest, ShowCommandResponse> showCommandInvoker(ShowCommandRequest request) {
        return new SyncInvoker<ShowCommandRequest, ShowCommandResponse>(request, RomaMeta.showCommand, hcClient);
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
     * 查看APP的访问控制详情
     * 查看APP的访问控制详情。
     *
     * @param ShowDetailsOfAppAclRequest 请求对象
     * @return SyncInvoker<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse>
     */
    public SyncInvoker<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse> showDetailsOfAppAclInvoker(ShowDetailsOfAppAclRequest request) {
        return new SyncInvoker<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse>(request, RomaMeta.showDetailsOfAppAcl, hcClient);
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
     * 查看APP Code详情
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     *
     * @param ShowDetailsOfAppCodeV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response>
     */
    public SyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2Invoker(ShowDetailsOfAppCodeV2Request request) {
        return new SyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response>(request, RomaMeta.showDetailsOfAppCodeV2, hcClient);
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
     * 查看应用配置详情
     * 查看应用配置详情
     *
     * @param ShowDetailsOfAppConfigV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response>
     */
    public SyncInvoker<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response> showDetailsOfAppConfigV2Invoker(ShowDetailsOfAppConfigV2Request request) {
        return new SyncInvoker<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response>(request, RomaMeta.showDetailsOfAppConfigV2, hcClient);
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
     * 查看APP详情
     * 查看指定APP的详细信息。
     *
     * @param ShowDetailsOfAppV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response>
     */
    public SyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> showDetailsOfAppV2Invoker(ShowDetailsOfAppV2Request request) {
        return new SyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response>(request, RomaMeta.showDetailsOfAppV2, hcClient);
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
     * 查看自定义认证详情
     * 查看自定义认证详情
     *
     * @param ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response>
     */
    public SyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2Invoker(ShowDetailsOfCustomAuthorizersV2Request request) {
        return new SyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response>(request, RomaMeta.showDetailsOfCustomAuthorizersV2, hcClient);
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
     * 查看域名证书
     * 查看域名下绑定的证书详情。
     *
     * @param ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response>
     */
    public SyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2Invoker(ShowDetailsOfDomainNameCertificateV2Request request) {
        return new SyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response>(request, RomaMeta.showDetailsOfDomainNameCertificateV2, hcClient);
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
     * 查看变量详情
     * 查看指定的环境变量的详情。
     *
     * @param ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response>
     */
    public SyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2Invoker(ShowDetailsOfEnvironmentVariableV2Request request) {
        return new SyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response>(request, RomaMeta.showDetailsOfEnvironmentVariableV2, hcClient);
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
     * 查看流控策略详情
     * 查看指定流控策略的详细信息。
     *
     * @param ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2Invoker(ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response>(request, RomaMeta.showDetailsOfRequestThrottlingPolicyV2, hcClient);
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
     * 查询设备详情
     * 查询设备详情
     *
     * @param ShowDeviceRequest 请求对象
     * @return SyncInvoker<ShowDeviceRequest, ShowDeviceResponse>
     */
    public SyncInvoker<ShowDeviceRequest, ShowDeviceResponse> showDeviceInvoker(ShowDeviceRequest request) {
        return new SyncInvoker<ShowDeviceRequest, ShowDeviceResponse>(request, RomaMeta.showDevice, hcClient);
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
     * 查询设备分组详情
     * 获取设备分组及下一层分组信息
     *
     * @param ShowDeviceGroupRequest 请求对象
     * @return SyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse>
     */
    public SyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse> showDeviceGroupInvoker(ShowDeviceGroupRequest request) {
        return new SyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse>(request, RomaMeta.showDeviceGroup, hcClient);
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
     * 查询所有设备分组
     * 查询所有设备分组
     *
     * @param ShowDeviceGroupTreeRequest 请求对象
     * @return SyncInvoker<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse>
     */
    public SyncInvoker<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse> showDeviceGroupTreeInvoker(ShowDeviceGroupTreeRequest request) {
        return new SyncInvoker<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse>(request, RomaMeta.showDeviceGroupTree, hcClient);
    }

    /**
     * 查询设备分组内设备
     * 查询设备分组内设备
     *
     * @param ShowDevicesInGroupRequest 请求对象
     * @return ShowDevicesInGroupResponse
     */
    public ShowDevicesInGroupResponse showDevicesInGroup(ShowDevicesInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDevicesInGroup);
    }

    /**
     * 查询设备分组内设备
     * 查询设备分组内设备
     *
     * @param ShowDevicesInGroupRequest 请求对象
     * @return SyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse>
     */
    public SyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> showDevicesInGroupInvoker(ShowDevicesInGroupRequest request) {
        return new SyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse>(request, RomaMeta.showDevicesInGroup, hcClient);
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
     * 查询后端API详情
     * 查询后端API的详细信息。
     *
     * @param ShowLiveDataApiV2Request 请求对象
     * @return SyncInvoker<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response>
     */
    public SyncInvoker<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response> showLiveDataApiV2Invoker(ShowLiveDataApiV2Request request) {
        return new SyncInvoker<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response>(request, RomaMeta.showLiveDataApiV2, hcClient);
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
     * 查询消息
     * 查询消息。
     *
     * @param ShowMqsInstanceMessagesRequest 请求对象
     * @return SyncInvoker<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse>
     */
    public SyncInvoker<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse> showMqsInstanceMessagesInvoker(ShowMqsInstanceMessagesRequest request) {
        return new SyncInvoker<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse>(request, RomaMeta.showMqsInstanceMessages, hcClient);
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
     * 查询Topic权限
     * 查询Topic权限。
     *
     * @param ShowMqsInstanceTopicAccessPolicyRequest 请求对象
     * @return SyncInvoker<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse>
     */
    public SyncInvoker<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse> showMqsInstanceTopicAccessPolicyInvoker(ShowMqsInstanceTopicAccessPolicyRequest request) {
        return new SyncInvoker<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse>(request, RomaMeta.showMqsInstanceTopicAccessPolicy, hcClient);
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
     * 查询产品详情
     * 查询产品详情
     *
     * @param ShowProductRequest 请求对象
     * @return SyncInvoker<ShowProductRequest, ShowProductResponse>
     */
    public SyncInvoker<ShowProductRequest, ShowProductResponse> showProductInvoker(ShowProductRequest request) {
        return new SyncInvoker<ShowProductRequest, ShowProductResponse>(request, RomaMeta.showProduct, hcClient);
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
     * 查询产品鉴权信息
     * 查询产品鉴权信息
     *
     * @param ShowProductAuthenticationRequest 请求对象
     * @return SyncInvoker<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse>
     */
    public SyncInvoker<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse> showProductAuthenticationInvoker(ShowProductAuthenticationRequest request) {
        return new SyncInvoker<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse>(request, RomaMeta.showProductAuthentication, hcClient);
    }

    /**
     * 查询产品模板详情
     * 查询产品模板详情
     *
     * @param ShowProductTemplateRequest 请求对象
     * @return ShowProductTemplateResponse
     */
    public ShowProductTemplateResponse showProductTemplate(ShowProductTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showProductTemplate);
    }

    /**
     * 查询产品模板详情
     * 查询产品模板详情
     *
     * @param ShowProductTemplateRequest 请求对象
     * @return SyncInvoker<ShowProductTemplateRequest, ShowProductTemplateResponse>
     */
    public SyncInvoker<ShowProductTemplateRequest, ShowProductTemplateResponse> showProductTemplateInvoker(ShowProductTemplateRequest request) {
        return new SyncInvoker<ShowProductTemplateRequest, ShowProductTemplateResponse>(request, RomaMeta.showProductTemplate, hcClient);
    }

    /**
     * 查询服务属性详情
     * 查询服务属性详情
     *
     * @param ShowPropertyRequest 请求对象
     * @return ShowPropertyResponse
     */
    public ShowPropertyResponse showProperty(ShowPropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showProperty);
    }

    /**
     * 查询服务属性详情
     * 查询服务属性详情
     *
     * @param ShowPropertyRequest 请求对象
     * @return SyncInvoker<ShowPropertyRequest, ShowPropertyResponse>
     */
    public SyncInvoker<ShowPropertyRequest, ShowPropertyResponse> showPropertyInvoker(ShowPropertyRequest request) {
        return new SyncInvoker<ShowPropertyRequest, ShowPropertyResponse>(request, RomaMeta.showProperty, hcClient);
    }

    /**
     * 查询请求属性详情
     * 查询请求属性详情
     *
     * @param ShowRequestPropertyRequest 请求对象
     * @return ShowRequestPropertyResponse
     */
    public ShowRequestPropertyResponse showRequestProperty(ShowRequestPropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showRequestProperty);
    }

    /**
     * 查询请求属性详情
     * 查询请求属性详情
     *
     * @param ShowRequestPropertyRequest 请求对象
     * @return SyncInvoker<ShowRequestPropertyRequest, ShowRequestPropertyResponse>
     */
    public SyncInvoker<ShowRequestPropertyRequest, ShowRequestPropertyResponse> showRequestPropertyInvoker(ShowRequestPropertyRequest request) {
        return new SyncInvoker<ShowRequestPropertyRequest, ShowRequestPropertyResponse>(request, RomaMeta.showRequestProperty, hcClient);
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
     * 查询响应属性详情
     * 查询响应属性详情
     *
     * @param ShowResponsePropertyRequest 请求对象
     * @return SyncInvoker<ShowResponsePropertyRequest, ShowResponsePropertyResponse>
     */
    public SyncInvoker<ShowResponsePropertyRequest, ShowResponsePropertyResponse> showResponsePropertyInvoker(ShowResponsePropertyRequest request) {
        return new SyncInvoker<ShowResponsePropertyRequest, ShowResponsePropertyResponse>(request, RomaMeta.showResponseProperty, hcClient);
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
     * 查询规则详情
     * 查询规则详情
     *
     * @param ShowRuleRequest 请求对象
     * @return SyncInvoker<ShowRuleRequest, ShowRuleResponse>
     */
    public SyncInvoker<ShowRuleRequest, ShowRuleResponse> showRuleInvoker(ShowRuleRequest request) {
        return new SyncInvoker<ShowRuleRequest, ShowRuleResponse>(request, RomaMeta.showRule, hcClient);
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
     * 查询服务详情
     * 查询服务详情
     *
     * @param ShowServiceRequest 请求对象
     * @return SyncInvoker<ShowServiceRequest, ShowServiceResponse>
     */
    public SyncInvoker<ShowServiceRequest, ShowServiceResponse> showServiceInvoker(ShowServiceRequest request) {
        return new SyncInvoker<ShowServiceRequest, ShowServiceResponse>(request, RomaMeta.showService, hcClient);
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
     * 撤销后端API
     * 在某个实例中取消部署后端API。
     *
     * @param UnpublishLiveDataApiV2Request 请求对象
     * @return SyncInvoker<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response>
     */
    public SyncInvoker<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response> unpublishLiveDataApiV2Invoker(UnpublishLiveDataApiV2Request request) {
        return new SyncInvoker<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response>(request, RomaMeta.unpublishLiveDataApiV2, hcClient);
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
     * 设置APP的访问控制
     * 设置客户端配置的访问控制。
     *
     * @param UpdateAppAclRequest 请求对象
     * @return SyncInvoker<UpdateAppAclRequest, UpdateAppAclResponse>
     */
    public SyncInvoker<UpdateAppAclRequest, UpdateAppAclResponse> updateAppAclInvoker(UpdateAppAclRequest request) {
        return new SyncInvoker<UpdateAppAclRequest, UpdateAppAclResponse>(request, RomaMeta.updateAppAcl, hcClient);
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
     * 修改应用配置
     * 修改应用配置
     *
     * @param UpdateAppConfigV2Request 请求对象
     * @return SyncInvoker<UpdateAppConfigV2Request, UpdateAppConfigV2Response>
     */
    public SyncInvoker<UpdateAppConfigV2Request, UpdateAppConfigV2Response> updateAppConfigV2Invoker(UpdateAppConfigV2Request request) {
        return new SyncInvoker<UpdateAppConfigV2Request, UpdateAppConfigV2Response>(request, RomaMeta.updateAppConfigV2, hcClient);
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
     * 修改客户端配额
     * 修改客户端配额
     *
     * @param UpdateAppQuotaRequest 请求对象
     * @return SyncInvoker<UpdateAppQuotaRequest, UpdateAppQuotaResponse>
     */
    public SyncInvoker<UpdateAppQuotaRequest, UpdateAppQuotaResponse> updateAppQuotaInvoker(UpdateAppQuotaRequest request) {
        return new SyncInvoker<UpdateAppQuotaRequest, UpdateAppQuotaResponse>(request, RomaMeta.updateAppQuota, hcClient);
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
     * 修改命令
     * 修改命令
     *
     * @param UpdateCommandRequest 请求对象
     * @return SyncInvoker<UpdateCommandRequest, UpdateCommandResponse>
     */
    public SyncInvoker<UpdateCommandRequest, UpdateCommandResponse> updateCommandInvoker(UpdateCommandRequest request) {
        return new SyncInvoker<UpdateCommandRequest, UpdateCommandResponse>(request, RomaMeta.updateCommand, hcClient);
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
     * 修改自定义认证
     * 修改自定义认证
     *
     * @param UpdateCustomAuthorizerV2Request 请求对象
     * @return SyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response>
     */
    public SyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2Invoker(UpdateCustomAuthorizerV2Request request) {
        return new SyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response>(request, RomaMeta.updateCustomAuthorizerV2, hcClient);
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
     * 修改设备
     * 修改设备信息
     *
     * @param UpdateDeviceRequest 请求对象
     * @return SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceInvoker(UpdateDeviceRequest request) {
        return new SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>(request, RomaMeta.updateDevice, hcClient);
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
     * 修改设备分组
     * 修改设备分组
     *
     * @param UpdateDeviceGroupRequest 请求对象
     * @return SyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse>
     */
    public SyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> updateDeviceGroupInvoker(UpdateDeviceGroupRequest request) {
        return new SyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse>(request, RomaMeta.updateDeviceGroup, hcClient);
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
     * 修改域名
     * 修改绑定的域名所对应的配置信息。
     *
     * @param UpdateDomainV2Request 请求对象
     * @return SyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response>
     */
    public SyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response> updateDomainV2Invoker(UpdateDomainV2Request request) {
        return new SyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response>(request, RomaMeta.updateDomainV2, hcClient);
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
     * 修改环境
     * 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     *
     * @param UpdateEnvironmentV2Request 请求对象
     * @return SyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response>
     */
    public SyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> updateEnvironmentV2Invoker(UpdateEnvironmentV2Request request) {
        return new SyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response>(request, RomaMeta.updateEnvironmentV2, hcClient);
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
     * 修改变量
     * 修改环境变量。环境变量引用位置为api的后端服务地址时，修改对应环境变量会将使用该变量的所有api重新发布。
     *
     * @param UpdateEnvironmentVariableV2Request 请求对象
     * @return SyncInvoker<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response>
     */
    public SyncInvoker<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response> updateEnvironmentVariableV2Invoker(UpdateEnvironmentVariableV2Request request) {
        return new SyncInvoker<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response>(request, RomaMeta.updateEnvironmentVariableV2, hcClient);
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
     * 修改后端API
     * 在某个实例中更新后端API的参数。
     *
     * @param UpdateLiveDataApiV2Request 请求对象
     * @return SyncInvoker<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response>
     */
    public SyncInvoker<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response> updateLiveDataApiV2Invoker(UpdateLiveDataApiV2Request request) {
        return new SyncInvoker<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response>(request, RomaMeta.updateLiveDataApiV2, hcClient);
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
     * 修改Topic
     * 修改Topic。
     *
     * @param UpdateMqsInstanceTopicRequest 请求对象
     * @return SyncInvoker<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse>
     */
    public SyncInvoker<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse> updateMqsInstanceTopicInvoker(UpdateMqsInstanceTopicRequest request) {
        return new SyncInvoker<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse>(request, RomaMeta.updateMqsInstanceTopic, hcClient);
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
     * 修改产品信息
     * 修改产品信息
     *
     * @param UpdateProductRequest 请求对象
     * @return SyncInvoker<UpdateProductRequest, UpdateProductResponse>
     */
    public SyncInvoker<UpdateProductRequest, UpdateProductResponse> updateProductInvoker(UpdateProductRequest request) {
        return new SyncInvoker<UpdateProductRequest, UpdateProductResponse>(request, RomaMeta.updateProduct, hcClient);
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
     * 修改产品模板
     * 修改产品模板
     *
     * @param UpdateProductTemplateRequest 请求对象
     * @return SyncInvoker<UpdateProductTemplateRequest, UpdateProductTemplateResponse>
     */
    public SyncInvoker<UpdateProductTemplateRequest, UpdateProductTemplateResponse> updateProductTemplateInvoker(UpdateProductTemplateRequest request) {
        return new SyncInvoker<UpdateProductTemplateRequest, UpdateProductTemplateResponse>(request, RomaMeta.updateProductTemplate, hcClient);
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
     * 更新产品主题
     * 更新产品主题
     *
     * @param UpdateProductTopicRequest 请求对象
     * @return SyncInvoker<UpdateProductTopicRequest, UpdateProductTopicResponse>
     */
    public SyncInvoker<UpdateProductTopicRequest, UpdateProductTopicResponse> updateProductTopicInvoker(UpdateProductTopicRequest request) {
        return new SyncInvoker<UpdateProductTopicRequest, UpdateProductTopicResponse>(request, RomaMeta.updateProductTopic, hcClient);
    }

    /**
     * 修改服务属性
     * 修改服务属性
     *
     * @param UpdatePropertyRequest 请求对象
     * @return UpdatePropertyResponse
     */
    public UpdatePropertyResponse updateProperty(UpdatePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateProperty);
    }

    /**
     * 修改服务属性
     * 修改服务属性
     *
     * @param UpdatePropertyRequest 请求对象
     * @return SyncInvoker<UpdatePropertyRequest, UpdatePropertyResponse>
     */
    public SyncInvoker<UpdatePropertyRequest, UpdatePropertyResponse> updatePropertyInvoker(UpdatePropertyRequest request) {
        return new SyncInvoker<UpdatePropertyRequest, UpdatePropertyResponse>(request, RomaMeta.updateProperty, hcClient);
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
     * 修改请求属性
     * 修改请求属性
     *
     * @param UpdateRequestPropertyRequest 请求对象
     * @return SyncInvoker<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse>
     */
    public SyncInvoker<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse> updateRequestPropertyInvoker(UpdateRequestPropertyRequest request) {
        return new SyncInvoker<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse>(request, RomaMeta.updateRequestProperty, hcClient);
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
     * 修改流控策略
     * 修改指定流控策略的详细信息。
     *
     * @param UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2Invoker(UpdateRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response>(request, RomaMeta.updateRequestThrottlingPolicyV2, hcClient);
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
     * 修改响应属性
     * 修改响应属性
     *
     * @param UpdateResponsePropertyRequest 请求对象
     * @return SyncInvoker<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse>
     */
    public SyncInvoker<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse> updateResponsePropertyInvoker(UpdateResponsePropertyRequest request) {
        return new SyncInvoker<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse>(request, RomaMeta.updateResponseProperty, hcClient);
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
     * 修改规则
     * 修改规则
     *
     * @param UpdateRuleRequest 请求对象
     * @return SyncInvoker<UpdateRuleRequest, UpdateRuleResponse>
     */
    public SyncInvoker<UpdateRuleRequest, UpdateRuleResponse> updateRuleInvoker(UpdateRuleRequest request) {
        return new SyncInvoker<UpdateRuleRequest, UpdateRuleResponse>(request, RomaMeta.updateRule, hcClient);
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
     * 修改服务
     * 修改服务
     *
     * @param UpdateServiceRequest 请求对象
     * @return SyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public SyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceInvoker(UpdateServiceRequest request) {
        return new SyncInvoker<UpdateServiceRequest, UpdateServiceResponse>(request, RomaMeta.updateService, hcClient);
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
     * 修改签名密钥
     * 修改指定签名密钥的详细信息。
     *
     * @param UpdateSignatureKeyV2Request 请求对象
     * @return SyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response>
     */
    public SyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> updateSignatureKeyV2Invoker(UpdateSignatureKeyV2Request request) {
        return new SyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response>(request, RomaMeta.updateSignatureKeyV2, hcClient);
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
     * 修改特殊设置
     * 修改某个流控策略下的某个特殊设置。
     *
     * @param UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return SyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response>
     */
    public SyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2Invoker(UpdateSpecialThrottlingConfigurationV2Request request) {
        return new SyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response>(request, RomaMeta.updateSpecialThrottlingConfigurationV2, hcClient);
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
     * 更新Topic权限
     * 更新Topic权限。
     *
     * @param UpdateTopicAccessPolicyRequest 请求对象
     * @return SyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse>
     */
    public SyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> updateTopicAccessPolicyInvoker(UpdateTopicAccessPolicyRequest request) {
        return new SyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse>(request, RomaMeta.updateTopicAccessPolicy, hcClient);
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
     * 导入产品
     * 导入产品
     *
     * @param UploadProductRequest 请求对象
     * @return SyncInvoker<UploadProductRequest, UploadProductResponse>
     */
    public SyncInvoker<UploadProductRequest, UploadProductResponse> uploadProductInvoker(UploadProductRequest request) {
        return new SyncInvoker<UploadProductRequest, UploadProductResponse>(request, RomaMeta.uploadProduct, hcClient);
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
     * 批量删除ACL策略
     * 批量删除指定的多个ACL策略。  删除ACL策略时，如果存在ACL策略与API绑定关系，则无法删除。
     *
     * @param BatchDeleteAclV2Request 请求对象
     * @return SyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response>
     */
    public SyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response> batchDeleteAclV2Invoker(BatchDeleteAclV2Request request) {
        return new SyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response>(request, RomaMeta.batchDeleteAclV2, hcClient);
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
     * 创建ACL策略
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com\&quot;之类的网络域名。
     *
     * @param CreateAclStrategyV2Request 请求对象
     * @return SyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response>
     */
    public SyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response> createAclStrategyV2Invoker(CreateAclStrategyV2Request request) {
        return new SyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response>(request, RomaMeta.createAclStrategyV2, hcClient);
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
     * 删除ACL策略
     * 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     *
     * @param DeleteAclV2Request 请求对象
     * @return SyncInvoker<DeleteAclV2Request, DeleteAclV2Response>
     */
    public SyncInvoker<DeleteAclV2Request, DeleteAclV2Response> deleteAclV2Invoker(DeleteAclV2Request request) {
        return new SyncInvoker<DeleteAclV2Request, DeleteAclV2Response>(request, RomaMeta.deleteAclV2, hcClient);
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
     * 查看ACL策略列表
     * 查询所有的ACL策略列表。 
     *
     * @param ListAclStrategiesV2Request 请求对象
     * @return SyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response>
     */
    public SyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response> listAclStrategiesV2Invoker(ListAclStrategiesV2Request request) {
        return new SyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response>(request, RomaMeta.listAclStrategiesV2, hcClient);
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
     * 查看ACL策略详情
     * 查询指定ACL策略的详情。
     *
     * @param ShowDetailsOfAclPolicyV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response>
     */
    public SyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2Invoker(ShowDetailsOfAclPolicyV2Request request) {
        return new SyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response>(request, RomaMeta.showDetailsOfAclPolicyV2, hcClient);
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
     * 修改ACL策略
     * 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     *
     * @param UpdateAclStrategyV2Request 请求对象
     * @return SyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response>
     */
    public SyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> updateAclStrategyV2Invoker(UpdateAclStrategyV2Request request) {
        return new SyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response>(request, RomaMeta.updateAclStrategyV2, hcClient);
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
     * 绑定流控策略
     * 将流控策略应用于API，则所有对该API的访问将会受到该流控策略的限制。  当一定时间内的访问次数超过流控策略设置的API最大访问次数限制后，后续的访问将会被拒绝，从而能够较好的保护后端API免受异常流量的冲击，保障服务的稳定运行。  为指定的API绑定流控策略，绑定时，需要指定在哪个环境上生效。同一个API发布到不同的环境可以绑定不同的流控策略；一个API在发布到特定环境后只能绑定一个默认的流控策略。
     *
     * @param AssociateRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2Invoker(AssociateRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response>(request, RomaMeta.associateRequestThrottlingPolicyV2, hcClient);
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
     * 批量解绑流控策略
     * 批量解除API与流控策略的绑定关系
     *
     * @param BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response>
     */
    public SyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2Invoker(BatchDisassociateThrottlingPolicyV2Request request) {
        return new SyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response>(request, RomaMeta.batchDisassociateThrottlingPolicyV2, hcClient);
    }

    /**
     * 批量发布或下线API
     * 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。  注意：当action &#x3D; online时，接口返回的响应中publish_id，version_id， publish_time字段才有含义。
     *
     * @param BatchPublishOrOfflineApiV2Request 请求对象
     * @return BatchPublishOrOfflineApiV2Response
     */
    public BatchPublishOrOfflineApiV2Response batchPublishOrOfflineApiV2(BatchPublishOrOfflineApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchPublishOrOfflineApiV2);
    }

    /**
     * 批量发布或下线API
     * 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。  注意：当action &#x3D; online时，接口返回的响应中publish_id，version_id， publish_time字段才有含义。
     *
     * @param BatchPublishOrOfflineApiV2Request 请求对象
     * @return SyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response>
     */
    public SyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2Invoker(BatchPublishOrOfflineApiV2Request request) {
        return new SyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response>(request, RomaMeta.batchPublishOrOfflineApiV2, hcClient);
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
     * 切换API版本
     * API每次发布时，会基于当前的API定义生成一个版本。版本记录了API发布时的各种定义及状态。  多个版本之间可以进行随意切换。但一个API在一个环境上，只能有一个版本生效。
     *
     * @param ChangeApiVersionV2Request 请求对象
     * @return SyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response>
     */
    public SyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response> changeApiVersionV2Invoker(ChangeApiVersionV2Request request) {
        return new SyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response>(request, RomaMeta.changeApiVersionV2, hcClient);
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
     * 校验API分组名称是否存在
     * 校验API分组名称是否存在。
     *
     * @param CheckApiGroupsV2Request 请求对象
     * @return SyncInvoker<CheckApiGroupsV2Request, CheckApiGroupsV2Response>
     */
    public SyncInvoker<CheckApiGroupsV2Request, CheckApiGroupsV2Response> checkApiGroupsV2Invoker(CheckApiGroupsV2Request request) {
        return new SyncInvoker<CheckApiGroupsV2Request, CheckApiGroupsV2Response>(request, RomaMeta.checkApiGroupsV2, hcClient);
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
     * 校验API定义
     * 校验API定义。校验API的路径或名称是否已存在
     *
     * @param CheckApisV2Request 请求对象
     * @return SyncInvoker<CheckApisV2Request, CheckApisV2Response>
     */
    public SyncInvoker<CheckApisV2Request, CheckApisV2Response> checkApisV2Invoker(CheckApisV2Request request) {
        return new SyncInvoker<CheckApisV2Request, CheckApisV2Response>(request, RomaMeta.checkApisV2, hcClient);
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
     * 创建API分组
     * API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。 
     *
     * @param CreateApiGroupV2Request 请求对象
     * @return SyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response>
     */
    public SyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response> createApiGroupV2Invoker(CreateApiGroupV2Request request) {
        return new SyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response>(request, RomaMeta.createApiGroupV2, hcClient);
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
     * 创建API
     * 添加一个API，API即一个服务接口，具体的服务能力。  API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了ROMA Connect如何去访问真实的后端服务。API的真实后端服务目前支持三种类型：传统的HTTP/HTTPS形式的web后端、函数工作流、MOCK。 
     *
     * @param CreateApiV2Request 请求对象
     * @return SyncInvoker<CreateApiV2Request, CreateApiV2Response>
     */
    public SyncInvoker<CreateApiV2Request, CreateApiV2Response> createApiV2Invoker(CreateApiV2Request request) {
        return new SyncInvoker<CreateApiV2Request, CreateApiV2Response>(request, RomaMeta.createApiV2, hcClient);
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
     * 发布或下线API
     * 对API进行发布或下线。  发布操作是将一个指定的API发布到一个指定的环境，API只有发布后，才能够被调用，且只能在该环境上才能被调用。未发布的API无法被调用。  下线操作是将API从某个已发布的环境上下线，下线后，API将无法再被调用。
     *
     * @param CreateOrDeletePublishRecordForApiV2Request 请求对象
     * @return SyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response>
     */
    public SyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2Invoker(CreateOrDeletePublishRecordForApiV2Request request) {
        return new SyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response>(request, RomaMeta.createOrDeletePublishRecordForApiV2, hcClient);
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
     * 调试API
     * 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     *
     * @param DebugApiV2Request 请求对象
     * @return SyncInvoker<DebugApiV2Request, DebugApiV2Response>
     */
    public SyncInvoker<DebugApiV2Request, DebugApiV2Response> debugApiV2Invoker(DebugApiV2Request request) {
        return new SyncInvoker<DebugApiV2Request, DebugApiV2Response>(request, RomaMeta.debugApiV2, hcClient);
    }

    /**
     * 根据版本编号下线API
     * 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。
     *
     * @param DeleteApiByVersionIdV2Request 请求对象
     * @return DeleteApiByVersionIdV2Response
     */
    public DeleteApiByVersionIdV2Response deleteApiByVersionIdV2(DeleteApiByVersionIdV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteApiByVersionIdV2);
    }

    /**
     * 根据版本编号下线API
     * 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。
     *
     * @param DeleteApiByVersionIdV2Request 请求对象
     * @return SyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response>
     */
    public SyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2Invoker(DeleteApiByVersionIdV2Request request) {
        return new SyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response>(request, RomaMeta.deleteApiByVersionIdV2, hcClient);
    }

    /**
     * 删除API分组
     * 删除指定的API分组。 分组下存在API时分组无法删除，需要删除所有分组下的API后，再删除分组。 删除分组时，会一并删除直接或间接关联到该分组下的所有资源，包括独立域名、SSL证书等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     *
     * @param DeleteApiGroupV2Request 请求对象
     * @return DeleteApiGroupV2Response
     */
    public DeleteApiGroupV2Response deleteApiGroupV2(DeleteApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteApiGroupV2);
    }

    /**
     * 删除API分组
     * 删除指定的API分组。 分组下存在API时分组无法删除，需要删除所有分组下的API后，再删除分组。 删除分组时，会一并删除直接或间接关联到该分组下的所有资源，包括独立域名、SSL证书等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     *
     * @param DeleteApiGroupV2Request 请求对象
     * @return SyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response>
     */
    public SyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response> deleteApiGroupV2Invoker(DeleteApiGroupV2Request request) {
        return new SyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response>(request, RomaMeta.deleteApiGroupV2, hcClient);
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
     * 删除API
     * 删除指定的API。  删除API时，会删除该API所有相关的资源信息或绑定关系，如API的发布记录，绑定的后端服务，对APP的授权信息等。
     *
     * @param DeleteApiV2Request 请求对象
     * @return SyncInvoker<DeleteApiV2Request, DeleteApiV2Response>
     */
    public SyncInvoker<DeleteApiV2Request, DeleteApiV2Response> deleteApiV2Invoker(DeleteApiV2Request request) {
        return new SyncInvoker<DeleteApiV2Request, DeleteApiV2Response>(request, RomaMeta.deleteApiV2, hcClient);
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
     * 解除API与流控策略的绑定关系
     * 解除API与流控策略的绑定关系。
     *
     * @param DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2Invoker(DisassociateRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response>(request, RomaMeta.disassociateRequestThrottlingPolicyV2, hcClient);
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
     * 查询分组列表
     * 查询API分组列表。  如果是租户操作，则查询该租户下所有的分组；如果是管理员操作，则查询的是所有租户的分组。
     *
     * @param ListApiGroupsV2Request 请求对象
     * @return SyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response>
     */
    public SyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response> listApiGroupsV2Invoker(ListApiGroupsV2Request request) {
        return new SyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response>(request, RomaMeta.listApiGroupsV2, hcClient);
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
     * 查询API运行时定义
     * 查看指定的API在指定的环境上的运行时定义，默认查询RELEASE环境上的运行时定义。  API的定义分为临时定义和运行时定义，分别代表如下含义： - 临时定义：API在编辑中的定义，表示用户最后一次编辑后的API的状态 - 运行时定义：API在发布到某个环境时，对发布时的API的临时定义进行快照，固化出来的API的状态。  访问某个环境上的API，其实访问的就是其运行时的定义
     *
     * @param ListApiRuntimeDefinitionV2Request 请求对象
     * @return SyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response>
     */
    public SyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2Invoker(ListApiRuntimeDefinitionV2Request request) {
        return new SyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response>(request, RomaMeta.listApiRuntimeDefinitionV2, hcClient);
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
     * 查看版本详情
     * 查询某个指定的版本详情。
     *
     * @param ListApiVersionDetailV2Request 请求对象
     * @return SyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response>
     */
    public SyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> listApiVersionDetailV2Invoker(ListApiVersionDetailV2Request request) {
        return new SyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response>(request, RomaMeta.listApiVersionDetailV2, hcClient);
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
     * 查询API历史版本列表
     * 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     *
     * @param ListApiVersionsV2Request 请求对象
     * @return SyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response>
     */
    public SyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response> listApiVersionsV2Invoker(ListApiVersionsV2Request request) {
        return new SyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response>(request, RomaMeta.listApiVersionsV2, hcClient);
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
     * 查看流控策略绑定的API列表
     * 查询某个流控策略上已经绑定的API列表。
     *
     * @param ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2Invoker(ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response>(request, RomaMeta.listApisBindedToRequestThrottlingPolicyV2, hcClient);
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
     * 查看流控策略未绑定的API列表
     * 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2Invoker(ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response>(request, RomaMeta.listApisUnbindedToRequestThrottlingPolicyV2, hcClient);
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
     * 查询API列表
     * 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息。
     *
     * @param ListApisV2Request 请求对象
     * @return SyncInvoker<ListApisV2Request, ListApisV2Response>
     */
    public SyncInvoker<ListApisV2Request, ListApisV2Response> listApisV2Invoker(ListApisV2Request request) {
        return new SyncInvoker<ListApisV2Request, ListApisV2Response>(request, RomaMeta.listApisV2, hcClient);
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
     * 查看API绑定的流控策略列表
     * 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     *
     * @param ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return SyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response>
     */
    public SyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2Invoker(ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return new SyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response>(request, RomaMeta.listRequestThrottlingPoliciesBindedToApiV2, hcClient);
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
     * 查询分组详情
     * 查询指定分组的详细信息。
     *
     * @param ShowDetailsOfApiGroupV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response>
     */
    public SyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2Invoker(ShowDetailsOfApiGroupV2Request request) {
        return new SyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response>(request, RomaMeta.showDetailsOfApiGroupV2, hcClient);
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
     * 查询API详情
     * 查看指定的API的详细信息。
     *
     * @param ShowDetailsOfApiV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response>
     */
    public SyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> showDetailsOfApiV2Invoker(ShowDetailsOfApiV2Request request) {
        return new SyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response>(request, RomaMeta.showDetailsOfApiV2, hcClient);
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
     * 修改API分组
     * 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     *
     * @param UpdateApiGroupV2Request 请求对象
     * @return SyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response>
     */
    public SyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response> updateApiGroupV2Invoker(UpdateApiGroupV2Request request) {
        return new SyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response>(request, RomaMeta.updateApiGroupV2, hcClient);
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
     * 修改API
     * 修改指定API的信息，包括后端服务信息。
     *
     * @param UpdateApiV2Request 请求对象
     * @return SyncInvoker<UpdateApiV2Request, UpdateApiV2Response>
     */
    public SyncInvoker<UpdateApiV2Request, UpdateApiV2Response> updateApiV2Invoker(UpdateApiV2Request request) {
        return new SyncInvoker<UpdateApiV2Request, UpdateApiV2Response>(request, RomaMeta.updateApiV2, hcClient);
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
     * 批量解除API与ACL策略的绑定
     * 批量解除API与ACL策略的绑定
     *
     * @param BatchDeleteApiAclBindingV2Request 请求对象
     * @return SyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response>
     */
    public SyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2Invoker(BatchDeleteApiAclBindingV2Request request) {
        return new SyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response>(request, RomaMeta.batchDeleteApiAclBindingV2, hcClient);
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
     * 将API与ACL策略进行绑定
     * 将API与ACL策略进行绑定。  同一个API发布到不同的环境可以绑定不同的ACL策略；一个API在发布到特定环境后只能绑定一个同一种类型的ACL策略。
     *
     * @param CreateApiAclBindingV2Request 请求对象
     * @return SyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response>
     */
    public SyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> createApiAclBindingV2Invoker(CreateApiAclBindingV2Request request) {
        return new SyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response>(request, RomaMeta.createApiAclBindingV2, hcClient);
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
     * 解除API与ACL策略的绑定
     * 解除某条API与ACL策略的绑定关系
     *
     * @param DeleteApiAclBindingV2Request 请求对象
     * @return SyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response>
     */
    public SyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> deleteApiAclBindingV2Invoker(DeleteApiAclBindingV2Request request) {
        return new SyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response>(request, RomaMeta.deleteApiAclBindingV2, hcClient);
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
     * 查看API绑定的ACL策略列表
     * 查看API绑定的ACL策略列表
     *
     * @param ListAclPolicyBindedToApiV2Request 请求对象
     * @return SyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response>
     */
    public SyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2Invoker(ListAclPolicyBindedToApiV2Request request) {
        return new SyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response>(request, RomaMeta.listAclPolicyBindedToApiV2, hcClient);
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
     * 查看ACL策略绑定的API列表
     * 查看ACL策略绑定的API列表
     *
     * @param ListApisBindedToAclPolicyV2Request 请求对象
     * @return SyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response>
     */
    public SyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2Invoker(ListApisBindedToAclPolicyV2Request request) {
        return new SyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response>(request, RomaMeta.listApisBindedToAclPolicyV2, hcClient);
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
     * 查看ACL策略未绑定的API列表
     * 查看ACL策略未绑定的API列表，需要API已发布
     *
     * @param ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return SyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response>
     */
    public SyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2Invoker(ListApisUnbindedToAclPolicyV2Request request) {
        return new SyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response>(request, RomaMeta.listApisUnbindedToAclPolicyV2, hcClient);
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
     * 解除授权
     * 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     *
     * @param CancelingAuthorizationV2Request 请求对象
     * @return SyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response>
     */
    public SyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> cancelingAuthorizationV2Invoker(CancelingAuthorizationV2Request request) {
        return new SyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response>(request, RomaMeta.cancelingAuthorizationV2, hcClient);
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
     * APP授权
     * APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。 
     *
     * @param CreateAuthorizingAppsV2Request 请求对象
     * @return SyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response>
     */
    public SyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> createAuthorizingAppsV2Invoker(CreateAuthorizingAppsV2Request request) {
        return new SyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response>(request, RomaMeta.createAuthorizingAppsV2, hcClient);
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
     * 查看APP已绑定的API列表
     * 查询APP已经绑定的API列表。
     *
     * @param ListApisBindedToAppV2Request 请求对象
     * @return SyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response>
     */
    public SyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> listApisBindedToAppV2Invoker(ListApisBindedToAppV2Request request) {
        return new SyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response>(request, RomaMeta.listApisBindedToAppV2, hcClient);
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
     * 查看APP未绑定的API列表
     * 查询指定环境上某个APP未绑定的API列表，包括自有API和从云市场购买的API。
     *
     * @param ListApisUnbindedToAppV2Request 请求对象
     * @return SyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response>
     */
    public SyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2Invoker(ListApisUnbindedToAppV2Request request) {
        return new SyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response>(request, RomaMeta.listApisUnbindedToAppV2, hcClient);
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
     * 查看API已绑定的APP列表
     * 查询API绑定的APP列表。
     *
     * @param ListAppsBindedToApiV2Request 请求对象
     * @return SyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response>
     */
    public SyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> listAppsBindedToApiV2Invoker(ListAppsBindedToApiV2Request request) {
        return new SyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response>(request, RomaMeta.listAppsBindedToApiV2, hcClient);
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
     * 查看APP下路径冲突的api列表
     * 查询指定APP下路径冲突的api列表。
     *
     * @param ListDuplicateApisForAppV2Request 请求对象
     * @return SyncInvoker<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response>
     */
    public SyncInvoker<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response> listDuplicateApisForAppV2Invoker(ListDuplicateApisForAppV2Request request) {
        return new SyncInvoker<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response>(request, RomaMeta.listDuplicateApisForAppV2, hcClient);
    }

    /**
     * 设置用户成员
     * - 设置应用的用户成员，为空数组时会清空已有应用成员列表 - 设置动作为全量更新非增量更新，应用的成员列表都会替换为当次请求的应用成员列表 
     *
     * @param AddUserToAppRequest 请求对象
     * @return AddUserToAppResponse
     */
    public AddUserToAppResponse addUserToApp(AddUserToAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.addUserToApp);
    }

    /**
     * 设置用户成员
     * - 设置应用的用户成员，为空数组时会清空已有应用成员列表 - 设置动作为全量更新非增量更新，应用的成员列表都会替换为当次请求的应用成员列表 
     *
     * @param AddUserToAppRequest 请求对象
     * @return SyncInvoker<AddUserToAppRequest, AddUserToAppResponse>
     */
    public SyncInvoker<AddUserToAppRequest, AddUserToAppResponse> addUserToAppInvoker(AddUserToAppRequest request) {
        return new SyncInvoker<AddUserToAppRequest, AddUserToAppResponse>(request, RomaMeta.addUserToApp, hcClient);
    }

    /**
     * 查询用户成员列表
     * 查询用户成列表
     *
     * @param CheckAuthUsersOfAppRequest 请求对象
     * @return CheckAuthUsersOfAppResponse
     */
    public CheckAuthUsersOfAppResponse checkAuthUsersOfApp(CheckAuthUsersOfAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkAuthUsersOfApp);
    }

    /**
     * 查询用户成员列表
     * 查询用户成列表
     *
     * @param CheckAuthUsersOfAppRequest 请求对象
     * @return SyncInvoker<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse>
     */
    public SyncInvoker<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse> checkAuthUsersOfAppInvoker(CheckAuthUsersOfAppRequest request) {
        return new SyncInvoker<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse>(request, RomaMeta.checkAuthUsersOfApp, hcClient);
    }

    /**
     * 查询候选用户成员
     * 查询应用的候选用户成员列表,会过滤掉异常状态用户
     *
     * @param CheckCanAuthUsersOfAppRequest 请求对象
     * @return CheckCanAuthUsersOfAppResponse
     */
    public CheckCanAuthUsersOfAppResponse checkCanAuthUsersOfApp(CheckCanAuthUsersOfAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkCanAuthUsersOfApp);
    }

    /**
     * 查询候选用户成员
     * 查询应用的候选用户成员列表,会过滤掉异常状态用户
     *
     * @param CheckCanAuthUsersOfAppRequest 请求对象
     * @return SyncInvoker<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse>
     */
    public SyncInvoker<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse> checkCanAuthUsersOfAppInvoker(CheckCanAuthUsersOfAppRequest request) {
        return new SyncInvoker<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse>(request, RomaMeta.checkCanAuthUsersOfApp, hcClient);
    }

    /**
     * 查询应用详情
     * 查询应用详情
     *
     * @param CheckRomaAppDetailsRequest 请求对象
     * @return CheckRomaAppDetailsResponse
     */
    public CheckRomaAppDetailsResponse checkRomaAppDetails(CheckRomaAppDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkRomaAppDetails);
    }

    /**
     * 查询应用详情
     * 查询应用详情
     *
     * @param CheckRomaAppDetailsRequest 请求对象
     * @return SyncInvoker<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse>
     */
    public SyncInvoker<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse> checkRomaAppDetailsInvoker(CheckRomaAppDetailsRequest request) {
        return new SyncInvoker<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse>(request, RomaMeta.checkRomaAppDetails, hcClient);
    }

    /**
     * 查询应用密钥
     * 查询应用密钥
     *
     * @param CheckRomaAppSecretRequest 请求对象
     * @return CheckRomaAppSecretResponse
     */
    public CheckRomaAppSecretResponse checkRomaAppSecret(CheckRomaAppSecretRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkRomaAppSecret);
    }

    /**
     * 查询应用密钥
     * 查询应用密钥
     *
     * @param CheckRomaAppSecretRequest 请求对象
     * @return SyncInvoker<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse>
     */
    public SyncInvoker<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse> checkRomaAppSecretInvoker(CheckRomaAppSecretRequest request) {
        return new SyncInvoker<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse>(request, RomaMeta.checkRomaAppSecret, hcClient);
    }

    /**
     * 创建应用
     * 创建应用
     *
     * @param CreateRomaAppRequest 请求对象
     * @return CreateRomaAppResponse
     */
    public CreateRomaAppResponse createRomaApp(CreateRomaAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createRomaApp);
    }

    /**
     * 创建应用
     * 创建应用
     *
     * @param CreateRomaAppRequest 请求对象
     * @return SyncInvoker<CreateRomaAppRequest, CreateRomaAppResponse>
     */
    public SyncInvoker<CreateRomaAppRequest, CreateRomaAppResponse> createRomaAppInvoker(CreateRomaAppRequest request) {
        return new SyncInvoker<CreateRomaAppRequest, CreateRomaAppResponse>(request, RomaMeta.createRomaApp, hcClient);
    }

    /**
     * 删除应用
     * 删除单个应用
     *
     * @param DeleteRomaAppRequest 请求对象
     * @return DeleteRomaAppResponse
     */
    public DeleteRomaAppResponse deleteRomaApp(DeleteRomaAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteRomaApp);
    }

    /**
     * 删除应用
     * 删除单个应用
     *
     * @param DeleteRomaAppRequest 请求对象
     * @return SyncInvoker<DeleteRomaAppRequest, DeleteRomaAppResponse>
     */
    public SyncInvoker<DeleteRomaAppRequest, DeleteRomaAppResponse> deleteRomaAppInvoker(DeleteRomaAppRequest request) {
        return new SyncInvoker<DeleteRomaAppRequest, DeleteRomaAppResponse>(request, RomaMeta.deleteRomaApp, hcClient);
    }

    /**
     * 查询应用列表
     * 查询应用列表，支持条件查询，所有条件是并且的关系
     *
     * @param ListRomaAppRequest 请求对象
     * @return ListRomaAppResponse
     */
    public ListRomaAppResponse listRomaApp(ListRomaAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listRomaApp);
    }

    /**
     * 查询应用列表
     * 查询应用列表，支持条件查询，所有条件是并且的关系
     *
     * @param ListRomaAppRequest 请求对象
     * @return SyncInvoker<ListRomaAppRequest, ListRomaAppResponse>
     */
    public SyncInvoker<ListRomaAppRequest, ListRomaAppResponse> listRomaAppInvoker(ListRomaAppRequest request) {
        return new SyncInvoker<ListRomaAppRequest, ListRomaAppResponse>(request, RomaMeta.listRomaApp, hcClient);
    }

    /**
     * 重置应用密钥
     * 重置应用密钥
     *
     * @param ResetRomaAppSecretRequest 请求对象
     * @return ResetRomaAppSecretResponse
     */
    public ResetRomaAppSecretResponse resetRomaAppSecret(ResetRomaAppSecretRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.resetRomaAppSecret);
    }

    /**
     * 重置应用密钥
     * 重置应用密钥
     *
     * @param ResetRomaAppSecretRequest 请求对象
     * @return SyncInvoker<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse>
     */
    public SyncInvoker<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse> resetRomaAppSecretInvoker(ResetRomaAppSecretRequest request) {
        return new SyncInvoker<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse>(request, RomaMeta.resetRomaAppSecret, hcClient);
    }

    /**
     * 更新应用
     * 更新应用
     *
     * @param UpdateRomaAppRequest 请求对象
     * @return UpdateRomaAppResponse
     */
    public UpdateRomaAppResponse updateRomaApp(UpdateRomaAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateRomaApp);
    }

    /**
     * 更新应用
     * 更新应用
     *
     * @param UpdateRomaAppRequest 请求对象
     * @return SyncInvoker<UpdateRomaAppRequest, UpdateRomaAppResponse>
     */
    public SyncInvoker<UpdateRomaAppRequest, UpdateRomaAppResponse> updateRomaAppInvoker(UpdateRomaAppRequest request) {
        return new SyncInvoker<UpdateRomaAppRequest, UpdateRomaAppResponse>(request, RomaMeta.updateRomaApp, hcClient);
    }

    /**
     * 校验应用是否存在
     * 校验指定条件的应用是否存在
     *
     * @param ValidateRomaAppRequest 请求对象
     * @return ValidateRomaAppResponse
     */
    public ValidateRomaAppResponse validateRomaApp(ValidateRomaAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.validateRomaApp);
    }

    /**
     * 校验应用是否存在
     * 校验指定条件的应用是否存在
     *
     * @param ValidateRomaAppRequest 请求对象
     * @return SyncInvoker<ValidateRomaAppRequest, ValidateRomaAppResponse>
     */
    public SyncInvoker<ValidateRomaAppRequest, ValidateRomaAppResponse> validateRomaAppInvoker(ValidateRomaAppRequest request) {
        return new SyncInvoker<ValidateRomaAppRequest, ValidateRomaAppResponse>(request, RomaMeta.validateRomaApp, hcClient);
    }

    /**
     * 查询作业进度
     * 查询作业进度
     *
     * @param CheckAssetJobStatusRequest 请求对象
     * @return CheckAssetJobStatusResponse
     */
    public CheckAssetJobStatusResponse checkAssetJobStatus(CheckAssetJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkAssetJobStatus);
    }

    /**
     * 查询作业进度
     * 查询作业进度
     *
     * @param CheckAssetJobStatusRequest 请求对象
     * @return SyncInvoker<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse>
     */
    public SyncInvoker<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse> checkAssetJobStatusInvoker(CheckAssetJobStatusRequest request) {
        return new SyncInvoker<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse>(request, RomaMeta.checkAssetJobStatus, hcClient);
    }

    /**
     * 查询字典详情
     * 查询字典详情,
     *
     * @param CheckDictionaryRequest 请求对象
     * @return CheckDictionaryResponse
     */
    public CheckDictionaryResponse checkDictionary(CheckDictionaryRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkDictionary);
    }

    /**
     * 查询字典详情
     * 查询字典详情,
     *
     * @param CheckDictionaryRequest 请求对象
     * @return SyncInvoker<CheckDictionaryRequest, CheckDictionaryResponse>
     */
    public SyncInvoker<CheckDictionaryRequest, CheckDictionaryResponse> checkDictionaryInvoker(CheckDictionaryRequest request) {
        return new SyncInvoker<CheckDictionaryRequest, CheckDictionaryResponse>(request, RomaMeta.checkDictionary, hcClient);
    }

    /**
     * 创建字典
     * 创建字典
     *
     * @param CreateDictionaryRequest 请求对象
     * @return CreateDictionaryResponse
     */
    public CreateDictionaryResponse createDictionary(CreateDictionaryRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createDictionary);
    }

    /**
     * 创建字典
     * 创建字典
     *
     * @param CreateDictionaryRequest 请求对象
     * @return SyncInvoker<CreateDictionaryRequest, CreateDictionaryResponse>
     */
    public SyncInvoker<CreateDictionaryRequest, CreateDictionaryResponse> createDictionaryInvoker(CreateDictionaryRequest request) {
        return new SyncInvoker<CreateDictionaryRequest, CreateDictionaryResponse>(request, RomaMeta.createDictionary, hcClient);
    }

    /**
     * 删除字典
     * 删除单个字典，会同时删除该字典的所有子字典
     *
     * @param DeleteDictionaryRequest 请求对象
     * @return DeleteDictionaryResponse
     */
    public DeleteDictionaryResponse deleteDictionary(DeleteDictionaryRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteDictionary);
    }

    /**
     * 删除字典
     * 删除单个字典，会同时删除该字典的所有子字典
     *
     * @param DeleteDictionaryRequest 请求对象
     * @return SyncInvoker<DeleteDictionaryRequest, DeleteDictionaryResponse>
     */
    public SyncInvoker<DeleteDictionaryRequest, DeleteDictionaryResponse> deleteDictionaryInvoker(DeleteDictionaryRequest request) {
        return new SyncInvoker<DeleteDictionaryRequest, DeleteDictionaryResponse>(request, RomaMeta.deleteDictionary, hcClient);
    }

    /**
     * 查询字典列表
     * 查询字典列表
     *
     * @param ListDictionaryRequest 请求对象
     * @return ListDictionaryResponse
     */
    public ListDictionaryResponse listDictionary(ListDictionaryRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDictionary);
    }

    /**
     * 查询字典列表
     * 查询字典列表
     *
     * @param ListDictionaryRequest 请求对象
     * @return SyncInvoker<ListDictionaryRequest, ListDictionaryResponse>
     */
    public SyncInvoker<ListDictionaryRequest, ListDictionaryResponse> listDictionaryInvoker(ListDictionaryRequest request) {
        return new SyncInvoker<ListDictionaryRequest, ListDictionaryResponse>(request, RomaMeta.listDictionary, hcClient);
    }

    /**
     * 更新字典
     * 更新字典
     *
     * @param UpdateDictionaryRequest 请求对象
     * @return UpdateDictionaryResponse
     */
    public UpdateDictionaryResponse updateDictionary(UpdateDictionaryRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateDictionary);
    }

    /**
     * 更新字典
     * 更新字典
     *
     * @param UpdateDictionaryRequest 请求对象
     * @return SyncInvoker<UpdateDictionaryRequest, UpdateDictionaryResponse>
     */
    public SyncInvoker<UpdateDictionaryRequest, UpdateDictionaryResponse> updateDictionaryInvoker(UpdateDictionaryRequest request) {
        return new SyncInvoker<UpdateDictionaryRequest, UpdateDictionaryResponse>(request, RomaMeta.updateDictionary, hcClient);
    }

    /**
     * 校验字典是否存在
     * 校验指定条件的字典是否存在，支持字典名称和字典编码
     *
     * @param ValidateDictionaryRequest 请求对象
     * @return ValidateDictionaryResponse
     */
    public ValidateDictionaryResponse validateDictionary(ValidateDictionaryRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.validateDictionary);
    }

    /**
     * 校验字典是否存在
     * 校验指定条件的字典是否存在，支持字典名称和字典编码
     *
     * @param ValidateDictionaryRequest 请求对象
     * @return SyncInvoker<ValidateDictionaryRequest, ValidateDictionaryResponse>
     */
    public SyncInvoker<ValidateDictionaryRequest, ValidateDictionaryResponse> validateDictionaryInvoker(ValidateDictionaryRequest request) {
        return new SyncInvoker<ValidateDictionaryRequest, ValidateDictionaryResponse>(request, RomaMeta.validateDictionary, hcClient);
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
     * 查询MQS实例列表
     * 查询MQS实例列表。
     *
     * @param ListMqsInstanceRequest 请求对象
     * @return SyncInvoker<ListMqsInstanceRequest, ListMqsInstanceResponse>
     */
    public SyncInvoker<ListMqsInstanceRequest, ListMqsInstanceResponse> listMqsInstanceInvoker(ListMqsInstanceRequest request) {
        return new SyncInvoker<ListMqsInstanceRequest, ListMqsInstanceResponse>(request, RomaMeta.listMqsInstance, hcClient);
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
     * 查询MQS实例详情
     * 查询指定MQS实例详情。
     *
     * @param ShowMqsInstanceRequest 请求对象
     * @return SyncInvoker<ShowMqsInstanceRequest, ShowMqsInstanceResponse>
     */
    public SyncInvoker<ShowMqsInstanceRequest, ShowMqsInstanceResponse> showMqsInstanceInvoker(ShowMqsInstanceRequest request) {
        return new SyncInvoker<ShowMqsInstanceRequest, ShowMqsInstanceResponse>(request, RomaMeta.showMqsInstance, hcClient);
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
     * 导出API
     * 导出分组下API的定义信息，导出文件内容符合swagger标准规范。
     *
     * @param ExportApiDefinitionsV2Request 请求对象
     * @return SyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response>
     */
    public SyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> exportApiDefinitionsV2Invoker(ExportApiDefinitionsV2Request request) {
        return new SyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response>(request, RomaMeta.exportApiDefinitionsV2, hcClient);
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
     * 导出自定义后端API
     * 导出自定义后端API，导出文件内容符合swagger标准规范。
     *
     * @param ExportLiveDataApiDefinitionsV2Request 请求对象
     * @return SyncInvoker<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response>
     */
    public SyncInvoker<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response> exportLiveDataApiDefinitionsV2Invoker(ExportLiveDataApiDefinitionsV2Request request) {
        return new SyncInvoker<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response>(request, RomaMeta.exportLiveDataApiDefinitionsV2, hcClient);
    }

    /**
     * 导入API
     * 导入API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考用户指南的“附录：前端API的Swagger扩展定义”章节。
     *
     * @param ImportApiDefinitionsV2Request 请求对象
     * @return ImportApiDefinitionsV2Response
     */
    public ImportApiDefinitionsV2Response importApiDefinitionsV2(ImportApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.importApiDefinitionsV2);
    }

    /**
     * 导入API
     * 导入API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考用户指南的“附录：前端API的Swagger扩展定义”章节。
     *
     * @param ImportApiDefinitionsV2Request 请求对象
     * @return SyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response>
     */
    public SyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> importApiDefinitionsV2Invoker(ImportApiDefinitionsV2Request request) {
        return new SyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response>(request, RomaMeta.importApiDefinitionsV2, hcClient);
    }

    /**
     * 导入自定义后端API
     * 导入自定义后端API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考用户指南的“附录：后端API的Swagger扩展定义”章节
     *
     * @param ImportLiveDataApiDefinitionsV2Request 请求对象
     * @return ImportLiveDataApiDefinitionsV2Response
     */
    public ImportLiveDataApiDefinitionsV2Response importLiveDataApiDefinitionsV2(ImportLiveDataApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.importLiveDataApiDefinitionsV2);
    }

    /**
     * 导入自定义后端API
     * 导入自定义后端API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考用户指南的“附录：后端API的Swagger扩展定义”章节
     *
     * @param ImportLiveDataApiDefinitionsV2Request 请求对象
     * @return SyncInvoker<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response>
     */
    public SyncInvoker<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response> importLiveDataApiDefinitionsV2Invoker(ImportLiveDataApiDefinitionsV2Request request) {
        return new SyncInvoker<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response>(request, RomaMeta.importLiveDataApiDefinitionsV2, hcClient);
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
     * 添加后端实例
     * 为指定的VPC通道添加弹性云服务器
     *
     * @param AddingBackendInstancesV2Request 请求对象
     * @return SyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response>
     */
    public SyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> addingBackendInstancesV2Invoker(AddingBackendInstancesV2Request request) {
        return new SyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response>(request, RomaMeta.addingBackendInstancesV2, hcClient);
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
     * 创建VPC通道
     * 在ROMA Connect APIC中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便ROMA Connect APIC直接访问私有VPC资源。 &gt; 每个用户最多创建30个VPC通道。
     *
     * @param CreateVpcChannelV2Request 请求对象
     * @return SyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response>
     */
    public SyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response> createVpcChannelV2Invoker(CreateVpcChannelV2Request request) {
        return new SyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response>(request, RomaMeta.createVpcChannelV2, hcClient);
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
     * 删除后端实例
     * 删除指定VPC通道中的弹性云服务器
     *
     * @param DeleteBackendInstanceV2Request 请求对象
     * @return SyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response>
     */
    public SyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> deleteBackendInstanceV2Invoker(DeleteBackendInstanceV2Request request) {
        return new SyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response>(request, RomaMeta.deleteBackendInstanceV2, hcClient);
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
     * 删除VPC通道
     * 删除指定的VPC通道
     *
     * @param DeleteVpcChannelV2Request 请求对象
     * @return SyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response>
     */
    public SyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> deleteVpcChannelV2Invoker(DeleteVpcChannelV2Request request) {
        return new SyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response>(request, RomaMeta.deleteVpcChannelV2, hcClient);
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
     * 查看后端实例列表
     * 查看指定VPC通道的弹性云服务器列表。
     *
     * @param ListBackendInstancesV2Request 请求对象
     * @return SyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response>
     */
    public SyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response> listBackendInstancesV2Invoker(ListBackendInstancesV2Request request) {
        return new SyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response>(request, RomaMeta.listBackendInstancesV2, hcClient);
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
     * 查询VPC通道列表
     * 查看VPC通道列表
     *
     * @param ListVpcChannelsV2Request 请求对象
     * @return SyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response>
     */
    public SyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response> listVpcChannelsV2Invoker(ListVpcChannelsV2Request request) {
        return new SyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response>(request, RomaMeta.listVpcChannelsV2, hcClient);
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
     * 查看VPC通道详情
     * 查看指定的VPC通道详情
     *
     * @param ShowDetailsOfVpcChannelV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response>
     */
    public SyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2Invoker(ShowDetailsOfVpcChannelV2Request request) {
        return new SyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response>(request, RomaMeta.showDetailsOfVpcChannelV2, hcClient);
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

    /**
     * 更新VPC通道
     * 更新指定VPC通道的参数
     *
     * @param UpdateVpcChannelV2Request 请求对象
     * @return SyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response>
     */
    public SyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> updateVpcChannelV2Invoker(UpdateVpcChannelV2Request request) {
        return new SyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response>(request, RomaMeta.updateVpcChannelV2, hcClient);
    }

}