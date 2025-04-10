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
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowUserPrivilegesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowUserPrivilegesResponse;
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
     * @param request BatchDeleteTrashesRequest 请求对象
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
     * @param request BatchDeleteTrashesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTrashesRequest, BatchDeleteTrashesResponse>
     */
    public AsyncInvoker<BatchDeleteTrashesRequest, BatchDeleteTrashesResponse> batchDeleteTrashesAsyncInvoker(
        BatchDeleteTrashesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.batchDeleteTrashes, hcClient);
    }

    /**
     * 批量还原回收站
     *
     * 批量还原回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreRepoRequest 请求对象
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
     * @param request BatchRestoreRepoRequest 请求对象
     * @return AsyncInvoker<BatchRestoreRepoRequest, BatchRestoreRepoResponse>
     */
    public AsyncInvoker<BatchRestoreRepoRequest, BatchRestoreRepoResponse> batchRestoreRepoAsyncInvoker(
        BatchRestoreRepoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.batchRestoreRepo, hcClient);
    }

    /**
     * 创建非maven仓库
     *
     * 创建非maven仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateArtifactoryRequest 请求对象
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
     * @param request CreateArtifactoryRequest 请求对象
     * @return AsyncInvoker<CreateArtifactoryRequest, CreateArtifactoryResponse>
     */
    public AsyncInvoker<CreateArtifactoryRequest, CreateArtifactoryResponse> createArtifactoryAsyncInvoker(
        CreateArtifactoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.createArtifactory, hcClient);
    }

    /**
     * 关注组件/取消关注组件
     *
     * 关注组件/取消关注组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAttentionRequest 请求对象
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
     * @param request CreateAttentionRequest 请求对象
     * @return AsyncInvoker<CreateAttentionRequest, CreateAttentionResponse>
     */
    public AsyncInvoker<CreateAttentionRequest, CreateAttentionResponse> createAttentionAsyncInvoker(
        CreateAttentionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.createAttention, hcClient);
    }

    /**
     * 创建docker仓库
     *
     * 创建docker仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDockerRepositoriesRequest 请求对象
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
     * @param request CreateDockerRepositoriesRequest 请求对象
     * @return AsyncInvoker<CreateDockerRepositoriesRequest, CreateDockerRepositoriesResponse>
     */
    public AsyncInvoker<CreateDockerRepositoriesRequest, CreateDockerRepositoriesResponse> createDockerRepositoriesAsyncInvoker(
        CreateDockerRepositoriesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.createDockerRepositories, hcClient);
    }

    /**
     * 创建maven仓库
     *
     * 创建maven仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMavenRepoRequest 请求对象
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
     * @param request CreateMavenRepoRequest 请求对象
     * @return AsyncInvoker<CreateMavenRepoRequest, CreateMavenRepoResponse>
     */
    public AsyncInvoker<CreateMavenRepoRequest, CreateMavenRepoResponse> createMavenRepoAsyncInvoker(
        CreateMavenRepoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.createMavenRepo, hcClient);
    }

    /**
     * 创建项目关联仓库
     *
     * 创建项目管理关联仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectRelatedRepositoryRequest 请求对象
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
     * @param request CreateProjectRelatedRepositoryRequest 请求对象
     * @return AsyncInvoker<CreateProjectRelatedRepositoryRequest, CreateProjectRelatedRepositoryResponse>
     */
    public AsyncInvoker<CreateProjectRelatedRepositoryRequest, CreateProjectRelatedRepositoryResponse> createProjectRelatedRepositoryAsyncInvoker(
        CreateProjectRelatedRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.createProjectRelatedRepository, hcClient);
    }

    /**
     * 非maven删除文件
     *
     * 非maven删除文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteArtifactFileRequest 请求对象
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
     * @param request DeleteArtifactFileRequest 请求对象
     * @return AsyncInvoker<DeleteArtifactFileRequest, DeleteArtifactFileResponse>
     */
    public AsyncInvoker<DeleteArtifactFileRequest, DeleteArtifactFileResponse> deleteArtifactFileAsyncInvoker(
        DeleteArtifactFileRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.deleteArtifactFile, hcClient);
    }

    /**
     * 删除仓库到回收站
     *
     * 删除仓库到回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepositoryRequest 请求对象
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
     * @param request DeleteRepositoryRequest 请求对象
     * @return AsyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse>
     */
    public AsyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse> deleteRepositoryAsyncInvoker(
        DeleteRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.deleteRepository, hcClient);
    }

    /**
     * 查询仓库详情，不会去统计仓库下的制品数量
     *
     * 查询仓库详情，不会去统计仓库下的制品数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllRepositoriesRequest 请求对象
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
     * @param request ListAllRepositoriesRequest 请求对象
     * @return AsyncInvoker<ListAllRepositoriesRequest, ListAllRepositoriesResponse>
     */
    public AsyncInvoker<ListAllRepositoriesRequest, ListAllRepositoriesResponse> listAllRepositoriesAsyncInvoker(
        ListAllRepositoriesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listAllRepositories, hcClient);
    }

    /**
     * 查询仓库文件详情
     *
     * 查询仓库文件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArtifactoryComponentRequest 请求对象
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
     * @param request ListArtifactoryComponentRequest 请求对象
     * @return AsyncInvoker<ListArtifactoryComponentRequest, ListArtifactoryComponentResponse>
     */
    public AsyncInvoker<ListArtifactoryComponentRequest, ListArtifactoryComponentResponse> listArtifactoryComponentAsyncInvoker(
        ListArtifactoryComponentRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listArtifactoryComponent, hcClient);
    }

    /**
     * 查询存储容量趋势
     *
     * 查询存储容量趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArtifactoryStorageStatisticRequest 请求对象
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
     * @param request ListArtifactoryStorageStatisticRequest 请求对象
     * @return AsyncInvoker<ListArtifactoryStorageStatisticRequest, ListArtifactoryStorageStatisticResponse>
     */
    public AsyncInvoker<ListArtifactoryStorageStatisticRequest, ListArtifactoryStorageStatisticResponse> listArtifactoryStorageStatisticAsyncInvoker(
        ListArtifactoryStorageStatisticRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listArtifactoryStorageStatistic, hcClient);
    }

    /**
     * 查询关注列表
     *
     * 查询关注列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttentionsRequest 请求对象
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
     * @param request ListAttentionsRequest 请求对象
     * @return AsyncInvoker<ListAttentionsRequest, ListAttentionsResponse>
     */
    public AsyncInvoker<ListAttentionsRequest, ListAttentionsResponse> listAttentionsAsyncInvoker(
        ListAttentionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listAttentions, hcClient);
    }

    /**
     * 编辑仓库
     *
     * 编辑仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyRepositoryRequest 请求对象
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
     * @param request ModifyRepositoryRequest 请求对象
     * @return AsyncInvoker<ModifyRepositoryRequest, ModifyRepositoryResponse>
     */
    public AsyncInvoker<ModifyRepositoryRequest, ModifyRepositoryResponse> modifyRepositoryAsyncInvoker(
        ModifyRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.modifyRepository, hcClient);
    }

    /**
     * 重置用户密码
     *
     * 重置用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetUserPasswordRequest 请求对象
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
     * @param request ResetUserPasswordRequest 请求对象
     * @return AsyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse>
     */
    public AsyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse> resetUserPasswordAsyncInvoker(
        ResetUserPasswordRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.resetUserPassword, hcClient);
    }

    /**
     * 统筹搜索
     *
     * 统筹搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchArtifactsRequest 请求对象
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
     * @param request SearchArtifactsRequest 请求对象
     * @return AsyncInvoker<SearchArtifactsRequest, SearchArtifactsResponse>
     */
    public AsyncInvoker<SearchArtifactsRequest, SearchArtifactsResponse> searchArtifactsAsyncInvoker(
        SearchArtifactsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.searchArtifacts, hcClient);
    }

    /**
     * 通过checksum搜索文件
     *
     * 通过checksum搜索文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchByChecksumRequest 请求对象
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
     * @param request SearchByChecksumRequest 请求对象
     * @return AsyncInvoker<SearchByChecksumRequest, SearchByChecksumResponse>
     */
    public AsyncInvoker<SearchByChecksumRequest, SearchByChecksumResponse> searchByChecksumAsyncInvoker(
        SearchByChecksumRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.searchByChecksum, hcClient);
    }

    /**
     * 查询仓库或文件的审计日志信息
     *
     * 查询仓库或文件的审计日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRequest 请求对象
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
     * @param request ShowAuditRequest 请求对象
     * @return AsyncInvoker<ShowAuditRequest, ShowAuditResponse>
     */
    public AsyncInvoker<ShowAuditRequest, ShowAuditResponse> showAuditAsyncInvoker(ShowAuditRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showAudit, hcClient);
    }

    /**
     * 查询仓库文件夹目录
     *
     * 查询仓库文件夹目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileTreeRequest 请求对象
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
     * @param request ShowFileTreeRequest 请求对象
     * @return AsyncInvoker<ShowFileTreeRequest, ShowFileTreeResponse>
     */
    public AsyncInvoker<ShowFileTreeRequest, ShowFileTreeResponse> showFileTreeAsyncInvoker(
        ShowFileTreeRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showFileTree, hcClient);
    }

    /**
     * 查询租户Maven仓库列表和账号密码
     *
     * 查询租户Maven仓库列表和账号密码，支持跨租户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMavenInfoRequest 请求对象
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
     * @param request ShowMavenInfoRequest 请求对象
     * @return AsyncInvoker<ShowMavenInfoRequest, ShowMavenInfoResponse>
     */
    public AsyncInvoker<ShowMavenInfoRequest, ShowMavenInfoResponse> showMavenInfoAsyncInvoker(
        ShowMavenInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showMavenInfo, hcClient);
    }

    /**
     * 查询项目管理关联仓库
     *
     * 查询项目管理关联仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectListRequest 请求对象
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
     * @param request ShowProjectListRequest 请求对象
     * @return AsyncInvoker<ShowProjectListRequest, ShowProjectListResponse>
     */
    public AsyncInvoker<ShowProjectListRequest, ShowProjectListResponse> showProjectListAsyncInvoker(
        ShowProjectListRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showProjectList, hcClient);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectReleaseFilesRequest 请求对象
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
     * @param request ShowProjectReleaseFilesRequest 请求对象
     * @return AsyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse>
     */
    public AsyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> showProjectReleaseFilesAsyncInvoker(
        ShowProjectReleaseFilesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showProjectReleaseFiles, hcClient);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReleaseProjectFilesRequest 请求对象
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
     * @param request ShowReleaseProjectFilesRequest 请求对象
     * @return AsyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> showReleaseProjectFilesAsyncInvoker(
        ShowReleaseProjectFilesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showReleaseProjectFiles, hcClient);
    }

    /**
     * 查询单个仓库详细信息，会去统计仓库下的制品数量
     *
     * 查询单个仓库详细信息，会去统计仓库下的制品数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
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
     * @param request ShowRepositoryRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse>
     */
    public AsyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse> showRepositoryAsyncInvoker(
        ShowRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showRepository, hcClient);
    }

    /**
     * 查看仓库信息
     *
     * 查看仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryInfoRequest 请求对象
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
     * @param request ShowRepositoryInfoRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryInfoRequest, ShowRepositoryInfoResponse>
     */
    public AsyncInvoker<ShowRepositoryInfoRequest, ShowRepositoryInfoResponse> showRepositoryInfoAsyncInvoker(
        ShowRepositoryInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showRepositoryInfo, hcClient);
    }

    /**
     * 仓库用量查询
     *
     * 仓库用量查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStorageRequest 请求对象
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
     * @param request ShowStorageRequest 请求对象
     * @return AsyncInvoker<ShowStorageRequest, ShowStorageResponse>
     */
    public AsyncInvoker<ShowStorageRequest, ShowStorageResponse> showStorageAsyncInvoker(ShowStorageRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showStorage, hcClient);
    }

    /**
     * 查询用户在项目下的权限
     *
     * 查询用户在项目下的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserPrivilegesRequest 请求对象
     * @return CompletableFuture<ShowUserPrivilegesResponse>
     */
    public CompletableFuture<ShowUserPrivilegesResponse> showUserPrivilegesAsync(ShowUserPrivilegesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showUserPrivileges);
    }

    /**
     * 查询用户在项目下的权限
     *
     * 查询用户在项目下的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserPrivilegesRequest 请求对象
     * @return AsyncInvoker<ShowUserPrivilegesRequest, ShowUserPrivilegesResponse>
     */
    public AsyncInvoker<ShowUserPrivilegesRequest, ShowUserPrivilegesResponse> showUserPrivilegesAsyncInvoker(
        ShowUserPrivilegesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showUserPrivileges, hcClient);
    }

    /**
     * 编辑非maven仓库信息
     *
     * 编辑非maven仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateArtifactoryRequest 请求对象
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
     * @param request UpdateArtifactoryRequest 请求对象
     * @return AsyncInvoker<UpdateArtifactoryRequest, UpdateArtifactoryResponse>
     */
    public AsyncInvoker<UpdateArtifactoryRequest, UpdateArtifactoryResponse> updateArtifactoryAsyncInvoker(
        UpdateArtifactoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.updateArtifactory, hcClient);
    }

}
