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
import com.huaweicloud.sdk.codeartsartifact.v2.model.DeleteCompletelyUpdateFileStateRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.DeleteCompletelyUpdateFileStateResponse;
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
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListCapacityMessageSettingRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListCapacityMessageSettingResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListChildProxyRepositoriesListRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListChildProxyRepositoriesListResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListDomainIpConfigRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListDomainIpConfigResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListFileBuildArchivesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListFileBuildArchivesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListLatestVersionFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListLatestVersionFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListMavenListRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListMavenListResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListMavenUserRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListMavenUserResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListNetProxyRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListNetProxyResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListProjectRolePermissionsRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListProjectRolePermissionsResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListProjectUsersRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListProjectUsersResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListSecGuardListRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListSecGuardListResponse;
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
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowAutoDeleteJobSettingsRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowAutoDeleteJobSettingsResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowDomainReleaseRepoStorageRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowDomainReleaseRepoStorageResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileDetailByFullNameRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileDetailByFullNameResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileDetailRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileDetailResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileTreeRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileTreeResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowLatestVersionFilesCountRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowLatestVersionFilesCountResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowMavenInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowMavenInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowMultiRolesUserPermissionsRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowMultiRolesUserPermissionsResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowOpenSourceEnabledRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowOpenSourceEnabledResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowPackageDataDetailRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowPackageDataDetailResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowPackageInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowPackageInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectListRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectListResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectReleaseFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectReleaseFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectStorageInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectStorageInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowReleaseProjectFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowReleaseProjectFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepoUserInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepoUserInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowStorageRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowStorageResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowUserPrivilegesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowUserPrivilegesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowUserTicketRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowUserTicketResponse;
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
     * 彻底删除文件/文件夹
     *
     * 根据文件ID彻底删除文件或文件夹，删除后不能恢复，支持批量删除。可使用该接口清理不再需要的文件或文件夹以释放存储空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCompletelyUpdateFileStateRequest 请求对象
     * @return CompletableFuture<DeleteCompletelyUpdateFileStateResponse>
     */
    public CompletableFuture<DeleteCompletelyUpdateFileStateResponse> deleteCompletelyUpdateFileStateAsync(
        DeleteCompletelyUpdateFileStateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.deleteCompletelyUpdateFileState);
    }

    /**
     * 彻底删除文件/文件夹
     *
     * 根据文件ID彻底删除文件或文件夹，删除后不能恢复，支持批量删除。可使用该接口清理不再需要的文件或文件夹以释放存储空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCompletelyUpdateFileStateRequest 请求对象
     * @return AsyncInvoker<DeleteCompletelyUpdateFileStateRequest, DeleteCompletelyUpdateFileStateResponse>
     */
    public AsyncInvoker<DeleteCompletelyUpdateFileStateRequest, DeleteCompletelyUpdateFileStateResponse> deleteCompletelyUpdateFileStateAsyncInvoker(
        DeleteCompletelyUpdateFileStateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.deleteCompletelyUpdateFileState, hcClient);
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
     * 查询租户容量消息通知设置信息
     *
     * 查询租户容量消息通知设置，包含容量阈值和是否启用邮件通知等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCapacityMessageSettingRequest 请求对象
     * @return CompletableFuture<ListCapacityMessageSettingResponse>
     */
    public CompletableFuture<ListCapacityMessageSettingResponse> listCapacityMessageSettingAsync(
        ListCapacityMessageSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listCapacityMessageSetting);
    }

    /**
     * 查询租户容量消息通知设置信息
     *
     * 查询租户容量消息通知设置，包含容量阈值和是否启用邮件通知等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCapacityMessageSettingRequest 请求对象
     * @return AsyncInvoker<ListCapacityMessageSettingRequest, ListCapacityMessageSettingResponse>
     */
    public AsyncInvoker<ListCapacityMessageSettingRequest, ListCapacityMessageSettingResponse> listCapacityMessageSettingAsyncInvoker(
        ListCapacityMessageSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listCapacityMessageSetting, hcClient);
    }

    /**
     * 获取聚合仓下的仓库代理列表
     *
     * 根据仓库ID获取指定聚合仓的仓库代理列表，包含仓库状态、类型、地址和访问路径白名单等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChildProxyRepositoriesListRequest 请求对象
     * @return CompletableFuture<ListChildProxyRepositoriesListResponse>
     */
    public CompletableFuture<ListChildProxyRepositoriesListResponse> listChildProxyRepositoriesListAsync(
        ListChildProxyRepositoriesListRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listChildProxyRepositoriesList);
    }

    /**
     * 获取聚合仓下的仓库代理列表
     *
     * 根据仓库ID获取指定聚合仓的仓库代理列表，包含仓库状态、类型、地址和访问路径白名单等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChildProxyRepositoriesListRequest 请求对象
     * @return AsyncInvoker<ListChildProxyRepositoriesListRequest, ListChildProxyRepositoriesListResponse>
     */
    public AsyncInvoker<ListChildProxyRepositoriesListRequest, ListChildProxyRepositoriesListResponse> listChildProxyRepositoriesListAsyncInvoker(
        ListChildProxyRepositoriesListRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listChildProxyRepositoriesList, hcClient);
    }

    /**
     * 查询租户级IP白名单
     *
     * 查询租户级IP白名单列表。在IP白名单的IP才能访问制品仓库，未配置IP白名单时，默认所有IP都可访问。该功能可用于保障制品仓库的安全，对访问IP进行严格控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainIpConfigRequest 请求对象
     * @return CompletableFuture<ListDomainIpConfigResponse>
     */
    public CompletableFuture<ListDomainIpConfigResponse> listDomainIpConfigAsync(ListDomainIpConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listDomainIpConfig);
    }

    /**
     * 查询租户级IP白名单
     *
     * 查询租户级IP白名单列表。在IP白名单的IP才能访问制品仓库，未配置IP白名单时，默认所有IP都可访问。该功能可用于保障制品仓库的安全，对访问IP进行严格控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainIpConfigRequest 请求对象
     * @return AsyncInvoker<ListDomainIpConfigRequest, ListDomainIpConfigResponse>
     */
    public AsyncInvoker<ListDomainIpConfigRequest, ListDomainIpConfigResponse> listDomainIpConfigAsyncInvoker(
        ListDomainIpConfigRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listDomainIpConfig, hcClient);
    }

    /**
     * 分页查询构建归档包列表
     *
     * 当归档包数量庞大时，分页查询构建归档包列表，包含文件名、文件大小、下载地址、MD5校验和、构建地址、构建代码分支等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileBuildArchivesRequest 请求对象
     * @return CompletableFuture<ListFileBuildArchivesResponse>
     */
    public CompletableFuture<ListFileBuildArchivesResponse> listFileBuildArchivesAsync(
        ListFileBuildArchivesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listFileBuildArchives);
    }

    /**
     * 分页查询构建归档包列表
     *
     * 当归档包数量庞大时，分页查询构建归档包列表，包含文件名、文件大小、下载地址、MD5校验和、构建地址、构建代码分支等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileBuildArchivesRequest 请求对象
     * @return AsyncInvoker<ListFileBuildArchivesRequest, ListFileBuildArchivesResponse>
     */
    public AsyncInvoker<ListFileBuildArchivesRequest, ListFileBuildArchivesResponse> listFileBuildArchivesAsyncInvoker(
        ListFileBuildArchivesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listFileBuildArchives, hcClient);
    }

    /**
     * 查询文件/项目列表
     *
     * 当项目或文件数量庞大时，分页查询项目或文件列表。可根据文件名、文件状态和文件的发布状态等参数进行过滤，从而快速找到所需文件，包含文件名、文件大小和下载地址等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesRequest 请求对象
     * @return CompletableFuture<ListFilesResponse>
     */
    public CompletableFuture<ListFilesResponse> listFilesAsync(ListFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listFiles);
    }

    /**
     * 查询文件/项目列表
     *
     * 当项目或文件数量庞大时，分页查询项目或文件列表。可根据文件名、文件状态和文件的发布状态等参数进行过滤，从而快速找到所需文件，包含文件名、文件大小和下载地址等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesRequest 请求对象
     * @return AsyncInvoker<ListFilesRequest, ListFilesResponse>
     */
    public AsyncInvoker<ListFilesRequest, ListFilesResponse> listFilesAsyncInvoker(ListFilesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listFiles, hcClient);
    }

    /**
     * 查询项目下所有文件的最新版本
     *
     * 当项目文件数量庞大时，通过该接口可以分页查询项目下所有文件的最新版本，包含文件名、文件大小、文件状态和发布状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestVersionFilesRequest 请求对象
     * @return CompletableFuture<ListLatestVersionFilesResponse>
     */
    public CompletableFuture<ListLatestVersionFilesResponse> listLatestVersionFilesAsync(
        ListLatestVersionFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listLatestVersionFiles);
    }

    /**
     * 查询项目下所有文件的最新版本
     *
     * 当项目文件数量庞大时，通过该接口可以分页查询项目下所有文件的最新版本，包含文件名、文件大小、文件状态和发布状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestVersionFilesRequest 请求对象
     * @return AsyncInvoker<ListLatestVersionFilesRequest, ListLatestVersionFilesResponse>
     */
    public AsyncInvoker<ListLatestVersionFilesRequest, ListLatestVersionFilesResponse> listLatestVersionFilesAsyncInvoker(
        ListLatestVersionFilesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listLatestVersionFiles, hcClient);
    }

    /**
     * 查询Maven仓库列表
     *
     * 查询Maven仓库列表，包含仓库状态、类型、地址和访问路径白名单等信息。支持根据项目ID和仓库ID等参数进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMavenListRequest 请求对象
     * @return CompletableFuture<ListMavenListResponse>
     */
    public CompletableFuture<ListMavenListResponse> listMavenListAsync(ListMavenListRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listMavenList);
    }

    /**
     * 查询Maven仓库列表
     *
     * 查询Maven仓库列表，包含仓库状态、类型、地址和访问路径白名单等信息。支持根据项目ID和仓库ID等参数进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMavenListRequest 请求对象
     * @return AsyncInvoker<ListMavenListRequest, ListMavenListResponse>
     */
    public AsyncInvoker<ListMavenListRequest, ListMavenListResponse> listMavenListAsyncInvoker(
        ListMavenListRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listMavenList, hcClient);
    }

    /**
     * 查询私有库用户列表
     *
     * 分页查询私有库用户列表，包含用户名和用户是否启用等信息。可根据用户名进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMavenUserRequest 请求对象
     * @return CompletableFuture<ListMavenUserResponse>
     */
    public CompletableFuture<ListMavenUserResponse> listMavenUserAsync(ListMavenUserRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listMavenUser);
    }

    /**
     * 查询私有库用户列表
     *
     * 分页查询私有库用户列表，包含用户名和用户是否启用等信息。可根据用户名进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMavenUserRequest 请求对象
     * @return AsyncInvoker<ListMavenUserRequest, ListMavenUserResponse>
     */
    public AsyncInvoker<ListMavenUserRequest, ListMavenUserResponse> listMavenUserAsyncInvoker(
        ListMavenUserRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listMavenUser, hcClient);
    }

    /**
     * 查询网络代理列表
     *
     * 查询网络代理列表，返回代理源的访问地址及认证信息等，用于代理外部公开的制品资源。通过网络代理，开发人员可以安全、高效地访问所需的外部资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetProxyRequest 请求对象
     * @return CompletableFuture<ListNetProxyResponse>
     */
    public CompletableFuture<ListNetProxyResponse> listNetProxyAsync(ListNetProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listNetProxy);
    }

    /**
     * 查询网络代理列表
     *
     * 查询网络代理列表，返回代理源的访问地址及认证信息等，用于代理外部公开的制品资源。通过网络代理，开发人员可以安全、高效地访问所需的外部资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetProxyRequest 请求对象
     * @return AsyncInvoker<ListNetProxyRequest, ListNetProxyResponse>
     */
    public AsyncInvoker<ListNetProxyRequest, ListNetProxyResponse> listNetProxyAsyncInvoker(
        ListNetProxyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listNetProxy, hcClient);
    }

    /**
     * 查看项目的角色权限设置
     *
     * 查看项目的角色权限设置，包含上传下载、创建文件夹、清空或者还原回收站和更改软件包状态等设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectRolePermissionsRequest 请求对象
     * @return CompletableFuture<ListProjectRolePermissionsResponse>
     */
    public CompletableFuture<ListProjectRolePermissionsResponse> listProjectRolePermissionsAsync(
        ListProjectRolePermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listProjectRolePermissions);
    }

    /**
     * 查看项目的角色权限设置
     *
     * 查看项目的角色权限设置，包含上传下载、创建文件夹、清空或者还原回收站和更改软件包状态等设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectRolePermissionsRequest 请求对象
     * @return AsyncInvoker<ListProjectRolePermissionsRequest, ListProjectRolePermissionsResponse>
     */
    public AsyncInvoker<ListProjectRolePermissionsRequest, ListProjectRolePermissionsResponse> listProjectRolePermissionsAsyncInvoker(
        ListProjectRolePermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listProjectRolePermissions, hcClient);
    }

    /**
     * 查询项目下的用户
     *
     * 当项目中的用户数量较多时，分页查询指定项目下的用户列表，包含用户名和角色等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectUsersRequest 请求对象
     * @return CompletableFuture<ListProjectUsersResponse>
     */
    public CompletableFuture<ListProjectUsersResponse> listProjectUsersAsync(ListProjectUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listProjectUsers);
    }

    /**
     * 查询项目下的用户
     *
     * 当项目中的用户数量较多时，分页查询指定项目下的用户列表，包含用户名和角色等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectUsersRequest 请求对象
     * @return AsyncInvoker<ListProjectUsersRequest, ListProjectUsersResponse>
     */
    public AsyncInvoker<ListProjectUsersRequest, ListProjectUsersResponse> listProjectUsersAsyncInvoker(
        ListProjectUsersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listProjectUsers, hcClient);
    }

    /**
     * 查询制品安全扫描任务列表
     *
     * 分页查询制品安全扫描任务列表，包含扫描制品数量、漏洞数量、病毒文件数量和恶意代码文件数量等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecGuardListRequest 请求对象
     * @return CompletableFuture<ListSecGuardListResponse>
     */
    public CompletableFuture<ListSecGuardListResponse> listSecGuardListAsync(ListSecGuardListRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.listSecGuardList);
    }

    /**
     * 查询制品安全扫描任务列表
     *
     * 分页查询制品安全扫描任务列表，包含扫描制品数量、漏洞数量、病毒文件数量和恶意代码文件数量等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecGuardListRequest 请求对象
     * @return AsyncInvoker<ListSecGuardListRequest, ListSecGuardListResponse>
     */
    public AsyncInvoker<ListSecGuardListRequest, ListSecGuardListResponse> listSecGuardListAsyncInvoker(
        ListSecGuardListRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.listSecGuardList, hcClient);
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
     * 查询项目自动删除任务设置
     *
     * 查询项目自动删除任务设置，包含文件的过期自动删除时间及删除规则。自动删除任务可以自动执行文件清理任务，减少管理员的工作负担，确保存储资源的有效利用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoDeleteJobSettingsRequest 请求对象
     * @return CompletableFuture<ShowAutoDeleteJobSettingsResponse>
     */
    public CompletableFuture<ShowAutoDeleteJobSettingsResponse> showAutoDeleteJobSettingsAsync(
        ShowAutoDeleteJobSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showAutoDeleteJobSettings);
    }

    /**
     * 查询项目自动删除任务设置
     *
     * 查询项目自动删除任务设置，包含文件的过期自动删除时间及删除规则。自动删除任务可以自动执行文件清理任务，减少管理员的工作负担，确保存储资源的有效利用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoDeleteJobSettingsRequest 请求对象
     * @return AsyncInvoker<ShowAutoDeleteJobSettingsRequest, ShowAutoDeleteJobSettingsResponse>
     */
    public AsyncInvoker<ShowAutoDeleteJobSettingsRequest, ShowAutoDeleteJobSettingsResponse> showAutoDeleteJobSettingsAsyncInvoker(
        ShowAutoDeleteJobSettingsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showAutoDeleteJobSettings, hcClient);
    }

    /**
     * 查询租户发布库存储容量
     *
     * 查询租户发布库存储容量，包含已使用存储容量、最大存储容量、套餐类型和仓库数量等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainReleaseRepoStorageRequest 请求对象
     * @return CompletableFuture<ShowDomainReleaseRepoStorageResponse>
     */
    public CompletableFuture<ShowDomainReleaseRepoStorageResponse> showDomainReleaseRepoStorageAsync(
        ShowDomainReleaseRepoStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showDomainReleaseRepoStorage);
    }

    /**
     * 查询租户发布库存储容量
     *
     * 查询租户发布库存储容量，包含已使用存储容量、最大存储容量、套餐类型和仓库数量等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainReleaseRepoStorageRequest 请求对象
     * @return AsyncInvoker<ShowDomainReleaseRepoStorageRequest, ShowDomainReleaseRepoStorageResponse>
     */
    public AsyncInvoker<ShowDomainReleaseRepoStorageRequest, ShowDomainReleaseRepoStorageResponse> showDomainReleaseRepoStorageAsyncInvoker(
        ShowDomainReleaseRepoStorageRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showDomainReleaseRepoStorage, hcClient);
    }

    /**
     * 根据文件ID查询文件详情
     *
     * 在日常数据管理工作中，根据文件ID查询指定文件详情，包含文件名、文件大小、下载地址、校验和、文件状态和发布状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileDetailRequest 请求对象
     * @return CompletableFuture<ShowFileDetailResponse>
     */
    public CompletableFuture<ShowFileDetailResponse> showFileDetailAsync(ShowFileDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showFileDetail);
    }

    /**
     * 根据文件ID查询文件详情
     *
     * 在日常数据管理工作中，根据文件ID查询指定文件详情，包含文件名、文件大小、下载地址、校验和、文件状态和发布状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileDetailRequest 请求对象
     * @return AsyncInvoker<ShowFileDetailRequest, ShowFileDetailResponse>
     */
    public AsyncInvoker<ShowFileDetailRequest, ShowFileDetailResponse> showFileDetailAsyncInvoker(
        ShowFileDetailRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showFileDetail, hcClient);
    }

    /**
     * 根据文件完整路径查询文件详情
     *
     * 在日常数据管理工作中，根据文件完整路径查询指定文件详情，包含文件名、文件大小、下载地址、校验和、文件状态和发布状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileDetailByFullNameRequest 请求对象
     * @return CompletableFuture<ShowFileDetailByFullNameResponse>
     */
    public CompletableFuture<ShowFileDetailByFullNameResponse> showFileDetailByFullNameAsync(
        ShowFileDetailByFullNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showFileDetailByFullName);
    }

    /**
     * 根据文件完整路径查询文件详情
     *
     * 在日常数据管理工作中，根据文件完整路径查询指定文件详情，包含文件名、文件大小、下载地址、校验和、文件状态和发布状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileDetailByFullNameRequest 请求对象
     * @return AsyncInvoker<ShowFileDetailByFullNameRequest, ShowFileDetailByFullNameResponse>
     */
    public AsyncInvoker<ShowFileDetailByFullNameRequest, ShowFileDetailByFullNameResponse> showFileDetailByFullNameAsyncInvoker(
        ShowFileDetailByFullNameRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showFileDetailByFullName, hcClient);
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
     * 查询项目下所有文件的数量
     *
     * 查询项目下所有文件的数量，该接口会识别所有文件的最新版本，从而提供准确的文件数量统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestVersionFilesCountRequest 请求对象
     * @return CompletableFuture<ShowLatestVersionFilesCountResponse>
     */
    public CompletableFuture<ShowLatestVersionFilesCountResponse> showLatestVersionFilesCountAsync(
        ShowLatestVersionFilesCountRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showLatestVersionFilesCount);
    }

    /**
     * 查询项目下所有文件的数量
     *
     * 查询项目下所有文件的数量，该接口会识别所有文件的最新版本，从而提供准确的文件数量统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestVersionFilesCountRequest 请求对象
     * @return AsyncInvoker<ShowLatestVersionFilesCountRequest, ShowLatestVersionFilesCountResponse>
     */
    public AsyncInvoker<ShowLatestVersionFilesCountRequest, ShowLatestVersionFilesCountResponse> showLatestVersionFilesCountAsyncInvoker(
        ShowLatestVersionFilesCountRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showLatestVersionFilesCount, hcClient);
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
     * 查询多角色用户权限
     *
     * 查询多角色用户权限，包含上传下载、创建文件夹、清空或者还原回收站和更改软件包状态等权限信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiRolesUserPermissionsRequest 请求对象
     * @return CompletableFuture<ShowMultiRolesUserPermissionsResponse>
     */
    public CompletableFuture<ShowMultiRolesUserPermissionsResponse> showMultiRolesUserPermissionsAsync(
        ShowMultiRolesUserPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showMultiRolesUserPermissions);
    }

    /**
     * 查询多角色用户权限
     *
     * 查询多角色用户权限，包含上传下载、创建文件夹、清空或者还原回收站和更改软件包状态等权限信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiRolesUserPermissionsRequest 请求对象
     * @return AsyncInvoker<ShowMultiRolesUserPermissionsRequest, ShowMultiRolesUserPermissionsResponse>
     */
    public AsyncInvoker<ShowMultiRolesUserPermissionsRequest, ShowMultiRolesUserPermissionsResponse> showMultiRolesUserPermissionsAsyncInvoker(
        ShowMultiRolesUserPermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showMultiRolesUserPermissions, hcClient);
    }

    /**
     * 查询中心仓是否启用
     *
     * 查询中心仓是否启用，用于确定当前局点是否具备中心仓功能，从而确保业务流程的顺利进行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpenSourceEnabledRequest 请求对象
     * @return CompletableFuture<ShowOpenSourceEnabledResponse>
     */
    public CompletableFuture<ShowOpenSourceEnabledResponse> showOpenSourceEnabledAsync(
        ShowOpenSourceEnabledRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showOpenSourceEnabled);
    }

    /**
     * 查询中心仓是否启用
     *
     * 查询中心仓是否启用，用于确定当前局点是否具备中心仓功能，从而确保业务流程的顺利进行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpenSourceEnabledRequest 请求对象
     * @return AsyncInvoker<ShowOpenSourceEnabledRequest, ShowOpenSourceEnabledResponse>
     */
    public AsyncInvoker<ShowOpenSourceEnabledRequest, ShowOpenSourceEnabledResponse> showOpenSourceEnabledAsyncInvoker(
        ShowOpenSourceEnabledRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showOpenSourceEnabled, hcClient);
    }

    /**
     * 获取当前用户的套餐信息
     *
     * 获取当前用户的套餐信息，包含总存储容量和已使用存储容量等信息，以便合理规划资源使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPackageDataDetailRequest 请求对象
     * @return CompletableFuture<ShowPackageDataDetailResponse>
     */
    public CompletableFuture<ShowPackageDataDetailResponse> showPackageDataDetailAsync(
        ShowPackageDataDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showPackageDataDetail);
    }

    /**
     * 获取当前用户的套餐信息
     *
     * 获取当前用户的套餐信息，包含总存储容量和已使用存储容量等信息，以便合理规划资源使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPackageDataDetailRequest 请求对象
     * @return AsyncInvoker<ShowPackageDataDetailRequest, ShowPackageDataDetailResponse>
     */
    public AsyncInvoker<ShowPackageDataDetailRequest, ShowPackageDataDetailResponse> showPackageDataDetailAsyncInvoker(
        ShowPackageDataDetailRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showPackageDataDetail, hcClient);
    }

    /**
     * 获取当前用户的套餐状态
     *
     * 获取当前用户的套餐状态，包含套餐扩展包的容量和流量规格，如资源类型、套餐状态、剩余天数等信息，帮助用户高效管理云资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPackageInfoRequest 请求对象
     * @return CompletableFuture<ShowPackageInfoResponse>
     */
    public CompletableFuture<ShowPackageInfoResponse> showPackageInfoAsync(ShowPackageInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showPackageInfo);
    }

    /**
     * 获取当前用户的套餐状态
     *
     * 获取当前用户的套餐状态，包含套餐扩展包的容量和流量规格，如资源类型、套餐状态、剩余天数等信息，帮助用户高效管理云资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPackageInfoRequest 请求对象
     * @return AsyncInvoker<ShowPackageInfoRequest, ShowPackageInfoResponse>
     */
    public AsyncInvoker<ShowPackageInfoRequest, ShowPackageInfoResponse> showPackageInfoAsyncInvoker(
        ShowPackageInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showPackageInfo, hcClient);
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
     * 查询项目下的制品存储容量信息
     *
     * 查询项目下的制品存储容量，包含已使用存储容量和文件数量等信息。在项目管理中，可以使用该接口监控项目下的制品存储情况，以确保资源的有效利用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectStorageInfoRequest 请求对象
     * @return CompletableFuture<ShowProjectStorageInfoResponse>
     */
    public CompletableFuture<ShowProjectStorageInfoResponse> showProjectStorageInfoAsync(
        ShowProjectStorageInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showProjectStorageInfo);
    }

    /**
     * 查询项目下的制品存储容量信息
     *
     * 查询项目下的制品存储容量，包含已使用存储容量和文件数量等信息。在项目管理中，可以使用该接口监控项目下的制品存储情况，以确保资源的有效利用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectStorageInfoRequest 请求对象
     * @return AsyncInvoker<ShowProjectStorageInfoRequest, ShowProjectStorageInfoResponse>
     */
    public AsyncInvoker<ShowProjectStorageInfoRequest, ShowProjectStorageInfoResponse> showProjectStorageInfoAsyncInvoker(
        ShowProjectStorageInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showProjectStorageInfo, hcClient);
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
     * 查询租户私有依赖库的账号密码
     *
     * 在自动化构建场景，用户可调用该接口查询租户私有依赖库的账号密码，以便进行后续的上传下载操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepoUserInfoRequest 请求对象
     * @return CompletableFuture<ShowRepoUserInfoResponse>
     */
    public CompletableFuture<ShowRepoUserInfoResponse> showRepoUserInfoAsync(ShowRepoUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showRepoUserInfo);
    }

    /**
     * 查询租户私有依赖库的账号密码
     *
     * 在自动化构建场景，用户可调用该接口查询租户私有依赖库的账号密码，以便进行后续的上传下载操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepoUserInfoRequest 请求对象
     * @return AsyncInvoker<ShowRepoUserInfoRequest, ShowRepoUserInfoResponse>
     */
    public AsyncInvoker<ShowRepoUserInfoRequest, ShowRepoUserInfoResponse> showRepoUserInfoAsyncInvoker(
        ShowRepoUserInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showRepoUserInfo, hcClient);
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
     * 查询用户凭证
     *
     * 查询用户凭证，该凭证为IDC用户下载制品时使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserTicketRequest 请求对象
     * @return CompletableFuture<ShowUserTicketResponse>
     */
    public CompletableFuture<ShowUserTicketResponse> showUserTicketAsync(ShowUserTicketRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsArtifactMeta.showUserTicket);
    }

    /**
     * 查询用户凭证
     *
     * 查询用户凭证，该凭证为IDC用户下载制品时使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserTicketRequest 请求对象
     * @return AsyncInvoker<ShowUserTicketRequest, ShowUserTicketResponse>
     */
    public AsyncInvoker<ShowUserTicketRequest, ShowUserTicketResponse> showUserTicketAsyncInvoker(
        ShowUserTicketRequest request) {
        return new AsyncInvoker<>(request, CodeArtsArtifactMeta.showUserTicket, hcClient);
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
