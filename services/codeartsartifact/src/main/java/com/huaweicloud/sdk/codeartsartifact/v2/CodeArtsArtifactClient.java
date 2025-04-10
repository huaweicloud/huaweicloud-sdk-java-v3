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
