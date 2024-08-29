package com.huaweicloud.sdk.css.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.css.v1.model.AddFavoriteRequest;
import com.huaweicloud.sdk.css.v1.model.AddFavoriteResponse;
import com.huaweicloud.sdk.css.v1.model.AddIndependentNodeRequest;
import com.huaweicloud.sdk.css.v1.model.AddIndependentNodeResponse;
import com.huaweicloud.sdk.css.v1.model.ChangeModeRequest;
import com.huaweicloud.sdk.css.v1.model.ChangeModeResponse;
import com.huaweicloud.sdk.css.v1.model.ChangeSecurityGroupRequest;
import com.huaweicloud.sdk.css.v1.model.ChangeSecurityGroupResponse;
import com.huaweicloud.sdk.css.v1.model.CreateAiOpsRequest;
import com.huaweicloud.sdk.css.v1.model.CreateAiOpsResponse;
import com.huaweicloud.sdk.css.v1.model.CreateAutoCreatePolicyRequest;
import com.huaweicloud.sdk.css.v1.model.CreateAutoCreatePolicyResponse;
import com.huaweicloud.sdk.css.v1.model.CreateBindPublicRequest;
import com.huaweicloud.sdk.css.v1.model.CreateBindPublicResponse;
import com.huaweicloud.sdk.css.v1.model.CreateClusterRequest;
import com.huaweicloud.sdk.css.v1.model.CreateClusterResponse;
import com.huaweicloud.sdk.css.v1.model.CreateClustersTagsRequest;
import com.huaweicloud.sdk.css.v1.model.CreateClustersTagsResponse;
import com.huaweicloud.sdk.css.v1.model.CreateCnfRequest;
import com.huaweicloud.sdk.css.v1.model.CreateCnfResponse;
import com.huaweicloud.sdk.css.v1.model.CreateElbListenerRequest;
import com.huaweicloud.sdk.css.v1.model.CreateElbListenerResponse;
import com.huaweicloud.sdk.css.v1.model.CreateLoadIkThesaurusRequest;
import com.huaweicloud.sdk.css.v1.model.CreateLoadIkThesaurusResponse;
import com.huaweicloud.sdk.css.v1.model.CreateLogBackupRequest;
import com.huaweicloud.sdk.css.v1.model.CreateLogBackupResponse;
import com.huaweicloud.sdk.css.v1.model.CreateSnapshotRequest;
import com.huaweicloud.sdk.css.v1.model.CreateSnapshotResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteAiOpsRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteAiOpsResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteClusterRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteClusterResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteClustersTagsRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteClustersTagsResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteConfRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteConfResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteConfigRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteConfigResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteIkThesaurusRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteIkThesaurusResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteSnapshotRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteSnapshotResponse;
import com.huaweicloud.sdk.css.v1.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.css.v1.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.css.v1.model.DownloadCertRequest;
import com.huaweicloud.sdk.css.v1.model.DownloadCertResponse;
import com.huaweicloud.sdk.css.v1.model.EnableOrDisableElbRequest;
import com.huaweicloud.sdk.css.v1.model.EnableOrDisableElbResponse;
import com.huaweicloud.sdk.css.v1.model.ListActionsRequest;
import com.huaweicloud.sdk.css.v1.model.ListActionsResponse;
import com.huaweicloud.sdk.css.v1.model.ListAiOpsRequest;
import com.huaweicloud.sdk.css.v1.model.ListAiOpsResponse;
import com.huaweicloud.sdk.css.v1.model.ListCertsRequest;
import com.huaweicloud.sdk.css.v1.model.ListCertsResponse;
import com.huaweicloud.sdk.css.v1.model.ListClustersDetailsRequest;
import com.huaweicloud.sdk.css.v1.model.ListClustersDetailsResponse;
import com.huaweicloud.sdk.css.v1.model.ListClustersTagsRequest;
import com.huaweicloud.sdk.css.v1.model.ListClustersTagsResponse;
import com.huaweicloud.sdk.css.v1.model.ListConfsRequest;
import com.huaweicloud.sdk.css.v1.model.ListConfsResponse;
import com.huaweicloud.sdk.css.v1.model.ListElbCertsRequest;
import com.huaweicloud.sdk.css.v1.model.ListElbCertsResponse;
import com.huaweicloud.sdk.css.v1.model.ListElbsRequest;
import com.huaweicloud.sdk.css.v1.model.ListElbsResponse;
import com.huaweicloud.sdk.css.v1.model.ListFlavorsRequest;
import com.huaweicloud.sdk.css.v1.model.ListFlavorsResponse;
import com.huaweicloud.sdk.css.v1.model.ListImagesRequest;
import com.huaweicloud.sdk.css.v1.model.ListImagesResponse;
import com.huaweicloud.sdk.css.v1.model.ListLogsJobRequest;
import com.huaweicloud.sdk.css.v1.model.ListLogsJobResponse;
import com.huaweicloud.sdk.css.v1.model.ListPipelinesRequest;
import com.huaweicloud.sdk.css.v1.model.ListPipelinesResponse;
import com.huaweicloud.sdk.css.v1.model.ListSmnTopicsRequest;
import com.huaweicloud.sdk.css.v1.model.ListSmnTopicsResponse;
import com.huaweicloud.sdk.css.v1.model.ListSnapshotsRequest;
import com.huaweicloud.sdk.css.v1.model.ListSnapshotsResponse;
import com.huaweicloud.sdk.css.v1.model.ListTemplatesRequest;
import com.huaweicloud.sdk.css.v1.model.ListTemplatesResponse;
import com.huaweicloud.sdk.css.v1.model.ListYmlsJobRequest;
import com.huaweicloud.sdk.css.v1.model.ListYmlsJobResponse;
import com.huaweicloud.sdk.css.v1.model.ListYmlsRequest;
import com.huaweicloud.sdk.css.v1.model.ListYmlsResponse;
import com.huaweicloud.sdk.css.v1.model.ResetPasswordRequest;
import com.huaweicloud.sdk.css.v1.model.ResetPasswordResponse;
import com.huaweicloud.sdk.css.v1.model.RestartClusterRequest;
import com.huaweicloud.sdk.css.v1.model.RestartClusterResponse;
import com.huaweicloud.sdk.css.v1.model.RestoreSnapshotRequest;
import com.huaweicloud.sdk.css.v1.model.RestoreSnapshotResponse;
import com.huaweicloud.sdk.css.v1.model.RetryUpgradeTaskRequest;
import com.huaweicloud.sdk.css.v1.model.RetryUpgradeTaskResponse;
import com.huaweicloud.sdk.css.v1.model.ShowAutoCreatePolicyRequest;
import com.huaweicloud.sdk.css.v1.model.ShowAutoCreatePolicyResponse;
import com.huaweicloud.sdk.css.v1.model.ShowClusterDetailRequest;
import com.huaweicloud.sdk.css.v1.model.ShowClusterDetailResponse;
import com.huaweicloud.sdk.css.v1.model.ShowClusterTagRequest;
import com.huaweicloud.sdk.css.v1.model.ShowClusterTagResponse;
import com.huaweicloud.sdk.css.v1.model.ShowElbDetailRequest;
import com.huaweicloud.sdk.css.v1.model.ShowElbDetailResponse;
import com.huaweicloud.sdk.css.v1.model.ShowGetConfDetailRequest;
import com.huaweicloud.sdk.css.v1.model.ShowGetConfDetailResponse;
import com.huaweicloud.sdk.css.v1.model.ShowGetLogSettingRequest;
import com.huaweicloud.sdk.css.v1.model.ShowGetLogSettingResponse;
import com.huaweicloud.sdk.css.v1.model.ShowIkThesaurusRequest;
import com.huaweicloud.sdk.css.v1.model.ShowIkThesaurusResponse;
import com.huaweicloud.sdk.css.v1.model.ShowLogBackupRequest;
import com.huaweicloud.sdk.css.v1.model.ShowLogBackupResponse;
import com.huaweicloud.sdk.css.v1.model.ShowVpcepConnectionRequest;
import com.huaweicloud.sdk.css.v1.model.ShowVpcepConnectionResponse;
import com.huaweicloud.sdk.css.v1.model.StartAutoSettingRequest;
import com.huaweicloud.sdk.css.v1.model.StartAutoSettingResponse;
import com.huaweicloud.sdk.css.v1.model.StartConnectivityTestRequest;
import com.huaweicloud.sdk.css.v1.model.StartConnectivityTestResponse;
import com.huaweicloud.sdk.css.v1.model.StartKibanaPublicRequest;
import com.huaweicloud.sdk.css.v1.model.StartKibanaPublicResponse;
import com.huaweicloud.sdk.css.v1.model.StartLogAutoBackupPolicyRequest;
import com.huaweicloud.sdk.css.v1.model.StartLogAutoBackupPolicyResponse;
import com.huaweicloud.sdk.css.v1.model.StartLogsRequest;
import com.huaweicloud.sdk.css.v1.model.StartLogsResponse;
import com.huaweicloud.sdk.css.v1.model.StartPipelineRequest;
import com.huaweicloud.sdk.css.v1.model.StartPipelineResponse;
import com.huaweicloud.sdk.css.v1.model.StartPublicWhitelistRequest;
import com.huaweicloud.sdk.css.v1.model.StartPublicWhitelistResponse;
import com.huaweicloud.sdk.css.v1.model.StartTargetClusterConnectivityTestRequest;
import com.huaweicloud.sdk.css.v1.model.StartTargetClusterConnectivityTestResponse;
import com.huaweicloud.sdk.css.v1.model.StartVpecpRequest;
import com.huaweicloud.sdk.css.v1.model.StartVpecpResponse;
import com.huaweicloud.sdk.css.v1.model.StopHotPipelineRequest;
import com.huaweicloud.sdk.css.v1.model.StopHotPipelineResponse;
import com.huaweicloud.sdk.css.v1.model.StopLogAutoBackupPolicyRequest;
import com.huaweicloud.sdk.css.v1.model.StopLogAutoBackupPolicyResponse;
import com.huaweicloud.sdk.css.v1.model.StopLogsRequest;
import com.huaweicloud.sdk.css.v1.model.StopLogsResponse;
import com.huaweicloud.sdk.css.v1.model.StopPipelineRequest;
import com.huaweicloud.sdk.css.v1.model.StopPipelineResponse;
import com.huaweicloud.sdk.css.v1.model.StopPublicKibanaWhitelistRequest;
import com.huaweicloud.sdk.css.v1.model.StopPublicKibanaWhitelistResponse;
import com.huaweicloud.sdk.css.v1.model.StopPublicWhitelistRequest;
import com.huaweicloud.sdk.css.v1.model.StopPublicWhitelistResponse;
import com.huaweicloud.sdk.css.v1.model.StopSnapshotRequest;
import com.huaweicloud.sdk.css.v1.model.StopSnapshotResponse;
import com.huaweicloud.sdk.css.v1.model.StopVpecpRequest;
import com.huaweicloud.sdk.css.v1.model.StopVpecpResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateAlterKibanaRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateAlterKibanaResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateAzByInstanceTypeRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateAzByInstanceTypeResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateBatchClustersTagsRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateBatchClustersTagsResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateCloseKibanaRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateCloseKibanaResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateClusterNameRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateClusterNameResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateCnfRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateCnfResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateEsListenerRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateEsListenerResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateExtendClusterRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateExtendClusterResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateExtendInstanceStorageRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateExtendInstanceStorageResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateFlavorByTypeRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateFlavorByTypeResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateFlavorRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateFlavorResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateLogSettingRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateLogSettingResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateOndemandClusterToPeriodRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateOndemandClusterToPeriodResponse;
import com.huaweicloud.sdk.css.v1.model.UpdatePublicBandWidthRequest;
import com.huaweicloud.sdk.css.v1.model.UpdatePublicBandWidthResponse;
import com.huaweicloud.sdk.css.v1.model.UpdatePublicKibanaWhitelistRequest;
import com.huaweicloud.sdk.css.v1.model.UpdatePublicKibanaWhitelistResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateShrinkClusterRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateShrinkClusterResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateShrinkNodesRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateShrinkNodesResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateSnapshotSettingRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateSnapshotSettingResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateUnbindPublicRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateUnbindPublicResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateVpcepConnectionRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateVpcepConnectionResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateVpcepWhitelistRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateVpcepWhitelistResponse;
import com.huaweicloud.sdk.css.v1.model.UpdateYmlsRequest;
import com.huaweicloud.sdk.css.v1.model.UpdateYmlsResponse;
import com.huaweicloud.sdk.css.v1.model.UpgradeCoreRequest;
import com.huaweicloud.sdk.css.v1.model.UpgradeCoreResponse;
import com.huaweicloud.sdk.css.v1.model.UpgradeDetailRequest;
import com.huaweicloud.sdk.css.v1.model.UpgradeDetailResponse;

