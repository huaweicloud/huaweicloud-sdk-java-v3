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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsArtifactClient {

    protected HcClient hcClient;

    public CodeArtsArtifactClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsArtifactClient> newBuilder() {
        ClientBuilder<CodeArtsArtifactClient> clientBuilder = new ClientBuilder<>(CodeArtsArtifactClient::new);
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
     * @return BatchDeleteTrashesResponse
     */
    public BatchDeleteTrashesResponse batchDeleteTrashes(BatchDeleteTrashesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.batchDeleteTrashes);
    }

    /**
     * 批量删除回收站
     *
     * 批量删除回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTrashesRequest 请求对象
     * @return SyncInvoker<BatchDeleteTrashesRequest, BatchDeleteTrashesResponse>
     */
    public SyncInvoker<BatchDeleteTrashesRequest, BatchDeleteTrashesResponse> batchDeleteTrashesInvoker(
        BatchDeleteTrashesRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.batchDeleteTrashes, hcClient);
    }

    /**
     * 批量还原回收站
     *
     * 批量还原回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreRepoRequest 请求对象
     * @return BatchRestoreRepoResponse
     */
    public BatchRestoreRepoResponse batchRestoreRepo(BatchRestoreRepoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.batchRestoreRepo);
    }

    /**
     * 批量还原回收站
     *
     * 批量还原回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreRepoRequest 请求对象
     * @return SyncInvoker<BatchRestoreRepoRequest, BatchRestoreRepoResponse>
     */
    public SyncInvoker<BatchRestoreRepoRequest, BatchRestoreRepoResponse> batchRestoreRepoInvoker(
        BatchRestoreRepoRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.batchRestoreRepo, hcClient);
    }

    /**
     * 创建非maven仓库
     *
     * 创建非maven仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateArtifactoryRequest 请求对象
     * @return CreateArtifactoryResponse
     */
    public CreateArtifactoryResponse createArtifactory(CreateArtifactoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.createArtifactory);
    }

    /**
     * 创建非maven仓库
     *
     * 创建非maven仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateArtifactoryRequest 请求对象
     * @return SyncInvoker<CreateArtifactoryRequest, CreateArtifactoryResponse>
     */
    public SyncInvoker<CreateArtifactoryRequest, CreateArtifactoryResponse> createArtifactoryInvoker(
        CreateArtifactoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.createArtifactory, hcClient);
    }

    /**
     * 关注组件/取消关注组件
     *
     * 关注组件/取消关注组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAttentionRequest 请求对象
     * @return CreateAttentionResponse
     */
    public CreateAttentionResponse createAttention(CreateAttentionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.createAttention);
    }

    /**
     * 关注组件/取消关注组件
     *
     * 关注组件/取消关注组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAttentionRequest 请求对象
     * @return SyncInvoker<CreateAttentionRequest, CreateAttentionResponse>
     */
    public SyncInvoker<CreateAttentionRequest, CreateAttentionResponse> createAttentionInvoker(
        CreateAttentionRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.createAttention, hcClient);
    }

    /**
     * 创建docker仓库
     *
     * 创建docker仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDockerRepositoriesRequest 请求对象
     * @return CreateDockerRepositoriesResponse
     */
    public CreateDockerRepositoriesResponse createDockerRepositories(CreateDockerRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.createDockerRepositories);
    }

    /**
     * 创建docker仓库
     *
     * 创建docker仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDockerRepositoriesRequest 请求对象
     * @return SyncInvoker<CreateDockerRepositoriesRequest, CreateDockerRepositoriesResponse>
     */
    public SyncInvoker<CreateDockerRepositoriesRequest, CreateDockerRepositoriesResponse> createDockerRepositoriesInvoker(
        CreateDockerRepositoriesRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.createDockerRepositories, hcClient);
    }

    /**
     * 创建maven仓库
     *
     * 创建maven仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMavenRepoRequest 请求对象
     * @return CreateMavenRepoResponse
     */
    public CreateMavenRepoResponse createMavenRepo(CreateMavenRepoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.createMavenRepo);
    }

    /**
     * 创建maven仓库
     *
     * 创建maven仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMavenRepoRequest 请求对象
     * @return SyncInvoker<CreateMavenRepoRequest, CreateMavenRepoResponse>
     */
    public SyncInvoker<CreateMavenRepoRequest, CreateMavenRepoResponse> createMavenRepoInvoker(
        CreateMavenRepoRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.createMavenRepo, hcClient);
    }

    /**
     * 创建项目关联仓库
     *
     * 创建项目管理关联仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectRelatedRepositoryRequest 请求对象
     * @return CreateProjectRelatedRepositoryResponse
     */
    public CreateProjectRelatedRepositoryResponse createProjectRelatedRepository(
        CreateProjectRelatedRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.createProjectRelatedRepository);
    }

    /**
     * 创建项目关联仓库
     *
     * 创建项目管理关联仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectRelatedRepositoryRequest 请求对象
     * @return SyncInvoker<CreateProjectRelatedRepositoryRequest, CreateProjectRelatedRepositoryResponse>
     */
    public SyncInvoker<CreateProjectRelatedRepositoryRequest, CreateProjectRelatedRepositoryResponse> createProjectRelatedRepositoryInvoker(
        CreateProjectRelatedRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.createProjectRelatedRepository, hcClient);
    }

    /**
     * 非maven删除文件
     *
     * 非maven删除文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteArtifactFileRequest 请求对象
     * @return DeleteArtifactFileResponse
     */
    public DeleteArtifactFileResponse deleteArtifactFile(DeleteArtifactFileRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.deleteArtifactFile);
    }

    /**
     * 非maven删除文件
     *
     * 非maven删除文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteArtifactFileRequest 请求对象
     * @return SyncInvoker<DeleteArtifactFileRequest, DeleteArtifactFileResponse>
     */
    public SyncInvoker<DeleteArtifactFileRequest, DeleteArtifactFileResponse> deleteArtifactFileInvoker(
        DeleteArtifactFileRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.deleteArtifactFile, hcClient);
    }

    /**
     * 彻底删除文件/文件夹
     *
     * 根据文件ID彻底删除文件或文件夹，删除后不能恢复，支持批量删除。可使用该接口清理不再需要的文件或文件夹以释放存储空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCompletelyUpdateFileStateRequest 请求对象
     * @return DeleteCompletelyUpdateFileStateResponse
     */
    public DeleteCompletelyUpdateFileStateResponse deleteCompletelyUpdateFileState(
        DeleteCompletelyUpdateFileStateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.deleteCompletelyUpdateFileState);
    }

    /**
     * 彻底删除文件/文件夹
     *
     * 根据文件ID彻底删除文件或文件夹，删除后不能恢复，支持批量删除。可使用该接口清理不再需要的文件或文件夹以释放存储空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCompletelyUpdateFileStateRequest 请求对象
     * @return SyncInvoker<DeleteCompletelyUpdateFileStateRequest, DeleteCompletelyUpdateFileStateResponse>
     */
    public SyncInvoker<DeleteCompletelyUpdateFileStateRequest, DeleteCompletelyUpdateFileStateResponse> deleteCompletelyUpdateFileStateInvoker(
        DeleteCompletelyUpdateFileStateRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.deleteCompletelyUpdateFileState, hcClient);
    }

    /**
     * 删除仓库到回收站
     *
     * 删除仓库到回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepositoryRequest 请求对象
     * @return DeleteRepositoryResponse
     */
    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.deleteRepository);
    }

    /**
     * 删除仓库到回收站
     *
     * 删除仓库到回收站
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepositoryRequest 请求对象
     * @return SyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse>
     */
    public SyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse> deleteRepositoryInvoker(
        DeleteRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.deleteRepository, hcClient);
    }

    /**
     * 查询仓库详情，不会去统计仓库下的制品数量
     *
     * 查询仓库详情，不会去统计仓库下的制品数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllRepositoriesRequest 请求对象
     * @return ListAllRepositoriesResponse
     */
    public ListAllRepositoriesResponse listAllRepositories(ListAllRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listAllRepositories);
    }

    /**
     * 查询仓库详情，不会去统计仓库下的制品数量
     *
     * 查询仓库详情，不会去统计仓库下的制品数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllRepositoriesRequest 请求对象
     * @return SyncInvoker<ListAllRepositoriesRequest, ListAllRepositoriesResponse>
     */
    public SyncInvoker<ListAllRepositoriesRequest, ListAllRepositoriesResponse> listAllRepositoriesInvoker(
        ListAllRepositoriesRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listAllRepositories, hcClient);
    }

    /**
     * 查询仓库文件详情
     *
     * 查询仓库文件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArtifactoryComponentRequest 请求对象
     * @return ListArtifactoryComponentResponse
     */
    public ListArtifactoryComponentResponse listArtifactoryComponent(ListArtifactoryComponentRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listArtifactoryComponent);
    }

    /**
     * 查询仓库文件详情
     *
     * 查询仓库文件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArtifactoryComponentRequest 请求对象
     * @return SyncInvoker<ListArtifactoryComponentRequest, ListArtifactoryComponentResponse>
     */
    public SyncInvoker<ListArtifactoryComponentRequest, ListArtifactoryComponentResponse> listArtifactoryComponentInvoker(
        ListArtifactoryComponentRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listArtifactoryComponent, hcClient);
    }

    /**
     * 查询存储容量趋势
     *
     * 查询存储容量趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArtifactoryStorageStatisticRequest 请求对象
     * @return ListArtifactoryStorageStatisticResponse
     */
    public ListArtifactoryStorageStatisticResponse listArtifactoryStorageStatistic(
        ListArtifactoryStorageStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listArtifactoryStorageStatistic);
    }

    /**
     * 查询存储容量趋势
     *
     * 查询存储容量趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArtifactoryStorageStatisticRequest 请求对象
     * @return SyncInvoker<ListArtifactoryStorageStatisticRequest, ListArtifactoryStorageStatisticResponse>
     */
    public SyncInvoker<ListArtifactoryStorageStatisticRequest, ListArtifactoryStorageStatisticResponse> listArtifactoryStorageStatisticInvoker(
        ListArtifactoryStorageStatisticRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listArtifactoryStorageStatistic, hcClient);
    }

    /**
     * 查询关注列表
     *
     * 查询关注列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttentionsRequest 请求对象
     * @return ListAttentionsResponse
     */
    public ListAttentionsResponse listAttentions(ListAttentionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listAttentions);
    }

    /**
     * 查询关注列表
     *
     * 查询关注列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttentionsRequest 请求对象
     * @return SyncInvoker<ListAttentionsRequest, ListAttentionsResponse>
     */
    public SyncInvoker<ListAttentionsRequest, ListAttentionsResponse> listAttentionsInvoker(
        ListAttentionsRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listAttentions, hcClient);
    }

    /**
     * 查询租户容量消息通知设置信息
     *
     * 查询租户容量消息通知设置，包含容量阈值和是否启用邮件通知等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCapacityMessageSettingRequest 请求对象
     * @return ListCapacityMessageSettingResponse
     */
    public ListCapacityMessageSettingResponse listCapacityMessageSetting(ListCapacityMessageSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listCapacityMessageSetting);
    }

    /**
     * 查询租户容量消息通知设置信息
     *
     * 查询租户容量消息通知设置，包含容量阈值和是否启用邮件通知等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCapacityMessageSettingRequest 请求对象
     * @return SyncInvoker<ListCapacityMessageSettingRequest, ListCapacityMessageSettingResponse>
     */
    public SyncInvoker<ListCapacityMessageSettingRequest, ListCapacityMessageSettingResponse> listCapacityMessageSettingInvoker(
        ListCapacityMessageSettingRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listCapacityMessageSetting, hcClient);
    }

    /**
     * 获取聚合仓下的仓库代理列表
     *
     * 根据仓库ID获取指定聚合仓的仓库代理列表，包含仓库状态、类型、地址和访问路径白名单等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChildProxyRepositoriesListRequest 请求对象
     * @return ListChildProxyRepositoriesListResponse
     */
    public ListChildProxyRepositoriesListResponse listChildProxyRepositoriesList(
        ListChildProxyRepositoriesListRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listChildProxyRepositoriesList);
    }

    /**
     * 获取聚合仓下的仓库代理列表
     *
     * 根据仓库ID获取指定聚合仓的仓库代理列表，包含仓库状态、类型、地址和访问路径白名单等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChildProxyRepositoriesListRequest 请求对象
     * @return SyncInvoker<ListChildProxyRepositoriesListRequest, ListChildProxyRepositoriesListResponse>
     */
    public SyncInvoker<ListChildProxyRepositoriesListRequest, ListChildProxyRepositoriesListResponse> listChildProxyRepositoriesListInvoker(
        ListChildProxyRepositoriesListRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listChildProxyRepositoriesList, hcClient);
    }

    /**
     * 查询租户级IP白名单
     *
     * 查询租户级IP白名单列表。在IP白名单的IP才能访问制品仓库，未配置IP白名单时，默认所有IP都可访问。该功能可用于保障制品仓库的安全，对访问IP进行严格控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainIpConfigRequest 请求对象
     * @return ListDomainIpConfigResponse
     */
    public ListDomainIpConfigResponse listDomainIpConfig(ListDomainIpConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listDomainIpConfig);
    }

    /**
     * 查询租户级IP白名单
     *
     * 查询租户级IP白名单列表。在IP白名单的IP才能访问制品仓库，未配置IP白名单时，默认所有IP都可访问。该功能可用于保障制品仓库的安全，对访问IP进行严格控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainIpConfigRequest 请求对象
     * @return SyncInvoker<ListDomainIpConfigRequest, ListDomainIpConfigResponse>
     */
    public SyncInvoker<ListDomainIpConfigRequest, ListDomainIpConfigResponse> listDomainIpConfigInvoker(
        ListDomainIpConfigRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listDomainIpConfig, hcClient);
    }

    /**
     * 分页查询构建归档包列表
     *
     * 当归档包数量庞大时，分页查询构建归档包列表，包含文件名、文件大小、下载地址、MD5校验和、构建地址、构建代码分支等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileBuildArchivesRequest 请求对象
     * @return ListFileBuildArchivesResponse
     */
    public ListFileBuildArchivesResponse listFileBuildArchives(ListFileBuildArchivesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listFileBuildArchives);
    }

    /**
     * 分页查询构建归档包列表
     *
     * 当归档包数量庞大时，分页查询构建归档包列表，包含文件名、文件大小、下载地址、MD5校验和、构建地址、构建代码分支等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileBuildArchivesRequest 请求对象
     * @return SyncInvoker<ListFileBuildArchivesRequest, ListFileBuildArchivesResponse>
     */
    public SyncInvoker<ListFileBuildArchivesRequest, ListFileBuildArchivesResponse> listFileBuildArchivesInvoker(
        ListFileBuildArchivesRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listFileBuildArchives, hcClient);
    }

    /**
     * 查询文件/项目列表
     *
     * 当项目或文件数量庞大时，分页查询项目或文件列表。可根据文件名、文件状态和文件的发布状态等参数进行过滤，从而快速找到所需文件，包含文件名、文件大小和下载地址等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesRequest 请求对象
     * @return ListFilesResponse
     */
    public ListFilesResponse listFiles(ListFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listFiles);
    }

    /**
     * 查询文件/项目列表
     *
     * 当项目或文件数量庞大时，分页查询项目或文件列表。可根据文件名、文件状态和文件的发布状态等参数进行过滤，从而快速找到所需文件，包含文件名、文件大小和下载地址等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesRequest 请求对象
     * @return SyncInvoker<ListFilesRequest, ListFilesResponse>
     */
    public SyncInvoker<ListFilesRequest, ListFilesResponse> listFilesInvoker(ListFilesRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listFiles, hcClient);
    }

    /**
     * 查询项目下所有文件的最新版本
     *
     * 当项目文件数量庞大时，通过该接口可以分页查询项目下所有文件的最新版本，包含文件名、文件大小、文件状态和发布状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestVersionFilesRequest 请求对象
     * @return ListLatestVersionFilesResponse
     */
    public ListLatestVersionFilesResponse listLatestVersionFiles(ListLatestVersionFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listLatestVersionFiles);
    }

    /**
     * 查询项目下所有文件的最新版本
     *
     * 当项目文件数量庞大时，通过该接口可以分页查询项目下所有文件的最新版本，包含文件名、文件大小、文件状态和发布状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestVersionFilesRequest 请求对象
     * @return SyncInvoker<ListLatestVersionFilesRequest, ListLatestVersionFilesResponse>
     */
    public SyncInvoker<ListLatestVersionFilesRequest, ListLatestVersionFilesResponse> listLatestVersionFilesInvoker(
        ListLatestVersionFilesRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listLatestVersionFiles, hcClient);
    }

    /**
     * 查询Maven仓库列表
     *
     * 查询Maven仓库列表，包含仓库状态、类型、地址和访问路径白名单等信息。支持根据项目ID和仓库ID等参数进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMavenListRequest 请求对象
     * @return ListMavenListResponse
     */
    public ListMavenListResponse listMavenList(ListMavenListRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listMavenList);
    }

    /**
     * 查询Maven仓库列表
     *
     * 查询Maven仓库列表，包含仓库状态、类型、地址和访问路径白名单等信息。支持根据项目ID和仓库ID等参数进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMavenListRequest 请求对象
     * @return SyncInvoker<ListMavenListRequest, ListMavenListResponse>
     */
    public SyncInvoker<ListMavenListRequest, ListMavenListResponse> listMavenListInvoker(ListMavenListRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listMavenList, hcClient);
    }

    /**
     * 查询私有库用户列表
     *
     * 分页查询私有库用户列表，包含用户名和用户是否启用等信息。可根据用户名进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMavenUserRequest 请求对象
     * @return ListMavenUserResponse
     */
    public ListMavenUserResponse listMavenUser(ListMavenUserRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listMavenUser);
    }

    /**
     * 查询私有库用户列表
     *
     * 分页查询私有库用户列表，包含用户名和用户是否启用等信息。可根据用户名进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMavenUserRequest 请求对象
     * @return SyncInvoker<ListMavenUserRequest, ListMavenUserResponse>
     */
    public SyncInvoker<ListMavenUserRequest, ListMavenUserResponse> listMavenUserInvoker(ListMavenUserRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listMavenUser, hcClient);
    }

    /**
     * 查询网络代理列表
     *
     * 查询网络代理列表，返回代理源的访问地址及认证信息等，用于代理外部公开的制品资源。通过网络代理，开发人员可以安全、高效地访问所需的外部资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetProxyRequest 请求对象
     * @return ListNetProxyResponse
     */
    public ListNetProxyResponse listNetProxy(ListNetProxyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listNetProxy);
    }

    /**
     * 查询网络代理列表
     *
     * 查询网络代理列表，返回代理源的访问地址及认证信息等，用于代理外部公开的制品资源。通过网络代理，开发人员可以安全、高效地访问所需的外部资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetProxyRequest 请求对象
     * @return SyncInvoker<ListNetProxyRequest, ListNetProxyResponse>
     */
    public SyncInvoker<ListNetProxyRequest, ListNetProxyResponse> listNetProxyInvoker(ListNetProxyRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listNetProxy, hcClient);
    }

    /**
     * 查看项目的角色权限设置
     *
     * 查看项目的角色权限设置，包含上传下载、创建文件夹、清空或者还原回收站和更改软件包状态等设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectRolePermissionsRequest 请求对象
     * @return ListProjectRolePermissionsResponse
     */
    public ListProjectRolePermissionsResponse listProjectRolePermissions(ListProjectRolePermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listProjectRolePermissions);
    }

    /**
     * 查看项目的角色权限设置
     *
     * 查看项目的角色权限设置，包含上传下载、创建文件夹、清空或者还原回收站和更改软件包状态等设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectRolePermissionsRequest 请求对象
     * @return SyncInvoker<ListProjectRolePermissionsRequest, ListProjectRolePermissionsResponse>
     */
    public SyncInvoker<ListProjectRolePermissionsRequest, ListProjectRolePermissionsResponse> listProjectRolePermissionsInvoker(
        ListProjectRolePermissionsRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listProjectRolePermissions, hcClient);
    }

    /**
     * 查询项目下的用户
     *
     * 当项目中的用户数量较多时，分页查询指定项目下的用户列表，包含用户名和角色等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectUsersRequest 请求对象
     * @return ListProjectUsersResponse
     */
    public ListProjectUsersResponse listProjectUsers(ListProjectUsersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listProjectUsers);
    }

    /**
     * 查询项目下的用户
     *
     * 当项目中的用户数量较多时，分页查询指定项目下的用户列表，包含用户名和角色等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectUsersRequest 请求对象
     * @return SyncInvoker<ListProjectUsersRequest, ListProjectUsersResponse>
     */
    public SyncInvoker<ListProjectUsersRequest, ListProjectUsersResponse> listProjectUsersInvoker(
        ListProjectUsersRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listProjectUsers, hcClient);
    }

    /**
     * 查询制品安全扫描任务列表
     *
     * 分页查询制品安全扫描任务列表，包含扫描制品数量、漏洞数量、病毒文件数量和恶意代码文件数量等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecGuardListRequest 请求对象
     * @return ListSecGuardListResponse
     */
    public ListSecGuardListResponse listSecGuardList(ListSecGuardListRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.listSecGuardList);
    }

    /**
     * 查询制品安全扫描任务列表
     *
     * 分页查询制品安全扫描任务列表，包含扫描制品数量、漏洞数量、病毒文件数量和恶意代码文件数量等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecGuardListRequest 请求对象
     * @return SyncInvoker<ListSecGuardListRequest, ListSecGuardListResponse>
     */
    public SyncInvoker<ListSecGuardListRequest, ListSecGuardListResponse> listSecGuardListInvoker(
        ListSecGuardListRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.listSecGuardList, hcClient);
    }

    /**
     * 编辑仓库
     *
     * 编辑仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyRepositoryRequest 请求对象
     * @return ModifyRepositoryResponse
     */
    public ModifyRepositoryResponse modifyRepository(ModifyRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.modifyRepository);
    }

    /**
     * 编辑仓库
     *
     * 编辑仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyRepositoryRequest 请求对象
     * @return SyncInvoker<ModifyRepositoryRequest, ModifyRepositoryResponse>
     */
    public SyncInvoker<ModifyRepositoryRequest, ModifyRepositoryResponse> modifyRepositoryInvoker(
        ModifyRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.modifyRepository, hcClient);
    }

    /**
     * 重置用户密码
     *
     * 重置用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetUserPasswordRequest 请求对象
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPassword(ResetUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.resetUserPassword);
    }

    /**
     * 重置用户密码
     *
     * 重置用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetUserPasswordRequest 请求对象
     * @return SyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse>
     */
    public SyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse> resetUserPasswordInvoker(
        ResetUserPasswordRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.resetUserPassword, hcClient);
    }

    /**
     * 统筹搜索
     *
     * 统筹搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchArtifactsRequest 请求对象
     * @return SearchArtifactsResponse
     */
    public SearchArtifactsResponse searchArtifacts(SearchArtifactsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.searchArtifacts);
    }

    /**
     * 统筹搜索
     *
     * 统筹搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchArtifactsRequest 请求对象
     * @return SyncInvoker<SearchArtifactsRequest, SearchArtifactsResponse>
     */
    public SyncInvoker<SearchArtifactsRequest, SearchArtifactsResponse> searchArtifactsInvoker(
        SearchArtifactsRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.searchArtifacts, hcClient);
    }

    /**
     * 通过checksum搜索文件
     *
     * 通过checksum搜索文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchByChecksumRequest 请求对象
     * @return SearchByChecksumResponse
     */
    public SearchByChecksumResponse searchByChecksum(SearchByChecksumRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.searchByChecksum);
    }

    /**
     * 通过checksum搜索文件
     *
     * 通过checksum搜索文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchByChecksumRequest 请求对象
     * @return SyncInvoker<SearchByChecksumRequest, SearchByChecksumResponse>
     */
    public SyncInvoker<SearchByChecksumRequest, SearchByChecksumResponse> searchByChecksumInvoker(
        SearchByChecksumRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.searchByChecksum, hcClient);
    }

    /**
     * 查询仓库或文件的审计日志信息
     *
     * 查询仓库或文件的审计日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRequest 请求对象
     * @return ShowAuditResponse
     */
    public ShowAuditResponse showAudit(ShowAuditRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showAudit);
    }

    /**
     * 查询仓库或文件的审计日志信息
     *
     * 查询仓库或文件的审计日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRequest 请求对象
     * @return SyncInvoker<ShowAuditRequest, ShowAuditResponse>
     */
    public SyncInvoker<ShowAuditRequest, ShowAuditResponse> showAuditInvoker(ShowAuditRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showAudit, hcClient);
    }

    /**
     * 查询项目自动删除任务设置
     *
     * 查询项目自动删除任务设置，包含文件的过期自动删除时间及删除规则。自动删除任务可以自动执行文件清理任务，减少管理员的工作负担，确保存储资源的有效利用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoDeleteJobSettingsRequest 请求对象
     * @return ShowAutoDeleteJobSettingsResponse
     */
    public ShowAutoDeleteJobSettingsResponse showAutoDeleteJobSettings(ShowAutoDeleteJobSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showAutoDeleteJobSettings);
    }

    /**
     * 查询项目自动删除任务设置
     *
     * 查询项目自动删除任务设置，包含文件的过期自动删除时间及删除规则。自动删除任务可以自动执行文件清理任务，减少管理员的工作负担，确保存储资源的有效利用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoDeleteJobSettingsRequest 请求对象
     * @return SyncInvoker<ShowAutoDeleteJobSettingsRequest, ShowAutoDeleteJobSettingsResponse>
     */
    public SyncInvoker<ShowAutoDeleteJobSettingsRequest, ShowAutoDeleteJobSettingsResponse> showAutoDeleteJobSettingsInvoker(
        ShowAutoDeleteJobSettingsRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showAutoDeleteJobSettings, hcClient);
    }

    /**
     * 查询租户发布库存储容量
     *
     * 查询租户发布库存储容量，包含已使用存储容量、最大存储容量、套餐类型和仓库数量等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainReleaseRepoStorageRequest 请求对象
     * @return ShowDomainReleaseRepoStorageResponse
     */
    public ShowDomainReleaseRepoStorageResponse showDomainReleaseRepoStorage(
        ShowDomainReleaseRepoStorageRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showDomainReleaseRepoStorage);
    }

    /**
     * 查询租户发布库存储容量
     *
     * 查询租户发布库存储容量，包含已使用存储容量、最大存储容量、套餐类型和仓库数量等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainReleaseRepoStorageRequest 请求对象
     * @return SyncInvoker<ShowDomainReleaseRepoStorageRequest, ShowDomainReleaseRepoStorageResponse>
     */
    public SyncInvoker<ShowDomainReleaseRepoStorageRequest, ShowDomainReleaseRepoStorageResponse> showDomainReleaseRepoStorageInvoker(
        ShowDomainReleaseRepoStorageRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showDomainReleaseRepoStorage, hcClient);
    }

    /**
     * 根据文件ID查询文件详情
     *
     * 在日常数据管理工作中，根据文件ID查询指定文件详情，包含文件名、文件大小、下载地址、校验和、文件状态和发布状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileDetailRequest 请求对象
     * @return ShowFileDetailResponse
     */
    public ShowFileDetailResponse showFileDetail(ShowFileDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showFileDetail);
    }

    /**
     * 根据文件ID查询文件详情
     *
     * 在日常数据管理工作中，根据文件ID查询指定文件详情，包含文件名、文件大小、下载地址、校验和、文件状态和发布状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileDetailRequest 请求对象
     * @return SyncInvoker<ShowFileDetailRequest, ShowFileDetailResponse>
     */
    public SyncInvoker<ShowFileDetailRequest, ShowFileDetailResponse> showFileDetailInvoker(
        ShowFileDetailRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showFileDetail, hcClient);
    }

    /**
     * 根据文件完整路径查询文件详情
     *
     * 在日常数据管理工作中，根据文件完整路径查询指定文件详情，包含文件名、文件大小、下载地址、校验和、文件状态和发布状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileDetailByFullNameRequest 请求对象
     * @return ShowFileDetailByFullNameResponse
     */
    public ShowFileDetailByFullNameResponse showFileDetailByFullName(ShowFileDetailByFullNameRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showFileDetailByFullName);
    }

    /**
     * 根据文件完整路径查询文件详情
     *
     * 在日常数据管理工作中，根据文件完整路径查询指定文件详情，包含文件名、文件大小、下载地址、校验和、文件状态和发布状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileDetailByFullNameRequest 请求对象
     * @return SyncInvoker<ShowFileDetailByFullNameRequest, ShowFileDetailByFullNameResponse>
     */
    public SyncInvoker<ShowFileDetailByFullNameRequest, ShowFileDetailByFullNameResponse> showFileDetailByFullNameInvoker(
        ShowFileDetailByFullNameRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showFileDetailByFullName, hcClient);
    }

    /**
     * 查询仓库文件夹目录
     *
     * 查询仓库文件夹目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileTreeRequest 请求对象
     * @return ShowFileTreeResponse
     */
    public ShowFileTreeResponse showFileTree(ShowFileTreeRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showFileTree);
    }

    /**
     * 查询仓库文件夹目录
     *
     * 查询仓库文件夹目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileTreeRequest 请求对象
     * @return SyncInvoker<ShowFileTreeRequest, ShowFileTreeResponse>
     */
    public SyncInvoker<ShowFileTreeRequest, ShowFileTreeResponse> showFileTreeInvoker(ShowFileTreeRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showFileTree, hcClient);
    }

    /**
     * 查询项目下所有文件的数量
     *
     * 查询项目下所有文件的数量，该接口会识别所有文件的最新版本，从而提供准确的文件数量统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestVersionFilesCountRequest 请求对象
     * @return ShowLatestVersionFilesCountResponse
     */
    public ShowLatestVersionFilesCountResponse showLatestVersionFilesCount(ShowLatestVersionFilesCountRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showLatestVersionFilesCount);
    }

    /**
     * 查询项目下所有文件的数量
     *
     * 查询项目下所有文件的数量，该接口会识别所有文件的最新版本，从而提供准确的文件数量统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestVersionFilesCountRequest 请求对象
     * @return SyncInvoker<ShowLatestVersionFilesCountRequest, ShowLatestVersionFilesCountResponse>
     */
    public SyncInvoker<ShowLatestVersionFilesCountRequest, ShowLatestVersionFilesCountResponse> showLatestVersionFilesCountInvoker(
        ShowLatestVersionFilesCountRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showLatestVersionFilesCount, hcClient);
    }

    /**
     * 查询租户Maven仓库列表和账号密码
     *
     * 查询租户Maven仓库列表和账号密码，支持跨租户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMavenInfoRequest 请求对象
     * @return ShowMavenInfoResponse
     */
    public ShowMavenInfoResponse showMavenInfo(ShowMavenInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showMavenInfo);
    }

    /**
     * 查询租户Maven仓库列表和账号密码
     *
     * 查询租户Maven仓库列表和账号密码，支持跨租户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMavenInfoRequest 请求对象
     * @return SyncInvoker<ShowMavenInfoRequest, ShowMavenInfoResponse>
     */
    public SyncInvoker<ShowMavenInfoRequest, ShowMavenInfoResponse> showMavenInfoInvoker(ShowMavenInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showMavenInfo, hcClient);
    }

    /**
     * 查询多角色用户权限
     *
     * 查询多角色用户权限，包含上传下载、创建文件夹、清空或者还原回收站和更改软件包状态等权限信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiRolesUserPermissionsRequest 请求对象
     * @return ShowMultiRolesUserPermissionsResponse
     */
    public ShowMultiRolesUserPermissionsResponse showMultiRolesUserPermissions(
        ShowMultiRolesUserPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showMultiRolesUserPermissions);
    }

    /**
     * 查询多角色用户权限
     *
     * 查询多角色用户权限，包含上传下载、创建文件夹、清空或者还原回收站和更改软件包状态等权限信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiRolesUserPermissionsRequest 请求对象
     * @return SyncInvoker<ShowMultiRolesUserPermissionsRequest, ShowMultiRolesUserPermissionsResponse>
     */
    public SyncInvoker<ShowMultiRolesUserPermissionsRequest, ShowMultiRolesUserPermissionsResponse> showMultiRolesUserPermissionsInvoker(
        ShowMultiRolesUserPermissionsRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showMultiRolesUserPermissions, hcClient);
    }

    /**
     * 查询中心仓是否启用
     *
     * 查询中心仓是否启用，用于确定当前局点是否具备中心仓功能，从而确保业务流程的顺利进行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpenSourceEnabledRequest 请求对象
     * @return ShowOpenSourceEnabledResponse
     */
    public ShowOpenSourceEnabledResponse showOpenSourceEnabled(ShowOpenSourceEnabledRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showOpenSourceEnabled);
    }

    /**
     * 查询中心仓是否启用
     *
     * 查询中心仓是否启用，用于确定当前局点是否具备中心仓功能，从而确保业务流程的顺利进行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpenSourceEnabledRequest 请求对象
     * @return SyncInvoker<ShowOpenSourceEnabledRequest, ShowOpenSourceEnabledResponse>
     */
    public SyncInvoker<ShowOpenSourceEnabledRequest, ShowOpenSourceEnabledResponse> showOpenSourceEnabledInvoker(
        ShowOpenSourceEnabledRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showOpenSourceEnabled, hcClient);
    }

    /**
     * 获取当前用户的套餐信息
     *
     * 获取当前用户的套餐信息，包含总存储容量和已使用存储容量等信息，以便合理规划资源使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPackageDataDetailRequest 请求对象
     * @return ShowPackageDataDetailResponse
     */
    public ShowPackageDataDetailResponse showPackageDataDetail(ShowPackageDataDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showPackageDataDetail);
    }

    /**
     * 获取当前用户的套餐信息
     *
     * 获取当前用户的套餐信息，包含总存储容量和已使用存储容量等信息，以便合理规划资源使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPackageDataDetailRequest 请求对象
     * @return SyncInvoker<ShowPackageDataDetailRequest, ShowPackageDataDetailResponse>
     */
    public SyncInvoker<ShowPackageDataDetailRequest, ShowPackageDataDetailResponse> showPackageDataDetailInvoker(
        ShowPackageDataDetailRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showPackageDataDetail, hcClient);
    }

    /**
     * 获取当前用户的套餐状态
     *
     * 获取当前用户的套餐状态，包含套餐扩展包的容量和流量规格，如资源类型、套餐状态、剩余天数等信息，帮助用户高效管理云资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPackageInfoRequest 请求对象
     * @return ShowPackageInfoResponse
     */
    public ShowPackageInfoResponse showPackageInfo(ShowPackageInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showPackageInfo);
    }

    /**
     * 获取当前用户的套餐状态
     *
     * 获取当前用户的套餐状态，包含套餐扩展包的容量和流量规格，如资源类型、套餐状态、剩余天数等信息，帮助用户高效管理云资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPackageInfoRequest 请求对象
     * @return SyncInvoker<ShowPackageInfoRequest, ShowPackageInfoResponse>
     */
    public SyncInvoker<ShowPackageInfoRequest, ShowPackageInfoResponse> showPackageInfoInvoker(
        ShowPackageInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showPackageInfo, hcClient);
    }

    /**
     * 查询项目管理关联仓库
     *
     * 查询项目管理关联仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectListRequest 请求对象
     * @return ShowProjectListResponse
     */
    public ShowProjectListResponse showProjectList(ShowProjectListRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showProjectList);
    }

    /**
     * 查询项目管理关联仓库
     *
     * 查询项目管理关联仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectListRequest 请求对象
     * @return SyncInvoker<ShowProjectListRequest, ShowProjectListResponse>
     */
    public SyncInvoker<ShowProjectListRequest, ShowProjectListResponse> showProjectListInvoker(
        ShowProjectListRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showProjectList, hcClient);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectReleaseFilesRequest 请求对象
     * @return ShowProjectReleaseFilesResponse
     */
    public ShowProjectReleaseFilesResponse showProjectReleaseFiles(ShowProjectReleaseFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showProjectReleaseFiles);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectReleaseFilesRequest 请求对象
     * @return SyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse>
     */
    public SyncInvoker<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> showProjectReleaseFilesInvoker(
        ShowProjectReleaseFilesRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showProjectReleaseFiles, hcClient);
    }

    /**
     * 查询项目下的制品存储容量信息
     *
     * 查询项目下的制品存储容量，包含已使用存储容量和文件数量等信息。在项目管理中，可以使用该接口监控项目下的制品存储情况，以确保资源的有效利用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectStorageInfoRequest 请求对象
     * @return ShowProjectStorageInfoResponse
     */
    public ShowProjectStorageInfoResponse showProjectStorageInfo(ShowProjectStorageInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showProjectStorageInfo);
    }

    /**
     * 查询项目下的制品存储容量信息
     *
     * 查询项目下的制品存储容量，包含已使用存储容量和文件数量等信息。在项目管理中，可以使用该接口监控项目下的制品存储情况，以确保资源的有效利用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectStorageInfoRequest 请求对象
     * @return SyncInvoker<ShowProjectStorageInfoRequest, ShowProjectStorageInfoResponse>
     */
    public SyncInvoker<ShowProjectStorageInfoRequest, ShowProjectStorageInfoResponse> showProjectStorageInfoInvoker(
        ShowProjectStorageInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showProjectStorageInfo, hcClient);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReleaseProjectFilesRequest 请求对象
     * @return ShowReleaseProjectFilesResponse
     */
    @Deprecated
    public ShowReleaseProjectFilesResponse showReleaseProjectFiles(ShowReleaseProjectFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showReleaseProjectFiles);
    }

    /**
     * 获取项目下文件版本信息列表
     *
     * 获取项目下文件版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReleaseProjectFilesRequest 请求对象
     * @return SyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse>
     */
    @Deprecated
    public SyncInvoker<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> showReleaseProjectFilesInvoker(
        ShowReleaseProjectFilesRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showReleaseProjectFiles, hcClient);
    }

    /**
     * 查询租户私有依赖库的账号密码
     *
     * 在自动化构建场景，用户可调用该接口查询租户私有依赖库的账号密码，以便进行后续的上传下载操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepoUserInfoRequest 请求对象
     * @return ShowRepoUserInfoResponse
     */
    public ShowRepoUserInfoResponse showRepoUserInfo(ShowRepoUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showRepoUserInfo);
    }

    /**
     * 查询租户私有依赖库的账号密码
     *
     * 在自动化构建场景，用户可调用该接口查询租户私有依赖库的账号密码，以便进行后续的上传下载操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepoUserInfoRequest 请求对象
     * @return SyncInvoker<ShowRepoUserInfoRequest, ShowRepoUserInfoResponse>
     */
    public SyncInvoker<ShowRepoUserInfoRequest, ShowRepoUserInfoResponse> showRepoUserInfoInvoker(
        ShowRepoUserInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showRepoUserInfo, hcClient);
    }

    /**
     * 查询单个仓库详细信息，会去统计仓库下的制品数量
     *
     * 查询单个仓库详细信息，会去统计仓库下的制品数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
     * @return ShowRepositoryResponse
     */
    public ShowRepositoryResponse showRepository(ShowRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showRepository);
    }

    /**
     * 查询单个仓库详细信息，会去统计仓库下的制品数量
     *
     * 查询单个仓库详细信息，会去统计仓库下的制品数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
     * @return SyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse>
     */
    public SyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse> showRepositoryInvoker(
        ShowRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showRepository, hcClient);
    }

    /**
     * 查看仓库信息
     *
     * 查看仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryInfoRequest 请求对象
     * @return ShowRepositoryInfoResponse
     */
    public ShowRepositoryInfoResponse showRepositoryInfo(ShowRepositoryInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showRepositoryInfo);
    }

    /**
     * 查看仓库信息
     *
     * 查看仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryInfoRequest 请求对象
     * @return SyncInvoker<ShowRepositoryInfoRequest, ShowRepositoryInfoResponse>
     */
    public SyncInvoker<ShowRepositoryInfoRequest, ShowRepositoryInfoResponse> showRepositoryInfoInvoker(
        ShowRepositoryInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showRepositoryInfo, hcClient);
    }

    /**
     * 仓库用量查询
     *
     * 仓库用量查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStorageRequest 请求对象
     * @return ShowStorageResponse
     */
    public ShowStorageResponse showStorage(ShowStorageRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showStorage);
    }

    /**
     * 仓库用量查询
     *
     * 仓库用量查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStorageRequest 请求对象
     * @return SyncInvoker<ShowStorageRequest, ShowStorageResponse>
     */
    public SyncInvoker<ShowStorageRequest, ShowStorageResponse> showStorageInvoker(ShowStorageRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showStorage, hcClient);
    }

    /**
     * 查询用户在项目下的权限
     *
     * 查询用户在项目下的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserPrivilegesRequest 请求对象
     * @return ShowUserPrivilegesResponse
     */
    public ShowUserPrivilegesResponse showUserPrivileges(ShowUserPrivilegesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showUserPrivileges);
    }

    /**
     * 查询用户在项目下的权限
     *
     * 查询用户在项目下的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserPrivilegesRequest 请求对象
     * @return SyncInvoker<ShowUserPrivilegesRequest, ShowUserPrivilegesResponse>
     */
    public SyncInvoker<ShowUserPrivilegesRequest, ShowUserPrivilegesResponse> showUserPrivilegesInvoker(
        ShowUserPrivilegesRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showUserPrivileges, hcClient);
    }

    /**
     * 查询用户凭证
     *
     * 查询用户凭证，该凭证为IDC用户下载制品时使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserTicketRequest 请求对象
     * @return ShowUserTicketResponse
     */
    public ShowUserTicketResponse showUserTicket(ShowUserTicketRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.showUserTicket);
    }

    /**
     * 查询用户凭证
     *
     * 查询用户凭证，该凭证为IDC用户下载制品时使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserTicketRequest 请求对象
     * @return SyncInvoker<ShowUserTicketRequest, ShowUserTicketResponse>
     */
    public SyncInvoker<ShowUserTicketRequest, ShowUserTicketResponse> showUserTicketInvoker(
        ShowUserTicketRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.showUserTicket, hcClient);
    }

    /**
     * 编辑非maven仓库信息
     *
     * 编辑非maven仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateArtifactoryRequest 请求对象
     * @return UpdateArtifactoryResponse
     */
    public UpdateArtifactoryResponse updateArtifactory(UpdateArtifactoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsArtifactMeta.updateArtifactory);
    }

    /**
     * 编辑非maven仓库信息
     *
     * 编辑非maven仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateArtifactoryRequest 请求对象
     * @return SyncInvoker<UpdateArtifactoryRequest, UpdateArtifactoryResponse>
     */
    public SyncInvoker<UpdateArtifactoryRequest, UpdateArtifactoryResponse> updateArtifactoryInvoker(
        UpdateArtifactoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsArtifactMeta.updateArtifactory, hcClient);
    }

}
