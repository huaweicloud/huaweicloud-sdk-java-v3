package com.huaweicloud.sdk.swr.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.swr.v2.model.CreateImageSyncRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateImageSyncRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateManualImageSyncRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateManualImageSyncRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateSecretRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateSecretResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateUserRepositoryAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteImageSyncRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteImageSyncRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteNamespacesRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteNamespacesResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoTagRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoTagResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteUserRepositoryAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListImageAutoSyncReposDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListImageAutoSyncReposDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListNamespacesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListNamespacesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListQuotasRequest;
import com.huaweicloud.sdk.swr.v2.model.ListQuotasResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListReposDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListReposDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRepositoryTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRepositoryTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRetentionHistoriesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRetentionHistoriesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRetentionsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRetentionsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListSharedReposDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListSharedReposDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListTriggersDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListTriggersDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowAccessDomainRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowAccessDomainResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowNamespaceRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowNamespaceResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowRepositoryRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowRepositoryResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowSyncJobRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowSyncJobResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowUserRepositoryAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateUserRepositoryAuthResponse;

import java.util.concurrent.CompletableFuture;

public class SwrAsyncClient {

    protected HcClient hcClient;

    public SwrAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SwrAsyncClient> newBuilder() {
        ClientBuilder<SwrAsyncClient> clientBuilder = new ClientBuilder<>(SwrAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建镜像自动同步任务
     *
     * 创建镜像自动同步任务，帮助您把最新推送的镜像自动同步到其他区域镜像仓库内。 镜像自动同步帮助您把最新推送的镜像自动同步到其他区域镜像仓库内，后期镜像有更新时，目标仓库的镜像也会自动更新，但已有的镜像不会自动同步。已有镜像的同步需要手动操作，详情请参见手动同步镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageSyncRepoRequest 请求对象
     * @return CompletableFuture<CreateImageSyncRepoResponse>
     */
    public CompletableFuture<CreateImageSyncRepoResponse> createImageSyncRepoAsync(CreateImageSyncRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createImageSyncRepo);
    }

    /**
     * 创建镜像自动同步任务
     *
     * 创建镜像自动同步任务，帮助您把最新推送的镜像自动同步到其他区域镜像仓库内。 镜像自动同步帮助您把最新推送的镜像自动同步到其他区域镜像仓库内，后期镜像有更新时，目标仓库的镜像也会自动更新，但已有的镜像不会自动同步。已有镜像的同步需要手动操作，详情请参见手动同步镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageSyncRepoRequest 请求对象
     * @return AsyncInvoker<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse>
     */
    public AsyncInvoker<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> createImageSyncRepoAsyncInvoker(
        CreateImageSyncRepoRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createImageSyncRepo, hcClient);
    }

