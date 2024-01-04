package com.huaweicloud.sdk.cce.v3;

import com.huaweicloud.sdk.cce.v3.model.AddNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.AddNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.AwakeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.AwakeClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.BatchCreateClusterTagsRequest;
import com.huaweicloud.sdk.cce.v3.model.BatchCreateClusterTagsResponse;
import com.huaweicloud.sdk.cce.v3.model.BatchDeleteClusterTagsRequest;
import com.huaweicloud.sdk.cce.v3.model.BatchDeleteClusterTagsResponse;
import com.huaweicloud.sdk.cce.v3.model.ContinueUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.ContinueUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateCloudPersistentVolumeClaimsRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateCloudPersistentVolumeClaimsResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterMasterSnapshotRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterMasterSnapshotResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateKubernetesClusterCertRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateKubernetesClusterCertResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.CreatePartitionRequest;
import com.huaweicloud.sdk.cce.v3.model.CreatePartitionResponse;
import com.huaweicloud.sdk.cce.v3.model.CreatePostCheckRequest;
import com.huaweicloud.sdk.cce.v3.model.CreatePostCheckResponse;
import com.huaweicloud.sdk.cce.v3.model.CreatePreCheckRequest;
import com.huaweicloud.sdk.cce.v3.model.CreatePreCheckResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateUpgradeWorkFlowRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateUpgradeWorkFlowResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteChartRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteChartResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteCloudPersistentVolumeClaimsRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteCloudPersistentVolumeClaimsResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.DownloadChartRequest;
import com.huaweicloud.sdk.cce.v3.model.DownloadChartResponse;
import com.huaweicloud.sdk.cce.v3.model.HibernateClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.HibernateClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.ListAddonInstancesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListAddonInstancesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListAddonTemplatesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListAddonTemplatesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListChartsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListChartsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClusterMasterSnapshotTasksRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClusterMasterSnapshotTasksResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClusterUpgradeFeatureGatesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClusterUpgradeFeatureGatesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClusterUpgradePathsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClusterUpgradePathsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClustersRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClustersResponse;
import com.huaweicloud.sdk.cce.v3.model.ListNodePoolsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListNodePoolsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListNodesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListNodesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListPartitionsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListPartitionsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListPreCheckTasksRequest;
import com.huaweicloud.sdk.cce.v3.model.ListPreCheckTasksResponse;
import com.huaweicloud.sdk.cce.v3.model.ListReleasesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListReleasesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListUpgradeClusterTasksRequest;
import com.huaweicloud.sdk.cce.v3.model.ListUpgradeClusterTasksResponse;
import com.huaweicloud.sdk.cce.v3.model.ListUpgradeWorkFlowsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListUpgradeWorkFlowsResponse;
import com.huaweicloud.sdk.cce.v3.model.MigrateNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.MigrateNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.PauseUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.PauseUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.RemoveNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.RemoveNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.ResetNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.ResetNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.ResizeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.ResizeClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.RetryUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.RetryUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.RollbackAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.RollbackAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowChartRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowChartResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowChartValuesRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowChartValuesResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterConfigRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterConfigResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterConfigurationDetailsRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterConfigurationDetailsResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterEndpointsRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterEndpointsResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterUpgradeInfoRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterUpgradeInfoResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowJobRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowJobResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolConfigurationsRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolConfigurationsResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowPartitionRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowPartitionResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowPreCheckRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowPreCheckResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowReleaseHistoryRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowReleaseHistoryResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeWorkFlowRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeWorkFlowResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowUserChartsQuotasRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowUserChartsQuotasResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowVersionRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowVersionResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateChartRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateChartResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterEipRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterEipResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterLogConfigRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterLogConfigResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolConfigurationRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolConfigurationResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdatePartitionRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdatePartitionResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.UpgradeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.UpgradeClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.UpgradeWorkFlowUpdateRequest;
import com.huaweicloud.sdk.cce.v3.model.UpgradeWorkFlowUpdateResponse;
import com.huaweicloud.sdk.cce.v3.model.UploadChartRequest;
import com.huaweicloud.sdk.cce.v3.model.UploadChartResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CceAsyncClient {

    protected HcClient hcClient;

    public CceAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CceAsyncClient> newBuilder() {
        ClientBuilder<CceAsyncClient> clientBuilder = new ClientBuilder<>(CceAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 纳管节点
     *
     * 该API用于在指定集群下纳管节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddNodeRequest 请求对象
     * @return CompletableFuture<AddNodeResponse>
     */
    public CompletableFuture<AddNodeResponse> addNodeAsync(AddNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.addNode);
    }

    /**
     * 纳管节点
     *
     * 该API用于在指定集群下纳管节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddNodeRequest 请求对象
     * @return AsyncInvoker<AddNodeRequest, AddNodeResponse>
     */
    public AsyncInvoker<AddNodeRequest, AddNodeResponse> addNodeAsyncInvoker(AddNodeRequest request) {
        return new AsyncInvoker<AddNodeRequest, AddNodeResponse>(request, CceMeta.addNode, hcClient);
    }

    /**
     * 集群唤醒
     *
     * 集群唤醒用于唤醒已休眠的集群，唤醒后，将继续收取控制节点资源费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AwakeClusterRequest 请求对象
     * @return CompletableFuture<AwakeClusterResponse>
     */
    public CompletableFuture<AwakeClusterResponse> awakeClusterAsync(AwakeClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.awakeCluster);
    }

    /**
     * 集群唤醒
     *
     * 集群唤醒用于唤醒已休眠的集群，唤醒后，将继续收取控制节点资源费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AwakeClusterRequest 请求对象
     * @return AsyncInvoker<AwakeClusterRequest, AwakeClusterResponse>
     */
    public AsyncInvoker<AwakeClusterRequest, AwakeClusterResponse> awakeClusterAsyncInvoker(
        AwakeClusterRequest request) {
        return new AsyncInvoker<AwakeClusterRequest, AwakeClusterResponse>(request, CceMeta.awakeCluster, hcClient);
    }

    /**
     * 批量添加指定集群的资源标签
     *
     * 该API用于批量添加指定集群的资源标签。
     * &gt; - 每个集群支持最多20个资源标签。
     * &gt; - 此接口为幂等接口：创建时，如果创建的标签已经存在（key/value均相同视为重复），默认处理成功；key相同，value不同时会覆盖原有标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateClusterTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateClusterTagsResponse>
     */
    public CompletableFuture<BatchCreateClusterTagsResponse> batchCreateClusterTagsAsync(
        BatchCreateClusterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.batchCreateClusterTags);
    }

    /**
     * 批量添加指定集群的资源标签
     *
     * 该API用于批量添加指定集群的资源标签。
     * &gt; - 每个集群支持最多20个资源标签。
     * &gt; - 此接口为幂等接口：创建时，如果创建的标签已经存在（key/value均相同视为重复），默认处理成功；key相同，value不同时会覆盖原有标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateClusterTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse>
     */
    public AsyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> batchCreateClusterTagsAsyncInvoker(
        BatchCreateClusterTagsRequest request) {
        return new AsyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse>(request,
            CceMeta.batchCreateClusterTags, hcClient);
    }

    /**
     * 批量删除指定集群的资源标签
     *
     * 该API用于批量删除指定集群的资源标签。
     * &gt; - 此接口为幂等接口：删除时，如果删除的标签key不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteClusterTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteClusterTagsResponse>
     */
    public CompletableFuture<BatchDeleteClusterTagsResponse> batchDeleteClusterTagsAsync(
        BatchDeleteClusterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.batchDeleteClusterTags);
    }

    /**
     * 批量删除指定集群的资源标签
     *
     * 该API用于批量删除指定集群的资源标签。
     * &gt; - 此接口为幂等接口：删除时，如果删除的标签key不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteClusterTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse>
     */
    public AsyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> batchDeleteClusterTagsAsyncInvoker(
        BatchDeleteClusterTagsRequest request) {
        return new AsyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse>(request,
            CceMeta.batchDeleteClusterTags, hcClient);
    }

    /**
     * 继续执行集群升级任务
     *
     * 继续执行被暂停的集群升级任务。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ContinueUpgradeClusterTaskRequest 请求对象
     * @return CompletableFuture<ContinueUpgradeClusterTaskResponse>
     */
    public CompletableFuture<ContinueUpgradeClusterTaskResponse> continueUpgradeClusterTaskAsync(
        ContinueUpgradeClusterTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.continueUpgradeClusterTask);
    }

    /**
     * 继续执行集群升级任务
     *
     * 继续执行被暂停的集群升级任务。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ContinueUpgradeClusterTaskRequest 请求对象
     * @return AsyncInvoker<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse>
     */
    public AsyncInvoker<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse> continueUpgradeClusterTaskAsyncInvoker(
        ContinueUpgradeClusterTaskRequest request) {
        return new AsyncInvoker<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse>(request,
            CceMeta.continueUpgradeClusterTask, hcClient);
    }

    /**
     * 创建AddonInstance
     *
     * 根据提供的插件模板，安装插件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAddonInstanceRequest 请求对象
     * @return CompletableFuture<CreateAddonInstanceResponse>
     */
    public CompletableFuture<CreateAddonInstanceResponse> createAddonInstanceAsync(CreateAddonInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createAddonInstance);
    }

    /**
     * 创建AddonInstance
     *
     * 根据提供的插件模板，安装插件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAddonInstanceRequest 请求对象
     * @return AsyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse>
     */
    public AsyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse> createAddonInstanceAsyncInvoker(
        CreateAddonInstanceRequest request) {
        return new AsyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse>(request,
            CceMeta.createAddonInstance, hcClient);
    }

    /**
     * 创建PVC（待废弃）
     *
     * 该API用于在指定的Namespace下通过云存储服务中的云存储（EVS、SFS、OBS）去创建PVC（PersistentVolumeClaim）。该API待废弃，请使用Kubernetes PVC相关接口。
     * 
     * 
     * &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCloudPersistentVolumeClaimsRequest 请求对象
     * @return CompletableFuture<CreateCloudPersistentVolumeClaimsResponse>
     */
    public CompletableFuture<CreateCloudPersistentVolumeClaimsResponse> createCloudPersistentVolumeClaimsAsync(
        CreateCloudPersistentVolumeClaimsRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createCloudPersistentVolumeClaims);
    }

    /**
     * 创建PVC（待废弃）
     *
     * 该API用于在指定的Namespace下通过云存储服务中的云存储（EVS、SFS、OBS）去创建PVC（PersistentVolumeClaim）。该API待废弃，请使用Kubernetes PVC相关接口。
     * 
     * 
     * &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCloudPersistentVolumeClaimsRequest 请求对象
     * @return AsyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse>
     */
    public AsyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> createCloudPersistentVolumeClaimsAsyncInvoker(
        CreateCloudPersistentVolumeClaimsRequest request) {
        return new AsyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse>(
            request, CceMeta.createCloudPersistentVolumeClaims, hcClient);
    }

    /**
     * 创建集群
     *
     * 该API用于创建一个空集群（即只有控制节点Master，没有工作节点Node）。请在调用本接口完成集群创建之后，通过[创建节点](cce_02_0242.xml)添加节点。
     * 
     * 
     * &gt;   - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * &gt;   - 调用该接口创建集群时，默认不安装ICAgent，若需安装ICAgent，可在请求Body参数的annotations中加入\&quot;cluster.install.addons.external/install\&quot;:\&quot;[{\&quot;addonTemplateName\&quot;:\&quot;icagent\&quot;}]\&quot;的集群注解，将在创建集群时自动安装ICAgent。ICAgent是应用性能管理APM的采集代理，运行在应用所在的服务器上，用于实时采集探针所获取的数据，安装ICAgent是使用应用性能管理APM的前提。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createCluster);
    }

    /**
     * 创建集群
     *
     * 该API用于创建一个空集群（即只有控制节点Master，没有工作节点Node）。请在调用本接口完成集群创建之后，通过[创建节点](cce_02_0242.xml)添加节点。
     * 
     * 
     * &gt;   - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * &gt;   - 调用该接口创建集群时，默认不安装ICAgent，若需安装ICAgent，可在请求Body参数的annotations中加入\&quot;cluster.install.addons.external/install\&quot;:\&quot;[{\&quot;addonTemplateName\&quot;:\&quot;icagent\&quot;}]\&quot;的集群注解，将在创建集群时自动安装ICAgent。ICAgent是应用性能管理APM的采集代理，运行在应用所在的服务器上，用于实时采集探针所获取的数据，安装ICAgent是使用应用性能管理APM的前提。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CceMeta.createCluster, hcClient);
    }

    /**
     * 集群备份
     *
     * 集群备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterMasterSnapshotRequest 请求对象
     * @return CompletableFuture<CreateClusterMasterSnapshotResponse>
     */
    public CompletableFuture<CreateClusterMasterSnapshotResponse> createClusterMasterSnapshotAsync(
        CreateClusterMasterSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createClusterMasterSnapshot);
    }

    /**
     * 集群备份
     *
     * 集群备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterMasterSnapshotRequest 请求对象
     * @return AsyncInvoker<CreateClusterMasterSnapshotRequest, CreateClusterMasterSnapshotResponse>
     */
    public AsyncInvoker<CreateClusterMasterSnapshotRequest, CreateClusterMasterSnapshotResponse> createClusterMasterSnapshotAsyncInvoker(
        CreateClusterMasterSnapshotRequest request) {
        return new AsyncInvoker<CreateClusterMasterSnapshotRequest, CreateClusterMasterSnapshotResponse>(request,
            CceMeta.createClusterMasterSnapshot, hcClient);
    }

    /**
     * 获取集群证书
     *
     * 该API用于获取指定集群的证书信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKubernetesClusterCertRequest 请求对象
     * @return CompletableFuture<CreateKubernetesClusterCertResponse>
     */
    public CompletableFuture<CreateKubernetesClusterCertResponse> createKubernetesClusterCertAsync(
        CreateKubernetesClusterCertRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createKubernetesClusterCert);
    }

    /**
     * 获取集群证书
     *
     * 该API用于获取指定集群的证书信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKubernetesClusterCertRequest 请求对象
     * @return AsyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse>
     */
    public AsyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> createKubernetesClusterCertAsyncInvoker(
        CreateKubernetesClusterCertRequest request) {
        return new AsyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse>(request,
            CceMeta.createKubernetesClusterCert, hcClient);
    }

    /**
     * 创建节点
     *
     * 该API用于在指定集群下创建节点。
     * &gt; - 若无集群，请先[创建集群](cce_02_0236.xml)。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodeRequest 请求对象
     * @return CompletableFuture<CreateNodeResponse>
     */
    public CompletableFuture<CreateNodeResponse> createNodeAsync(CreateNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createNode);
    }

    /**
     * 创建节点
     *
     * 该API用于在指定集群下创建节点。
     * &gt; - 若无集群，请先[创建集群](cce_02_0236.xml)。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodeRequest 请求对象
     * @return AsyncInvoker<CreateNodeRequest, CreateNodeResponse>
     */
    public AsyncInvoker<CreateNodeRequest, CreateNodeResponse> createNodeAsyncInvoker(CreateNodeRequest request) {
        return new AsyncInvoker<CreateNodeRequest, CreateNodeResponse>(request, CceMeta.createNode, hcClient);
    }

    /**
     * 创建节点池
     *
     * 该API用于在指定集群下创建节点池。仅支持集群在处于可用、扩容、缩容状态时调用。
     * 
     * 1.21版本的集群创建节点池时支持绑定安全组，每个节点池最多绑定五个安全组。
     * 
     * 更新节点池的安全组后，只针对新创的pod生效，建议驱逐节点上原有的pod。
     * 
     * &gt; 若无集群，请先[创建集群](cce_02_0236.xml)。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodePoolRequest 请求对象
     * @return CompletableFuture<CreateNodePoolResponse>
     */
    public CompletableFuture<CreateNodePoolResponse> createNodePoolAsync(CreateNodePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createNodePool);
    }

    /**
     * 创建节点池
     *
     * 该API用于在指定集群下创建节点池。仅支持集群在处于可用、扩容、缩容状态时调用。
     * 
     * 1.21版本的集群创建节点池时支持绑定安全组，每个节点池最多绑定五个安全组。
     * 
     * 更新节点池的安全组后，只针对新创的pod生效，建议驱逐节点上原有的pod。
     * 
     * &gt; 若无集群，请先[创建集群](cce_02_0236.xml)。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodePoolRequest 请求对象
     * @return AsyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse>
     */
    public AsyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse> createNodePoolAsyncInvoker(
        CreateNodePoolRequest request) {
        return new AsyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse>(request, CceMeta.createNodePool,
            hcClient);
    }

    /**
     * 创建分区
     *
     * 创建分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePartitionRequest 请求对象
     * @return CompletableFuture<CreatePartitionResponse>
     */
    public CompletableFuture<CreatePartitionResponse> createPartitionAsync(CreatePartitionRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createPartition);
    }

    /**
     * 创建分区
     *
     * 创建分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePartitionRequest 请求对象
     * @return AsyncInvoker<CreatePartitionRequest, CreatePartitionResponse>
     */
    public AsyncInvoker<CreatePartitionRequest, CreatePartitionResponse> createPartitionAsyncInvoker(
        CreatePartitionRequest request) {
        return new AsyncInvoker<CreatePartitionRequest, CreatePartitionResponse>(request, CceMeta.createPartition,
            hcClient);
    }

    /**
     * 集群升级后确认
     *
     * 集群升级后确认，该接口建议配合Console使用，主要用于升级步骤完成后，客户确认集群状态和业务正常后做反馈。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostCheckRequest 请求对象
     * @return CompletableFuture<CreatePostCheckResponse>
     */
    public CompletableFuture<CreatePostCheckResponse> createPostCheckAsync(CreatePostCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createPostCheck);
    }

    /**
     * 集群升级后确认
     *
     * 集群升级后确认，该接口建议配合Console使用，主要用于升级步骤完成后，客户确认集群状态和业务正常后做反馈。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostCheckRequest 请求对象
     * @return AsyncInvoker<CreatePostCheckRequest, CreatePostCheckResponse>
     */
    public AsyncInvoker<CreatePostCheckRequest, CreatePostCheckResponse> createPostCheckAsyncInvoker(
        CreatePostCheckRequest request) {
        return new AsyncInvoker<CreatePostCheckRequest, CreatePostCheckResponse>(request, CceMeta.createPostCheck,
            hcClient);
    }

    /**
     * 集群升级前检查
     *
     * 集群升级前检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePreCheckRequest 请求对象
     * @return CompletableFuture<CreatePreCheckResponse>
     */
    public CompletableFuture<CreatePreCheckResponse> createPreCheckAsync(CreatePreCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createPreCheck);
    }

    /**
     * 集群升级前检查
     *
     * 集群升级前检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePreCheckRequest 请求对象
     * @return AsyncInvoker<CreatePreCheckRequest, CreatePreCheckResponse>
     */
    public AsyncInvoker<CreatePreCheckRequest, CreatePreCheckResponse> createPreCheckAsyncInvoker(
        CreatePreCheckRequest request) {
        return new AsyncInvoker<CreatePreCheckRequest, CreatePreCheckResponse>(request, CceMeta.createPreCheck,
            hcClient);
    }

    /**
     * 创建模板实例
     *
     * 创建模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateReleaseRequest 请求对象
     * @return CompletableFuture<CreateReleaseResponse>
     */
    public CompletableFuture<CreateReleaseResponse> createReleaseAsync(CreateReleaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createRelease);
    }

    /**
     * 创建模板实例
     *
     * 创建模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateReleaseRequest 请求对象
     * @return AsyncInvoker<CreateReleaseRequest, CreateReleaseResponse>
     */
    public AsyncInvoker<CreateReleaseRequest, CreateReleaseResponse> createReleaseAsyncInvoker(
        CreateReleaseRequest request) {
        return new AsyncInvoker<CreateReleaseRequest, CreateReleaseResponse>(request, CceMeta.createRelease, hcClient);
    }

    /**
     * 开启集群升级流程引导任务
     *
     * 该API用于创建一个集群升级流程引导任务。请在调用本接口完成引导任务创建之后，通过集群升级前检查开始检查任务。
     * 升级流程任务用于控制集群升级任务的执行流程，执行流程为 升级前检查 &#x3D;&gt; 集群升级 &#x3D;&gt; 升级后检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUpgradeWorkFlowRequest 请求对象
     * @return CompletableFuture<CreateUpgradeWorkFlowResponse>
     */
    public CompletableFuture<CreateUpgradeWorkFlowResponse> createUpgradeWorkFlowAsync(
        CreateUpgradeWorkFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createUpgradeWorkFlow);
    }

    /**
     * 开启集群升级流程引导任务
     *
     * 该API用于创建一个集群升级流程引导任务。请在调用本接口完成引导任务创建之后，通过集群升级前检查开始检查任务。
     * 升级流程任务用于控制集群升级任务的执行流程，执行流程为 升级前检查 &#x3D;&gt; 集群升级 &#x3D;&gt; 升级后检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUpgradeWorkFlowRequest 请求对象
     * @return AsyncInvoker<CreateUpgradeWorkFlowRequest, CreateUpgradeWorkFlowResponse>
     */
    public AsyncInvoker<CreateUpgradeWorkFlowRequest, CreateUpgradeWorkFlowResponse> createUpgradeWorkFlowAsyncInvoker(
        CreateUpgradeWorkFlowRequest request) {
        return new AsyncInvoker<CreateUpgradeWorkFlowRequest, CreateUpgradeWorkFlowResponse>(request,
            CceMeta.createUpgradeWorkFlow, hcClient);
    }

    /**
     * 删除AddonInstance
     *
     * 删除插件实例的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddonInstanceRequest 请求对象
     * @return CompletableFuture<DeleteAddonInstanceResponse>
     */
    public CompletableFuture<DeleteAddonInstanceResponse> deleteAddonInstanceAsync(DeleteAddonInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.deleteAddonInstance);
    }

    /**
     * 删除AddonInstance
     *
     * 删除插件实例的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddonInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse>
     */
    public AsyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> deleteAddonInstanceAsyncInvoker(
        DeleteAddonInstanceRequest request) {
        return new AsyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse>(request,
            CceMeta.deleteAddonInstance, hcClient);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteChartRequest 请求对象
     * @return CompletableFuture<DeleteChartResponse>
     */
    public CompletableFuture<DeleteChartResponse> deleteChartAsync(DeleteChartRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.deleteChart);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteChartRequest 请求对象
     * @return AsyncInvoker<DeleteChartRequest, DeleteChartResponse>
     */
    public AsyncInvoker<DeleteChartRequest, DeleteChartResponse> deleteChartAsyncInvoker(DeleteChartRequest request) {
        return new AsyncInvoker<DeleteChartRequest, DeleteChartResponse>(request, CceMeta.deleteChart, hcClient);
    }

    /**
     * 删除PVC（待废弃）
     *
     * 该API用于删除指定Namespace下的PVC（PersistentVolumeClaim）对象，并可以选择保留后端的云存储。该API待废弃，请使用Kubernetes PVC相关接口。
     * &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCloudPersistentVolumeClaimsRequest 请求对象
     * @return CompletableFuture<DeleteCloudPersistentVolumeClaimsResponse>
     */
    public CompletableFuture<DeleteCloudPersistentVolumeClaimsResponse> deleteCloudPersistentVolumeClaimsAsync(
        DeleteCloudPersistentVolumeClaimsRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.deleteCloudPersistentVolumeClaims);
    }

    /**
     * 删除PVC（待废弃）
     *
     * 该API用于删除指定Namespace下的PVC（PersistentVolumeClaim）对象，并可以选择保留后端的云存储。该API待废弃，请使用Kubernetes PVC相关接口。
     * &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCloudPersistentVolumeClaimsRequest 请求对象
     * @return AsyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse>
     */
    public AsyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> deleteCloudPersistentVolumeClaimsAsyncInvoker(
        DeleteCloudPersistentVolumeClaimsRequest request) {
        return new AsyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse>(
            request, CceMeta.deleteCloudPersistentVolumeClaims, hcClient);
    }

    /**
     * 删除集群
     *
     * 该API用于删除一个指定的集群。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return CompletableFuture<DeleteClusterResponse>
     */
    public CompletableFuture<DeleteClusterResponse> deleteClusterAsync(DeleteClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 该API用于删除一个指定的集群。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(
        DeleteClusterRequest request) {
        return new AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, CceMeta.deleteCluster, hcClient);
    }

    /**
     * 删除节点
     *
     * 该API用于删除指定的节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodeRequest 请求对象
     * @return CompletableFuture<DeleteNodeResponse>
     */
    public CompletableFuture<DeleteNodeResponse> deleteNodeAsync(DeleteNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.deleteNode);
    }

    /**
     * 删除节点
     *
     * 该API用于删除指定的节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodeRequest 请求对象
     * @return AsyncInvoker<DeleteNodeRequest, DeleteNodeResponse>
     */
    public AsyncInvoker<DeleteNodeRequest, DeleteNodeResponse> deleteNodeAsyncInvoker(DeleteNodeRequest request) {
        return new AsyncInvoker<DeleteNodeRequest, DeleteNodeResponse>(request, CceMeta.deleteNode, hcClient);
    }

    /**
     * 删除节点池
     *
     * 该API用于删除指定的节点池。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodePoolRequest 请求对象
     * @return CompletableFuture<DeleteNodePoolResponse>
     */
    public CompletableFuture<DeleteNodePoolResponse> deleteNodePoolAsync(DeleteNodePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.deleteNodePool);
    }

    /**
     * 删除节点池
     *
     * 该API用于删除指定的节点池。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodePoolRequest 请求对象
     * @return AsyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse>
     */
    public AsyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse> deleteNodePoolAsyncInvoker(
        DeleteNodePoolRequest request) {
        return new AsyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse>(request, CceMeta.deleteNodePool,
            hcClient);
    }

    /**
     * 删除指定模板实例
     *
     * 删除指定模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteReleaseRequest 请求对象
     * @return CompletableFuture<DeleteReleaseResponse>
     */
    public CompletableFuture<DeleteReleaseResponse> deleteReleaseAsync(DeleteReleaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.deleteRelease);
    }

    /**
     * 删除指定模板实例
     *
     * 删除指定模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteReleaseRequest 请求对象
     * @return AsyncInvoker<DeleteReleaseRequest, DeleteReleaseResponse>
     */
    public AsyncInvoker<DeleteReleaseRequest, DeleteReleaseResponse> deleteReleaseAsyncInvoker(
        DeleteReleaseRequest request) {
        return new AsyncInvoker<DeleteReleaseRequest, DeleteReleaseResponse>(request, CceMeta.deleteRelease, hcClient);
    }

    /**
     * 下载模板
     *
     * 下载模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadChartRequest 请求对象
     * @return CompletableFuture<DownloadChartResponse>
     */
    public CompletableFuture<DownloadChartResponse> downloadChartAsync(DownloadChartRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.downloadChart);
    }

    /**
     * 下载模板
     *
     * 下载模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadChartRequest 请求对象
     * @return AsyncInvoker<DownloadChartRequest, DownloadChartResponse>
     */
    public AsyncInvoker<DownloadChartRequest, DownloadChartResponse> downloadChartAsyncInvoker(
        DownloadChartRequest request) {
        return new AsyncInvoker<DownloadChartRequest, DownloadChartResponse>(request, CceMeta.downloadChart, hcClient);
    }

    /**
     * 集群休眠
     *
     * 集群休眠用于将运行中的集群置于休眠状态，休眠后，将不再收取控制节点资源费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param HibernateClusterRequest 请求对象
     * @return CompletableFuture<HibernateClusterResponse>
     */
    public CompletableFuture<HibernateClusterResponse> hibernateClusterAsync(HibernateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.hibernateCluster);
    }

    /**
     * 集群休眠
     *
     * 集群休眠用于将运行中的集群置于休眠状态，休眠后，将不再收取控制节点资源费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param HibernateClusterRequest 请求对象
     * @return AsyncInvoker<HibernateClusterRequest, HibernateClusterResponse>
     */
    public AsyncInvoker<HibernateClusterRequest, HibernateClusterResponse> hibernateClusterAsyncInvoker(
        HibernateClusterRequest request) {
        return new AsyncInvoker<HibernateClusterRequest, HibernateClusterResponse>(request, CceMeta.hibernateCluster,
            hcClient);
    }

    /**
     * 获取AddonInstance列表
     *
     * 获取集群所有已安装插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddonInstancesRequest 请求对象
     * @return CompletableFuture<ListAddonInstancesResponse>
     */
    public CompletableFuture<ListAddonInstancesResponse> listAddonInstancesAsync(ListAddonInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listAddonInstances);
    }

    /**
     * 获取AddonInstance列表
     *
     * 获取集群所有已安装插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddonInstancesRequest 请求对象
     * @return AsyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse>
     */
    public AsyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse> listAddonInstancesAsyncInvoker(
        ListAddonInstancesRequest request) {
        return new AsyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse>(request,
            CceMeta.listAddonInstances, hcClient);
    }

    /**
     * 查询AddonTemplates列表
     *
     * 插件模板查询接口，查询插件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddonTemplatesRequest 请求对象
     * @return CompletableFuture<ListAddonTemplatesResponse>
     */
    public CompletableFuture<ListAddonTemplatesResponse> listAddonTemplatesAsync(ListAddonTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listAddonTemplates);
    }

    /**
     * 查询AddonTemplates列表
     *
     * 插件模板查询接口，查询插件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddonTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse>
     */
    public AsyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse> listAddonTemplatesAsyncInvoker(
        ListAddonTemplatesRequest request) {
        return new AsyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse>(request,
            CceMeta.listAddonTemplates, hcClient);
    }

    /**
     * 获取模板列表
     *
     * 获取模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListChartsRequest 请求对象
     * @return CompletableFuture<ListChartsResponse>
     */
    public CompletableFuture<ListChartsResponse> listChartsAsync(ListChartsRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listCharts);
    }

    /**
     * 获取模板列表
     *
     * 获取模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListChartsRequest 请求对象
     * @return AsyncInvoker<ListChartsRequest, ListChartsResponse>
     */
    public AsyncInvoker<ListChartsRequest, ListChartsResponse> listChartsAsyncInvoker(ListChartsRequest request) {
        return new AsyncInvoker<ListChartsRequest, ListChartsResponse>(request, CceMeta.listCharts, hcClient);
    }

    /**
     * 获取集群备份任务详情列表
     *
     * 获取集群备份任务详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterMasterSnapshotTasksRequest 请求对象
     * @return CompletableFuture<ListClusterMasterSnapshotTasksResponse>
     */
    public CompletableFuture<ListClusterMasterSnapshotTasksResponse> listClusterMasterSnapshotTasksAsync(
        ListClusterMasterSnapshotTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listClusterMasterSnapshotTasks);
    }

    /**
     * 获取集群备份任务详情列表
     *
     * 获取集群备份任务详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterMasterSnapshotTasksRequest 请求对象
     * @return AsyncInvoker<ListClusterMasterSnapshotTasksRequest, ListClusterMasterSnapshotTasksResponse>
     */
    public AsyncInvoker<ListClusterMasterSnapshotTasksRequest, ListClusterMasterSnapshotTasksResponse> listClusterMasterSnapshotTasksAsyncInvoker(
        ListClusterMasterSnapshotTasksRequest request) {
        return new AsyncInvoker<ListClusterMasterSnapshotTasksRequest, ListClusterMasterSnapshotTasksResponse>(request,
            CceMeta.listClusterMasterSnapshotTasks, hcClient);
    }

    /**
     * 获取集群升级特性开关配置
     *
     * 获取集群升级特性开关配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterUpgradeFeatureGatesRequest 请求对象
     * @return CompletableFuture<ListClusterUpgradeFeatureGatesResponse>
     */
    public CompletableFuture<ListClusterUpgradeFeatureGatesResponse> listClusterUpgradeFeatureGatesAsync(
        ListClusterUpgradeFeatureGatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listClusterUpgradeFeatureGates);
    }

    /**
     * 获取集群升级特性开关配置
     *
     * 获取集群升级特性开关配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterUpgradeFeatureGatesRequest 请求对象
     * @return AsyncInvoker<ListClusterUpgradeFeatureGatesRequest, ListClusterUpgradeFeatureGatesResponse>
     */
    public AsyncInvoker<ListClusterUpgradeFeatureGatesRequest, ListClusterUpgradeFeatureGatesResponse> listClusterUpgradeFeatureGatesAsyncInvoker(
        ListClusterUpgradeFeatureGatesRequest request) {
        return new AsyncInvoker<ListClusterUpgradeFeatureGatesRequest, ListClusterUpgradeFeatureGatesResponse>(request,
            CceMeta.listClusterUpgradeFeatureGates, hcClient);
    }

    /**
     * 获取集群升级路径
     *
     * 获取集群升级路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterUpgradePathsRequest 请求对象
     * @return CompletableFuture<ListClusterUpgradePathsResponse>
     */
    public CompletableFuture<ListClusterUpgradePathsResponse> listClusterUpgradePathsAsync(
        ListClusterUpgradePathsRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listClusterUpgradePaths);
    }

    /**
     * 获取集群升级路径
     *
     * 获取集群升级路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterUpgradePathsRequest 请求对象
     * @return AsyncInvoker<ListClusterUpgradePathsRequest, ListClusterUpgradePathsResponse>
     */
    public AsyncInvoker<ListClusterUpgradePathsRequest, ListClusterUpgradePathsResponse> listClusterUpgradePathsAsyncInvoker(
        ListClusterUpgradePathsRequest request) {
        return new AsyncInvoker<ListClusterUpgradePathsRequest, ListClusterUpgradePathsResponse>(request,
            CceMeta.listClusterUpgradePaths, hcClient);
    }

    /**
     * 获取指定项目下的集群
     *
     * 该API用于获取指定项目下所有集群的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return CompletableFuture<ListClustersResponse>
     */
    public CompletableFuture<ListClustersResponse> listClustersAsync(ListClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listClusters);
    }

    /**
     * 获取指定项目下的集群
     *
     * 该API用于获取指定项目下所有集群的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return AsyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public AsyncInvoker<ListClustersRequest, ListClustersResponse> listClustersAsyncInvoker(
        ListClustersRequest request) {
        return new AsyncInvoker<ListClustersRequest, ListClustersResponse>(request, CceMeta.listClusters, hcClient);
    }

    /**
     * 获取集群下所有节点池
     *
     * 该API用于获取集群下所有节点池。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * &gt; - nodepool是集群中具有相同配置的节点实例的子集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodePoolsRequest 请求对象
     * @return CompletableFuture<ListNodePoolsResponse>
     */
    public CompletableFuture<ListNodePoolsResponse> listNodePoolsAsync(ListNodePoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listNodePools);
    }

    /**
     * 获取集群下所有节点池
     *
     * 该API用于获取集群下所有节点池。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * &gt; - nodepool是集群中具有相同配置的节点实例的子集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodePoolsRequest 请求对象
     * @return AsyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse>
     */
    public AsyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse> listNodePoolsAsyncInvoker(
        ListNodePoolsRequest request) {
        return new AsyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse>(request, CceMeta.listNodePools, hcClient);
    }

    /**
     * 获取集群下所有节点
     *
     * 该API用于通过集群ID获取指定集群下所有节点的详细信息。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodesRequest 请求对象
     * @return CompletableFuture<ListNodesResponse>
     */
    public CompletableFuture<ListNodesResponse> listNodesAsync(ListNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listNodes);
    }

    /**
     * 获取集群下所有节点
     *
     * 该API用于通过集群ID获取指定集群下所有节点的详细信息。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodesRequest 请求对象
     * @return AsyncInvoker<ListNodesRequest, ListNodesResponse>
     */
    public AsyncInvoker<ListNodesRequest, ListNodesResponse> listNodesAsyncInvoker(ListNodesRequest request) {
        return new AsyncInvoker<ListNodesRequest, ListNodesResponse>(request, CceMeta.listNodes, hcClient);
    }

    /**
     * 获取分区列表
     *
     * 获取分区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionsRequest 请求对象
     * @return CompletableFuture<ListPartitionsResponse>
     */
    public CompletableFuture<ListPartitionsResponse> listPartitionsAsync(ListPartitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listPartitions);
    }

    /**
     * 获取分区列表
     *
     * 获取分区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionsRequest 请求对象
     * @return AsyncInvoker<ListPartitionsRequest, ListPartitionsResponse>
     */
    public AsyncInvoker<ListPartitionsRequest, ListPartitionsResponse> listPartitionsAsyncInvoker(
        ListPartitionsRequest request) {
        return new AsyncInvoker<ListPartitionsRequest, ListPartitionsResponse>(request, CceMeta.listPartitions,
            hcClient);
    }

    /**
     * 获取集群升级前检查任务详情列表
     *
     * 获取集群升级前检查任务详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPreCheckTasksRequest 请求对象
     * @return CompletableFuture<ListPreCheckTasksResponse>
     */
    public CompletableFuture<ListPreCheckTasksResponse> listPreCheckTasksAsync(ListPreCheckTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listPreCheckTasks);
    }

    /**
     * 获取集群升级前检查任务详情列表
     *
     * 获取集群升级前检查任务详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPreCheckTasksRequest 请求对象
     * @return AsyncInvoker<ListPreCheckTasksRequest, ListPreCheckTasksResponse>
     */
    public AsyncInvoker<ListPreCheckTasksRequest, ListPreCheckTasksResponse> listPreCheckTasksAsyncInvoker(
        ListPreCheckTasksRequest request) {
        return new AsyncInvoker<ListPreCheckTasksRequest, ListPreCheckTasksResponse>(request, CceMeta.listPreCheckTasks,
            hcClient);
    }

    /**
     * 获取模板实例列表
     *
     * 获取模板实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReleasesRequest 请求对象
     * @return CompletableFuture<ListReleasesResponse>
     */
    public CompletableFuture<ListReleasesResponse> listReleasesAsync(ListReleasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listReleases);
    }

    /**
     * 获取模板实例列表
     *
     * 获取模板实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReleasesRequest 请求对象
     * @return AsyncInvoker<ListReleasesRequest, ListReleasesResponse>
     */
    public AsyncInvoker<ListReleasesRequest, ListReleasesResponse> listReleasesAsyncInvoker(
        ListReleasesRequest request) {
        return new AsyncInvoker<ListReleasesRequest, ListReleasesResponse>(request, CceMeta.listReleases, hcClient);
    }

    /**
     * 获取集群升级任务详情列表
     *
     * 获取集群升级任务详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUpgradeClusterTasksRequest 请求对象
     * @return CompletableFuture<ListUpgradeClusterTasksResponse>
     */
    public CompletableFuture<ListUpgradeClusterTasksResponse> listUpgradeClusterTasksAsync(
        ListUpgradeClusterTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listUpgradeClusterTasks);
    }

    /**
     * 获取集群升级任务详情列表
     *
     * 获取集群升级任务详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUpgradeClusterTasksRequest 请求对象
     * @return AsyncInvoker<ListUpgradeClusterTasksRequest, ListUpgradeClusterTasksResponse>
     */
    public AsyncInvoker<ListUpgradeClusterTasksRequest, ListUpgradeClusterTasksResponse> listUpgradeClusterTasksAsyncInvoker(
        ListUpgradeClusterTasksRequest request) {
        return new AsyncInvoker<ListUpgradeClusterTasksRequest, ListUpgradeClusterTasksResponse>(request,
            CceMeta.listUpgradeClusterTasks, hcClient);
    }

    /**
     * 获取UpgradeWorkFlows列表
     *
     * 获取历史集群升级引导任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUpgradeWorkFlowsRequest 请求对象
     * @return CompletableFuture<ListUpgradeWorkFlowsResponse>
     */
    public CompletableFuture<ListUpgradeWorkFlowsResponse> listUpgradeWorkFlowsAsync(
        ListUpgradeWorkFlowsRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listUpgradeWorkFlows);
    }

    /**
     * 获取UpgradeWorkFlows列表
     *
     * 获取历史集群升级引导任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUpgradeWorkFlowsRequest 请求对象
     * @return AsyncInvoker<ListUpgradeWorkFlowsRequest, ListUpgradeWorkFlowsResponse>
     */
    public AsyncInvoker<ListUpgradeWorkFlowsRequest, ListUpgradeWorkFlowsResponse> listUpgradeWorkFlowsAsyncInvoker(
        ListUpgradeWorkFlowsRequest request) {
        return new AsyncInvoker<ListUpgradeWorkFlowsRequest, ListUpgradeWorkFlowsResponse>(request,
            CceMeta.listUpgradeWorkFlows, hcClient);
    }

    /**
     * 节点迁移
     *
     * 该API用于在指定集群下迁移节点到另一集群。
     * 
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateNodeRequest 请求对象
     * @return CompletableFuture<MigrateNodeResponse>
     */
    public CompletableFuture<MigrateNodeResponse> migrateNodeAsync(MigrateNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.migrateNode);
    }

    /**
     * 节点迁移
     *
     * 该API用于在指定集群下迁移节点到另一集群。
     * 
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateNodeRequest 请求对象
     * @return AsyncInvoker<MigrateNodeRequest, MigrateNodeResponse>
     */
    public AsyncInvoker<MigrateNodeRequest, MigrateNodeResponse> migrateNodeAsyncInvoker(MigrateNodeRequest request) {
        return new AsyncInvoker<MigrateNodeRequest, MigrateNodeResponse>(request, CceMeta.migrateNode, hcClient);
    }

    /**
     * 暂停集群升级任务
     *
     * 暂停集群升级任务。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PauseUpgradeClusterTaskRequest 请求对象
     * @return CompletableFuture<PauseUpgradeClusterTaskResponse>
     */
    public CompletableFuture<PauseUpgradeClusterTaskResponse> pauseUpgradeClusterTaskAsync(
        PauseUpgradeClusterTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.pauseUpgradeClusterTask);
    }

    /**
     * 暂停集群升级任务
     *
     * 暂停集群升级任务。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PauseUpgradeClusterTaskRequest 请求对象
     * @return AsyncInvoker<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse>
     */
    public AsyncInvoker<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse> pauseUpgradeClusterTaskAsyncInvoker(
        PauseUpgradeClusterTaskRequest request) {
        return new AsyncInvoker<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse>(request,
            CceMeta.pauseUpgradeClusterTask, hcClient);
    }

    /**
     * 节点移除
     *
     * 该API用于在指定集群下移除节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveNodeRequest 请求对象
     * @return CompletableFuture<RemoveNodeResponse>
     */
    public CompletableFuture<RemoveNodeResponse> removeNodeAsync(RemoveNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.removeNode);
    }

    /**
     * 节点移除
     *
     * 该API用于在指定集群下移除节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveNodeRequest 请求对象
     * @return AsyncInvoker<RemoveNodeRequest, RemoveNodeResponse>
     */
    public AsyncInvoker<RemoveNodeRequest, RemoveNodeResponse> removeNodeAsyncInvoker(RemoveNodeRequest request) {
        return new AsyncInvoker<RemoveNodeRequest, RemoveNodeResponse>(request, CceMeta.removeNode, hcClient);
    }

    /**
     * 重置节点
     *
     * 该API用于在指定集群下重置节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetNodeRequest 请求对象
     * @return CompletableFuture<ResetNodeResponse>
     */
    public CompletableFuture<ResetNodeResponse> resetNodeAsync(ResetNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.resetNode);
    }

    /**
     * 重置节点
     *
     * 该API用于在指定集群下重置节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetNodeRequest 请求对象
     * @return AsyncInvoker<ResetNodeRequest, ResetNodeResponse>
     */
    public AsyncInvoker<ResetNodeRequest, ResetNodeResponse> resetNodeAsyncInvoker(ResetNodeRequest request) {
        return new AsyncInvoker<ResetNodeRequest, ResetNodeResponse>(request, CceMeta.resetNode, hcClient);
    }

    /**
     * 变更集群规格
     *
     * 该API用于变更一个指定集群的规格。
     * 
     * &gt;   - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * &gt;   [- 使用限制请参考[变更集群规格](https://support.huaweicloud.com/usermanual-cce/cce_10_0403.html)。](tag:hws)
     * &gt;   [- 使用限制请参考[变更集群规格](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0403.html)](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeClusterRequest 请求对象
     * @return CompletableFuture<ResizeClusterResponse>
     */
    public CompletableFuture<ResizeClusterResponse> resizeClusterAsync(ResizeClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.resizeCluster);
    }

    /**
     * 变更集群规格
     *
     * 该API用于变更一个指定集群的规格。
     * 
     * &gt;   - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * &gt;   [- 使用限制请参考[变更集群规格](https://support.huaweicloud.com/usermanual-cce/cce_10_0403.html)。](tag:hws)
     * &gt;   [- 使用限制请参考[变更集群规格](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0403.html)](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeClusterRequest 请求对象
     * @return AsyncInvoker<ResizeClusterRequest, ResizeClusterResponse>
     */
    public AsyncInvoker<ResizeClusterRequest, ResizeClusterResponse> resizeClusterAsyncInvoker(
        ResizeClusterRequest request) {
        return new AsyncInvoker<ResizeClusterRequest, ResizeClusterResponse>(request, CceMeta.resizeCluster, hcClient);
    }

    /**
     * 重试集群升级任务
     *
     * 重新执行失败的集群升级任务。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryUpgradeClusterTaskRequest 请求对象
     * @return CompletableFuture<RetryUpgradeClusterTaskResponse>
     */
    public CompletableFuture<RetryUpgradeClusterTaskResponse> retryUpgradeClusterTaskAsync(
        RetryUpgradeClusterTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.retryUpgradeClusterTask);
    }

    /**
     * 重试集群升级任务
     *
     * 重新执行失败的集群升级任务。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryUpgradeClusterTaskRequest 请求对象
     * @return AsyncInvoker<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse>
     */
    public AsyncInvoker<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse> retryUpgradeClusterTaskAsyncInvoker(
        RetryUpgradeClusterTaskRequest request) {
        return new AsyncInvoker<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse>(request,
            CceMeta.retryUpgradeClusterTask, hcClient);
    }

    /**
     * 回滚AddonInstance
     *
     * 将插件实例回滚到升级前的版本。只有在当前插件实例版本支持回滚到升级前的版本（status.isRollbackable为true），且插件实例状态为running（运行中）、available（可用）、abnormal（不可用）、upgradeFailed（升级失败）、rollbackFailed（回滚失败）时支持回滚。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RollbackAddonInstanceRequest 请求对象
     * @return CompletableFuture<RollbackAddonInstanceResponse>
     */
    public CompletableFuture<RollbackAddonInstanceResponse> rollbackAddonInstanceAsync(
        RollbackAddonInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.rollbackAddonInstance);
    }

    /**
     * 回滚AddonInstance
     *
     * 将插件实例回滚到升级前的版本。只有在当前插件实例版本支持回滚到升级前的版本（status.isRollbackable为true），且插件实例状态为running（运行中）、available（可用）、abnormal（不可用）、upgradeFailed（升级失败）、rollbackFailed（回滚失败）时支持回滚。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RollbackAddonInstanceRequest 请求对象
     * @return AsyncInvoker<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse>
     */
    public AsyncInvoker<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse> rollbackAddonInstanceAsyncInvoker(
        RollbackAddonInstanceRequest request) {
        return new AsyncInvoker<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse>(request,
            CceMeta.rollbackAddonInstance, hcClient);
    }

    /**
     * 获取AddonInstance详情
     *
     * 获取插件实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAddonInstanceRequest 请求对象
     * @return CompletableFuture<ShowAddonInstanceResponse>
     */
    public CompletableFuture<ShowAddonInstanceResponse> showAddonInstanceAsync(ShowAddonInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showAddonInstance);
    }

    /**
     * 获取AddonInstance详情
     *
     * 获取插件实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAddonInstanceRequest 请求对象
     * @return AsyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse>
     */
    public AsyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse> showAddonInstanceAsyncInvoker(
        ShowAddonInstanceRequest request) {
        return new AsyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse>(request, CceMeta.showAddonInstance,
            hcClient);
    }

    /**
     * 获取模板
     *
     * 获取模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowChartRequest 请求对象
     * @return CompletableFuture<ShowChartResponse>
     */
    public CompletableFuture<ShowChartResponse> showChartAsync(ShowChartRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showChart);
    }

    /**
     * 获取模板
     *
     * 获取模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowChartRequest 请求对象
     * @return AsyncInvoker<ShowChartRequest, ShowChartResponse>
     */
    public AsyncInvoker<ShowChartRequest, ShowChartResponse> showChartAsyncInvoker(ShowChartRequest request) {
        return new AsyncInvoker<ShowChartRequest, ShowChartResponse>(request, CceMeta.showChart, hcClient);
    }

    /**
     * 获取模板Values
     *
     * 获取模板Values
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowChartValuesRequest 请求对象
     * @return CompletableFuture<ShowChartValuesResponse>
     */
    public CompletableFuture<ShowChartValuesResponse> showChartValuesAsync(ShowChartValuesRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showChartValues);
    }

    /**
     * 获取模板Values
     *
     * 获取模板Values
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowChartValuesRequest 请求对象
     * @return AsyncInvoker<ShowChartValuesRequest, ShowChartValuesResponse>
     */
    public AsyncInvoker<ShowChartValuesRequest, ShowChartValuesResponse> showChartValuesAsyncInvoker(
        ShowChartValuesRequest request) {
        return new AsyncInvoker<ShowChartValuesRequest, ShowChartValuesResponse>(request, CceMeta.showChartValues,
            hcClient);
    }

    /**
     * 获取指定的集群
     *
     * 该API用于获取指定集群的详细信息。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterRequest 请求对象
     * @return CompletableFuture<ShowClusterResponse>
     */
    public CompletableFuture<ShowClusterResponse> showClusterAsync(ShowClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showCluster);
    }

    /**
     * 获取指定的集群
     *
     * 该API用于获取指定集群的详细信息。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterRequest 请求对象
     * @return AsyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public AsyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterAsyncInvoker(ShowClusterRequest request) {
        return new AsyncInvoker<ShowClusterRequest, ShowClusterResponse>(request, CceMeta.showCluster, hcClient);
    }

    /**
     * 查询集群日志配置信息
     *
     * 获取集群组件上报的LTS的配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterConfigRequest 请求对象
     * @return CompletableFuture<ShowClusterConfigResponse>
     */
    public CompletableFuture<ShowClusterConfigResponse> showClusterConfigAsync(ShowClusterConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showClusterConfig);
    }

    /**
     * 查询集群日志配置信息
     *
     * 获取集群组件上报的LTS的配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterConfigRequest 请求对象
     * @return AsyncInvoker<ShowClusterConfigRequest, ShowClusterConfigResponse>
     */
    public AsyncInvoker<ShowClusterConfigRequest, ShowClusterConfigResponse> showClusterConfigAsyncInvoker(
        ShowClusterConfigRequest request) {
        return new AsyncInvoker<ShowClusterConfigRequest, ShowClusterConfigResponse>(request, CceMeta.showClusterConfig,
            hcClient);
    }

    /**
     * 查询指定集群支持配置的参数列表
     *
     * 该API用于查询CCE服务下指定集群支持配置的参数列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterConfigurationDetailsRequest 请求对象
     * @return CompletableFuture<ShowClusterConfigurationDetailsResponse>
     */
    public CompletableFuture<ShowClusterConfigurationDetailsResponse> showClusterConfigurationDetailsAsync(
        ShowClusterConfigurationDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showClusterConfigurationDetails);
    }

    /**
     * 查询指定集群支持配置的参数列表
     *
     * 该API用于查询CCE服务下指定集群支持配置的参数列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterConfigurationDetailsRequest 请求对象
     * @return AsyncInvoker<ShowClusterConfigurationDetailsRequest, ShowClusterConfigurationDetailsResponse>
     */
    public AsyncInvoker<ShowClusterConfigurationDetailsRequest, ShowClusterConfigurationDetailsResponse> showClusterConfigurationDetailsAsyncInvoker(
        ShowClusterConfigurationDetailsRequest request) {
        return new AsyncInvoker<ShowClusterConfigurationDetailsRequest, ShowClusterConfigurationDetailsResponse>(
            request, CceMeta.showClusterConfigurationDetails, hcClient);
    }

    /**
     * 获取集群访问的地址
     *
     * 该API用于通过集群ID获取集群访问的地址，包括PrivateIP(HA集群返回VIP)与PublicIP
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterEndpointsRequest 请求对象
     * @return CompletableFuture<ShowClusterEndpointsResponse>
     */
    public CompletableFuture<ShowClusterEndpointsResponse> showClusterEndpointsAsync(
        ShowClusterEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showClusterEndpoints);
    }

    /**
     * 获取集群访问的地址
     *
     * 该API用于通过集群ID获取集群访问的地址，包括PrivateIP(HA集群返回VIP)与PublicIP
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterEndpointsRequest 请求对象
     * @return AsyncInvoker<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse>
     */
    public AsyncInvoker<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse> showClusterEndpointsAsyncInvoker(
        ShowClusterEndpointsRequest request) {
        return new AsyncInvoker<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse>(request,
            CceMeta.showClusterEndpoints, hcClient);
    }

    /**
     * 获取集群升级相关信息
     *
     * 获取集群升级相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterUpgradeInfoRequest 请求对象
     * @return CompletableFuture<ShowClusterUpgradeInfoResponse>
     */
    public CompletableFuture<ShowClusterUpgradeInfoResponse> showClusterUpgradeInfoAsync(
        ShowClusterUpgradeInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showClusterUpgradeInfo);
    }

    /**
     * 获取集群升级相关信息
     *
     * 获取集群升级相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterUpgradeInfoRequest 请求对象
     * @return AsyncInvoker<ShowClusterUpgradeInfoRequest, ShowClusterUpgradeInfoResponse>
     */
    public AsyncInvoker<ShowClusterUpgradeInfoRequest, ShowClusterUpgradeInfoResponse> showClusterUpgradeInfoAsyncInvoker(
        ShowClusterUpgradeInfoRequest request) {
        return new AsyncInvoker<ShowClusterUpgradeInfoRequest, ShowClusterUpgradeInfoResponse>(request,
            CceMeta.showClusterUpgradeInfo, hcClient);
    }

    /**
     * 获取任务信息
     *
     * 该API用于获取任务信息。通过某一任务请求下发后返回的jobID来查询指定任务的进度。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * &gt; - 该接口通常使用场景为：
     * &gt;   - 创建、删除集群时，查询相应任务的进度。
     * &gt;   - 创建、删除节点时，查询相应任务的进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showJob);
    }

    /**
     * 获取任务信息
     *
     * 该API用于获取任务信息。通过某一任务请求下发后返回的jobID来查询指定任务的进度。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * &gt; - 该接口通常使用场景为：
     * &gt;   - 创建、删除集群时，查询相应任务的进度。
     * &gt;   - 创建、删除节点时，查询相应任务的进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, CceMeta.showJob, hcClient);
    }

    /**
     * 获取指定的节点
     *
     * 该API用于通过节点ID获取指定节点的详细信息。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeRequest 请求对象
     * @return CompletableFuture<ShowNodeResponse>
     */
    public CompletableFuture<ShowNodeResponse> showNodeAsync(ShowNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showNode);
    }

    /**
     * 获取指定的节点
     *
     * 该API用于通过节点ID获取指定节点的详细信息。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeRequest 请求对象
     * @return AsyncInvoker<ShowNodeRequest, ShowNodeResponse>
     */
    public AsyncInvoker<ShowNodeRequest, ShowNodeResponse> showNodeAsyncInvoker(ShowNodeRequest request) {
        return new AsyncInvoker<ShowNodeRequest, ShowNodeResponse>(request, CceMeta.showNode, hcClient);
    }

    /**
     * 获取指定的节点池
     *
     * 该API用于获取指定节点池的详细信息。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodePoolRequest 请求对象
     * @return CompletableFuture<ShowNodePoolResponse>
     */
    public CompletableFuture<ShowNodePoolResponse> showNodePoolAsync(ShowNodePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showNodePool);
    }

    /**
     * 获取指定的节点池
     *
     * 该API用于获取指定节点池的详细信息。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodePoolRequest 请求对象
     * @return AsyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse>
     */
    public AsyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse> showNodePoolAsyncInvoker(
        ShowNodePoolRequest request) {
        return new AsyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse>(request, CceMeta.showNodePool, hcClient);
    }

    /**
     * 查询指定节点池支持配置的参数内容
     *
     * 该API用于查询指定节点池支持配置的参数内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodePoolConfigurationsRequest 请求对象
     * @return CompletableFuture<ShowNodePoolConfigurationsResponse>
     */
    public CompletableFuture<ShowNodePoolConfigurationsResponse> showNodePoolConfigurationsAsync(
        ShowNodePoolConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showNodePoolConfigurations);
    }

    /**
     * 查询指定节点池支持配置的参数内容
     *
     * 该API用于查询指定节点池支持配置的参数内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodePoolConfigurationsRequest 请求对象
     * @return AsyncInvoker<ShowNodePoolConfigurationsRequest, ShowNodePoolConfigurationsResponse>
     */
    public AsyncInvoker<ShowNodePoolConfigurationsRequest, ShowNodePoolConfigurationsResponse> showNodePoolConfigurationsAsyncInvoker(
        ShowNodePoolConfigurationsRequest request) {
        return new AsyncInvoker<ShowNodePoolConfigurationsRequest, ShowNodePoolConfigurationsResponse>(request,
            CceMeta.showNodePoolConfigurations, hcClient);
    }

    /**
     * 获取分区详情
     *
     * 获取分区详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionRequest 请求对象
     * @return CompletableFuture<ShowPartitionResponse>
     */
    public CompletableFuture<ShowPartitionResponse> showPartitionAsync(ShowPartitionRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showPartition);
    }

    /**
     * 获取分区详情
     *
     * 获取分区详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionRequest 请求对象
     * @return AsyncInvoker<ShowPartitionRequest, ShowPartitionResponse>
     */
    public AsyncInvoker<ShowPartitionRequest, ShowPartitionResponse> showPartitionAsyncInvoker(
        ShowPartitionRequest request) {
        return new AsyncInvoker<ShowPartitionRequest, ShowPartitionResponse>(request, CceMeta.showPartition, hcClient);
    }

    /**
     * 获取集群升级前检查任务详情
     *
     * 获取集群升级前检查任务详情，任务ID由调用集群检查API后从响应体中uid字段获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPreCheckRequest 请求对象
     * @return CompletableFuture<ShowPreCheckResponse>
     */
    public CompletableFuture<ShowPreCheckResponse> showPreCheckAsync(ShowPreCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showPreCheck);
    }

    /**
     * 获取集群升级前检查任务详情
     *
     * 获取集群升级前检查任务详情，任务ID由调用集群检查API后从响应体中uid字段获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPreCheckRequest 请求对象
     * @return AsyncInvoker<ShowPreCheckRequest, ShowPreCheckResponse>
     */
    public AsyncInvoker<ShowPreCheckRequest, ShowPreCheckResponse> showPreCheckAsyncInvoker(
        ShowPreCheckRequest request) {
        return new AsyncInvoker<ShowPreCheckRequest, ShowPreCheckResponse>(request, CceMeta.showPreCheck, hcClient);
    }

    /**
     * 查询CCE服务下的资源配额
     *
     * 该API用于查询CCE服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showQuotas);
    }

    /**
     * 查询CCE服务下的资源配额
     *
     * 该API用于查询CCE服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, CceMeta.showQuotas, hcClient);
    }

    /**
     * 获取指定模板实例
     *
     * 获取指定模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseRequest 请求对象
     * @return CompletableFuture<ShowReleaseResponse>
     */
    public CompletableFuture<ShowReleaseResponse> showReleaseAsync(ShowReleaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showRelease);
    }

    /**
     * 获取指定模板实例
     *
     * 获取指定模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseRequest 请求对象
     * @return AsyncInvoker<ShowReleaseRequest, ShowReleaseResponse>
     */
    public AsyncInvoker<ShowReleaseRequest, ShowReleaseResponse> showReleaseAsyncInvoker(ShowReleaseRequest request) {
        return new AsyncInvoker<ShowReleaseRequest, ShowReleaseResponse>(request, CceMeta.showRelease, hcClient);
    }

    /**
     * 查询指定模板实例历史记录
     *
     * 查询指定模板实例历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseHistoryRequest 请求对象
     * @return CompletableFuture<ShowReleaseHistoryResponse>
     */
    public CompletableFuture<ShowReleaseHistoryResponse> showReleaseHistoryAsync(ShowReleaseHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showReleaseHistory);
    }

    /**
     * 查询指定模板实例历史记录
     *
     * 查询指定模板实例历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseHistoryRequest 请求对象
     * @return AsyncInvoker<ShowReleaseHistoryRequest, ShowReleaseHistoryResponse>
     */
    public AsyncInvoker<ShowReleaseHistoryRequest, ShowReleaseHistoryResponse> showReleaseHistoryAsyncInvoker(
        ShowReleaseHistoryRequest request) {
        return new AsyncInvoker<ShowReleaseHistoryRequest, ShowReleaseHistoryResponse>(request,
            CceMeta.showReleaseHistory, hcClient);
    }

    /**
     * 获取集群升级任务详情
     *
     * 获取集群升级任务详情，任务ID由调用集群升级API后从响应体中uid字段获取。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeClusterTaskRequest 请求对象
     * @return CompletableFuture<ShowUpgradeClusterTaskResponse>
     */
    public CompletableFuture<ShowUpgradeClusterTaskResponse> showUpgradeClusterTaskAsync(
        ShowUpgradeClusterTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showUpgradeClusterTask);
    }

    /**
     * 获取集群升级任务详情
     *
     * 获取集群升级任务详情，任务ID由调用集群升级API后从响应体中uid字段获取。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeClusterTaskRequest 请求对象
     * @return AsyncInvoker<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse>
     */
    public AsyncInvoker<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse> showUpgradeClusterTaskAsyncInvoker(
        ShowUpgradeClusterTaskRequest request) {
        return new AsyncInvoker<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse>(request,
            CceMeta.showUpgradeClusterTask, hcClient);
    }

    /**
     * 获取指定集群升级引导任务详情
     *
     * 该API用于通过升级引导任务ID获取任务的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeWorkFlowRequest 请求对象
     * @return CompletableFuture<ShowUpgradeWorkFlowResponse>
     */
    public CompletableFuture<ShowUpgradeWorkFlowResponse> showUpgradeWorkFlowAsync(ShowUpgradeWorkFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showUpgradeWorkFlow);
    }

    /**
     * 获取指定集群升级引导任务详情
     *
     * 该API用于通过升级引导任务ID获取任务的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeWorkFlowRequest 请求对象
     * @return AsyncInvoker<ShowUpgradeWorkFlowRequest, ShowUpgradeWorkFlowResponse>
     */
    public AsyncInvoker<ShowUpgradeWorkFlowRequest, ShowUpgradeWorkFlowResponse> showUpgradeWorkFlowAsyncInvoker(
        ShowUpgradeWorkFlowRequest request) {
        return new AsyncInvoker<ShowUpgradeWorkFlowRequest, ShowUpgradeWorkFlowResponse>(request,
            CceMeta.showUpgradeWorkFlow, hcClient);
    }

    /**
     * 获取用户模板配额
     *
     * 获取用户模板配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserChartsQuotasRequest 请求对象
     * @return CompletableFuture<ShowUserChartsQuotasResponse>
     */
    public CompletableFuture<ShowUserChartsQuotasResponse> showUserChartsQuotasAsync(
        ShowUserChartsQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showUserChartsQuotas);
    }

    /**
     * 获取用户模板配额
     *
     * 获取用户模板配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserChartsQuotasRequest 请求对象
     * @return AsyncInvoker<ShowUserChartsQuotasRequest, ShowUserChartsQuotasResponse>
     */
    public AsyncInvoker<ShowUserChartsQuotasRequest, ShowUserChartsQuotasResponse> showUserChartsQuotasAsyncInvoker(
        ShowUserChartsQuotasRequest request) {
        return new AsyncInvoker<ShowUserChartsQuotasRequest, ShowUserChartsQuotasResponse>(request,
            CceMeta.showUserChartsQuotas, hcClient);
    }

    /**
     * 更新AddonInstance
     *
     * 更新插件实例的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAddonInstanceRequest 请求对象
     * @return CompletableFuture<UpdateAddonInstanceResponse>
     */
    public CompletableFuture<UpdateAddonInstanceResponse> updateAddonInstanceAsync(UpdateAddonInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.updateAddonInstance);
    }

    /**
     * 更新AddonInstance
     *
     * 更新插件实例的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAddonInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse>
     */
    public AsyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> updateAddonInstanceAsyncInvoker(
        UpdateAddonInstanceRequest request) {
        return new AsyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse>(request,
            CceMeta.updateAddonInstance, hcClient);
    }

    /**
     * 更新模板
     *
     * 更新模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateChartRequest 请求对象
     * @return CompletableFuture<UpdateChartResponse>
     */
    public CompletableFuture<UpdateChartResponse> updateChartAsync(UpdateChartRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.updateChart);
    }

    /**
     * 更新模板
     *
     * 更新模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateChartRequest 请求对象
     * @return AsyncInvoker<UpdateChartRequest, UpdateChartResponse>
     */
    public AsyncInvoker<UpdateChartRequest, UpdateChartResponse> updateChartAsyncInvoker(UpdateChartRequest request) {
        return new AsyncInvoker<UpdateChartRequest, UpdateChartResponse>(request, CceMeta.updateChart, hcClient);
    }

    /**
     * 更新指定的集群
     *
     * 该API用于更新指定的集群。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterRequest 请求对象
     * @return CompletableFuture<UpdateClusterResponse>
     */
    public CompletableFuture<UpdateClusterResponse> updateClusterAsync(UpdateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.updateCluster);
    }

    /**
     * 更新指定的集群
     *
     * 该API用于更新指定的集群。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterRequest 请求对象
     * @return AsyncInvoker<UpdateClusterRequest, UpdateClusterResponse>
     */
    public AsyncInvoker<UpdateClusterRequest, UpdateClusterResponse> updateClusterAsyncInvoker(
        UpdateClusterRequest request) {
        return new AsyncInvoker<UpdateClusterRequest, UpdateClusterResponse>(request, CceMeta.updateCluster, hcClient);
    }

    /**
     * 绑定、解绑集群公网apiserver地址
     *
     * 该API用于通过集群ID绑定、解绑集群公网apiserver地址
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterEipRequest 请求对象
     * @return CompletableFuture<UpdateClusterEipResponse>
     */
    public CompletableFuture<UpdateClusterEipResponse> updateClusterEipAsync(UpdateClusterEipRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.updateClusterEip);
    }

    /**
     * 绑定、解绑集群公网apiserver地址
     *
     * 该API用于通过集群ID绑定、解绑集群公网apiserver地址
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterEipRequest 请求对象
     * @return AsyncInvoker<UpdateClusterEipRequest, UpdateClusterEipResponse>
     */
    public AsyncInvoker<UpdateClusterEipRequest, UpdateClusterEipResponse> updateClusterEipAsyncInvoker(
        UpdateClusterEipRequest request) {
        return new AsyncInvoker<UpdateClusterEipRequest, UpdateClusterEipResponse>(request, CceMeta.updateClusterEip,
            hcClient);
    }

    /**
     * 配置集群日志
     *
     * 用户可以选择集群管理节点上哪些组件的日志上报LTS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterLogConfigRequest 请求对象
     * @return CompletableFuture<UpdateClusterLogConfigResponse>
     */
    public CompletableFuture<UpdateClusterLogConfigResponse> updateClusterLogConfigAsync(
        UpdateClusterLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.updateClusterLogConfig);
    }

    /**
     * 配置集群日志
     *
     * 用户可以选择集群管理节点上哪些组件的日志上报LTS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterLogConfigRequest 请求对象
     * @return AsyncInvoker<UpdateClusterLogConfigRequest, UpdateClusterLogConfigResponse>
     */
    public AsyncInvoker<UpdateClusterLogConfigRequest, UpdateClusterLogConfigResponse> updateClusterLogConfigAsyncInvoker(
        UpdateClusterLogConfigRequest request) {
        return new AsyncInvoker<UpdateClusterLogConfigRequest, UpdateClusterLogConfigResponse>(request,
            CceMeta.updateClusterLogConfig, hcClient);
    }

    /**
     * 更新指定的节点
     *
     * 该API用于更新指定的节点。
     * &gt; - 当前仅支持更新metadata下的name字段，即节点的名字。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeRequest 请求对象
     * @return CompletableFuture<UpdateNodeResponse>
     */
    public CompletableFuture<UpdateNodeResponse> updateNodeAsync(UpdateNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.updateNode);
    }

    /**
     * 更新指定的节点
     *
     * 该API用于更新指定的节点。
     * &gt; - 当前仅支持更新metadata下的name字段，即节点的名字。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeRequest 请求对象
     * @return AsyncInvoker<UpdateNodeRequest, UpdateNodeResponse>
     */
    public AsyncInvoker<UpdateNodeRequest, UpdateNodeResponse> updateNodeAsyncInvoker(UpdateNodeRequest request) {
        return new AsyncInvoker<UpdateNodeRequest, UpdateNodeResponse>(request, CceMeta.updateNode, hcClient);
    }

    /**
     * 更新指定节点池
     *
     * 该API用于更新指定的节点池。仅支持集群在处于可用、扩容、缩容状态时调用。
     * 
     * 
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * &gt; - 当前仅支持更新节点池名称，spec下的initialNodeCount，k8sTags，taints，login，userTags与节点池的扩缩容配置相关字段。若此次更新未设置相关值，默认更新为初始值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodePoolRequest 请求对象
     * @return CompletableFuture<UpdateNodePoolResponse>
     */
    public CompletableFuture<UpdateNodePoolResponse> updateNodePoolAsync(UpdateNodePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.updateNodePool);
    }

    /**
     * 更新指定节点池
     *
     * 该API用于更新指定的节点池。仅支持集群在处于可用、扩容、缩容状态时调用。
     * 
     * 
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * &gt; - 当前仅支持更新节点池名称，spec下的initialNodeCount，k8sTags，taints，login，userTags与节点池的扩缩容配置相关字段。若此次更新未设置相关值，默认更新为初始值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodePoolRequest 请求对象
     * @return AsyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse>
     */
    public AsyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse> updateNodePoolAsyncInvoker(
        UpdateNodePoolRequest request) {
        return new AsyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse>(request, CceMeta.updateNodePool,
            hcClient);
    }

    /**
     * 修改指定节点池配置参数的值
     *
     * 该API用于修改CCE服务下指定节点池配置参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodePoolConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateNodePoolConfigurationResponse>
     */
    public CompletableFuture<UpdateNodePoolConfigurationResponse> updateNodePoolConfigurationAsync(
        UpdateNodePoolConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.updateNodePoolConfiguration);
    }

    /**
     * 修改指定节点池配置参数的值
     *
     * 该API用于修改CCE服务下指定节点池配置参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodePoolConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateNodePoolConfigurationRequest, UpdateNodePoolConfigurationResponse>
     */
    public AsyncInvoker<UpdateNodePoolConfigurationRequest, UpdateNodePoolConfigurationResponse> updateNodePoolConfigurationAsyncInvoker(
        UpdateNodePoolConfigurationRequest request) {
        return new AsyncInvoker<UpdateNodePoolConfigurationRequest, UpdateNodePoolConfigurationResponse>(request,
            CceMeta.updateNodePoolConfiguration, hcClient);
    }

    /**
     * 更新分区
     *
     * 更新分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePartitionRequest 请求对象
     * @return CompletableFuture<UpdatePartitionResponse>
     */
    public CompletableFuture<UpdatePartitionResponse> updatePartitionAsync(UpdatePartitionRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.updatePartition);
    }

    /**
     * 更新分区
     *
     * 更新分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePartitionRequest 请求对象
     * @return AsyncInvoker<UpdatePartitionRequest, UpdatePartitionResponse>
     */
    public AsyncInvoker<UpdatePartitionRequest, UpdatePartitionResponse> updatePartitionAsyncInvoker(
        UpdatePartitionRequest request) {
        return new AsyncInvoker<UpdatePartitionRequest, UpdatePartitionResponse>(request, CceMeta.updatePartition,
            hcClient);
    }

    /**
     * 更新指定模板实例
     *
     * 更新指定模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReleaseRequest 请求对象
     * @return CompletableFuture<UpdateReleaseResponse>
     */
    public CompletableFuture<UpdateReleaseResponse> updateReleaseAsync(UpdateReleaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.updateRelease);
    }

    /**
     * 更新指定模板实例
     *
     * 更新指定模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReleaseRequest 请求对象
     * @return AsyncInvoker<UpdateReleaseRequest, UpdateReleaseResponse>
     */
    public AsyncInvoker<UpdateReleaseRequest, UpdateReleaseResponse> updateReleaseAsyncInvoker(
        UpdateReleaseRequest request) {
        return new AsyncInvoker<UpdateReleaseRequest, UpdateReleaseResponse>(request, CceMeta.updateRelease, hcClient);
    }

    /**
     * 集群升级
     *
     * 集群升级。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeClusterRequest 请求对象
     * @return CompletableFuture<UpgradeClusterResponse>
     */
    public CompletableFuture<UpgradeClusterResponse> upgradeClusterAsync(UpgradeClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.upgradeCluster);
    }

    /**
     * 集群升级
     *
     * 集群升级。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeClusterRequest 请求对象
     * @return AsyncInvoker<UpgradeClusterRequest, UpgradeClusterResponse>
     */
    public AsyncInvoker<UpgradeClusterRequest, UpgradeClusterResponse> upgradeClusterAsyncInvoker(
        UpgradeClusterRequest request) {
        return new AsyncInvoker<UpgradeClusterRequest, UpgradeClusterResponse>(request, CceMeta.upgradeCluster,
            hcClient);
    }

    /**
     * 更新指定集群升级引导任务状态
     *
     * 该API用于更新指定集群升级引导任务状态，当前仅适用于取消升级流程
     * 调用该API时升级流程引导任务状态不能为进行中(running) 已完成(success) 已取消(cancel),升级子任务状态不能为running(进行中) init(已初始化) pause(任务被暂停) queue(队列中)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeWorkFlowUpdateRequest 请求对象
     * @return CompletableFuture<UpgradeWorkFlowUpdateResponse>
     */
    public CompletableFuture<UpgradeWorkFlowUpdateResponse> upgradeWorkFlowUpdateAsync(
        UpgradeWorkFlowUpdateRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.upgradeWorkFlowUpdate);
    }

    /**
     * 更新指定集群升级引导任务状态
     *
     * 该API用于更新指定集群升级引导任务状态，当前仅适用于取消升级流程
     * 调用该API时升级流程引导任务状态不能为进行中(running) 已完成(success) 已取消(cancel),升级子任务状态不能为running(进行中) init(已初始化) pause(任务被暂停) queue(队列中)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeWorkFlowUpdateRequest 请求对象
     * @return AsyncInvoker<UpgradeWorkFlowUpdateRequest, UpgradeWorkFlowUpdateResponse>
     */
    public AsyncInvoker<UpgradeWorkFlowUpdateRequest, UpgradeWorkFlowUpdateResponse> upgradeWorkFlowUpdateAsyncInvoker(
        UpgradeWorkFlowUpdateRequest request) {
        return new AsyncInvoker<UpgradeWorkFlowUpdateRequest, UpgradeWorkFlowUpdateResponse>(request,
            CceMeta.upgradeWorkFlowUpdate, hcClient);
    }

    /**
     * 上传模板
     *
     * 上传模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadChartRequest 请求对象
     * @return CompletableFuture<UploadChartResponse>
     */
    public CompletableFuture<UploadChartResponse> uploadChartAsync(UploadChartRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.uploadChart);
    }

    /**
     * 上传模板
     *
     * 上传模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadChartRequest 请求对象
     * @return AsyncInvoker<UploadChartRequest, UploadChartResponse>
     */
    public AsyncInvoker<UploadChartRequest, UploadChartResponse> uploadChartAsyncInvoker(UploadChartRequest request) {
        return new AsyncInvoker<UploadChartRequest, UploadChartResponse>(request, CceMeta.uploadChart, hcClient);
    }

    /**
     * 查询API版本信息列表
     *
     * 该API用于查询CCE服务当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVersionRequest 请求对象
     * @return CompletableFuture<ShowVersionResponse>
     */
    public CompletableFuture<ShowVersionResponse> showVersionAsync(ShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showVersion);
    }

    /**
     * 查询API版本信息列表
     *
     * 该API用于查询CCE服务当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVersionRequest 请求对象
     * @return AsyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public AsyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionAsyncInvoker(ShowVersionRequest request) {
        return new AsyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, CceMeta.showVersion, hcClient);
    }

}
