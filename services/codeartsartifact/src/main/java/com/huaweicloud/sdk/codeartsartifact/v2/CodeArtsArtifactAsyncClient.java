package com.huaweicloud.sdk.codeartsartifact.v2;

import com.huaweicloud.sdk.codeartsartifact.v2.model.BatchDeleteTrashesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.BatchDeleteTrashesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.BatchRestoreRepoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.BatchRestoreRepoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateArtifactoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateArtifactoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateAttentionRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateAttentionResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateDockerRepositoriesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateDockerRepositoriesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateMavenRepoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateMavenRepoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateProjectRelatedRepositoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateProjectRelatedRepositoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.DeleteArtifactFileRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.DeleteArtifactFileResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.DeleteRepositoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.DeleteRepositoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListAllRepositoriesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListAllRepositoriesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListArtifactoryComponentRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListArtifactoryComponentResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListArtifactoryStorageStatisticRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListArtifactoryStorageStatisticResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListAttentionsRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListAttentionsResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ModifyRepositoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ModifyRepositoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ResetUserPasswordRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ResetUserPasswordResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.SearchArtifactsRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.SearchArtifactsResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.SearchByChecksumRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.SearchByChecksumResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowAuditRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowAuditResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileTreeRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileTreeResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowMavenInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowMavenInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectListRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectListResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectReleaseFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectReleaseFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowReleaseProjectFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowReleaseProjectFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowStorageRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowStorageResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.UpdateArtifactoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.UpdateArtifactoryResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeArtsArtifactAsyncClient {

    protected HcClient hcClient;

    public CodeArtsArtifactAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsArtifactAsyncClient> newBuilder() {
        ClientBuilder<CodeArtsArtifactAsyncClient> clientBuilder =
            new ClientBuilder<>(CodeArtsArtifactAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量删除回收站
     *
     * 批量删除回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTrashesRequest 请求对象
     * @return CompletableFuture<BatchDeleteTrashesResponse>
     */
    public CompletableFuture<BatchDeleteTrashesResponse> batchDeleteTrashesAsync(BatchDeleteTrashesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.batchDeleteTrashes);
    }

    /**
     * 批量删除回收站
     *
     * 批量删除回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTrashesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTrashesRequest, BatchDeleteTrashesResponse>
     */
    public AsyncInvoker<BatchDeleteTrashesRequest, BatchDeleteTrashesResponse> batchDeleteTrashesAsyncInvoker(
        BatchDeleteTrashesRequest request) {
        return new AsyncInvoker<BatchDeleteTrashesRequest, BatchDeleteTrashesResponse>(request,
            CodeArtsArtifactMeta.batchDeleteTrashes, hcClient);
    }

    /**
     * 批量还原回收站
     *
     * 批量还原回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRestoreRepoRequest 请求对象
     * @return CompletableFuture<BatchRestoreRepoResponse>
     */
    public CompletableFuture<BatchRestoreRepoResponse> batchRestoreRepoAsync(BatchRestoreRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.batchRestoreRepo);
    }

    /**
     * 批量还原回收站
     *
     * 批量还原回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRestoreRepoRequest 请求对象
     * @return AsyncInvoker<BatchRestoreRepoRequest, BatchRestoreRepoResponse>
     */
    public AsyncInvoker<BatchRestoreRepoRequest, BatchRestoreRepoResponse> batchRestoreRepoAsyncInvoker(
        BatchRestoreRepoRequest request) {
        return new AsyncInvoker<BatchRestoreRepoRequest, BatchRestoreRepoResponse>(request,
            CodeArtsArtifactMeta.batchRestoreRepo, hcClient);
    }

    /**
     * 创建非maven仓库
     *
     * 创建非maven仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateArtifactoryRequest 请求对象
     * @return CompletableFuture<CreateArtifactoryResponse>
     */
    public CompletableFuture<CreateArtifactoryResponse> createArtifactoryAsync(CreateArtifactoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.createArtifactory);
    }

    /**
     * 创建非maven仓库
     *
     * 创建非maven仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateArtifactoryRequest 请求对象
     * @return AsyncInvoker<CreateArtifactoryRequest, CreateArtifactoryResponse>
     */
    public AsyncInvoker<CreateArtifactoryRequest, CreateArtifactoryResponse> createArtifactoryAsyncInvoker(
        CreateArtifactoryRequest request) {
        return new AsyncInvoker<CreateArtifactoryRequest, CreateArtifactoryResponse>(request,
            CodeArtsArtifactMeta.createArtifactory, hcClient);
    }

    /**
     * 关注组件/取消关注组件
     *
     * 关注组件/取消关注组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAttentionRequest 请求对象
     * @return CompletableFuture<CreateAttentionResponse>
     */
    public CompletableFuture<CreateAttentionResponse> createAttentionAsync(CreateAttentionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.createAttention);
    }

    /**
     * 关注组件/取消关注组件
     *
     * 关注组件/取消关注组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAttentionRequest 请求对象
     * @return AsyncInvoker<CreateAttentionRequest, CreateAttentionResponse>
     */
    public AsyncInvoker<CreateAttentionRequest, CreateAttentionResponse> createAttentionAsyncInvoker(
        CreateAttentionRequest request) {
        return new AsyncInvoker<CreateAttentionRequest, CreateAttentionResponse>(request,
            CodeArtsArtifactMeta.createAttention, hcClient);
    }

    /**
     * 创建docker仓库
     *
     * 创建docker仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDockerRepositoriesRequest 请求对象
     * @return CompletableFuture<CreateDockerRepositoriesResponse>
     */
    public CompletableFuture<CreateDockerRepositoriesResponse> createDockerRepositoriesAsync(
        CreateDockerRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.createDockerRepositories);
    }

    /**
     * 创建docker仓库
     *
     * 创建docker仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDockerRepositoriesRequest 请求对象
     * @return AsyncInvoker<CreateDockerRepositoriesRequest, CreateDockerRepositoriesResponse>
     */
    public AsyncInvoker<CreateDockerRepositoriesRequest, CreateDockerRepositoriesResponse> createDockerRepositoriesAsyncInvoker(
        CreateDockerRepositoriesRequest request) {
        return new AsyncInvoker<CreateDockerRepositoriesRequest, CreateDockerRepositoriesResponse>(request,
            CodeArtsArtifactMeta.createDockerRepositories, hcClient);
    }

    /**
     * 创建maven仓库
     *
     * 创建maven仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMavenRepoRequest 请求对象
     * @return CompletableFuture<CreateMavenRepoResponse>
     */
    public CompletableFuture<CreateMavenRepoResponse> createMavenRepoAsync(CreateMavenRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.createMavenRepo);
    }

    /**
     * 创建maven仓库
     *
     * 创建maven仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMavenRepoRequest 请求对象
     * @return AsyncInvoker<CreateMavenRepoRequest, CreateMavenRepoResponse>
     */
    public AsyncInvoker<CreateMavenRepoRequest, CreateMavenRepoResponse> createMavenRepoAsyncInvoker(
        CreateMavenRepoRequest request) {
        return new AsyncInvoker<CreateMavenRepoRequest, CreateMavenRepoResponse>(request,
            CodeArtsArtifactMeta.createMavenRepo, hcClient);
    }

    /**
     * 创建项目关联仓库
     *
     * 创建项目管理关联仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectRelatedRepositoryRequest 请求对象
     * @return CompletableFuture<CreateProjectRelatedRepositoryResponse>
     */
    public CompletableFuture<CreateProjectRelatedRepositoryResponse> createProjectRelatedRepositoryAsync(
        CreateProjectRelatedRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.createProjectRelatedRepository);
    }

    /**
     * 创建项目关联仓库
     *
     * 创建项目管理关联仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectRelatedRepositoryRequest 请求对象
     * @return AsyncInvoker<CreateProjectRelatedRepositoryRequest, CreateProjectRelatedRepositoryResponse>
     */
    public AsyncInvoker<CreateProjectRelatedRepositoryRequest, CreateProjectRelatedRepositoryResponse> createProjectRelatedRepositoryAsyncInvoker(
        CreateProjectRelatedRepositoryRequest request) {
        return new AsyncInvoker<CreateProjectRelatedRepositoryRequest, CreateProjectRelatedRepositoryResponse>(request,
            CodeArtsArtifactMeta.createProjectRelatedRepository, hcClient);
    }

    /**
     * 非maven删除文件
     *
     * 非maven删除文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteArtifactFileRequest 请求对象
     * @return CompletableFuture<DeleteArtifactFileResponse>
     */
    public CompletableFuture<DeleteArtifactFileResponse> deleteArtifactFileAsync(DeleteArtifactFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.deleteArtifactFile);
    }

    /**
     * 非maven删除文件
     *
     * 非maven删除文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteArtifactFileRequest 请求对象
     * @return AsyncInvoker<DeleteArtifactFileRequest, DeleteArtifactFileResponse>
     */
    public AsyncInvoker<DeleteArtifactFileRequest, DeleteArtifactFileResponse> deleteArtifactFileAsyncInvoker(
        DeleteArtifactFileRequest request) {
        return new AsyncInvoker<DeleteArtifactFileRequest, DeleteArtifactFileResponse>(request,
            CodeArtsArtifactMeta.deleteArtifactFile, hcClient);
    }

    /**
     * 删除仓库到回收站
     *
     * 删除仓库到回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRepositoryRequest 请求对象
     * @return CompletableFuture<DeleteRepositoryResponse>
     */
    public CompletableFuture<DeleteRepositoryResponse> deleteRepositoryAsync(DeleteRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.deleteRepository);
    }

    /**
     * 删除仓库到回收站
     *
     * 删除仓库到回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRepositoryRequest 请求对象
     * @return AsyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse>
     */
    public AsyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse> deleteRepositoryAsyncInvoker(
        DeleteRepositoryRequest request) {
        return new AsyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse>(request,
            CodeArtsArtifactMeta.deleteRepository, hcClient);
    }

    /**
     * 查询仓库详情，不会去统计仓库下的制品数量
     *
     * 查询仓库详情，不会去统计仓库下的制品数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllRepositoriesRequest 请求对象
     * @return CompletableFuture<ListAllRepositoriesResponse>
     */
    public CompletableFuture<ListAllRepositoriesResponse> listAllRepositoriesAsync(ListAllRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listAllRepositories);
    }

    /**
     * 查询仓库详情，不会去统计仓库下的制品数量
     *
     * 查询仓库详情，不会去统计仓库下的制品数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllRepositoriesRequest 请求对象
     * @return AsyncInvoker<ListAllRepositoriesRequest, ListAllRepositoriesResponse>
     */
    public AsyncInvoker<ListAllRepositoriesRequest, ListAllRepositoriesResponse> listAllRepositoriesAsyncInvoker(
        ListAllRepositoriesRequest request) {
        return new AsyncInvoker<ListAllRepositoriesRequest, ListAllRepositoriesResponse>(request,
            CodeArtsArtifactMeta.listAllRepositories, hcClient);
    }

    /**
     * 查询仓库文件详情
     *
     * 查询仓库文件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListArtifactoryComponentRequest 请求对象
     * @return CompletableFuture<ListArtifactoryComponentResponse>
     */
    public CompletableFuture<ListArtifactoryComponentResponse> listArtifactoryComponentAsync(
        ListArtifactoryComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listArtifactoryComponent);
    }

    /**
     * 查询仓库文件详情
     *
     * 查询仓库文件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListArtifactoryComponentRequest 请求对象
     * @return AsyncInvoker<ListArtifactoryComponentRequest, ListArtifactoryComponentResponse>
     */
    public AsyncInvoker<ListArtifactoryComponentRequest, ListArtifactoryComponentResponse> listArtifactoryComponentAsyncInvoker(
        ListArtifactoryComponentRequest request) {
        return new AsyncInvoker<ListArtifactoryComponentRequest, ListArtifactoryComponentResponse>(request,
            CodeArtsArtifactMeta.listArtifactoryComponent, hcClient);
    }

    /**
     * 查询存储容量趋势
     *
     * 查询存储容量趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListArtifactoryStorageStatisticRequest 请求对象
     * @return CompletableFuture<ListArtifactoryStorageStatisticResponse>
     */
    public CompletableFuture<ListArtifactoryStorageStatisticResponse> listArtifactoryStorageStatisticAsync(
        ListArtifactoryStorageStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listArtifactoryStorageStatistic);
    }

    /**
     * 查询存储容量趋势
     *
     * 查询存储容量趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListArtifactoryStorageStatisticRequest 请求对象
     * @return AsyncInvoker<ListArtifactoryStorageStatisticRequest, ListArtifactoryStorageStatisticResponse>
     */
    public AsyncInvoker<ListArtifactoryStorageStatisticRequest, ListArtifactoryStorageStatisticResponse> listArtifactoryStorageStatisticAsyncInvoker(
        ListArtifactoryStorageStatisticRequest request) {
        return new AsyncInvoker<ListArtifactoryStorageStatisticRequest, ListArtifactoryStorageStatisticResponse>(
            request, CodeArtsArtifactMeta.listArtifactoryStorageStatistic, hcClient);
    }

    /**
     * 查询关注列表
     *
     * 查询关注列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAttentionsRequest 请求对象
     * @return CompletableFuture<ListAttentionsResponse>
     */
    public CompletableFuture<ListAttentionsResponse> listAttentionsAsync(ListAttentionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listAttentions);
    }

    /**
     * 查询关注列表
     *
     * 查询关注列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAttentionsRequest 请求对象
     * @return AsyncInvoker<ListAttentionsRequest, ListAttentionsResponse>
     */
    public AsyncInvoker<ListAttentionsRequest, ListAttentionsResponse> listAttentionsAsyncInvoker(
        ListAttentionsRequest request) {
        return new AsyncInvoker<ListAttentionsRequest, ListAttentionsResponse>(request,
            CodeArtsArtifactMeta.listAttentions, hcClient);
    }

    /**
     * 编辑仓库
     *
     * 编辑仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyRepositoryRequest 请求对象
     * @return CompletableFuture<ModifyRepositoryResponse>
     */
    public CompletableFuture<ModifyRepositoryResponse> modifyRepositoryAsync(ModifyRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.modifyRepository);
    }

    /**
     * 编辑仓库
     *
     * 编辑仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyRepositoryRequest 请求对象
     * @return AsyncInvoker<ModifyRepositoryRequest, ModifyRepositoryResponse>
     */
    public AsyncInvoker<ModifyRepositoryRequest, ModifyRepositoryResponse> modifyRepositoryAsyncInvoker(
        ModifyRepositoryRequest request) {
        return new AsyncInvoker<ModifyRepositoryRequest, ModifyRepositoryResponse>(request,
            CodeArtsArtifactMeta.modifyRepository, hcClient);
    }

    /**
     * 重置用户密码
     *
     * 重置用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetUserPasswordRequest 请求对象
     * @return CompletableFuture<ResetUserPasswordResponse>
     */
    public CompletableFuture<ResetUserPasswordResponse> resetUserPasswordAsync(ResetUserPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.resetUserPassword);
    }

    /**
     * 重置用户密码
     *
     * 重置用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetUserPasswordRequest 请求对象
     * @return AsyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse>
     */
    public AsyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse> resetUserPasswordAsyncInvoker(
        ResetUserPasswordRequest request) {
        return new AsyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse>(request,
            CodeArtsArtifactMeta.resetUserPassword, hcClient);
    }

    /**
     * 统筹搜索
     *
     * 统筹搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchArtifactsRequest 请求对象
     * @return CompletableFuture<SearchArtifactsResponse>
     */
    public CompletableFuture<SearchArtifactsResponse> searchArtifactsAsync(SearchArtifactsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.searchArtifacts);
    }

    /**
     * 统筹搜索
     *
     * 统筹搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchArtifactsRequest 请求对象
     * @return AsyncInvoker<SearchArtifactsRequest, SearchArtifactsResponse>
     */
    public AsyncInvoker<SearchArtifactsRequest, SearchArtifactsResponse> searchArtifactsAsyncInvoker(
        SearchArtifactsRequest request) {
        return new AsyncInvoker<SearchArtifactsRequest, SearchArtifactsResponse>(request,
            CodeArtsArtifactMeta.searchArtifacts, hcClient);
    }

    /**
     * 通过checksum搜索文件
     *
     * 通过checksum搜索文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchByChecksumRequest 请求对象
     * @return CompletableFuture<SearchByChecksumResponse>
     */
    public CompletableFuture<SearchByChecksumResponse> searchByChecksumAsync(SearchByChecksumRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.searchByChecksum);
    }

    /**
     * 通过checksum搜索文件
     *
     * 通过checksum搜索文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchByChecksumRequest 请求对象
     * @return AsyncInvoker<SearchByChecksumRequest, SearchByChecksumResponse>
     */
    public AsyncInvoker<SearchByChecksumRequest, SearchByChecksumResponse> searchByChecksumAsyncInvoker(
        SearchByChecksumRequest request) {
        return new AsyncInvoker<SearchByChecksumRequest, SearchByChecksumResponse>(request,
            CodeArtsArtifactMeta.searchByChecksum, hcClient);
    }

    /**
     * 查询仓库或文件的审计日志信息
     *
     * 查询仓库或文件的审计日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditRequest 请求对象
     * @return CompletableFuture<ShowAuditResponse>
     */
    public CompletableFuture<ShowAuditResponse> showAuditAsync(ShowAuditRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showAudit);
    }

    /**
     * 查询仓库或文件的审计日志信息
     *
     * 查询仓库或文件的审计日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditRequest 请求对象
     * @return AsyncInvoker<ShowAuditRequest, ShowAuditResponse>
     */
    public AsyncInvoker<ShowAuditRequest, ShowAuditResponse> showAuditAsyncInvoker(ShowAuditRequest request) {
        return new AsyncInvoker<ShowAuditRequest, ShowAuditResponse>(request, CodeArtsArtifactMeta.showAudit, hcClient);
    }

    /**
     * 查询仓库文件夹目录
     *
     * 查询仓库文件夹目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFileTreeRequest 请求对象
     * @return CompletableFuture<ShowFileTreeResponse>
     */
    public CompletableFuture<ShowFileTreeResponse> showFileTreeAsync(ShowFileTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showFileTree);
    }

    /**
     * 查询仓库文件夹目录
     *
     * 查询仓库文件夹目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFileTreeRequest 请求对象
     * @return AsyncInvoker<ShowFileTreeRequest, ShowFileTreeResponse>
     */
    public AsyncInvoker<ShowFileTreeRequest, ShowFileTreeResponse> showFileTreeAsyncInvoker(
        ShowFileTreeRequest request) {
        return new AsyncInvoker<ShowFileTreeRequest, ShowFileTreeResponse>(request, CodeArtsArtifactMeta.showFileTree,
            hcClient);
    }

    /**
     * 查询租户Maven仓库列表和账号密码
     *
     * 查询租户Maven仓库列表和账号密码，支持跨租户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMavenInfoRequest 请求对象
     * @return CompletableFuture<ShowMavenInfoResponse>
     */
    public CompletableFuture<ShowMavenInfoResponse> showMavenInfoAsync(ShowMavenInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showMavenInfo);
    }

    /**
     * 查询租户Maven仓库列表和账号密码
     *
     * 查询租户Maven仓库列表和账号密码，支持跨租户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMavenInfoRequest 请求对象
     * @return AsyncInvoker<ShowMavenInfoRequest, ShowMavenInfoResponse>
     */
    public AsyncInvoker<ShowMavenInfoRequest, ShowMavenInfoResponse> showMavenInfoAsyncInvoker(
        ShowMavenInfoRequest request) {
        return new AsyncInvoker<ShowMavenInfoRequest, ShowMavenInfoResponse>(request,
            CodeArtsArtifactMeta.showMavenInfo, hcClient);
    }

    /**
     * 查询项目管理关联仓库
     *
     * 查询项目管理关联仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectListRequest 请求对象
     * @return CompletableFuture<ShowProjectListResponse>
     */
    public CompletableFuture<ShowProjectListResponse> showProjectListAsync(ShowProjectListRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showProjectList);
    }

    /**
     * 查询项目管理关联仓库
     *
     * 查询项目管理关联仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectListRequest 请求对象
     * @return AsyncInvoker<ShowProjectListRequest, ShowProjectListResponse>
     */
    public AsyncInvoker<ShowProjectListRequest, ShowProjectListResponse> showProjectListAsyncInvoker(
        ShowProjectListRequest request) {
        return new AsyncInvoker<ShowProjectListRequest, ShowProjectListResponse>(request,
            CodeArtsArtifactMeta.showProjectList, hcClient);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectReleaseFilesRequest 请求对象
     * @return CompletableFuture<ShowProjectReleaseFilesResponse>
     */
    public CompletableFuture<ShowProjectReleaseFilesResponse> showProjectReleaseFilesAsync(
        ShowProjectReleaseFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showProjectReleaseFiles);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectReleaseFilesRequest 请求对象
     * @return AsyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse>
     */
    public AsyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> showProjectReleaseFilesAsyncInvoker(
        ShowProjectReleaseFilesRequest request) {
        return new AsyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse>(request,
            CodeArtsArtifactMeta.showProjectReleaseFiles, hcClient);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseProjectFilesRequest 请求对象
     * @return CompletableFuture<ShowReleaseProjectFilesResponse>
     */
    @Deprecated
    public CompletableFuture<ShowReleaseProjectFilesResponse> showReleaseProjectFilesAsync(
        ShowReleaseProjectFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showReleaseProjectFiles);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseProjectFilesRequest 请求对象
     * @return AsyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> showReleaseProjectFilesAsyncInvoker(
        ShowReleaseProjectFilesRequest request) {
        return new AsyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse>(request,
            CodeArtsArtifactMeta.showReleaseProjectFiles, hcClient);
    }

    /**
     * 查询单个仓库详细信息，会去统计仓库下的制品数量
     *
     * 查询单个仓库详细信息，会去统计仓库下的制品数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryRequest 请求对象
     * @return CompletableFuture<ShowRepositoryResponse>
     */
    public CompletableFuture<ShowRepositoryResponse> showRepositoryAsync(ShowRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showRepository);
    }

    /**
     * 查询单个仓库详细信息，会去统计仓库下的制品数量
     *
     * 查询单个仓库详细信息，会去统计仓库下的制品数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse>
     */
    public AsyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse> showRepositoryAsyncInvoker(
        ShowRepositoryRequest request) {
        return new AsyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse>(request,
            CodeArtsArtifactMeta.showRepository, hcClient);
    }

    /**
     * 查看仓库信息
     *
     * 查看仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryInfoRequest 请求对象
     * @return CompletableFuture<ShowRepositoryInfoResponse>
     */
    public CompletableFuture<ShowRepositoryInfoResponse> showRepositoryInfoAsync(ShowRepositoryInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showRepositoryInfo);
    }

    /**
     * 查看仓库信息
     *
     * 查看仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryInfoRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryInfoRequest, ShowRepositoryInfoResponse>
     */
    public AsyncInvoker<ShowRepositoryInfoRequest, ShowRepositoryInfoResponse> showRepositoryInfoAsyncInvoker(
        ShowRepositoryInfoRequest request) {
        return new AsyncInvoker<ShowRepositoryInfoRequest, ShowRepositoryInfoResponse>(request,
            CodeArtsArtifactMeta.showRepositoryInfo, hcClient);
    }

    /**
     * 仓库用量查询
     *
     * 仓库用量查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStorageRequest 请求对象
     * @return CompletableFuture<ShowStorageResponse>
     */
    public CompletableFuture<ShowStorageResponse> showStorageAsync(ShowStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showStorage);
    }

    /**
     * 仓库用量查询
     *
     * 仓库用量查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStorageRequest 请求对象
     * @return AsyncInvoker<ShowStorageRequest, ShowStorageResponse>
     */
    public AsyncInvoker<ShowStorageRequest, ShowStorageResponse> showStorageAsyncInvoker(ShowStorageRequest request) {
        return new AsyncInvoker<ShowStorageRequest, ShowStorageResponse>(request, CodeArtsArtifactMeta.showStorage,
            hcClient);
    }

    /**
     * 编辑非maven仓库信息
     *
     * 编辑非maven仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateArtifactoryRequest 请求对象
     * @return CompletableFuture<UpdateArtifactoryResponse>
     */
    public CompletableFuture<UpdateArtifactoryResponse> updateArtifactoryAsync(UpdateArtifactoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.updateArtifactory);
    }

    /**
     * 编辑非maven仓库信息
     *
     * 编辑非maven仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateArtifactoryRequest 请求对象
     * @return AsyncInvoker<UpdateArtifactoryRequest, UpdateArtifactoryResponse>
     */
    public AsyncInvoker<UpdateArtifactoryRequest, UpdateArtifactoryResponse> updateArtifactoryAsyncInvoker(
        UpdateArtifactoryRequest request) {
        return new AsyncInvoker<UpdateArtifactoryRequest, UpdateArtifactoryResponse>(request,
            CodeArtsArtifactMeta.updateArtifactory, hcClient);
    }

}
