package com.huaweicloud.sdk.swr.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.swr.v2.model.*;

public class SwrClient {
    protected HcClient hcClient;

    public SwrClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SwrClient> newBuilder() {
        return new ClientBuilder<>(SwrClient::new);
    }


    /**
     * 创建镜像自动同步任务
     * 创建镜像自动同步任务
     *
     * @param CreateImageSyncRepoRequest 请求对象
     * @return CreateImageSyncRepoResponse
     */
    public CreateImageSyncRepoResponse createImageSyncRepo(CreateImageSyncRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createImageSyncRepo);
    }

    /**
     * 创建组织
     * 创建组织
     *
     * @param CreateNamespaceRequest 请求对象
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createNamespace);
    }

    /**
     * 创建组织权限
     * 创建组织权限
     *
     * @param CreateNamespaceAuthRequest 请求对象
     * @return CreateNamespaceAuthResponse
     */
    public CreateNamespaceAuthResponse createNamespaceAuth(CreateNamespaceAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createNamespaceAuth);
    }

    /**
     * 创建共享账号
     * 创建共享账号。镜像上传后，您可以共享私有镜像给其他帐号，并授予下载该镜像的权限。
     *
     * @param CreateRepoDomainsRequest 请求对象
     * @return CreateRepoDomainsResponse
     */
    public CreateRepoDomainsResponse createRepoDomains(CreateRepoDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createRepoDomains);
    }

    /**
     * 创建镜像老化规则
     * 创建镜像老化规则
     *
     * @param CreateRetentionRequest 请求对象
     * @return CreateRetentionResponse
     */
    public CreateRetentionResponse createRetention(CreateRetentionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createRetention);
    }

    /**
     * 生成临时登录指令
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成临时登录指令。
     *
     * @param CreateSecretRequest 请求对象
     * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createSecret);
    }

    /**
     * 创建触发器
     * 创建触发器
     *
     * @param CreateTriggerRequest 请求对象
     * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTrigger(CreateTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createTrigger);
    }

    /**
     * 创建镜像权限
     * 创建镜像权限
     *
     * @param CreateUserRepositoryAuthRequest 请求对象
     * @return CreateUserRepositoryAuthResponse
     */
    public CreateUserRepositoryAuthResponse createUserRepositoryAuth(CreateUserRepositoryAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createUserRepositoryAuth);
    }

    /**
     * 删除镜像自动同步任务
     * 删除镜像自动同步任务
     *
     * @param DeleteImageSyncRepoRequest 请求对象
     * @return DeleteImageSyncRepoResponse
     */
    public DeleteImageSyncRepoResponse deleteImageSyncRepo(DeleteImageSyncRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteImageSyncRepo);
    }

    /**
     * 删除组织权限
     * 删除组织权限
     *
     * @param DeleteNamespaceAuthRequest 请求对象
     * @return DeleteNamespaceAuthResponse
     */
    public DeleteNamespaceAuthResponse deleteNamespaceAuth(DeleteNamespaceAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteNamespaceAuth);
    }

    /**
     * 删除组织
     * 删除组织
     *
     * @param DeleteNamespacesRequest 请求对象
     * @return DeleteNamespacesResponse
     */
    public DeleteNamespacesResponse deleteNamespaces(DeleteNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteNamespaces);
    }

    /**
     * 删除组织下的镜像仓库
     * 删除组织下的镜像仓库。
     *
     * @param DeleteRepoRequest 请求对象
     * @return DeleteRepoResponse
     */
    public DeleteRepoResponse deleteRepo(DeleteRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteRepo);
    }

    /**
     * 删除共享账号
     * 删除共享账号
     *
     * @param DeleteRepoDomainsRequest 请求对象
     * @return DeleteRepoDomainsResponse
     */
    public DeleteRepoDomainsResponse deleteRepoDomains(DeleteRepoDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteRepoDomains);
    }

    /**
     * 删除指定tag的镜像
     * 删除镜像仓库中指定tag的镜像
     *
     * @param DeleteRepoTagRequest 请求对象
     * @return DeleteRepoTagResponse
     */
    public DeleteRepoTagResponse deleteRepoTag(DeleteRepoTagRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteRepoTag);
    }

    /**
     * 删除镜像老化规则
     * 删除镜像老化规则
     *
     * @param DeleteRetentionRequest 请求对象
     * @return DeleteRetentionResponse
     */
    public DeleteRetentionResponse deleteRetention(DeleteRetentionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteRetention);
    }

    /**
     * 删除触发器
     * 删除触发器
     *
     * @param DeleteTriggerRequest 请求对象
     * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTrigger(DeleteTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteTrigger);
    }

    /**
     * 删除镜像权限
     * 删除镜像权限
     *
     * @param DeleteUserRepositoryAuthRequest 请求对象
     * @return DeleteUserRepositoryAuthResponse
     */
    public DeleteUserRepositoryAuthResponse deleteUserRepositoryAuth(DeleteUserRepositoryAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteUserRepositoryAuth);
    }

    /**
     * 获取镜像自动同步任务列表
     * 获取镜像自动同步任务列表
     *
     * @param ListImageAutoSyncReposDetailsRequest 请求对象
     * @return ListImageAutoSyncReposDetailsResponse
     */
    public ListImageAutoSyncReposDetailsResponse listImageAutoSyncReposDetails(ListImageAutoSyncReposDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listImageAutoSyncReposDetails);
    }

    /**
     * 查询组织列表
     * 查询组织列表
     *
     * @param ListNamespacesRequest 请求对象
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listNamespaces);
    }

    /**
     * 获取共享账号列表
     * 获取共享账号列表
     *
     * @param ListRepoDomainsRequest 请求对象
     * @return ListRepoDomainsResponse
     */
    public ListRepoDomainsResponse listRepoDomains(ListRepoDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRepoDomains);
    }

    /**
     * 查询镜像tag列表
     * 查询镜像tag列表
     *
     * @param ListRepositoryTagsRequest 请求对象
     * @return ListRepositoryTagsResponse
     */
    public ListRepositoryTagsResponse listRepositoryTags(ListRepositoryTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRepositoryTags);
    }

    /**
     * 获取镜像老化记录
     * 获取镜像老化记录
     *
     * @param ListRetentionHistoriesRequest 请求对象
     * @return ListRetentionHistoriesResponse
     */
    public ListRetentionHistoriesResponse listRetentionHistories(ListRetentionHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRetentionHistories);
    }

    /**
     * 获取镜像老化规则列表
     * 获取镜像老化规则列表
     *
     * @param ListRetentionsRequest 请求对象
     * @return ListRetentionsResponse
     */
    public ListRetentionsResponse listRetentions(ListRetentionsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRetentions);
    }

    /**
     * 获取镜像仓库下的触发器列表
     * 获取镜像仓库下的触发器列表
     *
     * @param ListTriggersDetailsRequest 请求对象
     * @return ListTriggersDetailsResponse
     */
    public ListTriggersDetailsResponse listTriggersDetails(ListTriggersDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listTriggersDetails);
    }

    /**
     * 判断共享账号是否存在
     * 判断共享租户是否存在
     *
     * @param ShowAccessDomainRequest 请求对象
     * @return ShowAccessDomainResponse
     */
    public ShowAccessDomainResponse showAccessDomain(ShowAccessDomainRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showAccessDomain);
    }

    /**
     * 获取组织详情
     * 获取组织详情
     *
     * @param ShowNamespaceRequest 请求对象
     * @return ShowNamespaceResponse
     */
    public ShowNamespaceResponse showNamespace(ShowNamespaceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showNamespace);
    }

    /**
     * 查询组织权限
     * 查询组织权限
     *
     * @param ShowNamespaceAuthRequest 请求对象
     * @return ShowNamespaceAuthResponse
     */
    public ShowNamespaceAuthResponse showNamespaceAuth(ShowNamespaceAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showNamespaceAuth);
    }

    /**
     * 查询镜像概要信息
     * 查询镜像概要信息
     *
     * @param ShowRepositoryRequest 请求对象
     * @return ShowRepositoryResponse
     */
    public ShowRepositoryResponse showRepository(ShowRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showRepository);
    }

    /**
     * 获取镜像老化规则记录
     * 获取镜像老化规则记录
     *
     * @param ShowRetentionRequest 请求对象
     * @return ShowRetentionResponse
     */
    public ShowRetentionResponse showRetention(ShowRetentionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showRetention);
    }

    /**
     * 获取触发器详情
     * 获取触发器详情
     *
     * @param ShowTriggerRequest 请求对象
     * @return ShowTriggerResponse
     */
    public ShowTriggerResponse showTrigger(ShowTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showTrigger);
    }

    /**
     * 查询镜像权限
     * 查询镜像权限
     *
     * @param ShowUserRepositoryAuthRequest 请求对象
     * @return ShowUserRepositoryAuthResponse
     */
    public ShowUserRepositoryAuthResponse showUserRepositoryAuth(ShowUserRepositoryAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showUserRepositoryAuth);
    }

    /**
     * 更新共享账号
     * 更新共享账号
     *
     * @param UpdateRepoDomainsRequest 请求对象
     * @return UpdateRepoDomainsResponse
     */
    public UpdateRepoDomainsResponse updateRepoDomains(UpdateRepoDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateRepoDomains);
    }

    /**
     * 修改镜像老化规则
     * 修改镜像老化规则
     *
     * @param UpdateRetentionRequest 请求对象
     * @return UpdateRetentionResponse
     */
    public UpdateRetentionResponse updateRetention(UpdateRetentionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateRetention);
    }

    /**
     * 更新触发器配置
     * 更新触发器配置
     *
     * @param UpdateTriggerRequest 请求对象
     * @return UpdateTriggerResponse
     */
    public UpdateTriggerResponse updateTrigger(UpdateTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateTrigger);
    }

    /**
     * 更新镜像权限
     * 更新镜像权限
     *
     * @param UpdateUserRepositoryAuthRequest 请求对象
     * @return UpdateUserRepositoryAuthResponse
     */
    public UpdateUserRepositoryAuthResponse updateUserRepositoryAuth(UpdateUserRepositoryAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateUserRepositoryAuth);
    }

    /**
     * 查询指定API版本信息
     * 查询指定API版本信息
     *
     * @param ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showApiVersion);
    }

}