public class CssClient {

    protected HcClient hcClient;

    public CssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CssClient> newBuilder() {
        ClientBuilder<CssClient> clientBuilder = new ClientBuilder<>(CssClient::new);
        return clientBuilder;
    }

    /**
     * 添加独立master、client
     *
     * 由于集群数据面业务的增长或者不确定性，很难在一开始就能够把集群的规模形态想明白，该接口能够在非独立master和client的集群上面独立master、client角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIndependentNodeRequest 请求对象
     * @return AddIndependentNodeResponse
     */
    public AddIndependentNodeResponse addIndependentNode(AddIndependentNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.addIndependentNode);
    }

    /**
     * 添加独立master、client
     *
     * 由于集群数据面业务的增长或者不确定性，很难在一开始就能够把集群的规模形态想明白，该接口能够在非独立master和client的集群上面独立master、client角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIndependentNodeRequest 请求对象
     * @return SyncInvoker<AddIndependentNodeRequest, AddIndependentNodeResponse>
     */
    public SyncInvoker<AddIndependentNodeRequest, AddIndependentNodeResponse> addIndependentNodeInvoker(
        AddIndependentNodeRequest request) {
        return new SyncInvoker<>(request, CssMeta.addIndependentNode, hcClient);
    }

    /**
     * 安全模式修改
     *
     * 该接口用于切换集群的安全模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeModeRequest 请求对象
     * @return ChangeModeResponse
     */
    public ChangeModeResponse changeMode(ChangeModeRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.changeMode);
    }

    /**
     * 安全模式修改
     *
     * 该接口用于切换集群的安全模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeModeRequest 请求对象
     * @return SyncInvoker<ChangeModeRequest, ChangeModeResponse>
     */
    public SyncInvoker<ChangeModeRequest, ChangeModeResponse> changeModeInvoker(ChangeModeRequest request) {
        return new SyncInvoker<>(request, CssMeta.changeMode, hcClient);
    }

    /**
     * 切换安全组
     *
     * 该接口可以在集群创建成功后，修改安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return ChangeSecurityGroupResponse
     */
    public ChangeSecurityGroupResponse changeSecurityGroup(ChangeSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.changeSecurityGroup);
    }

    /**
     * 切换安全组
     *
     * 该接口可以在集群创建成功后，修改安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>
     */
    public SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroupInvoker(
        ChangeSecurityGroupRequest request) {
        return new SyncInvoker<>(request, CssMeta.changeSecurityGroup, hcClient);
    }

    /**
     * 创建一次集群检测任务
     *
     * 该接口用于创建一个集群检测任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAiOpsRequest 请求对象
     * @return CreateAiOpsResponse
     */
    public CreateAiOpsResponse createAiOps(CreateAiOpsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createAiOps);
    }

    /**
     * 创建一次集群检测任务
     *
     * 该接口用于创建一个集群检测任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAiOpsRequest 请求对象
     * @return SyncInvoker<CreateAiOpsRequest, CreateAiOpsResponse>
     */
    public SyncInvoker<CreateAiOpsRequest, CreateAiOpsResponse> createAiOpsInvoker(CreateAiOpsRequest request) {
        return new SyncInvoker<>(request, CssMeta.createAiOps, hcClient);
    }

    /**
     * 设置自动创建快照策略
     *
     * 该接口用于设置自动创建快照，默认一天创建一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoCreatePolicyRequest 请求对象
     * @return CreateAutoCreatePolicyResponse
     */
    public CreateAutoCreatePolicyResponse createAutoCreatePolicy(CreateAutoCreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createAutoCreatePolicy);
    }

    /**
     * 设置自动创建快照策略
     *
     * 该接口用于设置自动创建快照，默认一天创建一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoCreatePolicyRequest 请求对象
     * @return SyncInvoker<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse>
     */
    public SyncInvoker<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse> createAutoCreatePolicyInvoker(
        CreateAutoCreatePolicyRequest request) {
        return new SyncInvoker<>(request, CssMeta.createAutoCreatePolicy, hcClient);
    }

    /**
     * 开启公网访问
     *
     * 该接口用于开启公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBindPublicRequest 请求对象
     * @return CreateBindPublicResponse
     */
    public CreateBindPublicResponse createBindPublic(CreateBindPublicRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createBindPublic);
    }

    /**
     * 开启公网访问
     *
     * 该接口用于开启公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBindPublicRequest 请求对象
     * @return SyncInvoker<CreateBindPublicRequest, CreateBindPublicResponse>
     */
    public SyncInvoker<CreateBindPublicRequest, CreateBindPublicResponse> createBindPublicInvoker(
        CreateBindPublicRequest request) {
        return new SyncInvoker<>(request, CssMeta.createBindPublic, hcClient);
    }

    /**
     * 创建集群
     *
     * 该接口用于创建集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createCluster);
    }

    /**
     * 创建集群
     *
     * 该接口用于创建集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<>(request, CssMeta.createCluster, hcClient);
    }

    /**
     * 添加指定集群标签
     *
     * 该接口用于给指定集群添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClustersTagsRequest 请求对象
     * @return CreateClustersTagsResponse
     */
    public CreateClustersTagsResponse createClustersTags(CreateClustersTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createClustersTags);
    }

    /**
     * 添加指定集群标签
     *
     * 该接口用于给指定集群添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClustersTagsRequest 请求对象
     * @return SyncInvoker<CreateClustersTagsRequest, CreateClustersTagsResponse>
     */
    public SyncInvoker<CreateClustersTagsRequest, CreateClustersTagsResponse> createClustersTagsInvoker(
        CreateClustersTagsRequest request) {
        return new SyncInvoker<>(request, CssMeta.createClustersTags, hcClient);
    }

    /**
     * es监听器配置。
     *
     * 该接口用于es监听器配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateElbListenerRequest 请求对象
     * @return CreateElbListenerResponse
     */
    public CreateElbListenerResponse createElbListener(CreateElbListenerRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createElbListener);
    }

    /**
     * es监听器配置。
     *
     * 该接口用于es监听器配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateElbListenerRequest 请求对象
     * @return SyncInvoker<CreateElbListenerRequest, CreateElbListenerResponse>
     */
    public SyncInvoker<CreateElbListenerRequest, CreateElbListenerResponse> createElbListenerInvoker(
        CreateElbListenerRequest request) {
        return new SyncInvoker<>(request, CssMeta.createElbListener, hcClient);
    }

    /**
     * 加载自定义词库
     *
     * 该接口用于加载存放于OBS的自定义词库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoadIkThesaurusRequest 请求对象
     * @return CreateLoadIkThesaurusResponse
     */
    public CreateLoadIkThesaurusResponse createLoadIkThesaurus(CreateLoadIkThesaurusRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createLoadIkThesaurus);
    }

    /**
     * 加载自定义词库
     *
     * 该接口用于加载存放于OBS的自定义词库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoadIkThesaurusRequest 请求对象
     * @return SyncInvoker<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse>
     */
    public SyncInvoker<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse> createLoadIkThesaurusInvoker(
        CreateLoadIkThesaurusRequest request) {
        return new SyncInvoker<>(request, CssMeta.createLoadIkThesaurus, hcClient);
    }

    /**
     * 备份日志
     *
     * 该接口用于备份日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogBackupRequest 请求对象
     * @return CreateLogBackupResponse
     */
    public CreateLogBackupResponse createLogBackup(CreateLogBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createLogBackup);
    }

    /**
     * 备份日志
     *
     * 该接口用于备份日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogBackupRequest 请求对象
     * @return SyncInvoker<CreateLogBackupRequest, CreateLogBackupResponse>
     */
    public SyncInvoker<CreateLogBackupRequest, CreateLogBackupResponse> createLogBackupInvoker(
        CreateLogBackupRequest request) {
        return new SyncInvoker<>(request, CssMeta.createLogBackup, hcClient);
    }

    /**
     * 手动创建快照
     *
     * 该接口用于手动创建一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotRequest 请求对象
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createSnapshot);
    }

    /**
     * 手动创建快照
     *
     * 该接口用于手动创建一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotRequest 请求对象
     * @return SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>
     */
    public SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotInvoker(
        CreateSnapshotRequest request) {
        return new SyncInvoker<>(request, CssMeta.createSnapshot, hcClient);
    }

    /**
     * 删除一个检测任务记录
     *
     * 该接口用于删除一个检测任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAiOpsRequest 请求对象
     * @return DeleteAiOpsResponse
     */
    public DeleteAiOpsResponse deleteAiOps(DeleteAiOpsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteAiOps);
    }

    /**
     * 删除一个检测任务记录
     *
     * 该接口用于删除一个检测任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAiOpsRequest 请求对象
     * @return SyncInvoker<DeleteAiOpsRequest, DeleteAiOpsResponse>
     */
    public SyncInvoker<DeleteAiOpsRequest, DeleteAiOpsResponse> deleteAiOpsInvoker(DeleteAiOpsRequest request) {
        return new SyncInvoker<>(request, CssMeta.deleteAiOps, hcClient);
    }

    /**
     * 删除集群
     *
     * 此接口用于删除集群。集群删除将释放此集群的所有资源，包括客户数据。如果需要保留客户集群数据，建议在删除集群前先创建快照。
     * 
     * &gt;此接口亦可用于包年/包月集群退订。公安冻结的集群不能删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 此接口用于删除集群。集群删除将释放此集群的所有资源，包括客户数据。如果需要保留客户集群数据，建议在删除集群前先创建快照。
     * 
     * &gt;此接口亦可用于包年/包月集群退订。公安冻结的集群不能删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<>(request, CssMeta.deleteCluster, hcClient);
    }

    /**
     * 删除集群标签
     *
     * 此接口用于删除集群标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClustersTagsRequest 请求对象
     * @return DeleteClustersTagsResponse
     */
    public DeleteClustersTagsResponse deleteClustersTags(DeleteClustersTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteClustersTags);
    }

    /**
     * 删除集群标签
     *
     * 此接口用于删除集群标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClustersTagsRequest 请求对象
     * @return SyncInvoker<DeleteClustersTagsRequest, DeleteClustersTagsResponse>
     */
    public SyncInvoker<DeleteClustersTagsRequest, DeleteClustersTagsResponse> deleteClustersTagsInvoker(
        DeleteClustersTagsRequest request) {
        return new SyncInvoker<>(request, CssMeta.deleteClustersTags, hcClient);
    }

    /**
     * 删除自定义词库
     *
     * 该接口用于删除自定义词库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIkThesaurusRequest 请求对象
     * @return DeleteIkThesaurusResponse
     */
    public DeleteIkThesaurusResponse deleteIkThesaurus(DeleteIkThesaurusRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteIkThesaurus);
    }

    /**
     * 删除自定义词库
     *
     * 该接口用于删除自定义词库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIkThesaurusRequest 请求对象
     * @return SyncInvoker<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse>
     */
    public SyncInvoker<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse> deleteIkThesaurusInvoker(
        DeleteIkThesaurusRequest request) {
        return new SyncInvoker<>(request, CssMeta.deleteIkThesaurus, hcClient);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotRequest 请求对象
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteSnapshot);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>
     */
    public SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotInvoker(
        DeleteSnapshotRequest request) {
        return new SyncInvoker<>(request, CssMeta.deleteSnapshot, hcClient);
    }

    /**
     * 下载安全证书
     *
     * 该接口用于下载安全证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCertRequest 请求对象
     * @return DownloadCertResponse
     */
    public DownloadCertResponse downloadCert(DownloadCertRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.downloadCert);
    }

    /**
     * 下载安全证书
     *
     * 该接口用于下载安全证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCertRequest 请求对象
     * @return SyncInvoker<DownloadCertRequest, DownloadCertResponse>
     */
    public SyncInvoker<DownloadCertRequest, DownloadCertResponse> downloadCertInvoker(DownloadCertRequest request) {
        return new SyncInvoker<>(request, CssMeta.downloadCert, hcClient);
    }

    /**
     * 打开或关闭es负载均衡器
     *
     * 该接口打开或关闭es负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableOrDisableElbRequest 请求对象
     * @return EnableOrDisableElbResponse
     */
    public EnableOrDisableElbResponse enableOrDisableElb(EnableOrDisableElbRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.enableOrDisableElb);
    }

    /**
     * 打开或关闭es负载均衡器
     *
     * 该接口打开或关闭es负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableOrDisableElbRequest 请求对象
     * @return SyncInvoker<EnableOrDisableElbRequest, EnableOrDisableElbResponse>
     */
    public SyncInvoker<EnableOrDisableElbRequest, EnableOrDisableElbResponse> enableOrDisableElbInvoker(
        EnableOrDisableElbRequest request) {
        return new SyncInvoker<>(request, CssMeta.enableOrDisableElb, hcClient);
    }

    /**
     * 获取智能运维任务列表及详情
     *
     * 该接口用于获取智能运维任务列表及详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAiOpsRequest 请求对象
     * @return ListAiOpsResponse
     */
    public ListAiOpsResponse listAiOps(ListAiOpsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listAiOps);
    }

    /**
     * 获取智能运维任务列表及详情
     *
     * 该接口用于获取智能运维任务列表及详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAiOpsRequest 请求对象
     * @return SyncInvoker<ListAiOpsRequest, ListAiOpsResponse>
     */
    public SyncInvoker<ListAiOpsRequest, ListAiOpsResponse> listAiOpsInvoker(ListAiOpsRequest request) {
        return new SyncInvoker<>(request, CssMeta.listAiOps, hcClient);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表以及集群的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersDetailsRequest 请求对象
     * @return ListClustersDetailsResponse
     */
    public ListClustersDetailsResponse listClustersDetails(ListClustersDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listClustersDetails);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表以及集群的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersDetailsRequest 请求对象
     * @return SyncInvoker<ListClustersDetailsRequest, ListClustersDetailsResponse>
     */
    public SyncInvoker<ListClustersDetailsRequest, ListClustersDetailsResponse> listClustersDetailsInvoker(
        ListClustersDetailsRequest request) {
        return new SyncInvoker<>(request, CssMeta.listClustersDetails, hcClient);
    }

    /**
     * 查询所有标签
     *
     * 该接口用于查询指定region下的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersTagsRequest 请求对象
     * @return ListClustersTagsResponse
     */
    public ListClustersTagsResponse listClustersTags(ListClustersTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listClustersTags);
    }

    /**
     * 查询所有标签
     *
     * 该接口用于查询指定region下的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersTagsRequest 请求对象
     * @return SyncInvoker<ListClustersTagsRequest, ListClustersTagsResponse>
     */
    public SyncInvoker<ListClustersTagsRequest, ListClustersTagsResponse> listClustersTagsInvoker(
        ListClustersTagsRequest request) {
        return new SyncInvoker<>(request, CssMeta.listClustersTags, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 该接口用于查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListElbCertsRequest 请求对象
     * @return ListElbCertsResponse
     */
    public ListElbCertsResponse listElbCerts(ListElbCertsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listElbCerts);
    }

    /**
     * 查询证书列表
     *
     * 该接口用于查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListElbCertsRequest 请求对象
     * @return SyncInvoker<ListElbCertsRequest, ListElbCertsResponse>
     */
    public SyncInvoker<ListElbCertsRequest, ListElbCertsResponse> listElbCertsInvoker(ListElbCertsRequest request) {
        return new SyncInvoker<>(request, CssMeta.listElbCerts, hcClient);
    }

    /**
     * 查询集群支持的elbv3负载均衡器
     *
     * 展示查询集群支持的elbv3负载均衡器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListElbsRequest 请求对象
     * @return ListElbsResponse
     */
    public ListElbsResponse listElbs(ListElbsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listElbs);
    }

    /**
     * 查询集群支持的elbv3负载均衡器
     *
     * 展示查询集群支持的elbv3负载均衡器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListElbsRequest 请求对象
     * @return SyncInvoker<ListElbsRequest, ListElbsResponse>
     */
    public SyncInvoker<ListElbsRequest, ListElbsResponse> listElbsInvoker(ListElbsRequest request) {
        return new SyncInvoker<>(request, CssMeta.listElbs, hcClient);
    }

    /**
     * 获取实例规格列表
     *
     * 该接口用于查询并显示支持的实例规格对应的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listFlavors);
    }

    /**
     * 获取实例规格列表
     *
     * 该接口用于查询并显示支持的实例规格对应的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<>(request, CssMeta.listFlavors, hcClient);
    }

    /**
     * 获取目标镜像ID
     *
     * 该接口用于获取当前集群的可升级目标镜像ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesRequest 请求对象
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listImages);
    }

    /**
     * 获取目标镜像ID
     *
     * 该接口用于获取当前集群的可升级目标镜像ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesRequest 请求对象
     * @return SyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public SyncInvoker<ListImagesRequest, ListImagesResponse> listImagesInvoker(ListImagesRequest request) {
        return new SyncInvoker<>(request, CssMeta.listImages, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 该接口用于查询具体某个集群的日志任务记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsJobRequest 请求对象
     * @return ListLogsJobResponse
     */
    public ListLogsJobResponse listLogsJob(ListLogsJobRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listLogsJob);
    }

    /**
     * 查询作业列表
     *
     * 该接口用于查询具体某个集群的日志任务记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsJobRequest 请求对象
     * @return SyncInvoker<ListLogsJobRequest, ListLogsJobResponse>
     */
    public SyncInvoker<ListLogsJobRequest, ListLogsJobResponse> listLogsJobInvoker(ListLogsJobRequest request) {
        return new SyncInvoker<>(request, CssMeta.listLogsJob, hcClient);
    }

    /**
     * 获取智能运维告警可用的SMN主题
     *
     * 该接口用于获取智能运维告警可用的SMN主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmnTopicsRequest 请求对象
     * @return ListSmnTopicsResponse
     */
    public ListSmnTopicsResponse listSmnTopics(ListSmnTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listSmnTopics);
    }

    /**
     * 获取智能运维告警可用的SMN主题
     *
     * 该接口用于获取智能运维告警可用的SMN主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmnTopicsRequest 请求对象
     * @return SyncInvoker<ListSmnTopicsRequest, ListSmnTopicsResponse>
     */
    public SyncInvoker<ListSmnTopicsRequest, ListSmnTopicsResponse> listSmnTopicsInvoker(ListSmnTopicsRequest request) {
        return new SyncInvoker<>(request, CssMeta.listSmnTopics, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询集群的所有快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listSnapshots);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询集群的所有快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsInvoker(ListSnapshotsRequest request) {
        return new SyncInvoker<>(request, CssMeta.listSnapshots, hcClient);
    }

    /**
     * 获取参数配置列表
     *
     * 该接口用于获取当前集群现有的参数配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListYmlsRequest 请求对象
     * @return ListYmlsResponse
     */
    public ListYmlsResponse listYmls(ListYmlsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listYmls);
    }

    /**
     * 获取参数配置列表
     *
     * 该接口用于获取当前集群现有的参数配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListYmlsRequest 请求对象
     * @return SyncInvoker<ListYmlsRequest, ListYmlsResponse>
     */
    public SyncInvoker<ListYmlsRequest, ListYmlsResponse> listYmlsInvoker(ListYmlsRequest request) {
        return new SyncInvoker<>(request, CssMeta.listYmls, hcClient);
    }

    /**
     * 获取参数配置任务列表
     *
     * 该接口可获取参数配置的任务操作列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListYmlsJobRequest 请求对象
     * @return ListYmlsJobResponse
     */
    public ListYmlsJobResponse listYmlsJob(ListYmlsJobRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listYmlsJob);
    }

    /**
     * 获取参数配置任务列表
     *
     * 该接口可获取参数配置的任务操作列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListYmlsJobRequest 请求对象
     * @return SyncInvoker<ListYmlsJobRequest, ListYmlsJobResponse>
     */
    public SyncInvoker<ListYmlsJobRequest, ListYmlsJobResponse> listYmlsJobInvoker(ListYmlsJobRequest request) {
        return new SyncInvoker<>(request, CssMeta.listYmlsJob, hcClient);
    }

    /**
     * 修改密码
     *
     * 该接口用于修改集群密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.resetPassword);
    }

    /**
     * 修改密码
     *
     * 该接口用于修改集群密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<>(request, CssMeta.resetPassword, hcClient);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群，重启集群将导致业务中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
     * @return RestartClusterResponse
     */
    public RestartClusterResponse restartCluster(RestartClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.restartCluster);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群，重启集群将导致业务中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
     * @return SyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public SyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterInvoker(
        RestartClusterRequest request) {
        return new SyncInvoker<>(request, CssMeta.restartCluster, hcClient);
    }

    /**
     * 恢复快照
     *
     * 该接口用于手动恢复一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreSnapshotRequest 请求对象
     * @return RestoreSnapshotResponse
     */
    public RestoreSnapshotResponse restoreSnapshot(RestoreSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.restoreSnapshot);
    }

    /**
     * 恢复快照
     *
     * 该接口用于手动恢复一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreSnapshotRequest 请求对象
     * @return SyncInvoker<RestoreSnapshotRequest, RestoreSnapshotResponse>
     */
    public SyncInvoker<RestoreSnapshotRequest, RestoreSnapshotResponse> restoreSnapshotInvoker(
        RestoreSnapshotRequest request) {
        return new SyncInvoker<>(request, CssMeta.restoreSnapshot, hcClient);
    }

    /**
     * 重试升级失败任务
     *
     * 由于升级过程时间较长，可能由于网络等原因导致升级失败，可以通过该接口重试该任务或终止该任务的影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryUpgradeTaskRequest 请求对象
     * @return RetryUpgradeTaskResponse
     */
    public RetryUpgradeTaskResponse retryUpgradeTask(RetryUpgradeTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.retryUpgradeTask);
    }

    /**
     * 重试升级失败任务
     *
     * 由于升级过程时间较长，可能由于网络等原因导致升级失败，可以通过该接口重试该任务或终止该任务的影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryUpgradeTaskRequest 请求对象
     * @return SyncInvoker<RetryUpgradeTaskRequest, RetryUpgradeTaskResponse>
     */
    public SyncInvoker<RetryUpgradeTaskRequest, RetryUpgradeTaskResponse> retryUpgradeTaskInvoker(
        RetryUpgradeTaskRequest request) {
        return new SyncInvoker<>(request, CssMeta.retryUpgradeTask, hcClient);
    }

    /**
     * 查询自动创建快照的策略
     *
     * 该接口用于查询自动创建快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoCreatePolicyRequest 请求对象
     * @return ShowAutoCreatePolicyResponse
     */
    public ShowAutoCreatePolicyResponse showAutoCreatePolicy(ShowAutoCreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showAutoCreatePolicy);
    }

    /**
     * 查询自动创建快照的策略
     *
     * 该接口用于查询自动创建快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoCreatePolicyRequest 请求对象
     * @return SyncInvoker<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse>
     */
    public SyncInvoker<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse> showAutoCreatePolicyInvoker(
        ShowAutoCreatePolicyRequest request) {
        return new SyncInvoker<>(request, CssMeta.showAutoCreatePolicy, hcClient);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询并显示单个集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterDetailRequest 请求对象
     * @return ShowClusterDetailResponse
     */
    public ShowClusterDetailResponse showClusterDetail(ShowClusterDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showClusterDetail);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询并显示单个集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterDetailRequest 请求对象
     * @return SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>
     */
    public SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetailInvoker(
        ShowClusterDetailRequest request) {
        return new SyncInvoker<>(request, CssMeta.showClusterDetail, hcClient);
    }

    /**
     * 查询指定集群的标签
     *
     * 该接口用于查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterTagRequest 请求对象
     * @return ShowClusterTagResponse
     */
    public ShowClusterTagResponse showClusterTag(ShowClusterTagRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showClusterTag);
    }

    /**
     * 查询指定集群的标签
     *
     * 该接口用于查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterTagRequest 请求对象
     * @return SyncInvoker<ShowClusterTagRequest, ShowClusterTagResponse>
     */
    public SyncInvoker<ShowClusterTagRequest, ShowClusterTagResponse> showClusterTagInvoker(
        ShowClusterTagRequest request) {
        return new SyncInvoker<>(request, CssMeta.showClusterTag, hcClient);
    }

    /**
     * 获取该esELB的信息，以及页面需要展示健康检查状态
     *
     * 该接口用于获取该esELB的信息，以及页面需要展示健康检查状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowElbDetailRequest 请求对象
     * @return ShowElbDetailResponse
     */
    public ShowElbDetailResponse showElbDetail(ShowElbDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showElbDetail);
    }

    /**
     * 获取该esELB的信息，以及页面需要展示健康检查状态
     *
     * 该接口用于获取该esELB的信息，以及页面需要展示健康检查状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowElbDetailRequest 请求对象
     * @return SyncInvoker<ShowElbDetailRequest, ShowElbDetailResponse>
     */
    public SyncInvoker<ShowElbDetailRequest, ShowElbDetailResponse> showElbDetailInvoker(ShowElbDetailRequest request) {
        return new SyncInvoker<>(request, CssMeta.showElbDetail, hcClient);
    }

    /**
     * 查询日志基础配置
     *
     * 该接口用于日志基础配置查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetLogSettingRequest 请求对象
     * @return ShowGetLogSettingResponse
     */
    public ShowGetLogSettingResponse showGetLogSetting(ShowGetLogSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showGetLogSetting);
    }

    /**
     * 查询日志基础配置
     *
     * 该接口用于日志基础配置查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetLogSettingRequest 请求对象
     * @return SyncInvoker<ShowGetLogSettingRequest, ShowGetLogSettingResponse>
     */
    public SyncInvoker<ShowGetLogSettingRequest, ShowGetLogSettingResponse> showGetLogSettingInvoker(
        ShowGetLogSettingRequest request) {
        return new SyncInvoker<>(request, CssMeta.showGetLogSetting, hcClient);
    }

    /**
     * 查询自定义词库状态
     *
     * 该接口用于查询自定义词库的加载状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIkThesaurusRequest 请求对象
     * @return ShowIkThesaurusResponse
     */
    public ShowIkThesaurusResponse showIkThesaurus(ShowIkThesaurusRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showIkThesaurus);
    }

    /**
     * 查询自定义词库状态
     *
     * 该接口用于查询自定义词库的加载状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIkThesaurusRequest 请求对象
     * @return SyncInvoker<ShowIkThesaurusRequest, ShowIkThesaurusResponse>
     */
    public SyncInvoker<ShowIkThesaurusRequest, ShowIkThesaurusResponse> showIkThesaurusInvoker(
        ShowIkThesaurusRequest request) {
        return new SyncInvoker<>(request, CssMeta.showIkThesaurus, hcClient);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogBackupRequest 请求对象
     * @return ShowLogBackupResponse
     */
    public ShowLogBackupResponse showLogBackup(ShowLogBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showLogBackup);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogBackupRequest 请求对象
     * @return SyncInvoker<ShowLogBackupRequest, ShowLogBackupResponse>
     */
    public SyncInvoker<ShowLogBackupRequest, ShowLogBackupResponse> showLogBackupInvoker(ShowLogBackupRequest request) {
        return new SyncInvoker<>(request, CssMeta.showLogBackup, hcClient);
    }

    /**
     * 获取终端节点连接
     *
     * 该接口用于获取终端节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcepConnectionRequest 请求对象
     * @return ShowVpcepConnectionResponse
     */
    public ShowVpcepConnectionResponse showVpcepConnection(ShowVpcepConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showVpcepConnection);
    }

    /**
     * 获取终端节点连接
     *
     * 该接口用于获取终端节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcepConnectionRequest 请求对象
     * @return SyncInvoker<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse>
     */
    public SyncInvoker<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse> showVpcepConnectionInvoker(
        ShowVpcepConnectionRequest request) {
        return new SyncInvoker<>(request, CssMeta.showVpcepConnection, hcClient);
    }

    /**
     * 自动设置集群快照的基础配置（不推荐使用）
     *
     * 该接口用于自动设置集群快照的基础配置，包括配置OBS桶和IAM委托。
     * 
     * 
     * - “OBS桶”：快照存储的OBS桶位置。
     * 
     * - “备份路径”：快照在OBS桶中的存放路径。
     * 
     * - “IAM委托”：由于需要将快照保存在OBS中，所以需要在IAM中设置对应的委托获取对OBS服务的授权。
     * 
     * &gt;自动设置集群快照接口将会自动创建快照OBS桶和委托。如果有多个集群，每个集群使用这个接口都会创建一个不一样的OBS桶，可能会导致OBS的配额不够，较多的OBS桶也难以维护。建议可以直接使用[修改集群快照的基础配置](UpdateSnapshotSetting.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAutoSettingRequest 请求对象
     * @return StartAutoSettingResponse
     */
    public StartAutoSettingResponse startAutoSetting(StartAutoSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startAutoSetting);
    }

    /**
     * 自动设置集群快照的基础配置（不推荐使用）
     *
     * 该接口用于自动设置集群快照的基础配置，包括配置OBS桶和IAM委托。
     * 
     * 
     * - “OBS桶”：快照存储的OBS桶位置。
     * 
     * - “备份路径”：快照在OBS桶中的存放路径。
     * 
     * - “IAM委托”：由于需要将快照保存在OBS中，所以需要在IAM中设置对应的委托获取对OBS服务的授权。
     * 
     * &gt;自动设置集群快照接口将会自动创建快照OBS桶和委托。如果有多个集群，每个集群使用这个接口都会创建一个不一样的OBS桶，可能会导致OBS的配额不够，较多的OBS桶也难以维护。建议可以直接使用[修改集群快照的基础配置](UpdateSnapshotSetting.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAutoSettingRequest 请求对象
     * @return SyncInvoker<StartAutoSettingRequest, StartAutoSettingResponse>
     */
    public SyncInvoker<StartAutoSettingRequest, StartAutoSettingResponse> startAutoSettingInvoker(
        StartAutoSettingRequest request) {
        return new SyncInvoker<>(request, CssMeta.startAutoSetting, hcClient);
    }

    /**
     * 开启日志自动备份策略
     *
     * 该接口用于日志自动备份策略开启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartLogAutoBackupPolicyRequest 请求对象
     * @return StartLogAutoBackupPolicyResponse
     */
    public StartLogAutoBackupPolicyResponse startLogAutoBackupPolicy(StartLogAutoBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startLogAutoBackupPolicy);
    }

    /**
     * 开启日志自动备份策略
     *
     * 该接口用于日志自动备份策略开启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartLogAutoBackupPolicyRequest 请求对象
     * @return SyncInvoker<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse>
     */
    public SyncInvoker<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse> startLogAutoBackupPolicyInvoker(
        StartLogAutoBackupPolicyRequest request) {
        return new SyncInvoker<>(request, CssMeta.startLogAutoBackupPolicy, hcClient);
    }

    /**
     * 开启日志功能
     *
     * 该接口用于开启日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartLogsRequest 请求对象
     * @return StartLogsResponse
     */
    public StartLogsResponse startLogs(StartLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startLogs);
    }

    /**
     * 开启日志功能
     *
     * 该接口用于开启日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartLogsRequest 请求对象
     * @return SyncInvoker<StartLogsRequest, StartLogsResponse>
     */
    public SyncInvoker<StartLogsRequest, StartLogsResponse> startLogsInvoker(StartLogsRequest request) {
        return new SyncInvoker<>(request, CssMeta.startLogs, hcClient);
    }

    /**
     * 开启公网访问控制白名单
     *
     * 该接口用于开启公网访问控制白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPublicWhitelistRequest 请求对象
     * @return StartPublicWhitelistResponse
     */
    public StartPublicWhitelistResponse startPublicWhitelist(StartPublicWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startPublicWhitelist);
    }

    /**
     * 开启公网访问控制白名单
     *
     * 该接口用于开启公网访问控制白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPublicWhitelistRequest 请求对象
     * @return SyncInvoker<StartPublicWhitelistRequest, StartPublicWhitelistResponse>
     */
    public SyncInvoker<StartPublicWhitelistRequest, StartPublicWhitelistResponse> startPublicWhitelistInvoker(
        StartPublicWhitelistRequest request) {
        return new SyncInvoker<>(request, CssMeta.startPublicWhitelist, hcClient);
    }

    /**
     * 连通性测试。
     *
     * 该接口用于连通性测试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTargetClusterConnectivityTestRequest 请求对象
     * @return StartTargetClusterConnectivityTestResponse
     */
    public StartTargetClusterConnectivityTestResponse startTargetClusterConnectivityTest(
        StartTargetClusterConnectivityTestRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startTargetClusterConnectivityTest);
    }

    /**
     * 连通性测试。
     *
     * 该接口用于连通性测试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTargetClusterConnectivityTestRequest 请求对象
     * @return SyncInvoker<StartTargetClusterConnectivityTestRequest, StartTargetClusterConnectivityTestResponse>
     */
    public SyncInvoker<StartTargetClusterConnectivityTestRequest, StartTargetClusterConnectivityTestResponse> startTargetClusterConnectivityTestInvoker(
        StartTargetClusterConnectivityTestRequest request) {
        return new SyncInvoker<>(request, CssMeta.startTargetClusterConnectivityTest, hcClient);
    }

    /**
     * 开启终端节点服务
     *
     * 该接口用于开启终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartVpecpRequest 请求对象
     * @return StartVpecpResponse
     */
    public StartVpecpResponse startVpecp(StartVpecpRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startVpecp);
    }

    /**
     * 开启终端节点服务
     *
     * 该接口用于开启终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartVpecpRequest 请求对象
     * @return SyncInvoker<StartVpecpRequest, StartVpecpResponse>
     */
    public SyncInvoker<StartVpecpRequest, StartVpecpResponse> startVpecpInvoker(StartVpecpRequest request) {
        return new SyncInvoker<>(request, CssMeta.startVpecp, hcClient);
    }

    /**
     * 关闭日志自动备份策略
     *
     * 该接口用于日志自动备份策略关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopLogAutoBackupPolicyRequest 请求对象
     * @return StopLogAutoBackupPolicyResponse
     */
    public StopLogAutoBackupPolicyResponse stopLogAutoBackupPolicy(StopLogAutoBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopLogAutoBackupPolicy);
    }

    /**
     * 关闭日志自动备份策略
     *
     * 该接口用于日志自动备份策略关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopLogAutoBackupPolicyRequest 请求对象
     * @return SyncInvoker<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse>
     */
    public SyncInvoker<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse> stopLogAutoBackupPolicyInvoker(
        StopLogAutoBackupPolicyRequest request) {
        return new SyncInvoker<>(request, CssMeta.stopLogAutoBackupPolicy, hcClient);
    }

    /**
     * 关闭日志功能
     *
     * 该接口用于关闭日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopLogsRequest 请求对象
     * @return StopLogsResponse
     */
    public StopLogsResponse stopLogs(StopLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopLogs);
    }

    /**
     * 关闭日志功能
     *
     * 该接口用于关闭日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopLogsRequest 请求对象
     * @return SyncInvoker<StopLogsRequest, StopLogsResponse>
     */
    public SyncInvoker<StopLogsRequest, StopLogsResponse> stopLogsInvoker(StopLogsRequest request) {
        return new SyncInvoker<>(request, CssMeta.stopLogs, hcClient);
    }

    /**
     * 关闭公网访问控制白名单
     *
     * 该接口用于关闭公网访问控制白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPublicWhitelistRequest 请求对象
     * @return StopPublicWhitelistResponse
     */
    public StopPublicWhitelistResponse stopPublicWhitelist(StopPublicWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopPublicWhitelist);
    }

    /**
     * 关闭公网访问控制白名单
     *
     * 该接口用于关闭公网访问控制白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPublicWhitelistRequest 请求对象
     * @return SyncInvoker<StopPublicWhitelistRequest, StopPublicWhitelistResponse>
     */
    public SyncInvoker<StopPublicWhitelistRequest, StopPublicWhitelistResponse> stopPublicWhitelistInvoker(
        StopPublicWhitelistRequest request) {
        return new SyncInvoker<>(request, CssMeta.stopPublicWhitelist, hcClient);
    }

    /**
     * 停用快照功能
     *
     * 该接口用于停用快照功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSnapshotRequest 请求对象
     * @return StopSnapshotResponse
     */
    public StopSnapshotResponse stopSnapshot(StopSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopSnapshot);
    }

    /**
     * 停用快照功能
     *
     * 该接口用于停用快照功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSnapshotRequest 请求对象
     * @return SyncInvoker<StopSnapshotRequest, StopSnapshotResponse>
     */
    public SyncInvoker<StopSnapshotRequest, StopSnapshotResponse> stopSnapshotInvoker(StopSnapshotRequest request) {
        return new SyncInvoker<>(request, CssMeta.stopSnapshot, hcClient);
    }

    /**
     * 关闭终端节点服务
     *
     * 该接口用于关闭终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopVpecpRequest 请求对象
     * @return StopVpecpResponse
     */
    public StopVpecpResponse stopVpecp(StopVpecpRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopVpecp);
    }

    /**
     * 关闭终端节点服务
     *
     * 该接口用于关闭终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopVpecpRequest 请求对象
     * @return SyncInvoker<StopVpecpRequest, StopVpecpResponse>
     */
    public SyncInvoker<StopVpecpRequest, StopVpecpResponse> stopVpecpInvoker(StopVpecpRequest request) {
        return new SyncInvoker<>(request, CssMeta.stopVpecp, hcClient);
    }

    /**
     * 切换集群实例AZ
     *
     * 该接口通过指定节点类型切换AZ。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAzByInstanceTypeRequest 请求对象
     * @return UpdateAzByInstanceTypeResponse
     */
    public UpdateAzByInstanceTypeResponse updateAzByInstanceType(UpdateAzByInstanceTypeRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateAzByInstanceType);
    }

    /**
     * 切换集群实例AZ
     *
     * 该接口通过指定节点类型切换AZ。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAzByInstanceTypeRequest 请求对象
     * @return SyncInvoker<UpdateAzByInstanceTypeRequest, UpdateAzByInstanceTypeResponse>
     */
    public SyncInvoker<UpdateAzByInstanceTypeRequest, UpdateAzByInstanceTypeResponse> updateAzByInstanceTypeInvoker(
        UpdateAzByInstanceTypeRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateAzByInstanceType, hcClient);
    }

    /**
     * 批量添加或删除集群标签
     *
     * 该接口用于对集群批量添加或删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchClustersTagsRequest 请求对象
     * @return UpdateBatchClustersTagsResponse
     */
    public UpdateBatchClustersTagsResponse updateBatchClustersTags(UpdateBatchClustersTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateBatchClustersTags);
    }

    /**
     * 批量添加或删除集群标签
     *
     * 该接口用于对集群批量添加或删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchClustersTagsRequest 请求对象
     * @return SyncInvoker<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse>
     */
    public SyncInvoker<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse> updateBatchClustersTagsInvoker(
        UpdateBatchClustersTagsRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateBatchClustersTags, hcClient);
    }

    /**
     * 修改集群名称
     *
     * 该接口用于修改集群名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterNameRequest 请求对象
     * @return UpdateClusterNameResponse
     */
    public UpdateClusterNameResponse updateClusterName(UpdateClusterNameRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateClusterName);
    }

    /**
     * 修改集群名称
     *
     * 该接口用于修改集群名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterNameRequest 请求对象
     * @return SyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse>
     */
    public SyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse> updateClusterNameInvoker(
        UpdateClusterNameRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateClusterName, hcClient);
    }

    /**
     * 更新es监听器
     *
     * 该接口用于更新es监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEsListenerRequest 请求对象
     * @return UpdateEsListenerResponse
     */
    public UpdateEsListenerResponse updateEsListener(UpdateEsListenerRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateEsListener);
    }

    /**
     * 更新es监听器
     *
     * 该接口用于更新es监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEsListenerRequest 请求对象
     * @return SyncInvoker<UpdateEsListenerRequest, UpdateEsListenerResponse>
     */
    public SyncInvoker<UpdateEsListenerRequest, UpdateEsListenerResponse> updateEsListenerInvoker(
        UpdateEsListenerRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateEsListener, hcClient);
    }

    /**
     * 扩容集群
     *
     * 该接口用于集群扩容实例（仅支持扩容elasticsearch实例）。只扩容普通节点，且只针对要扩容的集群实例不存在特殊节点（Master、Client、冷数据节点）的情况。
     * 
     * 集群扩容实例的数量和存储容量，请参考[扩容实例的数量和存储容量](UpdateExtendInstanceStorage.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExtendClusterRequest 请求对象
     * @return UpdateExtendClusterResponse
     */
    public UpdateExtendClusterResponse updateExtendCluster(UpdateExtendClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateExtendCluster);
    }

    /**
     * 扩容集群
     *
     * 该接口用于集群扩容实例（仅支持扩容elasticsearch实例）。只扩容普通节点，且只针对要扩容的集群实例不存在特殊节点（Master、Client、冷数据节点）的情况。
     * 
     * 集群扩容实例的数量和存储容量，请参考[扩容实例的数量和存储容量](UpdateExtendInstanceStorage.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExtendClusterRequest 请求对象
     * @return SyncInvoker<UpdateExtendClusterRequest, UpdateExtendClusterResponse>
     */
    public SyncInvoker<UpdateExtendClusterRequest, UpdateExtendClusterResponse> updateExtendClusterInvoker(
        UpdateExtendClusterRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateExtendCluster, hcClient);
    }

    /**
     * 扩容实例的数量和存储容量
     *
     * 该接口用于集群扩容不同类型实例的个数以及存储容量。已经存在独立Master、Client、冷数据节点的集群使用该接口扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExtendInstanceStorageRequest 请求对象
     * @return UpdateExtendInstanceStorageResponse
     */
    public UpdateExtendInstanceStorageResponse updateExtendInstanceStorage(UpdateExtendInstanceStorageRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateExtendInstanceStorage);
    }

    /**
     * 扩容实例的数量和存储容量
     *
     * 该接口用于集群扩容不同类型实例的个数以及存储容量。已经存在独立Master、Client、冷数据节点的集群使用该接口扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExtendInstanceStorageRequest 请求对象
     * @return SyncInvoker<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse>
     */
    public SyncInvoker<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse> updateExtendInstanceStorageInvoker(
        UpdateExtendInstanceStorageRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateExtendInstanceStorage, hcClient);
    }

    /**
     * 变更规格
     *
     * 该接口用于变更集群规格。只支持变更ess节点类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlavorRequest 请求对象
     * @return UpdateFlavorResponse
     */
    public UpdateFlavorResponse updateFlavor(UpdateFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateFlavor);
    }

    /**
     * 变更规格
     *
     * 该接口用于变更集群规格。只支持变更ess节点类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlavorRequest 请求对象
     * @return SyncInvoker<UpdateFlavorRequest, UpdateFlavorResponse>
     */
    public SyncInvoker<UpdateFlavorRequest, UpdateFlavorResponse> updateFlavorInvoker(UpdateFlavorRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateFlavor, hcClient);
    }

    /**
     * 指定节点类型规格变更
     *
     * 修改集群规格。支持修改:
     * - ess： 数据节点。
     * - ess-cold: 冷数据节点。
     * - ess-client: Client节点。
     * - ess-master: Master节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlavorByTypeRequest 请求对象
     * @return UpdateFlavorByTypeResponse
     */
    public UpdateFlavorByTypeResponse updateFlavorByType(UpdateFlavorByTypeRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateFlavorByType);
    }

    /**
     * 指定节点类型规格变更
     *
     * 修改集群规格。支持修改:
     * - ess： 数据节点。
     * - ess-cold: 冷数据节点。
     * - ess-client: Client节点。
     * - ess-master: Master节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlavorByTypeRequest 请求对象
     * @return SyncInvoker<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse>
     */
    public SyncInvoker<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse> updateFlavorByTypeInvoker(
        UpdateFlavorByTypeRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateFlavorByType, hcClient);
    }

    /**
     * 节点替换
     *
     * 该接口用于替换失败节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateInstance);
    }

    /**
     * 节点替换
     *
     * 该接口用于替换失败节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateInstance, hcClient);
    }

    /**
     * 修改日志基础配置
     *
     * 该接口用于修改日志基础配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogSettingRequest 请求对象
     * @return UpdateLogSettingResponse
     */
    public UpdateLogSettingResponse updateLogSetting(UpdateLogSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateLogSetting);
    }

    /**
     * 修改日志基础配置
     *
     * 该接口用于修改日志基础配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogSettingRequest 请求对象
     * @return SyncInvoker<UpdateLogSettingRequest, UpdateLogSettingResponse>
     */
    public SyncInvoker<UpdateLogSettingRequest, UpdateLogSettingResponse> updateLogSettingInvoker(
        UpdateLogSettingRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateLogSetting, hcClient);
    }

    /**
     * 按需集群转包周期
     *
     * 该接口用于按需集群转包周期集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOndemandClusterToPeriodRequest 请求对象
     * @return UpdateOndemandClusterToPeriodResponse
     */
    public UpdateOndemandClusterToPeriodResponse updateOndemandClusterToPeriod(
        UpdateOndemandClusterToPeriodRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateOndemandClusterToPeriod);
    }

    /**
     * 按需集群转包周期
     *
     * 该接口用于按需集群转包周期集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOndemandClusterToPeriodRequest 请求对象
     * @return SyncInvoker<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse>
     */
    public SyncInvoker<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse> updateOndemandClusterToPeriodInvoker(
        UpdateOndemandClusterToPeriodRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateOndemandClusterToPeriod, hcClient);
    }

    /**
     * 修改公网访问带宽
     *
     * 该接口用于修改公网访问带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicBandWidthRequest 请求对象
     * @return UpdatePublicBandWidthResponse
     */
    public UpdatePublicBandWidthResponse updatePublicBandWidth(UpdatePublicBandWidthRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updatePublicBandWidth);
    }

    /**
     * 修改公网访问带宽
     *
     * 该接口用于修改公网访问带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicBandWidthRequest 请求对象
     * @return SyncInvoker<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse>
     */
    public SyncInvoker<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse> updatePublicBandWidthInvoker(
        UpdatePublicBandWidthRequest request) {
        return new SyncInvoker<>(request, CssMeta.updatePublicBandWidth, hcClient);
    }

    /**
     * 指定节点类型缩容
     *
     * 该接口用于集群对不同类型实例的个数以及存储容量进行缩容。包周期类型的集群不支持通过api进行指定节点类型缩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShrinkClusterRequest 请求对象
     * @return UpdateShrinkClusterResponse
     */
    public UpdateShrinkClusterResponse updateShrinkCluster(UpdateShrinkClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateShrinkCluster);
    }

    /**
     * 指定节点类型缩容
     *
     * 该接口用于集群对不同类型实例的个数以及存储容量进行缩容。包周期类型的集群不支持通过api进行指定节点类型缩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShrinkClusterRequest 请求对象
     * @return SyncInvoker<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse>
     */
    public SyncInvoker<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse> updateShrinkClusterInvoker(
        UpdateShrinkClusterRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateShrinkCluster, hcClient);
    }

    /**
     * 指定节点缩容
     *
     * 该接口可以对集群现有节点中指定节点进行缩容。包周期类型的集群不支持通过api进行指定节点缩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShrinkNodesRequest 请求对象
     * @return UpdateShrinkNodesResponse
     */
    public UpdateShrinkNodesResponse updateShrinkNodes(UpdateShrinkNodesRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateShrinkNodes);
    }

    /**
     * 指定节点缩容
     *
     * 该接口可以对集群现有节点中指定节点进行缩容。包周期类型的集群不支持通过api进行指定节点缩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShrinkNodesRequest 请求对象
     * @return SyncInvoker<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse>
     */
    public SyncInvoker<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse> updateShrinkNodesInvoker(
        UpdateShrinkNodesRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateShrinkNodes, hcClient);
    }

    /**
     * 修改集群快照的基础配置
     *
     * 该接口用于修改集群快照的基础配置，可修改OBS桶和IAM委托。
     * 
     * 可以使用该接口开启快照功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotSettingRequest 请求对象
     * @return UpdateSnapshotSettingResponse
     */
    public UpdateSnapshotSettingResponse updateSnapshotSetting(UpdateSnapshotSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateSnapshotSetting);
    }

    /**
     * 修改集群快照的基础配置
     *
     * 该接口用于修改集群快照的基础配置，可修改OBS桶和IAM委托。
     * 
     * 可以使用该接口开启快照功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotSettingRequest 请求对象
     * @return SyncInvoker<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse>
     */
    public SyncInvoker<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse> updateSnapshotSettingInvoker(
        UpdateSnapshotSettingRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateSnapshotSetting, hcClient);
    }

    /**
     * 关闭公网访问
     *
     * 该接口用于关闭公网访问。包周期类型的集群不支持通过api进行关闭公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUnbindPublicRequest 请求对象
     * @return UpdateUnbindPublicResponse
     */
    public UpdateUnbindPublicResponse updateUnbindPublic(UpdateUnbindPublicRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateUnbindPublic);
    }

    /**
     * 关闭公网访问
     *
     * 该接口用于关闭公网访问。包周期类型的集群不支持通过api进行关闭公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUnbindPublicRequest 请求对象
     * @return SyncInvoker<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse>
     */
    public SyncInvoker<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse> updateUnbindPublicInvoker(
        UpdateUnbindPublicRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateUnbindPublic, hcClient);
    }

    /**
     * 更新终端节点连接
     *
     * 该接口用于更新终端节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcepConnectionRequest 请求对象
     * @return UpdateVpcepConnectionResponse
     */
    public UpdateVpcepConnectionResponse updateVpcepConnection(UpdateVpcepConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateVpcepConnection);
    }

    /**
     * 更新终端节点连接
     *
     * 该接口用于更新终端节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcepConnectionRequest 请求对象
     * @return SyncInvoker<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse>
     */
    public SyncInvoker<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse> updateVpcepConnectionInvoker(
        UpdateVpcepConnectionRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateVpcepConnection, hcClient);
    }

    /**
     * 修改终端节点服务白名单
     *
     * 该接口用于修改终端节点服务白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcepWhitelistRequest 请求对象
     * @return UpdateVpcepWhitelistResponse
     */
    public UpdateVpcepWhitelistResponse updateVpcepWhitelist(UpdateVpcepWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateVpcepWhitelist);
    }

    /**
     * 修改终端节点服务白名单
     *
     * 该接口用于修改终端节点服务白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcepWhitelistRequest 请求对象
     * @return SyncInvoker<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse>
     */
    public SyncInvoker<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse> updateVpcepWhitelistInvoker(
        UpdateVpcepWhitelistRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateVpcepWhitelist, hcClient);
    }

    /**
     * 修改参数配置
     *
     * 该接口用于修改参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateYmlsRequest 请求对象
     * @return UpdateYmlsResponse
     */
    public UpdateYmlsResponse updateYmls(UpdateYmlsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateYmls);
    }

    /**
     * 修改参数配置
     *
     * 该接口用于修改参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateYmlsRequest 请求对象
     * @return SyncInvoker<UpdateYmlsRequest, UpdateYmlsResponse>
     */
    public SyncInvoker<UpdateYmlsRequest, UpdateYmlsResponse> updateYmlsInvoker(UpdateYmlsRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateYmls, hcClient);
    }

    /**
     * 集群内核升级
     *
     * 该接口用于将低版本的ES升级到高版本或同版本ES。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeCoreRequest 请求对象
     * @return UpgradeCoreResponse
     */
    public UpgradeCoreResponse upgradeCore(UpgradeCoreRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.upgradeCore);
    }

    /**
     * 集群内核升级
     *
     * 该接口用于将低版本的ES升级到高版本或同版本ES。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeCoreRequest 请求对象
     * @return SyncInvoker<UpgradeCoreRequest, UpgradeCoreResponse>
     */
    public SyncInvoker<UpgradeCoreRequest, UpgradeCoreResponse> upgradeCoreInvoker(UpgradeCoreRequest request) {
        return new SyncInvoker<>(request, CssMeta.upgradeCore, hcClient);
    }

    /**
     * 获取升级详情信息
     *
     * 由于升级过程时间较长，该接口可以展示当前升级（切换AZ）节点的各个阶段信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDetailRequest 请求对象
     * @return UpgradeDetailResponse
     */
    public UpgradeDetailResponse upgradeDetail(UpgradeDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.upgradeDetail);
    }

    /**
     * 获取升级详情信息
     *
     * 由于升级过程时间较长，该接口可以展示当前升级（切换AZ）节点的各个阶段信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDetailRequest 请求对象
     * @return SyncInvoker<UpgradeDetailRequest, UpgradeDetailResponse>
     */
    public SyncInvoker<UpgradeDetailRequest, UpgradeDetailResponse> upgradeDetailInvoker(UpgradeDetailRequest request) {
        return new SyncInvoker<>(request, CssMeta.upgradeDetail, hcClient);
    }

    /**
     * 开启Kibana公网访问
     *
     * 该接口用于开启Kibana公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartKibanaPublicRequest 请求对象
     * @return StartKibanaPublicResponse
     */
    public StartKibanaPublicResponse startKibanaPublic(StartKibanaPublicRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startKibanaPublic);
    }

    /**
     * 开启Kibana公网访问
     *
     * 该接口用于开启Kibana公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartKibanaPublicRequest 请求对象
     * @return SyncInvoker<StartKibanaPublicRequest, StartKibanaPublicResponse>
     */
    public SyncInvoker<StartKibanaPublicRequest, StartKibanaPublicResponse> startKibanaPublicInvoker(
        StartKibanaPublicRequest request) {
        return new SyncInvoker<>(request, CssMeta.startKibanaPublic, hcClient);
    }

    /**
     * 关闭Kibana公网访问控制
     *
     * 该接口用于关闭Kibana公网访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPublicKibanaWhitelistRequest 请求对象
     * @return StopPublicKibanaWhitelistResponse
     */
    public StopPublicKibanaWhitelistResponse stopPublicKibanaWhitelist(StopPublicKibanaWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopPublicKibanaWhitelist);
    }

    /**
     * 关闭Kibana公网访问控制
     *
     * 该接口用于关闭Kibana公网访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPublicKibanaWhitelistRequest 请求对象
     * @return SyncInvoker<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse>
     */
    public SyncInvoker<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse> stopPublicKibanaWhitelistInvoker(
        StopPublicKibanaWhitelistRequest request) {
        return new SyncInvoker<>(request, CssMeta.stopPublicKibanaWhitelist, hcClient);
    }

    /**
     * 修改Kibana公网带宽
     *
     * 该接口用于修改Kibana公网带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlterKibanaRequest 请求对象
     * @return UpdateAlterKibanaResponse
     */
    public UpdateAlterKibanaResponse updateAlterKibana(UpdateAlterKibanaRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateAlterKibana);
    }

    /**
     * 修改Kibana公网带宽
     *
     * 该接口用于修改Kibana公网带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlterKibanaRequest 请求对象
     * @return SyncInvoker<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse>
     */
    public SyncInvoker<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse> updateAlterKibanaInvoker(
        UpdateAlterKibanaRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateAlterKibana, hcClient);
    }

    /**
     * 关闭Kibana公网访问
     *
     * 该接口用于关闭Kibana公网访问。包周期类型集群不支持通过api进行关闭Kibana公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCloseKibanaRequest 请求对象
     * @return UpdateCloseKibanaResponse
     */
    public UpdateCloseKibanaResponse updateCloseKibana(UpdateCloseKibanaRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateCloseKibana);
    }

    /**
     * 关闭Kibana公网访问
     *
     * 该接口用于关闭Kibana公网访问。包周期类型集群不支持通过api进行关闭Kibana公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCloseKibanaRequest 请求对象
     * @return SyncInvoker<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse>
     */
    public SyncInvoker<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse> updateCloseKibanaInvoker(
        UpdateCloseKibanaRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateCloseKibana, hcClient);
    }

    /**
     * 修改Kibana公网访问控制
     *
     * 该接口通过修改kibana白名单，修改kibana的访问权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicKibanaWhitelistRequest 请求对象
     * @return UpdatePublicKibanaWhitelistResponse
     */
    public UpdatePublicKibanaWhitelistResponse updatePublicKibanaWhitelist(UpdatePublicKibanaWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updatePublicKibanaWhitelist);
    }

    /**
     * 修改Kibana公网访问控制
     *
     * 该接口通过修改kibana白名单，修改kibana的访问权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicKibanaWhitelistRequest 请求对象
     * @return SyncInvoker<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse>
     */
    public SyncInvoker<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse> updatePublicKibanaWhitelistInvoker(
        UpdatePublicKibanaWhitelistRequest request) {
        return new SyncInvoker<>(request, CssMeta.updatePublicKibanaWhitelist, hcClient);
    }

    /**
     * 添加到自定义模板
     *
     * 该接口用于添加到自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFavoriteRequest 请求对象
     * @return AddFavoriteResponse
     */
    public AddFavoriteResponse addFavorite(AddFavoriteRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.addFavorite);
    }

    /**
     * 添加到自定义模板
     *
     * 该接口用于添加到自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFavoriteRequest 请求对象
     * @return SyncInvoker<AddFavoriteRequest, AddFavoriteResponse>
     */
    public SyncInvoker<AddFavoriteRequest, AddFavoriteResponse> addFavoriteInvoker(AddFavoriteRequest request) {
        return new SyncInvoker<>(request, CssMeta.addFavorite, hcClient);
    }

    /**
     * 创建配置文件
     *
     * 该接口用于创建配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCnfRequest 请求对象
     * @return CreateCnfResponse
     */
    public CreateCnfResponse createCnf(CreateCnfRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createCnf);
    }

    /**
     * 创建配置文件
     *
     * 该接口用于创建配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCnfRequest 请求对象
     * @return SyncInvoker<CreateCnfRequest, CreateCnfResponse>
     */
    public SyncInvoker<CreateCnfRequest, CreateCnfResponse> createCnfInvoker(CreateCnfRequest request) {
        return new SyncInvoker<>(request, CssMeta.createCnf, hcClient);
    }

    /**
     * 删除配置文件
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfRequest 请求对象
     * @return DeleteConfResponse
     */
    public DeleteConfResponse deleteConf(DeleteConfRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteConf);
    }

    /**
     * 删除配置文件
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfRequest 请求对象
     * @return SyncInvoker<DeleteConfRequest, DeleteConfResponse>
     */
    public SyncInvoker<DeleteConfRequest, DeleteConfResponse> deleteConfInvoker(DeleteConfRequest request) {
        return new SyncInvoker<>(request, CssMeta.deleteConf, hcClient);
    }

    /**
     * 删除配置文件V2
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigRequest 请求对象
     * @return DeleteConfigResponse
     */
    public DeleteConfigResponse deleteConfig(DeleteConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteConfig);
    }

    /**
     * 删除配置文件V2
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigRequest 请求对象
     * @return SyncInvoker<DeleteConfigRequest, DeleteConfigResponse>
     */
    public SyncInvoker<DeleteConfigRequest, DeleteConfigResponse> deleteConfigInvoker(DeleteConfigRequest request) {
        return new SyncInvoker<>(request, CssMeta.deleteConfig, hcClient);
    }

    /**
     * 删除自定义模板
     *
     * 该接口用于删除自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteTemplate);
    }

    /**
     * 删除自定义模板
     *
     * 该接口用于删除自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<>(request, CssMeta.deleteTemplate, hcClient);
    }

    /**
     * 查询操作记录
     *
     * 该接口用于查询操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActionsRequest 请求对象
     * @return ListActionsResponse
     */
    public ListActionsResponse listActions(ListActionsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listActions);
    }

    /**
     * 查询操作记录
     *
     * 该接口用于查询操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActionsRequest 请求对象
     * @return SyncInvoker<ListActionsRequest, ListActionsResponse>
     */
    public SyncInvoker<ListActionsRequest, ListActionsResponse> listActionsInvoker(ListActionsRequest request) {
        return new SyncInvoker<>(request, CssMeta.listActions, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 该接口用于查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertsRequest 请求对象
     * @return ListCertsResponse
     */
    public ListCertsResponse listCerts(ListCertsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listCerts);
    }

    /**
     * 查询证书列表
     *
     * 该接口用于查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertsRequest 请求对象
     * @return SyncInvoker<ListCertsRequest, ListCertsResponse>
     */
    public SyncInvoker<ListCertsRequest, ListCertsResponse> listCertsInvoker(ListCertsRequest request) {
        return new SyncInvoker<>(request, CssMeta.listCerts, hcClient);
    }

    /**
     * 查询配置文件列表
     *
     * 该接口用于查询配置文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfsRequest 请求对象
     * @return ListConfsResponse
     */
    public ListConfsResponse listConfs(ListConfsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listConfs);
    }

    /**
     * 查询配置文件列表
     *
     * 该接口用于查询配置文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfsRequest 请求对象
     * @return SyncInvoker<ListConfsRequest, ListConfsResponse>
     */
    public SyncInvoker<ListConfsRequest, ListConfsResponse> listConfsInvoker(ListConfsRequest request) {
        return new SyncInvoker<>(request, CssMeta.listConfs, hcClient);
    }

    /**
     * 查询pipeline列表
     *
     * 该接口用于查询pipeline列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipelinesRequest 请求对象
     * @return ListPipelinesResponse
     */
    public ListPipelinesResponse listPipelines(ListPipelinesRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listPipelines);
    }

    /**
     * 查询pipeline列表
     *
     * 该接口用于查询pipeline列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipelinesRequest 请求对象
     * @return SyncInvoker<ListPipelinesRequest, ListPipelinesResponse>
     */
    public SyncInvoker<ListPipelinesRequest, ListPipelinesResponse> listPipelinesInvoker(ListPipelinesRequest request) {
        return new SyncInvoker<>(request, CssMeta.listPipelines, hcClient);
    }

    /**
     * 查询模板列表
     *
     * 该接口用于查询模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listTemplates);
    }

    /**
     * 查询模板列表
     *
     * 该接口用于查询模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesInvoker(ListTemplatesRequest request) {
        return new SyncInvoker<>(request, CssMeta.listTemplates, hcClient);
    }

    /**
     * 查询配置文件内容
     *
     * 该接口用于查询配置文件内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetConfDetailRequest 请求对象
     * @return ShowGetConfDetailResponse
     */
    public ShowGetConfDetailResponse showGetConfDetail(ShowGetConfDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showGetConfDetail);
    }

    /**
     * 查询配置文件内容
     *
     * 该接口用于查询配置文件内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetConfDetailRequest 请求对象
     * @return SyncInvoker<ShowGetConfDetailRequest, ShowGetConfDetailResponse>
     */
    public SyncInvoker<ShowGetConfDetailRequest, ShowGetConfDetailResponse> showGetConfDetailInvoker(
        ShowGetConfDetailRequest request) {
        return new SyncInvoker<>(request, CssMeta.showGetConfDetail, hcClient);
    }

    /**
     * 连通性测试
     *
     * 该接口用于连通性测试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartConnectivityTestRequest 请求对象
     * @return StartConnectivityTestResponse
     */
    public StartConnectivityTestResponse startConnectivityTest(StartConnectivityTestRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startConnectivityTest);
    }

    /**
     * 连通性测试
     *
     * 该接口用于连通性测试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartConnectivityTestRequest 请求对象
     * @return SyncInvoker<StartConnectivityTestRequest, StartConnectivityTestResponse>
     */
    public SyncInvoker<StartConnectivityTestRequest, StartConnectivityTestResponse> startConnectivityTestInvoker(
        StartConnectivityTestRequest request) {
        return new SyncInvoker<>(request, CssMeta.startConnectivityTest, hcClient);
    }

    /**
     * 启动pipeline迁移数据
     *
     * 该接口用于启动pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPipelineRequest 请求对象
     * @return StartPipelineResponse
     */
    public StartPipelineResponse startPipeline(StartPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startPipeline);
    }

    /**
     * 启动pipeline迁移数据
     *
     * 该接口用于启动pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPipelineRequest 请求对象
     * @return SyncInvoker<StartPipelineRequest, StartPipelineResponse>
     */
    public SyncInvoker<StartPipelineRequest, StartPipelineResponse> startPipelineInvoker(StartPipelineRequest request) {
        return new SyncInvoker<>(request, CssMeta.startPipeline, hcClient);
    }

    /**
     * 热停止pipeline迁移数据。
     *
     * 该接口用于热停止pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopHotPipelineRequest 请求对象
     * @return StopHotPipelineResponse
     */
    public StopHotPipelineResponse stopHotPipeline(StopHotPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopHotPipeline);
    }

    /**
     * 热停止pipeline迁移数据。
     *
     * 该接口用于热停止pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopHotPipelineRequest 请求对象
     * @return SyncInvoker<StopHotPipelineRequest, StopHotPipelineResponse>
     */
    public SyncInvoker<StopHotPipelineRequest, StopHotPipelineResponse> stopHotPipelineInvoker(
        StopHotPipelineRequest request) {
        return new SyncInvoker<>(request, CssMeta.stopHotPipeline, hcClient);
    }

    /**
     * 停止pipeline迁移数据
     *
     * 该接口用于停止pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPipelineRequest 请求对象
     * @return StopPipelineResponse
     */
    public StopPipelineResponse stopPipeline(StopPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopPipeline);
    }

    /**
     * 停止pipeline迁移数据
     *
     * 该接口用于停止pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPipelineRequest 请求对象
     * @return SyncInvoker<StopPipelineRequest, StopPipelineResponse>
     */
    public SyncInvoker<StopPipelineRequest, StopPipelineResponse> stopPipelineInvoker(StopPipelineRequest request) {
        return new SyncInvoker<>(request, CssMeta.stopPipeline, hcClient);
    }

    /**
     * 更新配置文件
     *
     * 该接口用于更新配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCnfRequest 请求对象
     * @return UpdateCnfResponse
     */
    public UpdateCnfResponse updateCnf(UpdateCnfRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateCnf);
    }

    /**
     * 更新配置文件
     *
     * 该接口用于更新配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCnfRequest 请求对象
     * @return SyncInvoker<UpdateCnfRequest, UpdateCnfResponse>
     */
    public SyncInvoker<UpdateCnfRequest, UpdateCnfResponse> updateCnfInvoker(UpdateCnfRequest request) {
        return new SyncInvoker<>(request, CssMeta.updateCnf, hcClient);
    }

}
