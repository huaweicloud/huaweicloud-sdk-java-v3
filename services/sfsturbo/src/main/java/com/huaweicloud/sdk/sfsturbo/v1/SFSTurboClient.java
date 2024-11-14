package com.huaweicloud.sdk.sfsturbo.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.sfsturbo.v1.model.BatchAddSharedTagsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.BatchAddSharedTagsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeSecurityGroupRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeSecurityGroupResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeShareNameRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeShareNameResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateBackendTargetRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateBackendTargetResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsTaskRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsTaskResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateHpcCacheTaskRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateHpcCacheTaskResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateLdapConfigRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateLdapConfigResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreatePermRuleRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreatePermRuleResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateSharedTagRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateSharedTagResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteBackendTargetRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteBackendTargetResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsTaskRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsTaskResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteHpcCacheTaskRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteHpcCacheTaskResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteLdapConfigRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteLdapConfigResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeletePermRuleRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeletePermRuleResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteSharedTagRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteSharedTagResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ExpandShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ExpandShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListBackendTargetsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListBackendTargetsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListFsTasksRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListFsTasksResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListHpcCacheTasksRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListHpcCacheTasksResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListPermRulesRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListPermRulesResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharedTagsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharedTagsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharesRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharesResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.SetHpcCacheBackendRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.SetHpcCacheBackendResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowBackendTargetInfoRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowBackendTargetInfoResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirUsageRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirUsageResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsTaskRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsTaskResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowHpcCacheTaskRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowHpcCacheTaskResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowLdapConfigRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowLdapConfigResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowPermRuleRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowPermRuleResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowSharedTagsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowSharedTagsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateHpcShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateHpcShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateLdapConfigRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateLdapConfigResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateObsTargetAttributesRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateObsTargetAttributesResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateObsTargetPolicyRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateObsTargetPolicyResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdatePermRuleRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdatePermRuleResponse;

public class SFSTurboClient {

    protected HcClient hcClient;

    public SFSTurboClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SFSTurboClient> newBuilder() {
        ClientBuilder<SFSTurboClient> clientBuilder = new ClientBuilder<>(SFSTurboClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加共享标签
     *
     * 指定共享批量添加标签。
     * 
     * 一个共享上最多有20个标签。
     * 一个共享上的多个标签的key不允许重复。
     * 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddSharedTagsRequest 请求对象
     * @return BatchAddSharedTagsResponse
     */
    public BatchAddSharedTagsResponse batchAddSharedTags(BatchAddSharedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.batchAddSharedTags);
    }

    /**
     * 批量添加共享标签
     *
     * 指定共享批量添加标签。
     * 
     * 一个共享上最多有20个标签。
     * 一个共享上的多个标签的key不允许重复。
     * 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddSharedTagsRequest 请求对象
     * @return SyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse>
     */
    public SyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> batchAddSharedTagsInvoker(
        BatchAddSharedTagsRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.batchAddSharedTags, hcClient);
    }

