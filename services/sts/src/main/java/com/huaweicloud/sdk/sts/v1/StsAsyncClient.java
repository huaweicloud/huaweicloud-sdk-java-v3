package com.huaweicloud.sdk.sts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyRequest;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyResponse;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyWithOIDCRequest;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyWithOIDCResponse;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyWithSAMLRequest;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyWithSAMLResponse;
import com.huaweicloud.sdk.sts.v1.model.DecodeAuthorizationMessageRequest;
import com.huaweicloud.sdk.sts.v1.model.DecodeAuthorizationMessageResponse;
import com.huaweicloud.sdk.sts.v1.model.GetCallerIdentityRequest;
import com.huaweicloud.sdk.sts.v1.model.GetCallerIdentityResponse;

import java.util.concurrent.CompletableFuture;

public class StsAsyncClient {

    protected HcClient hcClient;

    public StsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<StsAsyncClient> newBuilder() {
        ClientBuilder<StsAsyncClient> clientBuilder = new ClientBuilder<>(StsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 通过委托或者信任委托获取临时安全凭证
     *
     * 通过委托或者信任委托获取临时安全凭证，临时安全凭证可用于对云资源发起访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssumeAgencyRequest 请求对象
     * @return CompletableFuture<AssumeAgencyResponse>
     */
    public CompletableFuture<AssumeAgencyResponse> assumeAgencyAsync(AssumeAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, StsMeta.assumeAgency);
    }

    /**
     * 通过委托或者信任委托获取临时安全凭证
     *
     * 通过委托或者信任委托获取临时安全凭证，临时安全凭证可用于对云资源发起访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssumeAgencyRequest 请求对象
     * @return AsyncInvoker<AssumeAgencyRequest, AssumeAgencyResponse>
     */
    public AsyncInvoker<AssumeAgencyRequest, AssumeAgencyResponse> assumeAgencyAsyncInvoker(
        AssumeAgencyRequest request) {
        return new AsyncInvoker<>(request, StsMeta.assumeAgency, hcClient);
    }

    /**
     * 通过使用OIDC协议SSO的信任委托获取临时安全凭证
     *
     * 为通过 OIDC 身份提供商令牌验证的用户返回一组临时安全凭证。此操作提供了一种机制，可以让外部的任何兼容 OIDC 身份提供商使用信任委托的临时安全凭证华为云访问，而无需使用 IAM 用户的凭证。
     * 
     * **会话持续时间：**
     * 默认情况下，通过 AssumeAgencyWithOIDC 创建的临时安全凭证有效期为一小时。您可以使用可选的 duration_seconds 参数来指定会话的持续时间，duration_seconds 取值范围是从 900 秒（15 分钟）到该信任委托设置的最大会话持续时长，最大会话持续时长的取值范围可以从 1 小时到 12 小时。注意：委托链会将您的会话持续时间限制为最多一小时，当您使用 AssumeAgency API 操作来进行委托链的切换时，如果您提供了大于一小时的 duration_seconds 参数值，该操作将会失败。
     * 
     * **权限：**
     * 调用 AssumeAgencyWithOIDC 不需要使用华为云凭证。调用者的身份是通过使用您 JWKS 端点中的公钥进行验证的。
     * 您可以使用 policy 和 policy_ids 参数传递自定义策略和已有的身份策略来限制本次会话获得的临时安全凭证的权限范围，最终获得临时安全凭证的权限是 policy 和 policy_ids 与信任委托身上附加的身份策略的交集。
     * 
     * **标签：**
     * 在信任委托的信任策略中添加了 sts::tagSession 授权项时，您可以配置您的身份提供商，将属性作为会话标签传递到您的 ID Token 中。每个会话标签由一个键（Key）和一个值（Value）组成。您最多可以传递 20 个会话标签。纯文本形式的会话标签键不得超过 128 个字符，值不得超过 255 个字符。您也可以传递与信任委托身上标签同名的会话标签，此时会话标签会覆盖具有相同键的信任委托标签。您可以将会话标签设置为可传递的 (Transitive)，可传递的会话标签在角色链期间会持续保留。
     * 
     * **身份：**
     * 在您的应用程序可以调用 AssumeAgencyWithOIDC 之前，您必须使用您的账号在 IAM 中创建 OIDC 提供商和信任委托，并在信任委托的信任策略中指定该 OIDC 提供商，然后还需要配置您的 OIDC 身份提供商以颁发 IAM 所需的 ID Token。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssumeAgencyWithOIDCRequest 请求对象
     * @return CompletableFuture<AssumeAgencyWithOIDCResponse>
     */
    public CompletableFuture<AssumeAgencyWithOIDCResponse> assumeAgencyWithOIDCAsync(
        AssumeAgencyWithOIDCRequest request) {
        return hcClient.asyncInvokeHttp(request, StsMeta.assumeAgencyWithOIDC);
    }

    /**
     * 通过使用OIDC协议SSO的信任委托获取临时安全凭证
     *
     * 为通过 OIDC 身份提供商令牌验证的用户返回一组临时安全凭证。此操作提供了一种机制，可以让外部的任何兼容 OIDC 身份提供商使用信任委托的临时安全凭证华为云访问，而无需使用 IAM 用户的凭证。
     * 
     * **会话持续时间：**
     * 默认情况下，通过 AssumeAgencyWithOIDC 创建的临时安全凭证有效期为一小时。您可以使用可选的 duration_seconds 参数来指定会话的持续时间，duration_seconds 取值范围是从 900 秒（15 分钟）到该信任委托设置的最大会话持续时长，最大会话持续时长的取值范围可以从 1 小时到 12 小时。注意：委托链会将您的会话持续时间限制为最多一小时，当您使用 AssumeAgency API 操作来进行委托链的切换时，如果您提供了大于一小时的 duration_seconds 参数值，该操作将会失败。
     * 
     * **权限：**
     * 调用 AssumeAgencyWithOIDC 不需要使用华为云凭证。调用者的身份是通过使用您 JWKS 端点中的公钥进行验证的。
     * 您可以使用 policy 和 policy_ids 参数传递自定义策略和已有的身份策略来限制本次会话获得的临时安全凭证的权限范围，最终获得临时安全凭证的权限是 policy 和 policy_ids 与信任委托身上附加的身份策略的交集。
     * 
     * **标签：**
     * 在信任委托的信任策略中添加了 sts::tagSession 授权项时，您可以配置您的身份提供商，将属性作为会话标签传递到您的 ID Token 中。每个会话标签由一个键（Key）和一个值（Value）组成。您最多可以传递 20 个会话标签。纯文本形式的会话标签键不得超过 128 个字符，值不得超过 255 个字符。您也可以传递与信任委托身上标签同名的会话标签，此时会话标签会覆盖具有相同键的信任委托标签。您可以将会话标签设置为可传递的 (Transitive)，可传递的会话标签在角色链期间会持续保留。
     * 
     * **身份：**
     * 在您的应用程序可以调用 AssumeAgencyWithOIDC 之前，您必须使用您的账号在 IAM 中创建 OIDC 提供商和信任委托，并在信任委托的信任策略中指定该 OIDC 提供商，然后还需要配置您的 OIDC 身份提供商以颁发 IAM 所需的 ID Token。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssumeAgencyWithOIDCRequest 请求对象
     * @return AsyncInvoker<AssumeAgencyWithOIDCRequest, AssumeAgencyWithOIDCResponse>
     */
    public AsyncInvoker<AssumeAgencyWithOIDCRequest, AssumeAgencyWithOIDCResponse> assumeAgencyWithOIDCAsyncInvoker(
        AssumeAgencyWithOIDCRequest request) {
        return new AsyncInvoker<>(request, StsMeta.assumeAgencyWithOIDC, hcClient);
    }

    /**
     * 通过使用SAML协议SSO的信任委托获取临时安全凭证
     *
     * 为通过 SAML 身份验证响应（SAML Authentication Response）验证的用户返回一组临时安全凭证。此操作提供了一种机制，可以让外部的 SAML 身份提供商使用信任委托的临时安全凭证华为云访问，而无需使用 IAM 用户的凭证。
     * 
     * **会话持续时间：**
     * 默认情况下，通过 AssumeAgencyWithSAML 创建的临时安全凭证有效期为一小时。您可以使用可选的 duration_seconds 参数或者 SAML 身份验证响应中 SessionNotOnOrAfter 值和 SessionDuration 值来指定会话的持续时间，最终的会话持续时间以三者中较短的一个为准，且会话的持续时间不能超过委托设置的最大会话时长限制。duration_seconds 取值范围是从 900 秒（15 分钟）到该信任委托设置的最大会话持续时长，最大会话持续时长的取值范围可以从 1 小时到 12 小时。注意：委托链会将您的会话持续时间限制为最多一小时，当您使用 AssumeAgency API 操作来进行委托链的切换时，如果您提供了大于一小时的 duration_seconds 参数值，该操作将会失败。
     * 
     * **权限：**
     * 调用 AssumeAgencyWithSAML 不需要使用华为云凭证。调用者的身份是通过使用您上传的 SAML 提供商元数据文档中的密钥进行验证的。
     * 您可以使用 policy 和 policy_ids 参数传递自定义策略和已有的身份策略来限制本次会话获得的临时安全凭证的权限范围，最终获得临时安全凭证的权限是 policy 和 policy_ids 与信任委托身上附加的身份策略的交集。
     * 
     * **标签：**
     * 在信任委托的信任策略中添加了 sts::tagSession 授权项时，您可以配置您的身份提供商，将属性作为会话标签 (Session Tags) 传递到 SAML 断言中。每个会话标签由一个键（Key）和一个值（Value）组成。您最多可以传递 20 个会话标签。纯文本形式的会话标签键不得超过 128 个字符，值不得超过 255 个字符。您也可以传递与信任委托身上标签同名的会话标签，此时会话标签会覆盖具有相同键的信任委托标签。您可以将会话标签设置为可传递的 (Transitive)，可传递的会话标签在角色链期间会持续保留。
     * 
     * **SAML 配置：**
     * 在您的应用程序调用 AssumeAgencyWithSAML 之前，您必须使用您的账号在 IAM 中创建 SAML 提供商和信任委托，并在信任委托的信任策略中指定该 SAML 提供商，然后还需要配置您的 SAML 身份提供商以发布 IAM 所需的声明 (Claims)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssumeAgencyWithSAMLRequest 请求对象
     * @return CompletableFuture<AssumeAgencyWithSAMLResponse>
     */
    public CompletableFuture<AssumeAgencyWithSAMLResponse> assumeAgencyWithSAMLAsync(
        AssumeAgencyWithSAMLRequest request) {
        return hcClient.asyncInvokeHttp(request, StsMeta.assumeAgencyWithSAML);
    }

    /**
     * 通过使用SAML协议SSO的信任委托获取临时安全凭证
     *
     * 为通过 SAML 身份验证响应（SAML Authentication Response）验证的用户返回一组临时安全凭证。此操作提供了一种机制，可以让外部的 SAML 身份提供商使用信任委托的临时安全凭证华为云访问，而无需使用 IAM 用户的凭证。
     * 
     * **会话持续时间：**
     * 默认情况下，通过 AssumeAgencyWithSAML 创建的临时安全凭证有效期为一小时。您可以使用可选的 duration_seconds 参数或者 SAML 身份验证响应中 SessionNotOnOrAfter 值和 SessionDuration 值来指定会话的持续时间，最终的会话持续时间以三者中较短的一个为准，且会话的持续时间不能超过委托设置的最大会话时长限制。duration_seconds 取值范围是从 900 秒（15 分钟）到该信任委托设置的最大会话持续时长，最大会话持续时长的取值范围可以从 1 小时到 12 小时。注意：委托链会将您的会话持续时间限制为最多一小时，当您使用 AssumeAgency API 操作来进行委托链的切换时，如果您提供了大于一小时的 duration_seconds 参数值，该操作将会失败。
     * 
     * **权限：**
     * 调用 AssumeAgencyWithSAML 不需要使用华为云凭证。调用者的身份是通过使用您上传的 SAML 提供商元数据文档中的密钥进行验证的。
     * 您可以使用 policy 和 policy_ids 参数传递自定义策略和已有的身份策略来限制本次会话获得的临时安全凭证的权限范围，最终获得临时安全凭证的权限是 policy 和 policy_ids 与信任委托身上附加的身份策略的交集。
     * 
     * **标签：**
     * 在信任委托的信任策略中添加了 sts::tagSession 授权项时，您可以配置您的身份提供商，将属性作为会话标签 (Session Tags) 传递到 SAML 断言中。每个会话标签由一个键（Key）和一个值（Value）组成。您最多可以传递 20 个会话标签。纯文本形式的会话标签键不得超过 128 个字符，值不得超过 255 个字符。您也可以传递与信任委托身上标签同名的会话标签，此时会话标签会覆盖具有相同键的信任委托标签。您可以将会话标签设置为可传递的 (Transitive)，可传递的会话标签在角色链期间会持续保留。
     * 
     * **SAML 配置：**
     * 在您的应用程序调用 AssumeAgencyWithSAML 之前，您必须使用您的账号在 IAM 中创建 SAML 提供商和信任委托，并在信任委托的信任策略中指定该 SAML 提供商，然后还需要配置您的 SAML 身份提供商以发布 IAM 所需的声明 (Claims)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssumeAgencyWithSAMLRequest 请求对象
     * @return AsyncInvoker<AssumeAgencyWithSAMLRequest, AssumeAgencyWithSAMLResponse>
     */
    public AsyncInvoker<AssumeAgencyWithSAMLRequest, AssumeAgencyWithSAMLResponse> assumeAgencyWithSAMLAsyncInvoker(
        AssumeAgencyWithSAMLRequest request) {
        return new AsyncInvoker<>(request, StsMeta.assumeAgencyWithSAML, hcClient);
    }

    /**
     * 解密鉴权失败的原因
     *
     * 解密鉴权失败的原因。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DecodeAuthorizationMessageRequest 请求对象
     * @return CompletableFuture<DecodeAuthorizationMessageResponse>
     */
    public CompletableFuture<DecodeAuthorizationMessageResponse> decodeAuthorizationMessageAsync(
        DecodeAuthorizationMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, StsMeta.decodeAuthorizationMessage);
    }

