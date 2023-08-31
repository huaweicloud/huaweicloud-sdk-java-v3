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
import com.huaweicloud.sdk.cce.v3.model.CreateClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateKubernetesClusterCertRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateKubernetesClusterCertResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteCloudPersistentVolumeClaimsRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteCloudPersistentVolumeClaimsResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.HibernateClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.HibernateClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.ListAddonInstancesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListAddonInstancesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListAddonTemplatesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListAddonTemplatesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClustersRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClustersResponse;
import com.huaweicloud.sdk.cce.v3.model.ListNodePoolsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListNodePoolsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListNodesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListNodesResponse;
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
import com.huaweicloud.sdk.cce.v3.model.ShowClusterEndpointsRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterEndpointsResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowJobRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowJobResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowVersionRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowVersionResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterEipRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterEipResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.UpgradeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.UpgradeClusterResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CceClient {

    protected HcClient hcClient;

    public CceClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CceClient> newBuilder() {
        ClientBuilder<CceClient> clientBuilder = new ClientBuilder<>(CceClient::new);
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
     * @return AddNodeResponse
     */
    public AddNodeResponse addNode(AddNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.addNode);
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
     * @return SyncInvoker<AddNodeRequest, AddNodeResponse>
     */
    public SyncInvoker<AddNodeRequest, AddNodeResponse> addNodeInvoker(AddNodeRequest request) {
        return new SyncInvoker<AddNodeRequest, AddNodeResponse>(request, CceMeta.addNode, hcClient);
    }

    /**
     * 集群唤醒
     *
     * 集群唤醒用于唤醒已休眠的集群，唤醒后，将继续收取控制节点资源费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AwakeClusterRequest 请求对象
     * @return AwakeClusterResponse
     */
    public AwakeClusterResponse awakeCluster(AwakeClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.awakeCluster);
    }

    /**
     * 集群唤醒
     *
     * 集群唤醒用于唤醒已休眠的集群，唤醒后，将继续收取控制节点资源费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AwakeClusterRequest 请求对象
     * @return SyncInvoker<AwakeClusterRequest, AwakeClusterResponse>
     */
    public SyncInvoker<AwakeClusterRequest, AwakeClusterResponse> awakeClusterInvoker(AwakeClusterRequest request) {
        return new SyncInvoker<AwakeClusterRequest, AwakeClusterResponse>(request, CceMeta.awakeCluster, hcClient);
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
     * @return BatchCreateClusterTagsResponse
     */
    public BatchCreateClusterTagsResponse batchCreateClusterTags(BatchCreateClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.batchCreateClusterTags);
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
     * @return SyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse>
     */
    public SyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> batchCreateClusterTagsInvoker(
        BatchCreateClusterTagsRequest request) {
        return new SyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse>(request,
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
     * @return BatchDeleteClusterTagsResponse
     */
    public BatchDeleteClusterTagsResponse batchDeleteClusterTags(BatchDeleteClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.batchDeleteClusterTags);
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
     * @return SyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse>
     */
    public SyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> batchDeleteClusterTagsInvoker(
        BatchDeleteClusterTagsRequest request) {
        return new SyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse>(request,
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
     * @return ContinueUpgradeClusterTaskResponse
     */
    public ContinueUpgradeClusterTaskResponse continueUpgradeClusterTask(ContinueUpgradeClusterTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.continueUpgradeClusterTask);
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
     * @return SyncInvoker<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse>
     */
    public SyncInvoker<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse> continueUpgradeClusterTaskInvoker(
        ContinueUpgradeClusterTaskRequest request) {
        return new SyncInvoker<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse>(request,
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
     * @return CreateAddonInstanceResponse
     */
    public CreateAddonInstanceResponse createAddonInstance(CreateAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createAddonInstance);
    }

    /**
     * 创建AddonInstance
     *
     * 根据提供的插件模板，安装插件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAddonInstanceRequest 请求对象
     * @return SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse>
     */
    public SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse> createAddonInstanceInvoker(
        CreateAddonInstanceRequest request) {
        return new SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse>(request,
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
     * @return CreateCloudPersistentVolumeClaimsResponse
     */
    public CreateCloudPersistentVolumeClaimsResponse createCloudPersistentVolumeClaims(
        CreateCloudPersistentVolumeClaimsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createCloudPersistentVolumeClaims);
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
     * @return SyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse>
     */
    public SyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> createCloudPersistentVolumeClaimsInvoker(
        CreateCloudPersistentVolumeClaimsRequest request) {
        return new SyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse>(
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
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createCluster);
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
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CceMeta.createCluster, hcClient);
    }

    /**
     * 获取集群证书
     *
     * 该API用于获取指定集群的证书信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKubernetesClusterCertRequest 请求对象
     * @return CreateKubernetesClusterCertResponse
     */
    public CreateKubernetesClusterCertResponse createKubernetesClusterCert(CreateKubernetesClusterCertRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createKubernetesClusterCert);
    }

    /**
     * 获取集群证书
     *
     * 该API用于获取指定集群的证书信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKubernetesClusterCertRequest 请求对象
     * @return SyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse>
     */
    public SyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> createKubernetesClusterCertInvoker(
        CreateKubernetesClusterCertRequest request) {
        return new SyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse>(request,
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
     * @return CreateNodeResponse
     */
    public CreateNodeResponse createNode(CreateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createNode);
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
     * @return SyncInvoker<CreateNodeRequest, CreateNodeResponse>
     */
    public SyncInvoker<CreateNodeRequest, CreateNodeResponse> createNodeInvoker(CreateNodeRequest request) {
        return new SyncInvoker<CreateNodeRequest, CreateNodeResponse>(request, CceMeta.createNode, hcClient);
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
     * @return CreateNodePoolResponse
     */
    public CreateNodePoolResponse createNodePool(CreateNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createNodePool);
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
     * @return SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse>
     */
    public SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse> createNodePoolInvoker(
        CreateNodePoolRequest request) {
        return new SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse>(request, CceMeta.createNodePool,
            hcClient);
    }

    /**
     * 删除AddonInstance
     *
     * 删除插件实例的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddonInstanceRequest 请求对象
     * @return DeleteAddonInstanceResponse
     */
    public DeleteAddonInstanceResponse deleteAddonInstance(DeleteAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteAddonInstance);
    }

    /**
     * 删除AddonInstance
     *
     * 删除插件实例的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddonInstanceRequest 请求对象
     * @return SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse>
     */
    public SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> deleteAddonInstanceInvoker(
        DeleteAddonInstanceRequest request) {
        return new SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse>(request,
            CceMeta.deleteAddonInstance, hcClient);
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
     * @return DeleteCloudPersistentVolumeClaimsResponse
     */
    public DeleteCloudPersistentVolumeClaimsResponse deleteCloudPersistentVolumeClaims(
        DeleteCloudPersistentVolumeClaimsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteCloudPersistentVolumeClaims);
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
     * @return SyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse>
     */
    public SyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> deleteCloudPersistentVolumeClaimsInvoker(
        DeleteCloudPersistentVolumeClaimsRequest request) {
        return new SyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse>(
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
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteCluster);
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
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, CceMeta.deleteCluster, hcClient);
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
     * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNode(DeleteNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteNode);
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
     * @return SyncInvoker<DeleteNodeRequest, DeleteNodeResponse>
     */
    public SyncInvoker<DeleteNodeRequest, DeleteNodeResponse> deleteNodeInvoker(DeleteNodeRequest request) {
        return new SyncInvoker<DeleteNodeRequest, DeleteNodeResponse>(request, CceMeta.deleteNode, hcClient);
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
     * @return DeleteNodePoolResponse
     */
    public DeleteNodePoolResponse deleteNodePool(DeleteNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteNodePool);
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
     * @return SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse>
     */
    public SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse> deleteNodePoolInvoker(
        DeleteNodePoolRequest request) {
        return new SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse>(request, CceMeta.deleteNodePool,
            hcClient);
    }

    /**
     * 集群休眠
     *
     * 集群休眠用于将运行中的集群置于休眠状态，休眠后，将不再收取控制节点资源费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param HibernateClusterRequest 请求对象
     * @return HibernateClusterResponse
     */
    public HibernateClusterResponse hibernateCluster(HibernateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.hibernateCluster);
    }

    /**
     * 集群休眠
     *
     * 集群休眠用于将运行中的集群置于休眠状态，休眠后，将不再收取控制节点资源费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param HibernateClusterRequest 请求对象
     * @return SyncInvoker<HibernateClusterRequest, HibernateClusterResponse>
     */
    public SyncInvoker<HibernateClusterRequest, HibernateClusterResponse> hibernateClusterInvoker(
        HibernateClusterRequest request) {
        return new SyncInvoker<HibernateClusterRequest, HibernateClusterResponse>(request, CceMeta.hibernateCluster,
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
     * @return ListAddonInstancesResponse
     */
    public ListAddonInstancesResponse listAddonInstances(ListAddonInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listAddonInstances);
    }

    /**
     * 获取AddonInstance列表
     *
     * 获取集群所有已安装插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddonInstancesRequest 请求对象
     * @return SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse>
     */
    public SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse> listAddonInstancesInvoker(
        ListAddonInstancesRequest request) {
        return new SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse>(request,
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
     * @return ListAddonTemplatesResponse
     */
    public ListAddonTemplatesResponse listAddonTemplates(ListAddonTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listAddonTemplates);
    }

    /**
     * 查询AddonTemplates列表
     *
     * 插件模板查询接口，查询插件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddonTemplatesRequest 请求对象
     * @return SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse>
     */
    public SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse> listAddonTemplatesInvoker(
        ListAddonTemplatesRequest request) {
        return new SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse>(request,
            CceMeta.listAddonTemplates, hcClient);
    }

    /**
     * 获取指定项目下的集群
     *
     * 该API用于获取指定项目下所有集群的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listClusters);
    }

    /**
     * 获取指定项目下的集群
     *
     * 该API用于获取指定项目下所有集群的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return SyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<ListClustersRequest, ListClustersResponse>(request, CceMeta.listClusters, hcClient);
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
     * @return ListNodePoolsResponse
     */
    public ListNodePoolsResponse listNodePools(ListNodePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listNodePools);
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
     * @return SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse>
     */
    public SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse> listNodePoolsInvoker(ListNodePoolsRequest request) {
        return new SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse>(request, CceMeta.listNodePools, hcClient);
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
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listNodes);
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
     * @return SyncInvoker<ListNodesRequest, ListNodesResponse>
     */
    public SyncInvoker<ListNodesRequest, ListNodesResponse> listNodesInvoker(ListNodesRequest request) {
        return new SyncInvoker<ListNodesRequest, ListNodesResponse>(request, CceMeta.listNodes, hcClient);
    }

    /**
     * 节点迁移
     *
     * 该API用于在指定集群下迁移节点到另一集群（仅支持在同一VPC、同一项目下的不同集群之间进行迁移，且迁移前后的集群类型需相同）。
     * [CCE Turbo集群下弹性云服务-物理机类型节点不支持迁移。](tag:hws,hws_hk,dt)
     * 
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateNodeRequest 请求对象
     * @return MigrateNodeResponse
     */
    public MigrateNodeResponse migrateNode(MigrateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.migrateNode);
    }

    /**
     * 节点迁移
     *
     * 该API用于在指定集群下迁移节点到另一集群（仅支持在同一VPC、同一项目下的不同集群之间进行迁移，且迁移前后的集群类型需相同）。
     * [CCE Turbo集群下弹性云服务-物理机类型节点不支持迁移。](tag:hws,hws_hk,dt)
     * 
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateNodeRequest 请求对象
     * @return SyncInvoker<MigrateNodeRequest, MigrateNodeResponse>
     */
    public SyncInvoker<MigrateNodeRequest, MigrateNodeResponse> migrateNodeInvoker(MigrateNodeRequest request) {
        return new SyncInvoker<MigrateNodeRequest, MigrateNodeResponse>(request, CceMeta.migrateNode, hcClient);
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
     * @return PauseUpgradeClusterTaskResponse
     */
    public PauseUpgradeClusterTaskResponse pauseUpgradeClusterTask(PauseUpgradeClusterTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.pauseUpgradeClusterTask);
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
     * @return SyncInvoker<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse>
     */
    public SyncInvoker<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse> pauseUpgradeClusterTaskInvoker(
        PauseUpgradeClusterTaskRequest request) {
        return new SyncInvoker<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse>(request,
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
     * @return RemoveNodeResponse
     */
    public RemoveNodeResponse removeNode(RemoveNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.removeNode);
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
     * @return SyncInvoker<RemoveNodeRequest, RemoveNodeResponse>
     */
    public SyncInvoker<RemoveNodeRequest, RemoveNodeResponse> removeNodeInvoker(RemoveNodeRequest request) {
        return new SyncInvoker<RemoveNodeRequest, RemoveNodeResponse>(request, CceMeta.removeNode, hcClient);
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
     * @return ResetNodeResponse
     */
    public ResetNodeResponse resetNode(ResetNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.resetNode);
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
     * @return SyncInvoker<ResetNodeRequest, ResetNodeResponse>
     */
    public SyncInvoker<ResetNodeRequest, ResetNodeResponse> resetNodeInvoker(ResetNodeRequest request) {
        return new SyncInvoker<ResetNodeRequest, ResetNodeResponse>(request, CceMeta.resetNode, hcClient);
    }

    /**
     * 变更集群规格
     *
     * 该API用于变更一个指定集群的规格。
     * 
     * &gt;   - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * &gt;   - 使用限制请参考：[[变更集群规格](https://support.huaweicloud.com/usermanual-cce/cce_10_0403.html)。](tag:hws)[[变更集群规格](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0403.html)](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeClusterRequest 请求对象
     * @return ResizeClusterResponse
     */
    public ResizeClusterResponse resizeCluster(ResizeClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.resizeCluster);
    }

    /**
     * 变更集群规格
     *
     * 该API用于变更一个指定集群的规格。
     * 
     * &gt;   - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * &gt;   - 使用限制请参考：[[变更集群规格](https://support.huaweicloud.com/usermanual-cce/cce_10_0403.html)。](tag:hws)[[变更集群规格](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0403.html)](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeClusterRequest 请求对象
     * @return SyncInvoker<ResizeClusterRequest, ResizeClusterResponse>
     */
    public SyncInvoker<ResizeClusterRequest, ResizeClusterResponse> resizeClusterInvoker(ResizeClusterRequest request) {
        return new SyncInvoker<ResizeClusterRequest, ResizeClusterResponse>(request, CceMeta.resizeCluster, hcClient);
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
     * @return RetryUpgradeClusterTaskResponse
     */
    public RetryUpgradeClusterTaskResponse retryUpgradeClusterTask(RetryUpgradeClusterTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.retryUpgradeClusterTask);
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
     * @return SyncInvoker<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse>
     */
    public SyncInvoker<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse> retryUpgradeClusterTaskInvoker(
        RetryUpgradeClusterTaskRequest request) {
        return new SyncInvoker<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse>(request,
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
     * @return RollbackAddonInstanceResponse
     */
    public RollbackAddonInstanceResponse rollbackAddonInstance(RollbackAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.rollbackAddonInstance);
    }

    /**
     * 回滚AddonInstance
     *
     * 将插件实例回滚到升级前的版本。只有在当前插件实例版本支持回滚到升级前的版本（status.isRollbackable为true），且插件实例状态为running（运行中）、available（可用）、abnormal（不可用）、upgradeFailed（升级失败）、rollbackFailed（回滚失败）时支持回滚。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RollbackAddonInstanceRequest 请求对象
     * @return SyncInvoker<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse>
     */
    public SyncInvoker<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse> rollbackAddonInstanceInvoker(
        RollbackAddonInstanceRequest request) {
        return new SyncInvoker<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse>(request,
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
     * @return ShowAddonInstanceResponse
     */
    public ShowAddonInstanceResponse showAddonInstance(ShowAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showAddonInstance);
    }

    /**
     * 获取AddonInstance详情
     *
     * 获取插件实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAddonInstanceRequest 请求对象
     * @return SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse>
     */
    public SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse> showAddonInstanceInvoker(
        ShowAddonInstanceRequest request) {
        return new SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse>(request, CceMeta.showAddonInstance,
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
     * @return ShowClusterResponse
     */
    public ShowClusterResponse showCluster(ShowClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showCluster);
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
     * @return SyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public SyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterInvoker(ShowClusterRequest request) {
        return new SyncInvoker<ShowClusterRequest, ShowClusterResponse>(request, CceMeta.showCluster, hcClient);
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
     * @return ShowClusterEndpointsResponse
     */
    public ShowClusterEndpointsResponse showClusterEndpoints(ShowClusterEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showClusterEndpoints);
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
     * @return SyncInvoker<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse>
     */
    public SyncInvoker<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse> showClusterEndpointsInvoker(
        ShowClusterEndpointsRequest request) {
        return new SyncInvoker<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse>(request,
            CceMeta.showClusterEndpoints, hcClient);
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
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showJob);
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
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, CceMeta.showJob, hcClient);
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
     * @return ShowNodeResponse
     */
    public ShowNodeResponse showNode(ShowNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showNode);
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
     * @return SyncInvoker<ShowNodeRequest, ShowNodeResponse>
     */
    public SyncInvoker<ShowNodeRequest, ShowNodeResponse> showNodeInvoker(ShowNodeRequest request) {
        return new SyncInvoker<ShowNodeRequest, ShowNodeResponse>(request, CceMeta.showNode, hcClient);
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
     * @return ShowNodePoolResponse
     */
    public ShowNodePoolResponse showNodePool(ShowNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showNodePool);
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
     * @return SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse>
     */
    public SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse> showNodePoolInvoker(ShowNodePoolRequest request) {
        return new SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse>(request, CceMeta.showNodePool, hcClient);
    }

    /**
     * 查询CCE服务下的资源配额
     *
     * 该API用于查询CCE服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showQuotas);
    }

    /**
     * 查询CCE服务下的资源配额
     *
     * 该API用于查询CCE服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, CceMeta.showQuotas, hcClient);
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
     * @return ShowUpgradeClusterTaskResponse
     */
    public ShowUpgradeClusterTaskResponse showUpgradeClusterTask(ShowUpgradeClusterTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showUpgradeClusterTask);
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
     * @return SyncInvoker<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse>
     */
    public SyncInvoker<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse> showUpgradeClusterTaskInvoker(
        ShowUpgradeClusterTaskRequest request) {
        return new SyncInvoker<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse>(request,
            CceMeta.showUpgradeClusterTask, hcClient);
    }

    /**
     * 更新AddonInstance
     *
     * 更新插件实例的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAddonInstanceRequest 请求对象
     * @return UpdateAddonInstanceResponse
     */
    public UpdateAddonInstanceResponse updateAddonInstance(UpdateAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateAddonInstance);
    }

    /**
     * 更新AddonInstance
     *
     * 更新插件实例的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAddonInstanceRequest 请求对象
     * @return SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse>
     */
    public SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> updateAddonInstanceInvoker(
        UpdateAddonInstanceRequest request) {
        return new SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse>(request,
            CceMeta.updateAddonInstance, hcClient);
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
     * @return UpdateClusterResponse
     */
    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateCluster);
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
     * @return SyncInvoker<UpdateClusterRequest, UpdateClusterResponse>
     */
    public SyncInvoker<UpdateClusterRequest, UpdateClusterResponse> updateClusterInvoker(UpdateClusterRequest request) {
        return new SyncInvoker<UpdateClusterRequest, UpdateClusterResponse>(request, CceMeta.updateCluster, hcClient);
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
     * @return UpdateClusterEipResponse
     */
    public UpdateClusterEipResponse updateClusterEip(UpdateClusterEipRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateClusterEip);
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
     * @return SyncInvoker<UpdateClusterEipRequest, UpdateClusterEipResponse>
     */
    public SyncInvoker<UpdateClusterEipRequest, UpdateClusterEipResponse> updateClusterEipInvoker(
        UpdateClusterEipRequest request) {
        return new SyncInvoker<UpdateClusterEipRequest, UpdateClusterEipResponse>(request, CceMeta.updateClusterEip,
            hcClient);
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
     * @return UpdateNodeResponse
     */
    public UpdateNodeResponse updateNode(UpdateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateNode);
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
     * @return SyncInvoker<UpdateNodeRequest, UpdateNodeResponse>
     */
    public SyncInvoker<UpdateNodeRequest, UpdateNodeResponse> updateNodeInvoker(UpdateNodeRequest request) {
        return new SyncInvoker<UpdateNodeRequest, UpdateNodeResponse>(request, CceMeta.updateNode, hcClient);
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
     * @return UpdateNodePoolResponse
     */
    public UpdateNodePoolResponse updateNodePool(UpdateNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateNodePool);
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
     * @return SyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse>
     */
    public SyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse> updateNodePoolInvoker(
        UpdateNodePoolRequest request) {
        return new SyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse>(request, CceMeta.updateNodePool,
            hcClient);
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
     * @return UpgradeClusterResponse
     */
    public UpgradeClusterResponse upgradeCluster(UpgradeClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.upgradeCluster);
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
     * @return SyncInvoker<UpgradeClusterRequest, UpgradeClusterResponse>
     */
    public SyncInvoker<UpgradeClusterRequest, UpgradeClusterResponse> upgradeClusterInvoker(
        UpgradeClusterRequest request) {
        return new SyncInvoker<UpgradeClusterRequest, UpgradeClusterResponse>(request, CceMeta.upgradeCluster,
            hcClient);
    }

    /**
     * 查询API版本信息列表。
     *
     * 该API用于查询CCE服务当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVersionRequest 请求对象
     * @return ShowVersionResponse
     */
    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showVersion);
    }

    /**
     * 查询API版本信息列表。
     *
     * 该API用于查询CCE服务当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVersionRequest 请求对象
     * @return SyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public SyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionInvoker(ShowVersionRequest request) {
        return new SyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, CceMeta.showVersion, hcClient);
    }

}
