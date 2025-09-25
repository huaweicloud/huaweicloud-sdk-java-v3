package com.huaweicloud.sdk.css.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.css.v1.model.AddFavoriteRequest;
import com.huaweicloud.sdk.css.v1.model.AddFavoriteResponse;
import com.huaweicloud.sdk.css.v1.model.AddIndependentNodeRequest;
import com.huaweicloud.sdk.css.v1.model.AddIndependentNodeResponse;
import com.huaweicloud.sdk.css.v1.model.ChangeClusterSubnetRequest;
import com.huaweicloud.sdk.css.v1.model.ChangeClusterSubnetResponse;
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

import java.util.concurrent.CompletableFuture;

public class CssAsyncClient {

    protected HcClient hcClient;

    public CssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CssAsyncClient> newBuilder() {
        ClientBuilder<CssAsyncClient> clientBuilder = new ClientBuilder<>(CssAsyncClient::new);
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
     * @return CompletableFuture<AddIndependentNodeResponse>
     */
    public CompletableFuture<AddIndependentNodeResponse> addIndependentNodeAsync(AddIndependentNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.addIndependentNode);
    }

    /**
     * 添加独立master、client
     *
     * 由于集群数据面业务的增长或者不确定性，很难在一开始就能够把集群的规模形态想明白，该接口能够在非独立master和client的集群上面独立master、client角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIndependentNodeRequest 请求对象
     * @return AsyncInvoker<AddIndependentNodeRequest, AddIndependentNodeResponse>
     */
    public AsyncInvoker<AddIndependentNodeRequest, AddIndependentNodeResponse> addIndependentNodeAsyncInvoker(
        AddIndependentNodeRequest request) {
        return new AsyncInvoker<>(request, CssMeta.addIndependentNode, hcClient);
    }

