package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.iam.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class IamAsyncClient {

    protected HcClient hcClient;

    public IamAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IamAsyncClient> newBuilder() {
        return new ClientBuilder<>(IamAsyncClient::new, "GlobalCredentials,BasicCredentials");
    }

    /** 为委托授予所有项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予所有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithAllProjectsPermissionRequest 请求对象
     * @return CompletableFuture<AssociateAgencyWithAllProjectsPermissionResponse> */
    public CompletableFuture<AssociateAgencyWithAllProjectsPermissionResponse> associateAgencyWithAllProjectsPermissionAsync(
        AssociateAgencyWithAllProjectsPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.associateAgencyWithAllProjectsPermission);
    }

    /** 为委托授予所有项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予所有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithAllProjectsPermissionRequest 请求对象
     * @return AsyncInvoker<AssociateAgencyWithAllProjectsPermissionRequest,
     *         AssociateAgencyWithAllProjectsPermissionResponse> */
    public AsyncInvoker<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse> associateAgencyWithAllProjectsPermissionAsyncInvoker(
        AssociateAgencyWithAllProjectsPermissionRequest request) {
        return new AsyncInvoker<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse>(
            request, IamMeta.associateAgencyWithAllProjectsPermission, hcClient);
    }

    /** 为委托授予全局服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予全局服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithDomainPermissionRequest 请求对象
     * @return CompletableFuture<AssociateAgencyWithDomainPermissionResponse> */
    public CompletableFuture<AssociateAgencyWithDomainPermissionResponse> associateAgencyWithDomainPermissionAsync(
        AssociateAgencyWithDomainPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.associateAgencyWithDomainPermission);
    }

    /** 为委托授予全局服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予全局服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithDomainPermissionRequest 请求对象
     * @return AsyncInvoker<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> */
    public AsyncInvoker<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> associateAgencyWithDomainPermissionAsyncInvoker(
        AssociateAgencyWithDomainPermissionRequest request) {
        return new AsyncInvoker<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse>(
            request, IamMeta.associateAgencyWithDomainPermission, hcClient);
    }

    /** 为委托授予项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithProjectPermissionRequest 请求对象
     * @return CompletableFuture<AssociateAgencyWithProjectPermissionResponse> */
    public CompletableFuture<AssociateAgencyWithProjectPermissionResponse> associateAgencyWithProjectPermissionAsync(
        AssociateAgencyWithProjectPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.associateAgencyWithProjectPermission);
    }

    /** 为委托授予项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithProjectPermissionRequest 请求对象
     * @return AsyncInvoker<AssociateAgencyWithProjectPermissionRequest,
     *         AssociateAgencyWithProjectPermissionResponse> */
    public AsyncInvoker<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse> associateAgencyWithProjectPermissionAsyncInvoker(
        AssociateAgencyWithProjectPermissionRequest request) {
        return new AsyncInvoker<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse>(
            request, IamMeta.associateAgencyWithProjectPermission, hcClient);
    }

    /** 检查委托下是否具有所有项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)检查委托是否具有所有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckAllProjectsPermissionForAgencyRequest 请求对象
     * @return CompletableFuture<CheckAllProjectsPermissionForAgencyResponse> */
    public CompletableFuture<CheckAllProjectsPermissionForAgencyResponse> checkAllProjectsPermissionForAgencyAsync(
        CheckAllProjectsPermissionForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.checkAllProjectsPermissionForAgency);
    }

    /** 检查委托下是否具有所有项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)检查委托是否具有所有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckAllProjectsPermissionForAgencyRequest 请求对象
     * @return AsyncInvoker<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> */
    public AsyncInvoker<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> checkAllProjectsPermissionForAgencyAsyncInvoker(
        CheckAllProjectsPermissionForAgencyRequest request) {
        return new AsyncInvoker<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse>(
            request, IamMeta.checkAllProjectsPermissionForAgency, hcClient);
    }

    /** 查询委托是否拥有全局服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有全局服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckDomainPermissionForAgencyRequest 请求对象
     * @return CompletableFuture<CheckDomainPermissionForAgencyResponse> */
    public CompletableFuture<CheckDomainPermissionForAgencyResponse> checkDomainPermissionForAgencyAsync(
        CheckDomainPermissionForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.checkDomainPermissionForAgency);
    }

    /** 查询委托是否拥有全局服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有全局服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckDomainPermissionForAgencyRequest 请求对象
     * @return AsyncInvoker<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> */
    public AsyncInvoker<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> checkDomainPermissionForAgencyAsyncInvoker(
        CheckDomainPermissionForAgencyRequest request) {
        return new AsyncInvoker<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse>(request,
            IamMeta.checkDomainPermissionForAgency, hcClient);
    }

    /** 查询委托是否拥有项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckProjectPermissionForAgencyRequest 请求对象
     * @return CompletableFuture<CheckProjectPermissionForAgencyResponse> */
    public CompletableFuture<CheckProjectPermissionForAgencyResponse> checkProjectPermissionForAgencyAsync(
        CheckProjectPermissionForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.checkProjectPermissionForAgency);
    }

    /** 查询委托是否拥有项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckProjectPermissionForAgencyRequest 请求对象
     * @return AsyncInvoker<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> */
    public AsyncInvoker<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> checkProjectPermissionForAgencyAsyncInvoker(
        CheckProjectPermissionForAgencyRequest request) {
        return new AsyncInvoker<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse>(
            request, IamMeta.checkProjectPermissionForAgency, hcClient);
    }

    /** 创建委托 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateAgencyRequest 请求对象
     * @return CompletableFuture<CreateAgencyResponse> */
    public CompletableFuture<CreateAgencyResponse> createAgencyAsync(CreateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createAgency);
    }

    /** 创建委托 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateAgencyRequest 请求对象
     * @return AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse> */
    public AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyAsyncInvoker(
        CreateAgencyRequest request) {
        return new AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse>(request, IamMeta.createAgency, hcClient);
    }

    /** 创建委托自定义策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托自定义策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateAgencyCustomPolicyRequest 请求对象
     * @return CompletableFuture<CreateAgencyCustomPolicyResponse> */
    public CompletableFuture<CreateAgencyCustomPolicyResponse> createAgencyCustomPolicyAsync(
        CreateAgencyCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createAgencyCustomPolicy);
    }

    /** 创建委托自定义策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托自定义策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateAgencyCustomPolicyRequest 请求对象
     * @return AsyncInvoker<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> */
    public AsyncInvoker<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> createAgencyCustomPolicyAsyncInvoker(
        CreateAgencyCustomPolicyRequest request) {
        return new AsyncInvoker<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse>(request,
            IamMeta.createAgencyCustomPolicy, hcClient);
    }

    /** 创建云服务自定义策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建云服务自定义策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateCloudServiceCustomPolicyRequest 请求对象
     * @return CompletableFuture<CreateCloudServiceCustomPolicyResponse> */
    public CompletableFuture<CreateCloudServiceCustomPolicyResponse> createCloudServiceCustomPolicyAsync(
        CreateCloudServiceCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createCloudServiceCustomPolicy);
    }

    /** 创建云服务自定义策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建云服务自定义策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateCloudServiceCustomPolicyRequest 请求对象
     * @return AsyncInvoker<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> */
    public AsyncInvoker<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> createCloudServiceCustomPolicyAsyncInvoker(
        CreateCloudServiceCustomPolicyRequest request) {
        return new AsyncInvoker<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse>(request,
            IamMeta.createCloudServiceCustomPolicy, hcClient);
    }

    /** 获取自定义代理登录票据
     * 该接口用于用于获取自定义代理登录票据logintoken。logintoken是系统颁发给自定义代理用户的登录票据，承载用户的身份、session等信息。调用自定义代理URL登录云服务控制台时，可以使用本接口获取的logintoken进行认证。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - logintoken的有效期为10分钟。
     *
     * @param CreateLoginTokenRequest 请求对象
     * @return CompletableFuture<CreateLoginTokenResponse> */
    public CompletableFuture<CreateLoginTokenResponse> createLoginTokenAsync(CreateLoginTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createLoginToken);
    }

    /** 获取自定义代理登录票据
     * 该接口用于用于获取自定义代理登录票据logintoken。logintoken是系统颁发给自定义代理用户的登录票据，承载用户的身份、session等信息。调用自定义代理URL登录云服务控制台时，可以使用本接口获取的logintoken进行认证。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - logintoken的有效期为10分钟。
     *
     * @param CreateLoginTokenRequest 请求对象
     * @return AsyncInvoker<CreateLoginTokenRequest, CreateLoginTokenResponse> */
    public AsyncInvoker<CreateLoginTokenRequest, CreateLoginTokenResponse> createLoginTokenAsyncInvoker(
        CreateLoginTokenRequest request) {
        return new AsyncInvoker<CreateLoginTokenRequest, CreateLoginTokenResponse>(request, IamMeta.createLoginToken,
            hcClient);
    }

    /** 导入Metadata文件 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)导入Metadata文件。
     * 账号在使用联邦认证功能前，需要先将Metadata文件导入到IAM中。Metadata文件是SAML 2.0协议约定的接口文件，包含访问接口地址和证书信息，请找企业管理员获取企业IdP的Metadata文件。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateMetadataRequest 请求对象
     * @return CompletableFuture<CreateMetadataResponse> */
    public CompletableFuture<CreateMetadataResponse> createMetadataAsync(CreateMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createMetadata);
    }

    /** 导入Metadata文件 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)导入Metadata文件。
     * 账号在使用联邦认证功能前，需要先将Metadata文件导入到IAM中。Metadata文件是SAML 2.0协议约定的接口文件，包含访问接口地址和证书信息，请找企业管理员获取企业IdP的Metadata文件。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateMetadataRequest 请求对象
     * @return AsyncInvoker<CreateMetadataRequest, CreateMetadataResponse> */
    public AsyncInvoker<CreateMetadataRequest, CreateMetadataResponse> createMetadataAsyncInvoker(
        CreateMetadataRequest request) {
        return new AsyncInvoker<CreateMetadataRequest, CreateMetadataResponse>(request, IamMeta.createMetadata,
            hcClient);
    }

    /** 创建OpenId Connect身份提供商配置 创建OpenId Connect身份提供商配置
     *
     * @param CreateOpenIdConnectConfigRequest 请求对象
     * @return CompletableFuture<CreateOpenIdConnectConfigResponse> */
    public CompletableFuture<CreateOpenIdConnectConfigResponse> createOpenIdConnectConfigAsync(
        CreateOpenIdConnectConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createOpenIdConnectConfig);
    }

    /** 创建OpenId Connect身份提供商配置 创建OpenId Connect身份提供商配置
     *
     * @param CreateOpenIdConnectConfigRequest 请求对象
     * @return AsyncInvoker<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse> */
    public AsyncInvoker<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse> createOpenIdConnectConfigAsyncInvoker(
        CreateOpenIdConnectConfigRequest request) {
        return new AsyncInvoker<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse>(request,
            IamMeta.createOpenIdConnectConfig, hcClient);
    }

    /** 获取联邦认证token(OpenId Connect Id token方式) 获取联邦认证token(OpenId Connect Id token方式)
     *
     * @param CreateTokenWithIdTokenRequest 请求对象
     * @return CompletableFuture<CreateTokenWithIdTokenResponse> */
    public CompletableFuture<CreateTokenWithIdTokenResponse> createTokenWithIdTokenAsync(
        CreateTokenWithIdTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createTokenWithIdToken);
    }

    /** 获取联邦认证token(OpenId Connect Id token方式) 获取联邦认证token(OpenId Connect Id token方式)
     *
     * @param CreateTokenWithIdTokenRequest 请求对象
     * @return AsyncInvoker<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse> */
    public AsyncInvoker<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse> createTokenWithIdTokenAsyncInvoker(
        CreateTokenWithIdTokenRequest request) {
        return new AsyncInvoker<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse>(request,
            IamMeta.createTokenWithIdToken, hcClient);
    }

    /** 删除委托 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除委托。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteAgencyRequest 请求对象
     * @return CompletableFuture<DeleteAgencyResponse> */
    public CompletableFuture<DeleteAgencyResponse> deleteAgencyAsync(DeleteAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteAgency);
    }

    /** 删除委托 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除委托。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteAgencyRequest 请求对象
     * @return AsyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse> */
    public AsyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgencyAsyncInvoker(
        DeleteAgencyRequest request) {
        return new AsyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>(request, IamMeta.deleteAgency, hcClient);
    }

    /** 删除自定义策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除自定义策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteCustomPolicyRequest 请求对象
     * @return CompletableFuture<DeleteCustomPolicyResponse> */
    public CompletableFuture<DeleteCustomPolicyResponse> deleteCustomPolicyAsync(DeleteCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteCustomPolicy);
    }

    /** 删除自定义策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除自定义策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteCustomPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> */
    public AsyncInvoker<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> deleteCustomPolicyAsyncInvoker(
        DeleteCustomPolicyRequest request) {
        return new AsyncInvoker<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse>(request,
            IamMeta.deleteCustomPolicy, hcClient);
    }

    /** 移除用户组的所有项目服务权限 该接口可以用于移除用户组的所有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteDomainGroupInheritedRoleRequest 请求对象
     * @return CompletableFuture<DeleteDomainGroupInheritedRoleResponse> */
    public CompletableFuture<DeleteDomainGroupInheritedRoleResponse> deleteDomainGroupInheritedRoleAsync(
        DeleteDomainGroupInheritedRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteDomainGroupInheritedRole);
    }

    /** 移除用户组的所有项目服务权限 该接口可以用于移除用户组的所有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteDomainGroupInheritedRoleRequest 请求对象
     * @return AsyncInvoker<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> */
    public AsyncInvoker<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> deleteDomainGroupInheritedRoleAsyncInvoker(
        DeleteDomainGroupInheritedRoleRequest request) {
        return new AsyncInvoker<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse>(request,
            IamMeta.deleteDomainGroupInheritedRole, hcClient);
    }

    /** 添加IAM用户到用户组 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)添加IAM用户到用户组。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAddUserToGroupRequest 请求对象
     * @return CompletableFuture<KeystoneAddUserToGroupResponse> */
    public CompletableFuture<KeystoneAddUserToGroupResponse> keystoneAddUserToGroupAsync(
        KeystoneAddUserToGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneAddUserToGroup);
    }

    /** 添加IAM用户到用户组 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)添加IAM用户到用户组。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAddUserToGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> */
    public AsyncInvoker<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> keystoneAddUserToGroupAsyncInvoker(
        KeystoneAddUserToGroupRequest request) {
        return new AsyncInvoker<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse>(request,
            IamMeta.keystoneAddUserToGroup, hcClient);
    }

    /** 为用户组授予全局服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予全局服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAssociateGroupWithDomainPermissionRequest 请求对象
     * @return CompletableFuture<KeystoneAssociateGroupWithDomainPermissionResponse> */
    public CompletableFuture<KeystoneAssociateGroupWithDomainPermissionResponse> keystoneAssociateGroupWithDomainPermissionAsync(
        KeystoneAssociateGroupWithDomainPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithDomainPermission);
    }

    /** 为用户组授予全局服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予全局服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAssociateGroupWithDomainPermissionRequest 请求对象
     * @return AsyncInvoker<KeystoneAssociateGroupWithDomainPermissionRequest,
     *         KeystoneAssociateGroupWithDomainPermissionResponse> */
    public AsyncInvoker<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse> keystoneAssociateGroupWithDomainPermissionAsyncInvoker(
        KeystoneAssociateGroupWithDomainPermissionRequest request) {
        return new AsyncInvoker<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse>(
            request, IamMeta.keystoneAssociateGroupWithDomainPermission, hcClient);
    }

    /** 为用户组授予项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAssociateGroupWithProjectPermissionRequest 请求对象
     * @return CompletableFuture<KeystoneAssociateGroupWithProjectPermissionResponse> */
    public CompletableFuture<KeystoneAssociateGroupWithProjectPermissionResponse> keystoneAssociateGroupWithProjectPermissionAsync(
        KeystoneAssociateGroupWithProjectPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithProjectPermission);
    }

    /** 为用户组授予项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAssociateGroupWithProjectPermissionRequest 请求对象
     * @return AsyncInvoker<KeystoneAssociateGroupWithProjectPermissionRequest,
     *         KeystoneAssociateGroupWithProjectPermissionResponse> */
    public AsyncInvoker<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse> keystoneAssociateGroupWithProjectPermissionAsyncInvoker(
        KeystoneAssociateGroupWithProjectPermissionRequest request) {
        return new AsyncInvoker<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse>(
            request, IamMeta.keystoneAssociateGroupWithProjectPermission, hcClient);
    }

    /** 查询用户组是否拥有全局服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有全局服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckDomainPermissionForGroupRequest 请求对象
     * @return CompletableFuture<KeystoneCheckDomainPermissionForGroupResponse> */
    public CompletableFuture<KeystoneCheckDomainPermissionForGroupResponse> keystoneCheckDomainPermissionForGroupAsync(
        KeystoneCheckDomainPermissionForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCheckDomainPermissionForGroup);
    }

    /** 查询用户组是否拥有全局服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有全局服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckDomainPermissionForGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneCheckDomainPermissionForGroupRequest,
     *         KeystoneCheckDomainPermissionForGroupResponse> */
    public AsyncInvoker<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse> keystoneCheckDomainPermissionForGroupAsyncInvoker(
        KeystoneCheckDomainPermissionForGroupRequest request) {
        return new AsyncInvoker<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse>(
            request, IamMeta.keystoneCheckDomainPermissionForGroup, hcClient);
    }

    /** 查询用户组是否拥有项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckProjectPermissionForGroupRequest 请求对象
     * @return CompletableFuture<KeystoneCheckProjectPermissionForGroupResponse> */
    public CompletableFuture<KeystoneCheckProjectPermissionForGroupResponse> keystoneCheckProjectPermissionForGroupAsync(
        KeystoneCheckProjectPermissionForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCheckProjectPermissionForGroup);
    }

    /** 查询用户组是否拥有项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckProjectPermissionForGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneCheckProjectPermissionForGroupRequest,
     *         KeystoneCheckProjectPermissionForGroupResponse> */
    public AsyncInvoker<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse> keystoneCheckProjectPermissionForGroupAsyncInvoker(
        KeystoneCheckProjectPermissionForGroupRequest request) {
        return new AsyncInvoker<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse>(
            request, IamMeta.keystoneCheckProjectPermissionForGroup, hcClient);
    }

    /** 查询IAM用户是否在用户组中 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户是否在用户组中。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckUserInGroupRequest 请求对象
     * @return CompletableFuture<KeystoneCheckUserInGroupResponse> */
    public CompletableFuture<KeystoneCheckUserInGroupResponse> keystoneCheckUserInGroupAsync(
        KeystoneCheckUserInGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCheckUserInGroup);
    }

    /** 查询IAM用户是否在用户组中 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户是否在用户组中。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckUserInGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> */
    public AsyncInvoker<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> keystoneCheckUserInGroupAsyncInvoker(
        KeystoneCheckUserInGroupRequest request) {
        return new AsyncInvoker<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse>(request,
            IamMeta.keystoneCheckUserInGroup, hcClient);
    }

    /** 查询用户组是否拥有所有项目指定权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有所有项目指定权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckroleForGroupRequest 请求对象
     * @return CompletableFuture<KeystoneCheckroleForGroupResponse> */
    public CompletableFuture<KeystoneCheckroleForGroupResponse> keystoneCheckroleForGroupAsync(
        KeystoneCheckroleForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCheckroleForGroup);
    }

    /** 查询用户组是否拥有所有项目指定权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有所有项目指定权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckroleForGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> */
    public AsyncInvoker<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> keystoneCheckroleForGroupAsyncInvoker(
        KeystoneCheckroleForGroupRequest request) {
        return new AsyncInvoker<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse>(request,
            IamMeta.keystoneCheckroleForGroup, hcClient);
    }

    /** 创建用户组 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建用户组。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateGroupRequest 请求对象
     * @return CompletableFuture<KeystoneCreateGroupResponse> */
    public CompletableFuture<KeystoneCreateGroupResponse> keystoneCreateGroupAsync(KeystoneCreateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateGroup);
    }

    /** 创建用户组 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建用户组。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> */
    public AsyncInvoker<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> keystoneCreateGroupAsyncInvoker(
        KeystoneCreateGroupRequest request) {
        return new AsyncInvoker<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse>(request,
            IamMeta.keystoneCreateGroup, hcClient);
    }

    /** 注册身份提供商 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册身份提供商。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateIdentityProviderRequest 请求对象
     * @return CompletableFuture<KeystoneCreateIdentityProviderResponse> */
    public CompletableFuture<KeystoneCreateIdentityProviderResponse> keystoneCreateIdentityProviderAsync(
        KeystoneCreateIdentityProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateIdentityProvider);
    }

    /** 注册身份提供商 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册身份提供商。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateIdentityProviderRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> */
    public AsyncInvoker<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> keystoneCreateIdentityProviderAsyncInvoker(
        KeystoneCreateIdentityProviderRequest request) {
        return new AsyncInvoker<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse>(request,
            IamMeta.keystoneCreateIdentityProvider, hcClient);
    }

    /** 注册映射 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册映射。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateMappingRequest 请求对象
     * @return CompletableFuture<KeystoneCreateMappingResponse> */
    public CompletableFuture<KeystoneCreateMappingResponse> keystoneCreateMappingAsync(
        KeystoneCreateMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateMapping);
    }

    /** 注册映射 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册映射。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateMappingRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> */
    public AsyncInvoker<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> keystoneCreateMappingAsyncInvoker(
        KeystoneCreateMappingRequest request) {
        return new AsyncInvoker<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse>(request,
            IamMeta.keystoneCreateMapping, hcClient);
    }

    /** 创建项目 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建项目。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateProjectRequest 请求对象
     * @return CompletableFuture<KeystoneCreateProjectResponse> */
    public CompletableFuture<KeystoneCreateProjectResponse> keystoneCreateProjectAsync(
        KeystoneCreateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateProject);
    }

    /** 创建项目 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建项目。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateProjectRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> */
    public AsyncInvoker<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> keystoneCreateProjectAsyncInvoker(
        KeystoneCreateProjectRequest request) {
        return new AsyncInvoker<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse>(request,
            IamMeta.keystoneCreateProject, hcClient);
    }

    /** 注册协议 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册协议（将协议关联到某一身份提供商）。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateProtocolRequest 请求对象
     * @return CompletableFuture<KeystoneCreateProtocolResponse> */
    public CompletableFuture<KeystoneCreateProtocolResponse> keystoneCreateProtocolAsync(
        KeystoneCreateProtocolRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateProtocol);
    }

    /** 注册协议 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册协议（将协议关联到某一身份提供商）。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateProtocolRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> */
    public AsyncInvoker<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> keystoneCreateProtocolAsyncInvoker(
        KeystoneCreateProtocolRequest request) {
        return new AsyncInvoker<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse>(request,
            IamMeta.keystoneCreateProtocol, hcClient);
    }

    /** 获取联邦认证scoped token 该接口可以用于通过联邦认证方式获取scoped token。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateScopedTokenRequest 请求对象
     * @return CompletableFuture<KeystoneCreateScopedTokenResponse> */
    public CompletableFuture<KeystoneCreateScopedTokenResponse> keystoneCreateScopedTokenAsync(
        KeystoneCreateScopedTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateScopedToken);
    }

    /** 获取联邦认证scoped token 该接口可以用于通过联邦认证方式获取scoped token。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateScopedTokenRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> */
    public AsyncInvoker<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> keystoneCreateScopedTokenAsyncInvoker(
        KeystoneCreateScopedTokenRequest request) {
        return new AsyncInvoker<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse>(request,
            IamMeta.keystoneCreateScopedToken, hcClient);
    }

    /** 删除用户组 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除用户组。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteGroupRequest 请求对象
     * @return CompletableFuture<KeystoneDeleteGroupResponse> */
    public CompletableFuture<KeystoneDeleteGroupResponse> keystoneDeleteGroupAsync(KeystoneDeleteGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteGroup);
    }

    /** 删除用户组 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除用户组。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> */
    public AsyncInvoker<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> keystoneDeleteGroupAsyncInvoker(
        KeystoneDeleteGroupRequest request) {
        return new AsyncInvoker<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse>(request,
            IamMeta.keystoneDeleteGroup, hcClient);
    }

    /** 删除身份提供商 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html) 删除身份提供商。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteIdentityProviderRequest 请求对象
     * @return CompletableFuture<KeystoneDeleteIdentityProviderResponse> */
    public CompletableFuture<KeystoneDeleteIdentityProviderResponse> keystoneDeleteIdentityProviderAsync(
        KeystoneDeleteIdentityProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteIdentityProvider);
    }

    /** 删除身份提供商 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html) 删除身份提供商。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteIdentityProviderRequest 请求对象
     * @return AsyncInvoker<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> */
    public AsyncInvoker<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> keystoneDeleteIdentityProviderAsyncInvoker(
        KeystoneDeleteIdentityProviderRequest request) {
        return new AsyncInvoker<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse>(request,
            IamMeta.keystoneDeleteIdentityProvider, hcClient);
    }

    /** 删除映射 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除映射。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteMappingRequest 请求对象
     * @return CompletableFuture<KeystoneDeleteMappingResponse> */
    public CompletableFuture<KeystoneDeleteMappingResponse> keystoneDeleteMappingAsync(
        KeystoneDeleteMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteMapping);
    }

    /** 删除映射 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除映射。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteMappingRequest 请求对象
     * @return AsyncInvoker<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> */
    public AsyncInvoker<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> keystoneDeleteMappingAsyncInvoker(
        KeystoneDeleteMappingRequest request) {
        return new AsyncInvoker<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse>(request,
            IamMeta.keystoneDeleteMapping, hcClient);
    }

    /** 删除协议 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除协议。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteProtocolRequest 请求对象
     * @return CompletableFuture<KeystoneDeleteProtocolResponse> */
    public CompletableFuture<KeystoneDeleteProtocolResponse> keystoneDeleteProtocolAsync(
        KeystoneDeleteProtocolRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteProtocol);
    }

    /** 删除协议 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除协议。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteProtocolRequest 请求对象
     * @return AsyncInvoker<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> */
    public AsyncInvoker<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> keystoneDeleteProtocolAsyncInvoker(
        KeystoneDeleteProtocolRequest request) {
        return new AsyncInvoker<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse>(request,
            IamMeta.keystoneDeleteProtocol, hcClient);
    }

    /** 查询用户组的所有项目权限列表 该接口可以用于管理员查询用户组所有项目服务权限列表。
     * \\n\\n该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAllProjectPermissionsForGroupRequest 请求对象
     * @return CompletableFuture<KeystoneListAllProjectPermissionsForGroupResponse> */
    public CompletableFuture<KeystoneListAllProjectPermissionsForGroupResponse> keystoneListAllProjectPermissionsForGroupAsync(
        KeystoneListAllProjectPermissionsForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListAllProjectPermissionsForGroup);
    }

    /** 查询用户组的所有项目权限列表 该接口可以用于管理员查询用户组所有项目服务权限列表。
     * \\n\\n该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAllProjectPermissionsForGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneListAllProjectPermissionsForGroupRequest,
     *         KeystoneListAllProjectPermissionsForGroupResponse> */
    public AsyncInvoker<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse> keystoneListAllProjectPermissionsForGroupAsyncInvoker(
        KeystoneListAllProjectPermissionsForGroupRequest request) {
        return new AsyncInvoker<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse>(
            request, IamMeta.keystoneListAllProjectPermissionsForGroup, hcClient);
    }

    /** 查询IAM用户可以访问的账号详情 该接口可以用于查询IAM用户可以用访问的账号详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAuthDomainsRequest 请求对象
     * @return CompletableFuture<KeystoneListAuthDomainsResponse> */
    public CompletableFuture<KeystoneListAuthDomainsResponse> keystoneListAuthDomainsAsync(
        KeystoneListAuthDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListAuthDomains);
    }

    /** 查询IAM用户可以访问的账号详情 该接口可以用于查询IAM用户可以用访问的账号详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAuthDomainsRequest 请求对象
     * @return AsyncInvoker<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> */
    public AsyncInvoker<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> keystoneListAuthDomainsAsyncInvoker(
        KeystoneListAuthDomainsRequest request) {
        return new AsyncInvoker<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse>(request,
            IamMeta.keystoneListAuthDomains, hcClient);
    }

    /** 查询IAM用户可以访问的项目列表 该接口可以用于查询IAM用户可以访问的项目列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAuthProjectsRequest 请求对象
     * @return CompletableFuture<KeystoneListAuthProjectsResponse> */
    public CompletableFuture<KeystoneListAuthProjectsResponse> keystoneListAuthProjectsAsync(
        KeystoneListAuthProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListAuthProjects);
    }

    /** 查询IAM用户可以访问的项目列表 该接口可以用于查询IAM用户可以访问的项目列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAuthProjectsRequest 请求对象
     * @return AsyncInvoker<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse> */
    public AsyncInvoker<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse> keystoneListAuthProjectsAsyncInvoker(
        KeystoneListAuthProjectsRequest request) {
        return new AsyncInvoker<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse>(request,
            IamMeta.keystoneListAuthProjects, hcClient);
    }

    /** 查询全局服务中的用户组权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的用户组权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListDomainPermissionsForGroupRequest 请求对象
     * @return CompletableFuture<KeystoneListDomainPermissionsForGroupResponse> */
    public CompletableFuture<KeystoneListDomainPermissionsForGroupResponse> keystoneListDomainPermissionsForGroupAsync(
        KeystoneListDomainPermissionsForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListDomainPermissionsForGroup);
    }

    /** 查询全局服务中的用户组权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的用户组权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListDomainPermissionsForGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneListDomainPermissionsForGroupRequest,
     *         KeystoneListDomainPermissionsForGroupResponse> */
    public AsyncInvoker<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> keystoneListDomainPermissionsForGroupAsyncInvoker(
        KeystoneListDomainPermissionsForGroupRequest request) {
        return new AsyncInvoker<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse>(
            request, IamMeta.keystoneListDomainPermissionsForGroup, hcClient);
    }

    /** 查询终端节点列表 该接口可以用于查询终端节点列表。终端节点用来提供服务访问入口。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListEndpointsRequest 请求对象
     * @return CompletableFuture<KeystoneListEndpointsResponse> */
    public CompletableFuture<KeystoneListEndpointsResponse> keystoneListEndpointsAsync(
        KeystoneListEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListEndpoints);
    }

    /** 查询终端节点列表 该接口可以用于查询终端节点列表。终端节点用来提供服务访问入口。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListEndpointsRequest 请求对象
     * @return AsyncInvoker<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> */
    public AsyncInvoker<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> keystoneListEndpointsAsyncInvoker(
        KeystoneListEndpointsRequest request) {
        return new AsyncInvoker<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse>(request,
            IamMeta.keystoneListEndpoints, hcClient);
    }

    /** 查询用户组列表 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListGroupsRequest 请求对象
     * @return CompletableFuture<KeystoneListGroupsResponse> */
    public CompletableFuture<KeystoneListGroupsResponse> keystoneListGroupsAsync(KeystoneListGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListGroups);
    }

    /** 查询用户组列表 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListGroupsRequest 请求对象
     * @return AsyncInvoker<KeystoneListGroupsRequest, KeystoneListGroupsResponse> */
    public AsyncInvoker<KeystoneListGroupsRequest, KeystoneListGroupsResponse> keystoneListGroupsAsyncInvoker(
        KeystoneListGroupsRequest request) {
        return new AsyncInvoker<KeystoneListGroupsRequest, KeystoneListGroupsResponse>(request,
            IamMeta.keystoneListGroups, hcClient);
    }

    /** 查询身份提供商列表 该接口可以用于查询身份提供商列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListIdentityProvidersRequest 请求对象
     * @return CompletableFuture<KeystoneListIdentityProvidersResponse> */
    public CompletableFuture<KeystoneListIdentityProvidersResponse> keystoneListIdentityProvidersAsync(
        KeystoneListIdentityProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListIdentityProviders);
    }

    /** 查询身份提供商列表 该接口可以用于查询身份提供商列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListIdentityProvidersRequest 请求对象
     * @return AsyncInvoker<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> */
    public AsyncInvoker<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> keystoneListIdentityProvidersAsyncInvoker(
        KeystoneListIdentityProvidersRequest request) {
        return new AsyncInvoker<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse>(request,
            IamMeta.keystoneListIdentityProviders, hcClient);
    }

    /** 查询映射列表 该接口可以用于查询映射列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListMappingsRequest 请求对象
     * @return CompletableFuture<KeystoneListMappingsResponse> */
    public CompletableFuture<KeystoneListMappingsResponse> keystoneListMappingsAsync(
        KeystoneListMappingsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListMappings);
    }

    /** 查询映射列表 该接口可以用于查询映射列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListMappingsRequest 请求对象
     * @return AsyncInvoker<KeystoneListMappingsRequest, KeystoneListMappingsResponse> */
    public AsyncInvoker<KeystoneListMappingsRequest, KeystoneListMappingsResponse> keystoneListMappingsAsyncInvoker(
        KeystoneListMappingsRequest request) {
        return new AsyncInvoker<KeystoneListMappingsRequest, KeystoneListMappingsResponse>(request,
            IamMeta.keystoneListMappings, hcClient);
    }

    /** 查询权限列表 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListPermissionsRequest 请求对象
     * @return CompletableFuture<KeystoneListPermissionsResponse> */
    public CompletableFuture<KeystoneListPermissionsResponse> keystoneListPermissionsAsync(
        KeystoneListPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListPermissions);
    }

    /** 查询权限列表 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListPermissionsRequest 请求对象
     * @return AsyncInvoker<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> */
    public AsyncInvoker<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> keystoneListPermissionsAsyncInvoker(
        KeystoneListPermissionsRequest request) {
        return new AsyncInvoker<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse>(request,
            IamMeta.keystoneListPermissions, hcClient);
    }

    /** 查询项目服务中的用户组权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的用户组权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectPermissionsForGroupRequest 请求对象
     * @return CompletableFuture<KeystoneListProjectPermissionsForGroupResponse> */
    public CompletableFuture<KeystoneListProjectPermissionsForGroupResponse> keystoneListProjectPermissionsForGroupAsync(
        KeystoneListProjectPermissionsForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListProjectPermissionsForGroup);
    }

    /** 查询项目服务中的用户组权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的用户组权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectPermissionsForGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneListProjectPermissionsForGroupRequest,
     *         KeystoneListProjectPermissionsForGroupResponse> */
    public AsyncInvoker<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse> keystoneListProjectPermissionsForGroupAsyncInvoker(
        KeystoneListProjectPermissionsForGroupRequest request) {
        return new AsyncInvoker<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse>(
            request, IamMeta.keystoneListProjectPermissionsForGroup, hcClient);
    }

    /** 查询指定条件下的项目列表 该接口可以用于查询指定条件下的项目列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectsRequest 请求对象
     * @return CompletableFuture<KeystoneListProjectsResponse> */
    public CompletableFuture<KeystoneListProjectsResponse> keystoneListProjectsAsync(
        KeystoneListProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListProjects);
    }

    /** 查询指定条件下的项目列表 该接口可以用于查询指定条件下的项目列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectsRequest 请求对象
     * @return AsyncInvoker<KeystoneListProjectsRequest, KeystoneListProjectsResponse> */
    public AsyncInvoker<KeystoneListProjectsRequest, KeystoneListProjectsResponse> keystoneListProjectsAsyncInvoker(
        KeystoneListProjectsRequest request) {
        return new AsyncInvoker<KeystoneListProjectsRequest, KeystoneListProjectsResponse>(request,
            IamMeta.keystoneListProjects, hcClient);
    }

    /** 查询指定IAM用户的项目列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的项目列表，或IAM用户查询自己的项目列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectsForUserRequest 请求对象
     * @return CompletableFuture<KeystoneListProjectsForUserResponse> */
    public CompletableFuture<KeystoneListProjectsForUserResponse> keystoneListProjectsForUserAsync(
        KeystoneListProjectsForUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListProjectsForUser);
    }

    /** 查询指定IAM用户的项目列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的项目列表，或IAM用户查询自己的项目列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectsForUserRequest 请求对象
     * @return AsyncInvoker<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> */
    public AsyncInvoker<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> keystoneListProjectsForUserAsyncInvoker(
        KeystoneListProjectsForUserRequest request) {
        return new AsyncInvoker<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse>(request,
            IamMeta.keystoneListProjectsForUser, hcClient);
    }

    /** 查询协议列表 该接口可以用于查询协议列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProtocolsRequest 请求对象
     * @return CompletableFuture<KeystoneListProtocolsResponse> */
    public CompletableFuture<KeystoneListProtocolsResponse> keystoneListProtocolsAsync(
        KeystoneListProtocolsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListProtocols);
    }

    /** 查询协议列表 该接口可以用于查询协议列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProtocolsRequest 请求对象
     * @return AsyncInvoker<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> */
    public AsyncInvoker<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> keystoneListProtocolsAsyncInvoker(
        KeystoneListProtocolsRequest request) {
        return new AsyncInvoker<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse>(request,
            IamMeta.keystoneListProtocols, hcClient);
    }

    /** 查询区域列表 该接口可以用于查询区域列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListRegionsRequest 请求对象
     * @return CompletableFuture<KeystoneListRegionsResponse> */
    public CompletableFuture<KeystoneListRegionsResponse> keystoneListRegionsAsync(KeystoneListRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListRegions);
    }

    /** 查询区域列表 该接口可以用于查询区域列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListRegionsRequest 请求对象
     * @return AsyncInvoker<KeystoneListRegionsRequest, KeystoneListRegionsResponse> */
    public AsyncInvoker<KeystoneListRegionsRequest, KeystoneListRegionsResponse> keystoneListRegionsAsyncInvoker(
        KeystoneListRegionsRequest request) {
        return new AsyncInvoker<KeystoneListRegionsRequest, KeystoneListRegionsResponse>(request,
            IamMeta.keystoneListRegions, hcClient);
    }

    /** 查询服务列表 该接口可以用于查询服务列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListServicesRequest 请求对象
     * @return CompletableFuture<KeystoneListServicesResponse> */
    public CompletableFuture<KeystoneListServicesResponse> keystoneListServicesAsync(
        KeystoneListServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListServices);
    }

    /** 查询服务列表 该接口可以用于查询服务列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListServicesRequest 请求对象
     * @return AsyncInvoker<KeystoneListServicesRequest, KeystoneListServicesResponse> */
    public AsyncInvoker<KeystoneListServicesRequest, KeystoneListServicesResponse> keystoneListServicesAsyncInvoker(
        KeystoneListServicesRequest request) {
        return new AsyncInvoker<KeystoneListServicesRequest, KeystoneListServicesResponse>(request,
            IamMeta.keystoneListServices, hcClient);
    }

    /** 管理员查询用户组所包含的IAM用户 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组中所包含的IAM用户。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListUsersForGroupByAdminRequest 请求对象
     * @return CompletableFuture<KeystoneListUsersForGroupByAdminResponse> */
    public CompletableFuture<KeystoneListUsersForGroupByAdminResponse> keystoneListUsersForGroupByAdminAsync(
        KeystoneListUsersForGroupByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListUsersForGroupByAdmin);
    }

    /** 管理员查询用户组所包含的IAM用户 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组中所包含的IAM用户。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListUsersForGroupByAdminRequest 请求对象
     * @return AsyncInvoker<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> */
    public AsyncInvoker<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> keystoneListUsersForGroupByAdminAsyncInvoker(
        KeystoneListUsersForGroupByAdminRequest request) {
        return new AsyncInvoker<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse>(
            request, IamMeta.keystoneListUsersForGroupByAdmin, hcClient);
    }

    /** 查询版本信息列表 该接口用于查询Keystone API的版本信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListVersionsRequest 请求对象
     * @return CompletableFuture<KeystoneListVersionsResponse> */
    public CompletableFuture<KeystoneListVersionsResponse> keystoneListVersionsAsync(
        KeystoneListVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListVersions);
    }

    /** 查询版本信息列表 该接口用于查询Keystone API的版本信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListVersionsRequest 请求对象
     * @return AsyncInvoker<KeystoneListVersionsRequest, KeystoneListVersionsResponse> */
    public AsyncInvoker<KeystoneListVersionsRequest, KeystoneListVersionsResponse> keystoneListVersionsAsyncInvoker(
        KeystoneListVersionsRequest request) {
        return new AsyncInvoker<KeystoneListVersionsRequest, KeystoneListVersionsResponse>(request,
            IamMeta.keystoneListVersions, hcClient);
    }

    /** 移除用户组的全局服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的全局服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveDomainPermissionFromGroupRequest 请求对象
     * @return CompletableFuture<KeystoneRemoveDomainPermissionFromGroupResponse> */
    public CompletableFuture<KeystoneRemoveDomainPermissionFromGroupResponse> keystoneRemoveDomainPermissionFromGroupAsync(
        KeystoneRemoveDomainPermissionFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneRemoveDomainPermissionFromGroup);
    }

    /** 移除用户组的全局服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的全局服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveDomainPermissionFromGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneRemoveDomainPermissionFromGroupRequest,
     *         KeystoneRemoveDomainPermissionFromGroupResponse> */
    public AsyncInvoker<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> keystoneRemoveDomainPermissionFromGroupAsyncInvoker(
        KeystoneRemoveDomainPermissionFromGroupRequest request) {
        return new AsyncInvoker<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse>(
            request, IamMeta.keystoneRemoveDomainPermissionFromGroup, hcClient);
    }

    /** 移除用户组的项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveProjectPermissionFromGroupRequest 请求对象
     * @return CompletableFuture<KeystoneRemoveProjectPermissionFromGroupResponse> */
    public CompletableFuture<KeystoneRemoveProjectPermissionFromGroupResponse> keystoneRemoveProjectPermissionFromGroupAsync(
        KeystoneRemoveProjectPermissionFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneRemoveProjectPermissionFromGroup);
    }

    /** 移除用户组的项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveProjectPermissionFromGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneRemoveProjectPermissionFromGroupRequest,
     *         KeystoneRemoveProjectPermissionFromGroupResponse> */
    public AsyncInvoker<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse> keystoneRemoveProjectPermissionFromGroupAsyncInvoker(
        KeystoneRemoveProjectPermissionFromGroupRequest request) {
        return new AsyncInvoker<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse>(
            request, IamMeta.keystoneRemoveProjectPermissionFromGroup, hcClient);
    }

    /** 移除用户组中的IAM用户 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组中的IAM用户。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveUserFromGroupRequest 请求对象
     * @return CompletableFuture<KeystoneRemoveUserFromGroupResponse> */
    public CompletableFuture<KeystoneRemoveUserFromGroupResponse> keystoneRemoveUserFromGroupAsync(
        KeystoneRemoveUserFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneRemoveUserFromGroup);
    }

    /** 移除用户组中的IAM用户 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组中的IAM用户。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveUserFromGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> */
    public AsyncInvoker<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> keystoneRemoveUserFromGroupAsyncInvoker(
        KeystoneRemoveUserFromGroupRequest request) {
        return new AsyncInvoker<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse>(request,
            IamMeta.keystoneRemoveUserFromGroup, hcClient);
    }

    /** 查询服务目录 该接口可以用于查询请求头中X-Auth-Token对应的服务目录。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowCatalogRequest 请求对象
     * @return CompletableFuture<KeystoneShowCatalogResponse> */
    public CompletableFuture<KeystoneShowCatalogResponse> keystoneShowCatalogAsync(KeystoneShowCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowCatalog);
    }

    /** 查询服务目录 该接口可以用于查询请求头中X-Auth-Token对应的服务目录。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowCatalogRequest 请求对象
     * @return AsyncInvoker<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> */
    public AsyncInvoker<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> keystoneShowCatalogAsyncInvoker(
        KeystoneShowCatalogRequest request) {
        return new AsyncInvoker<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse>(request,
            IamMeta.keystoneShowCatalog, hcClient);
    }

    /** 查询终端节点详情 该接口可以用于查询终端节点详情。终端节点用来提供服务访问入口。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowEndpointRequest 请求对象
     * @return CompletableFuture<KeystoneShowEndpointResponse> */
    public CompletableFuture<KeystoneShowEndpointResponse> keystoneShowEndpointAsync(
        KeystoneShowEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowEndpoint);
    }

    /** 查询终端节点详情 该接口可以用于查询终端节点详情。终端节点用来提供服务访问入口。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowEndpointRequest 请求对象
     * @return AsyncInvoker<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse> */
    public AsyncInvoker<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse> keystoneShowEndpointAsyncInvoker(
        KeystoneShowEndpointRequest request) {
        return new AsyncInvoker<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse>(request,
            IamMeta.keystoneShowEndpoint, hcClient);
    }

    /** 查询用户组详情 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowGroupRequest 请求对象
     * @return CompletableFuture<KeystoneShowGroupResponse> */
    public CompletableFuture<KeystoneShowGroupResponse> keystoneShowGroupAsync(KeystoneShowGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowGroup);
    }

    /** 查询用户组详情 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneShowGroupRequest, KeystoneShowGroupResponse> */
    public AsyncInvoker<KeystoneShowGroupRequest, KeystoneShowGroupResponse> keystoneShowGroupAsyncInvoker(
        KeystoneShowGroupRequest request) {
        return new AsyncInvoker<KeystoneShowGroupRequest, KeystoneShowGroupResponse>(request, IamMeta.keystoneShowGroup,
            hcClient);
    }

    /** 查询身份提供商详情 该接口可以用于查询身份提供商详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowIdentityProviderRequest 请求对象
     * @return CompletableFuture<KeystoneShowIdentityProviderResponse> */
    public CompletableFuture<KeystoneShowIdentityProviderResponse> keystoneShowIdentityProviderAsync(
        KeystoneShowIdentityProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowIdentityProvider);
    }

    /** 查询身份提供商详情 该接口可以用于查询身份提供商详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowIdentityProviderRequest 请求对象
     * @return AsyncInvoker<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> */
    public AsyncInvoker<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> keystoneShowIdentityProviderAsyncInvoker(
        KeystoneShowIdentityProviderRequest request) {
        return new AsyncInvoker<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse>(request,
            IamMeta.keystoneShowIdentityProvider, hcClient);
    }

    /** 查询映射详情 该接口可以用于查询映射详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowMappingRequest 请求对象
     * @return CompletableFuture<KeystoneShowMappingResponse> */
    public CompletableFuture<KeystoneShowMappingResponse> keystoneShowMappingAsync(KeystoneShowMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowMapping);
    }

    /** 查询映射详情 该接口可以用于查询映射详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowMappingRequest 请求对象
     * @return AsyncInvoker<KeystoneShowMappingRequest, KeystoneShowMappingResponse> */
    public AsyncInvoker<KeystoneShowMappingRequest, KeystoneShowMappingResponse> keystoneShowMappingAsyncInvoker(
        KeystoneShowMappingRequest request) {
        return new AsyncInvoker<KeystoneShowMappingRequest, KeystoneShowMappingResponse>(request,
            IamMeta.keystoneShowMapping, hcClient);
    }

    /** 查询权限详情 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowPermissionRequest 请求对象
     * @return CompletableFuture<KeystoneShowPermissionResponse> */
    public CompletableFuture<KeystoneShowPermissionResponse> keystoneShowPermissionAsync(
        KeystoneShowPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowPermission);
    }

    /** 查询权限详情 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowPermissionRequest 请求对象
     * @return AsyncInvoker<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> */
    public AsyncInvoker<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> keystoneShowPermissionAsyncInvoker(
        KeystoneShowPermissionRequest request) {
        return new AsyncInvoker<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse>(request,
            IamMeta.keystoneShowPermission, hcClient);
    }

    /** 查询项目详情 该接口可以用于查询项目详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowProjectRequest 请求对象
     * @return CompletableFuture<KeystoneShowProjectResponse> */
    public CompletableFuture<KeystoneShowProjectResponse> keystoneShowProjectAsync(KeystoneShowProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowProject);
    }

    /** 查询项目详情 该接口可以用于查询项目详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowProjectRequest 请求对象
     * @return AsyncInvoker<KeystoneShowProjectRequest, KeystoneShowProjectResponse> */
    public AsyncInvoker<KeystoneShowProjectRequest, KeystoneShowProjectResponse> keystoneShowProjectAsyncInvoker(
        KeystoneShowProjectRequest request) {
        return new AsyncInvoker<KeystoneShowProjectRequest, KeystoneShowProjectResponse>(request,
            IamMeta.keystoneShowProject, hcClient);
    }

    /** 查询协议详情 该接口可以用于查询协议详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowProtocolRequest 请求对象
     * @return CompletableFuture<KeystoneShowProtocolResponse> */
    public CompletableFuture<KeystoneShowProtocolResponse> keystoneShowProtocolAsync(
        KeystoneShowProtocolRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowProtocol);
    }

    /** 查询协议详情 该接口可以用于查询协议详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowProtocolRequest 请求对象
     * @return AsyncInvoker<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> */
    public AsyncInvoker<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> keystoneShowProtocolAsyncInvoker(
        KeystoneShowProtocolRequest request) {
        return new AsyncInvoker<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse>(request,
            IamMeta.keystoneShowProtocol, hcClient);
    }

    /** 查询区域详情 该接口可以用于查询区域详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowRegionRequest 请求对象
     * @return CompletableFuture<KeystoneShowRegionResponse> */
    public CompletableFuture<KeystoneShowRegionResponse> keystoneShowRegionAsync(KeystoneShowRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowRegion);
    }

    /** 查询区域详情 该接口可以用于查询区域详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowRegionRequest 请求对象
     * @return AsyncInvoker<KeystoneShowRegionRequest, KeystoneShowRegionResponse> */
    public AsyncInvoker<KeystoneShowRegionRequest, KeystoneShowRegionResponse> keystoneShowRegionAsyncInvoker(
        KeystoneShowRegionRequest request) {
        return new AsyncInvoker<KeystoneShowRegionRequest, KeystoneShowRegionResponse>(request,
            IamMeta.keystoneShowRegion, hcClient);
    }

    /** 查询账号密码强度策略 该接口可以用于查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowSecurityComplianceRequest 请求对象
     * @return CompletableFuture<KeystoneShowSecurityComplianceResponse> */
    public CompletableFuture<KeystoneShowSecurityComplianceResponse> keystoneShowSecurityComplianceAsync(
        KeystoneShowSecurityComplianceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowSecurityCompliance);
    }

    /** 查询账号密码强度策略 该接口可以用于查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowSecurityComplianceRequest 请求对象
     * @return AsyncInvoker<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> */
    public AsyncInvoker<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> keystoneShowSecurityComplianceAsyncInvoker(
        KeystoneShowSecurityComplianceRequest request) {
        return new AsyncInvoker<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse>(request,
            IamMeta.keystoneShowSecurityCompliance, hcClient);
    }

    /** 按条件查询账号密码强度策略 该接口可以用于按条件查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowSecurityComplianceByOptionRequest 请求对象
     * @return CompletableFuture<KeystoneShowSecurityComplianceByOptionResponse> */
    public CompletableFuture<KeystoneShowSecurityComplianceByOptionResponse> keystoneShowSecurityComplianceByOptionAsync(
        KeystoneShowSecurityComplianceByOptionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowSecurityComplianceByOption);
    }

    /** 按条件查询账号密码强度策略 该接口可以用于按条件查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowSecurityComplianceByOptionRequest 请求对象
     * @return AsyncInvoker<KeystoneShowSecurityComplianceByOptionRequest,
     *         KeystoneShowSecurityComplianceByOptionResponse> */
    public AsyncInvoker<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse> keystoneShowSecurityComplianceByOptionAsyncInvoker(
        KeystoneShowSecurityComplianceByOptionRequest request) {
        return new AsyncInvoker<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse>(
            request, IamMeta.keystoneShowSecurityComplianceByOption, hcClient);
    }

    /** 查询服务详情 该接口可以用于查询服务详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowServiceRequest 请求对象
     * @return CompletableFuture<KeystoneShowServiceResponse> */
    public CompletableFuture<KeystoneShowServiceResponse> keystoneShowServiceAsync(KeystoneShowServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowService);
    }

    /** 查询服务详情 该接口可以用于查询服务详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowServiceRequest 请求对象
     * @return AsyncInvoker<KeystoneShowServiceRequest, KeystoneShowServiceResponse> */
    public AsyncInvoker<KeystoneShowServiceRequest, KeystoneShowServiceResponse> keystoneShowServiceAsyncInvoker(
        KeystoneShowServiceRequest request) {
        return new AsyncInvoker<KeystoneShowServiceRequest, KeystoneShowServiceResponse>(request,
            IamMeta.keystoneShowService, hcClient);
    }

    /** 查询版本信息 该接口用于查询Keystone API的3.0版本的信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowVersionRequest 请求对象
     * @return CompletableFuture<KeystoneShowVersionResponse> */
    public CompletableFuture<KeystoneShowVersionResponse> keystoneShowVersionAsync(KeystoneShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowVersion);
    }

    /** 查询版本信息 该接口用于查询Keystone API的3.0版本的信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowVersionRequest 请求对象
     * @return AsyncInvoker<KeystoneShowVersionRequest, KeystoneShowVersionResponse> */
    public AsyncInvoker<KeystoneShowVersionRequest, KeystoneShowVersionResponse> keystoneShowVersionAsyncInvoker(
        KeystoneShowVersionRequest request) {
        return new AsyncInvoker<KeystoneShowVersionRequest, KeystoneShowVersionResponse>(request,
            IamMeta.keystoneShowVersion, hcClient);
    }

    /** 更新用户组 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新用户组信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateGroupRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateGroupResponse> */
    public CompletableFuture<KeystoneUpdateGroupResponse> keystoneUpdateGroupAsync(KeystoneUpdateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateGroup);
    }

    /** 更新用户组 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新用户组信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse> */
    public AsyncInvoker<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse> keystoneUpdateGroupAsyncInvoker(
        KeystoneUpdateGroupRequest request) {
        return new AsyncInvoker<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse>(request,
            IamMeta.keystoneUpdateGroup, hcClient);
    }

    /** 更新身份提供商 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新身份提供商。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateIdentityProviderRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateIdentityProviderResponse> */
    public CompletableFuture<KeystoneUpdateIdentityProviderResponse> keystoneUpdateIdentityProviderAsync(
        KeystoneUpdateIdentityProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateIdentityProvider);
    }

    /** 更新身份提供商 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新身份提供商。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateIdentityProviderRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> */
    public AsyncInvoker<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> keystoneUpdateIdentityProviderAsyncInvoker(
        KeystoneUpdateIdentityProviderRequest request) {
        return new AsyncInvoker<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse>(request,
            IamMeta.keystoneUpdateIdentityProvider, hcClient);
    }

    /** 更新映射 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新映射。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateMappingRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateMappingResponse> */
    public CompletableFuture<KeystoneUpdateMappingResponse> keystoneUpdateMappingAsync(
        KeystoneUpdateMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateMapping);
    }

    /** 更新映射 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新映射。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateMappingRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> */
    public AsyncInvoker<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> keystoneUpdateMappingAsyncInvoker(
        KeystoneUpdateMappingRequest request) {
        return new AsyncInvoker<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse>(request,
            IamMeta.keystoneUpdateMapping, hcClient);
    }

    /** 修改项目信息 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改项目信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateProjectRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateProjectResponse> */
    public CompletableFuture<KeystoneUpdateProjectResponse> keystoneUpdateProjectAsync(
        KeystoneUpdateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateProject);
    }

    /** 修改项目信息 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改项目信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateProjectRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> */
    public AsyncInvoker<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> keystoneUpdateProjectAsyncInvoker(
        KeystoneUpdateProjectRequest request) {
        return new AsyncInvoker<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse>(request,
            IamMeta.keystoneUpdateProject, hcClient);
    }

    /** 更新协议 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新协议。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateProtocolRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateProtocolResponse> */
    public CompletableFuture<KeystoneUpdateProtocolResponse> keystoneUpdateProtocolAsync(
        KeystoneUpdateProtocolRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateProtocol);
    }

    /** 更新协议 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新协议。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateProtocolRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> */
    public AsyncInvoker<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> keystoneUpdateProtocolAsyncInvoker(
        KeystoneUpdateProtocolRequest request) {
        return new AsyncInvoker<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse>(request,
            IamMeta.keystoneUpdateProtocol, hcClient);
    }

    /** 查询指定条件下的委托列表 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定条件下的委托列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListAgenciesRequest 请求对象
     * @return CompletableFuture<ListAgenciesResponse> */
    public CompletableFuture<ListAgenciesResponse> listAgenciesAsync(ListAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listAgencies);
    }

    /** 查询指定条件下的委托列表 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定条件下的委托列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListAgenciesRequest 请求对象
     * @return AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse> */
    public AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesAsyncInvoker(
        ListAgenciesRequest request) {
        return new AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse>(request, IamMeta.listAgencies, hcClient);
    }

    /** 查询委托下的所有项目服务权限列表 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托所有项目服务权限列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListAllProjectsPermissionsForAgencyRequest 请求对象
     * @return CompletableFuture<ListAllProjectsPermissionsForAgencyResponse> */
    public CompletableFuture<ListAllProjectsPermissionsForAgencyResponse> listAllProjectsPermissionsForAgencyAsync(
        ListAllProjectsPermissionsForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listAllProjectsPermissionsForAgency);
    }

    /** 查询委托下的所有项目服务权限列表 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托所有项目服务权限列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListAllProjectsPermissionsForAgencyRequest 请求对象
     * @return AsyncInvoker<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> */
    public AsyncInvoker<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> listAllProjectsPermissionsForAgencyAsyncInvoker(
        ListAllProjectsPermissionsForAgencyRequest request) {
        return new AsyncInvoker<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse>(
            request, IamMeta.listAllProjectsPermissionsForAgency, hcClient);
    }

    /** 查询自定义策略列表 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListCustomPoliciesRequest 请求对象
     * @return CompletableFuture<ListCustomPoliciesResponse> */
    public CompletableFuture<ListCustomPoliciesResponse> listCustomPoliciesAsync(ListCustomPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listCustomPolicies);
    }

    /** 查询自定义策略列表 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListCustomPoliciesRequest 请求对象
     * @return AsyncInvoker<ListCustomPoliciesRequest, ListCustomPoliciesResponse> */
    public AsyncInvoker<ListCustomPoliciesRequest, ListCustomPoliciesResponse> listCustomPoliciesAsyncInvoker(
        ListCustomPoliciesRequest request) {
        return new AsyncInvoker<ListCustomPoliciesRequest, ListCustomPoliciesResponse>(request,
            IamMeta.listCustomPolicies, hcClient);
    }

    /** 查询全局服务中的委托权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的委托权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListDomainPermissionsForAgencyRequest 请求对象
     * @return CompletableFuture<ListDomainPermissionsForAgencyResponse> */
    public CompletableFuture<ListDomainPermissionsForAgencyResponse> listDomainPermissionsForAgencyAsync(
        ListDomainPermissionsForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listDomainPermissionsForAgency);
    }

    /** 查询全局服务中的委托权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的委托权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListDomainPermissionsForAgencyRequest 请求对象
     * @return AsyncInvoker<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> */
    public AsyncInvoker<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> listDomainPermissionsForAgencyAsyncInvoker(
        ListDomainPermissionsForAgencyRequest request) {
        return new AsyncInvoker<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse>(request,
            IamMeta.listDomainPermissionsForAgency, hcClient);
    }

    /** 查询项目服务中的委托权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的委托权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListProjectPermissionsForAgencyRequest 请求对象
     * @return CompletableFuture<ListProjectPermissionsForAgencyResponse> */
    public CompletableFuture<ListProjectPermissionsForAgencyResponse> listProjectPermissionsForAgencyAsync(
        ListProjectPermissionsForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listProjectPermissionsForAgency);
    }

    /** 查询项目服务中的委托权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的委托权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListProjectPermissionsForAgencyRequest 请求对象
     * @return AsyncInvoker<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> */
    public AsyncInvoker<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> listProjectPermissionsForAgencyAsyncInvoker(
        ListProjectPermissionsForAgencyRequest request) {
        return new AsyncInvoker<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse>(
            request, IamMeta.listProjectPermissionsForAgency, hcClient);
    }

    /** 移除委托下的所有项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的所有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveAllProjectsPermissionFromAgencyRequest 请求对象
     * @return CompletableFuture<RemoveAllProjectsPermissionFromAgencyResponse> */
    public CompletableFuture<RemoveAllProjectsPermissionFromAgencyResponse> removeAllProjectsPermissionFromAgencyAsync(
        RemoveAllProjectsPermissionFromAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.removeAllProjectsPermissionFromAgency);
    }

    /** 移除委托下的所有项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的所有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveAllProjectsPermissionFromAgencyRequest 请求对象
     * @return AsyncInvoker<RemoveAllProjectsPermissionFromAgencyRequest,
     *         RemoveAllProjectsPermissionFromAgencyResponse> */
    public AsyncInvoker<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse> removeAllProjectsPermissionFromAgencyAsyncInvoker(
        RemoveAllProjectsPermissionFromAgencyRequest request) {
        return new AsyncInvoker<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse>(
            request, IamMeta.removeAllProjectsPermissionFromAgency, hcClient);
    }

    /** 移除委托的全局服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的全局服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveDomainPermissionFromAgencyRequest 请求对象
     * @return CompletableFuture<RemoveDomainPermissionFromAgencyResponse> */
    public CompletableFuture<RemoveDomainPermissionFromAgencyResponse> removeDomainPermissionFromAgencyAsync(
        RemoveDomainPermissionFromAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.removeDomainPermissionFromAgency);
    }

    /** 移除委托的全局服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的全局服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveDomainPermissionFromAgencyRequest 请求对象
     * @return AsyncInvoker<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> */
    public AsyncInvoker<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> removeDomainPermissionFromAgencyAsyncInvoker(
        RemoveDomainPermissionFromAgencyRequest request) {
        return new AsyncInvoker<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse>(
            request, IamMeta.removeDomainPermissionFromAgency, hcClient);
    }

    /** 移除委托的项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveProjectPermissionFromAgencyRequest 请求对象
     * @return CompletableFuture<RemoveProjectPermissionFromAgencyResponse> */
    public CompletableFuture<RemoveProjectPermissionFromAgencyResponse> removeProjectPermissionFromAgencyAsync(
        RemoveProjectPermissionFromAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.removeProjectPermissionFromAgency);
    }

    /** 移除委托的项目服务权限 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveProjectPermissionFromAgencyRequest 请求对象
     * @return AsyncInvoker<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> */
    public AsyncInvoker<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> removeProjectPermissionFromAgencyAsyncInvoker(
        RemoveProjectPermissionFromAgencyRequest request) {
        return new AsyncInvoker<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse>(
            request, IamMeta.removeProjectPermissionFromAgency, hcClient);
    }

    /** 查询委托详情 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowAgencyRequest 请求对象
     * @return CompletableFuture<ShowAgencyResponse> */
    public CompletableFuture<ShowAgencyResponse> showAgencyAsync(ShowAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showAgency);
    }

    /** 查询委托详情 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowAgencyRequest 请求对象
     * @return AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse> */
    public AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse> showAgencyAsyncInvoker(ShowAgencyRequest request) {
        return new AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse>(request, IamMeta.showAgency, hcClient);
    }

    /** 查询自定义策略详情 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowCustomPolicyRequest 请求对象
     * @return CompletableFuture<ShowCustomPolicyResponse> */
    public CompletableFuture<ShowCustomPolicyResponse> showCustomPolicyAsync(ShowCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showCustomPolicy);
    }

    /** 查询自定义策略详情 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowCustomPolicyRequest 请求对象
     * @return AsyncInvoker<ShowCustomPolicyRequest, ShowCustomPolicyResponse> */
    public AsyncInvoker<ShowCustomPolicyRequest, ShowCustomPolicyResponse> showCustomPolicyAsyncInvoker(
        ShowCustomPolicyRequest request) {
        return new AsyncInvoker<ShowCustomPolicyRequest, ShowCustomPolicyResponse>(request, IamMeta.showCustomPolicy,
            hcClient);
    }

    /** 查询账号接口访问策略 该接口可以用于查询账号接口访问控制策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainApiAclPolicyRequest 请求对象
     * @return CompletableFuture<ShowDomainApiAclPolicyResponse> */
    public CompletableFuture<ShowDomainApiAclPolicyResponse> showDomainApiAclPolicyAsync(
        ShowDomainApiAclPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainApiAclPolicy);
    }

    /** 查询账号接口访问策略 该接口可以用于查询账号接口访问控制策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainApiAclPolicyRequest 请求对象
     * @return AsyncInvoker<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> */
    public AsyncInvoker<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> showDomainApiAclPolicyAsyncInvoker(
        ShowDomainApiAclPolicyRequest request) {
        return new AsyncInvoker<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse>(request,
            IamMeta.showDomainApiAclPolicy, hcClient);
    }

    /** 查询账号控制台访问策略 该接口可以用于查询账号控制台访问控制策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainConsoleAclPolicyRequest 请求对象
     * @return CompletableFuture<ShowDomainConsoleAclPolicyResponse> */
    public CompletableFuture<ShowDomainConsoleAclPolicyResponse> showDomainConsoleAclPolicyAsync(
        ShowDomainConsoleAclPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainConsoleAclPolicy);
    }

    /** 查询账号控制台访问策略 该接口可以用于查询账号控制台访问控制策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainConsoleAclPolicyRequest 请求对象
     * @return AsyncInvoker<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> */
    public AsyncInvoker<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> showDomainConsoleAclPolicyAsyncInvoker(
        ShowDomainConsoleAclPolicyRequest request) {
        return new AsyncInvoker<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse>(request,
            IamMeta.showDomainConsoleAclPolicy, hcClient);
    }

    /** 查询账号登录策略 该接口可以用于查询账号登录策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainLoginPolicyRequest 请求对象
     * @return CompletableFuture<ShowDomainLoginPolicyResponse> */
    public CompletableFuture<ShowDomainLoginPolicyResponse> showDomainLoginPolicyAsync(
        ShowDomainLoginPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainLoginPolicy);
    }

    /** 查询账号登录策略 该接口可以用于查询账号登录策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainLoginPolicyRequest 请求对象
     * @return AsyncInvoker<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> */
    public AsyncInvoker<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> showDomainLoginPolicyAsyncInvoker(
        ShowDomainLoginPolicyRequest request) {
        return new AsyncInvoker<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse>(request,
            IamMeta.showDomainLoginPolicy, hcClient);
    }

    /** 查询账号密码策略 该接口可以用于查询账号密码策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainPasswordPolicyRequest 请求对象
     * @return CompletableFuture<ShowDomainPasswordPolicyResponse> */
    public CompletableFuture<ShowDomainPasswordPolicyResponse> showDomainPasswordPolicyAsync(
        ShowDomainPasswordPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainPasswordPolicy);
    }

    /** 查询账号密码策略 该接口可以用于查询账号密码策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainPasswordPolicyRequest 请求对象
     * @return AsyncInvoker<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> */
    public AsyncInvoker<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> showDomainPasswordPolicyAsyncInvoker(
        ShowDomainPasswordPolicyRequest request) {
        return new AsyncInvoker<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse>(request,
            IamMeta.showDomainPasswordPolicy, hcClient);
    }

    /** 查询账号操作保护策略 该接口可以用于查询账号操作保护策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainProtectPolicyRequest 请求对象
     * @return CompletableFuture<ShowDomainProtectPolicyResponse> */
    public CompletableFuture<ShowDomainProtectPolicyResponse> showDomainProtectPolicyAsync(
        ShowDomainProtectPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainProtectPolicy);
    }

    /** 查询账号操作保护策略 该接口可以用于查询账号操作保护策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainProtectPolicyRequest 请求对象
     * @return AsyncInvoker<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> */
    public AsyncInvoker<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> showDomainProtectPolicyAsyncInvoker(
        ShowDomainProtectPolicyRequest request) {
        return new AsyncInvoker<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse>(request,
            IamMeta.showDomainProtectPolicy, hcClient);
    }

    /** 查询账号配额 该接口可以用于查询账号配额。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainQuotaRequest 请求对象
     * @return CompletableFuture<ShowDomainQuotaResponse> */
    public CompletableFuture<ShowDomainQuotaResponse> showDomainQuotaAsync(ShowDomainQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainQuota);
    }

    /** 查询账号配额 该接口可以用于查询账号配额。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainQuotaRequest 请求对象
     * @return AsyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse> */
    public AsyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuotaAsyncInvoker(
        ShowDomainQuotaRequest request) {
        return new AsyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>(request, IamMeta.showDomainQuota,
            hcClient);
    }

    /** 查询Metadata文件
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询身份提供商导入到IAM中的Metadata文件。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowMetadataRequest 请求对象
     * @return CompletableFuture<ShowMetadataResponse> */
    public CompletableFuture<ShowMetadataResponse> showMetadataAsync(ShowMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showMetadata);
    }

    /** 查询Metadata文件
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询身份提供商导入到IAM中的Metadata文件。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowMetadataRequest 请求对象
     * @return AsyncInvoker<ShowMetadataRequest, ShowMetadataResponse> */
    public AsyncInvoker<ShowMetadataRequest, ShowMetadataResponse> showMetadataAsyncInvoker(
        ShowMetadataRequest request) {
        return new AsyncInvoker<ShowMetadataRequest, ShowMetadataResponse>(request, IamMeta.showMetadata, hcClient);
    }

    /** 查询OpenId Connect身份提供商配置 查询OpenId Connect身份提供商配置
     *
     * @param ShowOpenIdConnectConfigRequest 请求对象
     * @return CompletableFuture<ShowOpenIdConnectConfigResponse> */
    public CompletableFuture<ShowOpenIdConnectConfigResponse> showOpenIdConnectConfigAsync(
        ShowOpenIdConnectConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showOpenIdConnectConfig);
    }

    /** 查询OpenId Connect身份提供商配置 查询OpenId Connect身份提供商配置
     *
     * @param ShowOpenIdConnectConfigRequest 请求对象
     * @return AsyncInvoker<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse> */
    public AsyncInvoker<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse> showOpenIdConnectConfigAsyncInvoker(
        ShowOpenIdConnectConfigRequest request) {
        return new AsyncInvoker<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse>(request,
            IamMeta.showOpenIdConnectConfig, hcClient);
    }

    /** 查询项目详情与状态 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目详情与状态。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowProjectDetailsAndStatusRequest 请求对象
     * @return CompletableFuture<ShowProjectDetailsAndStatusResponse> */
    public CompletableFuture<ShowProjectDetailsAndStatusResponse> showProjectDetailsAndStatusAsync(
        ShowProjectDetailsAndStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showProjectDetailsAndStatus);
    }

    /** 查询项目详情与状态 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目详情与状态。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowProjectDetailsAndStatusRequest 请求对象
     * @return AsyncInvoker<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> */
    public AsyncInvoker<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> showProjectDetailsAndStatusAsyncInvoker(
        ShowProjectDetailsAndStatusRequest request) {
        return new AsyncInvoker<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse>(request,
            IamMeta.showProjectDetailsAndStatus, hcClient);
    }

    /** 查询项目配额 该接口可以用于查询项目配额。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowProjectQuotaRequest 请求对象
     * @return CompletableFuture<ShowProjectQuotaResponse> */
    public CompletableFuture<ShowProjectQuotaResponse> showProjectQuotaAsync(ShowProjectQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showProjectQuota);
    }

    /** 查询项目配额 该接口可以用于查询项目配额。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowProjectQuotaRequest 请求对象
     * @return AsyncInvoker<ShowProjectQuotaRequest, ShowProjectQuotaResponse> */
    public AsyncInvoker<ShowProjectQuotaRequest, ShowProjectQuotaResponse> showProjectQuotaAsyncInvoker(
        ShowProjectQuotaRequest request) {
        return new AsyncInvoker<ShowProjectQuotaRequest, ShowProjectQuotaResponse>(request, IamMeta.showProjectQuota,
            hcClient);
    }

    /** 修改委托 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateAgencyRequest 请求对象
     * @return CompletableFuture<UpdateAgencyResponse> */
    public CompletableFuture<UpdateAgencyResponse> updateAgencyAsync(UpdateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateAgency);
    }

    /** 修改委托 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateAgencyRequest 请求对象
     * @return AsyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse> */
    public AsyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse> updateAgencyAsyncInvoker(
        UpdateAgencyRequest request) {
        return new AsyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse>(request, IamMeta.updateAgency, hcClient);
    }

    /** 修改委托自定义策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托自定义策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateAgencyCustomPolicyRequest 请求对象
     * @return CompletableFuture<UpdateAgencyCustomPolicyResponse> */
    public CompletableFuture<UpdateAgencyCustomPolicyResponse> updateAgencyCustomPolicyAsync(
        UpdateAgencyCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateAgencyCustomPolicy);
    }

    /** 修改委托自定义策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托自定义策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateAgencyCustomPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> */
    public AsyncInvoker<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> updateAgencyCustomPolicyAsyncInvoker(
        UpdateAgencyCustomPolicyRequest request) {
        return new AsyncInvoker<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse>(request,
            IamMeta.updateAgencyCustomPolicy, hcClient);
    }

    /** 修改云服务自定义策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改云服务自定义策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateCloudServiceCustomPolicyRequest 请求对象
     * @return CompletableFuture<UpdateCloudServiceCustomPolicyResponse> */
    public CompletableFuture<UpdateCloudServiceCustomPolicyResponse> updateCloudServiceCustomPolicyAsync(
        UpdateCloudServiceCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateCloudServiceCustomPolicy);
    }

    /** 修改云服务自定义策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改云服务自定义策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateCloudServiceCustomPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> */
    public AsyncInvoker<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> updateCloudServiceCustomPolicyAsyncInvoker(
        UpdateCloudServiceCustomPolicyRequest request) {
        return new AsyncInvoker<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse>(request,
            IamMeta.updateCloudServiceCustomPolicy, hcClient);
    }

    /** 修改账号接口访问策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号接口访问策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainApiAclPolicyRequest 请求对象
     * @return CompletableFuture<UpdateDomainApiAclPolicyResponse> */
    public CompletableFuture<UpdateDomainApiAclPolicyResponse> updateDomainApiAclPolicyAsync(
        UpdateDomainApiAclPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateDomainApiAclPolicy);
    }

    /** 修改账号接口访问策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号接口访问策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainApiAclPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> */
    public AsyncInvoker<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> updateDomainApiAclPolicyAsyncInvoker(
        UpdateDomainApiAclPolicyRequest request) {
        return new AsyncInvoker<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse>(request,
            IamMeta.updateDomainApiAclPolicy, hcClient);
    }

    /** 修改账号控制台访问策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号控制台访问策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainConsoleAclPolicyRequest 请求对象
     * @return CompletableFuture<UpdateDomainConsoleAclPolicyResponse> */
    public CompletableFuture<UpdateDomainConsoleAclPolicyResponse> updateDomainConsoleAclPolicyAsync(
        UpdateDomainConsoleAclPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateDomainConsoleAclPolicy);
    }

    /** 修改账号控制台访问策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号控制台访问策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainConsoleAclPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> */
    public AsyncInvoker<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> updateDomainConsoleAclPolicyAsyncInvoker(
        UpdateDomainConsoleAclPolicyRequest request) {
        return new AsyncInvoker<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse>(request,
            IamMeta.updateDomainConsoleAclPolicy, hcClient);
    }

    /** 为用户组授予所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/zh-cn_topic_0079496985.html)为用户组授予所有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainGroupInheritRoleRequest 请求对象
     * @return CompletableFuture<UpdateDomainGroupInheritRoleResponse> */
    public CompletableFuture<UpdateDomainGroupInheritRoleResponse> updateDomainGroupInheritRoleAsync(
        UpdateDomainGroupInheritRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateDomainGroupInheritRole);
    }

    /** 为用户组授予所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/zh-cn_topic_0079496985.html)为用户组授予所有项目服务权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainGroupInheritRoleRequest 请求对象
     * @return AsyncInvoker<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> */
    public AsyncInvoker<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> updateDomainGroupInheritRoleAsyncInvoker(
        UpdateDomainGroupInheritRoleRequest request) {
        return new AsyncInvoker<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse>(request,
            IamMeta.updateDomainGroupInheritRole, hcClient);
    }

    /** 修改账号登录策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号登录策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainLoginPolicyRequest 请求对象
     * @return CompletableFuture<UpdateDomainLoginPolicyResponse> */
    public CompletableFuture<UpdateDomainLoginPolicyResponse> updateDomainLoginPolicyAsync(
        UpdateDomainLoginPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateDomainLoginPolicy);
    }

    /** 修改账号登录策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号登录策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainLoginPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> */
    public AsyncInvoker<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> updateDomainLoginPolicyAsyncInvoker(
        UpdateDomainLoginPolicyRequest request) {
        return new AsyncInvoker<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse>(request,
            IamMeta.updateDomainLoginPolicy, hcClient);
    }

    /** 修改账号密码策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号密码策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainPasswordPolicyRequest 请求对象
     * @return CompletableFuture<UpdateDomainPasswordPolicyResponse> */
    public CompletableFuture<UpdateDomainPasswordPolicyResponse> updateDomainPasswordPolicyAsync(
        UpdateDomainPasswordPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateDomainPasswordPolicy);
    }

    /** 修改账号密码策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号密码策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainPasswordPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> */
    public AsyncInvoker<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> updateDomainPasswordPolicyAsyncInvoker(
        UpdateDomainPasswordPolicyRequest request) {
        return new AsyncInvoker<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse>(request,
            IamMeta.updateDomainPasswordPolicy, hcClient);
    }

    /** 修改账号操作保护策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainProtectPolicyRequest 请求对象
     * @return CompletableFuture<UpdateDomainProtectPolicyResponse> */
    public CompletableFuture<UpdateDomainProtectPolicyResponse> updateDomainProtectPolicyAsync(
        UpdateDomainProtectPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateDomainProtectPolicy);
    }

    /** 修改账号操作保护策略 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护策略。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainProtectPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> */
    public AsyncInvoker<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> updateDomainProtectPolicyAsyncInvoker(
        UpdateDomainProtectPolicyRequest request) {
        return new AsyncInvoker<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse>(request,
            IamMeta.updateDomainProtectPolicy, hcClient);
    }

    /** 修改OpenId Connect身份提供商配置 修改OpenId Connect身份提供商配置
     *
     * @param UpdateOpenIdConnectConfigRequest 请求对象
     * @return CompletableFuture<UpdateOpenIdConnectConfigResponse> */
    public CompletableFuture<UpdateOpenIdConnectConfigResponse> updateOpenIdConnectConfigAsync(
        UpdateOpenIdConnectConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateOpenIdConnectConfig);
    }

    /** 修改OpenId Connect身份提供商配置 修改OpenId Connect身份提供商配置
     *
     * @param UpdateOpenIdConnectConfigRequest 请求对象
     * @return AsyncInvoker<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse> */
    public AsyncInvoker<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse> updateOpenIdConnectConfigAsyncInvoker(
        UpdateOpenIdConnectConfigRequest request) {
        return new AsyncInvoker<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse>(request,
            IamMeta.updateOpenIdConnectConfig, hcClient);
    }

    /** 设置项目状态 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)设置项目状态。项目状态包括：正常、冻结。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateProjectStatusRequest 请求对象
     * @return CompletableFuture<UpdateProjectStatusResponse> */
    public CompletableFuture<UpdateProjectStatusResponse> updateProjectStatusAsync(UpdateProjectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateProjectStatus);
    }

    /** 设置项目状态 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)设置项目状态。项目状态包括：正常、冻结。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateProjectStatusRequest 请求对象
     * @return AsyncInvoker<UpdateProjectStatusRequest, UpdateProjectStatusResponse> */
    public AsyncInvoker<UpdateProjectStatusRequest, UpdateProjectStatusResponse> updateProjectStatusAsyncInvoker(
        UpdateProjectStatusRequest request) {
        return new AsyncInvoker<UpdateProjectStatusRequest, UpdateProjectStatusResponse>(request,
            IamMeta.updateProjectStatus, hcClient);
    }

    /** 创建永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)给IAM用户创建永久访问密钥，或IAM用户给自己创建永久访问密钥。
     * 访问密钥（Access Key ID/Secret Access
     * Key，简称AK/SK），是您通过开发工具（API、CLI、SDK）访问华为云时的身份凭证，不用于登录控制台。系统通过AK识别访问用户的身份，通过SK进行签名验证，通过加密签名验证可以确保请求的机密性、完整性和请求者身份的正确性。在控制台创建访问密钥的方式请参见：[访问密钥](https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html)
     * 。 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreatePermanentAccessKeyRequest 请求对象
     * @return CompletableFuture<CreatePermanentAccessKeyResponse> */
    public CompletableFuture<CreatePermanentAccessKeyResponse> createPermanentAccessKeyAsync(
        CreatePermanentAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createPermanentAccessKey);
    }

    /** 创建永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)给IAM用户创建永久访问密钥，或IAM用户给自己创建永久访问密钥。
     * 访问密钥（Access Key ID/Secret Access
     * Key，简称AK/SK），是您通过开发工具（API、CLI、SDK）访问华为云时的身份凭证，不用于登录控制台。系统通过AK识别访问用户的身份，通过SK进行签名验证，通过加密签名验证可以确保请求的机密性、完整性和请求者身份的正确性。在控制台创建访问密钥的方式请参见：[访问密钥](https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html)
     * 。 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreatePermanentAccessKeyRequest 请求对象
     * @return AsyncInvoker<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> */
    public AsyncInvoker<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> createPermanentAccessKeyAsyncInvoker(
        CreatePermanentAccessKeyRequest request) {
        return new AsyncInvoker<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse>(request,
            IamMeta.createPermanentAccessKey, hcClient);
    }

    /** 通过委托获取临时访问密钥 该接口可以用于通过委托来获取临时访问密钥（临时AK/SK）和securitytoken。
     * 临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html)
     * 。 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateTemporaryAccessKeyByAgencyRequest 请求对象
     * @return CompletableFuture<CreateTemporaryAccessKeyByAgencyResponse> */
    public CompletableFuture<CreateTemporaryAccessKeyByAgencyResponse> createTemporaryAccessKeyByAgencyAsync(
        CreateTemporaryAccessKeyByAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByAgency);
    }

    /** 通过委托获取临时访问密钥 该接口可以用于通过委托来获取临时访问密钥（临时AK/SK）和securitytoken。
     * 临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html)
     * 。 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateTemporaryAccessKeyByAgencyRequest 请求对象
     * @return AsyncInvoker<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> */
    public AsyncInvoker<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> createTemporaryAccessKeyByAgencyAsyncInvoker(
        CreateTemporaryAccessKeyByAgencyRequest request) {
        return new AsyncInvoker<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse>(
            request, IamMeta.createTemporaryAccessKeyByAgency, hcClient);
    }

    /** 通过token获取临时访问密钥 该接口可以用于通过token来获取临时AK/SK和securitytoken。
     * 临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html)。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateTemporaryAccessKeyByTokenRequest 请求对象
     * @return CompletableFuture<CreateTemporaryAccessKeyByTokenResponse> */
    public CompletableFuture<CreateTemporaryAccessKeyByTokenResponse> createTemporaryAccessKeyByTokenAsync(
        CreateTemporaryAccessKeyByTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByToken);
    }

    /** 通过token获取临时访问密钥 该接口可以用于通过token来获取临时AK/SK和securitytoken。
     * 临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html)。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateTemporaryAccessKeyByTokenRequest 请求对象
     * @return AsyncInvoker<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> */
    public AsyncInvoker<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> createTemporaryAccessKeyByTokenAsyncInvoker(
        CreateTemporaryAccessKeyByTokenRequest request) {
        return new AsyncInvoker<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse>(
            request, IamMeta.createTemporaryAccessKeyByToken, hcClient);
    }

    /** 删除指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除IAM用户的指定永久访问密钥，或IAM用户删除自己的指定永久访问密钥。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeletePermanentAccessKeyRequest 请求对象
     * @return CompletableFuture<DeletePermanentAccessKeyResponse> */
    public CompletableFuture<DeletePermanentAccessKeyResponse> deletePermanentAccessKeyAsync(
        DeletePermanentAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deletePermanentAccessKey);
    }

    /** 删除指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除IAM用户的指定永久访问密钥，或IAM用户删除自己的指定永久访问密钥。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeletePermanentAccessKeyRequest 请求对象
     * @return AsyncInvoker<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> */
    public AsyncInvoker<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> deletePermanentAccessKeyAsyncInvoker(
        DeletePermanentAccessKeyRequest request) {
        return new AsyncInvoker<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse>(request,
            IamMeta.deletePermanentAccessKey, hcClient);
    }

    /** 查询所有永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的所有永久访问密钥，或IAM用户查询自己的所有永久访问密钥。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListPermanentAccessKeysRequest 请求对象
     * @return CompletableFuture<ListPermanentAccessKeysResponse> */
    public CompletableFuture<ListPermanentAccessKeysResponse> listPermanentAccessKeysAsync(
        ListPermanentAccessKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listPermanentAccessKeys);
    }

    /** 查询所有永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的所有永久访问密钥，或IAM用户查询自己的所有永久访问密钥。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListPermanentAccessKeysRequest 请求对象
     * @return AsyncInvoker<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> */
    public AsyncInvoker<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> listPermanentAccessKeysAsyncInvoker(
        ListPermanentAccessKeysRequest request) {
        return new AsyncInvoker<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse>(request,
            IamMeta.listPermanentAccessKeys, hcClient);
    }

    /** 查询指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的指定永久访问密钥，或IAM用户查询自己的指定永久访问密钥。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowPermanentAccessKeyRequest 请求对象
     * @return CompletableFuture<ShowPermanentAccessKeyResponse> */
    public CompletableFuture<ShowPermanentAccessKeyResponse> showPermanentAccessKeyAsync(
        ShowPermanentAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showPermanentAccessKey);
    }

    /** 查询指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的指定永久访问密钥，或IAM用户查询自己的指定永久访问密钥。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowPermanentAccessKeyRequest 请求对象
     * @return AsyncInvoker<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> */
    public AsyncInvoker<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> showPermanentAccessKeyAsyncInvoker(
        ShowPermanentAccessKeyRequest request) {
        return new AsyncInvoker<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse>(request,
            IamMeta.showPermanentAccessKey, hcClient);
    }

    /** 修改指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户的指定永久访问密钥，或IAM用户修改自己的指定永久访问密钥。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdatePermanentAccessKeyRequest 请求对象
     * @return CompletableFuture<UpdatePermanentAccessKeyResponse> */
    public CompletableFuture<UpdatePermanentAccessKeyResponse> updatePermanentAccessKeyAsync(
        UpdatePermanentAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updatePermanentAccessKey);
    }

    /** 修改指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户的指定永久访问密钥，或IAM用户修改自己的指定永久访问密钥。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdatePermanentAccessKeyRequest 请求对象
     * @return AsyncInvoker<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> */
    public AsyncInvoker<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> updatePermanentAccessKeyAsyncInvoker(
        UpdatePermanentAccessKeyRequest request) {
        return new AsyncInvoker<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse>(request,
            IamMeta.updatePermanentAccessKey, hcClient);
    }

    /** 绑定MFA设备 该接口可以用于绑定MFA设备。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateBindingDeviceRequest 请求对象
     * @return CompletableFuture<CreateBindingDeviceResponse> */
    public CompletableFuture<CreateBindingDeviceResponse> createBindingDeviceAsync(CreateBindingDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createBindingDevice);
    }

    /** 绑定MFA设备 该接口可以用于绑定MFA设备。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateBindingDeviceRequest 请求对象
     * @return AsyncInvoker<CreateBindingDeviceRequest, CreateBindingDeviceResponse> */
    public AsyncInvoker<CreateBindingDeviceRequest, CreateBindingDeviceResponse> createBindingDeviceAsyncInvoker(
        CreateBindingDeviceRequest request) {
        return new AsyncInvoker<CreateBindingDeviceRequest, CreateBindingDeviceResponse>(request,
            IamMeta.createBindingDevice, hcClient);
    }

    /** 创建MFA设备 该接口可以用于创建MFA设备。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateMfaDeviceRequest 请求对象
     * @return CompletableFuture<CreateMfaDeviceResponse> */
    public CompletableFuture<CreateMfaDeviceResponse> createMfaDeviceAsync(CreateMfaDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createMfaDevice);
    }

    /** 创建MFA设备 该接口可以用于创建MFA设备。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateMfaDeviceRequest 请求对象
     * @return AsyncInvoker<CreateMfaDeviceRequest, CreateMfaDeviceResponse> */
    public AsyncInvoker<CreateMfaDeviceRequest, CreateMfaDeviceResponse> createMfaDeviceAsyncInvoker(
        CreateMfaDeviceRequest request) {
        return new AsyncInvoker<CreateMfaDeviceRequest, CreateMfaDeviceResponse>(request, IamMeta.createMfaDevice,
            hcClient);
    }

    /** 管理员创建IAM用户（推荐） 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateUserRequest 请求对象
     * @return CompletableFuture<CreateUserResponse> */
    public CompletableFuture<CreateUserResponse> createUserAsync(CreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createUser);
    }

    /** 管理员创建IAM用户（推荐） 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateUserRequest 请求对象
     * @return AsyncInvoker<CreateUserRequest, CreateUserResponse> */
    public AsyncInvoker<CreateUserRequest, CreateUserResponse> createUserAsyncInvoker(CreateUserRequest request) {
        return new AsyncInvoker<CreateUserRequest, CreateUserResponse>(request, IamMeta.createUser, hcClient);
    }

    /** 解绑MFA设备 该接口可以用于解绑MFA设备
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteBindingDeviceRequest 请求对象
     * @return CompletableFuture<DeleteBindingDeviceResponse> */
    public CompletableFuture<DeleteBindingDeviceResponse> deleteBindingDeviceAsync(DeleteBindingDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteBindingDevice);
    }

    /** 解绑MFA设备 该接口可以用于解绑MFA设备
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteBindingDeviceRequest 请求对象
     * @return AsyncInvoker<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> */
    public AsyncInvoker<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> deleteBindingDeviceAsyncInvoker(
        DeleteBindingDeviceRequest request) {
        return new AsyncInvoker<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse>(request,
            IamMeta.deleteBindingDevice, hcClient);
    }

    /** 删除MFA设备 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除MFA设备。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteMfaDeviceRequest 请求对象
     * @return CompletableFuture<DeleteMfaDeviceResponse> */
    public CompletableFuture<DeleteMfaDeviceResponse> deleteMfaDeviceAsync(DeleteMfaDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteMfaDevice);
    }

    /** 删除MFA设备 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除MFA设备。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteMfaDeviceRequest 请求对象
     * @return AsyncInvoker<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> */
    public AsyncInvoker<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> deleteMfaDeviceAsyncInvoker(
        DeleteMfaDeviceRequest request) {
        return new AsyncInvoker<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse>(request, IamMeta.deleteMfaDevice,
            hcClient);
    }

    /** 管理员创建IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。IAM用户首次登录时需要修改密码。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateUserRequest 请求对象
     * @return CompletableFuture<KeystoneCreateUserResponse> */
    public CompletableFuture<KeystoneCreateUserResponse> keystoneCreateUserAsync(KeystoneCreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateUser);
    }

    /** 管理员创建IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。IAM用户首次登录时需要修改密码。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateUserRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateUserRequest, KeystoneCreateUserResponse> */
    public AsyncInvoker<KeystoneCreateUserRequest, KeystoneCreateUserResponse> keystoneCreateUserAsyncInvoker(
        KeystoneCreateUserRequest request) {
        return new AsyncInvoker<KeystoneCreateUserRequest, KeystoneCreateUserResponse>(request,
            IamMeta.keystoneCreateUser, hcClient);
    }

    /** 管理员删除IAM用户 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除指定IAM用户。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteUserRequest 请求对象
     * @return CompletableFuture<KeystoneDeleteUserResponse> */
    public CompletableFuture<KeystoneDeleteUserResponse> keystoneDeleteUserAsync(KeystoneDeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteUser);
    }

    /** 管理员删除IAM用户 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除指定IAM用户。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteUserRequest 请求对象
     * @return AsyncInvoker<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> */
    public AsyncInvoker<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> keystoneDeleteUserAsyncInvoker(
        KeystoneDeleteUserRequest request) {
        return new AsyncInvoker<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse>(request,
            IamMeta.keystoneDeleteUser, hcClient);
    }

    /** 查询IAM用户所属用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户所属用户组，或IAM用户查询自己所属用户组。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListGroupsForUserRequest 请求对象
     * @return CompletableFuture<KeystoneListGroupsForUserResponse> */
    public CompletableFuture<KeystoneListGroupsForUserResponse> keystoneListGroupsForUserAsync(
        KeystoneListGroupsForUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListGroupsForUser);
    }

    /** 查询IAM用户所属用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户所属用户组，或IAM用户查询自己所属用户组。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListGroupsForUserRequest 请求对象
     * @return AsyncInvoker<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> */
    public AsyncInvoker<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> keystoneListGroupsForUserAsyncInvoker(
        KeystoneListGroupsForUserRequest request) {
        return new AsyncInvoker<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse>(request,
            IamMeta.keystoneListGroupsForUser, hcClient);
    }

    /** 管理员查询IAM用户列表 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListUsersRequest 请求对象
     * @return CompletableFuture<KeystoneListUsersResponse> */
    public CompletableFuture<KeystoneListUsersResponse> keystoneListUsersAsync(KeystoneListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListUsers);
    }

    /** 管理员查询IAM用户列表 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListUsersRequest 请求对象
     * @return AsyncInvoker<KeystoneListUsersRequest, KeystoneListUsersResponse> */
    public AsyncInvoker<KeystoneListUsersRequest, KeystoneListUsersResponse> keystoneListUsersAsyncInvoker(
        KeystoneListUsersRequest request) {
        return new AsyncInvoker<KeystoneListUsersRequest, KeystoneListUsersResponse>(request, IamMeta.keystoneListUsers,
            hcClient);
    }

    /** 查询IAM用户详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的用户详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowUserRequest 请求对象
     * @return CompletableFuture<KeystoneShowUserResponse> */
    public CompletableFuture<KeystoneShowUserResponse> keystoneShowUserAsync(KeystoneShowUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowUser);
    }

    /** 查询IAM用户详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的用户详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowUserRequest 请求对象
     * @return AsyncInvoker<KeystoneShowUserRequest, KeystoneShowUserResponse> */
    public AsyncInvoker<KeystoneShowUserRequest, KeystoneShowUserResponse> keystoneShowUserAsyncInvoker(
        KeystoneShowUserRequest request) {
        return new AsyncInvoker<KeystoneShowUserRequest, KeystoneShowUserResponse>(request, IamMeta.keystoneShowUser,
            hcClient);
    }

    /** 管理员修改IAM用户信息 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateUserByAdminRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateUserByAdminResponse> */
    public CompletableFuture<KeystoneUpdateUserByAdminResponse> keystoneUpdateUserByAdminAsync(
        KeystoneUpdateUserByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateUserByAdmin);
    }

    /** 管理员修改IAM用户信息 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateUserByAdminRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> */
    public AsyncInvoker<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> keystoneUpdateUserByAdminAsyncInvoker(
        KeystoneUpdateUserByAdminRequest request) {
        return new AsyncInvoker<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse>(request,
            IamMeta.keystoneUpdateUserByAdmin, hcClient);
    }

    /** 修改IAM用户密码 该接口可以用于IAM用户修改自己的密码。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateUserPasswordRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateUserPasswordResponse> */
    public CompletableFuture<KeystoneUpdateUserPasswordResponse> keystoneUpdateUserPasswordAsync(
        KeystoneUpdateUserPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateUserPassword);
    }

    /** 修改IAM用户密码 该接口可以用于IAM用户修改自己的密码。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateUserPasswordRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> */
    public AsyncInvoker<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> keystoneUpdateUserPasswordAsyncInvoker(
        KeystoneUpdateUserPasswordRequest request) {
        return new AsyncInvoker<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse>(request,
            IamMeta.keystoneUpdateUserPassword, hcClient);
    }

    /** 查询IAM用户的登录保护状态信息列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的登录保护状态列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListUserLoginProtectsRequest 请求对象
     * @return CompletableFuture<ListUserLoginProtectsResponse> */
    public CompletableFuture<ListUserLoginProtectsResponse> listUserLoginProtectsAsync(
        ListUserLoginProtectsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listUserLoginProtects);
    }

    /** 查询IAM用户的登录保护状态信息列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的登录保护状态列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListUserLoginProtectsRequest 请求对象
     * @return AsyncInvoker<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> */
    public AsyncInvoker<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> listUserLoginProtectsAsyncInvoker(
        ListUserLoginProtectsRequest request) {
        return new AsyncInvoker<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse>(request,
            IamMeta.listUserLoginProtects, hcClient);
    }

    /** 该接口可以用于获取MFA设备。 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的MFA绑定信息列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListUserMfaDevicesRequest 请求对象
     * @return CompletableFuture<ListUserMfaDevicesResponse> */
    public CompletableFuture<ListUserMfaDevicesResponse> listUserMfaDevicesAsync(ListUserMfaDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listUserMfaDevices);
    }

    /** 该接口可以用于获取MFA设备。 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的MFA绑定信息列表。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListUserMfaDevicesRequest 请求对象
     * @return AsyncInvoker<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse> */
    public AsyncInvoker<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse> listUserMfaDevicesAsyncInvoker(
        ListUserMfaDevicesRequest request) {
        return new AsyncInvoker<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse>(request,
            IamMeta.listUserMfaDevices, hcClient);
    }

    /** 查询IAM用户详情（推荐）
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserRequest 请求对象
     * @return CompletableFuture<ShowUserResponse> */
    public CompletableFuture<ShowUserResponse> showUserAsync(ShowUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showUser);
    }

    /** 查询IAM用户详情（推荐）
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的详情。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserRequest 请求对象
     * @return AsyncInvoker<ShowUserRequest, ShowUserResponse> */
    public AsyncInvoker<ShowUserRequest, ShowUserResponse> showUserAsyncInvoker(ShowUserRequest request) {
        return new AsyncInvoker<ShowUserRequest, ShowUserResponse>(request, IamMeta.showUser, hcClient);
    }

    /** 查询指定IAM用户的登录保护状态信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的登录保护状态信息，或IAM用户查询自己的登录保护状态信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserLoginProtectRequest 请求对象
     * @return CompletableFuture<ShowUserLoginProtectResponse> */
    public CompletableFuture<ShowUserLoginProtectResponse> showUserLoginProtectAsync(
        ShowUserLoginProtectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showUserLoginProtect);
    }

    /** 查询指定IAM用户的登录保护状态信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的登录保护状态信息，或IAM用户查询自己的登录保护状态信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserLoginProtectRequest 请求对象
     * @return AsyncInvoker<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> */
    public AsyncInvoker<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> showUserLoginProtectAsyncInvoker(
        ShowUserLoginProtectRequest request) {
        return new AsyncInvoker<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse>(request,
            IamMeta.showUserLoginProtect, hcClient);
    }

    /** 查询指定IAM用户的MFA绑定信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的MFA绑定信息，或IAM用户查询自己的MFA绑定信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserMfaDeviceRequest 请求对象
     * @return CompletableFuture<ShowUserMfaDeviceResponse> */
    public CompletableFuture<ShowUserMfaDeviceResponse> showUserMfaDeviceAsync(ShowUserMfaDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showUserMfaDevice);
    }

    /** 查询指定IAM用户的MFA绑定信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的MFA绑定信息，或IAM用户查询自己的MFA绑定信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserMfaDeviceRequest 请求对象
     * @return AsyncInvoker<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> */
    public AsyncInvoker<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> showUserMfaDeviceAsyncInvoker(
        ShowUserMfaDeviceRequest request) {
        return new AsyncInvoker<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse>(request, IamMeta.showUserMfaDevice,
            hcClient);
    }

    /** 修改IAM用户登录保护状态信息 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateLoginProtectRequest 请求对象
     * @return CompletableFuture<UpdateLoginProtectResponse> */
    public CompletableFuture<UpdateLoginProtectResponse> updateLoginProtectAsync(UpdateLoginProtectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateLoginProtect);
    }

    /** 修改IAM用户登录保护状态信息 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateLoginProtectRequest 请求对象
     * @return AsyncInvoker<UpdateLoginProtectRequest, UpdateLoginProtectResponse> */
    public AsyncInvoker<UpdateLoginProtectRequest, UpdateLoginProtectResponse> updateLoginProtectAsyncInvoker(
        UpdateLoginProtectRequest request) {
        return new AsyncInvoker<UpdateLoginProtectRequest, UpdateLoginProtectResponse>(request,
            IamMeta.updateLoginProtect, hcClient);
    }

    /** 管理员修改IAM用户信息（推荐） 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息 。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateUserRequest 请求对象
     * @return CompletableFuture<UpdateUserResponse> */
    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateUser);
    }

    /** 管理员修改IAM用户信息（推荐） 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息 。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateUserRequest 请求对象
     * @return AsyncInvoker<UpdateUserRequest, UpdateUserResponse> */
    public AsyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserAsyncInvoker(UpdateUserRequest request) {
        return new AsyncInvoker<UpdateUserRequest, UpdateUserResponse>(request, IamMeta.updateUser, hcClient);
    }

    /** 修改IAM用户信息（推荐） 该接口可以用于IAM用户修改自己的用户信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateUserInformationRequest 请求对象
     * @return CompletableFuture<UpdateUserInformationResponse> */
    public CompletableFuture<UpdateUserInformationResponse> updateUserInformationAsync(
        UpdateUserInformationRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateUserInformation);
    }

    /** 修改IAM用户信息（推荐） 该接口可以用于IAM用户修改自己的用户信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateUserInformationRequest 请求对象
     * @return AsyncInvoker<UpdateUserInformationRequest, UpdateUserInformationResponse> */
    public AsyncInvoker<UpdateUserInformationRequest, UpdateUserInformationResponse> updateUserInformationAsyncInvoker(
        UpdateUserInformationRequest request) {
        return new AsyncInvoker<UpdateUserInformationRequest, UpdateUserInformationResponse>(request,
            IamMeta.updateUserInformation, hcClient);
    }

    /** 获取委托Token 该接口可以用于获取委托方的token。
     * 例如：A账号希望B账号管理自己的某些资源，所以A账号创建了委托给B账号，则A账号为委托方，B账号为被委托方。那么B账号可以通过该接口获取委托token。B账号仅能使用该token管理A账号的委托资源，不能管理自己账号中的资源。如果B账号需要管理自己账号中的资源，则需要获取自己的用户token。
     * token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。
     *
     * @param KeystoneCreateAgencyTokenRequest 请求对象
     * @return CompletableFuture<KeystoneCreateAgencyTokenResponse> */
    public CompletableFuture<KeystoneCreateAgencyTokenResponse> keystoneCreateAgencyTokenAsync(
        KeystoneCreateAgencyTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateAgencyToken);
    }

    /** 获取委托Token 该接口可以用于获取委托方的token。
     * 例如：A账号希望B账号管理自己的某些资源，所以A账号创建了委托给B账号，则A账号为委托方，B账号为被委托方。那么B账号可以通过该接口获取委托token。B账号仅能使用该token管理A账号的委托资源，不能管理自己账号中的资源。如果B账号需要管理自己账号中的资源，则需要获取自己的用户token。
     * token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。
     *
     * @param KeystoneCreateAgencyTokenRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> */
    public AsyncInvoker<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> keystoneCreateAgencyTokenAsyncInvoker(
        KeystoneCreateAgencyTokenRequest request) {
        return new AsyncInvoker<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse>(request,
            IamMeta.keystoneCreateAgencyToken, hcClient);
    }

    /** 获取IAM用户Token（使用密码） 该接口可以用于通过用户名/密码的方式进行认证来获取IAM用户token。
     * token是系统颁发给IAM用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的IAM用户token进行鉴权。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。 &gt; -
     * 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。 &gt; -
     * 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     *
     * @param KeystoneCreateUserTokenByPasswordRequest 请求对象
     * @return CompletableFuture<KeystoneCreateUserTokenByPasswordResponse> */
    public CompletableFuture<KeystoneCreateUserTokenByPasswordResponse> keystoneCreateUserTokenByPasswordAsync(
        KeystoneCreateUserTokenByPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateUserTokenByPassword);
    }

    /** 获取IAM用户Token（使用密码） 该接口可以用于通过用户名/密码的方式进行认证来获取IAM用户token。
     * token是系统颁发给IAM用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的IAM用户token进行鉴权。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。 &gt; -
     * 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。 &gt; -
     * 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     *
     * @param KeystoneCreateUserTokenByPasswordRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse> */
    public AsyncInvoker<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse> keystoneCreateUserTokenByPasswordAsyncInvoker(
        KeystoneCreateUserTokenByPasswordRequest request) {
        return new AsyncInvoker<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse>(
            request, IamMeta.keystoneCreateUserTokenByPassword, hcClient);
    }

    /** 获取IAM用户Token（使用密码+虚拟MFA） 该接口可以用于通过用户名/密码+虚拟MFA的方式进行认证，在IAM用户开启了的登录保护功能，并选择通过虚拟MFA验证时获取IAM用户token。
     * token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。 &gt; -
     * 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。 &gt; -
     * 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     *
     * @param KeystoneCreateUserTokenByPasswordAndMfaRequest 请求对象
     * @return CompletableFuture<KeystoneCreateUserTokenByPasswordAndMfaResponse> */
    public CompletableFuture<KeystoneCreateUserTokenByPasswordAndMfaResponse> keystoneCreateUserTokenByPasswordAndMfaAsync(
        KeystoneCreateUserTokenByPasswordAndMfaRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateUserTokenByPasswordAndMfa);
    }

    /** 获取IAM用户Token（使用密码+虚拟MFA） 该接口可以用于通过用户名/密码+虚拟MFA的方式进行认证，在IAM用户开启了的登录保护功能，并选择通过虚拟MFA验证时获取IAM用户token。
     * token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。 &gt; -
     * 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。 &gt; -
     * 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     *
     * @param KeystoneCreateUserTokenByPasswordAndMfaRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateUserTokenByPasswordAndMfaRequest,
     *         KeystoneCreateUserTokenByPasswordAndMfaResponse> */
    public AsyncInvoker<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse> keystoneCreateUserTokenByPasswordAndMfaAsyncInvoker(
        KeystoneCreateUserTokenByPasswordAndMfaRequest request) {
        return new AsyncInvoker<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse>(
            request, IamMeta.keystoneCreateUserTokenByPasswordAndMfa, hcClient);
    }

    /** 校验Token的有效性
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)校验本账号中IAM用户token的有效性，或IAM用户校验自己token的有效性。管理员仅能校验本账号中IAM用户token的有效性，不能校验其他账号中IAM用户token的有效性。如果被校验的token有效，则返回该token的详细信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneValidateTokenRequest 请求对象
     * @return CompletableFuture<KeystoneValidateTokenResponse> */
    public CompletableFuture<KeystoneValidateTokenResponse> keystoneValidateTokenAsync(
        KeystoneValidateTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneValidateToken);
    }

    /** 校验Token的有效性
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)校验本账号中IAM用户token的有效性，或IAM用户校验自己token的有效性。管理员仅能校验本账号中IAM用户token的有效性，不能校验其他账号中IAM用户token的有效性。如果被校验的token有效，则返回该token的详细信息。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneValidateTokenRequest 请求对象
     * @return AsyncInvoker<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse> */
    public AsyncInvoker<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse> keystoneValidateTokenAsyncInvoker(
        KeystoneValidateTokenRequest request) {
        return new AsyncInvoker<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse>(request,
            IamMeta.keystoneValidateToken, hcClient);
    }

}
