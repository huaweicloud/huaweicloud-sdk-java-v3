package com.huaweicloud.sdk.res.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.res.v1.model.*;

public class ResClient {

    protected HcClient hcClient;

    public ResClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ResClient> newBuilder() {
        return new ClientBuilder<>(ResClient::new);
    }

    /**
     * 创建数据源
     *
     * 在指定的工作空间下面创建一个新的数据源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResDatasourceRequest 请求对象
     * @return CreateResDatasourceResponse
     */
    public CreateResDatasourceResponse createResDatasource(CreateResDatasourceRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.createResDatasource);
    }

    /**
     * 创建数据源
     *
     * 在指定的工作空间下面创建一个新的数据源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResDatasourceRequest 请求对象
     * @return SyncInvoker<CreateResDatasourceRequest, CreateResDatasourceResponse>
     */
    public SyncInvoker<CreateResDatasourceRequest, CreateResDatasourceResponse> createResDatasourceInvoker(
        CreateResDatasourceRequest request) {
        return new SyncInvoker<CreateResDatasourceRequest, CreateResDatasourceResponse>(request,
            ResMeta.createResDatasource, hcClient);
    }

    /**
     * 创建智能场景
     *
     * 在指定工作空间下面创建智能场景。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResIntelligentSceneRequest 请求对象
     * @return CreateResIntelligentSceneResponse
     */
    public CreateResIntelligentSceneResponse createResIntelligentScene(CreateResIntelligentSceneRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.createResIntelligentScene);
    }

    /**
     * 创建智能场景
     *
     * 在指定工作空间下面创建智能场景。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResIntelligentSceneRequest 请求对象
     * @return SyncInvoker<CreateResIntelligentSceneRequest, CreateResIntelligentSceneResponse>
     */
    public SyncInvoker<CreateResIntelligentSceneRequest, CreateResIntelligentSceneResponse> createResIntelligentSceneInvoker(
        CreateResIntelligentSceneRequest request) {
        return new SyncInvoker<CreateResIntelligentSceneRequest, CreateResIntelligentSceneResponse>(request,
            ResMeta.createResIntelligentScene, hcClient);
    }

    /**
     * 新建训练作业
     *
     * 新建训练作业元数据，新建成功之后可手动执行此任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResJobRequest 请求对象
     * @return CreateResJobResponse
     */
    public CreateResJobResponse createResJob(CreateResJobRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.createResJob);
    }

    /**
     * 新建训练作业
     *
     * 新建训练作业元数据，新建成功之后可手动执行此任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResJobRequest 请求对象
     * @return SyncInvoker<CreateResJobRequest, CreateResJobResponse>
     */
    public SyncInvoker<CreateResJobRequest, CreateResJobResponse> createResJobInvoker(CreateResJobRequest request) {
        return new SyncInvoker<CreateResJobRequest, CreateResJobResponse>(request, ResMeta.createResJob, hcClient);
    }

    /**
     * 新建多个训练作业
     *
     * 批量新建作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResJobsRequest 请求对象
     * @return CreateResJobsResponse
     */
    public CreateResJobsResponse createResJobs(CreateResJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.createResJobs);
    }

    /**
     * 新建多个训练作业
     *
     * 批量新建作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResJobsRequest 请求对象
     * @return SyncInvoker<CreateResJobsRequest, CreateResJobsResponse>
     */
    public SyncInvoker<CreateResJobsRequest, CreateResJobsResponse> createResJobsInvoker(CreateResJobsRequest request) {
        return new SyncInvoker<CreateResJobsRequest, CreateResJobsResponse>(request, ResMeta.createResJobs, hcClient);
    }

    /**
     * 新建在线服务
     *
     * 新建在线服务元数据，新建成功之后可手动发布此服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResOnlineInstanceRequest 请求对象
     * @return CreateResOnlineInstanceResponse
     */
    public CreateResOnlineInstanceResponse createResOnlineInstance(CreateResOnlineInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.createResOnlineInstance);
    }

    /**
     * 新建在线服务
     *
     * 新建在线服务元数据，新建成功之后可手动发布此服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResOnlineInstanceRequest 请求对象
     * @return SyncInvoker<CreateResOnlineInstanceRequest, CreateResOnlineInstanceResponse>
     */
    public SyncInvoker<CreateResOnlineInstanceRequest, CreateResOnlineInstanceResponse> createResOnlineInstanceInvoker(
        CreateResOnlineInstanceRequest request) {
        return new SyncInvoker<CreateResOnlineInstanceRequest, CreateResOnlineInstanceResponse>(request,
            ResMeta.createResOnlineInstance, hcClient);
    }

    /**
     * 创建自定义场景
     *
     * 在指定工作空间下面创建自定义场景。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResSceneRequest 请求对象
     * @return CreateResSceneResponse
     */
    public CreateResSceneResponse createResScene(CreateResSceneRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.createResScene);
    }

    /**
     * 创建自定义场景
     *
     * 在指定工作空间下面创建自定义场景。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResSceneRequest 请求对象
     * @return SyncInvoker<CreateResSceneRequest, CreateResSceneResponse>
     */
    public SyncInvoker<CreateResSceneRequest, CreateResSceneResponse> createResSceneInvoker(
        CreateResSceneRequest request) {
        return new SyncInvoker<CreateResSceneRequest, CreateResSceneResponse>(request, ResMeta.createResScene,
            hcClient);
    }

    /**
     * 创建工作空间
     *
     * 用于在推荐系统下面创建独立的工作空间，用于资源的隔离，用户可以在工作空间下面继续创建数据源、场景以及推荐任务等。是否有工作空间的操作权限取决于用户是否属于当前工作空间绑定的企业项目。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResWorkspaceRequest 请求对象
     * @return CreateResWorkspaceResponse
     */
    public CreateResWorkspaceResponse createResWorkspace(CreateResWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.createResWorkspace);
    }

    /**
     * 创建工作空间
     *
     * 用于在推荐系统下面创建独立的工作空间，用于资源的隔离，用户可以在工作空间下面继续创建数据源、场景以及推荐任务等。是否有工作空间的操作权限取决于用户是否属于当前工作空间绑定的企业项目。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResWorkspaceRequest 请求对象
     * @return SyncInvoker<CreateResWorkspaceRequest, CreateResWorkspaceResponse>
     */
    public SyncInvoker<CreateResWorkspaceRequest, CreateResWorkspaceResponse> createResWorkspaceInvoker(
        CreateResWorkspaceRequest request) {
        return new SyncInvoker<CreateResWorkspaceRequest, CreateResWorkspaceResponse>(request,
            ResMeta.createResWorkspace, hcClient);
    }

    /**
     * 删除数据源
     *
     * 删除数据源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResDatasourceRequest 请求对象
     * @return DeleteResDatasourceResponse
     */
    public DeleteResDatasourceResponse deleteResDatasource(DeleteResDatasourceRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.deleteResDatasource);
    }

    /**
     * 删除数据源
     *
     * 删除数据源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResDatasourceRequest 请求对象
     * @return SyncInvoker<DeleteResDatasourceRequest, DeleteResDatasourceResponse>
     */
    public SyncInvoker<DeleteResDatasourceRequest, DeleteResDatasourceResponse> deleteResDatasourceInvoker(
        DeleteResDatasourceRequest request) {
        return new SyncInvoker<DeleteResDatasourceRequest, DeleteResDatasourceResponse>(request,
            ResMeta.deleteResDatasource, hcClient);
    }

    /**
     * 删除训练作业
     *
     * 删除指定作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResJobRequest 请求对象
     * @return DeleteResJobResponse
     */
    public DeleteResJobResponse deleteResJob(DeleteResJobRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.deleteResJob);
    }

    /**
     * 删除训练作业
     *
     * 删除指定作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResJobRequest 请求对象
     * @return SyncInvoker<DeleteResJobRequest, DeleteResJobResponse>
     */
    public SyncInvoker<DeleteResJobRequest, DeleteResJobResponse> deleteResJobInvoker(DeleteResJobRequest request) {
        return new SyncInvoker<DeleteResJobRequest, DeleteResJobResponse>(request, ResMeta.deleteResJob, hcClient);
    }

    /**
     * 删除在线服务
     *
     * 删除在线服务实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResOnlineInstanceRequest 请求对象
     * @return DeleteResOnlineInstanceResponse
     */
    public DeleteResOnlineInstanceResponse deleteResOnlineInstance(DeleteResOnlineInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.deleteResOnlineInstance);
    }

    /**
     * 删除在线服务
     *
     * 删除在线服务实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResOnlineInstanceRequest 请求对象
     * @return SyncInvoker<DeleteResOnlineInstanceRequest, DeleteResOnlineInstanceResponse>
     */
    public SyncInvoker<DeleteResOnlineInstanceRequest, DeleteResOnlineInstanceResponse> deleteResOnlineInstanceInvoker(
        DeleteResOnlineInstanceRequest request) {
        return new SyncInvoker<DeleteResOnlineInstanceRequest, DeleteResOnlineInstanceResponse>(request,
            ResMeta.deleteResOnlineInstance, hcClient);
    }

    /**
     * 删除场景
     *
     * 该接口用于删除场景，删除之后不能恢复，请您谨慎操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResSceneRequest 请求对象
     * @return DeleteResSceneResponse
     */
    public DeleteResSceneResponse deleteResScene(DeleteResSceneRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.deleteResScene);
    }

    /**
     * 删除场景
     *
     * 该接口用于删除场景，删除之后不能恢复，请您谨慎操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResSceneRequest 请求对象
     * @return SyncInvoker<DeleteResSceneRequest, DeleteResSceneResponse>
     */
    public SyncInvoker<DeleteResSceneRequest, DeleteResSceneResponse> deleteResSceneInvoker(
        DeleteResSceneRequest request) {
        return new SyncInvoker<DeleteResSceneRequest, DeleteResSceneResponse>(request, ResMeta.deleteResScene,
            hcClient);
    }

    /**
     * 删除工作空间
     *
     * 删除指定工作空间。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResWorkspaceRequest 请求对象
     * @return DeleteResWorkspaceResponse
     */
    public DeleteResWorkspaceResponse deleteResWorkspace(DeleteResWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.deleteResWorkspace);
    }

    /**
     * 删除工作空间
     *
     * 删除指定工作空间。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResWorkspaceRequest 请求对象
     * @return SyncInvoker<DeleteResWorkspaceRequest, DeleteResWorkspaceResponse>
     */
    public SyncInvoker<DeleteResWorkspaceRequest, DeleteResWorkspaceResponse> deleteResWorkspaceInvoker(
        DeleteResWorkspaceRequest request) {
        return new SyncInvoker<DeleteResWorkspaceRequest, DeleteResWorkspaceResponse>(request,
            ResMeta.deleteResWorkspace, hcClient);
    }

    /**
     * 查询数据源列表
     *
     * 查询当前工作空间下的数据源列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResDatasourcesRequest 请求对象
     * @return ListResDatasourcesResponse
     */
    public ListResDatasourcesResponse listResDatasources(ListResDatasourcesRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.listResDatasources);
    }

    /**
     * 查询数据源列表
     *
     * 查询当前工作空间下的数据源列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResDatasourcesRequest 请求对象
     * @return SyncInvoker<ListResDatasourcesRequest, ListResDatasourcesResponse>
     */
    public SyncInvoker<ListResDatasourcesRequest, ListResDatasourcesResponse> listResDatasourcesInvoker(
        ListResDatasourcesRequest request) {
        return new SyncInvoker<ListResDatasourcesRequest, ListResDatasourcesResponse>(request,
            ResMeta.listResDatasources, hcClient);
    }

    /**
     * 查询企业项目列表
     *
     * 查询用户在当前项目id下的企业项目列表。在创建工作空间时需要提供企业项目id。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResEnterprisesRequest 请求对象
     * @return ListResEnterprisesResponse
     */
    public ListResEnterprisesResponse listResEnterprises(ListResEnterprisesRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.listResEnterprises);
    }

    /**
     * 查询企业项目列表
     *
     * 查询用户在当前项目id下的企业项目列表。在创建工作空间时需要提供企业项目id。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResEnterprisesRequest 请求对象
     * @return SyncInvoker<ListResEnterprisesRequest, ListResEnterprisesResponse>
     */
    public SyncInvoker<ListResEnterprisesRequest, ListResEnterprisesResponse> listResEnterprisesInvoker(
        ListResEnterprisesRequest request) {
        return new SyncInvoker<ListResEnterprisesRequest, ListResEnterprisesResponse>(request,
            ResMeta.listResEnterprises, hcClient);
    }

    /**
     * 查询在线服务详情
     *
     * 根据给定的workspace_id和resource_id及category查询在线服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResOnlineServiceDetailsRequest 请求对象
     * @return ListResOnlineServiceDetailsResponse
     */
    public ListResOnlineServiceDetailsResponse listResOnlineServiceDetails(ListResOnlineServiceDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.listResOnlineServiceDetails);
    }

    /**
     * 查询在线服务详情
     *
     * 根据给定的workspace_id和resource_id及category查询在线服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResOnlineServiceDetailsRequest 请求对象
     * @return SyncInvoker<ListResOnlineServiceDetailsRequest, ListResOnlineServiceDetailsResponse>
     */
    public SyncInvoker<ListResOnlineServiceDetailsRequest, ListResOnlineServiceDetailsResponse> listResOnlineServiceDetailsInvoker(
        ListResOnlineServiceDetailsRequest request) {
        return new SyncInvoker<ListResOnlineServiceDetailsRequest, ListResOnlineServiceDetailsResponse>(request,
            ResMeta.listResOnlineServiceDetails, hcClient);
    }

    /**
     * 查询训练规格
     *
     * 查询当前推荐系统所提供的离线计算规格，实时计算规格和排序模型训练规格。在创建数据源和场景时，需要提供此信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResResourceSpecRequest 请求对象
     * @return ListResResourceSpecResponse
     */
    public ListResResourceSpecResponse listResResourceSpec(ListResResourceSpecRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.listResResourceSpec);
    }

    /**
     * 查询训练规格
     *
     * 查询当前推荐系统所提供的离线计算规格，实时计算规格和排序模型训练规格。在创建数据源和场景时，需要提供此信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResResourceSpecRequest 请求对象
     * @return SyncInvoker<ListResResourceSpecRequest, ListResResourceSpecResponse>
     */
    public SyncInvoker<ListResResourceSpecRequest, ListResResourceSpecResponse> listResResourceSpecInvoker(
        ListResResourceSpecRequest request) {
        return new SyncInvoker<ListResResourceSpecRequest, ListResResourceSpecResponse>(request,
            ResMeta.listResResourceSpec, hcClient);
    }

    /**
     * 查询场景列表
     *
     * 查询当前工作空间下的场景列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResScenesRequest 请求对象
     * @return ListResScenesResponse
     */
    public ListResScenesResponse listResScenes(ListResScenesRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.listResScenes);
    }

    /**
     * 查询场景列表
     *
     * 查询当前工作空间下的场景列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResScenesRequest 请求对象
     * @return SyncInvoker<ListResScenesRequest, ListResScenesResponse>
     */
    public SyncInvoker<ListResScenesRequest, ListResScenesResponse> listResScenesInvoker(ListResScenesRequest request) {
        return new SyncInvoker<ListResScenesRequest, ListResScenesResponse>(request, ResMeta.listResScenes, hcClient);
    }

    /**
     * 查询工作空间列表
     *
     * 用于查询当前用户具有操作权限的工作空间列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResWorkspacesRequest 请求对象
     * @return ListResWorkspacesResponse
     */
    public ListResWorkspacesResponse listResWorkspaces(ListResWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.listResWorkspaces);
    }

    /**
     * 查询工作空间列表
     *
     * 用于查询当前用户具有操作权限的工作空间列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResWorkspacesRequest 请求对象
     * @return SyncInvoker<ListResWorkspacesRequest, ListResWorkspacesResponse>
     */
    public SyncInvoker<ListResWorkspacesRequest, ListResWorkspacesResponse> listResWorkspacesInvoker(
        ListResWorkspacesRequest request) {
        return new SyncInvoker<ListResWorkspacesRequest, ListResWorkspacesResponse>(request, ResMeta.listResWorkspaces,
            hcClient);
    }

    /**
     * 查询数据源详情
     *
     * 查询指定数据源的详情信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResDatasourceRequest 请求对象
     * @return ShowResDatasourceResponse
     */
    public ShowResDatasourceResponse showResDatasource(ShowResDatasourceRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.showResDatasource);
    }

    /**
     * 查询数据源详情
     *
     * 查询指定数据源的详情信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResDatasourceRequest 请求对象
     * @return SyncInvoker<ShowResDatasourceRequest, ShowResDatasourceResponse>
     */
    public SyncInvoker<ShowResDatasourceRequest, ShowResDatasourceResponse> showResDatasourceInvoker(
        ShowResDatasourceRequest request) {
        return new SyncInvoker<ShowResDatasourceRequest, ShowResDatasourceResponse>(request, ResMeta.showResDatasource,
            hcClient);
    }

    /**
     * 查询数据源任务结果
     *
     * 查询指定数据源下离线任务的结果。其中包括数据格式，数据检测、数据探索及效果评估的内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResDatasourceWorkDetailRequest 请求对象
     * @return ShowResDatasourceWorkDetailResponse
     */
    public ShowResDatasourceWorkDetailResponse showResDatasourceWorkDetail(ShowResDatasourceWorkDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.showResDatasourceWorkDetail);
    }

    /**
     * 查询数据源任务结果
     *
     * 查询指定数据源下离线任务的结果。其中包括数据格式，数据检测、数据探索及效果评估的内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResDatasourceWorkDetailRequest 请求对象
     * @return SyncInvoker<ShowResDatasourceWorkDetailRequest, ShowResDatasourceWorkDetailResponse>
     */
    public SyncInvoker<ShowResDatasourceWorkDetailRequest, ShowResDatasourceWorkDetailResponse> showResDatasourceWorkDetailInvoker(
        ShowResDatasourceWorkDetailRequest request) {
        return new SyncInvoker<ShowResDatasourceWorkDetailRequest, ShowResDatasourceWorkDetailResponse>(request,
            ResMeta.showResDatasourceWorkDetail, hcClient);
    }

    /**
     * 查询训练作业
     *
     * 查询resource_id（数据源id或场景id）下的指定类型的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResJobRequest 请求对象
     * @return ShowResJobResponse
     */
    public ShowResJobResponse showResJob(ShowResJobRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.showResJob);
    }

    /**
     * 查询训练作业
     *
     * 查询resource_id（数据源id或场景id）下的指定类型的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResJobRequest 请求对象
     * @return SyncInvoker<ShowResJobRequest, ShowResJobResponse>
     */
    public SyncInvoker<ShowResJobRequest, ShowResJobResponse> showResJobInvoker(ShowResJobRequest request) {
        return new SyncInvoker<ShowResJobRequest, ShowResJobResponse>(request, ResMeta.showResJob, hcClient);
    }

    /**
     * 查询训练作业候选集
     *
     * 查询给定workspaces_id和指定resource_id下的候选集。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResRecallSetRequest 请求对象
     * @return ShowResRecallSetResponse
     */
    public ShowResRecallSetResponse showResRecallSet(ShowResRecallSetRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.showResRecallSet);
    }

    /**
     * 查询训练作业候选集
     *
     * 查询给定workspaces_id和指定resource_id下的候选集。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResRecallSetRequest 请求对象
     * @return SyncInvoker<ShowResRecallSetRequest, ShowResRecallSetResponse>
     */
    public SyncInvoker<ShowResRecallSetRequest, ShowResRecallSetResponse> showResRecallSetInvoker(
        ShowResRecallSetRequest request) {
        return new SyncInvoker<ShowResRecallSetRequest, ShowResRecallSetResponse>(request, ResMeta.showResRecallSet,
            hcClient);
    }

    /**
     * 查询场景详情
     *
     * 查询指定场景的详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResSceneRequest 请求对象
     * @return ShowResSceneResponse
     */
    public ShowResSceneResponse showResScene(ShowResSceneRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.showResScene);
    }

    /**
     * 查询场景详情
     *
     * 查询指定场景的详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResSceneRequest 请求对象
     * @return SyncInvoker<ShowResSceneRequest, ShowResSceneResponse>
     */
    public SyncInvoker<ShowResSceneRequest, ShowResSceneResponse> showResSceneInvoker(ShowResSceneRequest request) {
        return new SyncInvoker<ShowResSceneRequest, ShowResSceneResponse>(request, ResMeta.showResScene, hcClient);
    }

    /**
     * 查询工作空间详情
     *
     * 查询指定工作空间的具体信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResWrokspaceRequest 请求对象
     * @return ShowResWrokspaceResponse
     */
    public ShowResWrokspaceResponse showResWrokspace(ShowResWrokspaceRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.showResWrokspace);
    }

    /**
     * 查询工作空间详情
     *
     * 查询指定工作空间的具体信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResWrokspaceRequest 请求对象
     * @return SyncInvoker<ShowResWrokspaceRequest, ShowResWrokspaceResponse>
     */
    public SyncInvoker<ShowResWrokspaceRequest, ShowResWrokspaceResponse> showResWrokspaceInvoker(
        ShowResWrokspaceRequest request) {
        return new SyncInvoker<ShowResWrokspaceRequest, ShowResWrokspaceResponse>(request, ResMeta.showResWrokspace,
            hcClient);
    }

    /**
     * 执行作业
     *
     * 执行独立的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartResJobRequest 请求对象
     * @return StartResJobResponse
     */
    public StartResJobResponse startResJob(StartResJobRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.startResJob);
    }

    /**
     * 执行作业
     *
     * 执行独立的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartResJobRequest 请求对象
     * @return SyncInvoker<StartResJobRequest, StartResJobResponse>
     */
    public SyncInvoker<StartResJobRequest, StartResJobResponse> startResJobInvoker(StartResJobRequest request) {
        return new SyncInvoker<StartResJobRequest, StartResJobResponse>(request, ResMeta.startResJob, hcClient);
    }

    /**
     * 执行场景
     *
     * 执行场景下面的所有作业和服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartResSceneJobsRequest 请求对象
     * @return StartResSceneJobsResponse
     */
    public StartResSceneJobsResponse startResSceneJobs(StartResSceneJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.startResSceneJobs);
    }

    /**
     * 执行场景
     *
     * 执行场景下面的所有作业和服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartResSceneJobsRequest 请求对象
     * @return SyncInvoker<StartResSceneJobsRequest, StartResSceneJobsResponse>
     */
    public SyncInvoker<StartResSceneJobsRequest, StartResSceneJobsResponse> startResSceneJobsInvoker(
        StartResSceneJobsRequest request) {
        return new SyncInvoker<StartResSceneJobsRequest, StartResSceneJobsResponse>(request, ResMeta.startResSceneJobs,
            hcClient);
    }

    /**
     * 修改数据源内容
     *
     * 修改指定数据源的配置内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResDatasourceRequest 请求对象
     * @return UpdateResDatasourceResponse
     */
    public UpdateResDatasourceResponse updateResDatasource(UpdateResDatasourceRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.updateResDatasource);
    }

    /**
     * 修改数据源内容
     *
     * 修改指定数据源的配置内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResDatasourceRequest 请求对象
     * @return SyncInvoker<UpdateResDatasourceRequest, UpdateResDatasourceResponse>
     */
    public SyncInvoker<UpdateResDatasourceRequest, UpdateResDatasourceResponse> updateResDatasourceInvoker(
        UpdateResDatasourceRequest request) {
        return new SyncInvoker<UpdateResDatasourceRequest, UpdateResDatasourceResponse>(request,
            ResMeta.updateResDatasource, hcClient);
    }

    /**
     * 修改数据源特征
     *
     * 修改数据源中的特征。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResDatastructRequest 请求对象
     * @return UpdateResDatastructResponse
     */
    public UpdateResDatastructResponse updateResDatastruct(UpdateResDatastructRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.updateResDatastruct);
    }

    /**
     * 修改数据源特征
     *
     * 修改数据源中的特征。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResDatastructRequest 请求对象
     * @return SyncInvoker<UpdateResDatastructRequest, UpdateResDatastructResponse>
     */
    public SyncInvoker<UpdateResDatastructRequest, UpdateResDatastructResponse> updateResDatastructInvoker(
        UpdateResDatastructRequest request) {
        return new SyncInvoker<UpdateResDatastructRequest, UpdateResDatastructResponse>(request,
            ResMeta.updateResDatastruct, hcClient);
    }

    /**
     * 更新智能场景内容
     *
     * 更新智能场景的内容信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResIntelligentSceneRequest 请求对象
     * @return UpdateResIntelligentSceneResponse
     */
    public UpdateResIntelligentSceneResponse updateResIntelligentScene(UpdateResIntelligentSceneRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.updateResIntelligentScene);
    }

    /**
     * 更新智能场景内容
     *
     * 更新智能场景的内容信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResIntelligentSceneRequest 请求对象
     * @return SyncInvoker<UpdateResIntelligentSceneRequest, UpdateResIntelligentSceneResponse>
     */
    public SyncInvoker<UpdateResIntelligentSceneRequest, UpdateResIntelligentSceneResponse> updateResIntelligentSceneInvoker(
        UpdateResIntelligentSceneRequest request) {
        return new SyncInvoker<UpdateResIntelligentSceneRequest, UpdateResIntelligentSceneResponse>(request,
            ResMeta.updateResIntelligentScene, hcClient);
    }

    /**
     * 修改训练作业参数
     *
     * 修改指定作业的元数据信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResJobRequest 请求对象
     * @return UpdateResJobResponse
     */
    public UpdateResJobResponse updateResJob(UpdateResJobRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.updateResJob);
    }

    /**
     * 修改训练作业参数
     *
     * 修改指定作业的元数据信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResJobRequest 请求对象
     * @return SyncInvoker<UpdateResJobRequest, UpdateResJobResponse>
     */
    public SyncInvoker<UpdateResJobRequest, UpdateResJobResponse> updateResJobInvoker(UpdateResJobRequest request) {
        return new SyncInvoker<UpdateResJobRequest, UpdateResJobResponse>(request, ResMeta.updateResJob, hcClient);
    }

    /**
     * 修改在线服务参数
     *
     * 修改指定在线服务的元数据内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResOnlineInstanceRequest 请求对象
     * @return UpdateResOnlineInstanceResponse
     */
    public UpdateResOnlineInstanceResponse updateResOnlineInstance(UpdateResOnlineInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.updateResOnlineInstance);
    }

    /**
     * 修改在线服务参数
     *
     * 修改指定在线服务的元数据内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResOnlineInstanceRequest 请求对象
     * @return SyncInvoker<UpdateResOnlineInstanceRequest, UpdateResOnlineInstanceResponse>
     */
    public SyncInvoker<UpdateResOnlineInstanceRequest, UpdateResOnlineInstanceResponse> updateResOnlineInstanceInvoker(
        UpdateResOnlineInstanceRequest request) {
        return new SyncInvoker<UpdateResOnlineInstanceRequest, UpdateResOnlineInstanceResponse>(request,
            ResMeta.updateResOnlineInstance, hcClient);
    }

    /**
     * 更新自定义场景内容
     *
     * 更新自定义场景的内容信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResSceneRequest 请求对象
     * @return UpdateResSceneResponse
     */
    public UpdateResSceneResponse updateResScene(UpdateResSceneRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.updateResScene);
    }

    /**
     * 更新自定义场景内容
     *
     * 更新自定义场景的内容信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResSceneRequest 请求对象
     * @return SyncInvoker<UpdateResSceneRequest, UpdateResSceneResponse>
     */
    public SyncInvoker<UpdateResSceneRequest, UpdateResSceneResponse> updateResSceneInvoker(
        UpdateResSceneRequest request) {
        return new SyncInvoker<UpdateResSceneRequest, UpdateResSceneResponse>(request, ResMeta.updateResScene,
            hcClient);
    }

    /**
     * 更新工作空间
     *
     * 更新工作空间信息, 只允许更新描述信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResWorkspaceRequest 请求对象
     * @return UpdateResWorkspaceResponse
     */
    public UpdateResWorkspaceResponse updateResWorkspace(UpdateResWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, ResMeta.updateResWorkspace);
    }

    /**
     * 更新工作空间
     *
     * 更新工作空间信息, 只允许更新描述信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateResWorkspaceRequest, UpdateResWorkspaceResponse>
     */
    public SyncInvoker<UpdateResWorkspaceRequest, UpdateResWorkspaceResponse> updateResWorkspaceInvoker(
        UpdateResWorkspaceRequest request) {
        return new SyncInvoker<UpdateResWorkspaceRequest, UpdateResWorkspaceResponse>(request,
            ResMeta.updateResWorkspace, hcClient);
    }

}
