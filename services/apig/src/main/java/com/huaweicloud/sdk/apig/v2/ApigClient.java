package com.huaweicloud.sdk.apig.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.apig.v2.model.*;

public class ApigClient {
    protected HcClient hcClient;

    public ApigClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ApigClient> newBuilder() {
        return new ClientBuilder<>(ApigClient::new);
    }


    /**
     * 绑定域名证书
     * 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。 本章节主要介绍为特定域名绑定证书。
     *
     * @param AssociateCertificateV2Request 请求对象
     * @return AssociateCertificateV2Response
     */
    public AssociateCertificateV2Response associateCertificateV2(AssociateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateCertificateV2);
    }

    /**
     * 绑定域名
     * 用户自定义的域名，需要CNAME到API分组的子域名上才能生效，具体方法请参见[增加CNAME类型记录集](https://support.huaweicloud.com/usermanual-dns/dns_usermanual_0010.html)。 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     *
     * @param AssociateDomainV2Request 请求对象
     * @return AssociateDomainV2Response
     */
    public AssociateDomainV2Response associateDomainV2(AssociateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateDomainV2);
    }

    /**
     * 绑定签名密钥
     * 签名密钥创建后，需要绑定到API才能生效。  将签名密钥绑定到API后，则API网关请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。  将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     *
     * @param AssociateSignatureKeyV2Request 请求对象
     * @return AssociateSignatureKeyV2Response
     */
    public AssociateSignatureKeyV2Response associateSignatureKeyV2(AssociateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateSignatureKeyV2);
    }

    /**
     * 创建环境
     * 在实际的生产中，API提供者可能有多个环境，如开发环境、测试环境、生产环境等，用户可以自由将API发布到某个环境，供调用者调用。  对于不同的环境，API的版本、请求地址甚至于包括请求消息等均有可能不同。如：某个API，v1.0的版本为稳定版本，发布到了生产环境供生产使用，同时，该API正处于迭代中，v1.1的版本是开发人员交付测试人员进行测试的版本，发布在测试环境上，而v1.2的版本目前开发团队正处于开发过程中，可以发布到开发环境进行自测等。  为此，API网关提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接入API网关。
     *
     * @param CreateEnvironmentV2Request 请求对象
     * @return CreateEnvironmentV2Response
     */
    public CreateEnvironmentV2Response createEnvironmentV2(CreateEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createEnvironmentV2);
    }

    /**
     * 新建变量
     * 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。  用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，API网关会将这些变量替换成真实的变量值，以达到不同环境的区分效果。  环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。 &gt; 1.环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量   2.环境变量区分大小写，即变量ABC与变量abc是两个不同的变量   3.设置了环境变量后，使用到该变量的API的调试功能将不可使用。   4.定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     *
     * @param CreateEnvironmentVariableV2Request 请求对象
     * @return CreateEnvironmentVariableV2Response
     */
    public CreateEnvironmentVariableV2Response createEnvironmentVariableV2(CreateEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createEnvironmentVariableV2);
    }

    /**
     * 创建流控策略
     * 当API上线后，系统会默认给每个API提供一个流控策略，API提供者可以根据自身API的服务能力及负载情况变更这个流控策略。 流控策略即限制API在一定长度的时间内，能够允许被访问的最大次数。
     *
     * @param CreateRequestThrottlingPolicyV2Request 请求对象
     * @return CreateRequestThrottlingPolicyV2Response
     */
    public CreateRequestThrottlingPolicyV2Response createRequestThrottlingPolicyV2(CreateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createRequestThrottlingPolicyV2);
    }

    /**
     * 创建签名密钥
     * 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。  其中，签名密钥就是API安全保护机制的一种。  租户创建一个签名密钥，并将签名密钥与API进行绑定，则API网关在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是API网关发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。 
     *
     * @param CreateSignatureKeyV2Request 请求对象
     * @return CreateSignatureKeyV2Response
     */
    public CreateSignatureKeyV2Response createSignatureKeyV2(CreateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createSignatureKeyV2);
    }

    /**
     * 创建特殊设置
     * 流控策略可以限制一段时间内可以访问API的最大次数，也可以限制一段时间内单个租户和单个APP可以访问API的最大次数。  如果想要对某个特定的APP进行特殊设置，例如设置所有APP每分钟的访问次数为500次，但想设置APP1每分钟的访问次数为800次，可以通过在流控策略中设置特殊APP来实现该功能。  为流控策略添加一个特殊设置的对象，可以是APP，也可以是租户。
     *
     * @param CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return CreateSpecialThrottlingConfigurationV2Response
     */
    public CreateSpecialThrottlingConfigurationV2Response createSpecialThrottlingConfigurationV2(CreateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createSpecialThrottlingConfigurationV2);
    }

    /**
     * 删除环境
     * 删除指定的环境。 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。
     *
     * @param DeleteEnvironmentV2Request 请求对象
     * @return DeleteEnvironmentV2Response
     */
    public DeleteEnvironmentV2Response deleteEnvironmentV2(DeleteEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteEnvironmentV2);
    }

    /**
     * 删除变量
     * 删除指定的环境变量。
     *
     * @param DeleteEnvironmentVariableV2Request 请求对象
     * @return DeleteEnvironmentVariableV2Response
     */
    public DeleteEnvironmentVariableV2Response deleteEnvironmentVariableV2(DeleteEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteEnvironmentVariableV2);
    }

    /**
     * 删除流控策略
     * 删除指定的流控策略,以及该流控策略与API的所有绑定关系。
     *
     * @param DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return DeleteRequestThrottlingPolicyV2Response
     */
    public DeleteRequestThrottlingPolicyV2Response deleteRequestThrottlingPolicyV2(DeleteRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteRequestThrottlingPolicyV2);
    }

    /**
     * 删除签名密钥
     * 删除指定的签名密钥,删除签名密钥时，其配置的绑定关系会一并删除，相应的签名密钥会失效。
     *
     * @param DeleteSignatureKeyV2Request 请求对象
     * @return DeleteSignatureKeyV2Response
     */
    public DeleteSignatureKeyV2Response deleteSignatureKeyV2(DeleteSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteSignatureKeyV2);
    }

    /**
     * 删除特殊设置
     * 删除某个流控策略的某个特殊配置。
     *
     * @param DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return DeleteSpecialThrottlingConfigurationV2Response
     */
    public DeleteSpecialThrottlingConfigurationV2Response deleteSpecialThrottlingConfigurationV2(DeleteSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteSpecialThrottlingConfigurationV2);
    }

    /**
     * 删除域名证书
     * 如果域名证书不再需要或者已过期，则可以删除证书内容。
     *
     * @param DisassociateCertificateV2Request 请求对象
     * @return DisassociateCertificateV2Response
     */
    public DisassociateCertificateV2Response disassociateCertificateV2(DisassociateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateCertificateV2);
    }

    /**
     * 解绑域名
     * 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     *
     * @param DisassociateDomainV2Request 请求对象
     * @return DisassociateDomainV2Response
     */
    public DisassociateDomainV2Response disassociateDomainV2(DisassociateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateDomainV2);
    }

    /**
     * 解除绑定
     * 解除API与签名密钥的绑定关系。
     *
     * @param DisassociateSignatureKeyV2Request 请求对象
     * @return DisassociateSignatureKeyV2Response
     */
    public DisassociateSignatureKeyV2Response disassociateSignatureKeyV2(DisassociateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateSignatureKeyV2);
    }

    /**
     * 查询API分组概况
     * 查询租户名下的API分组概况。
     *
     * @param ListApiGroupsQuantitiesV2Request 请求对象
     * @return ListApiGroupsQuantitiesV2Response
     */
    public ListApiGroupsQuantitiesV2Response listApiGroupsQuantitiesV2(ListApiGroupsQuantitiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiGroupsQuantitiesV2);
    }

    /**
     * 查询API概况
     * 查询租户名下的API概况：已发布到RELEASE环境的API个数，未发布到RELEASE环境的API个数。
     *
     * @param ListApiQuantitiesV2Request 请求对象
     * @return ListApiQuantitiesV2Response
     */
    public ListApiQuantitiesV2Response listApiQuantitiesV2(ListApiQuantitiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiQuantitiesV2);
    }

    /**
     * 查看签名密钥绑定的API列表
     * 查询某个签名密钥上已经绑定的API列表。
     *
     * @param ListApisBindedToSignatureKeyV2Request 请求对象
     * @return ListApisBindedToSignatureKeyV2Response
     */
    public ListApisBindedToSignatureKeyV2Response listApisBindedToSignatureKeyV2(ListApisBindedToSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToSignatureKeyV2);
    }

    /**
     * 查看签名密钥未绑定的API列表
     * 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return ListApisNotBoundWithSignatureKeyV2Response
     */
    public ListApisNotBoundWithSignatureKeyV2Response listApisNotBoundWithSignatureKeyV2(ListApisNotBoundWithSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisNotBoundWithSignatureKeyV2);
    }

    /**
     * 查询APP概况
     * 查询租户名下的APP概况：已进行API访问授权的APP个数，未进行API访问授权的APP个数。
     *
     * @param ListAppQuantitiesV2Request 请求对象
     * @return ListAppQuantitiesV2Response
     */
    public ListAppQuantitiesV2Response listAppQuantitiesV2(ListAppQuantitiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppQuantitiesV2);
    }

    /**
     * 查询变量列表
     * 查询分组下的所有环境变量的列表。
     *
     * @param ListEnvironmentVariablesV2Request 请求对象
     * @return ListEnvironmentVariablesV2Response
     */
    public ListEnvironmentVariablesV2Response listEnvironmentVariablesV2(ListEnvironmentVariablesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listEnvironmentVariablesV2);
    }

    /**
     * 查询环境列表
     * 查询符合条件的环境列表。
     *
     * @param ListEnvironmentsV2Request 请求对象
     * @return ListEnvironmentsV2Response
     */
    public ListEnvironmentsV2Response listEnvironmentsV2(ListEnvironmentsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listEnvironmentsV2);
    }

    /**
     * 查询流控策略列表
     * 查询所有流控策略的信息。
     *
     * @param ListRequestThrottlingPolicyV2Request 请求对象
     * @return ListRequestThrottlingPolicyV2Response
     */
    public ListRequestThrottlingPolicyV2Response listRequestThrottlingPolicyV2(ListRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listRequestThrottlingPolicyV2);
    }

    /**
     * 查看API绑定的签名密钥列表
     * 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     *
     * @param ListSignatureKeysBindedToApiV2Request 请求对象
     * @return ListSignatureKeysBindedToApiV2Response
     */
    public ListSignatureKeysBindedToApiV2Response listSignatureKeysBindedToApiV2(ListSignatureKeysBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listSignatureKeysBindedToApiV2);
    }

    /**
     * 查询签名密钥列表
     * 查询所有签名密钥的信息。
     *
     * @param ListSignatureKeysV2Request 请求对象
     * @return ListSignatureKeysV2Response
     */
    public ListSignatureKeysV2Response listSignatureKeysV2(ListSignatureKeysV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listSignatureKeysV2);
    }

    /**
     * 查看特殊设置列表
     * 查看给流控策略设置的特殊配置。
     *
     * @param ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return ListSpecialThrottlingConfigurationsV2Response
     */
    public ListSpecialThrottlingConfigurationsV2Response listSpecialThrottlingConfigurationsV2(ListSpecialThrottlingConfigurationsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listSpecialThrottlingConfigurationsV2);
    }

    /**
     * 查看域名证书
     * 查看域名下绑定的证书详情。
     *
     * @param ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return ShowDetailsOfDomainNameCertificateV2Response
     */
    public ShowDetailsOfDomainNameCertificateV2Response showDetailsOfDomainNameCertificateV2(ShowDetailsOfDomainNameCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfDomainNameCertificateV2);
    }

    /**
     * 查看变量详情
     * 查看指定的环境变量的详情。
     *
     * @param ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return ShowDetailsOfEnvironmentVariableV2Response
     */
    public ShowDetailsOfEnvironmentVariableV2Response showDetailsOfEnvironmentVariableV2(ShowDetailsOfEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfEnvironmentVariableV2);
    }

    /**
     * 查看流控策略详情
     * 查看指定流控策略的详细信息。
     *
     * @param ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return ShowDetailsOfRequestThrottlingPolicyV2Response
     */
    public ShowDetailsOfRequestThrottlingPolicyV2Response showDetailsOfRequestThrottlingPolicyV2(ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfRequestThrottlingPolicyV2);
    }

    /**
     * 修改环境
     * 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     *
     * @param UpdateEnvironmentV2Request 请求对象
     * @return UpdateEnvironmentV2Response
     */
    public UpdateEnvironmentV2Response updateEnvironmentV2(UpdateEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateEnvironmentV2);
    }

    /**
     * 修改流控策略
     * 修改指定流控策略的详细信息。
     *
     * @param UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return UpdateRequestThrottlingPolicyV2Response
     */
    public UpdateRequestThrottlingPolicyV2Response updateRequestThrottlingPolicyV2(UpdateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateRequestThrottlingPolicyV2);
    }

    /**
     * 修改签名密钥
     * 修改指定签名密钥的详细信息。
     *
     * @param UpdateSignatureKeyV2Request 请求对象
     * @return UpdateSignatureKeyV2Response
     */
    public UpdateSignatureKeyV2Response updateSignatureKeyV2(UpdateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateSignatureKeyV2);
    }

    /**
     * 修改特殊设置
     * 修改某个流控策略下的某个特殊设置。
     *
     * @param UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return UpdateSpecialThrottlingConfigurationV2Response
     */
    public UpdateSpecialThrottlingConfigurationV2Response updateSpecialThrottlingConfigurationV2(UpdateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateSpecialThrottlingConfigurationV2);
    }

    /**
     * 绑定流控策略
     * 将流控策略应用于API，则所有对该API的访问将会受到该流控策略的限制。  当一定时间内的访问次数超过流控策略设置的API最大访问次数限制后，后续的访问将会被拒绝，从而能够较好的保护后端API免受异常流量的冲击，保障服务的稳定运行。  为指定的API绑定流控策略，绑定时，需要指定在哪个环境上生效。同一个API发布到不同的环境可以绑定不同的流控策略；一个API在发布到特定环境后只能绑定一个默认的流控策略。
     *
     * @param AssociateRequestThrottlingPolicyV2Request 请求对象
     * @return AssociateRequestThrottlingPolicyV2Response
     */
    public AssociateRequestThrottlingPolicyV2Response associateRequestThrottlingPolicyV2(AssociateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateRequestThrottlingPolicyV2);
    }

    /**
     * 批量解绑流控策略
     * 批量解除API与流控策略的绑定关系
     *
     * @param BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return BatchDisassociateThrottlingPolicyV2Response
     */
    public BatchDisassociateThrottlingPolicyV2Response batchDisassociateThrottlingPolicyV2(BatchDisassociateThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.batchDisassociateThrottlingPolicyV2);
    }

    /**
     * 创建API分组
     * API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。 
     *
     * @param CreateApiGroupV2Request 请求对象
     * @return CreateApiGroupV2Response
     */
    public CreateApiGroupV2Response createApiGroupV2(CreateApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createApiGroupV2);
    }

    /**
     * 注册API
     * 添加一个API，API即一个服务接口，具体的服务能力。  API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了API网关如何去访问真实的后端服务。API的真实后端服务目前支持三种类型：传统的HTTP/HTTPS形式的web后端、函数工作流、MOCK。 
     *
     * @param CreateApiV2Request 请求对象
     * @return CreateApiV2Response
     */
    public CreateApiV2Response createApiV2(CreateApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createApiV2);
    }

    /**
     * 发布或下线API
     * 对API进行发布或下线。  发布操作是将一个指定的API发布到一个指定的环境，API只有发布后，才能够被调用，且只能在该环境上才能被调用。未发布的API无法被调用。  下线操作是将API从某个已发布的环境上下线，下线后，API将无法再被调用。
     *
     * @param CreateOrDeletePublishRecordForApiV2Request 请求对象
     * @return CreateOrDeletePublishRecordForApiV2Response
     */
    public CreateOrDeletePublishRecordForApiV2Response createOrDeletePublishRecordForApiV2(CreateOrDeletePublishRecordForApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createOrDeletePublishRecordForApiV2);
    }

    /**
     * 删除API分组
     * 删除指定的API分组。  删除时，会一并删除直接或间接关联到该分组下的所有资源，包括API、独立域名、SSL证书、上架信息、分组下所有API的授权信息、编排信息、白名单配置、认证增强信息等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     *
     * @param DeleteApiGroupV2Request 请求对象
     * @return DeleteApiGroupV2Response
     */
    public DeleteApiGroupV2Response deleteApiGroupV2(DeleteApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteApiGroupV2);
    }

    /**
     * 删除API
     * 删除指定的API。  删除API时，会删除该API所有相关的资源信息或绑定关系，如API的发布记录，绑定的后端服务，对APP的授权信息等。
     *
     * @param DeleteApiV2Request 请求对象
     * @return DeleteApiV2Response
     */
    public DeleteApiV2Response deleteApiV2(DeleteApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteApiV2);
    }

    /**
     * 解除API与流控策略的绑定关系
     * 解除API与流控策略的绑定关系。
     *
     * @param DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return DisassociateRequestThrottlingPolicyV2Response
     */
    public DisassociateRequestThrottlingPolicyV2Response disassociateRequestThrottlingPolicyV2(DisassociateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateRequestThrottlingPolicyV2);
    }

    /**
     * 查询分组列表
     * 查询API分组列表。  如果是租户操作，则查询该租户下所有的分组；如果是管理员操作，则查询的是所有租户的分组。
     *
     * @param ListApiGroupsV2Request 请求对象
     * @return ListApiGroupsV2Response
     */
    public ListApiGroupsV2Response listApiGroupsV2(ListApiGroupsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiGroupsV2);
    }

    /**
     * 查看流控策略绑定的API列表
     * 查询某个流控策略上已经绑定的API列表。
     *
     * @param ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return ListApisBindedToRequestThrottlingPolicyV2Response
     */
    public ListApisBindedToRequestThrottlingPolicyV2Response listApisBindedToRequestThrottlingPolicyV2(ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToRequestThrottlingPolicyV2);
    }

    /**
     * 查看流控策略未绑定的API列表
     * 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     *
     * @param ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return ListApisUnbindedToRequestThrottlingPolicyV2Response
     */
    public ListApisUnbindedToRequestThrottlingPolicyV2Response listApisUnbindedToRequestThrottlingPolicyV2(ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisUnbindedToRequestThrottlingPolicyV2);
    }

    /**
     * 查询API列表
     * 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息。
     *
     * @param ListApisV2Request 请求对象
     * @return ListApisV2Response
     */
    public ListApisV2Response listApisV2(ListApisV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisV2);
    }

    /**
     * 查看API绑定的流控策略列表
     * 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     *
     * @param ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return ListRequestThrottlingPoliciesBindedToApiV2Response
     */
    public ListRequestThrottlingPoliciesBindedToApiV2Response listRequestThrottlingPoliciesBindedToApiV2(ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listRequestThrottlingPoliciesBindedToApiV2);
    }

    /**
     * 查询分组详情
     * 查询指定分组的详细信息。
     *
     * @param ShowDetailsOfApiGroupV2Request 请求对象
     * @return ShowDetailsOfApiGroupV2Response
     */
    public ShowDetailsOfApiGroupV2Response showDetailsOfApiGroupV2(ShowDetailsOfApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfApiGroupV2);
    }

    /**
     * 查询API详情
     * 查看指定的API的详细信息。
     *
     * @param ShowDetailsOfApiV2Request 请求对象
     * @return ShowDetailsOfApiV2Response
     */
    public ShowDetailsOfApiV2Response showDetailsOfApiV2(ShowDetailsOfApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfApiV2);
    }

    /**
     * 修改API分组
     * 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     *
     * @param UpdateApiGroupV2Request 请求对象
     * @return UpdateApiGroupV2Response
     */
    public UpdateApiGroupV2Response updateApiGroupV2(UpdateApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateApiGroupV2);
    }

    /**
     * 修改API
     * 修改指定API的信息，包括后端服务信息。
     *
     * @param UpdateApiV2Request 请求对象
     * @return UpdateApiV2Response
     */
    public UpdateApiV2Response updateApiV2(UpdateApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateApiV2);
    }

    /**
     * 解除授权
     * 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     *
     * @param CancelingAuthorizationV2Request 请求对象
     * @return CancelingAuthorizationV2Response
     */
    public CancelingAuthorizationV2Response cancelingAuthorizationV2(CancelingAuthorizationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.cancelingAuthorizationV2);
    }

    /**
     * 校验APP
     * 校验app是否存在，非APP所有者可以调用该接口校验APP是否真实存在。这个接口只展示app的基本信息id 、name、 remark，其他信息不显示。
     *
     * @param CheckAppV2Request 请求对象
     * @return CheckAppV2Response
     */
    public CheckAppV2Response checkAppV2(CheckAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.checkAppV2);
    }

    /**
     * 创建APP
     * APP即应用，是一个可以访问API的身份标识。将API授权给APP后，APP即可调用API。 创建一个APP。
     *
     * @param CreateAnAppV2Request 请求对象
     * @return CreateAnAppV2Response
     */
    public CreateAnAppV2Response createAnAppV2(CreateAnAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createAnAppV2);
    }

    /**
     * APP授权
     * APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。 
     *
     * @param CreateAuthorizingAppsV2Request 请求对象
     * @return CreateAuthorizingAppsV2Response
     */
    public CreateAuthorizingAppsV2Response createAuthorizingAppsV2(CreateAuthorizingAppsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createAuthorizingAppsV2);
    }

    /**
     * 删除APP
     * 删除指定的APP。 APP删除后，将无法再调用任何API；其中，云市场自动创建的APP无法被删除。
     *
     * @param DeleteAppV2Request 请求对象
     * @return DeleteAppV2Response
     */
    public DeleteAppV2Response deleteAppV2(DeleteAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteAppV2);
    }

    /**
     * 查看APP已绑定的API列表
     * 查询APP已经绑定的API列表。
     *
     * @param ListApisBindedToAppV2Request 请求对象
     * @return ListApisBindedToAppV2Response
     */
    public ListApisBindedToAppV2Response listApisBindedToAppV2(ListApisBindedToAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToAppV2);
    }

    /**
     * 查看APP未绑定的API列表
     * 查询指定环境上某个APP未绑定的API列表，包括自有API和从云市场购买的API。
     *
     * @param ListApisUnbindedToAppV2Request 请求对象
     * @return ListApisUnbindedToAppV2Response
     */
    public ListApisUnbindedToAppV2Response listApisUnbindedToAppV2(ListApisUnbindedToAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisUnbindedToAppV2);
    }

    /**
     * 查看API已绑定的APP列表
     * 查询API绑定的APP列表。
     *
     * @param ListAppsBindedToApiV2Request 请求对象
     * @return ListAppsBindedToApiV2Response
     */
    public ListAppsBindedToApiV2Response listAppsBindedToApiV2(ListAppsBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppsBindedToApiV2);
    }

    /**
     * 查询APP列表
     * 查询APP列表。
     *
     * @param ListAppsV2Request 请求对象
     * @return ListAppsV2Response
     */
    public ListAppsV2Response listAppsV2(ListAppsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppsV2);
    }

    /**
     * 重置密钥
     * 重置指定APP的密钥。
     *
     * @param ResettingAppSecretV2Request 请求对象
     * @return ResettingAppSecretV2Response
     */
    public ResettingAppSecretV2Response resettingAppSecretV2(ResettingAppSecretV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.resettingAppSecretV2);
    }

    /**
     * 查看APP详情
     * 查看指定APP的详细信息。
     *
     * @param ShowDetailsOfAppV2Request 请求对象
     * @return ShowDetailsOfAppV2Response
     */
    public ShowDetailsOfAppV2Response showDetailsOfAppV2(ShowDetailsOfAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfAppV2);
    }

    /**
     * 修改APP
     * 修改指定APP的信息。其中可修改的属性为：name、remark，当支持用户自定义key和secret的开关开启时，app_key和app_secret也支持修改，其它属性不可修改。
     *
     * @param UpdateAppV2Request 请求对象
     * @return UpdateAppV2Response
     */
    public UpdateAppV2Response updateAppV2(UpdateAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateAppV2);
    }

}