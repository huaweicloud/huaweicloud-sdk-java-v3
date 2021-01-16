package com.huaweicloud.sdk.swr.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.swr.v2.model.*;

public class SwrAsyncClient {
    protected HcClient hcClient;

    public SwrAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SwrAsyncClient> newBuilder() {
        return new ClientBuilder<>(SwrAsyncClient::new);
    }


    /**
     * 创建镜像自动同步任务
     * 创建镜像自动同步任务
     *
     * @param CreateImageSyncRepoRequest 请求对象
     * @return CompletableFuture<CreateImageSyncRepoResponse>
     */
    public CompletableFuture<CreateImageSyncRepoResponse> createImageSyncRepoAsync(CreateImageSyncRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createImageSyncRepo);
    }

    /**
     * 创建组织
     * 创建组织
     *
     * @param CreateNamespaceRequest 请求对象
     * @return CompletableFuture<CreateNamespaceResponse>
     */
    public CompletableFuture<CreateNamespaceResponse> createNamespaceAsync(CreateNamespaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createNamespace);
    }

    /**
     * 创建组织权限
     * 创建组织权限
     *
     * @param CreateNamespaceAuthRequest 请求对象
     * @return CompletableFuture<CreateNamespaceAuthResponse>
     */
    public CompletableFuture<CreateNamespaceAuthResponse> createNamespaceAuthAsync(CreateNamespaceAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createNamespaceAuth);
    }

    /**
     * 创建共享账号
     * 创建共享账号。镜像上传后，您可以共享私有镜像给其他帐号，并授予下载该镜像的权限。
     *
     * @param CreateRepoDomainsRequest 请求对象
     * @return CompletableFuture<CreateRepoDomainsResponse>
     */
    public CompletableFuture<CreateRepoDomainsResponse> createRepoDomainsAsync(CreateRepoDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createRepoDomains);
    }

    /**
     * 创建镜像老化规则
     * 创建镜像老化规则
     *
     * @param CreateRetentionRequest 请求对象
     * @return CompletableFuture<CreateRetentionResponse>
     */
    public CompletableFuture<CreateRetentionResponse> createRetentionAsync(CreateRetentionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createRetention);
    }

    /**
     * 生成临时登录指令
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成临时登录指令。
     *
     * @param CreateSecretRequest 请求对象
     * @return CompletableFuture<CreateSecretResponse>
     */
    public CompletableFuture<CreateSecretResponse> createSecretAsync(CreateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createSecret);
    }

    /**
     * 创建触发器
     * 创建触发器
     *
     * @param CreateTriggerRequest 请求对象
     * @return CompletableFuture<CreateTriggerResponse>
     */
    public CompletableFuture<CreateTriggerResponse> createTriggerAsync(CreateTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createTrigger);
    }

    /**
     * 创建镜像权限
     * 创建镜像权限
     *
     * @param CreateUserRepositoryAuthRequest 请求对象
     * @return CompletableFuture<CreateUserRepositoryAuthResponse>
     */
    public CompletableFuture<CreateUserRepositoryAuthResponse> createUserRepositoryAuthAsync(CreateUserRepositoryAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createUserRepositoryAuth);
    }

    /**
     * 删除镜像自动同步任务
     * 删除镜像自动同步任务
     *
     * @param DeleteImageSyncRepoRequest 请求对象
     * @return CompletableFuture<DeleteImageSyncRepoResponse>
     */
    public CompletableFuture<DeleteImageSyncRepoResponse> deleteImageSyncRepoAsync(DeleteImageSyncRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteImageSyncRepo);
    }

    /**
     * 删除组织权限
     * 删除组织权限
     *
     * @param DeleteNamespaceAuthRequest 请求对象
     * @return CompletableFuture<DeleteNamespaceAuthResponse>
     */
    public CompletableFuture<DeleteNamespaceAuthResponse> deleteNamespaceAuthAsync(DeleteNamespaceAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteNamespaceAuth);
    }

    /**
     * 删除组织
     * 删除组织
     *
     * @param DeleteNamespacesRequest 请求对象
     * @return CompletableFuture<DeleteNamespacesResponse>
     */
    public CompletableFuture<DeleteNamespacesResponse> deleteNamespacesAsync(DeleteNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteNamespaces);
    }

    /**
     * 删除组织下的镜像仓库
     * 删除组织下的镜像仓库。
     *
     * @param DeleteRepoRequest 请求对象
     * @return CompletableFuture<DeleteRepoResponse>
     */
    public CompletableFuture<DeleteRepoResponse> deleteRepoAsync(DeleteRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteRepo);
    }

    /**
     * 删除共享账号
     * 删除共享账号
     *
     * @param DeleteRepoDomainsRequest 请求对象
     * @return CompletableFuture<DeleteRepoDomainsResponse>
     */
    public CompletableFuture<DeleteRepoDomainsResponse> deleteRepoDomainsAsync(DeleteRepoDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteRepoDomains);
    }

    /**
     * 删除指定tag的镜像
     * 删除镜像仓库中指定tag的镜像
     *
     * @param DeleteRepoTagRequest 请求对象
     * @return CompletableFuture<DeleteRepoTagResponse>
     */
    public CompletableFuture<DeleteRepoTagResponse> deleteRepoTagAsync(DeleteRepoTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteRepoTag);
    }

    /**
     * 删除镜像老化规则
     * 删除镜像老化规则
     *
     * @param DeleteRetentionRequest 请求对象
     * @return CompletableFuture<DeleteRetentionResponse>
     */
    public CompletableFuture<DeleteRetentionResponse> deleteRetentionAsync(DeleteRetentionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteRetention);
    }

    /**
     * 删除触发器
     * 删除触发器
     *
     * @param DeleteTriggerRequest 请求对象
     * @return CompletableFuture<DeleteTriggerResponse>
     */
    public CompletableFuture<DeleteTriggerResponse> deleteTriggerAsync(DeleteTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteTrigger);
    }

    /**
     * 删除镜像权限
     * 删除镜像权限
     *
     * @param DeleteUserRepositoryAuthRequest 请求对象
     * @return CompletableFuture<DeleteUserRepositoryAuthResponse>
     */
    public CompletableFuture<DeleteUserRepositoryAuthResponse> deleteUserRepositoryAuthAsync(DeleteUserRepositoryAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteUserRepositoryAuth);
    }

    /**
     * 获取镜像自动同步任务列表
     * 获取镜像自动同步任务列表
     *
     * @param ListImageAutoSyncReposDetailsRequest 请求对象
     * @return CompletableFuture<ListImageAutoSyncReposDetailsResponse>
     */
    public CompletableFuture<ListImageAutoSyncReposDetailsResponse> listImageAutoSyncReposDetailsAsync(ListImageAutoSyncReposDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listImageAutoSyncReposDetails);
    }

    /**
     * 查询组织列表
     * 查询组织列表
     *
     * @param ListNamespacesRequest 请求对象
     * @return CompletableFuture<ListNamespacesResponse>
     */
    public CompletableFuture<ListNamespacesResponse> listNamespacesAsync(ListNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listNamespaces);
    }

    /**
     * 获取共享账号列表
     * 获取共享账号列表
     *
     * @param ListRepoDomainsRequest 请求对象
     * @return CompletableFuture<ListRepoDomainsResponse>
     */
    public CompletableFuture<ListRepoDomainsResponse> listRepoDomainsAsync(ListRepoDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRepoDomains);
    }

    /**
     * 查询镜像tag列表
     * 查询镜像tag列表
     *
     * @param ListRepositoryTagsRequest 请求对象
     * @return CompletableFuture<ListRepositoryTagsResponse>
     */
    public CompletableFuture<ListRepositoryTagsResponse> listRepositoryTagsAsync(ListRepositoryTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRepositoryTags);
    }

    /**
     * 获取镜像老化记录
     * 获取镜像老化记录
     *
     * @param ListRetentionHistoriesRequest 请求对象
     * @return CompletableFuture<ListRetentionHistoriesResponse>
     */
    public CompletableFuture<ListRetentionHistoriesResponse> listRetentionHistoriesAsync(ListRetentionHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRetentionHistories);
    }

    /**
     * 获取镜像老化规则列表
     * 获取镜像老化规则列表
     *
     * @param ListRetentionsRequest 请求对象
     * @return CompletableFuture<ListRetentionsResponse>
     */
    public CompletableFuture<ListRetentionsResponse> listRetentionsAsync(ListRetentionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRetentions);
    }

    /**
     * 获取镜像仓库下的触发器列表
     * 获取镜像仓库下的触发器列表
     *
     * @param ListTriggersDetailsRequest 请求对象
     * @return CompletableFuture<ListTriggersDetailsResponse>
     */
    public CompletableFuture<ListTriggersDetailsResponse> listTriggersDetailsAsync(ListTriggersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listTriggersDetails);
    }

    /**
     * 判断共享账号是否存在
     * 判断共享租户是否存在
     *
     * @param ShowAccessDomainRequest 请求对象
     * @return CompletableFuture<ShowAccessDomainResponse>
     */
    public CompletableFuture<ShowAccessDomainResponse> showAccessDomainAsync(ShowAccessDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showAccessDomain);
    }

    /**
     * 获取组织详情
     * 获取组织详情
     *
     * @param ShowNamespaceRequest 请求对象
     * @return CompletableFuture<ShowNamespaceResponse>
     */
    public CompletableFuture<ShowNamespaceResponse> showNamespaceAsync(ShowNamespaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showNamespace);
    }

    /**
     * 查询组织权限
     * 查询组织权限
     *
     * @param ShowNamespaceAuthRequest 请求对象
     * @return CompletableFuture<ShowNamespaceAuthResponse>
     */
    public CompletableFuture<ShowNamespaceAuthResponse> showNamespaceAuthAsync(ShowNamespaceAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showNamespaceAuth);
    }

    /**
     * 查询镜像概要信息
     * 查询镜像概要信息
     *
     * @param ShowRepositoryRequest 请求对象
     * @return CompletableFuture<ShowRepositoryResponse>
     */
    public CompletableFuture<ShowRepositoryResponse> showRepositoryAsync(ShowRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showRepository);
    }

    /**
     * 获取镜像老化规则记录
     * 获取镜像老化规则记录
     *
     * @param ShowRetentionRequest 请求对象
     * @return CompletableFuture<ShowRetentionResponse>
     */
    public CompletableFuture<ShowRetentionResponse> showRetentionAsync(ShowRetentionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showRetention);
    }

    /**
     * 获取触发器详情
     * 获取触发器详情
     *
     * @param ShowTriggerRequest 请求对象
     * @return CompletableFuture<ShowTriggerResponse>
     */
    public CompletableFuture<ShowTriggerResponse> showTriggerAsync(ShowTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showTrigger);
    }

    /**
     * 查询镜像权限
     * 查询镜像权限
     *
     * @param ShowUserRepositoryAuthRequest 请求对象
     * @return CompletableFuture<ShowUserRepositoryAuthResponse>
     */
    public CompletableFuture<ShowUserRepositoryAuthResponse> showUserRepositoryAuthAsync(ShowUserRepositoryAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showUserRepositoryAuth);
    }

    /**
     * 更新共享账号
     * 更新共享账号
     *
     * @param UpdateRepoDomainsRequest 请求对象
     * @return CompletableFuture<UpdateRepoDomainsResponse>
     */
    public CompletableFuture<UpdateRepoDomainsResponse> updateRepoDomainsAsync(UpdateRepoDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateRepoDomains);
    }

    /**
     * 修改镜像老化规则
     * 修改镜像老化规则
     *
     * @param UpdateRetentionRequest 请求对象
     * @return CompletableFuture<UpdateRetentionResponse>
     */
    public CompletableFuture<UpdateRetentionResponse> updateRetentionAsync(UpdateRetentionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateRetention);
    }

    /**
     * 更新触发器配置
     * 更新触发器配置
     *
     * @param UpdateTriggerRequest 请求对象
     * @return CompletableFuture<UpdateTriggerResponse>
     */
    public CompletableFuture<UpdateTriggerResponse> updateTriggerAsync(UpdateTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateTrigger);
    }

    /**
     * 更新镜像权限
     * 更新镜像权限
     *
     * @param UpdateUserRepositoryAuthRequest 请求对象
     * @return CompletableFuture<UpdateUserRepositoryAuthResponse>
     */
    public CompletableFuture<UpdateUserRepositoryAuthResponse> updateUserRepositoryAuthAsync(UpdateUserRepositoryAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateUserRepositoryAuth);
    }

    /**
     * 查询指定API版本信息
     * 查询指定API版本信息
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showApiVersion);
    }

}