    /**
     * 修改文件系统绑定的安全组
     *
     * 修改SFS Turbo文件系统绑定的安全组。修改安全组为异步任务，可以通过“查询单个文件系统”返回的子状态字段“sub_status”来判断是否修改安全组状态，子状态为“232”即为修改安全组成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return ChangeSecurityGroupResponse
     */
    public ChangeSecurityGroupResponse changeSecurityGroup(ChangeSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.changeSecurityGroup);
    }

    /**
     * 修改文件系统绑定的安全组
     *
     * 修改SFS Turbo文件系统绑定的安全组。修改安全组为异步任务，可以通过“查询单个文件系统”返回的子状态字段“sub_status”来判断是否修改安全组状态，子状态为“232”即为修改安全组成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>
     */
    public SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroupInvoker(
        ChangeSecurityGroupRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.changeSecurityGroup, hcClient);
    }

    /**
     * 修改文件系统名称
     *
     * 修改文件系统名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeShareNameRequest 请求对象
     * @return ChangeShareNameResponse
     */
    public ChangeShareNameResponse changeShareName(ChangeShareNameRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.changeShareName);
    }

    /**
     * 修改文件系统名称
     *
     * 修改文件系统名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeShareNameRequest 请求对象
     * @return SyncInvoker<ChangeShareNameRequest, ChangeShareNameResponse>
     */
    public SyncInvoker<ChangeShareNameRequest, ChangeShareNameResponse> changeShareNameInvoker(
        ChangeShareNameRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.changeShareName, hcClient);
    }

    /**
     * 绑定后端存储
     *
     * 为SFS Turbo 文件系统绑定后端存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackendTargetRequest 请求对象
     * @return CreateBackendTargetResponse
     */
    public CreateBackendTargetResponse createBackendTarget(CreateBackendTargetRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createBackendTarget);
    }

    /**
     * 绑定后端存储
     *
     * 为SFS Turbo 文件系统绑定后端存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackendTargetRequest 请求对象
     * @return SyncInvoker<CreateBackendTargetRequest, CreateBackendTargetResponse>
     */
    public SyncInvoker<CreateBackendTargetRequest, CreateBackendTargetResponse> createBackendTargetInvoker(
        CreateBackendTargetRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.createBackendTarget, hcClient);
    }

    /**
     * 创建目录
     *
     * 创建目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFsDirRequest 请求对象
     * @return CreateFsDirResponse
     */
    public CreateFsDirResponse createFsDir(CreateFsDirRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createFsDir);
    }

    /**
     * 创建目录
     *
     * 创建目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFsDirRequest 请求对象
     * @return SyncInvoker<CreateFsDirRequest, CreateFsDirResponse>
     */
    public SyncInvoker<CreateFsDirRequest, CreateFsDirResponse> createFsDirInvoker(CreateFsDirRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.createFsDir, hcClient);
    }

    /**
     * 创建目标文件夹quota
     *
     * 创建目标文件夹quota。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFsDirQuotaRequest 请求对象
     * @return CreateFsDirQuotaResponse
     */
    public CreateFsDirQuotaResponse createFsDirQuota(CreateFsDirQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createFsDirQuota);
    }

    /**
     * 创建目标文件夹quota
     *
     * 创建目标文件夹quota。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFsDirQuotaRequest 请求对象
     * @return SyncInvoker<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse>
     */
    public SyncInvoker<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse> createFsDirQuotaInvoker(
        CreateFsDirQuotaRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.createFsDirQuota, hcClient);
    }

    /**
     * 创建文件系统异步任务
     *
     * 创建文件系统异步任务，仅支持异步查询目录资源使用情况，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFsTaskRequest 请求对象
     * @return CreateFsTaskResponse
     */
    public CreateFsTaskResponse createFsTask(CreateFsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createFsTask);
    }

    /**
     * 创建文件系统异步任务
     *
     * 创建文件系统异步任务，仅支持异步查询目录资源使用情况，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFsTaskRequest 请求对象
     * @return SyncInvoker<CreateFsTaskRequest, CreateFsTaskResponse>
     */
    public SyncInvoker<CreateFsTaskRequest, CreateFsTaskResponse> createFsTaskInvoker(CreateFsTaskRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.createFsTask, hcClient);
    }

    /**
     * 创建数据导入导出任务
     *
     * 创建数据导入导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHpcCacheTaskRequest 请求对象
     * @return CreateHpcCacheTaskResponse
     */
    public CreateHpcCacheTaskResponse createHpcCacheTask(CreateHpcCacheTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createHpcCacheTask);
    }

    /**
     * 创建数据导入导出任务
     *
     * 创建数据导入导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHpcCacheTaskRequest 请求对象
     * @return SyncInvoker<CreateHpcCacheTaskRequest, CreateHpcCacheTaskResponse>
     */
    public SyncInvoker<CreateHpcCacheTaskRequest, CreateHpcCacheTaskResponse> createHpcCacheTaskInvoker(
        CreateHpcCacheTaskRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.createHpcCacheTask, hcClient);
    }

    /**
     * 创建并绑定ldap配置
     *
     * 创建并绑定ldap配置。LDAP（Lightweight Directory Access Protocol），中文名称轻量级目录访问协议，是对目录服务器（Directory Server）进行访问、控制的一种标准协议。LDAP服务器可以集中式地管理用户和群组的归属关系，通过绑定LDAP服务器，当一个用户访问您的文件系统的文件时，SFS Turbo将会访问您的LDAP服务器以进行用户身份验证，并且获取用户和群组的归属关系，从而进行Linux标准的文件UGO权限的检查。要使用此功能，首先您需要搭建好LDAP服务器（当前SFS Turbo仅支持LDAP v3协议），常见提供LDAP协议访问的目录服务器实现有OpenLdap(Linux)，Active Directory(Windows)等，不同目录服务器的实现细节有所差别，绑定时需要指定对应的Schema（Schema配置错误将会导致SFS Turbo无法正确获取用户以及群组信息，可能导致无权限访问文件系统内文件），当前SFS Turbo支持的Schema有：
     * 1. RFC2307（Openldap通常选择此Schema）
     * 2. MS-AD-BIS（Active Directory通常选择此Schema，支持RFC2307bis，支持嵌套的群组）
     * 
     * SFS Turbo还支持配置主备LDAP服务器，当您的一台LDAP服务器故障无法访问后，SFS Turbo将会自动切换到备LDAP服务器访问，以免影响您的业务。同时，若您还选择将allow_local_user配置为Yes（默认为No），那么当您的LDAP服务器全部故障无法访问时，SFS Turbo将会使用您的本地用户以及群组信息，而非LDAP服务器中配置的信息进行身份验证和UGO权限检查，以最大程度减少故障影响面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLdapConfigRequest 请求对象
     * @return CreateLdapConfigResponse
     */
    public CreateLdapConfigResponse createLdapConfig(CreateLdapConfigRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createLdapConfig);
    }

    /**
     * 创建并绑定ldap配置
     *
     * 创建并绑定ldap配置。LDAP（Lightweight Directory Access Protocol），中文名称轻量级目录访问协议，是对目录服务器（Directory Server）进行访问、控制的一种标准协议。LDAP服务器可以集中式地管理用户和群组的归属关系，通过绑定LDAP服务器，当一个用户访问您的文件系统的文件时，SFS Turbo将会访问您的LDAP服务器以进行用户身份验证，并且获取用户和群组的归属关系，从而进行Linux标准的文件UGO权限的检查。要使用此功能，首先您需要搭建好LDAP服务器（当前SFS Turbo仅支持LDAP v3协议），常见提供LDAP协议访问的目录服务器实现有OpenLdap(Linux)，Active Directory(Windows)等，不同目录服务器的实现细节有所差别，绑定时需要指定对应的Schema（Schema配置错误将会导致SFS Turbo无法正确获取用户以及群组信息，可能导致无权限访问文件系统内文件），当前SFS Turbo支持的Schema有：
     * 1. RFC2307（Openldap通常选择此Schema）
     * 2. MS-AD-BIS（Active Directory通常选择此Schema，支持RFC2307bis，支持嵌套的群组）
     * 
     * SFS Turbo还支持配置主备LDAP服务器，当您的一台LDAP服务器故障无法访问后，SFS Turbo将会自动切换到备LDAP服务器访问，以免影响您的业务。同时，若您还选择将allow_local_user配置为Yes（默认为No），那么当您的LDAP服务器全部故障无法访问时，SFS Turbo将会使用您的本地用户以及群组信息，而非LDAP服务器中配置的信息进行身份验证和UGO权限检查，以最大程度减少故障影响面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLdapConfigRequest 请求对象
     * @return SyncInvoker<CreateLdapConfigRequest, CreateLdapConfigResponse>
     */
    public SyncInvoker<CreateLdapConfigRequest, CreateLdapConfigResponse> createLdapConfigInvoker(
        CreateLdapConfigRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.createLdapConfig, hcClient);
    }

    /**
     * 创建权限规则
     *
     * 创建权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePermRuleRequest 请求对象
     * @return CreatePermRuleResponse
     */
    public CreatePermRuleResponse createPermRule(CreatePermRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createPermRule);
    }

    /**
     * 创建权限规则
     *
     * 创建权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePermRuleRequest 请求对象
     * @return SyncInvoker<CreatePermRuleRequest, CreatePermRuleResponse>
     */
    public SyncInvoker<CreatePermRuleRequest, CreatePermRuleResponse> createPermRuleInvoker(
        CreatePermRuleRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.createPermRule, hcClient);
    }

    /**
     * 创建文件系统
     *
     * 创建文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareRequest 请求对象
     * @return CreateShareResponse
     */
    public CreateShareResponse createShare(CreateShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createShare);
    }

    /**
     * 创建文件系统
     *
     * 创建文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareRequest 请求对象
     * @return SyncInvoker<CreateShareRequest, CreateShareResponse>
     */
    public SyncInvoker<CreateShareRequest, CreateShareResponse> createShareInvoker(CreateShareRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.createShare, hcClient);
    }

    /**
     * 创建共享标签
     *
     * 指定共享添加一个标签。
     * 一个共享上最多有20个标签。
     * 一个共享上的多个标签的key不允许重复。
     * 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSharedTagRequest 请求对象
     * @return CreateSharedTagResponse
     */
    public CreateSharedTagResponse createSharedTag(CreateSharedTagRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createSharedTag);
    }

    /**
     * 创建共享标签
     *
     * 指定共享添加一个标签。
     * 一个共享上最多有20个标签。
     * 一个共享上的多个标签的key不允许重复。
     * 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSharedTagRequest 请求对象
     * @return SyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse>
     */
    public SyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse> createSharedTagInvoker(
        CreateSharedTagRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.createSharedTag, hcClient);
    }

    /**
     * 删除后端存储
     *
     * 删除后端存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackendTargetRequest 请求对象
     * @return DeleteBackendTargetResponse
     */
    public DeleteBackendTargetResponse deleteBackendTarget(DeleteBackendTargetRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteBackendTarget);
    }

    /**
     * 删除后端存储
     *
     * 删除后端存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackendTargetRequest 请求对象
     * @return SyncInvoker<DeleteBackendTargetRequest, DeleteBackendTargetResponse>
     */
    public SyncInvoker<DeleteBackendTargetRequest, DeleteBackendTargetResponse> deleteBackendTargetInvoker(
        DeleteBackendTargetRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.deleteBackendTarget, hcClient);
    }

    /**
     * 删除文件系统目录
     *
     * 删除文件系统目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFsDirRequest 请求对象
     * @return DeleteFsDirResponse
     */
    public DeleteFsDirResponse deleteFsDir(DeleteFsDirRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteFsDir);
    }

    /**
     * 删除文件系统目录
     *
     * 删除文件系统目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFsDirRequest 请求对象
     * @return SyncInvoker<DeleteFsDirRequest, DeleteFsDirResponse>
     */
    public SyncInvoker<DeleteFsDirRequest, DeleteFsDirResponse> deleteFsDirInvoker(DeleteFsDirRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.deleteFsDir, hcClient);
    }

    /**
     * 删除目标文件夹quota
     *
     * 删除目标文件夹quota。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFsDirQuotaRequest 请求对象
     * @return DeleteFsDirQuotaResponse
     */
    public DeleteFsDirQuotaResponse deleteFsDirQuota(DeleteFsDirQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteFsDirQuota);
    }

    /**
     * 删除目标文件夹quota
     *
     * 删除目标文件夹quota。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFsDirQuotaRequest 请求对象
     * @return SyncInvoker<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse>
     */
    public SyncInvoker<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse> deleteFsDirQuotaInvoker(
        DeleteFsDirQuotaRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.deleteFsDirQuota, hcClient);
    }

    /**
     * 取消/删除文件系统异步任务
     *
     * 如果异步任务正在执行，则取消并删除任务；否则，删除任务。仅支持删除目录资源使用情况的任务，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFsTaskRequest 请求对象
     * @return DeleteFsTaskResponse
     */
    public DeleteFsTaskResponse deleteFsTask(DeleteFsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteFsTask);
    }

    /**
     * 取消/删除文件系统异步任务
     *
     * 如果异步任务正在执行，则取消并删除任务；否则，删除任务。仅支持删除目录资源使用情况的任务，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFsTaskRequest 请求对象
     * @return SyncInvoker<DeleteFsTaskRequest, DeleteFsTaskResponse>
     */
    public SyncInvoker<DeleteFsTaskRequest, DeleteFsTaskResponse> deleteFsTaskInvoker(DeleteFsTaskRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.deleteFsTask, hcClient);
    }

    /**
     * 删除数据导入导出任务
     *
     * 删除数据导入导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHpcCacheTaskRequest 请求对象
     * @return DeleteHpcCacheTaskResponse
     */
    public DeleteHpcCacheTaskResponse deleteHpcCacheTask(DeleteHpcCacheTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteHpcCacheTask);
    }

    /**
     * 删除数据导入导出任务
     *
     * 删除数据导入导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHpcCacheTaskRequest 请求对象
     * @return SyncInvoker<DeleteHpcCacheTaskRequest, DeleteHpcCacheTaskResponse>
     */
    public SyncInvoker<DeleteHpcCacheTaskRequest, DeleteHpcCacheTaskResponse> deleteHpcCacheTaskInvoker(
        DeleteHpcCacheTaskRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.deleteHpcCacheTask, hcClient);
    }

    /**
     * 删除ldap配置
     *
     * 删除ldap配置。LDAP（Lightweight Directory Access Protocol），中文名称轻量级目录访问协议，是对目录服务器（Directory Server）进行访问、控制的一种标准协议。LDAP服务器可以集中式地管理用户和群组的归属关系，通过绑定LDAP服务器，当一个用户访问您的文件系统的文件时，SFS Turbo将会访问您的LDAP服务器以进行用户身份验证，并且获取用户和群组的归属关系，从而进行Linux标准的文件UGO权限的检查。要使用此功能，首先您需要搭建好LDAP服务器（当前SFS Turbo仅支持LDAP v3协议），常见提供LDAP协议访问的目录服务器实现有OpenLdap(Linux)，Active Directory(Windows)等，不同目录服务器的实现细节有所差别，绑定时需要指定对应的Schema（Schema配置错误将会导致SFS Turbo无法正确获取用户以及群组信息，可能导致无权限访问文件系统内文件），当前SFS Turbo支持的Schema有：
     * 1. RFC2307（Openldap通常选择此Schema）
     * 2. MS-AD-BIS（Active Directory通常选择此Schema，支持RFC2307bis，支持嵌套的群组）
     * 
     * SFS Turbo还支持配置主备LDAP服务器，当您的一台LDAP服务器故障无法访问后，SFS Turbo将会自动切换到备LDAP服务器访问，以免影响您的业务。同时，若您还选择将allow_local_user配置为Yes（默认为No），那么当您的LDAP服务器全部故障无法访问时，SFS Turbo将会使用您的本地用户以及群组信息，而非LDAP服务器中配置的信息进行身份验证和UGO权限检查，以最大程度减少故障影响面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLdapConfigRequest 请求对象
     * @return DeleteLdapConfigResponse
     */
    public DeleteLdapConfigResponse deleteLdapConfig(DeleteLdapConfigRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteLdapConfig);
    }

    /**
     * 删除ldap配置
     *
     * 删除ldap配置。LDAP（Lightweight Directory Access Protocol），中文名称轻量级目录访问协议，是对目录服务器（Directory Server）进行访问、控制的一种标准协议。LDAP服务器可以集中式地管理用户和群组的归属关系，通过绑定LDAP服务器，当一个用户访问您的文件系统的文件时，SFS Turbo将会访问您的LDAP服务器以进行用户身份验证，并且获取用户和群组的归属关系，从而进行Linux标准的文件UGO权限的检查。要使用此功能，首先您需要搭建好LDAP服务器（当前SFS Turbo仅支持LDAP v3协议），常见提供LDAP协议访问的目录服务器实现有OpenLdap(Linux)，Active Directory(Windows)等，不同目录服务器的实现细节有所差别，绑定时需要指定对应的Schema（Schema配置错误将会导致SFS Turbo无法正确获取用户以及群组信息，可能导致无权限访问文件系统内文件），当前SFS Turbo支持的Schema有：
     * 1. RFC2307（Openldap通常选择此Schema）
     * 2. MS-AD-BIS（Active Directory通常选择此Schema，支持RFC2307bis，支持嵌套的群组）
     * 
     * SFS Turbo还支持配置主备LDAP服务器，当您的一台LDAP服务器故障无法访问后，SFS Turbo将会自动切换到备LDAP服务器访问，以免影响您的业务。同时，若您还选择将allow_local_user配置为Yes（默认为No），那么当您的LDAP服务器全部故障无法访问时，SFS Turbo将会使用您的本地用户以及群组信息，而非LDAP服务器中配置的信息进行身份验证和UGO权限检查，以最大程度减少故障影响面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLdapConfigRequest 请求对象
     * @return SyncInvoker<DeleteLdapConfigRequest, DeleteLdapConfigResponse>
     */
    public SyncInvoker<DeleteLdapConfigRequest, DeleteLdapConfigResponse> deleteLdapConfigInvoker(
        DeleteLdapConfigRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.deleteLdapConfig, hcClient);
    }

    /**
     * 删除权限规则
     *
     * 删除权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePermRuleRequest 请求对象
     * @return DeletePermRuleResponse
     */
    public DeletePermRuleResponse deletePermRule(DeletePermRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deletePermRule);
    }

    /**
     * 删除权限规则
     *
     * 删除权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePermRuleRequest 请求对象
     * @return SyncInvoker<DeletePermRuleRequest, DeletePermRuleResponse>
     */
    public SyncInvoker<DeletePermRuleRequest, DeletePermRuleResponse> deletePermRuleInvoker(
        DeletePermRuleRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.deletePermRule, hcClient);
    }

    /**
     * 删除文件系统
     *
     * 删除文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShareRequest 请求对象
     * @return DeleteShareResponse
     */
    public DeleteShareResponse deleteShare(DeleteShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteShare);
    }

    /**
     * 删除文件系统
     *
     * 删除文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShareRequest 请求对象
     * @return SyncInvoker<DeleteShareRequest, DeleteShareResponse>
     */
    public SyncInvoker<DeleteShareRequest, DeleteShareResponse> deleteShareInvoker(DeleteShareRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.deleteShare, hcClient);
    }

    /**
     * 删除共享标签
     *
     * 指定共享删除一个标签。当共享中不存在指定要删除的key时，接口调用将会返回404错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSharedTagRequest 请求对象
     * @return DeleteSharedTagResponse
     */
    public DeleteSharedTagResponse deleteSharedTag(DeleteSharedTagRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteSharedTag);
    }

    /**
     * 删除共享标签
     *
     * 指定共享删除一个标签。当共享中不存在指定要删除的key时，接口调用将会返回404错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSharedTagRequest 请求对象
     * @return SyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse>
     */
    public SyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse> deleteSharedTagInvoker(
        DeleteSharedTagRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.deleteSharedTag, hcClient);
    }

    /**
     * 扩容文件系统
     *
     * 扩容文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandShareRequest 请求对象
     * @return ExpandShareResponse
     */
    public ExpandShareResponse expandShare(ExpandShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.expandShare);
    }

    /**
     * 扩容文件系统
     *
     * 扩容文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandShareRequest 请求对象
     * @return SyncInvoker<ExpandShareRequest, ExpandShareResponse>
     */
    public SyncInvoker<ExpandShareRequest, ExpandShareResponse> expandShareInvoker(ExpandShareRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.expandShare, hcClient);
    }

    /**
     * 查询后端存储列表
     *
     * 查询后端存储列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackendTargetsRequest 请求对象
     * @return ListBackendTargetsResponse
     */
    public ListBackendTargetsResponse listBackendTargets(ListBackendTargetsRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.listBackendTargets);
    }

    /**
     * 查询后端存储列表
     *
     * 查询后端存储列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackendTargetsRequest 请求对象
     * @return SyncInvoker<ListBackendTargetsRequest, ListBackendTargetsResponse>
     */
    public SyncInvoker<ListBackendTargetsRequest, ListBackendTargetsResponse> listBackendTargetsInvoker(
        ListBackendTargetsRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.listBackendTargets, hcClient);
    }

    /**
     * 获取文件系统异步任务列表
     *
     * 获取文件系统异步任务列表。仅支持查询目录资源使用情况的任务，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFsTasksRequest 请求对象
     * @return ListFsTasksResponse
     */
    public ListFsTasksResponse listFsTasks(ListFsTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.listFsTasks);
    }

    /**
     * 获取文件系统异步任务列表
     *
     * 获取文件系统异步任务列表。仅支持查询目录资源使用情况的任务，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFsTasksRequest 请求对象
     * @return SyncInvoker<ListFsTasksRequest, ListFsTasksResponse>
     */
    public SyncInvoker<ListFsTasksRequest, ListFsTasksResponse> listFsTasksInvoker(ListFsTasksRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.listFsTasks, hcClient);
    }

    /**
     * 查询数据导入导出任务列表
     *
     * 查询数据导入导出任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHpcCacheTasksRequest 请求对象
     * @return ListHpcCacheTasksResponse
     */
    public ListHpcCacheTasksResponse listHpcCacheTasks(ListHpcCacheTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.listHpcCacheTasks);
    }

    /**
     * 查询数据导入导出任务列表
     *
     * 查询数据导入导出任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHpcCacheTasksRequest 请求对象
     * @return SyncInvoker<ListHpcCacheTasksRequest, ListHpcCacheTasksResponse>
     */
    public SyncInvoker<ListHpcCacheTasksRequest, ListHpcCacheTasksResponse> listHpcCacheTasksInvoker(
        ListHpcCacheTasksRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.listHpcCacheTasks, hcClient);
    }

    /**
     * 查询文件系统的权限规则列表
     *
     * 查询文件系统的权限规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermRulesRequest 请求对象
     * @return ListPermRulesResponse
     */
    public ListPermRulesResponse listPermRules(ListPermRulesRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.listPermRules);
    }

    /**
     * 查询文件系统的权限规则列表
     *
     * 查询文件系统的权限规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermRulesRequest 请求对象
     * @return SyncInvoker<ListPermRulesRequest, ListPermRulesResponse>
     */
    public SyncInvoker<ListPermRulesRequest, ListPermRulesResponse> listPermRulesInvoker(ListPermRulesRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.listPermRules, hcClient);
    }

    /**
     * 查询租户所有共享的标签
     *
     * 查询租户所有共享的标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedTagsRequest 请求对象
     * @return ListSharedTagsResponse
     */
    public ListSharedTagsResponse listSharedTags(ListSharedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.listSharedTags);
    }

    /**
     * 查询租户所有共享的标签
     *
     * 查询租户所有共享的标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedTagsRequest 请求对象
     * @return SyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse>
     */
    public SyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse> listSharedTagsInvoker(
        ListSharedTagsRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.listSharedTags, hcClient);
    }

    /**
     * 获取文件系统列表
     *
     * 获取文件系统列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharesRequest 请求对象
     * @return ListSharesResponse
     */
    public ListSharesResponse listShares(ListSharesRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.listShares);
    }

    /**
     * 获取文件系统列表
     *
     * 获取文件系统列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharesRequest 请求对象
     * @return SyncInvoker<ListSharesRequest, ListSharesResponse>
     */
    public SyncInvoker<ListSharesRequest, ListSharesResponse> listSharesInvoker(ListSharesRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.listShares, hcClient);
    }

    /**
     * 配置hpc缓存型后端信息
     *
     * 配置hpc缓存型后端信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetHpcCacheBackendRequest 请求对象
     * @return SetHpcCacheBackendResponse
     */
    public SetHpcCacheBackendResponse setHpcCacheBackend(SetHpcCacheBackendRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.setHpcCacheBackend);
    }

    /**
     * 配置hpc缓存型后端信息
     *
     * 配置hpc缓存型后端信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetHpcCacheBackendRequest 请求对象
     * @return SyncInvoker<SetHpcCacheBackendRequest, SetHpcCacheBackendResponse>
     */
    public SyncInvoker<SetHpcCacheBackendRequest, SetHpcCacheBackendResponse> setHpcCacheBackendInvoker(
        SetHpcCacheBackendRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.setHpcCacheBackend, hcClient);
    }

    /**
     * 获取后端存储详细信息
     *
     * 获取后端存储详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackendTargetInfoRequest 请求对象
     * @return ShowBackendTargetInfoResponse
     */
    public ShowBackendTargetInfoResponse showBackendTargetInfo(ShowBackendTargetInfoRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showBackendTargetInfo);
    }

    /**
     * 获取后端存储详细信息
     *
     * 获取后端存储详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackendTargetInfoRequest 请求对象
     * @return SyncInvoker<ShowBackendTargetInfoRequest, ShowBackendTargetInfoResponse>
     */
    public SyncInvoker<ShowBackendTargetInfoRequest, ShowBackendTargetInfoResponse> showBackendTargetInfoInvoker(
        ShowBackendTargetInfoRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.showBackendTargetInfo, hcClient);
    }

    /**
     * 查询目录是否存在
     *
     * 查询目录是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsDirRequest 请求对象
     * @return ShowFsDirResponse
     */
    public ShowFsDirResponse showFsDir(ShowFsDirRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showFsDir);
    }

    /**
     * 查询目录是否存在
     *
     * 查询目录是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsDirRequest 请求对象
     * @return SyncInvoker<ShowFsDirRequest, ShowFsDirResponse>
     */
    public SyncInvoker<ShowFsDirRequest, ShowFsDirResponse> showFsDirInvoker(ShowFsDirRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.showFsDir, hcClient);
    }

    /**
     * 查询目标文件夹quota
     *
     * 查询目标文件夹quota。查询的used_capacity、used_inode数据可能有延迟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsDirQuotaRequest 请求对象
     * @return ShowFsDirQuotaResponse
     */
    public ShowFsDirQuotaResponse showFsDirQuota(ShowFsDirQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showFsDirQuota);
    }

    /**
     * 查询目标文件夹quota
     *
     * 查询目标文件夹quota。查询的used_capacity、used_inode数据可能有延迟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsDirQuotaRequest 请求对象
     * @return SyncInvoker<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse>
     */
    public SyncInvoker<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse> showFsDirQuotaInvoker(
        ShowFsDirQuotaRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.showFsDirQuota, hcClient);
    }

    /**
     * 查询目录资源使用情况
     *
     * 查询目录资源使用情况(包括子目录的资源)。后端有5min的缓存时间，查询的数据可能有延迟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsDirUsageRequest 请求对象
     * @return ShowFsDirUsageResponse
     */
    public ShowFsDirUsageResponse showFsDirUsage(ShowFsDirUsageRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showFsDirUsage);
    }

    /**
     * 查询目录资源使用情况
     *
     * 查询目录资源使用情况(包括子目录的资源)。后端有5min的缓存时间，查询的数据可能有延迟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsDirUsageRequest 请求对象
     * @return SyncInvoker<ShowFsDirUsageRequest, ShowFsDirUsageResponse>
     */
    public SyncInvoker<ShowFsDirUsageRequest, ShowFsDirUsageResponse> showFsDirUsageInvoker(
        ShowFsDirUsageRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.showFsDirUsage, hcClient);
    }

    /**
     * 获取文件系统异步任务详情
     *
     * 获取文件系统异步任务详情。仅支持查询目录资源使用情况的任务，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsTaskRequest 请求对象
     * @return ShowFsTaskResponse
     */
    public ShowFsTaskResponse showFsTask(ShowFsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showFsTask);
    }

    /**
     * 获取文件系统异步任务详情
     *
     * 获取文件系统异步任务详情。仅支持查询目录资源使用情况的任务，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsTaskRequest 请求对象
     * @return SyncInvoker<ShowFsTaskRequest, ShowFsTaskResponse>
     */
    public SyncInvoker<ShowFsTaskRequest, ShowFsTaskResponse> showFsTaskInvoker(ShowFsTaskRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.showFsTask, hcClient);
    }

    /**
     * 查询数据导入导出任务详情
     *
     * 查询数据导入导出任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHpcCacheTaskRequest 请求对象
     * @return ShowHpcCacheTaskResponse
     */
    public ShowHpcCacheTaskResponse showHpcCacheTask(ShowHpcCacheTaskRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showHpcCacheTask);
    }

    /**
     * 查询数据导入导出任务详情
     *
     * 查询数据导入导出任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHpcCacheTaskRequest 请求对象
     * @return SyncInvoker<ShowHpcCacheTaskRequest, ShowHpcCacheTaskResponse>
     */
    public SyncInvoker<ShowHpcCacheTaskRequest, ShowHpcCacheTaskResponse> showHpcCacheTaskInvoker(
        ShowHpcCacheTaskRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.showHpcCacheTask, hcClient);
    }

    /**
     * 查询job的状态详情
     *
     * 查询job的执行状态。 可用于查询SFS Turbo异步API的执行状态。例如：可使用调用创建并绑定ldap配置接口时返回的jobId，通过该接口查询job的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showJobDetail);
    }

    /**
     * 查询job的状态详情
     *
     * 查询job的执行状态。 可用于查询SFS Turbo异步API的执行状态。例如：可使用调用创建并绑定ldap配置接口时返回的jobId，通过该接口查询job的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.showJobDetail, hcClient);
    }

    /**
     * 查询Ldap的配置
     *
     * 查询Ldap的配置。LDAP（Lightweight Directory Access Protocol），中文名称轻量级目录访问协议，是对目录服务器（Directory Server）进行访问、控制的一种标准协议。LDAP服务器可以集中式地管理用户和群组的归属关系，通过绑定LDAP服务器，当一个用户访问您的文件系统的文件时，SFS Turbo将会访问您的LDAP服务器以进行用户身份验证，并且获取用户和群组的归属关系，从而进行Linux标准的文件UGO权限的检查。要使用此功能，首先您需要搭建好LDAP服务器（当前SFS Turbo仅支持LDAP v3协议），常见提供LDAP协议访问的目录服务器实现有OpenLdap(Linux)，Active Directory(Windows)等，不同目录服务器的实现细节有所差别，绑定时需要指定对应的Schema（Schema配置错误将会导致SFS Turbo无法正确获取用户以及群组信息，可能导致无权限访问文件系统内文件），当前SFS Turbo支持的Schema有：
     * 1. RFC2307（Openldap通常选择此Schema）
     * 2. MS-AD-BIS（Active Directory通常选择此Schema，支持RFC2307bis，支持嵌套的群组）
     * 
     * SFS Turbo还支持配置主备LDAP服务器，当您的一台LDAP服务器故障无法访问后，SFS Turbo将会自动切换到备LDAP服务器访问，以免影响您的业务。同时，若您还选择将allow_local_user配置为Yes（默认为No），那么当您的LDAP服务器全部故障无法访问时，SFS Turbo将会使用您的本地用户以及群组信息，而非LDAP服务器中配置的信息进行身份验证和UGO权限检查，以最大程度减少故障影响面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLdapConfigRequest 请求对象
     * @return ShowLdapConfigResponse
     */
    public ShowLdapConfigResponse showLdapConfig(ShowLdapConfigRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showLdapConfig);
    }

    /**
     * 查询Ldap的配置
     *
     * 查询Ldap的配置。LDAP（Lightweight Directory Access Protocol），中文名称轻量级目录访问协议，是对目录服务器（Directory Server）进行访问、控制的一种标准协议。LDAP服务器可以集中式地管理用户和群组的归属关系，通过绑定LDAP服务器，当一个用户访问您的文件系统的文件时，SFS Turbo将会访问您的LDAP服务器以进行用户身份验证，并且获取用户和群组的归属关系，从而进行Linux标准的文件UGO权限的检查。要使用此功能，首先您需要搭建好LDAP服务器（当前SFS Turbo仅支持LDAP v3协议），常见提供LDAP协议访问的目录服务器实现有OpenLdap(Linux)，Active Directory(Windows)等，不同目录服务器的实现细节有所差别，绑定时需要指定对应的Schema（Schema配置错误将会导致SFS Turbo无法正确获取用户以及群组信息，可能导致无权限访问文件系统内文件），当前SFS Turbo支持的Schema有：
     * 1. RFC2307（Openldap通常选择此Schema）
     * 2. MS-AD-BIS（Active Directory通常选择此Schema，支持RFC2307bis，支持嵌套的群组）
     * 
     * SFS Turbo还支持配置主备LDAP服务器，当您的一台LDAP服务器故障无法访问后，SFS Turbo将会自动切换到备LDAP服务器访问，以免影响您的业务。同时，若您还选择将allow_local_user配置为Yes（默认为No），那么当您的LDAP服务器全部故障无法访问时，SFS Turbo将会使用您的本地用户以及群组信息，而非LDAP服务器中配置的信息进行身份验证和UGO权限检查，以最大程度减少故障影响面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLdapConfigRequest 请求对象
     * @return SyncInvoker<ShowLdapConfigRequest, ShowLdapConfigResponse>
     */
    public SyncInvoker<ShowLdapConfigRequest, ShowLdapConfigResponse> showLdapConfigInvoker(
        ShowLdapConfigRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.showLdapConfig, hcClient);
    }

    /**
     * 查询文件系统的某一个权限规则
     *
     * 查询文件系统的某一个权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPermRuleRequest 请求对象
     * @return ShowPermRuleResponse
     */
    public ShowPermRuleResponse showPermRule(ShowPermRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showPermRule);
    }

    /**
     * 查询文件系统的某一个权限规则
     *
     * 查询文件系统的某一个权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPermRuleRequest 请求对象
     * @return SyncInvoker<ShowPermRuleRequest, ShowPermRuleResponse>
     */
    public SyncInvoker<ShowPermRuleRequest, ShowPermRuleResponse> showPermRuleInvoker(ShowPermRuleRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.showPermRule, hcClient);
    }

    /**
     * 查询文件系统详细信息
     *
     * 查询SFS Turbo文件系统详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShareRequest 请求对象
     * @return ShowShareResponse
     */
    public ShowShareResponse showShare(ShowShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showShare);
    }

    /**
     * 查询文件系统详细信息
     *
     * 查询SFS Turbo文件系统详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShareRequest 请求对象
     * @return SyncInvoker<ShowShareRequest, ShowShareResponse>
     */
    public SyncInvoker<ShowShareRequest, ShowShareResponse> showShareInvoker(ShowShareRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.showShare, hcClient);
    }

    /**
     * 查询共享标签
     *
     * 查询指定共享的所有标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSharedTagsRequest 请求对象
     * @return ShowSharedTagsResponse
     */
    public ShowSharedTagsResponse showSharedTags(ShowSharedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showSharedTags);
    }

    /**
     * 查询共享标签
     *
     * 查询指定共享的所有标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSharedTagsRequest 请求对象
     * @return SyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse>
     */
    public SyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse> showSharedTagsInvoker(
        ShowSharedTagsRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.showSharedTags, hcClient);
    }

    /**
     * 更新目标文件夹quota
     *
     * 更新目标文件夹quota
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFsDirQuotaRequest 请求对象
     * @return UpdateFsDirQuotaResponse
     */
    public UpdateFsDirQuotaResponse updateFsDirQuota(UpdateFsDirQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.updateFsDirQuota);
    }

    /**
     * 更新目标文件夹quota
     *
     * 更新目标文件夹quota
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFsDirQuotaRequest 请求对象
     * @return SyncInvoker<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse>
     */
    public SyncInvoker<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse> updateFsDirQuotaInvoker(
        UpdateFsDirQuotaRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.updateFsDirQuota, hcClient);
    }

    /**
     * 更新文件系统
     *
     * 更新文件系统冷数据淘汰时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHpcShareRequest 请求对象
     * @return UpdateHpcShareResponse
     */
    public UpdateHpcShareResponse updateHpcShare(UpdateHpcShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.updateHpcShare);
    }

    /**
     * 更新文件系统
     *
     * 更新文件系统冷数据淘汰时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHpcShareRequest 请求对象
     * @return SyncInvoker<UpdateHpcShareRequest, UpdateHpcShareResponse>
     */
    public SyncInvoker<UpdateHpcShareRequest, UpdateHpcShareResponse> updateHpcShareInvoker(
        UpdateHpcShareRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.updateHpcShare, hcClient);
    }

    /**
     * 修改ldap配置
     *
     * 修改ldap配置。LDAP（Lightweight Directory Access Protocol），中文名称轻量级目录访问协议，是对目录服务器（Directory Server）进行访问、控制的一种标准协议。LDAP服务器可以集中式地管理用户和群组的归属关系，通过绑定LDAP服务器，当一个用户访问您的文件系统的文件时，SFS Turbo将会访问您的LDAP服务器以进行用户身份验证，并且获取用户和群组的归属关系，从而进行Linux标准的文件UGO权限的检查。要使用此功能，首先您需要搭建好LDAP服务器（当前SFS Turbo仅支持LDAP v3协议），常见提供LDAP协议访问的目录服务器实现有OpenLdap(Linux)，Active Directory(Windows)等，不同目录服务器的实现细节有所差别，绑定时需要指定对应的Schema（Schema配置错误将会导致SFS Turbo无法正确获取用户以及群组信息，可能导致无权限访问文件系统内文件），当前SFS Turbo支持的Schema有：
     * 1. RFC2307（Openldap通常选择此Schema）
     * 2. MS-AD-BIS（Active Directory通常选择此Schema，支持RFC2307bis，支持嵌套的群组）
     * 
     * SFS Turbo还支持配置主备LDAP服务器，当您的一台LDAP服务器故障无法访问后，SFS Turbo将会自动切换到备LDAP服务器访问，以免影响您的业务。同时，若您还选择将allow_local_user配置为Yes（默认为No），那么当您的LDAP服务器全部故障无法访问时，SFS Turbo将会使用您的本地用户以及群组信息，而非LDAP服务器中配置的信息进行身份验证和UGO权限检查，以最大程度减少故障影响面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLdapConfigRequest 请求对象
     * @return UpdateLdapConfigResponse
     */
    public UpdateLdapConfigResponse updateLdapConfig(UpdateLdapConfigRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.updateLdapConfig);
    }

    /**
     * 修改ldap配置
     *
     * 修改ldap配置。LDAP（Lightweight Directory Access Protocol），中文名称轻量级目录访问协议，是对目录服务器（Directory Server）进行访问、控制的一种标准协议。LDAP服务器可以集中式地管理用户和群组的归属关系，通过绑定LDAP服务器，当一个用户访问您的文件系统的文件时，SFS Turbo将会访问您的LDAP服务器以进行用户身份验证，并且获取用户和群组的归属关系，从而进行Linux标准的文件UGO权限的检查。要使用此功能，首先您需要搭建好LDAP服务器（当前SFS Turbo仅支持LDAP v3协议），常见提供LDAP协议访问的目录服务器实现有OpenLdap(Linux)，Active Directory(Windows)等，不同目录服务器的实现细节有所差别，绑定时需要指定对应的Schema（Schema配置错误将会导致SFS Turbo无法正确获取用户以及群组信息，可能导致无权限访问文件系统内文件），当前SFS Turbo支持的Schema有：
     * 1. RFC2307（Openldap通常选择此Schema）
     * 2. MS-AD-BIS（Active Directory通常选择此Schema，支持RFC2307bis，支持嵌套的群组）
     * 
     * SFS Turbo还支持配置主备LDAP服务器，当您的一台LDAP服务器故障无法访问后，SFS Turbo将会自动切换到备LDAP服务器访问，以免影响您的业务。同时，若您还选择将allow_local_user配置为Yes（默认为No），那么当您的LDAP服务器全部故障无法访问时，SFS Turbo将会使用您的本地用户以及群组信息，而非LDAP服务器中配置的信息进行身份验证和UGO权限检查，以最大程度减少故障影响面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLdapConfigRequest 请求对象
     * @return SyncInvoker<UpdateLdapConfigRequest, UpdateLdapConfigResponse>
     */
    public SyncInvoker<UpdateLdapConfigRequest, UpdateLdapConfigResponse> updateLdapConfigInvoker(
        UpdateLdapConfigRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.updateLdapConfig, hcClient);
    }

    /**
     * 更新后端存储属性
     *
     * 更新后端存储属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsTargetAttributesRequest 请求对象
     * @return UpdateObsTargetAttributesResponse
     */
    public UpdateObsTargetAttributesResponse updateObsTargetAttributes(UpdateObsTargetAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.updateObsTargetAttributes);
    }

    /**
     * 更新后端存储属性
     *
     * 更新后端存储属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsTargetAttributesRequest 请求对象
     * @return SyncInvoker<UpdateObsTargetAttributesRequest, UpdateObsTargetAttributesResponse>
     */
    public SyncInvoker<UpdateObsTargetAttributesRequest, UpdateObsTargetAttributesResponse> updateObsTargetAttributesInvoker(
        UpdateObsTargetAttributesRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.updateObsTargetAttributes, hcClient);
    }

    /**
     * 更新后端存储自动同步策略
     *
     * 更新后端存储自动同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsTargetPolicyRequest 请求对象
     * @return UpdateObsTargetPolicyResponse
     */
    public UpdateObsTargetPolicyResponse updateObsTargetPolicy(UpdateObsTargetPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.updateObsTargetPolicy);
    }

    /**
     * 更新后端存储自动同步策略
     *
     * 更新后端存储自动同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsTargetPolicyRequest 请求对象
     * @return SyncInvoker<UpdateObsTargetPolicyRequest, UpdateObsTargetPolicyResponse>
     */
    public SyncInvoker<UpdateObsTargetPolicyRequest, UpdateObsTargetPolicyResponse> updateObsTargetPolicyInvoker(
        UpdateObsTargetPolicyRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.updateObsTargetPolicy, hcClient);
    }

    /**
     * 修改权限规则
     *
     * 修改权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePermRuleRequest 请求对象
     * @return UpdatePermRuleResponse
     */
    public UpdatePermRuleResponse updatePermRule(UpdatePermRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.updatePermRule);
    }

    /**
     * 修改权限规则
     *
     * 修改权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePermRuleRequest 请求对象
     * @return SyncInvoker<UpdatePermRuleRequest, UpdatePermRuleResponse>
     */
    public SyncInvoker<UpdatePermRuleRequest, UpdatePermRuleResponse> updatePermRuleInvoker(
        UpdatePermRuleRequest request) {
        return new SyncInvoker<>(request, SFSTurboMeta.updatePermRule, hcClient);
    }

}