    /**
     * 手动同步镜像
     *
     * 对于镜像仓库已有的镜像，如果想在其他区域使用，需要手动触发镜像同步。 判断是否同步成功的方法如下：响应状态码为200，无报错信息，表示同步成功。通过SWR管理控制台或调用查询镜像仓库概要信息接口，在目标区域的目标组织下，若存在所同步的镜像版本表示同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualImageSyncRepoRequest 请求对象
     * @return CompletableFuture<CreateManualImageSyncRepoResponse>
     */
    public CompletableFuture<CreateManualImageSyncRepoResponse> createManualImageSyncRepoAsync(
        CreateManualImageSyncRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createManualImageSyncRepo);
    }

    /**
     * 手动同步镜像
     *
     * 对于镜像仓库已有的镜像，如果想在其他区域使用，需要手动触发镜像同步。 判断是否同步成功的方法如下：响应状态码为200，无报错信息，表示同步成功。通过SWR管理控制台或调用查询镜像仓库概要信息接口，在目标区域的目标组织下，若存在所同步的镜像版本表示同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualImageSyncRepoRequest 请求对象
     * @return AsyncInvoker<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse>
     */
    public AsyncInvoker<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> createManualImageSyncRepoAsyncInvoker(
        CreateManualImageSyncRepoRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createManualImageSyncRepo, hcClient);
    }

    /**
     * 创建组织
     *
     * 创建组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNamespaceRequest 请求对象
     * @return CompletableFuture<CreateNamespaceResponse>
     */
    public CompletableFuture<CreateNamespaceResponse> createNamespaceAsync(CreateNamespaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createNamespace);
    }

    /**
     * 创建组织
     *
     * 创建组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNamespaceRequest 请求对象
     * @return AsyncInvoker<CreateNamespaceRequest, CreateNamespaceResponse>
     */
    public AsyncInvoker<CreateNamespaceRequest, CreateNamespaceResponse> createNamespaceAsyncInvoker(
        CreateNamespaceRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createNamespace, hcClient);
    }

    /**
     * 创建组织权限
     *
     * 创建组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNamespaceAuthRequest 请求对象
     * @return CompletableFuture<CreateNamespaceAuthResponse>
     */
    public CompletableFuture<CreateNamespaceAuthResponse> createNamespaceAuthAsync(CreateNamespaceAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createNamespaceAuth);
    }

    /**
     * 创建组织权限
     *
     * 创建组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNamespaceAuthRequest 请求对象
     * @return AsyncInvoker<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse>
     */
    public AsyncInvoker<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> createNamespaceAuthAsyncInvoker(
        CreateNamespaceAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createNamespaceAuth, hcClient);
    }

    /**
     * 在组织下创建镜像仓库
     *
     * 在组织下创建镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoRequest 请求对象
     * @return CompletableFuture<CreateRepoResponse>
     */
    public CompletableFuture<CreateRepoResponse> createRepoAsync(CreateRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createRepo);
    }

    /**
     * 在组织下创建镜像仓库
     *
     * 在组织下创建镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoRequest 请求对象
     * @return AsyncInvoker<CreateRepoRequest, CreateRepoResponse>
     */
    public AsyncInvoker<CreateRepoRequest, CreateRepoResponse> createRepoAsyncInvoker(CreateRepoRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createRepo, hcClient);
    }

    /**
     * 创建共享帐号
     *
     * 创建共享帐号。镜像上传后，您可以共享私有镜像给其他帐号，并授予下载该镜像的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoDomainsRequest 请求对象
     * @return CompletableFuture<CreateRepoDomainsResponse>
     */
    public CompletableFuture<CreateRepoDomainsResponse> createRepoDomainsAsync(CreateRepoDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createRepoDomains);
    }

    /**
     * 创建共享帐号
     *
     * 创建共享帐号。镜像上传后，您可以共享私有镜像给其他帐号，并授予下载该镜像的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoDomainsRequest 请求对象
     * @return AsyncInvoker<CreateRepoDomainsRequest, CreateRepoDomainsResponse>
     */
    public AsyncInvoker<CreateRepoDomainsRequest, CreateRepoDomainsResponse> createRepoDomainsAsyncInvoker(
        CreateRepoDomainsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createRepoDomains, hcClient);
    }

    /**
     * 创建镜像老化规则
     *
     * 创建镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetentionRequest 请求对象
     * @return CompletableFuture<CreateRetentionResponse>
     */
    public CompletableFuture<CreateRetentionResponse> createRetentionAsync(CreateRetentionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createRetention);
    }

    /**
     * 创建镜像老化规则
     *
     * 创建镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetentionRequest 请求对象
     * @return AsyncInvoker<CreateRetentionRequest, CreateRetentionResponse>
     */
    public AsyncInvoker<CreateRetentionRequest, CreateRetentionResponse> createRetentionAsyncInvoker(
        CreateRetentionRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createRetention, hcClient);
    }

    /**
     * 生成临时登录指令
     *
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成临时登录指令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretRequest 请求对象
     * @return CompletableFuture<CreateSecretResponse>
     */
    public CompletableFuture<CreateSecretResponse> createSecretAsync(CreateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createSecret);
    }

    /**
     * 生成临时登录指令
     *
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成临时登录指令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretRequest 请求对象
     * @return AsyncInvoker<CreateSecretRequest, CreateSecretResponse>
     */
    public AsyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretAsyncInvoker(
        CreateSecretRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createSecret, hcClient);
    }

    /**
     * 创建触发器
     *
     * 创建触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTriggerRequest 请求对象
     * @return CompletableFuture<CreateTriggerResponse>
     */
    public CompletableFuture<CreateTriggerResponse> createTriggerAsync(CreateTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createTrigger);
    }

    /**
     * 创建触发器
     *
     * 创建触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTriggerRequest 请求对象
     * @return AsyncInvoker<CreateTriggerRequest, CreateTriggerResponse>
     */
    public AsyncInvoker<CreateTriggerRequest, CreateTriggerResponse> createTriggerAsyncInvoker(
        CreateTriggerRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createTrigger, hcClient);
    }

    /**
     * 创建镜像权限
     *
     * 创建镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRepositoryAuthRequest 请求对象
     * @return CompletableFuture<CreateUserRepositoryAuthResponse>
     */
    public CompletableFuture<CreateUserRepositoryAuthResponse> createUserRepositoryAuthAsync(
        CreateUserRepositoryAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createUserRepositoryAuth);
    }

    /**
     * 创建镜像权限
     *
     * 创建镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRepositoryAuthRequest 请求对象
     * @return AsyncInvoker<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse>
     */
    public AsyncInvoker<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> createUserRepositoryAuthAsyncInvoker(
        CreateUserRepositoryAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createUserRepositoryAuth, hcClient);
    }

    /**
     * 删除镜像自动同步任务
     *
     * 根据目标区域、目标组织删除指定的镜像自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageSyncRepoRequest 请求对象
     * @return CompletableFuture<DeleteImageSyncRepoResponse>
     */
    public CompletableFuture<DeleteImageSyncRepoResponse> deleteImageSyncRepoAsync(DeleteImageSyncRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteImageSyncRepo);
    }

    /**
     * 删除镜像自动同步任务
     *
     * 根据目标区域、目标组织删除指定的镜像自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageSyncRepoRequest 请求对象
     * @return AsyncInvoker<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse>
     */
    public AsyncInvoker<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> deleteImageSyncRepoAsyncInvoker(
        DeleteImageSyncRepoRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteImageSyncRepo, hcClient);
    }

    /**
     * 删除组织权限
     *
     * 删除组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNamespaceAuthRequest 请求对象
     * @return CompletableFuture<DeleteNamespaceAuthResponse>
     */
    public CompletableFuture<DeleteNamespaceAuthResponse> deleteNamespaceAuthAsync(DeleteNamespaceAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteNamespaceAuth);
    }

    /**
     * 删除组织权限
     *
     * 删除组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNamespaceAuthRequest 请求对象
     * @return AsyncInvoker<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse>
     */
    public AsyncInvoker<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> deleteNamespaceAuthAsyncInvoker(
        DeleteNamespaceAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteNamespaceAuth, hcClient);
    }

    /**
     * 删除组织
     *
     * 删除组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNamespacesRequest 请求对象
     * @return CompletableFuture<DeleteNamespacesResponse>
     */
    public CompletableFuture<DeleteNamespacesResponse> deleteNamespacesAsync(DeleteNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteNamespaces);
    }

    /**
     * 删除组织
     *
     * 删除组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNamespacesRequest 请求对象
     * @return AsyncInvoker<DeleteNamespacesRequest, DeleteNamespacesResponse>
     */
    public AsyncInvoker<DeleteNamespacesRequest, DeleteNamespacesResponse> deleteNamespacesAsyncInvoker(
        DeleteNamespacesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteNamespaces, hcClient);
    }

    /**
     * 删除组织下的镜像仓库
     *
     * 删除组织下的镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoRequest 请求对象
     * @return CompletableFuture<DeleteRepoResponse>
     */
    public CompletableFuture<DeleteRepoResponse> deleteRepoAsync(DeleteRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteRepo);
    }

    /**
     * 删除组织下的镜像仓库
     *
     * 删除组织下的镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoRequest 请求对象
     * @return AsyncInvoker<DeleteRepoRequest, DeleteRepoResponse>
     */
    public AsyncInvoker<DeleteRepoRequest, DeleteRepoResponse> deleteRepoAsyncInvoker(DeleteRepoRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteRepo, hcClient);
    }

    /**
     * 删除共享帐号
     *
     * 删除共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoDomainsRequest 请求对象
     * @return CompletableFuture<DeleteRepoDomainsResponse>
     */
    public CompletableFuture<DeleteRepoDomainsResponse> deleteRepoDomainsAsync(DeleteRepoDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteRepoDomains);
    }

    /**
     * 删除共享帐号
     *
     * 删除共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoDomainsRequest 请求对象
     * @return AsyncInvoker<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse>
     */
    public AsyncInvoker<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> deleteRepoDomainsAsyncInvoker(
        DeleteRepoDomainsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteRepoDomains, hcClient);
    }

    /**
     * 删除指定tag的镜像
     *
     * 删除镜像仓库中指定tag的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoTagRequest 请求对象
     * @return CompletableFuture<DeleteRepoTagResponse>
     */
    public CompletableFuture<DeleteRepoTagResponse> deleteRepoTagAsync(DeleteRepoTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteRepoTag);
    }

    /**
     * 删除指定tag的镜像
     *
     * 删除镜像仓库中指定tag的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoTagRequest 请求对象
     * @return AsyncInvoker<DeleteRepoTagRequest, DeleteRepoTagResponse>
     */
    public AsyncInvoker<DeleteRepoTagRequest, DeleteRepoTagResponse> deleteRepoTagAsyncInvoker(
        DeleteRepoTagRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteRepoTag, hcClient);
    }

    /**
     * 删除镜像老化规则
     *
     * 删除镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRetentionRequest 请求对象
     * @return CompletableFuture<DeleteRetentionResponse>
     */
    public CompletableFuture<DeleteRetentionResponse> deleteRetentionAsync(DeleteRetentionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteRetention);
    }

    /**
     * 删除镜像老化规则
     *
     * 删除镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRetentionRequest 请求对象
     * @return AsyncInvoker<DeleteRetentionRequest, DeleteRetentionResponse>
     */
    public AsyncInvoker<DeleteRetentionRequest, DeleteRetentionResponse> deleteRetentionAsyncInvoker(
        DeleteRetentionRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteRetention, hcClient);
    }

    /**
     * 删除触发器
     *
     * 删除触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTriggerRequest 请求对象
     * @return CompletableFuture<DeleteTriggerResponse>
     */
    public CompletableFuture<DeleteTriggerResponse> deleteTriggerAsync(DeleteTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteTrigger);
    }

    /**
     * 删除触发器
     *
     * 删除触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTriggerRequest 请求对象
     * @return AsyncInvoker<DeleteTriggerRequest, DeleteTriggerResponse>
     */
    public AsyncInvoker<DeleteTriggerRequest, DeleteTriggerResponse> deleteTriggerAsyncInvoker(
        DeleteTriggerRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteTrigger, hcClient);
    }

    /**
     * 删除镜像权限
     *
     * 删除镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRepositoryAuthRequest 请求对象
     * @return CompletableFuture<DeleteUserRepositoryAuthResponse>
     */
    public CompletableFuture<DeleteUserRepositoryAuthResponse> deleteUserRepositoryAuthAsync(
        DeleteUserRepositoryAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteUserRepositoryAuth);
    }

    /**
     * 删除镜像权限
     *
     * 删除镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRepositoryAuthRequest 请求对象
     * @return AsyncInvoker<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse>
     */
    public AsyncInvoker<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> deleteUserRepositoryAuthAsyncInvoker(
        DeleteUserRepositoryAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteUserRepositoryAuth, hcClient);
    }

    /**
     * 获取镜像自动同步任务列表
     *
     * 获取为当前镜像仓库所创建的所有自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageAutoSyncReposDetailsRequest 请求对象
     * @return CompletableFuture<ListImageAutoSyncReposDetailsResponse>
     */
    public CompletableFuture<ListImageAutoSyncReposDetailsResponse> listImageAutoSyncReposDetailsAsync(
        ListImageAutoSyncReposDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listImageAutoSyncReposDetails);
    }

    /**
     * 获取镜像自动同步任务列表
     *
     * 获取为当前镜像仓库所创建的所有自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageAutoSyncReposDetailsRequest 请求对象
     * @return AsyncInvoker<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse>
     */
    public AsyncInvoker<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> listImageAutoSyncReposDetailsAsyncInvoker(
        ListImageAutoSyncReposDetailsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listImageAutoSyncReposDetails, hcClient);
    }

    /**
     * 查询组织列表
     *
     * 查询组织列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespacesRequest 请求对象
     * @return CompletableFuture<ListNamespacesResponse>
     */
    public CompletableFuture<ListNamespacesResponse> listNamespacesAsync(ListNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listNamespaces);
    }

    /**
     * 查询组织列表
     *
     * 查询组织列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespacesRequest 请求对象
     * @return AsyncInvoker<ListNamespacesRequest, ListNamespacesResponse>
     */
    public AsyncInvoker<ListNamespacesRequest, ListNamespacesResponse> listNamespacesAsyncInvoker(
        ListNamespacesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listNamespaces, hcClient);
    }

    /**
     * 获取配额信息
     *
     * 获取配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listQuotas);
    }

    /**
     * 获取配额信息
     *
     * 获取配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listQuotas, hcClient);
    }

    /**
     * 获取共享帐号列表
     *
     * 获取共享帐号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoDomainsRequest 请求对象
     * @return CompletableFuture<ListRepoDomainsResponse>
     */
    public CompletableFuture<ListRepoDomainsResponse> listRepoDomainsAsync(ListRepoDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRepoDomains);
    }

    /**
     * 获取共享帐号列表
     *
     * 获取共享帐号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoDomainsRequest 请求对象
     * @return AsyncInvoker<ListRepoDomainsRequest, ListRepoDomainsResponse>
     */
    public AsyncInvoker<ListRepoDomainsRequest, ListRepoDomainsResponse> listRepoDomainsAsyncInvoker(
        ListRepoDomainsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listRepoDomains, hcClient);
    }

    /**
     * 查询镜像仓库列表
     *
     * 查询镜像仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReposDetailsRequest 请求对象
     * @return CompletableFuture<ListReposDetailsResponse>
     */
    public CompletableFuture<ListReposDetailsResponse> listReposDetailsAsync(ListReposDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listReposDetails);
    }

    /**
     * 查询镜像仓库列表
     *
     * 查询镜像仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReposDetailsRequest 请求对象
     * @return AsyncInvoker<ListReposDetailsRequest, ListReposDetailsResponse>
     */
    public AsyncInvoker<ListReposDetailsRequest, ListReposDetailsResponse> listReposDetailsAsyncInvoker(
        ListReposDetailsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listReposDetails, hcClient);
    }

    /**
     * 查询镜像tag列表
     *
     * 查询镜像tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTagsRequest 请求对象
     * @return CompletableFuture<ListRepositoryTagsResponse>
     */
    public CompletableFuture<ListRepositoryTagsResponse> listRepositoryTagsAsync(ListRepositoryTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRepositoryTags);
    }

    /**
     * 查询镜像tag列表
     *
     * 查询镜像tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTagsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryTagsRequest, ListRepositoryTagsResponse>
     */
    public AsyncInvoker<ListRepositoryTagsRequest, ListRepositoryTagsResponse> listRepositoryTagsAsyncInvoker(
        ListRepositoryTagsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listRepositoryTags, hcClient);
    }

    /**
     * 获取镜像老化记录
     *
     * 获取镜像老化记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetentionHistoriesRequest 请求对象
     * @return CompletableFuture<ListRetentionHistoriesResponse>
     */
    public CompletableFuture<ListRetentionHistoriesResponse> listRetentionHistoriesAsync(
        ListRetentionHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRetentionHistories);
    }

    /**
     * 获取镜像老化记录
     *
     * 获取镜像老化记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetentionHistoriesRequest 请求对象
     * @return AsyncInvoker<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse>
     */
    public AsyncInvoker<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> listRetentionHistoriesAsyncInvoker(
        ListRetentionHistoriesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listRetentionHistories, hcClient);
    }

    /**
     * 获取镜像老化规则列表
     *
     * 获取镜像老化规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetentionsRequest 请求对象
     * @return CompletableFuture<ListRetentionsResponse>
     */
    public CompletableFuture<ListRetentionsResponse> listRetentionsAsync(ListRetentionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRetentions);
    }

    /**
     * 获取镜像老化规则列表
     *
     * 获取镜像老化规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetentionsRequest 请求对象
     * @return AsyncInvoker<ListRetentionsRequest, ListRetentionsResponse>
     */
    public AsyncInvoker<ListRetentionsRequest, ListRetentionsResponse> listRetentionsAsyncInvoker(
        ListRetentionsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listRetentions, hcClient);
    }

    /**
     * 查询共享镜像列表
     *
     * 查询共享镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedReposDetailsRequest 请求对象
     * @return CompletableFuture<ListSharedReposDetailsResponse>
     */
    public CompletableFuture<ListSharedReposDetailsResponse> listSharedReposDetailsAsync(
        ListSharedReposDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listSharedReposDetails);
    }

    /**
     * 查询共享镜像列表
     *
     * 查询共享镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedReposDetailsRequest 请求对象
     * @return AsyncInvoker<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse>
     */
    public AsyncInvoker<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> listSharedReposDetailsAsyncInvoker(
        ListSharedReposDetailsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listSharedReposDetails, hcClient);
    }

    /**
     * 获取镜像仓库下的触发器列表
     *
     * 获取镜像仓库下的触发器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTriggersDetailsRequest 请求对象
     * @return CompletableFuture<ListTriggersDetailsResponse>
     */
    public CompletableFuture<ListTriggersDetailsResponse> listTriggersDetailsAsync(ListTriggersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listTriggersDetails);
    }

    /**
     * 获取镜像仓库下的触发器列表
     *
     * 获取镜像仓库下的触发器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTriggersDetailsRequest 请求对象
     * @return AsyncInvoker<ListTriggersDetailsRequest, ListTriggersDetailsResponse>
     */
    public AsyncInvoker<ListTriggersDetailsRequest, ListTriggersDetailsResponse> listTriggersDetailsAsyncInvoker(
        ListTriggersDetailsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listTriggersDetails, hcClient);
    }

    /**
     * 判断共享帐号是否存在
     *
     * 判断共享租户是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessDomainRequest 请求对象
     * @return CompletableFuture<ShowAccessDomainResponse>
     */
    public CompletableFuture<ShowAccessDomainResponse> showAccessDomainAsync(ShowAccessDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showAccessDomain);
    }

    /**
     * 判断共享帐号是否存在
     *
     * 判断共享租户是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessDomainRequest 请求对象
     * @return AsyncInvoker<ShowAccessDomainRequest, ShowAccessDomainResponse>
     */
    public AsyncInvoker<ShowAccessDomainRequest, ShowAccessDomainResponse> showAccessDomainAsyncInvoker(
        ShowAccessDomainRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showAccessDomain, hcClient);
    }

    /**
     * 获取组织详情
     *
     * 获取组织详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNamespaceRequest 请求对象
     * @return CompletableFuture<ShowNamespaceResponse>
     */
    public CompletableFuture<ShowNamespaceResponse> showNamespaceAsync(ShowNamespaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showNamespace);
    }

    /**
     * 获取组织详情
     *
     * 获取组织详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNamespaceRequest 请求对象
     * @return AsyncInvoker<ShowNamespaceRequest, ShowNamespaceResponse>
     */
    public AsyncInvoker<ShowNamespaceRequest, ShowNamespaceResponse> showNamespaceAsyncInvoker(
        ShowNamespaceRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showNamespace, hcClient);
    }

    /**
     * 查询组织权限
     *
     * 查询组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNamespaceAuthRequest 请求对象
     * @return CompletableFuture<ShowNamespaceAuthResponse>
     */
    public CompletableFuture<ShowNamespaceAuthResponse> showNamespaceAuthAsync(ShowNamespaceAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showNamespaceAuth);
    }

    /**
     * 查询组织权限
     *
     * 查询组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNamespaceAuthRequest 请求对象
     * @return AsyncInvoker<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse>
     */
    public AsyncInvoker<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> showNamespaceAuthAsyncInvoker(
        ShowNamespaceAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showNamespaceAuth, hcClient);
    }

    /**
     * 查询镜像仓库概要信息
     *
     * 查询镜像仓库概要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
     * @return CompletableFuture<ShowRepositoryResponse>
     */
    public CompletableFuture<ShowRepositoryResponse> showRepositoryAsync(ShowRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showRepository);
    }

    /**
     * 查询镜像仓库概要信息
     *
     * 查询镜像仓库概要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse>
     */
    public AsyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse> showRepositoryAsyncInvoker(
        ShowRepositoryRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showRepository, hcClient);
    }

    /**
     * 获取镜像老化规则记录
     *
     * 获取镜像老化规则记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetentionRequest 请求对象
     * @return CompletableFuture<ShowRetentionResponse>
     */
    public CompletableFuture<ShowRetentionResponse> showRetentionAsync(ShowRetentionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showRetention);
    }

    /**
     * 获取镜像老化规则记录
     *
     * 获取镜像老化规则记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetentionRequest 请求对象
     * @return AsyncInvoker<ShowRetentionRequest, ShowRetentionResponse>
     */
    public AsyncInvoker<ShowRetentionRequest, ShowRetentionResponse> showRetentionAsyncInvoker(
        ShowRetentionRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showRetention, hcClient);
    }

    /**
     * 获取镜像自动同步任务信息
     *
     * 创建镜像自动同步任务后，可以通过此接口查询该任务的状态，以判断是否同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSyncJobRequest 请求对象
     * @return CompletableFuture<ShowSyncJobResponse>
     */
    public CompletableFuture<ShowSyncJobResponse> showSyncJobAsync(ShowSyncJobRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showSyncJob);
    }

    /**
     * 获取镜像自动同步任务信息
     *
     * 创建镜像自动同步任务后，可以通过此接口查询该任务的状态，以判断是否同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSyncJobRequest 请求对象
     * @return AsyncInvoker<ShowSyncJobRequest, ShowSyncJobResponse>
     */
    public AsyncInvoker<ShowSyncJobRequest, ShowSyncJobResponse> showSyncJobAsyncInvoker(ShowSyncJobRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showSyncJob, hcClient);
    }

    /**
     * 获取触发器详情
     *
     * 获取触发器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTriggerRequest 请求对象
     * @return CompletableFuture<ShowTriggerResponse>
     */
    public CompletableFuture<ShowTriggerResponse> showTriggerAsync(ShowTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showTrigger);
    }

    /**
     * 获取触发器详情
     *
     * 获取触发器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTriggerRequest 请求对象
     * @return AsyncInvoker<ShowTriggerRequest, ShowTriggerResponse>
     */
    public AsyncInvoker<ShowTriggerRequest, ShowTriggerResponse> showTriggerAsyncInvoker(ShowTriggerRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showTrigger, hcClient);
    }

    /**
     * 查询镜像权限
     *
     * 查询镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRepositoryAuthRequest 请求对象
     * @return CompletableFuture<ShowUserRepositoryAuthResponse>
     */
    public CompletableFuture<ShowUserRepositoryAuthResponse> showUserRepositoryAuthAsync(
        ShowUserRepositoryAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showUserRepositoryAuth);
    }

    /**
     * 查询镜像权限
     *
     * 查询镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRepositoryAuthRequest 请求对象
     * @return AsyncInvoker<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse>
     */
    public AsyncInvoker<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> showUserRepositoryAuthAsyncInvoker(
        ShowUserRepositoryAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showUserRepositoryAuth, hcClient);
    }

    /**
     * 更新组织权限
     *
     * 更新组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNamespaceAuthRequest 请求对象
     * @return CompletableFuture<UpdateNamespaceAuthResponse>
     */
    public CompletableFuture<UpdateNamespaceAuthResponse> updateNamespaceAuthAsync(UpdateNamespaceAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateNamespaceAuth);
    }

    /**
     * 更新组织权限
     *
     * 更新组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNamespaceAuthRequest 请求对象
     * @return AsyncInvoker<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse>
     */
    public AsyncInvoker<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> updateNamespaceAuthAsyncInvoker(
        UpdateNamespaceAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateNamespaceAuth, hcClient);
    }

    /**
     * 更新镜像仓库的概要信息
     *
     * 更新租户组织下的镜像概要信息，包括镜像类型、是否公有、描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoRequest 请求对象
     * @return CompletableFuture<UpdateRepoResponse>
     */
    public CompletableFuture<UpdateRepoResponse> updateRepoAsync(UpdateRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateRepo);
    }

    /**
     * 更新镜像仓库的概要信息
     *
     * 更新租户组织下的镜像概要信息，包括镜像类型、是否公有、描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoRequest 请求对象
     * @return AsyncInvoker<UpdateRepoRequest, UpdateRepoResponse>
     */
    public AsyncInvoker<UpdateRepoRequest, UpdateRepoResponse> updateRepoAsyncInvoker(UpdateRepoRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateRepo, hcClient);
    }

    /**
     * 更新共享帐号
     *
     * 更新共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoDomainsRequest 请求对象
     * @return CompletableFuture<UpdateRepoDomainsResponse>
     */
    public CompletableFuture<UpdateRepoDomainsResponse> updateRepoDomainsAsync(UpdateRepoDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateRepoDomains);
    }

    /**
     * 更新共享帐号
     *
     * 更新共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoDomainsRequest 请求对象
     * @return AsyncInvoker<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse>
     */
    public AsyncInvoker<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> updateRepoDomainsAsyncInvoker(
        UpdateRepoDomainsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateRepoDomains, hcClient);
    }

    /**
     * 修改镜像老化规则
     *
     * 修改镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRetentionRequest 请求对象
     * @return CompletableFuture<UpdateRetentionResponse>
     */
    public CompletableFuture<UpdateRetentionResponse> updateRetentionAsync(UpdateRetentionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateRetention);
    }

    /**
     * 修改镜像老化规则
     *
     * 修改镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRetentionRequest 请求对象
     * @return AsyncInvoker<UpdateRetentionRequest, UpdateRetentionResponse>
     */
    public AsyncInvoker<UpdateRetentionRequest, UpdateRetentionResponse> updateRetentionAsyncInvoker(
        UpdateRetentionRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateRetention, hcClient);
    }

    /**
     * 更新触发器配置
     *
     * 更新触发器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTriggerRequest 请求对象
     * @return CompletableFuture<UpdateTriggerResponse>
     */
    public CompletableFuture<UpdateTriggerResponse> updateTriggerAsync(UpdateTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateTrigger);
    }

    /**
     * 更新触发器配置
     *
     * 更新触发器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTriggerRequest 请求对象
     * @return AsyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse>
     */
    public AsyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse> updateTriggerAsyncInvoker(
        UpdateTriggerRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateTrigger, hcClient);
    }

    /**
     * 更新镜像权限
     *
     * 更新镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRepositoryAuthRequest 请求对象
     * @return CompletableFuture<UpdateUserRepositoryAuthResponse>
     */
    public CompletableFuture<UpdateUserRepositoryAuthResponse> updateUserRepositoryAuthAsync(
        UpdateUserRepositoryAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateUserRepositoryAuth);
    }

    /**
     * 更新镜像权限
     *
     * 更新镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRepositoryAuthRequest 请求对象
     * @return AsyncInvoker<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse>
     */
    public AsyncInvoker<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> updateUserRepositoryAuthAsyncInvoker(
        UpdateUserRepositoryAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateUserRepositoryAuth, hcClient);
    }

    /**
     * 查询所有API版本信息
     *
     * 查询所有API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listApiVersions);
    }

    /**
     * 查询所有API版本信息
     *
     * 查询所有API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showApiVersion, hcClient);
    }

}
