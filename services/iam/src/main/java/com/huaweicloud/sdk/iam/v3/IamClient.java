package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.iam.v3.model.*;

public class IamClient {
    protected HcClient hcClient;

    public IamClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IamClient> newBuilder() {
        return new ClientBuilder<>(IamClient::new, "GlobalCredentials,BasicCredentials");
    }


    /**
     * 为委托授予所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithAllProjectsPermissionRequest 请求对象
     * @return AssociateAgencyWithAllProjectsPermissionResponse
     */
    public AssociateAgencyWithAllProjectsPermissionResponse associateAgencyWithAllProjectsPermission(AssociateAgencyWithAllProjectsPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateAgencyWithAllProjectsPermission);
    }

    /**
     * 为委托授予所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithAllProjectsPermissionRequest 请求对象
     * @return SyncInvoker<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse>
     */
    public SyncInvoker<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse> associateAgencyWithAllProjectsPermissionInvoker(AssociateAgencyWithAllProjectsPermissionRequest request) {
        return new SyncInvoker<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse>(request, IamMeta.associateAgencyWithAllProjectsPermission, hcClient);
    }

    /**
     * 为委托授予全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithDomainPermissionRequest 请求对象
     * @return AssociateAgencyWithDomainPermissionResponse
     */
    public AssociateAgencyWithDomainPermissionResponse associateAgencyWithDomainPermission(AssociateAgencyWithDomainPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateAgencyWithDomainPermission);
    }

    /**
     * 为委托授予全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithDomainPermissionRequest 请求对象
     * @return SyncInvoker<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse>
     */
    public SyncInvoker<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> associateAgencyWithDomainPermissionInvoker(AssociateAgencyWithDomainPermissionRequest request) {
        return new SyncInvoker<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse>(request, IamMeta.associateAgencyWithDomainPermission, hcClient);
    }

    /**
     * 为委托授予项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithProjectPermissionRequest 请求对象
     * @return AssociateAgencyWithProjectPermissionResponse
     */
    public AssociateAgencyWithProjectPermissionResponse associateAgencyWithProjectPermission(AssociateAgencyWithProjectPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateAgencyWithProjectPermission);
    }

    /**
     * 为委托授予项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param AssociateAgencyWithProjectPermissionRequest 请求对象
     * @return SyncInvoker<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse>
     */
    public SyncInvoker<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse> associateAgencyWithProjectPermissionInvoker(AssociateAgencyWithProjectPermissionRequest request) {
        return new SyncInvoker<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse>(request, IamMeta.associateAgencyWithProjectPermission, hcClient);
    }

    /**
     * 检查委托下是否具有所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)检查委托是否具有所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckAllProjectsPermissionForAgencyRequest 请求对象
     * @return CheckAllProjectsPermissionForAgencyResponse
     */
    public CheckAllProjectsPermissionForAgencyResponse checkAllProjectsPermissionForAgency(CheckAllProjectsPermissionForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.checkAllProjectsPermissionForAgency);
    }

    /**
     * 检查委托下是否具有所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)检查委托是否具有所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckAllProjectsPermissionForAgencyRequest 请求对象
     * @return SyncInvoker<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse>
     */
    public SyncInvoker<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> checkAllProjectsPermissionForAgencyInvoker(CheckAllProjectsPermissionForAgencyRequest request) {
        return new SyncInvoker<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse>(request, IamMeta.checkAllProjectsPermissionForAgency, hcClient);
    }

    /**
     * 查询委托是否拥有全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckDomainPermissionForAgencyRequest 请求对象
     * @return CheckDomainPermissionForAgencyResponse
     */
    public CheckDomainPermissionForAgencyResponse checkDomainPermissionForAgency(CheckDomainPermissionForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.checkDomainPermissionForAgency);
    }

    /**
     * 查询委托是否拥有全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckDomainPermissionForAgencyRequest 请求对象
     * @return SyncInvoker<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse>
     */
    public SyncInvoker<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> checkDomainPermissionForAgencyInvoker(CheckDomainPermissionForAgencyRequest request) {
        return new SyncInvoker<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse>(request, IamMeta.checkDomainPermissionForAgency, hcClient);
    }

    /**
     * 查询委托是否拥有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckProjectPermissionForAgencyRequest 请求对象
     * @return CheckProjectPermissionForAgencyResponse
     */
    public CheckProjectPermissionForAgencyResponse checkProjectPermissionForAgency(CheckProjectPermissionForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.checkProjectPermissionForAgency);
    }

    /**
     * 查询委托是否拥有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CheckProjectPermissionForAgencyRequest 请求对象
     * @return SyncInvoker<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse>
     */
    public SyncInvoker<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> checkProjectPermissionForAgencyInvoker(CheckProjectPermissionForAgencyRequest request) {
        return new SyncInvoker<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse>(request, IamMeta.checkProjectPermissionForAgency, hcClient);
    }

    /**
     * 创建委托
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateAgencyRequest 请求对象
     * @return CreateAgencyResponse
     */
    public CreateAgencyResponse createAgency(CreateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createAgency);
    }

    /**
     * 创建委托
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateAgencyRequest 请求对象
     * @return SyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public SyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyInvoker(CreateAgencyRequest request) {
        return new SyncInvoker<CreateAgencyRequest, CreateAgencyResponse>(request, IamMeta.createAgency, hcClient);
    }

    /**
     * 创建委托自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateAgencyCustomPolicyRequest 请求对象
     * @return CreateAgencyCustomPolicyResponse
     */
    public CreateAgencyCustomPolicyResponse createAgencyCustomPolicy(CreateAgencyCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createAgencyCustomPolicy);
    }

    /**
     * 创建委托自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateAgencyCustomPolicyRequest 请求对象
     * @return SyncInvoker<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse>
     */
    public SyncInvoker<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> createAgencyCustomPolicyInvoker(CreateAgencyCustomPolicyRequest request) {
        return new SyncInvoker<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse>(request, IamMeta.createAgencyCustomPolicy, hcClient);
    }

    /**
     * 创建云服务自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建云服务自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateCloudServiceCustomPolicyRequest 请求对象
     * @return CreateCloudServiceCustomPolicyResponse
     */
    public CreateCloudServiceCustomPolicyResponse createCloudServiceCustomPolicy(CreateCloudServiceCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createCloudServiceCustomPolicy);
    }

    /**
     * 创建云服务自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建云服务自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateCloudServiceCustomPolicyRequest 请求对象
     * @return SyncInvoker<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse>
     */
    public SyncInvoker<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> createCloudServiceCustomPolicyInvoker(CreateCloudServiceCustomPolicyRequest request) {
        return new SyncInvoker<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse>(request, IamMeta.createCloudServiceCustomPolicy, hcClient);
    }

    /**
     * 获取自定义代理登录票据
     * 该接口用于用于获取自定义代理登录票据logintoken。logintoken是系统颁发给自定义代理用户的登录票据，承载用户的身份、session等信息。调用自定义代理URL登录云服务控制台时，可以使用本接口获取的logintoken进行认证。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。    &gt; - logintoken的有效期为10分钟。
     *
     * @param CreateLoginTokenRequest 请求对象
     * @return CreateLoginTokenResponse
     */
    public CreateLoginTokenResponse createLoginToken(CreateLoginTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createLoginToken);
    }

    /**
     * 获取自定义代理登录票据
     * 该接口用于用于获取自定义代理登录票据logintoken。logintoken是系统颁发给自定义代理用户的登录票据，承载用户的身份、session等信息。调用自定义代理URL登录云服务控制台时，可以使用本接口获取的logintoken进行认证。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。    &gt; - logintoken的有效期为10分钟。
     *
     * @param CreateLoginTokenRequest 请求对象
     * @return SyncInvoker<CreateLoginTokenRequest, CreateLoginTokenResponse>
     */
    public SyncInvoker<CreateLoginTokenRequest, CreateLoginTokenResponse> createLoginTokenInvoker(CreateLoginTokenRequest request) {
        return new SyncInvoker<CreateLoginTokenRequest, CreateLoginTokenResponse>(request, IamMeta.createLoginToken, hcClient);
    }

    /**
     * 导入Metadata文件
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)导入Metadata文件。    账号在使用联邦认证功能前，需要先将Metadata文件导入到IAM中。Metadata文件是SAML 2.0协议约定的接口文件，包含访问接口地址和证书信息，请找企业管理员获取企业IdP的Metadata文件。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateMetadataRequest 请求对象
     * @return CreateMetadataResponse
     */
    public CreateMetadataResponse createMetadata(CreateMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createMetadata);
    }

    /**
     * 导入Metadata文件
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)导入Metadata文件。    账号在使用联邦认证功能前，需要先将Metadata文件导入到IAM中。Metadata文件是SAML 2.0协议约定的接口文件，包含访问接口地址和证书信息，请找企业管理员获取企业IdP的Metadata文件。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateMetadataRequest 请求对象
     * @return SyncInvoker<CreateMetadataRequest, CreateMetadataResponse>
     */
    public SyncInvoker<CreateMetadataRequest, CreateMetadataResponse> createMetadataInvoker(CreateMetadataRequest request) {
        return new SyncInvoker<CreateMetadataRequest, CreateMetadataResponse>(request, IamMeta.createMetadata, hcClient);
    }

    /**
     * 创建OpenId Connect身份提供商配置
     * 创建OpenId Connect身份提供商配置
     *
     * @param CreateOpenIdConnectConfigRequest 请求对象
     * @return CreateOpenIdConnectConfigResponse
     */
    public CreateOpenIdConnectConfigResponse createOpenIdConnectConfig(CreateOpenIdConnectConfigRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createOpenIdConnectConfig);
    }

    /**
     * 创建OpenId Connect身份提供商配置
     * 创建OpenId Connect身份提供商配置
     *
     * @param CreateOpenIdConnectConfigRequest 请求对象
     * @return SyncInvoker<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse>
     */
    public SyncInvoker<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse> createOpenIdConnectConfigInvoker(CreateOpenIdConnectConfigRequest request) {
        return new SyncInvoker<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse>(request, IamMeta.createOpenIdConnectConfig, hcClient);
    }

    /**
     * 获取联邦认证token(OpenId Connect Id token方式)
     * 获取联邦认证token(OpenId Connect Id token方式)
     *
     * @param CreateTokenWithIdTokenRequest 请求对象
     * @return CreateTokenWithIdTokenResponse
     */
    public CreateTokenWithIdTokenResponse createTokenWithIdToken(CreateTokenWithIdTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createTokenWithIdToken);
    }

    /**
     * 获取联邦认证token(OpenId Connect Id token方式)
     * 获取联邦认证token(OpenId Connect Id token方式)
     *
     * @param CreateTokenWithIdTokenRequest 请求对象
     * @return SyncInvoker<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse>
     */
    public SyncInvoker<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse> createTokenWithIdTokenInvoker(CreateTokenWithIdTokenRequest request) {
        return new SyncInvoker<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse>(request, IamMeta.createTokenWithIdToken, hcClient);
    }

    /**
     * 删除委托
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除委托。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteAgencyRequest 请求对象
     * @return DeleteAgencyResponse
     */
    public DeleteAgencyResponse deleteAgency(DeleteAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteAgency);
    }

    /**
     * 删除委托
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除委托。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteAgencyRequest 请求对象
     * @return SyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>
     */
    public SyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgencyInvoker(DeleteAgencyRequest request) {
        return new SyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>(request, IamMeta.deleteAgency, hcClient);
    }

    /**
     * 删除自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteCustomPolicyRequest 请求对象
     * @return DeleteCustomPolicyResponse
     */
    public DeleteCustomPolicyResponse deleteCustomPolicy(DeleteCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteCustomPolicy);
    }

    /**
     * 删除自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteCustomPolicyRequest 请求对象
     * @return SyncInvoker<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse>
     */
    public SyncInvoker<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> deleteCustomPolicyInvoker(DeleteCustomPolicyRequest request) {
        return new SyncInvoker<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse>(request, IamMeta.deleteCustomPolicy, hcClient);
    }

    /**
     * 移除用户组的所有项目服务权限
     * 该接口可以用于移除用户组的所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteDomainGroupInheritedRoleRequest 请求对象
     * @return DeleteDomainGroupInheritedRoleResponse
     */
    public DeleteDomainGroupInheritedRoleResponse deleteDomainGroupInheritedRole(DeleteDomainGroupInheritedRoleRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteDomainGroupInheritedRole);
    }

    /**
     * 移除用户组的所有项目服务权限
     * 该接口可以用于移除用户组的所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteDomainGroupInheritedRoleRequest 请求对象
     * @return SyncInvoker<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse>
     */
    public SyncInvoker<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> deleteDomainGroupInheritedRoleInvoker(DeleteDomainGroupInheritedRoleRequest request) {
        return new SyncInvoker<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse>(request, IamMeta.deleteDomainGroupInheritedRole, hcClient);
    }

    /**
     * 添加IAM用户到用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)添加IAM用户到用户组。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAddUserToGroupRequest 请求对象
     * @return KeystoneAddUserToGroupResponse
     */
    public KeystoneAddUserToGroupResponse keystoneAddUserToGroup(KeystoneAddUserToGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAddUserToGroup);
    }

    /**
     * 添加IAM用户到用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)添加IAM用户到用户组。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAddUserToGroupRequest 请求对象
     * @return SyncInvoker<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse>
     */
    public SyncInvoker<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> keystoneAddUserToGroupInvoker(KeystoneAddUserToGroupRequest request) {
        return new SyncInvoker<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse>(request, IamMeta.keystoneAddUserToGroup, hcClient);
    }

    /**
     * 为用户组授予全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAssociateGroupWithDomainPermissionRequest 请求对象
     * @return KeystoneAssociateGroupWithDomainPermissionResponse
     */
    public KeystoneAssociateGroupWithDomainPermissionResponse keystoneAssociateGroupWithDomainPermission(KeystoneAssociateGroupWithDomainPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithDomainPermission);
    }

    /**
     * 为用户组授予全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAssociateGroupWithDomainPermissionRequest 请求对象
     * @return SyncInvoker<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse>
     */
    public SyncInvoker<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse> keystoneAssociateGroupWithDomainPermissionInvoker(KeystoneAssociateGroupWithDomainPermissionRequest request) {
        return new SyncInvoker<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse>(request, IamMeta.keystoneAssociateGroupWithDomainPermission, hcClient);
    }

    /**
     * 为用户组授予项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAssociateGroupWithProjectPermissionRequest 请求对象
     * @return KeystoneAssociateGroupWithProjectPermissionResponse
     */
    public KeystoneAssociateGroupWithProjectPermissionResponse keystoneAssociateGroupWithProjectPermission(KeystoneAssociateGroupWithProjectPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithProjectPermission);
    }

    /**
     * 为用户组授予项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneAssociateGroupWithProjectPermissionRequest 请求对象
     * @return SyncInvoker<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse>
     */
    public SyncInvoker<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse> keystoneAssociateGroupWithProjectPermissionInvoker(KeystoneAssociateGroupWithProjectPermissionRequest request) {
        return new SyncInvoker<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse>(request, IamMeta.keystoneAssociateGroupWithProjectPermission, hcClient);
    }

    /**
     * 查询用户组是否拥有全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckDomainPermissionForGroupRequest 请求对象
     * @return KeystoneCheckDomainPermissionForGroupResponse
     */
    public KeystoneCheckDomainPermissionForGroupResponse keystoneCheckDomainPermissionForGroup(KeystoneCheckDomainPermissionForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckDomainPermissionForGroup);
    }

    /**
     * 查询用户组是否拥有全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckDomainPermissionForGroupRequest 请求对象
     * @return SyncInvoker<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse>
     */
    public SyncInvoker<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse> keystoneCheckDomainPermissionForGroupInvoker(KeystoneCheckDomainPermissionForGroupRequest request) {
        return new SyncInvoker<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse>(request, IamMeta.keystoneCheckDomainPermissionForGroup, hcClient);
    }

    /**
     * 查询用户组是否拥有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckProjectPermissionForGroupRequest 请求对象
     * @return KeystoneCheckProjectPermissionForGroupResponse
     */
    public KeystoneCheckProjectPermissionForGroupResponse keystoneCheckProjectPermissionForGroup(KeystoneCheckProjectPermissionForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckProjectPermissionForGroup);
    }

    /**
     * 查询用户组是否拥有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckProjectPermissionForGroupRequest 请求对象
     * @return SyncInvoker<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse>
     */
    public SyncInvoker<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse> keystoneCheckProjectPermissionForGroupInvoker(KeystoneCheckProjectPermissionForGroupRequest request) {
        return new SyncInvoker<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse>(request, IamMeta.keystoneCheckProjectPermissionForGroup, hcClient);
    }

    /**
     * 查询IAM用户是否在用户组中
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户是否在用户组中。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckUserInGroupRequest 请求对象
     * @return KeystoneCheckUserInGroupResponse
     */
    public KeystoneCheckUserInGroupResponse keystoneCheckUserInGroup(KeystoneCheckUserInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckUserInGroup);
    }

    /**
     * 查询IAM用户是否在用户组中
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户是否在用户组中。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckUserInGroupRequest 请求对象
     * @return SyncInvoker<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse>
     */
    public SyncInvoker<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> keystoneCheckUserInGroupInvoker(KeystoneCheckUserInGroupRequest request) {
        return new SyncInvoker<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse>(request, IamMeta.keystoneCheckUserInGroup, hcClient);
    }

    /**
     * 查询用户组是否拥有所有项目指定权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有所有项目指定权限。  该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckroleForGroupRequest 请求对象
     * @return KeystoneCheckroleForGroupResponse
     */
    public KeystoneCheckroleForGroupResponse keystoneCheckroleForGroup(KeystoneCheckroleForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckroleForGroup);
    }

    /**
     * 查询用户组是否拥有所有项目指定权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有所有项目指定权限。  该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCheckroleForGroupRequest 请求对象
     * @return SyncInvoker<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse>
     */
    public SyncInvoker<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> keystoneCheckroleForGroupInvoker(KeystoneCheckroleForGroupRequest request) {
        return new SyncInvoker<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse>(request, IamMeta.keystoneCheckroleForGroup, hcClient);
    }

    /**
     * 创建用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建用户组。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateGroupRequest 请求对象
     * @return KeystoneCreateGroupResponse
     */
    public KeystoneCreateGroupResponse keystoneCreateGroup(KeystoneCreateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateGroup);
    }

    /**
     * 创建用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建用户组。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateGroupRequest 请求对象
     * @return SyncInvoker<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse>
     */
    public SyncInvoker<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> keystoneCreateGroupInvoker(KeystoneCreateGroupRequest request) {
        return new SyncInvoker<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse>(request, IamMeta.keystoneCreateGroup, hcClient);
    }

    /**
     * 注册身份提供商
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册身份提供商。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateIdentityProviderRequest 请求对象
     * @return KeystoneCreateIdentityProviderResponse
     */
    public KeystoneCreateIdentityProviderResponse keystoneCreateIdentityProvider(KeystoneCreateIdentityProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateIdentityProvider);
    }

    /**
     * 注册身份提供商
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册身份提供商。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateIdentityProviderRequest 请求对象
     * @return SyncInvoker<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse>
     */
    public SyncInvoker<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> keystoneCreateIdentityProviderInvoker(KeystoneCreateIdentityProviderRequest request) {
        return new SyncInvoker<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse>(request, IamMeta.keystoneCreateIdentityProvider, hcClient);
    }

    /**
     * 注册映射
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册映射。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateMappingRequest 请求对象
     * @return KeystoneCreateMappingResponse
     */
    public KeystoneCreateMappingResponse keystoneCreateMapping(KeystoneCreateMappingRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateMapping);
    }

    /**
     * 注册映射
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册映射。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateMappingRequest 请求对象
     * @return SyncInvoker<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse>
     */
    public SyncInvoker<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> keystoneCreateMappingInvoker(KeystoneCreateMappingRequest request) {
        return new SyncInvoker<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse>(request, IamMeta.keystoneCreateMapping, hcClient);
    }

    /**
     * 创建项目
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建项目。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateProjectRequest 请求对象
     * @return KeystoneCreateProjectResponse
     */
    public KeystoneCreateProjectResponse keystoneCreateProject(KeystoneCreateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateProject);
    }

    /**
     * 创建项目
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建项目。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateProjectRequest 请求对象
     * @return SyncInvoker<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse>
     */
    public SyncInvoker<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> keystoneCreateProjectInvoker(KeystoneCreateProjectRequest request) {
        return new SyncInvoker<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse>(request, IamMeta.keystoneCreateProject, hcClient);
    }

    /**
     * 注册协议
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册协议（将协议关联到某一身份提供商）。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateProtocolRequest 请求对象
     * @return KeystoneCreateProtocolResponse
     */
    public KeystoneCreateProtocolResponse keystoneCreateProtocol(KeystoneCreateProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateProtocol);
    }

    /**
     * 注册协议
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册协议（将协议关联到某一身份提供商）。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateProtocolRequest 请求对象
     * @return SyncInvoker<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse>
     */
    public SyncInvoker<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> keystoneCreateProtocolInvoker(KeystoneCreateProtocolRequest request) {
        return new SyncInvoker<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse>(request, IamMeta.keystoneCreateProtocol, hcClient);
    }

    /**
     * 获取联邦认证scoped token
     * 该接口可以用于通过联邦认证方式获取scoped token。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateScopedTokenRequest 请求对象
     * @return KeystoneCreateScopedTokenResponse
     */
    public KeystoneCreateScopedTokenResponse keystoneCreateScopedToken(KeystoneCreateScopedTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateScopedToken);
    }

    /**
     * 获取联邦认证scoped token
     * 该接口可以用于通过联邦认证方式获取scoped token。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateScopedTokenRequest 请求对象
     * @return SyncInvoker<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse>
     */
    public SyncInvoker<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> keystoneCreateScopedTokenInvoker(KeystoneCreateScopedTokenRequest request) {
        return new SyncInvoker<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse>(request, IamMeta.keystoneCreateScopedToken, hcClient);
    }

    /**
     * 删除用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除用户组。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteGroupRequest 请求对象
     * @return KeystoneDeleteGroupResponse
     */
    public KeystoneDeleteGroupResponse keystoneDeleteGroup(KeystoneDeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteGroup);
    }

    /**
     * 删除用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除用户组。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteGroupRequest 请求对象
     * @return SyncInvoker<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse>
     */
    public SyncInvoker<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> keystoneDeleteGroupInvoker(KeystoneDeleteGroupRequest request) {
        return new SyncInvoker<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse>(request, IamMeta.keystoneDeleteGroup, hcClient);
    }

    /**
     * 删除身份提供商
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html) 删除身份提供商。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteIdentityProviderRequest 请求对象
     * @return KeystoneDeleteIdentityProviderResponse
     */
    public KeystoneDeleteIdentityProviderResponse keystoneDeleteIdentityProvider(KeystoneDeleteIdentityProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteIdentityProvider);
    }

    /**
     * 删除身份提供商
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html) 删除身份提供商。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteIdentityProviderRequest 请求对象
     * @return SyncInvoker<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse>
     */
    public SyncInvoker<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> keystoneDeleteIdentityProviderInvoker(KeystoneDeleteIdentityProviderRequest request) {
        return new SyncInvoker<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse>(request, IamMeta.keystoneDeleteIdentityProvider, hcClient);
    }

    /**
     * 删除映射
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除映射。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteMappingRequest 请求对象
     * @return KeystoneDeleteMappingResponse
     */
    public KeystoneDeleteMappingResponse keystoneDeleteMapping(KeystoneDeleteMappingRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteMapping);
    }

    /**
     * 删除映射
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除映射。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteMappingRequest 请求对象
     * @return SyncInvoker<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse>
     */
    public SyncInvoker<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> keystoneDeleteMappingInvoker(KeystoneDeleteMappingRequest request) {
        return new SyncInvoker<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse>(request, IamMeta.keystoneDeleteMapping, hcClient);
    }

    /**
     * 删除协议
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除协议。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteProtocolRequest 请求对象
     * @return KeystoneDeleteProtocolResponse
     */
    public KeystoneDeleteProtocolResponse keystoneDeleteProtocol(KeystoneDeleteProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteProtocol);
    }

    /**
     * 删除协议
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除协议。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteProtocolRequest 请求对象
     * @return SyncInvoker<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse>
     */
    public SyncInvoker<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> keystoneDeleteProtocolInvoker(KeystoneDeleteProtocolRequest request) {
        return new SyncInvoker<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse>(request, IamMeta.keystoneDeleteProtocol, hcClient);
    }

    /**
     * 查询用户组的所有项目权限列表
     * 该接口可以用于管理员查询用户组所有项目服务权限列表。  \\n\\n该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAllProjectPermissionsForGroupRequest 请求对象
     * @return KeystoneListAllProjectPermissionsForGroupResponse
     */
    public KeystoneListAllProjectPermissionsForGroupResponse keystoneListAllProjectPermissionsForGroup(KeystoneListAllProjectPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListAllProjectPermissionsForGroup);
    }

    /**
     * 查询用户组的所有项目权限列表
     * 该接口可以用于管理员查询用户组所有项目服务权限列表。  \\n\\n该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAllProjectPermissionsForGroupRequest 请求对象
     * @return SyncInvoker<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse>
     */
    public SyncInvoker<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse> keystoneListAllProjectPermissionsForGroupInvoker(KeystoneListAllProjectPermissionsForGroupRequest request) {
        return new SyncInvoker<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse>(request, IamMeta.keystoneListAllProjectPermissionsForGroup, hcClient);
    }

    /**
     * 查询IAM用户可以访问的账号详情
     * 该接口可以用于查询IAM用户可以用访问的账号详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAuthDomainsRequest 请求对象
     * @return KeystoneListAuthDomainsResponse
     */
    public KeystoneListAuthDomainsResponse keystoneListAuthDomains(KeystoneListAuthDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListAuthDomains);
    }

    /**
     * 查询IAM用户可以访问的账号详情
     * 该接口可以用于查询IAM用户可以用访问的账号详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAuthDomainsRequest 请求对象
     * @return SyncInvoker<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse>
     */
    public SyncInvoker<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> keystoneListAuthDomainsInvoker(KeystoneListAuthDomainsRequest request) {
        return new SyncInvoker<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse>(request, IamMeta.keystoneListAuthDomains, hcClient);
    }

    /**
     * 查询IAM用户可以访问的项目列表
     * 该接口可以用于查询IAM用户可以访问的项目列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAuthProjectsRequest 请求对象
     * @return KeystoneListAuthProjectsResponse
     */
    public KeystoneListAuthProjectsResponse keystoneListAuthProjects(KeystoneListAuthProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListAuthProjects);
    }

    /**
     * 查询IAM用户可以访问的项目列表
     * 该接口可以用于查询IAM用户可以访问的项目列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListAuthProjectsRequest 请求对象
     * @return SyncInvoker<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse>
     */
    public SyncInvoker<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse> keystoneListAuthProjectsInvoker(KeystoneListAuthProjectsRequest request) {
        return new SyncInvoker<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse>(request, IamMeta.keystoneListAuthProjects, hcClient);
    }

    /**
     * 查询全局服务中的用户组权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的用户组权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListDomainPermissionsForGroupRequest 请求对象
     * @return KeystoneListDomainPermissionsForGroupResponse
     */
    public KeystoneListDomainPermissionsForGroupResponse keystoneListDomainPermissionsForGroup(KeystoneListDomainPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListDomainPermissionsForGroup);
    }

    /**
     * 查询全局服务中的用户组权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的用户组权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListDomainPermissionsForGroupRequest 请求对象
     * @return SyncInvoker<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse>
     */
    public SyncInvoker<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> keystoneListDomainPermissionsForGroupInvoker(KeystoneListDomainPermissionsForGroupRequest request) {
        return new SyncInvoker<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse>(request, IamMeta.keystoneListDomainPermissionsForGroup, hcClient);
    }

    /**
     * 查询终端节点列表
     * 该接口可以用于查询终端节点列表。终端节点用来提供服务访问入口。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListEndpointsRequest 请求对象
     * @return KeystoneListEndpointsResponse
     */
    public KeystoneListEndpointsResponse keystoneListEndpoints(KeystoneListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListEndpoints);
    }

    /**
     * 查询终端节点列表
     * 该接口可以用于查询终端节点列表。终端节点用来提供服务访问入口。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListEndpointsRequest 请求对象
     * @return SyncInvoker<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse>
     */
    public SyncInvoker<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> keystoneListEndpointsInvoker(KeystoneListEndpointsRequest request) {
        return new SyncInvoker<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse>(request, IamMeta.keystoneListEndpoints, hcClient);
    }

    /**
     * 查询用户组列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListGroupsRequest 请求对象
     * @return KeystoneListGroupsResponse
     */
    public KeystoneListGroupsResponse keystoneListGroups(KeystoneListGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListGroups);
    }

    /**
     * 查询用户组列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListGroupsRequest 请求对象
     * @return SyncInvoker<KeystoneListGroupsRequest, KeystoneListGroupsResponse>
     */
    public SyncInvoker<KeystoneListGroupsRequest, KeystoneListGroupsResponse> keystoneListGroupsInvoker(KeystoneListGroupsRequest request) {
        return new SyncInvoker<KeystoneListGroupsRequest, KeystoneListGroupsResponse>(request, IamMeta.keystoneListGroups, hcClient);
    }

    /**
     * 查询身份提供商列表
     * 该接口可以用于查询身份提供商列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListIdentityProvidersRequest 请求对象
     * @return KeystoneListIdentityProvidersResponse
     */
    public KeystoneListIdentityProvidersResponse keystoneListIdentityProviders(KeystoneListIdentityProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListIdentityProviders);
    }

    /**
     * 查询身份提供商列表
     * 该接口可以用于查询身份提供商列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListIdentityProvidersRequest 请求对象
     * @return SyncInvoker<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse>
     */
    public SyncInvoker<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> keystoneListIdentityProvidersInvoker(KeystoneListIdentityProvidersRequest request) {
        return new SyncInvoker<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse>(request, IamMeta.keystoneListIdentityProviders, hcClient);
    }

    /**
     * 查询映射列表
     * 该接口可以用于查询映射列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListMappingsRequest 请求对象
     * @return KeystoneListMappingsResponse
     */
    public KeystoneListMappingsResponse keystoneListMappings(KeystoneListMappingsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListMappings);
    }

    /**
     * 查询映射列表
     * 该接口可以用于查询映射列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListMappingsRequest 请求对象
     * @return SyncInvoker<KeystoneListMappingsRequest, KeystoneListMappingsResponse>
     */
    public SyncInvoker<KeystoneListMappingsRequest, KeystoneListMappingsResponse> keystoneListMappingsInvoker(KeystoneListMappingsRequest request) {
        return new SyncInvoker<KeystoneListMappingsRequest, KeystoneListMappingsResponse>(request, IamMeta.keystoneListMappings, hcClient);
    }

    /**
     * 查询权限列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListPermissionsRequest 请求对象
     * @return KeystoneListPermissionsResponse
     */
    public KeystoneListPermissionsResponse keystoneListPermissions(KeystoneListPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListPermissions);
    }

    /**
     * 查询权限列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListPermissionsRequest 请求对象
     * @return SyncInvoker<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse>
     */
    public SyncInvoker<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> keystoneListPermissionsInvoker(KeystoneListPermissionsRequest request) {
        return new SyncInvoker<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse>(request, IamMeta.keystoneListPermissions, hcClient);
    }

    /**
     * 查询项目服务中的用户组权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的用户组权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectPermissionsForGroupRequest 请求对象
     * @return KeystoneListProjectPermissionsForGroupResponse
     */
    public KeystoneListProjectPermissionsForGroupResponse keystoneListProjectPermissionsForGroup(KeystoneListProjectPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjectPermissionsForGroup);
    }

    /**
     * 查询项目服务中的用户组权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的用户组权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectPermissionsForGroupRequest 请求对象
     * @return SyncInvoker<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse>
     */
    public SyncInvoker<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse> keystoneListProjectPermissionsForGroupInvoker(KeystoneListProjectPermissionsForGroupRequest request) {
        return new SyncInvoker<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse>(request, IamMeta.keystoneListProjectPermissionsForGroup, hcClient);
    }

    /**
     * 查询指定条件下的项目列表
     * 该接口可以用于查询指定条件下的项目列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectsRequest 请求对象
     * @return KeystoneListProjectsResponse
     */
    public KeystoneListProjectsResponse keystoneListProjects(KeystoneListProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjects);
    }

    /**
     * 查询指定条件下的项目列表
     * 该接口可以用于查询指定条件下的项目列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectsRequest 请求对象
     * @return SyncInvoker<KeystoneListProjectsRequest, KeystoneListProjectsResponse>
     */
    public SyncInvoker<KeystoneListProjectsRequest, KeystoneListProjectsResponse> keystoneListProjectsInvoker(KeystoneListProjectsRequest request) {
        return new SyncInvoker<KeystoneListProjectsRequest, KeystoneListProjectsResponse>(request, IamMeta.keystoneListProjects, hcClient);
    }

    /**
     * 查询指定IAM用户的项目列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的项目列表，或IAM用户查询自己的项目列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectsForUserRequest 请求对象
     * @return KeystoneListProjectsForUserResponse
     */
    public KeystoneListProjectsForUserResponse keystoneListProjectsForUser(KeystoneListProjectsForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjectsForUser);
    }

    /**
     * 查询指定IAM用户的项目列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的项目列表，或IAM用户查询自己的项目列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProjectsForUserRequest 请求对象
     * @return SyncInvoker<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse>
     */
    public SyncInvoker<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> keystoneListProjectsForUserInvoker(KeystoneListProjectsForUserRequest request) {
        return new SyncInvoker<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse>(request, IamMeta.keystoneListProjectsForUser, hcClient);
    }

    /**
     * 查询协议列表
     * 该接口可以用于查询协议列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProtocolsRequest 请求对象
     * @return KeystoneListProtocolsResponse
     */
    public KeystoneListProtocolsResponse keystoneListProtocols(KeystoneListProtocolsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProtocols);
    }

    /**
     * 查询协议列表
     * 该接口可以用于查询协议列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListProtocolsRequest 请求对象
     * @return SyncInvoker<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse>
     */
    public SyncInvoker<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> keystoneListProtocolsInvoker(KeystoneListProtocolsRequest request) {
        return new SyncInvoker<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse>(request, IamMeta.keystoneListProtocols, hcClient);
    }

    /**
     * 查询区域列表
     * 该接口可以用于查询区域列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListRegionsRequest 请求对象
     * @return KeystoneListRegionsResponse
     */
    public KeystoneListRegionsResponse keystoneListRegions(KeystoneListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListRegions);
    }

    /**
     * 查询区域列表
     * 该接口可以用于查询区域列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListRegionsRequest 请求对象
     * @return SyncInvoker<KeystoneListRegionsRequest, KeystoneListRegionsResponse>
     */
    public SyncInvoker<KeystoneListRegionsRequest, KeystoneListRegionsResponse> keystoneListRegionsInvoker(KeystoneListRegionsRequest request) {
        return new SyncInvoker<KeystoneListRegionsRequest, KeystoneListRegionsResponse>(request, IamMeta.keystoneListRegions, hcClient);
    }

    /**
     * 查询服务列表
     * 该接口可以用于查询服务列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListServicesRequest 请求对象
     * @return KeystoneListServicesResponse
     */
    public KeystoneListServicesResponse keystoneListServices(KeystoneListServicesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListServices);
    }

    /**
     * 查询服务列表
     * 该接口可以用于查询服务列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListServicesRequest 请求对象
     * @return SyncInvoker<KeystoneListServicesRequest, KeystoneListServicesResponse>
     */
    public SyncInvoker<KeystoneListServicesRequest, KeystoneListServicesResponse> keystoneListServicesInvoker(KeystoneListServicesRequest request) {
        return new SyncInvoker<KeystoneListServicesRequest, KeystoneListServicesResponse>(request, IamMeta.keystoneListServices, hcClient);
    }

    /**
     * 管理员查询用户组所包含的IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组中所包含的IAM用户。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListUsersForGroupByAdminRequest 请求对象
     * @return KeystoneListUsersForGroupByAdminResponse
     */
    public KeystoneListUsersForGroupByAdminResponse keystoneListUsersForGroupByAdmin(KeystoneListUsersForGroupByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListUsersForGroupByAdmin);
    }

    /**
     * 管理员查询用户组所包含的IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组中所包含的IAM用户。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListUsersForGroupByAdminRequest 请求对象
     * @return SyncInvoker<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse>
     */
    public SyncInvoker<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> keystoneListUsersForGroupByAdminInvoker(KeystoneListUsersForGroupByAdminRequest request) {
        return new SyncInvoker<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse>(request, IamMeta.keystoneListUsersForGroupByAdmin, hcClient);
    }

    /**
     * 查询版本信息列表
     * 该接口用于查询Keystone API的版本信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListVersionsRequest 请求对象
     * @return KeystoneListVersionsResponse
     */
    public KeystoneListVersionsResponse keystoneListVersions(KeystoneListVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListVersions);
    }

    /**
     * 查询版本信息列表
     * 该接口用于查询Keystone API的版本信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListVersionsRequest 请求对象
     * @return SyncInvoker<KeystoneListVersionsRequest, KeystoneListVersionsResponse>
     */
    public SyncInvoker<KeystoneListVersionsRequest, KeystoneListVersionsResponse> keystoneListVersionsInvoker(KeystoneListVersionsRequest request) {
        return new SyncInvoker<KeystoneListVersionsRequest, KeystoneListVersionsResponse>(request, IamMeta.keystoneListVersions, hcClient);
    }

    /**
     * 移除用户组的全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveDomainPermissionFromGroupRequest 请求对象
     * @return KeystoneRemoveDomainPermissionFromGroupResponse
     */
    public KeystoneRemoveDomainPermissionFromGroupResponse keystoneRemoveDomainPermissionFromGroup(KeystoneRemoveDomainPermissionFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneRemoveDomainPermissionFromGroup);
    }

    /**
     * 移除用户组的全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveDomainPermissionFromGroupRequest 请求对象
     * @return SyncInvoker<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse>
     */
    public SyncInvoker<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> keystoneRemoveDomainPermissionFromGroupInvoker(KeystoneRemoveDomainPermissionFromGroupRequest request) {
        return new SyncInvoker<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse>(request, IamMeta.keystoneRemoveDomainPermissionFromGroup, hcClient);
    }

    /**
     * 移除用户组的项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveProjectPermissionFromGroupRequest 请求对象
     * @return KeystoneRemoveProjectPermissionFromGroupResponse
     */
    public KeystoneRemoveProjectPermissionFromGroupResponse keystoneRemoveProjectPermissionFromGroup(KeystoneRemoveProjectPermissionFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneRemoveProjectPermissionFromGroup);
    }

    /**
     * 移除用户组的项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveProjectPermissionFromGroupRequest 请求对象
     * @return SyncInvoker<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse>
     */
    public SyncInvoker<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse> keystoneRemoveProjectPermissionFromGroupInvoker(KeystoneRemoveProjectPermissionFromGroupRequest request) {
        return new SyncInvoker<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse>(request, IamMeta.keystoneRemoveProjectPermissionFromGroup, hcClient);
    }

    /**
     * 移除用户组中的IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组中的IAM用户。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveUserFromGroupRequest 请求对象
     * @return KeystoneRemoveUserFromGroupResponse
     */
    public KeystoneRemoveUserFromGroupResponse keystoneRemoveUserFromGroup(KeystoneRemoveUserFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneRemoveUserFromGroup);
    }

    /**
     * 移除用户组中的IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组中的IAM用户。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneRemoveUserFromGroupRequest 请求对象
     * @return SyncInvoker<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse>
     */
    public SyncInvoker<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> keystoneRemoveUserFromGroupInvoker(KeystoneRemoveUserFromGroupRequest request) {
        return new SyncInvoker<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse>(request, IamMeta.keystoneRemoveUserFromGroup, hcClient);
    }

    /**
     * 查询服务目录
     * 该接口可以用于查询请求头中X-Auth-Token对应的服务目录。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowCatalogRequest 请求对象
     * @return KeystoneShowCatalogResponse
     */
    public KeystoneShowCatalogResponse keystoneShowCatalog(KeystoneShowCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowCatalog);
    }

    /**
     * 查询服务目录
     * 该接口可以用于查询请求头中X-Auth-Token对应的服务目录。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowCatalogRequest 请求对象
     * @return SyncInvoker<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse>
     */
    public SyncInvoker<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> keystoneShowCatalogInvoker(KeystoneShowCatalogRequest request) {
        return new SyncInvoker<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse>(request, IamMeta.keystoneShowCatalog, hcClient);
    }

    /**
     * 查询终端节点详情
     * 该接口可以用于查询终端节点详情。终端节点用来提供服务访问入口。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowEndpointRequest 请求对象
     * @return KeystoneShowEndpointResponse
     */
    public KeystoneShowEndpointResponse keystoneShowEndpoint(KeystoneShowEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowEndpoint);
    }

    /**
     * 查询终端节点详情
     * 该接口可以用于查询终端节点详情。终端节点用来提供服务访问入口。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowEndpointRequest 请求对象
     * @return SyncInvoker<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse>
     */
    public SyncInvoker<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse> keystoneShowEndpointInvoker(KeystoneShowEndpointRequest request) {
        return new SyncInvoker<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse>(request, IamMeta.keystoneShowEndpoint, hcClient);
    }

    /**
     * 查询用户组详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowGroupRequest 请求对象
     * @return KeystoneShowGroupResponse
     */
    public KeystoneShowGroupResponse keystoneShowGroup(KeystoneShowGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowGroup);
    }

    /**
     * 查询用户组详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowGroupRequest 请求对象
     * @return SyncInvoker<KeystoneShowGroupRequest, KeystoneShowGroupResponse>
     */
    public SyncInvoker<KeystoneShowGroupRequest, KeystoneShowGroupResponse> keystoneShowGroupInvoker(KeystoneShowGroupRequest request) {
        return new SyncInvoker<KeystoneShowGroupRequest, KeystoneShowGroupResponse>(request, IamMeta.keystoneShowGroup, hcClient);
    }

    /**
     * 查询身份提供商详情
     * 该接口可以用于查询身份提供商详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowIdentityProviderRequest 请求对象
     * @return KeystoneShowIdentityProviderResponse
     */
    public KeystoneShowIdentityProviderResponse keystoneShowIdentityProvider(KeystoneShowIdentityProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowIdentityProvider);
    }

    /**
     * 查询身份提供商详情
     * 该接口可以用于查询身份提供商详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowIdentityProviderRequest 请求对象
     * @return SyncInvoker<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse>
     */
    public SyncInvoker<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> keystoneShowIdentityProviderInvoker(KeystoneShowIdentityProviderRequest request) {
        return new SyncInvoker<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse>(request, IamMeta.keystoneShowIdentityProvider, hcClient);
    }

    /**
     * 查询映射详情
     * 该接口可以用于查询映射详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowMappingRequest 请求对象
     * @return KeystoneShowMappingResponse
     */
    public KeystoneShowMappingResponse keystoneShowMapping(KeystoneShowMappingRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowMapping);
    }

    /**
     * 查询映射详情
     * 该接口可以用于查询映射详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowMappingRequest 请求对象
     * @return SyncInvoker<KeystoneShowMappingRequest, KeystoneShowMappingResponse>
     */
    public SyncInvoker<KeystoneShowMappingRequest, KeystoneShowMappingResponse> keystoneShowMappingInvoker(KeystoneShowMappingRequest request) {
        return new SyncInvoker<KeystoneShowMappingRequest, KeystoneShowMappingResponse>(request, IamMeta.keystoneShowMapping, hcClient);
    }

    /**
     * 查询权限详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowPermissionRequest 请求对象
     * @return KeystoneShowPermissionResponse
     */
    public KeystoneShowPermissionResponse keystoneShowPermission(KeystoneShowPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowPermission);
    }

    /**
     * 查询权限详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowPermissionRequest 请求对象
     * @return SyncInvoker<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse>
     */
    public SyncInvoker<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> keystoneShowPermissionInvoker(KeystoneShowPermissionRequest request) {
        return new SyncInvoker<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse>(request, IamMeta.keystoneShowPermission, hcClient);
    }

    /**
     * 查询项目详情
     * 该接口可以用于查询项目详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowProjectRequest 请求对象
     * @return KeystoneShowProjectResponse
     */
    public KeystoneShowProjectResponse keystoneShowProject(KeystoneShowProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowProject);
    }

    /**
     * 查询项目详情
     * 该接口可以用于查询项目详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowProjectRequest 请求对象
     * @return SyncInvoker<KeystoneShowProjectRequest, KeystoneShowProjectResponse>
     */
    public SyncInvoker<KeystoneShowProjectRequest, KeystoneShowProjectResponse> keystoneShowProjectInvoker(KeystoneShowProjectRequest request) {
        return new SyncInvoker<KeystoneShowProjectRequest, KeystoneShowProjectResponse>(request, IamMeta.keystoneShowProject, hcClient);
    }

    /**
     * 查询协议详情
     * 该接口可以用于查询协议详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowProtocolRequest 请求对象
     * @return KeystoneShowProtocolResponse
     */
    public KeystoneShowProtocolResponse keystoneShowProtocol(KeystoneShowProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowProtocol);
    }

    /**
     * 查询协议详情
     * 该接口可以用于查询协议详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowProtocolRequest 请求对象
     * @return SyncInvoker<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse>
     */
    public SyncInvoker<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> keystoneShowProtocolInvoker(KeystoneShowProtocolRequest request) {
        return new SyncInvoker<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse>(request, IamMeta.keystoneShowProtocol, hcClient);
    }

    /**
     * 查询区域详情
     * 该接口可以用于查询区域详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowRegionRequest 请求对象
     * @return KeystoneShowRegionResponse
     */
    public KeystoneShowRegionResponse keystoneShowRegion(KeystoneShowRegionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowRegion);
    }

    /**
     * 查询区域详情
     * 该接口可以用于查询区域详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowRegionRequest 请求对象
     * @return SyncInvoker<KeystoneShowRegionRequest, KeystoneShowRegionResponse>
     */
    public SyncInvoker<KeystoneShowRegionRequest, KeystoneShowRegionResponse> keystoneShowRegionInvoker(KeystoneShowRegionRequest request) {
        return new SyncInvoker<KeystoneShowRegionRequest, KeystoneShowRegionResponse>(request, IamMeta.keystoneShowRegion, hcClient);
    }

    /**
     * 查询账号密码强度策略
     * 该接口可以用于查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowSecurityComplianceRequest 请求对象
     * @return KeystoneShowSecurityComplianceResponse
     */
    public KeystoneShowSecurityComplianceResponse keystoneShowSecurityCompliance(KeystoneShowSecurityComplianceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowSecurityCompliance);
    }

    /**
     * 查询账号密码强度策略
     * 该接口可以用于查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowSecurityComplianceRequest 请求对象
     * @return SyncInvoker<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse>
     */
    public SyncInvoker<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> keystoneShowSecurityComplianceInvoker(KeystoneShowSecurityComplianceRequest request) {
        return new SyncInvoker<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse>(request, IamMeta.keystoneShowSecurityCompliance, hcClient);
    }

    /**
     * 按条件查询账号密码强度策略
     * 该接口可以用于按条件查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowSecurityComplianceByOptionRequest 请求对象
     * @return KeystoneShowSecurityComplianceByOptionResponse
     */
    public KeystoneShowSecurityComplianceByOptionResponse keystoneShowSecurityComplianceByOption(KeystoneShowSecurityComplianceByOptionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowSecurityComplianceByOption);
    }

    /**
     * 按条件查询账号密码强度策略
     * 该接口可以用于按条件查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowSecurityComplianceByOptionRequest 请求对象
     * @return SyncInvoker<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse>
     */
    public SyncInvoker<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse> keystoneShowSecurityComplianceByOptionInvoker(KeystoneShowSecurityComplianceByOptionRequest request) {
        return new SyncInvoker<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse>(request, IamMeta.keystoneShowSecurityComplianceByOption, hcClient);
    }

    /**
     * 查询服务详情
     * 该接口可以用于查询服务详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowServiceRequest 请求对象
     * @return KeystoneShowServiceResponse
     */
    public KeystoneShowServiceResponse keystoneShowService(KeystoneShowServiceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowService);
    }

    /**
     * 查询服务详情
     * 该接口可以用于查询服务详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowServiceRequest 请求对象
     * @return SyncInvoker<KeystoneShowServiceRequest, KeystoneShowServiceResponse>
     */
    public SyncInvoker<KeystoneShowServiceRequest, KeystoneShowServiceResponse> keystoneShowServiceInvoker(KeystoneShowServiceRequest request) {
        return new SyncInvoker<KeystoneShowServiceRequest, KeystoneShowServiceResponse>(request, IamMeta.keystoneShowService, hcClient);
    }

    /**
     * 查询版本信息
     * 该接口用于查询Keystone API的3.0版本的信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowVersionRequest 请求对象
     * @return KeystoneShowVersionResponse
     */
    public KeystoneShowVersionResponse keystoneShowVersion(KeystoneShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowVersion);
    }

    /**
     * 查询版本信息
     * 该接口用于查询Keystone API的3.0版本的信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowVersionRequest 请求对象
     * @return SyncInvoker<KeystoneShowVersionRequest, KeystoneShowVersionResponse>
     */
    public SyncInvoker<KeystoneShowVersionRequest, KeystoneShowVersionResponse> keystoneShowVersionInvoker(KeystoneShowVersionRequest request) {
        return new SyncInvoker<KeystoneShowVersionRequest, KeystoneShowVersionResponse>(request, IamMeta.keystoneShowVersion, hcClient);
    }

    /**
     * 更新用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新用户组信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateGroupRequest 请求对象
     * @return KeystoneUpdateGroupResponse
     */
    public KeystoneUpdateGroupResponse keystoneUpdateGroup(KeystoneUpdateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateGroup);
    }

    /**
     * 更新用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新用户组信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateGroupRequest 请求对象
     * @return SyncInvoker<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse>
     */
    public SyncInvoker<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse> keystoneUpdateGroupInvoker(KeystoneUpdateGroupRequest request) {
        return new SyncInvoker<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse>(request, IamMeta.keystoneUpdateGroup, hcClient);
    }

    /**
     * 更新身份提供商
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新身份提供商。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateIdentityProviderRequest 请求对象
     * @return KeystoneUpdateIdentityProviderResponse
     */
    public KeystoneUpdateIdentityProviderResponse keystoneUpdateIdentityProvider(KeystoneUpdateIdentityProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateIdentityProvider);
    }

    /**
     * 更新身份提供商
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新身份提供商。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateIdentityProviderRequest 请求对象
     * @return SyncInvoker<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse>
     */
    public SyncInvoker<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> keystoneUpdateIdentityProviderInvoker(KeystoneUpdateIdentityProviderRequest request) {
        return new SyncInvoker<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse>(request, IamMeta.keystoneUpdateIdentityProvider, hcClient);
    }

    /**
     * 更新映射
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新映射。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateMappingRequest 请求对象
     * @return KeystoneUpdateMappingResponse
     */
    public KeystoneUpdateMappingResponse keystoneUpdateMapping(KeystoneUpdateMappingRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateMapping);
    }

    /**
     * 更新映射
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新映射。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateMappingRequest 请求对象
     * @return SyncInvoker<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse>
     */
    public SyncInvoker<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> keystoneUpdateMappingInvoker(KeystoneUpdateMappingRequest request) {
        return new SyncInvoker<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse>(request, IamMeta.keystoneUpdateMapping, hcClient);
    }

    /**
     * 修改项目信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改项目信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateProjectRequest 请求对象
     * @return KeystoneUpdateProjectResponse
     */
    public KeystoneUpdateProjectResponse keystoneUpdateProject(KeystoneUpdateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateProject);
    }

    /**
     * 修改项目信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改项目信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateProjectRequest 请求对象
     * @return SyncInvoker<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse>
     */
    public SyncInvoker<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> keystoneUpdateProjectInvoker(KeystoneUpdateProjectRequest request) {
        return new SyncInvoker<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse>(request, IamMeta.keystoneUpdateProject, hcClient);
    }

    /**
     * 更新协议
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新协议。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateProtocolRequest 请求对象
     * @return KeystoneUpdateProtocolResponse
     */
    public KeystoneUpdateProtocolResponse keystoneUpdateProtocol(KeystoneUpdateProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateProtocol);
    }

    /**
     * 更新协议
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新协议。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateProtocolRequest 请求对象
     * @return SyncInvoker<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse>
     */
    public SyncInvoker<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> keystoneUpdateProtocolInvoker(KeystoneUpdateProtocolRequest request) {
        return new SyncInvoker<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse>(request, IamMeta.keystoneUpdateProtocol, hcClient);
    }

    /**
     * 查询指定条件下的委托列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定条件下的委托列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListAgenciesRequest 请求对象
     * @return ListAgenciesResponse
     */
    public ListAgenciesResponse listAgencies(ListAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAgencies);
    }

    /**
     * 查询指定条件下的委托列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定条件下的委托列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListAgenciesRequest 请求对象
     * @return SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public SyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesInvoker(ListAgenciesRequest request) {
        return new SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>(request, IamMeta.listAgencies, hcClient);
    }

    /**
     * 查询委托下的所有项目服务权限列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托所有项目服务权限列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListAllProjectsPermissionsForAgencyRequest 请求对象
     * @return ListAllProjectsPermissionsForAgencyResponse
     */
    public ListAllProjectsPermissionsForAgencyResponse listAllProjectsPermissionsForAgency(ListAllProjectsPermissionsForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAllProjectsPermissionsForAgency);
    }

    /**
     * 查询委托下的所有项目服务权限列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托所有项目服务权限列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListAllProjectsPermissionsForAgencyRequest 请求对象
     * @return SyncInvoker<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse>
     */
    public SyncInvoker<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> listAllProjectsPermissionsForAgencyInvoker(ListAllProjectsPermissionsForAgencyRequest request) {
        return new SyncInvoker<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse>(request, IamMeta.listAllProjectsPermissionsForAgency, hcClient);
    }

    /**
     * 查询自定义策略列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListCustomPoliciesRequest 请求对象
     * @return ListCustomPoliciesResponse
     */
    public ListCustomPoliciesResponse listCustomPolicies(ListCustomPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listCustomPolicies);
    }

    /**
     * 查询自定义策略列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListCustomPoliciesRequest 请求对象
     * @return SyncInvoker<ListCustomPoliciesRequest, ListCustomPoliciesResponse>
     */
    public SyncInvoker<ListCustomPoliciesRequest, ListCustomPoliciesResponse> listCustomPoliciesInvoker(ListCustomPoliciesRequest request) {
        return new SyncInvoker<ListCustomPoliciesRequest, ListCustomPoliciesResponse>(request, IamMeta.listCustomPolicies, hcClient);
    }

    /**
     * 查询全局服务中的委托权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的委托权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListDomainPermissionsForAgencyRequest 请求对象
     * @return ListDomainPermissionsForAgencyResponse
     */
    public ListDomainPermissionsForAgencyResponse listDomainPermissionsForAgency(ListDomainPermissionsForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listDomainPermissionsForAgency);
    }

    /**
     * 查询全局服务中的委托权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的委托权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListDomainPermissionsForAgencyRequest 请求对象
     * @return SyncInvoker<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse>
     */
    public SyncInvoker<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> listDomainPermissionsForAgencyInvoker(ListDomainPermissionsForAgencyRequest request) {
        return new SyncInvoker<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse>(request, IamMeta.listDomainPermissionsForAgency, hcClient);
    }

    /**
     * 查询项目服务中的委托权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的委托权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListProjectPermissionsForAgencyRequest 请求对象
     * @return ListProjectPermissionsForAgencyResponse
     */
    public ListProjectPermissionsForAgencyResponse listProjectPermissionsForAgency(ListProjectPermissionsForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listProjectPermissionsForAgency);
    }

    /**
     * 查询项目服务中的委托权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的委托权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListProjectPermissionsForAgencyRequest 请求对象
     * @return SyncInvoker<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse>
     */
    public SyncInvoker<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> listProjectPermissionsForAgencyInvoker(ListProjectPermissionsForAgencyRequest request) {
        return new SyncInvoker<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse>(request, IamMeta.listProjectPermissionsForAgency, hcClient);
    }

    /**
     * 移除委托下的所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveAllProjectsPermissionFromAgencyRequest 请求对象
     * @return RemoveAllProjectsPermissionFromAgencyResponse
     */
    public RemoveAllProjectsPermissionFromAgencyResponse removeAllProjectsPermissionFromAgency(RemoveAllProjectsPermissionFromAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.removeAllProjectsPermissionFromAgency);
    }

    /**
     * 移除委托下的所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveAllProjectsPermissionFromAgencyRequest 请求对象
     * @return SyncInvoker<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse>
     */
    public SyncInvoker<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse> removeAllProjectsPermissionFromAgencyInvoker(RemoveAllProjectsPermissionFromAgencyRequest request) {
        return new SyncInvoker<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse>(request, IamMeta.removeAllProjectsPermissionFromAgency, hcClient);
    }

    /**
     * 移除委托的全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveDomainPermissionFromAgencyRequest 请求对象
     * @return RemoveDomainPermissionFromAgencyResponse
     */
    public RemoveDomainPermissionFromAgencyResponse removeDomainPermissionFromAgency(RemoveDomainPermissionFromAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.removeDomainPermissionFromAgency);
    }

    /**
     * 移除委托的全局服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的全局服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveDomainPermissionFromAgencyRequest 请求对象
     * @return SyncInvoker<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse>
     */
    public SyncInvoker<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> removeDomainPermissionFromAgencyInvoker(RemoveDomainPermissionFromAgencyRequest request) {
        return new SyncInvoker<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse>(request, IamMeta.removeDomainPermissionFromAgency, hcClient);
    }

    /**
     * 移除委托的项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveProjectPermissionFromAgencyRequest 请求对象
     * @return RemoveProjectPermissionFromAgencyResponse
     */
    public RemoveProjectPermissionFromAgencyResponse removeProjectPermissionFromAgency(RemoveProjectPermissionFromAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.removeProjectPermissionFromAgency);
    }

    /**
     * 移除委托的项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param RemoveProjectPermissionFromAgencyRequest 请求对象
     * @return SyncInvoker<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse>
     */
    public SyncInvoker<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> removeProjectPermissionFromAgencyInvoker(RemoveProjectPermissionFromAgencyRequest request) {
        return new SyncInvoker<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse>(request, IamMeta.removeProjectPermissionFromAgency, hcClient);
    }

    /**
     * 查询委托详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowAgencyRequest 请求对象
     * @return ShowAgencyResponse
     */
    public ShowAgencyResponse showAgency(ShowAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showAgency);
    }

    /**
     * 查询委托详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowAgencyRequest 请求对象
     * @return SyncInvoker<ShowAgencyRequest, ShowAgencyResponse>
     */
    public SyncInvoker<ShowAgencyRequest, ShowAgencyResponse> showAgencyInvoker(ShowAgencyRequest request) {
        return new SyncInvoker<ShowAgencyRequest, ShowAgencyResponse>(request, IamMeta.showAgency, hcClient);
    }

    /**
     * 查询自定义策略详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowCustomPolicyRequest 请求对象
     * @return ShowCustomPolicyResponse
     */
    public ShowCustomPolicyResponse showCustomPolicy(ShowCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showCustomPolicy);
    }

    /**
     * 查询自定义策略详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowCustomPolicyRequest 请求对象
     * @return SyncInvoker<ShowCustomPolicyRequest, ShowCustomPolicyResponse>
     */
    public SyncInvoker<ShowCustomPolicyRequest, ShowCustomPolicyResponse> showCustomPolicyInvoker(ShowCustomPolicyRequest request) {
        return new SyncInvoker<ShowCustomPolicyRequest, ShowCustomPolicyResponse>(request, IamMeta.showCustomPolicy, hcClient);
    }

    /**
     * 查询账号接口访问策略
     * 该接口可以用于查询账号接口访问控制策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainApiAclPolicyRequest 请求对象
     * @return ShowDomainApiAclPolicyResponse
     */
    public ShowDomainApiAclPolicyResponse showDomainApiAclPolicy(ShowDomainApiAclPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainApiAclPolicy);
    }

    /**
     * 查询账号接口访问策略
     * 该接口可以用于查询账号接口访问控制策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainApiAclPolicyRequest 请求对象
     * @return SyncInvoker<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse>
     */
    public SyncInvoker<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> showDomainApiAclPolicyInvoker(ShowDomainApiAclPolicyRequest request) {
        return new SyncInvoker<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse>(request, IamMeta.showDomainApiAclPolicy, hcClient);
    }

    /**
     * 查询账号控制台访问策略
     * 该接口可以用于查询账号控制台访问控制策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainConsoleAclPolicyRequest 请求对象
     * @return ShowDomainConsoleAclPolicyResponse
     */
    public ShowDomainConsoleAclPolicyResponse showDomainConsoleAclPolicy(ShowDomainConsoleAclPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainConsoleAclPolicy);
    }

    /**
     * 查询账号控制台访问策略
     * 该接口可以用于查询账号控制台访问控制策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainConsoleAclPolicyRequest 请求对象
     * @return SyncInvoker<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse>
     */
    public SyncInvoker<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> showDomainConsoleAclPolicyInvoker(ShowDomainConsoleAclPolicyRequest request) {
        return new SyncInvoker<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse>(request, IamMeta.showDomainConsoleAclPolicy, hcClient);
    }

    /**
     * 查询账号登录策略
     * 该接口可以用于查询账号登录策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainLoginPolicyRequest 请求对象
     * @return ShowDomainLoginPolicyResponse
     */
    public ShowDomainLoginPolicyResponse showDomainLoginPolicy(ShowDomainLoginPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainLoginPolicy);
    }

    /**
     * 查询账号登录策略
     * 该接口可以用于查询账号登录策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainLoginPolicyRequest 请求对象
     * @return SyncInvoker<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse>
     */
    public SyncInvoker<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> showDomainLoginPolicyInvoker(ShowDomainLoginPolicyRequest request) {
        return new SyncInvoker<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse>(request, IamMeta.showDomainLoginPolicy, hcClient);
    }

    /**
     * 查询账号密码策略
     * 该接口可以用于查询账号密码策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainPasswordPolicyRequest 请求对象
     * @return ShowDomainPasswordPolicyResponse
     */
    public ShowDomainPasswordPolicyResponse showDomainPasswordPolicy(ShowDomainPasswordPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainPasswordPolicy);
    }

    /**
     * 查询账号密码策略
     * 该接口可以用于查询账号密码策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainPasswordPolicyRequest 请求对象
     * @return SyncInvoker<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse>
     */
    public SyncInvoker<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> showDomainPasswordPolicyInvoker(ShowDomainPasswordPolicyRequest request) {
        return new SyncInvoker<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse>(request, IamMeta.showDomainPasswordPolicy, hcClient);
    }

    /**
     * 查询账号操作保护策略
     * 该接口可以用于查询账号操作保护策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainProtectPolicyRequest 请求对象
     * @return ShowDomainProtectPolicyResponse
     */
    public ShowDomainProtectPolicyResponse showDomainProtectPolicy(ShowDomainProtectPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainProtectPolicy);
    }

    /**
     * 查询账号操作保护策略
     * 该接口可以用于查询账号操作保护策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainProtectPolicyRequest 请求对象
     * @return SyncInvoker<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse>
     */
    public SyncInvoker<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> showDomainProtectPolicyInvoker(ShowDomainProtectPolicyRequest request) {
        return new SyncInvoker<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse>(request, IamMeta.showDomainProtectPolicy, hcClient);
    }

    /**
     * 查询账号配额
     * 该接口可以用于查询账号配额。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainQuotaRequest 请求对象
     * @return ShowDomainQuotaResponse
     */
    public ShowDomainQuotaResponse showDomainQuota(ShowDomainQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainQuota);
    }

    /**
     * 查询账号配额
     * 该接口可以用于查询账号配额。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowDomainQuotaRequest 请求对象
     * @return SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>
     */
    public SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuotaInvoker(ShowDomainQuotaRequest request) {
        return new SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>(request, IamMeta.showDomainQuota, hcClient);
    }

    /**
     * 查询Metadata文件
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询身份提供商导入到IAM中的Metadata文件。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowMetadataRequest 请求对象
     * @return ShowMetadataResponse
     */
    public ShowMetadataResponse showMetadata(ShowMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showMetadata);
    }

    /**
     * 查询Metadata文件
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询身份提供商导入到IAM中的Metadata文件。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowMetadataRequest 请求对象
     * @return SyncInvoker<ShowMetadataRequest, ShowMetadataResponse>
     */
    public SyncInvoker<ShowMetadataRequest, ShowMetadataResponse> showMetadataInvoker(ShowMetadataRequest request) {
        return new SyncInvoker<ShowMetadataRequest, ShowMetadataResponse>(request, IamMeta.showMetadata, hcClient);
    }

    /**
     * 查询OpenId Connect身份提供商配置
     * 查询OpenId Connect身份提供商配置
     *
     * @param ShowOpenIdConnectConfigRequest 请求对象
     * @return ShowOpenIdConnectConfigResponse
     */
    public ShowOpenIdConnectConfigResponse showOpenIdConnectConfig(ShowOpenIdConnectConfigRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showOpenIdConnectConfig);
    }

    /**
     * 查询OpenId Connect身份提供商配置
     * 查询OpenId Connect身份提供商配置
     *
     * @param ShowOpenIdConnectConfigRequest 请求对象
     * @return SyncInvoker<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse>
     */
    public SyncInvoker<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse> showOpenIdConnectConfigInvoker(ShowOpenIdConnectConfigRequest request) {
        return new SyncInvoker<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse>(request, IamMeta.showOpenIdConnectConfig, hcClient);
    }

    /**
     * 查询项目详情与状态
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目详情与状态。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowProjectDetailsAndStatusRequest 请求对象
     * @return ShowProjectDetailsAndStatusResponse
     */
    public ShowProjectDetailsAndStatusResponse showProjectDetailsAndStatus(ShowProjectDetailsAndStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showProjectDetailsAndStatus);
    }

    /**
     * 查询项目详情与状态
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目详情与状态。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowProjectDetailsAndStatusRequest 请求对象
     * @return SyncInvoker<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse>
     */
    public SyncInvoker<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> showProjectDetailsAndStatusInvoker(ShowProjectDetailsAndStatusRequest request) {
        return new SyncInvoker<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse>(request, IamMeta.showProjectDetailsAndStatus, hcClient);
    }

    /**
     * 查询项目配额
     * 该接口可以用于查询项目配额。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowProjectQuotaRequest 请求对象
     * @return ShowProjectQuotaResponse
     */
    public ShowProjectQuotaResponse showProjectQuota(ShowProjectQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showProjectQuota);
    }

    /**
     * 查询项目配额
     * 该接口可以用于查询项目配额。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowProjectQuotaRequest 请求对象
     * @return SyncInvoker<ShowProjectQuotaRequest, ShowProjectQuotaResponse>
     */
    public SyncInvoker<ShowProjectQuotaRequest, ShowProjectQuotaResponse> showProjectQuotaInvoker(ShowProjectQuotaRequest request) {
        return new SyncInvoker<ShowProjectQuotaRequest, ShowProjectQuotaResponse>(request, IamMeta.showProjectQuota, hcClient);
    }

    /**
     * 修改委托
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateAgencyRequest 请求对象
     * @return UpdateAgencyResponse
     */
    public UpdateAgencyResponse updateAgency(UpdateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateAgency);
    }

    /**
     * 修改委托
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateAgencyRequest 请求对象
     * @return SyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse>
     */
    public SyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse> updateAgencyInvoker(UpdateAgencyRequest request) {
        return new SyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse>(request, IamMeta.updateAgency, hcClient);
    }

    /**
     * 修改委托自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateAgencyCustomPolicyRequest 请求对象
     * @return UpdateAgencyCustomPolicyResponse
     */
    public UpdateAgencyCustomPolicyResponse updateAgencyCustomPolicy(UpdateAgencyCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateAgencyCustomPolicy);
    }

    /**
     * 修改委托自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateAgencyCustomPolicyRequest 请求对象
     * @return SyncInvoker<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse>
     */
    public SyncInvoker<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> updateAgencyCustomPolicyInvoker(UpdateAgencyCustomPolicyRequest request) {
        return new SyncInvoker<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse>(request, IamMeta.updateAgencyCustomPolicy, hcClient);
    }

    /**
     * 修改云服务自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改云服务自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateCloudServiceCustomPolicyRequest 请求对象
     * @return UpdateCloudServiceCustomPolicyResponse
     */
    public UpdateCloudServiceCustomPolicyResponse updateCloudServiceCustomPolicy(UpdateCloudServiceCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateCloudServiceCustomPolicy);
    }

    /**
     * 修改云服务自定义策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改云服务自定义策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateCloudServiceCustomPolicyRequest 请求对象
     * @return SyncInvoker<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse>
     */
    public SyncInvoker<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> updateCloudServiceCustomPolicyInvoker(UpdateCloudServiceCustomPolicyRequest request) {
        return new SyncInvoker<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse>(request, IamMeta.updateCloudServiceCustomPolicy, hcClient);
    }

    /**
     * 修改账号接口访问策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号接口访问策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainApiAclPolicyRequest 请求对象
     * @return UpdateDomainApiAclPolicyResponse
     */
    public UpdateDomainApiAclPolicyResponse updateDomainApiAclPolicy(UpdateDomainApiAclPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainApiAclPolicy);
    }

    /**
     * 修改账号接口访问策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号接口访问策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainApiAclPolicyRequest 请求对象
     * @return SyncInvoker<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse>
     */
    public SyncInvoker<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> updateDomainApiAclPolicyInvoker(UpdateDomainApiAclPolicyRequest request) {
        return new SyncInvoker<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse>(request, IamMeta.updateDomainApiAclPolicy, hcClient);
    }

    /**
     * 修改账号控制台访问策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号控制台访问策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainConsoleAclPolicyRequest 请求对象
     * @return UpdateDomainConsoleAclPolicyResponse
     */
    public UpdateDomainConsoleAclPolicyResponse updateDomainConsoleAclPolicy(UpdateDomainConsoleAclPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainConsoleAclPolicy);
    }

    /**
     * 修改账号控制台访问策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号控制台访问策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainConsoleAclPolicyRequest 请求对象
     * @return SyncInvoker<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse>
     */
    public SyncInvoker<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> updateDomainConsoleAclPolicyInvoker(UpdateDomainConsoleAclPolicyRequest request) {
        return new SyncInvoker<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse>(request, IamMeta.updateDomainConsoleAclPolicy, hcClient);
    }

    /**
     * 为用户组授予所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/zh-cn_topic_0079496985.html)为用户组授予所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainGroupInheritRoleRequest 请求对象
     * @return UpdateDomainGroupInheritRoleResponse
     */
    public UpdateDomainGroupInheritRoleResponse updateDomainGroupInheritRole(UpdateDomainGroupInheritRoleRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainGroupInheritRole);
    }

    /**
     * 为用户组授予所有项目服务权限
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/zh-cn_topic_0079496985.html)为用户组授予所有项目服务权限。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainGroupInheritRoleRequest 请求对象
     * @return SyncInvoker<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse>
     */
    public SyncInvoker<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> updateDomainGroupInheritRoleInvoker(UpdateDomainGroupInheritRoleRequest request) {
        return new SyncInvoker<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse>(request, IamMeta.updateDomainGroupInheritRole, hcClient);
    }

    /**
     * 修改账号登录策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号登录策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainLoginPolicyRequest 请求对象
     * @return UpdateDomainLoginPolicyResponse
     */
    public UpdateDomainLoginPolicyResponse updateDomainLoginPolicy(UpdateDomainLoginPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainLoginPolicy);
    }

    /**
     * 修改账号登录策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号登录策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainLoginPolicyRequest 请求对象
     * @return SyncInvoker<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse>
     */
    public SyncInvoker<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> updateDomainLoginPolicyInvoker(UpdateDomainLoginPolicyRequest request) {
        return new SyncInvoker<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse>(request, IamMeta.updateDomainLoginPolicy, hcClient);
    }

    /**
     * 修改账号密码策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号密码策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainPasswordPolicyRequest 请求对象
     * @return UpdateDomainPasswordPolicyResponse
     */
    public UpdateDomainPasswordPolicyResponse updateDomainPasswordPolicy(UpdateDomainPasswordPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainPasswordPolicy);
    }

    /**
     * 修改账号密码策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号密码策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainPasswordPolicyRequest 请求对象
     * @return SyncInvoker<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse>
     */
    public SyncInvoker<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> updateDomainPasswordPolicyInvoker(UpdateDomainPasswordPolicyRequest request) {
        return new SyncInvoker<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse>(request, IamMeta.updateDomainPasswordPolicy, hcClient);
    }

    /**
     * 修改账号操作保护策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainProtectPolicyRequest 请求对象
     * @return UpdateDomainProtectPolicyResponse
     */
    public UpdateDomainProtectPolicyResponse updateDomainProtectPolicy(UpdateDomainProtectPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainProtectPolicy);
    }

    /**
     * 修改账号操作保护策略
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护策略。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateDomainProtectPolicyRequest 请求对象
     * @return SyncInvoker<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse>
     */
    public SyncInvoker<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> updateDomainProtectPolicyInvoker(UpdateDomainProtectPolicyRequest request) {
        return new SyncInvoker<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse>(request, IamMeta.updateDomainProtectPolicy, hcClient);
    }

    /**
     * 修改OpenId Connect身份提供商配置
     * 修改OpenId Connect身份提供商配置
     *
     * @param UpdateOpenIdConnectConfigRequest 请求对象
     * @return UpdateOpenIdConnectConfigResponse
     */
    public UpdateOpenIdConnectConfigResponse updateOpenIdConnectConfig(UpdateOpenIdConnectConfigRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateOpenIdConnectConfig);
    }

    /**
     * 修改OpenId Connect身份提供商配置
     * 修改OpenId Connect身份提供商配置
     *
     * @param UpdateOpenIdConnectConfigRequest 请求对象
     * @return SyncInvoker<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse>
     */
    public SyncInvoker<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse> updateOpenIdConnectConfigInvoker(UpdateOpenIdConnectConfigRequest request) {
        return new SyncInvoker<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse>(request, IamMeta.updateOpenIdConnectConfig, hcClient);
    }

    /**
     * 设置项目状态
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)设置项目状态。项目状态包括：正常、冻结。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateProjectStatusRequest 请求对象
     * @return UpdateProjectStatusResponse
     */
    public UpdateProjectStatusResponse updateProjectStatus(UpdateProjectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateProjectStatus);
    }

    /**
     * 设置项目状态
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)设置项目状态。项目状态包括：正常、冻结。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateProjectStatusRequest 请求对象
     * @return SyncInvoker<UpdateProjectStatusRequest, UpdateProjectStatusResponse>
     */
    public SyncInvoker<UpdateProjectStatusRequest, UpdateProjectStatusResponse> updateProjectStatusInvoker(UpdateProjectStatusRequest request) {
        return new SyncInvoker<UpdateProjectStatusRequest, UpdateProjectStatusResponse>(request, IamMeta.updateProjectStatus, hcClient);
    }

    /**
     * 创建永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)给IAM用户创建永久访问密钥，或IAM用户给自己创建永久访问密钥。    访问密钥（Access Key ID/Secret Access Key，简称AK/SK），是您通过开发工具（API、CLI、SDK）访问华为云时的身份凭证，不用于登录控制台。系统通过AK识别访问用户的身份，通过SK进行签名验证，通过加密签名验证可以确保请求的机密性、完整性和请求者身份的正确性。在控制台创建访问密钥的方式请参见：[访问密钥](https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html)  。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreatePermanentAccessKeyRequest 请求对象
     * @return CreatePermanentAccessKeyResponse
     */
    public CreatePermanentAccessKeyResponse createPermanentAccessKey(CreatePermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createPermanentAccessKey);
    }

    /**
     * 创建永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)给IAM用户创建永久访问密钥，或IAM用户给自己创建永久访问密钥。    访问密钥（Access Key ID/Secret Access Key，简称AK/SK），是您通过开发工具（API、CLI、SDK）访问华为云时的身份凭证，不用于登录控制台。系统通过AK识别访问用户的身份，通过SK进行签名验证，通过加密签名验证可以确保请求的机密性、完整性和请求者身份的正确性。在控制台创建访问密钥的方式请参见：[访问密钥](https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html)  。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreatePermanentAccessKeyRequest 请求对象
     * @return SyncInvoker<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse>
     */
    public SyncInvoker<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> createPermanentAccessKeyInvoker(CreatePermanentAccessKeyRequest request) {
        return new SyncInvoker<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse>(request, IamMeta.createPermanentAccessKey, hcClient);
    }

    /**
     * 通过委托获取临时访问密钥
     * 该接口可以用于通过委托来获取临时访问密钥（临时AK/SK）和securitytoken。    临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html) 。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateTemporaryAccessKeyByAgencyRequest 请求对象
     * @return CreateTemporaryAccessKeyByAgencyResponse
     */
    public CreateTemporaryAccessKeyByAgencyResponse createTemporaryAccessKeyByAgency(CreateTemporaryAccessKeyByAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByAgency);
    }

    /**
     * 通过委托获取临时访问密钥
     * 该接口可以用于通过委托来获取临时访问密钥（临时AK/SK）和securitytoken。    临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html) 。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateTemporaryAccessKeyByAgencyRequest 请求对象
     * @return SyncInvoker<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse>
     */
    public SyncInvoker<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> createTemporaryAccessKeyByAgencyInvoker(CreateTemporaryAccessKeyByAgencyRequest request) {
        return new SyncInvoker<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse>(request, IamMeta.createTemporaryAccessKeyByAgency, hcClient);
    }

    /**
     * 通过token获取临时访问密钥
     * 该接口可以用于通过token来获取临时AK/SK和securitytoken。    临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html)。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateTemporaryAccessKeyByTokenRequest 请求对象
     * @return CreateTemporaryAccessKeyByTokenResponse
     */
    public CreateTemporaryAccessKeyByTokenResponse createTemporaryAccessKeyByToken(CreateTemporaryAccessKeyByTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByToken);
    }

    /**
     * 通过token获取临时访问密钥
     * 该接口可以用于通过token来获取临时AK/SK和securitytoken。    临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html)。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateTemporaryAccessKeyByTokenRequest 请求对象
     * @return SyncInvoker<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse>
     */
    public SyncInvoker<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> createTemporaryAccessKeyByTokenInvoker(CreateTemporaryAccessKeyByTokenRequest request) {
        return new SyncInvoker<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse>(request, IamMeta.createTemporaryAccessKeyByToken, hcClient);
    }

    /**
     * 删除指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除IAM用户的指定永久访问密钥，或IAM用户删除自己的指定永久访问密钥。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeletePermanentAccessKeyRequest 请求对象
     * @return DeletePermanentAccessKeyResponse
     */
    public DeletePermanentAccessKeyResponse deletePermanentAccessKey(DeletePermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deletePermanentAccessKey);
    }

    /**
     * 删除指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除IAM用户的指定永久访问密钥，或IAM用户删除自己的指定永久访问密钥。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeletePermanentAccessKeyRequest 请求对象
     * @return SyncInvoker<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse>
     */
    public SyncInvoker<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> deletePermanentAccessKeyInvoker(DeletePermanentAccessKeyRequest request) {
        return new SyncInvoker<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse>(request, IamMeta.deletePermanentAccessKey, hcClient);
    }

    /**
     * 查询所有永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的所有永久访问密钥，或IAM用户查询自己的所有永久访问密钥。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListPermanentAccessKeysRequest 请求对象
     * @return ListPermanentAccessKeysResponse
     */
    public ListPermanentAccessKeysResponse listPermanentAccessKeys(ListPermanentAccessKeysRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listPermanentAccessKeys);
    }

    /**
     * 查询所有永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的所有永久访问密钥，或IAM用户查询自己的所有永久访问密钥。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListPermanentAccessKeysRequest 请求对象
     * @return SyncInvoker<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse>
     */
    public SyncInvoker<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> listPermanentAccessKeysInvoker(ListPermanentAccessKeysRequest request) {
        return new SyncInvoker<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse>(request, IamMeta.listPermanentAccessKeys, hcClient);
    }

    /**
     * 查询指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的指定永久访问密钥，或IAM用户查询自己的指定永久访问密钥。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowPermanentAccessKeyRequest 请求对象
     * @return ShowPermanentAccessKeyResponse
     */
    public ShowPermanentAccessKeyResponse showPermanentAccessKey(ShowPermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showPermanentAccessKey);
    }

    /**
     * 查询指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的指定永久访问密钥，或IAM用户查询自己的指定永久访问密钥。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowPermanentAccessKeyRequest 请求对象
     * @return SyncInvoker<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse>
     */
    public SyncInvoker<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> showPermanentAccessKeyInvoker(ShowPermanentAccessKeyRequest request) {
        return new SyncInvoker<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse>(request, IamMeta.showPermanentAccessKey, hcClient);
    }

    /**
     * 修改指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户的指定永久访问密钥，或IAM用户修改自己的指定永久访问密钥。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdatePermanentAccessKeyRequest 请求对象
     * @return UpdatePermanentAccessKeyResponse
     */
    public UpdatePermanentAccessKeyResponse updatePermanentAccessKey(UpdatePermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updatePermanentAccessKey);
    }

    /**
     * 修改指定永久访问密钥
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户的指定永久访问密钥，或IAM用户修改自己的指定永久访问密钥。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdatePermanentAccessKeyRequest 请求对象
     * @return SyncInvoker<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse>
     */
    public SyncInvoker<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> updatePermanentAccessKeyInvoker(UpdatePermanentAccessKeyRequest request) {
        return new SyncInvoker<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse>(request, IamMeta.updatePermanentAccessKey, hcClient);
    }

    /**
     * 绑定MFA设备
     * 该接口可以用于绑定MFA设备。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateBindingDeviceRequest 请求对象
     * @return CreateBindingDeviceResponse
     */
    public CreateBindingDeviceResponse createBindingDevice(CreateBindingDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createBindingDevice);
    }

    /**
     * 绑定MFA设备
     * 该接口可以用于绑定MFA设备。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateBindingDeviceRequest 请求对象
     * @return SyncInvoker<CreateBindingDeviceRequest, CreateBindingDeviceResponse>
     */
    public SyncInvoker<CreateBindingDeviceRequest, CreateBindingDeviceResponse> createBindingDeviceInvoker(CreateBindingDeviceRequest request) {
        return new SyncInvoker<CreateBindingDeviceRequest, CreateBindingDeviceResponse>(request, IamMeta.createBindingDevice, hcClient);
    }

    /**
     * 创建MFA设备
     * 该接口可以用于创建MFA设备。  该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateMfaDeviceRequest 请求对象
     * @return CreateMfaDeviceResponse
     */
    public CreateMfaDeviceResponse createMfaDevice(CreateMfaDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createMfaDevice);
    }

    /**
     * 创建MFA设备
     * 该接口可以用于创建MFA设备。  该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateMfaDeviceRequest 请求对象
     * @return SyncInvoker<CreateMfaDeviceRequest, CreateMfaDeviceResponse>
     */
    public SyncInvoker<CreateMfaDeviceRequest, CreateMfaDeviceResponse> createMfaDeviceInvoker(CreateMfaDeviceRequest request) {
        return new SyncInvoker<CreateMfaDeviceRequest, CreateMfaDeviceResponse>(request, IamMeta.createMfaDevice, hcClient);
    }

    /**
     * 管理员创建IAM用户（推荐）
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateUserRequest 请求对象
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createUser);
    }

    /**
     * 管理员创建IAM用户（推荐）
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param CreateUserRequest 请求对象
     * @return SyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public SyncInvoker<CreateUserRequest, CreateUserResponse> createUserInvoker(CreateUserRequest request) {
        return new SyncInvoker<CreateUserRequest, CreateUserResponse>(request, IamMeta.createUser, hcClient);
    }

    /**
     * 解绑MFA设备
     * 该接口可以用于解绑MFA设备   该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteBindingDeviceRequest 请求对象
     * @return DeleteBindingDeviceResponse
     */
    public DeleteBindingDeviceResponse deleteBindingDevice(DeleteBindingDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteBindingDevice);
    }

    /**
     * 解绑MFA设备
     * 该接口可以用于解绑MFA设备   该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteBindingDeviceRequest 请求对象
     * @return SyncInvoker<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse>
     */
    public SyncInvoker<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> deleteBindingDeviceInvoker(DeleteBindingDeviceRequest request) {
        return new SyncInvoker<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse>(request, IamMeta.deleteBindingDevice, hcClient);
    }

    /**
     * 删除MFA设备
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除MFA设备。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteMfaDeviceRequest 请求对象
     * @return DeleteMfaDeviceResponse
     */
    public DeleteMfaDeviceResponse deleteMfaDevice(DeleteMfaDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteMfaDevice);
    }

    /**
     * 删除MFA设备
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除MFA设备。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param DeleteMfaDeviceRequest 请求对象
     * @return SyncInvoker<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse>
     */
    public SyncInvoker<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> deleteMfaDeviceInvoker(DeleteMfaDeviceRequest request) {
        return new SyncInvoker<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse>(request, IamMeta.deleteMfaDevice, hcClient);
    }

    /**
     * 管理员创建IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。IAM用户首次登录时需要修改密码。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateUserRequest 请求对象
     * @return KeystoneCreateUserResponse
     */
    public KeystoneCreateUserResponse keystoneCreateUser(KeystoneCreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateUser);
    }

    /**
     * 管理员创建IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。IAM用户首次登录时需要修改密码。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneCreateUserRequest 请求对象
     * @return SyncInvoker<KeystoneCreateUserRequest, KeystoneCreateUserResponse>
     */
    public SyncInvoker<KeystoneCreateUserRequest, KeystoneCreateUserResponse> keystoneCreateUserInvoker(KeystoneCreateUserRequest request) {
        return new SyncInvoker<KeystoneCreateUserRequest, KeystoneCreateUserResponse>(request, IamMeta.keystoneCreateUser, hcClient);
    }

    /**
     * 管理员删除IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除指定IAM用户。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteUserRequest 请求对象
     * @return KeystoneDeleteUserResponse
     */
    public KeystoneDeleteUserResponse keystoneDeleteUser(KeystoneDeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteUser);
    }

    /**
     * 管理员删除IAM用户
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除指定IAM用户。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneDeleteUserRequest 请求对象
     * @return SyncInvoker<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse>
     */
    public SyncInvoker<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> keystoneDeleteUserInvoker(KeystoneDeleteUserRequest request) {
        return new SyncInvoker<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse>(request, IamMeta.keystoneDeleteUser, hcClient);
    }

    /**
     * 查询IAM用户所属用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户所属用户组，或IAM用户查询自己所属用户组。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListGroupsForUserRequest 请求对象
     * @return KeystoneListGroupsForUserResponse
     */
    public KeystoneListGroupsForUserResponse keystoneListGroupsForUser(KeystoneListGroupsForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListGroupsForUser);
    }

    /**
     * 查询IAM用户所属用户组
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户所属用户组，或IAM用户查询自己所属用户组。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListGroupsForUserRequest 请求对象
     * @return SyncInvoker<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse>
     */
    public SyncInvoker<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> keystoneListGroupsForUserInvoker(KeystoneListGroupsForUserRequest request) {
        return new SyncInvoker<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse>(request, IamMeta.keystoneListGroupsForUser, hcClient);
    }

    /**
     * 管理员查询IAM用户列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListUsersRequest 请求对象
     * @return KeystoneListUsersResponse
     */
    public KeystoneListUsersResponse keystoneListUsers(KeystoneListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListUsers);
    }

    /**
     * 管理员查询IAM用户列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneListUsersRequest 请求对象
     * @return SyncInvoker<KeystoneListUsersRequest, KeystoneListUsersResponse>
     */
    public SyncInvoker<KeystoneListUsersRequest, KeystoneListUsersResponse> keystoneListUsersInvoker(KeystoneListUsersRequest request) {
        return new SyncInvoker<KeystoneListUsersRequest, KeystoneListUsersResponse>(request, IamMeta.keystoneListUsers, hcClient);
    }

    /**
     * 查询IAM用户详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的用户详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowUserRequest 请求对象
     * @return KeystoneShowUserResponse
     */
    public KeystoneShowUserResponse keystoneShowUser(KeystoneShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowUser);
    }

    /**
     * 查询IAM用户详情
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的用户详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneShowUserRequest 请求对象
     * @return SyncInvoker<KeystoneShowUserRequest, KeystoneShowUserResponse>
     */
    public SyncInvoker<KeystoneShowUserRequest, KeystoneShowUserResponse> keystoneShowUserInvoker(KeystoneShowUserRequest request) {
        return new SyncInvoker<KeystoneShowUserRequest, KeystoneShowUserResponse>(request, IamMeta.keystoneShowUser, hcClient);
    }

    /**
     * 管理员修改IAM用户信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateUserByAdminRequest 请求对象
     * @return KeystoneUpdateUserByAdminResponse
     */
    public KeystoneUpdateUserByAdminResponse keystoneUpdateUserByAdmin(KeystoneUpdateUserByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateUserByAdmin);
    }

    /**
     * 管理员修改IAM用户信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateUserByAdminRequest 请求对象
     * @return SyncInvoker<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse>
     */
    public SyncInvoker<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> keystoneUpdateUserByAdminInvoker(KeystoneUpdateUserByAdminRequest request) {
        return new SyncInvoker<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse>(request, IamMeta.keystoneUpdateUserByAdmin, hcClient);
    }

    /**
     * 修改IAM用户密码
     * 该接口可以用于IAM用户修改自己的密码。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateUserPasswordRequest 请求对象
     * @return KeystoneUpdateUserPasswordResponse
     */
    public KeystoneUpdateUserPasswordResponse keystoneUpdateUserPassword(KeystoneUpdateUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateUserPassword);
    }

    /**
     * 修改IAM用户密码
     * 该接口可以用于IAM用户修改自己的密码。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneUpdateUserPasswordRequest 请求对象
     * @return SyncInvoker<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse>
     */
    public SyncInvoker<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> keystoneUpdateUserPasswordInvoker(KeystoneUpdateUserPasswordRequest request) {
        return new SyncInvoker<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse>(request, IamMeta.keystoneUpdateUserPassword, hcClient);
    }

    /**
     * 查询IAM用户的登录保护状态信息列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的登录保护状态列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListUserLoginProtectsRequest 请求对象
     * @return ListUserLoginProtectsResponse
     */
    public ListUserLoginProtectsResponse listUserLoginProtects(ListUserLoginProtectsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listUserLoginProtects);
    }

    /**
     * 查询IAM用户的登录保护状态信息列表
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的登录保护状态列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListUserLoginProtectsRequest 请求对象
     * @return SyncInvoker<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse>
     */
    public SyncInvoker<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> listUserLoginProtectsInvoker(ListUserLoginProtectsRequest request) {
        return new SyncInvoker<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse>(request, IamMeta.listUserLoginProtects, hcClient);
    }

    /**
     * 该接口可以用于获取MFA设备。
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的MFA绑定信息列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListUserMfaDevicesRequest 请求对象
     * @return ListUserMfaDevicesResponse
     */
    public ListUserMfaDevicesResponse listUserMfaDevices(ListUserMfaDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listUserMfaDevices);
    }

    /**
     * 该接口可以用于获取MFA设备。
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的MFA绑定信息列表。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ListUserMfaDevicesRequest 请求对象
     * @return SyncInvoker<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse>
     */
    public SyncInvoker<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse> listUserMfaDevicesInvoker(ListUserMfaDevicesRequest request) {
        return new SyncInvoker<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse>(request, IamMeta.listUserMfaDevices, hcClient);
    }

    /**
     * 查询IAM用户详情（推荐）
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserRequest 请求对象
     * @return ShowUserResponse
     */
    public ShowUserResponse showUser(ShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showUser);
    }

    /**
     * 查询IAM用户详情（推荐）
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的详情。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserRequest 请求对象
     * @return SyncInvoker<ShowUserRequest, ShowUserResponse>
     */
    public SyncInvoker<ShowUserRequest, ShowUserResponse> showUserInvoker(ShowUserRequest request) {
        return new SyncInvoker<ShowUserRequest, ShowUserResponse>(request, IamMeta.showUser, hcClient);
    }

    /**
     * 查询指定IAM用户的登录保护状态信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的登录保护状态信息，或IAM用户查询自己的登录保护状态信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserLoginProtectRequest 请求对象
     * @return ShowUserLoginProtectResponse
     */
    public ShowUserLoginProtectResponse showUserLoginProtect(ShowUserLoginProtectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showUserLoginProtect);
    }

    /**
     * 查询指定IAM用户的登录保护状态信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的登录保护状态信息，或IAM用户查询自己的登录保护状态信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserLoginProtectRequest 请求对象
     * @return SyncInvoker<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse>
     */
    public SyncInvoker<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> showUserLoginProtectInvoker(ShowUserLoginProtectRequest request) {
        return new SyncInvoker<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse>(request, IamMeta.showUserLoginProtect, hcClient);
    }

    /**
     * 查询指定IAM用户的MFA绑定信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的MFA绑定信息，或IAM用户查询自己的MFA绑定信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserMfaDeviceRequest 请求对象
     * @return ShowUserMfaDeviceResponse
     */
    public ShowUserMfaDeviceResponse showUserMfaDevice(ShowUserMfaDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showUserMfaDevice);
    }

    /**
     * 查询指定IAM用户的MFA绑定信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的MFA绑定信息，或IAM用户查询自己的MFA绑定信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param ShowUserMfaDeviceRequest 请求对象
     * @return SyncInvoker<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse>
     */
    public SyncInvoker<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> showUserMfaDeviceInvoker(ShowUserMfaDeviceRequest request) {
        return new SyncInvoker<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse>(request, IamMeta.showUserMfaDevice, hcClient);
    }

    /**
     * 修改IAM用户登录保护状态信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateLoginProtectRequest 请求对象
     * @return UpdateLoginProtectResponse
     */
    public UpdateLoginProtectResponse updateLoginProtect(UpdateLoginProtectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateLoginProtect);
    }

    /**
     * 修改IAM用户登录保护状态信息
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateLoginProtectRequest 请求对象
     * @return SyncInvoker<UpdateLoginProtectRequest, UpdateLoginProtectResponse>
     */
    public SyncInvoker<UpdateLoginProtectRequest, UpdateLoginProtectResponse> updateLoginProtectInvoker(UpdateLoginProtectRequest request) {
        return new SyncInvoker<UpdateLoginProtectRequest, UpdateLoginProtectResponse>(request, IamMeta.updateLoginProtect, hcClient);
    }

    /**
     * 管理员修改IAM用户信息（推荐）
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息 。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateUser);
    }

    /**
     * 管理员修改IAM用户信息（推荐）
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息 。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateUserRequest 请求对象
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<UpdateUserRequest, UpdateUserResponse>(request, IamMeta.updateUser, hcClient);
    }

    /**
     * 修改IAM用户信息（推荐）
     * 该接口可以用于IAM用户修改自己的用户信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateUserInformationRequest 请求对象
     * @return UpdateUserInformationResponse
     */
    public UpdateUserInformationResponse updateUserInformation(UpdateUserInformationRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateUserInformation);
    }

    /**
     * 修改IAM用户信息（推荐）
     * 该接口可以用于IAM用户修改自己的用户信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param UpdateUserInformationRequest 请求对象
     * @return SyncInvoker<UpdateUserInformationRequest, UpdateUserInformationResponse>
     */
    public SyncInvoker<UpdateUserInformationRequest, UpdateUserInformationResponse> updateUserInformationInvoker(UpdateUserInformationRequest request) {
        return new SyncInvoker<UpdateUserInformationRequest, UpdateUserInformationResponse>(request, IamMeta.updateUserInformation, hcClient);
    }

    /**
     * 获取委托Token
     * 该接口可以用于获取委托方的token。    例如：A账号希望B账号管理自己的某些资源，所以A账号创建了委托给B账号，则A账号为委托方，B账号为被委托方。那么B账号可以通过该接口获取委托token。B账号仅能使用该token管理A账号的委托资源，不能管理自己账号中的资源。如果B账号需要管理自己账号中的资源，则需要获取自己的用户token。    token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。    &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。
     *
     * @param KeystoneCreateAgencyTokenRequest 请求对象
     * @return KeystoneCreateAgencyTokenResponse
     */
    public KeystoneCreateAgencyTokenResponse keystoneCreateAgencyToken(KeystoneCreateAgencyTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateAgencyToken);
    }

    /**
     * 获取委托Token
     * 该接口可以用于获取委托方的token。    例如：A账号希望B账号管理自己的某些资源，所以A账号创建了委托给B账号，则A账号为委托方，B账号为被委托方。那么B账号可以通过该接口获取委托token。B账号仅能使用该token管理A账号的委托资源，不能管理自己账号中的资源。如果B账号需要管理自己账号中的资源，则需要获取自己的用户token。    token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。    &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。
     *
     * @param KeystoneCreateAgencyTokenRequest 请求对象
     * @return SyncInvoker<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse>
     */
    public SyncInvoker<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> keystoneCreateAgencyTokenInvoker(KeystoneCreateAgencyTokenRequest request) {
        return new SyncInvoker<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse>(request, IamMeta.keystoneCreateAgencyToken, hcClient);
    }

    /**
     * 获取IAM用户Token（使用密码）
     * 该接口可以用于通过用户名/密码的方式进行认证来获取IAM用户token。    token是系统颁发给IAM用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的IAM用户token进行鉴权。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。   &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。   &gt; - 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。   &gt; - 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     *
     * @param KeystoneCreateUserTokenByPasswordRequest 请求对象
     * @return KeystoneCreateUserTokenByPasswordResponse
     */
    public KeystoneCreateUserTokenByPasswordResponse keystoneCreateUserTokenByPassword(KeystoneCreateUserTokenByPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateUserTokenByPassword);
    }

    /**
     * 获取IAM用户Token（使用密码）
     * 该接口可以用于通过用户名/密码的方式进行认证来获取IAM用户token。    token是系统颁发给IAM用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的IAM用户token进行鉴权。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。   &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。   &gt; - 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。   &gt; - 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     *
     * @param KeystoneCreateUserTokenByPasswordRequest 请求对象
     * @return SyncInvoker<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse>
     */
    public SyncInvoker<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse> keystoneCreateUserTokenByPasswordInvoker(KeystoneCreateUserTokenByPasswordRequest request) {
        return new SyncInvoker<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse>(request, IamMeta.keystoneCreateUserTokenByPassword, hcClient);
    }

    /**
     * 获取IAM用户Token（使用密码+虚拟MFA）
     * 该接口可以用于通过用户名/密码+虚拟MFA的方式进行认证，在IAM用户开启了的登录保护功能，并选择通过虚拟MFA验证时获取IAM用户token。    token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。   &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。   &gt; - 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。   &gt; - 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     *
     * @param KeystoneCreateUserTokenByPasswordAndMfaRequest 请求对象
     * @return KeystoneCreateUserTokenByPasswordAndMfaResponse
     */
    public KeystoneCreateUserTokenByPasswordAndMfaResponse keystoneCreateUserTokenByPasswordAndMfa(KeystoneCreateUserTokenByPasswordAndMfaRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateUserTokenByPasswordAndMfa);
    }

    /**
     * 获取IAM用户Token（使用密码+虚拟MFA）
     * 该接口可以用于通过用户名/密码+虚拟MFA的方式进行认证，在IAM用户开启了的登录保护功能，并选择通过虚拟MFA验证时获取IAM用户token。    token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。   &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。   &gt; - 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。   &gt; - 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     *
     * @param KeystoneCreateUserTokenByPasswordAndMfaRequest 请求对象
     * @return SyncInvoker<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse>
     */
    public SyncInvoker<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse> keystoneCreateUserTokenByPasswordAndMfaInvoker(KeystoneCreateUserTokenByPasswordAndMfaRequest request) {
        return new SyncInvoker<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse>(request, IamMeta.keystoneCreateUserTokenByPasswordAndMfa, hcClient);
    }

    /**
     * 校验Token的有效性
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)校验本账号中IAM用户token的有效性，或IAM用户校验自己token的有效性。管理员仅能校验本账号中IAM用户token的有效性，不能校验其他账号中IAM用户token的有效性。如果被校验的token有效，则返回该token的详细信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneValidateTokenRequest 请求对象
     * @return KeystoneValidateTokenResponse
     */
    public KeystoneValidateTokenResponse keystoneValidateToken(KeystoneValidateTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneValidateToken);
    }

    /**
     * 校验Token的有效性
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)校验本账号中IAM用户token的有效性，或IAM用户校验自己token的有效性。管理员仅能校验本账号中IAM用户token的有效性，不能校验其他账号中IAM用户token的有效性。如果被校验的token有效，则返回该token的详细信息。    该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     *
     * @param KeystoneValidateTokenRequest 请求对象
     * @return SyncInvoker<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse>
     */
    public SyncInvoker<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse> keystoneValidateTokenInvoker(KeystoneValidateTokenRequest request) {
        return new SyncInvoker<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse>(request, IamMeta.keystoneValidateToken, hcClient);
    }

}