    /**
     * 解密鉴权失败的原因
     *
     * 解密鉴权失败的原因。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DecodeAuthorizationMessageRequest 请求对象
     * @return AsyncInvoker<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResponse>
     */
    public AsyncInvoker<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResponse> decodeAuthorizationMessageAsyncInvoker(
        DecodeAuthorizationMessageRequest request) {
        return new AsyncInvoker<>(request, StsMeta.decodeAuthorizationMessage, hcClient);
    }

    /**
     * 获取调用者身份信息
     *
     * 获取调用者（用户，委托等）身份信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCallerIdentityRequest 请求对象
     * @return CompletableFuture<GetCallerIdentityResponse>
     */
    public CompletableFuture<GetCallerIdentityResponse> getCallerIdentityAsync(GetCallerIdentityRequest request) {
        return hcClient.asyncInvokeHttp(request, StsMeta.getCallerIdentity);
    }

    /**
     * 获取调用者身份信息
     *
     * 获取调用者（用户，委托等）身份信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCallerIdentityRequest 请求对象
     * @return AsyncInvoker<GetCallerIdentityRequest, GetCallerIdentityResponse>
     */
    public AsyncInvoker<GetCallerIdentityRequest, GetCallerIdentityResponse> getCallerIdentityAsyncInvoker(
        GetCallerIdentityRequest request) {
        return new AsyncInvoker<>(request, StsMeta.getCallerIdentity, hcClient);
    }

}
