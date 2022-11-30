package com.huaweicloud.sdk.res.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.res.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class ResAsyncClient {

    protected HcClient hcClient;

    public ResAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ResAsyncClient> newBuilder() {
        return new ClientBuilder<>(ResAsyncClient::new);
    }

    /**
     * 创建数据源
     *
     * 在指定的工作空间下面创建一个新的数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResDatasourceRequest 请求对象
     * @return CompletableFuture<CreateResDatasourceResponse>
     */
    public CompletableFuture<CreateResDatasourceResponse> createResDatasourceAsync(CreateResDatasourceRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.createResDatasource);
    }

    /**
     * 创建数据源
     *
     * 在指定的工作空间下面创建一个新的数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResDatasourceRequest 请求对象
     * @return AsyncInvoker<CreateResDatasourceRequest, CreateResDatasourceResponse>
     */
    public AsyncInvoker<CreateResDatasourceRequest, CreateResDatasourceResponse> createResDatasourceAsyncInvoker(
        CreateResDatasourceRequest request) {
        return new AsyncInvoker<CreateResDatasourceRequest, CreateResDatasourceResponse>(request,
            ResMeta.createResDatasource, hcClient);
    }

    /**
     * 创建智能场景
     *
     * 在指定工作空间下面创建智能场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResIntelligentSceneRequest 请求对象
     * @return CompletableFuture<CreateResIntelligentSceneResponse>
     */
    public CompletableFuture<CreateResIntelligentSceneResponse> createResIntelligentSceneAsync(
        CreateResIntelligentSceneRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.createResIntelligentScene);
    }

    /**
     * 创建智能场景
     *
     * 在指定工作空间下面创建智能场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResIntelligentSceneRequest 请求对象
     * @return AsyncInvoker<CreateResIntelligentSceneRequest, CreateResIntelligentSceneResponse>
     */
    public AsyncInvoker<CreateResIntelligentSceneRequest, CreateResIntelligentSceneResponse> createResIntelligentSceneAsyncInvoker(
        CreateResIntelligentSceneRequest request) {
        return new AsyncInvoker<CreateResIntelligentSceneRequest, CreateResIntelligentSceneResponse>(request,
            ResMeta.createResIntelligentScene, hcClient);
    }

    /**
     * 新建训练作业
     *
     * 新建训练作业元数据，新建成功之后可手动执行此任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResJobRequest 请求对象
     * @return CompletableFuture<CreateResJobResponse>
     */
    public CompletableFuture<CreateResJobResponse> createResJobAsync(CreateResJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.createResJob);
    }

    /**
     * 新建训练作业
     *
     * 新建训练作业元数据，新建成功之后可手动执行此任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResJobRequest 请求对象
     * @return AsyncInvoker<CreateResJobRequest, CreateResJobResponse>
     */
    public AsyncInvoker<CreateResJobRequest, CreateResJobResponse> createResJobAsyncInvoker(
        CreateResJobRequest request) {
        return new AsyncInvoker<CreateResJobRequest, CreateResJobResponse>(request, ResMeta.createResJob, hcClient);
    }

    /**
     * 新建多个训练作业
     *
     * 批量新建作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResJobsRequest 请求对象
     * @return CompletableFuture<CreateResJobsResponse>
     */
    public CompletableFuture<CreateResJobsResponse> createResJobsAsync(CreateResJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.createResJobs);
    }

    /**
     * 新建多个训练作业
     *
     * 批量新建作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResJobsRequest 请求对象
     * @return AsyncInvoker<CreateResJobsRequest, CreateResJobsResponse>
     */
    public AsyncInvoker<CreateResJobsRequest, CreateResJobsResponse> createResJobsAsyncInvoker(
        CreateResJobsRequest request) {
        return new AsyncInvoker<CreateResJobsRequest, CreateResJobsResponse>(request, ResMeta.createResJobs, hcClient);
    }

    /**
     * 新建在线服务
     *
     * 新建在线服务元数据，新建成功之后可手动发布此服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResOnlineInstanceRequest 请求对象
     * @return CompletableFuture<CreateResOnlineInstanceResponse>
     */
    public CompletableFuture<CreateResOnlineInstanceResponse> createResOnlineInstanceAsync(
        CreateResOnlineInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.createResOnlineInstance);
    }

    /**
     * 新建在线服务
     *
     * 新建在线服务元数据，新建成功之后可手动发布此服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResOnlineInstanceRequest 请求对象
     * @return AsyncInvoker<CreateResOnlineInstanceRequest, CreateResOnlineInstanceResponse>
     */
    public AsyncInvoker<CreateResOnlineInstanceRequest, CreateResOnlineInstanceResponse> createResOnlineInstanceAsyncInvoker(
        CreateResOnlineInstanceRequest request) {
        return new AsyncInvoker<CreateResOnlineInstanceRequest, CreateResOnlineInstanceResponse>(request,
            ResMeta.createResOnlineInstance, hcClient);
    }

    /**
     * 创建自定义场景
     *
     * 在指定工作空间下面创建自定义场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResSceneRequest 请求对象
     * @return CompletableFuture<CreateResSceneResponse>
     */
    public CompletableFuture<CreateResSceneResponse> createResSceneAsync(CreateResSceneRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.createResScene);
    }

    /**
     * 创建自定义场景
     *
     * 在指定工作空间下面创建自定义场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResSceneRequest 请求对象
     * @return AsyncInvoker<CreateResSceneRequest, CreateResSceneResponse>
     */
    public AsyncInvoker<CreateResSceneRequest, CreateResSceneResponse> createResSceneAsyncInvoker(
        CreateResSceneRequest request) {
        return new AsyncInvoker<CreateResSceneRequest, CreateResSceneResponse>(request, ResMeta.createResScene,
            hcClient);
    }

    /**
     * 创建工作空间
     *
     * 用于在推荐系统下面创建独立的工作空间，用于资源的隔离，用户可以在工作空间下面继续创建数据源、场景以及推荐任务等。是否有工作空间的操作权限取决于用户是否属于当前工作空间绑定的企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResWorkspaceRequest 请求对象
     * @return CompletableFuture<CreateResWorkspaceResponse>
     */
    public CompletableFuture<CreateResWorkspaceResponse> createResWorkspaceAsync(CreateResWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.createResWorkspace);
    }

    /**
     * 创建工作空间
     *
     * 用于在推荐系统下面创建独立的工作空间，用于资源的隔离，用户可以在工作空间下面继续创建数据源、场景以及推荐任务等。是否有工作空间的操作权限取决于用户是否属于当前工作空间绑定的企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResWorkspaceRequest 请求对象
     * @return AsyncInvoker<CreateResWorkspaceRequest, CreateResWorkspaceResponse>
     */
    public AsyncInvoker<CreateResWorkspaceRequest, CreateResWorkspaceResponse> createResWorkspaceAsyncInvoker(
        CreateResWorkspaceRequest request) {
        return new AsyncInvoker<CreateResWorkspaceRequest, CreateResWorkspaceResponse>(request,
            ResMeta.createResWorkspace, hcClient);
    }

    /**
     * 删除数据源
     *
     * 删除数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResDatasourceRequest 请求对象
     * @return CompletableFuture<DeleteResDatasourceResponse>
     */
    public CompletableFuture<DeleteResDatasourceResponse> deleteResDatasourceAsync(DeleteResDatasourceRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.deleteResDatasource);
    }

    /**
     * 删除数据源
     *
     * 删除数据源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResDatasourceRequest 请求对象
     * @return AsyncInvoker<DeleteResDatasourceRequest, DeleteResDatasourceResponse>
     */
    public AsyncInvoker<DeleteResDatasourceRequest, DeleteResDatasourceResponse> deleteResDatasourceAsyncInvoker(
        DeleteResDatasourceRequest request) {
        return new AsyncInvoker<DeleteResDatasourceRequest, DeleteResDatasourceResponse>(request,
            ResMeta.deleteResDatasource, hcClient);
    }

    /**
     * 删除训练作业
     *
     * 删除指定作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResJobRequest 请求对象
     * @return CompletableFuture<DeleteResJobResponse>
     */
    public CompletableFuture<DeleteResJobResponse> deleteResJobAsync(DeleteResJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.deleteResJob);
    }

    /**
     * 删除训练作业
     *
     * 删除指定作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResJobRequest 请求对象
     * @return AsyncInvoker<DeleteResJobRequest, DeleteResJobResponse>
     */
    public AsyncInvoker<DeleteResJobRequest, DeleteResJobResponse> deleteResJobAsyncInvoker(
        DeleteResJobRequest request) {
        return new AsyncInvoker<DeleteResJobRequest, DeleteResJobResponse>(request, ResMeta.deleteResJob, hcClient);
    }

    /**
     * 删除在线服务
     *
     * 删除在线服务实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResOnlineInstanceRequest 请求对象
     * @return CompletableFuture<DeleteResOnlineInstanceResponse>
     */
    public CompletableFuture<DeleteResOnlineInstanceResponse> deleteResOnlineInstanceAsync(
        DeleteResOnlineInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.deleteResOnlineInstance);
    }

    /**
     * 删除在线服务
     *
     * 删除在线服务实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResOnlineInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteResOnlineInstanceRequest, DeleteResOnlineInstanceResponse>
     */
    public AsyncInvoker<DeleteResOnlineInstanceRequest, DeleteResOnlineInstanceResponse> deleteResOnlineInstanceAsyncInvoker(
        DeleteResOnlineInstanceRequest request) {
        return new AsyncInvoker<DeleteResOnlineInstanceRequest, DeleteResOnlineInstanceResponse>(request,
            ResMeta.deleteResOnlineInstance, hcClient);
    }

    /**
     * 删除场景
     *
     * 该接口用于删除场景，删除之后不能恢复，请您谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResSceneRequest 请求对象
     * @return CompletableFuture<DeleteResSceneResponse>
     */
    public CompletableFuture<DeleteResSceneResponse> deleteResSceneAsync(DeleteResSceneRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.deleteResScene);
    }

    /**
     * 删除场景
     *
     * 该接口用于删除场景，删除之后不能恢复，请您谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResSceneRequest 请求对象
     * @return AsyncInvoker<DeleteResSceneRequest, DeleteResSceneResponse>
     */
    public AsyncInvoker<DeleteResSceneRequest, DeleteResSceneResponse> deleteResSceneAsyncInvoker(
        DeleteResSceneRequest request) {
        return new AsyncInvoker<DeleteResSceneRequest, DeleteResSceneResponse>(request, ResMeta.deleteResScene,
            hcClient);
    }

    /**
     * 删除工作空间
     *
     * 删除指定工作空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResWorkspaceRequest 请求对象
     * @return CompletableFuture<DeleteResWorkspaceResponse>
     */
    public CompletableFuture<DeleteResWorkspaceResponse> deleteResWorkspaceAsync(DeleteResWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.deleteResWorkspace);
    }

    /**
     * 删除工作空间
     *
     * 删除指定工作空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResWorkspaceRequest 请求对象
     * @return AsyncInvoker<DeleteResWorkspaceRequest, DeleteResWorkspaceResponse>
     */
    public AsyncInvoker<DeleteResWorkspaceRequest, DeleteResWorkspaceResponse> deleteResWorkspaceAsyncInvoker(
        DeleteResWorkspaceRequest request) {
        return new AsyncInvoker<DeleteResWorkspaceRequest, DeleteResWorkspaceResponse>(request,
            ResMeta.deleteResWorkspace, hcClient);
    }

    /**
     * 查询数据源列表
     *
     * 查询当前工作空间下的数据源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResDatasourcesRequest 请求对象
     * @return CompletableFuture<ListResDatasourcesResponse>
     */
    public CompletableFuture<ListResDatasourcesResponse> listResDatasourcesAsync(ListResDatasourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.listResDatasources);
    }

    /**
     * 查询数据源列表
     *
     * 查询当前工作空间下的数据源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResDatasourcesRequest 请求对象
     * @return AsyncInvoker<ListResDatasourcesRequest, ListResDatasourcesResponse>
     */
    public AsyncInvoker<ListResDatasourcesRequest, ListResDatasourcesResponse> listResDatasourcesAsyncInvoker(
        ListResDatasourcesRequest request) {
        return new AsyncInvoker<ListResDatasourcesRequest, ListResDatasourcesResponse>(request,
            ResMeta.listResDatasources, hcClient);
    }

    /**
     * 查询企业项目列表
     *
     * 查询用户在当前项目id下的企业项目列表。在创建工作空间时需要提供企业项目id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResEnterprisesRequest 请求对象
     * @return CompletableFuture<ListResEnterprisesResponse>
     */
    public CompletableFuture<ListResEnterprisesResponse> listResEnterprisesAsync(ListResEnterprisesRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.listResEnterprises);
    }

    /**
     * 查询企业项目列表
     *
     * 查询用户在当前项目id下的企业项目列表。在创建工作空间时需要提供企业项目id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResEnterprisesRequest 请求对象
     * @return AsyncInvoker<ListResEnterprisesRequest, ListResEnterprisesResponse>
     */
    public AsyncInvoker<ListResEnterprisesRequest, ListResEnterprisesResponse> listResEnterprisesAsyncInvoker(
        ListResEnterprisesRequest request) {
        return new AsyncInvoker<ListResEnterprisesRequest, ListResEnterprisesResponse>(request,
            ResMeta.listResEnterprises, hcClient);
    }

    /**
     * 查询在线服务详情
     *
     * 根据给定的workspace_id和resource_id及category查询在线服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResOnlineServiceDetailsRequest 请求对象
     * @return CompletableFuture<ListResOnlineServiceDetailsResponse>
     */
    public CompletableFuture<ListResOnlineServiceDetailsResponse> listResOnlineServiceDetailsAsync(
        ListResOnlineServiceDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.listResOnlineServiceDetails);
    }

    /**
     * 查询在线服务详情
     *
     * 根据给定的workspace_id和resource_id及category查询在线服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResOnlineServiceDetailsRequest 请求对象
     * @return AsyncInvoker<ListResOnlineServiceDetailsRequest, ListResOnlineServiceDetailsResponse>
     */
    public AsyncInvoker<ListResOnlineServiceDetailsRequest, ListResOnlineServiceDetailsResponse> listResOnlineServiceDetailsAsyncInvoker(
        ListResOnlineServiceDetailsRequest request) {
        return new AsyncInvoker<ListResOnlineServiceDetailsRequest, ListResOnlineServiceDetailsResponse>(request,
            ResMeta.listResOnlineServiceDetails, hcClient);
    }

    /**
     * 查询训练规格
     *
     * 查询当前推荐系统所提供的离线计算规格，实时计算规格和排序模型训练规格。在创建数据源和场景时，需要提供此信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResResourceSpecRequest 请求对象
     * @return CompletableFuture<ListResResourceSpecResponse>
     */
    public CompletableFuture<ListResResourceSpecResponse> listResResourceSpecAsync(ListResResourceSpecRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.listResResourceSpec);
    }

    /**
     * 查询训练规格
     *
     * 查询当前推荐系统所提供的离线计算规格，实时计算规格和排序模型训练规格。在创建数据源和场景时，需要提供此信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResResourceSpecRequest 请求对象
     * @return AsyncInvoker<ListResResourceSpecRequest, ListResResourceSpecResponse>
     */
    public AsyncInvoker<ListResResourceSpecRequest, ListResResourceSpecResponse> listResResourceSpecAsyncInvoker(
        ListResResourceSpecRequest request) {
        return new AsyncInvoker<ListResResourceSpecRequest, ListResResourceSpecResponse>(request,
            ResMeta.listResResourceSpec, hcClient);
    }

    /**
     * 查询场景列表
     *
     * 查询当前工作空间下的场景列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResScenesRequest 请求对象
     * @return CompletableFuture<ListResScenesResponse>
     */
    public CompletableFuture<ListResScenesResponse> listResScenesAsync(ListResScenesRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.listResScenes);
    }

    /**
     * 查询场景列表
     *
     * 查询当前工作空间下的场景列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResScenesRequest 请求对象
     * @return AsyncInvoker<ListResScenesRequest, ListResScenesResponse>
     */
    public AsyncInvoker<ListResScenesRequest, ListResScenesResponse> listResScenesAsyncInvoker(
        ListResScenesRequest request) {
        return new AsyncInvoker<ListResScenesRequest, ListResScenesResponse>(request, ResMeta.listResScenes, hcClient);
    }

    /**
     * 查询工作空间列表
     *
     * 用于查询当前用户具有操作权限的工作空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResWorkspacesRequest 请求对象
     * @return CompletableFuture<ListResWorkspacesResponse>
     */
    public CompletableFuture<ListResWorkspacesResponse> listResWorkspacesAsync(ListResWorkspacesRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.listResWorkspaces);
    }

    /**
     * 查询工作空间列表
     *
     * 用于查询当前用户具有操作权限的工作空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResWorkspacesRequest 请求对象
     * @return AsyncInvoker<ListResWorkspacesRequest, ListResWorkspacesResponse>
     */
    public AsyncInvoker<ListResWorkspacesRequest, ListResWorkspacesResponse> listResWorkspacesAsyncInvoker(
        ListResWorkspacesRequest request) {
        return new AsyncInvoker<ListResWorkspacesRequest, ListResWorkspacesResponse>(request, ResMeta.listResWorkspaces,
            hcClient);
    }

    /**
     * 查询数据源详情
     *
     * 查询指定数据源的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResDatasourceRequest 请求对象
     * @return CompletableFuture<ShowResDatasourceResponse>
     */
    public CompletableFuture<ShowResDatasourceResponse> showResDatasourceAsync(ShowResDatasourceRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.showResDatasource);
    }

    /**
     * 查询数据源详情
     *
     * 查询指定数据源的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResDatasourceRequest 请求对象
     * @return AsyncInvoker<ShowResDatasourceRequest, ShowResDatasourceResponse>
     */
    public AsyncInvoker<ShowResDatasourceRequest, ShowResDatasourceResponse> showResDatasourceAsyncInvoker(
        ShowResDatasourceRequest request) {
        return new AsyncInvoker<ShowResDatasourceRequest, ShowResDatasourceResponse>(request, ResMeta.showResDatasource,
            hcClient);
    }

    /**
     * 查询数据源任务结果
     *
     * 查询指定数据源下离线任务的结果。其中包括数据格式，数据检测、数据探索及效果评估的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResDatasourceWorkDetailRequest 请求对象
     * @return CompletableFuture<ShowResDatasourceWorkDetailResponse>
     */
    public CompletableFuture<ShowResDatasourceWorkDetailResponse> showResDatasourceWorkDetailAsync(
        ShowResDatasourceWorkDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.showResDatasourceWorkDetail);
    }

    /**
     * 查询数据源任务结果
     *
     * 查询指定数据源下离线任务的结果。其中包括数据格式，数据检测、数据探索及效果评估的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResDatasourceWorkDetailRequest 请求对象
     * @return AsyncInvoker<ShowResDatasourceWorkDetailRequest, ShowResDatasourceWorkDetailResponse>
     */
    public AsyncInvoker<ShowResDatasourceWorkDetailRequest, ShowResDatasourceWorkDetailResponse> showResDatasourceWorkDetailAsyncInvoker(
        ShowResDatasourceWorkDetailRequest request) {
        return new AsyncInvoker<ShowResDatasourceWorkDetailRequest, ShowResDatasourceWorkDetailResponse>(request,
            ResMeta.showResDatasourceWorkDetail, hcClient);
    }

    /**
     * 查询训练作业
     *
     * 查询resource_id（数据源id或场景id）下的指定类型的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResJobRequest 请求对象
     * @return CompletableFuture<ShowResJobResponse>
     */
    public CompletableFuture<ShowResJobResponse> showResJobAsync(ShowResJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.showResJob);
    }

    /**
     * 查询训练作业
     *
     * 查询resource_id（数据源id或场景id）下的指定类型的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResJobRequest 请求对象
     * @return AsyncInvoker<ShowResJobRequest, ShowResJobResponse>
     */
    public AsyncInvoker<ShowResJobRequest, ShowResJobResponse> showResJobAsyncInvoker(ShowResJobRequest request) {
        return new AsyncInvoker<ShowResJobRequest, ShowResJobResponse>(request, ResMeta.showResJob, hcClient);
    }

    /**
     * 查询训练作业候选集
     *
     * 查询给定workspaces_id和指定resource_id下的候选集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResRecallSetRequest 请求对象
     * @return CompletableFuture<ShowResRecallSetResponse>
     */
    public CompletableFuture<ShowResRecallSetResponse> showResRecallSetAsync(ShowResRecallSetRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.showResRecallSet);
    }

    /**
     * 查询训练作业候选集
     *
     * 查询给定workspaces_id和指定resource_id下的候选集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResRecallSetRequest 请求对象
     * @return AsyncInvoker<ShowResRecallSetRequest, ShowResRecallSetResponse>
     */
    public AsyncInvoker<ShowResRecallSetRequest, ShowResRecallSetResponse> showResRecallSetAsyncInvoker(
        ShowResRecallSetRequest request) {
        return new AsyncInvoker<ShowResRecallSetRequest, ShowResRecallSetResponse>(request, ResMeta.showResRecallSet,
            hcClient);
    }

    /**
     * 查询场景详情
     *
     * 查询指定场景的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResSceneRequest 请求对象
     * @return CompletableFuture<ShowResSceneResponse>
     */
    public CompletableFuture<ShowResSceneResponse> showResSceneAsync(ShowResSceneRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.showResScene);
    }

    /**
     * 查询场景详情
     *
     * 查询指定场景的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResSceneRequest 请求对象
     * @return AsyncInvoker<ShowResSceneRequest, ShowResSceneResponse>
     */
    public AsyncInvoker<ShowResSceneRequest, ShowResSceneResponse> showResSceneAsyncInvoker(
        ShowResSceneRequest request) {
        return new AsyncInvoker<ShowResSceneRequest, ShowResSceneResponse>(request, ResMeta.showResScene, hcClient);
    }

    /**
     * 查询工作空间详情
     *
     * 查询指定工作空间的具体信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResWrokspaceRequest 请求对象
     * @return CompletableFuture<ShowResWrokspaceResponse>
     */
    public CompletableFuture<ShowResWrokspaceResponse> showResWrokspaceAsync(ShowResWrokspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.showResWrokspace);
    }

    /**
     * 查询工作空间详情
     *
     * 查询指定工作空间的具体信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResWrokspaceRequest 请求对象
     * @return AsyncInvoker<ShowResWrokspaceRequest, ShowResWrokspaceResponse>
     */
    public AsyncInvoker<ShowResWrokspaceRequest, ShowResWrokspaceResponse> showResWrokspaceAsyncInvoker(
        ShowResWrokspaceRequest request) {
        return new AsyncInvoker<ShowResWrokspaceRequest, ShowResWrokspaceResponse>(request, ResMeta.showResWrokspace,
            hcClient);
    }

    /**
     * 执行作业
     *
     * 执行独立的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartResJobRequest 请求对象
     * @return CompletableFuture<StartResJobResponse>
     */
    public CompletableFuture<StartResJobResponse> startResJobAsync(StartResJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.startResJob);
    }

    /**
     * 执行作业
     *
     * 执行独立的作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartResJobRequest 请求对象
     * @return AsyncInvoker<StartResJobRequest, StartResJobResponse>
     */
    public AsyncInvoker<StartResJobRequest, StartResJobResponse> startResJobAsyncInvoker(StartResJobRequest request) {
        return new AsyncInvoker<StartResJobRequest, StartResJobResponse>(request, ResMeta.startResJob, hcClient);
    }

    /**
     * 执行场景
     *
     * 执行场景下面的所有作业和服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartResSceneJobsRequest 请求对象
     * @return CompletableFuture<StartResSceneJobsResponse>
     */
    public CompletableFuture<StartResSceneJobsResponse> startResSceneJobsAsync(StartResSceneJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.startResSceneJobs);
    }

    /**
     * 执行场景
     *
     * 执行场景下面的所有作业和服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartResSceneJobsRequest 请求对象
     * @return AsyncInvoker<StartResSceneJobsRequest, StartResSceneJobsResponse>
     */
    public AsyncInvoker<StartResSceneJobsRequest, StartResSceneJobsResponse> startResSceneJobsAsyncInvoker(
        StartResSceneJobsRequest request) {
        return new AsyncInvoker<StartResSceneJobsRequest, StartResSceneJobsResponse>(request, ResMeta.startResSceneJobs,
            hcClient);
    }

    /**
     * 修改数据源内容
     *
     * 修改指定数据源的配置内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResDatasourceRequest 请求对象
     * @return CompletableFuture<UpdateResDatasourceResponse>
     */
    public CompletableFuture<UpdateResDatasourceResponse> updateResDatasourceAsync(UpdateResDatasourceRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.updateResDatasource);
    }

    /**
     * 修改数据源内容
     *
     * 修改指定数据源的配置内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResDatasourceRequest 请求对象
     * @return AsyncInvoker<UpdateResDatasourceRequest, UpdateResDatasourceResponse>
     */
    public AsyncInvoker<UpdateResDatasourceRequest, UpdateResDatasourceResponse> updateResDatasourceAsyncInvoker(
        UpdateResDatasourceRequest request) {
        return new AsyncInvoker<UpdateResDatasourceRequest, UpdateResDatasourceResponse>(request,
            ResMeta.updateResDatasource, hcClient);
    }

    /**
     * 修改数据源特征
     *
     * 修改数据源中的特征。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResDatastructRequest 请求对象
     * @return CompletableFuture<UpdateResDatastructResponse>
     */
    public CompletableFuture<UpdateResDatastructResponse> updateResDatastructAsync(UpdateResDatastructRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.updateResDatastruct);
    }

    /**
     * 修改数据源特征
     *
     * 修改数据源中的特征。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResDatastructRequest 请求对象
     * @return AsyncInvoker<UpdateResDatastructRequest, UpdateResDatastructResponse>
     */
    public AsyncInvoker<UpdateResDatastructRequest, UpdateResDatastructResponse> updateResDatastructAsyncInvoker(
        UpdateResDatastructRequest request) {
        return new AsyncInvoker<UpdateResDatastructRequest, UpdateResDatastructResponse>(request,
            ResMeta.updateResDatastruct, hcClient);
    }

    /**
     * 更新智能场景内容
     *
     * 更新智能场景的内容信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResIntelligentSceneRequest 请求对象
     * @return CompletableFuture<UpdateResIntelligentSceneResponse>
     */
    public CompletableFuture<UpdateResIntelligentSceneResponse> updateResIntelligentSceneAsync(
        UpdateResIntelligentSceneRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.updateResIntelligentScene);
    }

    /**
     * 更新智能场景内容
     *
     * 更新智能场景的内容信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResIntelligentSceneRequest 请求对象
     * @return AsyncInvoker<UpdateResIntelligentSceneRequest, UpdateResIntelligentSceneResponse>
     */
    public AsyncInvoker<UpdateResIntelligentSceneRequest, UpdateResIntelligentSceneResponse> updateResIntelligentSceneAsyncInvoker(
        UpdateResIntelligentSceneRequest request) {
        return new AsyncInvoker<UpdateResIntelligentSceneRequest, UpdateResIntelligentSceneResponse>(request,
            ResMeta.updateResIntelligentScene, hcClient);
    }

    /**
     * 修改训练作业参数
     *
     * 修改指定作业的元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResJobRequest 请求对象
     * @return CompletableFuture<UpdateResJobResponse>
     */
    public CompletableFuture<UpdateResJobResponse> updateResJobAsync(UpdateResJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.updateResJob);
    }

    /**
     * 修改训练作业参数
     *
     * 修改指定作业的元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResJobRequest 请求对象
     * @return AsyncInvoker<UpdateResJobRequest, UpdateResJobResponse>
     */
    public AsyncInvoker<UpdateResJobRequest, UpdateResJobResponse> updateResJobAsyncInvoker(
        UpdateResJobRequest request) {
        return new AsyncInvoker<UpdateResJobRequest, UpdateResJobResponse>(request, ResMeta.updateResJob, hcClient);
    }

    /**
     * 修改在线服务参数
     *
     * 修改指定在线服务的元数据内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResOnlineInstanceRequest 请求对象
     * @return CompletableFuture<UpdateResOnlineInstanceResponse>
     */
    public CompletableFuture<UpdateResOnlineInstanceResponse> updateResOnlineInstanceAsync(
        UpdateResOnlineInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.updateResOnlineInstance);
    }

    /**
     * 修改在线服务参数
     *
     * 修改指定在线服务的元数据内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResOnlineInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateResOnlineInstanceRequest, UpdateResOnlineInstanceResponse>
     */
    public AsyncInvoker<UpdateResOnlineInstanceRequest, UpdateResOnlineInstanceResponse> updateResOnlineInstanceAsyncInvoker(
        UpdateResOnlineInstanceRequest request) {
        return new AsyncInvoker<UpdateResOnlineInstanceRequest, UpdateResOnlineInstanceResponse>(request,
            ResMeta.updateResOnlineInstance, hcClient);
    }

    /**
     * 更新自定义场景内容
     *
     * 更新自定义场景的内容信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResSceneRequest 请求对象
     * @return CompletableFuture<UpdateResSceneResponse>
     */
    public CompletableFuture<UpdateResSceneResponse> updateResSceneAsync(UpdateResSceneRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.updateResScene);
    }

    /**
     * 更新自定义场景内容
     *
     * 更新自定义场景的内容信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResSceneRequest 请求对象
     * @return AsyncInvoker<UpdateResSceneRequest, UpdateResSceneResponse>
     */
    public AsyncInvoker<UpdateResSceneRequest, UpdateResSceneResponse> updateResSceneAsyncInvoker(
        UpdateResSceneRequest request) {
        return new AsyncInvoker<UpdateResSceneRequest, UpdateResSceneResponse>(request, ResMeta.updateResScene,
            hcClient);
    }

    /**
     * 更新工作空间
     *
     * 更新工作空间信息, 只允许更新描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResWorkspaceRequest 请求对象
     * @return CompletableFuture<UpdateResWorkspaceResponse>
     */
    public CompletableFuture<UpdateResWorkspaceResponse> updateResWorkspaceAsync(UpdateResWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, ResMeta.updateResWorkspace);
    }

    /**
     * 更新工作空间
     *
     * 更新工作空间信息, 只允许更新描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResWorkspaceRequest 请求对象
     * @return AsyncInvoker<UpdateResWorkspaceRequest, UpdateResWorkspaceResponse>
     */
    public AsyncInvoker<UpdateResWorkspaceRequest, UpdateResWorkspaceResponse> updateResWorkspaceAsyncInvoker(
        UpdateResWorkspaceRequest request) {
        return new AsyncInvoker<UpdateResWorkspaceRequest, UpdateResWorkspaceResponse>(request,
            ResMeta.updateResWorkspace, hcClient);
    }

}