    /**
     * 切换集群子网
     *
     * 该接口可以在集群创建成功后，切换集群子网，扩容等添加节点场景下使用新子网绑定新增节点。
     * 
     * &gt;同VPC下的子网默认网络联通，请确保新子网与您业务系统的网络连通性。另：开启了自动创建ipv6地址的集群只支持切换到开启了ipv6的新子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeClusterSubnetRequest 请求对象
     * @return CompletableFuture<ChangeClusterSubnetResponse>
     */
    public CompletableFuture<ChangeClusterSubnetResponse> changeClusterSubnetAsync(ChangeClusterSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.changeClusterSubnet);
    }

    /**
     * 切换集群子网
     *
     * 该接口可以在集群创建成功后，切换集群子网，扩容等添加节点场景下使用新子网绑定新增节点。
     * 
     * &gt;同VPC下的子网默认网络联通，请确保新子网与您业务系统的网络连通性。另：开启了自动创建ipv6地址的集群只支持切换到开启了ipv6的新子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeClusterSubnetRequest 请求对象
     * @return AsyncInvoker<ChangeClusterSubnetRequest, ChangeClusterSubnetResponse>
     */
    public AsyncInvoker<ChangeClusterSubnetRequest, ChangeClusterSubnetResponse> changeClusterSubnetAsyncInvoker(
        ChangeClusterSubnetRequest request) {
        return new AsyncInvoker<>(request, CssMeta.changeClusterSubnet, hcClient);
    }

    /**
     * 安全模式修改
     *
     * 该接口用于切换集群的安全模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeModeRequest 请求对象
     * @return CompletableFuture<ChangeModeResponse>
     */
    public CompletableFuture<ChangeModeResponse> changeModeAsync(ChangeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.changeMode);
    }

    /**
     * 安全模式修改
     *
     * 该接口用于切换集群的安全模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeModeRequest 请求对象
     * @return AsyncInvoker<ChangeModeRequest, ChangeModeResponse>
     */
    public AsyncInvoker<ChangeModeRequest, ChangeModeResponse> changeModeAsyncInvoker(ChangeModeRequest request) {
        return new AsyncInvoker<>(request, CssMeta.changeMode, hcClient);
    }

    /**
     * 切换安全组
     *
     * 该接口可以在集群创建成功后，修改安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return CompletableFuture<ChangeSecurityGroupResponse>
     */
    public CompletableFuture<ChangeSecurityGroupResponse> changeSecurityGroupAsync(ChangeSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.changeSecurityGroup);
    }

    /**
     * 切换安全组
     *
     * 该接口可以在集群创建成功后，修改安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>
     */
    public AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroupAsyncInvoker(
        ChangeSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, CssMeta.changeSecurityGroup, hcClient);
    }

    /**
     * 创建一次集群检测任务
     *
     * 该接口用于创建一个集群检测任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAiOpsRequest 请求对象
     * @return CompletableFuture<CreateAiOpsResponse>
     */
    public CompletableFuture<CreateAiOpsResponse> createAiOpsAsync(CreateAiOpsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createAiOps);
    }

    /**
     * 创建一次集群检测任务
     *
     * 该接口用于创建一个集群检测任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAiOpsRequest 请求对象
     * @return AsyncInvoker<CreateAiOpsRequest, CreateAiOpsResponse>
     */
    public AsyncInvoker<CreateAiOpsRequest, CreateAiOpsResponse> createAiOpsAsyncInvoker(CreateAiOpsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.createAiOps, hcClient);
    }

    /**
     * 设置自动创建快照策略
     *
     * 该接口用于设置自动创建快照，默认一天创建一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoCreatePolicyRequest 请求对象
     * @return CompletableFuture<CreateAutoCreatePolicyResponse>
     */
    public CompletableFuture<CreateAutoCreatePolicyResponse> createAutoCreatePolicyAsync(
        CreateAutoCreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createAutoCreatePolicy);
    }

    /**
     * 设置自动创建快照策略
     *
     * 该接口用于设置自动创建快照，默认一天创建一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoCreatePolicyRequest 请求对象
     * @return AsyncInvoker<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse>
     */
    public AsyncInvoker<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse> createAutoCreatePolicyAsyncInvoker(
        CreateAutoCreatePolicyRequest request) {
        return new AsyncInvoker<>(request, CssMeta.createAutoCreatePolicy, hcClient);
    }

    /**
     * 开启公网访问
     *
     * 该接口用于开启公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBindPublicRequest 请求对象
     * @return CompletableFuture<CreateBindPublicResponse>
     */
    public CompletableFuture<CreateBindPublicResponse> createBindPublicAsync(CreateBindPublicRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createBindPublic);
    }

    /**
     * 开启公网访问
     *
     * 该接口用于开启公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBindPublicRequest 请求对象
     * @return AsyncInvoker<CreateBindPublicRequest, CreateBindPublicResponse>
     */
    public AsyncInvoker<CreateBindPublicRequest, CreateBindPublicResponse> createBindPublicAsyncInvoker(
        CreateBindPublicRequest request) {
        return new AsyncInvoker<>(request, CssMeta.createBindPublic, hcClient);
    }

    /**
     * 创建集群
     *
     * 该接口用于创建集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createCluster);
    }

    /**
     * 创建集群
     *
     * 该接口用于创建集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<>(request, CssMeta.createCluster, hcClient);
    }

    /**
     * 添加指定集群标签
     *
     * 该接口用于给指定集群添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClustersTagsRequest 请求对象
     * @return CompletableFuture<CreateClustersTagsResponse>
     */
    public CompletableFuture<CreateClustersTagsResponse> createClustersTagsAsync(CreateClustersTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createClustersTags);
    }

    /**
     * 添加指定集群标签
     *
     * 该接口用于给指定集群添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClustersTagsRequest 请求对象
     * @return AsyncInvoker<CreateClustersTagsRequest, CreateClustersTagsResponse>
     */
    public AsyncInvoker<CreateClustersTagsRequest, CreateClustersTagsResponse> createClustersTagsAsyncInvoker(
        CreateClustersTagsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.createClustersTags, hcClient);
    }

    /**
     * 集群负载均衡监听器配置。
     *
     * 该接口用于集群负载均衡监听器配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateElbListenerRequest 请求对象
     * @return CompletableFuture<CreateElbListenerResponse>
     */
    public CompletableFuture<CreateElbListenerResponse> createElbListenerAsync(CreateElbListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createElbListener);
    }

    /**
     * 集群负载均衡监听器配置。
     *
     * 该接口用于集群负载均衡监听器配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateElbListenerRequest 请求对象
     * @return AsyncInvoker<CreateElbListenerRequest, CreateElbListenerResponse>
     */
    public AsyncInvoker<CreateElbListenerRequest, CreateElbListenerResponse> createElbListenerAsyncInvoker(
        CreateElbListenerRequest request) {
        return new AsyncInvoker<>(request, CssMeta.createElbListener, hcClient);
    }

    /**
     * 加载自定义词库
     *
     * 该接口用于加载存放于OBS的自定义词库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoadIkThesaurusRequest 请求对象
     * @return CompletableFuture<CreateLoadIkThesaurusResponse>
     */
    public CompletableFuture<CreateLoadIkThesaurusResponse> createLoadIkThesaurusAsync(
        CreateLoadIkThesaurusRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createLoadIkThesaurus);
    }

    /**
     * 加载自定义词库
     *
     * 该接口用于加载存放于OBS的自定义词库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoadIkThesaurusRequest 请求对象
     * @return AsyncInvoker<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse>
     */
    public AsyncInvoker<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse> createLoadIkThesaurusAsyncInvoker(
        CreateLoadIkThesaurusRequest request) {
        return new AsyncInvoker<>(request, CssMeta.createLoadIkThesaurus, hcClient);
    }

    /**
     * 备份日志
     *
     * 该接口用于备份日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogBackupRequest 请求对象
     * @return CompletableFuture<CreateLogBackupResponse>
     */
    public CompletableFuture<CreateLogBackupResponse> createLogBackupAsync(CreateLogBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createLogBackup);
    }

    /**
     * 备份日志
     *
     * 该接口用于备份日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogBackupRequest 请求对象
     * @return AsyncInvoker<CreateLogBackupRequest, CreateLogBackupResponse>
     */
    public AsyncInvoker<CreateLogBackupRequest, CreateLogBackupResponse> createLogBackupAsyncInvoker(
        CreateLogBackupRequest request) {
        return new AsyncInvoker<>(request, CssMeta.createLogBackup, hcClient);
    }

    /**
     * 手动创建快照
     *
     * 该接口用于手动创建一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotRequest 请求对象
     * @return CompletableFuture<CreateSnapshotResponse>
     */
    public CompletableFuture<CreateSnapshotResponse> createSnapshotAsync(CreateSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createSnapshot);
    }

    /**
     * 手动创建快照
     *
     * 该接口用于手动创建一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>
     */
    public AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotAsyncInvoker(
        CreateSnapshotRequest request) {
        return new AsyncInvoker<>(request, CssMeta.createSnapshot, hcClient);
    }

    /**
     * 删除一个检测任务记录
     *
     * 该接口用于删除一个检测任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAiOpsRequest 请求对象
     * @return CompletableFuture<DeleteAiOpsResponse>
     */
    public CompletableFuture<DeleteAiOpsResponse> deleteAiOpsAsync(DeleteAiOpsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteAiOps);
    }

    /**
     * 删除一个检测任务记录
     *
     * 该接口用于删除一个检测任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAiOpsRequest 请求对象
     * @return AsyncInvoker<DeleteAiOpsRequest, DeleteAiOpsResponse>
     */
    public AsyncInvoker<DeleteAiOpsRequest, DeleteAiOpsResponse> deleteAiOpsAsyncInvoker(DeleteAiOpsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.deleteAiOps, hcClient);
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
     * @return CompletableFuture<DeleteClusterResponse>
     */
    public CompletableFuture<DeleteClusterResponse> deleteClusterAsync(DeleteClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteCluster);
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
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(
        DeleteClusterRequest request) {
        return new AsyncInvoker<>(request, CssMeta.deleteCluster, hcClient);
    }

    /**
     * 删除集群标签
     *
     * 此接口用于删除集群标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClustersTagsRequest 请求对象
     * @return CompletableFuture<DeleteClustersTagsResponse>
     */
    public CompletableFuture<DeleteClustersTagsResponse> deleteClustersTagsAsync(DeleteClustersTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteClustersTags);
    }

    /**
     * 删除集群标签
     *
     * 此接口用于删除集群标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClustersTagsRequest 请求对象
     * @return AsyncInvoker<DeleteClustersTagsRequest, DeleteClustersTagsResponse>
     */
    public AsyncInvoker<DeleteClustersTagsRequest, DeleteClustersTagsResponse> deleteClustersTagsAsyncInvoker(
        DeleteClustersTagsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.deleteClustersTags, hcClient);
    }

    /**
     * 删除自定义词库
     *
     * 该接口用于删除自定义词库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIkThesaurusRequest 请求对象
     * @return CompletableFuture<DeleteIkThesaurusResponse>
     */
    public CompletableFuture<DeleteIkThesaurusResponse> deleteIkThesaurusAsync(DeleteIkThesaurusRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteIkThesaurus);
    }

    /**
     * 删除自定义词库
     *
     * 该接口用于删除自定义词库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIkThesaurusRequest 请求对象
     * @return AsyncInvoker<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse>
     */
    public AsyncInvoker<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse> deleteIkThesaurusAsyncInvoker(
        DeleteIkThesaurusRequest request) {
        return new AsyncInvoker<>(request, CssMeta.deleteIkThesaurus, hcClient);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotRequest 请求对象
     * @return CompletableFuture<DeleteSnapshotResponse>
     */
    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshotAsync(DeleteSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteSnapshot);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>
     */
    public AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotAsyncInvoker(
        DeleteSnapshotRequest request) {
        return new AsyncInvoker<>(request, CssMeta.deleteSnapshot, hcClient);
    }

    /**
     * 下载安全证书
     *
     * 该接口用于下载安全证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCertRequest 请求对象
     * @return CompletableFuture<DownloadCertResponse>
     */
    public CompletableFuture<DownloadCertResponse> downloadCertAsync(DownloadCertRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.downloadCert);
    }

    /**
     * 下载安全证书
     *
     * 该接口用于下载安全证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCertRequest 请求对象
     * @return AsyncInvoker<DownloadCertRequest, DownloadCertResponse>
     */
    public AsyncInvoker<DownloadCertRequest, DownloadCertResponse> downloadCertAsyncInvoker(
        DownloadCertRequest request) {
        return new AsyncInvoker<>(request, CssMeta.downloadCert, hcClient);
    }

    /**
     * 为集群打开或关闭负载均衡器
     *
     * 该接口为集群打开或关闭负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableOrDisableElbRequest 请求对象
     * @return CompletableFuture<EnableOrDisableElbResponse>
     */
    public CompletableFuture<EnableOrDisableElbResponse> enableOrDisableElbAsync(EnableOrDisableElbRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.enableOrDisableElb);
    }

    /**
     * 为集群打开或关闭负载均衡器
     *
     * 该接口为集群打开或关闭负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableOrDisableElbRequest 请求对象
     * @return AsyncInvoker<EnableOrDisableElbRequest, EnableOrDisableElbResponse>
     */
    public AsyncInvoker<EnableOrDisableElbRequest, EnableOrDisableElbResponse> enableOrDisableElbAsyncInvoker(
        EnableOrDisableElbRequest request) {
        return new AsyncInvoker<>(request, CssMeta.enableOrDisableElb, hcClient);
    }

    /**
     * 获取智能运维任务列表及详情
     *
     * 该接口用于获取智能运维任务列表及详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAiOpsRequest 请求对象
     * @return CompletableFuture<ListAiOpsResponse>
     */
    public CompletableFuture<ListAiOpsResponse> listAiOpsAsync(ListAiOpsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listAiOps);
    }

    /**
     * 获取智能运维任务列表及详情
     *
     * 该接口用于获取智能运维任务列表及详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAiOpsRequest 请求对象
     * @return AsyncInvoker<ListAiOpsRequest, ListAiOpsResponse>
     */
    public AsyncInvoker<ListAiOpsRequest, ListAiOpsResponse> listAiOpsAsyncInvoker(ListAiOpsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listAiOps, hcClient);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表以及集群的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersDetailsRequest 请求对象
     * @return CompletableFuture<ListClustersDetailsResponse>
     */
    public CompletableFuture<ListClustersDetailsResponse> listClustersDetailsAsync(ListClustersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listClustersDetails);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表以及集群的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersDetailsRequest 请求对象
     * @return AsyncInvoker<ListClustersDetailsRequest, ListClustersDetailsResponse>
     */
    public AsyncInvoker<ListClustersDetailsRequest, ListClustersDetailsResponse> listClustersDetailsAsyncInvoker(
        ListClustersDetailsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listClustersDetails, hcClient);
    }

    /**
     * 查询所有标签
     *
     * 该接口用于查询指定region下的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersTagsRequest 请求对象
     * @return CompletableFuture<ListClustersTagsResponse>
     */
    public CompletableFuture<ListClustersTagsResponse> listClustersTagsAsync(ListClustersTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listClustersTags);
    }

    /**
     * 查询所有标签
     *
     * 该接口用于查询指定region下的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersTagsRequest 请求对象
     * @return AsyncInvoker<ListClustersTagsRequest, ListClustersTagsResponse>
     */
    public AsyncInvoker<ListClustersTagsRequest, ListClustersTagsResponse> listClustersTagsAsyncInvoker(
        ListClustersTagsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listClustersTags, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 该接口用于查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListElbCertsRequest 请求对象
     * @return CompletableFuture<ListElbCertsResponse>
     */
    public CompletableFuture<ListElbCertsResponse> listElbCertsAsync(ListElbCertsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listElbCerts);
    }

    /**
     * 查询证书列表
     *
     * 该接口用于查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListElbCertsRequest 请求对象
     * @return AsyncInvoker<ListElbCertsRequest, ListElbCertsResponse>
     */
    public AsyncInvoker<ListElbCertsRequest, ListElbCertsResponse> listElbCertsAsyncInvoker(
        ListElbCertsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listElbCerts, hcClient);
    }

    /**
     * 查询集群支持的elbv3负载均衡器
     *
     * 展示查询集群支持的elbv3负载均衡器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListElbsRequest 请求对象
     * @return CompletableFuture<ListElbsResponse>
     */
    public CompletableFuture<ListElbsResponse> listElbsAsync(ListElbsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listElbs);
    }

    /**
     * 查询集群支持的elbv3负载均衡器
     *
     * 展示查询集群支持的elbv3负载均衡器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListElbsRequest 请求对象
     * @return AsyncInvoker<ListElbsRequest, ListElbsResponse>
     */
    public AsyncInvoker<ListElbsRequest, ListElbsResponse> listElbsAsyncInvoker(ListElbsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listElbs, hcClient);
    }

    /**
     * 获取实例规格列表
     *
     * 该接口用于查询并显示支持的实例规格对应的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listFlavors);
    }

    /**
     * 获取实例规格列表
     *
     * 该接口用于查询并显示支持的实例规格对应的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listFlavors, hcClient);
    }

    /**
     * 获取可升级的目标镜像ID
     *
     * 该接口用于获取当前集群的可升级目标镜像ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesRequest 请求对象
     * @return CompletableFuture<ListImagesResponse>
     */
    public CompletableFuture<ListImagesResponse> listImagesAsync(ListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listImages);
    }

    /**
     * 获取可升级的目标镜像ID
     *
     * 该接口用于获取当前集群的可升级目标镜像ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesRequest 请求对象
     * @return AsyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public AsyncInvoker<ListImagesRequest, ListImagesResponse> listImagesAsyncInvoker(ListImagesRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listImages, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 该接口用于查询具体某个集群的日志任务记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsJobRequest 请求对象
     * @return CompletableFuture<ListLogsJobResponse>
     */
    public CompletableFuture<ListLogsJobResponse> listLogsJobAsync(ListLogsJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listLogsJob);
    }

    /**
     * 查询作业列表
     *
     * 该接口用于查询具体某个集群的日志任务记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsJobRequest 请求对象
     * @return AsyncInvoker<ListLogsJobRequest, ListLogsJobResponse>
     */
    public AsyncInvoker<ListLogsJobRequest, ListLogsJobResponse> listLogsJobAsyncInvoker(ListLogsJobRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listLogsJob, hcClient);
    }

    /**
     * 获取智能运维告警可用的SMN主题
     *
     * 该接口用于获取智能运维告警可用的SMN主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmnTopicsRequest 请求对象
     * @return CompletableFuture<ListSmnTopicsResponse>
     */
    public CompletableFuture<ListSmnTopicsResponse> listSmnTopicsAsync(ListSmnTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listSmnTopics);
    }

    /**
     * 获取智能运维告警可用的SMN主题
     *
     * 该接口用于获取智能运维告警可用的SMN主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmnTopicsRequest 请求对象
     * @return AsyncInvoker<ListSmnTopicsRequest, ListSmnTopicsResponse>
     */
    public AsyncInvoker<ListSmnTopicsRequest, ListSmnTopicsResponse> listSmnTopicsAsyncInvoker(
        ListSmnTopicsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listSmnTopics, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询集群的所有快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return CompletableFuture<ListSnapshotsResponse>
     */
    public CompletableFuture<ListSnapshotsResponse> listSnapshotsAsync(ListSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listSnapshots);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询集群的所有快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsAsyncInvoker(
        ListSnapshotsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listSnapshots, hcClient);
    }

    /**
     * 获取参数配置列表
     *
     * 该接口用于获取当前集群现有的参数配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListYmlsRequest 请求对象
     * @return CompletableFuture<ListYmlsResponse>
     */
    public CompletableFuture<ListYmlsResponse> listYmlsAsync(ListYmlsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listYmls);
    }

    /**
     * 获取参数配置列表
     *
     * 该接口用于获取当前集群现有的参数配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListYmlsRequest 请求对象
     * @return AsyncInvoker<ListYmlsRequest, ListYmlsResponse>
     */
    public AsyncInvoker<ListYmlsRequest, ListYmlsResponse> listYmlsAsyncInvoker(ListYmlsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listYmls, hcClient);
    }

    /**
     * 获取参数配置任务列表
     *
     * 该接口可获取参数配置的任务操作列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListYmlsJobRequest 请求对象
     * @return CompletableFuture<ListYmlsJobResponse>
     */
    public CompletableFuture<ListYmlsJobResponse> listYmlsJobAsync(ListYmlsJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listYmlsJob);
    }

    /**
     * 获取参数配置任务列表
     *
     * 该接口可获取参数配置的任务操作列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListYmlsJobRequest 请求对象
     * @return AsyncInvoker<ListYmlsJobRequest, ListYmlsJobResponse>
     */
    public AsyncInvoker<ListYmlsJobRequest, ListYmlsJobResponse> listYmlsJobAsyncInvoker(ListYmlsJobRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listYmlsJob, hcClient);
    }

    /**
     * 修改密码
     *
     * 该接口用于修改集群密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.resetPassword);
    }

    /**
     * 修改密码
     *
     * 该接口用于修改集群密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<>(request, CssMeta.resetPassword, hcClient);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群，重启集群将导致业务中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
     * @return CompletableFuture<RestartClusterResponse>
     */
    public CompletableFuture<RestartClusterResponse> restartClusterAsync(RestartClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.restartCluster);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群，重启集群将导致业务中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
     * @return AsyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public AsyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterAsyncInvoker(
        RestartClusterRequest request) {
        return new AsyncInvoker<>(request, CssMeta.restartCluster, hcClient);
    }

    /**
     * 恢复快照
     *
     * 该接口用于手动恢复一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreSnapshotRequest 请求对象
     * @return CompletableFuture<RestoreSnapshotResponse>
     */
    public CompletableFuture<RestoreSnapshotResponse> restoreSnapshotAsync(RestoreSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.restoreSnapshot);
    }

    /**
     * 恢复快照
     *
     * 该接口用于手动恢复一个快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreSnapshotRequest 请求对象
     * @return AsyncInvoker<RestoreSnapshotRequest, RestoreSnapshotResponse>
     */
    public AsyncInvoker<RestoreSnapshotRequest, RestoreSnapshotResponse> restoreSnapshotAsyncInvoker(
        RestoreSnapshotRequest request) {
        return new AsyncInvoker<>(request, CssMeta.restoreSnapshot, hcClient);
    }

    /**
     * 重试升级失败任务
     *
     * 由于升级过程时间较长，可能由于网络等原因导致升级失败，可以通过该接口重试该任务或终止该任务的影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryUpgradeTaskRequest 请求对象
     * @return CompletableFuture<RetryUpgradeTaskResponse>
     */
    public CompletableFuture<RetryUpgradeTaskResponse> retryUpgradeTaskAsync(RetryUpgradeTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.retryUpgradeTask);
    }

    /**
     * 重试升级失败任务
     *
     * 由于升级过程时间较长，可能由于网络等原因导致升级失败，可以通过该接口重试该任务或终止该任务的影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryUpgradeTaskRequest 请求对象
     * @return AsyncInvoker<RetryUpgradeTaskRequest, RetryUpgradeTaskResponse>
     */
    public AsyncInvoker<RetryUpgradeTaskRequest, RetryUpgradeTaskResponse> retryUpgradeTaskAsyncInvoker(
        RetryUpgradeTaskRequest request) {
        return new AsyncInvoker<>(request, CssMeta.retryUpgradeTask, hcClient);
    }

    /**
     * 查询自动创建快照的策略
     *
     * 该接口用于查询自动创建快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoCreatePolicyRequest 请求对象
     * @return CompletableFuture<ShowAutoCreatePolicyResponse>
     */
    public CompletableFuture<ShowAutoCreatePolicyResponse> showAutoCreatePolicyAsync(
        ShowAutoCreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showAutoCreatePolicy);
    }

    /**
     * 查询自动创建快照的策略
     *
     * 该接口用于查询自动创建快照策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoCreatePolicyRequest 请求对象
     * @return AsyncInvoker<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse>
     */
    public AsyncInvoker<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse> showAutoCreatePolicyAsyncInvoker(
        ShowAutoCreatePolicyRequest request) {
        return new AsyncInvoker<>(request, CssMeta.showAutoCreatePolicy, hcClient);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询并显示单个集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterDetailRequest 请求对象
     * @return CompletableFuture<ShowClusterDetailResponse>
     */
    public CompletableFuture<ShowClusterDetailResponse> showClusterDetailAsync(ShowClusterDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showClusterDetail);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询并显示单个集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterDetailRequest 请求对象
     * @return AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>
     */
    public AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetailAsyncInvoker(
        ShowClusterDetailRequest request) {
        return new AsyncInvoker<>(request, CssMeta.showClusterDetail, hcClient);
    }

    /**
     * 查询指定集群的标签
     *
     * 该接口用于查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterTagRequest 请求对象
     * @return CompletableFuture<ShowClusterTagResponse>
     */
    public CompletableFuture<ShowClusterTagResponse> showClusterTagAsync(ShowClusterTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showClusterTag);
    }

    /**
     * 查询指定集群的标签
     *
     * 该接口用于查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterTagRequest 请求对象
     * @return AsyncInvoker<ShowClusterTagRequest, ShowClusterTagResponse>
     */
    public AsyncInvoker<ShowClusterTagRequest, ShowClusterTagResponse> showClusterTagAsyncInvoker(
        ShowClusterTagRequest request) {
        return new AsyncInvoker<>(request, CssMeta.showClusterTag, hcClient);
    }

    /**
     * 获取集群的负载均衡器信息
     *
     * 该接口用于获取集群的负载均衡器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowElbDetailRequest 请求对象
     * @return CompletableFuture<ShowElbDetailResponse>
     */
    public CompletableFuture<ShowElbDetailResponse> showElbDetailAsync(ShowElbDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showElbDetail);
    }

    /**
     * 获取集群的负载均衡器信息
     *
     * 该接口用于获取集群的负载均衡器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowElbDetailRequest 请求对象
     * @return AsyncInvoker<ShowElbDetailRequest, ShowElbDetailResponse>
     */
    public AsyncInvoker<ShowElbDetailRequest, ShowElbDetailResponse> showElbDetailAsyncInvoker(
        ShowElbDetailRequest request) {
        return new AsyncInvoker<>(request, CssMeta.showElbDetail, hcClient);
    }

    /**
     * 查询日志基础配置
     *
     * 该接口用于日志基础配置查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetLogSettingRequest 请求对象
     * @return CompletableFuture<ShowGetLogSettingResponse>
     */
    public CompletableFuture<ShowGetLogSettingResponse> showGetLogSettingAsync(ShowGetLogSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showGetLogSetting);
    }

    /**
     * 查询日志基础配置
     *
     * 该接口用于日志基础配置查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetLogSettingRequest 请求对象
     * @return AsyncInvoker<ShowGetLogSettingRequest, ShowGetLogSettingResponse>
     */
    public AsyncInvoker<ShowGetLogSettingRequest, ShowGetLogSettingResponse> showGetLogSettingAsyncInvoker(
        ShowGetLogSettingRequest request) {
        return new AsyncInvoker<>(request, CssMeta.showGetLogSetting, hcClient);
    }

    /**
     * 查询自定义词库状态
     *
     * 该接口用于查询自定义词库的加载状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIkThesaurusRequest 请求对象
     * @return CompletableFuture<ShowIkThesaurusResponse>
     */
    public CompletableFuture<ShowIkThesaurusResponse> showIkThesaurusAsync(ShowIkThesaurusRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showIkThesaurus);
    }

    /**
     * 查询自定义词库状态
     *
     * 该接口用于查询自定义词库的加载状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIkThesaurusRequest 请求对象
     * @return AsyncInvoker<ShowIkThesaurusRequest, ShowIkThesaurusResponse>
     */
    public AsyncInvoker<ShowIkThesaurusRequest, ShowIkThesaurusResponse> showIkThesaurusAsyncInvoker(
        ShowIkThesaurusRequest request) {
        return new AsyncInvoker<>(request, CssMeta.showIkThesaurus, hcClient);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogBackupRequest 请求对象
     * @return CompletableFuture<ShowLogBackupResponse>
     */
    public CompletableFuture<ShowLogBackupResponse> showLogBackupAsync(ShowLogBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showLogBackup);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogBackupRequest 请求对象
     * @return AsyncInvoker<ShowLogBackupRequest, ShowLogBackupResponse>
     */
    public AsyncInvoker<ShowLogBackupRequest, ShowLogBackupResponse> showLogBackupAsyncInvoker(
        ShowLogBackupRequest request) {
        return new AsyncInvoker<>(request, CssMeta.showLogBackup, hcClient);
    }

    /**
     * 获取终端节点连接
     *
     * 该接口用于获取终端节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcepConnectionRequest 请求对象
     * @return CompletableFuture<ShowVpcepConnectionResponse>
     */
    public CompletableFuture<ShowVpcepConnectionResponse> showVpcepConnectionAsync(ShowVpcepConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showVpcepConnection);
    }

    /**
     * 获取终端节点连接
     *
     * 该接口用于获取终端节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcepConnectionRequest 请求对象
     * @return AsyncInvoker<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse>
     */
    public AsyncInvoker<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse> showVpcepConnectionAsyncInvoker(
        ShowVpcepConnectionRequest request) {
        return new AsyncInvoker<>(request, CssMeta.showVpcepConnection, hcClient);
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
     * @return CompletableFuture<StartAutoSettingResponse>
     */
    public CompletableFuture<StartAutoSettingResponse> startAutoSettingAsync(StartAutoSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startAutoSetting);
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
     * @return AsyncInvoker<StartAutoSettingRequest, StartAutoSettingResponse>
     */
    public AsyncInvoker<StartAutoSettingRequest, StartAutoSettingResponse> startAutoSettingAsyncInvoker(
        StartAutoSettingRequest request) {
        return new AsyncInvoker<>(request, CssMeta.startAutoSetting, hcClient);
    }

    /**
     * 开启日志自动备份策略
     *
     * 该接口用于日志自动备份策略开启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartLogAutoBackupPolicyRequest 请求对象
     * @return CompletableFuture<StartLogAutoBackupPolicyResponse>
     */
    public CompletableFuture<StartLogAutoBackupPolicyResponse> startLogAutoBackupPolicyAsync(
        StartLogAutoBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startLogAutoBackupPolicy);
    }

    /**
     * 开启日志自动备份策略
     *
     * 该接口用于日志自动备份策略开启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartLogAutoBackupPolicyRequest 请求对象
     * @return AsyncInvoker<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse>
     */
    public AsyncInvoker<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse> startLogAutoBackupPolicyAsyncInvoker(
        StartLogAutoBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, CssMeta.startLogAutoBackupPolicy, hcClient);
    }

    /**
     * 开启日志备份或日志采集功能
     *
     * 该接口用于开启集群的日志备份或日志采集功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartLogsRequest 请求对象
     * @return CompletableFuture<StartLogsResponse>
     */
    public CompletableFuture<StartLogsResponse> startLogsAsync(StartLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startLogs);
    }

    /**
     * 开启日志备份或日志采集功能
     *
     * 该接口用于开启集群的日志备份或日志采集功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartLogsRequest 请求对象
     * @return AsyncInvoker<StartLogsRequest, StartLogsResponse>
     */
    public AsyncInvoker<StartLogsRequest, StartLogsResponse> startLogsAsyncInvoker(StartLogsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.startLogs, hcClient);
    }

    /**
     * 开启公网访问控制白名单
     *
     * 该接口用于开启公网访问控制白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPublicWhitelistRequest 请求对象
     * @return CompletableFuture<StartPublicWhitelistResponse>
     */
    public CompletableFuture<StartPublicWhitelistResponse> startPublicWhitelistAsync(
        StartPublicWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startPublicWhitelist);
    }

    /**
     * 开启公网访问控制白名单
     *
     * 该接口用于开启公网访问控制白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPublicWhitelistRequest 请求对象
     * @return AsyncInvoker<StartPublicWhitelistRequest, StartPublicWhitelistResponse>
     */
    public AsyncInvoker<StartPublicWhitelistRequest, StartPublicWhitelistResponse> startPublicWhitelistAsyncInvoker(
        StartPublicWhitelistRequest request) {
        return new AsyncInvoker<>(request, CssMeta.startPublicWhitelist, hcClient);
    }

    /**
     * 连通性测试。
     *
     * 该接口用于连通性测试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTargetClusterConnectivityTestRequest 请求对象
     * @return CompletableFuture<StartTargetClusterConnectivityTestResponse>
     */
    public CompletableFuture<StartTargetClusterConnectivityTestResponse> startTargetClusterConnectivityTestAsync(
        StartTargetClusterConnectivityTestRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startTargetClusterConnectivityTest);
    }

    /**
     * 连通性测试。
     *
     * 该接口用于连通性测试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTargetClusterConnectivityTestRequest 请求对象
     * @return AsyncInvoker<StartTargetClusterConnectivityTestRequest, StartTargetClusterConnectivityTestResponse>
     */
    public AsyncInvoker<StartTargetClusterConnectivityTestRequest, StartTargetClusterConnectivityTestResponse> startTargetClusterConnectivityTestAsyncInvoker(
        StartTargetClusterConnectivityTestRequest request) {
        return new AsyncInvoker<>(request, CssMeta.startTargetClusterConnectivityTest, hcClient);
    }

    /**
     * 开启终端节点服务
     *
     * 该接口用于开启终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartVpecpRequest 请求对象
     * @return CompletableFuture<StartVpecpResponse>
     */
    public CompletableFuture<StartVpecpResponse> startVpecpAsync(StartVpecpRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startVpecp);
    }

    /**
     * 开启终端节点服务
     *
     * 该接口用于开启终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartVpecpRequest 请求对象
     * @return AsyncInvoker<StartVpecpRequest, StartVpecpResponse>
     */
    public AsyncInvoker<StartVpecpRequest, StartVpecpResponse> startVpecpAsyncInvoker(StartVpecpRequest request) {
        return new AsyncInvoker<>(request, CssMeta.startVpecp, hcClient);
    }

    /**
     * 关闭日志自动备份策略
     *
     * 该接口用于日志自动备份策略关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopLogAutoBackupPolicyRequest 请求对象
     * @return CompletableFuture<StopLogAutoBackupPolicyResponse>
     */
    public CompletableFuture<StopLogAutoBackupPolicyResponse> stopLogAutoBackupPolicyAsync(
        StopLogAutoBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopLogAutoBackupPolicy);
    }

    /**
     * 关闭日志自动备份策略
     *
     * 该接口用于日志自动备份策略关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopLogAutoBackupPolicyRequest 请求对象
     * @return AsyncInvoker<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse>
     */
    public AsyncInvoker<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse> stopLogAutoBackupPolicyAsyncInvoker(
        StopLogAutoBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, CssMeta.stopLogAutoBackupPolicy, hcClient);
    }

    /**
     * 关闭日志功能
     *
     * 该接口用于关闭日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopLogsRequest 请求对象
     * @return CompletableFuture<StopLogsResponse>
     */
    public CompletableFuture<StopLogsResponse> stopLogsAsync(StopLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopLogs);
    }

    /**
     * 关闭日志功能
     *
     * 该接口用于关闭日志功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopLogsRequest 请求对象
     * @return AsyncInvoker<StopLogsRequest, StopLogsResponse>
     */
    public AsyncInvoker<StopLogsRequest, StopLogsResponse> stopLogsAsyncInvoker(StopLogsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.stopLogs, hcClient);
    }

    /**
     * 关闭公网访问控制白名单
     *
     * 该接口用于关闭公网访问控制白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPublicWhitelistRequest 请求对象
     * @return CompletableFuture<StopPublicWhitelistResponse>
     */
    public CompletableFuture<StopPublicWhitelistResponse> stopPublicWhitelistAsync(StopPublicWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopPublicWhitelist);
    }

    /**
     * 关闭公网访问控制白名单
     *
     * 该接口用于关闭公网访问控制白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPublicWhitelistRequest 请求对象
     * @return AsyncInvoker<StopPublicWhitelistRequest, StopPublicWhitelistResponse>
     */
    public AsyncInvoker<StopPublicWhitelistRequest, StopPublicWhitelistResponse> stopPublicWhitelistAsyncInvoker(
        StopPublicWhitelistRequest request) {
        return new AsyncInvoker<>(request, CssMeta.stopPublicWhitelist, hcClient);
    }

    /**
     * 停用快照功能
     *
     * 该接口用于停用快照功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSnapshotRequest 请求对象
     * @return CompletableFuture<StopSnapshotResponse>
     */
    public CompletableFuture<StopSnapshotResponse> stopSnapshotAsync(StopSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopSnapshot);
    }

    /**
     * 停用快照功能
     *
     * 该接口用于停用快照功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSnapshotRequest 请求对象
     * @return AsyncInvoker<StopSnapshotRequest, StopSnapshotResponse>
     */
    public AsyncInvoker<StopSnapshotRequest, StopSnapshotResponse> stopSnapshotAsyncInvoker(
        StopSnapshotRequest request) {
        return new AsyncInvoker<>(request, CssMeta.stopSnapshot, hcClient);
    }

    /**
     * 关闭终端节点服务
     *
     * 该接口用于关闭终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopVpecpRequest 请求对象
     * @return CompletableFuture<StopVpecpResponse>
     */
    public CompletableFuture<StopVpecpResponse> stopVpecpAsync(StopVpecpRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopVpecp);
    }

    /**
     * 关闭终端节点服务
     *
     * 该接口用于关闭终端节点服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopVpecpRequest 请求对象
     * @return AsyncInvoker<StopVpecpRequest, StopVpecpResponse>
     */
    public AsyncInvoker<StopVpecpRequest, StopVpecpResponse> stopVpecpAsyncInvoker(StopVpecpRequest request) {
        return new AsyncInvoker<>(request, CssMeta.stopVpecp, hcClient);
    }

    /**
     * 切换集群实例可用区
     *
     * 该接口通过指定节点类型切换AZ。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAzByInstanceTypeRequest 请求对象
     * @return CompletableFuture<UpdateAzByInstanceTypeResponse>
     */
    public CompletableFuture<UpdateAzByInstanceTypeResponse> updateAzByInstanceTypeAsync(
        UpdateAzByInstanceTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateAzByInstanceType);
    }

    /**
     * 切换集群实例可用区
     *
     * 该接口通过指定节点类型切换AZ。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAzByInstanceTypeRequest 请求对象
     * @return AsyncInvoker<UpdateAzByInstanceTypeRequest, UpdateAzByInstanceTypeResponse>
     */
    public AsyncInvoker<UpdateAzByInstanceTypeRequest, UpdateAzByInstanceTypeResponse> updateAzByInstanceTypeAsyncInvoker(
        UpdateAzByInstanceTypeRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateAzByInstanceType, hcClient);
    }

    /**
     * 批量添加或删除集群标签
     *
     * 该接口用于对集群批量添加或删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchClustersTagsRequest 请求对象
     * @return CompletableFuture<UpdateBatchClustersTagsResponse>
     */
    public CompletableFuture<UpdateBatchClustersTagsResponse> updateBatchClustersTagsAsync(
        UpdateBatchClustersTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateBatchClustersTags);
    }

    /**
     * 批量添加或删除集群标签
     *
     * 该接口用于对集群批量添加或删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchClustersTagsRequest 请求对象
     * @return AsyncInvoker<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse>
     */
    public AsyncInvoker<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse> updateBatchClustersTagsAsyncInvoker(
        UpdateBatchClustersTagsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateBatchClustersTags, hcClient);
    }

    /**
     * 修改集群名称或描述
     *
     * 该接口用于修改集群名称或描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterNameRequest 请求对象
     * @return CompletableFuture<UpdateClusterNameResponse>
     */
    public CompletableFuture<UpdateClusterNameResponse> updateClusterNameAsync(UpdateClusterNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateClusterName);
    }

    /**
     * 修改集群名称或描述
     *
     * 该接口用于修改集群名称或描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterNameRequest 请求对象
     * @return AsyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse>
     */
    public AsyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse> updateClusterNameAsyncInvoker(
        UpdateClusterNameRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateClusterName, hcClient);
    }

    /**
     * 更新集群负载均衡监听器
     *
     * 该接口用于更新集群负载均衡监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEsListenerRequest 请求对象
     * @return CompletableFuture<UpdateEsListenerResponse>
     */
    public CompletableFuture<UpdateEsListenerResponse> updateEsListenerAsync(UpdateEsListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateEsListener);
    }

    /**
     * 更新集群负载均衡监听器
     *
     * 该接口用于更新集群负载均衡监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEsListenerRequest 请求对象
     * @return AsyncInvoker<UpdateEsListenerRequest, UpdateEsListenerResponse>
     */
    public AsyncInvoker<UpdateEsListenerRequest, UpdateEsListenerResponse> updateEsListenerAsyncInvoker(
        UpdateEsListenerRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateEsListener, hcClient);
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
     * @return CompletableFuture<UpdateExtendClusterResponse>
     */
    public CompletableFuture<UpdateExtendClusterResponse> updateExtendClusterAsync(UpdateExtendClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateExtendCluster);
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
     * @return AsyncInvoker<UpdateExtendClusterRequest, UpdateExtendClusterResponse>
     */
    public AsyncInvoker<UpdateExtendClusterRequest, UpdateExtendClusterResponse> updateExtendClusterAsyncInvoker(
        UpdateExtendClusterRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateExtendCluster, hcClient);
    }

    /**
     * 扩容实例的数量和存储容量
     *
     * 该接口用于集群扩容不同类型实例的个数以及存储容量。已经存在独立Master、Client、冷数据节点的集群使用该接口扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExtendInstanceStorageRequest 请求对象
     * @return CompletableFuture<UpdateExtendInstanceStorageResponse>
     */
    public CompletableFuture<UpdateExtendInstanceStorageResponse> updateExtendInstanceStorageAsync(
        UpdateExtendInstanceStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateExtendInstanceStorage);
    }

    /**
     * 扩容实例的数量和存储容量
     *
     * 该接口用于集群扩容不同类型实例的个数以及存储容量。已经存在独立Master、Client、冷数据节点的集群使用该接口扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExtendInstanceStorageRequest 请求对象
     * @return AsyncInvoker<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse>
     */
    public AsyncInvoker<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse> updateExtendInstanceStorageAsyncInvoker(
        UpdateExtendInstanceStorageRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateExtendInstanceStorage, hcClient);
    }

    /**
     * 变更规格
     *
     * 该接口用于变更集群规格。只支持变更ess节点类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlavorRequest 请求对象
     * @return CompletableFuture<UpdateFlavorResponse>
     */
    public CompletableFuture<UpdateFlavorResponse> updateFlavorAsync(UpdateFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateFlavor);
    }

    /**
     * 变更规格
     *
     * 该接口用于变更集群规格。只支持变更ess节点类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlavorRequest 请求对象
     * @return AsyncInvoker<UpdateFlavorRequest, UpdateFlavorResponse>
     */
    public AsyncInvoker<UpdateFlavorRequest, UpdateFlavorResponse> updateFlavorAsyncInvoker(
        UpdateFlavorRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateFlavor, hcClient);
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
     * @return CompletableFuture<UpdateFlavorByTypeResponse>
     */
    public CompletableFuture<UpdateFlavorByTypeResponse> updateFlavorByTypeAsync(UpdateFlavorByTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateFlavorByType);
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
     * @return AsyncInvoker<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse>
     */
    public AsyncInvoker<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse> updateFlavorByTypeAsyncInvoker(
        UpdateFlavorByTypeRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateFlavorByType, hcClient);
    }

    /**
     * 节点替换
     *
     * 该接口用于替换失败节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateInstance);
    }

    /**
     * 节点替换
     *
     * 该接口用于替换失败节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateInstance, hcClient);
    }

    /**
     * 修改日志基础配置
     *
     * 该接口用于修改日志基础配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogSettingRequest 请求对象
     * @return CompletableFuture<UpdateLogSettingResponse>
     */
    public CompletableFuture<UpdateLogSettingResponse> updateLogSettingAsync(UpdateLogSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateLogSetting);
    }

    /**
     * 修改日志基础配置
     *
     * 该接口用于修改日志基础配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogSettingRequest 请求对象
     * @return AsyncInvoker<UpdateLogSettingRequest, UpdateLogSettingResponse>
     */
    public AsyncInvoker<UpdateLogSettingRequest, UpdateLogSettingResponse> updateLogSettingAsyncInvoker(
        UpdateLogSettingRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateLogSetting, hcClient);
    }

    /**
     * 按需集群转包周期
     *
     * 该接口用于按需集群转包周期集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOndemandClusterToPeriodRequest 请求对象
     * @return CompletableFuture<UpdateOndemandClusterToPeriodResponse>
     */
    public CompletableFuture<UpdateOndemandClusterToPeriodResponse> updateOndemandClusterToPeriodAsync(
        UpdateOndemandClusterToPeriodRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateOndemandClusterToPeriod);
    }

    /**
     * 按需集群转包周期
     *
     * 该接口用于按需集群转包周期集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOndemandClusterToPeriodRequest 请求对象
     * @return AsyncInvoker<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse>
     */
    public AsyncInvoker<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse> updateOndemandClusterToPeriodAsyncInvoker(
        UpdateOndemandClusterToPeriodRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateOndemandClusterToPeriod, hcClient);
    }

    /**
     * 修改公网访问带宽
     *
     * 该接口用于修改公网访问带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicBandWidthRequest 请求对象
     * @return CompletableFuture<UpdatePublicBandWidthResponse>
     */
    public CompletableFuture<UpdatePublicBandWidthResponse> updatePublicBandWidthAsync(
        UpdatePublicBandWidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updatePublicBandWidth);
    }

    /**
     * 修改公网访问带宽
     *
     * 该接口用于修改公网访问带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicBandWidthRequest 请求对象
     * @return AsyncInvoker<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse>
     */
    public AsyncInvoker<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse> updatePublicBandWidthAsyncInvoker(
        UpdatePublicBandWidthRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updatePublicBandWidth, hcClient);
    }

    /**
     * 指定节点类型缩容
     *
     * 该接口用于集群对不同类型实例的个数以及存储容量进行缩容。包周期类型的集群不支持通过api进行指定节点类型缩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShrinkClusterRequest 请求对象
     * @return CompletableFuture<UpdateShrinkClusterResponse>
     */
    public CompletableFuture<UpdateShrinkClusterResponse> updateShrinkClusterAsync(UpdateShrinkClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateShrinkCluster);
    }

    /**
     * 指定节点类型缩容
     *
     * 该接口用于集群对不同类型实例的个数以及存储容量进行缩容。包周期类型的集群不支持通过api进行指定节点类型缩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShrinkClusterRequest 请求对象
     * @return AsyncInvoker<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse>
     */
    public AsyncInvoker<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse> updateShrinkClusterAsyncInvoker(
        UpdateShrinkClusterRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateShrinkCluster, hcClient);
    }

    /**
     * 指定节点缩容
     *
     * 该接口可以对集群现有节点中指定节点进行缩容。包周期类型的集群不支持通过api进行指定节点缩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShrinkNodesRequest 请求对象
     * @return CompletableFuture<UpdateShrinkNodesResponse>
     */
    public CompletableFuture<UpdateShrinkNodesResponse> updateShrinkNodesAsync(UpdateShrinkNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateShrinkNodes);
    }

    /**
     * 指定节点缩容
     *
     * 该接口可以对集群现有节点中指定节点进行缩容。包周期类型的集群不支持通过api进行指定节点缩容操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShrinkNodesRequest 请求对象
     * @return AsyncInvoker<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse>
     */
    public AsyncInvoker<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse> updateShrinkNodesAsyncInvoker(
        UpdateShrinkNodesRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateShrinkNodes, hcClient);
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
     * @return CompletableFuture<UpdateSnapshotSettingResponse>
     */
    public CompletableFuture<UpdateSnapshotSettingResponse> updateSnapshotSettingAsync(
        UpdateSnapshotSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateSnapshotSetting);
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
     * @return AsyncInvoker<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse>
     */
    public AsyncInvoker<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse> updateSnapshotSettingAsyncInvoker(
        UpdateSnapshotSettingRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateSnapshotSetting, hcClient);
    }

    /**
     * 关闭公网访问
     *
     * 该接口用于关闭公网访问。包周期类型的集群不支持通过api进行关闭公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUnbindPublicRequest 请求对象
     * @return CompletableFuture<UpdateUnbindPublicResponse>
     */
    public CompletableFuture<UpdateUnbindPublicResponse> updateUnbindPublicAsync(UpdateUnbindPublicRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateUnbindPublic);
    }

    /**
     * 关闭公网访问
     *
     * 该接口用于关闭公网访问。包周期类型的集群不支持通过api进行关闭公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUnbindPublicRequest 请求对象
     * @return AsyncInvoker<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse>
     */
    public AsyncInvoker<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse> updateUnbindPublicAsyncInvoker(
        UpdateUnbindPublicRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateUnbindPublic, hcClient);
    }

    /**
     * 更新终端节点连接
     *
     * 该接口用于更新终端节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcepConnectionRequest 请求对象
     * @return CompletableFuture<UpdateVpcepConnectionResponse>
     */
    public CompletableFuture<UpdateVpcepConnectionResponse> updateVpcepConnectionAsync(
        UpdateVpcepConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateVpcepConnection);
    }

    /**
     * 更新终端节点连接
     *
     * 该接口用于更新终端节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcepConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse>
     */
    public AsyncInvoker<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse> updateVpcepConnectionAsyncInvoker(
        UpdateVpcepConnectionRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateVpcepConnection, hcClient);
    }

    /**
     * 修改终端节点服务白名单
     *
     * 该接口用于修改终端节点服务白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcepWhitelistRequest 请求对象
     * @return CompletableFuture<UpdateVpcepWhitelistResponse>
     */
    public CompletableFuture<UpdateVpcepWhitelistResponse> updateVpcepWhitelistAsync(
        UpdateVpcepWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateVpcepWhitelist);
    }

    /**
     * 修改终端节点服务白名单
     *
     * 该接口用于修改终端节点服务白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcepWhitelistRequest 请求对象
     * @return AsyncInvoker<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse>
     */
    public AsyncInvoker<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse> updateVpcepWhitelistAsyncInvoker(
        UpdateVpcepWhitelistRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateVpcepWhitelist, hcClient);
    }

    /**
     * 修改参数配置
     *
     * 该接口用于修改参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateYmlsRequest 请求对象
     * @return CompletableFuture<UpdateYmlsResponse>
     */
    public CompletableFuture<UpdateYmlsResponse> updateYmlsAsync(UpdateYmlsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateYmls);
    }

    /**
     * 修改参数配置
     *
     * 该接口用于修改参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateYmlsRequest 请求对象
     * @return AsyncInvoker<UpdateYmlsRequest, UpdateYmlsResponse>
     */
    public AsyncInvoker<UpdateYmlsRequest, UpdateYmlsResponse> updateYmlsAsyncInvoker(UpdateYmlsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateYmls, hcClient);
    }

    /**
     * 集群内核升级
     *
     * 该接口用于将低版本的ES升级到高版本或同版本ES。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeCoreRequest 请求对象
     * @return CompletableFuture<UpgradeCoreResponse>
     */
    public CompletableFuture<UpgradeCoreResponse> upgradeCoreAsync(UpgradeCoreRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.upgradeCore);
    }

    /**
     * 集群内核升级
     *
     * 该接口用于将低版本的ES升级到高版本或同版本ES。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeCoreRequest 请求对象
     * @return AsyncInvoker<UpgradeCoreRequest, UpgradeCoreResponse>
     */
    public AsyncInvoker<UpgradeCoreRequest, UpgradeCoreResponse> upgradeCoreAsyncInvoker(UpgradeCoreRequest request) {
        return new AsyncInvoker<>(request, CssMeta.upgradeCore, hcClient);
    }

    /**
     * 获取集群升级或切换AZ的详情信息
     *
     * 由于升级过程时间较长，该接口可以展示当前升级（切换AZ）节点的各个阶段信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDetailRequest 请求对象
     * @return CompletableFuture<UpgradeDetailResponse>
     */
    public CompletableFuture<UpgradeDetailResponse> upgradeDetailAsync(UpgradeDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.upgradeDetail);
    }

    /**
     * 获取集群升级或切换AZ的详情信息
     *
     * 由于升级过程时间较长，该接口可以展示当前升级（切换AZ）节点的各个阶段信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDetailRequest 请求对象
     * @return AsyncInvoker<UpgradeDetailRequest, UpgradeDetailResponse>
     */
    public AsyncInvoker<UpgradeDetailRequest, UpgradeDetailResponse> upgradeDetailAsyncInvoker(
        UpgradeDetailRequest request) {
        return new AsyncInvoker<>(request, CssMeta.upgradeDetail, hcClient);
    }

    /**
     * 开启Kibana公网访问
     *
     * 该接口用于开启Kibana公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartKibanaPublicRequest 请求对象
     * @return CompletableFuture<StartKibanaPublicResponse>
     */
    public CompletableFuture<StartKibanaPublicResponse> startKibanaPublicAsync(StartKibanaPublicRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startKibanaPublic);
    }

    /**
     * 开启Kibana公网访问
     *
     * 该接口用于开启Kibana公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartKibanaPublicRequest 请求对象
     * @return AsyncInvoker<StartKibanaPublicRequest, StartKibanaPublicResponse>
     */
    public AsyncInvoker<StartKibanaPublicRequest, StartKibanaPublicResponse> startKibanaPublicAsyncInvoker(
        StartKibanaPublicRequest request) {
        return new AsyncInvoker<>(request, CssMeta.startKibanaPublic, hcClient);
    }

    /**
     * 关闭Kibana公网访问控制
     *
     * 该接口用于关闭Kibana公网访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPublicKibanaWhitelistRequest 请求对象
     * @return CompletableFuture<StopPublicKibanaWhitelistResponse>
     */
    public CompletableFuture<StopPublicKibanaWhitelistResponse> stopPublicKibanaWhitelistAsync(
        StopPublicKibanaWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopPublicKibanaWhitelist);
    }

    /**
     * 关闭Kibana公网访问控制
     *
     * 该接口用于关闭Kibana公网访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPublicKibanaWhitelistRequest 请求对象
     * @return AsyncInvoker<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse>
     */
    public AsyncInvoker<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse> stopPublicKibanaWhitelistAsyncInvoker(
        StopPublicKibanaWhitelistRequest request) {
        return new AsyncInvoker<>(request, CssMeta.stopPublicKibanaWhitelist, hcClient);
    }

    /**
     * 修改Kibana公网带宽
     *
     * 该接口用于修改Kibana公网带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlterKibanaRequest 请求对象
     * @return CompletableFuture<UpdateAlterKibanaResponse>
     */
    public CompletableFuture<UpdateAlterKibanaResponse> updateAlterKibanaAsync(UpdateAlterKibanaRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateAlterKibana);
    }

    /**
     * 修改Kibana公网带宽
     *
     * 该接口用于修改Kibana公网带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlterKibanaRequest 请求对象
     * @return AsyncInvoker<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse>
     */
    public AsyncInvoker<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse> updateAlterKibanaAsyncInvoker(
        UpdateAlterKibanaRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateAlterKibana, hcClient);
    }

    /**
     * 关闭Kibana公网访问
     *
     * 该接口用于关闭Kibana公网访问。包周期类型集群不支持通过api进行关闭Kibana公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCloseKibanaRequest 请求对象
     * @return CompletableFuture<UpdateCloseKibanaResponse>
     */
    public CompletableFuture<UpdateCloseKibanaResponse> updateCloseKibanaAsync(UpdateCloseKibanaRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateCloseKibana);
    }

    /**
     * 关闭Kibana公网访问
     *
     * 该接口用于关闭Kibana公网访问。包周期类型集群不支持通过api进行关闭Kibana公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCloseKibanaRequest 请求对象
     * @return AsyncInvoker<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse>
     */
    public AsyncInvoker<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse> updateCloseKibanaAsyncInvoker(
        UpdateCloseKibanaRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateCloseKibana, hcClient);
    }

    /**
     * 修改Kibana公网访问控制
     *
     * 该接口通过修改kibana白名单，修改kibana的访问权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicKibanaWhitelistRequest 请求对象
     * @return CompletableFuture<UpdatePublicKibanaWhitelistResponse>
     */
    public CompletableFuture<UpdatePublicKibanaWhitelistResponse> updatePublicKibanaWhitelistAsync(
        UpdatePublicKibanaWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updatePublicKibanaWhitelist);
    }

    /**
     * 修改Kibana公网访问控制
     *
     * 该接口通过修改kibana白名单，修改kibana的访问权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicKibanaWhitelistRequest 请求对象
     * @return AsyncInvoker<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse>
     */
    public AsyncInvoker<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse> updatePublicKibanaWhitelistAsyncInvoker(
        UpdatePublicKibanaWhitelistRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updatePublicKibanaWhitelist, hcClient);
    }

    /**
     * 添加到自定义模板
     *
     * 该接口用于添加到自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFavoriteRequest 请求对象
     * @return CompletableFuture<AddFavoriteResponse>
     */
    public CompletableFuture<AddFavoriteResponse> addFavoriteAsync(AddFavoriteRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.addFavorite);
    }

    /**
     * 添加到自定义模板
     *
     * 该接口用于添加到自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFavoriteRequest 请求对象
     * @return AsyncInvoker<AddFavoriteRequest, AddFavoriteResponse>
     */
    public AsyncInvoker<AddFavoriteRequest, AddFavoriteResponse> addFavoriteAsyncInvoker(AddFavoriteRequest request) {
        return new AsyncInvoker<>(request, CssMeta.addFavorite, hcClient);
    }

    /**
     * 创建配置文件
     *
     * 该接口用于创建配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCnfRequest 请求对象
     * @return CompletableFuture<CreateCnfResponse>
     */
    public CompletableFuture<CreateCnfResponse> createCnfAsync(CreateCnfRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createCnf);
    }

    /**
     * 创建配置文件
     *
     * 该接口用于创建配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCnfRequest 请求对象
     * @return AsyncInvoker<CreateCnfRequest, CreateCnfResponse>
     */
    public AsyncInvoker<CreateCnfRequest, CreateCnfResponse> createCnfAsyncInvoker(CreateCnfRequest request) {
        return new AsyncInvoker<>(request, CssMeta.createCnf, hcClient);
    }

    /**
     * 删除配置文件
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfRequest 请求对象
     * @return CompletableFuture<DeleteConfResponse>
     */
    public CompletableFuture<DeleteConfResponse> deleteConfAsync(DeleteConfRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteConf);
    }

    /**
     * 删除配置文件
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfRequest 请求对象
     * @return AsyncInvoker<DeleteConfRequest, DeleteConfResponse>
     */
    public AsyncInvoker<DeleteConfRequest, DeleteConfResponse> deleteConfAsyncInvoker(DeleteConfRequest request) {
        return new AsyncInvoker<>(request, CssMeta.deleteConf, hcClient);
    }

    /**
     * 删除配置文件V2
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigRequest 请求对象
     * @return CompletableFuture<DeleteConfigResponse>
     */
    public CompletableFuture<DeleteConfigResponse> deleteConfigAsync(DeleteConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteConfig);
    }

    /**
     * 删除配置文件V2
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigRequest 请求对象
     * @return AsyncInvoker<DeleteConfigRequest, DeleteConfigResponse>
     */
    public AsyncInvoker<DeleteConfigRequest, DeleteConfigResponse> deleteConfigAsyncInvoker(
        DeleteConfigRequest request) {
        return new AsyncInvoker<>(request, CssMeta.deleteConfig, hcClient);
    }

    /**
     * 删除自定义模板
     *
     * 该接口用于删除自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTemplateResponse>
     */
    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteTemplate);
    }

    /**
     * 删除自定义模板
     *
     * 该接口用于删除自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateAsyncInvoker(
        DeleteTemplateRequest request) {
        return new AsyncInvoker<>(request, CssMeta.deleteTemplate, hcClient);
    }

    /**
     * 查询操作记录
     *
     * 该接口用于查询操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActionsRequest 请求对象
     * @return CompletableFuture<ListActionsResponse>
     */
    public CompletableFuture<ListActionsResponse> listActionsAsync(ListActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listActions);
    }

    /**
     * 查询操作记录
     *
     * 该接口用于查询操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActionsRequest 请求对象
     * @return AsyncInvoker<ListActionsRequest, ListActionsResponse>
     */
    public AsyncInvoker<ListActionsRequest, ListActionsResponse> listActionsAsyncInvoker(ListActionsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listActions, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 该接口用于查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertsRequest 请求对象
     * @return CompletableFuture<ListCertsResponse>
     */
    public CompletableFuture<ListCertsResponse> listCertsAsync(ListCertsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listCerts);
    }

    /**
     * 查询证书列表
     *
     * 该接口用于查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertsRequest 请求对象
     * @return AsyncInvoker<ListCertsRequest, ListCertsResponse>
     */
    public AsyncInvoker<ListCertsRequest, ListCertsResponse> listCertsAsyncInvoker(ListCertsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listCerts, hcClient);
    }

    /**
     * 查询配置文件列表
     *
     * 该接口用于查询配置文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfsRequest 请求对象
     * @return CompletableFuture<ListConfsResponse>
     */
    public CompletableFuture<ListConfsResponse> listConfsAsync(ListConfsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listConfs);
    }

    /**
     * 查询配置文件列表
     *
     * 该接口用于查询配置文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfsRequest 请求对象
     * @return AsyncInvoker<ListConfsRequest, ListConfsResponse>
     */
    public AsyncInvoker<ListConfsRequest, ListConfsResponse> listConfsAsyncInvoker(ListConfsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listConfs, hcClient);
    }

    /**
     * 查询pipeline列表
     *
     * 该接口用于查询pipeline列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipelinesRequest 请求对象
     * @return CompletableFuture<ListPipelinesResponse>
     */
    public CompletableFuture<ListPipelinesResponse> listPipelinesAsync(ListPipelinesRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listPipelines);
    }

    /**
     * 查询pipeline列表
     *
     * 该接口用于查询pipeline列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipelinesRequest 请求对象
     * @return AsyncInvoker<ListPipelinesRequest, ListPipelinesResponse>
     */
    public AsyncInvoker<ListPipelinesRequest, ListPipelinesResponse> listPipelinesAsyncInvoker(
        ListPipelinesRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listPipelines, hcClient);
    }

    /**
     * 查询模板列表
     *
     * 该接口用于查询模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.listTemplates);
    }

    /**
     * 查询模板列表
     *
     * 该接口用于查询模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(
        ListTemplatesRequest request) {
        return new AsyncInvoker<>(request, CssMeta.listTemplates, hcClient);
    }

    /**
     * 查询配置文件内容
     *
     * 该接口用于查询配置文件内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetConfDetailRequest 请求对象
     * @return CompletableFuture<ShowGetConfDetailResponse>
     */
    public CompletableFuture<ShowGetConfDetailResponse> showGetConfDetailAsync(ShowGetConfDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.showGetConfDetail);
    }

    /**
     * 查询配置文件内容
     *
     * 该接口用于查询配置文件内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetConfDetailRequest 请求对象
     * @return AsyncInvoker<ShowGetConfDetailRequest, ShowGetConfDetailResponse>
     */
    public AsyncInvoker<ShowGetConfDetailRequest, ShowGetConfDetailResponse> showGetConfDetailAsyncInvoker(
        ShowGetConfDetailRequest request) {
        return new AsyncInvoker<>(request, CssMeta.showGetConfDetail, hcClient);
    }

    /**
     * 连通性测试
     *
     * 该接口用于连通性测试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartConnectivityTestRequest 请求对象
     * @return CompletableFuture<StartConnectivityTestResponse>
     */
    public CompletableFuture<StartConnectivityTestResponse> startConnectivityTestAsync(
        StartConnectivityTestRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startConnectivityTest);
    }

    /**
     * 连通性测试
     *
     * 该接口用于连通性测试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartConnectivityTestRequest 请求对象
     * @return AsyncInvoker<StartConnectivityTestRequest, StartConnectivityTestResponse>
     */
    public AsyncInvoker<StartConnectivityTestRequest, StartConnectivityTestResponse> startConnectivityTestAsyncInvoker(
        StartConnectivityTestRequest request) {
        return new AsyncInvoker<>(request, CssMeta.startConnectivityTest, hcClient);
    }

    /**
     * 启动pipeline迁移数据
     *
     * 该接口用于启动pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPipelineRequest 请求对象
     * @return CompletableFuture<StartPipelineResponse>
     */
    public CompletableFuture<StartPipelineResponse> startPipelineAsync(StartPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startPipeline);
    }

    /**
     * 启动pipeline迁移数据
     *
     * 该接口用于启动pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPipelineRequest 请求对象
     * @return AsyncInvoker<StartPipelineRequest, StartPipelineResponse>
     */
    public AsyncInvoker<StartPipelineRequest, StartPipelineResponse> startPipelineAsyncInvoker(
        StartPipelineRequest request) {
        return new AsyncInvoker<>(request, CssMeta.startPipeline, hcClient);
    }

    /**
     * 热停止pipeline迁移数据。
     *
     * 该接口用于热停止pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopHotPipelineRequest 请求对象
     * @return CompletableFuture<StopHotPipelineResponse>
     */
    public CompletableFuture<StopHotPipelineResponse> stopHotPipelineAsync(StopHotPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopHotPipeline);
    }

    /**
     * 热停止pipeline迁移数据。
     *
     * 该接口用于热停止pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopHotPipelineRequest 请求对象
     * @return AsyncInvoker<StopHotPipelineRequest, StopHotPipelineResponse>
     */
    public AsyncInvoker<StopHotPipelineRequest, StopHotPipelineResponse> stopHotPipelineAsyncInvoker(
        StopHotPipelineRequest request) {
        return new AsyncInvoker<>(request, CssMeta.stopHotPipeline, hcClient);
    }

    /**
     * 停止pipeline迁移数据
     *
     * 该接口用于停止pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPipelineRequest 请求对象
     * @return CompletableFuture<StopPipelineResponse>
     */
    public CompletableFuture<StopPipelineResponse> stopPipelineAsync(StopPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopPipeline);
    }

    /**
     * 停止pipeline迁移数据
     *
     * 该接口用于停止pipeline迁移数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPipelineRequest 请求对象
     * @return AsyncInvoker<StopPipelineRequest, StopPipelineResponse>
     */
    public AsyncInvoker<StopPipelineRequest, StopPipelineResponse> stopPipelineAsyncInvoker(
        StopPipelineRequest request) {
        return new AsyncInvoker<>(request, CssMeta.stopPipeline, hcClient);
    }

    /**
     * 更新配置文件
     *
     * 该接口用于更新配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCnfRequest 请求对象
     * @return CompletableFuture<UpdateCnfResponse>
     */
    public CompletableFuture<UpdateCnfResponse> updateCnfAsync(UpdateCnfRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.updateCnf);
    }

    /**
     * 更新配置文件
     *
     * 该接口用于更新配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCnfRequest 请求对象
     * @return AsyncInvoker<UpdateCnfRequest, UpdateCnfResponse>
     */
    public AsyncInvoker<UpdateCnfRequest, UpdateCnfResponse> updateCnfAsyncInvoker(UpdateCnfRequest request) {
        return new AsyncInvoker<>(request, CssMeta.updateCnf, hcClient);
    }

}
