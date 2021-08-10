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

}
