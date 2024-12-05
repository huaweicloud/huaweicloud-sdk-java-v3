package com.huaweicloud.sdk.sfsturbo.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharesByTagRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharesByTagResponse;
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

import java.util.concurrent.CompletableFuture;

public class SFSTurboAsyncClient {

    protected HcClient hcClient;

    public SFSTurboAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SFSTurboAsyncClient> newBuilder() {
        ClientBuilder<SFSTurboAsyncClient> clientBuilder = new ClientBuilder<>(SFSTurboAsyncClient::new);
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
     * @return CompletableFuture<BatchAddSharedTagsResponse>
     */
    public CompletableFuture<BatchAddSharedTagsResponse> batchAddSharedTagsAsync(BatchAddSharedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.batchAddSharedTags);
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
     * @return AsyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse>
     */
    public AsyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> batchAddSharedTagsAsyncInvoker(
        BatchAddSharedTagsRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.batchAddSharedTags, hcClient);
    }

    /**
     * 修改文件系统绑定的安全组
     *
     * 修改SFS Turbo文件系统绑定的安全组。修改安全组为异步任务，可以通过“查询单个文件系统”返回的子状态字段“sub_status”来判断是否修改安全组状态，子状态为“232”即为修改安全组成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return CompletableFuture<ChangeSecurityGroupResponse>
     */
    public CompletableFuture<ChangeSecurityGroupResponse> changeSecurityGroupAsync(ChangeSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.changeSecurityGroup);
    }

    /**
     * 修改文件系统绑定的安全组
     *
     * 修改SFS Turbo文件系统绑定的安全组。修改安全组为异步任务，可以通过“查询单个文件系统”返回的子状态字段“sub_status”来判断是否修改安全组状态，子状态为“232”即为修改安全组成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>
     */
    public AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroupAsyncInvoker(
        ChangeSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.changeSecurityGroup, hcClient);
    }

    /**
     * 修改文件系统名称
     *
     * 修改文件系统名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeShareNameRequest 请求对象
     * @return CompletableFuture<ChangeShareNameResponse>
     */
    public CompletableFuture<ChangeShareNameResponse> changeShareNameAsync(ChangeShareNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.changeShareName);
    }

    /**
     * 修改文件系统名称
     *
     * 修改文件系统名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeShareNameRequest 请求对象
     * @return AsyncInvoker<ChangeShareNameRequest, ChangeShareNameResponse>
     */
    public AsyncInvoker<ChangeShareNameRequest, ChangeShareNameResponse> changeShareNameAsyncInvoker(
        ChangeShareNameRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.changeShareName, hcClient);
    }

    /**
     * 绑定后端存储
     *
     * 为SFS Turbo 文件系统绑定后端存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackendTargetRequest 请求对象
     * @return CompletableFuture<CreateBackendTargetResponse>
     */
    public CompletableFuture<CreateBackendTargetResponse> createBackendTargetAsync(CreateBackendTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createBackendTarget);
    }

    /**
     * 绑定后端存储
     *
     * 为SFS Turbo 文件系统绑定后端存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackendTargetRequest 请求对象
     * @return AsyncInvoker<CreateBackendTargetRequest, CreateBackendTargetResponse>
     */
    public AsyncInvoker<CreateBackendTargetRequest, CreateBackendTargetResponse> createBackendTargetAsyncInvoker(
        CreateBackendTargetRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.createBackendTarget, hcClient);
    }

    /**
     * 创建目录
     *
     * 创建目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFsDirRequest 请求对象
     * @return CompletableFuture<CreateFsDirResponse>
     */
    public CompletableFuture<CreateFsDirResponse> createFsDirAsync(CreateFsDirRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createFsDir);
    }

    /**
     * 创建目录
     *
     * 创建目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFsDirRequest 请求对象
     * @return AsyncInvoker<CreateFsDirRequest, CreateFsDirResponse>
     */
    public AsyncInvoker<CreateFsDirRequest, CreateFsDirResponse> createFsDirAsyncInvoker(CreateFsDirRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.createFsDir, hcClient);
    }

    /**
     * 创建目标文件夹quota
     *
     * 创建目标文件夹quota。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFsDirQuotaRequest 请求对象
     * @return CompletableFuture<CreateFsDirQuotaResponse>
     */
    public CompletableFuture<CreateFsDirQuotaResponse> createFsDirQuotaAsync(CreateFsDirQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createFsDirQuota);
    }

    /**
     * 创建目标文件夹quota
     *
     * 创建目标文件夹quota。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFsDirQuotaRequest 请求对象
     * @return AsyncInvoker<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse>
     */
    public AsyncInvoker<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse> createFsDirQuotaAsyncInvoker(
        CreateFsDirQuotaRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.createFsDirQuota, hcClient);
    }

    /**
     * 创建文件系统异步任务
     *
     * 创建文件系统异步任务，仅支持异步查询目录资源使用情况，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFsTaskRequest 请求对象
     * @return CompletableFuture<CreateFsTaskResponse>
     */
    public CompletableFuture<CreateFsTaskResponse> createFsTaskAsync(CreateFsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createFsTask);
    }

    /**
     * 创建文件系统异步任务
     *
     * 创建文件系统异步任务，仅支持异步查询目录资源使用情况，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFsTaskRequest 请求对象
     * @return AsyncInvoker<CreateFsTaskRequest, CreateFsTaskResponse>
     */
    public AsyncInvoker<CreateFsTaskRequest, CreateFsTaskResponse> createFsTaskAsyncInvoker(
        CreateFsTaskRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.createFsTask, hcClient);
    }

    /**
     * 创建数据导入导出任务
     *
     * 创建数据导入导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHpcCacheTaskRequest 请求对象
     * @return CompletableFuture<CreateHpcCacheTaskResponse>
     */
    public CompletableFuture<CreateHpcCacheTaskResponse> createHpcCacheTaskAsync(CreateHpcCacheTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createHpcCacheTask);
    }

    /**
     * 创建数据导入导出任务
     *
     * 创建数据导入导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHpcCacheTaskRequest 请求对象
     * @return AsyncInvoker<CreateHpcCacheTaskRequest, CreateHpcCacheTaskResponse>
     */
    public AsyncInvoker<CreateHpcCacheTaskRequest, CreateHpcCacheTaskResponse> createHpcCacheTaskAsyncInvoker(
        CreateHpcCacheTaskRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.createHpcCacheTask, hcClient);
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
     * @return CompletableFuture<CreateLdapConfigResponse>
     */
    public CompletableFuture<CreateLdapConfigResponse> createLdapConfigAsync(CreateLdapConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createLdapConfig);
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
     * @return AsyncInvoker<CreateLdapConfigRequest, CreateLdapConfigResponse>
     */
    public AsyncInvoker<CreateLdapConfigRequest, CreateLdapConfigResponse> createLdapConfigAsyncInvoker(
        CreateLdapConfigRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.createLdapConfig, hcClient);
    }

    /**
     * 创建权限规则
     *
     * 创建权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePermRuleRequest 请求对象
     * @return CompletableFuture<CreatePermRuleResponse>
     */
    public CompletableFuture<CreatePermRuleResponse> createPermRuleAsync(CreatePermRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createPermRule);
    }

    /**
     * 创建权限规则
     *
     * 创建权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePermRuleRequest 请求对象
     * @return AsyncInvoker<CreatePermRuleRequest, CreatePermRuleResponse>
     */
    public AsyncInvoker<CreatePermRuleRequest, CreatePermRuleResponse> createPermRuleAsyncInvoker(
        CreatePermRuleRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.createPermRule, hcClient);
    }

    /**
     * 创建文件系统
     *
     * 创建文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareRequest 请求对象
     * @return CompletableFuture<CreateShareResponse>
     */
    public CompletableFuture<CreateShareResponse> createShareAsync(CreateShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createShare);
    }

    /**
     * 创建文件系统
     *
     * 创建文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareRequest 请求对象
     * @return AsyncInvoker<CreateShareRequest, CreateShareResponse>
     */
    public AsyncInvoker<CreateShareRequest, CreateShareResponse> createShareAsyncInvoker(CreateShareRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.createShare, hcClient);
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
     * @return CompletableFuture<CreateSharedTagResponse>
     */
    public CompletableFuture<CreateSharedTagResponse> createSharedTagAsync(CreateSharedTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createSharedTag);
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
     * @return AsyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse>
     */
    public AsyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse> createSharedTagAsyncInvoker(
        CreateSharedTagRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.createSharedTag, hcClient);
    }

    /**
     * 删除后端存储
     *
     * 删除后端存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackendTargetRequest 请求对象
     * @return CompletableFuture<DeleteBackendTargetResponse>
     */
    public CompletableFuture<DeleteBackendTargetResponse> deleteBackendTargetAsync(DeleteBackendTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteBackendTarget);
    }

    /**
     * 删除后端存储
     *
     * 删除后端存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackendTargetRequest 请求对象
     * @return AsyncInvoker<DeleteBackendTargetRequest, DeleteBackendTargetResponse>
     */
    public AsyncInvoker<DeleteBackendTargetRequest, DeleteBackendTargetResponse> deleteBackendTargetAsyncInvoker(
        DeleteBackendTargetRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.deleteBackendTarget, hcClient);
    }

    /**
     * 删除文件系统目录
     *
     * 删除文件系统目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFsDirRequest 请求对象
     * @return CompletableFuture<DeleteFsDirResponse>
     */
    public CompletableFuture<DeleteFsDirResponse> deleteFsDirAsync(DeleteFsDirRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteFsDir);
    }

    /**
     * 删除文件系统目录
     *
     * 删除文件系统目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFsDirRequest 请求对象
     * @return AsyncInvoker<DeleteFsDirRequest, DeleteFsDirResponse>
     */
    public AsyncInvoker<DeleteFsDirRequest, DeleteFsDirResponse> deleteFsDirAsyncInvoker(DeleteFsDirRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.deleteFsDir, hcClient);
    }

    /**
     * 删除目标文件夹quota
     *
     * 删除目标文件夹quota。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFsDirQuotaRequest 请求对象
     * @return CompletableFuture<DeleteFsDirQuotaResponse>
     */
    public CompletableFuture<DeleteFsDirQuotaResponse> deleteFsDirQuotaAsync(DeleteFsDirQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteFsDirQuota);
    }

    /**
     * 删除目标文件夹quota
     *
     * 删除目标文件夹quota。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFsDirQuotaRequest 请求对象
     * @return AsyncInvoker<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse>
     */
    public AsyncInvoker<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse> deleteFsDirQuotaAsyncInvoker(
        DeleteFsDirQuotaRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.deleteFsDirQuota, hcClient);
    }

    /**
     * 取消/删除文件系统异步任务
     *
     * 如果异步任务正在执行，则取消并删除任务；否则，删除任务。仅支持删除目录资源使用情况的任务，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFsTaskRequest 请求对象
     * @return CompletableFuture<DeleteFsTaskResponse>
     */
    public CompletableFuture<DeleteFsTaskResponse> deleteFsTaskAsync(DeleteFsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteFsTask);
    }

    /**
     * 取消/删除文件系统异步任务
     *
     * 如果异步任务正在执行，则取消并删除任务；否则，删除任务。仅支持删除目录资源使用情况的任务，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFsTaskRequest 请求对象
     * @return AsyncInvoker<DeleteFsTaskRequest, DeleteFsTaskResponse>
     */
    public AsyncInvoker<DeleteFsTaskRequest, DeleteFsTaskResponse> deleteFsTaskAsyncInvoker(
        DeleteFsTaskRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.deleteFsTask, hcClient);
    }

    /**
     * 删除数据导入导出任务
     *
     * 删除数据导入导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHpcCacheTaskRequest 请求对象
     * @return CompletableFuture<DeleteHpcCacheTaskResponse>
     */
    public CompletableFuture<DeleteHpcCacheTaskResponse> deleteHpcCacheTaskAsync(DeleteHpcCacheTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteHpcCacheTask);
    }

    /**
     * 删除数据导入导出任务
     *
     * 删除数据导入导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHpcCacheTaskRequest 请求对象
     * @return AsyncInvoker<DeleteHpcCacheTaskRequest, DeleteHpcCacheTaskResponse>
     */
    public AsyncInvoker<DeleteHpcCacheTaskRequest, DeleteHpcCacheTaskResponse> deleteHpcCacheTaskAsyncInvoker(
        DeleteHpcCacheTaskRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.deleteHpcCacheTask, hcClient);
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
     * @return CompletableFuture<DeleteLdapConfigResponse>
     */
    public CompletableFuture<DeleteLdapConfigResponse> deleteLdapConfigAsync(DeleteLdapConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteLdapConfig);
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
     * @return AsyncInvoker<DeleteLdapConfigRequest, DeleteLdapConfigResponse>
     */
    public AsyncInvoker<DeleteLdapConfigRequest, DeleteLdapConfigResponse> deleteLdapConfigAsyncInvoker(
        DeleteLdapConfigRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.deleteLdapConfig, hcClient);
    }

    /**
     * 删除权限规则
     *
     * 删除权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePermRuleRequest 请求对象
     * @return CompletableFuture<DeletePermRuleResponse>
     */
    public CompletableFuture<DeletePermRuleResponse> deletePermRuleAsync(DeletePermRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deletePermRule);
    }

    /**
     * 删除权限规则
     *
     * 删除权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePermRuleRequest 请求对象
     * @return AsyncInvoker<DeletePermRuleRequest, DeletePermRuleResponse>
     */
    public AsyncInvoker<DeletePermRuleRequest, DeletePermRuleResponse> deletePermRuleAsyncInvoker(
        DeletePermRuleRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.deletePermRule, hcClient);
    }

    /**
     * 删除文件系统
     *
     * 删除文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShareRequest 请求对象
     * @return CompletableFuture<DeleteShareResponse>
     */
    public CompletableFuture<DeleteShareResponse> deleteShareAsync(DeleteShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteShare);
    }

    /**
     * 删除文件系统
     *
     * 删除文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShareRequest 请求对象
     * @return AsyncInvoker<DeleteShareRequest, DeleteShareResponse>
     */
    public AsyncInvoker<DeleteShareRequest, DeleteShareResponse> deleteShareAsyncInvoker(DeleteShareRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.deleteShare, hcClient);
    }

    /**
     * 删除共享标签
     *
     * 指定共享删除一个标签。当共享中不存在指定要删除的key时，接口调用将会返回404错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSharedTagRequest 请求对象
     * @return CompletableFuture<DeleteSharedTagResponse>
     */
    public CompletableFuture<DeleteSharedTagResponse> deleteSharedTagAsync(DeleteSharedTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteSharedTag);
    }

    /**
     * 删除共享标签
     *
     * 指定共享删除一个标签。当共享中不存在指定要删除的key时，接口调用将会返回404错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSharedTagRequest 请求对象
     * @return AsyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse>
     */
    public AsyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse> deleteSharedTagAsyncInvoker(
        DeleteSharedTagRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.deleteSharedTag, hcClient);
    }

    /**
     * 扩容文件系统
     *
     * 扩容文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandShareRequest 请求对象
     * @return CompletableFuture<ExpandShareResponse>
     */
    public CompletableFuture<ExpandShareResponse> expandShareAsync(ExpandShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.expandShare);
    }

    /**
     * 扩容文件系统
     *
     * 扩容文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandShareRequest 请求对象
     * @return AsyncInvoker<ExpandShareRequest, ExpandShareResponse>
     */
    public AsyncInvoker<ExpandShareRequest, ExpandShareResponse> expandShareAsyncInvoker(ExpandShareRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.expandShare, hcClient);
    }

    /**
     * 查询后端存储列表
     *
     * 查询后端存储列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackendTargetsRequest 请求对象
     * @return CompletableFuture<ListBackendTargetsResponse>
     */
    public CompletableFuture<ListBackendTargetsResponse> listBackendTargetsAsync(ListBackendTargetsRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.listBackendTargets);
    }

    /**
     * 查询后端存储列表
     *
     * 查询后端存储列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackendTargetsRequest 请求对象
     * @return AsyncInvoker<ListBackendTargetsRequest, ListBackendTargetsResponse>
     */
    public AsyncInvoker<ListBackendTargetsRequest, ListBackendTargetsResponse> listBackendTargetsAsyncInvoker(
        ListBackendTargetsRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.listBackendTargets, hcClient);
    }

    /**
     * 获取文件系统异步任务列表
     *
     * 获取文件系统异步任务列表。仅支持查询目录资源使用情况的任务，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFsTasksRequest 请求对象
     * @return CompletableFuture<ListFsTasksResponse>
     */
    public CompletableFuture<ListFsTasksResponse> listFsTasksAsync(ListFsTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.listFsTasks);
    }

    /**
     * 获取文件系统异步任务列表
     *
     * 获取文件系统异步任务列表。仅支持查询目录资源使用情况的任务，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFsTasksRequest 请求对象
     * @return AsyncInvoker<ListFsTasksRequest, ListFsTasksResponse>
     */
    public AsyncInvoker<ListFsTasksRequest, ListFsTasksResponse> listFsTasksAsyncInvoker(ListFsTasksRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.listFsTasks, hcClient);
    }

    /**
     * 查询数据导入导出任务列表
     *
     * 查询数据导入导出任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHpcCacheTasksRequest 请求对象
     * @return CompletableFuture<ListHpcCacheTasksResponse>
     */
    public CompletableFuture<ListHpcCacheTasksResponse> listHpcCacheTasksAsync(ListHpcCacheTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.listHpcCacheTasks);
    }

    /**
     * 查询数据导入导出任务列表
     *
     * 查询数据导入导出任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHpcCacheTasksRequest 请求对象
     * @return AsyncInvoker<ListHpcCacheTasksRequest, ListHpcCacheTasksResponse>
     */
    public AsyncInvoker<ListHpcCacheTasksRequest, ListHpcCacheTasksResponse> listHpcCacheTasksAsyncInvoker(
        ListHpcCacheTasksRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.listHpcCacheTasks, hcClient);
    }

    /**
     * 查询文件系统的权限规则列表
     *
     * 查询文件系统的权限规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermRulesRequest 请求对象
     * @return CompletableFuture<ListPermRulesResponse>
     */
    public CompletableFuture<ListPermRulesResponse> listPermRulesAsync(ListPermRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.listPermRules);
    }

    /**
     * 查询文件系统的权限规则列表
     *
     * 查询文件系统的权限规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermRulesRequest 请求对象
     * @return AsyncInvoker<ListPermRulesRequest, ListPermRulesResponse>
     */
    public AsyncInvoker<ListPermRulesRequest, ListPermRulesResponse> listPermRulesAsyncInvoker(
        ListPermRulesRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.listPermRules, hcClient);
    }

    /**
     * 查询租户所有共享的标签
     *
     * 查询租户所有共享的标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedTagsRequest 请求对象
     * @return CompletableFuture<ListSharedTagsResponse>
     */
    public CompletableFuture<ListSharedTagsResponse> listSharedTagsAsync(ListSharedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.listSharedTags);
    }

    /**
     * 查询租户所有共享的标签
     *
     * 查询租户所有共享的标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedTagsRequest 请求对象
     * @return AsyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse>
     */
    public AsyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse> listSharedTagsAsyncInvoker(
        ListSharedTagsRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.listSharedTags, hcClient);
    }

    /**
     * 获取文件系统列表
     *
     * 获取文件系统列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharesRequest 请求对象
     * @return CompletableFuture<ListSharesResponse>
     */
    public CompletableFuture<ListSharesResponse> listSharesAsync(ListSharesRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.listShares);
    }

    /**
     * 获取文件系统列表
     *
     * 获取文件系统列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharesRequest 请求对象
     * @return AsyncInvoker<ListSharesRequest, ListSharesResponse>
     */
    public AsyncInvoker<ListSharesRequest, ListSharesResponse> listSharesAsyncInvoker(ListSharesRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.listShares, hcClient);
    }

    /**
     * 通过标签查询文件系统列表
     *
     * 通过标签查询文件系统列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharesByTagRequest 请求对象
     * @return CompletableFuture<ListSharesByTagResponse>
     */
    public CompletableFuture<ListSharesByTagResponse> listSharesByTagAsync(ListSharesByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.listSharesByTag);
    }

    /**
     * 通过标签查询文件系统列表
     *
     * 通过标签查询文件系统列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharesByTagRequest 请求对象
     * @return AsyncInvoker<ListSharesByTagRequest, ListSharesByTagResponse>
     */
    public AsyncInvoker<ListSharesByTagRequest, ListSharesByTagResponse> listSharesByTagAsyncInvoker(
        ListSharesByTagRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.listSharesByTag, hcClient);
    }

    /**
     * 配置hpc缓存型后端信息
     *
     * 配置hpc缓存型后端信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetHpcCacheBackendRequest 请求对象
     * @return CompletableFuture<SetHpcCacheBackendResponse>
     */
    public CompletableFuture<SetHpcCacheBackendResponse> setHpcCacheBackendAsync(SetHpcCacheBackendRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.setHpcCacheBackend);
    }

    /**
     * 配置hpc缓存型后端信息
     *
     * 配置hpc缓存型后端信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetHpcCacheBackendRequest 请求对象
     * @return AsyncInvoker<SetHpcCacheBackendRequest, SetHpcCacheBackendResponse>
     */
    public AsyncInvoker<SetHpcCacheBackendRequest, SetHpcCacheBackendResponse> setHpcCacheBackendAsyncInvoker(
        SetHpcCacheBackendRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.setHpcCacheBackend, hcClient);
    }

    /**
     * 获取后端存储详细信息
     *
     * 获取后端存储详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackendTargetInfoRequest 请求对象
     * @return CompletableFuture<ShowBackendTargetInfoResponse>
     */
    public CompletableFuture<ShowBackendTargetInfoResponse> showBackendTargetInfoAsync(
        ShowBackendTargetInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showBackendTargetInfo);
    }

    /**
     * 获取后端存储详细信息
     *
     * 获取后端存储详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackendTargetInfoRequest 请求对象
     * @return AsyncInvoker<ShowBackendTargetInfoRequest, ShowBackendTargetInfoResponse>
     */
    public AsyncInvoker<ShowBackendTargetInfoRequest, ShowBackendTargetInfoResponse> showBackendTargetInfoAsyncInvoker(
        ShowBackendTargetInfoRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.showBackendTargetInfo, hcClient);
    }

    /**
     * 查询目录是否存在
     *
     * 查询目录是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsDirRequest 请求对象
     * @return CompletableFuture<ShowFsDirResponse>
     */
    public CompletableFuture<ShowFsDirResponse> showFsDirAsync(ShowFsDirRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showFsDir);
    }

    /**
     * 查询目录是否存在
     *
     * 查询目录是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsDirRequest 请求对象
     * @return AsyncInvoker<ShowFsDirRequest, ShowFsDirResponse>
     */
    public AsyncInvoker<ShowFsDirRequest, ShowFsDirResponse> showFsDirAsyncInvoker(ShowFsDirRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.showFsDir, hcClient);
    }

    /**
     * 查询目标文件夹quota
     *
     * 查询目标文件夹quota。查询的used_capacity、used_inode数据可能有延迟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsDirQuotaRequest 请求对象
     * @return CompletableFuture<ShowFsDirQuotaResponse>
     */
    public CompletableFuture<ShowFsDirQuotaResponse> showFsDirQuotaAsync(ShowFsDirQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showFsDirQuota);
    }

    /**
     * 查询目标文件夹quota
     *
     * 查询目标文件夹quota。查询的used_capacity、used_inode数据可能有延迟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsDirQuotaRequest 请求对象
     * @return AsyncInvoker<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse>
     */
    public AsyncInvoker<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse> showFsDirQuotaAsyncInvoker(
        ShowFsDirQuotaRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.showFsDirQuota, hcClient);
    }

    /**
     * 查询目录资源使用情况
     *
     * 查询目录资源使用情况(包括子目录的资源)。后端有5min的缓存时间，查询的数据可能有延迟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsDirUsageRequest 请求对象
     * @return CompletableFuture<ShowFsDirUsageResponse>
     */
    public CompletableFuture<ShowFsDirUsageResponse> showFsDirUsageAsync(ShowFsDirUsageRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showFsDirUsage);
    }

    /**
     * 查询目录资源使用情况
     *
     * 查询目录资源使用情况(包括子目录的资源)。后端有5min的缓存时间，查询的数据可能有延迟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsDirUsageRequest 请求对象
     * @return AsyncInvoker<ShowFsDirUsageRequest, ShowFsDirUsageResponse>
     */
    public AsyncInvoker<ShowFsDirUsageRequest, ShowFsDirUsageResponse> showFsDirUsageAsyncInvoker(
        ShowFsDirUsageRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.showFsDirUsage, hcClient);
    }

    /**
     * 获取文件系统异步任务详情
     *
     * 获取文件系统异步任务详情。仅支持查询目录资源使用情况的任务，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsTaskRequest 请求对象
     * @return CompletableFuture<ShowFsTaskResponse>
     */
    public CompletableFuture<ShowFsTaskResponse> showFsTaskAsync(ShowFsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showFsTask);
    }

    /**
     * 获取文件系统异步任务详情
     *
     * 获取文件系统异步任务详情。仅支持查询目录资源使用情况的任务，API请求路径的feature取值为dir-usage，以下简称为DU任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFsTaskRequest 请求对象
     * @return AsyncInvoker<ShowFsTaskRequest, ShowFsTaskResponse>
     */
    public AsyncInvoker<ShowFsTaskRequest, ShowFsTaskResponse> showFsTaskAsyncInvoker(ShowFsTaskRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.showFsTask, hcClient);
    }

    /**
     * 查询数据导入导出任务详情
     *
     * 查询数据导入导出任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHpcCacheTaskRequest 请求对象
     * @return CompletableFuture<ShowHpcCacheTaskResponse>
     */
    public CompletableFuture<ShowHpcCacheTaskResponse> showHpcCacheTaskAsync(ShowHpcCacheTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showHpcCacheTask);
    }

    /**
     * 查询数据导入导出任务详情
     *
     * 查询数据导入导出任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHpcCacheTaskRequest 请求对象
     * @return AsyncInvoker<ShowHpcCacheTaskRequest, ShowHpcCacheTaskResponse>
     */
    public AsyncInvoker<ShowHpcCacheTaskRequest, ShowHpcCacheTaskResponse> showHpcCacheTaskAsyncInvoker(
        ShowHpcCacheTaskRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.showHpcCacheTask, hcClient);
    }

    /**
     * 查询job的状态详情
     *
     * 查询job的执行状态。 可用于查询SFS Turbo异步API的执行状态。例如：可使用调用创建并绑定ldap配置接口时返回的jobId，通过该接口查询job的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showJobDetail);
    }

    /**
     * 查询job的状态详情
     *
     * 查询job的执行状态。 可用于查询SFS Turbo异步API的执行状态。例如：可使用调用创建并绑定ldap配置接口时返回的jobId，通过该接口查询job的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(
        ShowJobDetailRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.showJobDetail, hcClient);
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
     * @return CompletableFuture<ShowLdapConfigResponse>
     */
    public CompletableFuture<ShowLdapConfigResponse> showLdapConfigAsync(ShowLdapConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showLdapConfig);
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
     * @return AsyncInvoker<ShowLdapConfigRequest, ShowLdapConfigResponse>
     */
    public AsyncInvoker<ShowLdapConfigRequest, ShowLdapConfigResponse> showLdapConfigAsyncInvoker(
        ShowLdapConfigRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.showLdapConfig, hcClient);
    }

    /**
     * 查询文件系统的某一个权限规则
     *
     * 查询文件系统的某一个权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPermRuleRequest 请求对象
     * @return CompletableFuture<ShowPermRuleResponse>
     */
    public CompletableFuture<ShowPermRuleResponse> showPermRuleAsync(ShowPermRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showPermRule);
    }

    /**
     * 查询文件系统的某一个权限规则
     *
     * 查询文件系统的某一个权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPermRuleRequest 请求对象
     * @return AsyncInvoker<ShowPermRuleRequest, ShowPermRuleResponse>
     */
    public AsyncInvoker<ShowPermRuleRequest, ShowPermRuleResponse> showPermRuleAsyncInvoker(
        ShowPermRuleRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.showPermRule, hcClient);
    }

    /**
     * 查询文件系统详细信息
     *
     * 查询SFS Turbo文件系统详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShareRequest 请求对象
     * @return CompletableFuture<ShowShareResponse>
     */
    public CompletableFuture<ShowShareResponse> showShareAsync(ShowShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showShare);
    }

    /**
     * 查询文件系统详细信息
     *
     * 查询SFS Turbo文件系统详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShareRequest 请求对象
     * @return AsyncInvoker<ShowShareRequest, ShowShareResponse>
     */
    public AsyncInvoker<ShowShareRequest, ShowShareResponse> showShareAsyncInvoker(ShowShareRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.showShare, hcClient);
    }

    /**
     * 查询共享标签
     *
     * 查询指定共享的所有标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSharedTagsRequest 请求对象
     * @return CompletableFuture<ShowSharedTagsResponse>
     */
    public CompletableFuture<ShowSharedTagsResponse> showSharedTagsAsync(ShowSharedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showSharedTags);
    }

    /**
     * 查询共享标签
     *
     * 查询指定共享的所有标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSharedTagsRequest 请求对象
     * @return AsyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse>
     */
    public AsyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse> showSharedTagsAsyncInvoker(
        ShowSharedTagsRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.showSharedTags, hcClient);
    }

    /**
     * 更新目标文件夹quota
     *
     * 更新目标文件夹quota
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFsDirQuotaRequest 请求对象
     * @return CompletableFuture<UpdateFsDirQuotaResponse>
     */
    public CompletableFuture<UpdateFsDirQuotaResponse> updateFsDirQuotaAsync(UpdateFsDirQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.updateFsDirQuota);
    }

    /**
     * 更新目标文件夹quota
     *
     * 更新目标文件夹quota
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFsDirQuotaRequest 请求对象
     * @return AsyncInvoker<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse>
     */
    public AsyncInvoker<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse> updateFsDirQuotaAsyncInvoker(
        UpdateFsDirQuotaRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.updateFsDirQuota, hcClient);
    }

    /**
     * 更新文件系统
     *
     * 更新文件系统冷数据淘汰时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHpcShareRequest 请求对象
     * @return CompletableFuture<UpdateHpcShareResponse>
     */
    public CompletableFuture<UpdateHpcShareResponse> updateHpcShareAsync(UpdateHpcShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.updateHpcShare);
    }

    /**
     * 更新文件系统
     *
     * 更新文件系统冷数据淘汰时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHpcShareRequest 请求对象
     * @return AsyncInvoker<UpdateHpcShareRequest, UpdateHpcShareResponse>
     */
    public AsyncInvoker<UpdateHpcShareRequest, UpdateHpcShareResponse> updateHpcShareAsyncInvoker(
        UpdateHpcShareRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.updateHpcShare, hcClient);
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
     * @return CompletableFuture<UpdateLdapConfigResponse>
     */
    public CompletableFuture<UpdateLdapConfigResponse> updateLdapConfigAsync(UpdateLdapConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.updateLdapConfig);
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
     * @return AsyncInvoker<UpdateLdapConfigRequest, UpdateLdapConfigResponse>
     */
    public AsyncInvoker<UpdateLdapConfigRequest, UpdateLdapConfigResponse> updateLdapConfigAsyncInvoker(
        UpdateLdapConfigRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.updateLdapConfig, hcClient);
    }

    /**
     * 更新后端存储属性
     *
     * 更新后端存储属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsTargetAttributesRequest 请求对象
     * @return CompletableFuture<UpdateObsTargetAttributesResponse>
     */
    public CompletableFuture<UpdateObsTargetAttributesResponse> updateObsTargetAttributesAsync(
        UpdateObsTargetAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.updateObsTargetAttributes);
    }

    /**
     * 更新后端存储属性
     *
     * 更新后端存储属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsTargetAttributesRequest 请求对象
     * @return AsyncInvoker<UpdateObsTargetAttributesRequest, UpdateObsTargetAttributesResponse>
     */
    public AsyncInvoker<UpdateObsTargetAttributesRequest, UpdateObsTargetAttributesResponse> updateObsTargetAttributesAsyncInvoker(
        UpdateObsTargetAttributesRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.updateObsTargetAttributes, hcClient);
    }

    /**
     * 更新后端存储自动同步策略
     *
     * 更新后端存储自动同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsTargetPolicyRequest 请求对象
     * @return CompletableFuture<UpdateObsTargetPolicyResponse>
     */
    public CompletableFuture<UpdateObsTargetPolicyResponse> updateObsTargetPolicyAsync(
        UpdateObsTargetPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.updateObsTargetPolicy);
    }

    /**
     * 更新后端存储自动同步策略
     *
     * 更新后端存储自动同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsTargetPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateObsTargetPolicyRequest, UpdateObsTargetPolicyResponse>
     */
    public AsyncInvoker<UpdateObsTargetPolicyRequest, UpdateObsTargetPolicyResponse> updateObsTargetPolicyAsyncInvoker(
        UpdateObsTargetPolicyRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.updateObsTargetPolicy, hcClient);
    }

    /**
     * 修改权限规则
     *
     * 修改权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePermRuleRequest 请求对象
     * @return CompletableFuture<UpdatePermRuleResponse>
     */
    public CompletableFuture<UpdatePermRuleResponse> updatePermRuleAsync(UpdatePermRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.updatePermRule);
    }

    /**
     * 修改权限规则
     *
     * 修改权限规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePermRuleRequest 请求对象
     * @return AsyncInvoker<UpdatePermRuleRequest, UpdatePermRuleResponse>
     */
    public AsyncInvoker<UpdatePermRuleRequest, UpdatePermRuleResponse> updatePermRuleAsyncInvoker(
        UpdatePermRuleRequest request) {
        return new AsyncInvoker<>(request, SFSTurboMeta.updatePermRule, hcClient);
    }

}
